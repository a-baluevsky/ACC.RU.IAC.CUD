package org.picketlink.oauth.provider.model;

import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.oaReg;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javaw.lang.Strings;
import javaw.util.PassBy;
import javaw.util.Tuple;

import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.jwt.io.JWTUtil;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAPE;
import org.picketlink.oauth.provider.model.exceptions.OAuthProviderException.OAuthProviderExceptionCode;
import org.picketlink.oauth.provider.services.OAuthRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.IOAuthRegister;
import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthorizationCodeInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.exceptions.GeneralFailure;


/* Generalize code by handling different token types (Bearer, JWT, MAC, ...).
 * This class  
 */
public class AccessToken<TOKENINFO extends TokenInfo> 
extends Token.AbstractAccessToken<TOKENINFO> 
 {	
	protected static final Logger LOGGER = LoggerFactory.getLogger(AccessToken.class);
	//protected static final OAuthIssuer oauthMD5Issuer = new OAuthIssuerImpl(new MD5Generator());
	
	private final String tokenString;
	@Override public String getTokenString() { return tokenString;	}
	@Override public String toString() { return (new StringBuilder(tokenType.toString())).append(" ").append(tokenString).toString(); }
	
	private final AccessTokenType tokenType;
	@Override public AccessTokenType getTokenType() { return tokenType; }
	
	@Generating
	public AccessToken(String id, AccessTokenType tokenType, String tokenString, TOKENINFO tokenInfo) {
		super(id, tokenInfo, (Class<TOKENINFO>)tokenInfo.getClass());
		this.tokenType = tokenType; this.tokenString = tokenString;
	}
	
	@Validating // id = AccessToken.getTokenId(tokenType, tokenString)
	private AccessToken(String id, AccessTokenType tokenType, String tokenString, Class<TOKENINFO> clsTokenInfo) 
	throws InvalidTokenException, GeneralFailure {
		this(id, tokenType, tokenString, TokenInfo.getTokenInfo(clsTokenInfo, id));
		if(!isValidToken())
			InvalidTokenException.throwIt(LOGGER, "Invalid token: "+toString());		
	}
	
	@Generating
	public AccessToken(String id, AccessTokenType tokenType, TOKENINFO tokenInfo)
	throws InvalidTokenException, GeneralFailure {
		this(id, tokenType, getTokenString(tokenType, id, tokenInfo),tokenInfo);
	}		
	
	@Validating
	public AccessToken(AccessTokenType tokenType, String tokenString, Class<TOKENINFO> clsTokenInfo) 
	throws InvalidTokenException, GeneralFailure {
		this(getTokenId(tokenType, tokenString), tokenType, tokenString, clsTokenInfo);
	}
	@Validating
	public AccessToken(String tokenType, String tokenString, Class<TOKENINFO> clsTokenInfo) 
	throws InvalidTokenException, GeneralFailure {
		this(AccessTokenType.valueOf_(tokenType), tokenString, clsTokenInfo);
	}
	
	@Validating
	public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends AccessToken<TOKENINFO>> 
	ACCESSTOKEN	getAccessToken(Class<ACCESSTOKEN> clsAccessToken, String tokenId)
	throws InvalidTokenException, GeneralFailure {		
		final AccessToken<TOKENINFO> token = ((IOAuthRegister<TOKENINFO, AccessToken<TOKENINFO>>)oaReg).getToken((Class<AccessToken<TOKENINFO>>) clsAccessToken, tokenId);
		if(token==null) {
			InvalidTokenException.throwIt(LOGGER, "Not found Access Token: "+tokenId);
			return null;
		}
		else {
			return (ACCESSTOKEN) token; //(ACCESSTOKEN)new AccessToken<TOKENINFO>(token.getTokenId(), token.getTokenType(), token.getTokenString(), (TOKENINFO)token.getTokenInfo().clone());
		}				
	}
	
	public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
	ACCESSTOKEN valueOf(String typeToken, Class<ACCESSTOKEN> clsAccessToken) 
	throws InvalidTokenException, GeneralFailure	{
		Tuple.T2<AccessTokenType, String> typeStr = parseTokenTypeString(typeToken);
		return valueOf(typeStr.item1, typeStr.item2, clsAccessToken);
	}

	@SuppressWarnings("unchecked")
	public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
	ACCESSTOKEN valueOf(AccessTokenType tokenType, String tokenString, Class<ACCESSTOKEN> clsAccessToken) 
	throws InvalidTokenException, GeneralFailure {
		if(Token.IUserAccessToken.class.isAssignableFrom(clsAccessToken)) {
			final String tokenId = getTokenId(tokenType, tokenString);			
			TokenInfo.IGetTokenInfo token = oaReg.getTokenRaw(Token.IAccessToken.class, tokenId);
			if (token==null)
				GeneralFailure.throwIt(LOGGER, "Token not found: id="+tokenId+", class="+clsAccessToken.getName());
			final String nameClsAccessToken = token.getClass().getName();
			if(token instanceof Token.IAuthCodeToken) {
				Token.IAuthCodeToken authCodeToken = (Token.IAuthCodeToken)token;
				return (ACCESSTOKEN)authCodeToken.toUserAccessToken();
			} else if(token instanceof Token.IUserAccessToken)
				return (ACCESSTOKEN)token;
			else {				
				GeneralFailure.throwIt(LOGGER, "Invalid AccessToken class: queried "+clsAccessToken.getName()+", got "+nameClsAccessToken);
			}
		} else {
			final Class<TOKENINFO> clsTokenInfo = AccessTokenSubjectType.getTokenInfoClassByAccessTokenClass(clsAccessToken);
			if(clsTokenInfo==null)
				GeneralFailure.throwIt(LOGGER, "Can't map AccessToken class -> TokenInfo class");
			return (ACCESSTOKEN)new AccessToken<>(tokenType, tokenString, clsTokenInfo);
		}
		return null;		
	}
	
	public static Tuple.T2<AccessTokenType, String> parseTokenTypeString(String typeToken) throws InvalidTokenException {
		if(typeToken!=null && typeToken.length()>16) {
		final String authHdLc = typeToken.toLowerCase();
		if(authHdLc.startsWith("bearer "))
			return new Tuple.T2<TokenInfo.AccessTokenType, String>(AccessTokenType.BEARER, typeToken.substring(7));
		else if (authHdLc.startsWith("jwt "))
			return new Tuple.T2<TokenInfo.AccessTokenType, String>(AccessTokenType.JWT, typeToken.substring(4));
		}
		InvalidTokenException.throwIt(LOGGER, "AccessToken.parseTokenTypeString: Error parsing: "+typeToken);
		return null;			
	}
	
	// Ensure tokenString is valid to get NON-null value (otherwise InvalidTokenException)
	public static String getTokenId(AccessTokenType tokenType, String tokenString)
	throws InvalidTokenException {
		switch(tokenType) {
		case BEARER: 
			if(Strings.isNullOrEmptyTrim(tokenString))
				InvalidTokenException.throwIt(LOGGER, "getTokenId: Invalid BEARER tokenString!");
			else
				return tokenString;
		case JWT:
			final String jti = JWTUtil.getJTI(tokenString);
			if(jti!=null)
				return jti;
			else
				InvalidTokenException.throwIt(LOGGER, "getTokenId: JWT token doesn't have JTI!");			
		default:
			InvalidTokenException.throwIt(LOGGER, "getTokenId: Invalid tokenType: "+tokenType);
		}
		return null;
	}
	
	public static <TOKENINFO extends TokenInfo>
	String getTokenString(AccessTokenType tokenType, String token_id, TOKENINFO token_info) 
	throws InvalidTokenException, GeneralFailure {
		switch(tokenType) {
		case BEARER: return token_id;
		case JWT:	 return getTokenStringJWT(token_id, token_info);
		default: 	 GeneralFailure.throwIt(LOGGER, "getTokenString: invalid tokenType spec: "+tokenType);
		}
		return null;
	}
	
	
	// Get permission set
	public String getTokenScope(Class<TOKENINFO> clsTokenInfo) { return getTokenScope(getTokenId(), clsTokenInfo); }
	public static <TOKENINFO extends TokenInfo>
	String getTokenScope(String tokenId, Class<TOKENINFO> clsTokenInfo) {
		try {
			final TokenInfo tokenInfo = TokenInfo.getTokenInfo(clsTokenInfo, tokenId);
			if(tokenInfo!=null && tokenInfo.origin instanceof AuthorizationCode) {
				final AuthorizationCodeInfo authCodeInfo = (AuthorizationCodeInfo)tokenInfo.origin.getTokenInfo();
				return authCodeInfo!=null? authCodeInfo.scope:null;
			}			
		} catch (GeneralFailure e) {
			LOGGER.error(e.toString());
		}
		return null;
	}
	public boolean checkTokenScope(String scope, Class<TOKENINFO> clsTokenInfo) 
	{ return checkTokenScope(Arrays.asList(new String[]{scope}), clsTokenInfo); }	
	public boolean checkTokenScope(Collection<String> scopeList, Class<TOKENINFO> clsTokenInfo) {
		final String scope = getTokenScope(clsTokenInfo);
						     // no check!          nothing to check!
		return scopeList==null? true: scope==null? false: Arrays.asList(scope.split(" ")).containsAll(scopeList);
	}
	
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO> generate(AccessTokenType token_type, TOKENINFO token_info)
	throws OAuthSystemException {
		switch (token_type) {
			case BEARER:	return newBearerToken(token_info);
			case JWT:		return newJWT(token_info);
		}
		return null;
	}
	
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO> newBearerToken(TOKENINFO token_info) throws OAuthSystemException {
		return newBearerToken(OAuthRegister.oauthMD5Issuer, token_info);
	}
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO> newBearerToken(OAuthIssuer issuer, TOKENINFO token_info) throws OAuthSystemException {
		return newBearerToken(issuer.accessToken(), token_info);
	}
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO> newBearerToken(String id, TOKENINFO token_info) {
		return new AccessToken<TOKENINFO>(id, AccessTokenType.BEARER, id, token_info);
	}
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO>	newJWT(String token_id, TOKENINFO token_info) {
		final String tknStr = getTokenStringJWT(token_id, token_info);
		return new AccessToken<TOKENINFO>(token_id, AccessTokenType.JWT, tknStr, token_info);
	}
	
	public static <TOKENINFO extends TokenInfo>
	String getTokenStringJWT(String token_id, TOKENINFO token_info) {
		Map<String, String> mapClaims = token_info.getClaims(new HashMap<String, String>());
		//4.1.7. "jti" (JWT ID) Claim
		/* The jti (JWT ID) claim provides a unique identifier for the JWT. 
		 * The identifier value MUST be assigned in a manner that ensures that there is a negligible probability 
		 * that the same value will be accidentally assigned to a different data object; 
		 * if the application uses multiple issuers, collisions MUST be prevented among values produced by different issuers as well. 
		 * The jti claim can be used to prevent the JWT from being replayed. 
		 * The jti value is a case-sensitive string. Use of this claim is OPTIONAL.
		 */		
		mapClaims.put("jti", token_id);
		if(token_info instanceof TokenInfo.AuthCodeTokenInfo) {
			mapClaims.putAll(((TokenInfo.AuthCodeTokenInfo)token_info).userAttributes);
		} else if(token_info instanceof TokenInfo.UserTokenInfo) {
			mapClaims.putAll(((TokenInfo.UserTokenInfo)token_info).userAttributes);
		} else if(token_info instanceof TokenInfo.ClientAppTokenInfo) {
			mapClaims.putAll(((TokenInfo.ClientAppTokenInfo)token_info).eisAttributes);
		}
		return JWTUtil.writeJWT(JWTUtil.createJWT(mapClaims));
	}
	
	public static <TOKENINFO extends TokenInfo>
	AccessToken<TOKENINFO> newJWT(TOKENINFO token_info) throws OAuthSystemException {
		return newJWT(OAuthRegister.oauthMD5Issuer.accessToken(), token_info);
	}

	public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
	boolean check(String tokenTokenTypeString, Class<ACCESSTOKEN> clsAccessToken) throws InvalidTokenException, GeneralFailure {
		final Tuple.T2<AccessTokenType, String> tkn = parseTokenTypeString(tokenTokenTypeString);
		return check(tkn.item1, tkn.item2, clsAccessToken, null);
	}
	
	public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
	boolean check(AccessTokenType tokenType, String tokenString, Class<ACCESSTOKEN> clsAccessToken, PassBy.reference<ACCESSTOKEN> outAccToken) throws GeneralFailure {
		boolean isAllowed = false;
		try {			
			//final String tokenId = getTokenId(tokenType, tokenString);			
			//ACCESSTOKEN authTkn = (ACCESSTOKEN)((IOAuthRegister<TOKENINFO, ACCESSTOKEN>)oaReg).getToken(clsAccessToken, tokenId);
			ACCESSTOKEN authTkn = (ACCESSTOKEN)AccessToken.valueOf(tokenType, tokenString, clsAccessToken);			
			if(authTkn!=null)
				isAllowed = ((Token<TOKENINFO>)authTkn).isValidToken();
			if(outAccToken!=null)
				outAccToken.setValue(authTkn);
		} catch(Exception e) {
			final String errMsg = "AccessToken.check: "+e.toString();
			LOGGER.error(errMsg);
			OAPE.ServerException.throwIt(errMsg);
		} // anything went wrong => FORBIDDEN
		return isAllowed;	
	}
	
	@Override	public Map<String, String> getAttributes() { 
		Map<String, String> attrs = new HashMap<String, String>();
		if(AccessTokenType.JWT.equals(this.tokenType)) {
			 attrs = tokenInfo.getClaims(attrs);
			 attrs.put("jti", id);
		}
		return attrs;	
	}
	
	@Override	public String getTokenScope() { return getTokenScope(clsTokenInfo);	}
	@Override	public boolean checkTokenScope(String checkScope) { return checkTokenScope(checkScope, clsTokenInfo);	}
	@Override	public boolean checkTokenScope(Collection<String> checkScopeList) { return checkTokenScope(checkScopeList, clsTokenInfo); }

	public static Map<String, String> getAttributes(TokenInfo.IGetTokenInfo<?> token) throws GeneralFailure {
		Map<String, String> attrs = null;
		if(	token instanceof TokenInfo.IGetTokenInfoOpenId )
			attrs = ((TokenInfo.IGetTokenInfoOpenId)token).getAttributes();
		else if( token instanceof Token.RefreshToken) {
			attrs = getAttributes(((Token.RefreshToken)token).getSourceToken());
		} else {
			GeneralFailure.throwIt(LOGGER, "getAttributes: Invalid token class: "+token.getClass().getName());
		}
		return attrs;
	}
	
}
