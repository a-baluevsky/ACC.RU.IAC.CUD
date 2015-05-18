package javaw.lang;

// Convenient methods for String manipulation
public abstract class Strings {	
	public static boolean equalsTrim(String s1, String s2) {
        if(s1==null || s2==null) {
        	return false;
        }
        return s1.trim().equals(s2.trim());        		
	}
	// Trim only second arg. Typical usage: Strings.equalsTrim2("const", strObj);
	public static boolean equalsTrim2(String s1, String s2) {
		if(s2==null) return false;
        return s2.trim().equals(s1);        		
	}
	public static boolean isNullOrEmpty(String s) {
		return s==null || s.length()==0;
	}	
	public static boolean isNullOrEmptyTrim(String s) {
		return s==null || s.trim().length()==0;
	}
	public static String defaultForNullOrEmpty(String s, String defaultValue) {
		return s==null || s.length()==0 ? defaultValue : s;
	}
	public static String defaultForNullOrEmptyTrim(String s, String defaultValue) {
		if(s==null)	return defaultValue;
		String st = s.trim();			
		return  st.length()==0 ? defaultValue: st;
	}
}
