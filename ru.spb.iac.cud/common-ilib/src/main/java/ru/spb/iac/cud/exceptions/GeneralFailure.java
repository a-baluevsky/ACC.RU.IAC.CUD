package ru.spb.iac.cud.exceptions;

import javax.xml.ws.WebFault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.TokenInfo.InvalidTokenException;

@WebFault(name = "generalFailure")
 public class GeneralFailure extends Exception {
	protected static final Logger LOGGER = LoggerFactory.getLogger(GeneralFailure.class);
	private static final long serialVersionUID = 1L;

	public GeneralFailure(String message) 	{ super(message); LOGGER.error(message); }
	public GeneralFailure(Exception e) 		{ this(e.toString()); initCause(e); }
	
	public static void throwIt(Logger LOGGER, String msg) throws GeneralFailure {
		LOGGER.error(msg);
		throw new GeneralFailure(msg);		
	}
	
	public void throwIt(String msg) throws GeneralFailure {
		LOGGER.error(msg);
		throw new GeneralFailure(msg);		
	}
	
}
