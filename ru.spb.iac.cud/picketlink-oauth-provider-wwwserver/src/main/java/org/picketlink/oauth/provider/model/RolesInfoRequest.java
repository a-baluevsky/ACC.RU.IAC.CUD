package org.picketlink.oauth.provider.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement @JsonSerialize
public class RolesInfoRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String role_code;				// one or many roles IDs separated by comma; passing nothing means ALL
	public String getRole_code() { return role_code;	}
	public void setRole_code(String role_code) {this.role_code = role_code;	}	
	
	private List<RoleInfo> role_info;	// column names; passing nothing means [CODE, NAME]	
	public List<RoleInfo> getRole_info() {return role_info;	}
	public void setRole_info(List<RoleInfo> role_info) {this.role_info = role_info;	}
	
	public static enum RoleInfo {
		//code("SIGN_OBJECT"), 
		name("FULL_"), description("DESCRIPTION"), creator_id("CREATOR"), 
		date_created("CREATED"), modificator_id("MODIFICATOR"), date_modified("MODIFIED");
		private String tableFieldName;
		private RoleInfo(String tableFieldName) { this.tableFieldName = tableFieldName; }
		public static HashMap<String, String> mapAttrName_FieldName(List<RoleInfo> role_info) {
			HashMap<String, String> hmResult = new HashMap<>();
			for (RoleInfo roleInfo : role_info)
				hmResult.put(roleInfo.name(), roleInfo.tableFieldName);
			return hmResult;			
		}
	}
}
