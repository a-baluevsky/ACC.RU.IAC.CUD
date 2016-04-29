package iac.grn.infosweb.context.mc.usr;

import iac.cud.data.usr.JPA_AppUserManager;
import iac.cud.data.usr.JPA_UsrManager;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.dataitems.UCCertItem;
import iac.cud.infosweb.dataitems.UserItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcLinkUserToRoleToRaion;
import iac.cud.infosweb.entity.AcRole;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.AcUsersCertBssT;
import iac.cud.infosweb.entity.GroupUsersKnlT;
import iac.cud.infosweb.entity.Iogv;
import iac.cud.infosweb.entity.IspBssT;
import iac.cud.infosweb.entity.LinkAdminUserSys;
import iac.cud.infosweb.entity.LinkGroupUsersUsersKnlT;
import iac.cud.infosweb.entity.MunicBssT;
import iac.cud.infosweb.entity.UcCertReestr;
import iac.grn.infosweb.context.mc.QuerySvc;
import iac.grn.infosweb.session.audit.actions.ActionsMap;
import iac.grn.infosweb.session.audit.actions.ResourcesMap;
import iac.grn.infosweb.session.audit.export.AuditExportData;
import iac.grn.infosweb.session.navig.LinksMap;
import iac.grn.serviceitems.BaseTableItem;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javaw.lang.Strings;

import javax.faces.context.FacesContext;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.apache.xml.security.utils.Base64;

import static iac.cud.jboss.SeamComponentAdminEjb.*;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.log.Log;
import org.jboss.seam.transaction.Transaction;
import org.slf4j.LoggerFactory;

/**
 * Управляющий Бин
 * @author bubnov
 *
 */
