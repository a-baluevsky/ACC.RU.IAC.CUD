package ru.spb.iac.cud.services.handlers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class ExceptionHandler {
	public static Response getResponse(Status status, String entity) {
		return Response.status(status).type(MediaType.TEXT_HTML).entity("<div style='background-color: #FFDD88; border: solid #FF6633;'><p><font color='#990000'>ERROR! </font>"+entity+"</p></div>").build();
	}
	
	@Provider
	public static class GeneralFailureMapper 
	extends ExceptionHandler
	implements ExceptionMapper<GeneralFailure> {
		@Override
		public Response toResponse(GeneralFailure exception) {
			return getResponse(Status.INTERNAL_SERVER_ERROR, exception.toString());
		}  
	}
	
	@Provider
	public static class SecurityExceptions_ClientAuthExceptionMapper 
	extends ExceptionHandler
	implements ExceptionMapper<SecurityExceptions.ClientAuthException> {
		@Override
		public Response toResponse(SecurityExceptions.ClientAuthException exception) {
			return getResponse(Status.INTERNAL_SERVER_ERROR, exception.toString());
		}  
	}	
	
}
