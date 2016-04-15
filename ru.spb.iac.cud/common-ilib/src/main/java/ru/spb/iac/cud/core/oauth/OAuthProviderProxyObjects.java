package ru.spb.iac.cud.core.oauth;

import ru.spb.iac.cud.context.ContextProxy;
import ru.spb.iac.cud.core.AccessManagerLocal;
//import ru.spb.iac.cud.core.oauth.IOAuthAccessManager;
import ru.spb.iac.cud.core.UtilManagerLocal;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal;
import ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal;
import ru.spb.iac.cud.core.oauth.IClientAppManagerLocal;
import ru.spb.iac.cud.core.oauth.IOAuthRegister;

// Usage: import static OAuthProviderProxyObjects.*;
public class OAuthProviderProxyObjects {
	public static ContextProxy<AccessManagerLocal> AccessManager() { return new ContextProxy<>("java:global/AuthServices/AccessManager!ru.spb.iac.cud.core.AccessManagerLocal"); }
	public static AccessManagerLocal aml() { return OAuthProviderProxyObjects.AccessManager()._; }
	
	public static ContextProxy<UtilManagerLocal> UtilManager() { return new ContextProxy<>("java:global/AuthServices/EisUtilManager!ru.spb.iac.cud.core.UtilManagerLocal"); }
	public static UtilManagerLocal uml() { return UtilManager()._; }

	public static ContextProxy<IDPUtilManagerLocal> IDPUtilManager() { return new ContextProxy<>("java:global/AuthServices/IDPUtilManager!ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal"); }
	public static IDPUtilManagerLocal idpUtil() { return IDPUtilManager()._; }

	public static ContextProxy<IDPAccessManagerLocal> IDPAccessManager() { return new ContextProxy<>("java:global/AuthServices/IDPAccessManager!ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal"); }
	public static IDPAccessManagerLocal idpaml() { return IDPAccessManager()._; }
	
	public static ContextProxy<IOAuthRegister<? extends TokenInfo, ? extends TokenInfo.IGetTokenInfo<? extends TokenInfo>>> OAuthRegister () { return new ContextProxy<>("java:global/picketlink-oauth-provider/picketlink-oauth-provider-wwwserver/SharedOAuthRegister!ru.spb.iac.cud.core.oauth.IOAuthRegister"); }
	public static IOAuthRegister<?, ? extends TokenInfo.IGetTokenInfo<? extends TokenInfo>> oaReg() { return OAuthRegister()._; }

	public static ContextProxy<IClientAppManagerLocal> 	OauthClientAppManager() { return new ContextProxy<>("java:global/picketlink-oauth-provider/picketlink-oauth-provider-wwwserver/SharedClientAppManager!ru.spb.iac.cud.core.oauth.IClientAppManagerLocal"); }
}
