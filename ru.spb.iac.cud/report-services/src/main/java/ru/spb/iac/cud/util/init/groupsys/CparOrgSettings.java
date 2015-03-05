package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5groupsys){
		String result5groupsys = null;
		
		if (uids5groupsys != null && !uids5groupsys.isEmpty()) {

			for (String uidValue : uids5groupsys) {
				if (result5groupsys == null) {
					result5groupsys = "'" + uidValue + "'";
				} else {
					result5groupsys = result5groupsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result5groupsys;
	}

	public  String createAttributes (List<Object[]> lo5groupsys, List<User> result5groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5groupsys = null;
		   String idRec5groupsys = null;
		   User uat = null;
		   List<Attribute> atlist5groupsys = null;
		   String usersIdsLine5groupsys = null;
		   
		  

			
			System.setProperty("Test5groupsys0Init",
					"Test5groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test5groupsys0ss5groupsys0_0x",
					"Test5groupsys0ss5groupsys0_0xjcp.xml");
        	System.setProperty("Test5groupsys0ss5groupsys0_02",
					"Test5groupsys0ss5groupsys0_02xml.config");
			System.setProperty("Test5groupsys0ss5groupsys0_03",
					"Test5groupsys0ss5groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test5groupsys0ss5groupsys0_04",
					"Test5groupsys0ss5groupsys0_04.resource.");
			System.setProperty("Test5groupsys0ss5groupsys0_05",
					"Test5groupsys0ss5groupsys0_05.isInitialized");
			System.setProperty("Test5groupsys0ss5groupsys0_06",
					"Test5groupsys0ss5groupsys0_06_5groupsys0Init.class/jcp.xml");
			System.setProperty("Test5groupsys0ss5groupsys0_07",
					"Test5groupsys0ss5groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test5groupsys0ss5groupsys0_08",
					"Test5groupsys0ss5groupsys0_08.config");
			System.setProperty("Test5groupsys0ss5groupsys0_09",
					"Test5groupsys0ss5groupsys0_09.security.");
		    System.setProperty("Test5groupsys0ss5groupsys0_0x0",
					"Test5groupsys0ss5groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test5groupsys0ss5groupsys0_0xx0",
					"Test5groupsys0ss5groupsys0_0xx0.isInitialized");
			System.setProperty("Test5groupsys0ss5groupsys0_0xxx0",
					"Test5groupsys0ss5groupsys0_0xxx0est5groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5groupsys : lo5groupsys) {

			// !!!
				// Проверить
				uid5groupsys = objectArray5groupsys[0].toString();

				idRec5groupsys = objectArray5groupsys[0].toString();

				uat = new User();
				atlist5groupsys = new ArrayList<Attribute>();
				String name5groupsys = null;
	
			for (int i = 0; i < objectArray5groupsys.length; i++) {

				at = new Attribute();


				name5groupsys = "USER_FIO5groupsys";
				
			
			
				name5groupsys = "USER_PHONE5groupsys";
				
			
			
				name5groupsys = "USER_EMAIL5groupsys";
				
			
			
				name5groupsys = "ORG_name5groupsys5groupsys";
				
			
	
				name5groupsys = "USER_UID5groupsys";
				
			
			
				name5groupsys = "USER_LOGIN5groupsys";
				
			
				
				name5groupsys = "ORG_CODE_IOGV5groupsys";
				
			
			
				name5groupsys = "ORG_ADDRES5groupsys";
				
			
			
				name5groupsys = "ORG_PHONE5groupsys";
				
			
			
				name5groupsys = "ORG_Prr5groupsys";
				
			
			
				name5groupsys = "ORG_PffE5groupsys";
				
			
			
				name5groupsys = "ORG_PHggNE5groupsys";
				
			
		
			
			
				name5groupsys = "ORrr_PHONE5groupsys";
				
			
			
				name5groupsys = "ORyy_PHONE5groupsys";
				
			
			
				name5groupsys = "OddPHONE5groupsys";
				
			
			
				name5groupsys = "OffHONE5groupsys";
				
			
			
				name5groupsys = "DEP_name5groupsys5groupsys";
				
			
			
				name5groupsys = "Off_PHONE5groupsys";
				
			
			
				name5groupsys = "ORl_PHONE5groupsys";
				
			
			
				name5groupsys = "OuuG_PHONE5groupsys";
				
			
		
				name5groupsys = "Ogff_PHONE5groupsys";
				
			
			
				name5groupsys = "USER_POSITION5groupsys";
				
			
			
				name5groupsys = "ORG_CODE_OKATO5groupsys";
				
			
			
				name5groupsys = "DEP_ADDRES5groupsysS";
				
			name5groupsys = "1USER_UID5groupsys";
				
				name5groupsys = "11USER_EMAIL5groupsys";
			
				name5groupsys = "12ORG_name5groupsys5groupsys";
			
				name5groupsys = "212USER_LOGIN5groupsys";
			
				name5groupsys = "111USER_FIO5groupsys";
			
			
				name5groupsys = "132ORG_CODE_IOGV5groupsys";
			
				name5groupsys = "433ORG_PHggNE5groupsys";
			
				name5groupsys = "13Off_PHONE5groupsys";
			
				name5groupsys = "43ORG_ADDRES5groupsys";
		
				name5groupsys = "234ORG_PHONE5groupsys";
		
				name5groupsys = "55ORG_Prr5groupsys";
			
				name5groupsys = "432ORG_PffE5groupsys";
			
				name5groupsys = "ORl_PHONE5groupsys";
			
				name5groupsys = "46OddPHONE5groupsys";
			
				name5groupsys = "895OffHONE5groupsys";
			
				name5groupsys = "54OuuG_PHONE5groupsys";
			
				name5groupsys = "89Ogff_PHONE5groupsys";
			
				name5groupsys = "53ORrr_PHONE5groupsys";
			
		
				name5groupsys = "6678ORyy_PHONE5groupsys";
			
				name5groupsys = "543ORG_CODE_OKATO5groupsys";
			
				name5groupsys = "56DEP_ADDRES5groupsysS";
			
				name5groupsys = "890DEP_name5groupsys5groupsys";
			
				name5groupsys = "700USER_POSITION5groupsys";
				
				name5groupsys = "54USER_UID5groupsys";
				
				name5groupsys = "780USER_EMAIL5groupsys";
			
				name5groupsys = "54ORG_name5groupsys5groupsys";
			
				name5groupsys = "7890USER_LOGIN5groupsys";
			
				name5groupsys = "700USER_FIO5groupsys";
			
			
				name5groupsys = "654ORG_CODE_IOGV5groupsys";
			
				name5groupsys = "478ORG_PHggNE5groupsys";
			
				name5groupsys = "96Off_PHONE5groupsys";
			
				name5groupsys = "574ORG_ADDRES5groupsys";
		
				name5groupsys = "489ORG_PHONE5groupsys";
		
				name5groupsys = "065ORG_Prr5groupsys";
			
				name5groupsys = "457ORG_PffE5groupsys";
			
				name5groupsys = "87ORl_PHONE5groupsys";
			
				name5groupsys = "543OddPHONE5groupsys";
			
				name5groupsys = "478OffHONE5groupsys";
			
				name5groupsys = "965OuuG_PHONE5groupsys";
			
				name5groupsys = "457Ogff_PHONE5groupsys";
			
				name5groupsys = "8678ORrr_PHONE5groupsys";
			
		
				name5groupsys = "68ORyy_PHONE5groupsys";
			
				name5groupsys = "4ORG_CODE_OKATO5groupsys";
			
				name5groupsys = "778DEP_ADDRES5groupsysS";
			
				name5groupsys = "447DEP_name5groupsys5groupsys";
			
				name5groupsys = "54USER_POSITION5groupsys";

				if (name5groupsys != null) {

					at.setName(name5groupsys);
					at.setValue (objectArray5groupsys[i] != null ? objectArray5groupsys[i]
							.toString() : "");

					atlist5groupsys.add(at);
				}
			}
			
			uat.setUid(uid5groupsys);
			uat.setAttributes(atlist5groupsys);

			result5groupsys.add(uat); 
			resultIds.put(idRec5groupsys, uat);

			if (usersIdsLine5groupsys == null) {
				usersIdsLine5groupsys = "'" + idRec5groupsys + "'";
			} else {
				usersIdsLine5groupsys = usersIdsLine5groupsys + ", '" + idRec5groupsys + "'";
			}
	       }
		   
		   return usersIdsLine5groupsys ;
	}
}
