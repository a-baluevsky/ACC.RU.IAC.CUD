package org.picketlink.oauth.provider.model;

import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import ru.spb.iac.cud.core.oauth.Token;
import ru.spb.iac.cud.core.oauth.TokenInfo.AuthCodeTokenInfo;

@JsonSerialize @XmlRootElement
public abstract class AuthorizationResponse extends OAuthResponse {
	private static final long serialVersionUID = 561717423974895006L;
	private String state;
	public  String 	getState() 				{ return state;	}
	public  void 	setState(String state) 	{ this.state = state;	}	
	
	public AuthorizationResponse(HttpServletResponse response, String state) { super(response); this.state = state; }
	
	public static class AuthorizationCodeResponse extends AuthorizationResponse {
		private static final long serialVersionUID = 4867087628419226321L;
		public AuthorizationCodeResponse(HttpServletResponse response, String state, String code) { super(response, state); this.code = code; }
		private String code;
		public  String 	getCode() 				{ return code;	}
		public  void 	setCode(String code) 	{ this.code = code;	}			
	}
	
	public static class AuthorizationAccessTokenResponse extends AuthorizationResponse {
		private static final long serialVersionUID = -3747257168763857914L;
		public AuthorizationAccessTokenResponse(HttpServletResponse response, String state, Token<AuthCodeTokenInfo> newAccessToken) { 
			super(response, state); 
			setAccessToken(newAccessToken.getTokenId());
			setAccessTokenExpiresIn(newAccessToken.getTokenLifeTime());		
		}
		private String  accessToken;
		public  String 	getAccessToken() 					{ return accessToken;	}
		public  void 	setAccessToken(String accessToken) 	{ this.accessToken = accessToken; }
		
		private Long    accessTokenExpiresIn;
		public  Long    getAccessTokenExpiresIn() 						  { return accessTokenExpiresIn;	}
		public  void    setAccessTokenExpiresIn(Long accessTokenExpiresIn) { this.accessTokenExpiresIn = accessTokenExpiresIn; }		
	}
}
