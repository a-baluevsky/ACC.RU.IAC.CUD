package iac.grn.infosweb.context.services.binding;

import java.util.List; 

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.dataitems.BaseParamItem;
import iac.cud.infosweb.dataitems.BindingItem;
import iac.cud.infosweb.dataitems.UserBindingItem;
import iac.cud.infosweb.dataitems.UserItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcLinkUserToRoleToRaion;
import iac.cud.infosweb.entity.AcRole;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.GroupUsersKnlT;
import iac.cud.infosweb.entity.IspBssT;
import iac.cud.infosweb.local.service.ServiceReestrAction;
import iac.cud.infosweb.local.service.ServiceReestrPro;
import iac.cud.infosweb.remote.frontage.IRemoteFrontageLocal;
import iac.cud.infosweb.session.binding.BindingProcessor;
import iac.grn.infosweb.context.mc.usr.TIDEncodePLBase64;
import iac.grn.infosweb.context.mc.usr.UsrManager;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;
import iac.grn.infosweb.session.navig.LinksMap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaw.util.HashMap;
import javaw.util.SerializableList;
import javaw.util.ArrayList;
import javaw.util.SerializableMap;
import javaw.util.SerializableSet;









import org.jboss.seam.Component;

import ru.spb.iac.cud.core.util.CUDConstants;

import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;

import iac.grn.serviceitems.BaseTableItem;

import javax.persistence.NoResultException;

/**
 * Управляющий Бин
 * @author bubnov
 *
 */
