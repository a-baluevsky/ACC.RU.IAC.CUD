package iac.grn.infosweb.context.mc.audit.sys;

 
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.dataitems.BaseParamItem;
import iac.cud.infosweb.entity.ServicesLogKnlT;
import iac.cud.infosweb.local.service.ServiceReestrAction;
import iac.cud.infosweb.local.service.ServiceReestrPro;
import iac.cud.infosweb.remote.frontage.IRemoteFrontageLocal;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.jboss.seam.Component;

import javaw.lang.Strings;

import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;

import iac.grn.serviceitems.BaseTableItem;

import javax.servlet.http.HttpServletResponse;

import iac.cud.data.audit.JPA_ASysManager;
import static iac.cud.jboss.SeamComponentAdminEjb.*;
/**
 * ”правл€ющий Ѕин
 * @author bubnov
 *
 */
@Name("aSysManager")
 public class ASysManager implements java.io.Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4356029250268615925L;

	@Logger private static transient Log log;
	
	 @In 
	 transient EntityManager entityManager;
	 
	/**
     * Ёкспортируема€ сущности 
     * дл€ отображени€
     */
	//private BaseItem usrBean;             !!! ѕроверить !!!
	
	private String dellMessage;
	 
	private List<BaseItem> auditList; 
	
	private List<BaseItem> auditReportList;
	
	private Long auditCount;
	
	private List <BaseTableItem> auditItemsListSelect;
	
	private List <BaseTableItem> auditItemsListContext;
	
	private int connectError=0;
	private Boolean evaluteForList;
	private Boolean evaluteForListFooter;  
	private Boolean evaluteForBean;
	
	private Date clearDate1;
	private Date clearDate2;
	
	private Date reportDate1;
		
	private Date reportDate2;
	
	private static String jndiBinding = "java:global/InfoS-ear/InfoS-ejb/IRemoteFrontage!iac.cud.infosweb.remote.frontage.IRemoteFrontageLocal";
	
	private static String param_code="to_archive_audit_sys";
	 
		
	private Long archiveParamValue=null;
	
	 
	public List<BaseItem> getAuditList(int firstRow, int numberOfRows){
	  String remoteAuditSys = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("auditManager:getAuditList:remoteAudit:"+remoteAuditSys);
	  
	  
	  log.info("getAuditList:firstRow:"+firstRow);
	  log.info("getAuditList:numberOfRows:"+numberOfRows);
	  
	  List<BaseItem> aFuncListCached = getSessionList("aFuncListCached");
	  if(auditList==null){
		  log.info("getAuditList:01");
		 	if(("rowSelectFact".equals(remoteAuditSys)||
			    "selRecAllFact".equals(remoteAuditSys)||
			    "clRecAllFact".equals(remoteAuditSys)||
			    "clSelOneFact".equals(remoteAuditSys)||
			    "onSelColSaveFact".equals(remoteAuditSys))&&
			    aFuncListCached!=null){
		 	    	this.auditList=aFuncListCached;
			}else{
				log.info("getAuditList:03");
		    	invokeLocal("list", firstRow, numberOfRows, null);
			    Contexts.getSessionContext().set("aFuncListCached", this.auditList);
			    log.info("getAuditList:03:"+this.auditList.size());
			}
		 	
		 	List<String>  selRecSys = getSessionList("selRecaFunc");
		 	if(this.auditList!=null && selRecSys!=null) {
		 		 for(BaseItem it:this.auditList){
				   if(selRecSys.contains(it.getBaseId().toString())){
					 
					 it.setSelected(true);
				   }else{
					  it.setSelected(false);
				   }
				 }
		    }
		}
		return this.auditList;
	}
	public void setAuditList(List<BaseItem> auditList){
		this.auditList=auditList;
	}
	
	public List<BaseItem> getAuditReportList(){
		  String date1 = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("date1");
		  String date2 = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("date2");
		 
		  
		  DateFormat df = new SimpleDateFormat ("dd.MM.yy");
		 
		  
		  try{
		    this.reportDate1 = df.parse(date1);
		    this.reportDate2 = df.parse(date2);
		  }catch(Exception e){
			  log.error("aFuncManager:getAuditReportList:parseError:"+e);
		  }
		  
		  if(this.reportDate1!=null && this.reportDate2!=null){
		  
		    if(auditReportList==null){
			  invokeLocal("listReport", 0, 0, null);
	  	    }
		  
		  }
		  return this.auditReportList;
	}
	
    public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
    	
		try{
			 log.info("ASysManager:invokeLocal");
			 
			 ASysStateHolder aSysStateHolder = getSessionItem("aSysStateHolder");

			 String st=null;			 
			 if("list".equals(type)){
				 log.info("ASys:invokeLocal:list:01");
				 
				 List<Object[]> lo = JPA_ASysManager.getAuditList(entityManager,
						 		firstRow, numberOfRows,
						 		aSysStateHolder.getColumnFilterValues(), 
						 		aSysStateHolder.getSortOrders().entrySet());
		         StringBuilder errInfo = new StringBuilder();
				 auditList = ServicesLogKnlT.FromRows(lo, errInfo);
				 if(errInfo.length()>0) log.error(errInfo.toString());
		         log.info("ASys:invokeLocal:list:02");
  
			 } else if("count".equals(type)){
				 log.info("ASysList:count:01");
				 auditCount = JPA_ASysManager.getAuditCount(entityManager, aSysStateHolder.getColumnFilterValues());                 
                 log.info("ASys:invokeLocal:count:02:"+auditCount);
           	 } 
			 else if("listReport".equals(type)){
				 log.info("invokeLocal:listReport:01");
                 
				 auditReportList = entityManager.createQuery(
						 (new StringBuilder("select o from ServicesLogKnlT o  "))
						   .append("where o.dateAction >= :date1 ") 
						   .append("and o.dateAction <= :date2 ") 
						   .append("order by o.idSrv desc ")
						 .toString())
						 .setParameter("date1", this.reportDate1)
    	                 .setParameter("date2", this.reportDate2)
	                     .getResultList();
					 
	             log.info("ASys:invokeLocal:listReport:02:size:"+auditReportList.size());
			 }
		}catch(Exception e){
			  log.error("ASys:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("ќшибка!");
		}
	}


  
   private  ServicesLogKnlT searchBean(String sessionId){
    	
      if(sessionId!=null){
    	 List<ServicesLogKnlT> aFuncListCached = getSessionList("aFuncListCached");
    	 
		if(aFuncListCached!=null){
			for(ServicesLogKnlT it : aFuncListCached){
				 
			 
			  if(it.getBaseId().toString().equals(sessionId)){
					 log.info("searchBean_Achtung!!!");
					 return it;
			  }
			}
		 }
	   }
	   return null;
    }
   
   public void forView(String modelType) {
	   String  aSysId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	  log.info("forView:aSysId:"+aSysId);
	  log.info("forView:modelType:"+modelType);
	  if(aSysId!=null ){
		  
		   
			if(modelType==null){
		    	return ;
		    }
			
			ServicesLogKnlT ar = searchBean(aSysId);
		 Contexts.getEventContext().set("aFuncBean", ar);
	  }
   }
   
  
   
  
  
    public void forViewWord(String fileNameSys){
		log.info("JournManager:forViewWord:01");
		try{
		 
			fileNameSys = Strings.defaultForNullOrEmpty(fileNameSys,"invoke_services");
			
		  HttpServletResponse response = (HttpServletResponse)
				  FacesContext.getCurrentInstance().getExternalContext().getResponse();
		  response.setHeader("Content-disposition", "attachment; filename="+fileNameSys+".doc");
	      response.setContentType("application/msword");

		}catch(Exception e){
			log.error("auditReportsManager:forViewWord:error:"+e);
		}
		log.info("auditReportsManager:forViewWord:02");
	}
   
    
    public Long getAuditCount(){
	   log.info("getAuditCount");
	 
	   invokeLocal("count",0,0,null);
	  
	   return auditCount;
	  
   }
    
   public int getConnectError(){
	   return connectError;
   }
  
   
   public List <BaseTableItem> getAuditItemsListSelect() {
		 log.info("getAuditItemsListSelect:01");
	
	    ASysContext acSys= new ASysContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			   
			
			   auditItemsListSelect.add(acSys.getAuditItemsMap().get("createdValue"));
			   auditItemsListSelect.add(acSys.getAuditItemsMap().get("servName"));
			   auditItemsListSelect.add(acSys.getAuditItemsMap().get("userFio"));
			   auditItemsListSelect.add(acSys.getAuditItemsMap().get("ipAddress"));
		   }
	       return this.auditItemsListSelect;
   }
   
   public void setAuditItemsListSelect(List <BaseTableItem> auditItemsListSelect) {
		    this.auditItemsListSelect=auditItemsListSelect;
   }
   
   public List <BaseTableItem> getAuditItemsListContext() {
	   log.info("orgManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   ASysContext acSys= new ASysContext();
		   auditItemsListContext = new ArrayList<BaseTableItem>();
		   
		   
		   auditItemsListContext=acSys.getAuditItemsCollection();
	   }
	   return this.auditItemsListContext;
   }
      
    
   public void selectRecord(){
	    String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    log.info("selectRecord:sessionId="+sessionId);
	    
	   //  forVi/ew(/); //!!!
	    List<String>  selRecSys = getSessionList("selRecaFunc");
	    
	    if(selRecSys==null){
	       selRecSys = new ArrayList<String>();
	       log.info("selectRecord:01");
	    }
	    
	    
	    ServicesLogKnlT aa = new ServicesLogKnlT();
  	   
	    
	    if(aa!=null){
	     if(selRecSys.contains(sessionId)){
	    	selRecSys.remove(sessionId);
	    	aa.setSelected(false);
	    	log.info("selectRecord:02");
	     }else{
	    	selRecSys.add(sessionId);
	    	aa.setSelected(true);
	    	log.info("selectRecord:03");
	     }
	    Contexts.getSessionContext().set("selRecaFunc", selRecSys);	
	    
	    Contexts.getEventContext().set("aFuncBean", aa);
	   }
	}
   
   public void clearDate(){
	   log.info("aSysManager:clearDate:archiveParamValue:"+this.archiveParamValue);
	   try{
		   Context ctx = new InitialContext(); 
	       BaseParamItem bpi = new BaseParamItem(ServiceReestrPro.ArchiveAuditSys.name());
	       bpi.put("gactiontype", ServiceReestrAction.TASK_RUN.name());
	       bpi.put("archiveParamValue", this.archiveParamValue);
	       IRemoteFrontageLocal obj = (IRemoteFrontageLocal)ctx.lookup(jndiBinding);
	       obj.run(bpi);
           audit(ResourcesMap.AUDIT_SYS, ActionsMap.START);
	   }catch (Exception eSys) {
	   	 log.error("aSysManager:clearDate:ERROR:"+eSys);
	   }
   }
   
   public String getDellMessage() {
	   return dellMessage;
   }
   public void setDellMessage(String dellMessage) {
	   this.dellMessage = dellMessage;
   } 
   
   public Date getClearDate1(){
	   return this.clearDate1==null ? null: (Date)this.clearDate1.clone();
   }
   public void setClearDate1(Date clearDate1){
	   this.clearDate1=(clearDate1==null)?null:(Date)clearDate1.clone();
   }
  
   public Date getClearDate2(){
	   return this.clearDate2==null ? null: (Date)this.clearDate2.clone();
   }
   public void setClearDate2(Date clearDate2){
	   this.clearDate2=(clearDate2==null)?null:(Date)clearDate2.clone();
   }

  /*
 //  было использовано только дл€ отображени€ параметра
 // <!--h:outputText value="#{aSysManager.archiveParamValue}"/-->
 //  заменено на ввод значени€ Long archiveParamValue
  
   publ/ic Strin/g getArchivePar/amValue(/) {
   pub/lic void setArchive/ParamValue(String archiv/eParamValue) {
*/
   
   public Long getArchiveParamValue() {
	   
	   log.info("aSysManager:getArchiveParamValue:01");
	   
	   if(this.archiveParamValue==null){
		   
		   //!!!
		   this.archiveParamValue=6L;
		   
		   try{
			   List<String> los = entityManager.createNativeQuery(
			              "select ST.VALUE_PARAM "
	                      + "from SETTINGS_KNL_T st "
	                      + "where ST.SIGN_OBJECT=? ")
	                      .setParameter(1, param_code)
	                      .getResultList();
		    	  
		       if(los!=null&&!los.isEmpty()){
		    	   this.archiveParamValue= Long.parseLong(los.get(0));
		       }
		     
		       log.info("aSysManager:getArchiveParamValue:archiveParamValue:"+this.archiveParamValue);
		    	  
		   }catch(Exception e){
			   log.error("aSysManager:getArchiveParamValue:ERROR:"+e);
		   }
	   }
	   return this.archiveParamValue;
   }
   public void setArchiveParamValue(Long archiveParamValue) {
		this.archiveParamValue = archiveParamValue;
   }
   
   public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
	   try{
		   AuditExportData auditExportDataSys = getSessionItem("auditExportData");
		   auditExportDataSys.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
		   
	   }catch(Exception e){
		   log.error("GroupManager:audit:error:"+e);
	   }
  }
   
   public Boolean getEvaluteForList() {
	
   	log.info("armManager:evaluteForList:01");
   	if(evaluteForList==null){
   		evaluteForList=false;
    	String remoteAuditSys = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("aFuncManager:evaluteForList:remoteAudit:"+remoteAuditSys);
     	
    	if(remoteAuditSys!=null&&
    	 
    	   !"OpenCrtFact".equals(remoteAuditSys)&&	
    	   !"OpenUpdFact".equals(remoteAuditSys)&&
    	   !"OpenDelFact".equals(remoteAuditSys)&&
   	       !"onSelColFact".equals(remoteAuditSys)&&
   	       !"refreshPdFact".equals(remoteAuditSys)){
    		log.info("aFuncManager:evaluteForList!!!");
   		    evaluteForList=true;
    	}
   	 }
       return evaluteForList;
   }
   public Boolean getEvaluteForListFooter() {
		
	  
	   	if(evaluteForListFooter==null){
	   		evaluteForListFooter=false;
	    	String remoteAuditSys = FacesContext.getCurrentInstance().getExternalContext()
		             .getRequestParameterMap()
		             .get("remoteAudit");
		   log.info("aFuncManager:evaluteForListFooter:remoteAudit:"+remoteAuditSys);
	     
	    	if(getEvaluteForList()&&
	    	    	
	    	   !"protBeanWord".equals(remoteAuditSys)&&	
	    	    	
	   	       !"selRecAllFact".equals(remoteAuditSys)&&
	   	       !"clRecAllFact".equals(remoteAuditSys)&&
	   	      // !remoteAudit equals "clSelOneFact"
	   	       !"onSelColSaveFact".equals(remoteAuditSys)){
	    		  log.info("aFuncManager:evaluteForListFooter!!!");
	   		      evaluteForListFooter=true;
	    	}
	   	 }
	       return evaluteForListFooter;
	   }
   
   public Boolean getEvaluteForBean() {
		
		  
		   	if(evaluteForBean==null){
		   		evaluteForBean=false;
		    	String remoteAuditSys = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("remoteAudit");
			    log.info("aFuncManager:evaluteForBean:remoteAudit:"+remoteAuditSys);
				String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("sessionId");
			    log.info("aFuncManager:evaluteForBean:sessionId:"+sessionId);
		    	if(sessionId!=null && remoteAuditSys!=null &&
		    	   ("rowSelectFact".equals(remoteAuditSys)||	
		    	    "UpdFact".equals(remoteAuditSys))){
		    	      log.info("aFuncManager:evaluteForBean!!!");
		   		      evaluteForBean=true;
		    	}
		   	 }
		     return evaluteForBean;
		   }

}

