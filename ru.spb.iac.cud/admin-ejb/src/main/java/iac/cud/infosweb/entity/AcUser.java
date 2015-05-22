package iac.cud.infosweb.entity;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javaw.util.ArrayList;
import javaw.util.SerializableList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Role;


/**
 * Сущность Пользователь
 * @author bubnov
 *
 */
@Entity
@Table(name="AC_USERS_KNL_T")
@Name("usrBean")
@Role(name="usrBeanCrt")
 public class AcUser extends BaseItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AC_USERS_IDUSER_GENERATOR", sequenceName="AC_USERS_KNL_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AC_USERS_IDUSER_GENERATOR")
	@Column(name="ID_SRV")
	private Long idUser;

    
    @ManyToOne
   	@JoinColumn(name="CREATOR", insertable=false, updatable=false)
   	private AcUser crtUser;
    
    @ManyToOne
   	@JoinColumn(name="MODIFICATOR", insertable=false, updatable=false)
   	private AcUser updUser;

    
    @Column(name="MODIFICATOR")
    private Long modificator;
 	
    @Column(name="CREATOR")
    private Long creator;

    
	private String login;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;
	  
	    
	@Column(name="name_")
	private String name1;

	@Column(name="patronymic")
	private String name2;

	@Column(name="password_")
	private String password;

	private String surname;
	
	@Column(name="e_mail")
    private String email;
	
	private String phone;

	@Temporal(TemporalType.DATE)
	@Column(name="START_ACCOUNT")
	private Date start;

    @Temporal(TemporalType.DATE)
   	@Column(name="END_ACCOUNT")
   	private Date finish;
    
    private String department;
    
    @Column(name="POSITION")
	private String position;
    
    @Column(name="IS_ACC_ORG_MANAGER")
	private Long isAccOrgManager;
    
  	@OneToMany(mappedBy="acUser", cascade={CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
	private SerializableList<AcLinkUserToRoleToRaion> acLinkUserToRoleToRaions;

	
   //-1-1-
  	//для проверки наличия записей
  	//при наличии не удаляем
    @OneToMany(mappedBy="acUsersKnlT", fetch=FetchType.LAZY)
  	private SerializableList<ServicesLogKnlT> servicesLogKnlTs;
   //-1-2-
    
    
    @OneToMany(mappedBy="acUsersKnlT", cascade={CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
	private SerializableList<LinkGroupUsersUsersKnlT> linkGroupUsersUsersKnlTs;
    
    @OneToMany(mappedBy="acUsersKnlT", cascade= CascadeType.REMOVE)
	private SerializableList<BindingLogT> bindingLogTs;
    
    @OneToMany(mappedBy="acUsersKnlT", cascade= CascadeType.REMOVE)
	private SerializableList<BindingAutoLinkBssT> bindingAutoLinkBssTs;

    
    @OneToMany(mappedBy="upUser", 
    		  fetch=FetchType.LAZY,
    		  cascade={ CascadeType.REMOVE})
	private SerializableList<AcUsersCertBssT> acUsersCert;
    
    @OneToMany(mappedBy="acUsersKnlT", cascade={CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
	private SerializableList<LinkAdminUserSys> linkAdminUserSys;
    
    @ManyToOne
   	@JoinColumn(name="UP_MUNIC", insertable=false, updatable=false)
   	private MunicBssT municBssT;
       
    @Column(name="UP_MUNIC")
    private Long munic;
    
    
    @Column(name="CERTIFICATE")
	private String certificate;
    
    private Long status;
    
    @Column(name="UP_SIGN")
	private String upSign;

	@Column(name="UP_SIGN_USER")
	private String upSignUser;

	@Transient
	private String fio;
		
    @Transient
	private String orgName;
    
    
    @Transient
	private String crtUserName;
    
    @Transient
   	private String updUserName;
    
    @Transient
   	private Long isSysAdmin=0L;
    
    @Transient
   	private Long isCudRole=0L;
    
    @Transient
   	private String tokenID;
    
    @Transient
	private String statusValue;
    
    @Transient
   	private SerializableList<String> rolesInfoList;
    
    //при выводе списка пользователей разбитых по алфавиту в группе
    @Transient
	private Boolean usrChecked=false;
    
    @Transient
   	private SerializableList<Long> allowedSys;
    
    @Transient
   	private SerializableList<String> allowedReestr;
    
    public AcUser() {
    }

    @Override
    public Long getBaseId() {
 	   return this.idUser;
 	}

    public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Date getModified() {
		return this.modified==null ? null: (Date)this.modified.clone();
	}
	public void setModified(Date modified) {
		this.modified = (modified==null)?null:(Date)modified.clone();
	}

	
	public Date getCreated() {
		return this.created==null ? null: (Date)this.created.clone();
	}
	public void setCreated(Date created) {
		this.created = (created==null)?null:(Date)created.clone();
	}
	
	
	public AcUser getCrtUser() {
		return this.crtUser;
	}
	public void setCrtUser(AcUser crtUser) {
		this.crtUser = crtUser;
	}
	
	public AcUser getUpdUser() {
		return this.updUser;
	}
	public void setUpdUser(AcUser updUser) {
		this.updUser = updUser;
	}
	
		
	public Long getModificator() {
		return this.modificator;
	}
	public void setModificator(Long modificator) {
		this.modificator = modificator;
	}
	
    public String getLogin() {
		return this.login;
	}
    public void setLogin(String login) {
		this.login = login;
	}

    public Long getCreator() {
		return this.creator;
	}
	public void setCreator(Long creator) {
		this.creator = creator;
	}

	
	public String getName1() {
		return this.name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return this.name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public SerializableList<AcLinkUserToRoleToRaion> getAcLinkUserToRoleToRaions() {
		return this.acLinkUserToRoleToRaions;
	}

	public void setAcLinkUserToRoleToRaions(SerializableList<AcLinkUserToRoleToRaion> acLinkUserToRoleToRaions) {
		this.acLinkUserToRoleToRaions = acLinkUserToRoleToRaions;
	}

	public String getFio(){
	  return this.fio;
	}
	public void setFio(String fio){
		this.fio=fio;
	}
	
	public String getEmail() {
	  return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
	  return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Date getStart() {
		return this.start==null ? null: (Date)this.start.clone();
	}
	public void setStart(Date start) {
		this.start = (start==null)?null:(Date)start.clone();
	}
	
	public Date getFinish() {
		return this.finish==null ? null: (Date)this.finish.clone();
	}
	public void setFinish(Date finish) {
		this.finish = (finish==null)?null:(Date)finish.clone();
	}
	
	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public String getProtectLogin() {
		return "*****";
	}
	public String getProtectPassword() {
		return "*****";
	}
	
	
	
	public String getUpdUserName() {
		if(this.updUserName==null && this.updUser!=null){
			  this.updUserName = this.updUser.getFio();
		}
		return this.updUserName;
	}
	public void setUpdUserName(String updUserName) {
		this.updUserName = updUserName;
	}
	
	public String getCrtUserName() {
		if(this.crtUserName==null){
			if(this.crtUser!=null){
			  this.crtUserName = this.crtUser.getFio();
			}
		}
		return this.crtUserName;
	}
	public void setCrtUserName(String crtUserName) {
		this.crtUserName = crtUserName;
	}
	
	public SerializableList<LinkGroupUsersUsersKnlT> getLinkGroupUsersUsersKnlTs() {
		return this.linkGroupUsersUsersKnlTs;
	}
    public void setLinkGroupUsersUsersKnlTs(SerializableList<LinkGroupUsersUsersKnlT> linkGroupUsersUsersKnlTs) {
		this.linkGroupUsersUsersKnlTs = linkGroupUsersUsersKnlTs;
	}
	
	public Long getIsCudRole() {
		return this.isCudRole;
	}
	public void setIsCudRole(Long isCudRole) {
		this.isCudRole = isCudRole;
	}
	
	public Long getIsSysAdmin() {
		return this.isSysAdmin;
	}
	public void setIsSysAdmin(Long isSysAdmin) {
		this.isSysAdmin = isSysAdmin;
	}
	public String getCertificate() {
		return this.certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	public String getTokenID() {
		return this.tokenID;
	}

	public void setTokenID(String tokenID) {
		this.tokenID = tokenID;
	}
	
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	
	public String getStatusValue() {
		if(this.statusValue==null && this.status!=null){
				if(this.status.equals(0L)){
					this.statusValue="Не активен";
				}else if(this.status.equals(1L)){
					this.statusValue="Активен";
				}else if(this.status.equals(2L)){
					this.statusValue="Заблокирован";
				}
		}
		
		return this.statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	
	public SerializableList<String> getRolesInfoList() {
		return this.rolesInfoList;
	}

	public void setRolesInfoList(List<String> rolesInfoList) {
		this.rolesInfoList = new ArrayList<String>(rolesInfoList);
	}
	
	public String getDepartment() {
		return this.department;
	}
    public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPosition() {
		return this.position;
	}
    public void setPosition(String position) {
		this.position = position;
	}
    
    public Long getIsAccOrgManager() {
		return this.isAccOrgManager;
	}

	public void setIsAccOrgManager(Long isAccOrgManager) {
		this.isAccOrgManager = isAccOrgManager;
	}
	
	public boolean getIsAccOrgManagerValue() {
		 return this.isAccOrgManager!=null?this.isAccOrgManager.equals(1L):false;
	}
	 
	public String getUpSign() {
		return this.upSign;
	}
	public void setUpSign(String upSign) {
		this.upSign = upSign;
	}

	public String getUpSignUser() {
		return this.upSignUser;
	}
	public void setUpSignUser(String upSignUser) {
		this.upSignUser = upSignUser;
	}
	
	public Boolean getUsrChecked(){
		return this.usrChecked;
	}
	public void setUsrChecked(Boolean usrChecked){
		this.usrChecked=usrChecked;
	}

	public SerializableList<AcUsersCertBssT> getAcUsersCert() {
		return acUsersCert;
	}
	public void setAcUsersCert(SerializableList<AcUsersCertBssT> acUsersCert) {
		this.acUsersCert = acUsersCert;
	}
	
	public SerializableList<BindingLogT> getBindingLogTs() {
		return this.bindingLogTs;
	}
	public void setBindingLogTs(SerializableList<BindingLogT> bindingLogTs) {
		this.bindingLogTs = bindingLogTs;
	}
	
	public SerializableList<BindingAutoLinkBssT> getBindingAutoLinkBssTs() {
		return this.bindingAutoLinkBssTs;
	}
	public void setBindingAutoLinkBssTs(SerializableList<BindingAutoLinkBssT> bindingAutoLinkBssTs) {
		this.bindingAutoLinkBssTs = bindingAutoLinkBssTs;
	}
	
	public SerializableList<ServicesLogKnlT> getServicesLogKnlTs() {
		return this.servicesLogKnlTs;
	}
	public void setServicesLogKnlTs(SerializableList<ServicesLogKnlT> servicesLogKnlTs) {
		this.servicesLogKnlTs = servicesLogKnlTs;
	}

	public SerializableList<LinkAdminUserSys> getLinkAdminUserSys() {
		return this.linkAdminUserSys;
	}
	public void setLinkAdminUserSys(SerializableList<LinkAdminUserSys> linkAdminUserSys) {
		this.linkAdminUserSys = linkAdminUserSys;
	}
	
	public SerializableList<Long> getAllowedSys() {
		return allowedSys;
	}

	public void setAllowedSys(List<Long> allowedSys) {
		this.allowedSys = new ArrayList<Long>(allowedSys);
	}
	
	public boolean isAllowedSys(Long idSys) {
		
		if(this.allowedSys==null||this.allowedSys.contains(idSys)){
			return true;
		}
		
		return false;
	}
	
	public List<String> getAllowedReestr() {
		return allowedReestr;
	}

	public void setAllowedReestr(List<String> allowedReestr) {
		this.allowedReestr = new ArrayList<String>(allowedReestr);
	}
	
	//проверка только для текущего (вошедшего) пользователя
    public boolean isAllowedReestr(String pageCode, String idPerm) {
		
    	if(this.allowedReestr!=null&&this.allowedReestr.contains(pageCode+":"+idPerm)){
			return true;
		}
		
		return false;
	}
    public MunicBssT getMunicBssT() {
  		return this.municBssT;
  	}

  	public void setMunicBssT(MunicBssT municBssT) {
  		this.municBssT = municBssT;
  	}

  	public Long getMunic() {
  		return munic;
  	}

  	public void setMunic(Long munic) {
  		this.munic = munic;
  	}
	
  }