package ru.spb.iac.cud.core.oauth;

import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.aml;
import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.idpaml;
import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.oaReg;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javaw.lang.Strings;
import javaw.util.ICloneable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.Token.AuthorizationCode;
import ru.spb.iac.cud.exceptions.GeneralFailure;

// Information content of a token: contains data associated with the token, and required to verify identity
// or get additional information about the token.
// This declaration also has utility items. 
public class TokenInfo implements Cloneable {
	private static final Logger LOGGER = LoggerFactory.getLogger(TokenInfo.class);
	public Token<?> origin;	// source of token generation (e.g. Authorization Code, Refresh token, etc)
	
	public static class InvalidTokenException extends Exception {
		private static final long serialVersionUID = -3034199925995732789L;
		public InvalidTokenException(String msg) { super(msg); }
		public static void throwIt(Logger LOGGER, String msg) throws InvalidTokenException {
			LOGGER.error(msg);
			throw new InvalidTokenException(msg);
		}
		
	}
	
	public enum AccessTokenType {
	    BEARER("Bearer"), JWT("JWT");
	    private String tokenType;
	    AccessTokenType(String grantType) { this.tokenType = grantType; }
	    @Override public String toString() { return tokenType; }

	    public static AccessTokenType valueOf_(String s) throws InvalidTokenException {
	    	if(!Strings.isNullOrEmptyTrim(s))	    		
			switch (s.toLowerCase()) {
				case "bearer": return BEARER;
				case "jwt":	return JWT;
				default: 
					InvalidTokenException.throwIt(LOGGER, "TokenType.valueOf_: Invalid TokenType spec: "+s);
					//return TokenType.valueOf(s); // ask TokenType to throw Exception
			} 
			return BEARER;
		}
	}
	
	// метод аутентификации (УamrФ, приватное обозначение), может принимать два значени€:	УDSФ (электронна€ подпись) или УPWDФ (пароль);
	public enum AuthMethod { DS, //электронна€ подпись
		PWD // пароль (дл€ »—: client secret)
	}
	public AuthMethod amr;
	
	public interface IGetTokenInfo<TOKENINFO> {
		public String	 	getTokenId();
		public String 		getTokenString();	// String representation of token (e.g. JWT-encoded)
		public Long 		getTokenLifeTime();
		public TOKENINFO 	getTokenInfo();
	}
	public interface ISetTokenInfo<TOKENINFO> {
		public void setTokenId(String id);
		public void setTokenInfo(TOKENINFO tokenInfo);
	}

	public interface IGetTokenTypeInfo<TOKENTYPE, TOKENINFO> extends IGetTokenInfo<TOKENINFO> {
		public TOKENTYPE getTokenType(); //AccessTokenType
		public String getTokenString();

	}
	public interface ISetTokenTypeInfo<TOKENTYPE, TOKENINFO> extends ISetTokenInfo<TOKENINFO> {
		public void setTokenType(TOKENTYPE tokenType); //AccessTokenType
		public void setTokenString(String tokenString);
	}
	
	public interface ITokenTypeInfo<TOKENTYPE, TOKENINFO> 
	extends IGetTokenTypeInfo<TOKENTYPE, TOKENINFO>, ISetTokenTypeInfo<TOKENTYPE, TOKENINFO>  {}	
	
	public interface IGetTokenInfoOpenId {
		public Map<String, String> getAttributes();
		public String getTokenScope();
		public boolean checkTokenScope(String checkScope);
		public boolean checkTokenScope(Collection<String> checkScopeList);
	}
	public interface ISetTokenInfoOpenId {
		public void setAttributes(Map<String, String> attributes);
		public void setTokenScope(String scope);
	}	
	public interface ITokenInfoOpenId extends IGetTokenInfoOpenId, ISetTokenInfoOpenId {}
	
