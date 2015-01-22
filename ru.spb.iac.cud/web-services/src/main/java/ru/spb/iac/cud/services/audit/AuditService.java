package ru.spb.iac.cud.services.audit;

import ru.spb.iac.cud.items.Group;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.AuditFunction;

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
    public Group testAB (
	    		 @WebParam(name = "testGroupId", targetNamespace = NS)
	    		 String sTestGrpId
          ) throws GeneralFailure;
    
	@WebMethod
	@WebResult(targetNamespace = NS)
	public String testABStr (
			@WebParam(name = "testString", targetNamespace = NS)
			String sTestString)
		throws GeneralFailure;  
}
