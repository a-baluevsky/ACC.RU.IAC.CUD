package org.picketlink.oauth.provider.rest;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.picketlink.oauth.provider.rest.interceptors.HeadersFilter;

public class _Endpoint {
    public static Response getOKResponse() {
    	return Response.status(HttpServletResponse.SC_OK).build();
    }
    public static Response getOptionsCORSResponse(String AllowMethods, String AllowHeaders) {
    	return HeadersFilter.setHeaderAccCtlAllowOrigin(Response.status(HttpServletResponse.SC_OK)    			
    			.header("Access-Control-Allow-Methods", AllowMethods==null? "POST,GET,OPTIONS": "POST,GET,OPTIONS,"+AllowMethods)
    			.header("Access-Control-Allow-Headers", AllowHeaders==null? "Origin, Content-Type, Accept": "Origin, Content-Type, Accept, " + AllowHeaders))
    			.build();
    }    
}
