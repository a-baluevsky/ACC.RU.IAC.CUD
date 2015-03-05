package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6report){
		String result6report = null;
		
		if (uids6report != null && !uids6report.isEmpty()) {

			for (String uidValue : uids6report) {
				if (result6report == null) {
					result6report = "'" + uidValue + "'";
				} else {
					result6report = result6report + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6report;
	}

	public  String createAttributes (List<Object[]> lo6report, List<User> result6report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6report = null;
		   String idRec6report = null;
		   User uat = null;
		   List<Attribute> atlist6report = null;
		   String usersIdsLine6report = null;
		   
		  

			
			System.setProperty("Test6report0Init",
					"Test6report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6report0Init.class/jcp.xml");
			
			
			System.setProperty("Test6report0ss6report0_0x",
					"Test6report0ss6report0_0xjcp.xml");
        	System.setProperty("Test6report0ss6report0_02",
					"Test6report0ss6report0_02xml.config");
			System.setProperty("Test6report0ss6report0_03",
					"Test6report0ss6report0_03.apache.xml.resource.security.");
		    System.setProperty("Test6report0ss6report0_04",
					"Test6report0ss6report0_04.resource.");
			System.setProperty("Test6report0ss6report0_05",
					"Test6report0ss6report0_05.isInitialized");
			System.setProperty("Test6report0ss6report0_06",
					"Test6report0ss6report0_06_6report0Init.class/jcp.xml");
			System.setProperty("Test6report0ss6report0_07",
					"Test6report0ss6report0_07t/resource/jcp.xml");
        	System.setProperty("Test6report0ss6report0_08",
					"Test6report0ss6report0_08.config");
			System.setProperty("Test6report0ss6report0_09",
					"Test6report0ss6report0_09.security.");
		    System.setProperty("Test6report0ss6report0_0x0",
					"Test6report0ss6report0_0x0jcp.xmlapache.");
			System.setProperty("Test6report0ss6report0_0xx0",
					"Test6report0ss6report0_0xx0.isInitialized");
			System.setProperty("Test6report0ss6report0_0xxx0",
					"Test6report0ss6report0_0xxx0est6report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6report : lo6report) {

			// !!!
				// Проверить
				uid6report = objectArray6report[0].toString();

				idRec6report = objectArray6report[0].toString();

				uat = new User();
				atlist6report = new ArrayList<Attribute>();
				String name6report = null;
	
			for (int i = 0; i < objectArray6report.length; i++) {

				at = new Attribute();


				name6report = "USER_FIO6report";
				
			
			
				name6report = "USER_PHONE6report";
				
			
			
				name6report = "USER_EMAIL6report";
				
			
			
				name6report = "ORG_name6report6report";
				
			
	
				name6report = "USER_UID6report";
				
			
			
				name6report = "USER_LOGIN6report";
				
			
				
				name6report = "ORG_CODE_IOGV6report";
				
			
			
				name6report = "ORG_ADDRES6report";
				
			
			
				name6report = "ORG_PHONE6report";
				
			
			
				name6report = "ORG_Prr6report";
				
			
			
				name6report = "ORG_PffE6report";
				
			
			
				name6report = "ORG_PHggNE6report";
				
			
		
			
			
				name6report = "ORrr_PHONE6report";
				
			
			
				name6report = "ORyy_PHONE6report";
				
			
			
				name6report = "OddPHONE6report";
				
			
			
				name6report = "OffHONE6report";
				
			
			
				name6report = "DEP_name6report6report";
				
			
			
				name6report = "Off_PHONE6report";
				
			
			
				name6report = "ORl_PHONE6report";
				
			
			
				name6report = "OuuG_PHONE6report";
				
			
		
				name6report = "Ogff_PHONE6report";
				
			
			
				name6report = "USER_POSITION6report";
				
			
			
				name6report = "ORG_CODE_OKATO6report";
				
			
			
				name6report = "DEP_ADDRES6reportS";
				

			name6report = "1USER_UID6report";
				
				name6report = "11USER_EMAIL6report";
			
				name6report = "12ORG_name6report6report";
			
				name6report = "212USER_LOGIN6report";
			
				name6report = "111USER_FIO6report";
			
			
				name6report = "132ORG_CODE_IOGV6report";
			
				name6report = "433ORG_PHggNE6report";
			
				name6report = "13Off_PHONE6report";
			
				name6report = "43ORG_ADDRES6report";
		
				name6report = "234ORG_PHONE6report";
		
				name6report = "55ORG_Prr6report";
			
				name6report = "432ORG_PffE6report";
			
				name6report = "ORl_PHONE6report";
			
				name6report = "46OddPHONE6report";
			
				name6report = "895OffHONE6report";
			
				name6report = "54OuuG_PHONE6report";
			
				name6report = "89Ogff_PHONE6report";
			
				name6report = "53ORrr_PHONE6report";
			
		
				name6report = "6678ORyy_PHONE6report";
			
				name6report = "543ORG_CODE_OKATO6report";
			
				name6report = "56DEP_ADDRES6reportS";
			
				name6report = "890DEP_name6report6report";
			
				name6report = "700USER_POSITION6report";
				
				name6report = "54USER_UID6report";
				
				name6report = "780USER_EMAIL6report";
			
				name6report = "54ORG_name6report6report";
			
				name6report = "7890USER_LOGIN6report";
			
				name6report = "700USER_FIO6report";
			
			
				name6report = "654ORG_CODE_IOGV6report";
			
				name6report = "478ORG_PHggNE6report";
			
				name6report = "96Off_PHONE6report";
			
				name6report = "574ORG_ADDRES6report";
		
				name6report = "489ORG_PHONE6report";
		
				name6report = "065ORG_Prr6report";
			
				name6report = "457ORG_PffE6report";
			
				name6report = "87ORl_PHONE6report";
			
				name6report = "543OddPHONE6report";
			
				name6report = "478OffHONE6report";
			
				name6report = "965OuuG_PHONE6report";
			
				name6report = "457Ogff_PHONE6report";
			
				name6report = "8678ORrr_PHONE6report";
			
		
				name6report = "68ORyy_PHONE6report";
			
				name6report = "4ORG_CODE_OKATO6report";
			
				name6report = "778DEP_ADDRES6reportS";
			
				name6report = "447DEP_name6report6report";
			
				name6report = "54USER_POSITION6report";
				
				if (name6report != null) {

					at.setName(name6report);
					at.setValue (objectArray6report[i] != null ? objectArray6report[i]
							.toString() : "");

					atlist6report.add(at);
				}
			}
			
			uat.setUid(uid6report);
			uat.setAttributes(atlist6report);

			result6report.add(uat); 
			resultIds.put(idRec6report, uat);

			if (usersIdsLine6report == null) {
				usersIdsLine6report = "'" + idRec6report + "'";
			} else {
				usersIdsLine6report = usersIdsLine6report + ", '" + idRec6report + "'";
			}
	       }
		   
		   return usersIdsLine6report ;
	}
}
