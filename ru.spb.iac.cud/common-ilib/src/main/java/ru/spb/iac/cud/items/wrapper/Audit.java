package ru.spb.iac.cud.items.wrapper;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ru.spb.iac.cud.items.AuditFunction;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audit", propOrder = { "login", "userFunctions" })
// используется совместно с @RequestWrapper
 public class Audit {

	@XmlElement(name = "uidUser", required = true, namespace = "http://audit.services.cud.iac.spb.ru/")
	protected String uidUser;

	@XmlElement(name = "userFunctions", required = true, namespace = "http://audit.services.cud.iac.spb.ru/")
	protected List<AuditFunction> userFunctions;

	public String getuidUser() {
		return uidUser;
	}

	public void setuidUser(String uidUser) {
		this.uidUser = uidUser;
	}

	public List<AuditFunction> getUserFunctions() {
		return userFunctions;
	}

	public void setUserFunctions(List<AuditFunction> userFunctions) {
		this.userFunctions = userFunctions;
	}

}
