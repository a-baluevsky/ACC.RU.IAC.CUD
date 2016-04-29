package ru.spb.iac.cud.services.application;

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

import ru.spb.iac.cud.context.application.ContextApplicationResultManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.app.AppResult;
import ru.spb.iac.cud.items.app.AppResultRequest;
import ru.spb.iac.cud.services.CUDService;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(targetNamespace = ApplicationResultServiceImpl.NS)
@HandlerChain(file = "/handlers_anonym.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class ApplicationResultServiceImpl extends CUDService implements ApplicationResultService {

	public static final String NS = "http://application.services.cud.iac.spb.ru/";

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResultServiceImpl.class);

	@WebMethod
	@WebResult(targetNamespace = NS)
	public List<AppResult> result(
			@WebParam(name = "appResultRequestList", targetNamespace = NS) List<AppResultRequest> appResultRequestList)
			throws GeneralFailure {

		return (new ContextApplicationResultManager()).result(
				appResultRequestList, serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

}
