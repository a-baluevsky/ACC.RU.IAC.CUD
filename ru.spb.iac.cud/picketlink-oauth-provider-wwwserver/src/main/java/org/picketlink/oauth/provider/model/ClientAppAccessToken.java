package org.picketlink.oauth.provider.model;

import java.util.Map;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class ClientAppAccessToken  
extends AccessToken<TokenInfo.ClientAppTokenInfo>
implements Token.IClientAppAccessToken {

	public ClientAppAccessToken(AccessTokenType tokenType,
								TokenInfo.ClientAppTokenInfo tokenInfo) 
	throws OAuthSystemException, InvalidTokenException, GeneralFailure {
		super(OAuthRegister.oauthMD5Issuer.accessToken(), tokenType, tokenInfo);
	}
	public ClientAppAccessToken(AccessTokenType tokenType, String tokenString) 
	throws InvalidTokenException, GeneralFailure {
		super(tokenType, tokenString, TokenInfo.ClientAppTokenInfo.class);
	}
	public static ClientAppAccessToken valueOf(String typeToken) throws InvalidTokenException, GeneralFailure {
		return AccessToken.valueOf(typeToken, ClientAppAccessToken.class);
	}
	
	@Override
	public Map<String, String> getAttributes() {
		final Map<String, String> mapJWTAttrs = super.getAttributes();
		mapJWTAttrs.putAll(tokenInfo.eisAttributes);
		return mapJWTAttrs;
	}
	
}
