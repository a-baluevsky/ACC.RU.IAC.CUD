package org.picketlink.oauth.provider.model.exceptions;

import javax.annotation.security.PermitAll;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.exceptions.GeneralFailure;

import javax.ws.rs.ext.ExceptionMapper;
import javax.xml.bind.annotation.XmlRootElement;

public class OAuthProviderException extends GeneralFailure {
	@XmlRootElement @JsonSerialize
	static class ResultMessage {
		protected String error, error_description;
		public ResultMessage(String error, String error_description, String error_uri) {
			this.error = error; this.error_description = error_description; this.error_uri = error_uri;
		}
		public String getError() { return error; }
		public void setError(String error) { this.error = error;	}
		public String getError_description() { return error_description;	}
		public void setError_description(String error_description) {	this.error_description = error_description;	}
		// optional: URI with error description
		protected String error_uri;
		public String 	getError_uri() 					{ return error_uri;	}
		public void 	setError_uri(String error_uri) 	{ this.error_uri = error_uri; }
	}
	protected ResultMessage rm;
	//public 		ResultMessage getResultMessage() { return rm; }
	protected 	OAuthProviderException() { super(""); }
	protected OAuthProviderException(String error, String error_description, String error_uri) {
		super(error_description); this.rm = new ResultMessage(error, error_description, error_uri);
	}	
	protected OAuthProviderException(String error, String error_description) {
		this(error, error_description, null);
	}
	protected OAuthProviderException(Exception e, String error, String error_description, String error_uri) {
		super(e); this.rm = new ResultMessage(error, error_description, error_uri);
	}

	public OAuthProviderException(Exception e) { this(e, "SERVER_ERROR", e.toString(), null); }
	public OAuthProviderException(OAPE oape, String error_description) { this(oape.toString(), error_description); }

	public void throwIt(String error, String error_description, String error_uri) throws OAuthProviderException {
		throw new OAuthProviderException(error, error_description, error_uri);
	}

	// Usage sample: OAPE.AuthorizationException.throwIt(OAuthProviderExceptionCode.invalid_request);
	public static enum OAuthProviderExceptionCode {
		// AuthorizationException Code, CodeResponse
		access_denied
			("Access denied! The resource owner or authorization server denied the request."), 
		invalid_request
			("The request is missing a required parameter, includes an unsupported parameter value, or is otherwise malformed."),
		invalid_request_state
			("The request is missing a valid state. Processing canceled to prevent X-site hacking."),		
		unauthorized_client
			("The client is not authorized to request an authorization code using this method, or not authorized to use this authorization grant type."),
		unsupported_response_type
			("The authorization server does not support obtaining an authorization code using this method."),
		invalid_scope
			("The requested scope is invalid, unknown, malformed, or exceeds the scope granted by the resource owner."), 
		server_error
			("The authorization server encountered an unexpected condition that prevented it from fulfilling the request."),
		temporarily_unavailable
			("The authorization server is currently unable to handle the request because of a temporary overloading or maintenance of the server.")
		,// TokenException Code, TokenResponse, 
		invalid_client
	        /**
	        Client authentication failed (e.g. unknown client, no client authentication included, or unsupported
	        authentication method).  The authorization server MAY return an HTTP 401 (Unauthorized) status code to indicate
	        which HTTP authentication schemes are supported.  If the client attempted to authenticate via the "Authorization"
	        request header field, the authorization server MUST respond with an HTTP 401 (Unauthorized) status code, and
	        include the "WWW-Authenticate" response header field matching the authentication scheme used by the client.
	        */		
			("Client authentication failed (e.g. unknown client, no client authentication included, or unsupported authentication method)."),
		invalid_grant //invalid_authorization_code
			("The provided authorization grant (e.g. authorization code, resource owner credentials, client credentials) is invalid, expired, revoked, does not match the redirection URI used in the authorization request, or was issued to another client."),
		unsupported_grant_type
			("The authorization grant type is not supported by the authorization server."),
		unsupported_token_info_type
			("The token information type is not supported by the authorization server.")			
		,//ResourceResponse
		expired_token
			("Token expired"),
		insufficient_scope
			("The request requires higher privileges than provided by the access token."),
		insufficient_scope_openid
			("The request requires higher privileges than provided by the access token. openid MUST be in scope!"),			
		invalid_token
			("The access token provided is expired, revoked, malformed, or invalid for other reasons.")
		;
		private String error_description;
		private OAuthProviderExceptionCode(String error_description) { this.error_description = error_description; }
		public  String 	getDescription() 			{ return this.error_description; }
		public  void 	setDescription(String description) { this.error_description = description; }			
	}
	// OA-uth-P-rovider-E-xception
	/*
	 * 
	 */
	public static enum OAPE { TestException(new OAuthProviderException() {
				@Override public void throwIt(String msg) throws GeneralFailure { throwIt(TestException.toString(), msg, null); }
			}),
			AuthorizationException(new OAuthProviderException() {
				@Override public void throwIt(String msg) throws GeneralFailure { throwIt(AuthorizationException.toString(), msg, null); }
			}),
			TokenException(new OAuthProviderException() {
				@Override public void throwIt(String msg) throws GeneralFailure { throwIt(TokenException.toString(), msg, null); }
			}),
			OAuthRegisterException(new OAuthProviderException() {
				@Override public void throwIt(String msg) throws GeneralFailure { throwIt(OAuthRegisterException.toString(), msg, null); }
			}),
			ServerException(new OAuthProviderException() {
				@Override public void throwIt(String msg) throws GeneralFailure { throwIt(OAuthProviderExceptionCode.server_error.toString(), msg, null); }
			})
		;
		private OAuthProviderException x;
		private <E extends OAuthProviderException>OAPE(E x) { this.x = x; }
		public void throwIt(String error_description) throws GeneralFailure { this.x.throwIt(error_description); }
		public void throwIt(Enum<?> code) throws GeneralFailure {
			if(code instanceof OAuthProviderExceptionCode) {				
				final OAuthProviderExceptionCode aeCode = (OAuthProviderExceptionCode)code;
				final String aeCodeName = aeCode.name();
				String errorUrl = this.x.rm == null? null: "/error_description/"+this.x.rm.error+"/"+aeCodeName;
				this.x.throwIt(aeCodeName, aeCode.error_description, errorUrl);
			} else {
				throwIt(code.toString());
			}
		}
	}
	
	@Provider public static class Handler
	implements ExceptionMapper<OAuthProviderException> {
		@Override
		public Response toResponse(OAuthProviderException exception) {	
			return Response.status(Status.BAD_REQUEST).entity(exception.rm).build();
		}
	}
	
	private static Response serverErrorResponse(Exception exception) {
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(new ResultMessage(
			OAuthProviderExceptionCode.server_error.toString(),
			exception.getMessage(), null
		)).build();
	};

	public static @Provider class OAuthProblemExceptionHandler
	implements ExceptionMapper<OAuthProblemException> {
		@Override public Response toResponse(OAuthProblemException exception) { return serverErrorResponse(exception); }
	}
	public static @Provider class OAuthSystemExceptionHandler
	implements ExceptionMapper<OAuthSystemException> {
		@Override public Response toResponse(OAuthSystemException exception) { return serverErrorResponse(exception); }
	}	
}