@Name("usrManager")
 public class UsrManager extends QuerySvc {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1635414533360111699L;

	@Logger private static transient Log log;
	
	 final static  org.slf4j.Logger logger = LoggerFactory.getLogger(UsrManager.class);
	 
	 @In 
	 transient EntityManager entityManager;
	 
		
		
	
	private int connectError=0;
	private Boolean evaluteForList;
	private Boolean evaluteForListFooter;  
	private Boolean evaluteForBean;
	
	
	private List<BaseItem> auditList;
	
	private Long auditCount;
	
	private List <BaseTableItem> auditItemsListSelect;
	
	private List <BaseTableItem> auditItemsListContext;

	
	private List<AcApplication> listUsrArm = null;
	private List<AcApplication> listUsrArmEdit = null;
	private List<AcApplication> listUsrArmForView = null;
	
	private List<GroupUsersKnlT> listUsrGroupForView = null;
	
	private LinksMap linksMap = null;
	private AcUser currentUser = null;
	
	private List<BaseItem> roleList;
	
	private List<BaseItem> groupList;
	
	private String dellMessage = null;
	
	private String[] fioArray={"", "", ""};
	
	private String searchOrg = null;
	
	private String searchDep = null;
	
	
	private List<BaseItem> applicantList;
	
	private List<BaseItem> userCertList;
	
	private boolean addLoginExist=false;
	
	private boolean addCertNumExist=false;
	
	private String invalidMessageCrt = null;
	
	private Long idUserCrt;
	
	private static Map<String, String> jpa_to_oracle;  

	private List<BaseItem> ISList;
	
	private List<BaseItem> ISSelectListForView;
	
	private String commentApp = null;
	
	private Boolean listUserSysEmpty;
	
	private HashMap<String, Boolean> allowReestrValues = new HashMap<String, Boolean>();
	 
	private Boolean accOrgManager;
	
	//проверка для любого пользователя
		
	private List<MunicBssT> municList;
	
	private String note;
	private String lastLoginTime;
	
	static{
		
			jpa_to_oracle = new HashMap<String, String>();
			
			jpa_to_oracle.put("o.idSrv", "GR.ID_SRV");
			jpa_to_oracle.put("o.full", "GR.FULL_");
			
	}
	
	
	public boolean getAddLoginExist() {
		return addLoginExist;
	}
	
	public boolean getAddCertNumExist() {
		return addCertNumExist;
	}
	
	public List<BaseItem> getAuditList(int firstRow, int numberOfRows){
	  String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("auditManager:getAuditList:remoteAudit:"+remoteAudit);
	  
	  
	  log.info("getAuditList:firstRow:"+firstRow);
	  log.info("getAuditList:numberOfRows:"+numberOfRows);
	  
	  List<BaseItem> usrListCached = getSessionList("usrListCached");
	  if(auditList==null){
		  log.info("getAuditList:01");
		 	if(("rowSelectFact".equals(remoteAudit)||
			    "selRecAllFact".equals(remoteAudit)||
			    "clRecAllFact".equals(remoteAudit)||
			    "clSelOneFact".equals(remoteAudit)||
			    "onSelColSaveFact".equals(remoteAudit))&&
			    usrListCached!=null){
		 		log.info("getAuditList:02:"+usrListCached.size());
			    	this.auditList=usrListCached;
			}else{
				log.info("getAuditList:03");
		    	invokeLocal("list", firstRow, numberOfRows, null);
			    Contexts.getSessionContext().set("usrListCached", this.auditList);
			    log.info("getAuditList:03:"+this.auditList.size());
			}
		 	
		 	List<String>  selRecUsr = getSessionList("selRecUsr");
		 	if(this.auditList!=null && selRecUsr!=null) {
		 		 for(BaseItem it:this.auditList){
				   if(selRecUsr.contains(it.getBaseId().toString())){
					 
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
	public void invokeLocal(String type, int firstRow, int numberOfRows,
	           String sessionId) {
		try{			 
			 log.info("UserManager:invokeLocal");			 
			 JPA_UsrManager jpaUsrManager = new JPA_UsrManager();
             // 13.02.15: ab 
			 AcUser cau = getSessionItem("currentUser");
			 if(cau!=null && cau.getIsAccOrgManagerValue()) {
				String curUserName = cau.getName1();
				String sCurUserOrg = cau.getUpSign();
				log.info("invokeLocal - filter for: "+curUserName+", "+sCurUserOrg);
				jpaUsrManager.IsAccOrgManagerValue = true;
				jpaUsrManager.UpSign = sCurUserOrg;
			 }
			 UsrStateHolder usrStateHolder = getSessionItem("usrStateHolder");			 
			 Map<String, String> filterMap = usrStateHolder.getColumnFilterValues();
			 jpaUsrManager.setFilter(filterMap);                
			 log.info("User:invokeLocal:list:filterQuery: "+jpaUsrManager.getWhereAndClause());
				
			 if("list".equals(type)){
				 log.info("User:invokeLocal:list:01");				 
   				 jpaUsrManager.setSortOrders(usrStateHolder.getSortOrders().entrySet());
                 log.info("User:invokeLocal:list:orderQueryUsr:"+jpaUsrManager.getOrderByClause());
                 List<Object[]> lo=jpaUsrManager.getAuditList(entityManager, firstRow, numberOfRows);
                 StringBuilder errInfo = new StringBuilder();
                 auditList = UserItem.FromRows(lo, errInfo);
                 if(errInfo.length()>0) log.error(errInfo.toString());
               // 17.02.15: AB: MANTIS-4954
               m_QueryStats = new long[]{1+firstRow, firstRow+auditList.size(), (auditCount==null)?0:auditCount};
               //System.out.println("m_QueryStats = "+QueryStatsToString());   
               
             log.info("User:invokeLocal:list:02");
             
			 } else if("count".equals(type)){
				 log.info("UserList:count:01");
                 auditCount = jpaUsrManager.getAuditCount(entityManager);
                 // 17.02.15: AB: MANTIS-4954
                 if(m_QueryStats!=null) {
                	 m_QueryStats[2] = auditCount;
                	 //System.out.println("m_QueryStats = "+QueryStatsToString());
                 }                 
               log.info("User:invokeLocal:count:02:"+auditCount);
           	 } else if("bean".equals(type)){
				 
			 }
		}catch(Exception e){
			  log.error("User:invokeLocal:error:"+e);
			  evaluteForList=false;
			  FacesMessages.instance().add("Ошибка!");
		}
	}


   public void forView(String modelType) {
	   String  usrId = getSSID();
	  log.info("forView:sessionId:"+usrId);
	  log.info("forView:modelType:"+modelType);
	  if(!Strings.isNullOrEmpty(usrId)){
			if(modelType==null){
		    	return ;
		    }
		 UserItem au = (UserItem)searchBean(usrId);
		 
		 // то надо когда мы после сохранения пользователя
		 // вызываем invokeRemoteAuditBeanContext для сохранения контекста
		 // созданного пользователя
		 if(au==null){
			 au = getUserItem(Long.valueOf(usrId));
		 }
		 
		 
		 Long appCode = getApplicationLinksMap().getAppCode();
    	 
	     List<AcRole> rlist = (List<AcRole>)JPA_AppUserManager.getAcRoleList(entityManager, Long.valueOf(usrId), appCode);
	     
	    	if(!rlist.isEmpty()){
	    		log.info("forView:setCudRole");
	    		au.setIsCudRole(1L);
	    		
	    		for(AcRole ar :rlist){
	    			
	    			if (ar.getSign().equals("role:urn:sys_admin_cud")){
	    				au.setIsSysAdmin(1L);
	    				break;
	    			}
	    			
	    		}
	    		
	    	}
	     Contexts.getEventContext().set("usrBeanView", au);
		 }
   }
   
   private BaseItem searchBean(String sessionId){
    	
      if(!Strings.isNullOrEmpty(sessionId)){
    	 List<BaseItem> usrListCached = getSessionList("usrListCached");
		if(usrListCached!=null){
			for(BaseItem it : usrListCached){
				 
			 
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
   
   public static boolean isPowerUser(AcUser u, String pageCode, String idPerm){
	   return (u.getAllowedSys()==null && !u.getIsAccOrgManagerValue()) || u.isAllowedReestr(pageCode, idPerm);
   }    
   public static boolean isPowerUser2(AcUser u){
	   return isPowerUser(u, "002", "2");
   }
   public static boolean isPowerUser3(AcUser u){
	   return isPowerUser(u, "002", "3");
   }   
    
   public void addUsr(){
	   log.info("usrManager:addUsr:01");
	   
	  
	   
	   AcUser usrBeanCrt = getConversationItem("usrBeanCrt");
	   
	   IspBssT clUsrBean = getConversationItem("clUsrBean");
	 
	   Iogv clOrgBeanIogv = getConversationItem("clOrgBeanIogv");

	   
	   if(usrBeanCrt==null){
		   return;
	   }
	 
	   try {
		   final String snils = usrBeanCrt.getSnils();
		   if(snils!=null)
			   usrBeanCrt.setSnils(snils.trim());
			   
		   log.info("usrManager:addUsr:clUsrBean:SignObject:"+clUsrBean.getSignObject());
		   log.info("usrManager:addUsr:clUsrBean:Name1:"+usrBeanCrt.getName1());
		   
		   AcUser cau = getSessionItem("currentUser");
		    
		   
	      if((!isPowerUser2(cau)|| !loginExist(usrBeanCrt.getLogin().trim()))&&!certNumExistCrt(usrBeanCrt.getCertificate())) {
	    	   
	    	   if(clUsrBean.getSignObject()!=null){
	    	   
	    		   log.info("usrManager:addUsr:02");
	    		  
	    		   usrBeanCrt.setName1(" ");
	    		   usrBeanCrt.setName2(" ");
	    		   usrBeanCrt.setSurname(" ");
	      
	    	
	    	 usrBeanCrt.setUpSignUser(clUsrBean.getSignObject());
	    	    	  
	    	  usrBeanCrt.setUpSignIogv(clUsrBean.getSignObject().substring(0,3)+"00000");
	    	 //изменение для учёта отделов как организаций 
	    	 //usrBeanCrt.setUpSign(clOrgBean.getSignObject());
	    	  
	       }else{
	       	  log.info("usrManager:addUsr:03");
	    	   
	    	  usrBeanCrt.setUpSignIogv(clOrgBeanIogv.getCod());
	       }
	    	 
	    	 log.info("usrManager:addUsr:04");
	    	   
	    	 if(usrBeanCrt.getCertificate()!=null&&!"".equals(usrBeanCrt.getCertificate().trim())){
	    	   usrBeanCrt.setCertificate(usrBeanCrt.getCertificate().replaceAll(" ", "") .toUpperCase());
	          }else{
	           usrBeanCrt.setCertificate(null); 
	          }
	    	 
	    	 //не выбрали значение из списка
	    	 if(usrBeanCrt.getMunic()!=null&&
	    		usrBeanCrt.getMunic().equals(-1L)){
	    		 usrBeanCrt.setMunic(null);
	    	 }
	    	   
	    	  usrBeanCrt.setCreator(cau.getIdUser()); 
	    	  usrBeanCrt.setCreated(new Date());
	    	  
	    	 if(!isPowerUser2(cau)){
	    		  //пользователь имеет право только создать заявку 
	    		  //на создание пользователя
	    		  log.info("usrManager:addUsr:05");	    		  
	    		  addUsrApp(usrBeanCrt, commentApp);	    		  
	    		  audit(ResourcesMap.APP_USER, ActionsMap.CREATE); 
	    	  }else{	    	  
	    	     entityManager.persist(usrBeanCrt);
	    	  	 idUserCrt=usrBeanCrt.getIdUser();
	    	  	 log.info("UsrManager:addUsr:idUserCrt:"+idUserCrt);		    	 
	    	  	 audit(ResourcesMap.USER, ActionsMap.CREATE);
	    	  }	 
	    	  	 
	    	 
	    	   }   
	          }catch (Exception e) {
	             log.error("UsrManager:addUsr:ERROR="+e);
	             logger.error("addUsr");
	           }
	   
   }
   
   private void addUsrApp(AcUser usrBeanCrt, String commentApp){
	   
	   log.info("UsrManager:addUsrApp:01");
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   String idSess =(String) this. entityManager.createNativeQuery("select to_char(JOURN_APP_USER_SEQ.nextval) sgnc from dual").getSingleResult();
	        
		   Long idApp = Long.valueOf(idSess);
		
		   entityManager.createNativeQuery(
 	     		   (new StringBuilder("insert into JOURN_APP_USER_BSS_T ( SURNAME_USER, NAME_USER, PATRONYMIC_USER, "))
                     .append("SIGN_USER, POSITION_USER, EMAIL_USER, PHONE_USER, ") 
                     .append("CERTIFICATE_USER, NAME_DEPARTAMENT, NAME_ORG, SIGN_ORG, ") 
                     .append("UP_USER, SECRET, COMMENT_APP, ID_SRV ) ") 
						.append(" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ")
						.toString())
 	     		    .setParameter(1, usrBeanCrt.getSurname())
         	 		.setParameter(2, usrBeanCrt.getName1())
         	 		.setParameter(3, usrBeanCrt.getName2())
         	 		.setParameter(4, usrBeanCrt.getUpSignUser())
         	 		.setParameter(5, usrBeanCrt.getPosition())
 	     		    .setParameter(6, usrBeanCrt.getEmail())
         	 		.setParameter(7, usrBeanCrt.getPhone())
         	 		.setParameter(8, usrBeanCrt.getCertificate())
         	 		.setParameter(9, usrBeanCrt.getDepartment())
         	 		.setParameter(10, "")
         	 		.setParameter(11, usrBeanCrt.getUpSign())
         	 		.setParameter(12, usrBeanCrt.getCreator())
         	 		.setParameter(13, secret)
         	 		.setParameter(14, commentApp)
         	 		.setParameter(15, idApp)
 	     		   .executeUpdate();
			
		   
		   UsrRoleStateHolder usrRoleStateHolder = getSessionItem("usrRoleStateHolder");
			
			
			List<Long> guuExistList =  usrRoleStateHolder.getAppRolesList();
			
			if(!guuExistList.isEmpty()){
				
			  for(Long idRole :guuExistList) {
				 entityManager.createNativeQuery(
		 	     		   "insert into ROLES_APP_USER_BSS_T (ID_SRV, UP_APP_USER, UP_ROLE ) " 
		 	     		   + " values (ROLES_APP_USER_SEQ.nextval, ?, ?) ")
		 	     		    .setParameter(1, idApp)
		         	 		.setParameter(2, idRole)
		         	 	   .executeUpdate();
				}
			  
			  usrRoleStateHolder.resetAppRolesList();
			  
			}
			
		   
	   }catch(Exception e){
		   log.error("UsrManager:addUsrApp:error:"+e);
	   }
	   
   }
   
   public void updUsr(){
	   
	   log.info("UsrManager:updUsr:01");
	   
	   DateFormat df = new SimpleDateFormat ("dd.MM.yy");
	   DateFormat dfTime = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
	   
	   AcUser usrBean = getConversationItem("usrBean");
	   
	   String  sessionId = getSSID();
	   log.info("UsrManager:updUsr:sessionId_:"+sessionId);
	
	   if(usrBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		 
		   
		   AcUser  cau = getSessionItem("currentUser");
		  
		   AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
		
		   aum.setSnils(usrBean.getSnils());  
		
		if((((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3"))|| !loginExistUpd(usrBean.getLogin().trim(), Long.valueOf(sessionId)))&&!certNumExistUpd(usrBean.getCertificate(), Long.valueOf(sessionId))){
			  
		 
			  
		 //с 21.05.2014 убрали (disabled) с формы строку с номером сертификата
		  //но при этом важно оставить уже имеющиеся данные
		  //то есть с формы сертификат не придёт, а нам надо оставить в базе 
		  //имеющийся сертификат. 
		  //Поэтому aum/.setCertificate надо закомментировать
		  
		 
		  if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
    		  //пользователь имеет право только создать заявку 
    		  //на изменение пользователя
    		  log.info("usrManager:updUsr:05_1");
    		  
    		  //для UP_USER_APP - субъекта заявки
    		  usrBean.setIdUser(Long.valueOf(sessionId));
    		 //для UP_USER - подавателя заявки (текущий пользователь)
    		  usrBean.setModificator(cau.getIdUser());
    		  //или можно в updUsrApp вместо usrBean передать aum
    		  
    		  updUsrApp(usrBean, commentApp);
    		  
    		  audit(ResourcesMap.APP_USER_UPDATE, ActionsMap.CREATE);
    		  
    		  
    	  }else{
		  
    		  if(aum.getUpSignUser()==null){
    			   aum.setName1(usrBean.getName1());
    			   aum.setName2(usrBean.getName2());
    			   aum.setSurname(usrBean.getSurname());
    			   aum.setEmail(usrBean.getEmail());
    			   aum.setPhone(usrBean.getPhone());
    			   aum.setPosition(usrBean.getPosition());
    			   aum.setDepartment(usrBean.getDepartment());
    			  }
    		  
    	 //!!!
		  aum.setLogin(usrBean.getLogin().trim());
		  
		  aum.setPassword(usrBean.getPassword().trim());
		  
		 
		  if(usrBean.getStatus()!=null) { 
			  // статус при определённых условиях 
			  // <c:if test="#{param['onUpdate']!=null and currentUser.idUser!=usrBean.idUser}"> 
	          // <!--условие ослабленное, так как добавляется условие видимости кнопки 'изменить'.
	          //    изменить сам себя может только суперюзер-->
	          // <!--c:if test="#{currentUser.idUser!=linksMap.superUserCode or usrBean.idUser!=linksMap.superUserCode}"--> 
			  // disabled
		     aum.setStatus(usrBean.getStatus());
		     
		  // статус и старт/финиш идут одним блоком 
			  aum.setStart(usrBean.getStart());
			  aum.setFinish(usrBean.getFinish());
		  }
		  
		//не выбрали значение из списка
	     if(usrBean.getMunic()!=null&&
	    	 usrBean.getMunic().equals(-1L)){
	    	 usrBean.setMunic(null);
	     }
	      aum.setMunic(usrBean.getMunic());
		  
		  aum.setModificator(cau.getIdUser());
		  aum.setModified(new Date());
		  
		  aum.setNote(usrBean.getNote());
		  
		  
		     entityManager.flush();
		  
	        //pidUsr - global переменная!!!

	         entityManager.refresh(aum);
	     	
	         audit(ResourcesMap.USER, ActionsMap.UPDATE); 
	    	 
    	  } 
		  
		 }	 
	    	
		
			 //всё равно обновляем состояние бина
		      //для заявки тоже
	   	    UserItem au = (UserItem)searchBean(sessionId);
	    	 
	    	 if(au!=null){
	    	
	    		 if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    		 
		    		 // режиме заявок пользователю здесь доступно 
		    		 // редактирование только аттрибутов
		    		 }else{	 
	    		 
	    		 if(aum.getUpSignUser()==null){
	    			   au.setFio(usrBean.getSurname()+" "+usrBean.getName1()+" "+usrBean.getName2());
	    			   au.setEmail(usrBean.getEmail());
	    			   au.setPhone(usrBean.getPhone());
	    			   au.setPosition(usrBean.getPosition());
	    			   au.setDepartment(usrBean.getDepartment());
	    		 }
	    			 
	    		 
	    		 // режиме заявок пользователю здесь доступно 
	    		 // редактирование только аттрибутов
	    		
	    		 
	    			  if(usrBean.getCertificate()!=null&&!"".equals(usrBean.getCertificate().trim())){
	    				  au.setCert(usrBean.getCertificate().replaceAll(" ", "").toUpperCase());
	    		      }else{
	    		    	  au.setCert(null);
	    		      }
	    			  
	    			   au.setLogin(usrBean.getLogin().trim());
	    			  
	    			 
	    			  if(usrBean.getStatus()!=null) { 
	    				  // статус при определённых условиях 
	    				  // <c:if test="#{param['onUpdate']!=null and currentUser.idUser!=usrBean.idUser}"> 
	    		          // <!--условие ослабленное, так как добавляется условие видимости кнопки 'изменить'.
	    		          //    изменить сам себя может только суперюзер-->
	    		          // <!--c:if test="#{currentUser.idUser!=linksMap.superUserCode or usrBean.idUser!=linksMap.superUserCode}"--> 
	    				  // disabled
	    			     au.setStatus(usrBean.getStatus());
	    			     
	    			     // статус и старт/финиш идут одним блоком 
	    			     au.setStart(usrBean.getStart()!=null?df.format(usrBean.getStart()):null);
		    			 au.setFinish(usrBean.getFinish()!=null?df.format(usrBean.getFinish()):null);
	    			  }
	    			  
	    			  
	    		 
	    			  
	    			  
	    			  au.setUpdUserLogin(cau.getLogin());
	    			  au.setUpdDate(dfTime.format(new Date()));
	    	 }	
	    			  
	    			  
	    			  Contexts.getEventContext().set("usrBeanView", au); 
	    	 }else{
	    		 
	    		 au = getUserItem(Long.valueOf(sessionId));
	    		 if(au!=null){
	    		   Contexts.getEventContext().set("usrBeanView", au); 
	    		 }
	    	 }
	      	 
	     }catch (Exception e) {
           log.error("UsrManager:updUsr:ERROR:"+e);
          }
   }
   
 private void updUsrApp(AcUser usrBean, String commentApp){
	   
	   log.info("UsrManager:updUsrApp:01:"+usrBean.getModificator());
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
				   (new StringBuilder("insert into JOURN_APP_USER_MODIFY_BSS_T (ID_SRV, "))
	     		     .append("SURNAME_USER, NAME_USER, PATRONYMIC_USER, ") 
		                 .append("SIGN_USER, POSITION_USER, EMAIL_USER, PHONE_USER, ") 
		                 .append("CERTIFICATE_USER, NAME_DEPARTAMENT, ") 
	     		     .append("UP_USER_APP, UP_USER, SECRET, COMMENT_APP ) ") 
	     		     .append(" values ( JOURN_APP_USER_MODIFY_SEQ.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ")
	     		     .toString())
		 	     		  
		 	     		   .setParameter(1, usrBean.getSurname())
		 	     		    .setParameter(2, usrBean.getName1())
		 	     		    .setParameter(3, usrBean.getName2())
		 	     		    .setParameter(4, null)
		         	 	    .setParameter(5, usrBean.getPosition())
		 	     		    .setParameter(6, usrBean.getEmail())
		 	     		    .setParameter(7, usrBean.getPhone())
		 	     		    .setParameter(8, null)
		 	     		    .setParameter(9, usrBean.getDepartment())
		 	     		    
		 	     		    .setParameter(10, usrBean.getIdUser())
		         	 		.setParameter(11, usrBean.getModificator())
		         	 		.setParameter(12, secret)
 	     			        .setParameter(13, commentApp)
 	     		   .executeUpdate();
			
	   }catch(Exception e){
		   log.error("UsrManager:updUsrApp:error:"+e);
	   }
	   
   }
   
 public void updUsrAppAcc(){
	   
	   log.info("UsrManager:updUsrAppAcc:01");
	   
	   AcUser usrBean = getConversationItem("usrBean");
	   
	   String  sessionId = getSSID();
	   log.info("UsrManager:updUsrAppAcc:sessionId:"+sessionId);
	
	   if(usrBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		 
		   
		   AcUser  cau = getSessionItem("currentUser");
		  
		  
		if(!loginExistUpd(usrBean.getLogin().trim(), Long.valueOf(sessionId))&&!certNumExistUpd(usrBean.getCertificate(), Long.valueOf(sessionId))){
			  
		 
		 //для UP_USER_APP - субъекта заявки
  		  usrBean.setIdUser(Long.valueOf(sessionId));
  		 //для UP_USER - подавателя заявки (текущий пользователь)
  		  usrBean.setModificator(cau.getIdUser());
		  
		  log.info("usrManager:updUsrAppAcc:05");
  		  
  		  updUsrAppAcc(usrBean, commentApp);
  		  
  		  audit(ResourcesMap.APP_USER_ACC, ActionsMap.CREATE) ;
		 }	 
	    	
		 //всё равно обновляем состояние бина
	      //для заявки тоже
 	   UserItem au = (UserItem)searchBean(sessionId);
  	 
  	   if(au!=null){
  		  Contexts.getEventContext().set("usrBeanView", au); 
  	   }else{
  		 
  		 au = getUserItem(Long.valueOf(sessionId));
  		 if(au!=null){
  		   Contexts.getEventContext().set("usrBeanView", au); 
  		 }
  	   }
		
		
	   	 
	     }catch (Exception e) {
         log.error("UsrManager:updUsr:ERROR:"+e);
       }
 }
 
 
 private void updUsrAppAcc(AcUser usrBean, String commentApp){
	   
	   log.info("UsrManager:updUsrAppAcc:01");
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
	     		   "insert into JOURN_APP_USER_ACCMODIFY_BSS_T (ID_SRV, CERTIFICATE_USER, LOGIN_USER, PASS_USER, " 
	     		                             + "UP_USER, UP_USER_APP, SECRET, COMMENT_APP ) " 
	     		   + " values ( JOURN_APP_USER_ACCMODIFY_SEQ.nextval, ?, ?, ?, ?, ?, ?, ? ) ")
	     		.setParameter(1, usrBean.getCertificate())
       	 		.setParameter(2, usrBean.getLogin())
       	 		.setParameter(3, usrBean.getPassword())
       	 		.setParameter(4, usrBean.getModificator())
       	 		.setParameter(5, usrBean.getIdUser())
	     		.setParameter(6, secret)
       	 		.setParameter(7, commentApp)
	      .executeUpdate();
			
	   }catch(Exception e){
		   log.error("UsrManager:updUsrAppAcc:error:"+e);
	   }
	   
 }
 
  public void updUsrAppBlock(){
	   
	   log.info("UsrManager:updUsrAppBlock:01");
	   
	     AcUser usrBean = getConversationItem("usrBean");
	   
	   String  sessionId = getSSID();
	   log.info("UsrManager:updUsrAppBlock:sessionId:"+sessionId);
	
	   if(usrBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		 
		   
		   AcUser  cau = getSessionItem("currentUser");
		  
		  
		 //для UP_USER_APP - субъекта заявки
		  usrBean.setIdUser(Long.valueOf(sessionId));
		 //для UP_USER - подавателя заявки (текущий пользователь)
		  usrBean.setModificator(cau.getIdUser());
		  
		  log.info("usrManager:updUsrAppBlock:05");
		  
		  updUsrAppBlock(usrBean, commentApp);
		  
	     /*	
		 //всё равно обновляем состояние бина
	      //для заявки тоже
	   */
		
		  audit(ResourcesMap.APP_USER_BLOCK, ActionsMap.CREATE) ;
	   	 
	     }catch (Exception e) {
       log.error("UsrManager:updBlock:ERROR:"+e);
     }
}
  private void updUsrAppBlock(AcUser usrBean, String commentApp){
	   
	   log.info("UsrManager:updUsrAppBlock:01");
	   
	 //modeExec:
  	 //0 - BLOCK
  	 //1 - UNBLOCK 
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
	     		   "insert into JOURN_APP_BLOCK_BSS_T (ID_SRV, BLOCK_REASON, " 
	     		                             + "UP_USER, UP_USER_APP, SECRET ) " 
	     		   + " values (  JOURN_APP_BLOCK_SEQ.nextval, ?, ?, ?, ? ) ")
	     		.setParameter(1, commentApp)
      	 		.setParameter(2, usrBean.getModificator())
      	 		.setParameter(3, usrBean.getIdUser())
      	 		.setParameter(4, secret)
            .executeUpdate();
			
	   }catch(Exception e){
		   log.error("UsrManager:updUsrAppBlock:error:"+e);
	   }
	   
}
 
  
   public UserItem getUserItem(Long idUser){
	 
	   //!!! метод пкбличный - т.к. вызывается ещё из BindManager
	   
	   log.info("UsrManager:getUserItem:idUser:"+idUser);
	   
	   if(idUser==null){
		  return null;
	   }
	   
	   try{
           List<Object[]> lo=null;
           UserItem ui = null;
           DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
           
         
           
           lo=entityManager.createNativeQuery(
        		   (new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name, "))
				     .append("t1.t1_org_code, t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, t1.t1_status, ")
				      .append("t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login, ")
				      .append("t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_iogv_bind_type, t1.t1_snils  ")
				     .append("from( ")
				     .append("select AU_FULL.ID_SRV t1_id, AU_FULL.login t1_login, AU_FULL.CERTIFICATE t1_cert, t2.CL_USR_CODE t1_usr_code, ")
				      .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_fio, ")
				       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.PHONE, CL_USR_FULL.PHONE ) t1_tel, ")
				       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.E_MAIL, CL_USR_FULL.EMAIL) t1_email, ")
				       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.POSITION, CL_USR_FULL.POSITION)t1_pos, ")
				       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SNILS, CL_USR_FULL.SNILS)t1_snils, ")
				       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.DEPARTMENT, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_)) t1_dep_name, ")
					  .append("t1.CL_ORG_CODE t1_org_code, CL_ORG_FULL.name t1_org_name, ")
					  .append("cl_org_adr_full.NAME_ADDR t1_org_adr, ")
				       .append("'' t1_org_tel, ")
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
				        .append("AU_FULL.UP_BINDING t1_iogv_bind_type ")
				     .append("from ")
					.append("(select max(CL_ORG.ID) CL_ORG_ID,  CL_ORG.cod  CL_ORG_CODE ")
					.append("from IOGV cl_org, ")
				     .append("AC_USERS_KNL_T au ")
					.append("where AU.UP_SIGN_IOGV = CL_ORG.cod ")
					.append("group by CL_ORG.cod) t1, ")
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
					 .append("IOGV cl_org_full, ")
				     .append("ISP_BSS_T cl_usr_full, ")
				     .append("ISP_BSS_T cl_dep_full, ")
				     .append("AC_USERS_KNL_T au_full, ")
				     .append("AC_USERS_KNL_T usr_crt, ")
				     .append("AC_USERS_KNL_T usr_upd, ")
					 .append("ADDR_IOGV cl_org_adr_full ")
				     .append("where cl_org_full.ID= CL_ORG_ID ")
				     .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
				     .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
					 .append("and au_full.UP_SIGN_IOGV = CL_ORG_CODE ")
				     .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
				     .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
				     .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
				     .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ") 
                     .append("and cl_org_adr_full.COD_IOGV(+) =  CL_ORG_CODE ")
                		 .append("and cl_org_adr_full.status(+) = 'A' ")
				     .append("and au_full.ID_SRV=? ")
				     .append(")t1 ")
		   .toString())
         .setParameter(1, idUser)
         .getResultList();
           
           for(Object[] objectArray :lo){
        	   try{
        		   log.info("UsrManager:getUserItem:login:"+objectArray[1].toString());
        		   
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
        			  objectArray[24]!=null?Long.valueOf(objectArray[24].toString()):null,
        			  objectArray[25]!=null?objectArray[25].toString():""	  
        			   );
        	     return ui;
        	   }catch(Exception e1){
        		   log.error("getUserItem:for:error:"+e1);
        	   }
           }  
	   }catch(Exception e){
		   log.error("getUserItem:error:"+e);
	   }
	   return null;
   }
 
  
 
 public void updUsrRole(){
	   
	   log.info("usrManager:updUsrRole:01");
	   
	   
	   AcUser usrBean = getConversationItem("usrBean");
	   
	   String idArm = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("idArm");
	   String  sessionId = getSSID();
	   log.info("usrManager:updUsr:idArm:"+idArm);
	   log.info("usrManager:updUsr:sessionId:"+sessionId);
	
	   if(usrBean==null || sessionId==null || idArm==null){
		   return;
	   }
	
	   try {
		   
		  AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
	
		
		
		  List<AcLinkUserToRoleToRaion> guuExistList =  aum.getAcLinkUserToRoleToRaions();
		  
		  
	      for(BaseItem rol:this.roleList){
	    			  log.info("UsrManager:editUsr:updUsrRole:"+((AcRole)rol).getRoleTitle());
	    			  log.info("UsrManager:editUsr:updUsrRole:"+((AcRole)rol).getUsrChecked());
	    			  
	    			  if(((AcRole)rol).getUsrChecked().booleanValue()){ 
	    				  //отмечен
	    			            AcLinkUserToRoleToRaion au = new AcLinkUserToRoleToRaion(((AcRole)rol).getIdRol(), Long.valueOf(sessionId));
	    			            au.setCreated(new Date());
	    			            au.setCreator(Long.valueOf(1));
	    			            
	    			            if(guuExistList.contains(au)){
	    			            	//есть в базе
		    			        	 //ничего не делаем. и так есть в базе
		    			        	 log.info("usrManager:updUsrRole:02");
		    			         }else{
		    			           
		    			            guuExistList.add(au);
		    			            log.info("usrManager:updUsrRole:03");
		    			        }
	    			  }else{ 
	    				  //не отмечен
	    				  AcLinkUserToRoleToRaion au = new AcLinkUserToRoleToRaion(((AcRole)rol).getIdRol(), Long.valueOf(sessionId));
  			               
			                if(guuExistList.contains(au)){
			                	//есть в базе
			                	
			                	guuExistList.remove(au);
			                	
			                	entityManager.createQuery(
			                		"delete from AcLinkUserToRoleToRaion lgu " 
			                		+ "where lgu.pk.acUser = :acUser " 
			                		+ "and lgu.pk.acRole = :acRole ")
			                	.setParameter("acUser", Long.valueOf(sessionId))
			                	.setParameter("acRole", ((AcRole)rol).getIdRol())
			                	.executeUpdate();
			                	
			                	 log.info("usrManager:updUsrRole:04");
			                }else{
			                //ничего не делаем. и так нет в базе
			                	 log.info("usrManager:updUsrRole:05");
			                }
	    			  }
	    		  }
	     	  
	        aum.setAcLinkUserToRoleToRaions(guuExistList);  
	        entityManager.flush();
	    	 
	        entityManager.refresh(aum);
	    	  
	    	
            UserItem auUm = (UserItem)searchBean(sessionId);
	    	 
	    	if(auUm!=null){
	    		Contexts.getEventContext().set("usrBeanView", auUm); 
	    	}else{
	    		 auUm = getUserItem(Long.valueOf(sessionId));
	    		 if(auUm!=null){
	    		   Contexts.getEventContext().set("usrBeanView", auUm); 
	    		 }
	    	 }
	    	 
	    	usrRoleReset();
	    	audit(ResourcesMap.USER, ActionsMap.UPDATE_ROLE); 
	    	
	     }catch (Exception e) {
           log.error("UsrManager:editUsrRole:ERROR:"+e);
         }
   }
  
 public void updUsrRoleApp(){
	   
	   log.info("usrManager:updUsrRoleApp:01");
	   
	   
	   
	   String idArm = FacesContext.getCurrentInstance().getExternalContext()
		        .getRequestParameterMap()
		        .get("idArm");
	   log.info("usrManager:updUsrRoleApp:idArm:"+idArm);
	  
	   if( idArm==null){
		   return;
	   }
	
	   try {
		   
		
		  UsrRoleStateHolder usrRoleStateHolder = getSessionItem("usrRoleStateHolder");
		
		
		  List<Long> guuExistList =  usrRoleStateHolder.getAppRolesList();

	      for(BaseItem rol:this.roleList){
	    			  log.info("UsrManager:editUsr:updUsrRole:"+((AcRole)rol).getRoleTitle());
	    			  log.info("UsrManager:editUsr:updUsrRole:"+((AcRole)rol).getUsrChecked());
	    			  
	    			  if(((AcRole)rol).getUsrChecked().booleanValue()){ 
	    				  //отмечен
	    			             
	    			            if(guuExistList.contains(((AcRole)rol).getIdRol())){
	    			            	//есть в базе
		    			        	 //ничего не делаем. и так есть в базе
		    			        	 log.info("usrManager:updUsrRole:02");
		    			         }else{
		    			           
		    			            guuExistList.add(((AcRole)rol).getIdRol());
		    			            log.info("usrManager:updUsrRole:03");
		    			        }
	    			  }else{ 
	    				  //не отмечен
	    				   
			                if(guuExistList.contains(((AcRole)rol).getIdRol())){
			                	//есть в базе
			                	
			                	guuExistList.remove(((AcRole)rol).getIdRol());
			                	
			                	
			                	
			                	 log.info("usrManager:updUsrRole:04");
			                }else{
			                //ничего не делаем. и так нет в базе
			                	 log.info("usrManager:updUsrRole:05");
			                }
	    			  }
	    		  }
	      	usrRoleStateHolder.setAppRolesList(guuExistList);
	      
	    	usrRoleReset();
	    	
	    	listUsrArmForView = null;
	    	
	     }catch (Exception e) {
         log.error("UsrManager:editUsrRole:ERROR:"+e);
       }
 }
 
  public void updUsrGroup(){
	   
	   log.info("usrManager:updUsrRole:01");
	   
	    
	   AcUser usrBean = getConversationItem("usrBean");
	   
	   String sessionId = getSSID();
	   log.info("usrManager:updUsrGroup:sessionId:"+sessionId);
	
	   if(usrBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		   
		  AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
	
		
		  List<LinkGroupUsersUsersKnlT> guuExistList =  aum.getLinkGroupUsersUsersKnlTs();
		  
		  log.info("usrManager:updUsrGroup:size1:"+guuExistList.size());
		  
		  
		  log.info("usrManager:updUsrGroup:size2:"+this.groupList.size());
		  
		  for(BaseItem group:this.groupList){
	    			  log.info("UsrManager:editUsr:updUsrGroup:"+((GroupUsersKnlT)group).getFull());
	    			  log.info("UsrManager:editUsr:updUsrGroup:"+((GroupUsersKnlT)group).getUsrChecked());
	    			  
	    			  if(((GroupUsersKnlT)group).getUsrChecked().booleanValue()){// отмечен
	    				  
	    				   LinkGroupUsersUsersKnlT au = new LinkGroupUsersUsersKnlT(Long.valueOf(sessionId), ((GroupUsersKnlT)group).getIdSrv());
	    			            au.setCreated(new Date());
	    			            au.setCreator(Long.valueOf(1));
	    			            
	    			         if(guuExistList.contains(au)){
	    			        	 //есть в базе
	    			        	 //ничего не делаем. и так есть в базе
	    			        	 log.info("usrManager:updUsrGroup:02");
	    			         }else{
	    			            guuExistList.add(au);
	    			            log.info("usrManager:updUsrGroup:03");
	    			         }
	    			  }else{ // не отмечен
	    				    LinkGroupUsersUsersKnlT au = new LinkGroupUsersUsersKnlT(Long.valueOf(sessionId), ((GroupUsersKnlT)group).getIdSrv());
 		            
 			                if(guuExistList.contains(au)){
 			                	//есть в базе
 			                	
 			                	guuExistList.remove(au);
 			                	
 			                	entityManager.createQuery(
 			                		"delete from LinkGroupUsersUsersKnlT lgu " 
 			                		+ "where lgu.pk.acUser = :acUser " 
 			                		+ "and lgu.pk.groupUser = :groupUser ")
 			                	.setParameter("acUser", Long.valueOf(sessionId))
 			                	.setParameter("groupUser", ((GroupUsersKnlT)group).getIdSrv())
 			                	.executeUpdate();
 			                	
 			                	 log.info("usrManager:updUsrGroup:04");
 			                }else{
 			                //ничего не делаем. и так нет в базе
 			                	 log.info("usrManager:updUsrGroup:05");
 			                }
	    			  }
	    		  }
	     	
		  	aum.setLinkGroupUsersUsersKnlTs(guuExistList);
		  	
	   		log.info("usrManager:updUsrGroup:size3:"+aum.getLinkGroupUsersUsersKnlTs().size());
	    	  
	        entityManager.flush();
	    	 
	        entityManager.refresh(aum);
	      	
         UserItem au = (UserItem)searchBean(sessionId);
	    	 
	    	if(au!=null){
	    		Contexts.getEventContext().set("usrBeanView", au); 
	    	}else{
	    		 au = getUserItem(Long.valueOf(sessionId));
	    		 if(au!=null){
	    		   Contexts.getEventContext().set("usrBeanView", au); 
	    		 }
	    	 }
	    	  
	    	usrGroupReset();
	    	
	    	audit(ResourcesMap.USER, ActionsMap.UPDATE_GROUP); 
	    	
	     }catch (Exception e) {
        log.error("UsrManager:editUsrGroup:ERROR:"+e);
      }
}
  
   public void updUsrAdminIS(){
	   
	   log.info("usrManager:updUsrAdminIS:01");
	   
	    AcUser usrBean = getConversationItem("usrBean");
	   
	   String sessionId = getSSID();
	   log.info("usrManager:updUsrAdminIS:sessionId:"+sessionId);
	
	   if(usrBean==null || sessionId==null){
		   return;
	   }
	
	   try {
		 
		  AcUser cau = getSessionItem("currentUser"); 
		   
		  AcUser aum = entityManager.find(AcUser.class, Long.valueOf(sessionId));
		
		  List<LinkAdminUserSys> guuExistList =  aum.getLinkAdminUserSys();
		  
		  
		 
		  
		  for(BaseItem is:this.ISList){
			      	 
	    			  
	    			  if(((AcApplication)is).getUsrChecked().booleanValue()){// отмечен
	    				  
	    				  LinkAdminUserSys au = new LinkAdminUserSys(Long.valueOf(sessionId), ((AcApplication)is).getIdArm());
	    			            au.setCreated(new Date());
	    			            au.setCreator(cau.getBaseId());
	    			      
	    			            
	    			         if(guuExistList.contains(au)){
	    			        	 //есть в базе
	    			        	 //ничего не делаем. и так есть в базе
	    			        	 log.info("usrManager:uupdUsrAdminIS:02");
	    			         }else{
	    			           
	    			            guuExistList.add(au);
	    			            log.info("usrManager:updUsrAdminIS:03");
	    			         }
	    			  }else{ 
	    				  // не отмечен
	    				  LinkAdminUserSys au = new LinkAdminUserSys(Long.valueOf(sessionId), ((AcApplication)is).getIdArm());
		            
			                if(guuExistList.contains(au)){
			                	//есть в базе
			                	
			                	guuExistList.remove(au);
			                	
			                	entityManager.createQuery(
			                		"delete from LinkAdminUserSys lgu " 
			                		+ "where lgu.pk.upUser = :upUser " 
			                		+ "and lgu.pk.upSys = :upSys ")
			                	.setParameter("upUser", Long.valueOf(sessionId))
			                	.setParameter("upSys", ((AcApplication)is).getIdArm())
			                	.executeUpdate();
			                	
			                	 log.info("usrManager:updUsrAdminIS:04");
			                }else{
			                //ничего не делаем. и так нет в базе
			                	 log.info("usrManager:updUsrAdminIS:05");
			                }
	    			  }
	    		  }
	     	  
		    aum.setLinkAdminUserSys(guuExistList);
	     	
	     	
	        entityManager.flush();
	    	 
	        entityManager.refresh(aum);
	    	
           UserItem au = (UserItem)searchBean(sessionId);
	    	 
	    	if(au!=null){
	    		Contexts.getEventContext().set("usrBeanView", au); 
	    	}else{
	    		 au = getUserItem(Long.valueOf(sessionId));
	    		 if(au!=null){
	    		   Contexts.getEventContext().set("usrBeanView", au); 
	    		 }
	    	 }
	    	  
	    	ISReset();
	    	
	    	//!!!
	    	resetListUserSysEmpty();
	    	
	    	audit(ResourcesMap.USER, ActionsMap.UPDATE_ADMIN_SYS); 
	    	
	     }catch (Exception e) {
       log.error("UsrManager:updUsrAdminIS:ERROR:"+e);
     }
}
   
 public void updUsrAllowReestr(){
	   
	   log.info("usrManager:updUsrAllowReestr:01+");
	   
	   
	   String sessionId = getSSID();
	   log.info("usrManager:updUsrAllowReestr:sessionId:"+sessionId);
	
	   if(sessionId==null){
		   return;
	   }
	
	   try {
		 
		  LinksMap linksMap2= getApplicationLinksMap();
		   
		  AcUser cau = getSessionItem("currentUser"); 
		   
		  //имеющиеся у пользователя разрешения
		  
		   List<String> listExistPerm = entityManager.createNativeQuery(
					  (new StringBuilder("select DOM.PAGE_CODE||':'|| PERM.ID_SRV code  "))
					    .append("from LINK_ADMIN_USER_DOM_PRM udp,  ") 
					    .append("AC_APP_DOMAINS_BSS_T dom,  ") 
					    .append("AC_PERMISSIONS_LIST_BSS_T perm  ") 
					    .append("where DOM.ID_SRV=UDP.UP_DOM  ") 
					    .append("and PERM.ID_SRV=UDP.UP_PRM  ") 
					    .append("and UDP.UP_USER = :idUser")
					  .toString())
		           .setParameter("idUser", Long.valueOf(sessionId))
		           .getResultList();
		          
		  
		
		   log.info("usrManager:updUsrAllowReestr:011");
			
			 for(Iterator<Map.Entry<String, Boolean>> it = allowReestrValues.entrySet().iterator(); it.hasNext();){
				 
   			      Map.Entry<String, Boolean> me = it.next();
   			 		
   	     	  if(Boolean.TRUE.equals(me.getValue())){	  
   	     	   //становили чекбокс
   	     		  
			   if(!listExistPerm.contains(me.getKey())){
				  //у нас нет
				  //надо add
				   
				   entityManager.createNativeQuery(
						     (new StringBuilder("insert into LINK_ADMIN_USER_DOM_PRM ( "))
						       .append("UP_USER, UP_DOM, UP_PRM, CREATOR,  created) ")
		                       .append("values(:idUser, ") 
						       .append("(select id_dom from (  SELECT N.ID_SRV id_dom, LEVEL lev ") 
						       .append(" FROM AC_APP_DOMAINS_BSS_T n ") 
						       .append(" WHERE N.IS_VISIBLE = 1 AND N.PAGE_CODE = :codeDom ") 
						       .append("CONNECT BY PRIOR N.ID_SRV = N.UP ") 
						       .append("START WITH N.UP = (SELECT N2.ID_SRV ") 
						       .append(" FROM AC_APP_DOMAINS_BSS_T n2 ") 
						       .append("  WHERE N2.UP_IS = :idArm AND N2.UP = 1))") 
						       .append(" where lev=2 ), ")
		                       .append(":idPerm, :creator, sysdate) ")
						     .toString())
			         .setParameter("idUser", Long.valueOf(sessionId))
		             .setParameter("codeDom", me.getKey().split(":")[0])
		             .setParameter("idArm", linksMap2.getAppCode())
			         .setParameter("idPerm", me.getKey().split(":")[1])
		             .setParameter("creator", cau.getIdUser())
		            .executeUpdate();
			   }
			   
			   }else{
				   //сняли чекбокс
				   
				   if(listExistPerm.contains(me.getKey())){
					      //у нас нет
						  //надо delete
						  
					   entityManager.createNativeQuery(
							     (new StringBuilder("DELETE from LINK_ADMIN_USER_DOM_PRM "))
							       .append("where ") 
							       .append("UP_USER =:idUser and UP_DOM = ") 
							       .append("(select id_dom from (  SELECT N.ID_SRV id_dom, LEVEL lev ") 
							       .append(" FROM AC_APP_DOMAINS_BSS_T n ") 
							       .append(" WHERE N.IS_VISIBLE = 1 AND N.PAGE_CODE = :codeDom ") 
							       .append("CONNECT BY PRIOR N.ID_SRV = N.UP ") 
							       .append("START WITH N.UP = (SELECT N2.ID_SRV ") 
							       .append(" FROM AC_APP_DOMAINS_BSS_T n2 ") 
							       .append("  WHERE N2.UP_IS = :idArm AND N2.UP = 1)) ")
							       .append(" where lev=2 ) ")
			                       .append("and UP_PRM = :idPerm ")
							     .toString())
				         .setParameter("idUser", Long.valueOf(sessionId))
			             .setParameter("codeDom", me.getKey().split(":")[0])
			             .setParameter("idArm", linksMap2.getAppCode())
				         .setParameter("idPerm", me.getKey().split(":")[1])
			             .executeUpdate();
				   }
			    }
   	     	  
			   }
   	     	  
		    audit(ResourcesMap.USER, ActionsMap.UPDATE_ADMIN_SYS); 
	    	
	     }catch (Exception e) {
       log.error("UsrManager:updUsrAllowReestr:ERROR:"+e);
      }
  }
 
 public void updUsrAccOrgManager(){
	   
	   log.info("usrManager:updUsrAccOrgManager:01:"+this.accOrgManager);
	   
	   
	   String sessionId = getSSID();
	   log.info("usrManager:updUsrAccOrgManager:sessionId:"+sessionId);
	
	   if(sessionId==null){
		   return;
	   }
	
	   try {
		 
		  log.info("usrManager:updUsrAccOrgManager:02");
			
		   		
 	     	  if(Boolean.TRUE.equals(this.accOrgManager)){	  
 	     	   //становили чекбокс
 	     		  
 	     		entityManager.createNativeQuery(
 	     				"update AC_USERS_KNL_T t1 " 
 	     				+ "set t1.IS_ACC_ORG_MANAGER = 1 " 
 	     				+ "where t1.ID_SRV = :idUser")
 	     		 .setParameter("idUser", Long.valueOf(sessionId))
	             .executeUpdate();
			   
			   }else{
				   //сняли чекбокс
				   entityManager.createNativeQuery(
	 	     				"update AC_USERS_KNL_T t1 " 
	 	     				+ "set t1.IS_ACC_ORG_MANAGER = 0 " 
	 	     				+ "where t1.ID_SRV = :idUser")
	 	     		 .setParameter("idUser", Long.valueOf(sessionId))
		             .executeUpdate();

			    }

 	     	 log.info("usrManager:updUsrAccOrgManager:03");
 	     	//!!!
 		    resetListUserSysEmpty();  
 	     	  
 	     	UserItem au = (UserItem)searchBean(sessionId);
	    	 
 	    	if(au!=null){
 	    		Contexts.getEventContext().set("usrBeanView", au); 
 	    	}else{
 	    		 au = getUserItem(Long.valueOf(sessionId));
 	    		 if(au!=null){
 	    		   Contexts.getEventContext().set("usrBeanView", au); 
 	    		 }
 	    	 }
		 	  
		    audit(ResourcesMap.USER, ActionsMap.UPDATE_AC_ORG); 
	    	
	     }catch (Exception e) {
     log.error("UsrManager:updUsrAccOrgManager:ERROR:"+e);
    }
}
 
 public void initAllowReestr(){
	   
	   log.info("usrManager:initAllowReestr:01");
	   
	   String sessionId = getSSID();
	   log.info("usrManager:initAllowReestr:sessionId:"+sessionId);
	
	   if(sessionId==null){
		   return;
	   }
	
	   try {
		 
		   allowReestrValues.clear();
		   
		   //имеющиеся у пользователя разрешения
			  
		   List<String> listExistPerm = entityManager.createNativeQuery(
					  (new StringBuilder("select DOM.PAGE_CODE||':'|| PERM.ID_SRV code  "))
					    .append("from LINK_ADMIN_USER_DOM_PRM udp,  ") 
					    .append("AC_APP_DOMAINS_BSS_T dom,  ") 
					    .append("AC_PERMISSIONS_LIST_BSS_T perm  ") 
					    .append("where DOM.ID_SRV=UDP.UP_DOM  ") 
					    .append("and PERM.ID_SRV=UDP.UP_PRM  ") 
					    .append("and UDP.UP_USER = :idUser")
					  .toString())
		           .setParameter("idUser", Long.valueOf(sessionId))
		           .getResultList();
		   
		   for(String perm: listExistPerm){
			   allowReestrValues.put(perm, true);
		   }
		   
	     }catch (Exception e) {
     log.error("UsrManager:initAllowReestr:ERROR:"+e);
   }
  }
 
   public void delUsr(){
	 try{
		log.info("usrManager:delUsr:01");  
		
		AcUser cau = getSessionItem("currentUser"); 
	  	 
		AcUser usrBean = getConversationItem("usrBean");
		
		
		if(usrBean==null){
			return;
		}
		 
		log.info("usrManager:delUsr:IdUsr:"+usrBean.getIdUser());
		
		
		 //с 16.09.2014 перешли на логическое удаление
		 //проставляется status=3
		
		AcUser aum = entityManager.find(AcUser.class, usrBean.getIdUser());
		
		aum.setStatus(3L);
		
        aum.setLogin("REM_"+aum.getIdUser()+"_"+aum.getLogin());
		
		aum.setModificator(cau.getIdUser()); 
		aum.setModified(new Date());
		
		entityManager.flush();
		
			
		audit(ResourcesMap.USER, ActionsMap.DELETE); 
		
	 }catch(Exception e){
		 log.error("hostsManager:delHosts:error:"+e); 
	 }
   }
 
   
   public void forViewUpdDel() {
	   try{
	     String sessionIdUser = getSSID();
	     log.info("forViewUpdDel:sessionId:"+sessionIdUser);
	     if(sessionIdUser!=null){
	    	 AcUser ahUm = entityManager.find(AcUser.class, Long.valueOf(sessionIdUser));
	     	 
	    	 if(ahUm!=null){
	    		 
	    		 UserItem uiUm = getUserItem(Long.valueOf(sessionIdUser));
	    		
	    		 ahUm.setOrgName(uiUm.getOrgName());
	    		 
	    		 if(ahUm.getUpSignUser()!=null){
	    			 ahUm.setFio(uiUm.getFio());
	    			 ahUm.setPosition(uiUm.getPosition());
	    			 ahUm.setPhone(uiUm.getPhone());
	    			 ahUm.setEmail(uiUm.getEmail());
	    		 }
	    	 }
	    	 
	    	 Contexts.getEventContext().set("usrBean", ahUm);
	    	 
	    	 //устанавливаем на 1 страницу пагинатор в модальном окне
	    	 UsrStateHolder usrStateHolder = getSessionItem("usrStateHolder");
	    	 usrStateHolder.resetPageNumber();
	    	 
	     }
	   }catch(Exception eUm){
		   log.error("forViewUpdDel:Error:"+eUm);
	   }
   } 
   
   public void forViewCrt() {
	   try{
	     log.info("forViewCrt");
	     AcUser au = new AcUser(); 
	     au.setPassword(password());
	     Contexts.getEventContext().set("usrBeanCrt", au);
	   }catch(Exception e){
		 log.error("forViewCrt:Error:"+e);
	   }
   } 
   
   public void forViewDelMessage() {
		  String sessionId = getSSID();
		  log.info("forViewDel:sessionId:"+sessionId);
		  if(!Strings.isNullOrEmpty(sessionId)){
			 AcUser aa = entityManager.find(AcUser.class, Long.valueOf(sessionId));
			 
			 //с 16.09.2014 перещли на логическое удаление
			 //проставляется status=3
			 //поэтому данный функционал по проверке порождённых записей закомментирован
			 
			/**/
	    	
	    	 UserItem ui = getUserItem(Long.valueOf(sessionId));
    			 
	    	 aa.setFio(ui.getFio());
	    	
			 Contexts.getEventContext().set("usrBean", aa);
		 }	
 }
   private String password(){
		String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();

		int len=8; 
		
	    StringBuilder sb = new StringBuilder(len);
		for(int i = 0; i < len; i++) {
		   sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		log.info("password:"+sb.toString());
		return sb.toString();
  
   }
   
   public List<AcApplication> getListUsrArm() throws Exception{
	    log.info("UsrManager:getListUsrArm:01");
	    try {
	    	if(listUsrArm==null){
	    		String query="select o from AcApplication o where o.acRoles IS NOT EMPTY ";
	    		
	      		AcUser cau = getSessionItem("currentUser"); 
	      		
	      		LinksMap lm = getApplicationLinksMap();
	      		Long appCode = lm.getAppCode();
			
	      		
	      		if(!cau.getIsSysAdmin().equals(1L)){ //если не с ролью сист админ
	    			query+="and o.idArm!="+appCode;
	    		}
	    		listUsrArm=entityManager
	    				.createQuery(query)
	    				.getResultList();
				
	    	}
	     } catch (Exception e) {
	    	 log.error("UsrManager:getListUsrArm:ERROR:"+e);
	         throw e;
	     }
	    return listUsrArm;
   }
   public void setListUsrArm(List<AcApplication> listUsrArm){
	   this.listUsrArm=listUsrArm;
   }
   
   public List<AcApplication> getListUsrArmEdit() throws Exception{
	    log.info("UsrManager:getListUsrArmEdit:01");
	   
	    String  idUsr = getSSID();
	    log.info("UsrManager:getListUsrArmEdit:sessionId:"+idUsr);
	
	    try {
	
	    	String saveEditFlag;
	    	if(listUsrArmEdit==null){
	      		
                String query="select o from AcApplication o where o.acRoles IS NOT EMPTY ";
	    		
                //перенесли на disabled chekbox
	      
	    		
	    		listUsrArmEdit=entityManager
	    				.createQuery(query)
	    				.getResultList();
	      		
	      		
	      		saveEditFlag= FacesContext.getCurrentInstance().getExternalContext()
		 			        .getRequestParameterMap()
		 			        .get("saveEditFlag");
		    	 log.info("UsrManager:getListUsrArmEdit:saveEditFlag:"+saveEditFlag);
		    		 
		    	
		    	if(saveEditFlag==null){	
		    		
		    	  List<AcRole> listUsrRol=entityManager.createQuery("select o from AcRole o JOIN o.acLinkUserToRoleToRaions o1 where o1.pk.acUser = :acUser")
						 .setParameter("acUser", Long.valueOf(idUsr))
			      				.getResultList();
			     
		    	
		    	  
	      	    for(AcApplication arm :listUsrArmEdit){
			        	
			      for(AcRole rol :arm.getAcRoles()){
			    	  log.info("UsrManager:getListUsrArmEdit:rol.getIdRol()"+rol.getIdRol());
			    	
			    	  if (listUsrRol.contains(rol)){  
			    		  rol.setUsrChecked(true);
			    	  }
			    	  
			    
			   	     }
          	        } 
	      	    }
	    	 }
		
			} catch (Exception e) {
	    	 log.error("UsrManager:getListUsrArmEdit:ERROR:"+e);
	         throw e;
	     }
	    return listUsrArmEdit;
   }
   
   public void setListUsrArmEdit(List<AcApplication> listUsrArmEdit){
	   this.listUsrArmEdit=listUsrArmEdit;
   }
  
   
   public List<AcApplication> getListUsrArmForView() throws Exception{
	    log.info("UsrManager:getListUsrArmForView:01");
	   
	    String sessionId = getSSID();
	    
	    log.info("UsrManager:getListUsrArmForView:sessionId:"+sessionId);
	    List<Object[]> lo=null;
	    AcApplication app = null;
	    AcRole rol = null;
	    
	    try {
	    	
	    	if(listUsrArmForView==null && !Strings.isNullOrEmpty(sessionId)){
	      	
	    		lo=entityManager.createNativeQuery(
	    				(new StringBuilder("select APP.ID_SRV app_id, APP.FULL_ app_name, ROL.FULL_ role_name "))
                        .append("from AC_IS_BSS_T app, AC_ROLES_BSS_T rol, AC_USERS_LINK_KNL_T url ")
                        .append("where ROL.UP_IS=APP.ID_SRV and URL.UP_ROLES=ROL.ID_SRV and URL.UP_USERS=? ")
                        .append("order by  APP.FULL_, APP.ID_SRV, ROL.FULL_")
	    				.toString())
	    				 .setParameter(1, Long.valueOf(sessionId))
	    				.getResultList();

	    		 listUsrArmForView = new ArrayList<AcApplication>();
	    		
	    		 for(Object[] objectArray :lo){
	    			 
	    			 if(app==null||!app.getIdArm().toString().equals(objectArray[0].toString())){
	    			   app=new AcApplication();
	    			   
	    			   listUsrArmForView.add(app);
	    			   
	    			   app.setIdArm(Long.valueOf(objectArray[0].toString()));
	    			   app.setName(objectArray[1]!=null?objectArray[1].toString():"");
	    			   app.setRolList(new ArrayList<AcRole>());
	    			 }
	    			 
	    			 rol=new AcRole();
	    			 rol.setRoleTitle(objectArray[2]!=null?objectArray[2].toString():"");
	    			 
	    			 app.getRolList().add(rol);
	    		 }
	    		
	    		
	    		log.info("UsrManager:getListUsrArmForView:listUsrArmForView.size:"+listUsrArmForView.size());

	    	   }
			} catch (Exception e) {
	    	 log.error("UsrManager:getListUsrArmForView:ERROR:"+e);
	         throw e;
	     }
	    return listUsrArmForView;
  }
 
   public List<AcApplication> getListUsrArmForViewRolesApp() throws Exception{
	    log.info("AppUsrManager:getListUsrArmForViewRolesApp:01");
	   
	    List<Object[]> loApp=null;
	    AcApplication app = null;
	    AcRole rolApp = null;
	    String idsRolesLine=null;
	    
	    try {
	    	
	    	if(listUsrArmForView==null ){
	      	
	    		 log.info("AppUsrManager:getListUsrArmForViewRolesApp:02");
	    		 
	    		UsrRoleStateHolder usrRoleStateHolder = getSessionItem("usrRoleStateHolder");
				
				
				List<Long> guuExistList =  usrRoleStateHolder.getAppRolesList();
				
				
				
				for (Long idRole : guuExistList) {
					if (idsRolesLine == null) {
						idsRolesLine = "" + idRole + "";
					} else {
						idsRolesLine = idsRolesLine + ", " + idRole + "";
					}
				}
	    		
				 log.info("AppUsrManager:getListUsrArmForViewRolesApp:03:"+guuExistList);
				 
	    		loApp=entityManager.createNativeQuery(
		    			(new StringBuilder("select arm.ID_SRV app_id, arm.FULL_ app_name, ROL.FULL_ role_name "))
		    			  .append(" from AC_IS_BSS_T arm, AC_ROLES_BSS_T rol ") 
		    			  .append(" where ROL.UP_IS=arm.ID_SRV  ")
		    			  .append(" and ROL.ID_SRV in (")
		    			  .append(idsRolesLine)
		    			  .append(") ") 
		    			  .append(" group by arm.FULL_, arm.ID_SRV, ROL.FULL_ ") 
		    			  .append(" order by arm.FULL_, arm.ID_SRV, ROL.FULL_ ")
	    				.toString())
	    				.getResultList();

	    		 listUsrArmForView = new ArrayList<AcApplication>();
	    		
	    		 if(listUsrArmForView!=null){
	    			 log.info("AppUsrManager:getListUsrArmForViewRolesApp:04:"+listUsrArmForView.size());
	    			 
	    		 }
	    		 
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
   
   public List<GroupUsersKnlT> getListUsrGroupForView() throws Exception{
	    log.info("UsrManager:getListUsrGroupForView:01");
	   
	    List<Object[]> lo=null;
	    GroupUsersKnlT group = null;
	    AcApplication app = null;
	    AcRole rol = null;
	    int group_change_flag=0;
	    
	    String sessionId = getSSID();
	    
	    log.info("UsrManager:getListUsrGroupForView:sessionId:"+sessionId);
	    
	    try {
	    	
	    	if(listUsrGroupForView==null && !Strings.isNullOrEmpty(sessionId)){
	      	
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
	    		
	    		listUsrGroupForView = new ArrayList<GroupUsersKnlT>();
	    		
	    		for(Object[] objectArray :lo){
	    			
	    			if(group==null||!group.getIdSrv().toString().equals(objectArray[0].toString())){
	    				
	    				group=new GroupUsersKnlT();
		    			   
	    				listUsrGroupForView.add(group);
		    			   
	    				group.setIdSrv(Long.valueOf(objectArray[0].toString()));
	    				group.setFull(objectArray[1]!=null?objectArray[1].toString():"");
	    				group.setArmList(new ArrayList<AcApplication>());
	    				
	    				group_change_flag=1;
		    		}
	    			
	    			if(app==null||!app.getIdArm().toString().equals(objectArray[2].toString())||group_change_flag==1){
	    			  
	    		       app=new AcApplication();
	    			   
	    			   group.getArmList().add(app);
	    			   
	    			   app.setIdArm(Long.valueOf(objectArray[2].toString()));
	    			   app.setName(objectArray[3]!=null?objectArray[3].toString():"");
	    			   app.setRolList(new ArrayList<AcRole>());
	    			 }
	    			 
	    			 rol=new AcRole();
	    			 rol.setRoleTitle(objectArray[4]!=null?objectArray[4].toString():"");
	    			 
	    			 app.getRolList().add(rol);
	    			 
	    			 group_change_flag=0;
	    		 }
	    	   }
			} catch (Exception e) {
	    	 log.error("UsrManager:getListUsrGroupForView:ERROR:"+e);
	         throw e;
	     }
	    return listUsrGroupForView;
 }
   
   public List<BaseItem> getRoleList(){
	   
	   if(this.roleList==null){
		   String idArm = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("idArm");
		   String sessionIdUm = getSSID();
		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		
		   log.info("UsrManager:getRoleList:idArm:"+idArm);
		   log.info("UsrManager:getRoleList:sessionIdUm:"+sessionIdUm);
		   log.info("UsrManager:getRoleList:remoteAudit:"+remoteAudit);
		   
		   if(idArm==null||sessionIdUm==null){
			   return this.roleList;
		   }
		   
		   String stUm=null;
			 
		   UsrRoleStateHolder usrRoleStateHolder = getSessionItem("usrRoleStateHolder");
		   Map<String, String> filterMap = usrRoleStateHolder.getColumnFilterValues();
		   
		   
		   if(filterMap!=null){
	    		 Set<Map.Entry<String, String>> setFilterUsrRole = filterMap.entrySet();
	              for (Map.Entry<String, String> me : setFilterUsrRole) {
	            
	             //аналог
	            if(me.getValue()!=null&&!"".equals(me.getValue())){
	            	
	   		   	//делаем фильтр на начало
	            	  stUm=(stUm!=null?stUm+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
	        
	             }
	           }
	      }
		   log.info("UsrManager:getGroupList:st:"+stUm);
		   
		   
		   this.roleList = entityManager.createQuery(
				   "select o from AcRole o where o.acApplication= :idArm " +
					(stUm!=null ? " and "+stUm :" ")
				   + "order by o.roleTitle ")
				   .setParameter("idArm", Long.valueOf(idArm))
                   .getResultList();
		   
		     List<AcRole> listUsrRol=entityManager.createQuery("select o from AcRole o JOIN o.acLinkUserToRoleToRaions o1 where o1.pk.acUser = :acUser ")
					 .setParameter("acUser", Long.valueOf(sessionIdUm))
		      		 .getResultList();
		   
		     for(BaseItem role :this.roleList){
	           if (listUsrRol.contains((AcRole)role)){  
	        	  ((AcRole)role).setUsrChecked(true);
			   }
	         } 
		
	   }
	   return this.roleList;
   }
   
   public void setRoleList(List<BaseItem> roleList){
	   this.roleList=roleList;
   }
   
 public List<BaseItem> getRoleAppList(){
	   
	   if(this.roleList==null){
		   String idArm = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("idArm");
		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		
		   log.info("UsrManager:getRoleList:idArm:"+idArm);
		   log.info("UsrManager:getRoleList:remoteAudit:"+remoteAudit);
		   if(idArm==null){
			   return this.roleList;
		   }
		   this.roleList = entityManager.createQuery(
				   "select o from AcRole o where o.acApplication= :idArm " 
				   + "order by o.roleTitle ")
				   .setParameter("idArm", Long.valueOf(idArm))
                   .getResultList();
		   
		  
		   UsrRoleStateHolder usrRoleStateHolder = getSessionItem("usrRoleStateHolder");
			
			
		   List<Long> guuExistList =  usrRoleStateHolder.getAppRolesList();
			 
		   for(BaseItem role :this.roleList){
	           if (guuExistList.contains(role.getBaseId())){  
	        	  ((AcRole)role).setUsrChecked(true);
			   }
	         } 
		
	   }
	   return this.roleList;
   }
   
   public List<BaseItem> getGroupList(){
		 
	   //в updUsrGroup вызывается usrGroupReset() - чтобы
	   // если перед сохранением изменить фильтр на фильтр_2, то в APPLY_REQUEST ИСПОЛЬЗУЮТСЯ
	   //ЕЩЁ ПРЕЖНИЕ ФИЛЬТРЫ - так и надо, но эти фильтры затем переустанавливаются на фильтр_2,
	   //и в commandButton есть reRender="..., outCBdtUpdArmGroup_dtbl, ..."
	   //а значит нам надо обновить groupList с учётом новых фильтров.
	   
	   if(this.groupList==null){
		  String sessionId = getSSID();
		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		   log.info("UsrManager:getGroupList:sessionId:"+sessionId);
		   log.info("UsrManager:getGroupList:remoteAudit:"+remoteAudit);
		   
		   if(sessionId==null){
			   return this.groupList;
		   }
		   
		   String st=null;
		   String stOracle=null;
		   GroupUsersKnlT group_obj = null;
		   
		   UsrGroupStateHolder usrGroupStateHolder = getSessionItem("usrGroupStateHolder");
		   Map<String, String> filterMap = usrGroupStateHolder.getColumnFilterValues();
		   
		   
		   if(filterMap!=null){
	    		 Set<Map.Entry<String, String>> setFilterUsrGroup = filterMap.entrySet();
	              for (Map.Entry<String, String> me : setFilterUsrGroup) {
	            
	             //аналог
	            if(me.getValue()!=null&&!"".equals(me.getValue())){
	            	
	   		     if("o.idSrv".equals(me.getKey())){  
	        	   //делаем фильтр на начало  
	        	     st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+")) like lower('"+me.getValue()+"%') ";
	    	    
	        	     stOracle=(stOracle!=null?stOracle+" and " :"")+" lower(to_char("+jpa_to_oracle.get(me.getKey())+")) like lower('"+me.getValue()+"%') ";
	 	    	    
	   		     
	   		     }else{
	         		//делаем фильтр на начало
	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
	        	
	            	  stOracle=(stOracle!=null?stOracle+" and " :"")+" lower(to_char("+jpa_to_oracle.get(me.getKey())+")) like lower('"+me.getValue()+"%') ";
	   	 	    	 
	   		     }
	             }
	           }
	      }
		   log.info("UsrManager:getGroupList:st:"+st);
		   log.info("UsrManager:getGroupList:stOracle:"+stOracle);
		   
		   AcUser au = getSessionItem("currentUser"); 
	  		 
		   if(au.getAllowedSys()!=null){
		   
			   //!!!
			   //filter stOracle
			   //static jpa_to_oracle
			   
			   List<Object[]> list= entityManager.createNativeQuery(
					   (new StringBuilder("select to_char(GR.ID_SRV) idSrv, GR.FULL_ full "))
					     .append("from GROUP_USERS_KNL_T gr ") 
					     .append("where GR.ID_SRV  not in (SELECT GR.ID_SRV gr_id ") 
					     .append(" FROM GROUP_USERS_KNL_T gr, ") 
					     .append(" LINK_GROUP_USERS_ROLES_KNL_T lgru, ") 
					     .append(" AC_ROLES_BSS_T rl ") 
					     .append(" WHERE GR.ID_SRV = LGRU.UP_GROUP_USERS  ") 
					     .append(" AND LGRU.UP_ROLES = RL.ID_SRV ") 
					     .append(" and RL.UP_IS not in (:idsArm) ") 
					     .append("group by GR.ID_SRV) ")
					     .append(stOracle!=null ? " and "+stOracle :" ")
					     .toString())
					   .setParameter("idsArm", au.getAllowedSys())
					   .getResultList();
					 
			   for(Object[] objArray : list){
				   
				   if(this.groupList==null){
					   this.groupList=new ArrayList<BaseItem>();
				   }
				   
				   group_obj = new GroupUsersKnlT();
				   group_obj.setIdSrv(objArray[0]!=null?Long.valueOf((String)objArray[0]):null);
				   group_obj.setFull((String)objArray[1]);
				   
				   this.groupList.add(group_obj);
			   }
			   
		 
		   }else{
			   this.groupList = entityManager.createQuery(
					   "select o from GroupUsersKnlT o " +
						(st!=null ? " where "+st :" ")
					   + " order by o.full ")
					   .getResultList();
	   		}
		   
		   
		   
		  
		  if(this.groupList!=null){
		   
		  List<GroupUsersKnlT> listUsrGroup=entityManager.createQuery(
		    		 "select o from GroupUsersKnlT o JOIN o.linkGroupUsersUsersKnlTs o1 " 
		    		 + "where o1.pk.acUser = :acUser ")
					 .setParameter("acUser", Long.valueOf(sessionId))
		      		 .getResultList();
		   
   		   for(BaseItem group :this.groupList){
	           if (listUsrGroup.contains((GroupUsersKnlT)group)){  
	        	  ((GroupUsersKnlT)group).setUsrChecked(true);
			   }
	        } 
		  }
   		   
		
	   }
	   return this.groupList;
   }
   
   public void setGroupList(List<BaseItem> groupList){
	   this.groupList=groupList;
   }
   
   public List<BaseItem> getISList(){
		 
	   //в updUsrGroup вызывается usrGroupReset() - чтобы
	   // если перед сохранением изменить фильтр на фильтр_2, то в APPLY_REQUEST ИСПОЛЬЗУЮТСЯ
	   //ЕЩЁ ПРЕЖНИЕ ФИЛЬТРЫ - так и надо, но эти фильтры затем переустанавливаются на фильтр_2,
	   //и в commandButton есть reRender="..., outCBdtUpdArmGroup_dtbl, ..."
	   //а значит нам надо обновить groupList с учётом новых фильтров.
	   
	   if(this.ISList==null){
		  String sessionId = getSSID();
		   String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("remoteAudit");
		   log.info("UsrManager:getISList:sessionId:"+sessionId);
		   log.info("UsrManager:getISList:remoteAudit:"+remoteAudit);
		   
		   if(sessionId==null){
			   return this.ISList;
		   }
		   
		   String st=null;
		 
		   UsrISStateHolder usrISStateHolder = getSessionItem("usrISStateHolder");
		   Map<String, String> filterMap = usrISStateHolder.getColumnFilterValues();
		   
		   
		   if(filterMap!=null){
	    		 Set<Map.Entry<String, String>> setFilterUsrIS = filterMap.entrySet();
	              for (Map.Entry<String, String> me : setFilterUsrIS) {
	            	
	             //аналог
	            if(me.getValue()!=null&&!"".equals(me.getValue())){
	            	
	   		       	//делаем фильтр на начало
	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
	    
	             }
	           }
	      }
		   log.info("UsrManager:getGroupList:st:"+st);
		   
		   Long appCode = getApplicationLinksMap().getAppCode();
			
		   this.ISList = entityManager.createQuery(
  				   "select o from AcApplication o " 
  				   + "where o.idArm!="+appCode +" "+
  					(st!=null ? " and "+st :" ")
  				   + " order by o.name ")
  				   .getResultList();
   		 
		 	
	   		  List<AcApplication> listUserSys=entityManager.createQuery(
			    		 "select o from AcApplication o JOIN o.linkAdminUserSys o1 " 
			    		 + "where o1.pk.upUser = :upUser ")
						 .setParameter("upUser", Long.valueOf(sessionId))
			      		 .getResultList();
	   		  
	   		 
	   			for(BaseItem sys :this.ISList){
	 	           if (listUserSys.contains((AcApplication)sys)){  
	 	        	  ((AcApplication)sys).setUsrChecked(true);
	 			   }
	 	         } 
	   		     
		
	   }
	   return this.ISList;
  }
  
  public void setISList(List<BaseItem> groupList){
	   this.ISList=groupList;
  }
   public void usrGroupReset(){
	   if(this.groupList!=null){
		   this.groupList.clear();
		   this.groupList=null;  
	   }
   }
   
   public void usrRoleReset(){
	   if(this.roleList!=null){
		   this.roleList.clear();
		   this.roleList=null;  
	   }
   }
   
   public void ISReset(){
	   if(this.ISList!=null){
		   this.ISList.clear();
		   this.ISList=null;  
	   }
  }
   
   public Boolean getListUserSysEmpty() {
	   
	   log.info("UsrManager:getListUserSysEmpty:01+");
	   if(this.listUserSysEmpty==null){
		   log.info("UsrManager:getListUserSysEmpty:01");
		   
		   try{
			   String sessionId = getSSID();
			   
			   List<AcApplication> listUserSys=entityManager.createQuery(
			    		 "select o from AcApplication o JOIN o.linkAdminUserSys o1 " 
			    		 + "where o1.pk.upUser = :upUser ")
						 .setParameter("upUser", Long.valueOf(sessionId))
			      		 .getResultList();
			   
			   String isManager = (String) entityManager.createNativeQuery(
			    		 "select to_char(t1.IS_ACC_ORG_MANAGER) " 
			    		 + "from AC_USERS_KNL_T t1 " 
			    		 + "where t1.ID_SRV = :idUser ")
						 .setParameter("idUser", Long.valueOf(sessionId))
						 .getSingleResult();
						 
			  
			  
			   
			   if(listUserSys.isEmpty()&&
					   !"1".equals(isManager)){
				   this.listUserSysEmpty = true;
			   }else{
				   this.listUserSysEmpty = false;
			   }
			   
			   log.info("UsrManager:getListUserSysEmpty:04:"+this.listUserSysEmpty);
			   
		   }catch(Exception e){
			   log.info("UsrManager:getListUserSysEmpty:error:"+e);
		   }
		   
	   }
	   
		return listUserSysEmpty;
	}

	public void setListUserSysEmpty(Boolean listUserSysEmpty) {
		this.listUserSysEmpty = listUserSysEmpty;
	}
	
	public void resetListUserSysEmpty(){
		 log.info("UsrManager:resetListUserSysEmpty");
		this.listUserSysEmpty=null;
	}
	
	
   public int getConnectError(){
	   return connectError;
   }
   
   public List <BaseTableItem> getAuditItemsListSelect() {
		   
	
	    UsrContext acUm= new UsrContext();
		   if( auditItemsListSelect==null){
			   log.info("getAuditItemsListSelect:02");
			   auditItemsListSelect = new ArrayList<BaseTableItem>();
			
			   
			   auditItemsListSelect.add(acUm.getAuditItemsMap().get("fio"));
			   auditItemsListSelect.add(acUm.getAuditItemsMap().get("login"));
			   auditItemsListSelect.add(acUm.getAuditItemsMap().get("orgName"));
			   auditItemsListSelect.add(acUm.getAuditItemsMap().get("crtDate"));
			   auditItemsListSelect.add(acUm.getAuditItemsMap().get("statusValue"));
			
		   }
	       return this.auditItemsListSelect;
   }
   
 
   
   public List <BaseTableItem> getAuditItemsListContext() {
	   log.info("usrManager:getAuditItemsListContext");
	   if(auditItemsListContext==null){
		   UsrContext acUm= new UsrContext();
		   auditItemsListContext = 
				 acUm.getAuditItemsCollection();
	   }
	   return auditItemsListContext;
   }
  
   public void setAuditItemsListSelect(List <BaseTableItem> auditItemsListSelect) {
	    this.auditItemsListSelect=auditItemsListSelect;
}
   
   private boolean loginExist(String loginUm) throws Exception {
		log.info("UsrManager:loginExist:login="+loginUm);
		if(loginUm!=null){
		  try{
			  entityManager.createQuery(
					     "select au from AcUser au " 
			 		     + "where au.login = :login")
			 		     .setParameter("login", loginUm)
			 		     .getSingleResult();
			  addLoginExist=true;
			  log.info("UsrManager:loginExist:addLoginExist!");		     
		    }catch (NoResultException ex){
              log.error("UsrManager:loginExist:NoResultException");
           }catch(Exception e){
	           log.error("UsrManager:loginExist:Error:"+e);
	           throw e;
         }
		}
		return this.addLoginExist;
   }
   
   private boolean certNumExistCrt(String certNum) throws Exception {
	   
		log.info("UsrManager:certNumExistCrt:certNum="+certNum);
		
		if(certNum!=null&&!"".equals(certNum.trim())){
		  try{
			  certNum = certNum.replaceAll(" ", "").toUpperCase();
			  
			  entityManager.createNativeQuery(
			      "select 1 from dual "
			      + "where exists( select 1 from  AC_USERS_KNL_T au where upper(AU.CERTIFICATE) = upper(:certNum)) "
			      + "or  exists( select 1 from  AC_USERS_CERT_BSS_T  user_cert  where upper(USER_CERT.CERT_NUM) = upper(:certNum) ) ") 
			  .setParameter("certNum", certNum)   
			  .getSingleResult();
			  
			  addCertNumExist=true;
			  
			  log.info("UsrManager:certNumExistCrt:addCertNumExist!");		     
		    }catch (NoResultException ex){
             log.error("UsrManager:certNumExistCrt:NoResultException");
          }catch(Exception e){
	           log.error("UsrManager:certNumExistCrt:Error:"+e);
	           throw e;
        }
		}
		
		return this.addCertNumExist;
  }
  
   private boolean loginExistUpd(String login, Long idUser) throws Exception {
		log.info("UsrManager:loginExistUpd:login="+login);
		if(login!=null&&!login.trim().equals("")){
		  try{
			   entityManager .createQuery(
					       "select au from AcUser au " 
			 		       + "where au.login = :login "
					       + "and au.idUser != :idUser ")
			 		     .setParameter("login", login)
			 		     .setParameter("idUser", idUser) 
			 		     .getSingleResult();
			  addLoginExist=true;
			  log.info("UsrManager:loginExistUpd:addLoginExist!");		     
		    }catch (NoResultException ex){
             log.error("UsrManager:loginExistUpd:NoResultException");
          }catch(Exception e){
	           log.error("UsrManager:loginExistUpd:Error:"+e);
	           throw e;
        }
		}
		return this.addLoginExist;
  }
   
   
   
   private boolean certNumExistUpd(String certNum, Long idUser) throws Exception {
	   
		log.info("UsrManager:certNumExistCrt:certNum="+certNum);
		
		if(certNum!=null&&!"".equals(certNum.trim())){
		  try{
			 
			  certNum = certNum.replaceAll(" ", "").toUpperCase();
			  
			  entityManager.createNativeQuery(
			      "select 1 from dual "
			      + "where exists( select 1 from  AC_USERS_KNL_T au where upper(AU.CERTIFICATE) = upper(:certNum) and au.ID_SRV!= :idUser ) "
			      + "or  exists( select 1 from  AC_USERS_CERT_BSS_T  user_cert  where upper(USER_CERT.CERT_NUM) = upper(:certNum) and USER_CERT.UP_USER!= :idUser ) ") 
			  .setParameter("certNum", certNum) 
			  .setParameter("idUser", idUser) 
			  .getSingleResult();
			  
			  addCertNumExist=true;
			  
			  log.info("UsrManager:certNumExistCrt:addCertNumExist!");		     
		    }catch (NoResultException ex){
            log.error("UsrManager:certNumExistCrt:NoResultException");
         }catch(Exception e){
	           log.error("UsrManager:certNumExistCrt:Error:"+e);
	           throw e;
       }
		}
		
		return this.addCertNumExist;
 }
   public void beforeSearch() {
	   
	   log.info("UsrManager:beforeSearch");
	   
	  
	   try{
			 
		  String searchFio = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("searchFio");
		  log.info("UsrManager:beforeSearch:searchFio:"+searchFio);
		  
		  String[] fio = searchFio.trim().split("\\s+");
		  for(int i=0; i<3; i++ ){
			if(i<fio.length){
				 this.fioArray[i]=fio[i];
			 }
		  }
			      	
		  search();	
		  
		  //уже имеющиеся сертификаты пользователя
		     
		  loadUserCert();
		   
	   }catch(Exception eUm){
		 log.error("UsrManager:beforeSearch:error:"+eUm);
	   }
   }
   
   public void search() {
	   
	   log.info("UsrManager:search:01");
	    
	   // MaxResults -100!
	   
	   String fam=null, name=null, otch = null;
	   String searchStrUm=null;
	   UCCertItem ui = null;
     		   
	   try{
	   
	     String sessionIdUm = getSSID();
		 log.info("UsrManager:search:sessionId:"+sessionIdUm);
		   
	     if(sessionIdUm==null){
	    	 return;
	     }
	     
	       
	     fam = this.fioArray[0].trim();	     
	     name = this.fioArray[1].trim();	  
	     otch = this.fioArray[2].trim();	  
	     
	     log.info("UsrManager:search:fio:"+fam+" "+name+" "+otch);
	    
	   
	     
	     /* 8 случаев
	        последний не поддерживается
	     fam  +-++-+- -
	     name ++-+--+ -
	     otch +++-+-- -
	     */
	     
	     if(!"".equals(fam)&&!"".equals(name)&&!"".equals(otch)){
	    	 searchStrUm=fam+" "+name+" "+otch+"%";
	     }else if("".equals(fam)&&!"".equals(name)&&!"".equals(otch)){
	    	 searchStrUm="% "+name+" "+otch+"%";
	     }else if(!"".equals(fam)&&"".equals(name)&&!"".equals(otch)){
	    	 searchStrUm=fam+" % "+otch+"%";
	     }else if(!"".equals(fam)&&!"".equals(name)&&"".equals(otch)){
	    	 searchStrUm=fam+" "+name+" %";
	     }else if("".equals(fam)&&"".equals(name)&&!"".equals(otch)){
	    	 searchStrUm="% "+otch+"%";
	     }else if(!"".equals(fam)&&"".equals(name)&&"".equals(otch)){
	    	 searchStrUm=fam+" %";
	     }else if("".equals(fam)&&!"".equals(name)&&"".equals(otch)){
	    	 searchStrUm="% "+name+" %";
	     }else{
	    	 //не поддерживается
	     }
	     
	     log.info("UsrManager:search:searchStrUm:"+searchStrUm);
	     
	     
	     
	  
	     
	     UserItem au = (UserItem)searchBean(sessionIdUm);
	     
	     // здесь не допускаем возможность привязки
	     // если сертификат уже есть в AC_USERS_KNL_T
	    
	    
	   //делаем дополнительную проверку - 
	   //разрешаем связывать сертификат из реестра 
	   // даже если он нашёлся в AC_USERS_KNL_T - 
	   //только если он нашёлся именно у того пользователя,
	   //которого мы редактируем
	  
	     //алгоритм установления disabled на привязкке сертификата к пользователю:
	  
	     
	     List<Object[]> applicant_list  = (List<Object[]>) entityManager.createNativeQuery(			      
	    		 (new StringBuilder("select UC.ID_SRV, UC.ORG_NAME, UC.USER_FIO, UC.USER_POSITION, UC.USER_EMAIL,  "))
	    		   .append(" UC.CERT_NUM, UC.CERT_DATE, ") 
	    		   .append("  case  decode( USER_CERT.CERT_NUM, null, 0, 1) ") 
	    		   .append("  WHEN 0 THEN   case  decode( AU.CERTIFICATE, null, 0, 1) ") 
	    		                        .append("  WHEN 1 THEN  decode(AU.ID_SRV, ?, 0, 1) ") 
	    		                        .append("   ELSE 0 ") 
	    		                     .append("   end ") 
	    		   .append("  ELSE 1 ") 
	    		   .append("  end cert_used") 
	    		   .append(" from UC_CERT_REESTR uc, ") 
	    		   .append(" AC_USERS_KNL_T au, ") 
	    		   .append(" AC_USERS_CERT_BSS_T user_cert  ") 
	    		   .append(" where lower(UC.USER_FIO) like  lower('")
	    		   .append(searchStrUm)
	    		   .append("') ") 
	    		   .append(" and AU.CERTIFICATE(+)=UC.CERT_NUM ") 
	    		   .append(" and USER_CERT.CERT_NUM(+)=UC.CERT_NUM ")
	    		   .append(this.searchOrg!=null&&!"".equals(this.searchOrg.trim()) ? "and lower(UC.ORG_NAME) like  lower('%"+this.searchOrg+"%')" : "")
	    		   .append(this.searchDep!=null&&!"".equals(this.searchDep.trim()) ? "and lower(UC.USER_POSITION) like  lower('%"+this.searchDep+"%')" : "")
                   .append("order by UC.USER_FIO ")
                   .toString()
                  )
	    		 .setParameter(1, Long.valueOf(sessionIdUm))
                 .setMaxResults(100)
	    		.getResultList();
	     log.info("UsrManager:search:list:size:"+applicant_list.size());
	     
	     applicantList= new ArrayList<BaseItem>();
	     
	     for(Object[] objectArray :applicant_list){
	    	 
	    	 try{
        	     ui= new UCCertItem(
        			  objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
        			  objectArray[1]!=null?objectArray[1].toString():"",
        			  objectArray[2]!=null?objectArray[2].toString():"",
        			  objectArray[3]!=null?objectArray[3].toString():"",
        			  objectArray[4]!=null?objectArray[4].toString():"",
        			  objectArray[5]!=null?objectArray[5].toString():"",
        			  objectArray[6]!=null?objectArray[6].toString():"",
        			  objectArray[7]!=null?objectArray[7].toString():"");
        	     applicantList.add(ui);
        	   }catch(Exception e1){
        		   log.error("invokeLocal:for:error:"+e1);
        	   } 
	    	 
	     }
	   
	      Contexts.getEventContext().set("usrBeanViewList", Arrays.asList(au));
	     
	   }catch(Exception e){
		 log.error("UsrManager:search:"+e);
	   }
   } 
   
 public void loadUserCert() {
	   
	   log.info("UsrManager:loadUserCert");
	   
	   UCCertItem ui = null;
	   try{
		  String sessionId = getSSID();
		  log.info("UsrManager:loadUserCert:sessionId:"+sessionId);
		  
		  String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId_crack");
		  log.info("UsrManager:loadUserCert:sessionId_crack:"+sessionIdCrack);
		  
		  if(sessionId==null){
			  sessionId=sessionIdCrack;
		  }
		  
		  //уже имеющиеся сертификаты пользователя
		     
		   List<Object[]> user_cert_list  = (List<Object[]>) entityManager.createNativeQuery(
				      
	                (new StringBuilder("select AUC.ID_SRV, auc.ORG_NAME, auc.USER_FIO, auc.DEP_NAME, "))
	                  .append("AUC.CERT_NUM, AUC.CERT_DATE ") 
	                  .append("from AC_USERS_CERT_BSS_T auc ") 
	                  .append("where AUC.UP_USER = ? ")
				      
	                .toString())
	                .setParameter(1, Long.valueOf(sessionId))
		    		.setMaxResults(100)
		    		.getResultList();
		     
		     log.info("UsrManager:loadUserCert:user_cert_list:size:"+user_cert_list.size());
		     
		     userCertList= new ArrayList<BaseItem>();
		     
		     for(Object[] objectArray : user_cert_list){
		    	 
		    	 try{
	        	     ui= new UCCertItem(
	        			  objectArray[0]!=null?Long.valueOf(objectArray[0].toString()):null,
	        			  objectArray[1]!=null?objectArray[1].toString():"",
	        			  objectArray[2]!=null?objectArray[2].toString():"",
	        			  objectArray[3]!=null?objectArray[3].toString():"",
	        			   "",
	        			  objectArray[4]!=null?objectArray[4].toString():"",
	        			  objectArray[5]!=null?objectArray[5].toString():"",
	        			   "");
	        	     userCertList.add(ui);
	        	   }catch(Exception e1){
	        		   log.error("invokeLocal:loadUserCert:for:error:"+e1);
	        	   } 
		    	 
		     }
		   
	   }catch(Exception e){
		 log.error("UsrManager:loadUserCert:error:"+e);
	   }
   }
 //с формы поиска соответствий
   public void updUsrUCCert() {
		  //берётся sessionId_crack, а не sessionId,
		  //чтобы при reRender не напоминать событие выбора записи 
		   
		   log.info("UsrManager:updUsrUCCert:01");
		   
		   AcUsersCertBssT userCertUm = null;
		   UcCertReestr reestrCert = null;
		   
		   try{
			   String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId_crack");
	           log.info("UsrManager:updUsrUCCert:sessionId_crack:"+sessionIdCrack);
			   
			   String idReestr = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("idReestr");
		       log.info("UsrManager:updUsrUCCert:idReestr:"+idReestr);
		       
		       
		       if(sessionIdCrack==null||idReestr==null){
		    	   return;
		       }
		       
		        
		       reestrCert = entityManager.find(UcCertReestr.class , Long.valueOf(idReestr));
	    	   
	    	  
	    	   AcUser cau = getSessionItem("currentUser");
			   
	           if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    		  //пользователь имеет право только создать заявку 
		    		  //на добавление сертификата пользователя
		    		  log.info("UsrManager:updUsrUCCert:01_2");
		    		  
		    		  //ADD
		    		  int modeExec = 1;
		    		  
		    		  saveUserCertificateApp(reestrCert.getCertValue(), modeExec, Long.valueOf(sessionIdCrack), cau.getIdUser() , commentApp);
		    		  
		    		  audit(ResourcesMap.APP_USER_CERT, ActionsMap.CREATE);
		    	}else{ 
		    		
		    		   userCertUm = new AcUsersCertBssT();
			    	   
			    	   userCertUm.setCertNum(reestrCert.getCertNum());
			    	   userCertUm.setCertDate(reestrCert.getCertDate());
			    	   userCertUm.setCertValue(reestrCert.getCertValue());
			    	   userCertUm.setUserFio(reestrCert.getUserFio());
			    	   userCertUm.setOrgName(reestrCert.getOrgName());
			    	   userCertUm.setDepName(reestrCert.getUserPosition());
			    	   
			    	   userCertUm.setUpUserRaw(Long.valueOf(sessionIdCrack));
			    	   
			    	   userCertUm.setCreator(getCurrentUser().getBaseId());
			    	   userCertUm.setCreated(new Date());
	    	   
			    	   entityManager.persist(userCertUm);
			      
			           entityManager.flush();
			           
			           audit(ResourcesMap.USER, ActionsMap.ADD_CERT) ;
			 	}
	           
	           //!!!надо даже при заявке, а иначе будет пустой список userCertList
	           //при сохранении сертификатов мы остаёмся на той же форме
			 	//надо обновить список имеющихся сертификатов
			 	loadUserCert();
	           
		      
		       
		   }catch(Exception e){
			   log.error("UsrManager:updUsrUCCert:error::"+e);
		   }
	}
   
   public void updUsrUCCertMulti() {
		  //берётся sessionId_crack, а не sessionId,
		  //чтобы при reRender не напоминать событие выбора записи 
		   
		   log.info("UsrManager:updUsrUCCertMulti:01");
		   
		   AcUsersCertBssT userCert = null;
		   UcCertReestr reestrCert = null;
		   
		   try{
			   String sessionIdCrack = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("sessionId_crack");
	           log.info("UsrManager:updUsrUCCertMulti:sessionId_crack:"+sessionIdCrack);
			   
			   String numFiles = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("numFiles");
		       log.info("UsrManager:updUsrUCCertMulti:numFiles:"+numFiles);
		       
		       
		       if(sessionIdCrack==null||numFiles==null){
		    	   return;
		       }
		       
		       String[] id_list = numFiles.split("_");
		       
		       for(int i=0; i<id_list.length; i++){
		    	   
		    	   reestrCert = entityManager.find(UcCertReestr.class , Long.valueOf(id_list[i]));
		    	   
		    	   userCert = new AcUsersCertBssT();
		    	   
		    	   userCert.setCertNum(reestrCert.getCertNum());
		    	   userCert.setCertDate(reestrCert.getCertDate());
		    	   userCert.setCertValue(reestrCert.getCertValue());
		    	   userCert.setUserFio(reestrCert.getUserFio());
		    	   userCert.setOrgName(reestrCert.getOrgName());
		    	   userCert.setDepName(reestrCert.getUserPosition());
		    	   
		    	   userCert.setUpUserRaw(Long.valueOf(sessionIdCrack));
		    	   
		    	   userCert.setCreator(getCurrentUser().getBaseId());
		    	   userCert.setCreated(new Date());
		    	   
		    	   entityManager.persist(userCert);
		       }
		       
		       entityManager.flush();
		       
		       //при сохранении сертификатов мы остаёмся на той же форме
		 	     //надо обновить список имеющихся сертификатов
		 	     loadUserCert();
		           
		     
			    
		 	    audit(ResourcesMap.USER, ActionsMap.ADD_CERT) ;
		       
		   }catch(Exception e){
			   log.error("UsrManager:updUsrUCCertMulti:error::"+e);
		   }
	   }
   
   public void updUsrUCCertRemove() {
		  //берётся sessionId_crack, а не sessionId,
		  //чтобы при reRender не напоминать событие выбора записи 
		   
		   log.info("UsrManager:updUsrUCCertRemove:01");
		   
		   try{
			   
			   String idSrvUserCert = FacesContext.getCurrentInstance().getExternalContext()
				        .getRequestParameterMap()
				        .get("idSrvUserCert");
		       log.info("UsrManager:updUsrUCCertRemove:idSrvUserCert:"+idSrvUserCert);
		       
		       
		       if(idSrvUserCert==null){
		    	   return;
		       }
		       
               AcUser cau = getSessionItem("currentUser");
			   
	           if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
		    		  //пользователь имеет право только создать заявку 
		    		  //на добавление сертификата пользователя
		    		  log.info("UsrManager:updUsrUCCertRemove:01_2");
		    		  
		    		  //REMOVE
		    		  int modeExec = 0;
		    		  
		    		  AcUsersCertBssT acUsersCert = entityManager.find(AcUsersCertBssT.class , Long.valueOf(idSrvUserCert));
		    		  
		    		  saveUserCertificateApp(acUsersCert.getCertValue(), modeExec, acUsersCert.getUpUserRaw(), cau.getIdUser() , commentApp);
		    		  
		    		  audit(ResourcesMap.APP_USER_CERT, ActionsMap.CREATE) ;
		    		  
		    	}else{ 
		       
		               entityManager.createNativeQuery(
							    "delete from AC_USERS_CERT_BSS_T auc " 
							    + "where AUC.ID_SRV = ? ")
				                .setParameter(1, Long.valueOf(idSrvUserCert))
		                        .executeUpdate();
				       
		               audit(ResourcesMap.USER, ActionsMap.REMOVE_CERT) ;
		               
				 	}
			    
	           //!!!надо даже при заявке, а иначе будет пустой список userCertList
	           //при сохранении сертификатов мы остаёмся на той же форме
			 	//надо обновить список имеющихся сертификатов
			 	loadUserCert();
			 	
			 	
		       
		   }catch(Exception e){
			   log.error("UsrManager:updUsrUCCertRemove:error::"+e);
		   }
	   }
   
   //загрузка из файла
 public boolean saveUserCertificate(byte[] file_byte, Long id_user){
	   
	   //в базе храним текст base64 сертификата
       //можно в любом формате: der и base64
       //при base64 нам не надо здесь добавлять ----BEGIN CERT---- и ---END CERT---
       //так как они уже есть в загружаемом файле - 
       //windows при создании файла сертификата помещает в него эти конструкции
    	
	 
	  //это хорошо, но работает только когда сертификат получается из криптопро CSP,
	  //а когда скачивается вручную с сайта реестра, то в нём нет ---BEGIN CERT---- и ---END CERT---
	  //и их надо добавлять вручную.
	 
	   boolean result = true; 
	 
	   log.info("UsrManager:saveUserCertificate:01:"+(file_byte!=null));
	   
	   try {
		   
		   DateFormat df = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		   
		   CertificateFactory userCf = CertificateFactory.getInstance("X.509");
		   
           X509Certificate userCertX = null;
           try{
        	   
         
           userCertX = (X509Certificate)
        		   userCf.generateCertificate(new  ByteArrayInputStream(file_byte));
           
           }catch(Exception e){
        	   
        	   log.info("UsrManager:saveUserCertificate:02");
        	   
        	   
           //2-я попытка
           //ловим случай - когда сертификат скачан вручную  с сайта УЦ
           //в этом случае он без -BEGIN CERTIFICATE-
           
        	String certificateString =  "-----BEGIN CERTIFICATE-----\n"+new String(file_byte, "utf-8")+"\n-----END CERTIFICATE-----";
        	
        
        	   
            userCertX = (X509Certificate)
        		   userCf.generateCertificate(new ByteArrayInputStream(certificateString.getBytes("utf-8")));
           }
           
           log.info("UsrManager:saveUserCertificate:03");
           
           String x509Cert = Base64.encode(userCertX.getEncoded());
           
          
           
           String serial = decToHex(userCertX.getSerialNumber());
            
           if(certNumExistCrt(serial)){
        	   log.info("UsrManager:saveUserCertificate:01_1:return;");
        	   return false;
           }
           
            AcUser cau = getSessionItem("currentUser");
		   
           
           Transaction.instance().begin();
		   
		   Transaction.instance().enlist(entityManager);
           
           if((cau.getAllowedSys()!=null || cau.getIsAccOrgManagerValue()) && !cau.isAllowedReestr("002", "3")){
	    		  //пользователь имеет право только создать заявку 
	    		  //на добавление сертификата пользователя
	    		  log.info("srManager:saveUserCertificate:01_2");
	    		  
	    		  //ADD
	    		  int modeExec = 1;
	    		  
	    		  //!!!
	    		  //сохраняем именно не userCertX.getEncoded(),
		    	  //а x509Cert/.getBytes
		    	  saveUserCertificateApp(x509Cert.getBytes("UTF-8"), modeExec, id_user, cau.getIdUser() , commentApp);
	    		  
		    	  audit(ResourcesMap.APP_USER_CERT, ActionsMap.CREATE);
		    	  
	    	}else{ 
           
               AcUsersCertBssT userCert = new AcUsersCertBssT();
	    	   
	    	   userCert.setCertNum(serial);
	    	   userCert.setCertDate(df.format(userCertX.getNotAfter()));
	    	   
	    	   //!!!
	    	   //сохраняем именно не userCertX.getEncoded(),
	    	   //а x509Cert/.getBytes
	    	   userCert.setCertValue(x509Cert.getBytes("UTF-8"));
	    	   
	    	   String subject = userCertX.getSubjectDN().getName();
	    	   
	    	   log.info("UsrManager:saveUserCertificate:02:"+subject);
	    	   
			   LdapName ldapDN = new LdapName(subject);
			   
			   for(Rdn rdn: ldapDN.getRdns()) {
				     
				    if("CN".equals(rdn.getType())){
				    	userCert.setUserFio((String)rdn.getValue());
				    }else if("OU".equals(rdn.getType())){
				    	userCert.setDepName((String)rdn.getValue());
				    }else if("O".equals(rdn.getType())){
				    	userCert.setOrgName((String)rdn.getValue());
				    }
				    
				}

	    	   userCert.setUpUserRaw(id_user);
	    	   
	    	   userCert.setCreator(getCurrentUser().getBaseId());
	    	   userCert.setCreated(new Date());
	    	   
	    	   entityManager.persist(userCert);
	      
	           entityManager.flush();
	         
	           audit(ResourcesMap.USER, ActionsMap.ADD_CERT) ;
		   }
           
          
           
           Transaction.instance().commit();
		  
	     }catch (Exception e) {
           log.error("UsrManager:saveUserCertificate:ERROR:"+e);
           try{
             Transaction.instance().rollback();
           }catch(Exception et){}
         }
	   
	   return result;
   }

 private void saveUserCertificateApp(byte[] certByteX, int modeExec, Long id_user_app, Long id_user_creator, String commentApp){
	   
	   log.info("UsrManager:saveUserCertificateApp:01");
	   try{
		   String secret = TIDEncodePLBase64.getSecret();
		   
		   entityManager.createNativeQuery(
				   (new StringBuilder("insert into JOURN_APP_USER_CERTADD_BSS_T (ID_SRV, "))
	     		     .append("CERT_VALUE,  MODE_EXEC, ") 
	     		     .append("UP_USER_APP, UP_USER, SECRET, COMMENT_APP ) ") 
	     		     .append(" values ( JOURN_APP_USER_CERTADD_SEQ.nextval, ?, ?, ?, ?, ?, ? ) ")
		   .toString())
		 	     		  
		 	     		    .setParameter(1, certByteX)
		 	     		    .setParameter(2, modeExec)
		 	     		    .setParameter(3, id_user_app)
		 	     		    .setParameter(4, id_user_creator)
		 	     		  	.setParameter(5, secret)
	     			        .setParameter(6, commentApp)
	     		   .executeUpdate();
			
	   }catch(Exception e){
		   log.error("UsrManager:saveUserCertificateApp:error:"+e);
	   }
	   
 }
   
   
   public List<BaseItem> getISSelectListForView(){
	  	
	  try{
     		
     	if(this.ISSelectListForView==null){
     		String remoteAudit = FacesContext.getCurrentInstance().getExternalContext()
 	             .getRequestParameterMap()
 	             .get("remoteAudit");
     		String sessionId = getSSID();
     		
     		if(remoteAudit==null||sessionId==null){
     			return null;
     		}
     		
 	        log.info("UsrManager:getISSelectListForView:remoteAudit:"+remoteAudit);
 	        log.info("UsrManager:getISSelectListForView:sessionId:"+sessionId);
 	        
 	  	     
 	       this.ISSelectListForView=entityManager.createQuery(
		    		 "select o from AcApplication o JOIN o.linkAdminUserSys o1 " 
		    		 + "where o1.pk.upUser = :upUser ")
					 .setParameter("upUser", Long.valueOf(sessionId))
		      		 .getResultList();

 	         
     	 }
     	}catch(Exception e){
 			log.error("UsrManager:getISSelectListForView:error:"+e);
 		}
        	return this.ISSelectListForView;
     }
   
   
  
   
   
   public void selectRecord(){
	    String  sessionId = getSSID();
	    log.info("selectRecord:sessionId="+sessionId);
	    
	   //  for/View/(); //!!!
	    List<String>  selRecUsr = getSessionList("selRecUsr");
	    
	    if(selRecUsr==null){
	       selRecUsr = new ArrayList<String>();
	       log.info("selectRecord:01");
	    }
	    
	     UserItem au = new UserItem();
	    
	    if(au!=null){ 
	     if(selRecUsr.contains(sessionId)){
	    	selRecUsr.remove(sessionId);
	    	au.setSelected(false);
	    	 log.info("selectRecord:02");
	     }else{
	    	selRecUsr.add(sessionId);
	    	au.setSelected(true);
	    	log.info("selectRecord:03");
	    }
	    Contexts.getSessionContext().set("selRecUsr", selRecUsr);	
	    
	    Contexts.getEventContext().set("usrBeanView", au);
	    }
   }
   
   public boolean getDisabled(String idArm, String roleSign, String usrBeanIdUser) throws Exception {
		boolean result = true;
	   
	   log.info("UsrManager:getDisabled:idArm:"+idArm);
	   log.info("UsrManager:getDisabled:roleSign:"+roleSign);
	   log.info("UsrManager:getDisabled:usrBeanIdUser:"+usrBeanIdUser);
	   
		if(idArm!=null && roleSign!=null){
		  try{
			 
			  
			  LinksMap linksMap= getLinksMap();
			  AcUser currentUser = getCurrentUser();
			  
			  result=!(currentUser.getIdUser().intValue()!=linksMap.getSuperUserCode().intValue() || Long.valueOf(usrBeanIdUser).intValue()!=linksMap.getSuperUserCode().intValue()) 
                      || !(Long.valueOf(idArm).intValue()!=linksMap.getAppCode().intValue() || !"role:urn:sys_admin_cud".equals(roleSign) || currentUser.getIdUser().intValue()==linksMap.getSuperUserCode().intValue())
                      || (currentUser.getIsSysAdmin().intValue()!=1 && Long.valueOf(idArm).intValue()==linksMap.getAppCode().intValue());
			  
			  log.info("UsrManager:getDisabled:result:"+result);		     
		    }catch(Exception e){
	           log.error("UsrManager:getDisabled:Error:"+e);
	           throw e;
          }
		}
		return result;
  }
   public String[] getFioArray(){
		  return this.fioArray==null?null:(String[])this.fioArray.clone();
	}
	public void setFioArray(String[] fioArray){
		this.fioArray=(fioArray==null)?new String[]{"", "", ""}:(String[])fioArray.clone();
	}
	
   public List<BaseItem> getApplicantList(){
	   return this.applicantList;
   }
   
   public void setApplicantList(List<BaseItem> applicantList){
	   this.applicantList=applicantList;
   }
   
	public String getSearchOrg() {
		return searchOrg;
	}
	public void setSearchOrg(String searchOrg) {
		this.searchOrg = searchOrg;
	}

	public Map<String, Boolean> getAllowReestrValues() {
		return allowReestrValues;
	}

	public void setAllowReestrValues(HashMap<String, Boolean> allowReestrValues) {
		this.allowReestrValues = allowReestrValues;
	}
	
   public LinksMap getLinksMap() {
	   if(this.linksMap==null){
		   linksMap= getApplicationLinksMap();
	   }
	   return linksMap;
   }
   
   public String getDellMessage() {
	   return dellMessage;
   }
   public void setDellMessage(String dellMessage) {
	   this.dellMessage = dellMessage;
   } 
   
   public AcUser getCurrentUser() {
	   if(this.currentUser==null){
		   currentUser= getSessionItem("currentUser");
	   }
	   return currentUser;
   }
   
 
   
   public Long getIdUserCrt() {
	   return idUserCrt;
   }
   public void setIdUserCrt(Long idUserCrt) {
	   this.idUserCrt = idUserCrt;
   } 
  
   public void audit(ResourcesMap resourcesMap, ActionsMap actionsMap){
	   try{
		   AuditExportData auditExportDataUm = getSessionItem("auditExportData");
		   auditExportDataUm.addFunc(resourcesMap.getCode()+":"+actionsMap.getCode());
		   
	   }catch(Exception e){
		   log.error("GroupManager:audit:error:"+e);
	   }
   }
   
   public Boolean getEvaluteForList() {
	
   	log.info("usrManager:evaluteForList:01");
   	if(evaluteForList==null){
   		evaluteForList=false;
    	String remoteAuditUm = FacesContext.getCurrentInstance().getExternalContext()
	             .getRequestParameterMap()
	             .get("remoteAudit");
	   log.info("usrManager:evaluteForList:remoteAudit:"+remoteAuditUm);
     	
    	if(remoteAuditUm!=null&&
    	 
    	   !"OpenCrtFact".equals(remoteAuditUm)&&	
    	   !"OpenUpdFact".equals(remoteAuditUm)&&
    	   !"OpenDelFact".equals(remoteAuditUm)&&
   	       !"onSelColFact".equals(remoteAuditUm)&&
   	       !"refreshPdFact".equals(remoteAuditUm)){
    		log.info("usrManager:evaluteForList!!!");
   		    evaluteForList=true;
    	}
   	 }
       return evaluteForList;
   }
   public Boolean getEvaluteForListFooter() {
		
	   	if(evaluteForListFooter==null){
	   		evaluteForListFooter=false;
	    	String remoteAuditUm = FacesContext.getCurrentInstance().getExternalContext()
		             .getRequestParameterMap()
		             .get("remoteAudit");
		   log.info("usrManager:evaluteForListFooter:remoteAudit:"+remoteAuditUm);
	     
	    	if(getEvaluteForList()&&
	    	    	
	    	   !"protBeanWord".equals(remoteAuditUm)&&	
	    	    	
	   	       !"selRecAllFact".equals(remoteAuditUm)&&
	   	       !"clRecAllFact".equals(remoteAuditUm)&&
	   	      // !remoteAudit equals "clSelOneFact"
	   	       !"onSelColSaveFact".equals(remoteAuditUm)){
	    		log.info("usrManager:evaluteForListFooter!!!");
	   		    evaluteForListFooter=true;
	    	}
	   	 }
	       return evaluteForListFooter;
	   }
   
   public Boolean getEvaluteForBean() {
		
		   	if(evaluteForBean==null){
		   		evaluteForBean=false;
		    	String remoteAuditUm = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("remoteAudit");
			    log.info("usrManager:evaluteForBean:remoteAudit:"+remoteAuditUm);
				String sessionIdUm = getSSID();
			    log.info("usrManager:evaluteForBean:sessionId:"+sessionIdUm);
		    	if(sessionIdUm!=null && remoteAuditUm!=null &&
		    	   ("rowSelectFact".equals(remoteAuditUm)||	
		    	    "UpdFact".equals(remoteAuditUm))){
		    	      log.info("usrManager:evaluteForBean!!!");
		   		      evaluteForBean=true;
		    	}
		   	 }
		     return evaluteForBean;
		   }

public String getSearchDep() {
	return searchDep;
}
public void setSearchDep(String searchDep) {
	this.searchDep = searchDep;
}

public List<BaseItem> getUserCertList() {
	return userCertList;
}

public void setUserCertList(List<BaseItem> userCertList) {
	this.userCertList = userCertList;
}

public String getInvalidMessageCrt() {
	
	if(addLoginExist){
		invalidMessageCrt="Такой логин уже существует!";
	}
	
	if(addCertNumExist){
		invalidMessageCrt="Такой сертификат уже существует!";
	}
	
	return invalidMessageCrt;
}

public void setInvalidMessageCrt(String invalidMessageCrt) {
	this.invalidMessageCrt = invalidMessageCrt;
}

public String getCommentApp() {
	return commentApp;
}

public void setCommentApp(String commentApp) {
	this.commentApp = commentApp;
}




public Boolean getAccOrgManager() {
	
	 if(this.accOrgManager==null){
		 
		   log.info("UsrManager:getAccOrgManager:01");
		   
		   try{
			   String sessionId = getSSID();
			   
			    String isManager = (String) entityManager.createNativeQuery(
			    		 "select to_char(t1.IS_ACC_ORG_MANAGER) " 
			    		 + "from AC_USERS_KNL_T t1 " 
			    		 + "where t1.ID_SRV = :idUser ")
						 .setParameter("idUser", Long.valueOf(sessionId))
						 .getSingleResult();
						 
			   if("1".equals(isManager)){
				   this.accOrgManager = true;
			   }
			   
			   log.info("UsrManager:getAccOrgManager:02:"+this.accOrgManager);
			   
		   }catch(Exception e){
			   log.info("UsrManager:getAccOrgManager:error:"+e);
		   }
	 }
	 
	return this.accOrgManager;
}

public void setAccOrgManager(Boolean accOrgManager) {
	this.accOrgManager = accOrgManager;
}

private String decToHex(BigInteger bi) {
	
	String result = null;
	
	try
	{
	 result = bi.toString(16);
	  
	}
	catch (NumberFormatException e)
	{
		log.error("Error! tried to parse an invalid number format");
	}
	 return result;
 }

public List<MunicBssT> getMunicList() {
	
	if(this.municList==null){
		this.municList = entityManager.createQuery(
				"select mun from MunicBssT mun where mun.status = 'A' "
				+ "order by mun.fullName ", MunicBssT.class)
				.getResultList();
		
	}
	
	return this.municList;
}

	public void setMunicList(List<MunicBssT> municList) {
		this.municList = municList;
	}

	public static String getSSID() {
		return FacesContext.getCurrentInstance().getExternalContext()
			   .getRequestParameterMap().get("sessionId");
	}
	
	private static Object getSSIDQuerySingleResult(EntityManager entityManager, 
			String what, String from, String where,
			String ssidParamName, String callerName) {
		Object res = null;
		try {				
			final String ssid = getSSID();			
			if(!Strings.isNullOrEmpty(ssid)) {
				final StringBuilder sbQuery = new StringBuilder("select ");
				sbQuery.append(what).append(" from ").append(from)
					.append(" where ").append(where);
			    res = entityManager.createNativeQuery(sbQuery.toString())
					 .setParameter(ssidParamName, Long.valueOf(ssid))
					 .getSingleResult();					
			}
		} catch(Exception x) {
			logger.warn("UsrManager:"+callerName+":error:"+x);
		}
		return res;
	}

	public String getNote() {
		if(this.note==null)
			this.note = (String)getSSIDQuerySingleResult(entityManager, 
					"NOTE", "AC_USERS_KNL_T t1", 
					"t1.ID_SRV = :idUser", 
					"idUser", "getNote");
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getLastLoginTime() {
		// SELECT max(sl.CREATED) FROM SERVICES_LOG_KNL_T sl
		// WHERE sl.UP_USERS = :idUser and sl.UP_SERVICES in (4, 82, 2, 62, 83);
		if(this.lastLoginTime == null) {
			final Object lastAccTime = getSSIDQuerySingleResult(entityManager, 
					"max(SL.CREATED)", "SERVICES_LOG_KNL_T sl",
					"sl.UP_USERS = :idUser and sl.UP_SERVICES in (4, 82, 2, 62, 83)",
					"idUser", "getLastLoginTime");
			if(lastAccTime!=null)
				this.lastLoginTime = lastAccTime.toString();
		}
		return this.lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}

