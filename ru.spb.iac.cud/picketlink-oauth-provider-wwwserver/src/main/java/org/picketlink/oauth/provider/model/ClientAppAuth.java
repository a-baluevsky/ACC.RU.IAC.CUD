package org.picketlink.oauth.provider.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement @JsonSerialize
public class ClientAppAuth implements IClientAppAuth {
	protected String client_id, client_secret;
	public ClientAppAuth() { }
	public ClientAppAuth(String client_id, String client_secret) {		
		this.client_id = client_id;
		this.client_secret = client_secret;
	}	
	@Override public String getClient_id() { return client_id; }
	@Override public void setClient_id(String client_id) {		this.client_id = client_id;	}
	@Override public String getClient_secret() {		return client_secret;	}
	@Override public void setClient_secret(String client_secret) {		this.client_secret = client_secret;	}
}
