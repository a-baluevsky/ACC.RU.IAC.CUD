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
			UUID uid = resolveBySymbolicName(name);
			if(uid!=null)
				return OrganisationAttribute.getDomainByID(uid);				
			if(XAttribute.Domain.isValidDomainSpec(name)) {
				return new XAttribute.Domain(name);
			}
			else {
				uid = UUID.fromString(name);
				return OrganisationAttribute.getDomainByID(uid);
			}
		} catch(Exception x) {
			return null;
		}
	}
	
	private static UUID resolveBySymbolicName(String s) {

			if(s.equals("ORG_ADDRESS"))	return OrganisationAttribute.idAddress;
			if(s.equals("ORG_NAME"))	return OrganisationAttribute.idFullName;
			if(s.equals("ORG_PHONE"))	return OrganisationAttribute.idPhone;
			if(s.equals("ORG_EMAIL"))	return OrganisationAttribute.idEmail;
			if(s.equals("ORG_SITE"))	return OrganisationAttribute.idSite;
			if(s.equals("ORG_OKPO"))	return OrganisationAttribute.idOKPO;
			if(s.equals("ORG_OKOGU"))	return OrganisationAttribute.idOKOGU;
			if(s.equals("ORG_OGRN"))	return OrganisationAttribute.idOGRN;
			if(s.equals("ORG_INN"))		return OrganisationAttribute.idINN;
			if(s.equals("ORG_KPP"))		return OrganisationAttribute.idKPP;
			
			return null;
	}
}
