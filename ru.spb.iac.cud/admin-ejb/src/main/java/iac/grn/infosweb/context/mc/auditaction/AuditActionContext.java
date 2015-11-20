package iac.grn.infosweb.context.mc.auditaction;

import iac.grn.infosweb.context.mc.MCBaseContext;
import iac.grn.serviceitems.BaseTableItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap; 
import java.util.Map;
import java.util.List;

 public class AuditActionContext extends MCBaseContext {

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
	
	public AuditActionContext(){
		auditItemsMap.put("full",			new BaseTableItem("Название", 	"...", "full", "o.full", "o.full", 1));
		auditItemsMap.put("sign",			new BaseTableItem("Код", 		"...", "sign", 			2));		
		auditItemsMap.put("descriptions",	new BaseTableItem("Описание", 	"...", "descriptions", 	3));
		//auditItemsMap.put("acIsBssT",		new BaseTableItem("Система", 	"...", "acIsBssT" /*, "o.acIsBssT", "o.acIsBssT",*/,  4));
		auditItemsMap.put("armName",new BaseTableItem("ИС","...", "armName", "acIsBssT2.name", "acIsBssT" , 4));
	}
}
