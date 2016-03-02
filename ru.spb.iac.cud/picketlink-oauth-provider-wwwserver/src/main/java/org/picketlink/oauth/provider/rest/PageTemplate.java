package org.picketlink.oauth.provider.rest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import javaw.lang.Strings;
import javaw.util.Actor;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/* Page template: simplified model like JSP. Template contains tokens like <?tokenKey?> to be replaced with actual values on page input.
	This 

 */
public class PageTemplate {
	public static final String TemplatesLocation = "files/templates";
	private final String PATH_WEB_TEMPLATES; //= "C:\\Projects\\picketlink-oauth-provider\\client\\src\\main\\webapp\\templates";
	private final String URL_OAUTH_PROVIDER; //= "http://cuddevelop1:8080/picketlink-oauth-provider-wwwserver/";

	
 	public PageTemplate(String baseUri, String templatesPath) {
		URL_OAUTH_PROVIDER = baseUri; PATH_WEB_TEMPLATES = templatesPath;
	}	
	public PageTemplate(UriInfo uriInfo, ServletContext servletContext) {
		this(uriInfo.getBaseUri().toString(), servletContext.getRealPath(TemplatesLocation));
	}

	public URI uri(StringBuilder uri) { 
	    try {	    	
			return new URI(uri.toString());
	    } catch (URISyntaxException e) {
			e.printStackTrace();
			return null; 
		}	
	}
	
	public URI uri(String relativePath) { return uri(uriAbs(relativePath));	}
	public URI uri(String relativePath, String queryString) {    	
    	StringBuilder sb = uriAbs(relativePath);
    	if(!Strings.isNullOrEmpty(queryString))
    		sb.append("?").append(queryString);
    	return uri(sb);
    }
	
	private StringBuilder uriAbs(String relativePath) {
		StringBuilder sb = new StringBuilder(URL_OAUTH_PROVIDER);
    	if(!relativePath.startsWith("/") && !URL_OAUTH_PROVIDER.endsWith("/")) sb.append('/');
    	else if(relativePath.startsWith("/") && URL_OAUTH_PROVIDER.endsWith("/")) sb.deleteCharAt(sb.length()-1);
    	return sb.append(relativePath);
	}	
	
	public static<T> Map<String,T>  flattenMultivaluedMap(MultivaluedMap<String, T> srcMulMap, Map<String, T> dstMap) {
		for(Entry<String, List<T>> entry: srcMulMap.entrySet())
			dstMap.put(entry.getKey(), entry.getValue().get(0));
		return dstMap;
	}
	
