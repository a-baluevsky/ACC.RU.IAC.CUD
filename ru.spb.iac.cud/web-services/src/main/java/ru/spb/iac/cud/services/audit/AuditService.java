package ru.spb.iac.cud.services.audit;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;

@WebService(targetNamespace = AuditServiceImpl.NS)
public interface AuditService {

	public static final String NS = AuditServiceImpl.NS;

	@WebMethod
	public void audit(
			@WebParam(name = "uidUser", targetNamespace = NS) String uidUser,
			@WebParam(name = "userFunctions", targetNamespace = NS) List<AuditFunction> userFunctions)
			throws GeneralFailure;
	
	@WebMethod
	@WebResult(targetNamespace = NS)
	public AuditDataPage getAuditDataISByPeriod(
			@WebParam(name = "date1", targetNamespace = NS) Date date1,
			@WebParam(name = "date2", targetNamespace = NS) Date date2,
			@WebParam(name = "rowsCount", targetNamespace = NS) int rowsCount,
			@WebParam(name = "rowStartOffset", targetNamespace = NS) int rowStartOffset
		) throws GeneralFailure;	
}
