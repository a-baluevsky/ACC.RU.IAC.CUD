package org.picketlink.oauth.provider.shared;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.picketlink.oauth.provider.services.OAuthRegister;

import ru.spb.iac.cud.core.oauth.IOAuthRegister;
import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.Token.IAccessToken;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public @Stateless class SharedOAuthRegister implements IOAuthRegister<TokenInfo, Token<TokenInfo>> {
	@Inject private OAuthRegister reg;

	@Override
	public String generateTokenId(Class<Token<TokenInfo>> tokenClass) throws GeneralFailure {
		return reg.generateTokenId(tokenClass);
	}

	@Override
	public Token<TokenInfo> getToken(Class<Token<TokenInfo>> tokenClass, String tokenId) throws GeneralFailure {
		return reg.getToken(tokenClass, tokenId);
	}
	
	@Override
	public boolean isValidToken(Class<Token<TokenInfo>> tokenClass, String accessTokenId) {
		try {
			return reg.getToken(tokenClass, accessTokenId)!=null;
		} catch (GeneralFailure e) {
			return false;
		}	
	}

	@Override
	public Token<TokenInfo> issueToken(TokenInfo tokenInfo) throws GeneralFailure {
		return reg.issueToken(tokenInfo, (Class<TokenInfo>)tokenInfo.getClass());
	}

	@Override
	public TokenInfo.IGetTokenInfo getTokenRaw(Class tokenClass, String tokenId) throws GeneralFailure {
		return reg.getToken(tokenClass, tokenId);
	}

}