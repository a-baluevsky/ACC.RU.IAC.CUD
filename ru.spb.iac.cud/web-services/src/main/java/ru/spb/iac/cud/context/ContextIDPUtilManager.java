package ru.spb.iac.cud.context;

import java.security.cert.X509Certificate;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal;

 public class ContextIDPUtilManager {

	static Context ctx;
	IDPUtilManagerLocal iml = null;

	
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ContextIDPUtilManager.class);

	static {
		try {
			ctx = new InitialContext();

		} catch (Exception e) {
			LOGGER.error("initContext:error",e);
		}
	}


	public ContextIDPUtilManager() {
		try {
			this.iml = (IDPUtilManagerLocal) ctx
					.lookup("java:global/AuthServices/IDPUtilManager!ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal");

		} catch (Exception e) {
			LOGGER.error("error:", e);
		}
	}

	public X509Certificate system_cert(String domain_name) throws Exception {

		return iml.system_cert(domain_name);

	}

	public boolean systemSignReq(String domainName) throws Exception {

		return iml.systemSignReq(domainName);

	}
}
