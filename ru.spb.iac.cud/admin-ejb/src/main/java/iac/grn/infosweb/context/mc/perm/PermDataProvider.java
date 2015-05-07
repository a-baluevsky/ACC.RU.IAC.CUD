package iac.grn.infosweb.context.mc.perm;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("permDataProvider")
 public class PermDataProvider implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1061465076923921202L;

	@Logger private transient Log log;
	
	@In(create=true)
	private PermManager permManager;

	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return permManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=permManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
