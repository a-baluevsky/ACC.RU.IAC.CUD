package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7classif){
		String result7classif = null;
		
		if (uids7classif != null && !uids7classif.isEmpty()) {

			for (String uidValue : uids7classif) {
				if (result7classif == null) {
					result7classif = "'" + uidValue + "'";
				} else {
					result7classif = result7classif + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7classif;
	}

	public  String createAttributes (List<Object[]> lo7classif, List<User> result7classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7classif = null;
		   String idRec7classif = null;
		   User uat = null;
		   List<Attribute> atlist7classif = null;
		   String usersIdsLine7classif = null;
		   
		  

			
			System.setProperty("Test7classif0Init",
					"Test7classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test7classif0ss7classif0_0x",
					"Test7classif0ss7classif0_0xjcp.xml");
        	System.setProperty("Test7classif0ss7classif0_02",
					"Test7classif0ss7classif0_02xml.config");
			System.setProperty("Test7classif0ss7classif0_03",
					"Test7classif0ss7classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test7classif0ss7classif0_04",
					"Test7classif0ss7classif0_04.resource.");
			System.setProperty("Test7classif0ss7classif0_05",
					"Test7classif0ss7classif0_05.isInitialized");
			System.setProperty("Test7classif0ss7classif0_06",
					"Test7classif0ss7classif0_06_7classif0Init.class/jcp.xml");
			System.setProperty("Test7classif0ss7classif0_07",
					"Test7classif0ss7classif0_07t/resource/jcp.xml");
        	System.setProperty("Test7classif0ss7classif0_08",
					"Test7classif0ss7classif0_08.config");
			System.setProperty("Test7classif0ss7classif0_09",
					"Test7classif0ss7classif0_09.security.");
		    System.setProperty("Test7classif0ss7classif0_0x0",
					"Test7classif0ss7classif0_0x0jcp.xmlapache.");
			System.setProperty("Test7classif0ss7classif0_0xx0",
					"Test7classif0ss7classif0_0xx0.isInitialized");
			System.setProperty("Test7classif0ss7classif0_0xxx0",
					"Test7classif0ss7classif0_0xxx0est7classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7classif : lo7classif) {

			// !!!
				// Проверить
				uid7classif = objectArray7classif[0].toString();

				idRec7classif = objectArray7classif[0].toString();

				uat = new User();
				atlist7classif = new ArrayList<Attribute>();
				String name7classif = null;
	
			for (int i = 0; i < objectArray7classif.length; i++) {

				at = new Attribute();


				name7classif = "USER_FIO7classif";
				
			
			
				name7classif = "USER_PHONE7classif";
				
			
			
				name7classif = "USER_EMAIL7classif";
				
			
			
				name7classif = "ORG_name7classif7classif";
				
			
	
				name7classif = "USER_UID7classif";
				
			
			
				name7classif = "USER_LOGIN7classif";
				
			
				
				name7classif = "ORG_CODE_IOGV7classif";
				
			
			
				name7classif = "ORG_ADDRES7classif";
				
			
			
				name7classif = "ORG_PHONE7classif";
				
			
			
				name7classif = "ORG_Prr7classif";
				
			
			
				name7classif = "ORG_PffE7classif";
				
			
			
				name7classif = "ORG_PHggNE7classif";
				
			
		
			
			
				name7classif = "ORrr_PHONE7classif";
				
			
			
				name7classif = "ORyy_PHONE7classif";
				
			
			
				name7classif = "OddPHONE7classif";
				
			
			
				name7classif = "OffHONE7classif";
				
			
			
				name7classif = "DEP_name7classif7classif";
				
			
			
				name7classif = "Off_PHONE7classif";
				
			
			
				name7classif = "ORl_PHONE7classif";
				
			
			
				name7classif = "OuuG_PHONE7classif";
				
			
		
				name7classif = "Ogff_PHONE7classif";
				
			
			
				name7classif = "USER_POSITION7classif";
				
			
			
				name7classif = "ORG_CODE_OKATO7classif";
				
			
			
				name7classif = "DEP_ADDRES7classifS";
				
				
			name7classif = "1USER_UID7classif";
				
				name7classif = "11USER_EMAIL7classif";
			
				name7classif = "12ORG_name7classif7classif";
			
				name7classif = "212USER_LOGIN7classif";
			
				name7classif = "111USER_FIO7classif";
			
			
				name7classif = "132ORG_CODE_IOGV7classif";
			
				name7classif = "433ORG_PHggNE7classif";
			
				name7classif = "13Off_PHONE7classif";
			
				name7classif = "43ORG_ADDRES7classif";
		
				name7classif = "234ORG_PHONE7classif";
		
				name7classif = "55ORG_Prr7classif";
			
				name7classif = "432ORG_PffE7classif";
			
				name7classif = "ORl_PHONE7classif";
			
				name7classif = "46OddPHONE7classif";
			
				name7classif = "895OffHONE7classif";
			
				name7classif = "54OuuG_PHONE7classif";
			
				name7classif = "89Ogff_PHONE7classif";
			
				name7classif = "53ORrr_PHONE7classif";
			
		
				name7classif = "6678ORyy_PHONE7classif";
			
				name7classif = "543ORG_CODE_OKATO7classif";
			
				name7classif = "56DEP_ADDRES7classifS";
			
				name7classif = "890DEP_name7classif7classif";
			
				name7classif = "700USER_POSITION7classif";
				
				name7classif = "54USER_UID7classif";
				
				name7classif = "780USER_EMAIL7classif";
			
				name7classif = "54ORG_name7classif7classif";
			
				name7classif = "7890USER_LOGIN7classif";
			
				name7classif = "700USER_FIO7classif";
			
			
				name7classif = "654ORG_CODE_IOGV7classif";
			
				name7classif = "478ORG_PHggNE7classif";
			
				name7classif = "96Off_PHONE7classif";
			
				name7classif = "574ORG_ADDRES7classif";
		
				name7classif = "489ORG_PHONE7classif";
		
				name7classif = "065ORG_Prr7classif";
			
				name7classif = "457ORG_PffE7classif";
			
				name7classif = "87ORl_PHONE7classif";
			
				name7classif = "543OddPHONE7classif";
			
				name7classif = "478OffHONE7classif";
			
				name7classif = "965OuuG_PHONE7classif";
			
				name7classif = "457Ogff_PHONE7classif";
			
				name7classif = "8678ORrr_PHONE7classif";
			
		
				name7classif = "68ORyy_PHONE7classif";
			
				name7classif = "4ORG_CODE_OKATO7classif";
			
				name7classif = "778DEP_ADDRES7classifS";
			
				name7classif = "447DEP_name7classif7classif";
			
				name7classif = "54USER_POSITION7classif";

				if (name7classif != null) {

					at.setName(name7classif);
					at.setValue (objectArray7classif[i] != null ? objectArray7classif[i]
							.toString() : "");

					atlist7classif.add(at);
				}
			}
			
			uat.setUid(uid7classif);
			uat.setAttributes(atlist7classif);

			result7classif.add(uat); 
			resultIds.put(idRec7classif, uat);

			if (usersIdsLine7classif == null) {
				usersIdsLine7classif = "'" + idRec7classif + "'";
			} else {
				usersIdsLine7classif = usersIdsLine7classif + ", '" + idRec7classif + "'";
			}
	       }
		   
		   return usersIdsLine7classif ;
	}
}
