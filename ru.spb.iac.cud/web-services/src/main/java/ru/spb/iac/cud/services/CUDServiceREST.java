package ru.spb.iac.cud.services;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class CUDServiceREST {
	public static final String JSON_UTF8 = MediaType.APPLICATION_JSON + "; charset=UTF-8";
	
	protected @Context HttpServletRequest servletRequest;
	protected @Context TokenInfo.UserTokenInfo ctxUserTokenInfo;
	protected @Context TokenInfo.ClientAppTokenInfo ctxClientAppTokenInfo;
	protected static final Logger LOGGER = LoggerFactory.getLogger(CUDServiceREST.class);
	protected static final ContextAccessManager cam  = new ContextAccessManager();
	
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
	
	protected String getIDSystem() { 
		if(getUserTokenInfo()!=null)
			return ctxUserTokenInfo.client_id;
		if(getClientAppTokenInfo()!=null)
			return ctxClientAppTokenInfo.client_id;		
		return null; 
	}
	
	protected Long getIDUser() throws GeneralFailure {		
		return cam._.getUserIdByLogin(getUserTokenInfo().userLogin);
	}
	
	protected String getIPAddress() { return servletRequest.getRemoteAddr(); }
	
	
}
