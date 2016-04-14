package org.picketlink.oauth.provider.rest;

//import static org.picketlink.oauth.provider.rest.PageTemplate.filterMultivaluedMap;
//import static org.picketlink.oauth.provider.rest.PageTemplate.sendWebTemplate;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javaw.lang.Strings;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import javax.ws.rs.core.UriInfo;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import ru.spb.iac.cud.core.oauth.BasicAuthorization;
import ru.spb.iac.cud.core.oauth.ProtectedBy;
import ru.spb.iac.cud.exceptions.GeneralFailure;
//import ru.spb.iac.cud.core.oauth.Token.AbstractAccessToken.AccessTokenSubjectType;
import static ru.spb.iac.cud.core.oauth.Token.AbstractAccessToken.AccessTokenSubjectType.*;

import org.picketlink.oauth.provider.model.AuthenticationRequest;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException;
import org.picketlink.oauth.provider.services.ClientApp;
import org.picketlink.oauth.provider.services.ClientAppManager;
import org.picketlink.oauth.provider.services.FileServer;
import org.picketlink.oauth.provider.services.OAuthRegister;
import org.picketlink.oauth.provider.setup.RESTActivation;



@Stateless
@Path("/test")
@TransactionAttribute
public class TestEndpoint extends _Endpoint {
	public static final String RESOURCE_SERVER_NAME = "Example OAuth Resource Server";
	@Inject private OAuthRegister database;
	
	//@Inject private OAuthRegister database;
	//@Inject private TestClientData testClientData;
	@Inject private ClientAppManager clientAppManager;
	
	private static final String chkState = "123", clientAppBaseURL = "http://cuddevelop1:8080/picketlink-oauth-provider-wwwserver/test",
			clientAppName = "Тестовый запрос", clientID = "c1808c21-a72b-4faa-8a74-42c2f7ad6129", clientSecret = "TestClientAppSecret",
			clientAppURL = "/picketlink-oauth-provider-wwwserver/test/oauth_callback";
	
	@Context ServletContext servletContext;
	@Context UriInfo uriInfo;
	
		
	@GET @Produces(RESTActivation.MediaHTML)
	public Response test() {
		StringBuilder sb = watchGetters(servletContext, new StringBuilder());
		sb.append("<hr><p>uriInfo:</p>");
		watchGetters(uriInfo, sb);
		return Response.status(Response.Status.OK).entity(sb.toString()).build();
		//return Response.ok(sb.toString()).build(); 
		
		//return sendWebTemplate("test", 
		//		new PageTemplate.TokenReplacer(fillTestAppParams(new HashMap<String, String>())));
	}

