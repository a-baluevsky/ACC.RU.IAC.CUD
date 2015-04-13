package iac.grn.infosweb.context.mc.audit.report;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import mypackage.Configuration;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 *
 * @author a.lapin, A.B.
 */
@Name("reporter")
public class JasperReportService implements Serializable {

	public enum REPORTSTATUS { //ReportStatus
		INITIAL,UNKNOWN,failed,DOWNLOADING,NOTFOUND,
		queued,execution,cancelled,ready;

		private static EnumMap<REPORTSTATUS, Integer> getIntMap(){
			EnumMap<REPORTSTATUS, Integer> m = new EnumMap<REPORTSTATUS, Integer>(REPORTSTATUS.class);
			m.put(NOTFOUND,  -4);
			m.put(cancelled, -3);
			m.put(failed, -1);
			m.put(UNKNOWN, 0);
			m.put(DOWNLOADING, 1);
			m.put(ready, 2);			
			m.put(execution, 3);
			m.put(queued, 4);
			m.put(INITIAL, 5);
			return m;
		}
		private static EnumMap<REPORTSTATUS, String> getStrMsgMap1(){
			EnumMap<REPORTSTATUS, String> m = new EnumMap<REPORTSTATUS, String>(REPORTSTATUS.class);
			m.put(INITIAL, 		"");
			m.put(UNKNOWN, 		"Неизвестный статус...");
			m.put(queued, 		"Поставлено в очередь на формирование отчёта");
			m.put(cancelled, 	"Формирование отчёта отменено!");
			m.put(execution, 	"Идёт формирование отчёта ...");
			m.put(ready, 		"Формирование отчёта завершено!");
			m.put(failed, 		"Ошибка при формировании отчёта!");
			m.put(NOTFOUND, 	"Отчёт не найден!");
			return m;
		}	
		private static EnumMap<REPORTSTATUS, String> getStrMsgMap2(){
			EnumMap<REPORTSTATUS, String> m = new EnumMap<REPORTSTATUS, String>(REPORTSTATUS.class);
			m.put(INITIAL, 		"");
			m.put(UNKNOWN, 		"Формирование отчёта не начато. Возможно, произошла ошибка!");
			m.put(cancelled, 	"Формирование отчёта отменено!");
			m.put(queued, 		"Формирование отчёта запланировано. Подождите, пока документ будет готов и появится ссылка для загрузки.");
			m.put(execution, 	"Формирование отчёта запущено! Подождите, пока появится ссылка для загрузки документа.");
			m.put(ready, 		"Формирование отчёта уже выполнено! Используйте ссылку для загрузки документа.");
			m.put(failed, 		"Возникла ошибка при формировании отчёта! Повторите попытку в следующий раз.");
			return m;
		}			
		private static final EnumMap<REPORTSTATUS, Integer> m_intMap = getIntMap();
		private static final EnumMap<REPORTSTATUS, String> m_strMsgMap1 = getStrMsgMap1(), m_strMsgMap2 = getStrMsgMap2();		
		private Object getFromMap(REPORTSTATUS status, EnumMap mapValue) {
			if(mapValue.containsKey(this)) return mapValue.get(this);
			else throw new AssertionError(this.getClass().getName()+ ".getFromMap: Unexpected enumerated value - "+this);			
		}
		public int 	  toInt() 			{ return (Integer)	getFromMap(this, m_intMap); }
		public String toShortText() 	{ return (String)	getFromMap(this, m_strMsgMap1);}
		public String toActionText() 	{ return (String)	getFromMap(this, m_strMsgMap2);}
		
		public static REPORTSTATUS valueOf(int runReportFlag) {
	        for (REPORTSTATUS rs : REPORTSTATUS.values())	        	
	            if (m_intMap.containsKey(rs))
	            	if(m_intMap.get(rs).equals(runReportFlag))
	            		return rs;
			return UNKNOWN;
		}
	}
	
