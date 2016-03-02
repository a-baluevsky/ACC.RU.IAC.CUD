	function getToken() {
		try {
			return localStorage.getItem("AUTH_TOKEN");
		} catch (e) {
			alert('Your browser does not support HTML5 localStorage. Try upgrading.');
		}
	}

	function storeToken(token) {
		try {
			localStorage.setItem("AUTH_TOKEN", token);
		} catch (e) {
			alert('Your browser does not support HTML5 localStorage. Try upgrading.');
		}
	}
	$(document).ready(function() {
		if (!$('#login-btn')) {
			return;
		}		
		$('#login-btn').click(function() {
			var jqxhr = $.ajax(L_OAUTH_PROVIDER_ROOT+'/auth/login', {
				contentType: L_JSON_CONTENT_TYPE,
				dataType:'json',
				data:JSON.stringify({userId:$('#username').val(),password:$('#password').val()}),
				type:'POST', 
				success:function (data) {
					if (data.loggedIn) {
						storeToken(data.token);
						window.location = L_OAUTH_PROVIDER_ROOT+'/auth/scope'+window.location.search;
					} else {
						$('#login-msg').text(L_ERR_AUTHENTICATION_FAILED);
					}
				}
			});
			return false; // prevents submit of the form
		});		
		$("#username").keypress(function() { $('#login-msg').text(""); });
		$("#password").keypress(function() { $('#login-msg').text(""); });
		
	});

/*
function getHost() {
	var port = '8080';
	var hname = window.location.hostname;
	return 'http://' + hname + "/picketlink-oauth-provider/jsp";	
};
*/

