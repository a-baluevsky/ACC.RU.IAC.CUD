/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.picketlink.oauth.provider.rest.interceptors;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javaw.util.PassBy;
import javaw.util.Tuple;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;
import org.picketlink.Identity;
import org.picketlink.oauth.provider.model.AccessToken;
import org.picketlink.oauth.provider.model.AuthenticationResponse;
import org.picketlink.oauth.provider.model.ClientAppAuth;
import org.picketlink.oauth.provider.model.RefreshToken;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.picketlink.oauth.provider.rest.AccountRegistrationEndpoint;
import org.picketlink.oauth.provider.rest.AuthEndpoint;
import org.picketlink.oauth.provider.rest.CheckUserNameEndpoint;
import org.picketlink.oauth.provider.rest.LogoutEndpoint;
import org.picketlink.oauth.provider.rest.SignInEndpoint;
import org.picketlink.oauth.provider.rest.UserInfoEndpoint;
import org.picketlink.oauth.provider.services.FileServer;
import org.picketlink.oauth.provider.services.OAuthRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.BasicAuthorization;
import ru.spb.iac.cud.core.oauth.ProtectedBy;
import ru.spb.iac.cud.core.oauth.SecurityCheck;
import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.Token.IAccessToken;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;

/**
 * <p>
 * Implementation of {@link PreProcessInterceptor} that checks the existence of the authentication token before invoking the
 * destination endpoint.
 * </p>
 * <p>
 * If the token is valid, the {@link org.picketlink.Identity} will restored with the all user information.
 * </p>
 *
 * @author <a href="mailto:psilva@redhat.com">Pedro Silva</a>, AB
 *
 */
