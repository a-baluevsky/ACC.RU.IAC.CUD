package org.picketlink.oauth.provider.services;

//import static org.picketlink.oauth.provider.rest.PageTemplate.sendWebTemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javaw.lang.Strings;
import javaw.net.FileServlet;
import javaw.util.Actor;
import javaw.util.Tuple;
import javaw.util.Tuple.T2;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
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

import org.hsqldb.lib.ArrayCounter;
import org.picketlink.oauth.provider.rest.PageTemplate;
import org.picketlink.oauth.provider.rest._Endpoint;
import org.picketlink.oauth.provider.setup.RESTActivation;

@Stateless
@Path("files")
@TransactionAttribute
public class FileServer extends _Endpoint {
	@Context ServletContext servletContext;
	@Context UriInfo uriInfo;
	@Context HttpServletRequest httpRequest;
	
	private static class ResponseBuilderActor extends Actor<ResponseBuilder> {
		protected final ServletContext servletContext;
		protected final UriInfo uriInfo;
		public ResponseBuilderActor(ServletContext servletContext, UriInfo uriInfo) {
			this.uriInfo = uriInfo;
			this.servletContext = servletContext;			
		}
		/* One may @Override this method to do custom POST-processing.
		 * Use this snippet to do so:
				return (new ResponseBuilderActor(servletContext, key) {
					@Override
					public boolean process() {
						return false; // dump file as is
					}
				}).getData().build();
 
		 */		
		public boolean process() { return false; }		
	}
	private static class FileResourceProcessor extends ResponseBuilderActor {
		protected final String fileKey;
		protected String filePath, fileName, mimeType;
		protected File file;		
		public FileResourceProcessor(ServletContext servletContext, UriInfo uriInfo, String key) {
			super(servletContext, uriInfo);
			this.fileKey = key;
			if(!Strings.isNullOrEmptyTrim(key)) {
				this.filePath = getFilePathByKey(key);
				this.file = new File(filePath);
				if(file.isDirectory()) {
					final T2<String, File> idxPage = findIndexPage(filePath);
					this.file = idxPage!=null?idxPage.item2: null;
				}				
				if(file!=null && file.exists()) {
					this.fileName = file.getName();
					this.mimeType = servletContext.getMimeType(fileName);
					if(!process())
						if(this.mimeType!=null)
							setData(Response.ok(file, mimeType));
						else
							setData(Response.ok(file, MediaType.APPLICATION_OCTET_STREAM)
							.header("Content-Disposition", "attachment; filename=\"" + fileName + "\"" ));
					return;
				} else {
					setData(Response.status(404));
				}
			}
			setData(Response.status(HttpServletResponse.SC_NOT_FOUND));
		}
		public static Tuple.T2<String, File>  findIndexPage(String filePath) {
			String[] arrIndexFiles = {"index", "default"};
			String[] arrExt = {"html", "htm"};
			for(String ext: arrExt)
				for(String idx: arrIndexFiles) {
					final String idxFileName = idx+"."+ext;
					final java.nio.file.Path pathIdx = Paths.get(filePath, idxFileName);
					if(Files.exists(pathIdx))
						return new Tuple.T2<String, File>(idxFileName, new File(pathIdx.toString()));
				}
			return null;
		}
		public static String getFilePathByKey(ServletContext servletContext, String key) {
			if(!key.startsWith("/"))
				key = "/"+key;
			return servletContext.getRealPath("files"+key);	
		}
		public String getFilePathByKey(String key) {
			return getFilePathByKey(servletContext, key);	
		}

		public static ResponseBuilder process(ServletContext servletContext, UriInfo uriInfo, String key) {
			return (new FileResourceProcessor(servletContext, uriInfo, key)).data;
		}
	}
	
	private static class LogProcessor extends ResponseBuilderActor {
		protected Map<String, ?> loggerOptions;
		protected File file;
		public LogProcessor(ServletContext servletContext, UriInfo uriInfo, Map<String, ?> loggerOptions) {
			super(servletContext, uriInfo);
			file = new File(getLogFilePath("server.log"));
			if(file.exists()) {
				setData(Response.ok(file, MediaType.TEXT_PLAIN));				
			} else 
				setData(Response.status(HttpServletResponse.SC_NOT_FOUND));
		}
		public static ResponseBuilder process(ServletContext servletContext, UriInfo uriInfo, Map<String, ?> loggerOptions) {
			return (new LogProcessor(servletContext, uriInfo, loggerOptions)).data;
		}
	}
	
