package iac.grn.infosweb.context.mc.audit.func;

import iac.grn.serviceitems.BaseTableItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap; import java.util.Map;
import java.util.List;

 public class AFuncContext {

    private Map<String, BaseTableItem> auditItemsMap=new HashMap<String, BaseTableItem>();
	
	public Map<String, BaseTableItem> getAuditItemsMap() {
        return this.auditItemsMap;
    }
	
	
	public List <BaseTableItem> getAuditItemsCollection() {
		
		List<BaseTableItem> btiList = new ArrayList<BaseTableItem>(this.auditItemsMap.values());
		
		Collections.sort(btiList,  new Comparator<BaseTableItem>() {			
	        public int compare(BaseTableItem o1, BaseTableItem o2) {
	        	
	        	int sort1=o1.getItemSort();
	        	int sort2=o2.getItemSort();
	        	
	        	if(sort1 > sort2){
	                return 1;
	            }else if(sort1 < sort2){
	                return -1; 
	            }else{
	                return 0;
	            }    
	         }
	    });

        return btiList;
    }
	
	public AFuncContext(){
		
		// ����� field.ite/mFiltField ��� field.itemS/ortField
		
		auditItemsMap.put("dateAction",new BaseTableItem("���� � ����� ��������", "...", "dateActionValue", "act_dat", "act_dat_value", 1));
	    auditItemsMap.put("userName",new BaseTableItem("������������", "...", "userName", "usr_fio", "usr_fio", 2));
	    auditItemsMap.put("isName",new BaseTableItem("��", "...", "isName", "arm_name", "arm_id", 3));
		auditItemsMap.put("actName",new BaseTableItem("��������", "...", "actName", "act_name", "act_name", 4));
		auditItemsMap.put("detailsAction",new BaseTableItem("�������������", "...", "detailsAction", "details_action", "details_action", 5));
		
		
	}
}
