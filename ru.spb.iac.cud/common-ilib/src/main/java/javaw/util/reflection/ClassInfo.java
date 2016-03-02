package javaw.util.reflection;

import java.net.URL;

public class ClassInfo {
	public static URL getClassFileLocation(Object o) {
		final Class<?> cls = o.getClass();
		URL csLoc = null;
		try {
			csLoc = cls.getProtectionDomain().getCodeSource().getLocation();
		} catch(Exception e) { }
		if(csLoc==null) {
			final ClassLoader loader = cls.getClassLoader();
			final String clsName = cls.getSimpleName();
			csLoc = loader.getResource(clsName+".class");			
		}
		return csLoc;
	}
}
