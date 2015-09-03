package ru.spb.iac.cud.items;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javaw.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.openejb.jee.jba.cmp.Strategy;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userFunctions", propOrder = { "codeFunction", "dateFunction",
		"detailsFunction", "userName", "actName", "usrId", "usrOrgName" })
 public class AuditFunction {

	@XmlElement(name = "codeFunction", required = true)
	private String codeFunction;

	@XmlElement(name = "dateFunction", required = true)
	private Date dateFunction;

	@XmlElement(name = "detailsFunction")
	private String detailsFunction;

	@XmlElement(name = "userName")
	private String userName;	
	
	@XmlElement(name = "actName")
	private String actName;
	
	@XmlElement(name = "usrId")
	private Long usrId;	
	
	@XmlElement(name = "usrOrgName")
	private String usrOrgName;
	
	public void Function() {
	}

	public Date getDateFunction() {
		return dateFunction;
	}
	
	
	public String toRON(String varName) {
		return javaw.lang.Strings.toRON(varName, this);
	}

	public void setDateFunction(Date dateFunction) {
		this.dateFunction = dateFunction;
	}

	public String getDetailsFunction() {
		return detailsFunction;
	}

	public void setDetailsFunction(String detailsFunction) {
		this.detailsFunction = detailsFunction;
	}

	public String getCodeFunction() {
		return codeFunction;
	}

	public void setCodeFunction(String codeFunction) {
		this.codeFunction = codeFunction;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public Long getUsrId() {
		return usrId;
	}

	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}
	
	public String getUsrOrgName() {
		return usrOrgName;
	}
	
	public void setUsrOrgName(String usrOrgName) {
		this.usrOrgName = usrOrgName;
	}

	private static String[] arrDatePatterns =  new String[]{"YYYY-MM-dd hh:mm:ss", "dd.MM.yy hh:mm:ss"};
	private static Date tryParseDate(String sDate) throws ParseException  {
		int i=0;
		for (String patn : arrDatePatterns) {
			try {
				SimpleDateFormat df = new SimpleDateFormat(patn);
				Date dt = df.parse(sDate);
				if(i>0) { // put to the start (swap) a match to speed up consequent queries
					arrDatePatterns[i] = arrDatePatterns[0];
					arrDatePatterns[0] = patn;
				}
				return dt;
			} catch (ParseException e) {}
			i++;
		}		
		throw new ParseException(sDate, 0);
	}
	
	public static List<AuditFunction> FromRows_getAuditDataISByPeriodList(
			List<Object[]> auditDataISByPeriodList, StringBuilder errMsg) {
		List<AuditFunction> al = new ArrayList<AuditFunction>();		
		for(Object[] row: auditDataISByPeriodList) {
			try {				
				AuditFunction af = new AuditFunction();
				af.setCodeFunction(row[0].toString());
				af.setDateFunction(tryParseDate(row[1].toString()));
		        af.setUserName(row[2]!=null?row[2].toString():"");
		        af.setActName(row[4]!=null?row[4].toString():"");	
		        af.setUsrId(row[5]!=null?Long.valueOf(row[5].toString()):0);
		        af.setUsrOrgName(row[6]!=null?row[6].toString():"");
		        al.add(af);
			} catch (ParseException e) {
				errMsg.append("FromRows_getAuditDataISByPeriodList:for:").append(e).append('\n');
			} 
		}
		return al;
	}
}
