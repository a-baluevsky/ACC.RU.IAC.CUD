package iac.grn.infosweb.context.mc.clusr;

import iac.grn.serviceitems.BaseTableItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap; import java.util.Map;
import java.util.List;

 public class ClUsrContext {

    private Map<String, BaseTableItem> auditItemsMap=new HashMap<String, BaseTableItem>();
	
	public Map <String, BaseTableItem> getAuditItemsMap() {
        return this.auditItemsMap;
    }
		
	public List <BaseTableItem> getAuditItemsCollection() {
		
		List<BaseTableItem> btiList = new ArrayList<BaseTableItem>(this.auditItemsMap.values());
		Collections.sort(btiList, new Comparator<BaseTableItem>() {

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
	
	public ClUsrContext(){
		
		auditItemsMap.put("signObject",new BaseTableItem("��� ����", "...", "signObject", 1));
		auditItemsMap.put("full",new BaseTableItem("������������", "...", "full", 2));
		auditItemsMap.put("fio",new BaseTableItem("���", "...", "fio", 3));
	    auditItemsMap.put("postalCode",new BaseTableItem("�������� ���", "...", "postalCode", 4));
		auditItemsMap.put("place",new BaseTableItem("��������� �����", "...", "place", 5));
		auditItemsMap.put("prefix",new BaseTableItem("������� ������", "...", "prefix", 6));
		auditItemsMap.put("house",new BaseTableItem("����� ����", "...", "house", 7));
		auditItemsMap.put("phone",new BaseTableItem("�������", "...", "phone", 8));
		auditItemsMap.put("fax",new BaseTableItem("����", "...", "fax", 9));
		auditItemsMap.put("email",new BaseTableItem("E-mail", "...", "email", 10));

		
	
	}
}
