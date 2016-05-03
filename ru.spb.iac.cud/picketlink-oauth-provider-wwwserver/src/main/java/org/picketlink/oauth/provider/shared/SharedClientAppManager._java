package org.picketlink.oauth.provider.shared;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.picketlink.oauth.provider.services.ClientAppManager;

import ru.spb.iac.cud.core.oauth.IClientAppManagerLocal;
import ru.spb.iac.cud.core.oauth.IClientAppManagerRemote;

public @Stateless class SharedClientAppManager implements IClientAppManagerLocal, IClientAppManagerRemote
{
	@Inject private ClientAppManager clientAppManager;	

	@Override 
	public boolean existsApp(String id) {
		return clientAppManager.existsApp(id);
	}
	

}
