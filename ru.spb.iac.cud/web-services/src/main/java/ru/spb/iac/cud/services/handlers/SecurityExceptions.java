package ru.spb.iac.cud.services.handlers;

public class SecurityExceptions {

	// ClientAuthException
	 public static class ClientAuthException extends Exception {
		private static final long serialVersionUID = 1L;
		public ClientAuthException(String message) { super(message); }
	 }
	 public static ClientAuthException throw_ClientAuth(String message) throws ru.spb.iac.cud.services.handlers.SecurityExceptions.ClientAuthException {
		 throw new ClientAuthException(message);
	 }
	 
	 public static class UserNotLoggedInException extends Exception {
		private static final long serialVersionUID = 1L;
		public UserNotLoggedInException(String message) { super(message); }
	 }
	 public static UserNotLoggedInException throw_UserNotLoggedIn(String message) throws ru.spb.iac.cud.services.handlers.SecurityExceptions.UserNotLoggedInException {
		 throw new UserNotLoggedInException(message);
	 }	 
	 
	 
}
