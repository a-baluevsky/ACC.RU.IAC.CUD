package ru.spb.iac.cud.services.auth;

import iac.cud.data.app.JPA_AppAccessManager;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javaw.lang.Strings;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import ru.spb.iac.cud.context.ContextAccessManager;
import ru.spb.iac.cud.core.AccessManagerLocal;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.exceptions.InvalidCredentials;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal;
import ru.spb.iac.cud.items.AuthMode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.openejb.jee.jba.Jboss;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

@Path("/auth")
public class AuthService {
	
	@XmlRootElement @JsonAutoDetect
	@JsonWriteNullProperties(false)
	private static class AuthResponse implements Serializable {
		public enum AuthCode {
			OK,
			invalid_request,	// The request is missing a required parameter, includes an unsupported parameter value, or is otherwise malformed
			access_denied,		// Invalid credentials, account expired, etc
			server_error;		// The authorization server encountered an unexpected condition that prevented it from fulfilling the request.
			private static Map<AuthCode, String> getStrMsgMap1(){
				Map<AuthCode, String> m = new EnumMap<AuthCode, String>(AuthCode.class);
				m.put(OK, 						"");
				m.put(invalid_request, 			"Отсутствуют необходимые параметры! Нужно указать логин, пароль, код системы");
				m.put(access_denied, 			"Учётные данные не верны");
				m.put(server_error, 			"Ошибка при выполнении запроса! ");
				return m;
			}
			private static final Map<AuthCode, String> m_strMsgMap1 = getStrMsgMap1();		
			private static Object getFromMap(AuthCode enumValue, Map<AuthCode, ?> mapValue) {
				if(mapValue.containsKey(enumValue)) return mapValue.get(enumValue);
				else throw new AssertionError("AuthCode.getFromMap: Unexpected enumerated value - "+enumValue);			
			}
			public String getMessage() 	{ return (String)getFromMap(this, m_strMsgMap1);}
		};
		@XmlElement @JsonProperty	AuthCode resultCode;
		@XmlElement @JsonProperty	String message;
		@XmlElement @JsonProperty	String login;
		@XmlElement @JsonProperty	List<String> userRoles;
		@XmlElement @JsonProperty	Map<String, String> userAttrs;
	}
	
	 @POST
	 @Path("/action")
	 @Consumes("application/x-www-form-urlencoded")
	 @Produces(MediaType.APPLICATION_JSON)
     public AuthResponse login(@Context HttpServletRequest request, 
    			@FormParam("login") String login, 
    			@FormParam("password") String password, 
    			@FormParam("codeSys")  String codeSys)	 
	{
    	AuthResponse retVal;
    	if(	Strings.isNullOrEmptyTrim(login)
    			|| Strings.isNullOrEmptyTrim(password)
    			|| Strings.isNullOrEmptyTrim(codeSys)) {
    		retVal = new AuthResponse();
    		retVal.resultCode = AuthResponse.AuthCode.invalid_request;
    		retVal.message = retVal.resultCode.getMessage();
    	} else retVal = tryLogin(request, login, password, codeSys);
    	return retVal;
    }
    
    private AuthResponse tryLogin(ServletRequest request, String login, String password, String codeSys) {
    	AuthResponse retVal = new AuthResponse();
    	retVal.resultCode = AuthResponse.AuthCode.server_error;
    	retVal.message = retVal.resultCode.getMessage();
    	try {
			retVal.login = getAml().authenticate_login(login, password, AuthMode.WEB_SERVICES, request.getRemoteAddr(), codeSys);
			IDPAccessManagerLocal iml = getContextIDPAccessManager();
			retVal.userRoles = iml.rolesCodes(login, codeSys);
			retVal.userAttrs = iml.attributes(login);
			retVal.resultCode = AuthResponse.AuthCode.OK;
			retVal.message = retVal.resultCode.getMessage();
		} catch (InvalidCredentials e) {
			retVal.resultCode = AuthResponse.AuthCode.access_denied;
			retVal.message = retVal.resultCode.getMessage();			
		} catch (GeneralFailure e) {
			retVal.message += e;
		} catch (Exception e) {
			retVal.message += e;
		}
    	return retVal; 	
    }
    
