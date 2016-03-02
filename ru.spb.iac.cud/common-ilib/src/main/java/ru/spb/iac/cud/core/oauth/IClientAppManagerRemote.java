package ru.spb.iac.cud.core.oauth;
import javax.ejb.Remote;

@Remote
public interface IClientAppManagerRemote {
	
	public boolean existsApp(String id);
	
}
