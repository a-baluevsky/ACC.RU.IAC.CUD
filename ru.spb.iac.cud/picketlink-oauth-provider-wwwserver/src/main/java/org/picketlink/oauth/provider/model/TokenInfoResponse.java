package org.picketlink.oauth.provider.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize @XmlRootElement
public class TokenInfoResponse {
	private String 	token_info_type;
	public 	String 	getToken_info_type() 		{		return token_info_type;	}
	public 	void 	setToken_info_type(String token_info_type) {		this.token_info_type = token_info_type;	}
	
	@JsonSerialize public static class JWT extends TokenInfoResponse {
		private String token_info;
		@Override public String toString() { return token_info; }	
		public String 	getToken_info() 				 { return token_info;	} 
		public void 	setToken_info(String token_info) { this.token_info = token_info;	}		
	}
	
	@JsonSerialize public static class JSON extends TokenInfoResponse {
		private Map<String, ?> token_info; //String
		@Override public String toString() { 
			final ObjectMapper objMapper = new ObjectMapper();
			String strVal = "";
			try {
				strVal = objMapper.writeValueAsString(getToken_info());
			} catch (Exception e) { }
			return strVal; 
		}
		public Map<String, ?> getToken_info() { return token_info; }
		public void setToken_info(Map<String, ?> token_info) { this.token_info = token_info; }
	}	
}
