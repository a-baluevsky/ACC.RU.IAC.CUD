package org.picketlink.oauth.provider.model;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthorizationCodeInfo;

public class AuthorizationCode extends Token.AuthorizationCode  {
	/*
	Generating .ctor: loads data from arguments
	Validating .ctor: retrieves data from OAuth Register
	!! Generating .ctor can't call Validating .ctor !!
	*/
	
	public AuthorizationCode(AuthorizationCodeInfo token_info) throws OAuthSystemException { // Generating
		super(OAuthRegister.oauthMD5Issuer.authorizationCode(), token_info);
	}
}
