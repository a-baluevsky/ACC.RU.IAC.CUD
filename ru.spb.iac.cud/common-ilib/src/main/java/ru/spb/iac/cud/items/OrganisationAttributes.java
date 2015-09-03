package ru.spb.iac.cud.items;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ru.spb.iac.cud.core.data.XAttribute;
import ru.spb.iac.cud.core.data.XAttributes;

public class OrganisationAttributes extends XAttributes<OrganisationAttribute> {
	//private Map<String, Attribute> departamentAttributes = new Map<String, Attribute>();
	//public Map<String, Attribute> getDepartamentAttributes() {	return departamentAttributes;	}
	//public void setDepartamentAttributes(Map<String, Attribute> departamentAttributes) { this.departamentAttributes = departamentAttributes;	}
	public OrganisationAttributes() { super(OrganisationAttribute.class); }	
	public OrganisationAttributes(Iterable<? extends Attribute> listCopy) {
		this();
		for (Attribute attribute : listCopy) {
			add(new OrganisationAttribute(attribute));
		}
	}
	@Override public OrganisationAttributes clone() { return new OrganisationAttributes(this);	}
	@Override public OrganisationAttribute add(OrganisationAttribute oa) {
		if(oa.domain==null) oa.domain = getDomainByName(oa.getName());
		final String oaDom = oa.domain!=null? oa.domain.toString(): null;
		if("ISP_BSS_T.ID_SRV".equals(oaDom) || "ISP_EXT_BSS_T.ID_SRV".equals(oaDom)) {
			oa.useCondition = true; // treat as condition in Where-clause and don't allow changing ID
			putAttribute(oa);
			return oa;
		} else 
			return super.add(oa);
	}

	private static XAttribute.Domain getDomainByName(String name) {
		try {
			if(XAttribute.Domain.isValidDomainSpec(name)) {
				return new XAttribute.Domain(name);
			} else {
				final UUID uid = UUID.fromString(name);
				return OrganisationAttribute.getDomainByID(uid);
			}
		} catch(Exception x) {
			return null;
		}
	}	
}
