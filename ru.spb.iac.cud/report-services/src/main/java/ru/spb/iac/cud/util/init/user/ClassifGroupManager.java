package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6user){
		String result6user = null;
		
		if (uids6user != null && !uids6user.isEmpty()) {

			for (String uidValue : uids6user) {
				if (result6user == null) {
					result6user = "'" + uidValue + "'";
				} else {
					result6user = result6user + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6user;
	}

	public  String createAttributes (List<Object[]> lo6user, List<User> result6user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6user = null;
		   String idRec6user = null;
		   User uat = null;
		   List<Attribute> atlist6user = null;
		   String usersIdsLine6user = null;
		   
		  

			
			System.setProperty("Test6user0Init",
					"Test6user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6user0Init.class/jcp.xml");
			
			
			System.setProperty("Test6user0ss6user0_0x",
					"Test6user0ss6user0_0xjcp.xml");
        	System.setProperty("Test6user0ss6user0_02",
					"Test6user0ss6user0_02xml.config");
			System.setProperty("Test6user0ss6user0_03",
					"Test6user0ss6user0_03.apache.xml.resource.security.");
		    System.setProperty("Test6user0ss6user0_04",
					"Test6user0ss6user0_04.resource.");
			System.setProperty("Test6user0ss6user0_05",
					"Test6user0ss6user0_05.isInitialized");
			System.setProperty("Test6user0ss6user0_06",
					"Test6user0ss6user0_06_6user0Init.class/jcp.xml");
			System.setProperty("Test6user0ss6user0_07",
					"Test6user0ss6user0_07t/resource/jcp.xml");
        	System.setProperty("Test6user0ss6user0_08",
					"Test6user0ss6user0_08.config");
			System.setProperty("Test6user0ss6user0_09",
					"Test6user0ss6user0_09.security.");
		    System.setProperty("Test6user0ss6user0_0x0",
					"Test6user0ss6user0_0x0jcp.xmlapache.");
			System.setProperty("Test6user0ss6user0_0xx0",
					"Test6user0ss6user0_0xx0.isInitialized");
			System.setProperty("Test6user0ss6user0_0xxx0",
					"Test6user0ss6user0_0xxx0est6user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6user : lo6user) {

			// !!!
				// Проверить
				uid6user = objectArray6user[0].toString();

				idRec6user = objectArray6user[0].toString();

				uat = new User();
				atlist6user = new ArrayList<Attribute>();
				String name6user = null;
	
			for (int i = 0; i < objectArray6user.length; i++) {

				at = new Attribute();


				name6user = "USER_FIO6user";
				
			
			
				name6user = "USER_PHONE6user";
				
			
			
				name6user = "USER_EMAIL6user";
				
			
			
				name6user = "ORG_name6user6user";
				
			
	
				name6user = "USER_UID6user";
				
			
			
				name6user = "USER_LOGIN6user";
				
			
				
				name6user = "ORG_CODE_IOGV6user";
				
			
			
				name6user = "ORG_ADDRES6user";
				
			
			
				name6user = "ORG_PHONE6user";
				
			
			
				name6user = "ORG_Prr6user";
				
			
			
				name6user = "ORG_PffE6user";
				
			
			
				name6user = "ORG_PHggNE6user";
				
			
		
			
			
				name6user = "ORrr_PHONE6user";
				
			
			
				name6user = "ORyy_PHONE6user";
				
			
			
				name6user = "OddPHONE6user";
				
			
			
				name6user = "OffHONE6user";
				
			
			
				name6user = "DEP_name6user6user";
				
			
			
				name6user = "Off_PHONE6user";
				
			
			
				name6user = "ORl_PHONE6user";
				
			
			
				name6user = "OuuG_PHONE6user";
				
			
		
				name6user = "Ogff_PHONE6user";
				
			
			
				name6user = "USER_POSITION6user";
				
			
			
				name6user = "ORG_CODE_OKATO6user";
				
			
			
				name6user = "DEP_ADDRES6userS";
				

			name6user = "1USER_UID6user";
				
				name6user = "11USER_EMAIL6user";
			
				name6user = "12ORG_name6user6user";
			
				name6user = "212USER_LOGIN6user";
			
				name6user = "111USER_FIO6user";
			
			
				name6user = "132ORG_CODE_IOGV6user";
			
				name6user = "433ORG_PHggNE6user";
			
				name6user = "13Off_PHONE6user";
			
				name6user = "43ORG_ADDRES6user";
		
				name6user = "234ORG_PHONE6user";
		
				name6user = "55ORG_Prr6user";
			
				name6user = "432ORG_PffE6user";
			
				name6user = "ORl_PHONE6user";
			
				name6user = "46OddPHONE6user";
			
				name6user = "895OffHONE6user";
			
				name6user = "54OuuG_PHONE6user";
			
				name6user = "89Ogff_PHONE6user";
			
				name6user = "53ORrr_PHONE6user";
			
		
				name6user = "6678ORyy_PHONE6user";
			
				name6user = "543ORG_CODE_OKATO6user";
			
				name6user = "56DEP_ADDRES6userS";
			
				name6user = "890DEP_name6user6user";
			
				name6user = "700USER_POSITION6user";
				
				name6user = "54USER_UID6user";
				
				name6user = "780USER_EMAIL6user";
			
				name6user = "54ORG_name6user6user";
			
				name6user = "7890USER_LOGIN6user";
			
				name6user = "700USER_FIO6user";
			
			
				name6user = "654ORG_CODE_IOGV6user";
			
				name6user = "478ORG_PHggNE6user";
			
				name6user = "96Off_PHONE6user";
			
				name6user = "574ORG_ADDRES6user";
		
				name6user = "489ORG_PHONE6user";
		
				name6user = "065ORG_Prr6user";
			
				name6user = "457ORG_PffE6user";
			
				name6user = "87ORl_PHONE6user";
			
				name6user = "543OddPHONE6user";
			
				name6user = "478OffHONE6user";
			
				name6user = "965OuuG_PHONE6user";
			
				name6user = "457Ogff_PHONE6user";
			
				name6user = "8678ORrr_PHONE6user";
			
		
				name6user = "68ORyy_PHONE6user";
			
				name6user = "4ORG_CODE_OKATO6user";
			
				name6user = "778DEP_ADDRES6userS";
			
				name6user = "447DEP_name6user6user";
			
				name6user = "54USER_POSITION6user";
				
				if (name6user != null) {

					at.setName(name6user);
					at.setValue (objectArray6user[i] != null ? objectArray6user[i]
							.toString() : "");

					atlist6user.add(at);
				}
			}
			
			uat.setUid(uid6user);
			uat.setAttributes(atlist6user);

			result6user.add(uat); 
			resultIds.put(idRec6user, uat);

			if (usersIdsLine6user == null) {
				usersIdsLine6user = "'" + idRec6user + "'";
			} else {
				usersIdsLine6user = usersIdsLine6user + ", '" + idRec6user + "'";
			}
	       }
		   
		   return usersIdsLine6user ;
	}
}
