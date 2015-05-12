package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5subsys){
		String result5subsys = null;
		
		if (uids5subsys != null && !uids5subsys.isEmpty()) {

			StringBuilder bld5subsys = new StringBuilder();

			for (String uidValue : uids5subsys) {

			  bld5subsys.append(",'").append(uidValue).append("'");

			}

			result5subsys=bld5subsys.substring(1);
		}
		
		return result5subsys;
	}

	public  String createAttributes (List<Object[]> lo5subsys, List<User> result5subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5subsys = null;
		   String idRec5subsys = null;
		   User uat = null;
		   List<Attribute> atlist5subsys = null;
		   String usersIdsLine5subsys = null;
		   
		  

			
			System.setProperty("Test5subsys0Init",
					"Test5subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test5subsys0ss5subsys0_0x",
					"Test5subsys0ss5subsys0_0xjcp.xml");
        	System.setProperty("Test5subsys0ss5subsys0_02",
					"Test5subsys0ss5subsys0_02xml.config");
			System.setProperty("Test5subsys0ss5subsys0_03",
					"Test5subsys0ss5subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test5subsys0ss5subsys0_04",
					"Test5subsys0ss5subsys0_04.resource.");
			System.setProperty("Test5subsys0ss5subsys0_05",
					"Test5subsys0ss5subsys0_05.isInitialized");
			System.setProperty("Test5subsys0ss5subsys0_06",
					"Test5subsys0ss5subsys0_06_5subsys0Init.class/jcp.xml");
			System.setProperty("Test5subsys0ss5subsys0_07",
					"Test5subsys0ss5subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test5subsys0ss5subsys0_08",
					"Test5subsys0ss5subsys0_08.config");
			System.setProperty("Test5subsys0ss5subsys0_09",
					"Test5subsys0ss5subsys0_09.security.");
		    System.setProperty("Test5subsys0ss5subsys0_0x0",
					"Test5subsys0ss5subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test5subsys0ss5subsys0_0xx0",
					"Test5subsys0ss5subsys0_0xx0.isInitialized");
			System.setProperty("Test5subsys0ss5subsys0_0xxx0",
					"Test5subsys0ss5subsys0_0xxx0est5subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5subsys : lo5subsys) {

			// !!!
				// Проверить
				uid5subsys = objectArray5subsys[0].toString();

				idRec5subsys = objectArray5subsys[0].toString();

				uat = new User();
				atlist5subsys = new ArrayList<Attribute>();
				String name5subsys = null;
	
			for (int i = 0; i < objectArray5subsys.length; i++) {

				at = new Attribute();


				name5subsys = "USER_FIO5subsys";
				
			
			
				name5subsys = "USER_PHONE5subsys";
				
			
			
				name5subsys = "USER_EMAIL5subsys";
				
			
			
				name5subsys = "ORG_name5subsys5subsys";
				
			
	
				name5subsys = "USER_UID5subsys";
				
			
			
				name5subsys = "USER_LOGIN5subsys";
				
			
				
				name5subsys = "ORG_CODE_IOGV5subsys";
				
			
			
				name5subsys = "ORG_ADDRES5subsys";
				
			
			
				name5subsys = "ORG_PHONE5subsys";
				
			
			
				name5subsys = "ORG_Prr5subsys";
				
			
			
				name5subsys = "ORG_PffE5subsys";
				
			
			
				name5subsys = "ORG_PHggNE5subsys";
				
			
		
			
			
				name5subsys = "ORrr_PHONE5subsys";
				
			
			
				name5subsys = "ORyy_PHONE5subsys";
				
			
			
				name5subsys = "OddPHONE5subsys";
				
			
			
				name5subsys = "OffHONE5subsys";
				
			
			
				name5subsys = "DEP_name5subsys5subsys";
				
			
			
				name5subsys = "Off_PHONE5subsys";
				
			
			
				name5subsys = "ORl_PHONE5subsys";
				
			
			
				name5subsys = "OuuG_PHONE5subsys";
				
			
		
				name5subsys = "Ogff_PHONE5subsys";
				
			
			
				name5subsys = "USER_POSITION5subsys";
				
			
			
				name5subsys = "ORG_CODE_OKATO5subsys";
				
			
			
				name5subsys = "DEP_ADDRES5subsysS";
				
			name5subsys = "1USER_UID5subsys";
				
				name5subsys = "11USER_EMAIL5subsys";
			
				name5subsys = "12ORG_name5subsys5subsys";
			
				name5subsys = "212USER_LOGIN5subsys";
			
				name5subsys = "111USER_FIO5subsys";
			
			
				name5subsys = "132ORG_CODE_IOGV5subsys";
			
				name5subsys = "433ORG_PHggNE5subsys";
			
				name5subsys = "13Off_PHONE5subsys";
			
				name5subsys = "43ORG_ADDRES5subsys";
		
				name5subsys = "234ORG_PHONE5subsys";
		
				name5subsys = "55ORG_Prr5subsys";
			
				name5subsys = "432ORG_PffE5subsys";
			
				name5subsys = "ORl_PHONE5subsys";
			
				name5subsys = "46OddPHONE5subsys";
			
				name5subsys = "895OffHONE5subsys";
			
				name5subsys = "54OuuG_PHONE5subsys";
			
				name5subsys = "89Ogff_PHONE5subsys";
			
				name5subsys = "53ORrr_PHONE5subsys";
			
		
				name5subsys = "6678ORyy_PHONE5subsys";
			
				name5subsys = "543ORG_CODE_OKATO5subsys";
			
				name5subsys = "56DEP_ADDRES5subsysS";
			
				name5subsys = "890DEP_name5subsys5subsys";
			
				name5subsys = "700USER_POSITION5subsys";
				
				name5subsys = "54USER_UID5subsys";
				
				name5subsys = "780USER_EMAIL5subsys";
			
				name5subsys = "54ORG_name5subsys5subsys";
			
				name5subsys = "7890USER_LOGIN5subsys";
			
				name5subsys = "700USER_FIO5subsys";
			
			
				name5subsys = "654ORG_CODE_IOGV5subsys";
			
				name5subsys = "478ORG_PHggNE5subsys";
			
				name5subsys = "96Off_PHONE5subsys";
			
				name5subsys = "574ORG_ADDRES5subsys";
		
				name5subsys = "489ORG_PHONE5subsys";
		
				name5subsys = "065ORG_Prr5subsys";
			
				name5subsys = "457ORG_PffE5subsys";
			
				name5subsys = "87ORl_PHONE5subsys";
			
				name5subsys = "543OddPHONE5subsys";
			
				name5subsys = "478OffHONE5subsys";
			
				name5subsys = "965OuuG_PHONE5subsys";
			
				name5subsys = "457Ogff_PHONE5subsys";
			
				name5subsys = "8678ORrr_PHONE5subsys";
			
		
				name5subsys = "68ORyy_PHONE5subsys";
			
				name5subsys = "4ORG_CODE_OKATO5subsys";
			
				name5subsys = "778DEP_ADDRES5subsysS";
			
				name5subsys = "447DEP_name5subsys5subsys";
			
				name5subsys = "54USER_POSITION5subsys";

				if (name5subsys != null) {

					at.setName(name5subsys);
					at.setValue (objectArray5subsys[i] != null ? objectArray5subsys[i]
							.toString() : "");

					atlist5subsys.add(at);
				}
			}
			
			uat.setUid(uid5subsys);
			uat.setAttributes(atlist5subsys);

			result5subsys.add(uat); 
			resultIds.put(idRec5subsys, uat);

			if (usersIdsLine5subsys == null) {
				usersIdsLine5subsys = "'" + idRec5subsys + "'";
			} else {
				usersIdsLine5subsys = usersIdsLine5subsys + ", '" + idRec5subsys + "'";
			}
	       }
		   
		   return usersIdsLine5subsys ;
	}
}
