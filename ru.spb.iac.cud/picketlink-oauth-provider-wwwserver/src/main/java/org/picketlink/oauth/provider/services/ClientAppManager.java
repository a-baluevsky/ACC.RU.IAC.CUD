package org.picketlink.oauth.provider.services;

import javaw.lang.Strings;

import javax.ejb.Stateless;

import java.util.UUID;

import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
//import javax.persistence.PersistenceContext;





import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.model.basic.Agent;
import org.picketlink.idm.model.basic.BasicModel;

import ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects;

@TransactionAttribute
public @Stateless class ClientAppManager
{
	//@PersistenceContext
	@Inject private IdentityManager identityManager;
	
	public ClientApp get(String id) {
		ClientApp app = null;
		final Agent agent = BasicModel.getAgent(identityManager,id);
		if(agent!=null)
			app = new ClientApp(agent);
		else { // try auto-OAuthAccessManagerregister
			String clnSec = getClientAppSecret(id);
			if(clnSec!=null) {
				app = create(id, "cud://"+id, "1", id, clnSec);
			}
		}
		return app;
	}
	private static String getClientAppSecret(String id) {
		return OAuthProviderProxyObjects.AccessManager._.getOAuthClientAppSecret(id); //OAuthClientAppManager
	}
	public boolean existsApp(String id) {
		if(BasicModel.getAgent(identityManager,id)!=null)
			return true;
		else
			return getClientAppSecret(id)!=null;
	}		
	public ClientApp create(String id) {
        final Agent agent = new Agent(id);
        identityManager.add(agent);
        return get(id);
	}
	public ClientApp create(String id, String appURL, String owner, String clientID, String clientSecret) {
		ClientApp newApp = create(id);
		if(newApp!=null) {
			newApp.setAppURL(appURL); 		newApp.setOwner(owner);
			newApp.setClientID(clientID);	newApp.setClientSecret(clientSecret);
			identityManager.update(newApp.toAgent());
		}
		return newApp;
	}
	
	public ClientApp create(String id, String appURL, String owner) {
		return create(id,appURL,owner,getUID(),getUID());
	}		
    private static String getUID(){
        return UUID.randomUUID().toString();
    }
    
    
	public boolean validate(String cliID, String cliSc) {		
		boolean validated = false;
		// LESS SECURE APPROACH
		validated = !Strings.isNullOrEmpty(cliID) && !Strings.isNullOrEmpty(cliSc) 
				&& cliID.equals(cliSc);
		/* MORE SECURE APPROACH
		if(!Strings.isNullOrEmpty(cliID) && !Strings.isNullOrEmpty(cliSc)) {
			//LOGGER.info("authenticate: 70");
			final ClientApp app = get(cliID);			
			if(app!=null) {
    			final String s=app.getClientSecret();
				validated = s!=null && cliSc!=null && s.equals(cliSc);
    		} else {
    			validated = false;
    		}
		}
		*/
		
		return validated;
	}
}