	protected TokenInfo(Long lifeTime, String client_id, Token<?> origin, Date expirationTime, String scope) {
		this.lifeTime = lifeTime;
		this.client_id = client_id;
		this.origin = origin;			
		this.expirationTime = expirationTime;
		this.scope = scope;
	}
	
	public TokenInfo(Long lifeTime, String client_id, String scope) {
		this(lifeTime, client_id, null, new Date((new Date()).getTime()+lifeTime*1000L), scope);
	}
	
	public Long getExp() { return this.expirationTime.getTime()/1000L; }
	public Long getIat() { return getExp()-lifeTime; }
	
	public Map<String, String> getClaims(Map<String, String> mapData) {
		mapData.put("exp", getExp().toString());
		mapData.put("iat", getIat().toString());
		mapData.put("iss", "urn:eis:cud");		
		mapData.put("aud", this.client_id);
		if(this.amr!=null) mapData.put("amr", this.amr.name());
		return mapData;
	}
	
	//public GrantType origin;
	public final Date expirationTime;
	public final Long lifeTime;
	public final String client_id;
	public final String scope;
	
	//public final String token_type;
	//public String access_token;
	public boolean expired() { return (new Date()).after(expirationTime); }

	public static class RefreshTokenInfo extends TokenInfo {
		public final String refresh_token;
		public RefreshTokenInfo(Long lifeTime, String client_id, Token<?> origin, String refresh_token, String scope) {
			super(lifeTime, client_id, scope);
			this.origin = origin;
			this.refresh_token = refresh_token;
		}
	}

	public static class ClientAppTokenInfo extends TokenInfo {
		public final Map<String, String> eisAttributes;
		public ClientAppTokenInfo(Long lifeTime, String client_id, String scope) throws GeneralFailure {			
			super(lifeTime, client_id, scope);
			this.eisAttributes = OAuthProviderProxyObjects.uml.getEISAttributes(client_id, null);
		}
	}
	
	public static class UserTokenInfo extends TokenInfo {
		public final String userLogin;
		public final Map<String, String> userAttributes;
		@Override
		public Map<String, String> getClaims(Map<String, String> mapData) {
			final Map<String, String> claims = super.getClaims(mapData);
			claims.put("sub", aml.getUserIdByLogin(((TokenInfo.UserTokenInfo)this).userLogin).toString());
			return claims;
		}
		public UserTokenInfo(Long lifeTime, String client_id, String userLogin, String scope) throws Exception {
			super(lifeTime, client_id, scope);
			this.userLogin = userLogin;
			this.userAttributes = idpaml.attributes(userLogin);
		}
	}
	public static class AuthCodeTokenInfo extends UserTokenInfo { // user access token obtained in Authz Code flow
		public final String authCode;
		public AuthCodeTokenInfo(Long lifeTime, String client_id, String userLogin, String authCode, Token<?> origin, String scope) throws Exception {
			super(lifeTime, client_id, userLogin, scope);
			this.authCode = authCode;
			this.origin = origin;
		} 
	}
	
	public static class AuthorizationCodeInfo extends TokenInfo {		
		public final String userLogin, state;
		// OpenId 2.0: auth_time: the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time
		public final Long auth_time;
		public final Map<String, String> userAttributes;
		public AuthorizationCodeInfo(Long lifeTime, String client_id, String userLogin,  String state, String scope) 
		throws Exception {
			super(lifeTime, client_id, scope);
			this.auth_time = (new Date()).getTime()/1000L; //(the number of seconds)
			this.userLogin = userLogin;
			this.state = state;	
			this.userAttributes = idpaml.attributes(userLogin);
		}
	}
	
