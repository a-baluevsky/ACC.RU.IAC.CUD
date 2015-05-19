package iac.grn.serviceitems;

import java.util.Date;

 public class ProcInfoItem {

    private Date execDate;
	
	private String execHit;
	
	private Date confDate;
	
    private Long confPeriod;
	
	public Date getExecDate(){
		return this.execDate==null ? null: (Date)this.execDate.clone();
	}
	public void setExecDate(Date execDate){
		this.execDate=(execDate==null)?null:(Date)execDate.clone();
	}
	
	public String getExecHit(){
		return this.execHit;
	}
	public void setExecHit(String execHit){
		this.execHit=execHit;
	}
	
	public Date getConfDate(){
		return this.confDate==null ? null: (Date)this.confDate.clone();
	}
	public void setConfDate(Date confDate){
		this.confDate=(confDate==null)?null:(Date)confDate.clone();
	}
	
	public Long getConfPeriod(){
		return this.confPeriod;
	}
	public void setConfPeriod(Long confPeriod){
		this.confPeriod=confPeriod;
	}
}
