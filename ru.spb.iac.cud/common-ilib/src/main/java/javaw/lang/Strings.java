package javaw.lang;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

// Convenient methods for String manipulation
public abstract class Strings {	
	interface Stringer {
		// SimpleValue
		String formatString(String value);
		String formatToken(String value);
		// Property: PropName, PropValue
		String formatObject(String itemName, String itemData);		
		String formatVariable(String varName, String varValue);
	}
	
	static class StringerRON implements Stringer {
		static final String DQ = "\"";
		
		public String formatObject(String itemName, String itemData) {			
			return formatToken(formatString(itemName)+((itemData!=null)?formatToken(itemData):""));
		}
		
		public String formatString(String value) {
			if(value==null) return "";
			String sNoWS = value.replaceAll("\\s|\\W|\\d", "");
			String sEsc = value.replaceAll(DQ, "\\"+DQ);
			int lnws=sNoWS.length();
			return (lnws==0 || lnws!=value.length())?DQ+sEsc+DQ:sEsc;
		}
		
		public String formatVariable(String varName, String varValue) {
			StringBuilder sb = new StringBuilder(formatString(varName));
			sb.append(": ").append(varValue).append("\n");
			return sb.toString();
		}
		
		public String formatToken(String itemData) {
			StringBuilder sb = new StringBuilder();
			return sb.append("(").append(itemData).append(")").toString();
		}
	}
	
	static class StrSerializer {
		private static String fmtVariable(Stringer sg, String varName, Object o) {
			return sg.formatVariable(varName, fmtPropValue(sg, o));
		} // fmtVariable		
		
		public static String fmtProperty(Stringer sg, String PropName, Object PropValue) {		
			return sg.formatObject(PropName, fmtPropValue(sg, PropValue));
		} // fmtProperty

		// Simple type can be represented (and parsed) as a single plain string  
		static boolean isSimpleType(Class<?> cls) {
			for(Class<?> t: new Class<?>[]{
					String.class, Boolean.class, 
					Integer.class, Long.class, Float.class,
					Date.class})
				if(cls.isAssignableFrom(t))
					return true;
			return false;
		}
		
		private static String fmtPropValue(Stringer sg, Object PropValue) {
			if(PropValue==null) return "";
			Class<?> cls = PropValue.getClass();
			return sg.formatString(cls.getSimpleName())+ 
						sg.formatToken(isSimpleType(cls)?
							sg.formatString(PropValue.toString()):
							fmtComplexType(sg, cls, PropValue));
		} // fmtPropValue
		
		private static String fmtComplexType(Stringer sg, Class<?> cls, Object o) {			
			return (cls.isArray())?fmtArray2(sg,o): fmtPropList(sg, o);
		}
		
		private static String fmtArray2(Stringer sg, Object o) {
			Class<?> cls = o.getClass().getComponentType();
			if(isSimpleType(cls)) {
				StringBuilder sb = new StringBuilder(cls.getSimpleName());
				int cnt = Array.getLength(o);				
				for(int i=0; i<cnt; ++i) {
					sb.append(sg.formatToken(Array.get(o, i).toString()));
				}			
				return sb.toString();
			} else return fmtArray1(sg, o);
		}
		
		private static String fmtArray1(Stringer sg, Object o) {
			ArrayList<Object> al = new ArrayList<>();
			for(int i=0; i<Array.getLength(o); ++i) {
				al.add(Array.get(o, i));
			}
			return fmtPropList(sg, al);
		}
		
		private static String fmtPropList(Stringer sg, Object o) {
			StringBuilder sb = new StringBuilder();
			if(o instanceof Iterable) {
				for(Object oi: (Iterable<?>)o)
					sb.append(sg.formatToken(fmtPropValue(sg, oi)));
			} else
				for(Method m: o.getClass().getMethods()) {
					String mn = m.getName();
					if(mn.startsWith("get") && mn!="getClass") {
						try {
							sb.append(fmtProperty(sg, mn.substring(3), m.invoke(o)));
						} catch (Exception e) {				
							e.printStackTrace();
						}				
					}
				}	
			return sb.toString();	
		} // fmtPropList		
	}
	
	public static String toRON(String varName, Object o) {
		StringerRON ron = new StringerRON();
		return StrSerializer.fmtVariable(ron, varName, o);		
	}

	public static List<String[]> stringifyList(List<Object[]> dataRows) {
		List<String[]> l = new ArrayList<String[]>();
		if(dataRows!=null && dataRows.get(0)!=null) {
			int rwSize = dataRows.get(0).length;
			for(Object o: dataRows) {
				Object[] r = (Object[]) o;
				String[] curRow = new String[rwSize];
				for (int i = 0; i < rwSize; i++) {
					curRow[i] = r[i].toString();					
				}
				l.add(curRow);
			}			
		}
		return l;		
	}

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
	
	public static boolean isNullOrEmpty(String str) {
		return str==null || str.isEmpty();
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
