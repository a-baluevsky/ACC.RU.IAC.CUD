package org.picketlink.oauth.provider.services;

//import static org.picketlink.oauth.provider.rest.PageTemplate.sendWebTemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javaw.lang.Strings;
import javaw.net.FileServlet;
import javaw.util.Actor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

import org.picketlink.oauth.provider.rest.PageTemplate;

@Stateless
@Path("files")
@TransactionAttribute
public class FileServer {
	@Context ServletContext servletContext;
	@Context UriInfo uriInfo;
	
	private static class FileResourceProcessor extends Actor<ResponseBuilder> {
		protected final ServletContext servletContext;
		protected final UriInfo uriInfo;
		protected final String fileKey;
		protected String filePath, fileName, mimeType;
		protected File file;		
		public FileResourceProcessor(ServletContext servletContext, UriInfo uriInfo, String key) {
			this.uriInfo = uriInfo;
			this.servletContext = servletContext;
			this.fileKey = key;
			if(!Strings.isNullOrEmptyTrim(key)) {
				this.filePath = getFilePathByKey(key);
				this.file = new File(filePath);				
				if(file.exists()) {
					this.fileName = file.getName();
					this.mimeType = servletContext.getMimeType(fileName);
					if(!process())
						if(this.mimeType!=null)
							setData(Response.ok(file, mimeType));
						else
							setData(Response.ok(file, MediaType.APPLICATION_OCTET_STREAM)
							.header("Content-Disposition", "attachment; filename=\"" + fileName + "\"" ));
					return;
				}
			}
			setData(Response.status(HttpServletResponse.SC_NOT_FOUND));
		}
		public String getFilePathByKey(String key) {
			if(!key.startsWith("/"))
				key = "/"+key;
			return servletContext.getRealPath("files"+key);	
		}
		/* One may @Override this method to do custom POST-processing.
		 * Use this snippet to do so:
				return (new FileResourceProcessor(servletContext, key) {
					@Override
					public boolean process() {
						return false; // dump file as is
					}
				}).getData().build();
 
		 */		
		public boolean process() { return false; }
		public static ResponseBuilder process(ServletContext servletContext, UriInfo uriInfo, String key) {
			return (new FileResourceProcessor(servletContext, uriInfo, key)).data;
		}
	}
	
	@GET @Path("templates/{key}") @Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response template(@PathParam("key") String key) {		
		return (new FileResourceProcessor(servletContext, this.uriInfo, key) {
			@Override
			public String getFilePathByKey(String key) {
				StringBuilder sb = new StringBuilder("files/templates");
				if(!key.startsWith("/"))
					sb.append("/");
				sb.append(key);
				return servletContext.getRealPath(sb.toString());	
			}
			@Override
			public boolean process() {
				final MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
				if(queryParameters.isEmpty())
					return false; // dump file as is
				else {
					final PageTemplate pageTemplate = new PageTemplate(uriInfo, servletContext);
					final PageTemplate.TokenReplacer tknReplacer = new PageTemplate.TokenReplacer(PageTemplate.flattenMultivaluedMap(queryParameters, new HashMap<String, String>()));
					try {
						this.data = Response.ok(pageTemplate.getWebTemplate(this.fileKey, tknReplacer), this.mimeType+"; charset=UTF-8");
					} catch (FileNotFoundException e) {
						this.data = Response.status(HttpServletResponse.SC_NOT_FOUND).entity(e.toString());
					} catch (IOException e) {
						this.data = Response.status(HttpServletResponse.SC_SERVICE_UNAVAILABLE).entity(e.toString());
					}					
					return true; // respond with custom Response
				}
				
			}
		}).getData().build();		
	}
	
	@GET @Produces(MediaType.APPLICATION_OCTET_STREAM)
	@Path("{key: .*}")
	public Response get(@PathParam("key") String key, @Context HttpServletResponse response) {
		return FileResourceProcessor.process(this.servletContext, this.uriInfo, key).build();
	}
	

}
