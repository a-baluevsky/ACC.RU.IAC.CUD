package iac.grn.infosweb.context.mc.armgroup;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("armGroupDataProvider")
 public class ArmGroupDataProvider implements Serializable {
	
	@Logger private transient Log log;
	
	@In(create=true)
	private ArmGroupManager armGroupManager;

	
	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return armGroupManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=armGroupManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
