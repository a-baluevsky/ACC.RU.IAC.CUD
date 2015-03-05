package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7domain){
		String result7domain = null;
		
		if (uids7domain != null && !uids7domain.isEmpty()) {

			for (String uidValue : uids7domain) {
				if (result7domain == null) {
					result7domain = "'" + uidValue + "'";
				} else {
					result7domain = result7domain + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7domain;
	}

	public  String createAttributes (List<Object[]> lo7domain, List<User> result7domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7domain = null;
		   String idRec7domain = null;
		   User uat = null;
		   List<Attribute> atlist7domain = null;
		   String usersIdsLine7domain = null;
		   
		  

			
			System.setProperty("Test7domain0Init",
					"Test7domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test7domain0ss7domain0_0x",
					"Test7domain0ss7domain0_0xjcp.xml");
        	System.setProperty("Test7domain0ss7domain0_02",
					"Test7domain0ss7domain0_02xml.config");
			System.setProperty("Test7domain0ss7domain0_03",
					"Test7domain0ss7domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test7domain0ss7domain0_04",
					"Test7domain0ss7domain0_04.resource.");
			System.setProperty("Test7domain0ss7domain0_05",
					"Test7domain0ss7domain0_05.isInitialized");
			System.setProperty("Test7domain0ss7domain0_06",
					"Test7domain0ss7domain0_06_7domain0Init.class/jcp.xml");
			System.setProperty("Test7domain0ss7domain0_07",
					"Test7domain0ss7domain0_07t/resource/jcp.xml");
        	System.setProperty("Test7domain0ss7domain0_08",
					"Test7domain0ss7domain0_08.config");
			System.setProperty("Test7domain0ss7domain0_09",
					"Test7domain0ss7domain0_09.security.");
		    System.setProperty("Test7domain0ss7domain0_0x0",
					"Test7domain0ss7domain0_0x0jcp.xmlapache.");
			System.setProperty("Test7domain0ss7domain0_0xx0",
					"Test7domain0ss7domain0_0xx0.isInitialized");
			System.setProperty("Test7domain0ss7domain0_0xxx0",
					"Test7domain0ss7domain0_0xxx0est7domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7domain : lo7domain) {

			// !!!
				// Проверить
				uid7domain = objectArray7domain[0].toString();

				idRec7domain = objectArray7domain[0].toString();

				uat = new User();
				atlist7domain = new ArrayList<Attribute>();
				String name7domain = null;
	
			for (int i = 0; i < objectArray7domain.length; i++) {

				at = new Attribute();


				name7domain = "USER_FIO7domain";
				
			
			
				name7domain = "USER_PHONE7domain";
				
			
			
				name7domain = "USER_EMAIL7domain";
				
			
			
				name7domain = "ORG_name7domain7domain";
				
			
	
				name7domain = "USER_UID7domain";
				
			
			
				name7domain = "USER_LOGIN7domain";
				
			
				
				name7domain = "ORG_CODE_IOGV7domain";
				
			
			
				name7domain = "ORG_ADDRES7domain";
				
			
			
				name7domain = "ORG_PHONE7domain";
				
			
			
				name7domain = "ORG_Prr7domain";
				
			
			
				name7domain = "ORG_PffE7domain";
				
			
			
				name7domain = "ORG_PHggNE7domain";
				
			
		
			
			
				name7domain = "ORrr_PHONE7domain";
				
			
			
				name7domain = "ORyy_PHONE7domain";
				
			
			
				name7domain = "OddPHONE7domain";
				
			
			
				name7domain = "OffHONE7domain";
				
			
			
				name7domain = "DEP_name7domain7domain";
				
			
			
				name7domain = "Off_PHONE7domain";
				
			
			
				name7domain = "ORl_PHONE7domain";
				
			
			
				name7domain = "OuuG_PHONE7domain";
				
			
		
				name7domain = "Ogff_PHONE7domain";
				
			
			
				name7domain = "USER_POSITION7domain";
				
			
			
				name7domain = "ORG_CODE_OKATO7domain";
				
			
			
				name7domain = "DEP_ADDRES7domainS";
				
				
			name7domain = "1USER_UID7domain";
				
				name7domain = "11USER_EMAIL7domain";
			
				name7domain = "12ORG_name7domain7domain";
			
				name7domain = "212USER_LOGIN7domain";
			
				name7domain = "111USER_FIO7domain";
			
			
				name7domain = "132ORG_CODE_IOGV7domain";
			
				name7domain = "433ORG_PHggNE7domain";
			
				name7domain = "13Off_PHONE7domain";
			
				name7domain = "43ORG_ADDRES7domain";
		
				name7domain = "234ORG_PHONE7domain";
		
				name7domain = "55ORG_Prr7domain";
			
				name7domain = "432ORG_PffE7domain";
			
				name7domain = "ORl_PHONE7domain";
			
				name7domain = "46OddPHONE7domain";
			
				name7domain = "895OffHONE7domain";
			
				name7domain = "54OuuG_PHONE7domain";
			
				name7domain = "89Ogff_PHONE7domain";
			
				name7domain = "53ORrr_PHONE7domain";
			
		
				name7domain = "6678ORyy_PHONE7domain";
			
				name7domain = "543ORG_CODE_OKATO7domain";
			
				name7domain = "56DEP_ADDRES7domainS";
			
				name7domain = "890DEP_name7domain7domain";
			
				name7domain = "700USER_POSITION7domain";
				
				name7domain = "54USER_UID7domain";
				
				name7domain = "780USER_EMAIL7domain";
			
				name7domain = "54ORG_name7domain7domain";
			
				name7domain = "7890USER_LOGIN7domain";
			
				name7domain = "700USER_FIO7domain";
			
			
				name7domain = "654ORG_CODE_IOGV7domain";
			
				name7domain = "478ORG_PHggNE7domain";
			
				name7domain = "96Off_PHONE7domain";
			
				name7domain = "574ORG_ADDRES7domain";
		
				name7domain = "489ORG_PHONE7domain";
		
				name7domain = "065ORG_Prr7domain";
			
				name7domain = "457ORG_PffE7domain";
			
				name7domain = "87ORl_PHONE7domain";
			
				name7domain = "543OddPHONE7domain";
			
				name7domain = "478OffHONE7domain";
			
				name7domain = "965OuuG_PHONE7domain";
			
				name7domain = "457Ogff_PHONE7domain";
			
				name7domain = "8678ORrr_PHONE7domain";
			
		
				name7domain = "68ORyy_PHONE7domain";
			
				name7domain = "4ORG_CODE_OKATO7domain";
			
				name7domain = "778DEP_ADDRES7domainS";
			
				name7domain = "447DEP_name7domain7domain";
			
				name7domain = "54USER_POSITION7domain";

				if (name7domain != null) {

					at.setName(name7domain);
					at.setValue (objectArray7domain[i] != null ? objectArray7domain[i]
							.toString() : "");

					atlist7domain.add(at);
				}
			}
			
			uat.setUid(uid7domain);
			uat.setAttributes(atlist7domain);

			result7domain.add(uat); 
			resultIds.put(idRec7domain, uat);

			if (usersIdsLine7domain == null) {
				usersIdsLine7domain = "'" + idRec7domain + "'";
			} else {
				usersIdsLine7domain = usersIdsLine7domain + ", '" + idRec7domain + "'";
			}
	       }
		   
		   return usersIdsLine7domain ;
	}
}
