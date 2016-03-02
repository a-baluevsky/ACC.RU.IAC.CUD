package org.picketlink.oauth.provider.model;


// Interface for client app authentication information
public interface IClientAppAuth {
	public String getClient_id();
	public void setClient_id(String client_id);
	public String getClient_secret();
	public void setClient_secret(String client_secret);
}