    private AccessManagerLocal aml = null;
	private AccessManagerLocal getAml() {
		if(aml == null) aml = (new ContextAccessManager()).aml;
		return aml;
	}
	
	public IDPAccessManagerLocal getContextIDPAccessManager() throws NamingException {
		return (IDPAccessManagerLocal) ((new InitialContext())
					.lookup("java:global/AuthServices/IDPAccessManager!ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal"));
	}	
	
	/* // активируй для отладки
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_HTML)     
    public String testlogin(@Context HttpServletRequest request)  {
    	AuthResponse retVal = tryLogin(request, "baluevsky", "baluevsky", "urn:sub-eis:web:test");
    	if(retVal.resultCode.equals(AuthResponse.AuthCode.OK)) {
    		return "<html><body><h1>Hello from REST "+this.getClass().getName()+", <font color=green>"+retVal.login+"</font>!</body></h1></html>";
    	} else {
    		return "<html><body><h1><font color=red>Login failed: "+retVal.message+"</font></body></h1></html>";
    	}
    }
    */
    
    @GET
    @Path("/form")
    @Produces(MediaType.TEXT_HTML)    
    public String getLoginForm(@Context HttpServletRequest request) {
    	StringBuilder sb = new StringBuilder("<html><head>");
    	//sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
    	sb.append("<title>Подсистема Аутентификации, Авторизации и Аудита</title>\n");
    	sb.append("</head>\n");
    	sb.append("<body>");
    	sb.append("	<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">");
    	sb.append("	  <tr> \n");
    	sb.append("		<td align=\"center\" bgcolor=\"#000000\"><font color=\"#CCCCCC\">login</font></td>\n");
    	sb.append("		<td>&nbsp;</td>");
    	/*sb.append("		<td align=\"center\" bgcolor=\"#DEDECA\"><a href=\""+request.getContextPath()+"/rs/auth/test\">test</a></td>");
    	sb.append("		<td width=\"100%\">&nbsp;</td>");*/
    	sb.append("	  </tr>");
    	sb.append("	  <tr> ");
    	sb.append("		<td colspan=\"6\" bgcolor=\"#000000\"> <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"8\">\n");
    	sb.append("			<tr> ");
    	sb.append("			  <form name=\"auth\" action=\""+request.getContextPath()+"/rs/auth/action\" method=\"post\" onSubmit=\"if((login.value+password.value+codeSys.value).indexOf('[')>=0){alert('Не указан параметр!'); return false;}\">");
    	sb.append("				<td width=\"100%\" bgcolor=\"#CCCCCC\" align=\"center\">\n");
    	sb.append("					<br>\n");
    	sb.append("	<script language=\"JavaScript\" type=\"text/javascript\">\n");
    	sb.append("	function putField(caption, fldType, fldName, fldHint) {\n");
    	sb.append("		document.writeln(caption+'&nbsp;&nbsp;<input  width=\"30\" type=\"'+fldType+'\" name=\"'+fldName + '\"  value=\"' + fldHint + '\"   '\n");
    	sb.append("		+ 'onFocus=\"if(this.value==\\''+ fldHint +'\\')this.value=\\'\\';\"'\n");
    	sb.append("		+'onBlur=\"if(this.value==\\'\\') this.value=\\''+fldHint+ '\\'\" >&nbsp;|&nbsp;'); \n");
    	sb.append("	}\n");
    	sb.append("	putField(\"Логин:\", \"text\", \"login\", \"[логин]\");\n");
    	sb.append("	putField(\"Пароль:\", \"password\", \"password\", \"[\");\n");
    	sb.append("	putField(\"Код системы:\", \"text\", \"codeSys\", \"[код системы]\");\n");
    	sb.append("	</script>\n");
    	sb.append("				  <input type=\"submit\" name=\"SubmitAuth\" value=\"Вход в систему\"> <p></p></td>");
    	sb.append("			  </form>");
    	sb.append("			</tr>");
    	sb.append("		  </table></td>");
    	sb.append("	  </tr>");
    	sb.append("	</table>");
    	sb.append("</body>");
    	sb.append("</html>");

		return sb.toString();
	}

}

