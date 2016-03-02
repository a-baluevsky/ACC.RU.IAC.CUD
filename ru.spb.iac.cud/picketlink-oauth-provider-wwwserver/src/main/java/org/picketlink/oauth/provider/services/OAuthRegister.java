package org.picketlink.oauth.provider.services;

import java.util.HashMap;
import java.util.Map;

import javaw.util.Actor;
import javaw.util.Tuple;

import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.picketlink.oauth.provider.model.AccessToken;
import org.picketlink.oauth.provider.model.AuthCodeToken;
import org.picketlink.oauth.provider.model.AuthorizationCode;
import org.picketlink.oauth.provider.model.ClientAppAccessToken;
import org.picketlink.oauth.provider.model.RefreshToken;
import org.picketlink.oauth.provider.model.UserAccessToken;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.ClientAppTokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

// FYI: 
// 		https://docs.jboss.org/picketlink/2/2.7.0.Final/api/org/picketlink/idm/model/basic/Agent.html
// 		https://docs.jboss.org/picketlink/2/2.7.0.Final/api/org/picketlink/idm/model/basic/User.html
//  org.picketlink.internal.DefaultIdentity

// Usage:     @Inject private OAuthRegister oauthRegister;

@ApplicationScoped
@TransactionAttribute
public class OAuthRegister {
	protected static final Logger LOGGER = LoggerFactory.getLogger(OAuthRegister.class);
	
	//public boolean 		isValidUsernamePassword(String password, String username) { return OAuthProviderProxyObjects.aml.isValidLoginPassword(username, password);	}
	
	private Map<String, AuthorizationCode> authCodes = new HashMap<>();
    public AuthorizationCode addAuthorizationCode(AuthorizationCode authCode) 
    { authCodes.put(authCode.getTokenId(), authCode); return authCode; }
	
    public AuthorizationCode getAuthorizationCode(String authCodeId) 	
    { return Token.extractOrDismissExpired(authCodeId, authCodes); } 
	
    private Map<String, AccessToken<?>> accessTokens = new HashMap<>();
    public AccessToken<?> 	addAccessToken(AccessToken<?> accessToken) 		
    { accessTokens.put(accessToken.getTokenId(), accessToken); return accessToken; }
    public AccessToken<?> getAccessToken(String accessTokenId) 		
    { return Token.extractOrDismissExpired(accessTokenId, accessTokens); }
    
    private Map<String, RefreshToken> refreshTokens = new HashMap<>();
	public RefreshToken   addRefreshToken(RefreshToken refreshToken) 	
	{ refreshTokens.put(refreshToken.getTokenId(), refreshToken);  return refreshToken; }
	public RefreshToken getRefreshToken(String refreshTokenId) 		
	{ return Token.extractOrDismissExpired(refreshTokenId, refreshTokens); }
	
	public static final OAuthIssuer oauthMD5Issuer = new OAuthIssuerImpl(new MD5Generator());
	
	public static abstract class 
	AbstractTokenClassSwitcher<INPUT, RESULT, SWITCHTKNTYPE extends TokenInfo.IGetTokenInfo<? extends TokenInfo>> extends Actor<RESULT> {
		public AbstractTokenClassSwitcher(Class<SWITCHTKNTYPE> switchClassType, INPUT input) throws GeneralFailure {
			try {
				if(isAccessTokenClass(switchClassType))
					this.data = accessToken(switchClassType,input);
				else if(Token.AuthorizationCode.class.isAssignableFrom(switchClassType))
					this.data = authorizationCode(switchClassType,input);
				else if(Token.RefreshToken.class.isAssignableFrom(switchClassType))
					this.data = refreshToken(switchClassType,input);
				else 
					this.data = unknown(switchClassType,input);					
			} catch (Exception e) {
				throw new GeneralFailure(e);
			}			
		}
		private static boolean isAccessTokenClass(Class<?> classType) {
			return  Token.IAccessToken.class.isAssignableFrom(classType)
					/*Token.IAuthCodeToken.class.isAssignableFrom(classType) ||
					Token.IClientAppAccessToken.class.isAssignableFrom(classType) ||
					Token.IUserAccessToken.class.isAssignableFrom(classType)*/
			;
		}
		abstract RESULT accessToken(Class<SWITCHTKNTYPE> switchClassType, INPUT input) throws Exception;
		abstract RESULT authorizationCode(Class<SWITCHTKNTYPE> switchClassType, INPUT input) throws Exception;
		abstract RESULT refreshToken(Class<SWITCHTKNTYPE> switchClassType, INPUT input) throws Exception;
		abstract RESULT unknown(Class<SWITCHTKNTYPE> switchClassType, INPUT input) throws Exception;
	}
	
	// Generalized methods
	public <TOKEN extends TokenInfo.IGetTokenInfo<? extends TokenInfo>> String generateTokenId(Class<TOKEN> tokenClass) throws GeneralFailure {
		return new AbstractTokenClassSwitcher<OAuthIssuer, String, TOKEN>(tokenClass, oauthMD5Issuer) {
			@Override String accessToken(Class<TOKEN> switchClassType, OAuthIssuer oauthIssuer) throws OAuthSystemException 
			{ return oauthIssuer.accessToken(); }
			@Override String authorizationCode(Class<TOKEN> switchClassType, OAuthIssuer oauthIssuer) throws OAuthSystemException 
			{ return oauthIssuer.authorizationCode(); }
			@Override String refreshToken(Class<TOKEN> switchClassType, OAuthIssuer oauthIssuer) throws OAuthSystemException 
			{ return oauthIssuer.refreshToken(); }
			@Override String unknown(Class<TOKEN> switchClassType, OAuthIssuer oauthIssueroauthIssuer) throws GeneralFailure 
			{ throw new GeneralFailure("generateTokenId: invalid token class specified: "+switchClassType); }			
		}.getData();
	}

