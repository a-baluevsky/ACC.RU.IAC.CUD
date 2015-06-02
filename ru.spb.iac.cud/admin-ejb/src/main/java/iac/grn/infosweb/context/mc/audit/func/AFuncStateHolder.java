package iac.grn.infosweb.context.mc.audit.func;

import iac.grn.infosweb.session.table.BaseStateHolder;

import java.util.Date;
import java.util.Map;
import java.util.Iterator;

import javax.faces.context.FacesContext;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.log.Log;


@Name("aFuncStateHolder")
@Scope(ScopeType.SESSION)
@AutoCreate
 public class AFuncStateHolder extends BaseStateHolder{
	
	   @Logger private static Log log;
	
         
       @Create
       public void create() {
    	   log.info("datatableStateHolder:create");
    	
    	
   		   
        }
       
          public void clearFilters(){
    	   log.info("clearFilters:01");
    	   if(columnFilterValues!=null){
           		for(Iterator<Map.Entry<String, String>> it = columnFilterValues.entrySet().iterator(); it.hasNext();)
    			{
    			      Map.Entry<String, String> me = it.next();
    			      Object oValue=me.getValue();
    			      if(oValue instanceof Date) {
    			    	  //act_dat_value2 
    			      }
    			      else if(oValue==null||((String)oValue).isEmpty()||"#-1#".equals(oValue)){
    	     			  log.info("Ahtung!!!");
    	     			  it.remove();
    	     		  }
    			}
          }
       }
       public void sort(String itemField){
    	   log.info("sort:itemField:"+itemField);
    	   
    	   String value=null;
    	   
    	   if(this.sortOrders.containsKey(itemField)){
    		   value=this.sortOrders.get(itemField);
    		   if(value!=null && "asc".equals(value)){
    			   this.sortOrders.put(itemField, "desc");
    		   }else{
    			   this.sortOrders.put(itemField, "asc");
    		   }
    	   }else{
    		   this.sortOrders.clear();
    		   this.sortOrders.put(itemField, "asc");  
    	   }
    	   log.info("sort:02");
       }
       
       public void sort(){
    	   String itemField = FacesContext.getCurrentInstance().getExternalContext()
  	             .getRequestParameterMap()
  	             .get("itemField");
  	 
    	   log.info("sort:itemField:"+itemField);
    	   
    	   String value=null;
    	   
    	   if(this.sortOrders.containsKey(itemField)){
    		   value=this.sortOrders.get(itemField);
    		   if(value!=null && "asc".equals(value)){
    			   this.sortOrders.put(itemField, "desc");
    		   }else{
    			   this.sortOrders.put(itemField, "asc");
    		   }
    	   }else{
    		   this.sortOrders.clear();
    		   this.sortOrders.put(itemField, "asc");  
    	   }
    	   log.info("sort:02");
       }
    }