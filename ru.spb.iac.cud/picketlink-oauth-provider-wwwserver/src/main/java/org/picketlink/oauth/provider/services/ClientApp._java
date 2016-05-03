package org.picketlink.oauth.provider.services;

import org.picketlink.idm.model.Attribute;
import org.picketlink.idm.model.IdentityType;
import org.picketlink.idm.model.basic.Agent;

public class ClientApp extends Agent { // or just CLIENT
	private static final long serialVersionUID = -2245094371103249371L;
	private Agent wrapApp; // get rid of it lately
	
	public ClientApp() { }
	public ClientApp(Agent agent) { this.wrapApp = agent; } // importPrivateFields(agent);
	
	private enum AppAgentFields { appURL, owner, clientID, clientSecret};
	private static final String _appURL = AppAgentFields.appURL.toString(),
								_owner = AppAgentFields.owner.toString(),
								_clientID = AppAgentFields.clientID.toString(),
								_clientSecret = AppAgentFields.clientSecret.toString();
	
	public String getAppURL() 			 { return (String)wrapApp.getAttribute(_appURL).getValue(); }
	public void setAppURL(String appURL) { wrapApp.setAttribute( new Attribute<String>(_appURL, appURL) );	}	
	
	public String getOwner() 			{ return (String)wrapApp.getAttribute(_owner).getValue(); }
	public void setOwner(String owner) 	{ wrapApp.setAttribute( new Attribute<String>(_owner, owner) );	 }	
	
	public String getClientID() 					 { return (String)wrapApp.getAttribute(_clientID).getValue();	}
	public void setClientID(String clientID) 		 { wrapApp.setAttribute( new Attribute<String>(_clientID, clientID) );	}	
	
	public String getClientSecret() 				 { return (String)wrapApp.getAttribute(_clientSecret).getValue(); }
	public void setClientSecret(String clientSecret) { wrapApp.setAttribute( new Attribute<String>(_clientSecret, clientSecret) );  }
	public Agent toAgent() { return this.wrapApp;}  // get rid of it lately

}
