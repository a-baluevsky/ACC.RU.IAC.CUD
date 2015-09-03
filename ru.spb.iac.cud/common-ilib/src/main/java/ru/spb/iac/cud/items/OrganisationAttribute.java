package ru.spb.iac.cud.items;

import java.util.UUID;

import iac.cud.data.eis.JPA_EisAdminManager;
import ru.spb.iac.cud.core.data.XAttribute;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class OrganisationAttribute extends XAttribute {
	public OrganisationAttribute(Attribute attr) 			 { super(attr);				}	// конструктор преобразования	
	public OrganisationAttribute(OrganisationAttribute attr) { super((XAttribute)attr);	}	// конструктор копирования
	
	/* ! при расширении (добавление полей) класса заменить на следующее:
	public OrganisationAttribute(Attribute attr) 			 { clone(attr);	}	
	public OrganisationAttribute(OrganisationAttribute attr) { clone(attr);	}
	
	@Override
	public void clone(Attribute copy) {
		if(copy instanceof OrganisationAttribute)
			clone((OrganisationAttribute)copy);
		else
			super.clone(copy);
	}
	private void clone(OrganisationAttribute copy) {
		super.clone(copy);
		// копировать поля из oa: this.? = oa.?;
	}
	*/
	@Override public OrganisationAttribute clone() { return new OrganisationAttribute(this); }
	
	public OrganisationAttribute(UUID idAtr, String value) {
		super(getDomainByID(idAtr), idAtr.toString().toUpperCase(), value);	
	}
	static XAttribute.Domain getDomainByID(UUID idAtr) {
		String sd = JPA_EisAdminManager.resolveGUIDOrgAtr(idAtr);
		if(sd==null) return null;
		try {
			return new XAttribute.Domain(sd);
		} catch (GeneralFailure e) {
			e.printStackTrace();
			return null;	
		}
	}
	
	// идентификаторы атрибутов
	public static final UUID idFullName = UUID.fromString("B100A022-5CA3-46F6-95EA-0F8C08EACC8E");
	public static final UUID idOrgCode 	= UUID.fromString("6DD1A411-A2D8-43C6-99E6-B87342B7AE06");
	public static final UUID idAddress 	= UUID.fromString("E4D006A2-56FC-4781-808D-02346588700C");
	public static final UUID idPhone 	= UUID.fromString("56C87645-DEF0-404D-8B99-BD5F4B79BEB8");
	public static final UUID idEmail 	= UUID.fromString("09639ECB-53E9-4991-8E8D-3CF92C3AB823");
	public static final UUID idSite 	= UUID.fromString("21FEB592-9E39-49BB-B66A-4B8D9AFFCBA5");
	public static final UUID idOKPO 	= UUID.fromString("C3FAD663-DACA-493A-82EF-FE46AD04859A");
	public static final UUID idOKOGU 	= UUID.fromString("06B05E2C-9572-4E8C-A080-12B50E9F9A8B");
	public static final UUID idOGRN 	= UUID.fromString("8D95ACD0-CE85-43E7-AC27-2B378DCEA47D");
	public static final UUID idINN 		= UUID.fromString("62011C4D-186E-43F3-A0C1-6FB39E10C2A8");
	public static final UUID idKPP 		= UUID.fromString("B05B706E-E951-4EBF-BACA-5DA343F104D3");
	
	
	// аналог enum, только элементы умеют принимать значение и скрывают свой код
	// p.s. служебные/расширенные в /common-ilib/src/main/java/iac/cud/data/eis/JPA_EisAdminManager.java 
	public static OrganisationAttribute oaFullName(String value) 	{	return new OrganisationAttribute(idFullName, value);	}	// FullName
	public static OrganisationAttribute oaOrgCode(String value) 	{	return new OrganisationAttribute(idOrgCode, value);		}	// OrgCode
	public static OrganisationAttribute oaAddress(String value) 	{	return new OrganisationAttribute(idAddress, value);		}	// Address
	public static OrganisationAttribute oaPhone(String value) 		{	return new OrganisationAttribute(idPhone, value);		}	// Phone
	public static OrganisationAttribute oaEmail(String value) 		{	return new OrganisationAttribute(idEmail, value);		}	// Email
	public static OrganisationAttribute oaSite(String value) 		{	return new OrganisationAttribute(idSite, value);		}	// Site
	public static OrganisationAttribute oaOKPO(String value) 		{	return new OrganisationAttribute(idOKPO, value);		}	// OKPO
	public static OrganisationAttribute oaOKOGU(String value) 		{	return new OrganisationAttribute(idOKOGU, value);		}	// OKOGU
	public static OrganisationAttribute oaOGRN(String value) 		{	return new OrganisationAttribute(idOGRN, value);		}	// OGRN
	public static OrganisationAttribute oaINN(String value) 		{	return new OrganisationAttribute(idINN, value);			}	// INN
	public static OrganisationAttribute oaKPP(String value) 		{	return new OrganisationAttribute(idKPP, value);			}	// KPP

}