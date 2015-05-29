package iac.grn.infosweb.context.app.user.certmodify;

import java.util.List;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javaw.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.Date;
import javaw.util.SerializableMap;
import javaw.util.SerializableList;

import javax.faces.context.FacesContext;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.persistence.NoResultException;

import org.apache.xml.security.utils.Base64;
import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import iac.cud.infosweb.dataitems.AppUserCertModifyItem;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcUsersCertBssT;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.table.BaseManager;
import iac.grn.serviceitems.BaseTableItem;
import iac.grn.serviceitems.HeaderTableItem;

@Name("appUserCertModifyManager")
 public class AppUserCertModifyManager extends BaseManager implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9117167023157608815L;
	private String rejectReason;
	private String commentText;
	
	private /*Serializable*/ List<HeaderTableItem> headerItemsListContextCREATE;
	
	@Override
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		
		 log.info("hostsManager:invokeLocal");
		 try{
			 String orderQuery=null;
			 log.info("hostsManager:invokeLocal");
			 
			 AppUserCertModifyStateHolder appUserCertModifyStateHolder = (AppUserCertModifyStateHolder)
					  Component.getInstance("appUserCertModifyStateHolder",ScopeType.SESSION);
			 SerializableMap<String, String> filterMapUserCert = appUserCertModifyStateHolder.getColumnFilterValues();
			 String st=null;
			  
			 if("list".equals(type)){
				 log.info("invokeLocal:list:01");
				 
				 Set<Map.Entry<String, String>> set = appUserCertModifyStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		       log.info("me.getKey+:"+me.getKey());
      		       log.info("me.getValue:"+me.getValue());
      		       
      		       if(orderQuery==null){
      		    	 orderQuery="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQuery=orderQuery+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("AppUserCertMod:invokeLocal:list:orderQuery:"+orderQuery);
                 
                 if(filterMapUserCert!=null){
    	    		 Set<Map.Entry<String, String>> setFilterAppUserCertMod = filterMapUserCert.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAppUserCertMod) {
    	            	  log.info("me.getKey+:"+me.getKey());
    	            	  log.info("me.getValue:"+me.getValue());
    	   		      
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
                 log.info("AppUserCertMod:invokeLocal:list:filterQuery:"+st);

             
               SerializableList<Object[]> loUserCert=null;
               AppUserCertModifyItem uiUserCert = null;
               DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
               

             loUserCert=new ArrayList<Object[]>(entityManager.createNativeQuery(
                     (new StringBuilder("select t1.t1_id, t1.t1_created, "))
                     .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
                     .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
                     .append("t1_dep_name_app, ") 
                     .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app ")
                      .append("from(  ")
                     .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
                     .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
                     .append("JAS.COMMENT_ t1_comment, ")
                      .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
                      .append("JAS.REJECT_REASON t1_reject_reason,  ")
                      .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
                       .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ") 
                         .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app ")
                    .append("from JOURN_APP_USER_CERTADD_BSS_T jas, ")
                       .append("AC_USERS_KNL_T au_FULL,   ")
                        .append("ISP_BSS_T cl_org_full, ")
                         .append("ISP_BSS_T cl_usr_full, ")
                         .append("ISP_BSS_T cl_org_app, ")
                         .append("ISP_BSS_T cl_usr_app, ")
                         .append("ISP_BSS_T cl_dep_app, ")
                        .append("AC_USERS_KNL_T au_APP, ")
                      .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
                        .append("from ISP_BSS_T cl_org ")
                        .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
                        .append("group by CL_ORG.SIGN_OBJECT) t03, ")
                         .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
                                    .append("from ISP_BSS_T cl_usr ")
                                    .append("where CL_USR.FIO is not null ")
                                    .append("group by CL_usr.SIGN_OBJECT) t02,   ")
                         .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
                        .append("from ISP_BSS_T cl_org ")
                        .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
                        .append("group by CL_ORG.SIGN_OBJECT) t03_app, ")
                         .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
                                    .append("from ISP_BSS_T cl_usr ")
                                    .append("where CL_USR.FIO is not null ")
                                    .append("group by CL_usr.SIGN_OBJECT) t02_app,  ")
                       .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE  ")
                                    .append("from ISP_BSS_T cl_dep ")
                                    .append("where CL_dep.SIGN_OBJECT LIKE '%000' ")
                                    .append("group by CL_DEP.SIGN_OBJECT) t04_app ")
                        .append("where JAS.UP_USER=AU_FULL.ID_SRV ")
                        .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE ")
                        .append("and CL_ORG_FULL.ID_SRV=t03.CL_ORG_ID ")
                        .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
                        .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
                        .append("and au_APP.ID_SRV =JAS.UP_USER_APP ")
                        .append("and au_APP.UP_SIGN=t03_APP.CL_ORG_CODE ")
                        .append("and CL_ORG_app.ID_SRV=t03_APP.CL_ORG_ID ")
                        .append("and AU_APP.UP_SIGN_USER=t02_APP.CL_USR_CODE(+) ")
                        .append("and CL_USR_APP.ID_SRV(+)=t02_APP.CL_USR_ID ")
                        .append("and substr(au_APP.UP_SIGN,1,5)||'000'=t04_APP.CL_dep_CODE(+) ")
                        .append("and CL_dep_app.ID_SRV(+)=t04_APP.CL_dep_ID ")
                      .append(") t1 ")                     
                              .append(st!=null ? " where "+st :" ")
                              .append(orderQuery!=null ? orderQuery+", t1_id desc " : " order by t1_id desc ")
                              .toString())
                              .setFirstResult(firstRow)
                              .setMaxResults(numberOfRows)
                              .getResultList());
               auditList = new ArrayList<BaseItem>();
               
               for(Object[] objectArray :loUserCert){
            	   try{
            		   log.info("invokeLocal:list:02");
            		   

                	     uiUserCert= new AppUserCertModifyItem(
            	    		objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
            				objectArray[1]!=null?df.format((Date)objectArray[1]) :"",
            				objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0,	
            				objectArray[3]!=null?objectArray[3].toString():"",
            				objectArray[4]!=null?objectArray[4].toString():"",
            				objectArray[5]!=null?objectArray[5].toString():"",
            				objectArray[6]!=null?objectArray[6].toString():"",
            				 
            				 "",
	            			 "",
	            			 "",
	            			 "",
	            			 "",
	            			 
	            			objectArray[7]!=null?objectArray[7].toString():"",
	            			objectArray[8]!=null?Long.valueOf(objectArray[8].toString()):null,
	            			objectArray[9]!=null?objectArray[9].toString():"",
	            			objectArray[10]!=null?objectArray[10].toString():"",
	            			objectArray[11]!=null?objectArray[11].toString():"",
	            			objectArray[12]!=null?objectArray[12].toString():"",
	            			objectArray[13]!=null?objectArray[13].toString():"",
	            			objectArray[14]!=null?objectArray[14].toString():"",
	            			objectArray[15]!=null?objectArray[15].toString():"",
	            			objectArray[16]!=null?objectArray[16].toString():"",
	            			 
	            			 //modeExec
                	    	 1);
                	     
            	     auditList.add(uiUserCert);
            	   }catch(Exception erUserCert){
            		   log.error("invokeLocal:for:error:"+erUserCert);
            	   }
               }  
               
             log.info("invokeLocal:list:02");
             
			 } else if("count".equals(type)){
				 log.info("AppUserCertList:count:01");
				 
                 
                 if(filterMapUserCert!=null){
    	    		 Set<Map.Entry<String, String>> setFilterAppUserCert = filterMapUserCert.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAppUserCert) {
    	            		  
    	              if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
     	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
    	              }else{
    	            	 st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	              }	 
     	    	 
    	            	  
    	              }
    	    	   }
				 
				
				 auditCount = ((java.math.BigDecimal)entityManager.createNativeQuery(
					       (new StringBuilder("select count(*) "))
			    		    .append("from(  ")
			                  .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
			                  .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
			                  .append("JAS.COMMENT_ t1_comment, ")
			                   .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
			                   .append("JAS.REJECT_REASON t1_reject_reason,  ")
							
			                   .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
			                    .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
			                      .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app ")
			                 .append("from JOURN_APP_USER_CERTADD_BSS_T jas, ")
			                    .append("AC_USERS_KNL_T au_FULL,   ")
			                     .append("ISP_BSS_T cl_org_full, ")
			                      .append("ISP_BSS_T cl_usr_full, ")
			                      .append("ISP_BSS_T cl_org_app, ")
			                      .append("ISP_BSS_T cl_usr_app, ")
			                      .append("ISP_BSS_T cl_dep_app, ")
			                     .append("AC_USERS_KNL_T au_APP, ")
			                   .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
			                     .append("from ISP_BSS_T cl_org ")
			                     .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
			                     .append("group by CL_ORG.SIGN_OBJECT) t03, ")
			                      .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
			                                 .append("from ISP_BSS_T cl_usr ")
			                                 .append("where CL_USR.FIO is not null ")
			                                 .append("group by CL_usr.SIGN_OBJECT) t02,   ")
			                      .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
			                     .append("from ISP_BSS_T cl_org ")
			                     .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
			                     .append("group by CL_ORG.SIGN_OBJECT) t03_app, ")
			                      .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
			                                 .append("from ISP_BSS_T cl_usr ")
			                                 .append("where CL_USR.FIO is not null ")
			                                 .append("group by CL_usr.SIGN_OBJECT) t02_app,  ")
			                    .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE  ")
			                                 .append("from ISP_BSS_T cl_dep ")
			                                 .append("where CL_dep.SIGN_OBJECT LIKE '%000' ")
			                                 .append("group by CL_DEP.SIGN_OBJECT) t04_app ")
			                     .append("where JAS.UP_USER=AU_FULL.ID_SRV ")
			                     .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE ")
			                     .append("and CL_ORG_FULL.ID_SRV=t03.CL_ORG_ID ")
			                     .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
			                     .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
			                     .append("and au_APP.ID_SRV =JAS.UP_USER_APP ")
			                     .append("and au_APP.UP_SIGN=t03_APP.CL_ORG_CODE ")
			                     .append("and CL_ORG_app.ID_SRV=t03_APP.CL_ORG_ID ")
			                     .append("and AU_APP.UP_SIGN_USER=t02_APP.CL_USR_CODE(+) ")
			                     .append("and CL_USR_APP.ID_SRV(+)=t02_APP.CL_USR_ID ")
			                     .append("and substr(au_APP.UP_SIGN,1,5)||'000'=t04_APP.CL_dep_CODE(+) ")
			                     .append("and CL_dep_app.ID_SRV(+)=t04_APP.CL_dep_ID ")
			                   .append(") t1 ")
			                   .append(st!=null ? " where "+st :" ")
			                   	.toString())
               .getSingleResult()).longValue();
                 
                 
               log.info("AppUserCert:invokeLocal:count:02:"+auditCount);
           	 } 
		}catch(Exception e){
			  log.error("AppUserCert:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("ќшибка!");
		}

	}
	
	 public AppUserCertModifyItem getUserItem(Long idUser){
		 
		 //!!! метод публичный, т.к. ещЄ используетс€ в AppMyUserCertModifyManager
		 
		 if(idUser==null){
			  return null;
		   }
		   
		   try{
	           SerializableList<Object[]> lo=null;
	           AppUserCertModifyItem ui = null;
	           DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	           
	           //!!!
	           //t1_usr_code_app - субъект за€вки(у кого измен€ютс€ аттрибуты)
	           //t1_SIGN_USER - один из аттрибутов на изменение
	           
	           lo=new ArrayList<Object[]>(entityManager.createNativeQuery(
	        		    (new StringBuilder("select t1.t1_id, t1.t1_created, "))
 		               .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
                        .append("t1_CERTIFICATE_USER, ")
 		               .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
 		               .append("t1_dep_name_app, ") 
 		               .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app, ")
 		               .append("t1_MODE_EXEC ")
 		                .append("from(  ")
 		               .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
 		               .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
 		               .append("JAS.COMMENT_ t1_comment, ")
 		                .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
 		                .append("JAS.REJECT_REASON t1_reject_reason,  ")
						    .append("JAS.CERT_VALUE t1_CERTIFICATE_USER, ")
 		                .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
 		                 .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
 		                   .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app, ")
 		                   .append("JAS.MODE_EXEC t1_MODE_EXEC ")
 		                .append("from JOURN_APP_USER_CERTADD_BSS_T jas, ")
 		                 .append("AC_USERS_KNL_T au_FULL,   ")
 		                  .append("ISP_BSS_T cl_org_full, ")
 		                   .append("ISP_BSS_T cl_usr_full, ")
 		                   .append("ISP_BSS_T cl_org_app, ")
 		                   .append("ISP_BSS_T cl_usr_app, ")
 		                   .append("ISP_BSS_T cl_dep_app, ")
 		                  .append("AC_USERS_KNL_T au_APP, ")
 		                .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
 		                  .append("from ISP_BSS_T cl_org ")
 		                  .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
 		                  .append("group by CL_ORG.SIGN_OBJECT) t03, ")
 		                   .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
 		                              .append("from ISP_BSS_T cl_usr ")
 		                              .append("where CL_USR.FIO is not null ")
 		                              .append("group by CL_usr.SIGN_OBJECT) t02,   ")
 		                   .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
 		                  .append("from ISP_BSS_T cl_org ")
 		                  .append("where  CL_ORG.SIGN_OBJECT LIKE '%00000' ")
 		                  .append("group by CL_ORG.SIGN_OBJECT) t03_app, ")
 		                   .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
 		                              .append("from ISP_BSS_T cl_usr ")
 		                              .append("where CL_USR.FIO is not null ")
 		                              .append("group by CL_usr.SIGN_OBJECT) t02_app,  ")
 		                 .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE  ")
 		                              .append("from ISP_BSS_T cl_dep ")
 		                              .append("where CL_dep.SIGN_OBJECT LIKE '%000' ")
 		                              .append("group by CL_DEP.SIGN_OBJECT) t04_app ")
 		                  .append("where JAS.UP_USER=AU_FULL.ID_SRV ")
 		                  .append("and AU_FULL.UP_SIGN=t03.CL_ORG_CODE ")
 		                  .append("and CL_ORG_FULL.ID_SRV=t03.CL_ORG_ID ")
 		                  .append("and AU_FULL.UP_SIGN_USER=t02.CL_USR_CODE(+) ")
 		                  .append("and CL_USR_FULL.ID_SRV(+)=t02.CL_USR_ID ")
 		                  .append("and au_APP.ID_SRV =JAS.UP_USER_APP ")
 		                  .append("and au_APP.UP_SIGN=t03_APP.CL_ORG_CODE ")
 		                  .append("and CL_ORG_app.ID_SRV=t03_APP.CL_ORG_ID ")
 		                  .append("and AU_APP.UP_SIGN_USER=t02_APP.CL_USR_CODE(+) ")
 		                  .append("and CL_USR_APP.ID_SRV(+)=t02_APP.CL_USR_ID ")
 		                  .append("and substr(au_APP.UP_SIGN,1,5)||'000'=t04_APP.CL_dep_CODE(+) ")
 		                  .append("and CL_dep_app.ID_SRV(+)=t04_APP.CL_dep_ID ")
 		                  .append("and JAS.ID_SRV=? ")
 		               .append(") t1 ")
 		               .toString())
	         .setParameter(1, idUser)
	         .getResultList());
	           
	           for(Object[] objectArray :lo){
	        	   try{
	        		   log.info("AppUserCertModifyManager:getUserItem:login:"+objectArray[1].toString());
	        		   
	        		  
	        		   String serial = null;
        	           String certDate = null;
        			   String userFio = null;
        			   String depName = null;
        			   String orgName = null;
	        		   
	        		   if(objectArray[7]!=null){
	        			   //cert_value
	        			  
	        			  java.sql.Blob sb = (java.sql.Blob) objectArray[7];
	        			   
	        			  log.info("AppUserCertModifyManager:getUserItem:02:"+sb.length());
		        		  
	        			  byte[] certByteX = Base64.decode(sb.getBytes(1L, (int)sb.length()));
	        			  
	        			  log.info("AppUserCertModifyManager:getUserItem:03:"+certByteX.length);
	        			  
	        			  CertificateFactory userCf = CertificateFactory.getInstance("X.509");
	        	          X509Certificate userCertX = (X509Certificate)
	        	        		   userCf.generateCertificate(new ByteArrayInputStream(certByteX));
	        	         
	        	        
	        	           serial = decToHex(userCertX.getSerialNumber());
	        	           
	        	           certDate = df.format(userCertX.getNotAfter());
	        	           
	        	           String subjectUser = userCertX.getSubjectDN().getName();
	        	    	   
	        	    	   log.info("AppUserCertModifyManager:getUserItem::"+subjectUser);
	        	    	   
	        	    	   LdapName ldapDN = new LdapName(subjectUser);
	        			   
	        			   for(Rdn rdnUser: ldapDN.getRdns()) {
	        				    
	        				    if("CN".equals(rdnUser.getType())){
	        				    	userFio = (String)rdnUser.getValue();
	        				    }else if("OU".equals(rdnUser.getType())){
	        				    	depName = (String)rdnUser.getValue();
	        				    }else if("O".equals(rdnUser.getType())){
	        				    	orgName = (String)rdnUser.getValue();
	        				    }
	        				    
	        				}
	        		   }
	        		   
	        		   ui= new AppUserCertModifyItem(
	            	    		objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
	            				objectArray[1]!=null?df.format((Date)objectArray[1]) :"",
	            				objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0,	
	            				objectArray[3]!=null?objectArray[3].toString():"",
	            				objectArray[4]!=null?objectArray[4].toString():"",
	            				objectArray[5]!=null?objectArray[5].toString():"",
	            				objectArray[6]!=null?objectArray[6].toString():"",
	            				 
	            				 serial!=null?serial:"",
		            			 certDate!=null?certDate:"",
		            			 orgName!=null?orgName:"",
		            			 depName!=null?depName:"",
		            			 userFio!=null?userFio:"",
		            			 
		            			objectArray[8]!=null?objectArray[8].toString():"",
		            			objectArray[9]!=null?Long.valueOf(objectArray[9].toString()):null,
		            			objectArray[10]!=null?objectArray[10].toString():"",
		            			objectArray[11]!=null?objectArray[11].toString():"",
		            			objectArray[12]!=null?objectArray[12].toString():"",
		            			objectArray[13]!=null?objectArray[13].toString():"",
		            			objectArray[14]!=null?objectArray[14].toString():"",
		            			objectArray[15]!=null?objectArray[15].toString():"",
		            			objectArray[16]!=null?objectArray[16].toString():"",
		            			objectArray[17]!=null?objectArray[17].toString():"",
		            			objectArray[18]!=null?Integer.parseInt(objectArray[18].toString()):1);
	        		   
	        		   
	        	     return ui;
	        	   }catch(Exception e1){
	        		   log.error("AppUserCertModifyManager:getUserItem:for:error:"+e1);
	          	   }
	           }  
		   }catch(Exception e){
			   log.error("AppUserCertModifyManager:getUserItem:error:"+e);
			 
		   }
		   return null;
	 }
	 
	 
	 public void createArm(){
		 
		   log.info("AppUserCertModifyManager:createArm:01");
		  
		   String sessionIdAppUserCertModify = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserCertModifyManager:createArm:02:"+sessionIdAppUserCertModify);
	     
	       Long idApp=null;
	       Long idUser=null;
	       int modeExec=0;
	       //0-удаление
	       //1-добавление
	       
		   try{
			  
			   idApp =  Long.valueOf(sessionIdAppUserCertModify); 
			   
			   Object[] app=(Object[]) entityManager.createNativeQuery(
		    			  (new StringBuilder("select JAS.UP_USER_APP, "))
		    			    .append("JAS.CERT_VALUE, jas.MODE_EXEC ")
                          .append("from JOURN_APP_USER_CERTADD_BSS_T jas ")
                          .append("where JAS.ID_SRV=? ")
		    			  .toString())
			    			.setParameter(1, idApp)
			    			.getSingleResult();  
				 
			   idUser=Long.valueOf(app[0].toString());
			 
			   modeExec = Integer.parseInt(app[2].toString());
			   
			   DateFormat df = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

	           String serial = null;
	           String userFio = null;
			   String depName = null;
			   String orgName = null;
    		   
    		   if(app[1]!=null){
    			   //cert_value
    			  
    			  java.sql.Blob sb = (java.sql.Blob) app[1];
    			   
    			  log.info("AppUserCertModifyManager:createArm:02:"+modeExec);
        		  
    			  byte[] certByteX = Base64.decode(sb.getBytes(1L, (int)sb.length()));
    			  
    			  log.info("AppUserCertModifyManager:createArm:03");
    			  
    			  CertificateFactory userCf = CertificateFactory.getInstance("X.509");
    	          X509Certificate userCertX = (X509Certificate)
    	        		   userCf.generateCertificate(new ByteArrayInputStream(certByteX));
    	        
    	           serial = decToHex(userCertX.getSerialNumber());
    	           
    	        
    	           
    	           String subject = userCertX.getSubjectDN().getName();
    	    	   
    	    	   log.info("AppUserCertModifyManager:createArm:03:"+subject);
    	    	   
    			   LdapName ldapDN = new LdapName(subject);
    			   
    			   for(Rdn rdn: ldapDN.getRdns()) {
    				    
    				    if("CN".equals(rdn.getType())){
    				    	userFio = (String)rdn.getValue();
    				    }else if("OU".equals(rdn.getType())){
    				    	depName = (String)rdn.getValue();
    				    }else if("O".equals(rdn.getType())){
    				    	orgName = (String)rdn.getValue();
    				    }
    				    
    				}
    			   
    			   if(modeExec==1){
    			   //добавление
    				   
    				    // вообще мы провер€ем certNumE/xistCrt
    				    // раньше - при forV/iewCrt()
    				    // и не выводим кнопку сохранить на форме
    				    // поэтому сюда (в crea/teArm()) не должны попасть
    				    if(certNumExistCrt(serial)){
    		 	        	log.info("AppUserCertModifyManager:createArm:01_1:return;");
    		 	            return ;
    		            }
    				   
    				   
	    			   AcUsersCertBssT userCert = new AcUsersCertBssT();
	    	    	   
	    	    	   userCert.setCertNum(serial);
	    	    	   userCert.setCertDate(df.format(userCertX.getNotAfter()));
	    	    	   
	    	    	   //!!!
	    	    	   //сохран€ем именно не userCertX.getEncoded(),
	    	    	   //а x509Cert/.getBytes
	    	    	   userCert.setCertValue(sb.getBytes(1L, (int)sb.length()));
	    	    	   
	    	    	   userCert.setUserFio(userFio);
				     
	    	    	   userCert.setDepName(depName);
				  
	    	    	   userCert.setOrgName(orgName);
					    
			           userCert.setUpUserRaw(idUser);
	   	   
	   	               userCert.setCreator(getCurrentUser().getBaseId());
	   	               userCert.setCreated(new Date());
	   	   
	   	               entityManager.persist(userCert);
	     
	                   entityManager.flush();
    	    	   
    			   }else{
    				   //удаление
    				   
    				   entityManager.createNativeQuery(
							    "delete from AC_USERS_CERT_BSS_T auc " 
							    + "where AUC.UP_USER = ? " 
							    + "and upper(AUC.CERT_NUM) = upper(?) ")
				                .setParameter(1, idUser)
				                .setParameter(2, serial)
		                        .executeUpdate();
    				   
    			   }
                 
    		       entityManager.createNativeQuery(
    	 	     		   "update JOURN_APP_USER_CERTADD_BSS_T t1 " 
    	 	     		   + "set t1.STATUS=1, t1.UP_USER_EXEC=? " 
    	 	     		   + "where t1.ID_SRV=? ")
    	 	     		 .setParameter(1, getCurrentUser().getBaseId())
    	 	     		 .setParameter(2, Long.valueOf(sessionIdAppUserCertModify))
    	         	 	 .executeUpdate();
                   
    		   }
			  
		     AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionIdAppUserCertModify));
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		     audit(ResourcesMap.APP_USER, ActionsMap.EXECUTE); 
		     
		   }catch(Exception e){
			   log.error("AppUserCertModifyManager:createArm:error:"+e);
		   }
	 }
	 
	 private boolean certNumExistCrt(String certNum) throws Exception {
		   
		 log.info("ApplicationManager:certNumExistCrt:certNum="+certNum);
		
		 //default exist!!!
		 boolean result = true;
		 
			if(certNum!=null&&!"".equals(certNum.trim())){
			  try{
				  certNum = certNum.replaceAll(" ", "").toUpperCase();
				  
				  entityManager.createNativeQuery(
				      "select 1 from dual "
				      + "where exists( select 1 from  AC_USERS_KNL_T au where upper(AU.CERTIFICATE) = upper(:certNum)) "
				      + "or  exists( select 1 from  AC_USERS_CERT_BSS_T  user_cert  where upper(USER_CERT.CERT_NUM) = upper(:certNum) ) ") 
				  .setParameter("certNum", certNum)   
				  .getSingleResult();
				  
				  log.info("ApplicationManager:certNumExistCrt:addCertNumExist!");		     
			    }catch (NoResultException ex){
			    	log.error("ApplicationManager:certNumExistCrt:NoResultException");
			    	
			    	result=false;
			    	
	          }catch(Exception e){
	        	  log.error("ApplicationManager:certNumExistCrt:Error:"+e);
		          
	         }
			}
			return result;
	  }
	 
	 public void reject(){
		   log.info("AppUserCertModifyManager:reject:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserCertModifyManager:reject:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_CERTADD_BSS_T t1 " 
	 	     		   + "set t1.STATUS=2,  t1.REJECT_REASON=?, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.rejectReason)
	 	     		 .setParameter(2, getCurrentUser().getBaseId())
	 	     		 .setParameter(3, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
             AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		     audit(ResourcesMap.APP_USER, ActionsMap.CREATE); 
		     
		   }catch(Exception e){
			   log.error("AppUserCertModifyManager:reject:error:"+e);
		   }
	 }
	 
	 public void comment(){
		   log.info("AppUserCertModifyManager:comment:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserCertModifyManager:comment:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_CERTADD_BSS_T t1 " 
	 	     		   + "set t1.COMMENT_=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.commentText)
	 	     		 .setParameter(2, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
           AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		   Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserCertModifyManager:reject:error:"+e);
		   }
	 }
	 
	 //вынужденное переопределение из BaseManager
	 //мы в списке не храним данные по сертификату и надо их брать из базы
	 //а BaseManager/.forView(/) берЄт бин из списка
	 //в принцепе потом можно парсить сертификат сразу при сохранении за€вки
	 //и сохран€ть его аттрибуты в базе
	 @Override
	 public void forView() {
		   String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
		  log.info("AppUserCertModifyManager:forView:sessionId:"+sessionId);
		   if(sessionId!=null ){
			   
			  AppUserCertModifyItem au = getUserItem(Long.valueOf(sessionId)); 
			   
			 /* 
			  //как вариант
			  //дл€ него нужен бин JournAppUserCertaddBssT
        	 BaseItem /au = super/.searchBean(sessionId);
        	 
        	*/
			 
        	 
        	 
		     Contexts.getEventContext().set("contextBeanView", au);
		  }
	   }
	 
	 public void forViewCrt() {
		   try{
			 String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserCertModifyManager:forViewCrt:01:"+sessionId);
		     
		     AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionId));
	    		
	    	 Contexts.getEventContext().set("contextBeanView", ui);
		     
	    	 if(certNumExistCrt(ui.getCertNum())){
	    		 Contexts.getEventContext().set("app_cert_num_exist", 1);
	    	 }
	    	
	    	 
	    		    	 
		   }catch(Exception e){
			 log.error("AppUserCertModifyManager:forViewCrt:Error:"+e);
		   }
	   } 
	 
	 @Override
	 public void forViewUpdDel() {
		 try{
		     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserCertModifyManager:forViewUpdDel:sessionId:"+sessionId);
		     if(sessionId!=null){
		    	
		     	 
		    	 AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionId));
		        	 
		   	 Contexts.getEventContext().set("appUserCertModifyBean", ui);
		     }
		   }catch(Exception e){
			   log.error("AppUserCertModifyManager:forViewUpdDel:Error:"+e);
		   }
	 }
	 
	 public String getRejectReason(){
		 return this.rejectReason;
	 }
	 public void setRejectReason(String rejectReason){
		 this.rejectReason=rejectReason;
	 }
	 
	 public void forViewComment() {
		   
		   try{
			     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
					        .getRequestParameterMap()
					        .get("sessionId");
			     log.info("AppUserCertModifyManager:forViewComment:sessionId:"+sessionId);
			     if(sessionId!=null){
			    	
			     	 
			    	 AppUserCertModifyItem ui = getUserItem(Long.valueOf(sessionId));
			    	 
			    	 this.commentText=ui.getComment();

	     }
			}catch(Exception eUser){
				   log.error("AppUserCertModifyManager:forViewComment:Error:"+eUser);
			}
	   } 
	 
	
	 
	 public String getCommentText(){
		 return this.commentText;
	 }
	 public void setCommentText(String commentText){
		 this.commentText=commentText;
	 }
	 
	 @Override
	 public SerializableList <BaseTableItem> getAuditItemsListSelect() {
		   log.info("getAuditItemsListSelect:01");
		   AppUserCertModifyContext ac= new AppUserCertModifyContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			   
			   auditItemsListSelect.add(ac.getAuditItemsMap().get("idApp"));
			   auditItemsListSelect.add(ac.getAuditItemsMap().get("created"));
			   auditItemsListSelect.add(ac.getAuditItemsMap().get("orgName"));
			  
			   auditItemsListSelect.add(ac.getAuditItemsMap().get("statusValue"));
		   }
	       return this.auditItemsListSelect;
  }
  

  @Override
  public SerializableList <BaseTableItem> getAuditItemsListContext() {
	   log.info("AppUserCertModifyManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   AppUserCertModifyContext ac= new AppUserCertModifyContext();
		  
		   
		   
		   auditItemsListContext=new ArrayList<BaseTableItem>(ac.getAuditItemsCollection());
		   
	   }
	   return this.auditItemsListContext;
  }
  
  @Override
  public SerializableList<HeaderTableItem> getHeaderItemsListContext() {
	  
	  if(headerItemsListContext==null){
		   AppUserCertModifyContext ac= new AppUserCertModifyContext();
			   headerItemsListContext=new ArrayList<HeaderTableItem>(ac.getHeaderItemsList());
		   
		
		   
	   }
	  
	   return this.headerItemsListContext;
  }
  
  
  public SerializableList<HeaderTableItem> getHeaderItemsListContext(String ids) {	  
	 	AppUserCertModifyContext ac= new AppUserCertModifyContext();		
	 	if(ids!=null) {
	 		headerItemsListContext=new ArrayList<HeaderTableItem>();
	 	     List<String> idsList =  Arrays.asList(ids.split(","));	 	   
	    	for(HeaderTableItem hti :ac.getHeaderItemsList()){
			  if(idsList.contains(hti.getItemField())){
				  headerItemsListContext.add(hti);
			  }			  
		   }

	 	}
	   return this.headerItemsListContext;
 }
  
  public SerializableList<HeaderTableItem> getHeaderItemsListContextCREATE(String ids) {
	  
	 	AppUserCertModifyContext acApUserCert= new AppUserCertModifyContext();
		
	 	if(ids!=null) {
	 	
	 		headerItemsListContextCREATE=new ArrayList<HeaderTableItem>();

	 	     List<String> idsList =  Arrays.asList(ids.split(","));
	 	   
	    	for(HeaderTableItem hti :acApUserCert.getHeaderItemsList()){
			
			  if(idsList.contains(hti.getItemField())){
				  headerItemsListContextCREATE.add(hti);
			  }
			  
		   }

	 	}
	   return new ArrayList<HeaderTableItem>(this.headerItemsListContextCREATE);
}
  private String decToHex(BigInteger bi) {
		
		String result = null;
		
		try
		{
		 result = bi.toString(16);
		 
		}
		catch (NumberFormatException eApUserCert)
		{
			log.error("Error! tried to parse an invalid number format");
		}
		 return result;
		}
}
