package org.picketlink.oauth.provider.rest;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestClientData {
	private boolean appRegistered;
	private String  accessToken;
	
	public boolean isAppRegistered() {
		return appRegistered;
	}
	public void setAppRegistered(boolean appRegistered) {
		this.appRegistered = appRegistered;
	}
	private String getAccessToken() {
		return accessToken;
	}
	private void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
