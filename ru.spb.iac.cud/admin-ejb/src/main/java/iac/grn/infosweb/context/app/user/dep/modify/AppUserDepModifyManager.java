package iac.grn.infosweb.context.app.user.dep.modify;

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

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;



import iac.cud.infosweb.dataitems.AppUserDepModifyItem;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcUser;
import iac.grn.infosweb.session.table.BaseManager;
import iac.grn.serviceitems.BaseTableItem;
import iac.grn.serviceitems.HeaderTableItem;

@Name("appUserDepModifyManager")
 public class AppUserDepModifyManager extends BaseManager implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6933240124589419437L;
	private String rejectReason;
	private String commentText;
	
	private /*Serializable*/ List<HeaderTableItem> headerItemsListContextCREATE;
	
	@Override
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		
		 log.info("AppUserDepModManager:invokeLocal");
		 try{
			 String orderQuery=null;
			 log.info("AppUserDepModManager:invokeLocal");
			 
			 AppUserDepModifyStateHolder appUserDepModifyStateHolder = (AppUserDepModifyStateHolder)
					  Component.getInstance("appUserDepModifyStateHolder",ScopeType.SESSION);
			 SerializableMap<String, String> filterMap = appUserDepModifyStateHolder.getColumnFilterValues();
			 String st=null;
			  
			 if("list".equals(type)){
				 log.info("AppUserDepMod:invokeLocal:list:01");
				 
				 Set<SerializableMap.Entry<String, String>> set = appUserDepModifyStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		        
      		       if(orderQuery==null){
      		    	 orderQuery="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQuery=orderQuery+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("AppUserDepMod:invokeLocal:list:orderQuery:"+orderQuery);
                 
                 if(filterMap!=null){
    	    		 Set<SerializableMap.Entry<String, String>> setFilterAppUserDepMod = filterMap.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAppUserDepMod) {
    	              
    	   		     if("t1_crt_date".equals(me.getKey())){  
    	        	   
    	        	   //������ ������ �� ������  
    	        	     st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
    	    	   
    	   		     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
    	    	    	 
    	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
    	    	    	 
    	    	     }else{
    	        		//������ ������ �� ������
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	        	  }
    	              }
    	    	   }
                 log.info("AppUserDepMod:invokeLocal:list:filterQuery:"+st);

             
               SerializableList<Object[]> lo=null;
               AppUserDepModifyItem ui = null;
               DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
               

             lo=new ArrayList<Object[]>(entityManager.createNativeQuery(
                     (new StringBuilder("select t1.t1_id, t1.t1_created, "))
                     .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
                     .append("t1_NAME_DEPARTAMENT,  ")
                     .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
                     .append("t1_dep_name_app, ") 
                     .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app, ") 
                     .append("t1_org_code_app ")
                      .append("from(  ")
                     .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
                     .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
                     .append("JAS.COMMENT_ t1_comment, ")
                      .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
                      .append("JAS.REJECT_REASON t1_reject_reason,  ")
                       .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT,  ")
                      .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
                       .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ") 
                         .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
                         .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app, ") 
                         .append("AU_app.UP_SIGN t1_org_code_app ")
                    .append("from JOURN_APP_USERDEP_MODIFY_BSS_T jas, ")
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
                        .append("and CL_dep_app.ID_SRV=t04_APP.CL_dep_ID ")
                      .append(") t1 ")
                      .append(st!=null ? " where "+st :" ")
                      .append(orderQuery!=null ? orderQuery+", t1_id desc " : " order by t1_id desc ")                              
                              .toString())
                              .setFirstResult(firstRow)
                              .setMaxResults(numberOfRows)
                              .getResultList());
               auditList = new ArrayList<BaseItem>();
               
               for(Object[] objectArray :lo){
            	   try{
            		   log.info("invokeLocal:list:02");
            		   

                	     ui= new AppUserDepModifyItem(
            	    		objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
            				objectArray[1]!=null?df.format((Date)objectArray[1]) :"",
            				objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0,	
            				objectArray[3]!=null?objectArray[3].toString():"",
            				objectArray[4]!=null?objectArray[4].toString():"",
            				objectArray[5]!=null?objectArray[5].toString():"",
            				objectArray[6]!=null?objectArray[6].toString():"",
            				 
            				objectArray[7]!=null?objectArray[7].toString():"",
	            			 
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
	            			objectArray[18]!=null?objectArray[18].toString():"");
                	     
            	     auditList.add(ui);
            	   }catch(Exception e1){
            		   log.error("invokeLocal:for:error:"+e1);
            	   }
               }  
               
             log.info("invokeLocal:list:02");
             
			 } else if("count".equals(type)){
				 log.info("AppUserDepModList:count:01");
				 
                 
                 if(filterMap!=null){
    	    		 Set<SerializableMap.Entry<String, String>> setFilterAppUserDepMod = filterMap.entrySet();
    	              for (SerializableMap.Entry<String, String> me : setFilterAppUserDepMod) {
    	            
    	            
    	            	  
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
			                   .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT,  ")
			                   .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
			                    .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
			                      .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
			                      .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app, ") 
			                      .append("AU_app.UP_SIGN t1_org_code_app ")
			                 .append("from JOURN_APP_USERDEP_MODIFY_BSS_T jas, ")
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
			                     .append("and CL_dep_app.ID_SRV=t04_APP.CL_dep_ID ")
			                   .append(") t1 ")
			                   .append(st!=null ? " where "+st :" ")
			                   .toString())
               .getSingleResult()).longValue();
                 
                 
               log.info("AppUserDepMod:invokeLocal:count:02:"+auditCount);
           	 } else if("bean".equals(type)){
				 
			 }
		}catch(Exception e){
			  log.error("AppUserDepMod:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("������!");
		}

	}
	
	 private AppUserDepModifyItem getUserItem(Long idUser){
		 if(idUser==null){
			  return null;
		   }
		   
		   try{
	           SerializableList<Object[]> lo=null;
	           AppUserDepModifyItem ui = null;
	           DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	           
	           lo=new ArrayList<Object[]>(entityManager.createNativeQuery(
	        		    (new StringBuilder("select t1.t1_id, t1.t1_created, "))
 		               .append("t1.t1_status, t1_org_name,  t1_user_fio, t1_reject_reason, t1_comment, ")
 		               .append("t1_NAME_DEPARTAMENT,  ")
 		               .append("t1_org_name_app, t1_user_id_app,  t1_user_login_app, t1_user_fio_app, t1_user_pos_app, ")
 		               .append("t1_dep_name_app, ") 
 		               .append("t1_cert_app,  t1_usr_code_app, t1_user_tel_app,  t1_user_email_app, ") 
 		               .append("t1_org_code_app ")
 		                .append("from(  ")
 		               .append("select JAS.ID_SRV t1_id, JAS.CREATED t1_created,   ")
 		               .append("JAS.STATUS t1_status,  CL_ORG_FULL.FULL_ t1_org_name, ")
 		               .append("JAS.COMMENT_ t1_comment, ")
 		                .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_user_fio, ")
 		                .append("JAS.REJECT_REASON t1_reject_reason,  ")
 		                .append("JAS.NAME_DEPARTAMENT t1_NAME_DEPARTAMENT,  ")
 		                .append("AU_APP.ID_SRV  t1_user_id_app, AU_APP.LOGIN  t1_user_login_app, ")
 		                 .append("CL_ORG_app.FULL_ t1_org_name_app,  decode(AU_app.UP_SIGN_USER, null, AU_app.SURNAME||' '||AU_app.NAME_ ||' '|| AU_app.PATRONYMIC,  CL_USR_app.FIO ) t1_user_fio_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.POSITION, CL_USR_app.POSITION) t1_user_pos_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.DEPARTMENT, decode(substr(CL_DEP_app.sign_object,4,2), '00', null, CL_DEP_app.FULL_)) t1_dep_name_app, ")
 		                   .append("AU_app.CERTIFICATE t1_cert_app, AU_app.UP_SIGN_user t1_usr_code_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.PHONE, CL_USR_app.PHONE ) t1_user_tel_app, ")
 		                   .append("decode(AU_app.UP_SIGN_USER, null, AU_app.E_MAIL, CL_USR_app.EMAIL) t1_user_email_app, ")
 		                   .append("AU_app.UP_SIGN t1_org_code_app ")
 		              .append("from JOURN_APP_USERDEP_MODIFY_BSS_T jas, ")
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
 		                  .append("and CL_dep_app.ID_SRV=t04_APP.CL_dep_ID ")
 		                  .append("and JAS.ID_SRV=? ")
 		               .append(") t1 ")
 		    .toString())
	         .setParameter(1, idUser)
	         .getResultList());
	           
	           for(Object[] objectArray :lo){
	        	   try{
	        		   log.info("AppUserDepModifyManager:getUserItem:login:"+objectArray[1].toString());
	        		   
	        		   ui= new AppUserDepModifyItem(
	            	    		objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
	            				objectArray[1]!=null?df.format((Date)objectArray[1]) :"",
	            				objectArray[2]!=null?Integer.parseInt(objectArray[2].toString()):0,	
	            				objectArray[3]!=null?objectArray[3].toString():"",
	            				objectArray[4]!=null?objectArray[4].toString():"",
	            				objectArray[5]!=null?objectArray[5].toString():"",
	            				objectArray[6]!=null?objectArray[6].toString():"",
	            				 
	            				objectArray[7]!=null?objectArray[7].toString():"",
	            				 
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
		            			objectArray[18]!=null?objectArray[18].toString():"");
	        	     return ui;
	        	   }catch(Exception e1){
	        		   log.error("AppUserDepModifyManager:getUserItem:for:error:"+e1);
	        	   }
	           }  
		   }catch(Exception e){
			   log.error("AppUserDepModifyManager:getUserItem:error:"+e);
		   }
		   return null;
	 }
	 
	 
	 public void createArm(){
		 
		   log.info("AppUserDepModifyManager:createArm:01");
		  
		   String sessionIdAppUserDepModify = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserDepModifyManager:createArm:sessionId:"+sessionIdAppUserDepModify);
	     
	       Long idApp=null;
	       Long idUser=null;
	       
		   try{
			   
			   idApp =  Long.valueOf(sessionIdAppUserDepModify); 
			   
			   Object[] app=(Object[]) entityManager.createNativeQuery(
		    			  (new StringBuilder("select JAS.UP_USER_APP, "))
		    			     .append("JAS.NAME_DEPARTAMENT ")
                         .append("from JOURN_APP_USERDEP_MODIFY_BSS_T jas ")
                         .append("where  JAS.ID_SRV=? ")
		    			  .toString())
			    			.setParameter(1, idApp)
			    			.getSingleResult();  
				 
			   idUser=Long.valueOf(app[0].toString());
			 
			   AcUser aam = entityManager.find(AcUser.class, idUser);
				  
			   if(app[1]!=null){	
			      aam.setDepartment(app[1].toString().trim());
			   }

			  
			   aam.setModificator(getCurrentUser().getBaseId());
			   aam.setModified(new Date());
				  
			   entityManager.flush();
		     
		       entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USERDEP_MODIFY_BSS_T t1 " 
	 	     		   + "set t1.STATUS=1, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, getCurrentUser().getBaseId())
	 	     		 .setParameter(2, Long.valueOf(sessionIdAppUserDepModify))
	         	 	 .executeUpdate();
		    
		     AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionIdAppUserDepModify));
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserDepModifyManager:createArm:error:"+e);
		   }
	 }
	 
	 public void reject(){
		   log.info("AppUserDepModifyManager:reject:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserDepModifyManager:reject:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USERDEP_MODIFY_BSS_T t1 " 
	 	     		   + "set t1.STATUS=2,  t1.REJECT_REASON=?, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.rejectReason)
	 	     		 .setParameter(2, getCurrentUser().getBaseId())
	 	     		 .setParameter(3, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
             AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserDepModifyManager:reject:error:"+e);
		   }
	 }
	 
	 public void comment(){
		   log.info("AppUserDepModifyManager:comment:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserDepModifyManager:comment:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USERDEP_MODIFY_BSS_T t1 " 
	 	     		   + "set t1.COMMENT_=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.commentText)
	 	     		 .setParameter(2, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
           AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		   Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserDepModifyManager:reject:error:"+e);
		   }
	 }
	 
	 public void forViewCrt() {
		   try{
			 String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserDepModifyManager:forViewCrt:sessionId:"+sessionId);
		     
		     AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionId));
	    		
	    	 Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			 log.error("AppUserDepModifyManager:forViewCrt:Error:"+e);
		   }
	   } 
	 
	 @Override
	 public void forViewUpdDel() {
		 try{
		     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserDepModifyManager:forViewUpdDel:sessionId:"+sessionId);
		     if(sessionId!=null){
		    	
		     	 
		    	 AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionId));
		        	 
		   	 Contexts.getEventContext().set("appUserDepModifyBean", ui);
		     }
		   }catch(Exception e){
			   log.error("AppUserDepModifyManager:forViewUpdDel:Error:"+e);
		   }
	 }
	 
	 public void forViewComment() {
		   
		   try{
			     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
					        .getRequestParameterMap()
					        .get("sessionId");
			     log.info("AppUserDepModifyManager:forViewComment:sessionId:"+sessionId);
			     if(sessionId!=null){
			    	
			     	 
			    	 AppUserDepModifyItem ui = getUserItem(Long.valueOf(sessionId));
			    	 
			    	 this.commentText=ui.getComment();

	     }
			}catch(Exception e){
				   log.error("AppUserDepModifyManager:forViewComment:Error:"+e);
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
		   AppUserDepModifyContext ac= new AppUserDepModifyContext();
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
	   log.info("AppUserDepModifyManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   AppUserDepModifyContext ac= new AppUserDepModifyContext();
		  
		   
		   
		   auditItemsListContext=new ArrayList<BaseTableItem>(ac.getAuditItemsCollection());
		   
	   }
	   return this.auditItemsListContext;
  }
  
  @Override
  public SerializableList<HeaderTableItem> getHeaderItemsListContext() {
	  
	  if(headerItemsListContext==null){
		   AppUserDepModifyContext ac= new AppUserDepModifyContext();
		   headerItemsListContext=new ArrayList<HeaderTableItem>(ac.getHeaderItemsList());
	   }
	  
	   return this.headerItemsListContext;
  }
  
  
  public SerializableList<HeaderTableItem> getHeaderItemsListContext(String ids) {
	 	AppUserDepModifyContext ac= new AppUserDepModifyContext();
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
	 	AppUserDepModifyContext ac= new AppUserDepModifyContext();
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