	private static Map<Class<? extends IGetTokenInfo<? extends TokenInfo>>, Class<? extends TokenInfo>> mpTokenToTokenInfo;
	private static Map<Class<? extends TokenInfo>, Class<? extends IGetTokenInfo<? extends TokenInfo>>> mpTokenInfoToToken;
	static {
		mpTokenInfoToToken = new HashMap<Class<? extends TokenInfo>, Class<? extends IGetTokenInfo<? extends TokenInfo>>>();
		mpTokenToTokenInfo = new HashMap<Class<? extends IGetTokenInfo<? extends TokenInfo>>, Class<? extends TokenInfo>>();
		mpTokenToTokenInfo.put(Token.AuthorizationCode.class, TokenInfo.AuthorizationCodeInfo.class);
		mpTokenToTokenInfo.put(Token.IAuthCodeToken.class, TokenInfo.AuthCodeTokenInfo.class);
		mpTokenToTokenInfo.put(Token.RefreshToken.class, TokenInfo.RefreshTokenInfo.class);
		mpTokenToTokenInfo.put(Token.IClientAppAccessToken.class, TokenInfo.ClientAppTokenInfo.class);
		mpTokenToTokenInfo.put(Token.IUserAccessToken.class, TokenInfo.UserTokenInfo.class);
		mpTokenToTokenInfo.put((Class<? extends IGetTokenInfo<? extends TokenInfo>>) Token.IAccessToken.class, TokenInfo.class);
		//mpTokenToTokenInfo.put(Token.IAccessToken.class, TokenInfo.class);
		//mpTokenToTokenInfo.put(Token..class, TokenInfo..class);
		//mpTokenToTokenInfo.put(Token..class, TokenInfo..class);
		final Set<Entry<Class<? extends IGetTokenInfo<? extends TokenInfo>>, Class<? extends TokenInfo>>> eSet = mpTokenToTokenInfo.entrySet();
		for (Entry<Class<? extends IGetTokenInfo<? extends TokenInfo>>, Class<? extends TokenInfo>> eMp : eSet) {
			mpTokenInfoToToken.put(eMp.getValue(), eMp.getKey());
		}
	}
	
	// Not recommended to use, but handy due its generic simplicity	
	public static <TOKENINFO extends TokenInfo, TOKEN extends TokenInfo.IGetTokenInfo<TOKENINFO>> 
	TOKENINFO getTokenInfo(Class<TOKENINFO> clsTokenInfo, String tokenId) throws GeneralFailure {
		final TokenInfo.IGetTokenInfo<?> tkn = getTokenByTokenInfoClass(clsTokenInfo, tokenId);
		if(tkn!=null) {
			final Object tknInfo = tkn.getTokenInfo();
			return clsTokenInfo.isInstance(tknInfo)? (TOKENINFO)tknInfo: null;
		}
		return null;
	}
	
	public static<TKNINFO extends TokenInfo, TOKEN extends TokenInfo.IGetTokenInfo<TKNINFO>> 
	TOKEN getTokenByTokenInfoClass(Class<TKNINFO> tokenInfoClass, String tokenId) throws GeneralFailure {
		final Class<TOKEN> clsToken = mapTokenInfoClassToTokenClass(tokenInfoClass);
		return ((IOAuthRegister<TKNINFO, TOKEN>)oaReg).getToken(clsToken, tokenId);
	}

	public static<TKNINFO extends TokenInfo, TOKEN extends Token<TKNINFO>>  
	Class<TKNINFO> mapTokenClassToTokenInfoClass(Class<TOKEN> clsToken) {
		return (Class<TKNINFO>) mpTokenToTokenInfo.get(clsToken);
		
	}
	
	public static<TKNINFO extends TokenInfo, TOKEN extends TokenInfo.IGetTokenInfo<TKNINFO>> 
	Class<TOKEN> mapTokenInfoClassToTokenClass(Class<TKNINFO> clsTokenInfo) {
		return (Class<TOKEN>) mpTokenInfoToToken.get(clsTokenInfo);
	}

	@Override public TokenInfo clone() {
		final TokenInfo clone = new TokenInfo(this.lifeTime, this.client_id, 
				this.origin==null? null: this.origin.clone(),
				this.expirationTime, this.scope);
		return clone;
	}
	
}