@Name("bindManager")
 public class BindManager implements java.io.Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 3140180937398943875L;

	@Logger private static Log log;
	
	 @In 
	 transient EntityManager entityManager;
	 
	/**
     * Экспортируемая сущности 
     * для отображения
     */
		
	private /*Serializable*/ List<BaseItem> auditList;
	
	private Long auditCount;
	
	private /*Serializable*/ List<BaseTableItem> auditItemsListSelect;
	
	private /*Serializable*/ List<BaseTableItem> auditItemsListContext;
	
	private int connectError=0;
	private Boolean evaluteForList;
	private Boolean evaluteForListFooter;  
	private Boolean evaluteForBean;
	
	  
	private boolean addLoginExist=false;
	
	private /*Serializable*/ List<AcApplication> listBindArm = null;
	private /*Serializable*/ List<AcApplication> listBindArmEdit = null;
	private /*Serializable*/ List<AcApplication> listBindArmForView = null;
	
	private /*Serializable*/ List<BaseItem> historyBindingList = null;
	
	private Long historyBindingValue = null;
	
	private /*Serializable*/ List<GroupUsersKnlT> listBindGroupForView = null;
	
	private LinksMap linksMap = null;
	private AcUser currentUser = null;
	
	private /*Serializable*/ List<BaseItem> roleList;
	
	private /*Serializable*/ List<BaseItem> applicantList;
	
	private String dellMessage = null;
	
	private String[] fioArray={"", "", ""};
	
	private Boolean searchOrgExact=true;
	
		private static String jndiBinding = "java:global/InfoS-ear/InfoS-ejb/IRemoteFrontage!iac.cud.infosweb.remote.frontage.IRemoteFrontageLocal";
	
	
	private String runResultMessage = null;
	
    public boolean getAddLoginExist() {
	    return addLoginExist;
	}
	
	public SerializableList<BaseItem> getAuditList(int firstRow, int numberOfRows){
	  String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("auditManager:getAuditList:remoteAudit:"+remoteAudit);
	  
	  
	  log.info("getAuditList:firstRow:"+firstRow);
	  log.info("getAuditList:numberOfRows:"+numberOfRows);
	  
	  List<BaseItem> bindListCached = (List<BaseItem>)
			  Component.getInstance("bindListCached",ScopeType.SESSION);
	  if(auditList==null){
		  log.info("getAuditList:01");
		 	if(("rowSelectFact".equals(remoteAudit)||
			    "selRecAllFact".equals(remoteAudit)||
			    "clRecAllFact".equals(remoteAudit)||
			    "clSelOneFact".equals(remoteAudit)||
			    "onSelColSaveFact".equals(remoteAudit))&&
			    bindListCached!=null){
		 		log.info("getAuditList:02:"+bindListCached.size());
			    	this.auditList=bindListCached;
			}else{
				log.info("getAuditList:03");
		    	invokeLocal("list", firstRow, numberOfRows, null);
			    Contexts.getSessionContext().set("bindListCached", this.auditList);
			    log.info("getAuditList:03:"+this.auditList.size());
			}
		 	
		 	List<String>  selRecBind = (List<String>)
					  Component.getInstance("selRecBind",ScopeType.SESSION);
		 	if(this.auditList!=null && selRecBind!=null) {
		 		 for(BaseItem it:this.auditList){
				   if(selRecBind.contains(it.getBaseId().toString())){
					 
					 it.setSelected(true);
				   }else{
					 it.setSelected(false);
				   }
				 }
		      }
		}
		return new ArrayList<BaseItem>(auditList);
	}
	public void setAuditList(SerializableList<BaseItem> auditList){
		this.auditList=auditList;
	}
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		
		SerializableMap<String, BaseItem> resultIds = new HashMap<String, BaseItem>();
		String idRec=null;
		
		try{
			 String orderQuery=null;
			 log.info("BindManager:invokeLocal");
			 
			 BindStateHolder bindStateHolder = (BindStateHolder)
					  Component.getInstance("bindStateHolder",ScopeType.SESSION);
			 Map<String, String> filterMap = bindStateHolder.getColumnFilterValues();
			 String st=null;
			  
			 if("list".equals(type)){
				 log.info("Bind:invokeLocal:list:01");
				 
				 Set<Map.Entry<String, String>> set = bindStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		       
      		       if(orderQuery==null){
      		    	 orderQuery="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQuery=orderQuery+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("Bind:invokeLocal:list:orderQuery:"+orderQuery);
                 
                 if(filterMap!=null){
    	    		 Set<SerializableMap.Entry<String, String>> setFilterBind = filterMap.entrySet();
    	              for (SerializableMap.Entry<String, String> me : setFilterBind) {
    	               
    	   		     if("t1_crt_date".equals(me.getKey())){  
    	        	   //делаем фильтр на начало  
    	        	     st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
    	    	   
    	   		     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
    	    	    	 
    	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
    	    	    	 
    	    	     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-3".equals(me.getValue()))){
    	    	    	 
    	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_status = 'H' ";
    	    	    	 
    	    	     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-4".equals(me.getValue()))){
    	    	    	 
    	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_status = 'A' ";
    	    	    	 
    	    	     }else{
    	        		//делаем фильтр на начало
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	        	  }
    	              }
    	    	   }
                 log.info("Bind:invokeLocal:list:filterQuery:"+st);

             
               List<Object[]> lo=null;
               BaseItem ui = null;
               DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
                String user_ids= null;
               
              
      
					 lo=entityManager.createNativeQuery(
								(new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, "))
						         .append("t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name, t1.t1_org_code, ") 
						         .append("t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, ") 
						         .append("t1.t1_status, t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login, ")
						         .append("t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_iogv_bind_type, ") 
						         .append("t1_bin_flag ")
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
						     .append("AU_FULL.UP_BINDING t1_iogv_bind_type, decode (t4.BIN_UP_USERS, null, 0, 1 ) t1_bin_flag ")
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
						  .append("AC_USERS_KNL_T usr_upd, ") 
						  .append("(select BIN.UP_USERS BIN_UP_USERS ") 
						  .append("from BINDING_AUTO_LINK_BSS_T bin ") 
						  .append("group by BIN.UP_USERS) t4 ")
						  .append("where cl_org_full.ID_SRV= CL_ORG_ID ")
						  .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
						  .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
						  .append("and au_full.UP_SIGN = CL_ORG_CODE ")
						  .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
						  .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
						  .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
						  .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ") 
						  .append("and AU_FULL.ID_SRV=t4.BIN_UP_USERS(+) ")
						
					//!!!
					  .append("and AU_FULL.STATUS !=3 ")
					  .append(")t1 ")
					  .append(st!=null ? " where "+st :" where t1_usr_code is null ")
					  .append(orderQuery!=null ? orderQuery+", t1_fio " : " order by t1_fio ")
                      .toString())
              .setFirstResult(firstRow)
              .setMaxResults(numberOfRows)
              .getResultList();
               auditList = new ArrayList<BaseItem>();
               
               for(Object[] objectArray :lo){
            	   try{
            	     ui= new UserBindingItem(
            			   objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
            			   objectArray[1]!=null?objectArray[1].toString():"",
            			   objectArray[2]!=null?objectArray[2].toString():"",
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
            			   objectArray[15]!=null?Long.valueOf(objectArray[15].toString()):null,
            			   objectArray[16]!=null?df.format((Date)objectArray[16]) :"",
            			   objectArray[17]!=null?objectArray[17].toString():"",
            			   objectArray[18]!=null?objectArray[18].toString():"",
            			   objectArray[19]!=null?objectArray[19].toString():"",
            			   objectArray[20]!=null?objectArray[20].toString():"",
            			   objectArray[21]!=null?objectArray[21].toString():"",
            			   objectArray[22]!=null?objectArray[22].toString():"",
            			   objectArray[23]!=null?objectArray[23].toString():"",
            			   objectArray[24]!=null?Long.valueOf(objectArray[24].toString()):null,
            			   Integer.parseInt(objectArray[25].toString())
            			   );
            	     
            	     
            	     
            	     auditList.add(ui);
            	     
            	     idRec=objectArray[0].toString();
            	     
            	     resultIds.put(idRec, ui);
            	     
            	     
            	     if(user_ids==null){
            	    	 user_ids="'"+objectArray[0].toString()+"'";
            	     }else{
            	    	 user_ids+=", '"+objectArray[0].toString()+"'";
            	     }
            	     
            	   }catch(Exception e1){
            		   log.error("invokeLocal:for:error:"+e1);
            	   }
               }  
        
               log.info("Bind:invokeLocal:list:02");
             
             if(filterMap!=null && (filterMap.get("t1_iogv_bind_type")==null ||
            	"-2".equals(filterMap.get("t1_iogv_bind_type")) ||
            	"-3".equals(filterMap.get("t1_iogv_bind_type")))){
             
            	// для 2-х групп : 
            	// 1) не найденные
            	//  а) по умолчанию = null,
            	//  б) при установке = -2
            	// 2) не активные  = -3
            	 
                   
             log.info("invokeLocal:list:03:user_ids:"+user_ids);
             
                     
             lo=entityManager.createNativeQuery( 
              		(new StringBuilder("select BIN.UP_USERS t1_id, null t1_login, null t1_cert,  CL_USR_FULL.SIGN_OBJECT t1_usr_code, CL_USR_FULL.FIO t1_fio, "))
           		  .append(" CL_USR_FULL.PHONE t1_tel, CL_USR_FULL.EMAIL t1_email,  CL_USR_FULL.POSITION t1_pos, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_) t1_dep_name, CL_ORG_FULL.SIGN_OBJECT t1_org_code, ") 
           		  .append("CL_ORG_FULL.FULL_ t1_org_name,  CL_ORG_FULL.PREFIX || decode(CL_ORG_FULL.HOUSE, null, null, ','  ||CL_ORG_FULL.HOUSE  ) t1_org_adr,  CL_ORG_FULL.PHONE t1_org_tel, null t1_start, null t1_end, ") 
           		  .append("null t1_status, null t1_crt_date, null t1_crt_usr_login, null t1_upd_date, null t1_upd_usr_login, ") 
           		  .append(" CL_DEP_FULL.SIGN_OBJECT t1_dep_code,  CL_ORG_FULL.STATUS t1_org_status, CL_USR_FULL.STATUS t1_usr_status, CL_DEP_FULL.STATUS t1_dep_status, null t1_iogv_bind_type ") 
           		  .append(" ") 
           		  .append(" ") 
           		  .append(" from BINDING_AUTO_LINK_BSS_T bin, ") 
           		  .append(" (select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ") 
           		  .append(" from ISP_BSS_T cl_org ") 
           		  .append(" group by CL_ORG.SIGN_OBJECT) t1,  ") 
           		  .append("  (select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE  ") 
           		  .append("  from ISP_BSS_T cl_dep ") 
           		  .append("  group by CL_DEP.SIGN_OBJECT) t2,  ") 
           		  .append(" (select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ") 
           		  .append("  from ISP_BSS_T cl_usr ") 
           		  .append("  group by CL_usr.SIGN_OBJECT) t3,  ") 
           		  .append(" ") 
           		  .append(" ") 
           		  .append(" ISP_BSS_T cl_org_full, ") 
           		  .append(" ISP_BSS_T cl_dep_full, ") 
           		  .append(" ISP_BSS_T cl_usr_full ") 
           		  .append(" ") 
           		  .append(" where BIN.UP_USERS in (")
           			.append(user_ids)
         			  .append(") ") 
             		  .append(" ") 
             		  .append(" and substr(BIN.UP_ISP_SIGN_USER,1,3)||'00000'=t1.CL_ORG_CODE(+) ") 
             		  .append(" and CL_ORG_FULL.ID_SRV(+)=t1.CL_ORG_ID ") 
             		  .append(" ") 
             		  .append(" and substr(BIN.UP_ISP_SIGN_USER,1,5)||'000'=t2.CL_dep_CODE(+) ") 
             		  .append(" and CL_dep_FULL.ID_SRV(+)=t2.CL_dep_ID ") 
             		  .append(" ") 
             		  .append(" and BIN.UP_ISP_SIGN_USER=t3.CL_usr_CODE(+) ") 
             		  .append(" and CL_usr_FULL.ID_SRV(+)=t3.CL_usr_ID")
            		 .toString())
            		 .getResultList(); 
             
             for(Object[] objectArray :lo){
            	 
            	 log.info("Bind:invokeLocal:list:03");
            	 try{ 
            		 
            	  ui= new UserItem(
          			   objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
          			  objectArray[1]!=null?objectArray[1].toString():"",
          			  objectArray[2]!=null?objectArray[2].toString():"",
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
          			  objectArray[15]!=null?Long.valueOf(objectArray[15].toString()):null,
          			  objectArray[16]!=null?df.format((Date)objectArray[16]) :"",
          			  objectArray[17]!=null?objectArray[17].toString():"",
          			  objectArray[18]!=null?objectArray[18].toString():"",
          			  objectArray[19]!=null?objectArray[19].toString():"",
          			  objectArray[20]!=null?objectArray[20].toString():"",
          			  objectArray[21]!=null?objectArray[21].toString():"",
          			  objectArray[22]!=null?objectArray[22].toString():"",
          			  objectArray[23]!=null?objectArray[23].toString():"",
          			  objectArray[24]!=null?Long.valueOf(objectArray[24].toString()):null
          			   );
            	 
            	 idRec=objectArray[0].toString();
            	 
            	 if(((UserBindingItem)resultIds.get(idRec)).getBindingList()==null){
            		 ((UserBindingItem)resultIds.get(idRec)).setBindingList(new ArrayList<BaseItem>());
            	 }
            	 
            	 ((UserBindingItem)resultIds.get(idRec)).getBindingList().add(ui);
              }catch(Exception e1){
          		   log.error("invokeLocal:for2:error:"+e1);
          	   }
             }
             
             
			 }
             
             
			 } else if("count".equals(type)){
				 log.info("BindList:count:01");
				 
                 
                 if(filterMap!=null){
    	    		 Set<SerializableMap.Entry<String, String>> setFilterBind = filterMap.entrySet();
    	              for (SerializableMap.Entry<String, String> me : setFilterBind) {
    	             
    	           
    	              if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-2".equals(me.getValue()))){
     	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_code is null ";
    	              }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-3".equals(me.getValue()))){
     	    	    	 
     	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_status = 'H' ";
     	    	    	 
     	    	     }else if("t1_iogv_bind_type".equals(me.getKey())&&(me.getValue()!=null && "-4".equals(me.getValue()))){
    	    	    	 
    	    	    	 st=(st!=null?st+" and " :"")+" t1_usr_status = 'A' ";
    	    	    	 
    	    	     }else{
    	            	 st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	              }	 
     	    	 
    	            	  
    	              }
    	    	   }
				 
				
				 
				
				 auditCount = ((java.math.BigDecimal)entityManager.createNativeQuery(
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
						      .append("AU_FULL.UP_BINDING t1_iogv_bind_type, decode (t4.BIN_UP_USERS, null, 0, 1 ) t1_bin_flag  ")
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
						   .append("AC_USERS_KNL_T usr_upd, ")
						   .append("(select BIN.UP_USERS BIN_UP_USERS ") 
						   .append("from BINDING_AUTO_LINK_BSS_T bin ") 
						   .append("group by BIN.UP_USERS) t4 ")
						   .append("where cl_org_full.ID_SRV= CL_ORG_ID ")
						   .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
						   .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
						   .append("and au_full.UP_SIGN = CL_ORG_CODE ")
						   .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
						   .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
						   .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
						   .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ") 
						   .append("and AU_FULL.ID_SRV=t4.BIN_UP_USERS(+) ")
								 //!!!
						   .append("and AU_FULL.STATUS !=3 ")
						   .append(")t1 ")
						   .append(st!=null ? " where "+st :" where t1_usr_code is null ")
						   .toString())
               .getSingleResult()).longValue();
                 
                 
               log.info("Bind:invokeLocal:count:02:"+auditCount);
           	 } 
		}catch(Exception e){
			  log.error("Bind:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("Ошибка!");
		}
	}
	  /**
	  * Подготовка сущности 
	  * для последующих операций просмотра
	  */
   public void forView(String modelType) {
	   String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	  log.info("forView:sessionId:"+sessionId);
	  log.info("forView:modelType:"+modelType);
	  if(sessionId!=null ){
		  
		    if(modelType==null){
		    	return ;
		    }
			
	
		
		 
		 UserItem au = (UserItem)searchBean(sessionId);
		
	
	    	
    
 
	     Contexts.getEventContext().set("bindBeanView", au);
	    
	     AcUser uzp = entityManager.find(AcUser.class, Long.valueOf(sessionId));
	     Contexts.getEventContext().set("bindBeanViewUzp", uzp);
	  }
   }
   
   private BaseItem searchBean(String sessionId){
    	
      if(sessionId!=null){
    	 List<BaseItem> bindListCached = (List<BaseItem>)
				  Component.getInstance("bindListCached",ScopeType.SESSION);
		if(bindListCached!=null){
			for(BaseItem it : bindListCached){
				 
			  if(it.getBaseId().toString().equals(sessionId)){
					 log.info("searchBean_Achtung!!!");
					 return it;
			  }
			}
		 }
	   }
	   return null;
    }
    public Long getAuditCount(){
	   log.info("getAuditCount");
	 
	   invokeLocal("count",0,0,null);
	  
	   return auditCount;
	 }
   
   public void addBind(){
	   log.info("BindManager:addBind:01");
	   
	   AcUser bindBeanCrt = (AcUser)
				  Component.getInstance("bindBeanCrt",ScopeType.CONVERSATION);
	   
	   IspBssT clUsrBean = (IspBssT)
				  Component.getInstance("clUsrBean",ScopeType.CONVERSATION);
	 
	   IspBssT clOrgBean = (IspBssT)
				  Component.getInstance("clOrgBean",ScopeType.CONVERSATION);
	   
	   if(bindBeanCrt==null){
		   return;
	   }
	 
	   try {
	    	
		   log.info("hostsManager:addBind:clUsrBean:SignObject:"+clUsrBean.getSignObject());
					 
		   
	       if(!loginExist(bindBeanCrt.getLogin())) {
	    	   
	    	    
	    	   if(clUsrBean.getSignObject()!=null){
	    	   
	    		  
	    		   bindBeanCrt.setName1(" ");
	    		   bindBeanCrt.setName2(" ");
	    		   bindBeanCrt.setSurname(" ");
	    	
	    	
	    	  
	    	
	    	 bindBeanCrt.setUpSignUser(clUsrBean.getSignObject());
	    	 
	    	
	    	  bindBeanCrt.setUpSign(clUsrBean.getSignObject().substring(0,3)+"00000");
	    	  
	       }else{
	    	   	  bindBeanCrt.setUpSign(clOrgBean.getSignObject());
	       }
	    	 
	    	 if(bindBeanCrt.getCertificate()!=null&&!bindBeanCrt.getCertificate().trim().equals("")){
	    	   bindBeanCrt.setCertificate(bindBeanCrt.getCertificate().replaceAll(" ", "") .toUpperCase());
	          }else{
	           bindBeanCrt.setCertificate(null); 
	          }
	    	 
	    	 
	    	  AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION); 
	    	   
	    	  bindBeanCrt.setCreator(cau.getIdUser()); 
	    	  bindBeanCrt.setCreated(new Date());
	    	  entityManager.persist(bindBeanCrt);
	    	      
	    	   	     
	    	 	 entityManager.flush();
	    	  	 entityManager.refresh(bindBeanCrt);
	    	     
	    	  	 audit(ResourcesMap.USER, ActionsMap.CREATE); 
	    	  	 
	    	   }   
	          }catch (Exception e) {
	             log.error("bindManager:addBind:ERROR="+e);
	           }
	   
   }
   
   public void updBind(){
	   
	   log.info("hostsManager:updHosts:01");
	   
	   DateFormat df = new SimpleDateFormat ("dd.MM.yy");
	   DateFormat dfTime = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	   
	   AcUser bindBean = (AcUser)
				  Component.getInstance("bindBean",ScopeType.CONVERSATION);
	   
	   String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	   log.info("hostsManager:updBind:sessionId:"+sessionId);
	
	   if(bindBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		   
		  AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
		  
		  AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
		  
		  
		  if(aum.getUpSignUser()==null){
		   aum.setName1(bindBean.getName1());
		   aum.setName2(bindBean.getName2());
		   aum.setSurname(bindBean.getSurname());
		   aum.setEmail(bindBean.getEmail());
		   aum.setPhone(bindBean.getPhone());
		   aum.setPosition(bindBean.getPosition());
		   //нет setDepartment, так как на форме он disabled
		  }
			  
		  if(bindBean.getCertificate()!=null&&!"".equals(bindBean.getCertificate().trim())){
			  aum.setCertificate(bindBean.getCertificate().replaceAll(" ", "").toUpperCase());
	      }else{
	    	  aum.setCertificate(null);
	      }
		  
		  aum.setPassword(bindBean.getPassword());
		  
		 
		  if(bindBean.getStatus()!=null) { 
			  // статус при определённых условиях 
			  // <c:if test="#{param['onUpdate']!=null and currentUser.idUser!=bindBean.idUser}"> 
	          // <!--условие ослабленное, так как добавляется условие видимости кнопки 'изменить'.
	          //    изменить сам себя может только суперюзер-->
	          // <!--c:if test="#{currentUser.idUser!=linksMap.superUserCode or bindBean.idUser!=linksMap.superUserCode}"--> 
			  // disabled
		     aum.setStatus(bindBean.getStatus());
		     
		  // статус и старт/финиш идут одним блоком 
			  aum.setStart(bindBean.getStart());
			  aum.setFinish(bindBean.getFinish());
		  }
		  aum.setModificator(cau.getIdUser());
		  aum.setModified(new Date());
		  
		   
		  entityManager.flush();
		  
	    	  //pidBind - global переменная!!!
	    
		
	    	
	    	 entityManager.refresh(aum);
	    	  
	    	 
	    	 UserItem au = (UserItem)searchBean(sessionId);
	    	 
	    	 if(au!=null){
	    		 
	    		 if(aum.getUpSignUser()==null){
	    			   au.setFio(bindBean.getSurname()+" "+bindBean.getName1()+" "+bindBean.getName2());
	    			   au.setEmail(bindBean.getEmail());
	    			   au.setPhone(bindBean.getPhone());
	    			   au.setPosition(bindBean.getPosition());
	    			   //нет setDepartment, так как на форме он disabled
	    		 }
	    			  if(bindBean.getCertificate()!=null&&!"".equals(bindBean.getCertificate().trim())){
	    				  au.setCert(bindBean.getCertificate().replaceAll(" ", "").toUpperCase());
	    		      }else{
	    		    	  au.setCert(null);
	    		      }
	    			  
	    			
	    			 
	    			  if(bindBean.getStatus()!=null) { 
	    				  // статус при определённых условиях 
	    				  // <c:if test="#{param['onUpdate']!=null and currentUser.idUser!=bindBean.idUser}"> 
	    		          // <!--условие ослабленное, так как добавляется условие видимости кнопки 'изменить'.
	    		          //    изменить сам себя может только суперюзер-->
	    		          // <!--c:if test="#{currentUser.idUser!=linksMap.superUserCode or bindBean.idUser!=linksMap.superUserCode}"--> 
	    				  // disabled
	    			     au.setStatus(bindBean.getStatus());
	    			     
	    			     // статус и старт/финиш идут одним блоком 
	    			     au.setStart(bindBean.getStart()!=null?df.format(bindBean.getStart()):null);
		    			 au.setFinish(bindBean.getFinish()!=null?df.format(bindBean.getFinish()):null);
	    			  }
	    			  
	    			  
	    			  
	    			  au.setUpdUserLogin(cau.getLogin());
	    			  au.setUpdDate(dfTime.format(new Date()));
	    			  
	    			  Contexts.getEventContext().set("bindBeanView", au); 
	    	 }else{
	    		 
	    		 au = getUserItem(Long.valueOf(sessionId));
	    		 if(au!=null){
	    		   Contexts.getEventContext().set("bindBeanView", au); 
	    		 }
	    	 }
	    	 
	    	 audit(ResourcesMap.USER, ActionsMap.UPDATE); 
	    	 
	     }catch (Exception e) {
           log.error("BindManager:editBind:ERROR:"+e);
         }
   }
   
   private UserItem getUserItem(Long idUser){
	   
	   log.info("BindManager:getUserItem:idUser:"+idUser);
	   
	   UsrManager usrManager = (UsrManager)
		          Component.getInstance("usrManager");
	   
	   return usrManager.getUserItem(idUser);
	   
   }
 
 
 
  public void updBindRole(){
	   
	   log.info("bindManager:updBindRole:01");
	   
	   SerializableList<AcLinkUserToRoleToRaion> arList = new ArrayList<AcLinkUserToRoleToRaion>();
	   SerializableList<AcLinkUserToRoleToRaion> arRemovedList = new ArrayList<AcLinkUserToRoleToRaion>();
	   
	   AcUser bindBean = (AcUser)
				  Component.getInstance("bindBean",ScopeType.CONVERSATION);
	   
	   String idArm = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("idArm");
	   String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	   log.info("bindManager:updBind:idArm:"+idArm);
	   log.info("bindManager:updBind:sessionId:"+sessionId);
	
	   if(bindBean==null || sessionId==null || idArm==null){
		   return;
	   }
	
	   try {
		   
		  AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
	
		  log.info("bindManager:updBindRole:size1:"+aum.getAcLinkUserToRoleToRaions().size());
		  
		  for(AcLinkUserToRoleToRaion apl : aum.getAcLinkUserToRoleToRaions()){
			  
			  log.info("bindManager:updBindRole:AcApplication:"+apl.getAcRole().getAcApplication());
			  
			  if(apl.getAcRole().getAcApplication().equals(Long.valueOf(idArm))){
			       entityManager.remove(apl);
			       arRemovedList.add(apl);
			  }
		  }

		  for(AcLinkUserToRoleToRaion rem : arRemovedList){
			  aum.getAcLinkUserToRoleToRaions().remove(rem);
		  }
		   
		  entityManager.flush();
		  
		  log.info("bindManager:updBindRole:size2:"+aum.getAcLinkUserToRoleToRaions().size());
			  
		   for(BaseItem rol:this.roleList){
	    			  log.info("BindManager:editBind:updBindRole:"+((AcRole)rol).getRoleTitle());
	    			  log.info("BindManager:editBind:updBindRole:"+((AcRole)rol).getUsrChecked());
	    			  
	    			  if(((AcRole)rol).getUsrChecked().booleanValue()){
	    			            AcLinkUserToRoleToRaion au = new AcLinkUserToRoleToRaion(((AcRole)rol).getIdRol(), Long.valueOf(sessionId));
	    			            au.setCreated(new Date());
	    			            au.setCreator(Long.valueOf(1));
	    			            arList.add(au);
	    			  }
	    		  }
	     	  
	     	if(arList.size()>0){
	    	 	//  @OneToMany(mappedBy="acHost", cascade={CascadeType.PERSIST, CascadeType.REFRESH})
	    		  aum.getAcLinkUserToRoleToRaions().addAll(arList) ;
	    	}
	    	log.info("bindManager:updBindRole:size3:"+aum.getAcLinkUserToRoleToRaions().size());
	    	  
	        entityManager.flush();
	    	 
	        entityManager.refresh(aum);
	    	
            UserItem au = (UserItem)searchBean(sessionId);
	    	 
	    	if(au!=null){
	    		Contexts.getEventContext().set("bindBeanView", au); 
	    	}else{
	    		 au = getUserItem(Long.valueOf(sessionId));
	    		 if(au!=null){
	    		   Contexts.getEventContext().set("bindBeanView", au); 
	    		 }
	    	 }
	    	 
	    	audit(ResourcesMap.USER, ActionsMap.UPDATE_ROLE); 
	    	
	     }catch (Exception e) {
           log.error("BindManager:editBindRole:ERROR:"+e);
         }
   }
  
  public void updBindGroup(){
	   
	   log.info("bindManager:updBindRole:01");
	   

  }
  
   public void unBindRecords(){
	 try{
		log.info("bindManager:unBindRecords:01");  
		
		String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId_crack");
        log.info("bindManager:unBindRecords:sessionId_crack:"+sessionIdCrack);
		
		if(sessionIdCrack==null){
			return;
		}
		 
	    AcUser usrBean = (AcUser)
				  Component.getInstance("usrBean",ScopeType.CONVERSATION);
		
		AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
	    
		 
	    if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
	    	   //пользователь имеет право только создать заявку 
	    	   //на привязку ИОГВ
	    	   
	    	   unBindUsrApp(Long.valueOf(sessionIdCrack), cau.getIdUser(), CUDConstants.appAttributeEmptyValue, usrBean);
	    	   
	    }else{
	    	
				AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionIdCrack));
				
			  //!!! обязательно сначала лог, а потом изменение пользователя
			  //для сохранения aum.getUpSignUser
				 entityManager.createNativeQuery(
				          "insert into BINDING_LOG_T(ID_SRV, UP_USERS, UP_ISP_SIGN_USER, UP_BINDING, CREATOR, CREATED) " 
		      	 		  + "values(BINDING_LOG_SEQ.nextval, ?, ?, ?, ?, sysdate) ")
			              .setParameter(1, Long.valueOf(sessionIdCrack))
			              .setParameter(2, aum.getUpSignUser())
			              .setParameter(3, 0L)
			              .setParameter(4, cau.getIdUser())
					      .executeUpdate();
				 
			    
			       aum.setUpSignUser(null);
			    
			       aum.setName1(usrBean.getName1());
				   aum.setName2(usrBean.getName2());
				   aum.setSurname(usrBean.getSurname());
				   aum.setEmail(usrBean.getEmail());
				   aum.setPhone(usrBean.getPhone());
				   aum.setPosition(usrBean.getPosition());
				   //добавляем изменение подразделения
				   aum.setDepartment(usrBean.getDepartment());
			    
				   entityManager.flush();
				   
				  
				   
			    	
	       }
		   
		 audit(ResourcesMap.BINDING_IOGV, ActionsMap.DELETE); 
		   
	 }catch(Exception e){
		 log.error("bindManager:unBindRecords:error:"+e); 
	 }
   }
   
   public void unReBindRecords(){
		 try{
			log.info("bindManager:unReBindRecords:01");  
			
			String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId_crack");
	      
			//новый код 
	        String preLastCode = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("preLastCode");
	        
	        //новый тип привязки 
			String preLastBindType = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("preLastBindType");
		/*	
			  //текущий код 
		    String currS/ignObject = Face/sContext.getCurrentInstance(/)/.getExternalContext()
				        .getReques/tParameterMap()
				        .get("currSignObj/ect");
		       
		      //текущий тип привязки 
		    String currB/indType = /FacesContext.getCurrentInstance()/.getExternalContext()
				        .getReques/tParameterMap()
				        .get("c/urrBindType");*/
		       
	        log.info("bindManager:unReBindRecords:sessionId_crack:"+sessionIdCrack);
	        log.info("bindManager:unReBindRecords:preLastCode:"+preLastCode);
	        log.info("bindManager:unReBindRecords:preLastBindType:"+preLastBindType);
	       
	       
	        
			if(sessionIdCrack==null
					||preLastCode==null||preLastCode.isEmpty()
					||preLastBindType==null||preLastBindType.isEmpty()
					/*||cur/rSignObject==null||cur/SignObject/.isEmpty()
					||currB/indType==nul/l||currBindTy/pe.isEmp/ty()*/){
				return;
			}
			 
			AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
		    
				 
		       if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    	   //пользователь имеет право только создать заявку 
		    	   //на привязку ИОГВ
		    	   
		    	   bindUsrApp(Long.valueOf(sessionIdCrack), cau.getIdUser(), preLastCode);
		    	   
		       }else{
			
					// !!!НЕТ - В историю идут текущие (заменяемые) данные
					// !!!ДА - В историю идут новые  данные
				    entityManager.createNativeQuery(
					          "insert into BINDING_LOG_T(ID_SRV, UP_USERS, UP_ISP_SIGN_USER, UP_BINDING, CREATOR, CREATED) " 
			       	 		  + "values(BINDING_LOG_SEQ.nextval, ?, ?, ?, ?, sysdate) ")
				              .setParameter(1, Long.valueOf(sessionIdCrack))
				             // /.setParam/eter(2, /aum.getUpSignUser())
				           // /.setParameter(2, cu/rrSignObject)
				              .setParameter(2, preLastCode)
				           //   .setParameter(3, cu/rrBindType)
				              .setParameter(3, 4L)
				              .setParameter(4, cau.getIdUser())
						      .executeUpdate();
				       
				     entityManager.createNativeQuery(
				    		        "update AC_USERS_KNL_T au " 
							        + "set au.UP_SIGN_USER=?, au.UP_BINDING=? "
					                + "where au.ID_SRV=? ")
					              .setParameter(1, preLastCode)
					              .setParameter(2, 4L)
					             // ./setParameter(2, new Lon/g(preLastBindType))
					              .setParameter(3, Long.valueOf(sessionIdCrack))
							      .executeUpdate();
					
				     audit(ResourcesMap.BINDING_IOGV, ActionsMap.DELETE); 
			
		   }
		       
		 }catch(Exception e){
			 log.error("bindManager:unReBindRecords:error:"+e); 
		 }
	   }
 
   
   public void beforeSearch() {
	   log.info("bindManager:beforeSearch");
	   
	   try{
		  String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
		  log.info("bindManager:beforeSearch:sessionId:"+sessionId);
		 
		  String searchFio = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("searchFio");
		  log.info("bindManager:beforeSearch:searchFio:"+searchFio);
		  
		  String[] fio = searchFio.trim().split("\\s+");
		  for(int i=0; i<3; i++ ){
			if(i<fio.length){
				 this.fioArray[i]=fio[i];
			 }
		  }
			      	
		  search();	
		   
	   }catch(Exception e){
		 log.error("bindManager:beforeSearch:error:"+e);
	   }
   }
   
   public void search() {
	   
	   log.info("bindManager:search:01");
	    
	   // MaxResults 100!
	   
	   String fam=null, name=null, otch = null;
	   String search_str=null;
	   UserItem ui = null;
       DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
     		   
	   try{
	   
	     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
		 log.info("bindManager:search:sessionId:"+sessionId);
		   
	     if(sessionId==null){
	    	 return;
	     }
	  
	     
	       
	     fam = this.fioArray[0].trim();	     
	     name = this.fioArray[1].trim();	  
	     otch = this.fioArray[2].trim();	  
	     
	     log.info("bindManager:search:fio:"+fam+" "+name+" "+otch);
	    
	   
	     
	     if(!"".equals(fam)&&!"".equals(name)&&!"".equals(otch)){
	    	 search_str=fam+" "+name+" "+otch+"%";
	     }else if("".equals(fam)&&!"".equals(name)&&!"".equals(otch)){
	    	 search_str="% "+name+" "+otch+"%";
	     }else if(!"".equals(fam)&&"".equals(name)&&!"".equals(otch)){
	    	 search_str=fam+" % "+otch+"%";
	     }else if(!"".equals(fam)&&!"".equals(name)&&"".equals(otch)){
	    	 search_str=fam+" "+name+" %";
	     }else if("".equals(fam)&&"".equals(name)&&!"".equals(otch)){
	    	 search_str="% "+otch+"%";
	     }else if(!"".equals(fam)&&"".equals(name)&&"".equals(otch)){
	    	 search_str=fam+" %";
	     }else if("".equals(fam)&&!"".equals(name)&&"".equals(otch)){
	    	 search_str="% "+name+" %";
	     }else{
	    	 //не поддерживается
	     }
	     
	     log.info("bindManager:search:search_str:"+search_str);
	     
	    
	     
	     UserItem au = (UserItem)searchBean(sessionId);
	     
	     SerializableList<Object[]> applicant_list  = (SerializableList<Object[]>) entityManager.createNativeQuery(
					      
             	 (new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name, "))
	    		   .append("t1.t1_org_code, t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, t1.t1_status, ")
	    		   .append("t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login, ")
	    		   .append("t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_iogv_bind_type ")
	    		   .append("from( ")
	    		   .append("select USR.ID_SRV t1_id, null t1_login, USR.SIGN_OBJECT t1_usr_code, null t1_cert, USR.FIO t1_fio, ")
	    		   .append("USR.POSITION t1_pos, USR.PHONE t1_tel, USR.EMAIL t1_email,DEP.FULL_ t1_dep_name, ORG.SIGN_OBJECT t1_org_code, ")
	    		   .append("ORG.FULL_ t1_org_name, ORG.PREFIX || decode(ORG.HOUSE, null, null, ','  ||ORG.HOUSE  ) t1_org_adr, ORG.PHONE t1_org_tel, ")
	    		   .append("null t1_start, null t1_end, ")
	    		   .append("null t1_status,null t1_crt_date, null t1_crt_usr_login, ")
	    		   .append("null t1_upd_date, ")
	    		   .append("null t1_upd_usr_login, DEP.SIGN_OBJECT t1_dep_code, ORG.STATUS t1_org_status, USR.SIGN_OBJECT t1_usr_status, DEP.STATUS t1_dep_status, ") 
	    		   .append("null t1_iogv_bind_type ")
	    		   .append("from ISP_BSS_T usr, ISP_BSS_T org, ISP_BSS_T dep, ")
	    		   .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
	    		   .append("from ISP_BSS_T cl_org ")
	    		   .append("group by CL_ORG.SIGN_OBJECT)  org_narrow, ")
	    		   .append("(select max(CL_dep.ID_SRV) CL_dep_ID,  CL_dep.SIGN_OBJECT  CL_dep_CODE ")
	    		   .append("from ISP_BSS_T cl_dep ")
	    		   .append("group by CL_dep.SIGN_OBJECT)  dep_narrow ")
	    		   .append("where lower(usr.FIO) like  lower('")
	    		   .append(search_str)
	    		   .append("') ")
	    		   .append("and usr.STATUS='A' ")
	    		   .append("and substr(USR.SIGN_OBJECT ,1,3)||'00000'  = org_narrow.CL_ORG_CODE(+) ")
	    		   .append("and ORG.ID_SRV(+)=org_narrow.CL_ORG_ID ")
	    		   .append("and substr(USR.SIGN_OBJECT ,1,5)||'000'  = dep_narrow.CL_dep_CODE(+) ")
	    		   .append("and dep.ID_SRV(+)=dep_narrow.CL_dep_ID ") 
	    		   .append("and (ORG.SIGN_OBJECT = :org_code or 1= :not_org_code_flag) ") 
	    		   .append("order by t1_fio ")
	    		   .append(") t1 ")
	    		   .toString())
	    		.setParameter("org_code", au.getOrgCode()) 
	    		.setParameter("not_org_code_flag", this.searchOrgExact!=null&&this.searchOrgExact.booleanValue()==true?0:1) 
	 			.setMaxResults(100)
	    		.getResultList();
	     
	     log.info("bindManager:search:list:size:"+applicant_list.size());
	     
	     applicantList= new ArrayList<BaseItem>();
	     
	     for(Object[] objectArray :applicant_list){
	    	 
	    	 try{
        	     ui= new UserItem(
        			  objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
        			  objectArray[1]!=null?objectArray[1].toString():"",
        			  objectArray[2]!=null?objectArray[2].toString():"",
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
        			  objectArray[15]!=null?Long.valueOf(objectArray[15].toString()):null,
        			  objectArray[16]!=null?df.format((Date)objectArray[16]) :"",
        			  objectArray[17]!=null?objectArray[17].toString():"",
        			  objectArray[18]!=null?objectArray[18].toString():"",
        			  objectArray[19]!=null?objectArray[19].toString():"",
        			  objectArray[20]!=null?objectArray[20].toString():"",
        			  objectArray[21]!=null?objectArray[21].toString():"",
        			  objectArray[22]!=null?objectArray[22].toString():"",
        			  objectArray[23]!=null?objectArray[23].toString():"",
        			  objectArray[24]!=null?Long.valueOf(objectArray[24].toString()):null
        			   );
        	     applicantList.add(ui);
        	   }catch(Exception e1){
        		   log.error("invokeLocal:for:error:"+e1);
        	   } 
	    	 
	     }
	   
	     Contexts.getEventContext().set("bindBeanViewList", Arrays.asList(au));
	     
	   }catch(Exception e){
		 log.error("bindManager:search:"+e);
	   }
   } 
   
   public void bindRecords() {
	  //берётся sessionId_crack, а не sessionId,
	  //чтобы при reRender не напоминать событие выбора записи 
	   
	   log.info("bindManager:bindRecords:01");
	   try{
		   String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId_crack");
           log.info("bindManager:bindRecords:sessionId_crack:"+sessionIdCrack);
		   
		   String signObject = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("signObject");
	       log.info("bindManager:bindRecords:signObject:"+signObject);
	       
	       
	       if(sessionIdCrack==null||signObject==null){
	    	   return;
	       }
	       
	       AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
	       
	    	 
	       if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
	    	   //пользователь имеет право только создать заявку 
	    	   //на привязку ИОГВ
	    	   
	    	   bindUsrApp(Long.valueOf(sessionIdCrack), cau.getIdUser(), signObject);
	    	   
	       }else{
	       
	       
			       entityManager.createNativeQuery(
		  		            "insert into BINDING_LOG_T(ID_SRV, UP_USERS, UP_ISP_SIGN_USER, UP_BINDING, CREATOR, CREATED) " 
		         	 		+ "values(BINDING_LOG_SEQ.nextval, ?, ?, ?, ?, sysdate) ")
			              .setParameter(1, Long.valueOf(sessionIdCrack))
			              .setParameter(2, signObject)
			              .setParameter(3, 2L)
			              .setParameter(4, cau.getIdUser())
					      .executeUpdate();
			       
			       entityManager.createNativeQuery(
			    		        "update AC_USERS_KNL_T au " 
						        + "set au.UP_SIGN_USER=?, au.UP_BINDING=? "
				                + "where au.ID_SRV=? ")
				              .setParameter(1, signObject)
				              .setParameter(2, 2L)
				              .setParameter(3, Long.valueOf(sessionIdCrack))
						      .executeUpdate();
			     
			    /*   //удаляем предполагаемые привязки полученные на автомате 
			      // надо ещё подумать об этом действии
			       
			       entityM/anager.cre/ateNativeQuery(
		   		           "del/ete /from BINDING_AUTO_LINK_BSS_T tt/  "
			               + "whe/re tt.UP_USERS=? ")
			              .setP/ar/ameter(1, new Long/(sessionId_crack))
					      .execu/teUpdate();*/
		    
			       audit(ResourcesMap.BINDING_IOGV, ActionsMap.CREATE); 
	       }
	       
	   }catch(Exception e){
		   log.error("bindManager:bindRecords:error::"+e);
	   }
   }
   
  private void bindUsrApp(Long userApp, Long userCreator, String userIOGV){
	   
	   log.info("bindManager:bindUsrApp:01");
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
				   (new StringBuilder("insert into JOURN_APP_USER_MODIFY_BSS_T (ID_SRV, "))
	                 .append("SIGN_USER, ") 
	     		     .append("UP_USER_APP, UP_USER, SECRET ) ") 
	     		     .append("values ( JOURN_APP_USER_MODIFY_SEQ.nextval, ?, ?, ?, ? ) ")
	   .toString())
			 	     		    .setParameter(1, userIOGV)
			 	     		    .setParameter(2, userApp)
			 	     		    .setParameter(3, userCreator)
			 	     		    .setParameter(4, secret)
			 	    .executeUpdate();
			
	   }catch(Exception e){
		   log.error("bindManager:bindUsrApp:error:"+e);
	   }
	   
   }
   
  private void unBindUsrApp(Long userApp, Long userCreator, String userIOGV, AcUser usrBean){
	   
	  //userIOGV должен = CUDConstants.appAttributeEmptyValue
	  
	   log.info("bindManager:unBindUsrApp:01");
	   
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
				   (new StringBuilder("insert into JOURN_APP_USER_MODIFY_BSS_T (ID_SRV, "))
	                 .append("SIGN_USER, ") 
	                 .append("SURNAME_USER, NAME_USER, PATRONYMIC_USER, ") 
	                 .append("POSITION_USER, EMAIL_USER, PHONE_USER, NAME_DEPARTAMENT, ") 
	     		     .append("UP_USER_APP, UP_USER, SECRET ) ") 
	     		     .append("values ( JOURN_APP_USER_MODIFY_SEQ.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ")
	     		     .toString())
			 	     		    .setParameter(1, userIOGV)
			 	     		    .setParameter(2, usrBean.getSurname())
			 	     		    .setParameter(3, usrBean.getName1())
			 	     		    .setParameter(4, usrBean.getName2())
			 	     		    .setParameter(5, usrBean.getPosition())
			 	     		    .setParameter(6, usrBean.getEmail())
			 	     		    .setParameter(7, usrBean.getPhone())
			 	     		    .setParameter(8, usrBean.getDepartment())
			 	     		    .setParameter(9, userApp)
			 	     		    .setParameter(10, userCreator)
			 	     		    .setParameter(11, secret)
			 	    .executeUpdate();
		   
	   }catch(Exception e){
		   log.error("bindManager:unBindUsrApp:error:"+e);
	   }
	   
  }
   public void reBindRecords() {
		  //берётся sessionId_crack, а не sessionId,
		  //чтобы при reRender не напоминать событие выбора записи 
		   
		   log.info("bindManager:reBindRecords:01");
		   try{
			   String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId_crack");
	           log.info("bindManager:reBindRecords:sessionId_crack:"+sessionIdCrack);
			   
			   //новый код
	           String signObject = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("signObject");
		       log.info("bindManager:reBindRecords:signObject:"+signObject);
		       
		       //текущий код 
		       String currSignObject = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("currSignObject");
		       log.info("bindManager:reBindRecords:currSignObject:"+currSignObject);
		       
		      //текущий тип привязки 
		       String currBindType = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("currBindType");
		       log.info("bindManager:reBindRecords:currBindType:"+currBindType);
		       
		       if(sessionIdCrack==null||signObject==null||currSignObject==null||currBindType==null){
		    	   return;
		       }
		       
		       AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
			     
		    	 
		       if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    	   //пользователь имеет право только создать заявку 
		    	   //на привязку ИОГВ
		    	   
		    	   bindUsrApp(Long.valueOf(sessionIdCrack), cau.getIdUser(), signObject);
		    	   
		       }else{
		    	   
				       // !!! НЕТ - В историю идут текущие (заменяемые) данные
				       // !!! ДА - в историю идут сразу новые данные
				       entityManager.createNativeQuery(
			  		            "insert into BINDING_LOG_T(ID_SRV, UP_USERS, UP_ISP_SIGN_USER, UP_BINDING, CREATOR, CREATED) " 
			         	 		+ "values(BINDING_LOG_SEQ.nextval, ?, ?, ?, ?, sysdate) ")
				              .setParameter(1, Long.valueOf(sessionIdCrack))
				            //  ./setParameter(2, currSig/nObject)
				              .setParameter(2,signObject)
				            //  ./setParameter(3, new Lo/ng(currBindType))
				              .setParameter(3, 3L)
				              .setParameter(4, cau.getIdUser())
						      .executeUpdate();
				       
				       entityManager.createNativeQuery(
				    		        "update AC_USERS_KNL_T au " 
							        + "set au.UP_SIGN_USER=?, au.UP_BINDING=? "
					                + "where au.ID_SRV=? ")
					              .setParameter(1, signObject)
					              .setParameter(2, 3L)
					              .setParameter(3, Long.valueOf(sessionIdCrack))
							      .executeUpdate();
				     
				       audit(ResourcesMap.BINDING_IOGV, ActionsMap.UPDATE);  
		       
		       }
		       
		   }catch(Exception e){
			   log.error("bindManager:reBindRecords:error::"+e);
		   }
	   }
   
   public void changeBind() {
	   
	   log.info("bindManager:changeBind:01");
		  
	   String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId_crack");
       log.info("bindManager:changeBind:sessionId_crack:"+sessionIdCrack);
     
       
	   try{
		   IspBssT clUsrBean = (IspBssT)
					  Component.getInstance("clUsrBean",ScopeType.CONVERSATION);

		   if(clUsrBean.getSignObject()!=null){
			   
			   AcUser cau = getCurrentUser();
				
				
			   if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    	   //пользователь имеет право только создать заявку 
		    	   //на привязку ИОГВ
		    	   
		    	   bindUsrApp(Long.valueOf(sessionIdCrack), cau.getIdUser(), clUsrBean.getSignObject());
		    	   
		       }else{
			   
				   entityManager.createNativeQuery(
		    		        "update AC_USERS_KNL_T au " 
					        + "set au.UP_SIGN_USER=? "
			                + "where au.ID_SRV=? ")
			              .setParameter(1, clUsrBean.getSignObject())
			              .setParameter(2, Long.valueOf(sessionIdCrack))
					      .executeUpdate();
				   
				   // !!! ДА - в историю идут сразу новые данные
			       entityManager.createNativeQuery(
		  		            "insert into BINDING_LOG_T(ID_SRV, UP_USERS, UP_ISP_SIGN_USER, UP_BINDING, CREATOR, CREATED) " 
		         	 		+ "values(BINDING_LOG_SEQ.nextval, ?, ?, ?, ?, sysdate) ")
			              .setParameter(1, Long.valueOf(sessionIdCrack))
			            //  ./setParameter(2, /currSignObject)
			              .setParameter(2, clUsrBean.getSignObject())
			            //  ./setParameter/(3, n/ew Long(currBindType))
			              .setParameter(3, 3L)
			              .setParameter(4, getCurrentUser().getIdUser())
					      .executeUpdate();
		       
		       }
		       
		   }
		   
		   audit(ResourcesMap.BINDING_IOGV, ActionsMap.UPDATE); 
		   
	   }catch(Exception e){
		   log.error("bindManager:changeBind:error:"+e);
	   }  
   }
   public void forViewUpdDel() {
	   try{
	     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	     log.info("forViewUpdDel:sessionId:"+sessionId);
	     if(sessionId!=null){
	    	 AcUser ah = entityManager.find(AcUser.class, Long.valueOf(sessionId));
	     	 
	    	 if(ah!=null){
	    		 
	    		 UserItem ui = getUserItem(Long.valueOf(sessionId));
	    		
	    		 ah.setOrgName(ui.getOrgName());
	    		 
	    		 if(ah.getUpSignUser()!=null){
	    			 ah.setFio(ui.getFio());
	    			 ah.setPosition(ui.getPosition());
	    			 ah.setPhone(ui.getPhone());
	    			 ah.setEmail(ui.getEmail());
	    		 }
	    	 }
	    	 
	    	 Contexts.getEventContext().set("bindBean", ah);
	     }
	   }catch(Exception e){
		   log.error("forViewUpdDel:Error:"+e);
	   }
   } 
   
   public void forViewCrt() {
	   try{
		   
	     log.info("forViewCrt");
	     
	     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	     log.info("forViewCrt:sessionId:"+sessionId);
	     
	     UserItem ui = getUserItem(Long.valueOf(sessionId));
	     Contexts.getEventContext().set("contextBeanView", ui);
	     
		     
	   }catch(Exception e){
		 log.error("forViewCrt:Error:"+e);
	   }
   } 
   
   public void forViewUnBindMessage() {
		  String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("sessionId");
		  log.info("forViewUnBindMessage:sessionId:"+sessionId);
		  if(sessionId!=null){
			  
		
			
		    	 AcUser ah = entityManager.find(AcUser.class, Long.valueOf(sessionId));
		     	 
		    	 if(ah!=null){
		    		 
		    		 UserItem ui = getUserItem(Long.valueOf(sessionId));
		    		
		    		
		    		 
		    		 if(ah.getUpSignUser()!=null){
		    			 
		    			 if(ui.getFio()!=null){
		    				 
		    			   String[] fio = ui.getFio().trim().split("\\s+");
		    			   
		    			   if(fio!=null){
		    				 
		    				 if(fio.length>=1){
		    				  ah.setSurname(fio[0]);
		    				 } 
		    				 if(fio.length>=2){
		    			      ah.setName1(fio[1]);
		    				 }
		    				 if(fio.length>=3){
		    			       ah.setName2(fio[2]);
		    				 }
		    			
		    			   }
		    			 }
		    			 
		    			 ah.setDepartment(ui.getDepartment());
		    			 ah.setPosition(ui.getPosition());
		    			 ah.setPhone(ui.getPhone());
		    			 ah.setEmail(ui.getEmail());
		    		 }
		    	 }
		    	 
		    	 Contexts.getEventContext().set("usrBean", ah);
		 }	
    }
   
    public void forViewUnReBindMessage() {
		  String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("sessionId");
		  log.info("forViewUnReBindMessage:sessionId:"+sessionId);
		  
		 
		  
		  try{
		  
		  if(sessionId!=null){
			  
			 //без привязки (прошлое)
			
		  try{
	 
			  
			  UserItem au = (UserItem)searchBean(sessionId);
		    	 
		      if(au==null){
		    	 au = getUserItem(Long.valueOf(sessionId));
		      }
			
				  
			  Contexts.getEventContext().set("reBindBeanView", au);
			  
		  }catch(NoResultException ex){
			  log.error("forViewUnReBindMessage:NoResultError:"+ex);
		  }    
				 
		}	
	  }catch(Exception e){
		log.error("forViewUnReBindMessage:Error:"+e);
	   }    
   }
    
    public SerializableList<BaseItem> getHistoryBindingList() throws Exception{
	    log.info("BindManager:getHistoryBindingList:01");
	    
	    List<Object[]> bindings  = null;
	    UserItem ui = null;
	    BindingItem bi = null;
	    DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	    
	    String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("sessionId");
		log.info("getHistoryBindingList:sessionId:"+sessionId);
		 
		String usrCodeFlag = FacesContext.getCurrentInstance().getExternalContext()
					.getRequestParameterMap()
					.get("usrCodeFlag");
		log.info("getHistoryBindingList:usrCodeFlag:"+usrCodeFlag);
		
	    try {
	    	if(historyBindingList==null){
	    		 bindings  = entityManager.createNativeQuery(
						    (new StringBuilder("select  BL.UP_ISP_SIGN_USER user_code, BL.ID_SRV, BL.UP_BINDING, "))
						      .append("CL_USR_FULL.FIO, CL_USR_FULL.POSITION, ") 
						      .append("decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_) t1_dep_name, ") 
						      .append("CL_USR_FULL.STATUS, ") 
						      .append("BL.CREATED ")
	                         .append("from BINDING_LOG_T bl, ")
	                          .append("ISP_BSS_T cl_usr_full, ") 
	                          .append("ISP_BSS_T cl_dep_full, ")
	                         .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
	                         .append("from ISP_BSS_T cl_usr ")
	                          .append("group by CL_usr.SIGN_OBJECT) t1, ") 
	                          .append("(select max(CL_dep.ID_SRV) CL_dep_ID,  CL_dep.SIGN_OBJECT  CL_dep_CODE ")
	                         .append("from ISP_BSS_T cl_dep ")
	                          .append("group by CL_dep.SIGN_OBJECT) t2 ")
	                         .append("where BL.UP_USERS=? ")
	                          .append("and BL.UP_BINDING in (1, 2, 3, 4) ")
	                          .append("and BL.UP_ISP_SIGN_USER=CL_USR_CODE ")
	                          .append("and CL_USR_FULL.ID_SRV=CL_USR_ID ") 
	                          .append("and substr(BL.UP_ISP_SIGN_USER,1,5)||'000'=CL_dep_CODE(+) ")
	                          .append("and CL_dep_FULL.ID_SRV=CL_dep_ID ")
	                          .append("order by BL.ID_SRV desc ")
						    .toString())
				    	.setParameter(1, Long.valueOf(sessionId)) 
				    	.getResultList();
	    		 
	    		 historyBindingList=new ArrayList<BaseItem>();
	    		 
	    		 if(usrCodeFlag==null){
	    			 // сейчас - отвязанный пользователь
	    			 // для корректного отображения истории ему надо 
	    			 //(в таблице привязок у нас начинается отчёт со 2-ой строки;
	    			 //1-я строка - текущая привязка) добавить пустой элемент в начало списка
	    			 //на странице ограничение на вывод первого элемента списка -  <c:if test="#{psram['usrCodeFlag']!=null}">  
	    			 
	    			 historyBindingList.add(null);
	    		 }
	    		 
	    		 
	    		 for(Object[] objectArray : bindings){
	    	    	 
	    			
	    			 
	    	    	 ui= new UserItem();
	    	    	 
	    	    	 ui.setUsrCode(objectArray[0].toString());
                 	 ui.setFio(objectArray[3].toString());
	    	    	 ui.setPosition(objectArray[4]!=null?objectArray[4].toString():"");
	    	    	 ui.setDepartment(objectArray[5]!=null?objectArray[5].toString():"");
	    	    	 ui.setUsrIogvStatus(objectArray[6].toString());
	    	    	
	    	    	 
	    	    	 
	    	    	 bi = new BindingItem(Long.valueOf(objectArray[1].toString()), 
	    	    			              ui, 
	    	    			              df.format((Date)objectArray[7]),
	    	    			              Integer.parseInt(objectArray[2].toString()));
	    	    	 
	    	    	 
	    	    	 historyBindingList.add(bi);
	         	 }
	    	}
	     } catch (Exception e) {
	    	 log.error("BindManager:getHistoryBindingList:ERROR:"+e);
	         throw e;
	     }
	    return new ArrayList<BaseItem>(historyBindingList);
   }
   public void setHistoryBindingList(SerializableList<BaseItem> historyBindingList){
	   this.historyBindingList=historyBindingList;
   } 
  
   
  public void runBinding(){
	   
	   log.info("BindManager:runBinding:01");
	   
	   BaseParamItem bpi = null;
	   ResourcesMap rsm = null;	   
	   try{
		   String typeBinding = FacesContext.getCurrentInstance().getExternalContext()
					.getRequestParameterMap()
					.get("typeBinding");
			log.info("BindManager:runBinding:typeBinding:"+typeBinding);
		   
			
		   if(typeBinding==null||typeBinding.isEmpty()){
				return;
		   }
			
		   if("bindingNoAct".equals(typeBinding)){
		       if(BindingProcessor.getControls().contains("binding_no_act")){
			       log.info("BindManager:runBinding:return");
			       return;
		       }
		       bpi = new BaseParamItem(ServiceReestrPro.BindingNoAct.name());
		       
		       rsm=ResourcesMap.PROC_BIND_NOACT;
		       
		   }else{   //bindingUnBind
			   if(BindingProcessor.getControls().contains("binding_un_bind")){
				   log.info("BindManager:runBinding:return");
				   return;
			   }
			   bpi = new BaseParamItem(ServiceReestrPro.BindingUnBind.name());
			   
			   rsm=ResourcesMap.PROC_BIND_UNBIND;
			   
		   }
		   
		   Context ctx = new InitialContext(); 
	    	 
	       bpi.put("gactiontype", ServiceReestrAction.TASK_RUN.name());
	       
	       IRemoteFrontageLocal obj = (IRemoteFrontageLocal)ctx.lookup(jndiBinding);
        
           obj.run(bpi);
   
           audit(rsm, ActionsMap.START); 
               
	   }catch (Exception e) {
	   	 log.error("BindManager:runBinding:ERROR:"+e);
	   }
   }

   
   public void resetBinFlag() {
	   
	  log.error("BindManager:resetBinFlag:01");
	  try{
		  
	   String typeFilter = FacesContext.getCurrentInstance().getExternalContext()
					.getRequestParameterMap()
					.get("typeFilter");
	   log.info("BindManager:resetBinFlag:typeFilter:"+typeFilter);
		
	   if("rezim".equals(typeFilter)) {
	   
	      BindStateHolder bindStateHolder = (BindStateHolder)
				  Component.getInstance("bindStateHolder",ScopeType.SESSION);
	      Map<String, String> filterMap = bindStateHolder.getColumnFilterValues();
	   
	      if(filterMap!=null){
		   //при любом переключении t1_iogv_bind_type сбрасываем t1_bin_flag
		    if(filterMap.get("t1_iogv_bind_type")!=null /*&& filterMap.get("t1_iogv_bind_type").equals("-4")*/){
			   filterMap.remove("t1_bin_flag");
		    }
	      }
	   
	   }
	   
     }catch (Exception e) {
	   	 log.error("BindManager:resetBinFlag:ERROR:"+e);
	 }
   }
   
   public void prepareRunResultMessage() {
		
	   log.info("BindManager:prepareRunResultMessage:01");
	   Long count = null;
	   
	  try{
		   String typeBinding = FacesContext.getCurrentInstance().getExternalContext()
					.getRequestParameterMap()
					.get("typeBinding");
		   log.info("BindManager:prepareRunResultMessage:typeBinding:"+typeBinding);
		   
			
		   if(typeBinding==null||typeBinding.isEmpty()){
				return;
		   }
		   
		   if("bindingNoAct".equals(typeBinding)){
			   if(BindingProcessor.getControls().containsKey("binding_no_act")){
				   log.info("BindManager:prepareRunResultMessage:02");
				   
				   runResultMessage="Процесс поиска соответствий не активных записей выполняется";
			   }else{
				   
				   count  = ((java.math.BigDecimal) entityManager.createNativeQuery(
							(new StringBuilder("select count(*) from ( "))
							  .append("select BIN.UP_USERS ") 
							  .append("from BINDING_AUTO_LINK_BSS_T bin ") 
							  .append("where BIN.TYPE_BINDING=2 ") 
							  .append("group by BIN.UP_USERS ) ")
							.toString())
							.getSingleResult()).longValue();
				   
				   runResultMessage="Процесс поиска соответствий не активных записей завершен<br/>" 
				   		+ "Найдено пользователей: "+count;
			   }
			   
		   }else{   //bindingUnBind
			   if(BindingProcessor.getControls().containsKey("binding_un_bind")){
				   log.info("BindManager:prepareRunResultMessage:02");
				   
				   runResultMessage="Процесс поиска соответствий не привязанных записей выполняется";
				   
			   }else{
				   
				   count  = ((java.math.BigDecimal) entityManager.createNativeQuery(
							(new StringBuilder("select count(*) from ( "))
							  .append("select BIN.UP_USERS ") 
							  .append("from BINDING_AUTO_LINK_BSS_T bin ") 
							  .append("where BIN.TYPE_BINDING=1 ") 
							  .append("group by BIN.UP_USERS ) ")
							.toString())
							.getSingleResult()).longValue();
				   
				   runResultMessage="Процесс поиска соответствий не привязанных записей завершен<br/>" 
						   + "Найдено пользователей: "+count;
			   }
			   
		   }
		   
	   }catch (Exception e) {
		   log.error("BindManager:prepareRunResultMessage:ERROR:"+e);
	   }
	}
   
  
   
  
   public SerializableList<AcApplication> getListBindArm() throws Exception{
	    log.info("BindManager:getListBindArm:01");
	    try {
	    	if(listBindArm==null){
	    	
	    		String query="select o from AcApplication o where o.acRoles IS NOT EMPTY ";
	    		
	      		AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION); 
	      		
	      		LinksMap lm = (LinksMap)Component.getInstance("linksMap",ScopeType.APPLICATION);
	      		Long appCode = lm.getAppCode();
			
	      		
	      		if(!cau.getIsSysAdmin().equals(1L)){ //если не с ролью сист админ
	    			query+="and o.idArm!="+appCode;
	    		}
	    		listBindArm=new ArrayList<AcApplication>(entityManager
	    				.createQuery(query)
	    				.getResultList());
				
	    	}
	     } catch (Exception e) {
	    	 log.error("BindManager:getListBindArm:ERROR:"+e);
	         throw e;
	     }
	    return new ArrayList<AcApplication>(listBindArm);
   }
   public void setListBindArm(SerializableList<AcApplication> listBindArm){
	   this.listBindArm=listBindArm;
   }
   
   public SerializableList<AcApplication> getListBindArmEdit() throws Exception{
	    log.info("BindManager:getListBindArmEdit:01");
	   
	    String  idBind = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    log.info("BindManager:getListBindArmEdit:sessionId:"+idBind);
	
	    try {
	
	    	String saveEditFlag;
	    	if(listBindArmEdit==null){
	      		
                String query="select o from AcApplication o where o.acRoles IS NOT EMPTY ";
	    		
                //перенесли на disabled chekbox
	      
	    		
	    		listBindArmEdit=new ArrayList<AcApplication>(entityManager
	    				.createQuery(query)
	    				.getResultList());
	      		
	      		
	      		saveEditFlag= FacesContext.getCurrentInstance().getExternalContext()
		 			        .getRequestParameterMap()
		 			        .get("saveEditFlag");
		    	 log.info("BindManager:getListBindArmEdit:saveEditFlag:"+saveEditFlag);
		    		 
		    	
		    	if(saveEditFlag==null){	
		    		
		    	  List<AcRole> listBindRol=entityManager.createQuery("select o from AcRole o JOIN o.acLinkUserToRoleToRaions o1 where o1.pk.acUser = :acUser")
						 .setParameter("acUser", Long.valueOf(idBind))
			      				.getResultList();
			     
		    	
		    	  
	      	    for(AcApplication arm :listBindArmEdit){
			        	
			      for(AcRole rol :arm.getAcRoles()){
			    	  log.info("BindManager:getListBindArmEdit:rol.getIdRol()"+rol.getIdRol());
			    	
			    	  if (listBindRol.contains(rol)){  
			    		  rol.setUsrChecked(true);
			    	  }
			    	  
			    	
			   	     }
          	        } 
	      	    }
	    	 }
		
			} catch (Exception e) {
	    	 log.error("BindManager:getListBindArmEdit:ERROR:"+e);
	         throw e;
	     }
	    return new ArrayList<AcApplication>(listBindArmEdit);
   }
   
   public void setListBindArmEdit(SerializableList<AcApplication> listBindArmEdit){
	   this.listBindArmEdit=listBindArmEdit;
   }
  
   
   public List<AcApplication> getListBindArmForView() throws Exception{
	    log.info("BindManager:getListBindArmForView:01");
	   
	    String sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    
	    log.info("BindManager:getListBindArmForView:sessionId:"+sessionId);
	    List<Object[]> lo=null;
	    AcApplication app = null;
	    AcRole rol = null;
	    
	    try {
	    	
	    	if(listBindArmForView==null && sessionId!=null){
	      	
	    		lo=entityManager.createNativeQuery(
	    				(new StringBuilder("select APP.ID_SRV app_id, APP.FULL_ app_name, ROL.FULL_ role_name "))
                        .append("from AC_IS_BSS_T app, AC_ROLES_BSS_T rol, AC_USERS_LINK_KNL_T url ")
                        .append("where ROL.UP_IS=APP.ID_SRV and URL.UP_ROLES=ROL.ID_SRV and URL.UP_USERS=? ")
                        .append("order by  APP.FULL_, APP.ID_SRV, ROL.FULL_")
	    				.toString())
	    				 .setParameter(1, Long.valueOf(sessionId))
	    				.getResultList();

	    		 listBindArmForView = new ArrayList<AcApplication>();
	    		
	    		 for(Object[] objectArray :lo){
	    			 
	    			 if(app==null||!app.getIdArm().toString().equals(objectArray[0].toString())){
	    			   app=new AcApplication();
	    			   
	    			   listBindArmForView.add(app);
	    			   
	    			   app.setIdArm(Long.valueOf(objectArray[0].toString()));
	    			   app.setName(objectArray[1]!=null?objectArray[1].toString():"");
	    			   app.setRolList(new ArrayList<AcRole>());
	    			 }
	    			 
	    			 rol=new AcRole();
	    			 rol.setRoleTitle(objectArray[2]!=null?objectArray[2].toString():"");
	    			 
	    			 app.getRolList().add(rol);
	    		 }
	    		
	    		
	    		log.info("BindManager:getListBindArmForView:listBindArmForView.size:"+listBindArmForView.size());

	    	   }
			} catch (Exception e) {
	    	 log.error("BindManager:getListBindArmForView:ERROR:"+e);
	         throw e;
	     }
	    return listBindArmForView;
  }
  
   
   public List<GroupUsersKnlT> getListBindGroupForView() throws Exception{
	    log.info("BindManager:getListBindGroupForView:01");
	   
	    List<Object[]> lo=null;
	    GroupUsersKnlT group = null;
	    AcApplication app = null;
	    AcRole rol = null;
	    
	    String sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    
	    log.info("BindManager:getListBindGroupForView:sessionId:"+sessionId);
	    
	    try {
	    	
	    	if(listBindGroupForView==null && sessionId!=null){
	      	
	    		lo=entityManager.createNativeQuery(
	    				(new StringBuilder("select GR.ID_SRV gr_id, GR.FULL_ gr_name, APP.ID_SRV app_id, APP.FULL_ app_name, ROL.FULL_ role_name "))
                        .append("from GROUP_USERS_KNL_T gr, LINK_GROUP_USERS_USERS_KNL_T uul, ")
                        .append("LINK_GROUP_USERS_ROLES_KNL_T lur, AC_ROLES_BSS_T rol, AC_IS_BSS_T app ")
                        .append("where UUL.UP_GROUP_USERS=GR.ID_SRV and UUL.UP_USERS=? ")
                        .append("and LUR.UP_GROUP_USERS=GR.ID_SRV and ROL.ID_SRV=LUR.UP_ROLES ")
                        .append("and APP.ID_SRV=ROL.UP_IS ")
                        .append("order by GR.FULL_, GR.ID_SRV, APP.FULL_, APP.ID_SRV, ROL.FULL_ ")
	    				.toString())
	    				.setParameter(1, Long.valueOf(sessionId))
	    				.getResultList();
	    		
	    		listBindGroupForView = new ArrayList<GroupUsersKnlT>();
	    		
	    		for(Object[] objectArray :lo){
	    			
	    			if(group==null||!group.getIdSrv().toString().equals(objectArray[0].toString())){
	    				
	    				group=new GroupUsersKnlT();
		    			   
	    				listBindGroupForView.add(group);
		    			   
	    				group.setIdSrv(Long.valueOf(objectArray[0].toString()));
	    				group.setFull(objectArray[1]!=null?objectArray[1].toString():"");
	    				group.setArmList(new ArrayList<AcApplication>());
		    		}
	    			
	    			if(app==null||!app.getIdArm().toString().equals(objectArray[2].toString())){
	    			  
	    		       app=new AcApplication();
	    			   
	    			   group.getArmList().add(app);
	    			   
	    			   app.setIdArm(Long.valueOf(objectArray[2].toString()));
	    			   app.setName(objectArray[3]!=null?objectArray[3].toString():"");
	    			   app.setRolList(new ArrayList<AcRole>());
	    			 }
	    			 
	    			 rol=new AcRole();
	    			 rol.setRoleTitle(objectArray[4]!=null?objectArray[4].toString():"");
	    			 
	    			 app.getRolList().add(rol);
	    		 }
	    	   }
			} catch (Exception e) {
	    	 log.error("BindManager:getListBindGroupForView:ERROR:"+e);
	         throw e;
	     }
	    return listBindGroupForView;
 }
   
   public SerializableList<BaseItem> getRoleList(){
	   if(this.roleList==null){
		   String idArm = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("idArm");
		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		   log.error("BindManager:getRoleList:idArm:"+idArm);
		   log.error("BindManager:getRoleList:sessionId:"+sessionId);
		   log.error("BindManager:getRoleList:remoteAudit:"+remoteAudit);
		   
		   if(idArm==null||sessionId==null) {
			   return null;
		   }
		   
		   this.roleList = entityManager.createQuery("select o from AcRole o where o.acApplication= :idArm order by o.roleTitle ")
				   .setParameter("idArm", Long.valueOf(idArm))
                   .getResultList();
		 
		   if("armSelectFact".equals(remoteAudit)){		   
		     List<AcRole> listBindRol=entityManager.createQuery("select o from AcRole o JOIN o.acLinkUserToRoleToRaions o1 where o1.pk.acUser = :acUser ")
					 .setParameter("acUser", Long.valueOf(sessionId))
		      		 .getResultList();		   
		     for(BaseItem role :this.roleList){
	           if (listBindRol.contains((AcRole)role)){  
	        	  ((AcRole)role).setUsrChecked(true);
			   }
	         } 
		  }
	   }
	   return new ArrayList<BaseItem>(this.roleList);
   }
   
   public void setRoleList(SerializableList<BaseItem> roleList){
	   this.roleList=roleList;
   }
   
   public List<BaseItem> getApplicantList() { return this.applicantList; }
   
   public void setApplicantList(SerializableList<BaseItem> applicantList){
	   this.applicantList=applicantList;
   }
   
   
	public String[] getFioArray(){
		  return (fioArray==null)?null:(String[])fioArray.clone();
	}
	public void setFioArray(String[] fioArray){
		this.fioArray=(fioArray==null)?null:(String[])fioArray.clone();
	}
   
	public Boolean getSearchOrgExact(){
		return this.searchOrgExact;
	}
	public void setSearchOrgExact(Boolean searchOrgExact){
		this.searchOrgExact=searchOrgExact;
	}
	public void setAuditItemsListSelect(SerializableList <BaseTableItem> auditItemsListSelect) {
		    this.auditItemsListSelect=auditItemsListSelect;
 }

   public int getConnectError(){
	   return connectError;
   }
   
   public SerializableList <BaseTableItem> getAuditItemsListSelect() {
		   
	
	    BindContext acBind= new BindContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			   

			   auditItemsListSelect.add(acBind.getAuditItemsMap().get("fio"));
			   auditItemsListSelect.add(acBind.getAuditItemsMap().get("position"));
			   auditItemsListSelect.add(acBind.getAuditItemsMap().get("department"));
			   auditItemsListSelect.add(acBind.getAuditItemsMap().get("orgName"));
			   auditItemsListSelect.add(acBind.getAuditItemsMap().get("statusValue"));
		   }
	       return new ArrayList<BaseTableItem>(this.auditItemsListSelect);
   }
   
    
   public SerializableList <BaseTableItem> getAuditItemsListContext() {
	   log.info("bindManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   BindContext acBind = new BindContext();		   
		   auditItemsListContext= acBind.getAuditItemsCollection();
	   }
	   return new ArrayList<BaseTableItem>(this.auditItemsListContext);
   }
      
   private boolean loginExist(String login) throws Exception {
		log.info("BindManager:loginExist:login="+login);
		if(login!=null){
		  try{
			 entityManager.createQuery("select au from AcUser au " 
			 		                               + "where au.login = :login")
			 		     .setParameter("login", login)
			 		     .getSingleResult();
			  addLoginExist=true;
			  log.info("BindManager:loginExist:addLoginExist!");		     
		    }catch (NoResultException ex){
              log.error("BindManager:loginExist:NoResultException");
           }catch(Exception e){
	           log.error("BindManager:loginExist:Error:"+e);
	           throw e;
         }
		}
		return this.addLoginExist;
   }
  
  
   public void selectRecord(){
	    String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    log.info("selectRecord:sessionId="+sessionId);
	    
	   //  forView(); //!!!
	    List<String>  selRecBind = (List<String>)
				  Component.getInstance("selRecBind",ScopeType.SESSION);
	    
	    if(selRecBind==null){
	       selRecBind = new ArrayList<String>();
	       log.info("selectRecord:01");
	    }
	    
	   
	    UserItem au = new UserItem();
	 
	    
	    if(au!=null){ 
	     if(selRecBind.contains(sessionId)){
	    	selRecBind.remove(sessionId);
	    	au.setSelected(false);
	    	 log.info("selectRecord:02");
	     }else{
	    	selRecBind.add(sessionId);
	    	au.setSelected(true);
	    	log.info("selectRecord:03");
	    }
	    Contexts.getSessionContext().set("selRecBind", selRecBind);	
	    
	    Contexts.getEventContext().set("bindBeanView", au);
	    }
   }
   
   public boolean getDisabled(String idArm, String roleSign, String bindBeanIdUser) throws Exception {
		boolean result = true;
	   
	   log.info("BindManager:getDisabled:idArm:"+idArm);
	   log.info("BindManager:getDisabled:roleSign:"+roleSign);
	   log.info("BindManager:getDisabled:bindBeanIdUser:"+bindBeanIdUser);
	   
		if(idArm!=null && roleSign!=null){
		  try{
			 
			  
			  LinksMap linksMap= getLinksMap();
			  AcUser currentUser = getCurrentUser();
			  
			  result=!(currentUser.getIdUser().intValue()!=linksMap.getSuperUserCode().intValue() || Long.valueOf(bindBeanIdUser).intValue()!=linksMap.getSuperUserCode().intValue()) 
                      || !(Long.valueOf(idArm).intValue()!=linksMap.getAppCode().intValue() || !"role:urn:sys_admin_cud".equals(roleSign) || currentUser.getIdUser().intValue()==linksMap.getSuperUserCode().intValue())
                      || (currentUser.getIsSysAdmin().intValue()!=1 && Long.valueOf(idArm).intValue()==linksMap.getAppCode().intValue());
			  
			  log.info("BindManager:getDisabled:result:"+result);		     
		    }catch(Exception e){
	           log.error("BindManager:getDisabled:Error:"+e);
	           throw e;
          }
		}
		return result;
  }
 
   
   public AcUser getCurrentUser() {
	   if(this.currentUser==null){
		   currentUser= (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
	   }
	   return currentUser;
   }
   
   public LinksMap getLinksMap() {
	   if(this.linksMap==null){
		   linksMap= (LinksMap)Component.getInstance("linksMap",ScopeType.APPLICATION);
	   }
	   return linksMap;
   }
   
   
   public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
	   try{
		   AuditExportData auditExportDataBind = (AuditExportData)Component.getInstance("auditExportData",ScopeType.SESSION);
		   auditExportDataBind.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
		   
	   }catch(Exception e){
		   log.error("GroupManager:audit:error:"+e);
	   }
   }
   
   public String getDellMessage() {
	   return dellMessage;
   }
   public void setDellMessage(String dellMessage) {
	   this.dellMessage = dellMessage;
   } 
  
   
   public Boolean getEvaluteForList() {
	
   	log.info("bindManager:evaluteForList:01");
   	if(evaluteForList==null){
   		evaluteForList=false;
    	String remoteAuditBind = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("bindManager:evaluteForList:remoteAudit:"+remoteAuditBind);
     	
    	if(remoteAuditBind!=null&&
    	 
    	   !"OpenCrtFact".equals(remoteAuditBind)&&	
    	   !"OpenUpdFact".equals(remoteAuditBind)&&
    	   !"OpenDelFact".equals(remoteAuditBind)&&
   	       !"onSelColFact".equals(remoteAuditBind)&&
   	       !"refreshPdFact".equals(remoteAuditBind)){
    		log.info("bindManager:evaluteForList!!!");
   		    evaluteForList=true;
    	}
   	 }
       return evaluteForList;
   }
   public Boolean getEvaluteForListFooter() {
		
	   	if(evaluteForListFooter==null){
	   		evaluteForListFooter=false;
	    	String remoteAuditBind = FacesContext.getCurrentInstance().getExternalContext()
		             .getRequestParameterMap()
		             .get("remoteAudit");
		   log.info("bindManager:evaluteForListFooter:remoteAudit:"+remoteAuditBind);
	     
	    	if(getEvaluteForList()&&
	    	    	
	    	   !"protBeanWord".equals(remoteAuditBind)&&	
	    	    	
	   	       !"selRecAllFact".equals(remoteAuditBind)&&
	   	       !"clRecAllFact".equals(remoteAuditBind)&&
	   	      // !remote/"clSelOneFact".equals(Audit)&&
	   	       !"onSelColSaveFact".equals(remoteAuditBind)){
	    		log.info("bindManager:evaluteForListFooter!!!");
	   		    evaluteForListFooter=true;
	    	}
	   	 }
	       return evaluteForListFooter;
	   }
   
   public Boolean getEvaluteForBean() {
		
		   	if(evaluteForBean==null){
		   		evaluteForBean=false;
		    	String remoteAuditBind = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("remoteAudit");
			    log.info("bindManager:evaluteForBean:remoteAudit:"+remoteAuditBind);
				String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("sessionId");
			    log.info("bindManager:evaluteForBean:sessionId:"+sessionId);
		    	if(sessionId!=null && remoteAuditBind!=null &&
		    	   ("rowSelectFact".equals(remoteAuditBind)||	
		    	    "UpdFact".equals(remoteAuditBind))){
		    	      log.info("bindManager:evaluteForBean!!!");
		   		      evaluteForBean=true;
		    	}
		   	 }
		     return evaluteForBean;
		   }

public Long getHistoryBindingValue() {
	return historyBindingValue;
}

public void setHistoryBindingValue(Long historyBindingValue) {
	this.historyBindingValue = historyBindingValue;
}

public String getRunResultMessage() {
	return runResultMessage;
}

public void setRunResultMessage(String runResultMessage) {
	this.runResultMessage = runResultMessage;
}




}

