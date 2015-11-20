package iac.grn.infosweb.context.app.system.modify;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.grn.infosweb.session.table.BaseDataModel;

import java.util.List;

import static iac.cud.jboss.SeamComponentAdminEjb.*;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
 

@Name("appSystemModifyDataModel")
 public class AppSystemModifyDataModel extends BaseDataModel<BaseItem, Long>  {
	
	@In(create=true)
	private AppSystemModifyManager appSystemModifyManager;

	@Override
	public int getNumRecords(String modelType) {
		
		int ri=0;
		Long rL=appSystemModifyManager.getAuditCount();
		if(rL!=null){
			ri = Integer.parseInt(rL.toString());
		}
		return ri;
	}

	@Override
	public Long getId(BaseItem object) {
		// TODO Auto-generated method stub
		 
		return object.getBaseId();
	}

	@Override
	public List<BaseItem> findObjects(int firstRow, int numberOfRows,
			String sortField, boolean ascending, String modelType) {
		
    	return appSystemModifyManager.getAuditList(firstRow, numberOfRows);  
	}
	
	public void filterAction() {
		 log.info("appSystemModifyDataModel:filterAction");
	     super.filterAction();
		 
	     AppSystemModifyStateHolder appSystemModifyStateHolder = getSessionItem("appSystemModifyStateHolder");
		 appSystemModifyStateHolder.clearFilters();
	}

}