	//public static EnumSet REPORTSTATUSERRORS = EnumSet.of(REPORTSTATUS.);
	/**
	 * 
	 */
	private static final long serialVersionUID = -2607225014972440102L;
	protected static DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	protected static DocumentBuilder docBuilder;	
	protected static DocumentBuilder getDocBuilder() throws ParserConfigurationException {		
		if(docBuilder!=null) return docBuilder;
		return docBuilder = docFactory.newDocumentBuilder();
	}
	protected static Document getNewDocument() throws ParserConfigurationException {
		return getDocBuilder().newDocument();
	}
	@Logger private Log log; private String loglinePrefix=this.getClass().getName()+": ";
	protected void LOG(String label, String messageLine) {
		LOG(label,messageLine,loglinePrefix);
	}
	protected static void LOG(String label, String messageLine, String loglinePrefix) {		
		System.out.println((new StringBuffer(loglinePrefix))
				.append(label).append(" - ").append(messageLine)
				.toString());
	}
	
    protected static void main(String[] argc) throws Exception {
        String requestStr=null; /*= createJasperRequestString("2015-02-23", "2015-03-15", "xlsx")*/;        
        HttpClient httpClient = new DefaultHttpClient();
        Object[] oData = sendCreateReportRequest(requestStr, httpClient);
        String answerStr = (String)oData[0]; 
        Header[] headersForCookie = (Header[])oData[1]; // Здесь достанем куки из первого запроса
        String SavedCookie = cookieHeaderToString(headersForCookie);
        String[] aIDs = getIDsFromCreateReportResponse(answerStr);
        String requestId = aIDs[0], exportId = aIDs[1]; 
        REPORTSTATUS status=checkReportStatus(requestId, SavedCookie,httpClient);        
        if(status==REPORTSTATUS.execution) {
        	status=waitForReportReady(requestId, SavedCookie,httpClient);
        }     
        System.out.println("Document creation "+(status==REPORTSTATUS.ready?"succeeded":"failed")+"!");        
        if(status==REPORTSTATUS.ready) {
        	byte[] data = downloadReportFileAsync(requestId, exportId, SavedCookie);
        	System.out.println("Downloaded: "+Arrays.toString(Arrays.copyOf(data, 20)));
        }
        httpClient.getConnectionManager().shutdown();
    }
    
    private String m_SavedCookie, m_RequestId, m_ExportId, m_ReportFileName, m_ReportContentType;
    private REPORTSTATUS m_ReportStatus;
    public REPORTSTATUS getReportStatus() {
		return m_ReportStatus;
	}
    public void setReportStatus(REPORTSTATUS newValue) {
		m_ReportStatus = newValue;
	}    
	public JasperReportService(String reportCode, HashMap<String, String> reportParameters) 
	throws TransformerConfigurationException, ParserConfigurationException, 
			TransformerException, IOException, SAXException, InterruptedException {
		LOG(".ctor: Creating Jasper reporting service: ", reportParameters.toString());
		HttpClient httpClient = new DefaultHttpClient();
		m_ReportFileName = reportCode+".xlsx"; m_ReportContentType="application/xlsx";
		LOG(".ctor: m_ReportFileName:", m_ReportFileName);
		String requestStr = createJasperRequestString(reportParameters, "xlsx");
		LOG(".ctor: requestStr:", requestStr);
		
		Object[] oData = sendCreateReportRequest(requestStr, httpClient);
		LOG(".ctor: oData:", Arrays.toString(oData));
		
		String[] aIDs = getIDsFromCreateReportResponse((String)oData[0]);
		LOG(".ctor: aIDs:", Arrays.toString(aIDs));
		
		m_RequestId = aIDs[0]; m_ExportId = aIDs[1]; 
		LOG(".ctor: m_RequestId:", m_RequestId);
		LOG(".ctor: m_ExportId:",  m_ExportId);
		
		m_SavedCookie = cookieHeaderToString((Header[])oData[1]);		
		m_ReportStatus=checkReportStatus(m_RequestId, m_SavedCookie, httpClient);
		LOG(".ctor: m_SavedCookie:", m_SavedCookie);
		LOG(".ctor: m_ReportStatus:",  m_ReportStatus.toString());	
		
		httpClient.getConnectionManager().shutdown();
		if(m_ReportStatus!=REPORTSTATUS.execution) {
			LOG(".ctor: Got result status", String.valueOf(m_ReportStatus));
		}
    }
	
