package ru.spb.iac.cud.services.audit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.wrapper.Audit;
import ru.spb.iac.cud.items.wrapper.AuditDataPage;
import ru.spb.iac.cud.items.wrapper.SyncFunctions;
import ru.spb.iac.cud.items.wrapper.AuditResponse;
import ru.spb.iac.cud.items.wrapper.GeneralFailure;
import ru.spb.iac.cud.items.wrapper.GetAuditDataISByPeriod;
import ru.spb.iac.cud.items.wrapper.GetAuditDataISByPeriodResponse;


@XmlRegistry
 public class ObjectFactory {

	private static final  QName _audit_QNAME = new QName(AuditServiceImpl.NS,
			"audit");
	private static final  QName _sync_functions_QNAME = new QName(
			AuditServiceImpl.NS, "sync_functions");

    private final static QName _GetAuditDataISByPeriod_QNAME = new QName(AuditServiceImpl.NS, "getAuditDataISByPeriod");
    private final static QName _GeneralFailure_QNAME = new QName(AuditServiceImpl.NS, "generalFailure");
    private final static QName _AuditResponse_QNAME = new QName(AuditServiceImpl.NS, "auditResponse");
    private final static QName _GetAuditDataISByPeriodResponse_QNAME = new QName(AuditServiceImpl.NS, "getAuditDataISByPeriodResponse");

	
	public ObjectFactory() {
	}

    public AuditResponse createAuditResponse() {
        return new AuditResponse();
    }
    public GetAuditDataISByPeriodResponse createGetAuditDataISByPeriodResponse() {
        return new GetAuditDataISByPeriodResponse();
    }
    public Audit createAudit() {
        return new Audit();
    }
    public GeneralFailure createGeneralFailure() {
        return new GeneralFailure();
    }
    public GetAuditDataISByPeriod createGetAuditDataISByPeriod() {
        return new GetAuditDataISByPeriod();
    }
    
    
    public AuditFunction createUserFunctions() { //UserFunctions
       return new AuditFunction();
    }
    
    public AuditDataPage createAuditDataPage() {
        return new AuditDataPage();
    }
	@XmlElementDecl(namespace = AuditServiceImpl.NS, name = "audit")
    public JAXBElement<Audit> createAudit(Audit value) {
		return new JAXBElement<Audit>(_audit_QNAME, Audit.class, null, value);
	}

	@XmlElementDecl(namespace = AuditServiceImpl.NS, name = "sync_functions")
	public JAXBElement<SyncFunctions> createSyncFunctions(SyncFunctions value) {
		return new JAXBElement<SyncFunctions>(_sync_functions_QNAME,
				SyncFunctions.class, null, value);
	}
	
    @XmlElementDecl(namespace = AuditServiceImpl.NS, name = "getAuditDataISByPeriod")
    public JAXBElement<GetAuditDataISByPeriod> createGetAuditDataISByPeriod(GetAuditDataISByPeriod value) {
        return new JAXBElement<GetAuditDataISByPeriod>(_GetAuditDataISByPeriod_QNAME, GetAuditDataISByPeriod.class, null, value);
    }
    @XmlElementDecl(namespace = AuditServiceImpl.NS, name = "generalFailure")
    public JAXBElement<GeneralFailure> createGeneralFailure(GeneralFailure value) {
        return new JAXBElement<GeneralFailure>(_GeneralFailure_QNAME, GeneralFailure.class, null, value);
    }
    @XmlElementDecl(namespace = AuditServiceImpl.NS, name = "auditResponse")
    public JAXBElement<AuditResponse> createAuditResponse(AuditResponse value) {
        return new JAXBElement<AuditResponse>(_AuditResponse_QNAME, AuditResponse.class, null, value);
    }
    @XmlElementDecl(namespace = AuditServiceImpl.NS, name = "getAuditDataISByPeriodResponse")
    public JAXBElement<GetAuditDataISByPeriodResponse> createGetAuditDataISByPeriodResponse(GetAuditDataISByPeriodResponse value) {
        return new JAXBElement<GetAuditDataISByPeriodResponse>(_GetAuditDataISByPeriodResponse_QNAME, GetAuditDataISByPeriodResponse.class, null, value);
    }
}
