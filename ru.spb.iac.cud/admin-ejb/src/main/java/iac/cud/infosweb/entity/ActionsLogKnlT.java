package iac.cud.infosweb.entity;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;

import javaw.util.ArrayList;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACTIONS_LOG_KNL_T database table.
 * 
 */
@Entity
@Table(name="ACTIONS_LOG_KNL_T")
 public class ActionsLogKnlT extends BaseItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACTIONS_LOG_KNL_T_IDSRV_GENERATOR", sequenceName="ACTIONS_LOG_KNL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACTIONS_LOG_KNL_T_IDSRV_GENERATOR")
	@Column(name="ID_SRV")
	private Long idSrv;

	@Column(name="ATTEMPT_SRV")
	private Long attemptSrv;

    @Temporal( TemporalType.DATE)
	private Date created;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_ACTION")
	private Date dateAction;

    @Temporal( TemporalType.DATE)
	@Column(name="DATE_EVENT_SRV")
	private Date dateEventSrv;

    @Temporal( TemporalType.DATE)
	private Date modified;

	 @ManyToOne
	@JoinColumn(name="UP_ACTIONS")
	private ActionsBssT actionsBssT;

    @ManyToOne
   	@JoinColumn(name="UP_USERS")
   	private AcUser acUsersKnlT;
    
    @Transient
	private String actName;
    
    @Transient
   	private String isName;
    
    @Transient
   	private String userName;
    
    @Transient
   	private String dateActionValue;
    
    @Column(name="DETAILS_ACTION")
    private String detailsAction;
    
    public ActionsLogKnlT() {
    }

    public Long getBaseId() {
   	   return this.idSrv;
   	} 
    
	public Long getIdSrv() {
		return this.idSrv;
	}

	public void setIdSrv(Long idSrv) {
		this.idSrv = idSrv;
	}

	public Long getAttemptSrv() {
		return this.attemptSrv;
	}

	public void setAttemptSrv(Long attemptSrv) {
		this.attemptSrv = attemptSrv;
	}

	public Date getCreated() {
		return this.created==null ? null: (Date)this.created.clone();
	}

	public void setCreated(Date created) {
		this.created = (created==null)?null:(Date)created.clone();
	}

	public Date getDateAction() {
		return this.dateAction==null ? null: (Date)this.dateAction.clone();
	}

	public void setDateAction(Date dateAction) {
		this.dateAction = (dateAction==null)?null:(Date)dateAction.clone();
	}

	public Date getDateEventSrv() {
		return this.dateEventSrv==null ? null: (Date)this.dateEventSrv.clone();
	}

	public void setDateEventSrv(Date dateEventSrv) {
		this.dateEventSrv = (dateEventSrv==null)?null:(Date)dateEventSrv.clone();
	}

	public Date getModified() {
		return this.modified==null ? null: (Date)this.modified.clone();
	}

	public void setModified(Date modified) {
		this.modified = (modified==null)?null:(Date)modified.clone();
	}

	public ActionsBssT getActionsBssT() {
		return this.actionsBssT;
	}

	public void setActionsBssT(ActionsBssT actionsBssT) {
		this.actionsBssT = actionsBssT;
	}
	
	
	public String getActName() {
		return this.actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	
	public String getIsName() {
		return this.isName;
	}
	public void setIsName(String isName) {
		this.isName = isName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getDateActionValue() {
		return this.dateActionValue;
	}
    public void setDateActionValue(String dateActionValue) {
		this.dateActionValue = dateActionValue;
	}
    
    public AcUser getAcUsersKnlT() {
		return this.acUsersKnlT;
	}
    public void setAcUsersKnlT(AcUser acUsersKnlT) {
		this.acUsersKnlT = acUsersKnlT;
	}

	public static List<BaseItem> FromRows(List<Object[]> lo, StringBuilder errMsg) {
		List<BaseItem> auditList = new ArrayList<BaseItem>();
        for(Object[] objectArray :lo){
       	 try{ 
             auditList.add(FromRow(objectArray));                      
     	   }catch(Exception e1){
     		   errMsg.append("AFunc:invokeLocal:for:error:").append(e1).append('\n');
     	   }
        }
		return auditList;
	}

	private static ActionsLogKnlT FromRow(Object[] objectArray) {
		ActionsLogKnlT al = new ActionsLogKnlT();  
         al.setIdSrv(Long.valueOf(objectArray[0].toString()));
         al.setDateActionValue(objectArray[1].toString());
         al.setUserName(objectArray[2]!=null?objectArray[2].toString():"");
         al.setIsName(objectArray[3]!=null?objectArray[3].toString():"");
         al.setActName(objectArray[4]!=null?objectArray[4].toString():"");
         al.setDetailsAction(objectArray[7]!=null?objectArray[7].toString():"");
		return al;
	}

	public String getDetailsAction() {
		return detailsAction;
	}
	public void setDetailsAction(String detailsAction) {
		this.detailsAction = detailsAction;
	}
	
}