package iac.cud.infosweb.dataitems;

import iac.cud.infosweb.dataitems.AppUserItem.INotify;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javaw.util.ArrayList;

 public class AppUserItem extends AppItem {

	private String fioIogvUser;
	private String passwordTechUser;
	private String surnameUser;
	private String nameUser;
	private String patronymicUser;
	private String iogvCodeUser;
	private String positionUser;
	private String emailUser;
	private String phoneUser;
	private String certificateUser;
	private String nameDepartament;
	private String nameOrg;
	private String iogvCodeOrg;

	private Long idUser;
	private String login;

	public AppUserItem() {
	}

	public AppUserItem(Long idApp, String created, int status, String orgName,
			String usrFio, String rejectReason, String comment,

			String surnameUser, String nameUser, String patronymicUser,
			String iogvCodeUser, String positionUser, String emailUser,
			String phoneUser, String certificateUser, String nameDepartament,
			String nameOrg, String iogvCodeOrg,

			Long idUser, String login,

			String commentApp) {
		super(idApp, created, status, orgName, usrFio, rejectReason, comment,
				commentApp);
		this.surnameUser = surnameUser;
		this.nameUser = nameUser;
		this.patronymicUser = patronymicUser;
		this.iogvCodeUser = iogvCodeUser;
		this.positionUser = positionUser;
		this.emailUser = emailUser;
		this.phoneUser = phoneUser;
		this.certificateUser = certificateUser;
		this.nameDepartament = nameDepartament;
		this.nameOrg = nameOrg;
		this.iogvCodeOrg = iogvCodeOrg;

		this.idUser = idUser;
		this.login = login;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPatronymicUser() {
		return patronymicUser;
	}

	public void setPatronymicUser(String patronymicUser) {
		this.patronymicUser = patronymicUser;
	}

	public String getIogvCodeUser() {
		return iogvCodeUser;
	}

	public void setIogvCodeUser(String iogvCodeUser) {
		this.iogvCodeUser = iogvCodeUser;
	}

	public String getPositionUser() {
		return positionUser;
	}

	public void setPositionUser(String positionUser) {
		this.positionUser = positionUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(String phoneUser) {
		this.phoneUser = phoneUser;
	}

	public String getCertificateUser() {
		return certificateUser;
	}

	public void setCertificateUser(String certificateUser) {
		this.certificateUser = certificateUser;
	}

	public String getNameDepartament() {
		return nameDepartament;
	}

	public void setNameDepartament(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}

	public String getNameOrg() {
		return nameOrg;
	}

	public void setNameOrg(String nameOrg) {
		this.nameOrg = nameOrg;
	}

	public String getIogvCodeOrg() {
		return iogvCodeOrg;
	}

	public void setIogvCodeOrg(String iogvCodeOrg) {
		this.iogvCodeOrg = iogvCodeOrg;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFioIogvUser() {
		return fioIogvUser;
	}

	public void setFioIogvUser(String fioIogvUser) {
		this.fioIogvUser = fioIogvUser;
	}

	public String getPasswordTechUser() {
		return passwordTechUser;
	}

	public void setPasswordTechUser(String passwordTechUser) {
		this.passwordTechUser = passwordTechUser;
	}

	public static AppUserItem FromRow(Object[] objectArray, DateFormat df) {
		return new AppUserItem(
			objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
			objectArray[1]!=null?df.format((Date)objectArray[1]) :"",
			objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0,	
			objectArray[3]!=null?objectArray[3].toString():"",
			objectArray[4]!=null?objectArray[4].toString():"",
			objectArray[5]!=null?objectArray[5].toString():"",
			objectArray[6]!=null?objectArray[6].toString():"",			 
			objectArray[7]!=null?objectArray[7].toString():"",
			objectArray[8]!=null?objectArray[8].toString():"",
			objectArray[9]!=null?objectArray[9].toString():"",
			objectArray[10]!=null?objectArray[10].toString():"",
			objectArray[11]!=null?objectArray[11].toString():"",
			objectArray[12]!=null?objectArray[12].toString():"",
			objectArray[13]!=null?objectArray[13].toString():"",
			objectArray[14]!=null?objectArray[14].toString():"",
			objectArray[15]!=null?objectArray[15].toString():"",
			objectArray[16]!=null?objectArray[16].toString():"",
			objectArray[17]!=null?objectArray[17].toString():"",
			objectArray[18]!=null?Long.valueOf(objectArray[18].toString()):null,
		    objectArray[19]!=null?objectArray[19].toString():"",
		    objectArray[20]!=null?objectArray[20].toString():""
		);
	}

	private static HashMap<String, Object> RowToAttrsMap(Object[] objectArray, DateFormat df) {
		Long idApp = objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null;
		String created = objectArray[1]!=null?objectArray[1].toString():"";
		int status = objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0;
		String orgName = objectArray[3]!=null?objectArray[3].toString():"";
		String usrFio = objectArray[4]!=null?objectArray[4].toString():"";
		String rejectReason = objectArray[5]!=null?objectArray[5].toString():"";
		String comment = objectArray[6]!=null?objectArray[6].toString():"";
		String surnameUser = objectArray[7]!=null?objectArray[7].toString():"";
		String nameUser = objectArray[8]!=null?objectArray[8].toString():"";
		String patronymicUser = objectArray[9]!=null?objectArray[9].toString():"";
		String iogvCodeUser = objectArray[10]!=null?objectArray[10].toString():"";
		String positionUser = objectArray[11]!=null?objectArray[11].toString():"";
		String emailUser = objectArray[12]!=null?objectArray[12].toString():"";
		String phoneUser = objectArray[13]!=null?objectArray[13].toString():"";
		String certificateUser = objectArray[14]!=null?objectArray[14].toString():"";
		String nameDepartament = objectArray[15]!=null?objectArray[15].toString():"";
		String nameOrg = objectArray[16]!=null?objectArray[16].toString():"";
		String iogvCodeOrg = objectArray[17]!=null?objectArray[17].toString():"";
		Long idUser = objectArray[18]!=null?Long.valueOf(objectArray[18].toString()):null;
		String login = objectArray[19]!=null?objectArray[19].toString():"";
		String commentApp = objectArray[20]!=null?objectArray[20].toString():"";
		
		HashMap<String, Object> mapAttrs = new HashMap<String, Object>();
		mapAttrs.put("idApp", idApp);
		mapAttrs.put("created", created);
		mapAttrs.put("status", status);
		mapAttrs.put("orgName", orgName);
		mapAttrs.put("usrFio", usrFio);
		mapAttrs.put("rejectReason", rejectReason);
		mapAttrs.put("comment", comment);
		mapAttrs.put("surnameUser", surnameUser);
		mapAttrs.put("nameUser", nameUser);
		mapAttrs.put("patronymicUser", patronymicUser);
		mapAttrs.put("iogvCodeUser", iogvCodeUser);
		mapAttrs.put("positionUser", positionUser);
		mapAttrs.put("emailUser", emailUser);
		mapAttrs.put("phoneUser", phoneUser);
		mapAttrs.put("certificateUser", certificateUser);
		mapAttrs.put("nameDepartament", nameDepartament);
		mapAttrs.put("nameOrg", nameOrg);
		mapAttrs.put("iogvCodeOrg", iogvCodeOrg);
		mapAttrs.put("idUser", idUser);
		mapAttrs.put("login", login);
		mapAttrs.put("commentApp", commentApp);		
		
		return mapAttrs;
	}	
 
	public interface INotify {
		void gotRow(Object[] row);
		void error(Exception x);
	}
	public static Map<String, Object> FirstRowToAttrsMap(List<Object[]> lo, INotify log) {		
		return (Map<String, Object>) firstFromRows(lo, new IFirstFromRowsAction<HashMap<String, Object>>() {
				@Override public HashMap<String, Object> act(Object[] objectArray,DateFormat df) { return AppUserItem.RowToAttrsMap(objectArray,df); }}
				, log);
	}
	
	public static AppUserItem FirstFromRows(List<Object[]> lo, INotify log) {
		return firstFromRows(lo, new IFirstFromRowsAction<AppUserItem>() {
					@Override public AppUserItem act(Object[] objectArray,DateFormat df) { return AppUserItem.FromRow(objectArray,df);}}
				, log);
	}
	private interface IFirstFromRowsAction<T> {
		T act(Object[] objectArray, DateFormat df);
	}
	private static<T> T firstFromRows(List<Object[]> rows, IFirstFromRowsAction<T> action, INotify log) {
        DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");	           
        for(Object[] objectArray :rows){
     	   try{     		  
 		     log.gotRow(objectArray);	        		   
     	     return action.act(objectArray,df);
     	   }catch(Exception e1){
     		 log.error(e1);
     	   }
        }
		return null;		
	}
	
	public static List<BaseItem> FromRows(List<Object[]> lo,
			StringBuilder errMsg) {
        DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
        List<BaseItem> auditList = new ArrayList<BaseItem>();               
        for(Object[] objectArray :lo){
     	   try{     	   	 
     		   auditList.add(AppUserItem.FromRow(objectArray, df));
     	   }catch(Exception e1){
     		   errMsg.append("AppUserItem.FromRows:for:error:").append(e1).append('\n');
     	   }
        } 
		return auditList;
	}




}
