package iac.grn.infosweb.context.mc.auditaction;

import static iac.cud.jboss.FacesContextAdminEjb.getSessionId;
import static iac.cud.jboss.SeamComponentAdminEjb.getConversationItem;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionItem;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionList;
import static iac.cud.jboss.SeamContextAdminEjb.setEventContext;
import static iac.cud.jboss.SeamContextAdminEjb.setSessionContext;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.ActionsBssT;
import iac.grn.infosweb.context.mc.MCData;
import iac.grn.infosweb.context.mc.QuerySvc;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;
import iac.grn.serviceitems.BaseTableItem;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaw.lang.Strings;
import javaw.util.ArrayList;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;

/**
 * ”правл€ющий Ѕин
 * @author bubnov
 *
 */
@Name("auditActionManager")
 public class AuditActionManager  extends QuerySvc implements java.io.Serializable {
	private static final long serialVersionUID = -750297402252549808L;

	@Logger private static /*transient*/ Log log;
	@In	 	transient EntityManager entityManager;
	private MCData.ArmList armList = new MCData.ArmList(log);
	public List<AcApplication> getListArm() throws Exception { return armList.getListArm(entityManager); } 

	/**
     * Ёкспортируема€ сущности 
     * дл€ отображени€
     */
	
	private int connectError=0;
	private Boolean evaluteForList;
		
		
		
	private /*Serializable*/ List<BaseItem> auditList; 
	
	private Long auditCount;
	
	private /*Serializable*/ List <BaseTableItem> auditItemsListSelect;
	
	private /*Serializable*/ List <BaseTableItem> auditItemsListContext;
	
	private Boolean evaluteForListFooter;  
	private Boolean evaluteForBean;
	
	private String dellMessage=null;
	private int delNot=0;

	
	private /*Serializable*/ List<ActionsBssT> listAuditAction = null;
	
	private boolean auditActionCodeExist=false;
	
	//private /*Serializable*/ List<AcUser> adminListForView;
	
	private String commentApp = null;

	public List<BaseItem> getAuditList(int firstRow, int numberOfRows){
	  String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("AuditActionManager:auditManager:getAuditList:remoteAudit:"+remoteAudit);
	  
	  
	  log.info("AuditActionManager:getAuditList:firstRow:"+firstRow);
	  log.info("AuditActionManager:getAuditList:numberOfRows:"+numberOfRows);
	  
	  List<BaseItem> auditActionListCached = getSessionList("auditActionListCached"); //getSessionList("auditActionListCached");
	  if(auditList==null){
		  log.info("getAuditList:01");
		 	if(("rowSelectFact".equals(remoteAudit)||
			    "selRecAllFact".equals(remoteAudit)||
			    "clRecAllFact".equals(remoteAudit)||
			    "clSelOneFact".equals(remoteAudit)||
			    "onSelColSaveFact".equals(remoteAudit))&&
			    auditActionListCached!=null){
			    	this.auditList =  new ArrayList<BaseItem>(auditActionListCached);
			}else{
		    	invokeLocal("list", firstRow, numberOfRows, null);
			    setSessionContext("auditActionListCached", this.auditList);
			    log.info("getAuditList:03:"+this.auditList.size());
			}
		 	
		 	List<String>  selRecAuditAction = getSessionList("selRecAuditAction");
		 	if(this.auditList!=null && selRecAuditAction!=null) {
		 		 for(BaseItem it:this.auditList){
				   if(selRecAuditAction.contains(it.getBaseId().toString())){
					 it.setSelected(true);
				   }else{
					  it.setSelected(false);
				   }
				 }
		    }
		}
		return this.auditList;
	}
	public void setAuditList(List<BaseItem> auditList) { 
		this.auditList = auditList; 
	}
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		try{
			 String orderQueryAuditAction=null;
			 log.info("hostsManager:invokeLocal");
			 
			 AuditActionStateHolder orgStateHolder = getSessionItem("auditActionStateHolder");
			 
			 Map<String, String> filterMapAuditAction = orgStateHolder.getColumnFilterValues();
			 String st=null;
			 
			 if("list".equals(type)){
				 log.info("AuditActionManager:invokeLocal:list:01");
				 
				
				 Set<Map.Entry<String, String>> set = orgStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		        
      		       if(orderQueryAuditAction==null){
      		    	 orderQueryAuditAction="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQueryAuditAction=orderQueryAuditAction+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("AuditActionManager:invokeLocal:list:orderQueryAuditAction:"+orderQueryAuditAction);
                
                 if(filterMapAuditAction!=null){
    	    		 Set<Map.Entry<String, String>> setFilterAuditActionManager = filterMapAuditAction.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAuditActionManager) {
    	            	      		//делаем фильтр на начало
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	           
    	              }
    	    	   }
                 log.info("AuditAction:invokeLocal:list:filterQuery:"+st);
                 
				 auditList = new ArrayList<BaseItem>(
						 entityManager.createQuery("select o from ActionsBssT o "+
						 (st!=null ? " where "+st :"")+
						 (orderQueryAuditAction!=null ? orderQueryAuditAction+", o.idSrv desc " : " order by o.idSrv desc"))
	                       .setFirstResult(firstRow)
	                       .setMaxResults(numberOfRows)
	                       .getResultList()
                       );
             log.info("AuditAction:invokeLocal:list:02");
  
			 } else if("count".equals(type)){
				 log.info("AuditActionManagerList:count:01");
				 
				 if(filterMapAuditAction!=null){
    	    		 Set<Map.Entry<String, String>> setFilterAuditActionManager = filterMapAuditAction.entrySet();
    	              for (Map.Entry<String, String> me : setFilterAuditActionManager) {
    	            	
    	            		//делаем фильтр на начало
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	         
    	              }
    	    	   }
                 log.info("AuditActionManager:invokeLocal:count:filterQuery:"+st);
				 
				 
				 auditCount = (Long)entityManager.createQuery(
						 "select count(o) " 
				         + "from ActionsBssT o "+
				         (st!=null ? " where "+st :""))
		                .getSingleResult();
				 
               log.info("AuditActionManager:invokeLocal:count:02:"+auditCount);
           	 } 
		}catch(Exception e){
			  log.error("AuditActionManager:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("ќшибка!");
		}
	}
	 
	
   public void forView(String modelType) {
	  String  auditActionId = getSessionId();	   
	  log.info("forView:auditActionId:"+auditActionId);
	  log.info("forView:modelType:"+modelType);
	  if(auditActionId!=null && modelType!=null)
		  setEventContext("auditActionBean", searchBean(auditActionId)); 
   }
   
   private ActionsBssT searchBean(String sessionId){
      if(sessionId!=null){
    	List<ActionsBssT> auditActionListCached = getSessionList("auditActionListCached");
		if(auditActionListCached!=null)
			for(ActionsBssT it: auditActionListCached)
			  if(it.getIdSrv().toString().equals(sessionId)){
					 log.info("searchBean:found for sessionId="+sessionId);
					 return it;
			  }
	  }
	  return null;
    }
   
    public Long getAuditCount(){
	   log.info("getAuditCount");
	   invokeLocal("count",0,0,null);
	   return auditCount;
	  
   }
   
	//пользователь имеет право только создать за€вку на создание объекта    
    private boolean limitedAddAuditAction(AcUser au) throws Exception {
	    // A.B. „“ќ значат: "004", "2"    	
    	final List<Long> allowedSys = au.getAllowedSys();
    	final boolean bNotAllowedReestr = !au.isAllowedReestr("004", "2");
		log.info("auditActionManager:limitedAddAuditAction:02_1:"+(allowedSys!=null));
		log.info("auditActionManager:limitedAddAuditAction:02_2:"+bNotAllowedReestr);		 
    	return ((allowedSys!=null || au.getIsAccOrgManagerValue()) && bNotAllowedReestr);
    }
    
   public void addAuditAction(){
	   log.info("auditActionManager:addAuditAction:01");
	   ActionsBssT auditActionBeanCrt = getConversationItem("auditActionBeanCrt");
	   if(auditActionBeanCrt!=null) {
		   try {
			   AcUser au = getSessionItem("currentUser"); 
			   final Long lngIdSrv = auditActionBeanCrt.getIdSrv();
			   if(!auditActionCodeExist(lngIdSrv) && !limitedAddAuditAction(au)) {				   
	    		  log.info("auditActionManager:addAuditAction:06");	    		  
				  auditActionBeanCrt.setFull(auditActionBeanCrt.getFull().trim());				  
				  auditActionBeanCrt.setSign(auditActionBeanCrt.getSign().trim());				  
				  String sDescription = auditActionBeanCrt.getDescriptions();
				  auditActionBeanCrt.setDescriptions(Strings.isNullOrEmptyTrim(sDescription)?null:sDescription.trim());				  
				  auditActionBeanCrt.setCreator(au.getIdUser());
				  auditActionBeanCrt.setCreated(new Date());				  
				  auditActionBeanCrt.setIdSrv(null);
			      entityManager.persist(auditActionBeanCrt);
			      refreshEntityManager(auditActionBeanCrt);
			   } else {
				   log.warn("addAuditAction:exist IdSrv="+lngIdSrv);
			   }
		    } catch (Exception e) {
		       log.error("auditActionManager:addAuditAction:ERROR:"+e);
		    } 
	   }  else {
		   log.warn("auditActionManager:addAuditAction:Can't getConversationItem auditActionBeanCrt");
	   }
   }
private void refreshEntityManager(Object target) {
	entityManager.flush();
	entityManager.refresh(target);
}

   public void updAuditAction(){
	   log.info("auditActionManager:updAuditAction:01");
	   ActionsBssT auditActionBean = getConversationItem("auditActionBean");	   
	   String  sessionId = getSessionId();
	   log.info("auditActionManager:updAuditAction:sessionId:"+sessionId);
	   if(auditActionBean!=null && sessionId!=null)
	   try {		   
		final Long lngSessionId = Long.valueOf(sessionId);
		final Long idSrv = auditActionBean.getIdSrv();
		if(!lngSessionId.equals(idSrv)) {
			log.warn("Can't update: different ID specified! lngSessionId="+lngSessionId+", idSrv = "+idSrv);
		} else if(auditActionCodeExist(idSrv)){  
			ActionsBssT aam = entityManager.find(ActionsBssT.class, lngSessionId);
			aam.setFull(auditActionBean.getFull().trim());
			aam.setSign(auditActionBean.getSign().trim());
			final String descriptions = auditActionBean.getDescriptions();
			if(!Strings.isNullOrEmptyTrim(descriptions)){
			  aam.setDescriptions(descriptions.trim());
			}else{
			  aam.setDescriptions(null);
			}
			aam.setAcIsBssT(auditActionBean.getAcIsBssT());
			refreshEntityManager(aam);
		    setEventContext("auditActionBean", aam);
		 }
	   } catch (Exception e) {
           log.error("auditActionManager:updSrm:ERROR:"+e);
       } else {
    	   log.warn("auditActionBean or sessionId == null");
       }
   }
   
   public void delAuditAction(){
	 try {
		log.info("auditActionManager:delAuditAction:01");
		ActionsBssT auditActionBean = getConversationItem("auditActionBean");
		Long idAuditAction = auditActionBean==null? null: auditActionBean.getIdSrv();
		if(idAuditAction!=null) {
			log.info("auditActionManager:delAuditAction:idAuditAction:"+idAuditAction);
			ActionsBssT aom = entityManager.find(ActionsBssT.class, idAuditAction);
			entityManager.remove(aom);
			entityManager.flush();
			//audit(ResourcesMap.IS, ActionsMap.DELETE);			
		}
		else {
			log.warn("auditActionBean not found with getConversationItem or idAuditAction=null! Check <h:inputHidden value='#{auditActionBean.idSrv}'/> in SEAM code!");
		}
	 }catch(Exception e){
		 log.error("auditActionManager:delAuditAction:error:"+e); 
	 }
    }
 
    public void forViewUpdDel() {
	   try{
	     String sessionId = getSessionId();
	     log.info("forViewUpdDel:sessionId:"+sessionId);
	     if(sessionId!=null){
	    	 ActionsBssT ao = entityManager.find(ActionsBssT.class, Long.valueOf(sessionId));
	    	 setEventContext("auditActionBean", ao);
	    	 
	    	//устанавливаем на 1 страницу пагинатор в модальном окне
	    	 AuditActionStateHolder auditActionStateHolder = getSessionItem("auditActionStateHolder");
	    	 auditActionStateHolder.resetPageNumber();
	    	 
	   	 }
	   }catch(Exception e){
		   log.error("forViewUpdDel:Error:"+e);
	   }
    }

   
    public void forViewDelMessage() {
    	dellMessage = null; delNot = 0;
		String sessionId = getSessionId();
		log.info("forViewDelMessage:sessionId:"+sessionId);
		if(sessionId!=null){		
		  ActionsBssT aa = entityManager.find(ActionsBssT.class, Long.valueOf(sessionId));
		  Set logs = aa.getActionsLogKnlTs();
		  if(logs!=null && !logs.isEmpty()) {
			  dellMessage = "‘ункци€ аудита имеет порождЄнные записи. ”даление невозможно!";
			  delNot = 1;
		  }
		  setEventContext("auditActionBean", aa);
		}	
    }
    
    
   public int getConnectError(){
	   return connectError;
   }
   
   public List<ActionsBssT> getListAuditAction() throws Exception{
	    log.info("auditActionManager::getListAuditAction:01");
	    
	    
	    try {
	    	if(listAuditAction==null){
	    		
	    		AcUser au = getSessionItem("currentUser"); 
	    		 
	    		if(au.getAllowedSys()!=null){
	    			

	    			listAuditAction=new ArrayList<ActionsBssT>(entityManager.createQuery(
		       				  "select o from ActionsBssT o " 
		       				  + "where o.idAuditAction in (:idsAuditAction) order by o.full ")
		       				  .setParameter("idsAuditAction", au.getAllowedSys())
		       				  .getResultList());
	    			
	    		}else{
	       		   listAuditAction=new ArrayList<ActionsBssT>(entityManager.createQuery(
	       				  "select o from ActionsBssT o  order by o.full ")
	       				  .getResultList());
	    		}
	    	}
	     } catch (Exception eAuditAction) {
	    	 log.error("auditActionManager::getListAuditAction:ERROR:"+eAuditAction);
	         throw eAuditAction;
	     }
	    return listAuditAction;
  }
   
   public void setAuditItemsListSelect(List<BaseTableItem> auditItemsListSelect) {
	    this.auditItemsListSelect=auditItemsListSelect;
}

   
   public List <BaseTableItem> getAuditItemsListSelect() {
		 log.info("getAuditItemsListSelect:01");
	
	    AuditActionContext acAuditAction= new AuditActionContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			   final Map<String, BaseTableItem> auditItemsMap = acAuditAction.getAuditItemsMap();
			   auditItemsListSelect.add(auditItemsMap.get("full"));
			   auditItemsListSelect.add(auditItemsMap.get("sign"));
			   auditItemsListSelect.add(auditItemsMap.get("descriptions"));
			   auditItemsListSelect.add(auditItemsMap.get("armName")); 
		   }
	       return this.auditItemsListSelect;
   }
   
   
   public List <BaseTableItem> getAuditItemsListContext() {
	   log.info("orgManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   AuditActionContext acAuditAction= new AuditActionContext();
		   auditItemsListContext=new ArrayList<BaseTableItem>(acAuditAction.getAuditItemsCollection());
	   }
	   return this.auditItemsListContext;
   }
   
   public void selectRecord(){
	    String  sessionIdAuditAction = getSessionId();
	    log.info("selectRecord:sessionId="+sessionIdAuditAction);
	    
	   //  forView; //!!!
	    List<String>  selRecAuditAction = getSessionList("selRecAuditAction");
	    
	    if(selRecAuditAction==null){
	       selRecAuditAction = new ArrayList<String>();
	       log.info("selectRecord:01");
	    }
	    
	    ActionsBssT aa = new ActionsBssT();
	    if(aa!=null){
	     if(selRecAuditAction.contains(sessionIdAuditAction)){
	    	selRecAuditAction.remove(sessionIdAuditAction);
	    	aa.setSelected(false);
	    	log.info("selectRecord:02");
	     }else{
	    	selRecAuditAction.add(sessionIdAuditAction);
	    	aa.setSelected(true);
	    	log.info("selectRecord:03");
	     }
	    setSessionContext("selRecAuditAction", selRecAuditAction);	
	    setEventContext("auditActionBean", aa);
	   }
	}
   
  
   
   public int getDelNot() {
	   return delNot;
   }
   public boolean getAuditActionCodeExist() {
	    return auditActionCodeExist;
   }
   public String getDellMessage() {
	   return dellMessage;
   }
   public void setDellMessage(String dellMessage) {
	   this.dellMessage = dellMessage;
   } 
   
   private boolean auditActionCodeExist(Long crtIdSrv) throws Exception {
		log.info("AuditActionManager:AuditActioncodeExistCrt:auditActionCode="+crtIdSrv);
		if(crtIdSrv!=null)
		try {
		  List<Object> lo=entityManager.createNativeQuery("select ID_SRV from ACTIONS_BSS_T where ID_SRV=? ")
				.setParameter(1, crtIdSrv)
				.getResultList();
		  auditActionCodeExist=!lo.isEmpty();
		  log.info("AuditActionManager:AuditActionCodeExistCrt:addLoginExist!");	
		} catch(Exception e){
		   log.error("AuditActionManager:AuditActionCodeExistCrt:Error:"+e);
		   throw e;
		}
		return this.auditActionCodeExist;
 }
  
  public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
	   try{
		   AuditExportData auditExportDataAuditAction = getSessionItem("auditExportData");
		   auditExportDataAuditAction.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
		   
	   }catch(Exception e){
		   log.error("GroupManager:audit:error:"+e);
	   }
  }
  
   public Boolean getEvaluteForList() {
	
   	log.info("auditActionManager:evaluteForList:01");
   	if(evaluteForList==null){
   		evaluteForList=false;
    	String remoteAuditAuditAction = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("auditActionManager:evaluteForList:remoteAudit:"+remoteAuditAuditAction);
     	
    	if(remoteAuditAuditAction!=null&&
    	 
    	   !"OpenCrtFact".equals(remoteAuditAuditAction)&&	
    	   !"OpenUpdFact".equals(remoteAuditAuditAction)&&
    	   !"OpenDelFact".equals(remoteAuditAuditAction)&&
   	       !"onSelColFact".equals(remoteAuditAuditAction)&&
   	       !"refreshPdFact".equals(remoteAuditAuditAction)){
    		log.info("reposManager:evaluteForList!!!");
   		    evaluteForList=true;
    	}
   	 }
       return evaluteForList;
   }
   public Boolean getEvaluteForListFooter() {
		
	  
	   	if(evaluteForListFooter==null){
	   		evaluteForListFooter=false;
	    	String remoteAuditAuditAction = FacesContext.getCurrentInstance().getExternalContext()
		             .getRequestParameterMap()
		             .get("remoteAudit");
		   log.info("auditActionManager:evaluteForListFooter:remoteAudit:"+remoteAuditAuditAction);
	     
	    	if(getEvaluteForList()&&
	    	    	
	    	   !"protBeanWord".equals(remoteAuditAuditAction)&&	
	    	    	
	   	       !"selRecAllFact".equals(remoteAuditAuditAction)&&
	   	       !"clRecAllFact".equals(remoteAuditAuditAction)&&
	   	      // !remoteAudit equals "clSelOneFact"
	   	       !"onSelColSaveFact".equals(remoteAuditAuditAction)){
	    		  log.info("auditActionManager:evaluteForListFooter!!!");
	   		      evaluteForListFooter=true;
	    	}
	   	 }
	       return evaluteForListFooter;
	   }
   
   public Boolean getEvaluteForBean() {
		
		  
		   	if(evaluteForBean==null){
		   		evaluteForBean=false;
		    	String remoteAuditAuditAction = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("remoteAudit");
			    log.info("auditActionManager:evaluteForBean:remoteAudit:"+remoteAuditAuditAction);
				String sessionId = getSessionId();
			    log.info("auditActionManager:evaluteForBean:sessionId:"+sessionId);
		    	if(sessionId!=null && remoteAuditAuditAction!=null &&
		    	   ("rowSelectFact".equals(remoteAuditAuditAction)||	
		    	    "UpdFact".equals(remoteAuditAuditAction))){
		    	      log.info("auditActionManager:evaluteForBean!!!");
		   		      evaluteForBean=true;
		    	}
		   	 }
		     return evaluteForBean;
		   }
   
   private String decToHex(BigInteger bi) {
		
		String resultAuditAction = null;
		
		try
		{
		 resultAuditAction = bi.toString(16);
		 
		}
		catch (NumberFormatException e)
		{
			log.error("Error! tried to parse an invalid number format");
		}
		 return resultAuditAction;
	}
public String getCommentApp() {
	return commentApp;
}
public void setCommentApp(String commentApp) {
	this.commentApp = commentApp;
}
}

