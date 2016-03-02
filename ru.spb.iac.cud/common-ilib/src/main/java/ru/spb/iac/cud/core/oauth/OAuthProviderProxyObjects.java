package ru.spb.iac.cud.core.oauth;

import ru.spb.iac.cud.context.ContextProxy;
import ru.spb.iac.cud.core.AccessManagerLocal;
//import ru.spb.iac.cud.core.oauth.IOAuthAccessManager;
import ru.spb.iac.cud.core.UtilManagerLocal;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal;
import ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal;

// Usage: import static OAuthProviderProxyObjects.*;
public class OAuthProviderProxyObjects {
	public static final ContextProxy<AccessManagerLocal> AccessManager = new ContextProxy<>("java:global/AuthServices/AccessManager!ru.spb.iac.cud.core.AccessManagerLocal");
	public static final AccessManagerLocal aml = OAuthProviderProxyObjects.AccessManager._;

	public static final ContextProxy<UtilManagerLocal> UtilManager = new ContextProxy<>("java:global/AuthServices/EisUtilManager!ru.spb.iac.cud.core.UtilManagerLocal");
	public static final UtilManagerLocal uml = UtilManager._;

	public static final ContextProxy<IDPUtilManagerLocal> IDPUtilManager = new ContextProxy<>("java:global/AuthServices/IDPUtilManager!ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal");
	public static final IDPUtilManagerLocal idpUtil = IDPUtilManager._;

	public static final ContextProxy<IDPAccessManagerLocal> IDPAccessManager = new ContextProxy<>("java:global/AuthServices/IDPAccessManager!ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal");
	public static final IDPAccessManagerLocal idpaml = IDPAccessManager._; 
	
	public static final ContextProxy<IOAuthRegister<? extends TokenInfo, ? extends TokenInfo.IGetTokenInfo<? extends TokenInfo>>> OAuthRegister = new ContextProxy<>("java:global/picketlink-oauth-provider/picketlink-oauth-provider-wwwserver/SharedOAuthRegister!ru.spb.iac.cud.core.oauth.IOAuthRegister");
	public static final IOAuthRegister<?, ? extends TokenInfo.IGetTokenInfo<? extends TokenInfo>> oaReg = OAuthRegister._;

}
