package javaw.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;

public class Strings {
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
		static boolean isSimpleType(Class cls) {
			for(Class t: new Class[]{
					String.class, Boolean.class, 
					Integer.class, Long.class, Float.class,
					Date.class})
				if(cls.isAssignableFrom(t))
					return true;
			return false;
		}
		
		private static String fmtPropValue(Stringer sg, Object PropValue) {
			if(PropValue==null) return "";
			Class cls = PropValue.getClass();
			return sg.formatString(cls.getSimpleName())+ 
						sg.formatToken(isSimpleType(cls)?
							sg.formatString(PropValue.toString()):
							fmtComplexType(sg, cls, PropValue));
		} // fmtPropValue
		
		private static String fmtComplexType(Stringer sg, Class cls, Object o) {			
			return (cls.isArray())?fmtArray2(sg,o): fmtPropList(sg, o);
		}
		
		private static String fmtArray2(Stringer sg, Object o) {
			Class cls = o.getClass().getComponentType();
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
			ArrayList al = new ArrayList();
			for(int i=0; i<Array.getLength(o); ++i) {
				al.add(Array.get(o, i));
			}
			return fmtPropList(sg, al);
		}
		
		private static String fmtPropList(Stringer sg, Object o) {
			StringBuilder sb = new StringBuilder();
			if(o instanceof Iterable) {
				for(Object oi: (Iterable)o)
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

}