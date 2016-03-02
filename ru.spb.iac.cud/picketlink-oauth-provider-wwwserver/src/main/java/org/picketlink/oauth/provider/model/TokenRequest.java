package org.picketlink.oauth.provider.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.picketlink.oauth.provider.services.OAuthTokenRequestBasicAuthorization;

@XmlRootElement
@JsonSerialize
public class TokenRequest extends ClientAppAuth implements Serializable {
	private static final long serialVersionUID = -8612205148233734154L;
	public TokenRequest() {	}
	public TokenRequest(OAuthTokenRequestBasicAuthorization oauthRequest) {
    	this.setClient_id(oauthRequest.getClientId());
    	this.setClient_secret(oauthRequest.getClientSecret());
    	this.setCode(oauthRequest.getCode());
    	this.setGrant_type(oauthRequest.getGrantType());
    	this.setRedirect_uri(oauthRequest.getRedirectURI());
	}
	private String redirect_uri;
	public String getRedirect_uri() {		return redirect_uri;	}
	public void setRedirect_uri(String redirect_uri) {		this.redirect_uri = redirect_uri;	}
	
	private String token_type;
	public String getToken_type() 	{		return token_type;	}
	public void setToken_type(String token_type) {		this.token_type = token_type;	}	
	
	private String  grant_type;
	public String getGrant_type() {		return grant_type;	}
	public void setGrant_type(String grant_type) {		this.grant_type = grant_type;	}

	private String code; // GrantType = AUTHORIZATION_CODE
	public String getCode() {		return code;	}
	public void setCode(String code) {		this.code = code;	}

	private String username, password; // GrantType = PASSWORD
	public String getUsername() {		return username;	}
	public void setUsername(String username) {		this.username = username;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	
	// GrantType = Refresh_Token
	private String refresh_token;
	public String getRefresh_token() { return refresh_token;	}
	public void setRefresh_token(String refresh_token) { this.refresh_token = refresh_token; }
}
