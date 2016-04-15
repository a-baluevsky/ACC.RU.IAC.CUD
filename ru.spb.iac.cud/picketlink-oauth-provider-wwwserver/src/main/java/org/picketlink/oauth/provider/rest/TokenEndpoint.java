

package org.picketlink.oauth.provider.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javaw.lang.Strings;
import javaw.util.Tuple;
import javaw.util.Tuple.T2;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.jwt.JWT;
import org.apache.oltu.oauth2.jwt.io.IDToken;
import org.apache.oltu.oauth2.jwt.io.JWTWriter;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.picketlink.oauth.provider.model.AuthenticationRequest;
import org.picketlink.oauth.provider.model.TokenInfoRequest;
import org.picketlink.oauth.provider.model.TokenInfoResponse;
import org.picketlink.oauth.provider.model.TokenRequest;
import org.picketlink.oauth.provider.model.TokenResponse;
import org.picketlink.oauth.provider.rest.interceptors.ProtectedByAccessToken;
import org.picketlink.oauth.provider.rest.interceptors.ProtectedByClientCredentials;
import org.picketlink.oauth.provider.services.OAuthRegister;
import org.picketlink.oauth.provider.services.OAuthTokenRequestBasicAuthorization;
import org.picketlink.oauth.provider.setup.RESTActivation;

import ru.spb.iac.cud.core.AccessManagerLocal;
import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.aml;
import ru.spb.iac.cud.core.oauth.ProtectedBy;
import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.Token.IAccessToken;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthCodeTokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthMethod;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthorizationCodeInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.ISetTokenTypeInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.core.oauth.TokenInfo.RefreshTokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

import org.picketlink.oauth.provider.model.AccessToken;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.oltu.oauth2.jwt.io.JWTUtil;

@Path("/token")
public class TokenEndpoint extends _Endpoint {
	@Context private HttpServletResponse response;
	private static final Logger LOGGER = LoggerFactory.getLogger(TokenEndpoint.class);	
	
	//@Inject private IdentityManager identityManager;
	@Inject private OAuthRegister oauthRegister;

    @PermitAll @OPTIONS public Response authorizeOpts(final AuthenticationRequest authcRequest) { return getOKResponse(); }	
	
    @ProtectedByClientCredentials @POST
    @Consumes(RESTActivation.MediaFORM_URLENCODED) @Produces(RESTActivation.MediaJSON)
    public Response authorizeForm(@Context HttpServletRequest request) throws OAuthSystemException, OAuthProblemException, GeneralFailure {
    	OAuthTokenRequestBasicAuthorization oauthRequest = new OAuthTokenRequestBasicAuthorization(request);
    	TokenRequest tokenRequest = new TokenRequest(oauthRequest);
    	TokenResponse tokenResponse = authorize(tokenRequest);
        return getResp(OAuthASResponse.tokenResponse(HttpServletResponse.SC_OK)
                .setAccessToken(tokenResponse.getAccess_token())
                //.setTokenType("Bearer")
                .setExpiresIn(tokenResponse.getExpires_in())
                .buildJSONMessage());
    } // authorize
    
