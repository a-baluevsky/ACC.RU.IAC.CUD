package iac.grn.infosweb.context.mc;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import iac.grn.infosweb.context.mc.usr.UsrStateHolder;

import org.apache.xerces.impl.xpath.regex.Match;
import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;


public class QuerySvc implements java.io.Serializable {
	//17.02.15: AB: MANTIS-4954
	protected long[] m_QueryStats;	
	public String getQueryStatText() {
		String sResult = ""; 
		if(m_QueryStats!=null) {
			StringBuffer sb = new StringBuffer("Запис");
			if(m_QueryStats[1]==0) {
					sb.append("и не найдены");
			} else if(m_QueryStats[0]==m_QueryStats[1]) {
				sb.append("ь ").append(m_QueryStats[0]);
				if(m_QueryStats[1]==m_QueryStats[2])
					sb.append(" (последняя)");
			} else if(m_QueryStats[1]==m_QueryStats[2]) {
				sb.append("и ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1])
				  .append(" (последние)");				
			} 
			else { // "40-50 / 126";
				sb.append("и ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1]);			
				if(m_QueryStats[2]>0) {
					sb.append(" из ")
					  .append(m_QueryStats[2]);
				}
			}
			sResult = sb.toString(); 
		}		
		return sResult;
	}	
	public String QueryStatsToString() {
		StringBuffer sb = new StringBuffer("[");
		sb.append(m_QueryStats[0]).append(", ")
		.append(m_QueryStats[1]).append(", ")
		.append(m_QueryStats[2]).append("]");
		return sb.toString();
	}
	
	/*// TODO: implement SQL statement objective wrapper!
	createNativeQuery(entityManager,
		Select("t1", "t2", "t1.t1_cert" })
		.from(
				Select (..)
			)
		.where(...) 		
	).setFirstResult(firstRow)
    .setMaxResults(numberOfRows)
    .getResultList();
    */
	
	public static boolean isIntNumeric(Class cl) {
		return cl.equals(Byte.class) || cl.equals(Integer.class) 
				|| cl.equals(Long.class) || cl.equals(BigInteger.class);
	}
	public static boolean isFloatNumeric(Class cl) {
		return cl.equals(Float.class) || cl.equals(Double.class);
	}
	
	ArrayList<String> m_alWhereConditions = new ArrayList<String>();
	public void resetWhereConditions() {
		m_alWhereConditions = new ArrayList<String>();
	}
	public void putWhereCondition(String fieldName, String operator, Object value)
			throws InvalidAlgorithmParameterException {	
		putWhereCondition(String.class, fieldName, operator, value);
	}
	public void putWhereCondition(Class fieldType, String fieldName, String operator, Object value) 
					throws InvalidAlgorithmParameterException {
		String sWhereCondition = makeWhereCondition(fieldType, fieldName, operator, value);
		if(sWhereCondition!=null)
			m_alWhereConditions.add(sWhereCondition);
	}

	private static String wrapDateFieldNameToChar(String fieldName) {
		return "to_char("+fieldName+",'DD.MM.YY HH24:MI:SS')";		
	}
	private static String wrapDateFieldNameToNumChar(String fieldName) {
		return "to_char("+fieldName+",'YYYYMMDD')";	
	}
	
	private static Pattern ptDateDDMMYY = Pattern.compile("^(?<day>\\d{2}).(?<month>\\d{2}).(?<year>\\d{2}(\\d{2})?)");
	protected static Date parseDateValue(String sValue) {
		Date dt = null;		
		Matcher re = ptDateDDMMYY.matcher(sValue);
		if(re.matches()) {
			int year=Integer.parseInt(re.group("year"));			
			if(year<60) year+=100;
			if(year>100) year-=1900;
			int month=Integer.parseInt(re.group("month"))-1;
			int day=Integer.parseInt(re.group("day"));			
			dt = new Date(year,month,day);
		}
		//else throw new InvalidAlgorithmParameterException("Can't convert "+sValue+" => Date");
		return dt;		
	}
	
	private static String getDateString(Date dt) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(dt);
	}
	
	public static String makeWhereCondition(Class fieldType, String fieldName, 
			String operator, Object value) throws InvalidAlgorithmParameterException {
		String sWhereCondition = null;
		if(fieldName!=null && operator!=null && value!=null)
		if(fieldName.length()>0 && operator.length()>0)	{
			BitSet ct1 = new BitSet();  // class type & op conditions case		
			if(fieldType.equals(String.class)) ct1.set(1);
			else
			if(fieldType.equals(Date.class)) ct1.set(2);
			else
			if(isIntNumeric(fieldType)||isFloatNumeric(fieldType)) ct1.set(3);
			BitSet ct2 = new BitSet();
			Class curValClass = value.getClass();			
			if(curValClass.equals(String.class)) ct2.set(1);
			else
			if(curValClass.equals(Date.class)) ct2.set(2);
			else
			if(isIntNumeric(curValClass)||isFloatNumeric(curValClass)) ct2.set(3);
			BitSet co = new BitSet();
			if	   ("like".equals(operator)) co.set(1);
			else if("=".equals(operator) || "<>".equals(operator)) co.set(2);
			else if("in".equals(operator)) co.set(3);
			
			String sField = fieldName;
			// TODO: StringBuffer sbValue = new StringBuffer(value.toString());
			String sValue = value.toString();
			if(ct1.get(2)) {
				sField = wrapDateFieldNameToNumChar(fieldName);
				if(ct2.get(3)) {
					sValue = "'" + ((Integer)value).toString() + (co.get(1)?"%":"")+ "'";
				} else {					
					Date dt = (ct2.get(2))?(Date)value:parseDateValue(sValue);
					sValue = "'"+getDateString(dt)+(co.get(1)?"%":"")+"'";
				}				
			}
			else
			if(co.get(1) || ct2.get(1)) {				
				if(ct1.get(2)) {
					sField = wrapDateFieldNameToChar(fieldName);
					sValue = "'"+sValue.toLowerCase()+(co.get(1)?"%":"")+"'";
				}
				else  {
					if(!ct1.get(1)) sField = "to_char("+fieldName+")";
					sValue = "'"+sValue.toLowerCase()+(co.get(1)?"%":"")+"'";
				}
				sField = "lower("+sField+")";				
			} else if (ct2.get(2)) {
				Date dt = (ct2.get(2))?(Date)value:parseDateValue(sValue);
				sValue = "'"+getDateString(dt)+(co.get(1)?"%":"")+"'";				
			}
			StringBuffer sbCondition = new StringBuffer(sField);
		    sbCondition.append(" ").append(operator).append(" ");
		    if(co.get(3)) 
		    	sbCondition.append("(").append(sValue).append(")");
		    else
		    	sbCondition.append(sValue);
		    sWhereCondition=sbCondition.toString();
		}
		return sWhereCondition;
	}
	
	public String getWhereAndClause() {		
		return getWhereAndClause(m_alWhereConditions);
	}
	public static String joinStringArrayList(ArrayList<String> condList,String prefix, String listSep, String suffix) {
		String sJoin = "";
		if(condList!=null && !condList.isEmpty()) {
			StringBuffer sbJoin = new StringBuffer(prefix);
			sbJoin.append(condList.get(0));
			for(java.util.ListIterator<String> li=condList.listIterator(1); li.hasNext(); )
				sbJoin.append(listSep).append(li.next());
			sJoin = sbJoin.append(suffix).toString();
		}
		return sJoin;		
				
	}
	public static String getWhereAndClause(ArrayList<String> condList) {
		return joinStringArrayList(condList, "where ", " and ", "");
	}
	
	ArrayList<String> m_alOrderBy = new ArrayList<String>();
	public void resetOrderBy() {
		m_alOrderBy = new ArrayList<String>();
	}
	protected void putOrderBy(String FieldName, String Order) {
		String sNewEntry=FieldName+" "+Order;
		if(!m_alOrderBy.contains(sNewEntry))
			m_alOrderBy.add(sNewEntry);
	}
	protected void putOrderByFromStringSet(Set<Entry<String, String>> StringSet) {
        for (Map.Entry<String, String> me : StringSet)  
        	putOrderBy(me.getKey(),me.getValue());
	}
	protected String getOrderByClause() {
		return joinStringArrayList(m_alOrderBy, "order by ", ", ", "");
	}
}
