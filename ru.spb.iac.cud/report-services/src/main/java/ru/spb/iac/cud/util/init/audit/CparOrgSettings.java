package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5audit){
		String result5audit = null;
		
		if (uids5audit != null && !uids5audit.isEmpty()) {

			StringBuilder bld5audit = new StringBuilder();

			for (String uidValue : uids5audit) {

			  bld5audit.append(",'").append(uidValue).append("'");

			}

			result5audit=bld5audit.substring(1);
		}
		
		return result5audit;
	}

	public  String createAttributes (List<Object[]> lo5audit, List<User> result5audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5audit = null;
		   String idRec5audit = null;
		   User uat = null;
		   List<Attribute> atlist5audit = null;
		   String usersIdsLine5audit = null;
		   
		  

			
			System.setProperty("Test5audit0Init",
					"Test5audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test5audit0ss5audit0_0x",
					"Test5audit0ss5audit0_0xjcp.xml");
        	System.setProperty("Test5audit0ss5audit0_02",
					"Test5audit0ss5audit0_02xml.config");
			System.setProperty("Test5audit0ss5audit0_03",
					"Test5audit0ss5audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test5audit0ss5audit0_04",
					"Test5audit0ss5audit0_04.resource.");
			System.setProperty("Test5audit0ss5audit0_05",
					"Test5audit0ss5audit0_05.isInitialized");
			System.setProperty("Test5audit0ss5audit0_06",
					"Test5audit0ss5audit0_06_5audit0Init.class/jcp.xml");
			System.setProperty("Test5audit0ss5audit0_07",
					"Test5audit0ss5audit0_07t/resource/jcp.xml");
        	System.setProperty("Test5audit0ss5audit0_08",
					"Test5audit0ss5audit0_08.config");
			System.setProperty("Test5audit0ss5audit0_09",
					"Test5audit0ss5audit0_09.security.");
		    System.setProperty("Test5audit0ss5audit0_0x0",
					"Test5audit0ss5audit0_0x0jcp.xmlapache.");
			System.setProperty("Test5audit0ss5audit0_0xx0",
					"Test5audit0ss5audit0_0xx0.isInitialized");
			System.setProperty("Test5audit0ss5audit0_0xxx0",
					"Test5audit0ss5audit0_0xxx0est5audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5audit : lo5audit) {

			// !!!
				// Проверить
				uid5audit = objectArray5audit[0].toString();

				idRec5audit = objectArray5audit[0].toString();

				uat = new User();
				atlist5audit = new ArrayList<Attribute>();
				String name5audit = null;
	
			for (int i = 0; i < objectArray5audit.length; i++) {

				at = new Attribute();


				name5audit = "USER_FIO5audit";
				
			
			
				name5audit = "USER_PHONE5audit";
				
			
			
				name5audit = "USER_EMAIL5audit";
				
			
			
				name5audit = "ORG_name5audit5audit";
				
			
	
				name5audit = "USER_UID5audit";
				
			
			
				name5audit = "USER_LOGIN5audit";
				
			
				
				name5audit = "ORG_CODE_IOGV5audit";
				
			
			
				name5audit = "ORG_ADDRES5audit";
				
			
			
				name5audit = "ORG_PHONE5audit";
				
			
			
				name5audit = "ORG_Prr5audit";
				
			
			
				name5audit = "ORG_PffE5audit";
				
			
			
				name5audit = "ORG_PHggNE5audit";
				
			
		
			
			
				name5audit = "ORrr_PHONE5audit";
				
			
			
				name5audit = "ORyy_PHONE5audit";
				
			
			
				name5audit = "OddPHONE5audit";
				
			
			
				name5audit = "OffHONE5audit";
				
			
			
				name5audit = "DEP_name5audit5audit";
				
			
			
				name5audit = "Off_PHONE5audit";
				
			
			
				name5audit = "ORl_PHONE5audit";
				
			
			
				name5audit = "OuuG_PHONE5audit";
				
			
		
				name5audit = "Ogff_PHONE5audit";
				
			
			
				name5audit = "USER_POSITION5audit";
				
			
			
				name5audit = "ORG_CODE_OKATO5audit";
				
			
			
				name5audit = "DEP_ADDRES5auditS";
				
			name5audit = "1USER_UID5audit";
				
				name5audit = "11USER_EMAIL5audit";
			
				name5audit = "12ORG_name5audit5audit";
			
				name5audit = "212USER_LOGIN5audit";
			
				name5audit = "111USER_FIO5audit";
			
			
				name5audit = "132ORG_CODE_IOGV5audit";
			
				name5audit = "433ORG_PHggNE5audit";
			
				name5audit = "13Off_PHONE5audit";
			
				name5audit = "43ORG_ADDRES5audit";
		
				name5audit = "234ORG_PHONE5audit";
		
				name5audit = "55ORG_Prr5audit";
			
				name5audit = "432ORG_PffE5audit";
			
				name5audit = "ORl_PHONE5audit";
			
				name5audit = "46OddPHONE5audit";
			
				name5audit = "895OffHONE5audit";
			
				name5audit = "54OuuG_PHONE5audit";
			
				name5audit = "89Ogff_PHONE5audit";
			
				name5audit = "53ORrr_PHONE5audit";
			
		
				name5audit = "6678ORyy_PHONE5audit";
			
				name5audit = "543ORG_CODE_OKATO5audit";
			
				name5audit = "56DEP_ADDRES5auditS";
			
				name5audit = "890DEP_name5audit5audit";
			
				name5audit = "700USER_POSITION5audit";
				
				name5audit = "54USER_UID5audit";
				
				name5audit = "780USER_EMAIL5audit";
			
				name5audit = "54ORG_name5audit5audit";
			
				name5audit = "7890USER_LOGIN5audit";
			
				name5audit = "700USER_FIO5audit";
			
			
				name5audit = "654ORG_CODE_IOGV5audit";
			
				name5audit = "478ORG_PHggNE5audit";
			
				name5audit = "96Off_PHONE5audit";
			
				name5audit = "574ORG_ADDRES5audit";
		
				name5audit = "489ORG_PHONE5audit";
		
				name5audit = "065ORG_Prr5audit";
			
				name5audit = "457ORG_PffE5audit";
			
				name5audit = "87ORl_PHONE5audit";
			
				name5audit = "543OddPHONE5audit";
			
				name5audit = "478OffHONE5audit";
			
				name5audit = "965OuuG_PHONE5audit";
			
				name5audit = "457Ogff_PHONE5audit";
			
				name5audit = "8678ORrr_PHONE5audit";
			
		
				name5audit = "68ORyy_PHONE5audit";
			
				name5audit = "4ORG_CODE_OKATO5audit";
			
				name5audit = "778DEP_ADDRES5auditS";
			
				name5audit = "447DEP_name5audit5audit";
			
				name5audit = "54USER_POSITION5audit";

				if (name5audit != null) {

					at.setName(name5audit);
					at.setValue (objectArray5audit[i] != null ? objectArray5audit[i]
							.toString() : "");

					atlist5audit.add(at);
				}
			}
			
			uat.setUid(uid5audit);
			uat.setAttributes(atlist5audit);

			result5audit.add(uat); 
			resultIds.put(idRec5audit, uat);

			if (usersIdsLine5audit == null) {
				usersIdsLine5audit = "'" + idRec5audit + "'";
			} else {
				usersIdsLine5audit = usersIdsLine5audit + ", '" + idRec5audit + "'";
			}
	       }
		   
		   return usersIdsLine5audit ;
	}
}
