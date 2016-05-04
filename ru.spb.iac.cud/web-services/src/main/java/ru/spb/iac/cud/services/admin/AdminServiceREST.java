package ru.spb.iac.cud.services.admin;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.List;

import javaw.util.ArrayList;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.annotation.XmlRootElement;

import org.jboss.resteasy.spi.StringConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.context.ContextSyncManager;
import ru.spb.iac.cud.context.eis.ContextAdminManager;
import ru.spb.iac.cud.core.oauth.ProtectedBy;
import ru.spb.iac.cud.core.oauth.Token.AbstractAccessToken.AccessTokenSubjectType;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;
import ru.spb.iac.cud.services.CUDServiceREST;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.services.CUDService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

@Path("/admin")
public class AdminServiceREST extends CUDServiceREST {
	// use aggregation to reuse web service implementation class
	AdminServiceImpl impl;
	private AdminServiceImpl impl() { return impl==null? impl=switchServiceContext(new AdminServiceImpl()): impl; }
	
	// Proxy methods
   private static class SyncRolesParams {
       private 	List<Role> 	roles;
       public 	List<Role> 	getRoles() 				{ return roles; }
       public 	void   	setRoles(List<Role> roles) 		{ this.roles = roles; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }
   @GET @Path("sync_roles")
   @Produces(JSON_UTF8)
   public RESTResult sync_roles(@QueryParam("roles") List<Role> roles,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().sync_roles(roles, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("sync_roles")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult sync_roles(SyncRolesParams params) throws GeneralFailure {
       sync_roles(params.getRoles(), params.getModeExec());
       return RESTResult.OK;
   }
   private static class AccessRolesParams {
       private 	List<String> 	uidsUsers;
       public 	List<String> 	getUidsUsers() 				{ return uidsUsers; }
       public 	void   	setUidsUsers(List<String> uidsUsers) 		{ this.uidsUsers = uidsUsers; }
       private 	List<String> 	codesRoles;
       public 	List<String> 	getCodesRoles() 				{ return codesRoles; }
       public 	void   	setCodesRoles(List<String> codesRoles) 		{ this.codesRoles = codesRoles; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }
   @GET @Path("access_roles")
   @Produces(JSON_UTF8)
   public RESTResult access_roles(@QueryParam("uidsUsers") List<String> uidsUsers,
        @QueryParam("codesRoles") List<String> codesRoles,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().access_roles(uidsUsers, codesRoles, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("access_roles")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult access_roles(AccessRolesParams params) throws GeneralFailure {
       access_roles(params.getUidsUsers(), params.getCodesRoles(), params.getModeExec());
       return RESTResult.OK;
   }
   private static class CertChangeSysParams {
       private 	String 	String;
       public 	String 	getString() 				{ return String; }
       public 	void   	setString(String String) 		{ this.String = String; }
   }
   @GET @Path("cert_change_sys")
   @Produces(JSON_UTF8)
   public RESTResult cert_change_sys(@QueryParam("String") String String) throws GeneralFailure {
       impl().cert_change_sys(String);
       return RESTResult.OK;
   }
   @POST @Path("cert_change_sys")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult cert_change_sys(CertChangeSysParams params) throws GeneralFailure {
       cert_change_sys(params.getString());
       return RESTResult.OK;
   }
   
   private static class SyncFunctionsParams {
       private 	List<Function> 	functions;
       public 	List<Function> 	getFunctions() 				{ return functions; }
       public 	void   	setFunctions(List<Function> functions) 		{ this.functions = functions; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }

   @GET @Path("sync_functions")
   @Produces(JSON_UTF8)
   public RESTResult sync_functions(@QueryParam("functions") List<Function> functions, 
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().sync_functions(functions, modeExec);
       return RESTResult.OK;
   }

   @POST @Path("sync_functions")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult sync_functions(SyncFunctionsParams params) throws GeneralFailure {
       sync_functions(params.getFunctions(), params.getModeExec()); //.get(0)
       return RESTResult.OK;
   }
   
   private static class SyncGroupsParams {
       private 	List<Group> 	groups;
       public 	List<Group> 	getGroups() 				{ return groups; }
       public 	void   	setGroups(List<Group> groups) 		{ this.groups = groups; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }
   @GET @Path("sync_groups")
   @Produces(JSON_UTF8)
   public RESTResult sync_groups(@QueryParam("groups") List<Group> groups,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().sync_groups(groups, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("sync_groups")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult sync_groups(SyncGroupsParams params) throws GeneralFailure {
       sync_groups(params.getGroups(), params.getModeExec());
       return RESTResult.OK;
   }
   private static class SyncGroupsRolesParams {
       private 	List<String> 	codesGroups;
       public 	List<String> 	getCodesGroups() 				{ return codesGroups; }
       public 	void   	setCodesGroups(List<String> codesGroups) 		{ this.codesGroups = codesGroups; }
       private 	List<String> 	codesRoles;
       public 	List<String> 	getCodesRoles() 				{ return codesRoles; }
       public 	void   	setCodesRoles(List<String> codesRoles) 		{ this.codesRoles = codesRoles; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }
   @GET @Path("sync_groups_roles")
   @Produces(JSON_UTF8)
   public RESTResult sync_groups_roles(@QueryParam("codesGroups") List<String> codesGroups,
        @QueryParam("codesRoles") List<String> codesRoles,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().sync_groups_roles(codesGroups, codesRoles, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("sync_groups_roles")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult sync_groups_roles(SyncGroupsRolesParams params) throws GeneralFailure {
       sync_groups_roles(params.getCodesGroups(), params.getCodesRoles(), params.getModeExec());
       return RESTResult.OK;
   }
   private static class AccessGroupsParams {
       private 	List<String> 	uidsUsers;
       public 	List<String> 	getUidsUsers() 				{ return uidsUsers; }
       public 	void   	setUidsUsers(List<String> uidsUsers) 		{ this.uidsUsers = uidsUsers; }
       private 	List<String> 	codesGroups;
       public 	List<String> 	getCodesGroups() 				{ return codesGroups; }
       public 	void   	setCodesGroups(List<String> codesGroups) 		{ this.codesGroups = codesGroups; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }

   @GET @Path("access_groups")
   @Produces(JSON_UTF8)
   public RESTResult access_groups(@QueryParam("uidsUsers") List<String> uidsUsers,
        @QueryParam("codesGroups") List<String> codesGroups,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().access_groups(uidsUsers, codesGroups, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("access_groups")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult access_groups(AccessGroupsParams params) throws GeneralFailure {
       access_groups(params.getUidsUsers(), params.getCodesGroups(), params.getModeExec());
       return RESTResult.OK;
   }
   private static class SyncResourcesParams {
       private 	List<Resource> 	resources;
       public 	List<Resource> 	getResources() 				{ return resources; }
       public 	void   	setResources(List<Resource> resources) 		{ this.resources = resources; }
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
   }
   @GET @Path("sync_resources")
   @Produces(JSON_UTF8)
   public RESTResult sync_resources(@QueryParam("resources") List<Resource> resources,
        @QueryParam("modeExec") String modeExec) throws GeneralFailure {
       impl().sync_resources(resources, modeExec);
       return RESTResult.OK;
   }
   @POST @Path("sync_resources")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult sync_resources(SyncResourcesParams params) throws GeneralFailure {
       sync_resources(params.getResources(), params.getModeExec());
       return RESTResult.OK;
   }
   
   // CORS support OPTION methods
	@PermitAll @OPTIONS @Path("sync_roles") 		public Response sync_rolesOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("access_roles") 		public Response access_rolesOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("cert_change_sys") 	public Response cert_change_sysOptionsCORS() 	{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("sync_functions") 	public Response sync_functionsOptionsCORS() 	{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("sync_groups") 		public Response sync_groupsOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("sync_groups_roles") 	public Response sync_groups_rolesOptionsCORS() 	{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("access_groups") 		public Response access_groupsOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("sync_resources") 	public Response sync_resourcesOptionsCORS() 	{ return getOKResponse(); }

}
