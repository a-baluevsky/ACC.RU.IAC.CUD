package ru.spb.iac.cud.services.audit;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.core.oauth.ProtectedBy;
import ru.spb.iac.cud.core.oauth.Token.AbstractAccessToken.AccessTokenSubjectType;
import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;
import ru.spb.iac.cud.services.CUDService;
import ru.spb.iac.cud.services.CUDServiceREST;

@Path("/audit")
public class AuditServiceREST extends CUDServiceREST {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuditServiceREST.class);	
	private static final ContextAccessManager cam  = new ContextAccessManager();

	// use aggregation to reuse web service implementation class
	AuditServiceImpl impl;
	public AuditServiceREST() {
		//impl.serviceContext not accessible, so do injection manually
		final Class<CUDService> clsImpl = CUDService.class;
		try {			
			impl = new AuditServiceImpl();
			final Field fldServiceContext = clsImpl.getDeclaredField("serviceContext"); //getField("serviceContext"); //getDeclaredField("serviceContext");
			fldServiceContext.setAccessible(true);
			fldServiceContext.set(impl, serviceContext);
		} catch (Exception e) {		
			e.printStackTrace();
		}
	}

	// Proxy methods
	/*
   private static class AuditParams {
       private 	String 	uidUser;
       public 	String 	getUidUser() 				{ return uidUser; }
       public 	void   	setUidUser(String uidUser) 		{ this.uidUser = uidUser; }
       private 	List<AuditFunction> 	userFunctions;
       public 	List<AuditFunction> 	getUserFunctions() 				{ return userFunctions; }
       public 	void   	setUserFunctions(List<AuditFunction> userFunctions) 		{ this.userFunctions = userFunctions; }
   }
   @GET @Path("audit")
   @Produces(JSON_UTF8)
   public RESTResult audit(@QueryParam("uidUser") String uidUser,
        @QueryParam("userFunctions") List<AuditFunction> userFunctions) throws GeneralFailure {
       impl.audit(uidUser, userFunctions);
       return RESTResult.OK;
   }
   @POST @Path("audit")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public RESTResult audit(AuditParams params) throws GeneralFailure {
       audit(params.getUidUser(), params.getUserFunctions());
       return RESTResult.OK;
   }
   private static class AuditDataISByPeriodParams {
       private 	Date 	date1;
       public 	Date 	getDate1() 				{ return date1; }
       public 	void   	setDate1(Date date1) 		{ this.date1 = date1; }
       private 	Date 	date2;
       public 	Date 	getDate2() 				{ return date2; }
       public 	void   	setDate2(Date date2) 		{ this.date2 = date2; }
       private 	int 	rowsCount;
       public 	int 	getRowsCount() 				{ return rowsCount; }
       public 	void   	setRowsCount(int rowsCount) 		{ this.rowsCount = rowsCount; }
       private 	long 	rowStartOffset;
       public 	long 	getRowStartOffset() 				{ return rowStartOffset; }
       public 	void   	setRowStartOffset(long rowStartOffset) 		{ this.rowStartOffset = rowStartOffset; }
       private 	long 	filterUser;
       public 	long 	getFilterUser() 				{ return filterUser; }
       public 	void   	setFilterUser(long filterUser) 		{ this.filterUser = filterUser; }
   }
   @GET @Path("EISAuditPageByPeriod")
   @Produces(JSON_UTF8)
   public AuditDataPage EISAuditPageByPeriod(@QueryParam("date1") Date date1,
        @QueryParam("date2") Date date2,
        @QueryParam("rowsCount") int rowsCount,
        @QueryParam("rowStartOffset") long rowStartOffset,
        @QueryParam("filterUser") long filterUser) throws GeneralFailure {
     AuditDataPage retVal = null;
      return impl.EISAuditPageByPeriod(date1, date2, rowsCount, rowStartOffset, filterUser);
   }
   @POST @Path("EISAuditPageByPeriod")
   @Consumes(JSON_UTF8) @Produces(JSON_UTF8)
   public AuditDataPage EISAuditPageByPeriod(AuditDataISByPeriodParams params) throws GeneralFailure {
     AuditDataPage retVal = null;
      return impl.EISAuditPageByPeriod(date1, date2, rowsCount, rowStartOffset, filterUser);
   }
	
	
	*/
	
	//@XmlRootElement
	private static class AuditParams {
		private String uidUser;
		public String 	getUidUser() 							{ return uidUser; }
		public void 	setUidUser(String uidUser) 				{ this.uidUser = uidUser; }
		private List<AuditFunction> userFunctions;
		public List<AuditFunction> 	getUserFunctions() 						{ return userFunctions; }
		public void 	setUserFunctions(List<AuditFunction> userFunctions) 	{ this.userFunctions = userFunctions;		}
	}
	
	@POST
	@Consumes(JSON_UTF8) @Produces(JSON_UTF8)
	@ProtectedBy.AccessToken(AccessTokenSubjectType.UserAccessToken)
	public Response audit(@Context TokenInfo.UserTokenInfo userTokenInfo, AuditParams params) throws GeneralFailure {
		LOGGER.debug("audit");
		cam.audit(serviceContext.getIDSystem(), params.getUidUser(), params.getUserFunctions(), serviceContext.getIDUser(), serviceContext.getIPAddress());

		StringBuilder sbMsg = new StringBuilder("{result: 1}");		
		return Response.status(Response.Status.OK).entity(sbMsg).build();
	}
	
	private static class AuditDataISByPeriodParams {
		private Date date1, date2;
		private int rowsCount;
		private long rowStartOffset, filterUser;
		public Date getDate1() { return date1; }
		public void setDate1(Date date1) { this.date1 = date1; }
		public Date getDate2() { return date2; }
		public void setDate2(Date date2) {this.date2 = date2;}
		public int getRowsCount() {			return rowsCount;		}
		public void setRowsCount(int rowsCount) {			this.rowsCount = rowsCount;		}
		public long getRowStartOffset() {			return rowStartOffset;		}
		public void setRowStartOffset(long rowStartOffset) { this.rowStartOffset = rowStartOffset;		}
		public long getFilterUser() { return filterUser; }
		public void setFilterUser(long filterUser) { this.filterUser = filterUser; }
	}
	
	@PermitAll
	//@GET public AuditDataPage getAuditDataISByPeriod(@QueryParam("AuditDataISByPeriodParams") AuditDataISByPeriodParams params) throws GeneralFailure {
	@POST
	@Path("EISAuditPageByPeriod")
	@ProtectedBy.AccessToken(AccessTokenSubjectType.ClientAppAccessToken)
	@Consumes(JSON_UTF8) @Produces(JSON_UTF8)
	public AuditDataPage getAuditDataISByPeriod(AuditDataISByPeriodParams params) throws GeneralFailure {
		AuditDataPage adp = null;
		try {
			String sysCode = serviceContext.getIDSystem();
			LOGGER.debug("getAuditDataISByPeriod");
			adp = cam.getAuditDataISByPeriod(sysCode, params.getDate1(), params.getDate2(), 
					params.getRowsCount(), params.getRowStartOffset(), params.getFilterUser());
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return adp;
	}
	
	//@PermitAll
	@ProtectedBy.AccessToken(AccessTokenSubjectType.UserAccessToken)
	@GET @Path("test")
	@Consumes(JSON_UTF8) @Produces(JSON_UTF8)
	public Response test(@Context TokenInfo.UserTokenInfo userTokenInfo) throws GeneralFailure {
		StringBuilder sbMsg = new StringBuilder("<p><font color=#009900>0:00 ACCESS GRANTED!</font></p><br/>");
		sbMsg.append(serviceContext.getHttpServletRequest()==null?
				 "<p><font color=#990000>too bad: servletRequest==null</font></p><br/>"
				:"<p><font color=#009900>good! servletRequest"+serviceContext.getIPAddress()+"</font></p><br/>");
			

			sbMsg.append(userTokenInfo==null?
				 "<p><font color=#990000>too bad: userTokenInfo==null</font></p><br/>"
				:"<p><font color=#009900>good!"	+ serviceContext.getIDUser() +
					", " + serviceContext.getIDSystem()
				+"</font></p><br/>"); //userTokenInfo.userLogin
			
			//for (Long v : userFunctions) {
			//	sbMsg.append(v).append(" ");
			//}		
			
			
			/*
			sbMsg.append("getIDSystem: ").append(serviceContext.getIDSystem())
				.append(", serviceContext.getIDUser(): ").append()
				.append(", serviceContext.getIPAddress(): ").append(serviceContext.getIPAddress())
			;
			*/
			
		return Response.status(Response.Status.OK).entity("<br>"+sbMsg).build();
	} //public Response test
	
	// CORS support OPTION methods
	@PermitAll @OPTIONS public Response auditOptionsCORS() { return getOKResponse(); }
	@PermitAll @OPTIONS @Path("EISAuditPageByPeriod") public Response EISAuditPageByPeriodOptionsCORS() { return getOKResponse(); }	
	
}
