package ru.spb.iac.cud.core.oauth;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;
import static ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects.oaReg;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthorizationCodeInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.IGetTokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;
import ru.spb.iac.cud.core.oauth.TokenInfo.RefreshTokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

@SuppressWarnings("rawtypes")
public class Token<TOKENINFO extends TokenInfo> 
implements TokenInfo.IGetTokenInfo<TOKENINFO>, Cloneable {
	/*
	Generating .ctor: loads data from arguments
	Validating .ctor: retrieves data from OAuth Register; and returns a COPY of the token within OAuth Register
	!! Generating .ctor can't call Validating .ctor!! ?? and vice versa ??
	*/	
	@Target({ CONSTRUCTOR, METHOD })	@Retention(SOURCE)	@Documented public @interface Generating {} 
	@Target({ CONSTRUCTOR, METHOD })	@Retention(SOURCE)	@Documented public @interface Validating {}	
	
	protected final Class<TOKENINFO> clsTokenInfo;
	protected static final Logger LOGGER = LoggerFactory.getLogger(Token.class);	
	public static final Long DefaultTokenLifeTime = 3600L;

	protected final String id;
	protected final TOKENINFO tokenInfo;
	
	@Generating
	public Token(String id, TOKENINFO tokenInfo, Class<TOKENINFO> clsTokenInfo)
	{	this.id = id; this.tokenInfo = tokenInfo; this.clsTokenInfo = clsTokenInfo; }
	
	@Generating
	protected Token(TOKENINFO tokenInfo, Class<TOKENINFO> clsTokenInfo)  
	{	this(generateTokenIdSafe(clsTokenInfo), tokenInfo, clsTokenInfo); }
	
	@Validating
	public Token(Class<TokenInfo.IGetTokenInfo<TOKENINFO>> clsToken, String tokenId) throws GeneralFailure {
		final IGetTokenInfo<TOKENINFO> token = ((IOAuthRegister<TOKENINFO, TokenInfo.IGetTokenInfo<TOKENINFO>>)oaReg()).getToken(clsToken, tokenId);
		this.id = token.getTokenId(); this.tokenInfo = (TOKENINFO) token.getTokenInfo(); this.clsTokenInfo = (Class<TOKENINFO>) this.tokenInfo.getClass();
	}
	
	public static 
	<TOKENINFO extends TokenInfo, TOKEN extends Token<TOKENINFO>> Token<TOKENINFO> 
	issueTkn(TOKENINFO tokenInfo) throws GeneralFailure
	{
		return ((IOAuthRegister<TOKENINFO, TOKEN>)OAuthProviderProxyObjects.oaReg()).issueToken(tokenInfo); // Generating
	}

	public static<TKNINFO extends TokenInfo, TOKEN extends Token<TKNINFO>> 
	String generateTokenId(Class<TKNINFO> tokenInfoClass) throws GeneralFailure {		
		final Class<TOKEN> mp = TokenInfo.mapTokenInfoClassToTokenClass(tokenInfoClass);
		final IOAuthRegister<TKNINFO, TOKEN> OAuthRegister = (IOAuthRegister<TKNINFO, TOKEN>)OAuthProviderProxyObjects.oaReg();
		return OAuthRegister.generateTokenId(mp);
	}
	
	protected static<TKNINFO extends TokenInfo, TOKEN extends Token<TKNINFO>> 
	String generateTokenIdSafe(Class<TKNINFO> tokenInfoClass) {
		try {
			return generateTokenId(tokenInfoClass);
		} catch (GeneralFailure e) {
			LOGGER.error("generateTokenIdSafe: IMPOSSIBLE: "+e.toString());
			return null;
		}
	}


	@Override public String getTokenId() 		{ return id; }
	@Override public TOKENINFO getTokenInfo() 	{ return tokenInfo; }
	
	// Use this method in token containers to remove exprired tokens automagically: 
	// getTokenInfo(tokenId) { return extractOrDismissExpired(tokenInfo, mpTokens); }
	public static <TOKEN extends Token<?>> TOKEN extractOrDismissExpired(String tokenId, Map<String, TOKEN> mpTokens) {	
		final TOKEN token = mpTokens.get(tokenId); //
		final TokenInfo tknInfo;
		if(token!=null && (tknInfo=token.getTokenInfo())!=null) {
        	if(tknInfo.expired()) // why store expired tokens?
        		mpTokens.remove(tokenId);
        	else
        		return token;
        }
        return null;
	}
	
	@Override	public Long getTokenLifeTime() { return getTokenInfo().lifeTime; }

	@Override	public String toString() 		{ return id; }
	@Override	public String getTokenString() 	{ return toString();	}
	
	// don't use cached TOKENINFO tokenInfo; make OAuthRegister verify it itself (and perform cleanup, if required) 
	public boolean isValidToken(){
		try {
			return TokenInfo.getTokenByTokenInfoClass(clsTokenInfo, getTokenId())!=null;
		} catch (GeneralFailure e) {
			LOGGER.error(e.toString());
			return false;
		}
	}

	// Framework base classes declaration
	/*
	Generating .ctor: loads data from arguments
	Validating .ctor: retrieves data from OAuth Register
	!! Generating .ctor can't call Validating .ctor !!
	*/	
	public static class AuthorizationCode  extends Token<TokenInfo.AuthorizationCodeInfo>  {
		@Generating public AuthorizationCode(String id, AuthorizationCodeInfo tokenInfo) 	{ super(id, tokenInfo, TokenInfo.AuthorizationCodeInfo.class); } 
		@Generating public AuthorizationCode(AuthorizationCodeInfo tokenInfo) 				{ super(tokenInfo, TokenInfo.AuthorizationCodeInfo.class); }
	}
	public static abstract class RefreshToken extends Token<TokenInfo.RefreshTokenInfo> {
		@Generating public RefreshToken(String id, RefreshTokenInfo tokenInfo) {	super(id, tokenInfo, TokenInfo.RefreshTokenInfo.class);	}		
		@Generating public RefreshToken(RefreshTokenInfo tokenInfo) {	super(tokenInfo, TokenInfo.RefreshTokenInfo.class);	}
		public abstract Token<? extends TokenInfo> getSourceToken();
	}

	public static interface IAccessToken<ACCESSTOKENINFO extends TokenInfo> 
	extends TokenInfo.IGetTokenInfo<ACCESSTOKENINFO>, TokenInfo.IGetTokenInfoOpenId {
		AccessTokenType getTokenType();
		ACCESSTOKENINFO getTokenInfo();
	};
		
	
	public static abstract class AbstractAccessToken<ACCESSTOKENINFO extends TokenInfo> 
	extends Token<ACCESSTOKENINFO>
	implements IAccessToken<ACCESSTOKENINFO>
	{
		public enum AccessTokenSubjectType {
			GenericAccessToken(IAccessToken.class, TokenInfo.class),
			ClientAppAccessToken(IClientAppAccessToken.class, TokenInfo.ClientAppTokenInfo.class),  // bearer or JWT token issued during implicit grant flow
			UserAccessToken(IUserAccessToken.class, TokenInfo.UserTokenInfo.class)
			;
			
			
			public final Class<? extends IAccessToken> clsAccessTokenType; //<?>
			public final Class<? extends TokenInfo> clsTokenInfoType;
			
			AccessTokenSubjectType(Class<? extends IAccessToken> clsAccessTokenType, Class<? extends TokenInfo> clsTokenInfoType) { //IAccessToken<?>
				this.clsAccessTokenType = clsAccessTokenType;
				this.clsTokenInfoType = clsTokenInfoType;			
			}
			
			public static <TOKENINFO extends TokenInfo, ACCESSTOKEN extends IAccessToken<TOKENINFO>>
			Class<TOKENINFO> getTokenInfoClassByAccessTokenClass(Class<ACCESSTOKEN> clsAccessToken) {
				final AccessTokenSubjectType[] values = new AccessTokenSubjectType[]{ClientAppAccessToken, UserAccessToken, GenericAccessToken}; //AccessTokenSubjectType.values();
				for(AccessTokenSubjectType v: values)
					if(v.clsAccessTokenType.isAssignableFrom(clsAccessToken))
						return (Class<TOKENINFO>) v.clsTokenInfoType;
				return null;
			}			
		}
		@Generating	public AbstractAccessToken(String id, ACCESSTOKENINFO tokenInfo, Class<ACCESSTOKENINFO> clsTokenInfo) { super(id, tokenInfo, clsTokenInfo); }
		@Generating public AbstractAccessToken(ACCESSTOKENINFO tokenInfo, Class<ACCESSTOKENINFO> clsTokenInfo) { super(tokenInfo, clsTokenInfo); }
	}
	
	public static interface IClientAppAccessToken 	extends IAccessToken<TokenInfo.ClientAppTokenInfo> {};
	public static interface IUserAccessToken 		extends IAccessToken<TokenInfo.UserTokenInfo> {
		//List<String> getClientAppRoles() throws GeneralFailure;		
	};
	public static interface IAuthCodeToken 			extends IAccessToken<TokenInfo.AuthCodeTokenInfo> {
		// since IAuthCodeToken is actually a User Access Token, we must treat it special way:
		// coerce to IUserAccessToken, if needed		
		IUserAccessToken toUserAccessToken() throws InvalidTokenException, GeneralFailure;
	};

	@Override public Token<TOKENINFO> clone() {
		final Token<TOKENINFO> clone = new Token<TOKENINFO>(this.id,  
			this.tokenInfo==null? null: (TOKENINFO)this.tokenInfo.clone(), this.clsTokenInfo);
		return clone;
	}	
}