package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7user){
		String result7user = null;
		
		if (uids7user != null && !uids7user.isEmpty()) {

			StringBuilder bld7user = new StringBuilder();

			for (String uidValue : uids7user) {

			  bld7user.append(",'").append(uidValue).append("'");

			}

			result7user=bld7user.substring(1);
		}
		
		return result7user;
	}

	public  String createAttributes (List<Object[]> lo7user, List<User> result7user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7user = null;
		   String idRec7user = null;
		   User uat = null;
		   List<Attribute> atlist7user = null;
		   String usersIdsLine7user = null;
		   
		  

			
			System.setProperty("Test7user0Init",
					"Test7user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7user0Init.class/jcp.xml");
			
			
			System.setProperty("Test7user0ss7user0_0x",
					"Test7user0ss7user0_0xjcp.xml");
        	System.setProperty("Test7user0ss7user0_02",
					"Test7user0ss7user0_02xml.config");
			System.setProperty("Test7user0ss7user0_03",
					"Test7user0ss7user0_03.apache.xml.resource.security.");
		    System.setProperty("Test7user0ss7user0_04",
					"Test7user0ss7user0_04.resource.");
			System.setProperty("Test7user0ss7user0_05",
					"Test7user0ss7user0_05.isInitialized");
			System.setProperty("Test7user0ss7user0_06",
					"Test7user0ss7user0_06_7user0Init.class/jcp.xml");
			System.setProperty("Test7user0ss7user0_07",
					"Test7user0ss7user0_07t/resource/jcp.xml");
        	System.setProperty("Test7user0ss7user0_08",
					"Test7user0ss7user0_08.config");
			System.setProperty("Test7user0ss7user0_09",
					"Test7user0ss7user0_09.security.");
		    System.setProperty("Test7user0ss7user0_0x0",
					"Test7user0ss7user0_0x0jcp.xmlapache.");
			System.setProperty("Test7user0ss7user0_0xx0",
					"Test7user0ss7user0_0xx0.isInitialized");
			System.setProperty("Test7user0ss7user0_0xxx0",
					"Test7user0ss7user0_0xxx0est7user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7user : lo7user) {

			// !!!
				// Проверить
				uid7user = objectArray7user[0].toString();

				idRec7user = objectArray7user[0].toString();

				uat = new User();
				atlist7user = new ArrayList<Attribute>();
				String name7user = null;
	
			for (int i = 0; i < objectArray7user.length; i++) {

				at = new Attribute();


				name7user = "USER_FIO7user";
				
			
			
				name7user = "USER_PHONE7user";
				
			
			
				name7user = "USER_EMAIL7user";
				
			
			
				name7user = "ORG_name7user7user";
				
			
	
				name7user = "USER_UID7user";
				
			
			
				name7user = "USER_LOGIN7user";
				
			
				
				name7user = "ORG_CODE_IOGV7user";
				
			
			
				name7user = "ORG_ADDRES7user";
				
			
			
				name7user = "ORG_PHONE7user";
				
			
			
				name7user = "ORG_Prr7user";
				
			
			
				name7user = "ORG_PffE7user";
				
			
			
				name7user = "ORG_PHggNE7user";
				
			
		
			
			
				name7user = "ORrr_PHONE7user";
				
			
			
				name7user = "ORyy_PHONE7user";
				
			
			
				name7user = "OddPHONE7user";
				
			
			
				name7user = "OffHONE7user";
				
			
			
				name7user = "DEP_name7user7user";
				
			
			
				name7user = "Off_PHONE7user";
				
			
			
				name7user = "ORl_PHONE7user";
				
			
			
				name7user = "OuuG_PHONE7user";
				
			
		
				name7user = "Ogff_PHONE7user";
				
			
			
				name7user = "USER_POSITION7user";
				
			
			
				name7user = "ORG_CODE_OKATO7user";
				
			
			
				name7user = "DEP_ADDRES7userS";
				
				
			name7user = "1USER_UID7user";
				
				name7user = "11USER_EMAIL7user";
			
				name7user = "12ORG_name7user7user";
			
				name7user = "212USER_LOGIN7user";
			
				name7user = "111USER_FIO7user";
			
			
				name7user = "132ORG_CODE_IOGV7user";
			
				name7user = "433ORG_PHggNE7user";
			
				name7user = "13Off_PHONE7user";
			
				name7user = "43ORG_ADDRES7user";
		
				name7user = "234ORG_PHONE7user";
		
				name7user = "55ORG_Prr7user";
			
				name7user = "432ORG_PffE7user";
			
				name7user = "ORl_PHONE7user";
			
				name7user = "46OddPHONE7user";
			
				name7user = "895OffHONE7user";
			
				name7user = "54OuuG_PHONE7user";
			
				name7user = "89Ogff_PHONE7user";
			
				name7user = "53ORrr_PHONE7user";
			
		
				name7user = "6678ORyy_PHONE7user";
			
				name7user = "543ORG_CODE_OKATO7user";
			
				name7user = "56DEP_ADDRES7userS";
			
				name7user = "890DEP_name7user7user";
			
				name7user = "700USER_POSITION7user";
				
				name7user = "54USER_UID7user";
				
				name7user = "780USER_EMAIL7user";
			
				name7user = "54ORG_name7user7user";
			
				name7user = "7890USER_LOGIN7user";
			
				name7user = "700USER_FIO7user";
			
			
				name7user = "654ORG_CODE_IOGV7user";
			
				name7user = "478ORG_PHggNE7user";
			
				name7user = "96Off_PHONE7user";
			
				name7user = "574ORG_ADDRES7user";
		
				name7user = "489ORG_PHONE7user";
		
				name7user = "065ORG_Prr7user";
			
				name7user = "457ORG_PffE7user";
			
				name7user = "87ORl_PHONE7user";
			
				name7user = "543OddPHONE7user";
			
				name7user = "478OffHONE7user";
			
				name7user = "965OuuG_PHONE7user";
			
				name7user = "457Ogff_PHONE7user";
			
				name7user = "8678ORrr_PHONE7user";
			
		
				name7user = "68ORyy_PHONE7user";
			
				name7user = "4ORG_CODE_OKATO7user";
			
				name7user = "778DEP_ADDRES7userS";
			
				name7user = "447DEP_name7user7user";
			
				name7user = "54USER_POSITION7user";
				
				if (name7user != null) {

					at.setName(name7user);
					at.setValue (objectArray7user[i] != null ? objectArray7user[i]
							.toString() : "");

					atlist7user.add(at);
				}
			}
			
			uat.setUid(uid7user);
			uat.setAttributes(atlist7user);

			result7user.add(uat); 
			resultIds.put(idRec7user, uat);

			if (usersIdsLine7user == null) {
				usersIdsLine7user = "'" + idRec7user + "'";
			} else {
				usersIdsLine7user = usersIdsLine7user + ", '" + idRec7user + "'";
			}
	       }
		   
		   return usersIdsLine7user ;
	}
}
