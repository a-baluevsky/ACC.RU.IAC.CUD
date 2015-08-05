package iac.cud.infosweb.dataitems;

import iac.cud.infosweb.dataitems.BaseItem;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 public class UserItem extends BaseItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idUser;

	private String login;

	private String cert;

	private String usrCode;

	private String fio;

	private String phone;

	private String email;

	private String position;

	private String department;

	private String orgCode;

	private String orgName;

	private String orgAdr;

	private String orgTel;

	private String start;

	private String finish;

	private Long status;

	private String statusValue;

	private String crtDate;

	private String crtUserLogin;

	private String updDate;

	private String updUserLogin;

	private String depCode;

	private String orgIogvStatus;

	private String usrIogvStatus;

	private String depIogvStatus;

	private Long iogvBindType;

	private Long isCudRole = 0L;

	private Long isSysAdmin = 0L;

	private Boolean usrChecked = false;

	public UserItem() {
	}
	
	public static List<BaseItem> FromRows(List<Object[]> lo, StringBuilder log) {
		DateFormat df = new SimpleDateFormat ("dd.MM.yy HH:mm:ss");	
		List<BaseItem> auditList = new ArrayList<BaseItem>();
        for(Object[] objectArrayUm :lo){
	        try{
	   		   auditList.add(UserItem.FromRow(objectArrayUm, df));
	   	   	}catch(Exception e1){
	   	   		log.append("FromRows:for:error:"+e1).append('\n');
	   	   	}
        }
		return auditList;
	}
	
	public static UserItem FromRow(Object[] objectArrayUm, DateFormat df) {
		return new UserItem(
  			  objectArrayUm[0]!=null?Long.valueOf(objectArrayUm[0].toString()):null,
  			  objectArrayUm[1]!=null?objectArrayUm[1].toString():"",
  			  objectArrayUm[2]!=null?objectArrayUm[2].toString():"",
  			  objectArrayUm[3]!=null?objectArrayUm[3].toString():"",
  			  objectArrayUm[4]!=null?objectArrayUm[4].toString():"",
  			  objectArrayUm[5]!=null?objectArrayUm[5].toString():"",
  			  objectArrayUm[6]!=null?objectArrayUm[6].toString():"",
  			  objectArrayUm[7]!=null?objectArrayUm[7].toString():"",
  			  objectArrayUm[8]!=null?objectArrayUm[8].toString():"",
  			  objectArrayUm[9]!=null?objectArrayUm[9].toString():"",
  			  objectArrayUm[10]!=null?objectArrayUm[10].toString():"",
  			  objectArrayUm[11]!=null?objectArrayUm[11].toString():"",
  			  objectArrayUm[12]!=null?objectArrayUm[12].toString():"",
  			  objectArrayUm[13]!=null?objectArrayUm[13].toString():"",
  			  objectArrayUm[14]!=null?objectArrayUm[14].toString():"",
  			  objectArrayUm[15]!=null?Long.valueOf(objectArrayUm[15].toString()):null,
  			  objectArrayUm[16]!=null?df.format((Date)objectArrayUm[16]) :"",
  			  objectArrayUm[17]!=null?objectArrayUm[17].toString():"",
  			  objectArrayUm[18]!=null?objectArrayUm[18].toString():"",
  			  objectArrayUm[19]!=null?objectArrayUm[19].toString():"",
  			  objectArrayUm[20]!=null?objectArrayUm[20].toString():"",
  			  objectArrayUm[21]!=null?objectArrayUm[21].toString():"",
  			  objectArrayUm[22]!=null?objectArrayUm[22].toString():"",
  			  objectArrayUm[23]!=null?objectArrayUm[23].toString():"",
  			  objectArrayUm[24]!=null?Long.valueOf(objectArrayUm[24].toString()):null
		);		
	}
	
	public UserItem(Long idUser, String login, String cert, String usrCode,
			String fio, String phone, String email, String position,
			String department, String orgCode, String orgName, String orgAdr,
			String orgTel, String start, String finish, Long status,
			String crtDate, String crtUserLogin, String updDate,
			String updUserLogin, String depCode, String orgIogvStatus,
			String usrIogvStatus, String depIogvStatus, Long iogvBindType) {
		this.idUser = idUser;
		this.login = login;
		this.cert = cert;
		this.usrCode = usrCode;
		this.fio = fio;
		this.phone = phone;
		this.email = email;
		this.position = position;
		this.department = department;
		this.orgCode = orgCode;
		this.orgName = orgName;
		this.orgAdr = orgAdr;
		this.orgTel = orgTel;
		this.start = start;
		this.finish = finish;
		this.status = status;
		this.crtDate = crtDate;
		this.crtUserLogin = crtUserLogin;
		this.updDate = updDate;
		this.updUserLogin = updUserLogin;

		this.depCode = depCode;
		this.orgIogvStatus = orgIogvStatus;
		this.usrIogvStatus = usrIogvStatus;
		this.depIogvStatus = depIogvStatus;

		this.iogvBindType = iogvBindType;
	}

	public Long getBaseId() {
		return this.idUser;
	}

	public Long getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCert() {
		return this.cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}

	public String getUsrCode() {
		return this.usrCode;
	}

	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	public String getFio() {
		return this.fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAdr() {
		return this.orgAdr;
	}

	public void setOrgAdr(String orgAdr) {
		this.orgAdr = orgAdr;
	}

	public String getOrgTel() {
		return this.orgTel;
	}

	public void setOrgTel(String orgTel) {
		this.orgTel = orgTel;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return this.finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStatusValue() {
		// if(this.statusValue==null){
		if (this.status != null) {
			if (this.status.equals(0L)) {
				this.statusValue = "�� �������";
			} else if (this.status.equals(1L)) {
				this.statusValue = "�������";
			} else if (this.status.equals(2L)) {
				this.statusValue = "������������";
			}
		}
		 

		return this.statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	public String getProtectLogin() {
		return "*****";
	}

	public String getProtectPassword() {
		return "*****";
	}

	public String getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(String crtDate) {
		this.crtDate = crtDate;
	}

	public String getCrtUserLogin() {
		return this.crtUserLogin;
	}

	public void setCrtUserLogin(String crtUserLogin) {
		this.crtUserLogin = crtUserLogin;
	}

	public String getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}

	public String getUpdUserLogin() {
		return this.updUserLogin;
	}

	public void setUpdUserLogin(String updUserLogin) {
		this.updUserLogin = updUserLogin;
	}

	public Long getIogvBindType() {
		return this.iogvBindType;
	}

	public void setIogvBindType(Long iogvBindType) {
		this.iogvBindType = iogvBindType;
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

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public String getOrgIogvStatus() {
		return orgIogvStatus;
	}

	public void setOrgIogvStatus(String orgIogvStatus) {
		this.orgIogvStatus = orgIogvStatus;
	}

	public String getUsrIogvStatus() {
		return usrIogvStatus;
	}

	public void setUsrIogvStatus(String usrIogvStatus) {
		this.usrIogvStatus = usrIogvStatus;
	}

	public String getDepIogvStatus() {
		return depIogvStatus;
	}

	public void setDepIogvStatus(String depIogvStatus) {
		this.depIogvStatus = depIogvStatus;
	}

	public Boolean getUsrChecked() {
		return this.usrChecked;
	}

	public void setUsrChecked(Boolean usrChecked) {
		this.usrChecked = usrChecked;
	}



}