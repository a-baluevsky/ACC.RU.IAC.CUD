package ru.spb.iac.cud.core.oauth;

import javax.ejb.Local;

import ru.spb.iac.cud.exceptions.GeneralFailure;

@Local
public interface IOAuthRegister<TOKENINFO extends TokenInfo, TOKEN extends TokenInfo.IGetTokenInfo<TOKENINFO>> {	
	public String generateTokenId(Class<TOKEN> tokenClass) throws GeneralFailure;
	public TOKEN getToken(Class<TOKEN> tokenClass, String tokenId) throws GeneralFailure;
	public boolean isValidToken(Class<TOKEN> tokenClass, String accessTokenId);
	public TOKEN issueToken(TOKENINFO tokenInfo) throws GeneralFailure;
	public TokenInfo.IGetTokenInfo getTokenRaw(Class clsToken, String tokenId) throws GeneralFailure;
}