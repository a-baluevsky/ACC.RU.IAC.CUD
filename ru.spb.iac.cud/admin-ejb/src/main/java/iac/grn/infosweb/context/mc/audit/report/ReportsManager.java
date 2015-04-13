package iac.grn.infosweb.context.mc.audit.report;

import iac.grn.infosweb.context.mc.audit.report.JasperReportService;
import iac.grn.infosweb.context.mc.audit.report.JasperReportService.REPORTSTATUS;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.ReportsBssT;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;

import mypackage.Configuration;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.log.Log;



@Name("reportsManager")
 public class ReportsManager {
	
	@Logger private Log log;
	
	@In 
	EntityManager entityManager;
	
	private List<ReportsBssT> reportsList;	
	private Date reportDate1, reportDate2;
	
	//http://192.168.68.7:8080/jasperserver/rest_v2/reports/
	private String jasperServer = Configuration.getJasperServer();
	private String jasperLogin = Configuration.getJasperLogin();
	private String jasperPassword = Configuration.getJasperPassword();
	private String reportUrl;
	
	private JasperReportService getFreshReporter(String reportId) {		
		JasperReportService reporter=getReporter(reportId);
		if(reporter!=null)
		try {
			if(reporter.isStatusExpired())
				reporter.checkReportStatus();
		} catch (Exception e) {
			log.info("reportsManager:getFreshReporter: "+e);
		}
		return reporter;
	}
	
	//// ReportStatus: CodeString, StatusShortText, ActionText	
	public int getRunReportStatus(String reportId) {
		JasperReportService reporter=getFreshReporter(reportId);
		return(reporter==null)?REPORTSTATUS.INITIAL.toInt():reporter.getReportStatus().toInt();
	}
	public String getReportStatusCodeString(String reportId)  {
		JasperReportService reporter=getFreshReporter(reportId);
		return(reporter==null)?"":reporter.getReportStatus().toString();
	}
	public String getReportStatusShortText(String reportId)   {
		JasperReportService reporter=getFreshReporter(reportId);
		return(reporter==null)?"":reporter.getReportStatus().toShortText();
	}
	public String getReportStatusActionText(String reportId)  {
		JasperReportService reporter=getFreshReporter(reportId);
		return(reporter==null)?"":reporter.getReportStatus().toActionText();
	}
	public boolean isReportReady(String reportId) {
		JasperReportService reporter=getFreshReporter(reportId);
		return(reporter==null)?false:REPORTSTATUS.ready.equals(reporter.getReportStatus());
	}	
	
	// HashMap: reportId -> reporter
	private HashMap<String, JasperReportService> getReporters() throws Exception {
		HashMap<String, JasperReportService> reporters = null;
		try { 
			reporters = (HashMap<String, JasperReportService>)( Component.getInstance("reporters",ScopeType.SESSION));
		}
		catch (Exception e) {
			if(e instanceof org.jboss.seam.InstantiationException) {				
				log.info(this.getClass().getName()+".getReporters: 'reporters' not initialized");
			} else { 
				throw e;
			}
		}
		if(reporters==null) {
			reporters = new HashMap<String, JasperReportService>(2);
			Contexts.getSessionContext().set("reporters", reporters);				
		}
		return reporters;
	}
	
	private Map<String,String> getExternalContextParameters() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
	}
	
	private String getTargetReportId() { return getExternalContextParameters().get("reportId");	}
	
    protected static String fmtRequestDate(Date dt) {
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	return df.format(dt);
    }  
    
	private JasperReportService getReporter(String reportId) {
		try {
			HashMap<String, JasperReportService> reporters = getReporters();
			return reporters.get(reportId);
		} catch (Exception e) {
			return null;
		}		
	}	
	private JasperReportService findReporter() throws Exception {
		return getReporters().get(getTargetReportId()); 
	}
	
	public void create_report(){
		log.info("reportsManager:create_report:01:"+this.reportDate1);
		log.info("reportsManager:create_report:02:"+this.reportDate2);
		try{
			String reportId = getTargetReportId();	
			if(reportId!=null){
				ReportsBssT rep = entityManager.find(ReportsBssT.class, new Long(reportId));
				String reportCode=rep.getReportCode(), orgCode = getOrgCode();
				HashMap<String, String> reportParameters = new HashMap<String, String>(5);
				reportParameters.put("reportId", 	reportId);
				reportParameters.put("reportPath",  rep.getReportPath());
		        reportParameters.put("reportName",  rep.getReportName());    	
		    	reportParameters.put("ReportDate1", fmtRequestDate(reportDate1));
		    	reportParameters.put("ReportDate2", fmtRequestDate(reportDate2));	    	
		        if(orgCode!=null) reportParameters.put("orgCode", orgCode);	        
				JasperReportService reporter = new JasperReportService(reportCode, reportParameters);
				HashMap<String, JasperReportService> reporters = getReporters();
				reporters.put(reportId, reporter);
			}
			log.info("reportsManager:create_report:02");			
		}catch(Exception e){
			log.error("reportsManager:create_report:error:"+e);
		}			 	
	}

	public int checkReportStatus() {
		int curStatus=REPORTSTATUS.UNKNOWN.toInt();
		try {
			JasperReportService reporter = findReporter();
			curStatus=((reporter==null)?REPORTSTATUS.INITIAL:reporter.checkReportStatus()).toInt();
		}
		catch (Exception e) {			
			log.error(this.getClass().getName()+".checkReportStatus:error:"+e);
		}
		return curStatus;	
	}
	
