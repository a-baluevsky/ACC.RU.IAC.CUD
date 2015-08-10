package iac.cud.data.usr;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ru.spb.iac.cud.core.data.JPABuilder;

public class JPA_AppUserManager extends JPABuilder {

	public static List<Object[]> getAuditList(EntityManager entityManager,
			Map<String, String> filterMap, Set<Entry<String, String>> set,
			int firstRow, int numberOfRows) {
		String orderQuery=null;
		String st=null;
        for (Map.Entry<String, String> me : set) {
		       //log.info("me.getKey+:"+me.getKey());
		       //log.info("me.getValue:"+me.getValue());
		       
		       if(orderQuery==null){
		    	 orderQuery="order by "+me.getKey()+" "+me.getValue();
		       }else{
		    	 orderQuery=orderQuery+", "+me.getKey()+" "+me.getValue();  
		       }
		     }
        //log.info("AppUser:invokeLocal:list:orderQuery:"+orderQuery);
        
        if(filterMap!=null){
   		 Set<Map.Entry<String, String>> setFilterAppUser = filterMap.entrySet();
             for (Map.Entry<String, String> me : setFilterAppUser) {
             
  		     if("t1_crt_date".equals(me.getKey())){  
       	   
       	   //делаем фильтр на начало  
       	     st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
   	   
  		     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
   	    	 
   	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
   	    	 
   	     }else{
       		//делаем фильтр на начало
           	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
       	  }
             }
   	   }
        //log.info("AppUser:invokeLocal:list:filterQuery:"+st);
		return entityManager.createNativeQuery(
                (new StringBuilder("select t1.t1_id, t1.t1_created, t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, "))
                .append("t1_SURNAME_USER, ")
                .append("t1_NAME_USER, ")
                .append("t1_PATRONYMIC_USER, ")
                .append("t1_SIGN_USER, ")
                .append("t1_POSITION_USER, ")
                .append("t1_EMAIL_USER, ")
                .append("t1_PHONE_USER, ")
                .append("t1_CERTIFICATE_USER, ")
                .append("t1_NAME_DEPARTAMENT, ")
                .append("t1_NAME_ORG, ")
                .append("t1_SIGN_ORG, ")
            .append("t1_user_id, t1_user_login, ") 
            .append("t1_comment_app ")
            .append("from( ")
           .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created, ")
                .append("JAS.SURNAME_USER t1_SURNAME_USER, ")
                .append("JAS.NAME_USER t1_NAME_USER, ")
                .append("JAS.PATRONYMIC_USER t1_PATRONYMIC_USER, ")
                .append("JAS.SIGN_USER t1_SIGN_USER, ")
                .append("JAS.POSITION_USER t1_POSITION_USER, ")
                .append("JAS.EMAIL_USER t1_EMAIL_USER, ")
                .append("JAS.PHONE_USER t1_PHONE_USER, ")
                .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
                .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT, ")
                .append("JAS.NAME_ORG t1_NAME_ORG, ")
                .append("JAS.SIGN_ORG t1_SIGN_ORG, ")
                .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
            .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
            .append("JAS.REJECT_REASON t1_reject_reason, ")
            .append("au_APP.ID_SRV t1_user_id, AU_APP.LOGIN t1_user_login, ") 
            .append("JAS.COMMENT_ t1_comment, ") 
            .append("JAS.COMMENT_APP t1_comment_app ")
           .append("from JOURN_APP_USER_BSS_T jas, ")
             .append("AC_USERS_KNL_T au_FULL, ")
              .append("ISP_BSS_T cl_org_full, ")
               .append("ISP_BSS_T cl_usr_full, ")
                .append("AC_USERS_KNL_T au_APP, ")
            .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
              .append("from ISP_BSS_T cl_org ")
              .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
              .append("group by CL_ORG.SIGN_OBJECT) t03, ")
               .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
                          .append("from ISP_BSS_T cl_usr ")
                          .append("where CL_USR.FIO is not null ")
                          .append("group by CL_usr.SIGN_OBJECT) t02 ")
             .append("where JAS.UP_USER=AU_FULL.ID_SRV(+) ")
              .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE(+) ")
              .append("and CL_ORG_FULL.ID_SRV(+)=t03.CL_ORG_ID ")
              .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
              .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
             .append("and au_APP.ID_SRV(+) =JAS.UP_USER_APP ")
             .append(") t1")
	           .append(st!=null ? " where "+st :" ")
	           .append(orderQuery!=null ? orderQuery+", t1_id desc " : " order by t1_id desc ")
                    .toString())
                    .setFirstResult(firstRow)
                    .setMaxResults(numberOfRows)
                    .getResultList();
	}

