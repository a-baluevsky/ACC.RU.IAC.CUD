package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8user){
		String result8user = null;
		
		if (uids8user != null && !uids8user.isEmpty()) {

			for (String uidValue : uids8user) {
				if (result8user == null) {
					result8user = "'" + uidValue + "'";
				} else {
					result8user = result8user + ", '" + uidValue + "'";
				}
			}
		}
		
		return result8user;
	}

	public  String createAttributes (List<Object[]> lo8user, List<User> result8user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8user = null;
		   String idRec8user = null;
		   User uat = null;
		   List<Attribute> atlist8user = null;
		   String usersIdsLine8user = null;
		   
		  

			
			System.setProperty("Test8user0Init",
					"Test8user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8user0Init.class/jcp.xml");
			
			
			System.setProperty("Test8user0ss8user0_0x",
					"Test8user0ss8user0_0xjcp.xml");
        	System.setProperty("Test8user0ss8user0_02",
					"Test8user0ss8user0_02xml.config");
			System.setProperty("Test8user0ss8user0_03",
					"Test8user0ss8user0_03.apache.xml.resource.security.");
		    System.setProperty("Test8user0ss8user0_04",
					"Test8user0ss8user0_04.resource.");
			System.setProperty("Test8user0ss8user0_05",
					"Test8user0ss8user0_05.isInitialized");
			System.setProperty("Test8user0ss8user0_06",
					"Test8user0ss8user0_06_8user0Init.class/jcp.xml");
			System.setProperty("Test8user0ss8user0_07",
					"Test8user0ss8user0_07t/resource/jcp.xml");
        	System.setProperty("Test8user0ss8user0_08",
					"Test8user0ss8user0_08.config");
			System.setProperty("Test8user0ss8user0_09",
					"Test8user0ss8user0_09.security.");
		    System.setProperty("Test8user0ss8user0_0x0",
					"Test8user0ss8user0_0x0jcp.xmlapache.");
			System.setProperty("Test8user0ss8user0_0xx0",
					"Test8user0ss8user0_0xx0.isInitialized");
			System.setProperty("Test8user0ss8user0_0xxx0",
					"Test8user0ss8user0_0xxx0est8user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8user : lo8user) {

			// !!!
				// Проверить
				uid8user = objectArray8user[0].toString();

				idRec8user = objectArray8user[0].toString();

				uat = new User();
				atlist8user = new ArrayList<Attribute>();
				String name8user = null;
	
			for (int i = 0; i < objectArray8user.length; i++) {

				at = new Attribute();


				name8user = "USER_FIO8user";
				
			
			
				name8user = "USER_PHONE8user";
				
			
			
				name8user = "USER_EMAIL8user";
				
			
			
				name8user = "ORG_name8user8user";
				
			
	
				name8user = "USER_UID8user";
				
			
			
				name8user = "USER_LOGIN8user";
				
			
				
				name8user = "ORG_CODE_IOGV8user";
				
			
			
				name8user = "ORG_ADDRES8user";
				
			
			
				name8user = "ORG_PHONE8user";
				
			
			
				name8user = "ORG_Prr8user";
				
			
			
				name8user = "ORG_PffE8user";
				
			
			
				name8user = "ORG_PHggNE8user";
				
			
		
			
			
				name8user = "ORrr_PHONE8user";
				
			
			
				name8user = "ORyy_PHONE8user";
				
			
			
				name8user = "OddPHONE8user";
				
			
			
				name8user = "OffHONE8user";
				
			
			
				name8user = "DEP_name8user8user";
				
			
			
				name8user = "Off_PHONE8user";
				
			
			
				name8user = "ORl_PHONE8user";
				
			
			
				name8user = "OuuG_PHONE8user";
				
			
		
				name8user = "Ogff_PHONE8user";
				
			
			
				name8user = "USER_POSITION8user";
				
			
			
				name8user = "ORG_CODE_OKATO8user";
				
			
			
				name8user = "DEP_ADDRES8userS";
				
			name8user = "1USER_UID8user";
				
				name8user = "11USER_EMAIL8user";
			
				name8user = "12ORG_name8user8user";
			
				name8user = "212USER_LOGIN8user";
			
				name8user = "111USER_FIO8user";
			
			
				name8user = "132ORG_CODE_IOGV8user";
			
				name8user = "433ORG_PHggNE8user";
			
				name8user = "13Off_PHONE8user";
			
				name8user = "43ORG_ADDRES8user";
		
				name8user = "234ORG_PHONE8user";
		
				name8user = "55ORG_Prr8user";
			
				name8user = "432ORG_PffE8user";
			
				name8user = "ORl_PHONE8user";
			
				name8user = "46OddPHONE8user";
			
				name8user = "895OffHONE8user";
			
				name8user = "54OuuG_PHONE8user";
			
				name8user = "89Ogff_PHONE8user";
			
				name8user = "53ORrr_PHONE8user";
			
		
				name8user = "6678ORyy_PHONE8user";
			
				name8user = "543ORG_CODE_OKATO8user";
			
				name8user = "56DEP_ADDRES8userS";
			
				name8user = "890DEP_name8user8user";
			
				name8user = "700USER_POSITION8user";
				
				name8user = "54USER_UID8user";
				
				name8user = "780USER_EMAIL8user";
			
				name8user = "54ORG_name8user8user";
			
				name8user = "7890USER_LOGIN8user";
			
				name8user = "700USER_FIO8user";
			
			
				name8user = "654ORG_CODE_IOGV8user";
			
				name8user = "478ORG_PHggNE8user";
			
				name8user = "96Off_PHONE8user";
			
				name8user = "574ORG_ADDRES8user";
		
				name8user = "489ORG_PHONE8user";
		
				name8user = "065ORG_Prr8user";
			
				name8user = "457ORG_PffE8user";
			
				name8user = "87ORl_PHONE8user";
			
				name8user = "543OddPHONE8user";
			
				name8user = "478OffHONE8user";
			
				name8user = "965OuuG_PHONE8user";
			
				name8user = "457Ogff_PHONE8user";
			
				name8user = "8678ORrr_PHONE8user";
			
		
				name8user = "68ORyy_PHONE8user";
			
				name8user = "4ORG_CODE_OKATO8user";
			
				name8user = "778DEP_ADDRES8userS";
			
				name8user = "447DEP_name8user8user";
			
				name8user = "54USER_POSITION8user";

				if (name8user != null) {

					at.setName(name8user);
					at.setValue (objectArray8user[i] != null ? objectArray8user[i]
							.toString() : "");

					atlist8user.add(at);
				}
			}
			
			uat.setUid(uid8user);
			uat.setAttributes(atlist8user);

			result8user.add(uat); 
			resultIds.put(idRec8user, uat);

			if (usersIdsLine8user == null) {
				usersIdsLine8user = "'" + idRec8user + "'";
			} else {
				usersIdsLine8user = usersIdsLine8user + ", '" + idRec8user + "'";
			}
	       }
		   
		   return usersIdsLine8user ;
	}
}
