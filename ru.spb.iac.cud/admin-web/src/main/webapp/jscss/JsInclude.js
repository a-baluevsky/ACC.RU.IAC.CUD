	function JsInclude() {

	};
	
	// copy this line to the client app (e.g. JsInclude.Settings.js):
	//JsInclude({defaultJSDir:"/js/"});
	
	// Exceptions
	JsInclude.LibraryModuleMissingException =	function (source, moduleID) {
		this.source = source;
		this.moduleID = moduleID;
	};
	JsInclude.LibraryModuleMissingException.prototype.toString = function() {
		return this.source+": missing library module: "+this.moduleID
	};
	JsInclude.LibraryModuleRegisterException = function(source, moduleID, reason) {
		this.source = source;
		this.moduleID = moduleID;
		this.reason = reason;
	};
	JsInclude.LibraryModuleRegisterException.prototype.toString = function() {
		return this.source+": failed registering library module: "+this.moduleID+". Reason: "+this.reason;
	};
	JsInclude.LibraryModuleLoadFailException = function(source, moduleID, reason) {
		this.source = source;
		this.moduleID = moduleID;
		this.reason = reason;
	};
	JsInclude.LibraryModuleLoadFailException.prototype.toString = function() {
		return this.source+": failed loading library module: "+this.moduleID+". Reason: "+this.reason;
	};		
	// JS Facility
	JsInclude.LibraryModule = function(moduleID, srcPath, loaded) {
		this._JsInclude_moduleInfo = {
			id: moduleID, 
			src: srcPath || "",
			loaded: loaded || false
		};		
	};
	JsInclude.modules = [];
	
	$register = JsInclude.registerLibraryModule = function(moduleID, throwsException) {
		if(moduleID in JsInclude.modules) {
			var m=JsInclude.modules[moduleID];
			if(m._JsInclude_moduleInfo.loaded) {
				if(throwsException)
					throw new JsInclude.LibraryModuleRegisterException("$register", moduleID, "Already registered");
				else return null; 
			} else {
				m._JsInclude_moduleInfo.loaded = true;
				return m;				
			};
		}
		else {
			var newModule = new JsInclude.LibraryModule(moduleID, null, true);
			JsInclude.modules[moduleID]=newModule;
			return newModule;
		};
	};
	
	$include = JsInclude.includeLibraryModule =	function (namespaceString, jsSrcFile, moduleID) {
		if(!(moduleID in JsInclude.modules)) {
			var module = new JsInclude.LibraryModule(moduleID, jsSrcFile, false);
			JsInclude.modules[moduleID]=module;
			JsInclude.loadJScript(jsSrcFile, false);
			// ? TODO: verify if last loaded module id = moduleID
		};
		return JsInclude.getNSObject(namespaceString, moduleID, window);
	};

	$load = JsInclude.loadLibraryModule = function(moduleID, throwsException) {		
		var module;
		if(moduleID in JsInclude.modules) {
			module = JsInclude.modules[moduleID];
			if(!module._JsInclude_moduleInfo.loaded) {
				//debugger;
				var res = JsInclude.loadJScript(module._JsInclude_moduleInfo.src, true);
				if(!module._JsInclude_moduleInfo.loaded && throwsException)
					throw new JsInclude.LibraryModuleLoadFailException("$load", moduleID, res);
			}
		} else if(throwsException){
			throw new JsInclude.LibraryModuleMissingException("$load", moduleID);
		}		
		return module;
	}
	JsInclude.context=this;
	JsInclude.evalContext = function(code) {
		//debugger;
		(typeof execScript != 'undefined') ? execScript(code) : 
			(JsInclude.context.eval ? JsInclude.context.eval(code) : eval(code));	
	};
	JsInclude.getXHTTPTransport = function() {
		var result = null;
		var actions = [
	     function() {return new XMLHttpRequest()},
	     function() {return new ActiveXObject('Msxml2.XMLHTTP')},
	     function() {return new ActiveXObject('Microsoft.XMLHTTP')}
	   ];
	   for(var i = 0; i < actions.length; i++) {
	   	try{
	   		result = actions[i]();
	   		break;
	   	} catch (e) {}	
	   }
	   return result;
	};
	JsInclude.append = function(newResource) {
		var target=null;
		if(!(target=document.getElementsByTagName('head')[0]))
		target = document.createElement('head');		
		if(target) target.appendChild(newResource);
	}
	JsInclude.loadJScript = function (src, sync, methodType) {
		if(src && src.length>0) {
			sync = sync || false;
			methodType = methodType || 0; // auto
			if(methodType==0) // decide what's for auto
			{	methodType = (sync)?2:1;
			};
			switch(methodType) {			
				case 1: // <script>
					var newScr = document.createElement("script");										
					newScr.language="javascript";
					newScr.type="text/javascript";
					newScr.src=src;
					newScr.async = true; 
					JsInclude.append(newScr);
					break;			
				case 2: // XmlHttpRequest, etc
					var transport; // ? TODO: impl async ?
					if(transport = JsInclude.getXHTTPTransport()) {
						transport.open('GET', src, false);
						transport.send(null);
						JsInclude.evalContext(transport.responseText);
					} else return "JsInclude.loadScript: no transport!";
					break;
				default: //throw "JsInclude.loadScript: invalid methodType!";
					return "JsInclude.loadScript: invalid methodType!";
			};
		} else return "JsInclude.loadScript: src not specified!"; 
	};	
	
	// Namespace Facility
	JsInclude.NSObject = function(moduleID) {
		if(moduleID) this.id=moduleID;
	};
	JsInclude.NSObject.prototype.toString = function() {
		return this.id || "";
	}	
	JsInclude.getNSObject = function(nsPath, moduleID, context) {
		var obj=context;
		while((pos=nsPath.indexOf('.')) != -1) {			
			var name = nsPath.substring(0, pos);
			if(name.length>0)
				obj=(name in obj)?obj[name]:obj[name]=new JsInclude.NSObject();
			nsPath = nsPath.substring(pos + 1);			
		}
		obj=(nsPath in obj)?obj[nsPath]:obj[nsPath]=new JsInclude.NSObject(moduleID);
		return obj;
	};
	
	// CSS Facility
	JsInclude.loadCSS = function(cssUrl) {
		var cssObj = JsInclude.findCSS(cssUrl);
		if(cssObj)
			 return cssObj;
		else return JsInclude.attachCSS(cssUrl);
	}
	JsInclude.attachCSS = function(cssUrl) {
		var newCss = document.createElement("LINK");
		newCss.rel="stylesheet";
		newCss.type="text/css";
		newCss.href=cssUrl;
		JsInclude.append(newCss);
		return document.styleSheets[document.styleSheets.length-1];	
	}
	JsInclude.hasLoadedCSS = function(cssUrl) {
		return JsInclude.findCSS(cssUrl)!=null;
	}
	JsInclude.findCSS = function(cssUrl) {
		var ss=document.styleSheets;
		for(var i=0; i<ss.length; ++i) {
			if(ss[i].href.indexOf(cssUrl)>-1)
				return ss[i];
		}
		return null;	
	}
	
	// XML Facility
	JsInclude.attachXML = function(elmId, srcPath)  {
		var xData = document.createElement("XML");
		xData.id = elmId;
		xData.setAttribute("src", srcPath);
		JsInclude.append(xData);
	};

	// XML (data islands) manager tests	
	JsInclude.xml = function(xData) { // loadXML - xData: XMLDataIsland or URL
		var x, xSrc;
		var tData=typeof xData;
		switch(tData.toLowerCase()) {
			case "string": // URL to XML document
				xSrc = xData;
				var ua=window.clientInformation.userAgent.toLowerCase();
				if(ua.indexOf("msie")>=0) { // try to ask MSIE to load XML data island
					var dt=new Date(); var rnd=Math.round(Math.random()*1000);
					var sXmlId="xmlJsIncl"+dt.getMinutes()+dt.getSeconds()+dt.getMilliseconds()+rnd;
					xData = JsInclude.attachXML(sXmlId, xSrc);
					try {
						//TODO: use XML loader service page
						// xData = window.showModalDialog("pleaseWaitWhileLoadingXML")					
						var oPopup = window.createPopup();					
						var oPopBody = oPopup.document.body;
						oPopBody.innerHTML = "<DIV>Please wait while loading XML data...</DIV>"
						oPopup.show(15, 150, 50, 50, document.body);
						for(var i=0; i<100; ++i) {												
							if(xData.readyState == "complete")							
								break;
						}
						oPopup.hide();
					} catch(xcpt) {};
					if(x = xData.documentElement)
						return new JsInclude.xml.XmlElement(x);
				}	
				break;
			case "object": // XML data island?
				if(x = xData.documentElement)
					return new JsInclude.xml.XmlElement(x);
				else {
					var atrSrc=xData.attributes["src"];					
					xSrc=atrSrc.nodeValue?atrSrc.nodeValue:null;
				}
				
				break;
			case "undefined": 
				return;
			default:
				prompt("JsInclude.loadXML: typeof xData=", tData);
				return;
		};		
		if(x == undefined) // Only MSIE handles XML data islands; other browsers don't
		try //Firefox, Mozilla, Opera, etc.
		{
		    var xmlhttp = JsInclude.getXHTTPTransport(); //new XMLHttpRequest();
		    xmlhttp.open("GET", xSrc, false);
		    xmlhttp.setRequestHeader('Content-Type', 'text/xml');
		    xmlhttp.send("");
		    x = xmlhttp.responseXML.documentElement;
		} catch (e) {
		    alert(e.message)
		}
		if(x) x=new JsInclude.xml.XmlElement(x);
		return x;
	}
	
	// hi-level wrapper object for X-browser compatibility
	JsInclude.xml.XmlElement = function(xData) {
		//debugger;
		this.x = xData;
		//prompt("xData constructor: ", xData.constructor);
		if("selectSingleNode" in xData) { // MS XML			
			this.selectSingleNodeWithPropValue = function(nodeName, pName, pValue) {
				var x=this.x.selectSingleNode(nodeName+"[@"+pName+"='"+pValue+"']");
				return x?new JsInclude.xml.XmlElement(x):null; 
			};
			this.selectNodes = function(nodeName) {
				var x=this.x.selectNodes(nodeName);
				return x?JsInclude.xml.XmlNodes(x):null; 
			};
			this.selectSingleNode = function(nodeName) {
				var x=this.x.selectSingleNode(nodeName);
				return x?new JsInclude.xml.XmlElement(x):null; 
			};
		} else if("ownerDocument" in xData || "documentElement" in xData) { // Google Chrome
			if(JsInclude.xml.xpath==undefined) {
				// https://developer.mozilla.org/en-US/docs/Using_XPath
				// https://developer.mozilla.org/en-US/docs/Web/XPath
				// http://xmlhttprequest.ru/			
				JsInclude.xml.xpath=function(aNode, aExpr, count) {
					var xpe, nsResolver;
					if(XPathEvaluator) {
					  xpe = new XPathEvaluator();
					  nsResolver = xpe.createNSResolver(aNode.ownerDocument == null ?
						aNode.documentElement : aNode.ownerDocument.documentElement);					  
					}
					else { // XPathEvaluator is implemented on objects that implement Document
 					  xpe = aNode.ownerDocument || aNode;
 					  var nsResolver = xpe.createNSResolver(xpe.documentElement);
 					}
					var result = xpe.evaluate(aExpr, aNode, nsResolver, 0, null);
					var found = []; var res; 
					if(count && (res=result.iterateNext())) {
						found.push(res);
					} else 
					while (res = result.iterateNext())
						found.push(res);
					return found;
				};
			}
			this.selectSingleNodeWithPropValue = function(nodeName, pName, pValue) {
				var x=JsInclude.xml.xpath(this.x, nodeName+"[@"+pName+"='"+pValue+"']", 1);
				return(x.length==1)?new JsInclude.xml.XmlElement(x[0]):null;
			};
			this.selectNodes = function(nodeName) {
				var x=JsInclude.xml.xpath(this.x, nodeName);
				return x?JsInclude.xml.XmlNodes(x):null; 
			};
			this.selectSingleNode = function(nodeName) {
				var x=JsInclude.xml.xpath(this.x,nodeName,1);
				return (x.length==1)?new JsInclude.xml.XmlElement(x[0]):null; 
			};
		}
		this.getAttribute = function(aName) { return this.x.getAttribute(aName) };
		this.getNodeName = function(){ return this.x.nodeName };
		this.getText = function(){ return this.x.text 
			|| this.x.textContent || this.x.innerText };
	}
	
	JsInclude.xml.XmlNodes = function(xData) {
		var nodes=new Array();
		for(i=0; i<xData.length; ++i)
			nodes.push(new JsInclude.xml.XmlElement(xData[i]));
		nodes.constructor=JsInclude.xml.XmlNodes;
		return nodes;
	};	
	
