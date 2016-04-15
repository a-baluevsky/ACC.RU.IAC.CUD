package iac.grn.infosweb.context.mc.rol;

import static iac.cud.jboss.SeamComponentAdminEjb.getApplicationLinksMap;
import static iac.cud.jboss.SeamComponentAdminEjb.getConversationItem;
import static iac.cud.jboss.SeamComponentAdminEjb.getEventItem;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionItem;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionList;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.entity.AcAppPage;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcLinkRoleAppPagePrmssn;
import iac.cud.infosweb.entity.AcLinkUserToRoleToRaion;
import iac.cud.infosweb.entity.AcPermissionsList;
import iac.cud.infosweb.entity.AcRole;
import iac.cud.infosweb.entity.AcUser;
import iac.grn.infosweb.context.mc.MCData;
import static iac.grn.infosweb.context.mc.MCData.atrOp;
import iac.grn.infosweb.context.mc.QuerySvc;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;
import iac.grn.serviceitems.BaseTableItem;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaw.util.ArrayList;
import javaw.util.HashSet;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;

/**
 * Управляющий Бин
 * @author bubnov
 *
 */
@Name("rolManager")
 public class RolManager extends QuerySvc {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 704073514369787337L;

	@Logger private static transient Log log;
	@In	transient EntityManager entityManager;
	private MCData.ArmList armList = new MCData.ArmList(log);
	public List<AcApplication> getListArm() throws Exception { return armList.getListArm(entityManager); } 
	
	private /*Serializable*/ List <BaseTableItem> auditItemsListSelect;
	private /*Serializable*/ List <BaseTableItem> auditItemsListContext;
	private /*Serializable*/ List<BaseItem> auditList; 
	
	private Long auditCount;
	
	private /*Serializable*/ List<AcApplication> listRolArm = null;
	private /*Serializable*/ List<AcAppPage> listRolRes = null;
	private /*Serializable*/ List<AcAppPage> listRolResEdit = null;
	private /*Serializable*/ List<AcPermissionsList> listRolPerm = null;
	private /*Serializable*/ List<Long> checkboxPerm = null;
	
	private int connectError=0;
	private Boolean evaluteForList;
	private Boolean evaluteForListFooter;  
	private Boolean evaluteForBean;

	
	
	private /*Serializable*/ List<AcApplication> listArmUgroup = null;
	
    private /*Serializable*/ List<BaseItem> usrAlfList;
	
	private /*Serializable*/ List<AcUser> usrSelectListForView;
	
	
	private boolean roleCodeExist=false;
	
	private String dellMessage=null;
	
	
	
	public List<BaseItem> getAuditList(int firstRow, int numberOfRows){
	  String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("auditManager:getAuditList:remoteAudit:"+remoteAudit);
	  
	  
	  log.info("getAuditList:firstRow:"+firstRow);
	  log.info("getAuditList:numberOfRows:"+numberOfRows);
	  
	  List<BaseItem> rolListCached = getSessionList("rolListCached");
	  if(auditList==null){
		  log.info("getAuditList:01");
		 	if(("rowSelectFact".equals(remoteAudit)||
			    "selRecAllFact".equals(remoteAudit)||
			    "clRecAllFact".equals(remoteAudit)||
			    "clSelOneFact".equals(remoteAudit)||
			    "onSelColSaveFact".equals(remoteAudit))&&
			    rolListCached!=null){
		 		log.info("getAuditList:02:"+rolListCached.size());
			    	this.auditList=new ArrayList<BaseItem>(rolListCached);
			}else{
				log.info("getAuditList:03");
		    	invokeLocal("list", firstRow, numberOfRows, null);
			    Contexts.getSessionContext().set("rolListCached", this.auditList);
			    log.info("getAuditList:03:"+this.auditList.size());
			}
		 	
		 	List<String>  selRecRol = getSessionList("selRecRol");
		 	if(this.auditList!=null && selRecRol!=null) {
		 		 for(BaseItem it:this.auditList){
				   if(selRecRol.contains(it.getBaseId().toString())){
					 
					 it.setSelected(true);
				   }else{
					  it.setSelected(false);
				   }
				 }
		      }
		}
		return this.auditList;
	}

	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		try{
			 String orderQueryRol=null;
			 log.info("RolManager:invokeLocal");
			 
			 RolStateHolder rolStateHolder = getSessionItem("rolStateHolder");
			 
			 Map<String, String> filterMapRol = rolStateHolder.getColumnFilterValues();
			 String st=null;
			 
			 if("list".equals(type)){
				 log.info("Rol:invokeLocal:list:01");
				 
				
				 
				 Set<Map.Entry<String, String>> set = rolStateHolder.getSortOrders().entrySet();
                 for (Map.Entry<String, String> me : set) {
      		        
      		       if(orderQueryRol==null){
      		    	 orderQueryRol="order by "+me.getKey()+" "+me.getValue();
      		       }else{
      		    	 orderQueryRol=orderQueryRol+", "+me.getKey()+" "+me.getValue();  
      		       }
      		     }
                 log.info("Rol:invokeLocal:list:orderQuery:"+orderQueryRol);
                 
                 if(filterMapRol!=null){
    	    		 Set<Map.Entry<String, String>> setFilterRol = filterMapRol.entrySet();
    	              for (Map.Entry<String, String> me : setFilterRol) {
    	            	
    	               if("acApplication".equals(me.getKey())){  
    	   		    	  st=(st!=null?st+" and " :" ")+me.getKey()+"='"+me.getValue()+"' ";
    	    	       }else{
    	        		//делаем фильтр на начало
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	               }
    	              }
    	    	   }
                 log.info("Rol:invokeLocal:list:filterQuery:"+st);
                 
				
                AcUser au = getSessionItem("currentUser"); 
	    		 
 	    		if(au.getAllowedSys()!=null){
 	    			 auditList = new ArrayList<BaseItem>( entityManager.createQuery("select o from AcRole o "
 	    					+ "where o.acApplication in (:idsArm) "+
 	    					(st!=null ? " and "+st :"")+
 	    				    (orderQueryRol!=null ? orderQueryRol+", o.idRol " : " order by o.idRol "))
 	                           .setFirstResult(firstRow)
 	                           .setMaxResults(numberOfRows)
 	                           .setParameter("idsArm", au.getAllowedSys())
 	                           .getResultList());
 	    		}else{
 	    			 auditList = new ArrayList<BaseItem>( entityManager.createQuery("select o from AcRole o "+
 	    					(st!=null ? " where "+st :"")+
 	    				    (orderQueryRol!=null ? orderQueryRol+", o.idRol " : " order by o.idRol "))
 	                           .setFirstResult(firstRow)
 	                           .setMaxResults(numberOfRows)
 	                           .getResultList()
 	                         );
 	    		}
                
 	    		// 17.02.15: AB: MANTIS-4954
                m_QueryStats = new long[]{1+firstRow, firstRow+auditList.size(), (auditCount==null)?0:auditCount};
                System.out.println("m_QueryStats = "+QueryStatsToString());
                
             log.info("Rol:invokeLocal:list:02");
  
			 } else if("count".equals(type)){
				 log.info("RolList:count:01");
				 
				 if(filterMapRol!=null){
    	    		 Set<Map.Entry<String, String>> setFilterRol = filterMapRol.entrySet();
    	              for (Map.Entry<String, String> me : setFilterRol) {
    	              
    	              if("acApplication".equals(me.getKey())){  
  	   		    	   st=(st!=null?st+" and " :" ")+me.getKey()+"='"+me.getValue()+"' ";
  	    	         }else{
  	        		  
  	        		  //делаем фильтр на начало
  	            	    st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
  	            	   }
    	             }
    	    	   }
                 log.info("Rol:invokeLocal:count:filterQuery:"+st);
				 
                 AcUser au = getSessionItem("currentUser"); 
	    		 
  	    		 if(au.getAllowedSys()!=null){
					 auditCount = (Long)entityManager.createQuery(
							 "select count(ar) " 
					         + "from AcRole ar " 
					         + "where ar.acApplication in (:idsArm) "+
					         (st!=null ? " and "+st :""))
					        .setParameter("idsArm", au.getAllowedSys())
			                .getSingleResult();
  	    		 }else{
  	    			auditCount = (Long)entityManager.createQuery(
							 "select count(ar) " 
					         + "from AcRole ar " +
					         (st!=null ? " where "+st :""))
			                .getSingleResult();
  	    		 }
                 // 17.02.15: AB: MANTIS-4954
                 if(m_QueryStats!=null) {
                	 m_QueryStats[2] = auditCount;
                	 System.out.println("m_QueryStats = "+QueryStatsToString());
                 }
                 
               log.info("Rol:invokeLocal:count:02:"+auditCount);
           	 }
		}catch(Exception e){
			  log.error("Rol:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("Ошибка!");
		}
	}

	public void setAuditList(List<BaseItem> auditList) {
		this.auditList = auditList;
	}
	
   public void forView(String modelType) {
	   String  rolId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	  log.info("forView:rolId:"+rolId);
	  log.info("forView:modelType:"+modelType);
	  if(rolId!=null){
		  
		   
			if(modelType==null){
		    	return ;
		    }
			
		 AcRole ar = searchBean(rolId);
		 
		 Long appCode = getApplicationLinksMap().getAppCode();
			
		 if(ar.getAcApplication().equals(appCode)){
	    		log.info("forView:setCudRole");
	    		ar.setIsCudRole(1L);
	    	if(ar.getSign().equals("role:urn:sys_admin_cud")){
	 	    	 log.info("forView:setSysAdmiRole");
	 	    	 ar.setIsSysAdminRole(1L);
	 	     }	
	     }
		 
		 
		 Contexts.getEventContext().set("rolBean", ar);
	  }
   }
   
   private AcRole searchBean(String sessionId){
    	
      if(sessionId!=null){
    	 List<AcRole> rolListCached = getSessionList("rolListCached");
		if(rolListCached!=null){
			for(AcRole it : rolListCached){
				 
			 
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
   
   public void addRol(){
	   log.info("hostsManager:addUsr:01");
	   
	   List<AcLinkRoleAppPagePrmssn> arList = new ArrayList<AcLinkRoleAppPagePrmssn>();
	   AcRole rolBeanCrt = getConversationItem("rolBeanCrt");
	   
	   if(rolBeanCrt==null){
		   return;
	   }
	 
	   try {
		   
		   if(!roleCodeExistCrt(rolBeanCrt.getAcApplication(), rolBeanCrt.getSign().trim())){
				 
		   
		      AcUser au = getSessionItem("currentUser");
		   
		      rolBeanCrt.setRoleTitle(rolBeanCrt.getRoleTitle().trim());
		      rolBeanCrt.setSign(rolBeanCrt.getSign().trim());
		      
		      if(rolBeanCrt.getRoleDescription()!=null&&!"".equals(rolBeanCrt.getRoleDescription().trim())){
		    	  rolBeanCrt.setRoleDescription(rolBeanCrt.getRoleDescription().trim());
			  }else{
				  rolBeanCrt.setRoleDescription(null);
			  }
		      
		      rolBeanCrt.setCreator(au.getIdUser());
		      rolBeanCrt.setCreated(new Date());
	    	  entityManager.persist(rolBeanCrt);
	    	   
	    	  for(AcAppPage res:listRolRes){
	    		  log.info("RolManager:addRol:Res:"+res.getPageName());
	    		  for(Object l:res.getPermList()){
	    			  log.info("RolManager:addRol:perm:"+l.toString());
	    			  AcLinkRoleAppPagePrmssn ap = new AcLinkRoleAppPagePrmssn(res.getIdRes(), Long.parseLong(l.toString()), rolBeanCrt.getIdRol());
	    			  ap.setCreated(new Date());
	    			  ap.setCreator(Long.valueOf(1));
	    			  arList.add(ap);
	    			
	    		  }
	    	  }
	    	   
	    	     
	    	     if(arList.size()>0){
	    	 		//  @On/eTo/Many(map/pedBy="acHost", casc/ade=/{CascadeType.PE/RSIST, CascadeType/.REFRESH})
	    	 	     rolBeanCrt.setAcLinkRoleAppPagePrmssns(new HashSet<AcLinkRoleAppPagePrmssn>(arList));
	    	 	 }
	    	 	   
	    	 	 entityManager.flush();
	    	  	 entityManager.refresh(rolBeanCrt);
	    	   
	    	  	audit(ResourcesMap.ROLE, ActionsMap.CREATE); 
	    	  	 
	           }
	    	  	 
	          }catch (Exception e) {
	             log.error("RolManager:addRol:ERROR="+e);
	          }
	   
   }
   
   public void updRol(){
	   
	   log.info("hostsManager:updHosts:01");
	   
	   List<AcLinkRoleAppPagePrmssn> arList = new ArrayList<AcLinkRoleAppPagePrmssn>();
	   AcRole rolBean = getConversationItem("rolBean");
	   
	   String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	   log.info("rolManager:updRol:sessionId:"+sessionId);
	
	   if(rolBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		 
		 if(!roleCodeExistUpd(rolBean.getAcApplication(), rolBean.getSign().trim(), Long.valueOf(sessionId))){
		   
		  AcUser au = getSessionItem("currentUser");
		   
		 
		  AcRole arm = entityManager.find(AcRole.class, Long.valueOf(sessionId));
		  
		  arm.setRoleTitle(rolBean.getRoleTitle().trim());
		  arm.setSign(rolBean.getSign().trim());
		  
		  if(rolBean.getRoleDescription()!=null&&!"".equals(rolBean.getRoleDescription().trim())){
			  arm.setRoleDescription(rolBean.getRoleDescription().trim());
		  }else{
			  arm.setRoleDescription(null);
		  }
		  
		  arm.setAcApplication(rolBean.getAcApplication());
		
		  
		  arm.setModificator(au.getIdUser());
		  arm.setModified(new Date());
		  
		  for(AcLinkRoleAppPagePrmssn apl : arm.getAcLinkRoleAppPagePrmssns()){
			   entityManager.remove(apl);
		  }
		  arm.setAcLinkRoleAppPagePrmssns(null);
		   
		  entityManager.flush();
		  
		  for(AcAppPage res:listRolResEdit){
    		  log.info("RolManager:editRol:Res:"+res.getPageName());
    		  for(Object l:res.getPermList()){
    			  log.info("RolManager:editRol:perm:"+l.toString());
    			  AcLinkRoleAppPagePrmssn ap = new AcLinkRoleAppPagePrmssn(res.getIdRes(), Long.valueOf(l.toString()), Long.valueOf(sessionId));
    			  ap.setCreated(new Date());
    			  ap.setCreator(Long.valueOf(1));
    			 
    			  arList.add(ap);
    		  }
    	  }
	    	  
	       	  if(arList.size()>0){
	    	 	//  @OneT/oMany(mapp/edBy="acHo/st", cascade={C/ascadeType./PERSIST,/ CascadeType.REFRE/SH})
	    		  arm.setAcLinkRoleAppPagePrmssns(new HashSet<AcLinkRoleAppPagePrmssn>(arList));
	    	  }
	    	 	   
	    	 entityManager.flush();
	    	 entityManager.refresh(arm);
	    	  
	    	 Contexts.getEventContext().set("rolBean", arm);
	    	 
	    	 audit(ResourcesMap.ROLE, ActionsMap.UPDATE); 
	    	 
	       }
	    	 
	     }catch (Exception e) {
           log.error("RolManager:updRol:ERROR:"+e);
         }
   }
 
  public void updUgroupUserAlf(){
	   
	   log.info("rolManager:updUgroupUserAlf:01");
	   
	   AcLinkUserToRoleToRaion lguu=null;
	   
	   AcRole roleBean = getConversationItem("rolBean");
	   
	    String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	   log.info("rolManager:updUgroupUserAlf:sessionId:"+sessionId);
	   
	   if(roleBean==null || sessionId==null){
		   return;
	   }
	
	 	   
	   try {
		   AcUser au = getSessionItem("currentUser");
		   
		   AcRole aum = entityManager.find(AcRole.class, Long.valueOf(sessionId));
		   
		   List<AcLinkUserToRoleToRaion> oldLinkList = aum.getAcLinkUserToRoleToRaions();
		   
		  
		  
		   
		   for(BaseItem user:this.usrAlfList){
 			  
 			 
 			  
 			  if(((AcUser)user).getUsrChecked().booleanValue()){ //отмечен
 				
 				 log.info("rolManager:updUgroupUserAlf:02:"+((AcUser)user).getLogin());
 				 
 				 
 				 lguu=new AcLinkUserToRoleToRaion(Long.valueOf(sessionId), user.getBaseId());
 				 if(oldLinkList.contains(lguu)){  
 				 
 					log.info("rolManager:updUgroupUserAlf:03");
 					
 				 }else{//нет в базе
 					 
 					log.info("rolManager:updUgroupUserAlf:04");
 					 
 					 lguu.setCreated(new Date()); 
 					 lguu.setCreator(au.getIdUser());
			         
			         oldLinkList.add(lguu);
			         
 				  }
 				  
 			  }else{//не отмечен
 				  
 				 lguu=new AcLinkUserToRoleToRaion(Long.valueOf(sessionId), user.getBaseId());
 				 if(oldLinkList.contains(lguu)){
 					 
 					log.info("rolManager:updUgroupUserAlf:05");
 					 
 					oldLinkList.remove(lguu);
 					entityManager.createQuery("DELETE FROM AcLinkUserToRoleToRaion gu " 
 							                  + "WHERE gu.pk.acRole=:acRole " 
 							                  + "and gu.pk.acUser=:acUser ")
 					    .setParameter("acRole", Long.valueOf(sessionId))
 					    .setParameter("acUser", user.getBaseId())
 					    .executeUpdate();
				  }else{//в базе и так нет
				 
					 
					  
				  }
 			  }
 		  }
			   
		    aum.setAcLinkUserToRoleToRaions(oldLinkList);
	        entityManager.flush();
	    	
		    entityManager.refresh(aum);
	    	  
	    	Contexts.getEventContext().set("rolBean", aum);
	    	 
	    	audit(ResourcesMap.ROLE, ActionsMap.UPDATE_USER); 
	    	
	    	
	     }catch (Exception e) {
         log.error("rolManager:updUgroupUserAlf:ERROR:"+e);
       }
 }
   
   
   public void delRol(){
	 try{
		log.info("rorManager:delRols:01");  
		
		AcRole rolBean = getConversationItem("rolBean");
		// <h:inputHidden value="#{usrBean.idUser}"/>
		
		if(rolBean==null){
			return;
		}
		 
		log.info("rolManager:delRol:IdRol:"+rolBean.getIdRol());
		
		AcRole arm = entityManager.find(AcRole.class, rolBean.getIdRol());
		  
		entityManager.remove(arm);
		
		audit(ResourcesMap.ROLE, ActionsMap.DELETE); 
		
	 }catch(Exception e){
		 log.error("rolManager:delRol:error:"+e); 
	 }
   }
 
   public void forViewUpdDel() {
	   try{
	     String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId");
	     log.info("forViewUpdDel:sessionId:"+sessionId);
	     if(sessionId!=null){
	    	 AcRole ar = entityManager.find(AcRole.class, Long.valueOf(sessionId));
	    	 Contexts.getEventContext().set("rolBean", ar);
	    	 
	    	//устанавливаем на 1 страницу пагинатор в модальном окне
	    	 RolStateHolder rolStateHolder = getSessionItem("rolStateHolder");
	    	 rolStateHolder.resetPageNumber();
	   	 }
	   }catch(Exception e){
		   log.error("forViewUpdDel:Error:"+e);
	   }
   } 
   
   public void forViewDelMessage() {
		  String sessionId = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap()
				.get("sessionId");
		  log.info("forViewDelMessage:sessionId:"+sessionId);
		  if(sessionId!=null){

			  List<Object[]> lo=entityManager.createNativeQuery(
	  			      (new StringBuilder("select  t1.cnt usr_cnt, t2.cnt gusr_cnt "))
                      .append("from ") 
                      .append("(select count(*) cnt ")
                      .append("from AC_USERS_LINK_KNL_T usl ")
                      .append("where USL.UP_ROLES=? ) t1, ")
                      .append("(select count(*) cnt ")
                      .append("from LINK_GROUP_USERS_ROLES_KNL_T gusl ")
                      .append("where GUSL.UP_ROLES=? ) t2 ")
	  			      .toString())
	  				.setParameter(1, Long.valueOf(sessionId))
	  				.setParameter(2, Long.valueOf(sessionId))
	  				.getResultList();
			  
			  if(!lo.isEmpty()){
				  if(!"0".equals(lo.get(0)[0].toString())){
					  dellMessage="Есть пользователи с этой ролью!<br/>";
				  }
				  if(!"0".equals(lo.get(0)[1].toString())){
					  if(dellMessage!=null){
					   dellMessage+="Есть группы пользователей с этой ролью!";
					  }else{
						dellMessage="Есть группы пользователей с этой ролью!";
					  }
				  }
			  }
			 AcRole ar = entityManager.find(AcRole.class, Long.valueOf(sessionId));	 
			 Contexts.getEventContext().set("rolBean", ar);
		 }	
  }
   
  public List<AcApplication> getListRolArm() throws Exception{
	    log.info("RolManager:getListRolArm:01");
	    try {
	    	if(listRolArm==null){
	     		listRolArm=new ArrayList<AcApplication>(
	     				entityManager.createQuery("select o from AcApplication o where o.acRoles IS NOT EMPTY order by o.name ").getResultList()
	     		);
	    	}
	     } catch (Exception e) {
	    	 log.error("RolManager:getListRolArm:ERROR:"+e);
	         throw e;
	     }
	    return listRolArm;
 }
   public void setListRolArm(List<AcApplication> listRolArm) {
		this.listRolArm = listRolArm;
   }
   
   public List<AcAppPage> getListRolRes() throws Exception{
	    
	    try {
	    	log.info("RolManager:getListRolRes:01");
	    
	    	//При заходе создать - список должен быть пуст,
	    	//т.к. АРМ ещё не выбран
	    	
	    	//у h:selectOneRadio immediate="true", иначе -
	    	//acRolBeanCrt будет null
	    	String pidArm=null;
	    	
	    	AcRole rolBeanCrt = getConversationItem("rolBeanCrt");
		   
	    	if(rolBeanCrt!=null){
	    	
	    	if(rolBeanCrt.getAcApplication()==null){
	    		 pidArm= FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("CBformCrt:appl"); //идАРМ при ajax смене АРМа
	    		 log.info("RolManager:getListRolRes:pidArm:"+pidArm);
	    	 }
	    		    	
	    	if(listRolRes==null&&(rolBeanCrt.getAcApplication()!=null||pidArm!=null)){
	    		log.info("RolManager:getListRolRes:02");
	    		//идём сюда:
	    		//1)при ajax смене АРМ(pidArm!=null)
	    		//2)при нажатии Сохранить (pidArm!=null)
	    		listRolRes=new ArrayList<AcAppPage>(
	    				entityManager.createQuery((new StringBuilder("select o from AcAppPage o where "))
	  	    				  .append("o.idResCollection is empty and ")
		    				  .append("o.visible=1 and ")
		    		    	  .append("o.acApplication = :idArm and ") 
		    				  .append("o.idParent2 !=1 and o.pageCode is not null ")
		    				  .toString())
	    				.setParameter("idArm", (pidArm!=null ? Long.valueOf(pidArm) : rolBeanCrt.getAcApplication()))
	    				.getResultList());
	   		   for(AcAppPage aap:listRolRes){
	   			  log.info("RolManager:getListRolRes:Cicle:1");
	   			  String st=aap.getPageName();
	   			  AcAppPage aapin=aap.getIdParent();
	   			   while(!aapin.getIdParent2().equals(Long.valueOf(1))){
	   				log.info("RolManager:getListRolRes:Cicle:2");
	   				   st=aapin.getPageName()+"/"+st;
	   				   aapin=aapin.getIdParent();
	   			   }
	   			   aap.setFullPageName(st);
	   		   }
	    		
	    	}
	       }
	    	log.info("RolManager:getListRolRes:03");
	     } catch (Exception e) {
	    	 log.error("RolManager:getListRolRes:ERROR:"+e);
	         throw e;
	     }
	    return listRolRes;
   }
   
   public void setListRolRes(List<AcAppPage> listRolRes) {
		this.listRolRes = listRolRes;
   }
   
   public List<AcAppPage> getListRolResEdit() throws Exception{
	    
	
	    try {
	    	
	    	// при заходе со списка - 1)идАРМ = editRol.getAcApplication(),
	    	// 2)идРоли = pidRol (оно же и editRol.idRol)
	        // при ajax смене АРМ - 1)идАРМ = pidArm,
	    	// 2)идРоли = idForAjax
	    	// при нажатии Сохранить - 1)идАРМ = pidArm,
	    	// 2)идРоли = idForAjax -не используем, так как устанавливаем saveEditFlag=1
	    	
	    	String idRol = FacesContext.getCurrentInstance().getExternalContext()
			       .getRequestParameterMap()
			       .get("sessionId");
		    log.info("rolManager:getListUsrArmEdit:sessionId:"+idRol);
		    
		  
	    	//pidRol -global переменная!!!
	    	String pidArm=null, saveEditFlag,idForAjax;
	    	
	    	AcRole rolBean = getEventItem("rolBean");
	    	
	    	 
	    	
	    	if(rolBean.getAcApplication()==null){ //при заходе со списка условие = нет
	    		 pidArm= FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("CBformUpd:appl"); //идАРМ при нажатии кнопки сохранить
	    		 log.info("RolManager:getListRolResEdit:pidArm:"+pidArm);
	       	}
	    	if(listRolResEdit==null&&(rolBean.getAcApplication()!=null||pidArm!=null)){
	    		//идём сюда:
		    	//1)при заходе со списка (editRol.getAcApplication()) 	
	    		//2)при ajax смене АРМ (pidArm!=null)
	    		//3)при нажатии Сохранить (pidArm!=null)
		    	
	    		listRolResEdit=new ArrayList<AcAppPage>(
	    				entityManager.createQuery((new StringBuilder("select o from AcAppPage o where "))
	  	    				  .append("o.idResCollection is empty and ") 
		    				  .append("o.visible=1 and ")
		    				  .append("o.acApplication = :idArm and ") 
		    				  .append("o.idParent2 !=1 and o.pageCode is not null ")
		    				  .toString())
	    				.setParameter("idArm",(pidArm!=null ? Long.valueOf(pidArm) : rolBean.getAcApplication()))
	    				.getResultList()
	    				);
	    		saveEditFlag= FacesContext.getCurrentInstance().getExternalContext()
	 			        .getRequestParameterMap()
	 			        .get("saveEditFlag");
	    		 log.info("RolManager:getListRolResEdit:saveEditFlag:"+saveEditFlag);
	    		 
	    		 idForAjax= FacesContext.getCurrentInstance().getExternalContext()
	 			        .getRequestParameterMap()
	 			      
	    		         .get("idForAjax");
	    		 log.info("RolManager:getListRolResEdit:idForAjax!!!:"+idForAjax);
	    		
	    	 	 
	    	  if(saveEditFlag==null){
	    		  log.info("RolManager:getListRolResEdit:01");
	    		  //здесь всегда, кроме нажатия кнопки Сохранить - там нам история не нужна, 
	    		  //у нас теперь новые значения с формы
	           for(AcAppPage aca :listRolResEdit){
	        	   log.info("RolManager:getListRolResEdit:02:1");
	        	   
	        		  String st=aca.getPageName();
		   			  AcAppPage aapin=aca.getIdParent();
		   			   while(!aapin.getIdParent2().equals(Long.valueOf(1))){
		   				   st=aapin.getPageName()+"/"+st;
		   				   aapin=aapin.getIdParent();
		   			   }
		   			   aca.setFullPageName(st);
		   			 log.info("RolManager:getListRolResEdit:02:2");
		   			 
	        	if(aca.getAcLinkRoleAppPagePrmssns()!=null){ 
	        		 log.info("RolManager:getListRolResEdit:03");
	        	 Iterator<AcLinkRoleAppPagePrmssn> it= aca.getAcLinkRoleAppPagePrmssns().iterator();
	        	 List<Long> ls = new ArrayList<Long>();
	        	 log.info("RolManager:getListRolResEdit:04");
	        	 while (it.hasNext()){
	        		 log.info("RolManager:getListRolResEdit:05");
	            AcLinkRoleAppPagePrmssn me = (AcLinkRoleAppPagePrmssn) it.next();
	            log.info("RolManager:getListRolResEdit:06");
		            if((me.getAcAppPage().getIdRes().equals(aca.getIdRes())) && 
		               (me.getAcRole().getIdRol().equals(Long.valueOf((idRol!=null?idRol:idForAjax)))) ){
		        	   log.info("RolManager:getListRolResEdit:IdPerm:"+me.getAcPermissionsList().getIdPerm());
		        	 ls.add(me.getAcPermissionsList().getIdPerm());
		         }
       	        } 
	        	 aca.setPermList(ls);
	           }
	           
	           }
	    	  }
	    	}
	     } catch (Exception e) {
	    	 log.error("getListRolResEdit:ERROR="+e);
	         throw e;
	     }
	  
	    return listRolResEdit;
   }
   public void setListRolResEdit( List<AcAppPage> listRolResEdit ){
	   log.info("RolManager:setListRolResEdit");
	   this.listRolResEdit=listRolResEdit;
   }

   public List<AcPermissionsList> getListRolPerm() throws Exception{
	    log.info("getListRolPerm_01");
	    try {
	    	if(listRolPerm==null){
	     		listRolPerm=new ArrayList<AcPermissionsList>(
	     				entityManager.createQuery("select o from AcPermissionsList o").getResultList()
	     		);
	       	}
	    	log.info("getListRolPerm:size:"+listRolPerm.size());
	     } catch (Exception e) {
	    	 log.error("getListRolPerm_ERROR="+e);
	         throw e;
	     }
	    return listRolPerm;
  }
  public List<Long> getCheckboxPerm() throws Exception{
	    log.info("getCheckboxPerm_01");
	    if (checkboxPerm==null){
	    	checkboxPerm = new ArrayList<>();
	    	checkboxPerm.add(Long.valueOf(1));
	    	checkboxPerm.add(Long.valueOf(3));
	    	checkboxPerm.add(Long.valueOf(5));
	       }
	    return checkboxPerm;
  }
  public void setCheckboxPerm(List<Long> checkboxPerm) throws Exception{
	    log.info("setCheckboxPerm_01");
	    this.checkboxPerm=checkboxPerm;
  }
  
  
  public List<AcUser> getUsrSelectListForView(){
  	
	  List<Object[]> lo=null;
      try{
     		
     	if(this.usrSelectListForView==null){
     		String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
 	             .getRequestParameterMap()
 	             .get("remoteAudit");
     		String sessionId = FacesContext.getCurrentInstance().getExternalContext()
    	             .getRequestParameterMap()
    	             .get("sessionId");
     		
     		if(remoteAudit==null||sessionId==null){
     			return null;
     		}
     		
 	        log.info("rolManager:getUsrSelectListForView:remoteAudit:"+remoteAudit);
 	        log.info("rolManager:getUsrSelectListForViewt:sessionId:"+sessionId);
 	        
 	            
 	       lo=entityManager.createNativeQuery(
		    	   (new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_fio "))
                   .append("from (select AU_FULL.ID_SRV t1_id, AU_FULL.LOGIN t1_login, ")
                  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO) t1_fio ")
                     .append("from ")
                     .append("AC_USERS_KNL_T AU_full, ")
                     .append("AC_USERS_LINK_KNL_T uul, ")
                     .append("ISP_BSS_T CL_USR_FULL, ")
                     .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
                         .append("from ISP_BSS_T cl_usr, ")
                         .append("AC_USERS_KNL_T au ")
                        .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
                        .append("group by CL_usr.SIGN_OBJECT) t2 ")
                     .append("where  AU_FULL.UP_SIGN_USER=t2.CL_USR_CODE(+) ")
                     .append("and CL_USR_FULL.ID_SRV(+)=t2.CL_USR_ID ")
                     .append("and UUL.UP_USERS= AU_FULL.ID_SRV ")
                     .append("and UUL.UP_ROLES=? ")		    	   
                     //!!!
					   .append("and AU_FULL.STATUS !=3 ")
                       .append("order by t1_fio ")
                       .append(") t1 ")
                     .toString())
		      		.setParameter(1, Long.valueOf(sessionId))
				 .getResultList();
 	    	    
 	       this.usrSelectListForView=new ArrayList<AcUser>();
 	       
 	       for(Object[] objectArray :lo){
 	    	 AcUser au = new AcUser();
 	    	 
 	    	 this.usrSelectListForView.add(au);
 	    	 
 	    	 //не используется при только отображении
 	    	 au.setFio(objectArray[2]!=null?objectArray[2].toString():"");
 	    	 au.setLogin(objectArray[1]!=null?objectArray[1].toString():"");
 	       }
 	         
     	 }
     	}catch(Exception e){
 			log.error("rolManager:getUsrSelectListForView:error:"+e);
 		}
        	return this.usrSelectListForView;
     }
  public void setAuditItemsListSelect(List <BaseTableItem> auditItemsListSelect) {
	    this.auditItemsListSelect=auditItemsListSelect;
}
  
   public int getConnectError(){
	   return connectError;
   }
   
   public List <BaseTableItem> getAuditItemsListSelect() {
		   
	
	    RolContext acRol= new RolContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			   
			
			   auditItemsListSelect.add(acRol.getAuditItemsMap().get("roleTitle"));
			   auditItemsListSelect.add(acRol.getAuditItemsMap().get("sign"));
			   auditItemsListSelect.add(acRol.getAuditItemsMap().get("roleDescription"));
			   auditItemsListSelect.add(acRol.getAuditItemsMap().get("armName"));
		   }
	       return this.auditItemsListSelect;
   }
   
 
   
   public List <BaseTableItem> getAuditItemsListContext() {
	   log.info("usrManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   RolContext acRol= new RolContext();
		   auditItemsListContext=new ArrayList<BaseTableItem>(acRol.getAuditItemsCollection());
	   }
	   return this.auditItemsListContext;
   }
 
   

  
   
    
   public List<AcApplication> getListArmUgroup() throws Exception{
	   
	   //вариант жоще, чем getListArm
	   //вообще убираем ЦУД из списка армов
	   //даже для суперпользователя
	   //то есть через группы роли цуда не назначаются
	   
	    log.info("roleManager:getListArmUgroup:01");
	    try {
	    	if(listArmUgroup==null){
	    		
	    		AcUser cau = getSessionItem("currentUser"); 
	    		Long appCode = getApplicationLinksMap().getAppCode();
				
	    		String query="select o from AcApplication o where o.idArm!="+appCode+" ";
	    		
	    		if(cau.getAllowedSys()!=null){
	    			listArmUgroup=new ArrayList<AcApplication>(
	    					entityManager.createQuery(
	    					      query
	    					      + " and o.idArm in (:idsArm) order by o.name" )
	    					      .setParameter("idsArm", cau.getAllowedSys())
                                  .getResultList()
                            );
	    		}else{
	    			listArmUgroup=new ArrayList<AcApplication>(
	    					entityManager.createQuery(query+" order by o.name").getResultList()
	    				);
	    		}
	    		
	    	}
	     } catch (Exception e) {
	    	 log.error("roleManager:getListArmUgroup:ERROR:"+e);
	         throw e;
	     }
	    return listArmUgroup;
  }
  
   public List<BaseItem> getUsrAlfList(){
	   
	   //!!!
	  //не используется 
	   
   	log.info("rolManager:getUsrAlfList:01");
   	
   	List<Object[]> lo=null;
   	String alfDiap=null;
   	
   	if(this.usrAlfList==null){
   		
   		String idAlf = FacesContext.getCurrentInstance().getExternalContext()
 			        .getRequestParameterMap()
 			        .get("idAlf");
 		   String sessionId = FacesContext.getCurrentInstance().getExternalContext()
 			        .getRequestParameterMap()
 			        .get("sessionId");
 		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
 			        .getRequestParameterMap()
 			        .get("remoteAudit");
 		   log.info("rol:getUsrAlfList:idAlf:"+idAlf);
 		   log.info("rol:getUsrAlfList:sessionId:"+sessionId);
 		   log.info("rol:getUsrAlfList:remoteAudit:"+remoteAudit);
 		   
 		   if(sessionId==null){
 			  return this.usrAlfList;
 		   }
 		   
 		   
 		   if(idAlf==null||"1".equals(idAlf)){
 			 alfDiap="А-ЕЁ";
 		   }else if("2".equals(idAlf)){
 			 alfDiap="Ж-Л";
 		   }else if("3".equals(idAlf)){
 			 alfDiap="М-Т";
 		   }else if("4".equals(idAlf)){
 			 alfDiap="У-Ш";
 		   }else if("5".equals(idAlf)){
 			 alfDiap="Щ-Я";
 		   }else{
 			 alfDiap="А-ЕЁ"; 
 		   }
 		   
 		   
   		lo=entityManager.createNativeQuery(
		    		(new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_fio "))
                    .append("from ( ")
                    .append("select  AU_FULL.ID_SRV t1_id, AU_FULL.LOGIN t1_login, ")
                    .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO) t1_fio ")
                    .append("from  AC_USERS_KNL_T AU_FULL, ")
                    .append("ISP_BSS_T cl_usr_full, ")
                    .append("(select max(CL_usr.ID_SRV) CL_USR_ID, CL_USR.SIGN_OBJECT CL_USR_CODE ")
                    .append("from ISP_BSS_T cl_usr, ")
                    .append("AC_USERS_KNL_T au ")
                    .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
                    .append("group by CL_usr.SIGN_OBJECT) t2 ")
                    .append("where  AU_FULL.UP_SIGN_USER=t2.CL_USR_CODE(+) ")
                    .append("and CL_USR_FULL.ID_SRV(+)=t2.CL_USR_ID ")
                    .append("and AU_FULL.STATUS!=2 ")
                    .append(") t1 ") 
                    .append("where REGEXP_LIKE(UPPER(t1_fio), '^[")
 		    		.append(alfDiap)
	    		    .append("]') ")
	                .append("order by t1_fio ")
 		    		.toString())
  		    	 .getResultList();
  	    	 
   		
  	       this.usrAlfList=new ArrayList<BaseItem>();
  	       
  	       for(Object[] objectArray :lo){
  	    	 AcUser au = new AcUser();
  	    	 
  	    	 this.usrAlfList.add(au);
  	    	 
  	    	 au.setIdUser(Long.valueOf(objectArray[0].toString()));
  	    	 au.setFio(objectArray[2]!=null?objectArray[2].toString():"");
  	    	 au.setLogin(objectArray[1]!=null?objectArray[1].toString():"");
  	       }
  	       
  	     log.info("RolManager:getUsrAlfList:size1:"+this.usrAlfList.size());
  	      	
  	    if(!"UpdFact".equals(remoteAudit)){
 		   
  	    	     List<Long> listUsr=entityManager.createQuery(
  	 		    		 "select o.idUser from AcUser o,  AcLinkUserToRoleToRaion o1 " 
  	 		    		 + "where o1.pk.acUser = o.idUser " 
  	 		    		 + "and o1.pk.acRole = :acRole ")
  	 					 .setParameter("acRole", Long.valueOf(sessionId))
  	 		      		 .getResultList();
  	 		 
  	    	     log.info("RolManager:getUsrAlfList:size2:"+listUsr.size());
  	    	     
  	 		     for(BaseItem user :this.usrAlfList){
  	 	           if (listUsr.contains(user.getBaseId())){  
  	 	        	  ((AcUser)user).setUsrChecked(true);
  	 			   }
  	 	         } 
  	 		     
  	 	 }
  	  	}
   	return this.usrAlfList;
   }
   public void setUsrAlfList(List<BaseItem> usrAlfList) {
		this.usrAlfList = usrAlfList;
   }
   
   
   
   public String getStListRolesCodesArm(Long idArm){
	   String result="";
	   log.info("rolManager:getStListRolesCodesArm:idArm:"+idArm);
	   
	   if(idArm==null){
	    	return result;
	   }
	    
	    List<Object> lo=null;	    
		try{			
			lo=entityManager.createNativeQuery(
		  			"select rl.sign_object "
	                + "from AC_ROLES_BSS_T rl "
	                + "where rl.up_IS=? ")
				.setParameter(1, idArm)
				.getResultList();	  	
	 	   StringBuffer sbfResult=new StringBuffer();
	       for(Object objectArray :lo){
	    	   sbfResult.append("`~").append(objectArray.toString());
           }
	       result = sbfResult.substring(2);       
		}catch(Exception e){
			 log.error("rolManager:getStListRolesCodesArm:error:"+e);
		} 
	   return result;
   }
   
   public boolean getRoleCodeExist() {
	    return roleCodeExist;
   }
   
 
   
   private boolean roleCodeExistCrt(Long idArm, String roleCode) throws Exception {
	   this.roleCodeExist = MCData.hasAtr(log, entityManager, "AC_ROLES_BSS_T", atrOp("up_IS", idArm), atrOp("sign_object", roleCode));
	   if(this.roleCodeExist) log.info("RoleManager:roleCodeExistCrt:addLoginExist!");	
	   return this.roleCodeExist;
  }
   
   private boolean roleCodeExistUpd(Long idArm, String roleCode, Long idRole) throws Exception {
	   
		log.info("RoleManager:codeRoleExistUpd:roleCode:"+roleCode);
		log.info("RoleManager:codeRoleExistUpd:idRole:"+idRole);
		log.info("RoleManager:codeRoleExistUpd:idArm:"+idArm);
		
		if(roleCode!=null){
		  try{
			  List<Object> lo=entityManager.createNativeQuery(
	  			        (new StringBuilder("select rl.sign_object "))
                        .append("from AC_ROLES_BSS_T rl ")
                        .append("where rl.up_IS=? ")
                        .append("and RL.SIGN_OBJECT=? ")
                        .append("and RL.ID_SRV !=? ")
	  			        .toString())
			  				.setParameter(1, idArm)
			  				.setParameter(2, roleCode)
			  				.setParameter(3, idRole)
			  				.getResultList();
			  
			  if(!lo.isEmpty()){
				  roleCodeExist=true;
			  }
			  
			  log.info("RoleManager:roleCodeExistUpd:addLoginExist!");		     
		    }catch(Exception e){
	           log.error("RoleManager:roleCodeExistUpd:Error:"+e);
	           throw e;
          }
		}
		return this.roleCodeExist;
 }
  
   public String getDellMessage() {
	   return dellMessage;
   }
   
   public void selectRecord(){
	    String  sessionId = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("sessionId");
	    log.info("selectRecord:sessionId="+sessionId);
	    
	   //  forV/iew/(/); //!!!
	    List<String>  selRecRol = getSessionList("selRecRol");
	    
	    if(selRecRol==null){
	       selRecRol = new ArrayList<String>();
	       log.info("selectRecord:01");
	    }
	    
	   
	    AcRole ar = new  AcRole();
	 
	    
	    if(ar!=null){
	     if(selRecRol.contains(sessionId)){
	    	selRecRol.remove(sessionId);
	    	ar.setSelected(false);
	    	 log.info("selectRecord:02");
	     }else{
	    	selRecRol.add(sessionId);
	    	ar.setSelected(true);
	    	log.info("selectRecord:03");
	     }
	    Contexts.getSessionContext().set("selRecRol", selRecRol);	
	    
	    Contexts.getEventContext().set("rolBean", ar);
	    }
	 }
   
   public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
	   try{
		   AuditExportData auditExportDataRol = getSessionItem("auditExportData");
		   auditExportDataRol.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
		   
	   }catch(Exception e){
		   log.error("GroupManager:audit:error:"+e);
	   }
   }
   
   public Boolean getEvaluteForList() {
	
   	log.info("reposManager:evaluteForList:01");
   	if(evaluteForList==null){
   		evaluteForList=false;
    	String remoteAuditRol = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("usrManager:evaluteForList:remoteAudit:"+remoteAuditRol);
     	
    	if(remoteAuditRol!=null&&
    	 
    	   !"OpenCrtFact".equals(remoteAuditRol)&&	
    	   !"OpenUpdFact".equals(remoteAuditRol)&&
    	   !"OpenDelFact".equals(remoteAuditRol)&&
   	       !"onSelColFact".equals(remoteAuditRol)&&
   	       !"refreshPdFact".equals(remoteAuditRol)){
    		log.info("reposManager:evaluteForList!!!");
   		    evaluteForList=true;
    	}
   	 }
       return evaluteForList;
   }
   public Boolean getEvaluteForListFooter() {
		
	  
	   	if(evaluteForListFooter==null){
	   		evaluteForListFooter=false;
	    	String remoteAuditRol = FacesContext.getCurrentInstance().getExternalContext()
		             .getRequestParameterMap()
		             .get("remoteAudit");
		   log.info("usrManager:evaluteForListFooter:remoteAudit:"+remoteAuditRol);
	     
	    	if(getEvaluteForList()&&
	    	    	
	    	   !"protBeanWord".equals(remoteAuditRol)&&	
	    	    	
	   	       !"selRecAllFact".equals(remoteAuditRol)&&
	   	       !"clRecAllFact".equals(remoteAuditRol)&&
	   	      // !remoteAudit equals "clSelOneFact"
	   	       !"onSelColSaveFact".equals(remoteAuditRol)){
	    		log.info("usrManager:evaluteForListFooter!!!");
	   		    evaluteForListFooter=true;
	    	}
	   	 }
	       return evaluteForListFooter;
	   }
   
   		public Boolean getEvaluteForBean() {
		   	if(evaluteForBean==null){
		   		evaluteForBean=false;
		    	String remoteAuditRol = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("remoteAudit");
			    log.info("usrManager:evaluteForBean:remoteAudit:"+remoteAuditRol);
				String sessionId = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("sessionId");
			    log.info("usrManager:evaluteForBean:sessionId:"+sessionId);
		    	if(sessionId!=null && remoteAuditRol!=null &&
		    	   ("rowSelectFact".equals(remoteAuditRol)||	
		    	    "UpdFact".equals(remoteAuditRol))){
		    	      log.info("usrManager:evaluteForBean!!!");
		   		      evaluteForBean=true;
		    	}
		   	 }
		     return evaluteForBean;
		   }

   		
}

