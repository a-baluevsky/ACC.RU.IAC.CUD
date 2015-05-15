package javaw.io;

import java.io.IOException;

public abstract class Closeable implements java.io.Closeable {
	public static boolean Close(String[] logMessage, java.io.Closeable f) {
		if(f!=null)
			try {
				f.close();
				return true;
			} catch (IOException e) {
				if(logMessage!=null) {
					logMessage[0] = e.toString();
				}
				return false;
			}
		return true;
    }
	public static boolean Close(String[] logMessage, java.io.Closeable f1, java.io.Closeable f2) {
		return Close(logMessage, f1, f2, null);
	}
	public static boolean Close(String[] logMessage, java.io.Closeable f1, java.io.Closeable f2, java.io.Closeable f3) {
    	boolean result = true;
    	if(logMessage!=null) {
    		StringBuilder lgMsg = new StringBuilder(logMessage[0]);
    		if(f1!=null && !Close(logMessage, f1)) {
    			lgMsg.append('\n').append(logMessage[0]);
    			result = false;
    		}
    		if(f2!=null && !Close(logMessage, f2)) {
    			lgMsg.append('\n').append(logMessage[0]);
    			result = false;
    		}
    		if(f3!=null && !Close(logMessage, f3)) {
    			lgMsg.append('\n').append(logMessage[0]);
    			result = false;
    		}    		
    		logMessage[0] = lgMsg.toString();
    	} else {
    		if(f1!=null && !Close(null, f1)) result = false;
    		if(f2!=null && !Close(null, f2)) result = false;
    		if(f3!=null && !Close(null, f3)) result = false;
    	}
    	return result;    	
    }	
}
