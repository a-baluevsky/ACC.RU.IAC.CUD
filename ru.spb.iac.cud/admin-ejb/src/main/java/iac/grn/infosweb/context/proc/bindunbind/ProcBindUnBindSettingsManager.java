package iac.grn.infosweb.context.proc.bindunbind;

import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import static iac.cud.jboss.SeamComponentAdminEjb.*;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.log.Log;

@Name("procBindUnBindSettingsManager")
 public class ProcBindUnBindSettingsManager {

	@Logger private static Log log;
	
	@In
	transient EntityManager entityManager;
	 
		
	private static String param_code="to_archive_audit_func";
	
	public void init(){
		
		String monthInterval = null;
		
		try{
		   log.info("procBindUnBindSettingsManager:init:01");
		   
		    String  remoteAuditBindUnBind = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		    log.info("procBindUnBindSettingsManager:init:remoteAudit:"+remoteAuditBindUnBind);
	
		     if(remoteAuditBindUnBind!=null /*&& !"procSetting".equals(remoteAudit)*/){ 
		    	 //��� ���������� ��������
		    	 //procArchAFuncSettingsBean ������������� �� �����
			     //�� ������������� ������������ � EventContext
			     //�� ������� ����� �� � �����������
			   return;
			 }
		   
		    
		     ProcBindUnBindSettingsBean beanSettingsBindUnBind = new ProcBindUnBindSettingsBean();
		    	
		   	 
			 log.info("procBindUnBindSettingsManager:getCLDSBeanView:01");
			 
			 
			 
			 try {
				 
					 List<String> losBindUnBind = entityManager.createNativeQuery(
			              "select ST.VALUE_PARAM "
	                      + "from SETTINGS_KNL_T st "
	                      + "where ST.SIGN_OBJECT=? ")
	                      .setParameter(1, param_code)
	                      .getResultList();
		    	  
		    	  if(losBindUnBind!=null&&!losBindUnBind.isEmpty()){
		    	    monthInterval=losBindUnBind.get(0);
		    	  }
		    	  
		    	  if(monthInterval==null){ 
		    		  monthInterval="6";
		    	  }	    	 
			     
		    	  beanSettingsBindUnBind.setParamActualData(Long.valueOf(monthInterval));
		    	  
			      Contexts.getEventContext().set("procBindUnBindSettingsBean", beanSettingsBindUnBind);
			     
			      
			      
			  }catch (Exception eBindUnBind) {
					log.error("confLoadDataManager:initConfLDInfoBean:error:"+eBindUnBind);
			 }   
		  
		   
		}catch(Exception eBindUnBind){
		   log.error("procBindUnBindSettingsManager:init:ERROR:"+eBindUnBind);
		} 
	}     
	
	public void save(){
		try{
		   log.info("procBindUnBindSettingsManager:save:01");
		  
		   
			 
		   ProcBindUnBindSettingsBean beanSettingsBindUnBind = (ProcBindUnBindSettingsBean) 
				   Contexts.getEventContext().get("procBindUnBindSettingsBean");
		   
		   
		   
			  if(beanSettingsBindUnBind.getParamActualData()==null){
				  log.info("procBindUnBindSettingsManager:save:02");
				  return;
			  }
			   
			  try {
					  entityManager.createNativeQuery(
			              "update SETTINGS_KNL_T st " 
			              + "set ST.VALUE_PARAM=? "
	                      + "where ST.SIGN_OBJECT=? ")
	                      .setParameter(1, beanSettingsBindUnBind.getParamActualData())
	                      .setParameter(2, param_code)
	                      .executeUpdate();
	                      
			     log.info("procBindUnBindSettingsManager:save:03");
	    	  
			     //procArchAFuncSettingsBean ������������� �� �����
			     //�� ������������� ������������ � EventContext
			     //�� ������� ����� �� � �����������
			     
			     audit(ResourcesMap.PROC_ARCH_AUDIT_USER, ActionsMap.SET_PARAM);
			     
		  	  }catch (Exception eBindUnBind) {
					log.error("procBindUnBindSettingsManager:save:"+eBindUnBind);
			  }
			   
		}catch(Exception eBindUnBind){
		   log.error("procBindUnBindSettingsManager:save:ERROR:"+eBindUnBind);
		} 
	}     
	 public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
		   try{
			   AuditExportData auditExportDataBindUnBind = getSessionItem("auditExportData");
			   auditExportDataBindUnBind.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
			   
		   }catch(Exception eBindUnBind){
			   log.error("GroupManager:audit:error:"+eBindUnBind);
		   }
	  }
	

	
}
