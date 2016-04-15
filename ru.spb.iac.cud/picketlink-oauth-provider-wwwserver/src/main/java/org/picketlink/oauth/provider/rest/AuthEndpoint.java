package org.picketlink.oauth.provider.rest;

import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.aml;
import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.idpUtil;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javaw.lang.Strings;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.picketlink.Identity;
import org.picketlink.credential.DefaultLoginCredentials;
import org.picketlink.idm.IdentityManagementException;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.basic.User;
import org.picketlink.oauth.provider.model.AuthenticationRequest;
import org.picketlink.oauth.provider.model.AuthenticationResponse;
import org.picketlink.oauth.provider.model.AuthorizationResponse;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.picketlink.oauth.provider.services.ClientAppManager;
import org.picketlink.oauth.provider.services.OAuthRegister;
import org.picketlink.oauth.provider.setup.RESTActivation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthCodeTokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthMethod;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthorizationCodeInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

@Stateless
@Path("/auth")
public class AuthEndpoint extends _Endpoint {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthEndpoint.class);	
    
    @Inject private OAuthRegister oauthRegister;
    @Inject private Identity 	identity;
    @Inject private IdentityManager identityManager;
    @Inject private DefaultLoginCredentials credential;
    @Context ServletContext servletContext;
    @Context HttpServletRequest httpServletRequest;
    @Context private HttpServletResponse response;
    @Context UriInfo uriInfo;
    
    private PageTemplate pageTemplate;
    
    public PageTemplate getPageTemplate() {
    	if(pageTemplate==null)
    		pageTemplate = new PageTemplate(uriInfo, servletContext);
		return pageTemplate;
	}
    
    public URI getUrlScope() { return getPageTemplate().uri("auth/scope"); } // scope approval form   
    public URI getUrlLogin() { return getPageTemplate().uri("auth/login"); } // login form
    
    @GET @PermitAll @Produces(RESTActivation.MediaHTML)
    public Response auth(final @Context HttpServletRequest request)
    throws URISyntaxException {
		return getPageTemplate().sendFramedRedirect("paaaframe", identity.isLoggedIn()?"/auth/scope":"/auth/login", request.getQueryString()); 	
    }
    
    @PermitAll @GET @Path("login") @Produces(RESTActivation.MediaHTML)
    public Response loginPage(final @Context HttpServletRequest request) {
    	if(identity.isLoggedIn()) identity.logout(); // .. or goto switchuser page?
    	return getPageTemplate().sendWebTemplate("loginuser"); 
    }
    
    private void importPicketLinkUserByPAAACreds(String login, String password) {
		if(aml().isValidLoginPassword(login, password)) {
	        try {
	        	User newUser = new User(login);
	        	identityManager.add(newUser);
	        	identityManager.updateCredential(newUser, new Password(password));
	        }
	        catch(IdentityManagementException exIDM) {
	        	LOGGER.error(exIDM.toString());
	        }
		}
	}
    

    @PermitAll @OPTIONS @Path("login") public Response loginOpts(@Context HttpServletRequest request) { return getOKResponse(); }

    
    @PermitAll @POST @Path("login")
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)
    public AuthenticationResponse login(final AuthenticationRequest authcRequest) {
    	//LOGGER.info("identity +> "+javaw.util.reflection.ClassInfo.getClassFileLocation(this.identity));
    	
        if (this.identity.isLoggedIn()) 
        	//return createLoginResponse(authcRequest);
        	identity.logout();
        
        final String userLogin = authcRequest.getUserId();
        final String userPassword = authcRequest.getPassword();
        
        importPicketLinkUserByPAAACreds(userLogin, userPassword);
       
		this.credential.setUserId(userLogin);        
		this.credential.setCredential(new Password(userPassword));

        this.identity.login();

        return createLoginResponse(authcRequest);
    }

    private AuthenticationResponse createLoginResponse(final AuthenticationRequest authcRequest) {
        AuthenticationResponse response = new AuthenticationResponse(this.response);

        response.setUserId(authcRequest.getUserId());
        response.setLoggedIn(this.identity.isLoggedIn());

        if (response.isLoggedIn()) {
            //response.setToken(this.identity.getUserContext().getSession().getId().getId().toString());
            response.setToken(httpServletRequest.getSession().getId());
        }

        return response;
    }    
    
    
    private static final String[] paramsScopeApprove = {"client_name", 
    	OAuth.OAUTH_CLIENT_ID, OAuth.OAUTH_REDIRECT_URI,
    	OAuth.OAUTH_RESPONSE_TYPE, OAuth.OAUTH_STATE, OAuth.OAUTH_SCOPE }; 

    private static final String[] paramsError = { "error", "error_description" };
    
    @PermitAll @OPTIONS @Path("scope") public Response scopeOpts(@Context HttpServletRequest request) { return getOptionsCORSResponse(null, "Auth-Token, JSESSIONID"); }
    
    @PermitAll @GET @Path("scope")
    @Produces(RESTActivation.MediaHTML)
    public Response scopeApprovePage(final @Context HttpServletRequest request) {
    	LOGGER.info("scopeApprovePage: 10");
    	final Response.ResponseBuilder responseBuilder = Response.status(HttpServletResponse.SC_OK);
    	final Map<String, String> scopeParams = fetchScopeParams(request);
    	final Map<String, String> paramErrors; 
		if(!identity.isLoggedIn()) {
			LOGGER.info("scopeApprovePage: 20");
	    	responseBuilder.location(getUrlLogin());
		} else if((paramErrors = checkScopeParams(scopeParams))!=null) {
			LOGGER.info("scopeApprovePage: 30");
			getPageTemplate().sendWebTemplate(responseBuilder, "scopeparamerror", new PageTemplate.TokenReplacer(paramErrors));
		}    		
    	else {
    		LOGGER.info("scopeApprovePage: 40");
    		final boolean isFramed = request.getParameter("framed")!=null;
    		scopeParams.put("form_target", isFramed? " target='_parent' ":" target='_self'");
    		boolean approved = isAppScopeApproved(scopeParams.get(OAuth.OAUTH_CLIENT_ID), scopeParams);
    		if(approved) {
    			LOGGER.info("scopeApprovePage: 50");
    			AuthorizationRequest authzRq = new AuthorizationRequest();
    			authzRq.setClient_id(scopeParams.get("client_id"));
    			final String response_type = scopeParams.get("response_type");
				authzRq.setResponse_type(response_type);
    			authzRq.setScope(scopeParams.get("scope"));
    			authzRq.setState(scopeParams.get("state"));
    			if("code".equals(response_type))
				try {
					LOGGER.info("scopeApprovePage: 60");
					final AuthorizationResponse.AuthorizationCodeResponse scopeAuthResult = 
							(AuthorizationResponse.AuthorizationCodeResponse)scopeAuthorize(authzRq);
					scopeParams.put("code", scopeAuthResult.getCode());
					//scopeParams.put("auth_tkn", scopeAuthResult.getAccessToken());
				} catch (GeneralFailure e) {
					LOGGER.info("scopeApprovePage: 70");
					approved = false; 
				}
        	}
    		LOGGER.info("scopeApprovePage: 80");
    		getPageTemplate().sendWebTemplate(responseBuilder, approved? "frameredirect": "scopeapprove", new PageTemplate.TokenReplacer(scopeParams));
    	}
		LOGGER.info("scopeApprovePage: 100");
    	return responseBuilder.build(); 
    }

    @Inject private ClientAppManager clientAppManager;
    private boolean isAppScopeApproved(String clientAppId, Map<String, String> scopeParams) {
		try {
			LOGGER.info("isAppScopeApproved: 10");
			//return aml.is_exist(clientAppId) && !idpUtil.systemSignReq(clientAppId);
			if(aml().is_exist(clientAppId) && !idpUtil().systemSignReq(clientAppId)) {
				LOGGER.info("isAppScopeApproved: 20");
				if(!this.clientAppManager.existsApp(clientAppId)) {
					LOGGER.info("isAppScopeApproved: 30");
					String owner = "cud";
					String appURL = scopeParams.get(OAuth.OAUTH_REDIRECT_URI);
					LOGGER.info("isAppScopeApproved: 40: "+clientAppId+", "+appURL);
					this.clientAppManager.create(clientAppId, appURL, owner, clientAppId, clientAppId);
				}
				return true;
			} else {
				LOGGER.info("isAppScopeApproved: 30");
				return false;
			}
		} catch (Exception e) {
			LOGGER.info("isAppScopeApproved: 80");
			LOGGER.error("isAppScopeApproved for clientApp:"+clientAppId+": "+e.getMessage());
			return false;
		}
	}

	@PermitAll @POST @Path("scope")    
    @Consumes(RESTActivation.MediaJSON)    @Produces(RESTActivation.MediaJSON)    
    public AuthorizationResponse scopeAuthorize(final AuthorizationRequest request) throws GeneralFailure {
		if(!identity.isLoggedIn())
			OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.access_denied);
    	else {  checkScopeParams(request);
				try {
					User usr = (User)identity.getAccount(); //identity.getAccount().getAttribute("userId").getValue().toString()
					return createResponseScopeAuthorize(request, usr.getLoginName()); //
				} catch (Exception e) { //OAuthSystem
					OAPE.AuthorizationException.throwIt(e.getMessage());
				}    	
    	}
		return null; // never get here
    }

	private void checkScopeParams(AuthorizationRequest request) throws GeneralFailure {
		final ResponseType response_type = ResponseType.valueOf(request.getResponse_type().toUpperCase());
		String[] arrChk = {request.getState(), request.getScope(), request.getClient_id()};
		for(String s: arrChk)
			if(Strings.isNullOrEmptyTrim(s))
				OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.invalid_request);
		if(!ResponseType.CODE.equals(response_type) 
				&& !ResponseType.TOKEN.equals(response_type))
			OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.invalid_request);
		// TODO: force analyzing values
	}

	private AuthorizationResponse createResponseScopeAuthorize(AuthorizationRequest authrRequest, String userId) throws GeneralFailure {
		//return createResponseScopeAuthorize(errorCode.temporarily_unavailable); // DEBUG: simulate error
		AuthorizationResponse authresp = null;
		//OAuthIssuerImpl oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());		
		final ResponseType respType = ResponseType.valueOf(authrRequest.getResponse_type().toUpperCase());
		if(!ResponseType.CODE.equals(respType) && !ResponseType.TOKEN.equals(respType)) {
			LOGGER.error("Invalid response type: "+respType);
			OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.unsupported_response_type);
		} else try {			
			final TokenInfo.AuthorizationCodeInfo tokenInfo = new TokenInfo.AuthorizationCodeInfo(Token.DefaultTokenLifeTime, 
					authrRequest.getClient_id(), userId, authrRequest.getState(), authrRequest.getScope());
			tokenInfo.amr = AuthMethod.PWD; // assume now PWD
			final Token<AuthorizationCodeInfo> 
			newAuthCode = oauthRegister.issueToken(tokenInfo);			
			switch(respType) { 
			case CODE:
				authresp = new AuthorizationResponse.AuthorizationCodeResponse(this.response, authrRequest.getState(), newAuthCode.getTokenId());
				break; 
			case TOKEN: 
				// TODO: debug this use-case
				final Token<AuthCodeTokenInfo> 
				newAccessToken = oauthRegister.issueToken(new TokenInfo.AuthCodeTokenInfo(Token.DefaultTokenLifeTime, 
									authrRequest.getClient_id(), userId, 
									newAuthCode.getTokenId(), newAuthCode, "openid"));				
				authresp = new AuthorizationResponse.AuthorizationAccessTokenResponse(this.response, authrRequest.getState(), newAccessToken);
				break; 
			}
		} catch(Exception x) {
			OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.server_error);
		}
		return authresp;
	}


	private Map<String, String> fetchScopeParams(final HttpServletRequest request) {
		final Map<String, String[]> parMap = request.getParameterMap();
		final Map<String, String> scopeParams = PageTemplate.filterMultivaluedMap(parMap, new HashMap<String, String>(), paramsScopeApprove);
		if(parMap.containsKey("error"))
			PageTemplate.filterMultivaluedMap(parMap, scopeParams, paramsError);
		return scopeParams;
	}
    
    private Map<String, String> checkScopeParams(final Map<String, String> scopeParams) {
    	final Map<String, String> result = new HashMap<String, String>();
    	final String bad = "red", good = "green", missing = "missing"; 
    	String error = scopeParams.get("error");    	
    	String error_description = scopeParams.get("error_description");
		boolean hasErrors = error!=null; //scopeParams.containsKey("error");
		for(String pn: paramsScopeApprove) {
			final String tkName = pn;
			final String tkColor = (new StringBuilder("color_")).append(pn).toString();
			if(!scopeParams.containsKey(pn) 
			   || Strings.isNullOrEmptyTrim(scopeParams.get(pn)) ) {
				result.put(tkColor, bad);
				result.put(tkName, missing);
				if(Strings.isNullOrEmptyTrim(error)) {
					final OAuthProviderExceptionCode invalid_request = OAuthProviderExceptionCode.invalid_request;
					error = invalid_request.toString();
					error_description = invalid_request.getDescription();
				}
				hasErrors = true;
			}  // else if() {} // additional checks 
			else {
				result.put(tkColor, good);
				result.put(tkName, scopeParams.get(pn));
			}
		}
		if(hasErrors) {			
			if(Strings.isNullOrEmptyTrim(error) || Strings.isNullOrEmptyTrim(error_description)) {
				final OAuthProviderExceptionCode serverError = OAuthProviderExceptionCode.server_error;
				error = serverError.toString();	
				error_description = serverError.getDescription();				
			}
			result.put("error", error);	
			result.put("error_description", error_description);			
			return result;
		} else
			return null;
	}    
}
