package org.picketlink.oauth.provider.rest.interceptors;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.Token.IAccessToken;

/* Extended interception scheme:
 * - both top-level (preprocess) & method-level (AroundInvoke) interceptor (SecurityInterceptor & ProtectedBy(AccessToken|ClientCredentials)Interceptor)
 * - JSON parameters object support
 * - @Context parameter support
 * - Custom AccessToken class specification
 * BUT: can be used only within picketlink-oauth-provider-wwwserver project. 
 * 
 * To get simpler and multi-project-wide scheme, use ProtectedBy.AccessToken & ProtectedBy.ClientCredentials annotations.
 */
@Documented @Inherited @InterceptorBinding @Retention(RUNTIME) @Target({METHOD, TYPE})	
public @interface ProtectedByAccessToken {
	Class<? extends IAccessToken> value() default Token.IClientAppAccessToken.class; //<?>
}
