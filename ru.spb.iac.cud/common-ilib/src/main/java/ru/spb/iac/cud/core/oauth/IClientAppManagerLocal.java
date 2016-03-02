package ru.spb.iac.cud.core.oauth;

import javax.ejb.Local;

@Local
public interface IClientAppManagerLocal {

	public boolean existsApp(String id);

}