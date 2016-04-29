define(['HttpClient'], function (_httpClient) { //, 'OAuthProviderREST', _OAuthProviderREST
	//http://localhost:8080/CudServicesPro/rs/application/sync_roles
	var _ver = 'GaliaJSFX_ApplicationServiceREST-1.0.0 (_httpClient version: '+_httpClient.version+')';

	// ApplicationServiceREST.inc.php
	// sync; other functions are async (where HttpClient is required)
	function new_ApplicationServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		return new ApplicationServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv);
	}	
	
	// sync
	function ApplicationServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		// logger functions
		function logSend(txtLine) {
			if(loggerSend)
				loggerSend.writeLine('ApplicationServiceREST: '+txtLine);
		}
		function logRecv(txtLine) {
			if(loggerRecv)
				loggerRecv.writeLine('ApplicationServiceREST: '+txtLine);		
		}
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('ApplicationServiceREST: '+txtLine);		
		}
		
		var _providerUrl = providerUrl || 'http://paaa1.test.toris.vpn/CudServicesPro/rs';
		this.providerUrl = _providerUrl;
		logTest('ApplicationServiceREST created for server '+this.providerUrl);
		
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
						//if(method=='POST')
							httpClient.postData({url:url, postedData: argsJSON, dataFormat: 'JSON'}, callbackErrResult);
						//else
						//	httpClient.getData({url:url, postedData: argsJSON, dataFormat: 'JSON'}, callbackErrResult);
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
			debugger;
			return _httpClient_JSON("GET", pathEndpoint, argsJSON, optHeaders, optCookie, callbackErrResult);
		}
		
		// all REST endpoints URLs list
		// allows client know endpoint address and override it 
		this.RESTEndpoints={
			system_registration: 	'/app/system_registration',
			user_registration: 		'/app/user_registration',
			access_roles: 			'/app/access_roles',
			access_groups: 			'/app/access_groups',
			block: 					'/app/block',
			system_modification: 	'/app/system_modification',
			user_modification: 		'/app/user_modification',
			user_identity_modification: 	'/app/user_identity_modification',
			user_cert_modification: 		'/app/user_cert_modification'
		};
		this.system_registration = function (callbackErrResult, attributes) {
		   return _post(callbackErrResult, this.RESTEndpoints.system_registration,
			   {
				 "attributes": attributes
			   });
		};
		this.user_registration = function (callbackErrResult, attributes) {
		   return _post(callbackErrResult, this.RESTEndpoints.user_registration,
			   {
				 "attributes": attributes
			   });
		};
		this.access_roles = function (callbackErrResult, modeExec, uidUser, codesRoles) {
		   return _post(callbackErrResult, this.RESTEndpoints.access_roles,
			   {
				 "modeExec": modeExec,
				 "uidUser": uidUser,
				 "codesRoles": codesRoles
			   });
		};
		this.access_groups = function (callbackErrResult, modeExec, uidUser, codesGroups) {
		   return _post(callbackErrResult, this.RESTEndpoints.access_groups,
			   {
				 "modeExec": modeExec,
				 "uidUser": uidUser,
				 "codesGroups": codesGroups
			   });
		};
		this.block = function (callbackErrResult, modeExec, uidUser, blockUser) {
		   return _post(callbackErrResult, this.RESTEndpoints.block,
			   {
				 "modeExec": modeExec,
				 "uidUser": uidUser,
				 "blockUser": blockUser
			   });
		};
		this.system_modification = function (callbackErrResult, attributes) {
		   return _post(callbackErrResult, this.RESTEndpoints.system_modification,
			   {
				 "attributes": attributes
			   });
		};
		this.user_modification = function (callbackErrResult, uidUser, login, password) {
		   return _post(callbackErrResult, this.RESTEndpoints.user_modification,
			   {
				 "uidUser": uidUser,
				 "login": login,
				 "password": password
			   });
		};
		this.user_identity_modification = function (callbackErrResult, uidUser, login, password) {
		   return _post(callbackErrResult, this.RESTEndpoints.user_identity_modification,
			   {
				 "uidUser": uidUser,
				 "login": login,
				 "password": password
			   });
		};
		this.user_cert_modification = function (callbackErrResult, modeExec, uidUser, certBase64) {
		   return _post(callbackErrResult, this.RESTEndpoints.user_cert_modification,
			   {
				 "modeExec": modeExec,
				 "uidUser": uidUser,
				 "certBase64": certBase64
			   });
		};
		
	} //ApplicationServiceREST	
	
	return {
		version: _ver,
		new_ApplicationServiceREST: new_ApplicationServiceREST,
		ApplicationServiceREST: ApplicationServiceREST		
	};
	
});