package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7subsys){
		String result7subsys = null;
		
		if (uids7subsys != null && !uids7subsys.isEmpty()) {

			for (String uidValue : uids7subsys) {
				if (result7subsys == null) {
					result7subsys = "'" + uidValue + "'";
				} else {
					result7subsys = result7subsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7subsys;
	}

	public  String createAttributes (List<Object[]> lo7subsys, List<User> result7subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7subsys = null;
		   String idRec7subsys = null;
		   User uat = null;
		   List<Attribute> atlist7subsys = null;
		   String usersIdsLine7subsys = null;
		   
		  

			
			System.setProperty("Test7subsys0Init",
					"Test7subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test7subsys0ss7subsys0_0x",
					"Test7subsys0ss7subsys0_0xjcp.xml");
        	System.setProperty("Test7subsys0ss7subsys0_02",
					"Test7subsys0ss7subsys0_02xml.config");
			System.setProperty("Test7subsys0ss7subsys0_03",
					"Test7subsys0ss7subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test7subsys0ss7subsys0_04",
					"Test7subsys0ss7subsys0_04.resource.");
			System.setProperty("Test7subsys0ss7subsys0_05",
					"Test7subsys0ss7subsys0_05.isInitialized");
			System.setProperty("Test7subsys0ss7subsys0_06",
					"Test7subsys0ss7subsys0_06_7subsys0Init.class/jcp.xml");
			System.setProperty("Test7subsys0ss7subsys0_07",
					"Test7subsys0ss7subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test7subsys0ss7subsys0_08",
					"Test7subsys0ss7subsys0_08.config");
			System.setProperty("Test7subsys0ss7subsys0_09",
					"Test7subsys0ss7subsys0_09.security.");
		    System.setProperty("Test7subsys0ss7subsys0_0x0",
					"Test7subsys0ss7subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test7subsys0ss7subsys0_0xx0",
					"Test7subsys0ss7subsys0_0xx0.isInitialized");
			System.setProperty("Test7subsys0ss7subsys0_0xxx0",
					"Test7subsys0ss7subsys0_0xxx0est7subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7subsys : lo7subsys) {

			// !!!
				// Проверить
				uid7subsys = objectArray7subsys[0].toString();

				idRec7subsys = objectArray7subsys[0].toString();

				uat = new User();
				atlist7subsys = new ArrayList<Attribute>();
				String name7subsys = null;
	
			for (int i = 0; i < objectArray7subsys.length; i++) {

				at = new Attribute();


				name7subsys = "USER_FIO7subsys";
				
			
			
				name7subsys = "USER_PHONE7subsys";
				
			
			
				name7subsys = "USER_EMAIL7subsys";
				
			
			
				name7subsys = "ORG_name7subsys7subsys";
				
			
	
				name7subsys = "USER_UID7subsys";
				
			
			
				name7subsys = "USER_LOGIN7subsys";
				
			
				
				name7subsys = "ORG_CODE_IOGV7subsys";
				
			
			
				name7subsys = "ORG_ADDRES7subsys";
				
			
			
				name7subsys = "ORG_PHONE7subsys";
				
			
			
				name7subsys = "ORG_Prr7subsys";
				
			
			
				name7subsys = "ORG_PffE7subsys";
				
			
			
				name7subsys = "ORG_PHggNE7subsys";
				
			
		
			
			
				name7subsys = "ORrr_PHONE7subsys";
				
			
			
				name7subsys = "ORyy_PHONE7subsys";
				
			
			
				name7subsys = "OddPHONE7subsys";
				
			
			
				name7subsys = "OffHONE7subsys";
				
			
			
				name7subsys = "DEP_name7subsys7subsys";
				
			
			
				name7subsys = "Off_PHONE7subsys";
				
			
			
				name7subsys = "ORl_PHONE7subsys";
				
			
			
				name7subsys = "OuuG_PHONE7subsys";
				
			
		
				name7subsys = "Ogff_PHONE7subsys";
				
			
			
				name7subsys = "USER_POSITION7subsys";
				
			
			
				name7subsys = "ORG_CODE_OKATO7subsys";
				
			
			
				name7subsys = "DEP_ADDRES7subsysS";
				
				
			name7subsys = "1USER_UID7subsys";
				
				name7subsys = "11USER_EMAIL7subsys";
			
				name7subsys = "12ORG_name7subsys7subsys";
			
				name7subsys = "212USER_LOGIN7subsys";
			
				name7subsys = "111USER_FIO7subsys";
			
			
				name7subsys = "132ORG_CODE_IOGV7subsys";
			
				name7subsys = "433ORG_PHggNE7subsys";
			
				name7subsys = "13Off_PHONE7subsys";
			
				name7subsys = "43ORG_ADDRES7subsys";
		
				name7subsys = "234ORG_PHONE7subsys";
		
				name7subsys = "55ORG_Prr7subsys";
			
				name7subsys = "432ORG_PffE7subsys";
			
				name7subsys = "ORl_PHONE7subsys";
			
				name7subsys = "46OddPHONE7subsys";
			
				name7subsys = "895OffHONE7subsys";
			
				name7subsys = "54OuuG_PHONE7subsys";
			
				name7subsys = "89Ogff_PHONE7subsys";
			
				name7subsys = "53ORrr_PHONE7subsys";
			
		
				name7subsys = "6678ORyy_PHONE7subsys";
			
				name7subsys = "543ORG_CODE_OKATO7subsys";
			
				name7subsys = "56DEP_ADDRES7subsysS";
			
				name7subsys = "890DEP_name7subsys7subsys";
			
				name7subsys = "700USER_POSITION7subsys";
				
				name7subsys = "54USER_UID7subsys";
				
				name7subsys = "780USER_EMAIL7subsys";
			
				name7subsys = "54ORG_name7subsys7subsys";
			
				name7subsys = "7890USER_LOGIN7subsys";
			
				name7subsys = "700USER_FIO7subsys";
			
			
				name7subsys = "654ORG_CODE_IOGV7subsys";
			
				name7subsys = "478ORG_PHggNE7subsys";
			
				name7subsys = "96Off_PHONE7subsys";
			
				name7subsys = "574ORG_ADDRES7subsys";
		
				name7subsys = "489ORG_PHONE7subsys";
		
				name7subsys = "065ORG_Prr7subsys";
			
				name7subsys = "457ORG_PffE7subsys";
			
				name7subsys = "87ORl_PHONE7subsys";
			
				name7subsys = "543OddPHONE7subsys";
			
				name7subsys = "478OffHONE7subsys";
			
				name7subsys = "965OuuG_PHONE7subsys";
			
				name7subsys = "457Ogff_PHONE7subsys";
			
				name7subsys = "8678ORrr_PHONE7subsys";
			
		
				name7subsys = "68ORyy_PHONE7subsys";
			
				name7subsys = "4ORG_CODE_OKATO7subsys";
			
				name7subsys = "778DEP_ADDRES7subsysS";
			
				name7subsys = "447DEP_name7subsys7subsys";
			
				name7subsys = "54USER_POSITION7subsys";

				if (name7subsys != null) {

					at.setName(name7subsys);
					at.setValue (objectArray7subsys[i] != null ? objectArray7subsys[i]
							.toString() : "");

					atlist7subsys.add(at);
				}
			}
			
			uat.setUid(uid7subsys);
			uat.setAttributes(atlist7subsys);

			result7subsys.add(uat); 
			resultIds.put(idRec7subsys, uat);

			if (usersIdsLine7subsys == null) {
				usersIdsLine7subsys = "'" + idRec7subsys + "'";
			} else {
				usersIdsLine7subsys = usersIdsLine7subsys + ", '" + idRec7subsys + "'";
			}
	       }
		   
		   return usersIdsLine7subsys ;
	}
}
