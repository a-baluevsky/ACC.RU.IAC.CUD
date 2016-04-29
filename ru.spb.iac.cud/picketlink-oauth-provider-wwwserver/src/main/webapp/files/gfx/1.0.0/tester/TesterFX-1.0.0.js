define(['underscore_plus'], function (_) {
    function Tester_InitPrototype() { 
		function outputTestList(lstTests) {
			_.forEach(this.g_lstTests, function(test, idxTest) {
				var opt = new Option();
				opt.text = test.name;
				opt.value = idxTest;
				lstTests.add(opt); 
			});
		};
		function readScriptTests(testSetId) {
			var rxTestFns = /function\s+(test\w+)/g; //new RegExp("");
			rxTestFns.global = true;
			var lstTests = new Array();
			var jsTestsSrc = document.scripts[testSetId].innerHTML;
			var rs = rxTestFns.exec(jsTestsSrc);
			while (rs != null) {
				var fnName = rs[1];
				var fnObj = eval(fnName);			
				lstTests.push({name: fnName.substring(4), exec: fnObj});			
				rs = rxTestFns.exec(jsTestsSrc);
			}		
			return lstTests;
		}
		function getCurTest(lstTests) {
			var selTestId = lstTests.value;
			if(selTestId.length>0)
				return this.g_lstTests[parseInt(selTestId)];
			return null;
		}
		function runSelTest(lstTests) {
			var selTest = this.getCurTest(lstTests);
			if(selTest)
				selTest.exec();
		}
		function appendTests(newTests) {
			this.g_lstTests = this.g_lstTests.concat(newTests);
		}
		//Tester.prototype = Tester_InitPrototype; //not working
		Tester.prototype = {
			outputTestList: outputTestList,		
			readScriptTests: readScriptTests,
			getCurTest: getCurTest,
			runSelTest: runSelTest,
			appendTests: appendTests
		};
    };
    function Tester(options) {
		this.g_lstTests = [];
		var opts = options || {};
		if(opts.testSetId) {
			jsTestSet = opts.testSetId;
			this.appendTests(this.readScriptTests(jsTestSet));
		}
	}	
	Tester_InitPrototype();
	
	function createrTesterPanel(targetElement) {
		targetElement.innerHTML = 
		'<table width="100%" height="220" border="0" cellpadding="4" cellspacing="0">'+
		'<tr valign="top" bgcolor="#cccccc">'+
		'	<td height="200" width="30%">'+
		'      <P align=right>Tests <INPUT language=javascript id=btnRun onclick="return btnRun_onclick()" '+
		'		type=button value=Run name=btnRun><SELECT id=lstTestsGFX style="WIDTH: 100%" '+
		'		size=12 name=lstTestsGFX></SELECT></P>'+
		'	</td>'+
		'	<td height="200" width="70%">'+
		'		  <P align=right>Output <INPUT language=javascript '+
		'		  id=btnClearTestOutputGFX onclick="return btnClearTestOutputGFX_onclick()" type=button '+
		'		  value=Clear name=btnClearTestOutputGFX><SELECT id=lstTestOutputGFX style="WIDTH: 100%" size=12 '+
		'		  name=lstTestOutputGFX LANGUAGE=javascript onclick="return lstTestOutputGFX_onclick()"></SELECT>'+
		'		  <DIV id=dvActiveLogline>&nbsp;</DIV></P>	'+
		'	</td>'+
		'</tr>	  '+
		'</table>';	
	}
	function createTesterWorkbench(targetElement) {
		targetElement.innerHTML = 
		'<table width="100%" height="100%" border="0" cellpadding="4" cellspacing="0">'+
		'  <tr bgcolor="#1010af"> '+
		'    <td height="20" colspan="3"><font color="#ffffff">GaliaJSFX OAUTH PROVIDER:'+
		'      <select id="cboAuthProviderAddr" name="select" style="width: 160px" onchange="return cboAuthProviderAddr_onchange()">'+
		'        <option value="paaa1.test.toris.vpn">paaa1.test.toris.vpn</option>'+
		'        <option value="paaa2.test.toris.vpn">paaa2.test.toris.vpn</option>'+
		'        <option value="cuddevelop1:8080" selected="selected">cuddevelop1:8080</option>'+
		'      </select><div id="spnAuthProviderAddrURL"></div>'+
		'      </font></td>'+
		'  </tr>'+
		'  <tr valign="top" bgcolor="#cccccc"> '+
		'    <td height="200">'+
		'      <P align=right>Tests <INPUT language=javascript id=btnRun onclick="return btnRun_onclick()" type=button value=Run name=btnRun><SELECT id=lstTestsGFX style="WIDTH: 100%" '+
		'      size=12 name=lstTestsGFX></SELECT></P>'+
		'      </td>'+
		'    <td height="200">'+
		'      <P align=right>Sent <INPUT language=javascript id=btnClearOutGFX onclick="return btnClearOutGFX_onclick()" type=button value=Clear name=btnClearOutGFX><SELECT id=lstOutGFX style="WIDTH: 100%" '+
		'      size=12 name=lstOutGFX></SELECT></P>'+
		'      </td>'+
		'    <td height="200">'+
		'      <P align=right>Received<INPUT language=javascript id=btnClearInGFX onclick="return btnClearInGFX_onclick()" type=button value=Clear name=btnClearInGFX><SELECT id=lstInGFX '+
		'      style="WIDTH: 100%" size=12 name=lstInGFX></SELECT></P></td>'+
		'  </tr>'+
		'  <tr>'+
		'	 <td height="40" width=320 style="WIDTH: 320px"><DIV id=testUI>'+
		'	</DIV>'+
		'	</td> '+
		'	 <td><FONT color=white>B</FONT></td> 	 '+
		'	 <td><FONT color=white>C</FONT></td>'+
		'    <td></td>'+
		'  <tr valign="top" bgcolor="#cccccc"> '+
		'	 <td height="100%" colspan="3">'+
		'      <P align=right>Output <INPUT language=javascript '+
		'      id=btnClearTestOutputGFX onclick="return btnClearTestOutputGFX_onclick()" type=button '+
		'      value=Clear name=btnClearTestOutputGFX><SELECT id=lstTestOutputGFX style="WIDTH: 100%" size=12 '+
		'      name=lstTestOutputGFX LANGUAGE=javascript onclick="return lstTestOutputGFX_onclick()"></SELECT>'+
		'      <DIV id=dvActiveLogline>&nbsp;</DIV></P>'+
		'      <P>'+
		'      <DIV id=divFrameGFX><IFRAME id=frmGFX width="100%" height="600"></IFRAME></DIV>'+
		'      </P>'+
		'	  </td>	'+
		'  </tr>'+
		'</table>'	
	}
	
  return {newTester: function(options){ return new Tester(options);}, 
	createTesterWorkbench: createTesterWorkbench,
	createrTesterPanel: createrTesterPanel
  };
});

// Common UI event handlers clientEventHandlersJS
// TODO: move into define section, generalize code, get rid of hard-coded element names
	
	function lstTestOutputGFX_onclick() {
		var selIndx = lstTestOutputGFX.selectedIndex;
		if(selIndx>=0) {
			var selItem = lstTestOutputGFX.item(selIndx);
			dvActiveLogline.innerText = selItem.innerText;
		}
	}
	function btnRun_onclick() {
		testerGFX.runSelTest(lstTestsGFX);
	}		
	function btnClearTestOutputGFX_onclick() {
		dvActiveLogline.innerText = '';
		lgrGFXTest.clear();
	}
	function btnClearInGFX_onclick() {
		lgrGFXIn.clear();	
	}
	function btnClearOutGFX_onclick() {
		lgrGFXTest.clear();
	}
	
	// extended tester panel fn
	