/*	
	private void download_report_sync_original(String reportType) throws NamingException{
			String reportCode = FacesContext.getCurrentInstance().getExternalContext()
			             .getRequestParameterMap()
			             .get("reportCode");			  
			Context ctx = new InitialContext();
			ReportsManagerLocal aml = (ReportsManagerLocal) ctx.lookup("java:global/ReportsServices/ReportsManager!ru.spb.iac.cud.reports.ReportsManagerLocal");
			ReportDownloadItem report = aml.download_report(reportCode, reportType);
			byte[] content = report.getContent();
			int flagExec = 	report.getFlagExec();
			
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
			
			OutputStream os = response.getOutputStream();
			
			//1 - успешно			
			//0 - формирование ещё не завершено
			//-1 - техническая ошибка (ошибка при формировании)			
			//-2 - нет ресурса (нет репортера, не был запроса на формир. отчёта)
			if(flagExec==1){
				byte[] content = ;
				response.setHeader("Content-disposition", "attachment; filename="+reporter.getReportFileName());
				response.setContentType(reporter.getReportContentType());			 
				os.write(content);
			}else if(flagExec==-2){
				 response.setContentType("text/html; charset=utf-8");				 
				 os.write("Запрашиваемый ресурс не найден!".getBytes("utf-8"));
				 os.write("<br/><br/><a href=\"javascript:window.close();\" style=\"color:black;font-size:18px!important;\"> Закрыть </a>".getBytes("utf-8"));
				         
		   	}else if(flagExec==0){
				 response.setContentType("text/html; charset=utf-8");				 
				 os.write("Формирование отчёта ещё не завершено!".getBytes("utf-8"));
				 os.write("<br/><br/><a href=\"javascript:window.close();\" style=\"color:black;font-size:18px!important;\"> Закрыть </a>".getBytes("utf-8"));
				         
		   	}else //if(flagExec==-2)
		   	{
				 response.setContentType("text/html; charset=utf-8");				 
				 os.write(("При скачивании произошла ошибка ! Код: "+String.valueOf(flagExec)).getBytes("utf-8"));
				 os.write("<br/><br/><a href=\"javascript:window.close();\" style=\"color:black;font-size:18px!important;\"> Закрыть </a>".getBytes("utf-8"));
		   	}			
			  os.flush(); os.close();
			  FacesContext.getCurrentInstance().responseComplete();
	}
*/
	
	public void download_report(){
		try{
			JasperReportService reporter = findReporter();
			if(reporter==null) {
				respondServletAlert("Запрашиваемый ресурс не найден!");
			} else {
				switch (reporter.checkReportStatus()) {
					case ready: respondServletResult("Content-disposition", "attachment; filename="+reporter.getReportFileName(), 
													 reporter.getReportContentType(), reporter.downloadReportFile());
						break;
					case queued:
					case execution: 
						respondServletAlert("Формирование отчёта ещё не завершено!"); 
						break;
					case failed:
						respondServletAlert(REPORTSTATUS.failed.toShortText()); 
						break;
				default: respondServletAlert("При скачивании произошла ошибка! ["+reporter.getReportStatus()+"]");
					break;
				}
			}		    
			log.info("reportsManager:download_report:03");
		}catch(Exception e){
			log.error("reportsManager:download_report:error:"+e);
			
		}
			 	
	}
	private static void respondServletAlert(String Message) throws UnsupportedEncodingException, IOException {
		if(Message!=null) {
			StringBuffer sb = new StringBuffer("<script>alert('"); //Er\'ror!
			sb.append(Message.replaceAll("'", "\\\\'")).append("')</script>");			
			respondServletResult(null,null,"text/html; charset=utf-8", sb.toString().getBytes("utf-8"));
		}
	}	
