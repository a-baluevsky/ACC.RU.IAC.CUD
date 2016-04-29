package org.picketlink.oauth.provider.model;

import java.util.List;
import java.util.Map;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.exceptions.GeneralFailure;
public class UserAccessToken 
extends AccessToken<TokenInfo.UserTokenInfo>
implements Token.IUserAccessToken {
	UserAccessToken(String id, AccessTokenType tokenType,  TokenInfo.UserTokenInfo tokenInfo) 
	throws InvalidTokenException, GeneralFailure {
		super(id, tokenType, tokenInfo);
	}
	public UserAccessToken(AccessTokenType tokenType,  TokenInfo.UserTokenInfo tokenInfo) 
	throws InvalidTokenException, GeneralFailure, OAuthSystemException {
		this(OAuthRegister.oauthMD5Issuer.accessToken(), tokenType, tokenInfo);
	}
	public UserAccessToken(AccessTokenType tokenType, String tokenString) 
	throws InvalidTokenException, GeneralFailure {
		super(tokenType, tokenString, TokenInfo.UserTokenInfo.class);
	}
	public static UserAccessToken valueOf(String typeToken) throws InvalidTokenException, GeneralFailure {
		return AccessToken.valueOf(typeToken, UserAccessToken.class);
	}
	
	/*
	public static UserAccessToken valueOf(AuthCodeToken authCodeToken) {
		final TokenInfo.UserTokenInfo uti = new TokenInfo.UserTokenInfo(authCodeToken.getTokenInfo());
		return new UserAccessToken(authCodeToken.getTokenInfo(). );		
	}
	*/
	
	@Override
	public Map<String, String> getAttributes() {
		final Map<String, String> mapJWTAttrs = super.getAttributes();
		mapJWTAttrs.putAll(tokenInfo.userAttributes);
		return mapJWTAttrs;
	}
	
}
