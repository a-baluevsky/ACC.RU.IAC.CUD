package ru.spb.iac.cud.core.oauth;

import java.lang.annotation.Annotation;

import javaw.util.PassBy;

import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import ru.spb.iac.cud.core.oauth.Token.IAccessToken;
import ru.spb.iac.cud.exceptions.GeneralFailure;

import org.slf4j.Logger;

public class SecurityCheck {
	
	public static <ANNOTATION extends Annotation>
	boolean getAnnotation(Logger LOGGER, ResourceMethod method, Class<ANNOTATION> annotation, 
			PassBy.reference<ANNOTATION> refAnnotation) {
		try {			
			final ANNOTATION ann = method.getMethod().getAnnotation(annotation);
			refAnnotation.setValue(ann);
			return ann!=null;
		} catch (Exception e) {			
			LOGGER.error("SecurityCheck:getAnnotation: "+e.toString());
			return false;
		}		
	}

	
	
	public static boolean hasAnnotation(final ResourceMethod method, final Class<? extends java.lang.annotation.Annotation> annotation) {
		return method.getMethod().getAnnotation(annotation)!=null;
	}
	

	
	/*
	// TODO: use UserToken && ClientAppToken classes instead!
	private static<T extends TokenInfo>
	boolean checkProtectedBy(int protectionAnnotationsFlags, int protByFlag, String tokenId, Class<T> tokenTypeClass) {
		boolean bValid = false;
		if(0!=(protectionAnnotationsFlags&protByFlag)) {
			TokenInfo tokenInfo = null;
			try {
				tokenInfo = TokenInfo.getTokenInfo(tokenTypeClass, tokenId);
			} catch (GeneralFailure e) {}
			if(tokenInfo!=null) {
				ResteasyProviderFactory.pushContext(tokenTypeClass, (T)tokenInfo);
				bValid = true;
			} else {
				ResteasyProviderFactory.popContextData(tokenTypeClass);	
			}					
		}
		return bValid;
	}	
	*/
	//public static boolean protectedByUserAccessToken(final ResourceMethod method) {
    //	return hasAnnotation(method, ProtectedBy.UserAccessToken.class);
    //}	
}
