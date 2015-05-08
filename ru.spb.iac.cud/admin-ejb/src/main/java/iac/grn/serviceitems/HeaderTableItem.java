package iac.grn.serviceitems;

import javaw.util.ArrayList;
import javaw.util.SerializableList;
import java.util.List;


 public class HeaderTableItem implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3030342166451950655L;
	private String itemLabel;
	private String itemField;
	private SerializableList<BaseTableItem> items=new ArrayList<BaseTableItem>();
		
	public HeaderTableItem(String itemLabel, String itemField){
		this.itemLabel=itemLabel;
		this.itemField=itemField;
	}
	
	public String getItemLabel(){
		return this.itemLabel;
	}
	public void setItemLabel(String itemLabel){
		this.itemLabel=itemLabel;
	}
	
	public List<BaseTableItem> getItems(){
		return this.items;
	}
	public void setItems(List<BaseTableItem> items){
		this.items=new ArrayList<BaseTableItem>(items);
	}
	
	public String getItemField(){
		return this.itemField;
	}
	public void setItemField(String itemField){
		this.itemField=itemField;
	}
}
