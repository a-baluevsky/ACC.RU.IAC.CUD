package ru.spb.iac.cud.core.oauth;


import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.jboss.resteasy.spi.ResteasyProviderFactory;

import ru.spb.iac.cud.core.oauth.Token.AbstractAccessToken.AccessTokenSubjectType;

/* Simpler interception scheme:
 * 	- only top-level (preprocess) interceptor (SecurityInterceptor)
 * 	- only headers can pass authentication data
 *  - only ResteasyProviderFactory.getContextData support
 *  
 * To get extended interception features, use ProtectedByAccessToken and ProtectedByClientCredentials.
*/
public class ProtectedBy {
	@Target({ TYPE, METHOD })
	@Retention(RUNTIME)
	@Documented
	//@Qualifier	
	public @interface AccessToken {
		//Token.AbstractAccessToken.
		AccessTokenSubjectType value();
	}
	
	@Target({ TYPE, METHOD })
	@Retention(RUNTIME)
	@Documented
	//@Qualifier	
	public @interface  ClientCredentials {}
	
}
