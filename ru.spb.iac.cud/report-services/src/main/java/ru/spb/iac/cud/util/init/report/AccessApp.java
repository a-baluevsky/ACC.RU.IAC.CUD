package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7report){
		String result7report = null;
		
		if (uids7report != null && !uids7report.isEmpty()) {

			for (String uidValue : uids7report) {
				if (result7report == null) {
					result7report = "'" + uidValue + "'";
				} else {
					result7report = result7report + ", '" + uidValue + "'";
				}
			}
		}
		
		return result7report;
	}

	public  String createAttributes (List<Object[]> lo7report, List<User> result7report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7report = null;
		   String idRec7report = null;
		   User uat = null;
		   List<Attribute> atlist7report = null;
		   String usersIdsLine7report = null;
		   
		  

			
			System.setProperty("Test7report0Init",
					"Test7report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7report0Init.class/jcp.xml");
			
			
			System.setProperty("Test7report0ss7report0_0x",
					"Test7report0ss7report0_0xjcp.xml");
        	System.setProperty("Test7report0ss7report0_02",
					"Test7report0ss7report0_02xml.config");
			System.setProperty("Test7report0ss7report0_03",
					"Test7report0ss7report0_03.apache.xml.resource.security.");
		    System.setProperty("Test7report0ss7report0_04",
					"Test7report0ss7report0_04.resource.");
			System.setProperty("Test7report0ss7report0_05",
					"Test7report0ss7report0_05.isInitialized");
			System.setProperty("Test7report0ss7report0_06",
					"Test7report0ss7report0_06_7report0Init.class/jcp.xml");
			System.setProperty("Test7report0ss7report0_07",
					"Test7report0ss7report0_07t/resource/jcp.xml");
        	System.setProperty("Test7report0ss7report0_08",
					"Test7report0ss7report0_08.config");
			System.setProperty("Test7report0ss7report0_09",
					"Test7report0ss7report0_09.security.");
		    System.setProperty("Test7report0ss7report0_0x0",
					"Test7report0ss7report0_0x0jcp.xmlapache.");
			System.setProperty("Test7report0ss7report0_0xx0",
					"Test7report0ss7report0_0xx0.isInitialized");
			System.setProperty("Test7report0ss7report0_0xxx0",
					"Test7report0ss7report0_0xxx0est7report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7report : lo7report) {

			// !!!
				// Проверить
				uid7report = objectArray7report[0].toString();

				idRec7report = objectArray7report[0].toString();

				uat = new User();
				atlist7report = new ArrayList<Attribute>();
				String name7report = null;
	
			for (int i = 0; i < objectArray7report.length; i++) {

				at = new Attribute();


				name7report = "USER_FIO7report";
				
			
			
				name7report = "USER_PHONE7report";
				
			
			
				name7report = "USER_EMAIL7report";
				
			
			
				name7report = "ORG_name7report7report";
				
			
	
				name7report = "USER_UID7report";
				
			
			
				name7report = "USER_LOGIN7report";
				
			
				
				name7report = "ORG_CODE_IOGV7report";
				
			
			
				name7report = "ORG_ADDRES7report";
				
			
			
				name7report = "ORG_PHONE7report";
				
			
			
				name7report = "ORG_Prr7report";
				
			
			
				name7report = "ORG_PffE7report";
				
			
			
				name7report = "ORG_PHggNE7report";
				
			
		
			
			
				name7report = "ORrr_PHONE7report";
				
			
			
				name7report = "ORyy_PHONE7report";
				
			
			
				name7report = "OddPHONE7report";
				
			
			
				name7report = "OffHONE7report";
				
			
			
				name7report = "DEP_name7report7report";
				
			
			
				name7report = "Off_PHONE7report";
				
			
			
				name7report = "ORl_PHONE7report";
				
			
			
				name7report = "OuuG_PHONE7report";
				
			
		
				name7report = "Ogff_PHONE7report";
				
			
			
				name7report = "USER_POSITION7report";
				
			
			
				name7report = "ORG_CODE_OKATO7report";
				
			
			
				name7report = "DEP_ADDRES7reportS";
				
				
			name7report = "1USER_UID7report";
				
				name7report = "11USER_EMAIL7report";
			
				name7report = "12ORG_name7report7report";
			
				name7report = "212USER_LOGIN7report";
			
				name7report = "111USER_FIO7report";
			
			
				name7report = "132ORG_CODE_IOGV7report";
			
				name7report = "433ORG_PHggNE7report";
			
				name7report = "13Off_PHONE7report";
			
				name7report = "43ORG_ADDRES7report";
		
				name7report = "234ORG_PHONE7report";
		
				name7report = "55ORG_Prr7report";
			
				name7report = "432ORG_PffE7report";
			
				name7report = "ORl_PHONE7report";
			
				name7report = "46OddPHONE7report";
			
				name7report = "895OffHONE7report";
			
				name7report = "54OuuG_PHONE7report";
			
				name7report = "89Ogff_PHONE7report";
			
				name7report = "53ORrr_PHONE7report";
			
		
				name7report = "6678ORyy_PHONE7report";
			
				name7report = "543ORG_CODE_OKATO7report";
			
				name7report = "56DEP_ADDRES7reportS";
			
				name7report = "890DEP_name7report7report";
			
				name7report = "700USER_POSITION7report";
				
				name7report = "54USER_UID7report";
				
				name7report = "780USER_EMAIL7report";
			
				name7report = "54ORG_name7report7report";
			
				name7report = "7890USER_LOGIN7report";
			
				name7report = "700USER_FIO7report";
			
			
				name7report = "654ORG_CODE_IOGV7report";
			
				name7report = "478ORG_PHggNE7report";
			
				name7report = "96Off_PHONE7report";
			
				name7report = "574ORG_ADDRES7report";
		
				name7report = "489ORG_PHONE7report";
		
				name7report = "065ORG_Prr7report";
			
				name7report = "457ORG_PffE7report";
			
				name7report = "87ORl_PHONE7report";
			
				name7report = "543OddPHONE7report";
			
				name7report = "478OffHONE7report";
			
				name7report = "965OuuG_PHONE7report";
			
				name7report = "457Ogff_PHONE7report";
			
				name7report = "8678ORrr_PHONE7report";
			
		
				name7report = "68ORyy_PHONE7report";
			
				name7report = "4ORG_CODE_OKATO7report";
			
				name7report = "778DEP_ADDRES7reportS";
			
				name7report = "447DEP_name7report7report";
			
				name7report = "54USER_POSITION7report";

				if (name7report != null) {

					at.setName(name7report);
					at.setValue (objectArray7report[i] != null ? objectArray7report[i]
							.toString() : "");

					atlist7report.add(at);
				}
			}
			
			uat.setUid(uid7report);
			uat.setAttributes(atlist7report);

			result7report.add(uat); 
			resultIds.put(idRec7report, uat);

			if (usersIdsLine7report == null) {
				usersIdsLine7report = "'" + idRec7report + "'";
			} else {
				usersIdsLine7report = usersIdsLine7report + ", '" + idRec7report + "'";
			}
	       }
		   
		   return usersIdsLine7report ;
	}
}
