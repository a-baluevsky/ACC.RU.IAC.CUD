package ru.spb.iac.cud.services;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.services.handlers.HeadersFilter;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebServiceContext;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class CUDServiceREST {
	public static final String JSON_UTF8 = MediaType.APPLICATION_JSON + "; charset=UTF-8";
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(CUDServiceREST.class);
	protected static final ContextAccessManager cam  = new ContextAccessManager();

	@Resource(name = "wsContext") private WebServiceContext wsContext;	
	protected @Context HttpServletRequest servletRequest;
	protected @Context TokenInfo.UserTokenInfo ctxUserTokenInfo;
	protected @Context TokenInfo.ClientAppTokenInfo ctxClientAppTokenInfo;	
	
	protected static class CUDRESTServiceContext implements ICUDServiceContext {
		@Resource(name = "wsContext") private WebServiceContext wsContext;
		
		protected @Context HttpServletRequest servletRequest;
		protected @Context TokenInfo.UserTokenInfo ctxUserTokenInfo;
		protected @Context TokenInfo.ClientAppTokenInfo ctxClientAppTokenInfo;
		
		protected TokenInfo.UserTokenInfo getUserTokenInfo() {
			if(ctxUserTokenInfo==null) {
				ctxUserTokenInfo = ResteasyProviderFactory.getContextData(TokenInfo.UserTokenInfo.class);
			}
			return ctxUserTokenInfo;
		}		
		protected TokenInfo.ClientAppTokenInfo getClientAppTokenInfo() {
			if(ctxClientAppTokenInfo==null) {
				ctxClientAppTokenInfo = ResteasyProviderFactory.getContextData(TokenInfo.ClientAppTokenInfo.class);
			}
			return ctxClientAppTokenInfo;
		}	
		
		@Override public HttpServletRequest 	getHttpServletRequest() throws GeneralFailure { return servletRequest; }
		@Override public String 				getIPAddress() throws GeneralFailure { return servletRequest.getRemoteAddr(); }

		@Override
		public String getIDSystem() throws GeneralFailure {
			if(getUserTokenInfo()!=null)
				return ctxUserTokenInfo.client_id;
			else if(getClientAppTokenInfo()!=null)
				return ctxClientAppTokenInfo.client_id;
			else
				throw new GeneralFailure("Can't get IDSystem");
		}

		@Override
		public Long getIDUser() throws GeneralFailure {
			return cam._.getUserIdByLogin(getUserTokenInfo().userLogin);
		}
		
	}
	protected CUDRESTServiceContext serviceContext = new CUDRESTServiceContext();
	
	// CORS support
    public static Response getOKResponse() {
    	return Response.status(HttpServletResponse.SC_OK).build();
    }
    public static Response getOptionsCORSResponse(String AllowMethods, String AllowHeaders) {
    	return HeadersFilter.setHeaderAccCtlAllowOrigin(Response.status(HttpServletResponse.SC_OK)    			
    			.header("Access-Control-Allow-Methods", AllowMethods==null? "POST,GET,OPTIONS": "POST,GET,OPTIONS,"+AllowMethods)
    			.header("Access-Control-Allow-Headers", AllowHeaders==null? "Origin, Content-Type, Accept": "Origin, Content-Type, Accept, " + AllowHeaders))
    			.build();
    }
    
	@XmlRootElement	@JsonSerialize	
	public static class RESTResult implements Serializable  {		
		protected static final long serialVersionUID = 1L;
		protected 	String 	message;
		public 		String 	getMessage() { return message; }
		public 		void 	setMessage(String message) { this.message = message; }
		protected 	String 	status = "OK";
		public 		String 	getStatus() { return status; }
		public 		void 	setStatus(String status) { this.status = status; }
		public static final RESTResult OK = new RESTResult();
	}
}
