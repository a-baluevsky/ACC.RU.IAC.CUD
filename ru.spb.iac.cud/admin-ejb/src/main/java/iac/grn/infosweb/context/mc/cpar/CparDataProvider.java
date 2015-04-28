package iac.grn.infosweb.context.mc.cpar;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("cparDataProvider")
 public class CparDataProvider implements Serializable{
	
	@Logger private transient Log log;
	
	@In(create=true)
	private CparManager cparManager;

		
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return cparManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=cparManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