//	private static void respondServletMessage(String Message) throws UnsupportedEncodingException, IOException {
//		if(Message!=null) respondServletResult(null,null,"text/html; charset=utf-8",Message.getBytes("utf-8"));
//	}
	private static void respondServletResult(String Header1, String Header2, String ContentType, byte[] content) throws IOException {
		FacesContext ctx=FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) ctx.getExternalContext().getResponse();
		OutputStream os = response.getOutputStream();
		if(Header1!=null && Header2!=null) response.setHeader(Header1,Header2);
		if(ContentType!=null) response.setContentType(ContentType);
		os.write(content);
		os.flush(); os.close();
		ctx.responseComplete();
	}
	
	private String getOrgCode() {
		String orgCode="*";
		AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
		if(cau!=null) {
			if(cau.getIsAccOrgManagerValue()) {		
				orgCode = cau.getUpSign();
			}
		}
		return orgCode;	
	}
	
	public void server_report(String reportType){
		  //сделали даты обязятельными!!!
		try{
			log.info("reportsManager:server_report:01");
			String reportId = getExternalContextParameters().get("reportId");
			ReportsBssT rep = entityManager.find(ReportsBssT.class, new Long(reportId));
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			if (reportDate1 != null && reportDate2 != null) {				
				log.info("reportsManager:server_report:02");				
			} else if (reportDate1 != null) {
				reportDate2 = new Date();
			} else if (reportDate2 != null) {
				Calendar cln = Calendar.getInstance();
				cln.set(Calendar.YEAR, 2000);
				reportDate1 = cln.getTime();
			} else {			
				Calendar cln = Calendar.getInstance();
				cln.set(Calendar.YEAR, 2000);
				reportDate1 = cln.getTime();
				reportDate2 = new Date();
			}
			reportUrl = jasperServer+rep.getReportPath()+"?"
					+ "ReportDate1="+df.format(reportDate1)
					+ "&ReportDate2="+df.format(reportDate2)
					+ "&orgCode="+getOrgCode()
					+ "&j_username="+jasperLogin
					+ "&j_password="+jasperPassword;
			log.info("reportsManager:server_report:02");
		}catch(Exception e){
			log.error("reportsManager:server_report:error:"+e);
		}
	}

	
	public List<ReportsBssT> getReportsList() {
		if(this.reportsList==null){
			String sFilter=("*".equals(this.getOrgCode()))?"":"WHERE idSrv IN(2)";
			this.reportsList = entityManager
					.createQuery("SELECT r FROM ReportsBssT r "+sFilter+" order by orderNum ")
					.getResultList();
		}		
		return this.reportsList;
	}

	public void setReportsList(List<ReportsBssT> reportsList) {
		this.reportsList = reportsList;
	}

	// NOTE: if reportId is a crap, then return false
	public boolean checkReportRunning(String reportId) {
		try {		
			JasperReportService reporter = getReporter(reportId);
			return reporter!=null && reporter.isRunning();
		} catch (Exception e) {
			log.error("reportsManager:getEnabledPollReportReady("+reportId+"):error:"+e);
		}
		return false;			
	}
 
	// global prop (for all reports) 
	public boolean  getEnabledPollReportReady() {
		try {
			Object oe=Component.getInstance("enabledPollReportReady",ScopeType.SESSION);
			boolean bUpdateReportStatus=oe==null;
			if(!bUpdateReportStatus) { // really?
				Object ot=Component.getInstance("lastPollReportReadyTime",ScopeType.SESSION); // use cached value for improved performance
				bUpdateReportStatus=(ot==null)?true:Math.abs((new Date()).getTime()-((Long)ot))>1000;
			}
			if(bUpdateReportStatus) {
				boolean r=false;
				HashMap<String, JasperReportService> reporters = getReporters();
				for(String k: reporters.keySet()) {
					JasperReportService reporter = reporters.get(k);
					if(reporter.isRunning()) 
						r=true;	
				}
				setEnabledPollReportReady(r);
				return r;
			} else return (Boolean)oe;
		} catch (Exception e) {
			log.error("reportsManager:getEnabledPollReportReady:error:"+e);
		}
		return false;		
	}
	public void 	setEnabledPollReportReady(boolean newValue) { 
		org.jboss.seam.contexts.Context ctx=Contexts.getSessionContext();
		ctx.set("enabledPollReportReady",  newValue);
		ctx.set("lastPollReportReadyTime", (new Date()).getTime());
	}

	public Date 	getReportDate1() 					{	return reportDate1;									}
	public void 	setReportDate1(Date reportDate1) 	{	this.reportDate1 = reportDate1;						}

	public Date 	getReportDate2() 					{	return reportDate2;									}
	public void 	setReportDate2(Date reportDate2) 	{	this.reportDate2 = reportDate2;						}

	public String 	getReportUrl() 						{	return reportUrl;									}
	public void 	setReportUrl(String reportUrl) 		{	this.reportUrl = reportUrl;							}

	
			
}
		
