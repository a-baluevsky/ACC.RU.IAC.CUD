package iac.grn.infosweb.context.mc.auditaction;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("auditActionDataProvider")
 public class AuditActionDataProvider implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4246506000770217726L;

	@Logger private transient Log log;
	
	@In(create=true)
	private AuditActionManager auditActionManager;


	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return auditActionManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=auditActionManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}