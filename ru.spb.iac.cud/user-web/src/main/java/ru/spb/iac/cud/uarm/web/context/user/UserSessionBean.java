package ru.spb.iac.cud.uarm.web.context.user;

import java.io.Serializable;

import javaw.util.HashMap;
import javaw.util.SerializableMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.List;
import java.util.Map;
 
@ManagedBean(name="userSessionBean")
@SessionScoped
 public class UserSessionBean implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private /*Serializable*/ Map<Long, String> sumRoles;

    private /*Serializable*/ Map<Long, String> sumGroups;
    
    private String userEmailReg;
    
    public SerializableMap<Long, String> getSumRoles() {
		return (sumRoles==null)?null: new HashMap<Long, String>(sumRoles);
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
		return new HashMap<Long, String>(sumGroups);
	}

	public void setSumGroups(SerializableMap<Long, String> sumGroups) {
		this.sumGroups = sumGroups;
	}

	
   
    
}
