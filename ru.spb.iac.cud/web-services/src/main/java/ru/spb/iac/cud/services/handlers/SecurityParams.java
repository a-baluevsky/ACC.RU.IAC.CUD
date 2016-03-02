package ru.spb.iac.cud.services.handlers;

import javax.ws.rs.ext.Provider;
//import com.sun.jersey.server.impl.inject.AbstractHttpContextInjectable;

public class SecurityParams {
	public static class ClientAppInfo {
		public final String client_id, client_secret, ip_address;		
		public ClientAppInfo(String client_id, String client_secret, String ip_address) {
			this.client_id = client_id;
			this.client_secret = client_secret;
			this.ip_address = ip_address;
			
		}
	}
	
	
	/*
	@Provider  
	public class ClientAppInfoProvider extends AbstractHttpContextInjectable<ClientAppInfo>  
	        implements InjectableProvider<Context, Type> { 
		
	}
	*/
}
