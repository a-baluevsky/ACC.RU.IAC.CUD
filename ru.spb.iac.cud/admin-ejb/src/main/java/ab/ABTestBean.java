package ab;

public class ABTestBean {
  private String myValue = "";
  
  public void setValue(String newValue) {
    this.myValue = newValue;
  }
  
  public String getValue() {
    return "ABTestBean: "+this.myValue;
  }
}
