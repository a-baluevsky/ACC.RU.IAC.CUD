

 function getCookieVal2 (offset) {
	     var endstr = document.cookie.indexOf (";", offset);
	     if (endstr == -1) 
	        endstr = document.cookie.length;
	     return unescape(document.cookie.substring(offset, endstr));
	  };
   function GetCookie2 (name) {
      var arg = name + "=";
      var alen = arg.length;
      var clen = document.cookie.length;
      var i = 0;
       while (i < clen) {
              var j = i + alen;
                  if (document.cookie.substring(i, j) == arg)
                      return getCookieVal2 (j);
              i = document.cookie.indexOf(" ", i) + 1;
                      if (i == 0)
                              break;
              }
    return null;
  }
;
   function getRemember (type) {
	   //'cudRememberPass'
	   //'cudRememberCert'
	    var rememberCoockie = GetCookie2(type);
	  
	    if (rememberCoockie == 'true') {
	        return true;
	    } else if (rememberCoockie == 'false') {
	    	return false;
	    } else {
	    	 return true;
	    }
	  };
   
   function setRemember () {
   var rememberValue=getRemember();
 
   
   if(rememberValue) {
       document.getElementById('remember').setAttribute('checked', true);
   }else{
	   document.getElementById('remember').removeAttribute('checked');
   }
   
   };
   
   function goAuth(type,path) {
	   //cudRememberPass
	   //cudRememberCert
	   if(document.getElementById('remember').checked){
		   document.cookie=type+'=true; path='+path+'; expires='+(new Date ( 2018, 01, 23 )).toGMTString(); 
	   }else{
		   document.cookie=type+'=false; path='+path+'; expires='+(new Date ( 2018, 01, 23 )).toGMTString();
	   }
	 
	};
   