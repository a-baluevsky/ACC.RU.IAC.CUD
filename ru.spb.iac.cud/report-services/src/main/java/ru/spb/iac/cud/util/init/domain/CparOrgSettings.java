package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5domain){
		String result5domain = null;
		
		if (uids5domain != null && !uids5domain.isEmpty()) {

			for (String uidValue : uids5domain) {
				if (result5domain == null) {
					result5domain = "'" + uidValue + "'";
				} else {
					result5domain = result5domain + ", '" + uidValue + "'";
				}
			}
		}
		
		return result5domain;
	}

	public  String createAttributes (List<Object[]> lo5domain, List<User> result5domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5domain = null;
		   String idRec5domain = null;
		   User uat = null;
		   List<Attribute> atlist5domain = null;
		   String usersIdsLine5domain = null;
		   
		  

			
			System.setProperty("Test5domain0Init",
					"Test5domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test5domain0ss5domain0_0x",
					"Test5domain0ss5domain0_0xjcp.xml");
        	System.setProperty("Test5domain0ss5domain0_02",
					"Test5domain0ss5domain0_02xml.config");
			System.setProperty("Test5domain0ss5domain0_03",
					"Test5domain0ss5domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test5domain0ss5domain0_04",
					"Test5domain0ss5domain0_04.resource.");
			System.setProperty("Test5domain0ss5domain0_05",
					"Test5domain0ss5domain0_05.isInitialized");
			System.setProperty("Test5domain0ss5domain0_06",
					"Test5domain0ss5domain0_06_5domain0Init.class/jcp.xml");
			System.setProperty("Test5domain0ss5domain0_07",
					"Test5domain0ss5domain0_07t/resource/jcp.xml");
        	System.setProperty("Test5domain0ss5domain0_08",
					"Test5domain0ss5domain0_08.config");
			System.setProperty("Test5domain0ss5domain0_09",
					"Test5domain0ss5domain0_09.security.");
		    System.setProperty("Test5domain0ss5domain0_0x0",
					"Test5domain0ss5domain0_0x0jcp.xmlapache.");
			System.setProperty("Test5domain0ss5domain0_0xx0",
					"Test5domain0ss5domain0_0xx0.isInitialized");
			System.setProperty("Test5domain0ss5domain0_0xxx0",
					"Test5domain0ss5domain0_0xxx0est5domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5domain : lo5domain) {

			// !!!
				// Проверить
				uid5domain = objectArray5domain[0].toString();

				idRec5domain = objectArray5domain[0].toString();

				uat = new User();
				atlist5domain = new ArrayList<Attribute>();
				String name5domain = null;
	
			for (int i = 0; i < objectArray5domain.length; i++) {

				at = new Attribute();


				name5domain = "USER_FIO5domain";
				
			
			
				name5domain = "USER_PHONE5domain";
				
			
			
				name5domain = "USER_EMAIL5domain";
				
			
			
				name5domain = "ORG_name5domain5domain";
				
			
	
				name5domain = "USER_UID5domain";
				
			
			
				name5domain = "USER_LOGIN5domain";
				
			
				
				name5domain = "ORG_CODE_IOGV5domain";
				
			
			
				name5domain = "ORG_ADDRES5domain";
				
			
			
				name5domain = "ORG_PHONE5domain";
				
			
			
				name5domain = "ORG_Prr5domain";
				
			
			
				name5domain = "ORG_PffE5domain";
				
			
			
				name5domain = "ORG_PHggNE5domain";
				
			
		
			
			
				name5domain = "ORrr_PHONE5domain";
				
			
			
				name5domain = "ORyy_PHONE5domain";
				
			
			
				name5domain = "OddPHONE5domain";
				
			
			
				name5domain = "OffHONE5domain";
				
			
			
				name5domain = "DEP_name5domain5domain";
				
			
			
				name5domain = "Off_PHONE5domain";
				
			
			
				name5domain = "ORl_PHONE5domain";
				
			
			
				name5domain = "OuuG_PHONE5domain";
				
			
		
				name5domain = "Ogff_PHONE5domain";
				
			
			
				name5domain = "USER_POSITION5domain";
				
			
			
				name5domain = "ORG_CODE_OKATO5domain";
				
			
			
				name5domain = "DEP_ADDRES5domainS";
				
			name5domain = "1USER_UID5domain";
				
				name5domain = "11USER_EMAIL5domain";
			
				name5domain = "12ORG_name5domain5domain";
			
				name5domain = "212USER_LOGIN5domain";
			
				name5domain = "111USER_FIO5domain";
			
			
				name5domain = "132ORG_CODE_IOGV5domain";
			
				name5domain = "433ORG_PHggNE5domain";
			
				name5domain = "13Off_PHONE5domain";
			
				name5domain = "43ORG_ADDRES5domain";
		
				name5domain = "234ORG_PHONE5domain";
		
				name5domain = "55ORG_Prr5domain";
			
				name5domain = "432ORG_PffE5domain";
			
				name5domain = "ORl_PHONE5domain";
			
				name5domain = "46OddPHONE5domain";
			
				name5domain = "895OffHONE5domain";
			
				name5domain = "54OuuG_PHONE5domain";
			
				name5domain = "89Ogff_PHONE5domain";
			
				name5domain = "53ORrr_PHONE5domain";
			
		
				name5domain = "6678ORyy_PHONE5domain";
			
				name5domain = "543ORG_CODE_OKATO5domain";
			
				name5domain = "56DEP_ADDRES5domainS";
			
				name5domain = "890DEP_name5domain5domain";
			
				name5domain = "700USER_POSITION5domain";
				
				name5domain = "54USER_UID5domain";
				
				name5domain = "780USER_EMAIL5domain";
			
				name5domain = "54ORG_name5domain5domain";
			
				name5domain = "7890USER_LOGIN5domain";
			
				name5domain = "700USER_FIO5domain";
			
			
				name5domain = "654ORG_CODE_IOGV5domain";
			
				name5domain = "478ORG_PHggNE5domain";
			
				name5domain = "96Off_PHONE5domain";
			
				name5domain = "574ORG_ADDRES5domain";
		
				name5domain = "489ORG_PHONE5domain";
		
				name5domain = "065ORG_Prr5domain";
			
				name5domain = "457ORG_PffE5domain";
			
				name5domain = "87ORl_PHONE5domain";
			
				name5domain = "543OddPHONE5domain";
			
				name5domain = "478OffHONE5domain";
			
				name5domain = "965OuuG_PHONE5domain";
			
				name5domain = "457Ogff_PHONE5domain";
			
				name5domain = "8678ORrr_PHONE5domain";
			
		
				name5domain = "68ORyy_PHONE5domain";
			
				name5domain = "4ORG_CODE_OKATO5domain";
			
				name5domain = "778DEP_ADDRES5domainS";
			
				name5domain = "447DEP_name5domain5domain";
			
				name5domain = "54USER_POSITION5domain";

				if (name5domain != null) {

					at.setName(name5domain);
					at.setValue (objectArray5domain[i] != null ? objectArray5domain[i]
							.toString() : "");

					atlist5domain.add(at);
				}
			}
			
			uat.setUid(uid5domain);
			uat.setAttributes(atlist5domain);

			result5domain.add(uat); 
			resultIds.put(idRec5domain, uat);

			if (usersIdsLine5domain == null) {
				usersIdsLine5domain = "'" + idRec5domain + "'";
			} else {
				usersIdsLine5domain = usersIdsLine5domain + ", '" + idRec5domain + "'";
			}
	       }
		   
		   return usersIdsLine5domain ;
	}
}
