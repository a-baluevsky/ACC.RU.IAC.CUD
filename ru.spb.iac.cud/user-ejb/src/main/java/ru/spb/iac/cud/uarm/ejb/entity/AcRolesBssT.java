package ru.spb.iac.cud.uarm.ejb.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;
import java.util.Date;

import javaw.util.ArrayList;
import javaw.util.SerializableList;


/**
 * The persistent class for the AC_ROLES_BSS_T database table.
 * 
 */
@Entity
@Table(name="AC_ROLES_BSS_T")
 public class AcRolesBssT implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AC_ROLES_BSS_T_IDSRV_GENERATOR", sequenceName="AC_ROLES_BSS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AC_ROLES_BSS_T_IDSRV_GENERATOR")
	@Column(name="ID_SRV")
	private Long idSrv;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	private Long creator;

	private String description;

	@Column(name="FULL_")
	private String full;

	private Long modificator;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modified;

	@Column(name="SIGN_OBJECT")
	private String signObject;

	//bi-directional many-to-one association to AcIsBssT
	@ManyToOne
	@JoinColumn(name="UP_IS")
	private AcIsBssT acIsBssT;

	//bi-directional many-to-one association to AcUsersLinkKnlT
	@OneToMany(mappedBy="acRolesBssT")
	private /*Serializable*/ List<AcUsersLinkKnlT> acUsersLinkKnlTs;

	//bi-directional many-to-one association to LinkGroupUsersRolesKnlT
	@OneToMany(mappedBy="acRolesBssT")
	private /*Serializable*/ List<LinkGroupUsersRolesKnlT> linkGroupUsersRolesKnlTs;

	@OneToMany(mappedBy="acRolesBssT")
	private /*Serializable*/ List<RolesAppAccessBssT> rolesAppAccessBssTs;

	@Transient
	private Boolean checked;
	
	public AcRolesBssT() {
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

	public Long getModificator() {
		return this.modificator;
	}

	public void setModificator(Long modificator) {
		this.modificator = modificator;
	}

	public Date getModified() {
		return this.modified==null ? null: (Date)this.modified.clone();
	}

	public void setModified(Date modified) {
		this.modified = (modified==null)?null:(Date)modified.clone();
	}

	public String getSignObject() {
		return this.signObject;
	}

	public void setSignObject(String signObject) {
		this.signObject = signObject;
	}

	public AcIsBssT getAcIsBssT() {
		return this.acIsBssT;
	}

	public void setAcIsBssT(AcIsBssT acIsBssT) {
		this.acIsBssT = acIsBssT;
	}

	public SerializableList<AcUsersLinkKnlT> getAcUsersLinkKnlTs() {
		return (this.acUsersLinkKnlTs==null)?null:new ArrayList<AcUsersLinkKnlT>(this.acUsersLinkKnlTs);
	}

	public void setAcUsersLinkKnlTs(SerializableList<AcUsersLinkKnlT> acUsersLinkKnlTs) {
		this.acUsersLinkKnlTs = acUsersLinkKnlTs;
	}

	public AcUsersLinkKnlT addAcUsersLinkKnlT(AcUsersLinkKnlT acUsersLinkKnlT) {
		getAcUsersLinkKnlTs().add(acUsersLinkKnlT);
		acUsersLinkKnlT.setAcRolesBssT(this);

		return acUsersLinkKnlT;
	}

	public AcUsersLinkKnlT removeAcUsersLinkKnlT(AcUsersLinkKnlT acUsersLinkKnlT) {
		getAcUsersLinkKnlTs().remove(acUsersLinkKnlT);
		acUsersLinkKnlT.setAcRolesBssT(null);

		return acUsersLinkKnlT;
	}

	public SerializableList<LinkGroupUsersRolesKnlT> getLinkGroupUsersRolesKnlTs() {
		return (this.linkGroupUsersRolesKnlTs==null)?null:new ArrayList<LinkGroupUsersRolesKnlT>(this.linkGroupUsersRolesKnlTs);
	}

	public void setLinkGroupUsersRolesKnlTs(SerializableList<LinkGroupUsersRolesKnlT> linkGroupUsersRolesKnlTs) {
		this.linkGroupUsersRolesKnlTs = linkGroupUsersRolesKnlTs;
	}

	public LinkGroupUsersRolesKnlT addLinkGroupUsersRolesKnlT(LinkGroupUsersRolesKnlT linkGroupUsersRolesKnlT) {
		getLinkGroupUsersRolesKnlTs().add(linkGroupUsersRolesKnlT);
		linkGroupUsersRolesKnlT.setAcRolesBssT(this);

		return linkGroupUsersRolesKnlT;
	}

	public LinkGroupUsersRolesKnlT removeLinkGroupUsersRolesKnlT(LinkGroupUsersRolesKnlT linkGroupUsersRolesKnlT) {
		getLinkGroupUsersRolesKnlTs().remove(linkGroupUsersRolesKnlT);
		linkGroupUsersRolesKnlT.setAcRolesBssT(null);

		return linkGroupUsersRolesKnlT;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public SerializableList<RolesAppAccessBssT> getRolesAppAccessBssTs() {
		return (this.rolesAppAccessBssTs==null)?null:new ArrayList<RolesAppAccessBssT>(this.rolesAppAccessBssTs);
	}

	public void setRolesAppAccessBssTs(SerializableList<RolesAppAccessBssT> rolesAppAccessBssTs) {
		this.rolesAppAccessBssTs = rolesAppAccessBssTs;
	}
}