define(['GaliaJSFX_OAuthProviderREST'], function (OAuthProviderREST) {
	var _ver = 'GaliaJSFX_ClientApp-1.0.0';

	var RegClientApps = {
	    CTest2ClientAppJS: {
    	    client_id: 'urn:eis:BlueSky:test1',
			client_secret: 'urn:eis:BlueSky:test1',	
		    client_name: 'B^LUEvSKY Test System ClientApp (JavaScript)',
		    redirect_uri: '/paaa_oauth/ajax/AuthorizationCodeFlow.htm'	    
	    },
	    CTest2ClientApp: {
    	    client_id: 'urn:eis:BlueSky:test1',
			client_secret: 'urn:eis:BlueSky:test1',
		    client_name: 'B^LUEvSKY Test System ClientApp (PHP)',
		    redirect_uri: '/paaa_oauth/authorization_code_flow/authCallback.php'		    
	    }	        
	}

	// CTest2ClientApp.inc.php
	
	// appInfo: see RegClientApps
	function new_ClientApp(appInfo, providerUrl, loggerTest, loggerSend, loggerRecv) {
		var oapr = OAuthProviderREST.new_OAuthProviderREST(providerUrl, loggerTest, loggerSend, loggerRecv);
		return new ClientApp(appInfo, oapr, loggerTest);		
	}
	
	function ClientApp(appInfo, OAuthProviderREST, loggerTest) {
		// inner (closure) functions
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('ClientApp: '+txtLine);
		}
		
		// public functions
		this.Register = function(ownerUser, callbackErrResult) {
			debugger;
			var _this = this;
			if(ownerUser.IsLoggedIn) {
				_this.m_OAuthProviderREST.ApplicationRegistration(
					function(err, result) {
						debugger;
						if(err)
							callbackErrResult(err);
						else {
							var data = result.data;
							var errMsg = data.errorMessage;
							var registered = data.registered;
							if(registered || errorMessage == 'Application Already Registered')
								callbackErrResult(null, true);
							else
								callbackErrResult(errMsg);
						}	
					}, ownerUser.Id, _this.client_name, 
					_this.redirect_uri, _this.client_id, _this.client_secret
				);
			} else
				callbackErrResult('ClientApp.Register: User must be logged in to register clientApp!');
		}
		
		this.getAuthorizationCode = function(args, callbackErrResult) {
			debugger;
			var scope = args.scope;
			var user = args.user;
			
			var _this = this;
			_this.m_OAuthProviderREST.ScopeAuthorize(
				function(err, result) {
					//debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;						
						if(data && data.code)
							callbackErrResult(null, data.code);
						else
							callbackErrResult('ClientApp.getAuthorizationCode: no code returned from ScopeAuthorize');
					}	
				}, 	_this.state, _this.client_id, _this.client_secret, scope, 'code', user.AuthToken
			);
		}
		
        // ?? get AccessToken on login
		this.getAccessTokenFromUserCredentials = function(args, callbackErrResult) {  // do not store password! use it and forget it
    		//debugger;
			var user = args.user;
			
			var password = args.password;
			var token_type = args.token_type || "Bearer";
			
			var _this = this;
			_this.m_OAuthProviderREST.TokenPassword(
				function(err, result) {
					//debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;
						if(data && data.access_token) {
							_this.refresh_token = data.refresh_token;
							_this.access_token = data.access_token;
							
							user.refresh_token = data.refresh_token;
							user.access_token = data.access_token;
							
							callbackErrResult(null, data);
						} else
							callbackErrResult('ClientApp.getAccessTokenFromUserCredentials: no access_token returned from TokenPassword');
					}
				}, _this.client_id, _this.client_secret, user.Login, password, token_type
			);
		}
		
		this.getAccessTokenFromAuthorizationCode = function (args, callbackErrResult) {
			//debugger;
			var code = args.code;
			var token_type = args.token_type || "Bearer";
			var _this = this;
			_this.m_OAuthProviderREST.TokenAuthCode(
				function(err, result) {
					//debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;						
						if(data && data.access_token) {
							_this.refresh_token = data.refresh_token;
							_this.access_token = data.access_token;
							_this.access_token_type = token_type;
							callbackErrResult(null, data);
						}
						else
							callbackErrResult('ClientApp.getAccessTokenFromAuthorizationCode: no access_token returned from TokenAuthCode');
					}
				}, 	_this.client_id, _this.client_secret, code, token_type
			);
		}
		
		
		
		this.getAccessToken = function (token_type, callbackErrResult) {
			//debugger;
			var token_type = token_type || "Bearer";
			var _this = this;
			_this.m_OAuthProviderREST.TokenClientCredentials(
				function(err, result) {
					//debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;						
						if(data && data.access_token) {
							_this.refresh_token = data.refresh_token;
							_this.access_token = data.access_token;
							_this.access_token_type = data.token_type || token_type;							
							callbackErrResult(null, data);							
						}
						else
							callbackErrResult('ClientApp.getAccessToken: no access_token returned from TokenClientCredentials');
					}
				}, _this.client_id, _this.client_secret, token_type
			);
		}
		
		this.getUserAccessTokenInfo = // todo: implement TokenUserAccessInfo call
		this.getTokenInfo = function (args, callbackErrResult) {
			debugger;
			var token = args.token;
			var token_type = args.token_type || "Bearer";
			var tknInfoType = args.tknInfoType || "jwt";
			var _this = this;
			_this.m_OAuthProviderREST.TokenInfo(
				function(err, result) {
					debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;						
						if(data && data.token_info) {
							callbackErrResult(null, data.token_info);
						}
						else
							callbackErrResult('ClientApp.getTokenInfo: no token_info returned from TokenInfo');
					}
				},	_this.client_id, _this.client_secret, token, token_type, tknInfoType
			);
		}
		
		// TODO: postProtectedResource
		
		this.getProtectedResource = function(url, callbackErrResult) {
		    //debugger;
		    this.m_OAuthProviderREST._httpClient_JSON_token('GET', url, this.access_token_type, this.access_token, callbackErrResult);
		}
		
		this.refreshAccessToken = function (args, callbackErrResult) {
			debugger;
			var refreshToken = args.refreshToken;
			var token_type = args.token_type || "Bearer";
			var _this = this;
			_this.m_OAuthProviderREST.TokenRefresh(
				function(err, result) {
					debugger;
					if(err)
						callbackErrResult(err);
					else {
						var data = result.data;						
						if(data && data.access_token) {
							_this.access_token = data.access_token;
							_this.access_token_type = token_type;						
							callbackErrResult(null, data);
						}
						else
							callbackErrResult('ClientApp.refreshAccessToken: no access_token returned from TokenRefresh');
					}
				}, _this.client_id, _this.client_secret, refreshToken, token_type
			);
		}
		
		this.getClientAppUserRolesInfo = function (args, callbackErrResult) {
			//debugger;
			var user 		= args.user;
			var role_code 	= args.role_code;
			var role_info 	= args.role_info;	// null or array of combination
				// role_info = ['code', 'name', 'description', 'creator_id', 'date_created', 'modificator_id', 'date_modified'];
			var _this = this;
			_this.m_OAuthProviderREST.GetClientAppUserRoleInfo(function (err, result) {
				//debugger;
				if(err)
					callbackErrResult(err);
				else {					
					var roles = result.data; // cache roles? = user.Roles
					callbackErrResult(null, roles);
				}
			}, role_code, role_info, user.access_token);	
			
		};
		
		// init
		this.m_OAuthProviderREST = OAuthProviderREST;
		_.extend(this, appInfo);
		this.state = '123';
		this.refresh_token = null;
		this.access_token = null;
		
		logTest('ClientApp '+this.client_id+' ('+this.client_name+') created on OAuth Provider '+this.m_OAuthProviderREST.providerUrl);
	}

	
	return {
		version: _ver,
		RegClientApps: RegClientApps,
		new_ClientApp: new_ClientApp,
		ClientApp: ClientApp
	};
});