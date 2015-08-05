
package ru.spb.iac.cud.items.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuditDataISByPeriod", propOrder = {
    "date1",
    "date2",
    "rowsCount",
    "rowStartOffset"
})
public class GetAuditDataISByPeriod {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date2;
    protected int rowsCount;
    protected int rowStartOffset;

    public XMLGregorianCalendar getDate1() {
        return date1;
    }

    public void setDate1(XMLGregorianCalendar value) {
        this.date1 = value;
    }

    public XMLGregorianCalendar getDate2() {
        return date2;
    }

    public void setDate2(XMLGregorianCalendar value) {
        this.date2 = value;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(int value) {
        this.rowsCount = value;
    }

    public int getRowStartOffset() {
        return rowStartOffset;
    }

    public void setRowStartOffset(int value) {
        this.rowStartOffset = value;
    }

}
