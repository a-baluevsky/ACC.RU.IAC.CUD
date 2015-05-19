package iac.grn.serviceitems;

import java.util.Date;

 public class ProcItem {

    private Date startDate;
	
	private String status;
	
	private Long period;
		
	public Date getStartDate(){
		return this.startDate==null ? null: (Date)this.startDate.clone();
	}
	public void setStartDate(Date startDate){
		this.startDate=(startDate==null)?null:(Date)startDate.clone();
	}
	
	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public Long getPeriod(){
		return this.period;
	}
	public void setPeriod(Long period){
		this.period=period;
	}
}