//@ApplicationScoped
@ServerInterceptor
public class SecurityInterceptor extends org.jboss.resteasy.plugins.interceptors.SecurityInterceptor { 
//implements PreProcessInterceptor {
	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityInterceptor.class);
	
    private static final String AUTH_TOKEN_HEADER_NAME = "Auth-Token";
    @Inject private OAuthRegister oauthRegister;
    
    //private PicketBoxIdentity identity;
    @Inject private Identity identity;

    @Context
    private HttpServletRequest httpServletRequest;

    /*
     * (non-Javadoc)
     *
     * @see org.jboss.resteasy.spi.interception.PreProcessInterceptor#preProcess(org.jboss.resteasy.spi.HttpRequest,
     * org.jboss.resteasy.core.ResourceMethod)
     */
    @Override
    
    public ServerResponse preProcess(HttpRequest request, ResourceMethod method) throws Failure, WebApplicationException {
        //HttpSession session = httpServletRequest.getSession();
        //ServerResponse response = null;
        boolean isAllowed = false;
        final PassBy.reference<ProtectedByAccessToken> 	refProtByAccTknPost = PassBy.reference(null); // post-process: Around-invoke interceptor
        final PassBy.reference<ProtectedBy.AccessToken> refProtByAccTknPre  = PassBy.reference(null); // pre-process: SecurityInterceptor-only (put Context-only)
        final Class<? extends IAccessToken<? extends TokenInfo>> accessTokenSubjectType;
        if(protectedByClientCredentials(method)) {
        	// This step: we only extractClientCredentials, since clientApp creds can be passed as JSON params.  
        	// So checkClientCredentials performed later with org.picketlink.oauth.provider.rest.interceptors.ProtectedByClientCredentialsInterceptor
        	isAllowed = extractClientCredentials(request);
        } else if(SecurityCheck.getAnnotation(LOGGER, method, ProtectedByAccessToken.class, refProtByAccTknPost)) { // advanced scheme
        	accessTokenSubjectType = (Class<? extends IAccessToken<? extends TokenInfo>>) refProtByAccTknPost.getValue().value();        	
			isAllowed = preprocessProtectedByAccessToken(request, accessTokenSubjectType);
         } else if(SecurityCheck.getAnnotation(LOGGER, method, ProtectedBy.AccessToken.class, refProtByAccTknPre)) { // simpler scheme
        	  accessTokenSubjectType = (Class<? extends IAccessToken<? extends TokenInfo>>) refProtByAccTknPre.getValue().value().clsAccessTokenType;
        	  isAllowed = preprocessProtectedByAccessToken(request, accessTokenSubjectType);
         }
        else if (requiresAuthentication(method)) {        	
        	BasicAuthorization ba = basicAuthParseHeader(request);
        	if(ba!=null) {
        		// by-pass login-pw requests; actually, they will be checked later
        		ResteasyProviderFactory.pushContext(BasicAuthorization.class, ba);  		
        	} else if(!this.identity.isLoggedIn()) {
	            String token = getToken(request);	
	            if (token != null) {
	            	isAllowed = identity.isLoggedIn();
	                /*try {
	                    isLoggedIn = identity.isLoggedIn();
	                    //isLoggedIn = identity.restoreSession(token);
	                } catch (AuthenticationException e) {
	                    log.error("Authentiation Failed:", e);
	                }*/
	            }	
	        }
    	} else 
    		isAllowed = true;
        return isAllowed? super.preProcess(request, method) // null -> OK, by-pass
        	   :getForbiddenResponse(); 
    }

	private <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
	boolean preprocessProtectedByAccessToken(HttpRequest request, Class<ACCESSTOKEN> accessTokenSubjectType) {
		final String tokenTypeString = getAuthorizationHeader(request);		
		boolean isAllowed = false;
		try {
			final Tuple.T2<AccessTokenType, String> typeStr = AccessToken.parseTokenTypeString(tokenTypeString);
			final String tokenId = AccessToken.getTokenId(typeStr.item1, typeStr.item2);
			final RefreshToken refreshToken = oauthRegister.getRefreshToken(tokenId);
			ACCESSTOKEN accToken = null;
			if(refreshToken!=null) {
				isAllowed = ((Token)refreshToken).isValidToken();
				if(!isAllowed) {
					LOGGER.error("invalid refreshToken: "+refreshToken.getTokenId());
					OAPE.TokenException.throwIt(OAuthProviderExceptionCode.invalid_token);
				}
				final Token<? extends TokenInfo> sourceToken = refreshToken.getSourceToken();
				final Class<? extends Token> clsSrcToken;
				if(sourceToken!=null && (clsSrcToken=sourceToken.getClass())!=null) {
					if(Token.IAuthCodeToken.class.isAssignableFrom(clsSrcToken)) {
						final Token.IAuthCodeToken authCodeTkn = (Token.IAuthCodeToken)sourceToken;
						accToken = (ACCESSTOKEN)authCodeTkn;
						isAllowed = refreshToken.isValidToken();
					} else if(clsSrcToken.isInstance(accessTokenSubjectType)) {
						accToken = (ACCESSTOKEN) sourceToken;
					}
				} // if(sourceToken!=null...				
			} else {
				final PassBy.reference<ACCESSTOKEN> outAccToken = PassBy.reference(null);
				isAllowed = AccessToken.check(typeStr.item1, typeStr.item2, accessTokenSubjectType, outAccToken);
				accToken = outAccToken.getValue();
			}
			if(isAllowed)
				ResteasyProviderFactory.pushContext((Class<IAccessToken<?>>)accessTokenSubjectType, accToken);
		} catch (Exception e) {
			LOGGER.debug("preProcess: "+e.toString());
		}
		return isAllowed;
	}
    

    
	//private boolean checkAccessToken(final HttpRequest request) {return AccessToken.check(getAuthorizationHeader(request), clsTokenInfo);}    
    


	public static boolean protectedByClientCredentials(final ResourceMethod method) {
    	return SecurityCheck.hasAnnotation(method, ProtectedByClientCredentials.class) // advanced scheme
				|| SecurityCheck.hasAnnotation(method, ProtectedBy.ClientCredentials.class); // simpler scheme    	
    }     
    
	public static BasicAuthorization basicAuthParseHeader(HttpRequest request) {
		try {
			return BasicAuthorization.parseHeader(request.getHttpHeaders().getRequestHeader("authorization").get(0));
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean extractClientCredentials(final HttpRequest request) {
    	final BasicAuthorization ba = basicAuthParseHeader(request);    	
    	if(ba!=null) {
    		String cliID = ba.getUserId(), cliSc = ba.getPassword();
    		ResteasyProviderFactory.pushContext(ClientAppAuth.class, new ClientAppAuth(cliID, cliSc));
    	} else {
    		ResteasyProviderFactory.popContextData(ClientAppAuth.class); //getContextDataMap().remove(ClientAppAuth.class) //
    	}
    	return true;
    }
	
	private static String getAuthorizationHeader(HttpRequest request) {
		try {
			return request.getHttpHeaders().getRequestHeader("authorization").get(0);
		} catch (Exception e) {
			LOGGER.error(e.toString());
			return null;
		}		
	}
	
	private ServerResponse getForbiddenResponse() {
		AuthenticationResponse authcResponse = new AuthenticationResponse();	
		authcResponse.setLoggedIn(false);
		ServerResponse response = new ServerResponse();
		response.setEntity(authcResponse);
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);
		return response;
	}

    private String getToken(HttpRequest request) { //Retrieve the token from the request, if present.
        HttpHeaders httpHeaders = request.getHttpHeaders();
        List<String> tokenHeader = httpHeaders.getRequestHeader(AUTH_TOKEN_HEADER_NAME);
        String token = null;

        if (tokenHeader != null && !tokenHeader.isEmpty()) {
            token = tokenHeader.get(0);
        }

        //Check cookies
        if(token == null){
            Map<String,Cookie> cookies = httpHeaders.getCookies();
            if(cookies != null){
                Cookie cookie = cookies.get(AUTH_TOKEN_HEADER_NAME);
                if(cookie!=null) token = cookie.getValue();
            }
        }

        return token;
    }

    /**
     * <p>
     * Checks if the {@link ResourceMethod} requires authentication.
     * </p>
     *
     * @param method
     * @return
     */
    private boolean requiresAuthentication(ResourceMethod method) {
    	if(SecurityCheck.hasAnnotation(method, PermitAll.class))
    		return false;
        Class<?> declaringClass = method.getMethod().getDeclaringClass();

        Class<?>[] arr = new Class[] { SignInEndpoint.class, LogoutEndpoint.class, AccountRegistrationEndpoint.class,
                CheckUserNameEndpoint.class, UserInfoEndpoint.class, AuthEndpoint.class, 
                FileServer.class }; //, TestEndpoint.class

        List<Class<?>> classes = Arrays.asList(arr);

        return classes.contains(declaringClass) == false;
    }
    
    @Override
	public boolean accept(Class declaring, Method method) {
		// return super.accept(declaring, method);
    	return true;
	} 
}