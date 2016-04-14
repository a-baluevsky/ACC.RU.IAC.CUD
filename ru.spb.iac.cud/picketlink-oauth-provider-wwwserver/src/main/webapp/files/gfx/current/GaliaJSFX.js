define(['underscore_plus', 'async',
	'GaliaJSFX_OAuthProviderREST', 'GaliaJSFX_ClientApp', 'GaliaJSFX_ClientAppUser', 'GaliaJSFX_AuthRequest'],
function (_, async, _OAuthProviderREST, _ClientApp, _ClientAppUser, _AuthRequest) {
	var _ver = 'GaliaJSFX-1.0.0';
	
	// tester things
	function test() {
		return;
	}
	
	// GaliaJSFX MODULE INDEX
	return {
		//test: test,
		version: _ver,
		OAuthProviderREST: _OAuthProviderREST,
		ClientApp: _ClientApp, 
		ClientAppUser: _ClientAppUser, 
		AuthRequest: _AuthRequest
	};
	
});