package ru.spb.iac.cud.services.application;

import java.lang.reflect.Field;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.application.ContextApplicationManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.app.AppAccept;
import ru.spb.iac.cud.items.app.AppAttribute;
import ru.spb.iac.cud.services.CUDService;
import ru.spb.iac.cud.services.CUDServiceREST;

import javax.ws.rs.core.Response;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/app")
public class ApplicationServiceREST extends CUDServiceREST {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceREST.class);
	
	// use aggregation to reuse web service implementation class
	ApplicationServiceImpl impl;
	public ApplicationServiceREST() {
		//impl.serviceContext not accessible, so do injection manually
		final Class<CUDService> clsImpl = CUDService.class;
		try {			
			impl = new ApplicationServiceImpl();
			final Field fldServiceContext = clsImpl.getDeclaredField("serviceContext"); //getField("serviceContext"); //getDeclaredField("serviceContext");
			fldServiceContext.setAccessible(true);
			fldServiceContext.set(impl, serviceContext);
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}

	// Proxy methods
   private static class SystemRegistrationParams {
       private 	List<AppAttribute> 	attributes;
       public 	List<AppAttribute> 	getAttributes() 				{ return attributes; }
       public 	void   	setAttributes(List<AppAttribute> attributes) 		{ this.attributes = attributes; }
   }
   @GET @Path("system_registration")
   @Produces(JSON_UTF8)
   public AppAccept system_registration(@QueryParam("attributes") List<AppAttribute> attributes) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.system_registration(attributes);
   }
   @POST @Path("system_registration")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept system_registration(SystemRegistrationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.system_registration(params.attributes);
   }
   private static class UserRegistrationParams {
       private 	List<AppAttribute> 	attributes;
       public 	List<AppAttribute> 	getAttributes() 				{ return attributes; }
       public 	void   	setAttributes(List<AppAttribute> attributes) 		{ this.attributes = attributes; }
   }
   @GET @Path("user_registration")
   @Produces(JSON_UTF8)
   public AppAccept user_registration(@QueryParam("attributes") List<AppAttribute> attributes) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_registration(attributes);
   }
   @POST @Path("user_registration")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept user_registration(UserRegistrationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_registration(params.attributes);
   }
   private static class AccessRolesParams {
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	List<String> 	codesRoles;
       public 	List<String> 	getCodesRoles() 				{ return codesRoles; }
       public 	void   	setCodesRoles(List<String> codesRoles) 		{ this.codesRoles = codesRoles; }
   }
   @GET @Path("access_roles")
   @Produces(JSON_UTF8)
   public AppAccept access_roles(@QueryParam("modeExec") String modeExec,
						@QueryParam("uidUser") String uidUser,
						@QueryParam("codesRoles") List<String> codesRoles) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.access_roles(modeExec, uidUser, codesRoles);
   }
   @POST @Path("access_roles")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept access_roles(AccessRolesParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.access_roles(params.modeExec, params.uidUser, params.codesRoles);
   }
   private static class AccessGroupsParams {
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	List<String> 	codesGroups;
       public 	List<String> 	getCodesGroups() 				{ return codesGroups; }
       public 	void   	setCodesGroups(List<String> codesGroups) 		{ this.codesGroups = codesGroups; }
   }
   @GET @Path("access_groups")
   @Produces(JSON_UTF8)
   public AppAccept access_groups(@QueryParam("modeExec") String modeExec,
        @QueryParam("uidUser") String uidUser,
        @QueryParam("codesGroups") List<String> codesGroups) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.access_groups(modeExec, uidUser, codesGroups);
   }
   @POST @Path("access_groups")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept access_groups(AccessGroupsParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.access_groups(params.modeExec, params.uidUser, params.codesGroups);
   }
   private static class BlockParams {
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	String 	blockUser;
       public 	String 	getBlockUser() 				{ return blockUser; }
       public 	void   	setBlockUser(String blockUser) 		{ this.blockUser = blockUser; }
   }
   @GET @Path("block")
   @Produces(JSON_UTF8)
   public AppAccept block(@QueryParam("modeExec") String modeExec,
        @QueryParam("uidUser") String uidUser,
        @QueryParam("blockUser") String blockUser) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.block(modeExec, uidUser, blockUser);
   }
   @POST @Path("block")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept block(BlockParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.block(params.modeExec, params.uidUser, params.blockUser);
   }
   private static class SystemModificationParams {
       private 	List<AppAttribute> 	attributes;
       public 	List<AppAttribute> 	getAttributes() 				{ return attributes; }
       public 	void   	setAttributes(List<AppAttribute> attributes) 		{ this.attributes = attributes; }
   }
   @GET @Path("system_modification")
   @Produces(JSON_UTF8)
   public AppAccept system_modification(@QueryParam("attributes") List<AppAttribute> attributes) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.system_modification(attributes);
   }
   @POST @Path("system_modification")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept system_modification(SystemModificationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.system_modification(params.attributes);
   }
   private static class UserModificationParams {
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	List<AppAttribute> attributes;
       public 	List<AppAttribute> 	getAttributes() 				{ return attributes; }
       public 	void   	setAttributes(List<AppAttribute> attributes) 		{ this.attributes = attributes; }
    }
   @GET @Path("user_modification")
   @Produces(JSON_UTF8)
   public AppAccept user_modification(@QueryParam("uidUser") String uidUser,
        @QueryParam("attributes") List<AppAttribute> attributes) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_modification(uidUser, attributes);
   }
   @POST @Path("user_modification")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept user_modification(UserModificationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_modification(params.uidUser, params.attributes);
   }
   private static class UserIdentityModificationParams {
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	String 	login;
       public 	String 	getLogin() 				{ return login; }
       public 	void   	setLogin(String login) 		{ this.login = login; }
       private 	String 	password;
       public 	String 	getPassword() 				{ return password; }
       public 	void   	setPassword(String password) 		{ this.password = password; }
   }
   @GET @Path("user_identity_modification")
   @Produces(JSON_UTF8)
   public AppAccept user_identity_modification(@QueryParam("uidUser") String uidUser,
        @QueryParam("login") String login,
        @QueryParam("password") String password) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_identity_modification(uidUser, login, password);
   }
   @POST @Path("user_identity_modification")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept user_identity_modification(UserIdentityModificationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_identity_modification(params.uidUser, params.login, params.password);
   }
   private static class UserCertModificationParams {
       private 	String 	modeExec;
       public 	String 	getModeExec() 				{ return modeExec; }
       public 	void   	setModeExec(String modeExec) 		{ this.modeExec = modeExec; }
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	String 	certBase64;
       public 	String 	getCertBase64() 				{ return certBase64; }
       public 	void   	setCertBase64(String certBase64) 		{ this.certBase64 = certBase64; }
   }
   @GET @Path("user_cert_modification")
   @Produces(JSON_UTF8)
   public AppAccept user_cert_modification(@QueryParam("modeExec") String modeExec,
        @QueryParam("uidUser") String uidUser,
        @QueryParam("certBase64") String certBase64) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_cert_modification(modeExec, uidUser, certBase64);
   }
   @POST @Path("user_cert_modification")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AppAccept user_cert_modification(UserCertModificationParams params) throws GeneralFailure {
     AppAccept retVal = null;
      return impl.user_cert_modification(params.modeExec, params.uidUser, params.certBase64);
   }

	// CORS support OPTION methods
	@PermitAll @OPTIONS @Path("system_registration") 	public Response system_registrationOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("user_registration") 		public Response user_registrationOptionsCORS() 			{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("access_roles") 			public Response access_rolesOptionsCORS() 				{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("access_groups") 			public Response access_groupsOptionsCORS() 				{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("block") 					public Response blockOptionsCORS() 						{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("system_modification") 	public Response system_modificationOptionsCORS() 		{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("user_modification") 		public Response user_modificationOptionsCORS() 			{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("user_identity_modification") 	public Response user_identity_modificationOptionsCORS() 	{ return getOKResponse(); }
	@PermitAll @OPTIONS @Path("user_cert_modification") 		public Response user_cert_modificationOptionsCORS() 		{ return getOKResponse(); }

   
}