define(['HttpClient'], function (_httpClient) { //, 'OAuthProviderREST', _OAuthProviderREST
	//http://localhost:8080/CudServicesPro/rs/applicationResult/sync_roles
	var _ver = 'GaliaJSFX_ApplicationResultServiceREST-1.0.0 (_httpClient version: '+_httpClient.version+')';

	// ApplicationResultServiceREST.inc.php
	// sync; other functions are async (where HttpClient is required)
	function new_ApplicationResultServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		return new ApplicationResultServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv);
	}	
	
	// sync
	function ApplicationResultServiceREST(providerUrl, loggerTest, loggerSend, loggerRecv) {
		// logger functions
		function logSend(txtLine) {
			if(loggerSend)
				loggerSend.writeLine('ApplicationResultServiceREST: '+txtLine);
		}
		function logRecv(txtLine) {
			if(loggerRecv)
				loggerRecv.writeLine('ApplicationResultServiceREST: '+txtLine);		
		}
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('ApplicationResultServiceREST: '+txtLine);		
		}
		
		var _providerUrl = providerUrl || 'http://paaa1.test.toris.vpn/CudServicesPro/rs';
		this.providerUrl = _providerUrl;
		logTest('ApplicationResultServiceREST created for server '+this.providerUrl);
		
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
			result: 		'/app/result'
		};
		this.result = function (callbackErrResult, appResultRequestList) {
		   return _post(callbackErrResult, this.RESTEndpoints.result,
			   {
				 "appResultRequestList": appResultRequestList
			   });
		};

	} //ApplicationResultServiceREST	
	
	return {
		version: _ver,
		new_ApplicationResultServiceREST: new_ApplicationResultServiceREST,
		ApplicationResultServiceREST: ApplicationResultServiceREST		
	};
	
});