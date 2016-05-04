package ru.spb.iac.cud.services.application;

import ru.spb.iac.cud.services.CUDService;
import ru.spb.iac.cud.services.CUDServiceREST;
import ru.spb.iac.cud.services.admin.AdminServiceImpl;

import java.lang.reflect.Field;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;

import ru.spb.iac.cud.context.application.ContextApplicationResultManager;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.app.AppResult;
import ru.spb.iac.cud.items.app.AppResultRequest;
import ru.spb.iac.cud.items.app.AppResultRequestList;


import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/app/result")
public class ApplicationResultServiceREST extends CUDServiceREST {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResultServiceImpl.class);
	
	// use aggregation to reuse web service implementation class
	ApplicationResultServiceImpl impl;
	private ApplicationResultServiceImpl impl() { return impl==null? impl=switchServiceContext(new ApplicationResultServiceImpl()): impl; }	
	

   private static class ResultParams {
       private 	AppResultRequestList 	appResultRequestList;
       public 	AppResultRequestList 	getAppResultRequestList() 				{ return appResultRequestList; }
       public 	void   	setAppResultRequestList(AppResultRequestList appResultRequestList) 		{ this.appResultRequestList = appResultRequestList; }
   }
   @GET //@Path("result")
   @Produces(JSON_UTF8)
   public List<AppResult> result(@QueryParam("appResultRequestList") AppResultRequestList appResultRequestList) throws GeneralFailure {
     List<AppResult> retVal = null;
      return impl().result(appResultRequestList);
   }
   @POST //@Path("result")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public List<AppResult> result(ResultParams params) throws GeneralFailure {
     List<AppResult> retVal = null;
      return impl().result(params.appResultRequestList);
   }

	// CORS support OPTION methods
	@PermitAll @OPTIONS	public Response resultOptionsCORS() 		{ return getOKResponse(); }  

}
