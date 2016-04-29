 // custom extender for Underscore
define(['underscore'], function (_) {

 // almost same as _.each = _.forEach
 // but: custom indexer
  _.forI = function(collection, action, indexer) {
	var idx = indexer || ("item" in collection)? // has overriden indexer?
		function(index) {
			return collection.item(i);
		}			
		:function(index) { // use default indexer!
			return collection[index];
		};
	debugger;
	for(var i=0;i<collection.length;++i) {
		var returnData = action(idx(i), i);
		if(!!returnData)
			return returnData; //returnData.returnValue
	}
  };
  
	_.isIE_ = function () {
		var retVal = (("Microsoft Internet Explorer" == navigator.appName) || // IE < 11
			navigator.userAgent.match(/Trident\/./i)); // IE 11
		return retVal;
	};
  
  _.isIE = function (baseVersion) {
		if(navigator.appName=="Microsoft Internet Explorer") { // IE < 11
			var re = new RegExp("");
			re = /MSIE ((\d+)(\.(\d+))?)/i;
			var a = re.exec(navigator.appVersion);
			var curVer = a? parseFloat(a[1]): null;
			return (curVer && baseVersion)?  curVer >= baseVersion: curVer;
		} else if(navigator.userAgent.match(/Trident\/./i)) // IE 11
			return 11;
		else			
			return 0;
	};
  _.isIEOlderThan = function (baseVersion) {
		if(navigator.appName=="Microsoft Internet Explorer") {
			var re = new RegExp("");
			re = /MSIE ((\d+)(\.(\d+))?)/i;
			var a = re.exec(navigator.appVersion);
			var curVer = a? parseFloat(a[1]): null;
			//alert(curVer);
			return (curVer && baseVersion)?  curVer < baseVersion: true;
		} else if(navigator.userAgent.match(/Trident\/./i)) // IE 11
			return 11<baseVersion;
		else
			return 0;
	};


    // valid: _.join('->', 1, 2, [3, 4, 5], 6);
    // invalid: _.join('->', 1, 2, [4, [5, 5, 5], 6], 3)
	_.join = function(separator) { // TODO: handle inline arrays recursively CORRECTLY
		/*
		var i=0; //_.rest(arguments)
		var _joinArr = _.reduce(list, function (a, v) {
				if (_.isArray(v))
					arr[i++] = _.reduce(v, 
			}, new Array(arguments.length-1));
		*/
		var arr = new Array(arguments.length-1);
		//var joinFn = _.partial(_.join, separator);
		var i=0;
		_.each(_.rest(arguments), function (v) {
			if (_.isArray(v))
				arr[i++] = v.join(separator); // joinFn.apply(v);
			else
				arr[i++] = ''+v;
		});
	    return arr.join(separator);
	    
	}
	
	_.strListAppend = function (separator, lst, nxtPart) {
		separator = separator || '/';
		var b1 = _.strEndsWith(lst, separator), b2 = _.strStartsWith(nxtPart, separator);
		if(b1 != b2)
			return lst+nxtPart;
		else if(b1)
			return lst+nxtPart.substr(1);
		else
			return lst+separator+nxtPart;
	}
	
	_.reduceArgs = function() { //function(f, arg1, arg2, .., argN)
		return _.reduce(_.rest(arguments, 2), arguments[0], arguments[1]);
	}
	
	// test: _.strUrlCombine('', '/1', '2/', '3', '/4/', '/5/'); //=> /1/2/3/4/5/
	_.strUrlCombine = _.partial(_.reduceArgs, _.partial(_.strListAppend, '/'));
	_.strPathCombine = _.partial(_.reduceArgs, _.partial(_.strListAppend, '\\'));
	
	_.strStartsWith = function (source, chk, ignoreCase) {
		if(ignoreCase) {
			source = source.toUpperCase();
			chk = chk.toUpperCase();
		}
		try {
			return source.substr(0, chk.length)==chk;
		} catch(x) {
			return false;
		}
	};	
	_.strEndsWith = function (source, chk, ignoreCase) {
		if(ignoreCase) {
			source = source.toUpperCase();
			chk = chk.toUpperCase();
		}
		try {
			return source.substr(source.length-chk.length)==chk;
		} catch(x) {
			return false;
		}
	};
	
	_.strRTrim = function (s, t, eq) {
		eq = eq || function(a,b){ return a==b };
		var ls = s.length, lt = t.length, p=ls;
		while((p-=lt)>=0 && eq(s.substr(p,lt), t)) ls=p;
		return s.substr(0, ls);
	};
	_.strLTrim = function (s, t, eq) {
		eq = eq || function(a,b){ return a==b };
		var ls = s.length, lt = t.length, p=0;
		while((ls-p)>=lt && eq(s.substr(p,lt), t)) p+=lt;
		return s.substr(p);
	};
	_.strTrim = function (s, t) {
		return _.strRTrim(_.strLTrim(s,t));
	};	
	
	_.strContains = function(string, charSeq) 	{	return string.indexOf(charSeq) > -1; };
	_.strContainsIC = function(string, charSeq) {	return _.strContains(string.toLowerCase(), charSeq.toLowerCase()); };	
	
	_.strPadLen = function(padStr, defaultLength) {
		return 	_.isString(padStr)? padStr.length:
				_.isNumber(padStr)? padStr:
				defaultLength || 0;
	}
	_.strPadCut = function (val, padStr) {
		var k = _.strPadLen(padStr, -1);
		if(k>-1 && k<val.length) {
			val = val.slice(0, k).concat('...');
		}
		return val;
	};
	_.strPadWithoutEnd = function(string, padStr) {
		var padLen = _.strPadLen(padStr);
		return _.isString(string) && padLen? string.slice(0, string.length-padLen): string;
	};
	_.strPadWithoutStart = function(string, padStr) {
		var padLen = _.strPadLen(padStr);
		return _.isString(string) && padLen? string.substr(padLen, string.length-padLen): string;
	};
	
	// higher-order function
	_.ensure = function (predicate, error, value) {
		if (predicate(value)) {
			return value;
		}
		else {
			throw error;
		}
	}
	
	_.chkNotEmpty = function (value) {
		return value?true:false;
	}
	
	
	// URL: http://www.example.com/test.php?abc=123&def&xyz=&something%20else
	_.strParseParamsGET = function(url) {
		var _get = {};
		var re = /[?&]([^=&]+)(=?)([^&]*)/g;
		var url = url || location.search
		while (m = re.exec(url))
			_get[decodeURIComponent(m[1])] = (m[2] == '=' ? decodeURIComponent(m[3].replace(/\+/g, ' ')) : true);
		return _get;
	};
	
	_.strConstructParamsGET = function (params) {
		var sParams = _.reduce(params, function(sParams, value, name) {
			var sv = _.reduce((''+value).split(' '), function(aVal, uc) {
				aVal.push(encodeURIComponent(uc));
				return aVal;
			 }, []).join('+');
			var sp = encodeURIComponent(name)+'='+sv; //;.replace(/ /g, '+')
			return sParams+'&'+sp;
		}, '');
		return sParams.slice(1);
	};
	
  return _;
});



