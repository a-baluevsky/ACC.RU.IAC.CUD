package iac.cud.jboss;

import java.util.Map;

import javax.faces.context.FacesContext;

public class FacesContextAdminEjb {
	public static Map<String, String> getRequestParameterMap() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
	}
	public static String getRequestParameterMap(Object key) {
		return getRequestParameterMap().get(key);
	}
	public static String getSessionId() {		return  getRequestParameterMap("sessionId");	}
}
