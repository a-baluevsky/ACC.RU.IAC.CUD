package org.picketlink.oauth.provider.model;

import java.io.Serializable;

import javaw.lang.Strings;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo;

@JsonSerialize @JsonWriteNullProperties(false) @XmlRootElement
public class TokenResponse implements Serializable {
	private static final long serialVersionUID = 4939974526145642433L;
	protected String token_type, access_token, expires_in, refresh_token;
	public TokenResponse() {
	
	}
	public TokenResponse(String token_type, String access_token, String expires_in, String refresh_token) {
		this.token_type = token_type;		this.access_token = access_token;
		this.expires_in = expires_in;		this.refresh_token = refresh_token;		
	}
	public  String 	getToken_type() 						{ return token_type;	}
	public  void 	setToken_type(String token_type) 		{ this.token_type = token_type; }
	public  String 	getAccess_token() 						{ return access_token; }
	public  void 	setAccess_token(String access_token) 	{ this.access_token = access_token; }	
	public  String 	getExpires_in() 						{ return expires_in;	}
	public  void 	setExpires_in(String expires_in) 		{ this.expires_in = expires_in; }
	
	public  String 	getRefresh_token() 						{ return refresh_token;	}
	public  void 	setRefresh_token(String refreshToken) 	{ this.refresh_token = refreshToken;	}

	public static class TokenResponseWithIdToken extends TokenResponse {
		public TokenResponseWithIdToken(TokenResponse tr) {
			super(tr.token_type, tr.access_token, tr.expires_in, tr.refresh_token);
		}
		public TokenResponseWithIdToken(TokenResponse tr, String id_token) {
			this(tr); this.id_token = id_token;
		}
		private static final long serialVersionUID = -6136715098175112481L;
		private String id_token;
		public String getId_token() { return id_token;	}
		public void setId_token(String id_token) { this.id_token = id_token; }		
	}
	
	
	@JsonIgnore
	public void setToken(TokenInfo.IGetTokenInfo<?> token) {
		access_token = token.getTokenString();
		expires_in = token.getTokenLifeTime().toString();
	}	
	@JsonIgnore
	public void setToken(TokenInfo.IGetTokenTypeInfo<?, ?> token) {
		setToken((TokenInfo.IGetTokenInfo<?>)token);
		token_type = token.getTokenType().toString();
	}
	
	/*
	private String error, error_description;
	public String 	getError() 					{ return error; }
	public void 	setError(String error) 		{ this.error = error;	}
	public String 	getError_description() 		{ return error_description;	}
	public void 	setError_description(String error_description) { this.error_description = error_description; }
	
	/ *
	public TokenResponse() { }
	public TokenResponse(String expires_in, String access_token) {
		setAccess_token(access_token);		setExpires_in(expires_in);
	}
	* /
	
	
	@JsonIgnore 
	public void setErrorInfo(int httpErrorCode, String error, String error_description) { 
		setHttpCode(httpErrorCode);
		setError(error);
		setError_description(error_description);		
	}
	
	@JsonIgnore private int httpCode = 0;
	@JsonIgnore public int getHttpCode() { return httpCode;	}
	@JsonIgnore public void setHttpCode(int httpCode) { this.httpCode = httpCode; }
	
	@JsonIgnore	public boolean isError() { return !Strings.isNullOrEmpty(error) || (httpCode!=0 && httpCode!=200 && httpCode!=204); 	}
	*/
}