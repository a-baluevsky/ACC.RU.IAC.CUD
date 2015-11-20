package mypackage;


 public class Configuration extends ConfigurationBase {
 


 
  
  private static String samlRequestLogin ; 
	

	
  private static String archiveAuditFunc ; 
	
  private static String archiveAuditSys ; 
	
  private static String archiveToken ;
	
  private static String uccert ;

  private static String ucCertReestr ;
  
  private static String classifService ;
  
  private static String classifLoadPatch ;
  
  private static String classifLoadTmp ;
  
  private static String jasperServer ;
  
  private static String jasperLogin ;
  
  private static String jasperPassword;
  

/*
  public static boolean isEncryptRequired() {
	return encryptRequired;
  }

  public static void setEncryptRequired(boolean encryptRequired) {
	Configuration.encryptRequired = encryptRequired;
  }*/

public static String getSamlRequestLogin() {
	return samlRequestLogin;
}

public static void setSamlRequestLogin(String samlRequestLogin) {
	Configuration.samlRequestLogin = samlRequestLogin;
}

public static String getArchiveAuditFunc() {
	return archiveAuditFunc;
}

public static void setArchiveAuditFunc(String archiveAuditFunc) {
	Configuration.archiveAuditFunc = archiveAuditFunc;
}

public static String getArchiveAuditSys() {
	return archiveAuditSys;
}

public static void setArchiveAuditSys(String archiveAuditSys) {
	Configuration.archiveAuditSys = archiveAuditSys;
}

public static String getArchiveToken() {
	return archiveToken;
}

public static void setArchiveToken(String archiveToken) {
	Configuration.archiveToken = archiveToken;
}

public static String getUccert() {
	return uccert;
}

public static void setUccert(String uccert) {
	Configuration.uccert = uccert;
}

public static String getUcCertReestr() {
	return ucCertReestr;
}

public static void setUcCertReestr(String ucCertReestr) {
	Configuration.ucCertReestr = ucCertReestr;
}

public static String getClassifService() {
	return classifService;
}

public static void setClassifService(String classifService) {
	Configuration.classifService = classifService;
}

public static String getClassifLoadPatch() {
	return classifLoadPatch;
}

public static String getClassifLoadTmp() {
	return classifLoadTmp;
}

public static void setClassifLoadTmp(String classifLoadTmp) {
	Configuration.classifLoadTmp = classifLoadTmp;
}

public static void setClassifLoadPatch(String classifLoadPatch) {
	Configuration.classifLoadPatch = classifLoadPatch;
}

public static String getJasperServer() {
	return jasperServer;
}

public static void setJasperServer(String jasperServer) {
	Configuration.jasperServer = jasperServer;
}

public static String getJasperLogin() {
	return jasperLogin;
}

public static void setJasperLogin(String jasperLogin) {
	Configuration.jasperLogin = jasperLogin;
}

public static String getJasperPassword() {
	return jasperPassword;
}

public static void setJasperPassword(String jasperPassword) {
	Configuration.jasperPassword = jasperPassword;
}   

  
} 