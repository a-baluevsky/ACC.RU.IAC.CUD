package ru.spb.iac.cud.services.web;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map.Entry;

import javaw.lang.Strings;

public abstract class DhLoginDlg {
	protected String RequestContextPath;
	protected String FormAction;
	protected String BackUrl;
	protected String SAMLMessageKey;
	protected String SAMLMessageValue;
	protected String HTTPMethodKey;
	protected String HTTPMethodValue;
	protected String RequestQueryStringKey;
	protected String RequestQueryStringValue;
	protected String RequestRequestURIKey;
	protected String RequestRequestURIValue;
	protected String pswitch;
	protected String ErrorMessageText;
	protected String MultiAuthRequest;	
	
	
	protected StringBuilder dhHeadContents = new StringBuilder("<title>ПС ААА ТОРИС | Вход</title>");
	protected StringBuilder dhBody = new StringBuilder();	
	public DhLoginDlg(HashMap<String, String> settings) {		
		for(Field fld: DhLoginDlg.class.getDeclaredFields()) { //getFields			
			String fldName = fld.getName();
			if(settings.containsKey(fldName))
				try {
					fld.set(this, settings.get(fldName));
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		dhAppendCtxScript(dhHeadContents, "/js/login.js");
	}

	@Override public String toString() { return buildHTML(dhHeadContents, dhBody).toString(); }
	
	protected static StringBuilder buildHTML (
			StringBuilder dhHeadContents, 
			StringBuilder dhBody) {
		StringBuilder sbOut = new StringBuilder("<html>");
		if(dhHeadContents!=null)
			sbOut.append("<HEAD>").append(dhHeadContents).append("</HEAD>");
		if(dhBody!=null)
			sbOut.append(dhBody);
		sbOut.append("</html>");
		return sbOut;
	}
	
	protected static StringBuilder dhAppendInputHidden(StringBuilder sbOut, String key, String value) {
		if(!Strings.isNullOrEmpty(value))
			sbOut.append("<INPUT TYPE=\"HIDDEN\" NAME=\"").append(key)
				 .append("\" VALUE=\"").append(value).append("\"/>");
		return sbOut;
	}
	
	protected void dhAppendHiddenInputs(StringBuilder sbOut) {
		dhAppendInputHidden(sbOut, "backUrl", 				BackUrl);
		dhAppendInputHidden(sbOut, SAMLMessageKey, 			SAMLMessageValue);
		dhAppendInputHidden(sbOut, HTTPMethodKey, 			HTTPMethodValue);
		dhAppendInputHidden(sbOut, RequestQueryStringKey, 	RequestQueryStringValue);
		dhAppendInputHidden(sbOut, RequestRequestURIKey, 	RequestRequestURIValue);
		dhAppendInputHidden(sbOut, SAMLMessageKey, 			SAMLMessageValue);
		dhAppendInputHidden(sbOut, HTTPMethodKey, 			HTTPMethodValue);
		dhAppendInputHidden(sbOut, RequestQueryStringKey, 	RequestQueryStringValue);
		dhAppendInputHidden(sbOut, RequestRequestURIKey, 	RequestRequestURIValue);
		dhAppendInputHidden(sbOut, SAMLMessageKey, 			SAMLMessageValue);
		dhAppendInputHidden(sbOut, HTTPMethodKey, 			HTTPMethodValue);
		dhAppendInputHidden(sbOut, RequestQueryStringKey, 	RequestQueryStringValue);
		dhAppendInputHidden(sbOut, RequestRequestURIKey, 	RequestRequestURIValue);
		dhAppendInputHidden(sbOut, SAMLMessageKey, 			SAMLMessageValue);
		dhAppendInputHidden(sbOut, HTTPMethodKey, 			HTTPMethodValue);
		dhAppendInputHidden(sbOut, RequestQueryStringKey, 	RequestQueryStringValue);
		dhAppendInputHidden(sbOut, RequestRequestURIKey, 	RequestRequestURIValue);
		dhAppendInputHidden(sbOut, "switch", pswitch);			
	}
	
	protected void dhAppendCtxScript(StringBuilder sbOut, String urlSrc) {
		sbOut.append("<script type=\"text/javascript\" src=\"").append(RequestContextPath)
		.append(urlSrc).append("\"></script>");
	}	
	protected void dhAppendCtxLinkStyle(StringBuilder sbOut, String urlSrc) {
		sbOut.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"")
		.append(RequestContextPath).append(urlSrc).append("\"/>");		
	}
	
	public static class DhLoginDlg1 extends DhLoginDlg {
		public DhLoginDlg1(HashMap<String, String> settings) {
			super(settings);
			dhAppendCtxLinkStyle(dhHeadContents, "/stylesheet/theme.css");
			dhBody.append("<body onload =\"setRemember('cudRememberPass');\">");
			dhBody.append("<table style=\"width:100%; height:100%;\">");
			dhBody.append("<tr>");
			dhBody.append("<td align=\"center\" valign=\"middle\">");
			dhBody.append("<div style=\"border:0; width:253px; height:135px\">");;
			dhBody.append("<div style=\"border:1px solid silver; width:250px; height:130px\">");			
			dhBody.append("<FORM METHOD=\"POST\" ACTION=\"" + FormAction + "\">");
			dhAppendHiddenInputs(dhBody);
			dhBody.append("<table width = \"230px\">");
			if(!Strings.isNullOrEmptyTrim(ErrorMessageText)) {
				dhBody.append("<tr>");
				dhBody.append("<td colspan=\"2\" align=\"center\" height = \"20px\" style=\"color:red;\" >");
				dhBody.append(ErrorMessageText);
				dhBody.append("</td>");
				dhBody.append("</tr>");				
			}
			dhBody.append("<tr>");
			dhBody.append("<td colspan=\"2\" align=\"center\" height = \"40px\" >").append("Зарегистрируйтесь!").append("</td>");
			dhBody.append("</tr>");
			dhBody.append("<tr>");
			dhBody.append("<td width = \"50px\">").append("Логин:").append("</td>");
			dhBody.append("<td>")
			.append("<input type=\"text\" NAME=\"login\" />").append("</td>");
			dhBody.append("</tr>");
			dhBody.append("<tr>");
			dhBody.append("<td>");
			dhBody.append("Пароль:");
			dhBody.append("</td>");
			dhBody.append("<td>");
			dhBody.append("<input type=\"password\" NAME=\"password\" />");
			dhBody.append("</td>");
			dhBody.append("</tr>");
			dhBody.append("<tr>");
			dhBody.append("<td colspan=\"2\"  align=\"center\" height = \"30px\">");
			dhBody.append("<table width = \"100%\" border=\"0\">");
			dhBody.append("<tr><td width = \"80px\"></td><td align=\"center\">");
			dhBody.append("<input type=\"submit\" value=\"Войти\" class=\"but_class\"");
			dhBody.append("onclick=\"goAuth('cudRememberPass','").append(RequestContextPath).append("');\"/>");
			dhBody.append("<td width = \"80px\">");
			dhBody.append("<input type=\"checkbox\" id=\"remember\" style=\"float: left;padding:0px;margin:0px;margin-top: 1px; border:0px;\"/> ");
			dhBody.append("<LABEL for=\"remember\" style=\"float: left; margin-top: 2px;font-size: 11px;\">Запомнить</LABEL>");
			dhBody.append("</td>");
			dhBody.append("</tr>");
			dhBody.append("</table>");
			dhBody.append("</td>");
			dhBody.append("</tr>");
			dhBody.append("</table>");
			dhBody.append("</FORM>");
			dhBody.append("</div>");
			dhBody.append("</div>");
			if (MultiAuthRequest!=null) {
				dhBody.append("<table width = \"220px\">");
				dhBody.append("<tr>");
				dhBody.append("<td colspan=\"2\" align=\"right\" >");
				dhBody.append("<a href=\"").append(RequestContextPath).append("/services/access_cert.jsp");
				dhBody.append("\" />Войти по сертификату</a>");
				dhBody.append("</td>");
				dhBody.append("</tr>");
				dhBody.append("</table>");
			}
			dhBody.append("</td>");
			dhBody.append("</tr>");
			dhBody.append("</table>");
			dhBody.append("</body>");		
		}
	}
	public static class DhLoginDlg2 extends DhLoginDlg {
		public DhLoginDlg2(HashMap<String, String> settings) {
			super(settings);
			dhHeadContents.append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
			dhAppendCtxLinkStyle(dhHeadContents, "/css/bootstrap.min.css");
			dhAppendCtxLinkStyle(dhHeadContents, "/font-awesome/css/font-awesome.css");
			dhAppendCtxLinkStyle(dhHeadContents, "/css/animate.css");
			dhAppendCtxLinkStyle(dhHeadContents, "/css/style.min.css");
			dhBody.append("<body class='gray-bg' onload =\"setRemember('cudRememberPass');\">");
			dhBody.append("<div class='middle-box text-center loginscreen animated fadeInDown'>");
			dhBody.append("    <div>");
			dhBody.append("        <div>");
			dhBody.append("            <h2 style='color: #e6e6e6; font-weight: 800;'>ТОРИС</h2>");
			dhBody.append("        </div>");

			if(Strings.isNullOrEmptyTrim(ErrorMessageText)) {
				dhBody.append("        <p>Для продолжения работы<br/>укажите Ваши учетные данные</p>");
			} else {
				dhBody.append("        <p style='color:red;'>").append(ErrorMessageText).append("</p>");
			}
			
			dhBody.append("        <form class='m-t' role='form' action='" + FormAction + "'>");
			dhBody.append("            <div class='form-group'>");
			dhBody.append("                <input type='text' NAME='login' class='form-control' placeholder='Логин' required=''>");
			dhBody.append("            </div>");
			dhBody.append("            <div class='form-group'>");
			dhBody.append("                <input type='password' NAME='password' class='form-control' placeholder='Пароль' required=''>");
			dhBody.append("            </div>");
			
			dhBody.append("            <button type='submit'")
					.append(" onclick=\"goAuth('cudRememberPass','").append(RequestContextPath).append("');\"")
					.append(" class='btn btn-primary block full-width m-b'>Войти</button>");
			
			dhBody.append("            <div class='form-group' style='text-align: right;'>");
			dhBody.append("                <input type='checkbox' id='remember' _class='form-control'>&nbsp;");
			dhBody.append("				   <span style='cursor:default' onclick=\"document.getElementById('remember').click()\">Запомнить</span>");
			//dhBody.append("					   <LABEL for=\"remember\" style=\"float: left; margin-top: 2px;font-size: 11px;\">Запомнить</LABEL>");
			dhBody.append("            </div>");	
			
			dhBody.append("        </form>");
			
			if (MultiAuthRequest!=null) {
				dhBody.append("<p class='m-t'>");
				dhBody.append("<a href=\"")
					.append(RequestContextPath)
					.append("/services/access_cert.jsp")
					.append("\" />Войти по сертификату</a>");
				dhBody.append("</p>");
			}
			
			dhBody.append("        <p class='m-t'> <small>&copy; 2007–2016 СПб ГУП &laquo;<nobr>Санкт-Петербургский</nobr> <nobr>информационно-аналитический</nobr> центр&raquo;</small> </p>");
			dhBody.append("    </div>");
			dhBody.append("</div>");			
			dhAppendCtxScript(dhBody, "/js/jquery-2.1.1.js");
			dhAppendCtxScript(dhBody, "/js/bootstrap.min.js");
			dhBody.append("</body>");
		}
	}	

}