	@POST @ProtectedByClientCredentials
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)	
	public TokenResponse authorize(TokenRequest tokenRequest) throws GeneralFailure
    {
    	TokenResponse tokenResponse = new TokenResponse(response);
		AuthorizationCodeInfo authCodeInfo = null; String refresh_token = null;
		GrantType grant_type = getGrantType(tokenRequest.getGrant_type());
		Token<?> issuedToken = null;
		AccessTokenType token_type = null;
		String tknScope = null;
		String tt = null;
		try {
			tt = tokenRequest.getToken_type();
			token_type = AccessTokenType.valueOf_(tt);
		    switch(grant_type) { 
	        	case AUTHORIZATION_CODE:
					final String code = tokenRequest.getCode();
					Token.AuthorizationCode authCode = oauthRegister.getAuthorizationCode(code);
	        		if(authCode == null) {
	        			LOGGER.error("invalid AUTHORIZATION_CODE: "+code);
	        			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.invalid_grant);
	        		}
	        		else try {
	        			authCodeInfo = authCode.getTokenInfo();
	        			tknScope = authCodeInfo.scope;
	        			final TokenInfo.AuthCodeTokenInfo tokenInfo = new TokenInfo.AuthCodeTokenInfo(Token.DefaultTokenLifeTime, 
	        					authCodeInfo.client_id, authCodeInfo.userLogin, authCode.getTokenId(), authCode, tknScope);
	        			tokenInfo.amr = authCodeInfo.amr;
						issuedToken = oauthRegister.issueAccessToken(tokenInfo, token_type);
	        		} catch(Exception e) {
	        			LOGGER.error("Failed processing grant_type: "+e.getMessage());
	        			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.server_error);	    			
	        		}
	        		break;
	        	case PASSWORD:
	        		// obtain permission (scope) from oauthRegister
	        		tknScope = "openid";
	        		if(!aml().isValidLoginPassword(tokenRequest.getUsername(), tokenRequest.getPassword())) {
	        			LOGGER.error("invalid username or password for user: "+tokenRequest.getUsername());
	        			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.invalid_grant);
	        		} else try {
						final TokenInfo.UserTokenInfo tokenInfo = new TokenInfo.UserTokenInfo(Token.DefaultTokenLifeTime, 
	        					tokenRequest.getClient_id(), tokenRequest.getUsername(), tknScope);
						tokenInfo.amr = AuthMethod.PWD;
						issuedToken = oauthRegister.issueAccessToken(tokenInfo, token_type);
					} catch(Exception e) {
	        			LOGGER.error("Failed processing grant_type: "+e.getMessage());
	        			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.server_error);	    			
	        		}
	        		break;
	        	case CLIENT_CREDENTIALS: 
	        		tknScope = "defaultClientAppScope";
	        		// @ProtectedByClientCredentials (and checkClientApp) has already checked the CREDENTIALS, may perform additional checks
					final TokenInfo.ClientAppTokenInfo tokenInfo = new TokenInfo.ClientAppTokenInfo(Token.DefaultTokenLifeTime, 
							tokenRequest.getClient_id(), tknScope);
					tokenInfo.amr = AuthMethod.PWD; // client secret?
					issuedToken = oauthRegister.issueAccessToken(tokenInfo, token_type);
	        		break;        		
	        	case REFRESH_TOKEN:
					final String refrtokenId = tokenRequest.getRefresh_token();
					final Token<RefreshTokenInfo> refreshToken = oauthRegister.getRefreshToken(refrtokenId);
					if(refreshToken==null) {
						LOGGER.error("invalid refresh token: "+refrtokenId);
						OAPE.TokenException.throwIt(OAuthProviderExceptionCode.invalid_grant);
					}
					else {
	        			refresh_token = refrtokenId;
						final RefreshTokenInfo refrTknInfo = refreshToken.getTokenInfo();
						tknScope = refrTknInfo.scope;
						final Token<?> origin = refrTknInfo.origin;						
						if(origin!=null) {							
							final TokenInfo ti = origin.getTokenInfo();
							if(tknScope == null)
								tknScope = ti.scope;
							TokenInfo ti2 = ti;
							if(ti2 instanceof TokenInfo.AuthCodeTokenInfo) {
								ti2 = ti.origin.getTokenInfo();
							}
							if(ti2 instanceof TokenInfo.AuthorizationCodeInfo)
								authCodeInfo = (AuthorizationCodeInfo)ti2;
							RefreshTokenInfo newRefrTknInfo = new TokenInfo.RefreshTokenInfo(Token.DefaultTokenLifeTime, tokenRequest.getClient_id(), origin, refrtokenId, tknScope);
							issuedToken = oauthRegister.issueAccessToken(ti, token_type);
							//issuedToken = oauthRegister.issueToken(new TokenInfo.RefreshTokenInfo(Token.DefaultTokenLifeTime, 
							//		tokenRequest.getClient_id(), origin, refrtokenId, tknScope));	
							
						}				
		        	}
	        		break;
				default:
					LOGGER.error("unsupported grant type: "+tokenRequest.getGrant_type());
					OAPE.TokenException.throwIt(OAuthProviderExceptionCode.unsupported_grant_type);
	        }			
		} catch (InvalidTokenException e) {
			LOGGER.error("InvalidTokenException: for "+tt);
			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.invalid_token);
		}
		
        if(issuedToken!=null) {        	
        	//if(AccessTokenType.JWT.equals(token_type)) // always issue ID Token, even for bearer query
        		if(authCodeInfo!=null) {
		        	final boolean isOpenId = (tknScope!=null) && tknScope.contains("openid");
		 			if(isOpenId) {	 				
						final IDToken idToken = new IDToken(aml().getUserIdByLogin(authCodeInfo.userLogin).toString(),
								tokenRequest.getClient_id(), Token.DefaultTokenLifeTime, authCodeInfo.auth_time, authCodeInfo.state);
						tokenResponse = new TokenResponse.TokenResponseWithIdToken(tokenResponse, IDToken.toJWT(idToken, null));
						//tokenResponse.setId_token(IDToken.toJWT(idToken, null));
					} else {
						LOGGER.error("NO_PERMISSION_TO_GET_ATTRIBUTES: openid MUST be in SCOPE to get attributes in JWT");
						OAPE.TokenException.throwIt(OAuthProviderExceptionCode.insufficient_scope_openid);
					} 
        		}
       	
        	if(issuedToken instanceof TokenInfo.IGetTokenTypeInfo)
        		tokenResponse.setToken((TokenInfo.IGetTokenTypeInfo<?,?>)issuedToken);
        	else
        		tokenResponse.setToken(issuedToken);
	        //if(refresh_token==null) // always issue new refresh_token
	        	try {
					refresh_token = oauthRegister.issueToken(new RefreshTokenInfo(Token.DefaultTokenLifeTime, tokenRequest.getClient_id(), 
							issuedToken, OAuthRegister.oauthMD5Issuer.refreshToken(), issuedToken.getTokenInfo().scope)).getTokenId();
				}
				catch (OAuthSystemException e) {
					LOGGER.error("Failed getting refresh_token! "+e.toString());
					OAPE.TokenException.throwIt(OAuthProviderExceptionCode.server_error);
				}	        	

	        tokenResponse.setRefresh_token(refresh_token);
	        tokenResponse.setToken_type(token_type.toString());        	
        } else {
        	LOGGER.error("Failed issuing token");
        	
        }
        return tokenResponse;
	}

	private GrantType getGrantType(String grant_type) {
		try {
			return GrantType.valueOf(grant_type.toUpperCase());
		} catch (Exception e) {
			return null;
		}
	}
	
    private Response getErrResp(int errResponse, String errTxt, String errDescription) throws OAuthSystemException {
		final OAuthResponse response =
		    OAuthASResponse.errorResponse(errResponse)
		        .setError(errTxt).setErrorDescription(errDescription)
		        .buildJSONMessage();
		return getResp(response);    	
    }

	private Response getResp(final OAuthResponse response) {
		return Response.status(response.getResponseStatus()).entity(response.getBody()).build();
	}
	
	
	/*
	 TODO:  Make Interceptor fill this:
	 		ti.setError("invalid_access_token");
    		ti.setError_description("Invalid or missing access_token");
	 */
	
	@ProtectedByAccessToken(Token.IUserAccessToken.class)
	@POST @Path("UserInfo")
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)
	//@Context HttpServletRequest svrRequest
    public TokenInfoResponse userTokenInfo(@Context Token.IUserAccessToken accessToken, TokenInfoRequest tokenInfoRequest) // TokenInfoRequest implements ISetTokenTypeInfo
    throws InvalidTokenException, GeneralFailure {		
		return getTokenInfo(accessToken, tokenInfoRequest.getInfoType());
	}	
	
	@ProtectedByAccessToken(Token.IAccessToken.class)
	@POST @Path("info")
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)
	//@Context HttpServletRequest svrRequest
    public TokenInfoResponse tokenInfo(@Context Token.IAccessToken accessToken, TokenInfoRequest tokenInfoRequest)
    throws InvalidTokenException, GeneralFailure {
		return getTokenInfo(accessToken, tokenInfoRequest.getInfoType());
	}
	
    private static TokenInfoResponse getJWT(Map<String, String> mapJWTAttrs) throws GeneralFailure {
		// treat this as salt; so each time a different JWT string is issued,
		// even if its payload is identical.
		final JWT jwt;
		if((jwt=JWTUtil.createJWT(mapJWTAttrs))!=null) {
			final TokenInfoResponse.JWT ti = new TokenInfoResponse.JWT();
			ti.setToken_info(JWTUtil.writeJWT(jwt));
			ti.setToken_info_type("jwt");
			return ti;
		} else {
			LOGGER.error("SERVER_ERROR: Error creating JWT");
			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.server_error);
		}
		return null; // never happen
	}
    
	private static TokenInfoResponse getTokenInfo(IAccessToken<?> accessToken, String infoType) throws GeneralFailure {
    	if("jwt".equalsIgnoreCase(infoType)) {    		
    		if(AccessTokenType.BEARER.equals(accessToken.getTokenType())) {
    			accessToken = AccessToken.newJWT(accessToken.getTokenId(), accessToken.getTokenInfo()); // convert Bearer to JWT to get JWT attrs
    		}
			final TokenInfoResponse.JWT ti = new TokenInfoResponse.JWT();
			ti.setToken_info(accessToken.getTokenString());
			ti.setToken_info_type(infoType);
			return ti;    		
    		//Map<String, String> info = AccessToken.getAttributes(accessToken);
    		//return getJWT(info);
    	} else if("json".equalsIgnoreCase(infoType)) {
    		//if(AccessTokenType.JWT.equals(accessToken.getTokenType()))
    		//	accessToken = AccessToken.newBearerToken(accessToken.getTokenId(), accessToken.getTokenInfo()); // convert Bearer to JWT to  filter out JWT attrs    		
    		Map<String, String> info = AccessToken.getAttributes(accessToken);
    		if(AccessTokenType.JWT.equals(accessToken.getTokenType()))
    			info = filterJSONAttrs(info);
    		final TokenInfoResponse.JSON ti = new TokenInfoResponse.JSON();
    		try {
				ti.setToken_info(info);
				ti.setToken_info_type("json");
				return ti;	
			} catch (Exception e) {
				LOGGER.error("jackson_error: "+e.toString());
				OAPE.TokenException.throwIt(OAuthProviderExceptionCode.server_error);
			}    		
		} else {
			LOGGER.error("invalid_token_info_type: Unsupported/missing token info type: "+infoType);
			OAPE.TokenException.throwIt(OAuthProviderExceptionCode.unsupported_token_info_type);
		}
		return null; // never happen
	}

	private static Map<String, String> filterJSONAttrs(Map<String, String> attributes) {
		Map<String, String> fltAttrs = new HashMap<String, String>();
		for (Entry<String, String>  e : attributes.entrySet())
			switch(e.getKey().length()) {
				//case "iat": ""
			case 3:
				break;
			default:
				fltAttrs.put(e.getKey(), e.getValue());	
			}
		return fltAttrs;
	}

}