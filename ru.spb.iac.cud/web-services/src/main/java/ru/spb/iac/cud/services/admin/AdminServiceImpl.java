package ru.spb.iac.cud.services.admin;

import iac.cud.data.eis.JPA_EisAdminManager;

import java.util.Arrays;
import java.util.List;

import javaw.lang.Strings;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextSyncManager;
import ru.spb.iac.cud.context.eis.ContextAdminManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.services.CUDService;

@WebService(targetNamespace = AdminServiceImpl.NS)
@HandlerChain(file = "/handlers.xml")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
 public class AdminServiceImpl extends CUDService implements AdminService {

	public static final String NS = "http://admin.services.cud.iac.spb.ru/";

	private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);

	@javax.annotation.Resource(name = "wsContext")
	private WebServiceContext wsContext;

	@WebMethod
	public void sync_roles(
			@WebParam(name = "roles", targetNamespace = NS) List<Role> roles,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		LOGGER.debug("sync_roles");
		(new ContextSyncManager()).sync_roles(serviceContext.getIDSystem(), roles, modeExec,
				serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void access_roles(
			@WebParam(name = "uidsUsers", targetNamespace = NS) List<String> uidsUsers,
			@WebParam(name = "codesRoles", targetNamespace = NS) List<String> codesRoles,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		LOGGER.debug("access_roles");
		(new ContextAdminManager()).access(serviceContext.getIDSystem(), uidsUsers, modeExec,
				codesRoles, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void cert_change_sys(
			@WebParam(name = "newCert", targetNamespace = NS) String newCert)
			throws GeneralFailure {		
		LOGGER.debug("cert_change_sys");
		(new ContextAdminManager()).cert_change(serviceContext.getIDSystem(), newCert,
				serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void sync_functions(
			@WebParam(name = "functions", targetNamespace = NS) List<Function> functions,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		LOGGER.debug("sync_functions");
		(new ContextSyncManager()).sync_functions(serviceContext.getIDSystem(), functions,
				modeExec, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void sync_groups(
			@WebParam(name = "groups", targetNamespace = NS) List<Group> groups,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		LOGGER.debug("sync_groups");
		(new ContextSyncManager()).sync_groups(serviceContext.getIDSystem(), groups, modeExec,
				serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void sync_groups_roles(
			@WebParam(name = "codesGroups", targetNamespace = NS) List<String> codesGroups,
			@WebParam(name = "codesRoles", targetNamespace = NS) List<String> codesRoles,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		LOGGER.debug("sync_groups_roles");
		(new ContextSyncManager()).sync_groups_roles(serviceContext.getIDSystem(),
				codesGroups, codesRoles, modeExec, serviceContext.getIDUser(), serviceContext.getIPAddress());
	}

	@WebMethod
	public void access_groups(
			@WebParam(name = "uidsUsers", targetNamespace = NS) List<String> uidsUsers,
			@WebParam(name = "codesGroups", targetNamespace = NS) List<String> codesGroups,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {

		(new ContextAdminManager()).access_groups(serviceContext.getIDSystem(), uidsUsers,
				modeExec, codesGroups, serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebMethod
	public void sync_resources(
			@WebParam(name = "resources", targetNamespace = NS) List<Resource> resources,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		(new ContextSyncManager()).sync_resources(serviceContext.getIDSystem(), resources,
				modeExec, serviceContext.getIDUser(), serviceContext.getIPAddress());

	}

	@WebMethod
	public void sync_resources_roles(
			@WebParam(name = "codesResources", targetNamespace = NS) List<String> codesResources,
			@WebParam(name = "codesRoles", targetNamespace = NS) List<String> codesRoles,
			@WebParam(name = "modeExec", targetNamespace = NS) String modeExec)
			throws GeneralFailure {
		(new ContextSyncManager()).sync_resources_roles(serviceContext.getIDSystem(),
				codesResources, codesRoles, modeExec, serviceContext.getIDUser(),
				serviceContext.getIPAddress());
	}


	@WebMethod
	public void store_organization_attributes(
			@WebParam(name = "organizationCode", targetNamespace = NS) String organizationCode,
			@WebParam(name = "organizationAttributes", targetNamespace = NS) List<Attribute> organizationAttributes)
	throws GeneralFailure {		
		LOGGER.debug("edit_organization_attributes");	
		// check for allowed attributes' names
		String[] arrValidNames = new String[]{
				"ORG_ADDRESS", "ORG_NAME", "ORG_PHONE", "ORG_EMAIL", "ORG_SITE", 
				"ORG_OKPO", "ORG_OKOGU", "ORG_OGRN", "ORG_INN", "ORG_KPP"
		};
		List<String> al = Arrays.asList(arrValidNames);
		boolean bHasIllegalAttribute = false;
		for(Attribute atr: organizationAttributes) {
			String an = atr.getName();
			if(Strings.isNullOrEmptyTrim(an) || !al.contains(an)) {
				LOGGER.warn("store_organization_attributes: Illegal attribute passed: "+an);
				bHasIllegalAttribute = true;
			}
		}
		if(bHasIllegalAttribute)
			throw new GeneralFailure("Illegal attribute(s) passed! Allowed values are "+Arrays.toString(arrValidNames));

		(new ContextAdminManager()).getAdminManager().store_organization_attributes(
				JPA_EisAdminManager.MakeOrgAttrsFromOrgCode(organizationCode, organizationAttributes), 
				serviceContext.getIDUser());
	}
	
	@WebMethod
	public @WebResult(targetNamespace = NS) List<Attribute> fetch_organization_attributes(
			@WebParam(name = "organizationCode", targetNamespace = NS) String organizationCode,
			@WebParam(name = "organizationAttributes", targetNamespace = NS) List<Attribute> organizationAttributes)
	throws GeneralFailure {		
		LOGGER.debug("edit_organization_attributes");
		return (new ContextAdminManager()).getAdminManager().fetch_organization_attributes(JPA_EisAdminManager.MakeOrgAttrsFromOrgCode(organizationCode, organizationAttributes));
	}	
	
}
