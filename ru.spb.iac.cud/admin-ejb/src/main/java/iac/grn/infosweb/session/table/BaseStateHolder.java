package iac.grn.infosweb.session.table;

import java.util.List;
import java.util.Map;

import javaw.util.ArrayList;
import javaw.util.HashMap; import javaw.util.SerializableMap;
import javaw.util.SerializableList;


 public class BaseStateHolder implements java.io.Serializable {
	
	   protected /*Serializable*/ Map<String, String> sortOrders = new HashMap<String, String>();
       protected /*Serializable*/ Map<String, String> columnFilterValues = new HashMap<String, String>();
      
       protected /*Serializable*/ List <String> auditFieldListSelect = new ArrayList<String>();
       
       protected int pageNumber;

     
       
       public List<String> getAuditFieldListSelect() { return this.auditFieldListSelect; }
       public void setAuditFieldListSelect(List <String> auditFieldListSelect) {
    	   this.auditFieldListSelect=auditFieldListSelect;
       }
       public Map<String, String> getColumnFilterValues() {    	 
           return columnFilterValues;
       }
       public void setColumnFilterValues(Map<String, String> columnFilterValues) {    	  
    	  
    	   this.columnFilterValues = columnFilterValues;
       }
       public Map<String, String> getSortOrders() {
               return sortOrders;
       }
       public void setSortOrders(Map<String, String> sortOrders) {
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