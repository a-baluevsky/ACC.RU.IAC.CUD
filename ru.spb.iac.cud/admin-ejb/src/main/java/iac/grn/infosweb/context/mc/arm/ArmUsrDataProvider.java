package iac.grn.infosweb.context.mc.arm;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("armUsrDataProvider")
 public class ArmUsrDataProvider implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7497911988881359441L;

	@Logger private transient Log log;
	
	@In(create=true)
	private ArmUsrManager armUsrManager;

		
	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, 
								String sortField, boolean ascending) {
		log.info("ugroupUsrDataProvider:getItemsByrange");
		return armUsrManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=armUsrManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