	public <TOKEN extends TokenInfo.IGetTokenInfo<? extends TokenInfo>> TOKEN getToken(Class<TOKEN> tokenClass, String tokenId) throws GeneralFailure {
		return new AbstractTokenClassSwitcher<Tuple.T2<String, OAuthRegister>, TOKEN, TOKEN>
		(tokenClass, new Tuple.T2<>(tokenId, this)) {
			@Override TOKEN accessToken(Class<TOKEN> switchClassType, Tuple.T2<String, OAuthRegister> info) throws Exception 
			{ return (TOKEN) info.item2.accessTokens.get(info.item1); }
			@Override TOKEN authorizationCode(Class<TOKEN> switchClassType, Tuple.T2<String, OAuthRegister> info) throws Exception 
			{ return (TOKEN) info.item2.authCodes.get(info.item1); }
			@Override TOKEN refreshToken(Class<TOKEN> switchClassType, Tuple.T2<String, OAuthRegister> info) throws Exception 
			{ return (TOKEN) info.item2.refreshTokens.get(info.item1); }
			@Override TOKEN unknown(Class<TOKEN> switchClassType, Tuple.T2<String, OAuthRegister> info) throws GeneralFailure 
			{ throw new GeneralFailure("getToken: invalid token class specified: "+switchClassType); }			
		}.getData();
	}
	
	public <TOKENINFO extends TokenInfo, TOKEN extends Token<TOKENINFO>>  
	TOKEN issueToken(TOKENINFO tokenInfo, Class<TOKENINFO> tokenInfoClass) throws GeneralFailure {
		try {
			if(isAccessTokenInfoClass(tokenInfoClass))
				return (TOKEN) issueAccessToken(tokenInfo, tokenInfoClass, AccessTokenType.BEARER);
			else if(TokenInfo.AuthorizationCodeInfo.class.isAssignableFrom(tokenInfoClass))
				return (TOKEN) addAuthorizationCode(new AuthorizationCode((TokenInfo.AuthorizationCodeInfo)tokenInfo));
			else if(TokenInfo.RefreshTokenInfo.class.isAssignableFrom(tokenInfoClass))
				return (TOKEN) addRefreshToken(new RefreshToken((TokenInfo.RefreshTokenInfo)tokenInfo));
			else 
				throw new GeneralFailure("issueToken: invalid token info class specified: "+tokenInfoClass); 
		} catch (Exception e) {
			throw new GeneralFailure(e);
		}		
	}

	private <TOKENINFO extends TokenInfo> boolean isAccessTokenInfoClass(
			Class<TOKENINFO> tokenInfoClass) {
		return TokenInfo.ClientAppTokenInfo.class.isAssignableFrom(tokenInfoClass)
				|| TokenInfo.UserTokenInfo.class.isAssignableFrom(tokenInfoClass)
				|| TokenInfo.AuthCodeTokenInfo.class.isAssignableFrom(tokenInfoClass);
	}
	
	public <TOKENINFO extends TokenInfo, ACCESSTOKEN extends AccessToken<TOKENINFO>>
	ACCESSTOKEN issueAccessToken(TOKENINFO tokenInfo, Class<TOKENINFO> tokenInfoClass, AccessTokenType accessTokenType) throws Exception {
		//if(isAccessTokenClass(tokenInfoClass))			
		//	return (TOKEN) addAccessToken(new AccessToken<TokenInfo>(oauthMD5Issuer.accessToken(), accessTokenType, tokenInfo));
		/*
		if(TokenInfo.RefreshTokenInfo.class.isAssignableFrom(tokenInfoClass)) {
			TokenInfo.RefreshTokenInfo refrInfo = (TokenInfo.RefreshTokenInfo)tokenInfo;
			tokenInfo = (TOKENINFO) refrInfo.origin.getTokenInfo();
			tokenInfoClass = 
		}
		*/
		
		if(TokenInfo.AuthCodeTokenInfo.class.isAssignableFrom(tokenInfoClass))
			return (ACCESSTOKEN) addAccessToken(new AuthCodeToken(accessTokenType, (TokenInfo.AuthCodeTokenInfo)tokenInfo));
		else if(TokenInfo.ClientAppTokenInfo.class.isAssignableFrom(tokenInfoClass))
			return (ACCESSTOKEN) addAccessToken(new ClientAppAccessToken(accessTokenType, (TokenInfo.ClientAppTokenInfo) tokenInfo));
		else if (TokenInfo.UserTokenInfo.class.isAssignableFrom(tokenInfoClass))
			return (ACCESSTOKEN) addAccessToken(new UserAccessToken(accessTokenType, (TokenInfo.UserTokenInfo) tokenInfo));
		else 
			throw new GeneralFailure("issueToken: invalid token info class specified: "+tokenInfoClass);
		
	}	
	
	public <TOKENINFO extends TokenInfo, TOKEN extends Token<TOKENINFO>>
	TOKEN issueToken(TOKENINFO tokenInfo) throws GeneralFailure {
		return issueToken(tokenInfo, (Class<TOKENINFO>)tokenInfo.getClass());
	}
	
	public <TOKENINFO extends TokenInfo, ACCESSTOKEN extends AccessToken<TOKENINFO>>
	ACCESSTOKEN issueAccessToken(TOKENINFO tokenInfo, AccessTokenType accessTokenType) throws GeneralFailure {
		try {
			return issueAccessToken(tokenInfo, (Class<TOKENINFO>)tokenInfo.getClass(), accessTokenType);
		} catch (Exception e) {
			OAPE.OAuthRegisterException.throwIt("Failed issueAccessToken. "+e.getMessage());
		}
		return null;
	}
	




	
	
	
}