	@GET @Path("gfx/current/config.js") @Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response gfxRequireConfig() {
		return fixGFXHost("gfx/current/config.js", servletContext, httpRequest, uriInfo);
	}
	@GET @Path("gfx/tests/bavTestApp/index.html") @Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response gfxBavTestApp() {
		return fixGFXHost("gfx/tests/bavTestApp/index.html", servletContext, httpRequest, uriInfo);
	}
	@GET @Path("gfx/tests/bavTestApp/basic.html") @Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response gfxBavTestAppBasic() {
		return fixGFXHost("gfx/tests/bavTestApp/basic.html", servletContext, httpRequest, uriInfo);
	}
	
	private static Response fixGFXHost(final String key, 
			final ServletContext servletContext, final HttpServletRequest httpRequest, final UriInfo uriInfo) {
		return (new FileResourceProcessor(servletContext, uriInfo, key) {
			@Override
			public String getFilePathByKey(String key) {
				return servletContext.getRealPath("files/"+key); //	
			}
			@Override
			public boolean process() {
				final PageTemplate pageTemplate = new PageTemplate(uriInfo, servletContext, "files");
				final Map<String, String> hmConfig = new HashMap<String, String>();
				final int serverPort = httpRequest.getServerPort();
				final String svrHost = httpRequest.getServerName()+(serverPort==80?"": ":"+serverPort);
				hmConfig.put("HOST", svrHost);
				final PageTemplate.TokenReplacer tknReplacer = new PageTemplate.TokenReplacer(hmConfig);
				try {
					this.data = Response.ok(pageTemplate.getWebTemplate(this.fileKey, tknReplacer), this.mimeType+"; charset=UTF-8");
				} catch (FileNotFoundException e) {
					this.data = Response.status(HttpServletResponse.SC_NOT_FOUND).entity(e.toString());
				} catch (IOException e) {
					this.data = Response.status(HttpServletResponse.SC_SERVICE_UNAVAILABLE).entity(e.toString());
				}					
				return true; // respond with custom Response				
			}
		}).getData().build();		
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
		final String filePath = FileResourceProcessor.getFilePathByKey(servletContext, key);
		if(Files.isDirectory(Paths.get(filePath)))
			try {
				final T2<String, File> idxPageData = FileResourceProcessor.findIndexPage(filePath);				
				final String newURI = "/files/"+key+"/"+idxPageData.item1;
				return Response.seeOther(new URI(newURI)).build();
			} catch (Exception e) {
				//e.printStackTrace();
				return Response.status(Response.Status.NOT_FOUND).build();
			}
		else
			return FileResourceProcessor.process(this.servletContext, this.uriInfo, key).build();
			//return Response.status(Response.Status.OK).entity(sb.toString()).build();
	}
	
	
	private static String getLogBasePath() {
		String[] arrChkPaths = {"C:\\jboss-as-7.1.3.Final-fighting-mvn\\standalone\\log",
							"/opt/toris/jboss-as-7.1.3-acc/standalone/log"};
		for(String p: arrChkPaths)
			if((new File(p)).isDirectory())
				return p;
		return null;		
	}
	private static String getLogFilePath(String logFileName) {
		String base = getLogBasePath();
		return base==null? null: base+File.separator+logFileName;
	}
	
	@GET @Path("log") @Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response log() {
		Map<String, ?> loggerOptions = new HashMap<>();
		return LogProcessor.process(servletContext, uriInfo, loggerOptions).build(); 
	}

	/*
    @PermitAll @GET @Path("log") 
    @Produces(RESTActivation.MediaHTML)
    public Response logHTML() {
    	StringBuilder sb = new StringBuilder();
    	//FileServer//
    	xxx;
    	return Response.status(Response.Status.OK).entity(sb.toString()).build();
    }
	*/
}
