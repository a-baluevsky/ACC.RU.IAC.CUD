package iac.grn.infosweb.context.mc.clusr;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("clUsrDataProvider")
 public class ClUsrDataProvider implements Serializable{
	
	@Logger private transient Log log;
	
	@In(create=true)
	private ClUsrManager clUsrManager;

		
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return clUsrManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=clUsrManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
