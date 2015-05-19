package ab;

import javaw.io.Closeable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javaw.util.ArrayList;


public class IncludeServlet extends HttpServlet {
   @Logger private static Log log;
   
   private String sPathLastCache=null;
    static   Random rnd = new Random((new Date()).getSeconds()*(new Date()).getHours());
    protected void clearCacheFile() throws IOException {
       synchronized (this) {
         if(sPathLastCache!=null) {
            Files.delete(Paths.get(sPathLastCache));
            sPathLastCache=null;
         }         
      }
    }
    
   @Override 
   public void destroy() {
      try {
         clearCacheFile();
      } catch (IOException e) {
         //SONAR: Exception handlers should preserve the original exception : Either log or rethrow this exception
         log.info(e.toString());
      }
   }
    public static void copyFiles(File sourceLocation , File targetLocation)   throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }
            File[] files = sourceLocation.listFiles();
            if(files!=null)
            for(File file:files)
               copyFile(file.getAbsolutePath(), targetLocation+"/"+file.getName());
        }
    }

    
    public static void copyFile(String fileSrc , String fileDst) {

        FileInputStream in = null;
        FileOutputStream out = null;
		try {
			in = new FileInputStream(fileSrc);
			out = new FileOutputStream(fileDst);
	        // Copy the bits from input stream to output stream
	        byte[] buf = new byte[1024];
	        int len;
	        while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	        }
	        in.close();
	        out.close(); 			
		} catch (FileNotFoundException e) {
			log.error("copyFile", e.toString());
		} catch (IOException e) {
			log.error("copyFile", e.toString());
		} finally {
			String[] errMsg = new String[]{"copyFile error:"};
			if(!Closeable.Close(errMsg, in, out)) {
				log.info(errMsg);
			}
		}
      
    }
       
   // Returns:
   // [0]: URL with FileNameSuffix; e.g: jstl_test.jsp/jstl_test2_02-09-06-36-01_862.jsp
   // [1]: url relative to ctxt path (/base/f1/f2) 
   // [2]: full file path (on a web server):  C:\deployments\InfoS-ear.ear\InfoS-web.war\servlet\include\jstl_test.jsp\jstl_test2_02-09-06-36-01_862.jsp
   public String[] getMapUrlToWebRoot(String URL, String WebRoot, String ServletPath, String FileNameSuffix) {      
      StringBuilder sbUrlSpec = new StringBuilder(URL);
      int pDot = URL.lastIndexOf('.'), pSl = URL.lastIndexOf('/');
      if(FileNameSuffix != null && FileNameSuffix.length()>0) {
         if(pSl==-1 || (pDot!=-1 && pSl<pDot)) 
            sbUrlSpec.insert(pDot, FileNameSuffix);
         else
            sbUrlSpec.append(FileNameSuffix);
      }
      String ar0 = sbUrlSpec.toString(), ar1 = ar0.replace('/', '\\');      
      StringBuilder sbPathResFile = new StringBuilder(WebRoot);      
      if(URL.startsWith("/")) {         
         sbPathResFile.append(ar1);
      } else {         
         sbPathResFile.append(ServletPath.replace('/', '\\')).append("\\").append(ar1);
         sbUrlSpec.insert(0, '/');
         sbUrlSpec.insert(0, ServletPath);
         ar1 = sbUrlSpec.toString();
      }
      return new String[]{ ar0, ar1, sbPathResFile.toString()};      
   }
   
   public String getRndSuff() {
      Date timer = new Date();
      SimpleDateFormat dtf = new SimpleDateFormat("_MM-dd-hh-mm-ss");
      StringBuilder sbFileSuffix = new StringBuilder(dtf.format(timer));
      sbFileSuffix.append("_");      
      //Random rnd = new Random(timer.getSeconds()*100+timer.getMinutes()*5+timer.getDate());
      sbFileSuffix.append(rnd.nextInt(1000));
      return sbFileSuffix.toString();
   }
   
   public String getIncludedResUrl(/*PrintWriter out,*/ String WebRoot, String ServletPath) throws IOException {      
      String inclRes = getInitParameter("included-resource");
      String sSrchPath=WebRoot+ServletPath.replace('/', '\\');
      if(inclRes==null || inclRes.length()==0) {
         //out.write("ServletPath: "+ServletPath+"<br/>");
         //out.write("searching index file @: "+sSrchPath+"<br/>");
         File[] files = (new File(sSrchPath)).listFiles();
         	if(files!=null)
            for(File file:files) {
               String sFn = file.getName();
               //out.write("probing file: "+sFn+"<br/>");
               if(sFn.toUpperCase().startsWith("INDEX."))
                  //return ServletPath+'/'+sFn;
                  return sFn;
            }                  
      }
      if(inclRes==null || inclRes.length()==0)
         throw new IOException("included-resource not specified and index file not found in "+sSrchPath);      
      return inclRes;
   }
   
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      //PrintWriter out = response.getWriter();
      clearCacheFile();      
      response.setContentType("text/html");
      String sWebRoot = getInitParameter("web-root");
      String sServletPath = request.getServletPath();
      //String sSPI = request.getPathInfo();
      //if(sSPI!=null) out.write("PathInfo: "+sSPI);
      //if(sSPI!=null && !sSPI.startsWith(sServletPath)) sServletPath+=sSPI;
      
      try {
         String inclRes = getIncludedResUrl(/*out,*/ sWebRoot, sServletPath);         
         String[] asPathSrc=getMapUrlToWebRoot(inclRes, sWebRoot, sServletPath, null);
         String[] asPathDst=getMapUrlToWebRoot(inclRes, sWebRoot, sServletPath, getRndSuff());         
         //ÿ out.write("!!ServletPath: "+ request.getServletPath());
         /* ÿ
         out.write("0: "+asPathSrc[0]+"\n=>\n"+asPathDst[0]+"<br/>");
         out.write("1: "+asPathSrc[1]+"\n=>\n"+asPathDst[1]+"<br/>");
         out.write("2: "+asPathSrc[2]+"\n=>\n"+asPathDst[2]+"<br/>");
         */
         String sRqDispUrl=asPathDst[1];
         //ÿ out.write("RqDispUrl: "+sRqDispUrl);
         synchronized (this) {
            copyFile(asPathSrc[2], asPathDst[2]);            
            RequestDispatcher dispatcher = request.getRequestDispatcher(sRqDispUrl);
            dispatcher.include(request, response);
            sPathLastCache=asPathDst[2];
         }
         
      } catch (IOException e) {
         throw e;
      }

   }
}
