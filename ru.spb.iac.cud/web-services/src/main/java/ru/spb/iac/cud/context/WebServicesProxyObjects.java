package ru.spb.iac.cud.context;

import ru.spb.iac.cud.core.oauth.IClientAppManagerLocal;
import ru.spb.iac.cud.core.oauth.IOAuthRegister;

public class WebServicesProxyObjects {
	// overcame limited generic support in enum with a fake-enum wrapper class
	// list here simple-wrapper mappings instead of making classes such as ContextAccessManager (unless you want to tweak original interface)
	public static final ContextProxy<IClientAppManagerLocal> 	OauthClientAppManager 	= new ContextProxy<>("java:global/picketlink-oauth-provider/picketlink-oauth-provider-wwwserver/SharedClientAppManager!ru.spb.iac.cud.core.oauth.IClientAppManagerLocal");
	//public static final ContextProxy<IOAuthRegister> 			OAuthRegister 			= new ContextProxy<>("java:global/picketlink-oauth-provider/picketlink-oauth-provider-wwwserver/SharedOAuthRegister!ru.spb.iac.cud.core.oauth.IOAuthRegister");
}
