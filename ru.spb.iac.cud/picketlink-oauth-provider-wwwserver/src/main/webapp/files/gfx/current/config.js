require.config({
    paths: {
        baseUrl:	'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/current',	
		jquery: 	'lib/jquery-2.1.1',
		underscore: 'lib/underscore-1.8.3',			
		underscore_plus: 'underscore_plus',	
		TesterFX: 'tester/TesterFX-1.0.0',
		LoggerFX: 'tester/LoggerFX-1.0.0',
		async: 	'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/async-1.0.0',
		CookieFX: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/CookieFX-1.0.0',
		GaliaJSFX: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/GaliaJSFX-1.0.0',	
		GaliaJSFX_AuthRequest: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/GaliaJSFX_AuthRequest-1.0.0',		
		GaliaJSFX_ClientApp: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/GaliaJSFX_ClientApp-1.0.0',
		GaliaJSFX_ClientAppUser: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/GaliaJSFX_ClientAppUser-1.0.0',
		GaliaJSFX_OAuthProviderREST: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/GaliaJSFX_OAuthProviderREST-1.0.0',
		HttpClient: 'http://<%HOST%>/picketlink-oauth-provider-wwwserver/files/gfx/1.0.0/HttpClient-1.0.0'
    }
	,shim: {
        //'underscore': { exports: '_' }
		//,underscore_plus: { exports: 'underscore_plus' }
	}
});