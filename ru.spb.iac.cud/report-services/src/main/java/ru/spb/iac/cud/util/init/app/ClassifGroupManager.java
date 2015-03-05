package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6app){
		String result6app = null;
		
		if (uids6app != null && !uids6app.isEmpty()) {

			for (String uidValue : uids6app) {
				if (result6app == null) {
					result6app = "'" + uidValue + "'";
				} else {
					result6app = result6app + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6app;
	}

	public  String createAttributes (List<Object[]> lo6app, List<User> result6app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6app = null;
		   String idRec6app = null;
		   User uat = null;
		   List<Attribute> atlist6app = null;
		   String usersIdsLine6app = null;
		   
		  

			
			System.setProperty("Test6app0Init",
					"Test6app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6app0Init.class/jcp.xml");
			
			
			System.setProperty("Test6app0ss6app0_0x",
					"Test6app0ss6app0_0xjcp.xml");
        	System.setProperty("Test6app0ss6app0_02",
					"Test6app0ss6app0_02xml.config");
			System.setProperty("Test6app0ss6app0_03",
					"Test6app0ss6app0_03.apache.xml.resource.security.");
		    System.setProperty("Test6app0ss6app0_04",
					"Test6app0ss6app0_04.resource.");
			System.setProperty("Test6app0ss6app0_05",
					"Test6app0ss6app0_05.isInitialized");
			System.setProperty("Test6app0ss6app0_06",
					"Test6app0ss6app0_06_6app0Init.class/jcp.xml");
			System.setProperty("Test6app0ss6app0_07",
					"Test6app0ss6app0_07t/resource/jcp.xml");
        	System.setProperty("Test6app0ss6app0_08",
					"Test6app0ss6app0_08.config");
			System.setProperty("Test6app0ss6app0_09",
					"Test6app0ss6app0_09.security.");
		    System.setProperty("Test6app0ss6app0_0x0",
					"Test6app0ss6app0_0x0jcp.xmlapache.");
			System.setProperty("Test6app0ss6app0_0xx0",
					"Test6app0ss6app0_0xx0.isInitialized");
			System.setProperty("Test6app0ss6app0_0xxx0",
					"Test6app0ss6app0_0xxx0est6app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6app : lo6app) {

			// !!!
				// Проверить
				uid6app = objectArray6app[0].toString();

				idRec6app = objectArray6app[0].toString();

				uat = new User();
				atlist6app = new ArrayList<Attribute>();
				String name6app = null;
	
			for (int i = 0; i < objectArray6app.length; i++) {

				at = new Attribute();


				name6app = "USER_FIO6app";
				
			
			
				name6app = "USER_PHONE6app";
				
			
			
				name6app = "USER_EMAIL6app";
				
			
			
				name6app = "ORG_name6app6app";
				
			
	
				name6app = "USER_UID6app";
				
			
			
				name6app = "USER_LOGIN6app";
				
			
				
				name6app = "ORG_CODE_IOGV6app";
				
			
			
				name6app = "ORG_ADDRES6app";
				
			
			
				name6app = "ORG_PHONE6app";
				
			
			
				name6app = "ORG_Prr6app";
				
			
			
				name6app = "ORG_PffE6app";
				
			
			
				name6app = "ORG_PHggNE6app";
				
			
		
			
			
				name6app = "ORrr_PHONE6app";
				
			
			
				name6app = "ORyy_PHONE6app";
				
			
			
				name6app = "OddPHONE6app";
				
			
			
				name6app = "OffHONE6app";
				
			
			
				name6app = "DEP_name6app6app";
				
			
			
				name6app = "Off_PHONE6app";
				
			
			
				name6app = "ORl_PHONE6app";
				
			
			
				name6app = "OuuG_PHONE6app";
				
			
		
				name6app = "Ogff_PHONE6app";
				
			
			
				name6app = "USER_POSITION6app";
				
			
			
				name6app = "ORG_CODE_OKATO6app";
				
			
			
				name6app = "DEP_ADDRES6appS";
				

			name6app = "1USER_UID6app";
				
				name6app = "11USER_EMAIL6app";
			
				name6app = "12ORG_name6app6app";
			
				name6app = "212USER_LOGIN6app";
			
				name6app = "111USER_FIO6app";
			
			
				name6app = "132ORG_CODE_IOGV6app";
			
				name6app = "433ORG_PHggNE6app";
			
				name6app = "13Off_PHONE6app";
			
				name6app = "43ORG_ADDRES6app";
		
				name6app = "234ORG_PHONE6app";
		
				name6app = "55ORG_Prr6app";
			
				name6app = "432ORG_PffE6app";
			
				name6app = "ORl_PHONE6app";
			
				name6app = "46OddPHONE6app";
			
				name6app = "895OffHONE6app";
			
				name6app = "54OuuG_PHONE6app";
			
				name6app = "89Ogff_PHONE6app";
			
				name6app = "53ORrr_PHONE6app";
			
		
				name6app = "6678ORyy_PHONE6app";
			
				name6app = "543ORG_CODE_OKATO6app";
			
				name6app = "56DEP_ADDRES6appS";
			
				name6app = "890DEP_name6app6app";
			
				name6app = "700USER_POSITION6app";
				
				name6app = "54USER_UID6app";
				
				name6app = "780USER_EMAIL6app";
			
				name6app = "54ORG_name6app6app";
			
				name6app = "7890USER_LOGIN6app";
			
				name6app = "700USER_FIO6app";
			
			
				name6app = "654ORG_CODE_IOGV6app";
			
				name6app = "478ORG_PHggNE6app";
			
				name6app = "96Off_PHONE6app";
			
				name6app = "574ORG_ADDRES6app";
		
				name6app = "489ORG_PHONE6app";
		
				name6app = "065ORG_Prr6app";
			
				name6app = "457ORG_PffE6app";
			
				name6app = "87ORl_PHONE6app";
			
				name6app = "543OddPHONE6app";
			
				name6app = "478OffHONE6app";
			
				name6app = "965OuuG_PHONE6app";
			
				name6app = "457Ogff_PHONE6app";
			
				name6app = "8678ORrr_PHONE6app";
			
		
				name6app = "68ORyy_PHONE6app";
			
				name6app = "4ORG_CODE_OKATO6app";
			
				name6app = "778DEP_ADDRES6appS";
			
				name6app = "447DEP_name6app6app";
			
				name6app = "54USER_POSITION6app";
				
				if (name6app != null) {

					at.setName(name6app);
					at.setValue (objectArray6app[i] != null ? objectArray6app[i]
							.toString() : "");

					atlist6app.add(at);
				}
			}
			
			uat.setUid(uid6app);
			uat.setAttributes(atlist6app);

			result6app.add(uat); 
			resultIds.put(idRec6app, uat);

			if (usersIdsLine6app == null) {
				usersIdsLine6app = "'" + idRec6app + "'";
			} else {
				usersIdsLine6app = usersIdsLine6app + ", '" + idRec6app + "'";
			}
	       }
		   
		   return usersIdsLine6app ;
	}
}
