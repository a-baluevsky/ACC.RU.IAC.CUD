package org.picketlink.oauth.provider.model;

import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;

import org.picketlink.oauth.provider.rest.interceptors.HeadersFilter;

public class OAuthResponse  implements Serializable {
	private static final long serialVersionUID = -2936434981444077234L;
	protected HttpServletResponse response;
	public OAuthResponse(HttpServletResponse response) {
		this.response = response;
		//HeadersFilter.setHeaderAccCtlAllowOrigin(response);
	}
}
