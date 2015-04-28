package iac.grn.infosweb.context.mc.rol;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("rolDataProvider")
 public class RolDataProvider implements Serializable{
	
	@Logger private static transient Log log;
	
	@In(create=true)
	private RolManager rolManager;

		
	public List<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return rolManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=rolManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
