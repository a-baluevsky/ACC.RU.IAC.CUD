package iac.cud.jboss;

import java.util.List;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;

public class SeamComponentAdminWeb extends SeamComponent {

	// taken from base
	@SuppressWarnings("unchecked")
	public static<T> T getEventItem(final String itemName) {
		return (T)Component.getInstance(itemName,ScopeType.EVENT);
	}
}
