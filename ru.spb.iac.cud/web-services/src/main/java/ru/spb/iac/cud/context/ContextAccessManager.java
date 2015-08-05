package ru.spb.iac.cud.context;

import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.AccessManagerLocal;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.exceptions.InvalidCredentials;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;

 public class ContextAccessManager {

	static Context ctx;
	AccessManagerLocal aml = null;

	private static final Logger LOGGER = LoggerFactory.getLogger(ContextAccessManager.class);

	static {
		try { 
			ctx = new InitialContext();
		} catch (Exception e) {
			LOGGER.error("error",e);
		}
	}

	

	public ContextAccessManager() {
		try {
			this.aml = (AccessManagerLocal) ctx
					.lookup("java:global/AuthServices/AccessManager!ru.spb.iac.cud.core.AccessManagerLocal");

		} catch (Exception e) {
			LOGGER.error("ContextAccessManager:error:", e);
		}
	}

	public void audit(String idIS, String login,
			List<AuditFunction> userFunctions, Long idUserAuth, String IPAddress)
			throws GeneralFailure {
		LOGGER.debug("audit");

		aml.audit_pro(idIS, login, userFunctions, idUserAuth, IPAddress);
	}

	public void change_password(String login, String password,
			String new_password, String IPAddress) throws GeneralFailure,
			InvalidCredentials {
		LOGGER.debug("change_password");
		aml.change_password(login, password, new_password, IPAddress);
	}

	public AuditDataPage getAuditDataISByPeriod(String sysCode, 
			Date date1, Date date2, 
			int rowsCount, long rowStartOffset, 
			long filterUser) {
		try {
			LOGGER.debug("getAuditDataISByPeriod");
			return aml.getAuditDataISByPeriod(sysCode, date1, date2, rowsCount, rowStartOffset, filterUser);
		} catch (GeneralFailure e) {
			LOGGER.error("getAuditDataISByPeriod:error:", e);
			return null;
		}
	}

}
