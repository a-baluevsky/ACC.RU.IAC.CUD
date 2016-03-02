package ru.spb.iac.cud.services.audit;

import java.util.Date;
import java.util.List;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;
import ru.spb.iac.cud.services.CUDService;

@WebService(targetNamespace = AuditServiceImpl.NS)
@HandlerChain(file = "/handlers_anonym.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class AuditServiceImpl extends CUDService implements AuditService{
	 private static final Logger LOGGER = LoggerFactory.getLogger(AuditServiceImpl.class);
	 private static final ContextAccessManager cam  = new ContextAccessManager();
     public static final String NS = "http://audit.services.cud.iac.spb.ru/";

     //@Resource(name="wsContext")
     //private WebServiceContext wsContext;
     
     @WebMethod
     public void audit (
			    @WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			    @WebParam(name = "userFunctions", targetNamespace = NS) List<AuditFunction> userFunctions) throws GeneralFailure{
    	 
    	 LOGGER.debug("audit");
		 cam.audit(getIDSystem(), uidUser, userFunctions, getIDUser(), getIPAddress());
	 }
     
	@Override
	@WebResult(targetNamespace = NS)
	public AuditDataPage getAuditDataISByPeriod (
			@WebParam(name = "date1", targetNamespace = NS) Date date1,
			@WebParam(name = "date2", targetNamespace = NS) Date date2,
			@WebParam(name = "rowsCount", targetNamespace = NS) int rowsCount,
			@WebParam(name = "rowStartOffset", targetNamespace = NS) long rowStartOffset,
			@WebParam(name = "filterUser", targetNamespace = NS) long filterUser
		) throws GeneralFailure {
		
		AuditDataPage adp = null;
		try {
			String sysCode = getIDSystem(); //LoadAssertionFromMessageContext(wsContext.getMessageContext()).getSubjectNameID();
			LOGGER.debug("getAuditDataISByPeriod");
			adp = cam.getAuditDataISByPeriod(sysCode, date1, date2, rowsCount, rowStartOffset, filterUser);
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return adp;
	}
}
