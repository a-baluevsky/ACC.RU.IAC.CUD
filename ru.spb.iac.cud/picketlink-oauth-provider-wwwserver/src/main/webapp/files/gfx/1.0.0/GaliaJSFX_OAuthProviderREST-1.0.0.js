define(['HttpClient', 'CookieFX'], function (_httpClient, _QK) {
	var _ver = 'GaliaJSFX_OAuthProviderREST-1.0.0 ('+_httpClient.version+')';

	// OAuthProviderREST.inc.php
	// sync; other functions are async (where HttpClient is required)
	function new_OAuthProviderREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		return new OAuthProviderREST(providerUrl, loggerTest, loggerSend, loggerRecv, _QK);
	}	
	
	// sync
	function OAuthProviderREST(providerUrl, loggerTest, loggerSend, loggerRecv, _QK) {
		// logger functions
		function logSend(txtLine) {
			if(loggerSend)
				loggerSend.writeLine('OAuthProviderREST: '+txtLine);
		}
		function logRecv(txtLine) {
			if(loggerRecv)
				loggerRecv.writeLine('OAuthProviderREST: '+txtLine);		
		}
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('OAuthProviderREST: '+txtLine);		
		}
		
		//debugger;
		var _AUTH_TOKEN = _QK.readCookie('Auth-Token'); // Picket-link stuff; in fact, this is session-id http://cuddevelop1:8080
		var _providerUrl = providerUrl || 'http://paaa1.test.toris.vpn/picketlink-oauth-provider-wwwserver'; // 'http://paaa1.test.toris.vpn/picketlink-oauth-provider-wwwserver';
		//if(!_.strStartsWith(providerUrl, 'http://', true))
		//    providerUrl = 'http://'+providerUrl;
		    
		this.providerUrl = _providerUrl;
		logTest('OAuthProviderREST created for server '+this.providerUrl);
		
		// internal functionality
		// TODO: finally, move these into httpClient class!
		
		function _httpClient_JSON(method, pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult) {
			//debugger;
			var httpClient = _httpClient.new_HttpClient({loggerSend: loggerSend, loggerRecv: loggerRecv}, 
				function(err, httpClient) {
					if(err)
						callbackErrResult(err);
					else {
						var url = _.strStartsWith(pathEndpoint, 'http:', true)? pathEndpoint: _.strUrlCombine(_providerUrl, pathEndpoint);
						httpClient.postData({url:url, postedData: argsJSON, dataFormat: 'JSON', optHeaders: optHeaders}, callbackErrResult);						
					}						
				});
		}
		this._httpClient_JSON = _httpClient_JSON;
		
		function _httpClient_JSON_session(method, pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult) {
			debugger;
			var httpClient = _httpClient.new_HttpClient({loggerSend: loggerSend, loggerRecv: loggerRecv}, 
				function(err, httpClient) {
					if(err)
						callbackErrResult(err);
					else {
						var url = _.strStartsWith(pathEndpoint, 'http:', true)? pathEndpoint: _.strUrlCombine(_providerUrl, pathEndpoint);
						httpClient.authJSON({method:method, url:url, postedData: argsJSON, sessionToken:_AUTH_TOKEN, 
						        optHeaders:optHeaders, optCookie: optCookie}, callbackErrResult);						
					}						
				});
		}		
		this._httpClient_JSON_session = _httpClient_JSON_session;
		
		
        function _httpClient_JSON_token(method, pathEndpointUrl, tokenType, accessToken, callbackErrResult) {
			//debugger;
			// TODO: validate args!
			tokenType = tokenType || 'Bearer';
			_httpClient.new_HttpClient({loggerSend: loggerSend, loggerRecv: loggerRecv}, 
				function(err, httpClient) {
					if(err)
						callbackErrResult(err);
					else {
						//debugger;
						// headers are set in httpClient class!
						var args = {method: method, url: pathEndpointUrl, 
						    access_token_type: tokenType, access_token: accessToken
						};
						return httpClient._authTokenData(args, callbackErrResult);						
					}						
				});
		}
		
		this._httpClient_JSON_token = _httpClient_JSON_token;
		
		function _httpClient_JSON_bearer(method, pathEndpointUrl, accessToken, callbackErrResult) {
			return _httpClient_JSON_token(method, pathEndpointUrl, accessToken, 'Bearer', callbackErrResult);
		}
		function _httpClient_JSON_bearer_get(pathEndpointUrl, accessToken, callbackErrResult) {
			return _httpClient_JSON_token('GET', pathEndpointUrl, accessToken, 'Bearer', callbackErrResult);
		}
		function _httpClient_JSON_jwt_get(pathEndpointUrl, accessToken, callbackErrResult) {
			return _httpClient_JSON_token('GET', pathEndpointUrl, accessToken, 'JWT', callbackErrResult);
		}

		function _post(callbackErrResult, pathEndpoint, argsJSON, optHeaders, optCookie) {
		    //debugger;
			return _httpClient_JSON("POST", pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult);
		}
		function _post_session(callbackErrResult, pathEndpoint, argsJSON, optHeaders, optCookie) {
		    //debugger;
			return _httpClient_JSON_session("POST", pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult);
		}		
		function _get(callbackErrResult, pathEndpoint, argsJSON, optHeaders, optCookie) {
			return _httpClient_JSON("GET", pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult);
		}
		
		// Actual REST wrappers: Registration & Authorization
		this.ApplicationRegistration = function (callbackErrResult, userId, appName, appURL, client_id, client_secret) {
			client_secret = client_secret || client_id;
			return _post(callbackErrResult, '/appregister', 
				{
					'userId': userId,
					'appName': appName,
					'appURL': appURL,
					'client_id': client_id, 'client_secret': client_secret
				});
		}
		this.ScopeAuthorize = function (callbackErrResult, state, client_id, client_secret, scope, response_type, authToken) {
			debugger;
//Set-Cookie:JSESSIONID=u+0IXoqKRlvDd17Oxm5dLPb9; Path=/picketlink-oauth-provider-wwwserver
//Set-Cookie:Auth-Token=u+0IXoqKRlvDd17Oxm5dLPb9;Version=1;Path=/picketlink-oauth-provider-wwwserver;HttpOnly			
			var authTknData = {'Auth-Token': authToken, 'JSESSIONID': authToken 
			//,'Set-Cookie': 'JSESSIONID='+authToken+'; Path=/picketlink-oauth-provider-wwwserver',
			//'Set-Cookie': 'Auth-Token='+authToken+';Version=1; Path=/picketlink-oauth-provider-wwwserver'
			}
			
			return _post_session(callbackErrResult, '/auth/scope', 
				{
					'state': state,
					'client_id': client_id, 'client_secret': client_secret,
					'scope': scope,
					'response_type': response_type				
				}, authTknData, authTknData);
		}
		
		this.EndpointsREST={Login: '/auth/login'};
		
		// Actual REST wrappers: User
		this.Login = function (callbackErrResult, userId, password) {
			return _post(callbackErrResult, this.EndpointsREST.Login, 
				{
					'userId': userId,
					'password': password				
				}
			);		
		}
		this.UserInfo = function (callbackErrResult) {
			return _get(callbackErrResult, '/userinfo');
		}
		this.Logout = function (callbackErrResult, authToken) {
			//debugger;
			return _get(callbackErrResult, '/logout', null, {'Auth-Token': authToken});
		}
		
		// Actual REST wrappers: Token
		this.TokenAuthCode = function (callbackErrResult, client_id, client_secret, code, token_type) {
			token_type=token_type||"Bearer";
			return _post(callbackErrResult, '/token', 
				{
					'client_id': client_id, 'client_secret': client_secret,
					'grant_type': 'authorization_code',
					'code': code,
					'token_type': token_type 
				}				
				//,
				//	{
				//		//'Authorization: '.encodeBasicAuthorizationValue(callbackErrResult, client_id, client_secret)
				//	}
				//
				);				
		}
		
		this.TokenClientCredentials = function (callbackErrResult, client_id, client_secret, token_type) { 
			//debugger;
			token_type=token_type||"Bearer";
			return _post(callbackErrResult,  '/token', 
				{
					'client_id': client_id, 'client_secret': client_secret,
					'grant_type': 'client_credentials',
					'token_type': token_type
				}
				//,{
					//'Authorization: '.encodeBasicAuthorizationValue(callbackErrResult, client_id, client_secret)
				//}
			); // returns access_token, expires_in
		}
		this.TokenPassword = function (callbackErrResult, client_id, client_secret, username, password, token_type) {
			//debugger;
			token_type=token_type||"Bearer";
			return _post(callbackErrResult,  
				'/token', 
				{
					'client_id': client_id, 'client_secret': client_secret,
					'grant_type': 'password',
					'username': username, 'password':  password,
					'token_type': token_type
				}
				//,{
					//'Authorization: '.encodeBasicAuthorizationValue(callbackErrResult, client_id, client_secret)
				//)
			); // returns access_token, expires_in
		}
		
		this.TokenRefresh = function (callbackErrResult, client_id, client_secret, refreshToken, token_type) {
			debugger;
			token_type=token_type||"Bearer";
			return _post(callbackErrResult,  
				'/token', 
				{
					'client_id': client_id, 'client_secret': client_secret,
					'grant_type': 'refresh_token',
					'refresh_token': refreshToken,
					'token_type': token_type
				}
				//,{
					//'Authorization: '.encodeBasicAuthorizationValue(callbackErrResult, client_id, client_secret)
				//}
			); // returns access_token, expires_in
		}	

		this.TokenInfo = function (callbackErrResult, token, token_type, tknInfoType) { 
			//debugger;
			tknInfoType=tknInfoType||"jwt";
			return _post(callbackErrResult,  
				'/token/info', 
				{
					'token': token,
					'token_type': token_type,
					'infoType': tknInfoType
				}
				,{
					Authorization: token_type+' '+token
					//'Authorization: '.encodeBasicAuthorizationValue(callbackErrResult, client_id, client_secret)
				}
			); // returns
		}
	
		this.TokenUserAccessInfo = function (callbackErrResult, user_acc_token, token_type, tknInfoType) { 
			//debugger;
			tknInfoType=tknInfoType||"jwt";
			return _post(callbackErrResult,  
				'/token/UserInfo', 
				{
					'infoType': tknInfoType
				}, 
				{
					Authorization: token_type+' '+user_acc_token
				}
			); // returns
		}
		
		this.GetClientAppUserRoles = function (callbackErrResult, user_acc_token, token_type) { 
			token_type = token_type||'Bearer';
			return _post(callbackErrResult,  
				'/token/UserInfo/Roles', null, 
				{
					Authorization: token_type+' '+user_acc_token
				}
			); // returns
		};
		this.GetClientAppUserRoleInfo = function (callbackErrResult, role_code, role_info, user_acc_token, token_type) { 
			token_type = token_type||'Bearer';
			return _post(callbackErrResult,  
				'/token/UserInfo/RolesInfo', 
				{
					role_code: role_code, 
					role_info: role_info
				}, 
				{
					Authorization: token_type+' '+user_acc_token
				}
			); // returns
		};	
		
		//  Server test functions
		this.TestException = function (callbackErrResult, exceptionId, error_description) {
			debugger;
			error_description=error_description||'';
			return _post(callbackErrResult,  
				'/test/exception/'+exceptionId, 
				{
					'error_description': error_description
				}
				//,{
					//Authorization:  _.join( token_type, ' ', user_acc_token)
				//}
			); // returns		
		}
			
	};
		
	
	return {
		version: _ver,
		new_OAuthProviderREST: new_OAuthProviderREST,
		OAuthProviderREST: OAuthProviderREST		
	};
});