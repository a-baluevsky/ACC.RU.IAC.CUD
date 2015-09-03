package ru.spb.iac.cud.uarm.ejb.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;

import javaw.util.ArrayList;

import java.util.Date;
import java.util.List;

import javaw.util.SerializableList;


/**
 * The persistent class for the AC_IS_BSS_T database table.
 * 
 */
@Entity
@Table(name="AC_IS_BSS_T")
 public class AcIsBssT implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AC_IS_BSS_T_IDSRV_GENERATOR", sequenceName="AC_IS_BSS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AC_IS_BSS_T_IDSRV_GENERATOR")
	@Column(name="ID_SRV")
	private Long idSrv;

	@Column(name="CERT_ALIAS")
	private String certAlias;

	@Lob
	@Column(name="CERT_DATE")
	private String certDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	private Long creator;

	private String description;

	@Column(name="FULL_")
	private String full;

	@Column(name="SIGN_OBJECT")
	private String signObject;

	@OneToMany(mappedBy="acIsBssT")
	private /*Serializable*/ List<AcRolesBssT> acRolesBssTs;

	@OneToMany(mappedBy="acIsBssT")
	private /*Serializable*/ List<JournAppAccessBssT> journAppAccessBssTs;

	@OneToMany(mappedBy="acIsBssT")
	private /*Serializable*/ List<JournAppAccessGroupsBssT> journAppAccessGroupsBssTs;
	
	@OneToMany(mappedBy="acIsBssT")
	private /*Serializable*/ List<LinkAdminUserSys> linkAdminUserSys;

	@OneToMany(mappedBy="acIsBssT")
	private /*Serializable*/ List<JournAppAdminUserSysBssT> journAppAdminUserSysBssTs;
	
	@Transient
	private /*Serializable*/ List<GroupUsersKnlT> groups;
	
	public AcIsBssT() {
	}

	public Long getIdSrv() {
		return this.idSrv;
	}

	public void setIdSrv(Long idSrv) {
		this.idSrv = idSrv;
	}

	public String getCertAlias() {
		return this.certAlias;
	}

	public void setCertAlias(String certAlias) {
		this.certAlias = certAlias;
	}

	public String getCertDate() {
		return this.certDate;
	}

	public void setCertDate(String certDate) {
		this.certDate = certDate;
	}

	public Date getCreated() {
		return this.created==null ? null: (Date)this.created.clone();
	}

	public void setCreated(Date created) {
		this.created = (created==null)?null:(Date)created.clone();
	}

	public Long getCreator() {
		return this.creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFull() {
		return this.full;
	}

	public void setFull(String full) {
		this.full = full;
	}

	public String getSignObject() {
		return this.signObject;
	}

	public void setSignObject(String signObject) {
		this.signObject = signObject;
	}

	public SerializableList<AcRolesBssT> getAcRolesBssTs() {
		return (this.acRolesBssTs==null)?null:new ArrayList<AcRolesBssT>(this.acRolesBssTs);
	}

	public void setAcRolesBssTs(List<AcRolesBssT> acRolesBssTs) {
		this.acRolesBssTs = new ArrayList<AcRolesBssT>(acRolesBssTs);
	}

	public AcRolesBssT addAcRolesBssT(AcRolesBssT acRolesBssT) {
		getAcRolesBssTs().add(acRolesBssT);
		acRolesBssT.setAcIsBssT(this);

		return acRolesBssT;
	}

	public AcRolesBssT removeAcRolesBssT(AcRolesBssT acRolesBssT) {
		getAcRolesBssTs().remove(acRolesBssT);
		acRolesBssT.setAcIsBssT(null);

		return acRolesBssT;
	}
	public SerializableList<JournAppAccessBssT> getJournAppAccessBssTs() {
		return (this.journAppAccessBssTs==null)?null:new ArrayList<JournAppAccessBssT>(this.journAppAccessBssTs);
	}

	public void setJournAppAccessBssTs(SerializableList<JournAppAccessBssT> journAppAccessBssTs) {
		this.journAppAccessBssTs = journAppAccessBssTs;
	}

	public List<LinkAdminUserSys> getLinkAdminUserSys() {
		return this.linkAdminUserSys;
	}

	public void setLinkAdminUserSys(List<LinkAdminUserSys> linkAdminUserSys) {
		this.linkAdminUserSys = linkAdminUserSys;
	}

	public LinkAdminUserSys addLinkAdminUserSy(LinkAdminUserSys linkAdminUserSy) {
		getLinkAdminUserSys().add(linkAdminUserSy);
		linkAdminUserSy.setAcIsBssT(this);

		return linkAdminUserSy;
	}

	public LinkAdminUserSys removeLinkAdminUserSy(LinkAdminUserSys linkAdminUserSy) {
		getLinkAdminUserSys().remove(linkAdminUserSy);
		linkAdminUserSy.setAcIsBssT(null);

		return linkAdminUserSy;
	}

	
	public List<JournAppAdminUserSysBssT> getJournAppAdminUserSysBssTs() {
		return journAppAdminUserSysBssTs;
	}

	public void setJournAppAdminUserSysBssTs(List<JournAppAdminUserSysBssT> journAppAdminUserSysBssTs) {
		this.journAppAdminUserSysBssTs = journAppAdminUserSysBssTs;
	}

	public JournAppAdminUserSysBssT addJournAppAdminUserSysBssT(JournAppAdminUserSysBssT journAppAdminUserSysBssT) {
		getJournAppAdminUserSysBssTs().add(journAppAdminUserSysBssT);
		journAppAdminUserSysBssT.setAcIsBssT(this);

		return journAppAdminUserSysBssT;
	}

	public JournAppAdminUserSysBssT removeJournAppAdminUserSysBssT(JournAppAdminUserSysBssT journAppAdminUserSysBssT) {
		getJournAppAdminUserSysBssTs().remove(journAppAdminUserSysBssT);
		journAppAdminUserSysBssT.setAcIsBssT(null);

		return journAppAdminUserSysBssT;
	}

	public SerializableList<JournAppAccessGroupsBssT> getJournAppAccessGroupsBssTs() {
		return (journAppAccessGroupsBssTs==null)?null:new ArrayList<JournAppAccessGroupsBssT>(journAppAccessGroupsBssTs);
	}

	public void setJournAppAccessGroupsBssTs(
			SerializableList<JournAppAccessGroupsBssT> journAppAccessGroupsBssTs) {
		this.journAppAccessGroupsBssTs = journAppAccessGroupsBssTs;
	}

	public SerializableList<GroupUsersKnlT> getGroups() {
		return (groups==null)?null:new ArrayList<GroupUsersKnlT>(groups);
	}

	public void setGroups(List<GroupUsersKnlT> groups) {
		this.groups = (groups==null)?null:new ArrayList<GroupUsersKnlT>(groups);
	}
}