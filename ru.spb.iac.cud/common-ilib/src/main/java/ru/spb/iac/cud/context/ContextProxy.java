package ru.spb.iac.cud.context;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextProxy<I> {
	public final I _;
	public ContextProxy(String className) { this._ = get(className); }
	final static Context ctx = initCtx();
	//private static final Logger LOGGER = LoggerFactory.getLogger(ContextProxy.class);
	private static InitialContext initCtx() {
		try { 
			return new InitialContext();
		} catch (Exception e) {
			//LOGGER.error("static Init error",e);
			return null;
		}				
	}	
	@SuppressWarnings("unchecked")
	public static<T> T get(String className) {
		try {
			return (T)ctx.lookup(className);
		} catch (Exception e) {
			//LOGGER.error("ctor:error:", e);
			return null;
		}
	}
}
