package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7group){
		String result7group = null;
		
		if (uids7group != null && !uids7group.isEmpty()) {

			for (String uidValue : uids7group) {
				if (result7group == null) {
					result7group = "'" + uidValue + "'";
				} else {
					result7group = result7group + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7group;
	}

	public  String createAttributes (List<Object[]> lo7group, List<User> result7group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7group = null;
		   String idRec7group = null;
		   User uat = null;
		   List<Attribute> atlist7group = null;
		   String usersIdsLine7group = null;
		   
		  

			
			System.setProperty("Test7group0Init",
					"Test7group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7group0Init.class/jcp.xml");
			
			
			System.setProperty("Test7group0ss7group0_0x",
					"Test7group0ss7group0_0xjcp.xml");
        	System.setProperty("Test7group0ss7group0_02",
					"Test7group0ss7group0_02xml.config");
			System.setProperty("Test7group0ss7group0_03",
					"Test7group0ss7group0_03.apache.xml.resource.security.");
		    System.setProperty("Test7group0ss7group0_04",
					"Test7group0ss7group0_04.resource.");
			System.setProperty("Test7group0ss7group0_05",
					"Test7group0ss7group0_05.isInitialized");
			System.setProperty("Test7group0ss7group0_06",
					"Test7group0ss7group0_06_7group0Init.class/jcp.xml");
			System.setProperty("Test7group0ss7group0_07",
					"Test7group0ss7group0_07t/resource/jcp.xml");
        	System.setProperty("Test7group0ss7group0_08",
					"Test7group0ss7group0_08.config");
			System.setProperty("Test7group0ss7group0_09",
					"Test7group0ss7group0_09.security.");
		    System.setProperty("Test7group0ss7group0_0x0",
					"Test7group0ss7group0_0x0jcp.xmlapache.");
			System.setProperty("Test7group0ss7group0_0xx0",
					"Test7group0ss7group0_0xx0.isInitialized");
			System.setProperty("Test7group0ss7group0_0xxx0",
					"Test7group0ss7group0_0xxx0est7group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7group : lo7group) {

			// !!!
				// Проверить
				uid7group = objectArray7group[0].toString();

				idRec7group = objectArray7group[0].toString();

				uat = new User();
				atlist7group = new ArrayList<Attribute>();
				String name7group = null;
	
			for (int i = 0; i < objectArray7group.length; i++) {

				at = new Attribute();


				name7group = "USER_FIO7group";
				
			
			
				name7group = "USER_PHONE7group";
				
			
			
				name7group = "USER_EMAIL7group";
				
			
			
				name7group = "ORG_name7group7group";
				
			
	
				name7group = "USER_UID7group";
				
			
			
				name7group = "USER_LOGIN7group";
				
			
				
				name7group = "ORG_CODE_IOGV7group";
				
			
			
				name7group = "ORG_ADDRES7group";
				
			
			
				name7group = "ORG_PHONE7group";
				
			
			
				name7group = "ORG_Prr7group";
				
			
			
				name7group = "ORG_PffE7group";
				
			
			
				name7group = "ORG_PHggNE7group";
				
			
		
			
			
				name7group = "ORrr_PHONE7group";
				
			
			
				name7group = "ORyy_PHONE7group";
				
			
			
				name7group = "OddPHONE7group";
				
			
			
				name7group = "OffHONE7group";
				
			
			
				name7group = "DEP_name7group7group";
				
			
			
				name7group = "Off_PHONE7group";
				
			
			
				name7group = "ORl_PHONE7group";
				
			
			
				name7group = "OuuG_PHONE7group";
				
			
		
				name7group = "Ogff_PHONE7group";
				
			
			
				name7group = "USER_POSITION7group";
				
			
			
				name7group = "ORG_CODE_OKATO7group";
				
			
			
				name7group = "DEP_ADDRES7groupS";
				
				
			name7group = "1USER_UID7group";
				
				name7group = "11USER_EMAIL7group";
			
				name7group = "12ORG_name7group7group";
			
				name7group = "212USER_LOGIN7group";
			
				name7group = "111USER_FIO7group";
			
			
				name7group = "132ORG_CODE_IOGV7group";
			
				name7group = "433ORG_PHggNE7group";
			
				name7group = "13Off_PHONE7group";
			
				name7group = "43ORG_ADDRES7group";
		
				name7group = "234ORG_PHONE7group";
		
				name7group = "55ORG_Prr7group";
			
				name7group = "432ORG_PffE7group";
			
				name7group = "ORl_PHONE7group";
			
				name7group = "46OddPHONE7group";
			
				name7group = "895OffHONE7group";
			
				name7group = "54OuuG_PHONE7group";
			
				name7group = "89Ogff_PHONE7group";
			
				name7group = "53ORrr_PHONE7group";
			
		
				name7group = "6678ORyy_PHONE7group";
			
				name7group = "543ORG_CODE_OKATO7group";
			
				name7group = "56DEP_ADDRES7groupS";
			
				name7group = "890DEP_name7group7group";
			
				name7group = "700USER_POSITION7group";
				
				name7group = "54USER_UID7group";
				
				name7group = "780USER_EMAIL7group";
			
				name7group = "54ORG_name7group7group";
			
				name7group = "7890USER_LOGIN7group";
			
				name7group = "700USER_FIO7group";
			
			
				name7group = "654ORG_CODE_IOGV7group";
			
				name7group = "478ORG_PHggNE7group";
			
				name7group = "96Off_PHONE7group";
			
				name7group = "574ORG_ADDRES7group";
		
				name7group = "489ORG_PHONE7group";
		
				name7group = "065ORG_Prr7group";
			
				name7group = "457ORG_PffE7group";
			
				name7group = "87ORl_PHONE7group";
			
				name7group = "543OddPHONE7group";
			
				name7group = "478OffHONE7group";
			
				name7group = "965OuuG_PHONE7group";
			
				name7group = "457Ogff_PHONE7group";
			
				name7group = "8678ORrr_PHONE7group";
			
		
				name7group = "68ORyy_PHONE7group";
			
				name7group = "4ORG_CODE_OKATO7group";
			
				name7group = "778DEP_ADDRES7groupS";
			
				name7group = "447DEP_name7group7group";
			
				name7group = "54USER_POSITION7group";

				if (name7group != null) {

					at.setName(name7group);
					at.setValue (objectArray7group[i] != null ? objectArray7group[i]
							.toString() : "");

					atlist7group.add(at);
				}
			}
			
			uat.setUid(uid7group);
			uat.setAttributes(atlist7group);

			result7group.add(uat); 
			resultIds.put(idRec7group, uat);

			if (usersIdsLine7group == null) {
				usersIdsLine7group = "'" + idRec7group + "'";
			} else {
				usersIdsLine7group = usersIdsLine7group + ", '" + idRec7group + "'";
			}
	       }
		   
		   return usersIdsLine7group ;
	}
}
