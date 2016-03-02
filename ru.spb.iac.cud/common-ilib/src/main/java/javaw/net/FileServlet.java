package javaw.net;

import java.security.AccessController;
import java.security.PrivilegedAction;

import javaw.lang.Strings;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

// Tiny File Server: loads files from a specified local directory and streams it out in request
public class FileServlet extends HttpServlet {
    protected static String getSystemProperty(final String key){
        if(System.getSecurityManager() == null){
            return System.getProperty(key);
        }else {
            return AccessController.doPrivileged(new PrivilegedAction<String>() {
                @Override
                public String run() {
                    return System.getProperty(key);
                }
            });
        }
    }
    
	private String basePath;
	public String getBasePath() {
		if(Strings.isNullOrEmpty(basePath)) {
			//getSystemProperty("picketlink.oauth.admin");
			//basePath = serverPath;
		}
		return basePath;
	}
	
	@Override
	public void init() throws ServletException {
		String serverPath = getServletContext().getRealPath("/");
		System.out.println(serverPath);

	}
}
