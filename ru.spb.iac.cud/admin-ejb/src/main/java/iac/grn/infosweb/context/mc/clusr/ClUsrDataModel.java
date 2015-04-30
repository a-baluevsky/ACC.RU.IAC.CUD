package iac.grn.infosweb.context.mc.clusr;

import iac.cud.infosweb.dataitems.BaseItem;
import iac.grn.infosweb.session.table.BaseDataModel;

import java.io.IOException;
import javaw.util.ArrayList;
import javax.faces.context.FacesContext;

import org.ajax4jsf.model.DataVisitor;
import org.ajax4jsf.model.Range;
import org.ajax4jsf.model.SequenceRange;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
 

@Name("clUsrDataModel")
 public class ClUsrDataModel extends BaseDataModel<BaseItem, Long> {
	
	@Logger private transient Log log;
	
	@In(create=true)
	private ClUsrDataProvider clUsrDataProvider;
	
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
		  for (BaseItem itemClUsr:cachedItems) {
			wrappedKeys.add(itemClUsr.getBaseId());
			wrappedData.put(itemClUsr.getBaseId(), itemClUsr);  
			 
		    visitor.process(context, itemClUsr.getBaseId(), argument);
			 
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
			
		
		String remoteAuditClUsr = FacesContext.getCurrentInstance().getExternalContext()
		         .getRequestParameterMap()
		         .get("remoteAudit");
		String  auditListCount = FacesContext.getCurrentInstance().getExternalContext()
			        .getRequestParameterMap()
			        .get("auditListCount");
		log.info("auditDataModel:getRowCount:remoteAudit:"+remoteAuditClUsr);
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
				// ��� selRecAllFact, clRecAllFact, clSelOneFact ��������
				// dataScroller �� ����������, � � ����������
				// rowCount � ��� ������������ ����� param['auditListCount']
				if(remoteAuditClUsr==null){
					log.info("getRowCount:03_+");
					return 0;
				}
				else if(("rowSelectFact".equals(remoteAuditClUsr)/*||
				    "selRecAllFact".equals(remoteAudit)||
					"clRecAllFact".equals(remoteAudit)||
					"clSelOneFact".equals(remoteAudit)*/)&&
					auditListCount!=null){
					rowCount = Integer.valueOf(auditListCount);
				} else{
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
		 
	
	}
		
	protected void resetDataProvider() {
		this.clUsrDataProvider = null;
	}

	public ClUsrDataProvider getDataProvider() {
		  log.info("getDataProvider:01");
		if (clUsrDataProvider == null) {
			log.info("getDataProvider:02");
			//dataPro/vider = lookupInCon/text(auctionDataProvi/derExpressionStr/ing, AuctionDataProvider.class);
		}
		return clUsrDataProvider;
	}
	
}
