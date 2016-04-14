package org.picketlink.oauth.provider.services;

import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

public class ResponseBuilderActor {

	@Context
	protected ServletContext servletContext;
	@Context
	protected UriInfo uriInfo;

	public ResponseBuilderActor() {
		super();
	}

}