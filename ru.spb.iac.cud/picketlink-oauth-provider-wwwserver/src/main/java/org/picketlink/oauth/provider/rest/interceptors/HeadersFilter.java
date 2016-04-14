package org.picketlink.oauth.provider.rest.interceptors;


import javaw.lang.Strings;

import javax.servlet.Filter;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.interception.PostProcessInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response.ResponseBuilder;

import java.util.regex.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ServerInterceptor @Provider
public class HeadersFilter implements PostProcessInterceptor //, Filter 
{	
	private static final Logger LOGGER = LoggerFactory.getLogger(HeadersFilter.class);
	
	@Context private HttpServletRequest httpRequest;

    @Override public void postProcess(ServerResponse httpResponse) { setHeaderAccCtlAllowOrigin(httpResponse, httpRequest); }
    
    public static boolean isRequiredAllowOriginHeader() {
    	//return true;
    	//LOGGER.debug("MachineName: "+sMachineName);
		String sMachineName = System.getenv("COMPUTERNAME");
		return "CUDDEVELOP1".equalsIgnoreCase(sMachineName);
	}
    
	public static void setHeaderAccCtlAllowOrigin(ServerResponse httpResponse, HttpServletRequest httpRequest) {
		LOGGER.debug("setHeaderAccCtlAllowOrigin[ServerResponse]");
		MultivaluedMap<String, Object> headers = httpResponse.getMetadata();
		if(isRequiredAllowOriginHeader()) {
			String AllowOrigin = null;
			if(httpRequest!=null) {
				AllowOrigin = httpRequest.getHeader("Origin");				
				if(Strings.isNullOrEmpty(AllowOrigin)) {
					AllowOrigin = httpRequest.getHeader("Referer");
					if(!Strings.isNullOrEmpty(AllowOrigin)) {
					Pattern patOrigin = Pattern.compile("http(s)?://[^/]*");
					Matcher mc = patOrigin.matcher(AllowOrigin);
					if(mc.find())
						AllowOrigin = mc.group();
					}
				}				
			}
			if(Strings.isNullOrEmpty(AllowOrigin))
				AllowOrigin = "*";
			
			LOGGER.debug("[ServerResponse] Setting Access-Control-Allow-Origin header: "+AllowOrigin);
	        putSingleHeader(headers, "Access-Control-Allow-Origin", AllowOrigin);
		}
        appendHeaderValue(headers, "Access-Control-Allow-Methods", "POST,GET,OPTIONS");
        appendHeaderValue(headers, "Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");		
	}

	public static void putSingleHeader(MultivaluedMap<String, Object> headers, final String headerName, final String headerValue) {
		List<Object> values = headers.get(headerName);
		if (values == null) {  // add only if missing
			values = new ArrayList<Object>(); 
			values.add(headerValue);
			headers.put(headerName, values);
		}
	}
	public static void appendHeaderValue(MultivaluedMap<String, Object> headers, final String headerName, final String headerValue) {
		List<Object> values = headers.get(headerName);
		if (values == null) {  // add only if missing
			values = new ArrayList<Object>(); 
			values.add(headerValue);
		} else {
			String curValue = (String)values.get(0);
			curValue+=", "+headerValue;
			values.remove(0);
			values.add(0, curValue);			
		}
		headers.put(headerName, values);
	}

	public static ResponseBuilder setHeaderAccCtlAllowOrigin(ResponseBuilder entity) {
		LOGGER.debug("[ResponseBuilder]");
		if(entity!=null && isRequiredAllowOriginHeader()) {
			LOGGER.debug("[ResponseBuilder] Setting Access-Control-Allow-Origin header: *");	
			entity.header("Access-Control-Allow-Origin", "*");
		}
		return entity;
	}

	/*
	public static void setHeaderAccCtlAllowOrigin(HttpServletResponse httpResponse) {
		LOGGER.debug("[HttpServletResponse]");
		if(httpResponse!=null && isRequiredAllowOriginHeader()) {
			LOGGER.debug("[HttpServletResponse] Setting Access-Control-Allow-Origin header: *");
			httpResponse.setHeader("Access-Control-Allow-Origin", "*");			
		}
	}
	*/
    
	/*
	@Override public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		LOGGER.debug("[doFilter]");
		if(isRequiredAllowOriginHeader()) {
			HttpServletResponse httpResponse = (HttpServletResponse)response;

 	       httpResponse.setHeader("Access-Control-Allow-Origin", "*");
	       httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
	       httpResponse.setHeader("Access-Control-Allow-Methods", "GET, HEAD, OPTIONS, POST, PUT");
	       httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		        
			chain.doFilter(request, response);
		}
	}
	@Override public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override public void destroy() {
		// TODO Auto-generated method stub
		
	}
	*/	
}

	

