package iac.cud.data.usr;

import java.security.InvalidAlgorithmParameterException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;

import ru.spb.iac.cud.core.data.DataField;
import ru.spb.iac.cud.core.data.DataFieldType;
import ru.spb.iac.cud.core.data.JPABuilder;

public class JPA_UsrManager extends JPABuilder {
	public boolean IsAccOrgManagerValue = false;
	public List<Long> listAllowedSys = null;
	public String UpSign = null;
	
	// note! setFilter is affected by IsAccOrgManagerValue and UpSign
	public void setFilter(Map<String, String> filter) throws InvalidAlgorithmParameterException {
		resetWhereConditions();
        if(filter!=null) {
   		 Set<Map.Entry<String, String>> setFilterUser = filter.entrySet();
             for (Map.Entry<String, String> me : setFilterUser) {   	               
	   		     if("t1_crt_date".equals(me.getKey())){  
	   		    	 //putWhereCondition("DATE", "t1_crt_date", ">=", me.getValue());
	   		    	putWhereCondition(new DataField<Date>(DataFieldType.DATE_YYYYMMDD, "t1_crt_date"), ">=", (Date)DataFieldType.DATE_DDMMYY.fromString(me.getValue()));
	   		    	 
	        	   //делаем фильтр на начало  
	        	     //st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
	    	     }
	   		     else if ("t1_crt_date2".equals(me.getKey())) {
	   		    	//putWhereCondition(Date.class, "t1_crt_date", "<=", me.getValue());
	   		    	putWhereCondition(new DataField<Date>(DataFieldType.DATE_YYYYMMDD, "t1_crt_date"), "<=", (Date)DataFieldType.DATE_DDMMYY.fromString(me.getValue()));   		    	
	   		    	//System.out.println("invokeLocal: t1_crt_date2="+me.getValue());
			 }
	   		     else{
	   		    	 putWhereCondition(me.getKey(), "like", me.getValue());
	        		//делаем фильтр на начало
	            	//st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
	        	  }   	              
             }
        }
        if(IsAccOrgManagerValue)
        	putWhereCondition(/*Integer.class,*/ "t1.t1_org_code", "=", UpSign); // sCurUserOrg
	}
	
