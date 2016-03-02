package org.picketlink.oauth.provider.model;

import javax.inject.Inject;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.RefreshTokenInfo;

public class RefreshToken extends Token.RefreshToken 
{
	@Inject private OAuthRegister oauthRegister;
	
	@Generating public RefreshToken(RefreshTokenInfo tokenInfo) throws OAuthSystemException {
		super(OAuthRegister.oauthMD5Issuer.refreshToken(), tokenInfo);
	}
	@Override public Token<? extends TokenInfo> getSourceToken() {
		return tokenInfo.origin; //oauthRegister.getRefreshToken(tokenInfo.refresh_token);
	}
}
