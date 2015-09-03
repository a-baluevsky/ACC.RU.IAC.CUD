package ru.spb.iac.cud.core.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.text.SimpleDateFormat;

import javaw.util.Actor;
import javaw.util.ArrayList;
import javaw.util.SerializableMap;
import javaw.util.Tuple;
import javaw.util.Tuple.T2;
import javaw.util.Tuple.T4;
import javaw.util.TypeConverter;

import java.util.BitSet;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaw.lang.Strings;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ru.spb.iac.cud.core.AccessManagerLocal;
import ru.spb.iac.cud.core.data.DataField.IDataFieldDescriptor;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class JPABuilder {
	
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
	
	public static String getQueryString(Query query) {
		org.hibernate.Query hbQuery = ((org.hibernate.ejb.QueryImpl)query).getHibernateQuery();
		return hbQuery.getQueryString();
	}

	
	ArrayList<String> m_alWhereConditions = new ArrayList<String>();
	public void resetWhereConditions() {
		m_alWhereConditions = new ArrayList<String>();
	}
	
	public<T> void putWhereCondition(DataField<T> field, String operator, T value) 
					throws InvalidAlgorithmParameterException {
		String sWhereCondition = makeWhereCondition(field, operator, value);
		if(sWhereCondition!=null)
			m_alWhereConditions.add(sWhereCondition);
	}	
	public void putWhereCondition(String fieldName, String operator, String value)
			throws InvalidAlgorithmParameterException {
		putWhereCondition(new DataField<String>(DataFieldType.VARCHAR2LC, fieldName), operator, value);
	}


	// TODO: rewrite using DataFieldType functionality
	public static<T> String makeWhereCondition(DataField<T> field, String operator, T value) throws InvalidAlgorithmParameterException {
		String fieldName = field.getColumnName();
		Class<?> fieldValueType = field.getValueType();
		String sWhereCondition = null;
		if(fieldName!=null && operator!=null && value!=null)
		if(fieldName.length()>0 && operator.length()>0)	{			
			BitSet ct1 = new BitSet();  // class type & op conditions case	
			if(fieldValueType.equals(String.class)) ct1.set(1);
			else
			if(fieldValueType.equals(Date.class)) ct1.set(2);
			else
			if(DataFieldType.isNumeric(fieldValueType)) ct1.set(3);
			BitSet ct2 = new BitSet();
			Class<?> curValClass = value.getClass();			
			if(curValClass.equals(String.class)) ct2.set(1);
			else
			if(curValClass.equals(Date.class)) ct2.set(2);
			else
			if(DataFieldType.isNumeric(curValClass)) ct2.set(3);
			BitSet co = new BitSet();
			if	   ("like".equals(operator)) co.set(1);
			else if("=".equals(operator) || "<>".equals(operator)) co.set(2);
			else if("in".equals(operator)) co.set(3);
			else if("<".equals(operator) || ">".equals(operator)) co.set(4);
			
			String sField = fieldName;
			// TODO: StringBuffer sbValue = new StringBuffer(value.toString());
			String sValue = value.toString();
			if(ct1.get(3) && (ct2.get(1)||ct2.get(3)) && (co.get(2) || co.get(4)))
			/* do nothing! */;
			else {
				if(ct1.get(2)) {
					sField = DataFieldType.wrapDateFieldNameToNumChar(fieldName);
					if(ct2.get(3)) {
						sValue = "'" + ((Integer)value).toString() + (co.get(1)?"%":"")+ "'";
					} else {					
						Date dt = (ct2.get(2))?(Date)value:DataFieldType.parseDateValue_DDMMYY(sValue);
						sValue = "'"+DataFieldType.getDateString_yyyyMMdd(dt)+(co.get(1)?"%":"")+"'";
					}
				}
				else
				if(co.get(1) || ct2.get(1)) {				
					if(ct1.get(2)) {
						sField = DataFieldType.wrapDateFieldNameToChar(fieldName);
						sValue = "'"+sValue.toLowerCase()+(co.get(1)?"%":"")+"'";
					}
					else  {
						if(!ct1.get(1)) sField = "to_char("+fieldName+")";
						sValue = "'"+sValue.toLowerCase()+(co.get(1)?"%":"")+"'";
					}
					sField = "lower("+sField+")";				
				} else if (ct2.get(2)) {
					Date dt = (ct2.get(2))?(Date)value:DataFieldType.parseDateValue_DDMMYY(sValue);
					sValue = "'"+DataFieldType.getDateString_yyyyMMdd(dt)+(co.get(1)?"%":"")+"'";				
				}
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
	
	protected ArrayList<String> m_alOrderBy = new ArrayList<String>();
	public void resetOrderBy() {
		m_alOrderBy = new ArrayList<String>();
	}
	protected void putOrderBy(String FieldName, String Order) {
		String sNewEntry=FieldName;
		if(Order!=null) sNewEntry+=" "+Order;
		if(!m_alOrderBy.contains(sNewEntry))
			m_alOrderBy.add(sNewEntry);
	}
	protected void putOrderByFromStringSet(Set<Entry<String, String>> StringSet) {
        for (Map.Entry<String, String> me : StringSet)  
        	putOrderBy(me.getKey(),me.getValue());
	}
	public String getOrderByClause() {
		return joinStringArrayList(m_alOrderBy, "order by ", ", ", "");
	}
	private final static String csUpdateTableAlias = "tblUpdate";
	ArrayList<String> m_alUpdateSet /* = new ArrayList<String>()*/;
	public void resetUpdateSet() {
		m_alUpdateSet = new ArrayList<String>();
	}
	private<T> DataFieldType checkFieldSize(DataField<T> field, T NewFieldValue)
			throws InvalidAlgorithmParameterException {
		DataFieldType ft = field.getDataType();
		Long valLen = ft.getDataSize(NewFieldValue);
		Long fldSz = field.getDataLength();
		if(fldSz !=null && fldSz < valLen) {
			StringBuilder sbMsg = new StringBuilder("Data length ");
			sbMsg.append(valLen).append(" for field ")
				.append(field.getTableName()).append('.').append(field.getColumnName())
				.append(" exceeds field size ").append(fldSz);
			throw new InvalidAlgorithmParameterException(sbMsg.toString());
		}
		return ft;
	}	
	public<T> void putUpdateSet(DataField<T> field, T NewFieldValue) throws InvalidAlgorithmParameterException {
		DataFieldType ft = checkFieldSize(field, NewFieldValue);
		StringBuilder sb = new StringBuilder(csUpdateTableAlias);
		sb.append(".").append(field.getColumnName()).append(" = ");
		sb.append(ft.toSQLValueExpression(NewFieldValue));
		m_alUpdateSet.add(sb.toString());
	}
	public void putUpdateSet(String fieldName, String value)
			throws InvalidAlgorithmParameterException {
		putUpdateSet(new DataField<String>(DataFieldType.VARCHAR2LC, fieldName), value);
	}
	
	// affected by getWhereAndClause!
	public String getUpdateClause(String targetTableName) throws InvalidAlgorithmParameterException {
		if (ArrayList.isNullOrEmpty(m_alUpdateSet)) throw new InvalidAlgorithmParameterException("List of updated fields is missing!");
		if (ArrayList.isNullOrEmpty(m_alWhereConditions)) throw new InvalidAlgorithmParameterException("List of Where-clause conditions is missing!");
		StringBuilder sbUpdateClause = new StringBuilder("update ");
		sbUpdateClause.append(targetTableName).append(" ").append(csUpdateTableAlias)
		  .append(joinStringArrayList(m_alUpdateSet, " set ", ", ", " "))
		  .append(getWhereAndClause());
		return sbUpdateClause.toString();
	}
	ArrayList<String> m_alSelectField /* = new ArrayList<String>()*/;
	public void resetSelectField() {
		m_alSelectField = new ArrayList<String>();
	}	
	public<T> void putSelectField(DataField<T> field) {
		String an = field.getColumnName();
		if(!Strings.isNullOrEmptyTrim(an))
			m_alSelectField.add(an);		
	}
	// affected by getWhereAndClause!
	public String getSelectClause(String targetTableName) throws InvalidAlgorithmParameterException {
		if (ArrayList.isNullOrEmpty(m_alSelectField)) throw new InvalidAlgorithmParameterException("List of target fields is missing!");
		StringBuilder sbSelectClause = new StringBuilder("select ");
		sbSelectClause.append(joinStringArrayList(m_alSelectField, "", ", ", " "));
		sbSelectClause.append("from " ).append(targetTableName);
		if(!ArrayList.isNullOrEmpty(m_alWhereConditions)) {
			sbSelectClause.append(" ").append(getWhereAndClause());
		}
		if(!ArrayList.isNullOrEmpty(m_alOrderBy)) {
			sbSelectClause.append(" ").append(getOrderByClause());
		}
		return sbSelectClause.toString();
	}

	HashMap<String, String> hmInsert;
	public void resetInsertSet() {
		hmInsert = new HashMap<String, String>();		
	}
	public<T> void putInsertField(DataField<T> field, T value) throws InvalidAlgorithmParameterException {
		DataFieldType ft = checkFieldSize(field, value);
		hmInsert.put(field.getColumnName(), ft.toSQLValueExpression(value));
	}

	public String getInsertClause(String tableName) throws InvalidAlgorithmParameterException {
		if(hmInsert==null || hmInsert.isEmpty()) throw new InvalidAlgorithmParameterException("List of inserted fields is missing!");
		StringBuilder sbInsertNames = new StringBuilder(), sbInsertValues = new StringBuilder();
		for (Entry<String, String> e : hmInsert.entrySet()) {
			sbInsertNames.append(", ").append(e.getKey());
			sbInsertValues.append(", ").append(e.getValue());
		}
		StringBuilder sbInsertClause = new StringBuilder("insert into ");
		sbInsertClause.append(tableName)
			.append(" (").append(sbInsertNames.substring(2)).append(") values (")
			.append(sbInsertValues.substring(2)).append(") ");
		return sbInsertClause.toString();
	}
	
	/*
	public String tableName; 	//TABLE_NAME
	public String columnName; 	//COLUMN_NAME
	public DataFieldType dataType; 	//DATA_TYPE
	public Long dataLength; 	//DATA_LENGTH
	public Boolean nullable; 	//NULLABLE
	public Integer columnId;	//COLUMN_ID
	*/
	
	// SELECT  table_name, column_name, data_type, data_length FROM all_tab_columns where table_name = 'ISP_EXT_BSS_T'
	// Map: columnName => (dataType, dataLength, nullable, columnId)
	public static Map<String, Tuple.T4<String, Long, Boolean, Integer>> getTableColumnsTypeInfo(EntityManager em, String tableName) {
		StringBuilder sbQuery = new StringBuilder("SELECT column_name, data_type, data_length, nullable, column_id FROM all_tab_columns where table_name = '");
		sbQuery.append(tableName).append("'");
		Map<String, Tuple.T4<String, Long, Boolean, Integer>> hmColInfo = new HashMap<String, Tuple.T4<String, Long, Boolean, Integer>>();		
		List<Object[]> dataRows = (List<Object[]>)em.createNativeQuery(sbQuery.toString()).getResultList();		
		for (Object[] dataInfo : dataRows) {
			hmColInfo.put(dataInfo[0].toString(), new Tuple.T4<String, Long, Boolean, Integer>(
					dataInfo[1].toString(), 
					((BigDecimal)dataInfo[2]).longValue(),
					Boolean.valueOf(dataInfo[3].toString()),
					Integer.valueOf(dataInfo[4].toString())
			));
		}		
		return hmColInfo;
	}

	// SELECT data_type, data_length FROM all_tab_columns where table_name = 'ISP_EXT_BSS_T' and column_name='ADDRESS'
	public static Tuple.T2<String, Long> getFieldType(EntityManager em, String tableName, String columnName) {
		StringBuilder sbQuery = new StringBuilder("SELECT data_type, data_length FROM all_tab_columns  where table_name = '");
		sbQuery.append(tableName).append("' and column_name='").append(columnName).append("'");
		Object[] dataInfo = (Object[])em.createNativeQuery(sbQuery.toString()).getResultList().get(0);		
		return new Tuple.T2<String, Long>(dataInfo[0].toString(), ((BigDecimal)dataInfo[1]).longValue());
		
	}
	

	public static class OracleDatabaseFieldDescriptor extends IDataFieldDescriptor
		// 					 Map1: table_name => ( Map2: columnName => (dataType, dataLength, nullable, columnId)) 
		<Tuple.T2<EntityManager, Map<String, Map<String, Tuple.T4<String, Long, Boolean, Integer>>>>> {
		public OracleDatabaseFieldDescriptor(EntityManager em) throws GeneralFailure {
			if(em==null) throw new GeneralFailure("EntityManager em == null");
			this.data = new T2<EntityManager, Map<String,Map<String,T4<String,Long,Boolean,Integer>>>>(em,
					new HashMap<String, Map<String, Tuple.T4<String, Long, Boolean, Integer>>>());
		}
		@Override
		public Map<String, T4<String, Long, Boolean, Integer>> getTableColumnsInfo(String tableName) {			
			return JPABuilder.getTableColumnsTypeInfo(data.item1, tableName);
		}
		@Override
		public T2<String, Long> getTypeInfo(String tableName, String columnName) {
			Map<String, Tuple.T4<String, Long, Boolean, Integer>> tableColTypeInfo = data.item2.get(tableName);
			if (tableColTypeInfo!=null) {
				T4<String, Long, Boolean, Integer> info = tableColTypeInfo.get(columnName);
				return new T2<String, Long>(info.item1, info.item2);
			} else {
				return JPABuilder.getFieldType(data.item1, tableName, columnName);
			}
		}
		// returns: (dataType, dataLength, nullable, columnId)
		private Tuple.T4<String, Long, Boolean, Integer> getColumnInfo(String tableName, String columnName) {
			Map<String, Tuple.T4<String, Long, Boolean, Integer>> tableColTypeInfo = data.item2.get(tableName);
			if (tableColTypeInfo==null) {
				tableColTypeInfo = getTableColumnsInfo(tableName);
				data.item2.put(tableName, tableColTypeInfo);
			}
			return tableColTypeInfo.get(columnName);		
		}
		@Override
		public Boolean getNullable(String tableName, String columnName) {			
			return getColumnInfo(tableName, columnName).item3;
		}

		@Override
		public Integer getColumnId(String tableName, String columnName) {
			return getColumnInfo(tableName, columnName).item4;
		}
	}
	
	public static IDataFieldDescriptor<?> databaseFieldDescriptor;
	
}
