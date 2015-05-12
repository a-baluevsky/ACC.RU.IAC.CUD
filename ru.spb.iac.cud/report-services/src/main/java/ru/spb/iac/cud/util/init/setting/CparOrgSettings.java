package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5setting){
		String result5setting = null;
		
		if (uids5setting != null && !uids5setting.isEmpty()) {

			StringBuilder bld5setting = new StringBuilder();
 for (String uidValue : uids5setting) {
 if (bld5setting.length()==0) {
 bld5setting.append("'" + uidValue + "'");
 }else{
 bld5setting.append(",'" + uidValue + "'");
 }
}
 result5setting=bld5setting.toString();
		}
		
		return result5setting;
	}

	public  String createAttributes (List<Object[]> lo5setting, List<User> result5setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5setting = null;
		   String idRec5setting = null;
		   User uat = null;
		   List<Attribute> atlist5setting = null;
		   String usersIdsLine5setting = null;
		   
		  

			
			System.setProperty("Test5setting0Init",
					"Test5setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test5setting0ss5setting0_0x",
					"Test5setting0ss5setting0_0xjcp.xml");
        	System.setProperty("Test5setting0ss5setting0_02",
					"Test5setting0ss5setting0_02xml.config");
			System.setProperty("Test5setting0ss5setting0_03",
					"Test5setting0ss5setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test5setting0ss5setting0_04",
					"Test5setting0ss5setting0_04.resource.");
			System.setProperty("Test5setting0ss5setting0_05",
					"Test5setting0ss5setting0_05.isInitialized");
			System.setProperty("Test5setting0ss5setting0_06",
					"Test5setting0ss5setting0_06_5setting0Init.class/jcp.xml");
			System.setProperty("Test5setting0ss5setting0_07",
					"Test5setting0ss5setting0_07t/resource/jcp.xml");
        	System.setProperty("Test5setting0ss5setting0_08",
					"Test5setting0ss5setting0_08.config");
			System.setProperty("Test5setting0ss5setting0_09",
					"Test5setting0ss5setting0_09.security.");
		    System.setProperty("Test5setting0ss5setting0_0x0",
					"Test5setting0ss5setting0_0x0jcp.xmlapache.");
			System.setProperty("Test5setting0ss5setting0_0xx0",
					"Test5setting0ss5setting0_0xx0.isInitialized");
			System.setProperty("Test5setting0ss5setting0_0xxx0",
					"Test5setting0ss5setting0_0xxx0est5setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5setting : lo5setting) {

			// !!!
				// Проверить
				uid5setting = objectArray5setting[0].toString();

				idRec5setting = objectArray5setting[0].toString();

				uat = new User();
				atlist5setting = new ArrayList<Attribute>();
				String name5setting = null;
	
			for (int i = 0; i < objectArray5setting.length; i++) {

				at = new Attribute();


				name5setting = "USER_FIO5setting";
				
			
			
				name5setting = "USER_PHONE5setting";
				
			
			
				name5setting = "USER_EMAIL5setting";
				
			
			
				name5setting = "ORG_name5setting5setting";
				
			
	
				name5setting = "USER_UID5setting";
				
			
			
				name5setting = "USER_LOGIN5setting";
				
			
				
				name5setting = "ORG_CODE_IOGV5setting";
				
			
			
				name5setting = "ORG_ADDRES5setting";
				
			
			
				name5setting = "ORG_PHONE5setting";
				
			
			
				name5setting = "ORG_Prr5setting";
				
			
			
				name5setting = "ORG_PffE5setting";
				
			
			
				name5setting = "ORG_PHggNE5setting";
				
			
		
			
			
				name5setting = "ORrr_PHONE5setting";
				
			
			
				name5setting = "ORyy_PHONE5setting";
				
			
			
				name5setting = "OddPHONE5setting";
				
			
			
				name5setting = "OffHONE5setting";
				
			
			
				name5setting = "DEP_name5setting5setting";
				
			
			
				name5setting = "Off_PHONE5setting";
				
			
			
				name5setting = "ORl_PHONE5setting";
				
			
			
				name5setting = "OuuG_PHONE5setting";
				
			
		
				name5setting = "Ogff_PHONE5setting";
				
			
			
				name5setting = "USER_POSITION5setting";
				
			
			
				name5setting = "ORG_CODE_OKATO5setting";
				
			
			
				name5setting = "DEP_ADDRES5settingS";
				
			name5setting = "1USER_UID5setting";
				
				name5setting = "11USER_EMAIL5setting";
			
				name5setting = "12ORG_name5setting5setting";
			
				name5setting = "212USER_LOGIN5setting";
			
				name5setting = "111USER_FIO5setting";
			
			
				name5setting = "132ORG_CODE_IOGV5setting";
			
				name5setting = "433ORG_PHggNE5setting";
			
				name5setting = "13Off_PHONE5setting";
			
				name5setting = "43ORG_ADDRES5setting";
		
				name5setting = "234ORG_PHONE5setting";
		
				name5setting = "55ORG_Prr5setting";
			
				name5setting = "432ORG_PffE5setting";
			
				name5setting = "ORl_PHONE5setting";
			
				name5setting = "46OddPHONE5setting";
			
				name5setting = "895OffHONE5setting";
			
				name5setting = "54OuuG_PHONE5setting";
			
				name5setting = "89Ogff_PHONE5setting";
			
				name5setting = "53ORrr_PHONE5setting";
			
		
				name5setting = "6678ORyy_PHONE5setting";
			
				name5setting = "543ORG_CODE_OKATO5setting";
			
				name5setting = "56DEP_ADDRES5settingS";
			
				name5setting = "890DEP_name5setting5setting";
			
				name5setting = "700USER_POSITION5setting";
				
				name5setting = "54USER_UID5setting";
				
				name5setting = "780USER_EMAIL5setting";
			
				name5setting = "54ORG_name5setting5setting";
			
				name5setting = "7890USER_LOGIN5setting";
			
				name5setting = "700USER_FIO5setting";
			
			
				name5setting = "654ORG_CODE_IOGV5setting";
			
				name5setting = "478ORG_PHggNE5setting";
			
				name5setting = "96Off_PHONE5setting";
			
				name5setting = "574ORG_ADDRES5setting";
		
				name5setting = "489ORG_PHONE5setting";
		
				name5setting = "065ORG_Prr5setting";
			
				name5setting = "457ORG_PffE5setting";
			
				name5setting = "87ORl_PHONE5setting";
			
				name5setting = "543OddPHONE5setting";
			
				name5setting = "478OffHONE5setting";
			
				name5setting = "965OuuG_PHONE5setting";
			
				name5setting = "457Ogff_PHONE5setting";
			
				name5setting = "8678ORrr_PHONE5setting";
			
		
				name5setting = "68ORyy_PHONE5setting";
			
				name5setting = "4ORG_CODE_OKATO5setting";
			
				name5setting = "778DEP_ADDRES5settingS";
			
				name5setting = "447DEP_name5setting5setting";
			
				name5setting = "54USER_POSITION5setting";

				if (name5setting != null) {

					at.setName(name5setting);
					at.setValue (objectArray5setting[i] != null ? objectArray5setting[i]
							.toString() : "");

					atlist5setting.add(at);
				}
			}
			
			uat.setUid(uid5setting);
			uat.setAttributes(atlist5setting);

			result5setting.add(uat); 
			resultIds.put(idRec5setting, uat);

			if (usersIdsLine5setting == null) {
				usersIdsLine5setting = "'" + idRec5setting + "'";
			} else {
				usersIdsLine5setting = usersIdsLine5setting + ", '" + idRec5setting + "'";
			}
	       }
		   
		   return usersIdsLine5setting ;
	}
}
