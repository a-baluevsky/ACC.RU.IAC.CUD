define(['underscore_plus'], function (_) {
	function setCookie(arrCooks) {
		_.each(arrCooks, function(c_value, c_name) {
			//var newCk = c_name + "=" + escape(c_value);
			//logSend('SET-COOKIE: '+newCk);
			//document.cookie = newCk;
			createCookie(c_name, c_value);
		});			
	}
	
	// http://www.quirksmode.org/js/cookies.html
	
	function createCookie(name, value, days) {
	    var expires;
	    if (days) {
	        var date = new Date();
	        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
	        expires = "; expires=" + date.toGMTString();
	    } else {
	        expires = "";
	    }
	    document.cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value) + expires + "; path=/";
	}

	function readCookie(name) {
	    var nameEQ = encodeURIComponent(name) + "=";
	    var ca = document.cookie.split(';');
	    for (var i = 0; i < ca.length; i++) {
	        var c = ca[i];
	        while (c.charAt(0) === ' ') c = c.substring(1, c.length);
	        if (c.indexOf(nameEQ) === 0) return decodeURIComponent(c.substring(nameEQ.length, c.length));
	    }
	    return null;
	}

	function eraseCookie(name) {
		createCookie(name, "", -1);
	}	

	function encodeCookieString(dataObj) {
		//debugger;
		var d = [];
		_.each(dataObj, function(prp_value, prp_name) {
			d.push(prp_name+' = '+prp_value);
		});
		return d.join('; ');
	}

	
  return {
	createCookie: createCookie,
	setCookie: setCookie,
	readCookie: readCookie, 
    eraseCookie: eraseCookie,
	encodeCookieString: encodeCookieString
  };
});