	public String getReportFileName() 	 {		return m_ReportFileName;	}
	public String getReportContentType() {		return m_ReportContentType;	}
	
	//http://192.168.68.7:8080/jasperserver/rest_v2/reports/
	//private static String jasperServer = Configuration.getJasperServer();	
	//private static String jasperLogin = Configuration.getJasperLogin();	
	//private static String jasperPassword = Configuration.getJasperPassword();
	
	//"http://report.tp.toris.vpn/jasperserver"
	private static final String csReportSvrRt=getReportSvrRt(Configuration.getJasperServer());
	//"j_username=jasperadmin&j_password=jasperadmin"
	private static final String csReportCredStr=getReportCredStr(Configuration.getJasperLogin(),Configuration.getJasperPassword());
    //private static Header[] headersForCookie;
    //private static String answerStr;
    //private static String exportId;
    //private static String requestId;


	protected static String getReportCredStr(String username, String password) {
		return (new StringBuffer("j_username=")).append(username)
				.append("&j_password=").append(password).toString();
	}
	protected static String getReportSvrRt(String JasperServerConfig) {
		int p=JasperServerConfig.indexOf("/rest_v2/");
		return (p>0)?JasperServerConfig.substring(0, p):JasperServerConfig;
	}
	

    private static String urlConcat(String u1, String u2) {
    	boolean b1=u1.endsWith("/"), b2=u2.startsWith("/");
    	if(b1!=b2)
    		return u1+u2;
    	else if(b1) return u1+u2.substring(1);
    	else return u1+"/"+u2;
    	
    }
  
    /**
     * Создаём запрос на вызов шаблона отчёта с параметрами
     *
     * @return
     * @throws ParserConfigurationException
     * @throws TransformerConfigurationException
     * @throws TransformerException
     */
    
    public static String createJasperRequestString(HashMap<String, String> reportParameters, String TargetFormatFileExt) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        // root elements
        Document doc = getNewDocument();
        Element rootElement = doc.createElement("reportExecutionRequest");
        doc.appendChild(rootElement);

        // reportUnitUri elements
        Element reportUnitUri = doc.createElement("reportUnitUri");
        //urlConcat(csReportSvrRt, reportParameters.get("reportPath"))
        reportUnitUri.setTextContent(urlConcat("", reportParameters.get("reportPath"))); ///toris/urn_eis_cud/CUDReport2
        rootElement.appendChild(reportUnitUri);

        //  "<async>true</async>\n" elements
        Element async = doc.createElement("async");
        async.setTextContent("true");
        rootElement.appendChild(async);
        // <freshData>false</freshData>\n" elements
        Element freshData = doc.createElement("freshData");
        freshData.setTextContent("false");
        rootElement.appendChild(freshData);
        // <saveDataSnapshot>false</saveDataSnapshot>\n" elements
        Element saveDataSnapshot = doc.createElement("saveDataSnapshot");
        saveDataSnapshot.setTextContent("false");
        rootElement.appendChild(saveDataSnapshot);
        // "<outputFormat>xlsx</outputFormat>\n elements
        Element outputFormat = doc.createElement("outputFormat");
        outputFormat.setTextContent(TargetFormatFileExt);
        rootElement.appendChild(outputFormat);
        // <interactive>true</interactive>\n" elements
        Element interactive = doc.createElement("interactive");
        interactive.setTextContent("true");
        rootElement.appendChild(interactive);
        // <ignorePagination>true</ignorePagination> elements
        Element ignorePagination = doc.createElement("ignorePagination");
        ignorePagination.setTextContent("true");
        rootElement.appendChild(ignorePagination);

//        <parameters>
        Element parameters = doc.createElement("parameters");
        rootElement.appendChild(parameters);
        for(String sParmName: reportParameters.keySet()) {
	        Element reportParameter = doc.createElement("reportParameter");
	        Attr attr = doc.createAttribute("name");
	        attr.setValue(sParmName);
	        reportParameter.setAttributeNode(attr);
	        parameters.appendChild(reportParameter);	
	        Element value = doc.createElement("value");
	        value.setTextContent(reportParameters.get(sParmName));
	        reportParameter.appendChild(value);        	
        }

