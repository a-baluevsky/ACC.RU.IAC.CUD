package iac.grn.infosweb.session.table;

import javaw.util.ArrayList;
import javaw.util.HashMap; import javaw.util.SerializableMap;
import javaw.util.SerializableList;


 public class BaseStateHolder implements java.io.Serializable {
	
	   protected SerializableMap<String, String> sortOrders = new HashMap<String, String>();
       protected SerializableMap<String, String> columnFilterValues = new HashMap<String, String>();
      
       protected SerializableList <String> auditFieldListSelect = new ArrayList<String>();
       
       protected int pageNumber;

     
       
       public SerializableList<String> getAuditFieldListSelect() {
    	   return new ArrayList<String>(this.auditFieldListSelect);
       }
       public void setAuditFieldListSelect(SerializableList <String> auditFieldListSelect) {
    	   this.auditFieldListSelect=auditFieldListSelect;
       }
       public SerializableMap<String, String> getColumnFilterValues() {
    	 
           return columnFilterValues;
       }
       public void setColumnFilterValues(HashMap<String, String> columnFilterValues) {
    	  
    	   this.columnFilterValues = columnFilterValues;
       }
       public SerializableMap<String, String> getSortOrders() {
               return sortOrders;
       }
       public void setSortOrders(HashMap<String, String> sortOrders) {
                this.sortOrders = sortOrders;
       }
       
       
		public int getPageNumber() {
			return this.pageNumber;
		}
	
		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}
	
		public void resetPageNumber() {
			this.pageNumber = 1;
		}
         
    }