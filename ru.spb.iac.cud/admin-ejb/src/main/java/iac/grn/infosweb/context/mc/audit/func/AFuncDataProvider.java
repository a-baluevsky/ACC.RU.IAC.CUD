package iac.grn.infosweb.context.mc.audit.func;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import javaw.util.ArrayList;
import javaw.util.SerializableList;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;


@Name("aFuncDataProvider")
 public class AFuncDataProvider implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5797847804560674152L;

	@Logger private transient Log log;
	
	@In(create=true)
	private AFuncManager aFuncManager;

	
	public SerializableList<BaseItem> getItemsByrange(int firstRow, int numberOfRows, String sortField, 
			                                   boolean ascending) {
		log.info("AuditDataProvider:getItemsByrange");
		return aFuncManager.getAuditList(firstRow, numberOfRows);
	}
	
	public void update() {
		// nothing need to do
	}
	
	public int getRowCount() {
		int ri=0;
		Long rL=aFuncManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}
}
