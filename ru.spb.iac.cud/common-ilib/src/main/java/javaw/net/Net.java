package javaw.net;

import javaw.lang.Strings;

public class Net {

	public Net() {

	}

	// # A.B. by SONARQUBE: protect against HTTP parameter directly written to HTTP header output
	//	1. single line
	public static String secureEncodeResponse(String userInputArg) {
		// keep only first line; delete all the rest
		return userInputArg==null?"": userInputArg.replaceAll("\\r?\\n(.|\\r|\\n)*", "");
	}
	public static void secureFormatWebParam(StringBuilder out, String paramName, String paramValue) {
		if(out==null || paramValue==null || paramValue.trim().length()==0)
			return;
		out.append("&").append(paramName).append("=").append(secureEncodeResponse(paramValue));
	}
	
}
