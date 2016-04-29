package ru.spb.iac.cud.services.handlers;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.services.CUDServiceREST;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import ru.spb.iac.cud.services.CUDServiceREST.RESTResult;

public class ExceptionHandler {
	
	@XmlRootElement	@JsonSerialize	
	private static class ErrInfo extends RESTResult {
		private static final long serialVersionUID = 1L;
		public ErrInfo() {
			status = "ERROR";			
		}
	}

	
	public static Response getResponse(Status status, String entity) {
		return Response.status(status).type(MediaType.TEXT_HTML).entity("<div style='background-color: #FFDD88; border: solid #FF6633;'><p><font color='#990000'>ERROR! </font>"+entity+"</p></div>").build();
	}
	public static Response getJSONResponse(Status status, Exception exception) {
		final ErrInfo info = new ErrInfo();
		info.setMessage(exception.getMessage());
		//exception
		return HeadersFilter.setHeaderAccCtlAllowOrigin(Response.status(status).type(CUDServiceREST.JSON_UTF8).entity(info)).build();
	}
	
	// Add registration into ru.spb.iac.cud.services.CUDRsApp (addProviderClasses)

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

	/*
	@Provider
	public static class JsonMappingExceptionMapper 
	extends ExceptionHandler
	implements ExceptionMapper<JsonProcessingException> {
		@Override
		public Response toResponse(JsonProcessingException exception) {
			return getJSONResponse(Status.OK, exception); //Status.INTERNAL_SERVER_ERROR
		}  
	}
	*/
	
	@Provider
	public static class GlobalExceptionHandler 
	extends ExceptionHandler
	implements ExceptionMapper<Exception> {
		@Override
		public Response toResponse(Exception exception) {
			return getJSONResponse(Status.INTERNAL_SERVER_ERROR, exception); //
		}
	}	
}
