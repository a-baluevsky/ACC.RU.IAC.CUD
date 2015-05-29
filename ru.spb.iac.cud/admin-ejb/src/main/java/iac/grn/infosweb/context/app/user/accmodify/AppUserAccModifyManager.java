package iac.grn.infosweb.context.app.user.accmodify;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javaw.util.ArrayList;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaw.util.SerializableMap;
import javaw.util.SerializableList;

import javax.faces.context.FacesContext;
import javax.persistence.NoResultException;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;

import iac.cud.infosweb.dataitems.AppUserAccModifyItem;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcUser;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.table.BaseManager;
import iac.grn.serviceitems.BaseTableItem;
import iac.grn.serviceitems.HeaderTableItem;

@Name("appUserAccModifyManager")
 public class AppUserAccModifyManager extends BaseManager {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1542663643589360531L;
	private String rejectReason;
	private String commentText;
	
	private /*Serializable*/ List<HeaderTableItem> headerItemsListContextCREATE;
	
	@Override
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		
		 log.info("hostsManager:invokeLocal");
		 try{
			 String orderQueryAppUserAcc=null;
			 log.info("hostsManager:invokeLocal");
			 
			 AppUserAccModifyStateHolder appUserAccModifyStateHolder = (AppUserAccModifyStateHolder)
					  Component.getInstance("appUserAccModifyStateHolder",ScopeType.SESSION);
			 SerializableMap<String, String> filterMap = appUserAccModifyStateHolder.getColumnFilterValues();
			 String st=null;
			  
			 if("list".equals(type)){
				 log.info("invokeLocal:list:01");
				 
				 Set<Map.Entry<String, String>> set = appUserAccModifyStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		       log.info("me.getKey+:"+me.getKey());
      		       log.info("me.getValue:"+me.getValue());
      		       
      		       if(orderQueryAppUserAcc==null){
      		    	 orderQueryAppUserAcc="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQueryAppUserAcc=orderQueryAppUserAcc+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("invokeLocal:list:orderQueryAppUserAcc:"+orderQueryAppUserAcc);
                 
                 if(filterMap!=null){
    	    		 Set<Map.Entry<String, String>> setFilterAppUserAcc = filterMap.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAppUserAcc) {
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
                 log.info("AppUserAcc:invokeLocal:list:filterQuery:"+st);

             
               SerializableList<Object[]> lo=null;
               AppUserAccModifyItem ui = null;
               DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
               

             lo=new ArrayList<Object[]>(entityManager.createNativeQuery(
                     (new StringBuilder("select t1.t1_id, t1.t1_created, "))
                     .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
                     .append("t1_LOGIN_USER, ") 
                     .append("t1_PASS_USER, ") 
                     .append("t1_CERTIFICATE_USER, ")
                     .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
                     .append("t1_dep_name_app, ") 
                     .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app ")
                      .append("from(  ")
                     .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
                     .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
                     .append("JAS.COMMENT_ t1_comment, ")
                      .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
                      .append("JAS.REJECT_REASON t1_reject_reason,  ")
      			    .append("JAS.LOGIN_USER t1_LOGIN_USER, ")
      			    .append("JAS.PASS_USER t1_PASS_USER, ")
      			    .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
                      .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
                       .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ") 
                         .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app ")
                    .append("from JOURN_APP_USER_ACCMODIFY_BSS_T jas, ")
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
                      .append(orderQueryAppUserAcc!=null ? orderQueryAppUserAcc+", t1_id desc " : " order by t1_id desc ")
                      .toString())
                              .setFirstResult(firstRow)
                              .setMaxResults(numberOfRows)
                              .getResultList());
               auditList = new ArrayList<BaseItem>();
               
               for(Object[] objectArray :lo){
            	   try{
            		   log.info("AppUserAcc:invokeLocal:list:02");
            		   

                	     ui= new AppUserAccModifyItem(
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
	            			objectArray[11]!=null?Long.valueOf(objectArray[11].toString()):null,
	            			objectArray[12]!=null?objectArray[12].toString():"",
	            			objectArray[13]!=null?objectArray[13].toString():"",
	            			objectArray[14]!=null?objectArray[14].toString():"",
	            			objectArray[15]!=null?objectArray[15].toString():"",
	            			objectArray[16]!=null?objectArray[16].toString():"",
	            			objectArray[17]!=null?objectArray[17].toString():"",
	            			objectArray[18]!=null?objectArray[18].toString():"",
	            			objectArray[19]!=null?objectArray[19].toString():"");
                	     
            	     auditList.add(ui);
            	   }catch(Exception e1){
            		   log.error("invokeLocal:for:error:"+e1);
            	   }
               }  
               
             log.info("AppUserAcc:invokeLocal:list:02");
             
			 } else if("count".equals(type)){
				 log.info("AppUserAccMod:count:01");
				 
                 
                 if(filterMap!=null){
    	    		 Set<SerializableMap.Entry<String, String>> setFilterAppUserAcc = filterMap.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAppUserAcc) {
    	            	
    	            	  
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
							    .append("JAS.LOGIN_USER t1_LOGIN_USER, ")
							    .append("JAS.PASS_USER t1_PASS_USER, ")
							    .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
			                   .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
			                    .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
			                      .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app ")
			                 .append("from JOURN_APP_USER_ACCMODIFY_BSS_T jas, ")
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
                 
                 
               log.info("AppUserAcc:invokeLocal:count:02:"+auditCount);
           	 } else if("bean".equals(type)){
				 
			 }
		}catch(Exception e){
			  log.error("AppUserAcc:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("ќшибка!");
		}

	}
	
	 private AppUserAccModifyItem getUserItem(Long idUser){
		 if(idUser==null){
			  return null;
		   }
		   
		   try{
	           SerializableList<Object[]> lo=null;
	           AppUserAccModifyItem ui = null;
	           DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	           
	           //!!!
	           //t1_usr_code_app - субъект за€вки(у кого измен€ютс€ аттрибуты)
	           //t1_SIGN_USER - один из аттрибутов на изменение
	           
	           lo=new ArrayList<Object[]>(entityManager.createNativeQuery(
	        		    (new StringBuilder("select t1.t1_id, t1.t1_created, "))
 		               .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
                        .append("t1_LOGIN_USER, ") 
                        .append("t1_PASS_USER, ") 
                        .append("t1_CERTIFICATE_USER, ")
 		               .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
 		               .append("t1_dep_name_app, ") 
 		               .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app ")
 		                .append("from(  ")
 		               .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
 		               .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
 		               .append("JAS.COMMENT_ t1_comment, ")
 		                .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
 		                .append("JAS.REJECT_REASON t1_reject_reason,  ")
						    .append("JAS.LOGIN_USER t1_LOGIN_USER, ")
						    .append("JAS.PASS_USER t1_PASS_USER, ")
						    .append("JAS.CERTIFICATE_USER t1_CERTIFICATE_USER, ")
 		                .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
 		                 .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
 		                   .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app ")
 		              .append("from JOURN_APP_USER_ACCMODIFY_BSS_T jas, ")
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
	        		   log.info("AppUserAccModifyManager:getUserItem:login:"+objectArray[1].toString());
	        		   
	        		   ui= new AppUserAccModifyItem(
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
		            			objectArray[11]!=null?Long.valueOf(objectArray[11].toString()):null,
		            			objectArray[12]!=null?objectArray[12].toString():"",
		            			objectArray[13]!=null?objectArray[13].toString():"",
		            			objectArray[14]!=null?objectArray[14].toString():"",
		            			objectArray[15]!=null?objectArray[15].toString():"",
		            			objectArray[16]!=null?objectArray[16].toString():"",
		            			objectArray[17]!=null?objectArray[17].toString():"",
		            			objectArray[18]!=null?objectArray[18].toString():"",
		            			objectArray[19]!=null?objectArray[19].toString():"");
	        	     return ui;
	        	   }catch(Exception e1){
	        		   log.error("AppUserAccModifyManager:getUserItem:for:error:"+e1);
	        	   }
	           }  
		   }catch(Exception e){
			   log.error("AppUserAccModifyManager:getUserItem:error:"+e);
		   }
		   return null;
	 }
	 
	 public void createArm(){
		 
		   log.info("AppUserAccModifyManager:createArm:01");
		  
		   String sessionIdAppUserAccModify = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserAccModifyManager:createArm:02:"+sessionIdAppUserAccModify);
	     
	       Long idApp=null;
	       Long idUser=null;
	       
		   try{
			   
			   idApp =  Long.valueOf(sessionIdAppUserAccModify); 
			   
			   Object[] app=(Object[]) entityManager.createNativeQuery(
		    			  (new StringBuilder("select JAS.UP_USER_APP, "))
		    			    .append("JAS.LOGIN_USER, ") 
                          .append("JAS.PASS_USER, ") 
                          .append("JAS.CERTIFICATE_USER ")
                          .append("from JOURN_APP_USER_ACCMODIFY_BSS_T jas ")
                          .append("where JAS.ID_SRV=? ")
		    			  .toString())
			    			.setParameter(1, idApp)
			    			.getSingleResult();  
				 
			   idUser=Long.valueOf(app[0].toString());
			 
			   // вообще мы провер€ем loginExist
			    // раньше - при forViewCrt()
			    // и не выводим кнопку сохранить на форме
			    // поэтому сюда (в createArm()) не должны попасть
			   if(loginExist(app[1].toString().trim())){
	 	        	log.info("AppUserAccModifyManager:createArm:01_1:return;");
	         	   return ;
	           }
			   
			   AcUser aam = entityManager.find(AcUser.class, idUser);
				 
			   if(app[1]!=null){	
			      aam.setLogin(app[1].toString().trim());
			   }
			   if(app[2]!=null){	
				   aam.setPassword(app[2].toString().trim());
			   }
			   if(app[3]!=null){	
				    aam.setCertificate(app[3].toString().trim());
			   }
			  
			   aam.setModificator(getCurrentUser().getBaseId());
			   aam.setModified(new Date());
				  
			   entityManager.flush();
		     
		       entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_ACCMODIFY_BSS_T t1 " 
	 	     		   + "set t1.STATUS=1, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, getCurrentUser().getBaseId())
	 	     		 .setParameter(2, Long.valueOf(sessionIdAppUserAccModify))
	         	 	 .executeUpdate();
		    
		     AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionIdAppUserAccModify));
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		     audit(ResourcesMap.APP_USER_ACC, ActionsMap.EXECUTE); 
		     
		   }catch(Exception e){
			   log.error("AppUserAccModifyManager:createArm:error:"+e);
		   }
	 }
	 
	 private boolean loginExist(String login) throws Exception {
			log.info("AppUserAccModifyManager:loginExist:login="+login);
			
			//default exist!!!
			boolean result = true;
			
			if(login!=null){
			  try{
				  entityManager.createQuery(
						     "select au from AcUser au " 
				 		     + "where au.login = :login")
				 		     .setParameter("login", login)
				 		     .getSingleResult();
				 
				  log.info("AppUserAccModifyManager:loginExist:addLoginExist!");		     
			    }catch (NoResultException ex){
	              log.error("AppUserAccModifyManager:loginExist:NoResultException");
	              
	              result=false;
	              
	           }catch(Exception e){
		           log.error("AppUserAccModifyManager:loginExist:Error:"+e);
		           throw e;
	         }
			}
			return result;
	   }
	 
	 public void reject(){
		   log.info("AppUserAccModifyManager:reject:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserAccModifyManager:reject:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_ACCMODIFY_BSS_T t1 " 
	 	     		   + "set t1.STATUS=2,  t1.REJECT_REASON=?, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.rejectReason)
	 	     		 .setParameter(2, getCurrentUser().getBaseId())
	 	     		 .setParameter(3, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
             AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserAccModifyManager:reject:error:"+e);
		   }
	 }
	 
	 public void comment(){
		   log.info("AppUserAccModifyManager:comment:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserAccModifyManager:comment:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_ACCMODIFY_BSS_T t1 " 
	 	     		   + "set t1.COMMENT_=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.commentText)
	 	     		 .setParameter(2, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
           AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		   Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserAccModifyManager:reject:error:"+e);
		   }
	 }
	 
	 public void forViewCrt() {
		   try{
			 String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserAccModifyManager:forViewCrt:01:"+sessionId);
		     
		     AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionId));
	    		
	    	 Contexts.getEventContext().set("contextBeanView", ui);
		     
	    	 if(loginExist(ui.getLogin())){
	    		 Contexts.getEventContext().set("app_cert_num_exist", 1);
	    	 }
	    		    	 
		   }catch(Exception e){
			 log.error("AppUserAccModifyManager:forViewCrt:Error:"+e);
		   }
	   } 
	 
	 @Override
	 public void forViewUpdDel() {
		 try{
		     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserAccModifyManager:forViewUpdDel:sessionId:"+sessionId);
		     if(sessionId!=null){
		    	
		     	 
		    	 AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionId));
		        	 
		   	 Contexts.getEventContext().set("appUserAccModifyBean", ui);
		     }
		   }catch(Exception e){
			   log.error("AppUserAccModifyManager:forViewUpdDel:Error:"+e);
		   }
	 }
	 
	 public void forViewComment() {
		   
		   try{
			     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
					        .getRequestParameterMap()
					        .get("sessionId");
			     log.info("AppUserAccModifyManager:forViewComment:sessionId:"+sessionId);
			     if(sessionId!=null){
			    	
			     	 
			    	 AppUserAccModifyItem ui = getUserItem(Long.valueOf(sessionId));
			    	 
			    	 this.commentText=ui.getComment();

	     }
			}catch(Exception e){
				   log.error("AppUserAccModifyManager:forViewComment:Error:"+e);
			}
	   } 
	 
	 public String getRejectReason(){
		 return this.rejectReason;
	 }
	 public void setRejectReason(String rejectReason){
		 this.rejectReason=rejectReason;
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
		   AppUserAccModifyContext ac= new AppUserAccModifyContext();
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
	   log.info("AppUserAccModifyManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   AppUserAccModifyContext ac= new AppUserAccModifyContext();
		  
		   
		   
		   auditItemsListContext=new ArrayList<BaseTableItem>(ac.getAuditItemsCollection());
		   
	   }
	   return this.auditItemsListContext;
  }
  
  @Override
  public SerializableList<HeaderTableItem> getHeaderItemsListContext() {
	  
	  if(headerItemsListContext==null){
		   AppUserAccModifyContext ac= new AppUserAccModifyContext();
		
		   headerItemsListContext=new ArrayList<HeaderTableItem>(ac.getHeaderItemsList());
	
		   
	   }
	  
	   return this.headerItemsListContext;
  }
  
  
  public SerializableList<HeaderTableItem> getHeaderItemsListContext(String ids) {
	 	AppUserAccModifyContext ac= new AppUserAccModifyContext();
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
	 	AppUserAccModifyContext ac= new AppUserAccModifyContext();		
	 	if(ids!=null) {
	 		headerItemsListContextCREATE=new ArrayList<HeaderTableItem>();	 				
	 	     List<String> idsList =  Arrays.asList(ids.split(","));
	    	for(HeaderTableItem hti :ac.getHeaderItemsList()){
			  if(idsList.contains(hti.getItemField())){
				  headerItemsListContextCREATE.add(hti);
			  }
		   }
	 	}
	   return new ArrayList<HeaderTableItem>(this.headerItemsListContextCREATE);
}
}