	// TODO: javaw.util.reflection
	private StringBuilder watchGetters(Object o, StringBuilder sb) throws SecurityException {
		final Class<?> clsO = o.getClass();
		for(Method m: clsO.getMethods()) {
			final String methName = m.getName();
			if(methName.startsWith("get") && m.getParameterTypes().length==0)
				try {
					sb.append(methName).append(": ").append(m.invoke(o).toString()).append("<br>");
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		return sb;
	}
	
	/*
    @GET
    @Path("oauth_callback")	
	public Response oauth_callback(@Context HttpServletRequest request) {
    	String page = "oauth_response_fail";
    	final Map<String, String> mpParams = filterMultivaluedMap(
    			request.getParameterMap(), 
    			new HashMap<String, String>(), 
    			new String[] {"code", "state", "error", "error_description"});
    	if(!Strings.isNullOrEmpty(mpParams.get("error"))) {
    		
    	} else if(!chkState.equals(mpParams.get("state"))) {
    		mpParams.put("error", "invalid_state");
    		mpParams.put("error_description", "Security state check against hacking request failed!");
    	} else if(Strings.isNullOrEmpty(mpParams.get("code"))) {
    		mpParams.put("error", "invalid_code");
    		mpParams.put("error_description", "No authorization code received!");    		
    	}
    	else {
			registerTestClientApp();
			mpParams.put("client_id", clientID);
			mpParams.put("authorization", BasicAuthorization.createHeader(clientID, clientSecret));
    		page = "oauth_response_ok";   		
    	}
		return sendWebTemplate(page, new PageTemplate.TokenReplacer(fillTestAppParams(mpParams)));
    }
	 */
	
    @PermitAll @OPTIONS @Path("resource") public Response resourceOpts(@Context HttpServletRequest request) { return getOKResponse(); }
    
    @GET @Path("resource") @ProtectedBy.AccessToken(UserAccessToken) 
    public Response userProtectedResource(@Context HttpServletRequest request) 
    throws OAuthSystemException {
    	return Response.status(Response.Status.OK).entity("User got protectedResource at TestEndpoint!").build();
    }
    
    @PermitAll @OPTIONS @Path("secured_app_method") public Response secured_app_methodOpts(@Context HttpServletRequest request) { return getOKResponse();}
    
    @GET @Path("secured_app_method") @ProtectedBy.AccessToken(ClientAppAccessToken)
    public Response clientAppProtectedResource(@Context HttpServletRequest request) 
    throws OAuthSystemException {
    	return Response.status(Response.Status.OK).entity("ClientApp got protectedResource at TestEndpoint!").build();
    }

    @PermitAll @GET @Path("exception/{exception}")
    @Produces(RESTActivation.MediaJSON)
	public Response testExceptionGET(@PathParam("exception") String exceptionId, @QueryParam("error_description") String error_description) throws GeneralFailure {
    	if(Strings.isNullOrEmptyTrim(error_description)) error_description = "TestEndpoint: testException";
		OAuthProviderException.OAPE oape = OAuthProviderException.OAPE.valueOf(exceptionId);		
		oape.throwIt(error_description);
		return Response.status(Response.Status.SERVICE_UNAVAILABLE).entity("exception test failed!").build();
	}

	@PermitAll @POST @Path("exception/{exception}")
    @Consumes(RESTActivation.MediaJSON)    @Produces(RESTActivation.MediaJSON)
	public Response testExceptionPOST(@PathParam("exception") String exceptionId) throws GeneralFailure {
		OAuthProviderException.OAPE oape = OAuthProviderException.OAPE.valueOf(exceptionId);
		oape.throwIt("TestEndpoint: testException");
		return Response.status(Response.Status.SERVICE_UNAVAILABLE).entity("exception test failed!").build();
	}
	
    
    private static Map<String, String> fillTestAppParams(Map<String, String> mpParams) {
    	mpParams.put("client_id", 	clientID);
    	mpParams.put("client_name", clientAppName);
    	mpParams.put("redirect_uri", clientAppURL);
    	mpParams.put("client_secret", clientSecret);
    	mpParams.put("state", String.valueOf(25+(new Random().nextInt(10000))));
		return mpParams;
	}
    
    //@Inject  private Identity identity;
	private String getLoggedUserId() {
        //User user = (User) identity.getAccount();
		return "admin"; //"9fd60149-29a9-45b0-bbb3-eb0ef474d3d8"; //  //user.getLoginName();
	}
	/*
// do not remove these imports
import javax.inject.Inject;
import org.picketlink.Identity;
import org.picketlink.idm.model.basic.User;
import javax.ws.rs.DefaultValue;
import javax.servlet.http.HttpServletResponse;
import org.picketlink.idm.IdentityManager;
import org.picketlink.oauth.provider.model.ClientApp;
	 */
    
    //@Inject  private IdentityManager identityManager;	
	private void registerTestClientApp() {
		if(!clientAppManager.existsApp(clientID)) {
	        ClientApp oauthApp = clientAppManager.create(clientID, clientAppBaseURL, getLoggedUserId(), clientID, clientSecret);
	        oauthApp.setEnabled(true);
		}
	}
	
}
