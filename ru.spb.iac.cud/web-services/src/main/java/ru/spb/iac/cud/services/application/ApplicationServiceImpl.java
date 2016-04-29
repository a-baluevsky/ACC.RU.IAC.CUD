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

import ru.spb.iac.cud.context.application.ContextApplicationManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.app.AppAttribute;
import ru.spb.iac.cud.items.app.AppAccept;
import ru.spb.iac.cud.services.CUDService;

import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
 
import org.slf4j.LoggerFactory;

@WebService(targetNamespace = ApplicationServiceImpl.NS)
@HandlerChain(file = "/handlers.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class ApplicationServiceImpl extends CUDService implements ApplicationService {

	public static final String NS = "http://application.services.cud.iac.spb.ru/";

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

	@Resource(name = "wsContext")
	private WebServiceContext wsContext;

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept system_registration(
			@WebParam(name = "attributes", targetNamespace = NS) List<AppAttribute> attributes)
			throws GeneralFailure {

		LOGGER.debug("system_registration");
		return (new ContextApplicationManager()).system_registration(
				attributes, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept user_registration(
			@WebParam(name = "attributes", targetNamespace = NS) List<AppAttribute> attributes)
			throws GeneralFailure {

		LOGGER.debug("user_registration");

		return (new ContextApplicationManager()).user_registration(attributes,
				serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept access_roles(
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec,
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "codesRoles", targetNamespace = NS) List<String> codesRoles)
			throws GeneralFailure {

		// mode:
		// 1) REPLACE
		// 2) ADD
		// 3) REMOVE

		LOGGER.debug("access_roles");

		return (new ContextApplicationManager())
				.access_roles(modeExec, uidUser, serviceContext.getIDSystem(), codesRoles,
						serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept access_groups(
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec,
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "codesGroups", targetNamespace = NS) List<String> codesGroups)
			throws GeneralFailure {

		// mode:
		// 1) REPLACE
		// 2) ADD
		// 3) REMOVE

		LOGGER.debug("access_groups");

		return (new ContextApplicationManager()).access_groups(modeExec,
				uidUser, serviceContext.getIDSystem(), codesGroups, serviceContext.getIDUser(),
				serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept block(
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec,
			
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "blockUser", targetNamespace = NS) String blockReason)
			throws GeneralFailure {

		// mode:
		// 1) BLOCK
		// 2) UNBLOCK

		LOGGER.debug("block");

		return (new ContextApplicationManager()).block(modeExec, uidUser,
				blockReason, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept system_modification(
			@WebParam(name = "attributes", targetNamespace = NS) List<AppAttribute> attributes)
			throws GeneralFailure {

		LOGGER.debug("system_modification");

		return (new ContextApplicationManager()).system_modification(
				serviceContext.getIDSystem(), attributes, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept user_modification(
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "attributes", targetNamespace = NS) List<AppAttribute> attributes)
			throws GeneralFailure {

		LOGGER.debug("user_modification");

		return (new ContextApplicationManager()).user_modification(uidUser,
				attributes, serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept user_identity_modification(
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "login", targetNamespace = NS) String login,
			@WebParam(name = "password", targetNamespace = NS) String password)
			throws GeneralFailure {

		return (new ContextApplicationManager()).user_identity_modification(
				uidUser, login, password, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public AppAccept user_cert_modification(
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec,
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "certBase64", targetNamespace = NS) String certBase64)
			throws GeneralFailure {

		return (new ContextApplicationManager()).user_cert_modification(
				modeExec, uidUser, certBase64, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

}
