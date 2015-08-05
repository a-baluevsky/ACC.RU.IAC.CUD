package ru.spb.iac.cud.items.wrapper;

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.List;

import javaw.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ru.spb.iac.cud.items.AuditFunction;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditDataPage", propOrder = {
    "rowStartOffset",
    "totalRowsCount",
    "dataRows"
})
public class AuditDataPage implements Serializable {
	private static final long serialVersionUID = 1986574294955871691L;
	@XmlElement(namespace = "")
    protected long rowStartOffset; // offset from the beginning for the whole data set
    @XmlElement(namespace = "")
    protected long totalRowsCount;
    @XmlElement(namespace = "", nillable = true)
    protected List<AuditFunction> dataRows;
    public long getRowStartOffset() {
        return rowStartOffset;
    }
    public void setRowStartOffset(long value) {
        this.rowStartOffset = value;
    }
    public long getTotalRowsCount() {
        return totalRowsCount;
    }
    public void setTotalRowsCount(long value) {
        this.totalRowsCount = value;
    }
    public List<AuditFunction> getDataRows() {
        return this.dataRows;
    }
    public void setDataRows(List<AuditFunction> dataRows) {
    	this.dataRows = dataRows;
    }
    
	//public void setDataRowsRaw(List<Object[]> dataRows) {
	//	this.dataRows = javaw.util.Strings.stringifyList(dataRows);
	//}
}
