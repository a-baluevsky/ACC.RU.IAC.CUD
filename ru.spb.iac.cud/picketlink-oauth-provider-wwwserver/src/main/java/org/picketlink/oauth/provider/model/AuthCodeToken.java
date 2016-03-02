package org.picketlink.oauth.provider.model;

import java.util.Map;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class AuthCodeToken // user access token obtained in Authz Code flow
extends AccessToken<TokenInfo.AuthCodeTokenInfo>
implements Token.IAuthCodeToken
{
	private AuthCodeToken(String id, TokenInfo.AccessTokenType tokenType, TokenInfo.AuthCodeTokenInfo tokenInfo) 
	throws TokenInfo.InvalidTokenException, GeneralFailure {
		super(id, tokenType, tokenInfo);
	}
	
	public AuthCodeToken(TokenInfo.AccessTokenType tokenType, TokenInfo.AuthCodeTokenInfo tokenInfo) 
			throws TokenInfo.InvalidTokenException, GeneralFailure, OAuthSystemException {
		this(OAuthRegister.oauthMD5Issuer.accessToken(), tokenType, tokenInfo);
	}
	
	@Override
	public Map<String, String> getAttributes() {
		final Map<String, String> mapJWTAttrs = super.getAttributes();
		mapJWTAttrs.putAll(tokenInfo.userAttributes);
		return mapJWTAttrs;
	}
	
	@Override
	public Token.IUserAccessToken toUserAccessToken() throws InvalidTokenException, GeneralFailure {		
		return new UserAccessToken(this.id, this.getTokenType(), this.tokenInfo);
	}
	
}
