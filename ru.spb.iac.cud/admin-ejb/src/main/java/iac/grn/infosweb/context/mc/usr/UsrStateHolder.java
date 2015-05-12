package iac.grn.infosweb.context.mc.usr;

import iac.grn.infosweb.session.table.BaseStateHolder;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.log.Log;


@Name("usrStateHolder")
@Scope(ScopeType.SESSION)
@AutoCreate
 public class UsrStateHolder extends BaseStateHolder{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = -5477916252932838L;
	@Logger private static transient Log log;
	
        
       @Create
       public void create() {
    	   log.info("datatableStateHolder:create");
    	
         }
       
       private boolean fmtDate(Object odt, StringBuffer bufDate) {
    	   if((bufDate!=null) && (odt instanceof Date)) {
    		   Date dt = (Date)odt;
    		   SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
    		   bufDate.append(df.format(dt));
    		   return true;
    	   }
    	   return false;
       }
        public void clearFilters(){
    	   log.info("clearFilters:01");
    	   if(columnFilterValues!=null){
           		for(Iterator<Map.Entry<String, String>> it = columnFilterValues.entrySet().iterator(); 
           			it.hasNext(); )
    			{   
    			      Map.Entry<String, String> me =  it.next();
    			      Object oCurValue=me.getValue();    			      
    			      if(oCurValue==null) {    			    	  
    			    	  it.remove();
    			      } else {    			    	  
	    			      String sCurTxt=null;	    			      
	    			      if(oCurValue instanceof String) { // trivial case
	    			    	  sCurTxt = (String)oCurValue;
	    			      } else { // try to format known types
	    			    	  StringBuffer sbCurTxt=new StringBuffer();
	    			    	  if(fmtDate(oCurValue, sbCurTxt)) {
	    			    		  me.setValue(sbCurTxt.toString());
		    			      } else { // last resort: just toString!
		    			    	  sCurTxt = oCurValue.toString();
		    			      }
	    			      }
	    			      
	    				  if(sCurTxt.isEmpty()||"#-1#".equals(sCurTxt)){
	    	     			  log.info("Ahtung!!!");
	    	     			  it.remove();
	    	     		  }	    			      
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