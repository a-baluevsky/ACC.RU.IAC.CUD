package iac.grn.infosweb.context.app.user;

import iac.cud.data.usr.JPA_AppUserManager;
import iac.cud.infosweb.dataitems.AppUserItem;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcRole;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.IspBssT;
import iac.cud.infosweb.util.BaseUtil;
import iac.grn.infosweb.context.mc.clorg.ClOrgManager;
import iac.grn.infosweb.context.mc.clusr.ClUsrManager;
import iac.grn.infosweb.context.mc.usr.UsrManager;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.table.BaseManager;
import iac.grn.serviceitems.BaseTableItem;
import iac.grn.serviceitems.HeaderTableItem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javaw.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaw.util.SerializableList;
import javaw.util.SerializableMap;
import javaw.util.SerializableSet;

import javax.faces.context.FacesContext;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;

@Name("appUserManager")
 public class AppUserManager extends BaseManager implements java.io.Serializable {

	
	private String rejectReason;
	private String commentText;
	
	private /*Serializable*/ List<AcApplication> listUsrArmForView = null;
	
	@Override
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		
		 log.info("hostsManager:invokeLocal");
		 try{
			 
			 log.info("hostsManager:invokeLocal");
			 
			 AppUserStateHolder appUserStateHolder = (AppUserStateHolder)
					  Component.getInstance("appUserStateHolder",ScopeType.SESSION);
			 Map<String, String> filterMap = appUserStateHolder.getColumnFilterValues();
			 
			 if("list".equals(type)){
				 log.info("invokeLocal:list:01");
             
				 StringBuilder errMsg = new StringBuilder();
				 auditList = AppUserItem.FromRows(JPA_AppUserManager.getAuditList(entityManager, filterMap, 
            		   appUserStateHolder.getSortOrders().entrySet(), firstRow, numberOfRows), errMsg);
				 if(errMsg.length()>0) log.error(errMsg.toString());
				 log.info("AppUser:invokeLocal:list:02");
             
			 } else if("count".equals(type)){
				 log.info("AppUser:AppUserList:count:01");				 
				 auditCount = JPA_AppUserManager.getAuditCount(entityManager, filterMap);
                 log.info("AppUser:invokeLocal:count:02:"+auditCount);
           	 } else if("bean".equals(type)){
				 
			 }
		}catch(Exception e){
			  log.error("AppUser:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("Ошибка!");
		}

	}
	
	 private AppUserItem getUserItem(Long idUser){
		 if(idUser!=null) {
			   try{
		           List<Object[]> lo=JPA_AppUserManager.getUserItem(entityManager, idUser);
		           return AppUserItem.FirstFromRows(lo, new AppUserItem.INotify() {
						@Override public void gotRow(Object[] row)  { log.info("AppUserManager:getUserItem:login:"+row[1].toString()); }
						@Override public void error(Exception x) 	{ log.error("AppUserManager:getUserItem:for:error:"+x); }
		           }); 
			   } catch(Exception e){
				   log.error("AppUserManager:getUserItem:error:"+e);
			   }
		 }
		 return null;
	 }
	 
	 
	 public void createArm(){
		 
		   log.info("AppUserManager:createArm:01");
		  
		   String sessionIdAppUser = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserManager:createArm:sessionId:"+sessionIdAppUser);
	     
		   try{
			   
			 UsrManager usrManager = (UsrManager)
			          Component.getInstance("usrManager", ScopeType.EVENT);
		   
		     usrManager.addUsr();
		   
		     
		     Long idUserCrt = usrManager.getIdUserCrt();
		     
		     entityManager.createNativeQuery(
				    	(new StringBuilder("insert into AC_USERS_LINK_KNL_T (UP_ROLES, UP_USERS, CREATOR,  CREATED) "))
				    	  .append("select app_roles.UP_ROLE, :idUser, :creator, sysdate ") 
				    	  .append("from ROLES_APP_USER_BSS_T app_roles ") 
				    	  .append("where  APP_ROLES.UP_APP_USER= :idApp ") 
				    	  .append("group by app_roles.UP_ROLE")
				    	.toString())
		    	  .setParameter("idUser", idUserCrt)
	     		  .setParameter("creator", getCurrentUser().getBaseId())
	     		  .setParameter("idApp", Long.valueOf(sessionIdAppUser))
        	 	  .executeUpdate();	 
		    		 
		    		 
		    		 
		     AcUser usrBeanCrt = (AcUser)
					  Component.getInstance("usrBeanCrt",ScopeType.CONVERSATION);  
		     
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_BSS_T t1 " 
	 	     		   + "set t1.UP_USER_APP=?, t1.STATUS=1, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, usrBeanCrt.getBaseId())
	 	     		 .setParameter(2, getCurrentUser().getBaseId())
	 	     		 .setParameter(3, Long.valueOf(sessionIdAppUser))
	         	 	 .executeUpdate();
		    
		     AppUserItem ui = getUserItem(Long.valueOf(sessionIdAppUser));
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		     audit(ResourcesMap.APP_USER, ActionsMap.EXECUTE); 
		     
		   }catch(Exception e){
			   log.error("AppUserManager:createArm:error:"+e);
		   }
	 }
	 
	 public void reject(){
		   log.info("AppUserManager:reject:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserManager:reject:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_BSS_T t1 " 
	 	     		   + "set t1.STATUS=2,  t1.REJECT_REASON=?, t1.UP_USER_EXEC=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.rejectReason)
	 	     		 .setParameter(2, getCurrentUser().getBaseId())
	 	     		 .setParameter(3, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
             AppUserItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		     Contexts.getEventContext().set("contextBeanView", ui);
		     
		     audit(ResourcesMap.APP_USER, ActionsMap.REJECT); 
		     
		   }catch(Exception e){
			   log.error("AppUserManager:reject:error:"+e);
		   }
	 }
	 
	 public void comment(){
		   log.info("AppUserManager:comment:01");
		  
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	       log.info("AppUserManager:comment:sessionId:"+sessionId);
	     
		   try{
			   
		     entityManager.createNativeQuery(
	 	     		   "update JOURN_APP_USER_BSS_T t1 " 
	 	     		   + "set t1.COMMENT_=? " 
	 	     		   + "where t1.ID_SRV=? ")
	 	     		 .setParameter(1, this.commentText)
	 	     		 .setParameter(2, Long.valueOf(sessionId))
	 	     	 	 .executeUpdate();
		     
           AppUserItem ui = getUserItem(Long.valueOf(sessionId)); 
		     
		   Contexts.getEventContext().set("contextBeanView", ui);
		     
		   }catch(Exception e){
			   log.error("AppUserManager:reject:error:"+e);
		   }
	 }
	 
	 public void forViewCrt() {
		 
		  IspBssT clUsrBean = null;
		  IspBssT clOrgBean = null; 		 
		  try{
			 String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserManager:forViewCrt:sessionId:"+sessionId);
		     
		     AppUserItem ui = getUserItem(Long.valueOf(sessionId));
	    
		     ClUsrManager clUsrManager = (ClUsrManager)
                    Component.getInstance("clUsrManager", ScopeType.EVENT);
	    
		     ClOrgManager clOrgManager = (ClOrgManager)
                    Component.getInstance("clOrgManager", ScopeType.EVENT);
	    
		    
		     log.info("AppUserManager:forViewCrt:01:"+(ui==null));
		     
		    
		     
		    if(ui.getIogvCodeUser()!=null&&ui.getIogvCodeUser().length()==8){ //в заявке корректный код иогв пользователя
		    	
		      log.info("AppUserManager:forViewCrt:02");
		    	 
		      //берём из него код организации
		      clOrgManager.forViewAutocomplete(ui.getIogvCodeUser().substring(0, 3)+"00000");
		    	 
		      clOrgBean = (IspBssT)
		                    Component.getInstance("clOrgBean", ScopeType.EVENT);
				    
			  if(clOrgBean.getBaseId()!=null){ //нашли действующую организацию
					
				    ui.setNameOrg(clOrgBean.getFull());
				    
				    log.info("AppUserManager:forViewCrt:02:"+clOrgBean.getFull());
				    
				    //проводим поиск действующего пользователя
				    clUsrManager.forViewAutocomplete(ui.getIogvCodeUser());
				      
				    clUsrBean = (IspBssT)
			                    Component.getInstance("clUsrBean", ScopeType.EVENT);
					    
					   
					    
				    if(clUsrBean.getBaseId()!=null){ //нашли действующего пользователя
						  
						    log.info("AppUserManager:forViewCrt:03");
						  
						    ui.setFioIogvUser(clUsrBean.getFio());
				    }
			  }else{
				  //если из кода пользователя нет дйствующей организации,
				  //то поиск действующего пользователя не проводим
			  }

		      
		    }
		    //в итоге имеем: 
		    //1) организация + пользователь :
		    //   clOrgBean!=null && clOrgBean.getBaseId()!=null  && clUsrBean!= null && clUsrBean.getBaseId()!=null
		    //2) организация  :
		    //   clOrgBean!=null && clOrgBean.getBaseId()!=null && clUsrBean!= null && clUsrBean.getBaseId()==null
		    //3) ничего
		    //   clOrgBean!=null && clOrgBean.getBaseId()==null && clUsrBean==null
		    
		    log.info("AppUserManager:forViewCrt:04");
		    
		    if((clOrgBean==null||clOrgBean.getBaseId()==null)&&ui.getIogvCodeOrg()!=null&&ui.getIogvCodeOrg().length()==8){
		     //нет корректного кода иогв пользователя или не нашли действующую организацию
		     //но при этом есть корректный код иогв организации
		    	
		    	log.info("AppUserManager:forViewCrt:05");
		    	  
		      clOrgManager.forViewAutocomplete(ui.getIogvCodeOrg());
		   
		    
		      clOrgBean = (IspBssT)
                    Component.getInstance("clOrgBean", ScopeType.EVENT);
		    
		   
		    
		      if(clOrgBean.getBaseId()!=null){
		    	  
		    	 ui.setNameOrg(clOrgBean.getFull());
		    	
		    	 log.info("AppUserManager:forViewCrt:06:"+clOrgBean.getFull());
		      }
		    }
		    
		    log.info("AppUserManager:forViewCrt:07");
		    
		    ui.setPasswordTechUser(BaseUtil.password());
		    
		    Contexts.getEventContext().set("contextBeanView", ui);
		    
		   
		
		    
		   }catch(Exception e){
			 log.error("AppUserManager:forViewCrt:Error:"+e);
		   }
	   } 
	 
	
	 @Override
	 public void forViewUpdDel() {
		 try{
		     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("sessionId");
		     log.info("AppUserManager:forViewUpdDel:sessionId:"+sessionId);
		     if(sessionId!=null){
		    	
		     	 
		    	 AppUserItem ui = getUserItem(Long.valueOf(sessionId));
		        	 
		   	 Contexts.getEventContext().set("appUserBean", ui);
		     }
		   }catch(Exception e){
			   log.error("AppUserManager:forViewUpdDel:Error:"+e);
		   }
	 }
	 
	 public void forViewComment() {
		   
		   try{
			     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
					        .getRequestParameterMap()
					        .get("sessionId");
			     log.info("AppUserManager:forViewComment:sessionId:"+sessionId);
			     if(sessionId!=null){
			    	 AppUserItem ui = getUserItem(Long.valueOf(sessionId));
			    	 this.commentText=ui.getComment();

	     }
			}catch(Exception e){
				   log.error("AppUserManager:forViewComment:Error:"+e);
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
	 public List <BaseTableItem> getAuditItemsListSelect() {
		   log.info("getAuditItemsListSelect:01");
		   AppUserContext ac= new AppUserContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();			   
			   final Map<String, BaseTableItem> auditItemsMap = ac.getAuditItemsMap();
			   auditItemsListSelect.add(auditItemsMap.get("idApp"));
			   auditItemsListSelect.add(auditItemsMap.get("created"));
			   auditItemsListSelect.add(auditItemsMap.get("orgName"));			  
			   auditItemsListSelect.add(auditItemsMap.get("statusValue"));
		   }
	       return new ArrayList<BaseTableItem>(this.auditItemsListSelect);
  }
  

  @Override
  public List <BaseTableItem> getAuditItemsListContext() {
	   log.info("AppUserManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   AppUserContext ac= new AppUserContext();
		   auditItemsListContext=new ArrayList<BaseTableItem>(ac.getAuditItemsCollection());
		   
	   }
	   return new ArrayList<BaseTableItem>(this.auditItemsListContext);
  }
  
  @Override
  public List<HeaderTableItem> getHeaderItemsListContext() {	  
	   if(headerItemsListContext==null){
		   AppUserContext ac= new AppUserContext();
		   headerItemsListContext=new ArrayList<HeaderTableItem>(ac.getHeaderItemsList());
	   }	  
	   return this.headerItemsListContext;
  }
  
  public List<AcApplication> getListUsrArmForView() throws Exception{
	    log.info("AppUsrManager:getListUsrArmForView:01");
	   
	    String sessionIdApp = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    
	    log.info("AppUsrManager:getListUsrArmForView:sessionIdApp:"+sessionIdApp);
	    List<Object[]> loApp=null;
	    AcApplication app = null;
	    AcRole rolApp = null;
	    
	    try {
	    	
	    	if(listUsrArmForView==null && sessionIdApp!=null){
	      	
	    		loApp=entityManager.createNativeQuery(
		    			(new StringBuilder("select arm.ID_SRV app_id, arm.FULL_ app_name, ROL.FULL_ role_name "))
  	    			  .append(" from AC_IS_BSS_T arm, AC_ROLES_BSS_T rol,  ROLES_APP_USER_BSS_T app_roles ") 
  	    			  .append(" where ROL.UP_IS=arm.ID_SRV and app_roles.UP_ROLE=ROL.ID_SRV and APP_ROLES.UP_APP_USER= ? ") 
  	    			  .append(" group by arm.FULL_, arm.ID_SRV, ROL.FULL_ ") 
  	    			  .append(" order by arm.FULL_, arm.ID_SRV, ROL.FULL_ ")
  	    			  .toString())
		    	    				 .setParameter(1, Long.valueOf(sessionIdApp))
		    	    				.getResultList();

	    		 listUsrArmForView = new ArrayList<AcApplication>();
	    		
	    		 for(Object[] objectArray :loApp){
	    			 
	    			 if(app==null||!app.getIdArm().toString().equals(objectArray[0].toString())){
	    			   app=new AcApplication();
	    			   
	    			   listUsrArmForView.add(app);
	    			   
	    			   app.setIdArm(Long.valueOf(objectArray[0].toString()));
	    			   app.setName(objectArray[1]!=null?objectArray[1].toString():"");
	    			   app.setRolList(new ArrayList<AcRole>());
	    			 }
	    			 
	    			 rolApp=new AcRole();
	    			 rolApp.setRoleTitle(objectArray[2]!=null?objectArray[2].toString():"");
	    			 
	    			 app.getRolList().add(rolApp);
	    		 }
	    		
	    		
	    	 }
			} catch (Exception eApp) {
	    	 log.error("AppUsrManager:getListUsrArmForView:ERROR:"+eApp);
	         throw eApp;
	     }
	    return listUsrArmForView;
}
}
