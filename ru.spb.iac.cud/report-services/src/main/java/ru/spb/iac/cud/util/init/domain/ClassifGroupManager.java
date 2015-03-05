package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6domain){
		String result6domain = null;
		
		if (uids6domain != null && !uids6domain.isEmpty()) {

			for (String uidValue : uids6domain) {
				if (result6domain == null) {
					result6domain = "'" + uidValue + "'";
				} else {
					result6domain = result6domain + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6domain;
	}

	public  String createAttributes (List<Object[]> lo6domain, List<User> result6domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6domain = null;
		   String idRec6domain = null;
		   User uat = null;
		   List<Attribute> atlist6domain = null;
		   String usersIdsLine6domain = null;
		   
		  

			
			System.setProperty("Test6domain0Init",
					"Test6domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test6domain0ss6domain0_0x",
					"Test6domain0ss6domain0_0xjcp.xml");
        	System.setProperty("Test6domain0ss6domain0_02",
					"Test6domain0ss6domain0_02xml.config");
			System.setProperty("Test6domain0ss6domain0_03",
					"Test6domain0ss6domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test6domain0ss6domain0_04",
					"Test6domain0ss6domain0_04.resource.");
			System.setProperty("Test6domain0ss6domain0_05",
					"Test6domain0ss6domain0_05.isInitialized");
			System.setProperty("Test6domain0ss6domain0_06",
					"Test6domain0ss6domain0_06_6domain0Init.class/jcp.xml");
			System.setProperty("Test6domain0ss6domain0_07",
					"Test6domain0ss6domain0_07t/resource/jcp.xml");
        	System.setProperty("Test6domain0ss6domain0_08",
					"Test6domain0ss6domain0_08.config");
			System.setProperty("Test6domain0ss6domain0_09",
					"Test6domain0ss6domain0_09.security.");
		    System.setProperty("Test6domain0ss6domain0_0x0",
					"Test6domain0ss6domain0_0x0jcp.xmlapache.");
			System.setProperty("Test6domain0ss6domain0_0xx0",
					"Test6domain0ss6domain0_0xx0.isInitialized");
			System.setProperty("Test6domain0ss6domain0_0xxx0",
					"Test6domain0ss6domain0_0xxx0est6domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6domain : lo6domain) {

			// !!!
				// Проверить
				uid6domain = objectArray6domain[0].toString();

				idRec6domain = objectArray6domain[0].toString();

				uat = new User();
				atlist6domain = new ArrayList<Attribute>();
				String name6domain = null;
	
			for (int i = 0; i < objectArray6domain.length; i++) {

				at = new Attribute();


				name6domain = "USER_FIO6domain";
				
			
			
				name6domain = "USER_PHONE6domain";
				
			
			
				name6domain = "USER_EMAIL6domain";
				
			
			
				name6domain = "ORG_name6domain6domain";
				
			
	
				name6domain = "USER_UID6domain";
				
			
			
				name6domain = "USER_LOGIN6domain";
				
			
				
				name6domain = "ORG_CODE_IOGV6domain";
				
			
			
				name6domain = "ORG_ADDRES6domain";
				
			
			
				name6domain = "ORG_PHONE6domain";
				
			
			
				name6domain = "ORG_Prr6domain";
				
			
			
				name6domain = "ORG_PffE6domain";
				
			
			
				name6domain = "ORG_PHggNE6domain";
				
			
		
			
			
				name6domain = "ORrr_PHONE6domain";
				
			
			
				name6domain = "ORyy_PHONE6domain";
				
			
			
				name6domain = "OddPHONE6domain";
				
			
			
				name6domain = "OffHONE6domain";
				
			
			
				name6domain = "DEP_name6domain6domain";
				
			
			
				name6domain = "Off_PHONE6domain";
				
			
			
				name6domain = "ORl_PHONE6domain";
				
			
			
				name6domain = "OuuG_PHONE6domain";
				
			
		
				name6domain = "Ogff_PHONE6domain";
				
			
			
				name6domain = "USER_POSITION6domain";
				
			
			
				name6domain = "ORG_CODE_OKATO6domain";
				
			
			
				name6domain = "DEP_ADDRES6domainS";
				

			name6domain = "1USER_UID6domain";
				
				name6domain = "11USER_EMAIL6domain";
			
				name6domain = "12ORG_name6domain6domain";
			
				name6domain = "212USER_LOGIN6domain";
			
				name6domain = "111USER_FIO6domain";
			
			
				name6domain = "132ORG_CODE_IOGV6domain";
			
				name6domain = "433ORG_PHggNE6domain";
			
				name6domain = "13Off_PHONE6domain";
			
				name6domain = "43ORG_ADDRES6domain";
		
				name6domain = "234ORG_PHONE6domain";
		
				name6domain = "55ORG_Prr6domain";
			
				name6domain = "432ORG_PffE6domain";
			
				name6domain = "ORl_PHONE6domain";
			
				name6domain = "46OddPHONE6domain";
			
				name6domain = "895OffHONE6domain";
			
				name6domain = "54OuuG_PHONE6domain";
			
				name6domain = "89Ogff_PHONE6domain";
			
				name6domain = "53ORrr_PHONE6domain";
			
		
				name6domain = "6678ORyy_PHONE6domain";
			
				name6domain = "543ORG_CODE_OKATO6domain";
			
				name6domain = "56DEP_ADDRES6domainS";
			
				name6domain = "890DEP_name6domain6domain";
			
				name6domain = "700USER_POSITION6domain";
				
				name6domain = "54USER_UID6domain";
				
				name6domain = "780USER_EMAIL6domain";
			
				name6domain = "54ORG_name6domain6domain";
			
				name6domain = "7890USER_LOGIN6domain";
			
				name6domain = "700USER_FIO6domain";
			
			
				name6domain = "654ORG_CODE_IOGV6domain";
			
				name6domain = "478ORG_PHggNE6domain";
			
				name6domain = "96Off_PHONE6domain";
			
				name6domain = "574ORG_ADDRES6domain";
		
				name6domain = "489ORG_PHONE6domain";
		
				name6domain = "065ORG_Prr6domain";
			
				name6domain = "457ORG_PffE6domain";
			
				name6domain = "87ORl_PHONE6domain";
			
				name6domain = "543OddPHONE6domain";
			
				name6domain = "478OffHONE6domain";
			
				name6domain = "965OuuG_PHONE6domain";
			
				name6domain = "457Ogff_PHONE6domain";
			
				name6domain = "8678ORrr_PHONE6domain";
			
		
				name6domain = "68ORyy_PHONE6domain";
			
				name6domain = "4ORG_CODE_OKATO6domain";
			
				name6domain = "778DEP_ADDRES6domainS";
			
				name6domain = "447DEP_name6domain6domain";
			
				name6domain = "54USER_POSITION6domain";
				
				if (name6domain != null) {

					at.setName(name6domain);
					at.setValue (objectArray6domain[i] != null ? objectArray6domain[i]
							.toString() : "");

					atlist6domain.add(at);
				}
			}
			
			uat.setUid(uid6domain);
			uat.setAttributes(atlist6domain);

			result6domain.add(uat); 
			resultIds.put(idRec6domain, uat);

			if (usersIdsLine6domain == null) {
				usersIdsLine6domain = "'" + idRec6domain + "'";
			} else {
				usersIdsLine6domain = usersIdsLine6domain + ", '" + idRec6domain + "'";
			}
	       }
		   
		   return usersIdsLine6domain ;
	}
}
