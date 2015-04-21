package iac.grn.infosweb.context.mc.audit.sys;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import javaw.util.ArrayList;
import javaw.util.SerializableList;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("aSysDataProvider")
 public class ASysDataProvider implements Serializable{
	
	@Logger private transient Log log;
	
	@In(create=true)
	private ASysManager aSysManager;

		
	
	
	public SerializableList<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		SerializableList<BaseItem> ret = new ArrayList<BaseItem>();
		log.info("AuditDataProvider:getItemsByrange");
		ret=aSysManager.getAuditList(firstRow, numberOfRows);
		return ret;
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=aSysManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
