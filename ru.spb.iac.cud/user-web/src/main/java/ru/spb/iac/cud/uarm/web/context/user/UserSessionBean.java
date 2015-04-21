package ru.spb.iac.cud.uarm.web.context.user;

import java.io.Serializable;
import javaw.util.SerializableMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="userSessionBean")
@SessionScoped
 public class UserSessionBean implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private SerializableMap<Long, String> sumRoles;

    private SerializableMap<Long, String> sumGroups;
    
    private String userEmailReg;
    
    public SerializableMap<Long, String> getSumRoles() {
		return sumRoles;
	}

	public void setSumRoles(SerializableMap<Long, String> sumRoles) {
		this.sumRoles = sumRoles;
	}

	public String getUserEmailReg() {
		return userEmailReg;
	}

	public void setUserEmailReg(String userEmailReg) {
		this.userEmailReg = userEmailReg;
	}

	public SerializableMap<Long, String> getSumGroups() {
		return sumGroups;
	}

	public void setSumGroups(SerializableMap<Long, String> sumGroups) {
		this.sumGroups = sumGroups;
	}

	
   
    
}
