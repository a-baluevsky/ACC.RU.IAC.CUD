package ru.spb.iac.cud.services.handlers;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;

import ru.spb.iac.cud.core.oauth.SecurityCheck;
import ru.spb.iac.cud.core.oauth.TokenInfo;

@Provider
@ServerInterceptor
public class OAuthHandler implements /*Handler<MessageContext>,*/ PreProcessInterceptor {
	//private static final Logger LOGGER = LoggerFactory.getLogger(OAuthHandler.class);


	private static String getAuthHd(Map<String, Object> httpHeaders) {
		try {
			return ((List<String>) httpHeaders.get("authorization")).get(0);
		} catch (Exception e) {
			return null;
		}
	}


	private static boolean validateRequest(HttpRequest request, ResourceMethod method) {
		/*
		final int protectionAnnotationsFlags = SecurityCheck.getProtectionAnnotationsFlags(request, method);
		final boolean isProtectedRequest = protectionAnnotationsFlags!=0;
		if(isProtectedRequest)	{			
			final String authHd = getAuthHd(request.getHttpHeaders());
			return SecurityCheck.validateToken(TokenInfo.fetchTokenFromAuthHeader(authHd), protectionAnnotationsFlags);
		} // if request is protected
		*/
		return true; // by default, validation succeeded for an unprotected request		
	}

	/*
	@Override
	public boolean handleMessage(MessageContext mc) {
		//HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		final Map<String, Object> httpHeaders = (Map<String, Object>) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
		if(!validateRequest(getAuthHd(httpHeaders)))
			throw new ProtocolException("handleMessage - 403 FORBIDDEN");
		return true;
	}
	@Override	public boolean handleFault(MessageContext context) { return true;	}
	@Override	public void close(MessageContext context) { LOGGER.debug("close");	}
	*/
	
	
	@Override
	public ServerResponse preProcess(HttpRequest request, ResourceMethod method)
			throws Failure, WebApplicationException {
		if(!validateRequest(request, method)) {
            ServerResponse response = new ServerResponse();
            response.setEntity("preProcess - 403 FORBIDDEN");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            return response;
		}
		return null;
	}
	
	private static String getAuthHd(final HttpHeaders httpHeaders) {
		try {
			return httpHeaders.getRequestHeader("authorization").get(0);
		} catch(Exception e) {
			return null;
		}
	}
}
