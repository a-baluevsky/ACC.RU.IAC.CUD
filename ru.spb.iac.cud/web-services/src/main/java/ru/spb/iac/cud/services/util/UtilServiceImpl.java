package ru.spb.iac.cud.services.util;

import java.util.List;

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

import ru.spb.iac.cud.context.ContextSyncManager;
import ru.spb.iac.cud.context.eis.ContextUtilManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.GroupsData;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.items.UsersData;
import ru.spb.iac.cud.services.CUDService;

@WebService(targetNamespace = UtilServiceImpl.NS)
@HandlerChain(file = "/handlers.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class UtilServiceImpl extends CUDService implements UtilService {

	public static final String NS = "http://util.services.cud.iac.spb.ru/";

	private static final Logger LOGGER = LoggerFactory.getLogger(UtilServiceImpl.class);
	

	@WebMethod
	@WebResult(targetNamespace = NS)
	public UsersData users_data(
			@WebParam(name = "uidsUsers", targetNamespace = NS) List<String> uidsUsers,
			@WebParam(name = "category", targetNamespace = NS) String category,
			@WebParam(name = "rolesCodes", targetNamespace = NS) List<String> rolesCodes,
			@WebParam(name = "groupsCodes", targetNamespace = NS) List<String> groupsCodes,
			@WebParam(name = "startRow", targetNamespace = NS) Integer startRow,
			@WebParam(name = "countRow", targetNamespace = NS) Integer countRow,
			@WebParam(name = "settings", targetNamespace = NS) List<String> settings)
			throws GeneralFailure {

		LOGGER.debug("users_data");
		
		
		return (new ContextUtilManager()).users_data(serviceContext.getIDSystem(), uidsUsers,
				category, rolesCodes, groupsCodes, startRow, countRow, settings,
				serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public List<Role> sys_roles() throws GeneralFailure {
		
		LOGGER.debug("sys_roles");
		
		return (new ContextSyncManager()).is_roles(serviceContext.getIDSystem(), serviceContext.getIDUser(),
				serviceContext.getIPAddress());
	}

	@WebResult(targetNamespace = NS)
	public List<Function> sys_functions() throws GeneralFailure {
		
		LOGGER.debug("sys_functions");
		
		return (new ContextSyncManager()).is_functions(serviceContext.getIDSystem(),
				serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebMethod
	@WebResult(targetNamespace = NS)
	public GroupsData groups_data(
			@WebParam(name = "groupsCodes", targetNamespace = NS) List<String> groupsCodes,
			@WebParam(name = "category", targetNamespace = NS) String category,
			@WebParam(name = "rolesCodes", targetNamespace = NS) List<String> rolesCodes,
			@WebParam(name = "startRow", targetNamespace = NS) Integer startRow,
			@WebParam(name = "countRow", targetNamespace = NS) Integer countRow,
			@WebParam(name = "settings", targetNamespace = NS) List<String> settings)
			throws GeneralFailure {

		LOGGER.debug("groups_data");
		
		return (new ContextUtilManager()).groups_data(serviceContext.getIDSystem(),
				groupsCodes, category, rolesCodes, startRow, countRow, null,
				serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	

	@WebResult(targetNamespace = NS)
	public List<Resource> resources_data(
	
	@WebParam(name = "category", targetNamespace = NS) String category)
			throws GeneralFailure {

		LOGGER.debug("resources_data");
		
		return (new ContextUtilManager()).resources_data_subsys(serviceContext.getIDSystem(), 
				
				category, serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebResult(targetNamespace = NS)
	public List<Role> roles_data(
			@WebParam(name = "category", targetNamespace = NS) String category) throws GeneralFailure{
		
		LOGGER.debug("roles_data");
		
		return (new ContextUtilManager()).roles_data(serviceContext.getIDSystem(), 
				category, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

}
