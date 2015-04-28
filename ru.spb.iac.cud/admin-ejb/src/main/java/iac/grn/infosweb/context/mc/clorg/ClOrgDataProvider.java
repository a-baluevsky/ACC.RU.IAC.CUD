package iac.grn.infosweb.context.mc.clorg;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("clOrgDataProvider")
 public class ClOrgDataProvider implements Serializable{
	
	@Logger private transient Log log;
	
	@In(create=true)
	private ClOrgManager clOrgManager;

	
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return clOrgManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=clOrgManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
