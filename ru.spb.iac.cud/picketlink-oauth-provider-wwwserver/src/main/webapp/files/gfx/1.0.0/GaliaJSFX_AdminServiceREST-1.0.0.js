define(['HttpClient'], function (_httpClient) { //, 'OAuthProviderREST', _OAuthProviderREST
	//http://localhost:8080/CudServicesPro/rs/admin/sync_roles
	var _ver = 'GaliaJSFX_AdminServiceREST-1.0.0 (_httpClient version: '+_httpClient.version+')';

	// AdminServiceREST.inc.php
	// sync; other functions are async (where HttpClient is required)
	function new_AdminServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		return new AdminServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv);
	}	
	
	// sync
	function AdminServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		// logger functions
		function logSend(txtLine) {
			if(loggerSend)
				loggerSend.writeLine('AdminServiceREST: '+txtLine);
		}
		function logRecv(txtLine) {
			if(loggerRecv)
				loggerRecv.writeLine('AdminServiceREST: '+txtLine);		
		}
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('AdminServiceREST: '+txtLine);		
		}
		
		var _providerUrl = providerUrl || 'http://paaa1.test.toris.vpn/CudServicesPro/rs';
		this.providerUrl = _providerUrl;
		logTest('AdminServiceREST created for server '+this.providerUrl);
		
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
						httpClient.postData({url:url, postedData: argsJSON, dataFormat: 'JSON'}, callbackErrResult);						
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
		
		// all REST endpoints URLs list
		// allows client know endpoint address and override it 
		this.RESTEndpoints={
			sync_roles: 		'/admin/sync_roles',
			access_roles: 		'/admin/access_roles',
			cert_change_sys: 	'/admin/cert_change_sys',
			sync_functions: 	'/admin/sync_functions',
			sync_groups: 		'/admin/sync_groups',
			sync_groups_roles: 	'/admin/sync_groups_roles',
			access_groups: 		'/admin/access_groups',
			sync_resources: 	'/admin/sync_resources'
		};
		// Actual REST wrappers!	
		this.sync_roles = function (callbackErrResult, roles, modeExec) {
			debugger;
		   return _post(callbackErrResult, this.RESTEndpoints.sync_roles,
			   {
				 "roles": roles,
				 "modeExec": modeExec
			   });
		};
		this.access_roles = function (callbackErrResult, uidsUsers, codesRoles, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.access_roles,
			   {
				 "uidsUsers": uidsUsers,
				 "codesRoles": codesRoles,
				 "modeExec": modeExec
			   });
		};
		this.cert_change_sys = function (callbackErrResult, String) {
		   return _post(callbackErrResult, this.RESTEndpoints.cert_change_sys,
			   {
				 "String": String
			   });
		};
		this.sync_functions = function (callbackErrResult, functions, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.sync_functions,
			   {
				 "functions": functions,
				 "modeExec": modeExec
			   });
		};
		this.sync_groups = function (callbackErrResult, groups, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.sync_groups,
			   {
				 "groups": groups,
				 "modeExec": modeExec
			   });
		};
		this.sync_groups_roles = function (callbackErrResult, codesGroups, codesRoles, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.sync_groups_roles,
			   {
				 "codesGroups": codesGroups,
				 "codesRoles": codesRoles,
				 "modeExec": modeExec
			   });
		};
		this.access_groups = function (callbackErrResult, uidsUsers, codesGroups, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.access_groups,
			   {
				 "uidsUsers": uidsUsers,
				 "codesGroups": codesGroups,
				 "modeExec": modeExec
			   });
		};
		this.sync_resources = function (callbackErrResult, resources, modeExec) {
		   return _post(callbackErrResult, this.RESTEndpoints.sync_resources,
			   {
				 "resources": resources,
				 "modeExec": modeExec
			   });
		};
		
	} //AdminServiceREST	
	
	return {
		version: _ver,
		new_AdminServiceREST: new_AdminServiceREST,
		AdminServiceREST: AdminServiceREST		
	};
	
});