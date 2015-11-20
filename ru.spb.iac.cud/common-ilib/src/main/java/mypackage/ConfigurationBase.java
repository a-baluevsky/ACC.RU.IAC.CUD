package mypackage;

public class ConfigurationBase {
	  private 	static boolean 	signRequired;
	  public 	static boolean 	isSignRequired() 					  	{ return signRequired; }
	  public 	static void 	setSignRequired(boolean sign_Required) 	{ signRequired = sign_Required; }

	  private 	static String	samlRequestLogout;
	  public 	static String	getSamlRequestLogout() 							{ return samlRequestLogout; }
	  public 	static void		setSamlRequestLogout(String saml_RequestLogout) { samlRequestLogout = saml_RequestLogout; }	  
	  
	  private 	static String 	samlAssertion; 
	  public	static String 	getSamlAssertion() 								{ return samlAssertion; }
	  public 	static void 	setSamlAssertion(String saml_Assertion) 		{ samlAssertion = saml_Assertion; }	  
	  
	  private static String 	storePath;
	  public static String 		getStorePath() 					{ return storePath; }
	  public static void 		setStorePath(String store_Path) { storePath = store_Path; }
		
	  private 	static String 	auditService;	  
	  public 	static String 	getAuditService() 						{ return auditService; }
	  public 	static void 	setAuditService(String audit_Service) 	{ auditService = audit_Service; }	  
	  
	  private static String stsOboService;
	  public static String getStsOboService() 						{ return stsOboService; }
	  public static void setStsOboService(String sts_OboService) 	{ stsOboService = sts_OboService; }
	  
	  private	static 	String 	stsService;
	  public 	static 	String 	getStsService() 					{ return stsService; }
	  public 	static 	void 	setStsService(String sts_Service) 	{ stsService = sts_Service; }	  
	  
}
