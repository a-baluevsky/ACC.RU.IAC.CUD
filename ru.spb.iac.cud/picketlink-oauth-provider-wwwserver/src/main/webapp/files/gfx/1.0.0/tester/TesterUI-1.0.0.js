define(['underscore_plus'], function (_) {
	var _ver = 'TesterUI-1.0.0';
	
	// Since most/all methods are async, so DO use continuation-passing style (CPS) 
	// to mimic synchronous operations.
	// E.g. f.ok(e).ok(e).fail(e)
	
	
	//!!! TODO: move callbackErrResult to the first position for each function !!!
	
	// tester things
	function createUIParamTxt(parmId, parmTxt)  {
		var spnParam = document.createElement('DIV');
		spnParam.id = 'spnParam'+parmId;
		spnParam.innerHTML = parmTxt;
		var txtParam = document.createElement('INPUT');
		txtParam.id = 'txtParam'+parmId;
		txtParam.size = 60;
		spnParam.appendChild(txtParam);
		return spnParam;
	}	
	function test_UI() {
		function RunTest() {
			var userName = txtParamName.value;
			alert("Hello, "+userName+"!");
		}
		var btnUITestRunner = document.createElement('BUTTON');
		btnUITestRunner.value = btnUITestRunner.innerText = 'Run test';
		btnUITestRunner.onclick = RunTest;
		return [createUIParamTxt('Name', 'Your name: '), btnUITestRunner];		
	}
	
	// Dispatcher: hi-level wrapper for complext sequence processing
	
	// GaliaJSFX MODULE INDEX
	return {
		test_SayHello: test_SayHello, test_UI: test_UI, // tester things		
		
		/*
		// constructors
		, 
		new_ClientAppUser: new_ClientAppUser, 
		new_CTest2ClientApp: new_CTest2ClientApp, 
		// export original classes
		ClientAppUser: ClientAppUser, 
		CTest2ClientApp: CTest2ClientApp,		
		*/
		//
		//new_: new_, 
		//new_: new_, 

	};
	
	
});