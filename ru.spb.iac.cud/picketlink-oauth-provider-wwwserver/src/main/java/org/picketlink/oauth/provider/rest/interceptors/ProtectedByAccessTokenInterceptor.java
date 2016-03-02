package org.picketlink.oauth.provider.rest.interceptors;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.picketlink.oauth.provider.model.IClientAppAuth;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token.IAccessToken;
import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;

/* Extended interception scheme:
 * - both top-level (preprocess) & method-level (AroundInvoke) interceptor (SecurityInterceptor & ProtectedBy(AccessToken|ClientCredentials)Interceptor)
 * - JSON parameters object support
 * - @Context parameter support
 * - Custom AccessToken class specification
 * BUT: can be used only within picketlink-oauth-provider-wwwserver project. 
 * 
 * To get simpler and multi-project-wide scheme, use ProtectedBy.AccessToken & ProtectedBy.ClientCredentials annotations.
 */
@ProtectedByAccessToken @Interceptor
public class ProtectedByAccessTokenInterceptor {		
	@Inject private OAuthRegister oAuthRegister;
	
	@AroundInvoke
	public Object authenticate(InvocationContext ctx)  throws Exception {
		IAccessToken<?> access_token = (IAccessToken<?>)ResteasyProviderFactory.popContextData(IAccessToken.class);
		final ProtectedByAccessToken prtByAccTkn = ctx.getMethod().getAnnotation(ProtectedByAccessToken.class);
		final Class<? extends IAccessToken<?>> clsAccTkn = (Class<? extends IAccessToken<?>>) prtByAccTkn.value(); 		
		if(access_token!=null && clsAccTkn.isInstance(access_token)) {
			final Object[] parameters = ctx.getParameters();
			for (int i = 0; i < parameters.length; i++) {
				Object oParam = parameters[i];
				if (oParam instanceof TokenInfo.ISetTokenTypeInfo) {
					TokenInfo.ISetTokenTypeInfo istti = (TokenInfo.ISetTokenTypeInfo)oParam;
					istti.setTokenId(access_token.getTokenId());
					istti.setTokenInfo(access_token.getTokenInfo());
					istti.setTokenType(access_token.getTokenType());
					istti.setTokenString(access_token.getTokenString());
				} else if(clsAccTkn.isAssignableFrom(oParam.getClass())) {
					parameters[i] = access_token; 
				}
			}
			return ctx.proceed();	
		} else
			throw new Exception("Invalid access_token!");
	} // @AroundInvoke authenticate

}
