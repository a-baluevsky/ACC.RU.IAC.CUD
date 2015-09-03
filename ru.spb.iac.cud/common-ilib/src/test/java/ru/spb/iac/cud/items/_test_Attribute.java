package ru.spb.iac.cud.items;

import iac.cud.data.eis.JPA_EisAdminManager;
import ru.spb.iac.cud.core.data.DataField;
import ru.spb.iac.cud.core.data.XAttribute;
import ru.spb.iac.cud.exceptions.GeneralFailure;

public class _test_Attribute {
	public static void test() {		
		try {
			//"*<1>ISP_BSS_T.SIGN_OBJECT:<2>ISP_EXT_BSS_T.SIGN_OBJECT:<3>TABLE3.PROP3:<4>TABLE4.PROP4"
			XAttribute.Domain d = new XAttribute.Domain("?ISP_EXT_BSS_T.FULLNAME:ISP_BSS_T.FULL_");
			DataField<?> dbFld = d.getDbFields().get(0);
			System.out.println(dbFld.getColumnName());
		} catch (GeneralFailure e) {
			e.printStackTrace();
		}
		
		OrganisationAttribute oa = OrganisationAttribute.oaOrgCode(null); //
		
		DataField<?> dbFld = oa.domain.getDbFields().get(1);
		System.out.println(dbFld.getTableName());
		oa = JPA_EisAdminManager.oaOrgCode_ISP_BSS_T(null);
		dbFld = oa.domain.getDbFields().get(1);		
		oa = OrganisationAttribute.oaFullName(null);
		dbFld = oa.domain.getDbFields().get(1);
		oa = JPA_EisAdminManager.oaUid_ISP_BSS_T(null);
		dbFld = oa.domain.getDbFields().get(1);
	}
}
