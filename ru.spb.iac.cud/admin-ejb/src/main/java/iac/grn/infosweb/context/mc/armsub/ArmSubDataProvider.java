package iac.grn.infosweb.context.mc.armsub;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("armSubDataProvider")
 public class ArmSubDataProvider implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3389019306715187338L;

	@Logger private transient Log log;
	
	@In(create=true)
	private ArmSubManager armSubManager;

	
	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return armSubManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=armSubManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
