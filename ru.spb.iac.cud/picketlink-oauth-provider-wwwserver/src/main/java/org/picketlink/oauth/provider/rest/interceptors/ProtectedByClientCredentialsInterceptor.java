package org.picketlink.oauth.provider.rest.interceptors;

import javaw.lang.Strings;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.picketlink.oauth.provider.model.ClientAppAuth;
import org.picketlink.oauth.provider.model.IClientAppAuth;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.picketlink.oauth.provider.services.ClientApp;
import org.picketlink.oauth.provider.services.ClientAppManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* Extended interception scheme:
 * - both top-level (preprocess) & method-level (AroundInvoke) interceptor (SecurityInterceptor & ProtectedByClientCredentials Interceptor)
 * - JSON parameters object support: both headers & parameters object can pass authentication data
 * - @Context parameter support

 * BUT: can be used only within picketlink-oauth-provider-wwwserver project. 
 * 
 * To get simpler and multi-project-wide scheme, use ProtectedBy.AccessToken & ProtectedBy.ClientCredentials annotations.
 */
@ProtectedByClientCredentials @Interceptor
public class ProtectedByClientCredentialsInterceptor {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProtectedByClientCredentialsInterceptor.class);
	@Inject private ClientAppManager clientAppManager;
	
	@AroundInvoke
	public Object authenticate(InvocationContext ctx)  throws Exception {
		LOGGER.info("authenticate: 10");
		String cliID = null, cliSc = null;
		// don't keep ClientAppAuth, it is used here only!
		ClientAppAuth clientCreds = (ClientAppAuth)ResteasyProviderFactory.popContextData(ClientAppAuth.class);
		LOGGER.info("authenticate: 20 clientCreds: "+clientCreds);
		if(clientCreds!=null) {
			LOGGER.info("authenticate: 30");			
			cliID = clientCreds.getClient_id(); cliSc = clientCreds.getClient_secret();
		}
		
		LOGGER.info("target: "+ctx.getTarget());
		boolean validated = false;
		final Object[] parameters = ctx.getParameters();
		for (Object oParam : parameters) {
			LOGGER.info("oParam: "+oParam.getClass().toString());
			LOGGER.info("value: "+oParam);			
			if (oParam instanceof IClientAppAuth) {
				LOGGER.info("authenticate: 40");
				final IClientAppAuth ica = (IClientAppAuth)oParam;				
				if(clientCreds!=null) {
					LOGGER.info("authenticate: 50");
					ica.setClient_id(cliID);
					ica.setClient_secret(cliSc);
				} else {
					LOGGER.info("authenticate: 60");
					cliID = ica.getClient_id(); cliSc = ica.getClient_secret();
					LOGGER.info("authenticate: 64: cliID = "+cliID+", cliSc="+cliSc);
				}
			}
		}
		
		validated = clientAppManager.validate(cliID, cliSc);
    	if(validated) { // stronger validation by checking if ClientApp is really registered IS
    		LOGGER.info("authenticate: 100");
    		return ctx.proceed();
    	} else {
    		LOGGER.info("authenticate: 110");
    		OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.invalid_client);
		}
		return null;		
		
	}
}