	public void setSortOrders(Set<Entry<String, String>> sortOrders) {
		resetOrderBy(); putOrderByFromStringSet(sortOrders);
	}

	
	public List<Object[]> getAuditList(
			EntityManager entityManager,
			int firstRow, int numberOfRows) 
	{
		if(!m_alOrderBy.contains("t1_fio"))
			putOrderBy("t1_fio", null);
		return entityManager.createNativeQuery(
				(new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, "))
		         .append("t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name, t1.t1_org_code, ") 
		         .append("t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, ") 
		         .append("t1.t1_status, t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login, ")
		         .append("t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_iogv_bind_type, t1.t1_usr_SNILS  ")
		  .append("from( ")
		  .append("select AU_FULL.ID_SRV t1_id, AU_FULL.login t1_login, AU_FULL.CERTIFICATE t1_cert, t2.CL_USR_CODE t1_usr_code, ")
		   .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_fio, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.PHONE, CL_USR_FULL.PHONE ) t1_tel, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.E_MAIL, CL_USR_FULL.EMAIL) t1_email, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SNILS, CL_USR_FULL.SNILS) t1_usr_SNILS, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.POSITION, CL_USR_FULL.POSITION)t1_pos, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.DEPARTMENT, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_)) t1_dep_name, ")
					.append("t1.CL_ORG_CODE t1_org_code, CL_ORG_FULL.name t1_org_name, ")
					.append("cl_org_adr_full.NAME_ADDR t1_org_adr, ")
					.append("'' t1_org_tel, ")
		    .append("to_char(AU_FULL.START_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_start, ")
		    .append("to_char(AU_FULL.END_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_end, ")
		    .append("AU_FULL.STATUS t1_status, ")
		    .append("AU_FULL.CREATED t1_crt_date, ")
		    .append("USR_CRT.LOGIN t1_crt_usr_login, ")
		    .append("to_char(AU_FULL.MODIFIED, 'DD.MM.YY HH24:MI:SS') t1_upd_date, ")
		    .append("USR_UPD.LOGIN t1_upd_usr_login, ")
		    .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.sign_object)) t1_dep_code, ")
		    .append("CL_ORG_FULL.STATUS t1_org_status,  CL_usr_FULL.STATUS t1_usr_status, ")
		     .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.STATUS)) t1_dep_status, ") 
		     .append("AU_FULL.UP_BINDING t1_iogv_bind_type ")
		  .append("from ")
					.append("(select max(CL_ORG.ID) CL_ORG_ID,  CL_ORG.cod  CL_ORG_CODE ")
					.append("from IOGV cl_org, ")
		  .append("AC_USERS_KNL_T au ")
					.append("where AU.UP_SIGN_IOGV = CL_ORG.cod ")
					.append("group by CL_ORG.cod) t1, ")
		  .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
		  .append("from ISP_BSS_T cl_usr, ")
		  .append("AC_USERS_KNL_T au ")
		  .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
		  .append("group by CL_usr.SIGN_OBJECT) t2, ")
		  .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE ")
		  .append("from ISP_BSS_T cl_dep, ")
		  .append("AC_USERS_KNL_T au ")
		  .append("where substr(au.UP_SIGN_USER,1,5)||'000'  =cl_dep.SIGN_OBJECT(+) ")
		  .append("group by CL_DEP.SIGN_OBJECT) t3, ")
					.append("IOGV cl_org_full, ")
		  .append("ISP_BSS_T cl_usr_full, ")
		  .append("ISP_BSS_T cl_dep_full, ")
		  .append("AC_USERS_KNL_T au_full, ")
		  .append("AC_USERS_KNL_T usr_crt, ")
					.append("AC_USERS_KNL_T usr_upd, ")
					.append("ADDR_IOGV cl_org_adr_full ")
					.append("where cl_org_full.ID= CL_ORG_ID ")
		  .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
		  .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
					.append("and au_full.UP_SIGN_IOGV = CL_ORG_CODE ")
		  .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
		  .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
		  .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
		  .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ")
               .append("and cl_org_adr_full.COD_IOGV(+) =  CL_ORG_CODE ")
               .append("and cl_org_adr_full.status(+) = 'A' ")
				//!!!
			  .append("and AU_FULL.STATUS !=3 ")
			  .append(")t1 ")
			  .append(getWhereAndClause())
			  .append(" ")
                  .append(getOrderByClause())
                  .toString())
             .setFirstResult(firstRow)
             .setMaxResults(numberOfRows)
             .getResultList();
	}
	
	public Long getAuditCount(EntityManager entityManager) 
	throws InvalidAlgorithmParameterException {
		return  ((java.math.BigDecimal)entityManager.createNativeQuery(
		        (new StringBuilder("select count(*) "))
				   .append("from( ")
				   .append("select AU_FULL.ID_SRV t1_id, AU_FULL.login t1_login, AU_FULL.CERTIFICATE t1_cert, t2.CL_USR_CODE t1_usr_code, ")
				    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_fio, ")
				     .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.PHONE, CL_USR_FULL.PHONE ) t1_tel, ")
				     .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.E_MAIL, CL_USR_FULL.EMAIL) t1_email, ")
				     .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.POSITION, CL_USR_FULL.POSITION)t1_pos, ")
				     .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.DEPARTMENT, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_)) t1_dep_name, ")
				     .append("t1.CL_ORG_CODE t1_org_code, CL_ORG_FULL.FULL_ t1_org_name, ")
				     .append("CL_ORG_FULL.PREFIX || decode(CL_ORG_FULL.HOUSE, null, null, ','  ||CL_ORG_FULL.HOUSE  ) t1_org_adr, ")
				     .append("CL_ORG_FULL.PHONE t1_org_tel, ")
				     .append("to_char(AU_FULL.START_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_start, ")
				     .append("to_char(AU_FULL.END_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_end, ")
				     .append("AU_FULL.STATUS t1_status, ")
				     .append("AU_FULL.CREATED t1_crt_date, ")
				     .append("USR_CRT.LOGIN t1_crt_usr_login, ")
				     .append("to_char(AU_FULL.MODIFIED, 'DD.MM.YY HH24:MI:SS') t1_upd_date, ")
				     .append("USR_UPD.LOGIN t1_upd_usr_login, ")
				     .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.sign_object)) t1_dep_code, ")
				     .append("CL_ORG_FULL.STATUS t1_org_status,  CL_usr_FULL.STATUS t1_usr_status, ")
				      .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.STATUS)) t1_dep_status, ") 
				      .append("AU_FULL.UP_BINDING t1_iogv_bind_type ")
				   .append("from ")
				   .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
				   .append("from ISP_BSS_T cl_org, ")
				   .append("AC_USERS_KNL_T au ")
				   .append("where AU.UP_SIGN = CL_ORG.SIGN_OBJECT ")
				   .append("group by CL_ORG.SIGN_OBJECT) t1, ")
				   .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
				   .append("from ISP_BSS_T cl_usr, ")
				   .append("AC_USERS_KNL_T au ")
				   .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
				   .append("group by CL_usr.SIGN_OBJECT) t2, ")
				   .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE ")
				   .append("from ISP_BSS_T cl_dep, ")
				   .append("AC_USERS_KNL_T au ")
				   .append("where substr(au.UP_SIGN_USER,1,5)||'000'  =cl_dep.SIGN_OBJECT(+) ")
				   .append("group by CL_DEP.SIGN_OBJECT) t3, ")
				   .append("ISP_BSS_T cl_org_full, ")
				   .append("ISP_BSS_T cl_usr_full, ")
				   .append("ISP_BSS_T cl_dep_full, ")
				   .append("AC_USERS_KNL_T au_full, ")
				   .append("AC_USERS_KNL_T usr_crt, ")
				   .append("AC_USERS_KNL_T usr_upd ")
				   .append("where cl_org_full.ID_SRV= CL_ORG_ID ")
				   .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
				   .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
				   .append("and au_full.UP_SIGN = CL_ORG_CODE ")
				   .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
				   .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
				   .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
				   .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ")
					 //!!!
					   .append("and AU_FULL.STATUS !=3 ")
					   .append(")t1 ")
					 .append(getWhereAndClause())	//(st!=null ? " where "+st :" "))							 
					 .toString())   
				 .getSingleResult()).longValue();
	}
	
	public static Object FindUserDataByFieldValue(EntityManager em, String dataFieldName, String fieldName, String fieldValue) {
		return  em
				.createNativeQuery(
						(new StringBuilder("select AU.").append(dataFieldName).append(" "))
						  .append("from ")
						  .append("AC_USERS_KNL_T au ")
						  .append("where AU.").append(fieldName).append("=? ")
						  .append("and (AU.START_ACCOUNT is null or au.START_ACCOUNT <= sysdate) ")
						  .append("and (AU.START_ACCOUNT is null or au.START_ACCOUNT > sysdate) ")
								// "and AU.STATUS != 2 ")
								  .append("and AU.STATUS = 1 ")
								.toString())
				.setParameter(1, fieldValue).getSingleResult();
	}
	
	public static Long FindUserIdByFieldValue(EntityManager em, String fieldName, String fieldValue) {
		return ((java.math.BigDecimal)FindUserDataByFieldValue(em, "ID_SRV", fieldName, fieldValue)).longValue();
	}
	
}
