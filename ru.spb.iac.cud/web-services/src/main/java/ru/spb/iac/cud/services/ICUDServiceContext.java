package ru.spb.iac.cud.services;

import javax.servlet.http.HttpServletRequest;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public interface ICUDServiceContext {
	HttpServletRequest 		getHttpServletRequest() throws GeneralFailure;
	String 					getIPAddress() 			throws GeneralFailure;
	String 					getIDSystem() 			throws GeneralFailure;
	Long 					getIDUser() 			throws GeneralFailure;
}