function Functional() { // 04.02.2014
	var fpr = Functional.prototype;
	if(typeof(fpr.fnCaller)=='undefined') {
		fpr.fnCaller = function fnCaller(fnId)
		{	var aCallerArgs = this.fnCaller.caller.arguments;
			var aFnParm = Functional.prototype.aFnCl[fnId]; // fixed parameters
			var cntParm = aFnParm.length-1;			
			var cntArgs = aCallerArgs.length;
			var args=new Array(cntParm+cntArgs);
			var j=0;
			var sCallCode = 'return f(';
			var aCallArgs = new Array();
			// omit zero arg: it's the function to call!
			for(var i=1; i<aFnParm.length; ++i) {
				aCallArgs.push('a['+j+']');
				args[j++] = aFnParm[i];
			}
			for(var i=0; i<aCallerArgs.length; ++i) {
				aCallArgs.push('a['+j+']');
				args[j++] = aCallerArgs[i];
			}
			sCallCode += aCallArgs;
			sCallCode += ');';	
			return (new Function('f','a',sCallCode))(aFnParm[0], args);			
		}	
	}
	if(typeof(fpr.aFnCl)=='undefined') {
		fpr.aFnCl = new Array();
	}
	var aFnCl = fpr.aFnCl;
	var k=aFnCl.length;
	aFnCl[k]=Functional.arguments;
	var newFn = new Function('return Functional.prototype.fnCaller('+k+')');
	
	if(this instanceof Functional)
	{ // Functional is called as .ctor using syntax:
	  // var fnl = new Functional(p, i);
		this.FunctionalId=k;
		this.call = newFn;
		this.vectOp   = Functional(function vectOp(f, v) {
									for(var i=0; i<v.length; ++i)
										v[i]=f(v[i]);
									return v;
								}, newFn);
		this.vectStat = Functional(function vectStat(f, s, v) {
									var r=s;
									for(var i=0; i<v.length; ++i)
										r=f(r, v[i]);
									return r;
								}, newFn);		
	} else
	{ // Functional is called simply as a function using syntax:
	  //	obj.onClick = Functional(onClickHandler, "RED", "BLUE");
	  newFn.FunctionalId=k;
	  return newFn;
	}	
}