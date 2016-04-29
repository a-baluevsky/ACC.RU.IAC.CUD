package ru.spb.iac.cud.services.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.services.CUDServiceREST;

import javax.ws.rs.core.Response;
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
import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/util")
public class UtilServiceREST extends CUDServiceREST {
	private static final Logger LOGGER = LoggerFactory.getLogger(UtilServiceREST.class);
	
	// use aggregation to reuse web service implementation class
	UtilServiceImpl impl;
	public UtilServiceREST() {
		//impl.serviceContext not accessible, so do injection manually
		final Class<CUDService> clsImpl = CUDService.class;
		try {			
			impl = new UtilServiceImpl();
			final Field fldServiceContext = clsImpl.getDeclaredField("serviceContext"); //getField("serviceContext"); //getDeclaredField("serviceContext");
			fldServiceContext.setAccessible(true);
			fldServiceContext.set(impl, serviceContext);
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}

	// Proxy methods
   private static class UsersDataParams {
       private 	List<String> 	uidsUsers;
       public 	List<String> 	getUidsUsers() 				{ return uidsUsers; }
       public 	void   	setUidsUsers(List<String> uidsUsers) 		{ this.uidsUsers = uidsUsers; }
       private 	String 	category;
       public 	String 	getCategory() 				{ return category; }
       public 	void   	setCategory(String category) 		{ this.category = category; }
       private 	List<String> 	rolesCodes;
       public 	List<String> 	getRolesCodes() 				{ return rolesCodes; }
       public 	void   	setRolesCodes(List<String> rolesCodes) 		{ this.rolesCodes = rolesCodes; }
       private 	List<String> 	groupsCodes;
       public 	List<String> 	getGroupsCodes() 				{ return groupsCodes; }
       public 	void   	setGroupsCodes(List<String> groupsCodes) 		{ this.groupsCodes = groupsCodes; }
       private 	Integer 	startRow;
       public 	Integer 	getStartRow() 				{ return startRow; }
       public 	void   	setStartRow(Integer startRow) 		{ this.startRow = startRow; }
       private 	Integer 	countRow;
       public 	Integer 	getCountRow() 				{ return countRow; }
       public 	void   	setCountRow(Integer countRow) 		{ this.countRow = countRow; }
       private 	List<String> 	settings;
       public 	List<String> 	getSettings() 				{ return settings; }
       public 	void   	setSettings(List<String> settings) 		{ this.settings = settings; }
   }
   @GET @Path("users_data")
   @Produces(JSON_UTF8)
   public UsersData users_data(@QueryParam("uidsUsers") List<String> uidsUsers,
        @QueryParam("category") String category,
        @QueryParam("rolesCodes") List<String> rolesCodes,
        @QueryParam("groupsCodes") List<String> groupsCodes,
        @QueryParam("startRow") Integer startRow,
        @QueryParam("countRow") Integer countRow,
        @QueryParam("settings") List<String> settings) throws GeneralFailure {
     UsersData retVal = null;
      return impl.users_data(uidsUsers, category, rolesCodes, groupsCodes, startRow, countRow, settings);
   }
   @POST @Path("users_data")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public UsersData users_data(UsersDataParams params) throws GeneralFailure {
     UsersData retVal = null;
      return impl.users_data(uidsUsers, category, rolesCodes, groupsCodes, startRow, countRow, settings);
   }
   @GET @Path("sys_roles")
   @Produces(JSON_UTF8)
   public List<Role> sys_roles() throws GeneralFailure {
     List<Role> retVal = null;
      return impl.sys_roles();
   }
   @POST @Path("sys_roles")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public List<Role> sys_roles() throws GeneralFailure {
     List<Role> retVal = null;
      return impl.sys_roles();
   }
   @GET @Path("sys_functions")
   @Produces(JSON_UTF8)
   public List<Function> sys_functions() throws GeneralFailure {
     List<Function> retVal = null;
      return impl.sys_functions();
   }
   @POST @Path("sys_functions")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public List<Function> sys_functions() throws GeneralFailure {
     List<Function> retVal = null;
      return impl.sys_functions();
   }
   private static class GroupsDataParams {
       private 	List<String> 	groupsCodes;
       public 	List<String> 	getGroupsCodes() 				{ return groupsCodes; }
       public 	void   	setGroupsCodes(List<String> groupsCodes) 		{ this.groupsCodes = groupsCodes; }
       private 	String 	category;
       public 	String 	getCategory() 				{ return category; }
       public 	void   	setCategory(String category) 		{ this.category = category; }
       private 	List<String> 	rolesCodes;
       public 	List<String> 	getRolesCodes() 				{ return rolesCodes; }
       public 	void   	setRolesCodes(List<String> rolesCodes) 		{ this.rolesCodes = rolesCodes; }
       private 	Integer 	startRow;
       public 	Integer 	getStartRow() 				{ return startRow; }
       public 	void   	setStartRow(Integer startRow) 		{ this.startRow = startRow; }
       private 	Integer 	countRow;
       public 	Integer 	getCountRow() 				{ return countRow; }
       public 	void   	setCountRow(Integer countRow) 		{ this.countRow = countRow; }
       private 	List<String> 	settings;
       public 	List<String> 	getSettings() 				{ return settings; }
       public 	void   	setSettings(List<String> settings) 		{ this.settings = settings; }
   }
   @GET @Path("groups_data")
   @Produces(JSON_UTF8)
   public GroupsData groups_data(@QueryParam("groupsCodes") List<String> groupsCodes,
        @QueryParam("category") String category,
        @QueryParam("rolesCodes") List<String> rolesCodes,
        @QueryParam("startRow") Integer startRow,
        @QueryParam("countRow") Integer countRow,
        @QueryParam("settings") List<String> settings) throws GeneralFailure {
     GroupsData retVal = null;
      return impl.groups_data(groupsCodes, category, rolesCodes, startRow, countRow, settings);
   }
   @POST @Path("groups_data")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public GroupsData groups_data(GroupsDataParams params) throws GeneralFailure {
     GroupsData retVal = null;
      return impl.groups_data(groupsCodes, category, rolesCodes, startRow, countRow, settings);
   }
   private static class ResourcesDataParams {
       private 	String 	category;
       public 	String 	getCategory() 				{ return category; }
       public 	void   	setCategory(String category) 		{ this.category = category; }
   }
   @GET @Path("resources_data")
   @Produces(JSON_UTF8)
   public List<Resource> resources_data(@QueryParam("category") String category) throws GeneralFailure {
     List<Resource> retVal = null;
      return impl.resources_data(category);
   }
   @POST @Path("resources_data")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public List<Resource> resources_data(ResourcesDataParams params) throws GeneralFailure {
     List<Resource> retVal = null;
      return impl.resources_data(category);
   }
   private static class RolesDataParams {
       private 	String 	category;
       public 	String 	getCategory() 				{ return category; }
       public 	void   	setCategory(String category) 		{ this.category = category; }
   }
   @GET @Path("roles_data")
   @Produces(JSON_UTF8)
   public List<Role> roles_data(@QueryParam("category") String category) throws GeneralFailure {
     List<Role> retVal = null;
      return impl.roles_data(category);
   }
   @POST @Path("roles_data")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public List<Role> roles_data(RolesDataParams params) throws GeneralFailure {
     List<Role> retVal = null;
      return impl.roles_data(category);
   }

   
	// CORS support OPTION methods
    @PermitAll @OPTIONS @Path("users_data")     public Response users_dataOptionsCORS()         { return getOKResponse(); }
    @PermitAll @OPTIONS @Path("sys_roles")  	public Response sys_rolesOptionsCORS()      	{ return getOKResponse(); }
    @PermitAll @OPTIONS @Path("sys_functions")  public Response sys_functionsOptionsCORS()      { return getOKResponse(); }
    @PermitAll @OPTIONS @Path("groups_data")    public Response groups_dataOptionsCORS()        { return getOKResponse(); }
    @PermitAll @OPTIONS @Path("resources_data") public Response resources_dataOptionsCORS()     { return getOKResponse(); }
    @PermitAll @OPTIONS @Path("roles_data")     public Response roles_dataOptionsCORS()         { return getOKResponse(); }
}
