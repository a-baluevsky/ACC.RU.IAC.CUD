package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5role){
		String result5role = null;
		
		if (uids5role != null && !uids5role.isEmpty()) {

			StringBuilder bld5role = new StringBuilder();

			for (String uidValue : uids5role) {

			  bld5role.append(",'").append(uidValue).append("'");

			}

			result5role=bld5role.substring(1);
		}
		
		return result5role;
	}

	public  String createAttributes (List<Object[]> lo5role, List<User> result5role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5role = null;
		   String idRec5role = null;
		   User uat = null;
		   List<Attribute> atlist5role = null;
		   String usersIdsLine5role = null;
		   
		  

			
			System.setProperty("Test5role0Init",
					"Test5role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5role0Init.class/jcp.xml");
			
			
			System.setProperty("Test5role0ss5role0_0x",
					"Test5role0ss5role0_0xjcp.xml");
        	System.setProperty("Test5role0ss5role0_02",
					"Test5role0ss5role0_02xml.config");
			System.setProperty("Test5role0ss5role0_03",
					"Test5role0ss5role0_03.apache.xml.resource.security.");
		    System.setProperty("Test5role0ss5role0_04",
					"Test5role0ss5role0_04.resource.");
			System.setProperty("Test5role0ss5role0_05",
					"Test5role0ss5role0_05.isInitialized");
			System.setProperty("Test5role0ss5role0_06",
					"Test5role0ss5role0_06_5role0Init.class/jcp.xml");
			System.setProperty("Test5role0ss5role0_07",
					"Test5role0ss5role0_07t/resource/jcp.xml");
        	System.setProperty("Test5role0ss5role0_08",
					"Test5role0ss5role0_08.config");
			System.setProperty("Test5role0ss5role0_09",
					"Test5role0ss5role0_09.security.");
		    System.setProperty("Test5role0ss5role0_0x0",
					"Test5role0ss5role0_0x0jcp.xmlapache.");
			System.setProperty("Test5role0ss5role0_0xx0",
					"Test5role0ss5role0_0xx0.isInitialized");
			System.setProperty("Test5role0ss5role0_0xxx0",
					"Test5role0ss5role0_0xxx0est5role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5role : lo5role) {

			// !!!
				// Проверить
				uid5role = objectArray5role[0].toString();

				idRec5role = objectArray5role[0].toString();

				uat = new User();
				atlist5role = new ArrayList<Attribute>();
				String name5role = null;
	
			for (int i = 0; i < objectArray5role.length; i++) {

				at = new Attribute();


				name5role = "USER_FIO5role";
				
			
			
				name5role = "USER_PHONE5role";
				
			
			
				name5role = "USER_EMAIL5role";
				
			
			
				name5role = "ORG_name5role5role";
				
			
	
				name5role = "USER_UID5role";
				
			
			
				name5role = "USER_LOGIN5role";
				
			
				
				name5role = "ORG_CODE_IOGV5role";
				
			
			
				name5role = "ORG_ADDRES5role";
				
			
			
				name5role = "ORG_PHONE5role";
				
			
			
				name5role = "ORG_Prr5role";
				
			
			
				name5role = "ORG_PffE5role";
				
			
			
				name5role = "ORG_PHggNE5role";
				
			
		
			
			
				name5role = "ORrr_PHONE5role";
				
			
			
				name5role = "ORyy_PHONE5role";
				
			
			
				name5role = "OddPHONE5role";
				
			
			
				name5role = "OffHONE5role";
				
			
			
				name5role = "DEP_name5role5role";
				
			
			
				name5role = "Off_PHONE5role";
				
			
			
				name5role = "ORl_PHONE5role";
				
			
			
				name5role = "OuuG_PHONE5role";
				
			
		
				name5role = "Ogff_PHONE5role";
				
			
			
				name5role = "USER_POSITION5role";
				
			
			
				name5role = "ORG_CODE_OKATO5role";
				
			
			
				name5role = "DEP_ADDRES5roleS";
				
			name5role = "1USER_UID5role";
				
				name5role = "11USER_EMAIL5role";
			
				name5role = "12ORG_name5role5role";
			
				name5role = "212USER_LOGIN5role";
			
				name5role = "111USER_FIO5role";
			
			
				name5role = "132ORG_CODE_IOGV5role";
			
				name5role = "433ORG_PHggNE5role";
			
				name5role = "13Off_PHONE5role";
			
				name5role = "43ORG_ADDRES5role";
		
				name5role = "234ORG_PHONE5role";
		
				name5role = "55ORG_Prr5role";
			
				name5role = "432ORG_PffE5role";
			
				name5role = "ORl_PHONE5role";
			
				name5role = "46OddPHONE5role";
			
				name5role = "895OffHONE5role";
			
				name5role = "54OuuG_PHONE5role";
			
				name5role = "89Ogff_PHONE5role";
			
				name5role = "53ORrr_PHONE5role";
			
		
				name5role = "6678ORyy_PHONE5role";
			
				name5role = "543ORG_CODE_OKATO5role";
			
				name5role = "56DEP_ADDRES5roleS";
			
				name5role = "890DEP_name5role5role";
			
				name5role = "700USER_POSITION5role";
				
				name5role = "54USER_UID5role";
				
				name5role = "780USER_EMAIL5role";
			
				name5role = "54ORG_name5role5role";
			
				name5role = "7890USER_LOGIN5role";
			
				name5role = "700USER_FIO5role";
			
			
				name5role = "654ORG_CODE_IOGV5role";
			
				name5role = "478ORG_PHggNE5role";
			
				name5role = "96Off_PHONE5role";
			
				name5role = "574ORG_ADDRES5role";
		
				name5role = "489ORG_PHONE5role";
		
				name5role = "065ORG_Prr5role";
			
				name5role = "457ORG_PffE5role";
			
				name5role = "87ORl_PHONE5role";
			
				name5role = "543OddPHONE5role";
			
				name5role = "478OffHONE5role";
			
				name5role = "965OuuG_PHONE5role";
			
				name5role = "457Ogff_PHONE5role";
			
				name5role = "8678ORrr_PHONE5role";
			
		
				name5role = "68ORyy_PHONE5role";
			
				name5role = "4ORG_CODE_OKATO5role";
			
				name5role = "778DEP_ADDRES5roleS";
			
				name5role = "447DEP_name5role5role";
			
				name5role = "54USER_POSITION5role";

				if (name5role != null) {

					at.setName(name5role);
					at.setValue (objectArray5role[i] != null ? objectArray5role[i]
							.toString() : "");

					atlist5role.add(at);
				}
			}
			
			uat.setUid(uid5role);
			uat.setAttributes(atlist5role);

			result5role.add(uat); 
			resultIds.put(idRec5role, uat);

			if (usersIdsLine5role == null) {
				usersIdsLine5role = "'" + idRec5role + "'";
			} else {
				usersIdsLine5role = usersIdsLine5role + ", '" + idRec5role + "'";
			}
	       }
		   
		   return usersIdsLine5role ;
	}
}
