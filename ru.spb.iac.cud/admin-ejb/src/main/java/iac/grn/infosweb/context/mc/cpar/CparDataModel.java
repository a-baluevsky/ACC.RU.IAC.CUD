package iac.grn.infosweb.context.mc.cpar;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.grn.infosweb.session.table.BaseDataModel;

import java.io.IOException;
import java.util.ArrayList;
import javax.faces.context.FacesContext;

import org.ajax4jsf.model.DataVisitor;
import org.ajax4jsf.model.Range;
import org.ajax4jsf.model.SequenceRange;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
 

@Name("cparDataModel")
 public class CparDataModel extends BaseDataModel<BaseItem, Long> {
	
	@Logger private Log log;
	
	@In(create=true)
	private CparDataProvider cparDataProvider;
	
	
	private static final long serialVersionUID = -1956179896877538628L;

	/**
	 * This is main part of Visitor pattern. Method called by framework many times during request processing. 
	 */
	@Override
	public void walk(FacesContext context, DataVisitor visitor, Range range, Object argument) throws IOException {
		
		log.info("walk:01:start");
			
		int firstRow = ((SequenceRange)range).getFirstRow();
		int numberOfRows = ((SequenceRange)range).getRows();
		
		
		wrappedKeys = new ArrayList<Long>();
		if(this.cachedItems==null){
			log.info("walk:cachedItems:02:");
			 this.cachedItems=getDataProvider().getItemsByrange(firstRow, numberOfRows, null, true);
		}
		log.info("walk:cachedItems:03:");
		if(this.cachedItems!=null){
		  for (BaseItem itemCpar:cachedItems) {
			wrappedKeys.add(itemCpar.getBaseId());
			wrappedData.put(itemCpar.getBaseId(), itemCpar);  
			 
		    visitor.process(context, itemCpar.getBaseId(), argument);
			 
		 }
		}
		log.info("walk:end");
	}
	/**
	 * This method must return actual data rows count from the Data Provider. It is used by pagination control
	 * to determine total number of data items.
	 */
	@Override
	public int getRowCount() {
		
	log.info("auditDataModel:getRowCount:01");
		
		String remoteAuditCpar = FacesContext.getCurrentInstance().getExternalContext()
		         .getRequestParameterMap()
		         .get("remoteAudit");
		String  auditListCount = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("auditListCount");
	
		if(this.flagAction==0){
			if (rowCount==null) {
				if(auditListCount!=null){
				   rowCount = new Integer(auditListCount);
				 }else{
				   rowCount = 0;
				 }
				log.info("getRowCount:02:rowCount:"+rowCount);
			}
		}else{
			if (rowCount==null) {
				// ��� selRecAllFact, clRecAllFact, clSelOneFact ��������
				// dataScroller �� ����������, � � ����������
				// rowCount � ��� ������������ ����� param['auditListCount']
				if(remoteAuditCpar==null){
					log.info("getRowCount:03_+");
					return 0;
				}
				if(remoteAuditCpar!=null &&
					("rowSelectFact".equals(remoteAuditCpar)/*||
				    "selRecAllFact".equals(remoteAudit)||
					"clRecAllFact".equals(remoteAudit)||
					"clSelOneFact".equals(remoteAudit)*/)&&
					auditListCount!=null){
					rowCount = new Integer(auditListCount);
				}else{
					rowCount = new Integer(
							getDataProvider().getRowCount());
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
		 
	
	}
	protected void resetDataProvider() {
		this.cparDataProvider = null;
	}

	public CparDataProvider getDataProvider() {
		  log.info("getDataProvider:01");
		if (cparDataProvider == null) {
			log.info("getDataProvider:02");
		}
		return cparDataProvider;
	}
	
	
}
