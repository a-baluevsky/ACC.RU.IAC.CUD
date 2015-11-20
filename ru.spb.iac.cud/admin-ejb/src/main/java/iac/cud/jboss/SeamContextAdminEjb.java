package iac.cud.jboss;

import org.jboss.seam.contexts.Contexts;

public class SeamContextAdminEjb {
	public static void setSessionContext(String name, Object value) { Contexts.getSessionContext().set(name, value); }
	public static void setEventContext(String name, Object value) 	{ Contexts.getEventContext().set(name, value);   }
}