        // write the content into xml log
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "no");

        StreamResult result = new StreamResult(new StringWriter());
        DOMSource source = new DOMSource(doc);
        transformer.transform(source, result);
        return result.getWriter().toString();
    }
    protected static Object[] sendCreateReportRequest(String requestStr, HttpClient httpClient) throws IOException {
    	String sRqUrl=urlConcat(csReportSvrRt, "/rest_v2/reportExecutions?"+csReportCredStr);
    	LOG("sRqUrl:", sRqUrl, "sendCreateReportRequest: ");
        //1.1        
        HttpPost httppost = new HttpPost(sRqUrl);
        StringEntity stringEntity = new StringEntity(requestStr);
        stringEntity.setContentType("application/xml");
        httppost.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(httppost);

        return new Object[]{EntityUtils.toString(response.getEntity()),
        					response.getHeaders("Set-Cookie")};
    }
    
    protected static Document parseXmlDoc(String xmlData) throws SAXException, IOException, ParserConfigurationException {
    	return getDocBuilder().parse(new InputSource(new StringReader(xmlData)));
    }
    
    // Return: [0]: requestId, [1]: exportId
    protected static String[] getIDsFromCreateReportResponse(String responseString) throws SAXException, IOException, ParserConfigurationException {
    	HashMap<String, String> hmResult = extractXmlTagData(responseString, new String[]{"requestId", "id"});
    	return new String[]{ hmResult.get("requestId"), hmResult.get("id") };
    }    
    protected static HashMap<String, String> extractXmlTagData(String xmlData, String[] targetTagNames) throws SAXException, IOException, ParserConfigurationException {
        return extractXmlTagData(parseXmlDoc(xmlData), targetTagNames);
    }    
    protected static HashMap<String, String> extractXmlTagData(Document document, String[] targetTagNames) {
    	HashMap<String, String> hmResult = new HashMap<String, String>(); 
      	for(String tagName: targetTagNames) {
      		String strValue = null;
	        NodeList elements = document.getElementsByTagName(tagName);
	        strValue = fetchTextContent(elements);
	        hmResult.put(tagName, strValue);
    	}
      	return hmResult;
    }
    protected static String fetchTextContent(NodeList elements) {
    	return fetchTextContent(elements, null);
    }
    protected static String fetchTextContent(NodeList elements, String defaultValue) {
    	String sResult = defaultValue;
        for (int i = 0; i < elements.getLength(); i++) {
            Element n = (Element) elements.item(i);
            sResult = n.getTextContent();
        }    	
		return sResult;    	
    }
    
    protected static String cookieHeaderToString(Header[] headersForCookie) {
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<headersForCookie.length; ++i) 
    		sb.append(headersForCookie[i].toString().replaceAll("Set-Cookie: ", ""));
    	return sb.toString();
    }
    
    protected static HttpGet RestoreCookieGet(String URL, String SavedCookie) {        
        HttpGet httpget = new HttpGet(URL);
        httpget.addHeader("Cookie", SavedCookie);
        return httpget;
    }
    protected static HttpResponse getNewHttpClientResponse(String URL, String SavedCookie) throws ClientProtocolException, IOException {
    	//подменим куки из первого запроса, создадим новый клиент
        HttpClient httpClient2 = new DefaultHttpClient();
        HttpResponse r = httpClient2.execute(RestoreCookieGet(URL, SavedCookie));
        httpClient2.getConnectionManager().shutdown();
        return r;
    }
    
    long m_lastChkTimeReportStatus=0;
    // result:  -1: failed, 0: in progress, 1: ready
    public REPORTSTATUS checkReportStatus() throws ParserConfigurationException, InterruptedException, SAXException, IOException {
    	m_lastChkTimeReportStatus=(new Date()).getTime();
    	return m_ReportStatus=checkReportStatus(m_RequestId, m_SavedCookie, null);
    }
    public static REPORTSTATUS checkReportStatus(String requestId, String SavedCookie, HttpClient httpClient) 
    throws ParserConfigurationException, InterruptedException, SAXException, IOException {
    	if(requestId!=null) {
	    	String sUrl=urlConcat(csReportSvrRt, "/rest_v2/reportExecutions/"+requestId+"/status?"+csReportCredStr);
	    	LOG("sUrl:", sUrl, "checkReportStatus: ");
	    	HttpResponse r = (httpClient!=null)?httpClient.execute(new HttpGet(sUrl)):getNewHttpClientResponse(sUrl,SavedCookie);
	    	return checkReportStatus(EntityUtils.toString(r.getEntity()));
    	} else {
    		return REPORTSTATUS.INITIAL;
    	}
    }
    
    public static REPORTSTATUS checkReportStatus(String answerStr2) 
    throws ParserConfigurationException, SAXException, IOException {        
        NodeList elementStatus = parseXmlDoc(answerStr2).getElementsByTagName("status");
        String sStatus=fetchTextContent(elementStatus,"UNKNOWN");
        System.out.println("checkReportStatus: sStatus="+sStatus);
        return REPORTSTATUS.valueOf(sStatus);
    }
    
    public static REPORTSTATUS waitForReportReady(String requestId, String SavedCookie, HttpClient httpClient) throws ParserConfigurationException, InterruptedException, SAXException, IOException {
    	return waitForReportReady(requestId, SavedCookie, 10, httpClient); // 10 seconds timeout
    }
    
    public static REPORTSTATUS waitForReportReady(String requestId, String SavedCookie, float TimeoutSeconds, HttpClient httpClient) throws ParserConfigurationException, InterruptedException, SAXException, IOException {
    	// Необходимо проверить готов ли отчёт или нет, предварительно вытащить информацию про requestId и exportId
    	REPORTSTATUS status=checkReportStatus(requestId, SavedCookie,httpClient);
        while (status==REPORTSTATUS.execution) {
            Thread.sleep((int)(TimeoutSeconds*1000));
            status=checkReportStatus(requestId, SavedCookie,httpClient);
        }
        return status;
    }
    
    public byte[] downloadReportFile() throws IOException {
    	return downloadReportFileAsync(m_RequestId, m_ExportId, m_SavedCookie);
    }
    
    public static byte[] downloadReportFileAsync(String requestId, String exportId, String SavedCookie) throws IOException {
    	if(requestId!=null && exportId!=null) {
	    	String sUrl=urlConcat(csReportSvrRt,"/rest_v2/reportExecutions/"+requestId+
	        		"/exports/"+exportId+"/outputResource?"+csReportCredStr);
	    	LOG("sUrl:", sUrl, "downloadReportFileAsync: ");    	
	        HttpClient httpClient2 = new DefaultHttpClient();
	        HttpResponse response3 = httpClient2.execute(RestoreCookieGet(sUrl, SavedCookie));
	        byte[] r=EntityUtils.toByteArray(response3.getEntity());
	        httpClient2.getConnectionManager().shutdown();        
	        return r;
    	} else {
    		return null;
    	}
    }
    public boolean isStatusExpired() {
		return Math.abs((new Date()).getTime()-m_lastChkTimeReportStatus) > 1000;
    }
    // isRunning is cached with a timeout; e.g. it is kept actual automatically (within the timeout), but with improved performance on multiple prop access
	public boolean isRunning() throws ParserConfigurationException, InterruptedException, SAXException, IOException {		
		REPORTSTATUS rs = this.isStatusExpired()?this.checkReportStatus():m_ReportStatus;
		return REPORTSTATUS.queued.equals(rs)||REPORTSTATUS.execution.equals(rs);
	}
}
