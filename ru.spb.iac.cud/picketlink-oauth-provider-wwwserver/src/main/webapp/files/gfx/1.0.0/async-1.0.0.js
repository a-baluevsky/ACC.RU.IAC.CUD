define(['underscore_plus'], function (_) {
	var async_version = '1.0.0.1';
	function test() {
		return 'Hello from async'+async_version+'!';
	}
	
    var funcTag = '[object Function]';
    var genTag = '[object GeneratorFunction]';
    var objectProto = Object.prototype;
    var objectToString = objectProto.toString;	

	var NAN = 0 / 0; // Used as references for various `Number` constants.
    var INFINITY = 1 / 0;
	var nativeMax = Math.max;
    var MAX_INTEGER = 1.7976931348623157e+308;
	var MAX_SAFE_INTEGER = 9007199254740991; //  Used as references for various `Number` constants.
	
	var nativeMax$1 = Math.max;
    var nativeCeil = Math.ceil;
    var nativeMax$2 = Math.max;	
	
	var reTrim = /^\s+|\s+$/g;	// Used to match leading and trailing whitespace.
	var reIsBadHex = /^[-+]0x[0-9a-f]+$/i; // Used to detect bad signed hexadecimal string values.
	var reIsBinary = /^0b[01]+$/i; // Used to detect binary string values. 
	var reIsOctal = /^0o[0-7]+$/i;	// Used to detect octal string values.
	var freeParseInt = parseInt; // Built-in method references without a dependency on `root`. 
	
    var FUNC_ERROR_TEXT = 'Expected a function'; //   Used as the `TypeError` message for "Functions" methods. 	
    var FUNC_ERROR_TEXT$1 = 'Expected a function';
	
	// functionals
    var reverse = Array.prototype.reverse;	
	var eachOf = doLimit(eachOfLimit, Infinity);
    var applyEach = applyEach$1(eachOf);
    var eachOfSeries = doLimit(eachOfLimit, 1);
    var applyEachSeries = applyEach$1(eachOfSeries);

    var apply$1 = rest(function (fn, args) {
        return rest(function (callArgs) {
            return fn.apply(null, args.concat(callArgs));
        });
    });	

	// Converts `value` to a number.
    // _.toNumber(Number.MIN_VALUE); // => 5e-324	
    // _.toNumber(Infinity); // => Infinity	
    // _.toNumber('3'); // => 3	
    function toNumber(value) {
      if (isObject(value)) {
        var other = isFunction(value.valueOf) ? value.valueOf() : value;
        value = isObject(other) ? (other + '') : other;
      }
      if (typeof value != 'string') {
        return value === 0 ? value : +value;
      }
      value = value.replace(reTrim, '');
      var isBinary = reIsBinary.test(value);
      return (isBinary || reIsOctal.test(value))
        ? freeParseInt(value.slice(2), isBinary ? 2 : 8)
        : (reIsBadHex.test(value) ? NAN : +value);
    }
	
	function applyEach$1(eachfn) {
		return rest(function (fns, args) {
            var go = rest(function (args) {
                var that = this;
                var callback = args.pop();
                return eachfn(fns, function (fn, _, cb) {
                    fn.apply(that, args.concat([cb]));
                }, callback);
            });
            if (args.length) {
                return go.apply(this, args);
            } else {
                return go;
            }
        });
    }
	
	// This function is loosely based on [`ToInteger`](http://www.ecma-international.org/ecma-262/6.0/#sec-tointeger
	//  _.toInteger(Number.MIN_VALUE); // => 0
	// _.toInteger(Infinity); // => 1.7976931348623157e+308
	// _.toInteger('3'); // => 3
    function toInteger(value) {
      if (!value) {
        return value === 0 ? value : 0;
      }
      value = toNumber(value);
      if (value === INFINITY || value === -INFINITY) {
        var sign = (value < 0 ? -1 : 1);
        return sign * MAX_INTEGER;
      }
      var remainder = value % 1;
      return value === value ? (remainder ? value - remainder : value) : 0;
    }
	
    function apply(func, thisArg, args) {
      var length = args.length;
      switch (length) {
        case 0: return func.call(thisArg);
        case 1: return func.call(thisArg, args[0]);
        case 2: return func.call(thisArg, args[0], args[1]);
        case 3: return func.call(thisArg, args[0], args[1], args[2]);
      }
      return func.apply(thisArg, args);
    }

    function isObject(value) {
      var type = typeof value;
      return !!value && (type == 'object' || type == 'function');
    }	
	
    function isFunction(value) {
      // The use of `Object#toString` avoids issues with the `typeof` operator
      // in Safari 8 which returns 'object' for typed array and weak map constructors,
      // and PhantomJS 1.9 which returns 'function' for `NodeList` instances.
      var tag = isObject(value) ? objectToString.call(value) : '';
      return tag == funcTag || tag == genTag;
    }
	
    function isLength(value) {
      return typeof value == 'number' &&
        value > -1 && value % 1 == 0 && value <= MAX_SAFE_INTEGER;
    }

    function baseProperty(key) {
      return function(object) {
        return object == null ? undefined : object[key];
      };
    }
	
	var getLength = baseProperty('length');
    function isArrayLike(value) {
      return value != null && isLength(getLength(value)) && !isFunction(value);
    }

	function keyIterator(coll) {
		var i = -1;
		var len;
		if (isArrayLike(coll)) {
			len = coll.length;
			return function next() {
				i++;
				return i < len ? i : null;
			};
		} else {
			var okeys = keys(coll);
			len = okeys.length;
			return function next() {
				i++;
				return i < len ? okeys[i] : null;
			};
		}
	}

	function noop() {
	  // No operation performed.
	}		


	
    function onlyOnce(fn) {
        return function () {
            if (fn === null) throw new Error("Callback was already called.");
            fn.apply(this, arguments);
            fn = null;
        };
    }
	
	// Creates a function that is restricted to invoking `func` once. Repeat calls
	// to the function return the value of the first invocation.
	// The `func` is invoked with the `this` binding and arguments of the created function.
    function once(func) {
      return before(2, func);
    }	
	
    //  * Creates a function that invokes `func`, with the `this` binding and arguments
    //  * of the created function, while it's called less than `n` times. Subsequent
    //  * calls to the created function return the result of the last `func` invocation.	
    function before(n, func) {
      var result;
      if (typeof func != 'function') {
        throw new TypeError(FUNC_ERROR_TEXT$1);
      }
      n = toInteger(n);
      return function() {
        if (--n > 0) {
          result = func.apply(this, arguments);
        }
        if (n <= 1) {
          func = undefined;
        }
        return result;
      };
    }	
	
    function _eachOfLimit(limit) {
        return function (obj, iterator, callback) {
            callback = once(callback || noop);
            obj = obj || [];
            var nextKey = keyIterator(obj);
            if (limit <= 0) {
                return callback(null);
            }
            var done = false;
            var running = 0;
            var errored = false;

            (function replenish() {
                if (done && running <= 0) {
                    return callback(null);
                }

                while (running < limit && !errored) {
                    var key = nextKey();
                    if (key === null) {
                        done = true;
                        if (running <= 0) {
                            callback(null);
                        }
                        return;
                    }
                    running += 1;
                    iterator(obj[key], key, onlyOnce(function (err) {
                        running -= 1;
                        if (err) {
                            callback(err);
                            errored = true;
                        } else {
                            replenish();
                        }
                    }));
                }
            })();
        };
    }	
	
	function eachOfLimit(obj, limit, iterator, cb) {
		_eachOfLimit(limit)(obj, iterator, cb);
	}
	function doLimit(fn, limit) {
		return function (iterable, iterator, callback) {
			return fn(iterable, limit, iterator, callback);
		};
	}
	var eachOfSeries = doLimit(eachOfLimit, 1);
	
	function reduce(arr, memo, iterator, cb) {
		eachOfSeries(arr, function (x, i, cb) {
			iterator(memo, x, function (err, v) {
				memo = v;
				cb(err);
			});
		}, function (err) {
			cb(err, memo);
		});
	}		
	function seq( /* functions... */ ) {
		var fns = arguments;
		return rest(function(args) {
			var that = this;

			var cb = args[args.length - 1];
			if (typeof cb == 'function') {
				args.pop();
			} else {
				cb = noop;
			}

			// Reduce builds up a single result from a list of values, aka inject, or foldl.
			// _.reduce(list, iterator, memo, [context]) 
			// itartor(memo, value, key, list)
			// _.reduce = _.foldl = _.inject = createReduce(1);
			reduce(fns, args, function(newargs, fn, cb) {
					fn.apply(that, newargs.concat([rest(function(err, nextargs) {
						cb(err, nextargs);
					})]));
				},
				function(err, results) {
					cb.apply(that, [err].concat(results));
				});
		});
	}

	// Creates a function that invokes `func` with the `this` binding of the
	// created function and arguments from `start` and beyond provided as an array.
    // var say = _.rest(function(what, names) {
    //   return what + ' ' + _.initial(names).join(', ') +
    //     (_.size(names) > 1 ? ', & ' : '') + _.last(names);
    // });
    // say('hello', 'fred', 'barney', 'pebbles');
    // // => 'hello fred, barney, & pebbles'	
	function rest(func, start) {
	  if (typeof func != 'function') {
		throw new TypeError(FUNC_ERROR_TEXT);
	  }
	  start = nativeMax(start === undefined ? (func.length - 1) : toInteger(start), 0);
	  return function() {
		var args = arguments,
			index = -1,
			length = nativeMax(args.length - start, 0),
			array = Array(length);

		while (++index < length) {
		  array[index] = args[start + index];
		}
		switch (start) {
		  case 0: return func.call(this, array);
		  case 1: return func.call(this, args[0], array);
		  case 2: return func.call(this, args[0], args[1], array);
		}
		var otherArgs = Array(start + 1);
		index = -1;
		while (++index < start) {
		  otherArgs[index] = args[index];
		}
		otherArgs[start] = array;
		return apply(func, this, otherArgs);
	  };
	}

	function compose(/* functions... */) {
		//return seq.apply(null, reverse.call(arguments));
		return seq.apply(null, arguments);
		//debugger;
		//return seq(arguments);
	}

    function asyncify(func) {
		//debugger;
        return rest(function (args) {
			//debugger;
            var callback = args.pop(); // callback(err, result);
            var result;
            try {
                result = func.apply(this, args);
            } catch (e) {
                return callback(e, null); // pass err
            }
            // if result is Promise object
            if (isObject(result) && typeof result.then === 'function') {
                result.then(function (value) {
                    callback(null, value);
                })['catch'](function (err) {
                    callback(err.message ? err : new Error(err));
                });
            } else {
                callback(null, result); // pass result
            }
        });
    }

	function genericErrResCallback(f, callback, err, result) {
		//debugger;
		var fnName = arguments.callee.caller.caller.caller; // arguments.callee.caller.name;
		if (err) {
			err.fnName = fnName;
			callback(err);
		} else try {		    					
			callback(null, f(result));
		} catch(x) {
			x.fnName = fnName;
		    if(x.name && x.message)
		        callback(x.name +': '+ x.message);
		    else
			    callback(x);
		}
	}	
	
	return {
		test: test,
		isFunction: isFunction,
		asyncify: asyncify,
		compose: compose,
		genericErrResCallback: genericErrResCallback
	}
	
});