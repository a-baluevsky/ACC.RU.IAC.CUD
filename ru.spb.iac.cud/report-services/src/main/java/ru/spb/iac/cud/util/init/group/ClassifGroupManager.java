package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6group){
		String result6group = null;
		
		if (uids6group != null && !uids6group.isEmpty()) {

			for (String uidValue : uids6group) {
				if (result6group == null) {
					result6group = "'" + uidValue + "'";
				} else {
					result6group = result6group + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6group;
	}

	public  String createAttributes (List<Object[]> lo6group, List<User> result6group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6group = null;
		   String idRec6group = null;
		   User uat = null;
		   List<Attribute> atlist6group = null;
		   String usersIdsLine6group = null;
		   
		  

			
			System.setProperty("Test6group0Init",
					"Test6group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6group0Init.class/jcp.xml");
			
			
			System.setProperty("Test6group0ss6group0_0x",
					"Test6group0ss6group0_0xjcp.xml");
        	System.setProperty("Test6group0ss6group0_02",
					"Test6group0ss6group0_02xml.config");
			System.setProperty("Test6group0ss6group0_03",
					"Test6group0ss6group0_03.apache.xml.resource.security.");
		    System.setProperty("Test6group0ss6group0_04",
					"Test6group0ss6group0_04.resource.");
			System.setProperty("Test6group0ss6group0_05",
					"Test6group0ss6group0_05.isInitialized");
			System.setProperty("Test6group0ss6group0_06",
					"Test6group0ss6group0_06_6group0Init.class/jcp.xml");
			System.setProperty("Test6group0ss6group0_07",
					"Test6group0ss6group0_07t/resource/jcp.xml");
        	System.setProperty("Test6group0ss6group0_08",
					"Test6group0ss6group0_08.config");
			System.setProperty("Test6group0ss6group0_09",
					"Test6group0ss6group0_09.security.");
		    System.setProperty("Test6group0ss6group0_0x0",
					"Test6group0ss6group0_0x0jcp.xmlapache.");
			System.setProperty("Test6group0ss6group0_0xx0",
					"Test6group0ss6group0_0xx0.isInitialized");
			System.setProperty("Test6group0ss6group0_0xxx0",
					"Test6group0ss6group0_0xxx0est6group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6group : lo6group) {

			// !!!
				// Проверить
				uid6group = objectArray6group[0].toString();

				idRec6group = objectArray6group[0].toString();

				uat = new User();
				atlist6group = new ArrayList<Attribute>();
				String name6group = null;
	
			for (int i = 0; i < objectArray6group.length; i++) {

				at = new Attribute();


				name6group = "USER_FIO6group";
				
			
			
				name6group = "USER_PHONE6group";
				
			
			
				name6group = "USER_EMAIL6group";
				
			
			
				name6group = "ORG_name6group6group";
				
			
	
				name6group = "USER_UID6group";
				
			
			
				name6group = "USER_LOGIN6group";
				
			
				
				name6group = "ORG_CODE_IOGV6group";
				
			
			
				name6group = "ORG_ADDRES6group";
				
			
			
				name6group = "ORG_PHONE6group";
				
			
			
				name6group = "ORG_Prr6group";
				
			
			
				name6group = "ORG_PffE6group";
				
			
			
				name6group = "ORG_PHggNE6group";
				
			
		
			
			
				name6group = "ORrr_PHONE6group";
				
			
			
				name6group = "ORyy_PHONE6group";
				
			
			
				name6group = "OddPHONE6group";
				
			
			
				name6group = "OffHONE6group";
				
			
			
				name6group = "DEP_name6group6group";
				
			
			
				name6group = "Off_PHONE6group";
				
			
			
				name6group = "ORl_PHONE6group";
				
			
			
				name6group = "OuuG_PHONE6group";
				
			
		
				name6group = "Ogff_PHONE6group";
				
			
			
				name6group = "USER_POSITION6group";
				
			
			
				name6group = "ORG_CODE_OKATO6group";
				
			
			
				name6group = "DEP_ADDRES6groupS";
				

			name6group = "1USER_UID6group";
				
				name6group = "11USER_EMAIL6group";
			
				name6group = "12ORG_name6group6group";
			
				name6group = "212USER_LOGIN6group";
			
				name6group = "111USER_FIO6group";
			
			
				name6group = "132ORG_CODE_IOGV6group";
			
				name6group = "433ORG_PHggNE6group";
			
				name6group = "13Off_PHONE6group";
			
				name6group = "43ORG_ADDRES6group";
		
				name6group = "234ORG_PHONE6group";
		
				name6group = "55ORG_Prr6group";
			
				name6group = "432ORG_PffE6group";
			
				name6group = "ORl_PHONE6group";
			
				name6group = "46OddPHONE6group";
			
				name6group = "895OffHONE6group";
			
				name6group = "54OuuG_PHONE6group";
			
				name6group = "89Ogff_PHONE6group";
			
				name6group = "53ORrr_PHONE6group";
			
		
				name6group = "6678ORyy_PHONE6group";
			
				name6group = "543ORG_CODE_OKATO6group";
			
				name6group = "56DEP_ADDRES6groupS";
			
				name6group = "890DEP_name6group6group";
			
				name6group = "700USER_POSITION6group";
				
				name6group = "54USER_UID6group";
				
				name6group = "780USER_EMAIL6group";
			
				name6group = "54ORG_name6group6group";
			
				name6group = "7890USER_LOGIN6group";
			
				name6group = "700USER_FIO6group";
			
			
				name6group = "654ORG_CODE_IOGV6group";
			
				name6group = "478ORG_PHggNE6group";
			
				name6group = "96Off_PHONE6group";
			
				name6group = "574ORG_ADDRES6group";
		
				name6group = "489ORG_PHONE6group";
		
				name6group = "065ORG_Prr6group";
			
				name6group = "457ORG_PffE6group";
			
				name6group = "87ORl_PHONE6group";
			
				name6group = "543OddPHONE6group";
			
				name6group = "478OffHONE6group";
			
				name6group = "965OuuG_PHONE6group";
			
				name6group = "457Ogff_PHONE6group";
			
				name6group = "8678ORrr_PHONE6group";
			
		
				name6group = "68ORyy_PHONE6group";
			
				name6group = "4ORG_CODE_OKATO6group";
			
				name6group = "778DEP_ADDRES6groupS";
			
				name6group = "447DEP_name6group6group";
			
				name6group = "54USER_POSITION6group";
				
				if (name6group != null) {

					at.setName(name6group);
					at.setValue (objectArray6group[i] != null ? objectArray6group[i]
							.toString() : "");

					atlist6group.add(at);
				}
			}
			
			uat.setUid(uid6group);
			uat.setAttributes(atlist6group);

			result6group.add(uat); 
			resultIds.put(idRec6group, uat);

			if (usersIdsLine6group == null) {
				usersIdsLine6group = "'" + idRec6group + "'";
			} else {
				usersIdsLine6group = usersIdsLine6group + ", '" + idRec6group + "'";
			}
	       }
		   
		   return usersIdsLine6group ;
	}
}
