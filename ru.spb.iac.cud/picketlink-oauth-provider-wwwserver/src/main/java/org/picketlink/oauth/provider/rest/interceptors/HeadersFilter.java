package org.picketlink.oauth.provider.rest.interceptors;


import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.interception.PostProcessInterceptor;

import javax.ws.rs.core.MultivaluedMap;

import java.util.ArrayList;
import java.util.List;


@ServerInterceptor @Provider
public class HeadersFilter implements PostProcessInterceptor {

    @Override
    public void postProcess(ServerResponse response) {
        MultivaluedMap<String, Object> headers = response.getMetadata();
        final String headerName = "Access-Control-Allow-Origin";
		List<Object> domains = headers.get(headerName);
        if (domains == null) { domains = new ArrayList<Object>(); } 
        domains.add("*");
        headers.put(headerName, domains);
    }
    
}

/*
 * 
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
public class HeadersFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
*/

	
	

