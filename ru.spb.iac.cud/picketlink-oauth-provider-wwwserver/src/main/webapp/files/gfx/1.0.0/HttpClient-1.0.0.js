define(['underscore_plus',  'CookieFX'], function (_, _COOKIE) {
	//HttpClient: hi-level wrapper for POST JS requests
	var _ver = 'HttpClient-1.0.0';

		/* TODO: implement this:
		validateArgs:  {argName: validatorFn}
		 e.g. validateArgs( {a: -2, b: null}, {a: greaterZero, b: NonNull} );
		*/	

	// CONSTANTS
	var L_FORM_CONTENT_TYPE = "application/x-www-form-urlencoded; charset=UTF-8";
	var L_JSON_CONTENT_TYPE = "application/json; charset=UTF-8";
	
	var LARR_CONTENTTYPES = {
		FORM: L_FORM_CONTENT_TYPE,
		JSON: L_JSON_CONTENT_TYPE,
		TEXT: 'text/html; charset=UTF-8'
	};  
	
	// TODO: put args into args array to:
	//	1. make varArgs 
	//	2. simulate named args (as in Visual Basic: InStr(Start:=1, Count:=5)
	//	3. simulate ByRef args
	// E.g. Sub Test(ByRef A, ByRef B, ByRef C, ParamArray X())
	// ->	function Test(args, callbackErrResult) {
	// 			args.A = 5; // store ByRef
	//			alert(args.C);
	//			args.X[5] = 'var arg demo!';
	//  	}
	//	var args = {C: "named arg demo", A: 10};
	//  Test(args, cb);
	//	alert('ByRef changed: '+args.A);	
	
	
	// Fn scheme: 
	// function FN(args, callback) {
	//}

	// http_client.inc
	function getXHTTPTransport() {
		var result = null;
		var actions = [
		 function() {return new XMLHttpRequest()},
		 function() {return new ActiveXObject('Msxml2.XMLHTTP')},
		 function() {return new ActiveXObject('Microsoft.XMLHTTP')}
	   ];
	   for(var i = 0; i < actions.length; i++)
		try {
			result = actions[i]();
			break;
		} catch (e) {}	   
	   return result;
	};
		
	// async
	function new_HttpClient(args, callbackErrResult) {
		var loggerSend = args.loggerSend;
		var loggerRecv = args.loggerRecv;
		if(_.isIEOlderThan(7)) {	
			//return new MockHttpClient(loggerSend, loggerRecv);
			//callbackErrResult(null, new MockHttpClient(loggerSend, loggerRecv));
			
			//callbackErrResult('new_HttpClient: IE <= 7 not supported!');			
			//return;
			
			requirejs(['CookieFX'],function(_COOKIE) {
				callbackErrResult(null, new MockHttpClient(loggerSend, loggerRecv, _COOKIE));
			});			
			
		}
		else 
			requirejs(['jquery'],function($) {
				callbackErrResult(null, new JQueryHttpClient(loggerSend, loggerRecv, $));
			});
	}
	
	var _HttpClient = {
		// logger functions
		logSend: function (txtLine, label) {
			if(this.loggerSend)
				this.loggerSend.writeLine((label||'HttpClient: ')+txtLine);
		},
		logRecv: function (txtLine, label) {
			if(this.loggerRecv)
				this.loggerRecv.writeLine((label||'HttpClient: ')+txtLine);		
		},
		// public async functions: function(args, callbackErrResult) 
		postData: function(args, callbackErrResult) {
			//debugger;
			var url = args.url;
			var postedData = args.postedData;
			var dataFormat = args.dataFormat;

			dataFormat=dataFormat || "FORM";
			var contentType = LARR_CONTENTTYPES[dataFormat];
			var dataType, data;
			switch(dataFormat) {
				case 'JSON':
					dataType = 'json';
					data = JSON.stringify(postedData);
					break;
				case 'TEXT':
				    dataType = 'text';
				    data = postedData;
				    break;
				    	
				case 'FORM':
					debugger;
					alert('HttpClient: dataFormat not implemented: '+dataFormat);
					dataType = 'html';
					data = postedData;
					break;

				    
				default:
					alert('HttpClient: unknown dataFormat: '+dataFormat);
					debugger;
			}			
			if(contentType && dataType)
				return this.ajax_exec(url, contentType, dataType, data, 'POST', args.optHeaders, callbackErrResult);
			else				
				return callbackErrResult('HttpClient: invalid contentType or dataType');
		},
		getData: function(args, callbackErrResult) {
			return this.ajax_exec(args.url, false, 'JSON', '', 'GET', args.headers, callbackErrResult);
		},
		getTextData:  function(args, callbackErrResult) {
		    // debugger;
		    return this.ajax_exec(args.url, false, 'TEXT', '', 'GET', args.headers, callbackErrResult);
		},		
		// SESSION-enabled JSON requests
		authJSON: function(args, callbackErrResult) {
			debugger;
			var optCookie = args.optCookie;
			if(args.sessionToken) {
			    optCookie = optCookie||{};
			    optCookie.JSESSIONID = args.sessionToken;
				optCookie['Auth-Token'] = args.sessionToken;
			}
			return this.ajax_exec_cookie(args.url, L_JSON_CONTENT_TYPE, 'json', args.postedData!=null?JSON.stringify(args.postedData):null, args.method, args.optHeaders, optCookie, callbackErrResult);
		},
		// SESSIONless Bearer Token protected requests
		// original PHP function: _authBearerTokenData
		// A.B.!! NOTE: this method fixes bug in PHP version: public function _authBearerTokenData(callbackErrResult, method, url, postedData, accessT
		// 1) added accessTokenType parameter, 2) Authorization header is set here
		// So wrapper 'function _httpClient_JSON_token' in 'OAuthProviderREST.inc.php' is not really needed, as headers are set here
		_authTokenData: function(args, callbackErrResult) { //TODO: add arg validation
			//debugger;
			//debugger;
		    if(!args.access_token || !args.access_token_type)
		        return callbackErrResult('_authTokenData needs valid access_token!');		
			var headers=args.optHeaders||{}, cookie=args.optCookie; //||{};
			headers['Authorization'] = [args.access_token_type+' '+args.access_token];
			return this.ajax_exec_cookie(args.url, false, '', '', args.method, headers, cookie, callbackErrResult);
		}
		// TODO: implement these:
		// function ajax_exec(url, contentType, dataType, data, method, headers, callbackErrResult);
		// function ajax_exec_cookie(url, contentType, dataType, data, method, headers, cookie, callbackErrResult);
		
	};
	
	/*
		 var objHTTP, strResult;
		  objHTTP = new ActiveXObject('Microsoft.XMLHTTP');
		  objHTTP.open('POST',"OtherPage.asp",false);
		  objHTTP.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		  objHTTP.send("id=1&user="+txtUser.value+"&password="+txtPassword.value);
		  strResult=objHTTP.responseText;
	*/
	var _MockHttpClient = {
		ajax_exec: function (url, contentType, dataType, data, method, headers, callbackErrResult) {
			this.ajax_exec_cookie(url, contentType, dataType, data, method, headers, null, callbackErrResult);
		},
		ajax_exec_cookie: function (url, contentType, dataType, data, method, headers, cookie, callbackErrResult) {
			var objHTTP = getXHTTPTransport();
			objHTTP.open(method, url);
			if(cookie) {
			    debugger;
				// this value is ignored, but the step is necessary; 
				// SEE mk:@MSITStore:C:\Program%20Files\Microsoft%20Visual%20Studio\MSDN\2001JUL\1033\kbie.chm::/Source/ie_dev/q234486.htm
				objHTTP.setRequestHeader("Cookie", "any non-empty string here");
				// set all cookies here				
				objHTTP.setRequestHeader("Cookie", _COOKIE.encodeCookieString(cookie));
			}
			
			if(headers)	_.each(headers, function(value, name) {
			    objHTTP.setRequestHeader(name, value);
			});			
			objHTTP.setRequestHeader('Content-Type', L_JSON_CONTENT_TYPE);
			
			
			try {
			    objHTTP.send(data);
			} catch(x) {
			    debugger;
			    return callbackErrResult('ajax_exec_cookie: objHTTP.send: '+x.description);
			}
			var logRecv=this.logRecv;
			var timerIdCheckHTTPResult = null;
			
			function parseJBOSS_ERROR(result, errInfo) {
			    debugger;
                if(_.strStartsWith(result, '<html><head><title>JBoss Web/7.0.17.Final - Error report</title><style>')) {
                    var t1='from fulfilling this request.</u></p>';
                    var p1=result.indexOf(t1)+t1.length;
                    var p2=result.indexOf('\n');
                    errInfo.data = result.substr(p1,p2);
                    return true;
                }
                return false;	    
			}
			
			function checkHTTPResult() {
			    clearTimeout(timerIdCheckHTTPResult);
			    
			    var status = null;
			    try {
			        status = objHTTP.status;
			    } catch(x) {
			        //debugger;
			        logRecv('checkHTTPResult: failure: '+x.description);
			    }

                switch(status) {
                    case null:
                        timerIdCheckHTTPResult = setTimeout(checkHTTPResult, 500);
                        break;
                    case 1223:  // IE variant of 204
	                    return callbackErrResult(null,{data: null, status: 204});
	                case 12007:
	                    return callbackErrResult('Server address not resolved: '+url);
	                case 200:
	                    var result = objHTTP.responseText;
	                    logRecv(result);
	                    //debugger;
	                    switch(dataType) {
                            case 'json':
	                            var jsonResult = null;
	                            try {
	                                 jsonResult = JSON.parse(result);
	                            } catch(x) {
	                                debugger;
	                                var jbossErrInfo={};
	                                if(parseJBOSS_ERROR(result, jbossErrInfo))
	                                    return callbackErrResult('JBOSS_ERROR: '+errInfo.data);
	                            }
	                            if(jsonResult)
		                            return callbackErrResult(null,{data: jsonResult});
	                            else
		                            return callbackErrResult('UNHANDLED ERROR '+status+' '+method+' '+url+': '+result);        						    				    

                            case 'TEXT': default:
                                //debugger;
                                return callbackErrResult(null, result);
                                break; 
                          } // switch(dataType) 
                          break;
                    default:    				            				        
	                        debugger;
	                        return callbackErrResult('UNKNOWN STATUS '+status+' while '+method+' '+url);
	                        // callbackErrResult(status+': '+result);
                } // switch(status)
			} // closure function checkHTTPResult()
			
			timerIdCheckHTTPResult = setTimeout(checkHTTPResult, 500);			
		}
	}
	
	function MockHttpClient(loggerSend, loggerRecv, _COOKIE) {
		this.loggerSend = loggerSend;
		this.loggerRecv = loggerRecv;
		this._COOKIE = _COOKIE;
		//this.transport = ActiveXObject('Microsoft.XMLHTTP');
	}

	var _JQueryHttpClient = {
		// internal functionality
		ajax_args: function (contentType, dataType, data, method, headers, callbackErrResult) {
			return {
				contentType: contentType,
				dataType: dataType,	data: data,
				headers: headers || {},
				method: method, type: method, 
				success: _.partial(this.ajax_exec_success, callbackErrResult),
				error: _.partial(this.ajax_exec_error, callbackErrResult)
			}
		},		
		// this is just a wrapper (not async fn), so non-ARG-CB header
		ajax_exec: function (url, contentType, dataType, data, method, headers, callbackErrResult) {
			return this.$.ajax(url, this.ajax_args(contentType, dataType, data, method, headers, callbackErrResult));
		},		
		ajax_exec_cookie: function (url, contentType, dataType, data, method, headers, cookie, callbackErrResult) {
			if (cookie) {
				debugger;
				if(_.isObject(cookie))
					_COOKIE.setCookie(cookie);
				else
					document.cookie = ''+cookie;
				var aa =_.extend(this.ajax_args(contentType, dataType, data, method, headers, callbackErrResult), {
					crossDomain: true,
					xhrFields: {
					 withCredentials: true
				    }				 
				 });				
				return this.$.ajax(url, aa);
			} else {
				this.ajax_exec(url, contentType, dataType, data, method, headers, callbackErrResult);
			}			
		}		
	}
	
	// sync
	function JQueryHttpClient(loggerSend, loggerRecv, $) {
		function logRecv(t) {
			JQueryHttpClient.prototype.logRecv(t, 'JQueryHttpClient: ');
		}
		// these are wrappers for JQuery result event
		this.ajax_exec_success = function (callbackErrResult, data, textStatus, jqXHR) {
			//debugger;
			logRecv(textStatus+": "+jqXHR.status);	
			callbackErrResult(null, {data: data, textStatus: textStatus, jqXHR: jqXHR });
		},
		this.ajax_exec_error = function (callbackErrResult, jqXHR, textStatus, errorThrown) {
			//debugger;
			logRecv(textStatus+": "+jqXHR.status);	
			callbackErrResult({jqXHR: jqXHR, textStatus: textStatus, 
				errorThrown: errorThrown, toString: function(){ 'HttpClient failure. Use jqXHR & textStatus!' }});
		},	
		this.loggerSend = loggerSend;
		this.loggerRecv = loggerRecv;
		this.$ = $;
	}	  
	
	_.extend(JQueryHttpClient.prototype, _HttpClient);
	_.extend(JQueryHttpClient.prototype, _JQueryHttpClient);
	
	_.extend(MockHttpClient.prototype, _HttpClient);
	_.extend(MockHttpClient.prototype, _MockHttpClient);
	
	
  return { version: _ver,
	new_HttpClient: new_HttpClient  
  };
});