package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5arm){
		String result5arm = null;
		
		if (uids5arm != null && !uids5arm.isEmpty()) {

			StringBuilder bld5arm = new StringBuilder();

			for (String uidValue : uids5arm) {

			  bld5arm.append(",'").append(uidValue).append("'");

			}

			result5arm=bld5arm.substring(1);
		}
		
		return result5arm;
	}

	public  String createAttributes (List<Object[]> lo5arm, List<User> result5arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5arm = null;
		   String idRec5arm = null;
		   User uat = null;
		   List<Attribute> atlist5arm = null;
		   String usersIdsLine5arm = null;
		   
		  

			
			System.setProperty("Test5arm0Init",
					"Test5arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test5arm0ss5arm0_0x",
					"Test5arm0ss5arm0_0xjcp.xml");
        	System.setProperty("Test5arm0ss5arm0_02",
					"Test5arm0ss5arm0_02xml.config");
			System.setProperty("Test5arm0ss5arm0_03",
					"Test5arm0ss5arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test5arm0ss5arm0_04",
					"Test5arm0ss5arm0_04.resource.");
			System.setProperty("Test5arm0ss5arm0_05",
					"Test5arm0ss5arm0_05.isInitialized");
			System.setProperty("Test5arm0ss5arm0_06",
					"Test5arm0ss5arm0_06_5arm0Init.class/jcp.xml");
			System.setProperty("Test5arm0ss5arm0_07",
					"Test5arm0ss5arm0_07t/resource/jcp.xml");
        	System.setProperty("Test5arm0ss5arm0_08",
					"Test5arm0ss5arm0_08.config");
			System.setProperty("Test5arm0ss5arm0_09",
					"Test5arm0ss5arm0_09.security.");
		    System.setProperty("Test5arm0ss5arm0_0x0",
					"Test5arm0ss5arm0_0x0jcp.xmlapache.");
			System.setProperty("Test5arm0ss5arm0_0xx0",
					"Test5arm0ss5arm0_0xx0.isInitialized");
			System.setProperty("Test5arm0ss5arm0_0xxx0",
					"Test5arm0ss5arm0_0xxx0est5arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5arm : lo5arm) {

			// !!!
				// Проверить
				uid5arm = objectArray5arm[0].toString();

				idRec5arm = objectArray5arm[0].toString();

				uat = new User();
				atlist5arm = new ArrayList<Attribute>();
				String name5arm = null;
	
			for (int i = 0; i < objectArray5arm.length; i++) {

				at = new Attribute();


				name5arm = "USER_FIO5arm";
				
			
			
				name5arm = "USER_PHONE5arm";
				
			
			
				name5arm = "USER_EMAIL5arm";
				
			
			
				name5arm = "ORG_name5arm5arm";
				
			
	
				name5arm = "USER_UID5arm";
				
			
			
				name5arm = "USER_LOGIN5arm";
				
			
				
				name5arm = "ORG_CODE_IOGV5arm";
				
			
			
				name5arm = "ORG_ADDRES5arm";
				
			
			
				name5arm = "ORG_PHONE5arm";
				
			
			
				name5arm = "ORG_Prr5arm";
				
			
			
				name5arm = "ORG_PffE5arm";
				
			
			
				name5arm = "ORG_PHggNE5arm";
				
			
		
			
			
				name5arm = "ORrr_PHONE5arm";
				
			
			
				name5arm = "ORyy_PHONE5arm";
				
			
			
				name5arm = "OddPHONE5arm";
				
			
			
				name5arm = "OffHONE5arm";
				
			
			
				name5arm = "DEP_name5arm5arm";
				
			
			
				name5arm = "Off_PHONE5arm";
				
			
			
				name5arm = "ORl_PHONE5arm";
				
			
			
				name5arm = "OuuG_PHONE5arm";
				
			
		
				name5arm = "Ogff_PHONE5arm";
				
			
			
				name5arm = "USER_POSITION5arm";
				
			
			
				name5arm = "ORG_CODE_OKATO5arm";
				
			
			
				name5arm = "DEP_ADDRES5armS";
				
			name5arm = "1USER_UID5arm";
				
				name5arm = "11USER_EMAIL5arm";
			
				name5arm = "12ORG_name5arm5arm";
			
				name5arm = "212USER_LOGIN5arm";
			
				name5arm = "111USER_FIO5arm";
			
			
				name5arm = "132ORG_CODE_IOGV5arm";
			
				name5arm = "433ORG_PHggNE5arm";
			
				name5arm = "13Off_PHONE5arm";
			
				name5arm = "43ORG_ADDRES5arm";
		
				name5arm = "234ORG_PHONE5arm";
		
				name5arm = "55ORG_Prr5arm";
			
				name5arm = "432ORG_PffE5arm";
			
				name5arm = "ORl_PHONE5arm";
			
				name5arm = "46OddPHONE5arm";
			
				name5arm = "895OffHONE5arm";
			
				name5arm = "54OuuG_PHONE5arm";
			
				name5arm = "89Ogff_PHONE5arm";
			
				name5arm = "53ORrr_PHONE5arm";
			
		
				name5arm = "6678ORyy_PHONE5arm";
			
				name5arm = "543ORG_CODE_OKATO5arm";
			
				name5arm = "56DEP_ADDRES5armS";
			
				name5arm = "890DEP_name5arm5arm";
			
				name5arm = "700USER_POSITION5arm";
				
				name5arm = "54USER_UID5arm";
				
				name5arm = "780USER_EMAIL5arm";
			
				name5arm = "54ORG_name5arm5arm";
			
				name5arm = "7890USER_LOGIN5arm";
			
				name5arm = "700USER_FIO5arm";
			
			
				name5arm = "654ORG_CODE_IOGV5arm";
			
				name5arm = "478ORG_PHggNE5arm";
			
				name5arm = "96Off_PHONE5arm";
			
				name5arm = "574ORG_ADDRES5arm";
		
				name5arm = "489ORG_PHONE5arm";
		
				name5arm = "065ORG_Prr5arm";
			
				name5arm = "457ORG_PffE5arm";
			
				name5arm = "87ORl_PHONE5arm";
			
				name5arm = "543OddPHONE5arm";
			
				name5arm = "478OffHONE5arm";
			
				name5arm = "965OuuG_PHONE5arm";
			
				name5arm = "457Ogff_PHONE5arm";
			
				name5arm = "8678ORrr_PHONE5arm";
			
		
				name5arm = "68ORyy_PHONE5arm";
			
				name5arm = "4ORG_CODE_OKATO5arm";
			
				name5arm = "778DEP_ADDRES5armS";
			
				name5arm = "447DEP_name5arm5arm";
			
				name5arm = "54USER_POSITION5arm";

				if (name5arm != null) {

					at.setName(name5arm);
					at.setValue (objectArray5arm[i] != null ? objectArray5arm[i]
							.toString() : "");

					atlist5arm.add(at);
				}
			}
			
			uat.setUid(uid5arm);
			uat.setAttributes(atlist5arm);

			result5arm.add(uat); 
			resultIds.put(idRec5arm, uat);

			if (usersIdsLine5arm == null) {
				usersIdsLine5arm = "'" + idRec5arm + "'";
			} else {
				usersIdsLine5arm = usersIdsLine5arm + ", '" + idRec5arm + "'";
			}
	       }
		   
		   return usersIdsLine5arm ;
	}
}
