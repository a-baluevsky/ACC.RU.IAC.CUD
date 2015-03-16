if($register) {
var TextInputLib=$register("{5890CB2D-138F-45F2-B6A8-2E485AF83F43}");
if(TextInputLib) {
	TextInputLib.forwardDeclare = {toString: function(){return forwardDeclare}};
		TextInputLib.assertCheck = function(conditionString,message) {
			var assertValue=false;
			var msg = message?"\n"+message:"";
			try { assertValue=eval(conditionString); }			
			catch(x){ msg="\nFAILED EVALUATING CONDITION STRING ("+
				(x.message || x.toString())+")"+msg;}
			if(!assertValue) {
				if(confirm("Assertion failed: "+conditionString+msg));
					debugger;
			}
			return assertValue;
		};
		
	TextInputLib.TextSelection=function (TextControl) {
		this.input = TextControl;		
	};	
	with(TextInputLib.TextSelection) {
		prototype.deselect=prototype.resetTextSelection = function() {
			if ('selectionStart' in this.input) {
				if(this.input.selectionStart!=this.input.selectionEnd)
					this.input.selectionEnd = this.input.selectionStart;
			} else {
				var inputRange = this.input.createTextRange();
				inputRange.moveStart ("character", 0);
				inputRange.collapse ();		
			}
		}; // resetTextSelection
		prototype.getTextSelection = function() {
			var ss=0, sl=0, sv="";		
			if ('selectionStart' in this.input) {
				ss=this.input.selectionStart;
				sl=this.input.selectionEnd-ss;
				sv=this.input.value.substr(ss,sl);
			} else {
				var selType=document.selection.type.toLowerCase();
				if(selType=="text") {
					var checkRange = document.selection.createRange();
					if(checkRange.parentElement()==this.input) {
						var inputRange=this.input.createTextRange();
						var inpTxt=inputRange.text;
						sv=checkRange.text; sl=sv.length;
						for(ss=inpTxt.indexOf(sv,0); ss!=-1; ss=inpTxt.indexOf(sv,ss+1)) {
							var testRange=inputRange.duplicate();
							testRange.moveStart ("character", ss);
							testRange.collapse();
							testRange.moveEnd ("character", sl);
							if(testRange.isEqual(checkRange))
								break;
						}
				}} else if(selType=="none") {
					this.input.focus();
					var inpTxt=this.input.value;
					var selStart=inpTxt.length;
					var checkRange=document.selection.createRange();
					var testRange=checkRange.duplicate();
					testRange.moveEnd("character", selStart);
					if(testRange.text!="") selStart=inpTxt.lastIndexOf(testRange.text);				
					var selEnd=-inpTxt.length;
					testRange=checkRange.duplicate();
					testRange.moveStart("character", selEnd);
					selEnd=testRange.text.length;
					ss=selStart; sl=0;	sv="";
				}
			};
			return {start:ss, length:sl, value:sv};
		};	//getTextSelection	
		prototype.toString = function() {		
			var sel=this.getTextSelection();		
			return sel.value;
		};//toString	
		prototype.setTextSelection = function(selectionStart, selectionLength) {
				if ('selectionStart' in this.input) {					
					this.input.selectionStart = selectionStart;
					this.input.selectionEnd = selectionStart+selectionLength;
					this.input.focus();
				}
				else {
					var inputRange = this.input.createTextRange();
					inputRange.moveStart ("character", selectionStart);
					inputRange.collapse ();
					inputRange.moveEnd ("character", selectionLength);
					inputRange.select ();
				}
		}; //setTextSelection
		prototype.select=function(selectionStart, selectionLength) {
			if(selectionStart || selectionLength) {
				selectionStart = selectionStart || 0;
				selectionLength = selectionLength || (this.input.value.length-selectionStart);
				this.setTextSelection(selectionStart, selectionLength);
			} else this.input.select();
		};	//select	
		prototype.getSelectedText=function() {
			return this.getTextSelection().value;
		};	//getSelectedText
		prototype.setSelectedText=function(newValue) {
			var curSel=this.getTextSelection();
			var txt=this.input.value;
			var newTxt=txt.substr(0,curSel.start)+
					newValue+
					txt.substr(curSel.start+curSel.value.length);
			this.input.value=newTxt;
			this.select(curSel.start,newValue.length);
		};	//setSelectedText	
	};

	TextInputLib.DateTextInput = function (dateInput) {
		this.selDate=new TextSelection(dateInput);
		this.setStringValue(dateInput.value);
		dateInput.onfocus	=Functional(onFocusHandler,dateInput.onfocus,this);
		dateInput.onclick	=Functional(onClickHandler,dateInput.onclick,this);
		dateInput.onkeydown =Functional(onKeydownHandler,dateInput.onkeydown,this);
		//dateInput.onkeypress=Functional(onKeypressHandler,dateInput.onkeypress,this);
		dateInput.onblur	=Functional(onBlurHandler,dateInput.onblur,this);
	}
	with(TextInputLib.DateTextInput) {	
		TextSelection=TextInputLib.TextSelection;
		onClickHandler = function(prvOnclick,dateTextInput,evt) {
			dateTextInput.refresh();
			var selDate=dateTextInput.selDate;
			// only digit fields can be selected, not dot delimiters
			var fldInfo=dateTextInput.getFieldByCaret();
			//alert_("onClickHandler: "+fldInfo[1]+","+fldInfo[2]);
			var evt=evt||event||window.event;
			selDate.setTextSelection(fldInfo[1],fldInfo[2]);
			evt.cancelBubble=true;
			return (prvOnclick)?prvOnclick():true;
		};
		onBlurHandler = function(prvOnblur,dateTextInput) {			
			var selDate=dateTextInput.selDate;
			dateTextInput.setStringValue(dateTextInput.getStringValue());
			selDate.resetTextSelection();
			return (prvOnblur)?prvOnblur():true;
		};
		onKeydownHandler = function(prvOnkeydown,dateTextInput,evt) {
			var selDate=dateTextInput.selDate;
			var cancel=false, bCallHandler=false; // handle nasty bug with text selection
			evt = evt || event || window.event;
			var kc=evt.keyCode;			
			var d0,d1,d2,d3,d4;
			switch(kc) 			
			{	case 9: break;
				case 27: dateTextInput.reset(); cancel=true; break;
				case 13: dateTextInput.refresh(); bCallHandler=cancel=true; break;
				case 8: cancel=true; break;
				case 46: bCallHandler=true;
						cancel=true; 
						dateTextInput.setStringValue("");
						break;
				case 38: dateTextInput.adjustDate(1);	cancel=true; break;
				case 40: dateTextInput.adjustDate(-1);	cancel=true; break;			
				case 37: dateTextInput.goNeighbourField(-1);cancel=true; break;			
				case 190: case 39: dateTextInput.goNeighbourField(1);	cancel=true; break;
				case 51: d3=true; case 50: d2=true; 
				case 49: d1=true; case 48: d0=true;				
				default: 
					if(kc>=48 && kc<=57) { d4=kc>=52;
						if(dateTextInput.getStringValue().length==0) {
							delete dateTextInput.lastSelFieldId;
							delete dateTextInput.cntFldTypedChars;
							dateTextInput.selDate.select();							
							dateTextInput.setDateValue(new Date());
							dateTextInput.selDate.select(0, 2);
							cancel=true; break;
						}
						
						var curSel=selDate.getTextSelection();						
						var selTxt=curSel.value;
						if(selTxt==selDate.input.value) {
							dateTextInput.selDate.select(0, 2);
							cancel=true; break;
						}						
						dateTextInput.cntFldTypedChars=(selTxt.length!=0)?0:1+dateTextInput.cntFldTypedChars;
						var fldId=dateTextInput.lastSelFieldId||dateTextInput.getFieldByCaret()[0];		
						var f=[false,false,false]; f[fldId]=true;
						var b1=dateTextInput.cntFldTypedChars>=dateFldLen[fldId]-1;
						//alert_("dateTextInput.cntFldTypedChars: "+dateTextInput.cntFldTypedChars+"");
						//alert_(b1+" "+(d4&&!f[2])+" "+(d2&&f[1]));
						//alert(fldId +" "+f[1]);
						if(b1||(d4&&f[0])||(d2&&f[1])) {
							dateTextInput.cntFldTypedChars=0;							
							setTimeout(Functional(Function("dti", "dti.goNeighbourField(1);delete dti.cntFldTypedChars;"), dateTextInput), 50);
						}
					}
					else {			
						//alert(evt.type+", keyCode="+kc);
						cancel = true;
					}
			};
			var retVal=(bCallHandler&&prvOnkeydown)?prvOnkeydown(evt):!cancel;
			if(cancel) {
				try { evt.keyCode=0; } catch(x){}
				evt.cancelBubble=true;		
			};			
			return retVal;
		}
		onFocusHandler = function(prvOnfocus,dateTextInput) {
			dateTextInput.refresh();
			dateTextInput.correctSelection();
			return (prvOnfocus)?prvOnfocus():true;
		};

		/*	onKeypressHandler = function(prvOnkeydown,dateTextInput) {
		}; */		
		
		prototype.formatDate 			= prototype.getDefaultDate 	= 
		prototype.getFieldStartPos 		= prototype.getFieldByCaret = 
		prototype.goNeighbourField 		= prototype.getDateFromDateParts =
		prototype.validateValue 		= 
		prototype.getPartsValue		= prototype.setPartsValue =
		prototype.getDateValue		= prototype.setDateValue = 
		prototype.getStringValue	= prototype.setStringValue = 
		prototype.adjustDate		= prototype.refresh = prototype.reset =
		prototype.correctSelection  = 
			TextInputLib.forwardDeclare;
		
		with(prototype) {
			assertCheck = TextInputLib.assertCheck;
			dateFormat="dd.MM.yyyy";
			dateFldLen=[2,2,4];
			datePartsMapYMD=[2,1,0];
			dateRegex=/(\d{1,2}).(\d{1,2}).(\d{1,4})/;		
			dateRegexMap="$3 $2 $1";

			parseDateParts = function(txtDate,adjustYearValue) {
				if(txtDate==null || txtDate.length==0) return null;
				//assertCheck(txtDate.length>0, "parseDateParts: txtDate can't be empty!");
				var aVals = txtDate.replace(dateRegex,dateRegexMap).split(" ");
				for(i=0; i<aVals.length; ++i) aVals[i]=parseInt(aVals[i].replace(/^0*/,""));
				if(adjustYearValue) {
					if(aVals[0]<80)
						aVals[0]+=2000;
					else if(aVals[0]<100)
						aVals[0]+=1900;
				}
				aVals[1]-=1; //adjust month index			
				return aVals;
			};
			formatDate = function(aYYYYMMDD) {
				var d=1, m=1, y=2000;
				if(aYYYYMMDD instanceof Date) {
					var dt=aYYYYMMDD;
					d=dt.getDate(); m=dt.getMonth()+1; y=dt.getFullYear();
				} else if(aYYYYMMDD instanceof String) {
					var aDt=parseDateParts(aYYYYMMDD,true);
					y=aDt[0]; m=aDt[1]+1; d=aDt[2];				
				} else if(aYYYYMMDD instanceof Array) {
					y=aYYYYMMDD[0]; m=aYYYYMMDD[1]+1; d=aYYYYMMDD[2];	
				}
				assertCheck("'"+dateFormat+"'=='dd.MM.yyyy'", "TODO: use dateFormat in DateTextInput.formatDate")
				return (d<10?"0"+d:d)+"."+(m<10?"0"+m:m)+"."+y; 
			};
			getDefaultDate = function() {
				if(this.lastValidDateText) return this.lastValidDateText;		
				return this.formatDate(new Date());
			};
			getFieldStartPos = function(caretPos) {
				var i=Math.min(6,caretPos),j=i-(i%3);
				return j;
			};		
			getFieldByCaret = function() {
				var curSel=this.selDate.getTextSelection();			
				var j=this.getFieldStartPos(curSel.start),k=j/3;
				//alert_(dateFldLen+"["+k+"] -> "+dateFldLen[k]);
				this.lastSelFieldId=k;
				return [k,j,dateFldLen[k]];
			};
			goNeighbourField = function(stepCnt) {
				if(this.validateValue(this.selDate.input.value)) {
					this.refresh();
					var fldInfo=(this.lastSelFieldId)?[this.lastSelFieldId,3*this.lastSelFieldId,dateFldLen[this.lastSelFieldId]]:this.getFieldByCaret();
					var nbrFld=(fldInfo[0]+stepCnt+3)%3;
					var nbrFldStart=3*nbrFld,nbrFldLen=dateFldLen[nbrFld];					
					this.selDate.setTextSelection(nbrFldStart,nbrFldLen);
					this.lastSelFieldId=nbrFld;	
				} else {
					this.reset();
				}
			};	

			getDateFromDateParts = function(aDateParts) {
				if(aDateParts) {
					var dt;
					try {
						dt = new Date(aDateParts[0], aDateParts[1], aDateParts[2]);
					} catch(x) {
						//alert_("invalid date: "+x);					
					}
					return dt;
				} else return null;
			};
			
		
			validateValue = function(chkTxt) {
				if(chkTxt==null || chkTxt=="") return "";
				var chkInfo=dateRegex.exec(chkTxt);
				var formattedValue=null;
				if(chkInfo) {
					var chkInfo=parseDateParts(chkInfo[0],true);				
					var chkValidDate=this.getDateFromDateParts(chkInfo);
					chkInfo=this.formatDate(chkInfo);
					if(chkInfo==this.formatDate(chkValidDate))
						formattedValue=chkInfo;
					//else alert_("invalid date check: "+chkInfo+" == "+formatDate(chkValidDate));	
				}
				return formattedValue;		
			};	
			getPartsValue = function() {
				return parseDateParts(this.getStringValue(),true);
			};
			setPartsValue = function(aDatePartsYMD) {
				this.setStringValue(this.formatDate(aDatePartsYMD));
			};
			getDateValue = function() {
				var aDateParts=parseDateParts(this.getStringValue(),true);
				var dt = this.getDateFromDateParts(aDateParts);			
				return dt;
			};
			setDateValue = function(DateValue) {
				this.setStringValue(this.formatDate(DateValue));
			};
			getStringValue = function() {
				var validValue=this.validateValue(this.selDate.input.value);
				return (validValue!=null)?validValue:this.getDefaultDate();
			};			
			setStringValue = function(StringValue) {	
				var result=false;
				var validValue=(StringValue)?this.validateValue(StringValue):"";
				if(validValue!=null) {
					this.selDate.input.value = validValue;
					if(this.lastValidDateText!=validValue) {						
						//alert("update lastValidDateText: "+this.lastValidDateText+" => "+validValue);
						this.lastValidDateText=validValue;
					}
					result=true;
				}
				delete this.lastSelFieldId;
				return result;
			};
			
			refresh = function() {
				var selDate=this.selDate;
				var v=this.getStringValue();
				if(v!=this.lastValidDateText || v!=selDate.input.value) {
					var selSt, selLn;
					if(this.lastSelFieldId!=null) {
						selSt=3*this.lastSelFieldId;
						selLn=dateFldLen[this.lastSelFieldId];						
					} else {
						var selInfo=selDate.getTextSelection();
						selSt=selInfo.start;
						selLn=selInfo.length;
					}
					this.setStringValue(v);
					selDate.select(selSt,selLn);
					delete this.cntFldTypedChars;
					return true;
				}
				return false;
			}
			reset = function() {
				var curFld=this.lastSelFieldId||this.getFieldByCaret();
				this.setStringValue(this.getDefaultDate());
				this.selDate.setTextSelection(3*curFld,dateFldLen[curFld]);				
			};
			adjustDate = function(stepCnt) {
				this.correctSelection();
				var dt=this.getDateValue();
				if(dt) {
					var fldInfo=this.getFieldByCaret();
					switch(fldInfo[0]) {
						case datePartsMapYMD[0]: dt.setFullYear(dt.getFullYear()+stepCnt);  break;
						case datePartsMapYMD[1]: dt.setMonth(dt.getMonth()+stepCnt);  break;
						case datePartsMapYMD[2]: dt.setDate(dt.getDate()+stepCnt);  break;
					};
					this.setDateValue(dt);
					this.selDate.select(fldInfo[1], fldInfo[2]);					
				} else {
					dt=new Date();
					this.setDateValue(dt);
					this.selDate.select(0, 2);					
				}				
				return dt;
			}; //adjustDate
			correctSelection = function() {
				if(this.selDate.input.value!="") {
					var fldId=this.lastSelFieldId||this.getFieldByCaret()[0];
					this.selDate.select(3*fldId, dateFldLen[fldId]);
				}			
			}; // correctSelection
		}; //with(DateTextInput.prototype)
	}; //with(DateTextInput);
	
	TextInputLib.sortSelectElementNodes = function (selELm) {
		var arrSortNodes = new Array();	
		var opts=selELm.children;
		var l=opts.length;
		var iSortGroupIndex=1000;
		var reChkNum=/^(\d*)$/ ; //new RegExp();
		for(var i=l-1; i>=0; --i){
			var curOpt=opts[i];
			if(curOpt.tagName.toUpperCase()=="OPTION") {			
				if(!reChkNum.exec(curOpt.value))
					curOpt.SortGroupIndex=--iSortGroupIndex,iSortGroupIndex--;
				else
					curOpt.SortGroupIndex=iSortGroupIndex;
				//curOpt.innerHTML += ": "+curOpt.value+", "+curOpt.SortGroupIndex;
				arrSortNodes.push(curOpt);			
			}
			selELm.removeChild(curOpt);
		}
		arrSortNodes.sort(function /*cmpNodesBySortGroupIndex*/(n1,n2) {
			var i1=n1.SortGroupIndex||0, i2=n2.SortGroupIndex||0;
			if(i1!=i2)
				return (i1<i2)?-1:1;
			var t1=n1.innerText||n1.text, t2=n2.innerText||n2.text;
			if(t1==t2)
				return 0;
			else
				return (t1<t2)?-1:1;
		});
		for(var i=0; i<arrSortNodes.length; ++i){
			selELm.appendChild(arrSortNodes[i]);
		}
	} // sortSelectElementNodes
	TextInputLib.fixAppList = function (selId){
		if(document.getElementById(selId)) {			
			var selCtl=document.getElementById(selId);			     
				arguments.callee.sortSelectElementNodes(selCtl);
				selCtl.style.width="250px";		   			
		} else {
			setTimeout(Functional(arguments.callee, selId), 4000);
		}
	};
	TextInputLib.fixAppList.sortSelectElementNodes = TextInputLib.sortSelectElementNodes;
}} else {throw "Module requires JsInclude";}