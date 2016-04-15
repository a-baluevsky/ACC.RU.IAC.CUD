package ru.spb.iac.cud.services.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javaw.net.Net;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.as.web.security.SecurityContextAssociationValve;
import org.picketlink.common.constants.GeneralConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class AccessServicesWeb
 */
 public class AccessServicesWebLogin extends HttpServlet {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(AccessServicesWebLogin.class);

	private static final long serialVersionUID = 1L;

	private static final String SAMLMessageKey = "CUD_SAML_MESSAGE";

	private static final String HTTPMethodKey = "CUD_HTTP_METHOD";

	private static final String RequestQueryStringKey = "CUD_REQUEST_QUERY_STRING";

	private static final String RequestRequestURIKey = "CUD_REQUEST_REQUEST_URI";

	public AccessServicesWebLogin() {
		super();
	}

	private String parseUrl(String strURL) {
		return strURL; // TODO,SECURITY: check string & filter out URL (safe for dumping to a web page)		
	}
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String backUrl = null, login = null, password = null,  pswitch = null;
		String destination = "WebLoginAction";

		try {
			LOGGER.debug("service:01");

			org.apache.catalina.connector.Request request2 = null;
			request2 = SecurityContextAssociationValve.getActiveRequest();
			String samlRequestMessage = (String) request2.getSessionInternal()
					.getNote(GeneralConstants.SAML_REQUEST_KEY);
			String httpMethod = (String) request.getSession().getAttribute(
					"incoming_http_method");

			String multiAuthRequest = (String) request.getSession().getAttribute(
					"multi_auth_request");
			
			String RequestQueryString = (String) request.getSession()
					.getAttribute(RequestQueryStringKey);
			String RequestRequestURI = (String) request.getSession()
					.getAttribute(RequestRequestURIKey);

			backUrl = request.getParameter("backUrl");
			login = request.getParameter("login");
			password = request.getParameter("password");

			pswitch = request.getParameter("switch");

			// подумать - так как при проверке сесси€ создастс€
			
			/*
			 * //не дойдЄт до выполнени€ //перехватываетс€ в фильтре //if
			 * requestURI/.endsWith(cert_to_form_ie) //if(principal2/!=null)/{
			 * 
			 * if(tokenID/_attr!=null&&/isTokenActive(tokenID_attr)){ //sso && не
			 * было logout/ sendPost/(backUrl, response, "true", /tokenID_attr);
			 * }else{
			 */
			

			if (login == null && password == null) {
				response.setContentType("text/html; charset=windows-1251");
				PrintWriter pw = response.getWriter();
				HashMap<String, String> settings = new HashMap<String, String>();
				settings.put("RequestContextPath", request.getContextPath());
				settings.put("FormAction", destination);
				if(backUrl != null) settings.put("BackUrl", parseUrl(backUrl));
				settings.put("SAMLMessageKey", SAMLMessageKey);
				settings.put("SAMLMessageValue", samlRequestMessage);
				settings.put("HTTPMethodKey", HTTPMethodKey);
				settings.put("HTTPMethodValue", httpMethod);
				settings.put("RequestQueryStringKey", RequestQueryStringKey);
				settings.put("RequestQueryStringValue", RequestQueryString);
				settings.put("RequestRequestURIKey", RequestRequestURIKey);
				settings.put("RequestRequestURIValue", RequestRequestURI);
				if (pswitch == null || !"false".equals(pswitch)) {
					LOGGER.debug("service:pswitch");
				} else {
					settings.put("pswitch", "false");
				}
				if (request.getParameter("success") != null
					&& "false".equals(request.getParameter("success"))) {
					settings.put("ErrorMessageText", "ѕользователь не идентифицирован!");
				}
				settings.put("MultiAuthRequest", multiAuthRequest);
				// legacy UI switch
				DhLoginDlg loginForm = request.getParameter("lui") != null? 
						new DhLoginDlg.DhLoginDlg1(settings): 
						new DhLoginDlg.DhLoginDlg2(settings);
				pw.print(loginForm.toString());
				pw.close();

			} else { // новый режим - получаем от клиента логин/пароль
				StringBuilder sbProcess = new StringBuilder(request.getContextPath());
				
				sbProcess.
				append("/WebLoginAction?forceBack=true&backUrl=")
					.append(Net.secureEncodeResponse(backUrl))
				.append("&login=")
					.append(Net.secureEncodeResponse(login))
				.append("&password=")
					.append(Net.secureEncodeResponse(password));
				
				response.sendRedirect(sbProcess.toString());
			
			}

			
		} catch (Exception e3) {
			LOGGER.error("error3:" + e3.getMessage());
		}

	}


	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}



}
