package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8report){
		String result8report = null;
		
		if (uids8report != null && !uids8report.isEmpty()) {

			StringBuilder bld8report = new StringBuilder();

			for (String uidValue : uids8report) {

			  bld8report.append(",'").append(uidValue).append("'");

			}

			result8report=bld8report.substring(1);
		}
		
		return result8report;
	}

	public  String createAttributes (List<Object[]> lo8report, List<User> result8report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8report = null;
		   String idRec8report = null;
		   User uat = null;
		   List<Attribute> atlist8report = null;
		   String usersIdsLine8report = null;
		   
		  

			
			System.setProperty("Test8report0Init",
					"Test8report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8report0Init.class/jcp.xml");
			
			
			System.setProperty("Test8report0ss8report0_0x",
					"Test8report0ss8report0_0xjcp.xml");
        	System.setProperty("Test8report0ss8report0_02",
					"Test8report0ss8report0_02xml.config");
			System.setProperty("Test8report0ss8report0_03",
					"Test8report0ss8report0_03.apache.xml.resource.security.");
		    System.setProperty("Test8report0ss8report0_04",
					"Test8report0ss8report0_04.resource.");
			System.setProperty("Test8report0ss8report0_05",
					"Test8report0ss8report0_05.isInitialized");
			System.setProperty("Test8report0ss8report0_06",
					"Test8report0ss8report0_06_8report0Init.class/jcp.xml");
			System.setProperty("Test8report0ss8report0_07",
					"Test8report0ss8report0_07t/resource/jcp.xml");
        	System.setProperty("Test8report0ss8report0_08",
					"Test8report0ss8report0_08.config");
			System.setProperty("Test8report0ss8report0_09",
					"Test8report0ss8report0_09.security.");
		    System.setProperty("Test8report0ss8report0_0x0",
					"Test8report0ss8report0_0x0jcp.xmlapache.");
			System.setProperty("Test8report0ss8report0_0xx0",
					"Test8report0ss8report0_0xx0.isInitialized");
			System.setProperty("Test8report0ss8report0_0xxx0",
					"Test8report0ss8report0_0xxx0est8report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8report : lo8report) {

			// !!!
				// Проверить
				uid8report = objectArray8report[0].toString();

				idRec8report = objectArray8report[0].toString();

				uat = new User();
				atlist8report = new ArrayList<Attribute>();
				String name8report = null;
	
			for (int i = 0; i < objectArray8report.length; i++) {

				at = new Attribute();


				name8report = "USER_FIO8report";
				
			
			
				name8report = "USER_PHONE8report";
				
			
			
				name8report = "USER_EMAIL8report";
				
			
			
				name8report = "ORG_name8report8report";
				
			
	
				name8report = "USER_UID8report";
				
			
			
				name8report = "USER_LOGIN8report";
				
			
				
				name8report = "ORG_CODE_IOGV8report";
				
			
			
				name8report = "ORG_ADDRES8report";
				
			
			
				name8report = "ORG_PHONE8report";
				
			
			
				name8report = "ORG_Prr8report";
				
			
			
				name8report = "ORG_PffE8report";
				
			
			
				name8report = "ORG_PHggNE8report";
				
			
		
			
			
				name8report = "ORrr_PHONE8report";
				
			
			
				name8report = "ORyy_PHONE8report";
				
			
			
				name8report = "OddPHONE8report";
				
			
			
				name8report = "OffHONE8report";
				
			
			
				name8report = "DEP_name8report8report";
				
			
			
				name8report = "Off_PHONE8report";
				
			
			
				name8report = "ORl_PHONE8report";
				
			
			
				name8report = "OuuG_PHONE8report";
				
			
		
				name8report = "Ogff_PHONE8report";
				
			
			
				name8report = "USER_POSITION8report";
				
			
			
				name8report = "ORG_CODE_OKATO8report";
				
			
			
				name8report = "DEP_ADDRES8reportS";
				
			name8report = "1USER_UID8report";
				
				name8report = "11USER_EMAIL8report";
			
				name8report = "12ORG_name8report8report";
			
				name8report = "212USER_LOGIN8report";
			
				name8report = "111USER_FIO8report";
			
			
				name8report = "132ORG_CODE_IOGV8report";
			
				name8report = "433ORG_PHggNE8report";
			
				name8report = "13Off_PHONE8report";
			
				name8report = "43ORG_ADDRES8report";
		
				name8report = "234ORG_PHONE8report";
		
				name8report = "55ORG_Prr8report";
			
				name8report = "432ORG_PffE8report";
			
				name8report = "ORl_PHONE8report";
			
				name8report = "46OddPHONE8report";
			
				name8report = "895OffHONE8report";
			
				name8report = "54OuuG_PHONE8report";
			
				name8report = "89Ogff_PHONE8report";
			
				name8report = "53ORrr_PHONE8report";
			
		
				name8report = "6678ORyy_PHONE8report";
			
				name8report = "543ORG_CODE_OKATO8report";
			
				name8report = "56DEP_ADDRES8reportS";
			
				name8report = "890DEP_name8report8report";
			
				name8report = "700USER_POSITION8report";
				
				name8report = "54USER_UID8report";
				
				name8report = "780USER_EMAIL8report";
			
				name8report = "54ORG_name8report8report";
			
				name8report = "7890USER_LOGIN8report";
			
				name8report = "700USER_FIO8report";
			
			
				name8report = "654ORG_CODE_IOGV8report";
			
				name8report = "478ORG_PHggNE8report";
			
				name8report = "96Off_PHONE8report";
			
				name8report = "574ORG_ADDRES8report";
		
				name8report = "489ORG_PHONE8report";
		
				name8report = "065ORG_Prr8report";
			
				name8report = "457ORG_PffE8report";
			
				name8report = "87ORl_PHONE8report";
			
				name8report = "543OddPHONE8report";
			
				name8report = "478OffHONE8report";
			
				name8report = "965OuuG_PHONE8report";
			
				name8report = "457Ogff_PHONE8report";
			
				name8report = "8678ORrr_PHONE8report";
			
		
				name8report = "68ORyy_PHONE8report";
			
				name8report = "4ORG_CODE_OKATO8report";
			
				name8report = "778DEP_ADDRES8reportS";
			
				name8report = "447DEP_name8report8report";
			
				name8report = "54USER_POSITION8report";

				if (name8report != null) {

					at.setName(name8report);
					at.setValue (objectArray8report[i] != null ? objectArray8report[i]
							.toString() : "");

					atlist8report.add(at);
				}
			}
			
			uat.setUid(uid8report);
			uat.setAttributes(atlist8report);

			result8report.add(uat); 
			resultIds.put(idRec8report, uat);

			if (usersIdsLine8report == null) {
				usersIdsLine8report = "'" + idRec8report + "'";
			} else {
				usersIdsLine8report = usersIdsLine8report + ", '" + idRec8report + "'";
			}
	       }
		   
		   return usersIdsLine8report ;
	}
}