	public static Long getAuditCount(EntityManager entityManager,
			Map<String, String> filterMap) {
		String st=null;
        if(filterMap!=null){
   		 Set<Map.Entry<String, String>> setFilterAppUser = filterMap.entrySet();
             for (Map.Entry<String, String> me : setFilterAppUser) {
	             if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
	             }else{
	           	 st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
	             }	 
             }
   	    }		
		return ((java.math.BigDecimal)entityManager.createNativeQuery(
				 (new StringBuilder("select count(*) "))
				  .append("from( ")
	               .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created, ")
	                    .append("JAS.SURNAME_USER t1_SURNAME_USER, ")
	                    .append("JAS.NAME_USER t1_NAME_USER, ")
	                    .append("JAS.PATRONYMIC_USER t1_PATRONYMIC_USER, ")
	                    .append("JAS.SIGN_USER t1_SIGN_USER, ")
	                    .append("JAS.POSITION_USER t1_POSITION_USER, ")
	                    .append("JAS.EMAIL_USER t1_EMAIL_USER, ")
	                    .append("JAS.PHONE_USER t1_PHONE_USER, ")
	                    .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
	                    .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT, ")
	                    .append("JAS.NAME_ORG t1_NAME_ORG, ")
	                    .append("JAS.SIGN_ORG t1_SIGN_ORG, ")
	                    .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
	                .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
	                .append("JAS.REJECT_REASON t1_reject_reason, ")
	                .append("au_APP.ID_SRV t1_user_id, AU_APP.LOGIN t1_user_login, ")
	                .append("JAS.COMMENT_ t1_comment ")
	               .append("from JOURN_APP_USER_BSS_T jas, ")
	                 .append("AC_USERS_KNL_T au_FULL, ")
	                  .append("ISP_BSS_T cl_org_full, ")
	                   .append("ISP_BSS_T cl_usr_full, ")
	                    .append("AC_USERS_KNL_T au_APP, ")
	                .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
	                  .append("from ISP_BSS_T cl_org ")
	                  .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
	                  .append("group by CL_ORG.SIGN_OBJECT) t03, ")
	                   .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
	                              .append("from ISP_BSS_T cl_usr ")
	                              .append("where CL_USR.FIO is not null ")
	                              .append("group by CL_usr.SIGN_OBJECT) t02 ")
	                  .append("where JAS.UP_USER=AU_FULL.ID_SRV ")
	                  .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE ")
	                  .append("and CL_ORG_FULL.ID_SRV=t03.CL_ORG_ID ")
	                  .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
	                  .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
	                 .append("and au_APP.ID_SRV(+) =JAS.UP_USER_APP ")
	                 .append(") t1")
	                 .append(st!=null ? " where "+st :" ")
	                 .toString())
	            .getSingleResult()).longValue();
	}

	public static List<Object[]> getUserItem(EntityManager entityManager, Long idUser) {
		Query query = entityManager.createNativeQuery(
	     		   (new StringBuilder("select t1.t1_id, t1.t1_created, t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, "))
	               .append("t1_SURNAME_USER, ")
	               .append("t1_NAME_USER, ")
	               .append("t1_PATRONYMIC_USER, ")
	               .append("t1_SIGN_USER, ")
	               .append("t1_POSITION_USER, ")
	               .append("t1_EMAIL_USER, ")
	               .append("t1_PHONE_USER, ")
	               .append("t1_CERTIFICATE_USER, ")
	               .append("t1_NAME_DEPARTAMENT, ")
	               .append("t1_NAME_ORG, ")
	               .append("t1_SIGN_ORG, ")
	           .append("t1_user_id, t1_user_login, ")
	           .append("t1_comment_app ")
	           .append("from( ")
	          .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created, ")
	               .append("JAS.SURNAME_USER t1_SURNAME_USER, ")
	               .append("JAS.NAME_USER t1_NAME_USER, ")
	               .append("JAS.PATRONYMIC_USER t1_PATRONYMIC_USER, ")
	               .append("JAS.SIGN_USER t1_SIGN_USER, ")
	               .append("JAS.POSITION_USER t1_POSITION_USER, ")
	               .append("JAS.EMAIL_USER t1_EMAIL_USER, ")
	               .append("JAS.PHONE_USER t1_PHONE_USER, ")
	               .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
	               .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT, ")
	               .append("JAS.NAME_ORG t1_NAME_ORG, ")
	               .append("JAS.SIGN_ORG t1_SIGN_ORG, ")
	               .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
	           .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
	           .append("JAS.REJECT_REASON t1_reject_reason, ")
	           .append("au_APP.ID_SRV t1_user_id, AU_APP.LOGIN t1_user_login, ")
	           .append("JAS.COMMENT_ t1_comment, ")
	           .append("JAS.COMMENT_APP t1_comment_app ")
	          .append("from JOURN_APP_USER_BSS_T jas, ")
	            .append("AC_USERS_KNL_T au_FULL, ")
	             .append("ISP_BSS_T cl_org_full, ")
	              .append("ISP_BSS_T cl_usr_full, ")
	               .append("AC_USERS_KNL_T au_APP, ")
	           .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
	             .append("from ISP_BSS_T cl_org ")
	             .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
	             .append("group by CL_ORG.SIGN_OBJECT) t03, ")
	              .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
	                         .append("from ISP_BSS_T cl_usr ")
	                         .append("where CL_USR.FIO is not null ")
	                         .append("group by CL_usr.SIGN_OBJECT) t02 ")		   
	   	             /*   "where JAS.UP_USER=AU_FULL.ID_SRV "
	   	                + "and AU_FULL.UP_SIGN=t03.CL_ORG_CODE "
	   	                + "and CL_ORG_FULL.ID_SRV=t03.CL_ORG_ID "+*/
	   	                  .append("where JAS.UP_USER=AU_FULL.ID_SRV(+) ")
	   	                  .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE(+) ")
	   	                  .append("and CL_ORG_FULL.ID_SRV(+)=t03.CL_ORG_ID ")
	   	                  .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
	   	                  .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
	   	                 .append("and au_APP.ID_SRV(+) =JAS.UP_USER_APP ") 
	   	                 .append("and JAS.ID_SRV=? ")
	   	                 .append(") t1")
	   	               .toString())
	    .setParameter(1, idUser);		
		System.out.println(getQueryString(query));
		return query.getResultList();
	}

	public static List getAcRoleList(EntityManager entityManager,
			Long usrId, Long appCode) {
		 return entityManager.createQuery(
	    			"select ar from AcRole ar, AcLinkUserToRoleToRaion alur " 
	    	 		+ "where alur.acRole = ar and alur.pk.acUser = :acUser " 
	    	 		+ "and ar.acApplication= :acApplication ")
	    	 		 .setParameter("acUser", usrId)
	    	 		 .setParameter("acApplication", appCode)
	    	 		 .getResultList();
	}

}
