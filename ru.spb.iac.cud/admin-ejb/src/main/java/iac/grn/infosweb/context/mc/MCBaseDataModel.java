package iac.grn.infosweb.context.mc;

import static iac.cud.jboss.SeamComponentAdminEjb.getSessionItem;

import java.io.IOException;

import javaw.util.ArrayList;

import javax.faces.context.FacesContext;

import org.ajax4jsf.model.DataVisitor;
import org.ajax4jsf.model.Range;
import org.ajax4jsf.model.SequenceRange;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.grn.infosweb.context.mc.arm.ArmDataProvider;
import iac.grn.infosweb.context.mc.arm.ArmStateHolder;
import iac.grn.infosweb.session.table.BaseDataModel;

public class MCBaseDataModel extends BaseDataModel<BaseItem, Long> {
	@Logger protected transient Log log;
	
	@In(create=true)
	protected ArmDataProvider armDataProvider;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1956179896877538628L;
	
	/**
	 * This is main part of Visitor pattern. Method called by framework many times during request processing. 
	 */
	@Override
	public void walk(FacesContext context, DataVisitor visitor, Range range, Object argument) throws IOException {
		
		log.info("walk:01:start");
	
	
		
		int firstRow = ((SequenceRange)range).getFirstRow();
		int numberOfRows = ((SequenceRange)range).getRows();
		
		log.info("walk:firstRow:"+firstRow);
		log.info("walk:numberOfRows:"+numberOfRows);
		log.info("walk:cachedItems:01:"+(this.cachedItems==null));
		
		wrappedKeys = new ArrayList<Long>();
		if(this.cachedItems==null){
			log.info("walk:cachedItems:02:");
			 this.cachedItems=new ArrayList<BaseItem>(getDataProvider().getItemsByrange(firstRow, numberOfRows, null, true));
		}
		log.info("walk:cachedItems:03:");
		if(this.cachedItems!=null){
		  for (BaseItem itemArm:cachedItems) {
			wrappedKeys.add(itemArm.getBaseId());
			wrappedData.put(itemArm.getBaseId(), itemArm);  
			 
		    visitor.process(context, itemArm.getBaseId(), argument);
			 
		 }
		}
		log.info("walk:end");
	}
	
	/**
	 * This method must return actual data rows count from the Data Provider. It is used by pagination control
	 * to determine total number of data items.
	 */
	 // better to buffer row count locally
	@Override
	public int getRowCount() {
		
	log.info("auditDataModel:getRowCount:01");
		
		String remoteAuditArm = FacesContext.getCurrentInstance().getExternalContext()
		         .getRequestParameterMap()
		         .get("remoteAudit");
		String  auditListCount = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("auditListCount");
		log.info("auditDataModel:getRowCount:remoteAudit:"+remoteAuditArm);
		log.info("auditDataModel:getRowCount:auditListCount:"+auditListCount);
	
		if(this.flagAction==0){
			if (rowCount==null) {
				if(auditListCount!=null){
				   rowCount = Integer.valueOf(auditListCount);
				 }else{
				   rowCount = 0;
				 }
				log.info("getRowCount:02:rowCount:"+rowCount);
			}
		}else{
			if (rowCount==null) {
				// При selRecAllFact, clRecAllFact, clSelOneFact запросах
				// dataScroller не рендерится, а в параметрах
				// rowCount и так определяется через param['auditListCount']
				if(remoteAuditArm==null){
					log.info("getRowCount:03_+");
					return 0;
				}
				if(("rowSelectFact".equals(remoteAuditArm)/*||
				    "selRecAllFact".equals(remoteAudit)||
					"clRecAllFact".equals(remoteAudit)||
					"clSelOneFact".equals(remoteAudit)*/)&&
					auditListCount!=null){
					rowCount = Integer.valueOf(auditListCount);
				}else{
					rowCount = Integer.valueOf(getDataProvider().getRowCount());
				}
				log.info("getRowCount:03:rowCount:"+rowCount);
			}
		}
		return rowCount.intValue();
	}

	 public void filterAction() {
		 log.info("filterAction");
		 this.cachedItems = null;
		 this.rowCount=null;
		 this.flagAction=1;
		 
		 ArmStateHolder armStateHolder = getSessionItem("armStateHolder");
		 armStateHolder.clearFilters();
		 
	
	}


	/**
	 * This is helper method that is called by framework after model update. 
	 * In must delegate actual database update to Data Provider.
	 */
	@Override
	public void update() {
	
	}
	
	protected void resetDataProvider() {
		this.armDataProvider = null;
	}

	public ArmDataProvider getDataProvider() {
		  log.info("getDataProvider:01");
		if (armDataProvider == null) {
			log.info("getDataProvider:02");
		}
		return armDataProvider;
	}	
}
