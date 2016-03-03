package org.picketlink.oauth.provider.rest.interceptors;

import javaw.lang.Strings;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.picketlink.oauth.provider.model.ClientAppAuth;
import org.picketlink.oauth.provider.model.IClientAppAuth;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.picketlink.oauth.provider.services.ClientApp;
import org.picketlink.oauth.provider.services.ClientAppManager;

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
	@Inject private ClientAppManager clientAppManager;
	
	@AroundInvoke
	public Object authenticate(InvocationContext ctx)  throws Exception {
		String cliID = null, cliSc = null;
		// don't keep ClientAppAuth, it is used here only!
		ClientAppAuth clientCreds = (ClientAppAuth)ResteasyProviderFactory.popContextData(ClientAppAuth.class);
		if(clientCreds!=null) {
			cliID = clientCreds.getClient_id(); cliSc = clientCreds.getClient_secret();
		}
		
		boolean validated = false;
		final Object[] parameters = ctx.getParameters();
		for (Object oParam : parameters)
			if (oParam instanceof IClientAppAuth) {
				final IClientAppAuth ica = (IClientAppAuth)oParam;
				if(clientCreds!=null) {					
					ica.setClient_id(cliID);
					ica.setClient_secret(cliSc);
				} else {
					cliID = ica.getClient_id(); cliSc = ica.getClient_secret();
				}
			}
		
		if(!Strings.isNullOrEmpty(cliID) && !Strings.isNullOrEmpty(cliSc)) {
			final ClientApp app = clientAppManager.get(cliID);
    		if(app!=null) {
    			final String s=app.getClientSecret();
				validated = s!=null && cliSc!=null && s.equals(cliSc);
    		} else 
    			validated = false;			
		}
		
    	if(validated) { // stronger validation by checking if ClientApp is really registered IS
    		return ctx.proceed();
    	} else {
    		OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.invalid_client);
		}
		return null;		
		
	}
}