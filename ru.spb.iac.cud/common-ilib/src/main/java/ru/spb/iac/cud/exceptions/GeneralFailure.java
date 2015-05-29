package ru.spb.iac.cud.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "generalFailure")
 public class GeneralFailure extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GeneralFailure(String message) {
		super(message);		
	}
}
