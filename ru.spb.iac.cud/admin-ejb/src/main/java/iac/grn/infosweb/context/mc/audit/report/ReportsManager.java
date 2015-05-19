package iac.grn.infosweb.context.mc.audit.report;

import iac.grn.infosweb.context.mc.audit.report.JasperReportService;
import iac.grn.infosweb.context.mc.audit.report.JasperReportService.REPORTSTATUS;
import iac.cud.infosweb.entity.AcUser;
import iac.cud.infosweb.entity.ReportsBssT;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;

import javaw.util.ArrayList;
import javaw.util.HashMap;
import javaw.util.SerializableList;
import javaw.util.SerializableMap;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.iterators.EntrySetMapIterator;
import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.log.Log;



@Name("reportsManager")
 public class ReportsManager implements java.io.Serializable {
   
   /**
	 * 
	 */
	private static final long serialVersionUID = 1412945973091895731L;

@Logger private static transient Log LOG;
   
   @In transient EntityManager entityManager;
   
   private SerializableList<ReportsBssT> reportsList;   
   private Date reportDate1, reportDate2;
   public Date    getReportDate1()                {   return reportDate1;                           }
   public void    setReportDate1(Date reportDate1)    {   this.reportDate1 = (reportDate1==null)?null:(Date)reportDate1.clone();                  }

   public Date    getReportDate2()                {   return reportDate2;                           }
   public void    setReportDate2(Date reportDate2)    {   this.reportDate2 = (reportDate2==null)?null:(Date)reportDate2.clone();                  }
   
   private JasperReportService getFreshReporter(String reportId) {      
      JasperReportService reporter=getReporter(reportId);
      if(reporter!=null)
      try {
         if(reporter.isStatusExpired())
            reporter.checkReportStatus();
      } catch (Exception e) {
         LOG.info("reportsManager:getFreshReporter: "+e);
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
   private SerializableMap<String, JasperReportService> getReporters(){
      SerializableMap<String, JasperReportService> reporters = null;
      try { 
         Object o = Component.getInstance("reporters",ScopeType.SESSION);
         if(o instanceof SerializableMap) {
            reporters = (SerializableMap<String, JasperReportService>)o;
         }
      }
      catch(org.jboss.seam.InstantiationException e) {
         LOG.info(this.getClass().getName()+".getReporters: 'reporters' not initialized");
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
   
   private String getTargetReportId() { return getExternalContextParameters().get("reportId");   }
   
    protected static String fmtRequestDate(Date dt) {
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       return df.format(dt);
    }  
    
   private JasperReportService getReporter(String reportId) {
      try {
         SerializableMap<String, JasperReportService> reporters = getReporters();
         return reporters.get(reportId);
      } catch (Exception e) {
         LOG.info("getReporter: "+e);
         return null;
      }      
   }   
   private JasperReportService findReporter() {
      return getReporters().get(getTargetReportId()); 
   }
   
   public void create_report(){
      LOG.info("reportsManager:create_report:01:"+this.reportDate1);
      LOG.info("reportsManager:create_report:02:"+this.reportDate2);
      try{
         String reportId = getTargetReportId();   
         if(reportId!=null){
            ReportsBssT rep = entityManager.find(ReportsBssT.class, Long.valueOf(reportId));
            String reportCode=rep.getReportCode(), orgCode = getOrgCode();
            SerializableMap<String, String> reportParameters = new HashMap<String, String>(5);
            reportParameters.put("reportId",    reportId);
            reportParameters.put("reportPath",  rep.getReportPath());
              reportParameters.put("reportName",  rep.getReportName());       
             reportParameters.put("ReportDate1", fmtRequestDate(reportDate1));
             reportParameters.put("ReportDate2", fmtRequestDate(reportDate2));          
              if(orgCode!=null) reportParameters.put("orgCode", orgCode);           
            JasperReportService reporter = new JasperReportService(reportCode, reportParameters);
            SerializableMap<String, JasperReportService> reporters = getReporters();
            reporters.put(reportId, reporter);
         }
         LOG.info("reportsManager:create_report:02");         
      }catch(Exception e){
         LOG.error("reportsManager:create_report:error:"+e);
      }             
   }

   public int checkReportStatus() {
      int curStatus=REPORTSTATUS.UNKNOWN.toInt();
      try {
         JasperReportService reporter = findReporter();
         curStatus=((reporter==null)?REPORTSTATUS.INITIAL:reporter.checkReportStatus()).toInt();
      }
      catch (Exception e) {         
         LOG.error(this.getClass().getName()+".checkReportStatus:error:"+e);
      }
      return curStatus;   
   }
   
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
         LOG.info("reportsManager:download_report:03");
      }catch(Exception e){
         LOG.error("reportsManager:download_report:error:"+e);
         
      }
             
   }
   private static void respondServletAlert(String Message) throws IOException {
      if(Message!=null) {
         StringBuilder sb = new StringBuilder("<script>alert('"); //Er\'ror!
         sb.append(Message.replaceAll("'", "\\\\'")).append("')</script>");         
         respondServletResult(null,null,"text/html; charset=utf-8", sb.toString().getBytes("utf-8"));
      }
   }   
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
      if(cau!=null && cau.getIsAccOrgManagerValue()) {
         orgCode = cau.getUpSign();
      }
      return orgCode;   
   }
   
   public SerializableList<ReportsBssT> getReportsList() {
      if(this.reportsList==null){
         String sFilter=("*".equals(this.getOrgCode()))?"":"WHERE idSrv IN(2)";
         this.reportsList = new ArrayList<ReportsBssT>(entityManager
                 .createQuery("SELECT r FROM ReportsBssT r "+sFilter+" order by orderNum ")
                 .getResultList());
      }      
      return this.reportsList;
   }

   public void setReportsList(SerializableList<ReportsBssT> reportsList) {
      this.reportsList = reportsList;
   }

   // NOTE: if reportId is a crap, then return false
   public boolean checkReportRunning(String reportId) {
      try {      
         JasperReportService reporter = getReporter(reportId);
         return reporter!=null && reporter.isRunning();
      } catch (Exception e) {
         LOG.error("reportsManager:getEnabledPollReportReady("+reportId+"):error:"+e);
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
            SerializableMap<String, JasperReportService> reporters = getReporters();
            for(Entry<String, JasperReportService> e: reporters.entrySet()) {            	
               JasperReportService reporter = reporters.get(e.getKey());
               if(reporter.isRunning()) 
                  r=true;   break;
            }
            setEnabledPollReportReady(r);
            return r;
         } else return (Boolean)oe;
      } catch (Exception e) {
         LOG.error("reportsManager:getEnabledPollReportReady:error:"+e);
      }
      return false;      
   }
   public void    setEnabledPollReportReady(boolean newValue) { 
      org.jboss.seam.contexts.Context ctx=Contexts.getSessionContext();
      ctx.set("enabledPollReportReady",  newValue);
      ctx.set("lastPollReportReadyTime", (new Date()).getTime());
   }



         
}
      
