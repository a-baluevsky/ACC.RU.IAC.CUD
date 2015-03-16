package ab;

import org.jboss.seam.annotations.Name;


@Name("ABTestAction")
public class ABTestAction {
	private String myValue = "";
	
	public void setValue(String newValue) {
		this.myValue = newValue;
	}
	
	public String getValue() {
		return this.myValue;
	}
	
	public String doAction() {
		//return "ABTestAction: "+this.myValue;
		this.myValue="ABTestAction:"+this.myValue;
		return "result";
	}
	
	public void doAjaxAction() {
		this.myValue="ABTestAction:"+this.myValue;		
	}
}
