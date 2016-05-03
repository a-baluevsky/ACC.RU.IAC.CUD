package org.picketlink.oauth.provider.services;

import javaw.lang.Strings;

import javax.ejb.Stateless;

import java.util.UUID;

import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
//import javax.persistence.PersistenceContext;


import ru.spb.iac.cud.core.oauth.OAuthProviderProxyObjects;

@TransactionAttribute
public @Stateless class ClientAppManager
{
	
	
	private static String getClientAppSecret(String id) {
		return OAuthProviderProxyObjects.AccessManager()._.getOAuthClientAppSecret(id); //OAuthClientAppManager
	}
	public boolean existsApp(String id) {
					return getClientAppSecret(id)!=null;
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
