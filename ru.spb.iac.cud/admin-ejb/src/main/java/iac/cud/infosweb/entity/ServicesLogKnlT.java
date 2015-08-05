package iac.cud.infosweb.entity;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;

import javax.persistence.*;

import org.apache.http.impl.client.AIMDBackoffManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SERVICES_LOG_KNL_T database table.
 * 
 */
@Entity
@Table(name="SERVICES_LOG_KNL_T")
 public class ServicesLogKnlT  extends BaseItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SRV")
	private Long idSrv;

    @Temporal( TemporalType.DATE)
	private Date created;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_ACTION")
	private Date dateAction;

	@Column(name="INPUT_PARAM")
	private String inputParam;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

    @Temporal( TemporalType.DATE)
	private Date modified;

	@Column(name="RESULT_VALUE")
	private String resultValue;

	 @ManyToOne
	@JoinColumn(name="UP_SERVICES")
	private ServicesBssT servicesBssT;

    @ManyToOne
	@JoinColumn(name="UP_USERS")
	private AcUser acUsersKnlT;
    
    @Transient
  	private String servName;
    
    @Transient
  	private String userFio;
    
    @Transient
  	private String createdValue;
    
    public ServicesLogKnlT() {
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

	public String getInputParam() {
		return this.inputParam;
	}

	public void setInputParam(String inputParam) {
		this.inputParam = inputParam;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getModified() {
		return this.modified==null ? null: (Date)this.modified.clone();
	}

	public void setModified(Date modified) {
		this.modified = (modified==null)?null:(Date)modified.clone();
	}

	public String getResultValue() {
		return this.resultValue;
	}

	public void setResultValue(String resultValue) {
		this.resultValue = resultValue;
	}

	public ServicesBssT getServicesBssT() {
		return this.servicesBssT;
	}

	public void setServicesBssT(ServicesBssT servicesBssT) {
		this.servicesBssT = servicesBssT;
	}
	
	public String getServName() {
		return this.servName;
	}

	public void setServName(String servName) {
		this.servName = servName;
	}
	
	public AcUser getAcUsersKnlT() {
		return this.acUsersKnlT;
	}

	public void setAcUsersKnlT(AcUser acUsersKnlT) {
		this.acUsersKnlT = acUsersKnlT;
	}
	
    public String getUserFio() {
		return this.userFio;
	}

	public void setUserFio(String userFio) {
		this.userFio = userFio;
	}
	
	public String getCreatedValue() {
		return this.createdValue;
	}
	public void setCreatedValue(String createdValue) {
		this.createdValue = createdValue;
	}

	public static List<BaseItem> FromRows(List<Object[]> lo, StringBuilder errInfo) {
		DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");
        List<BaseItem> auditList = new ArrayList<BaseItem>();        
        for(Object[] objectArray :lo){       	 
       	 try{        		 
              auditList.add(FromRow(objectArray, df));             
     	   }catch(Exception e1){
     		   errInfo.append("FromRows:invokeLocal:for:error:"+e1);
     	   }
        }
		return auditList;
	}	
	
	public static ServicesLogKnlT FromRow(Object[] objectArray, DateFormat df) {		
   		 ServicesLogKnlT sl = new ServicesLogKnlT();             
         sl.setIdSrv(Long.valueOf(objectArray[0].toString()));
         sl.setCreatedValue(df.format((Date)objectArray[1]));
         sl.setServName(objectArray[2]!=null?objectArray[2].toString():"");
         sl.setInputParam(objectArray[3]!=null?objectArray[3].toString():"");
         sl.setResultValue(objectArray[4]!=null?objectArray[4].toString():"");
         sl.setIpAddress(objectArray[5]!=null?objectArray[5].toString():"");
         sl.setUserFio(objectArray[6]!=null?objectArray[6].toString():"");
		return sl;		
	}

}