package iac.cud.jboss;
import java.util.List;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;

import iac.grn.infosweb.session.navig.LinksMap;

public class SeamComponentAdminEjb extends SeamComponent {	
	public static LinksMap getApplicationLinksMap() { return getApplicationItem("linksMap"); }		
	
	// taken from base
	@SuppressWarnings("unchecked")
	public static<T> List<T> getSessionList(final String listName) {		
		return (List<T>)Component.getInstance(listName,ScopeType.SESSION);
	}
	@SuppressWarnings("unchecked")
	public static<T> T getSessionItem(final String itemName) {		
		return (T)Component.getInstance(itemName,ScopeType.SESSION);
	}
	@SuppressWarnings("unchecked")
	public static<T> T getConversationItem(final String itemName) {
		return (T)Component.getInstance(itemName,ScopeType.CONVERSATION);
	}
	@SuppressWarnings("unchecked")
	public static<T> T getItem(final String itemName) {
		return (T)Component.getInstance(itemName);
	}
	@SuppressWarnings("unchecked")
	public static<T> T getEventItem(final String itemName) {
		return (T)Component.getInstance(itemName,ScopeType.EVENT);
	}
	@SuppressWarnings("unchecked")
	public static <T> T getApplicationItem(final String itemName) {
		return (T)Component.getInstance(itemName,ScopeType.APPLICATION);
	}	
}
