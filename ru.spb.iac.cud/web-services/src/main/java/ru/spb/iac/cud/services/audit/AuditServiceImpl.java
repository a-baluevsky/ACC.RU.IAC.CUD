package ru.spb.iac.cud.services.audit;

import ru.spb.iac.cud.items.Group;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;


@SuppressWarnings("restriction")
@WebService(targetNamespace = AuditServiceImpl.NS)
@HandlerChain(file = "/handlers_anonym.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class AuditServiceImpl implements AuditService{

     public static final String NS = "http://audit.services.cud.iac.spb.ru/";

     private static final Logger LOGGER = LoggerFactory.getLogger(AuditServiceImpl.class);
     
     @Resource(name="wsContext")
     private WebServiceContext wsContext;

     
     @WebMethod
     public void audit (
			    @WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			    @WebParam(name = "userFunctions", targetNamespace = NS) List<AuditFunction> userFunctions) throws GeneralFailure{
    	 
    	 LOGGER.debug("audit");
			(new ContextAccessManager()).audit(
					getIDSystem(), uidUser, userFunctions, getIDUser(), getIPAddress());
	 }
  
     private String getIPAddress(){
	        MessageContext context = wsContext.getMessageContext();
	        HttpServletRequest request = (HttpServletRequest)context.get(MessageContext.SERVLET_REQUEST);
	      
	        String ipAddress = request.getRemoteAddr(); 
	    return ipAddress;
	 }
     
     private String getIDSystem(){
	        MessageContext context = wsContext.getMessageContext();
	        HttpServletRequest request = (HttpServletRequest)context.get(MessageContext.SERVLET_REQUEST);
	      
	        String idSystem = (String)request.getSession().getAttribute("cud_sts_principal"); 
	        
	        LOGGER.debug("getIDSystem:"+idSystem);
	        
	               
	    return idSystem;
	 }
     
     private Long getIDUser() throws GeneralFailure{
	        MessageContext context = wsContext.getMessageContext();
	        HttpServletRequest request = (HttpServletRequest)context.get(MessageContext.SERVLET_REQUEST);
	      
	        Long idUser = null;
	        try{
	           //user из ApplicantToken_1
	           //это заявитель
	          
	        	//когда пользователя определяли по логину, то сначала в AppSOAPHandler 
	        	//вычисляли его ИД через authenticate_login_obo
	        	//и в сессию клали уже Long idUser, 
	        	//поэтому при извлечении из сессии можно было делать привидение к Long
	        	//сейчас же мы кладём в сессиию ид пользователя из текстового поля запроса
	        	//Long i/dUser = (Long/request.getSe/ssion().getAttr/ibute("user_id_principal"); 
	        
	        	
	        	if(request.getSession().getAttribute("user_id_principal")!=null&&
	        			!request.getSession().getAttribute("user_id_principal").toString().isEmpty()){
	        	
	        	  //это заявитель
	        		idUser = new Long((String)request.getSession().getAttribute("user_id_principal")); 
	            
	             
	        
	         	}else{
	         		//анаоним
	         		idUser = -1L;
	         	}
	            return idUser;
	        
	        }catch(Exception e){
	        	throw new GeneralFailure("USER UID IS NOT CORRECT");
	        }
	 }
     
     @WebMethod
     @WebResult(targetNamespace = NS)
     public Group testAB (
                            @WebParam(name = "testGroupId", targetNamespace = NS) String sTestGrpId ) throws GeneralFailure{
    	 System.out.println("ABaluevsky: testAB: Group grp =  new Group();");
         	LOGGER.debug("ABaluevsky: testAB - " + sTestGrpId);
         	Group grp =  new Group();
         	grp.setName("ABaluevsky group: "+sTestGrpId);
         	LOGGER.debug("ABaluevsky: testAB: "+grp.getName());
            return grp;
         }     
}
