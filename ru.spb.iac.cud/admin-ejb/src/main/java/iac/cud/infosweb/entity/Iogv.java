package iac.cud.infosweb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.jboss.seam.annotations.Name;


/**
 * The persistent class for the IOGV database table.
 * 
 */
@Entity
@Table(name="IOGV")
@Name("clOrgBeanIogv")
public class Iogv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date adate;

	private String cod;

	@Temporal(TemporalType.DATE)
	@Column(name="D_CH")
	private Date dCh;

	@Temporal(TemporalType.DATE)
	@Column(name="D_IN")
	private Date dIn;

	@Temporal(TemporalType.DATE)
	private Date ddate;

	private String inn;

	private String kpp;

	private String name;

	@Column(name="NUM_ADATE")
	private Long numAdate;

	@Column(name="NUM_DDATE")
	private Long numDdate;

	private String ogrn;

	private String prim;

	private String risdictional;

	@Column(name="SL_PR")
	private Long slPr;

	@Column(name="SL_W")
	private Long slW;

	private String sname;

	private String status;

	public Iogv() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAdate() {
		return this.adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Date getDCh() {
		return this.dCh;
	}

	public void setDCh(Date dCh) {
		this.dCh = dCh;
	}

	public Date getDIn() {
		return this.dIn;
	}

	public void setDIn(Date dIn) {
		this.dIn = dIn;
	}

	public Date getDdate() {
		return this.ddate;
	}

	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}

	public String getInn() {
		return this.inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public String getKpp() {
		return this.kpp;
	}

	public void setKpp(String kpp) {
		this.kpp = kpp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumAdate() {
		return this.numAdate;
	}

	public void setNumAdate(Long numAdate) {
		this.numAdate = numAdate;
	}

	public Long getNumDdate() {
		return this.numDdate;
	}

	public void setNumDdate(Long numDdate) {
		this.numDdate = numDdate;
	}

	public String getOgrn() {
		return this.ogrn;
	}

	public void setOgrn(String ogrn) {
		this.ogrn = ogrn;
	}

	public String getPrim() {
		return this.prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	public String getRisdictional() {
		return this.risdictional;
	}

	public void setRisdictional(String risdictional) {
		this.risdictional = risdictional;
	}

	public Long getSlPr() {
		return this.slPr;
	}

	public void setSlPr(Long slPr) {
		this.slPr = slPr;
	}

	public Long getSlW() {
		return this.slW;
	}

	public void setSlW(Long slW) {
		this.slW = slW;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}