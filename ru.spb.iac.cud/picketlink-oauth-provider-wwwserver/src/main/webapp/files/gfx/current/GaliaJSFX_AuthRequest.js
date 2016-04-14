// high-level Authorization Request
define(['underscore_plus', 'GaliaJSFX_OAuthProviderREST'], function (_, _OAuthProviderREST) {
	
	var _ver = 'GaliaJSFX_AuthRequest-1.0.0';
	function isRelativeUrl(url) {
	    return !_.strStartsWith(url, 'http://') && !_.strStartsWith(url, 'https://');
	}
	
	
	// http://cuddevelop1:8080/picketlink-oauth-provider-wwwserver/auth/login?client_id=SampleApp&client_name=SampleApp&redirect_uri=http%3A%2F%2Flocalhost%2Fpaaa_oauth%2Fauthorization_code_flow%2FauthCallback.php&response_type=code&scope=openid+profile&state=123&framed
	function getAuthCodeUrl(args) {
		//debugger;		
		var clientApp   = _.ensure(_.chkNotEmpty, "getAuthCodeLink: clientApp MUST be specified", args.clientApp);
		var oapr 	    = _.ensure(_.chkNotEmpty, "getAuthCodeLink: clientApp HAS NO OAuthProviderREST", clientApp.m_OAuthProviderREST);
		var scope       = args.scope || "openid profile";
		var state       = args.state || clientApp.state || 19841219; //_.random(100, 999); // TODO: calculate state a hash of passed params
		
		//, "response_type", "scope", "state"
		var aGetParams = _.pick(clientApp, "client_id", "client_name", "redirect_uri");
		if(isRelativeUrl(aGetParams.redirect_uri)) {
		    //debugger;	
		    var srcHost = window.location.host || 'localhost';
		    if(isRelativeUrl(srcHost))
		        srcHost = 'http://'+srcHost;
		    aGetParams.redirect_uri = _.strUrlCombine(srcHost, aGetParams.redirect_uri);
		    
		}
		aGetParams = _.extend(aGetParams, {response_type:"code", scope:"openid profile", state:state});
		var sLnkParams = _.strConstructParamsGET(aGetParams);
		return _.strUrlCombine(oapr.providerUrl, oapr.EndpointsREST.Login) +'?'+ sLnkParams;
	}
	
	function getAuthCodeLink(args) {
		var clientApp   = _.ensure(_.chkNotEmpty, "getAuthCodeLink: clientApp MUST be specified", args.clientApp);
		var linkText    = args.linkText || clientApp.client_name;
		return linkText.link(getAuthCodeUrl(args));
	}
	
	// fill arrParams (filter known params) and return count of params returned, fill error info, if param validation failed, or error condition occurred
	function fillAuthCodeParams(arrParams, errInfo, url) {
		arrParams = arrParams || {};
		errInfo = errInfo || {};
		var params = _.strParseParamsGET(url);
		errInfo.cntParams = 0;
		//_.forI(params, function (value, name)	
		for(var name in params) {
			var value = params[name];
			switch(name) {
				case 'client_id': case 'code':
					try {
						arrParams[name] = _.ensure(_.chkNotEmpty, name+" can't be empty", value);
						++errInfo.cntParams;
					} catch(x) {
						errInfo.error = x;
						return 0;
					}
					break;
				case 'client_name': case 'redirect_uri': case 'state': case 'scope': case 'response_type': 
					arrParams[name] = value;
					++errInfo.cntParams;
					break;
				
				case 'deny':
					errInfo.error = 'App access denied!';
					errInfo.error_description = 'User declined app access. '+value;
					++errInfo.cntParams;
					return 0;
					break;
				
				case 'error':
					if(value) {
						errInfo.error = value;
					}
					break;
				case 'error_description':
					if(value) {
						errInfo.error_description = value;						
					}
					break;
			}
		};
		
		if(arrParams.client_id && arrParams.code)
			return errInfo.cntParams;
		else {
			errInfo.error = errInfo.error || 'Missing one of required parameters: client_id, code!';
			return 0;
		}
	}
	
	// authorize clientApp by authorization code; return 
	//function clientAppAuthorizeCode(args) {	}
	function clientAppAuthorizeCode(args, callbackErrResult) {	
		//debugger;
		var client_id = args.client_id;
		var code = args.code;
		
		//var clientApp = 
	
	}
	
	
	return {
		version: _ver,
		getAuthCodeLink: getAuthCodeLink,
		getAuthCodeUrl: getAuthCodeUrl,
		fillAuthCodeParams: fillAuthCodeParams
	};
});