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

  return {newTester: function(options){ return new Tester(options); }};
});