	public static<T> Map<String,T> filterMultivaluedMap(Map<String, T[]> srcMap, Map<String, T> dstMap, String[] fltNames)  {
		for(String n: fltNames)
			if(srcMap.containsKey(n)) {
				// convert UTF-8 properly
				String strVal = (String)srcMap.get(n)[0];
				
					
					try {
						byte[] b = strVal.getBytes("ISO-8859-1"); //
						strVal = new String(b, "UTF-8");
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //"UTF-8"
					
				
				//strVal = Charset.forName("UTF-8").encode(strVal). .toString();
				dstMap.put(n, (T)strVal);	
			}
		return dstMap;
	}		
    
	public String getPathWebTemplate(String fileName) {
		StringBuilder sbPath = appendPath(new StringBuilder(PATH_WEB_TEMPLATES), fileName.replace('/', '\\'));
		if(fileName.indexOf('.')==-1)
			sbPath.append(".html");
		return sbPath.toString(); 
	}

	public static abstract class IPageCodeAdaptor<DataType> extends Actor<DataType> {
		public abstract String process(StringBuilder pageCode);
		@Override 
		public IPageCodeAdaptor<DataType> setData(DataType data) { super.setData(data); return this; }
	}
	
	// a<%TOKEN_KEY%>b	=> aVALUEb
	public static class TokenReplacer extends IPageCodeAdaptor<Map<String, String>> {
		public TokenReplacer(Map<String, String> data) { setData(data); }
		@Override
		public String process(StringBuilder pageCode) {
			for(Entry<String, String> e: data.entrySet()) {
				final StringBuilder sbTK = (new StringBuilder("<%")).append(e.getKey()).append("%>");
				final String tk = sbTK.toString();
				Stack<Integer> ssp = new Stack<Integer>();
				int sp = pageCode.indexOf(tk);
				int tkl = tk.length();
				while(sp!=-1) {
					ssp.push(sp);
					sp = pageCode.indexOf(tk, sp+tkl);
				}
				while(!ssp.empty()) {
					sp = ssp.pop();
					pageCode.replace(sp, sp+tkl, e.getValue());
				}
			}
			return pageCode.toString();
		}
	};

	private static StringBuilder appendToken(StringBuilder sbURL, String urlPart, char delim) {
		if(!Strings.isNullOrEmpty(urlPart)) {
			final int lastCharIdx = sbURL.length()-1;
			final String lastChar = String.valueOf(sbURL.charAt(lastCharIdx));
			final String strDelim = String.valueOf(delim);
			final boolean startsURLWithDelim = urlPart.startsWith(strDelim);
			final boolean endsWithDelim = lastChar.equals(strDelim);
			if(!endsWithDelim &&  !startsURLWithDelim) sbURL.append(strDelim);
			if( endsWithDelim &&   startsURLWithDelim) sbURL.deleteCharAt(lastCharIdx);
			sbURL.append(urlPart);				
		}
		return sbURL;		
	}
	
	private static StringBuilder appendPath(StringBuilder sbPath, String pathPart) {
		return appendToken(sbPath, pathPart, '\\');
	}
	private static StringBuilder appendURL(StringBuilder sbURL, String urlPart) {
		return appendToken(sbURL, urlPart, '/');
	}
	
	public Response sendFramedRedirect(String templateName, String urlRedirect, String queryString) {
		StringBuilder sbURL = appendURL(uriAbs(""), urlRedirect); //uriAbs(TemplatesLocation)		
		sbURL.append("?");
		if(Strings.isNullOrEmptyTrim(queryString)) {
			sbURL.append("framed");
		} else {
			sbURL.append(queryString);
			sbURL.append("&framed");
		}		
		Map<String, String> mpUrl = new HashMap<String, String>();
		mpUrl.put("RequestURL", sbURL.toString());
		return sendWebTemplate(Response.status(HttpServletResponse.SC_FOUND), 
				"paaaframe", new TokenReplacer(mpUrl)).build();
	}
	
	
	public Response sendWebTemplate(String templateName) {
		return sendWebTemplate(Response.status(HttpServletResponse.SC_FOUND), templateName, null).build();
	}
	
	public <T> Response sendWebTemplate(String templateName, IPageCodeAdaptor<T> pageCodeAdaptor) {
		return sendWebTemplate(Response.status(HttpServletResponse.SC_FOUND), templateName, pageCodeAdaptor).build();
	}	
	
    public Response.ResponseBuilder sendWebTemplate(
    		Response.ResponseBuilder responseBuilder, 
    		String templateName) {
    	return sendWebTemplate(responseBuilder, templateName, null);
    }
    
    public <T> Response.ResponseBuilder sendWebTemplate(
    		Response.ResponseBuilder responseBuilder, 
    		String templateName, IPageCodeAdaptor<T> pageCodeAdaptor) {
    	try {
    		responseBuilder.entity(getWebTemplate(templateName, pageCodeAdaptor));
    	} catch (FileNotFoundException e) {
			throw new WebApplicationException(responseBuilder.entity("template '"+templateName+"' not found!").build());
		} catch (IOException e) {			
			throw new WebApplicationException(responseBuilder.entity("IOException with '"+templateName+"': "+e.toString()).build());
		}    	
    	return responseBuilder;
	}
    
    public <T> String getWebTemplate(String templateName, IPageCodeAdaptor<T> pageCodeAdaptor) 
    throws FileNotFoundException, IOException {
    	BufferedReader data = null;
    	try {
			data = new BufferedReader(new InputStreamReader(new FileInputStream(
					getPathWebTemplate(templateName)), Charset.forName("UTF-8")));
			final StringBuilder sbOut = new StringBuilder();
			String strLine;
			while ((strLine = data.readLine()) != null) {
			    sbOut.append(strLine);
			}			
			return pageCodeAdaptor==null?sbOut.toString(): pageCodeAdaptor.process(sbOut);
    	}
		finally {
			if(data!=null)
				data.close();
		} 
    }
    
}
