define(['underscore_plus'], function (_) {
		function Logger_InitPrototype() { 
			function writeLine(line) {
				write(line);				
			}
			function write(line) {
				alert(line);
			}		
			function wrapObj(t) {
				return t;
			}
			function wrapProp(t) {
				return ", "+t;
			}
			function wrapEtc(t) {
				return t;
			}
			
			function jsValStr(o, msg) {
				var s=msg || "...";				
				if(_.isObject(o)) {
					var so="";
					for(var i in o)
					{	var v = o[i];
						var vi = jsValStr(v, i+": ");
						so+=wrapProp((vi.length<4096?vi:"..."));
						if(so.length>4096) {
							so+= wrapEtc(" ... ");
							break;
						}				
					}										
					s+=wrapObj("object {"+so+"}");
				}
				else
					s += o;				
				return s;
			}
			function jsArrStr(a, msg) {
				var s=msg || "...";	
				var sa = "";
				_.forI(a, function(item, i) {
					if(s.length>4096) {
						s+=wrapEtc(" ... ");
						return true;
					}
					s+=wrapProp(jsValStr(item, i+": "));				
				});
				s+=wrapObj(" Array ["+sa+"]");
				return s;	
			}
			function printObject(a, msg) {
				this.writeLine(jsValStr(a, msg));
			}			
			function printArray(a, msg) {				
				this.writeLine(jsArrStr(a, msg));
			}
			function clear() {				
			}			
			Logger.prototype = {
				writeLine: writeLine,
				write: write,
				printObject: printObject,
				jsValStr: jsValStr,
				printArray: printArray,
				clear: 	clear,
				wrapObj: wrapObj, wrapProp: wrapProp, wrapEtc: wrapEtc
			}
		}
		
		function Logger() { 
		}
		Logger_InitPrototype();
		
		function HTMLLogger(elmOutput) {
			this.out = elmOutput;
		}		
		_.extend(HTMLLogger.prototype, Logger.prototype);
		with(HTMLLogger.prototype) {
			wrapObj = function (t) {
				return "<ul>"+t+"</ul>";
			};
			wrapProp = function (t) {
				return "<li>"+t+"</li>";
			};
			wrapEtc = function (t) {
				return t+"<br/>";
			};			
			writeLine = write = function(line) {
				this.out.innerHTML += "<br/>" + line;
			};
			clear = function() {
				this.out.innerHTML = "&nbsp;";
			}
		}
		
		function ListLogger(elmOutput) {
			this.out = elmOutput;
		}
		_.extend(ListLogger.prototype, Logger.prototype);
		with(ListLogger.prototype) {
			writeLine = write = function(line) {
				var opt = new Option();
				opt.text = line;				
				this.out.add(opt);
				opt.selected = true;
			}
			clear = function() {
				this.out.innerHTML = "";
			}
		}
		
  return {
	newLogger: function(options){ return new Logger(options); }, 
	newHTMLLogger: function(options){ return new HTMLLogger(options); },
	newListLogger: function(options){ return new ListLogger(options); }
  };
});