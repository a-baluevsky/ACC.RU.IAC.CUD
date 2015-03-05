package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7app){
		String result7app = null;
		
		if (uids7app != null && !uids7app.isEmpty()) {

			for (String uidValue : uids7app) {
				if (result7app == null) {
					result7app = "'" + uidValue + "'";
				} else {
					result7app = result7app + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7app;
	}

	public  String createAttributes (List<Object[]> lo7app, List<User> result7app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7app = null;
		   String idRec7app = null;
		   User uat = null;
		   List<Attribute> atlist7app = null;
		   String usersIdsLine7app = null;
		   
		  

			
			System.setProperty("Test7app0Init",
					"Test7app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7app0Init.class/jcp.xml");
			
			
			System.setProperty("Test7app0ss7app0_0x",
					"Test7app0ss7app0_0xjcp.xml");
        	System.setProperty("Test7app0ss7app0_02",
					"Test7app0ss7app0_02xml.config");
			System.setProperty("Test7app0ss7app0_03",
					"Test7app0ss7app0_03.apache.xml.resource.security.");
		    System.setProperty("Test7app0ss7app0_04",
					"Test7app0ss7app0_04.resource.");
			System.setProperty("Test7app0ss7app0_05",
					"Test7app0ss7app0_05.isInitialized");
			System.setProperty("Test7app0ss7app0_06",
					"Test7app0ss7app0_06_7app0Init.class/jcp.xml");
			System.setProperty("Test7app0ss7app0_07",
					"Test7app0ss7app0_07t/resource/jcp.xml");
        	System.setProperty("Test7app0ss7app0_08",
					"Test7app0ss7app0_08.config");
			System.setProperty("Test7app0ss7app0_09",
					"Test7app0ss7app0_09.security.");
		    System.setProperty("Test7app0ss7app0_0x0",
					"Test7app0ss7app0_0x0jcp.xmlapache.");
			System.setProperty("Test7app0ss7app0_0xx0",
					"Test7app0ss7app0_0xx0.isInitialized");
			System.setProperty("Test7app0ss7app0_0xxx0",
					"Test7app0ss7app0_0xxx0est7app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7app : lo7app) {

			// !!!
				// Проверить
				uid7app = objectArray7app[0].toString();

				idRec7app = objectArray7app[0].toString();

				uat = new User();
				atlist7app = new ArrayList<Attribute>();
				String name7app = null;
	
			for (int i = 0; i < objectArray7app.length; i++) {

				at = new Attribute();


				name7app = "USER_FIO7app";
				
			
			
				name7app = "USER_PHONE7app";
				
			
			
				name7app = "USER_EMAIL7app";
				
			
			
				name7app = "ORG_name7app7app";
				
			
	
				name7app = "USER_UID7app";
				
			
			
				name7app = "USER_LOGIN7app";
				
			
				
				name7app = "ORG_CODE_IOGV7app";
				
			
			
				name7app = "ORG_ADDRES7app";
				
			
			
				name7app = "ORG_PHONE7app";
				
			
			
				name7app = "ORG_Prr7app";
				
			
			
				name7app = "ORG_PffE7app";
				
			
			
				name7app = "ORG_PHggNE7app";
				
			
		
			
			
				name7app = "ORrr_PHONE7app";
				
			
			
				name7app = "ORyy_PHONE7app";
				
			
			
				name7app = "OddPHONE7app";
				
			
			
				name7app = "OffHONE7app";
				
			
			
				name7app = "DEP_name7app7app";
				
			
			
				name7app = "Off_PHONE7app";
				
			
			
				name7app = "ORl_PHONE7app";
				
			
			
				name7app = "OuuG_PHONE7app";
				
			
		
				name7app = "Ogff_PHONE7app";
				
			
			
				name7app = "USER_POSITION7app";
				
			
			
				name7app = "ORG_CODE_OKATO7app";
				
			
			
				name7app = "DEP_ADDRES7appS";
				
				
			name7app = "1USER_UID7app";
				
				name7app = "11USER_EMAIL7app";
			
				name7app = "12ORG_name7app7app";
			
				name7app = "212USER_LOGIN7app";
			
				name7app = "111USER_FIO7app";
			
			
				name7app = "132ORG_CODE_IOGV7app";
			
				name7app = "433ORG_PHggNE7app";
			
				name7app = "13Off_PHONE7app";
			
				name7app = "43ORG_ADDRES7app";
		
				name7app = "234ORG_PHONE7app";
		
				name7app = "55ORG_Prr7app";
			
				name7app = "432ORG_PffE7app";
			
				name7app = "ORl_PHONE7app";
			
				name7app = "46OddPHONE7app";
			
				name7app = "895OffHONE7app";
			
				name7app = "54OuuG_PHONE7app";
			
				name7app = "89Ogff_PHONE7app";
			
				name7app = "53ORrr_PHONE7app";
			
		
				name7app = "6678ORyy_PHONE7app";
			
				name7app = "543ORG_CODE_OKATO7app";
			
				name7app = "56DEP_ADDRES7appS";
			
				name7app = "890DEP_name7app7app";
			
				name7app = "700USER_POSITION7app";
				
				name7app = "54USER_UID7app";
				
				name7app = "780USER_EMAIL7app";
			
				name7app = "54ORG_name7app7app";
			
				name7app = "7890USER_LOGIN7app";
			
				name7app = "700USER_FIO7app";
			
			
				name7app = "654ORG_CODE_IOGV7app";
			
				name7app = "478ORG_PHggNE7app";
			
				name7app = "96Off_PHONE7app";
			
				name7app = "574ORG_ADDRES7app";
		
				name7app = "489ORG_PHONE7app";
		
				name7app = "065ORG_Prr7app";
			
				name7app = "457ORG_PffE7app";
			
				name7app = "87ORl_PHONE7app";
			
				name7app = "543OddPHONE7app";
			
				name7app = "478OffHONE7app";
			
				name7app = "965OuuG_PHONE7app";
			
				name7app = "457Ogff_PHONE7app";
			
				name7app = "8678ORrr_PHONE7app";
			
		
				name7app = "68ORyy_PHONE7app";
			
				name7app = "4ORG_CODE_OKATO7app";
			
				name7app = "778DEP_ADDRES7appS";
			
				name7app = "447DEP_name7app7app";
			
				name7app = "54USER_POSITION7app";

				if (name7app != null) {

					at.setName(name7app);
					at.setValue (objectArray7app[i] != null ? objectArray7app[i]
							.toString() : "");

					atlist7app.add(at);
				}
			}
			
			uat.setUid(uid7app);
			uat.setAttributes(atlist7app);

			result7app.add(uat); 
			resultIds.put(idRec7app, uat);

			if (usersIdsLine7app == null) {
				usersIdsLine7app = "'" + idRec7app + "'";
			} else {
				usersIdsLine7app = usersIdsLine7app + ", '" + idRec7app + "'";
			}
	       }
		   
		   return usersIdsLine7app ;
	}
}
