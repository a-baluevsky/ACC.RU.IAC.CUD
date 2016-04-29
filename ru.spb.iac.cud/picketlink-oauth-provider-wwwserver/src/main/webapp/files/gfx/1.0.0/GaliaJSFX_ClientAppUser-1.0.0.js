define(['underscore_plus', 'GaliaJSFX_OAuthProviderREST'], function (_, OAuthProviderREST) {
	var _ver = 'GaliaJSFX_ClientAppUser-1.0.0';
	
	// ClientAppUser.inc.php
	// async
	function new_ClientAppUser(login, providerUrl, loggerTest, loggerSend, loggerRecv) {
		var oapr = OAuthProviderREST.new_OAuthProviderREST(providerUrl, loggerTest, loggerSend, loggerRecv);
		return new ClientAppUser(login, oapr, loggerTest);
	}
	
	// sync
	function ClientAppUser(login, OAuthProviderREST, loggerTest) {
		// inner (closure) functions
		function logTest(txtLine) {
			if(loggerTest)
				loggerTest.writeLine('ClientAppUser: '+txtLine);
		}
		// private functions
		this._refresh_logon_state = function(jsonUserInfoResult) {
		    if(jsonUserInfoResult) {
			    //debugger;
			    var body = jsonUserInfoResult.data;
			    var status = jsonUserInfoResult.status;
			    switch(status) {
				    case 200:
					    //if(_.isArray(body)) {
					     this.Login = body.userId;
					     this.IsLoggedIn = body.loggedIn? true:false;
						 
					     this.AuthToken = body.token;
					    //}					
					    break;
				    case 204:
					    this.IsLoggedIn = false;
					    this.AuthToken = null;
					    break;
			}}
			
			return status;
		}
		
		// public  functions
		this.Login = function(password, callbackErrResult) { // do not store password! use it and forget it
			//debugger;
			var _this=this;
			this.m_OAuthProviderREST.Login(function (err, result) {
				//debugger;
				if(err)
					callbackErrResult(err);
				else {
				    result.status = 200;
					_this._refresh_logon_state(result);
					if(_this.IsLoggedIn)
						callbackErrResult(null, _this.Login);
					else
						callbackErrResult('Error logging in!');
				}
			}, this.Login, password);
		}

		this.Logout = function(callbackErrResult) {
			//debugger;
			var _this=this;
			this.m_OAuthProviderREST.Logout(function (err, result) {
				//debugger;
				if(err)
					callbackErrResult(err);
				else {
				    _this._refresh_logon_state(result);
				    callbackErrResult(null, !_this.IsLoggedIn);
				}
			}, this.AuthToken);
		}
		

		this.getUserInfo = function(callbackErrResult) {
		    var _this=this;
		    var appRoles = {testSys: 'admin', cud: 'user'};
		    callbackErrResult(null, {appRoles: appRoles});
		}

		// access_token & refresh_token handling
		// this is specific for clientApp & user (different from clientApp's access_token & refresh_token
		this.refresh_token = null;
		this.access_token = null;
		this.refreshUserAccessToken = function (args, callbackErrResult) {
			debugger;	// TODO
		}			

		// init
		this.m_OAuthProviderREST = OAuthProviderREST;
		this.AuthToken;
		this.Login = login;
		this.UserInfo = [];
		this.FullName = '';
		this.Roles = [];
		logTest('ClientAppUser created: login='+login);

		
	}	
	
	
	
	return {
		version: _ver,
		new_ClientAppUser: new_ClientAppUser,
		ClientAppUser: ClientAppUser
	};
});