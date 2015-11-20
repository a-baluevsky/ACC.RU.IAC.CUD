package mypackage;

 public class Configuration extends ConfigurationBase {
	 private static String samlRequestLoginUarm ; 
	 public static String getSamlRequestLoginUarm() {
		return samlRequestLoginUarm;
	 }
	
	 public static void setSamlRequestLoginUarm(String samlRequestLoginUarm) {
		Configuration.samlRequestLoginUarm = samlRequestLoginUarm;
	 }
} 