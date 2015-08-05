
package ru.spb.iac.cud.items.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuditDataISByPeriodResponse", propOrder = {
    "_return"
})
public class GetAuditDataISByPeriodResponse {

    @XmlElement(name = "return")
    protected AuditDataPage _return;

    public AuditDataPage getReturn() {
        return _return;
    }

    public void setReturn(AuditDataPage value) {
        this._return = value;
    }

}
