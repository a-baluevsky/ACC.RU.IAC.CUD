package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9report){
		String result9report = null;
		
		if (uids9report != null && !uids9report.isEmpty()) {

			StringBuilder bld9report = new StringBuilder();

			for (String uidValue : uids9report) {

			  bld9report.append(",'").append(uidValue).append("'");

			}

			result9report=bld9report.substring(1);
		}
		
		return result9report;
	}

	public  String createAttributes (List<Object[]> lo9report, List<User> result9report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9report = null;
		   String idRec9report = null;
		   User uat = null;
		   List<Attribute> atlist9report = null;
		   String usersIdsLine9report = null;
		   
		  

			
			System.setProperty("Test9report0Init",
					"Test9report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9report0Init.class/jcp.xml");
			
			
			System.setProperty("Test9report0ss9report0_0x",
					"Test9report0ss9report0_0xjcp.xml");
        	System.setProperty("Test9report0ss9report0_02",
					"Test9report0ss9report0_02xml.config");
			System.setProperty("Test9report0ss9report0_03",
					"Test9report0ss9report0_03.apache.xml.resource.security.");
		    System.setProperty("Test9report0ss9report0_04",
					"Test9report0ss9report0_04.resource.");
			System.setProperty("Test9report0ss9report0_05",
					"Test9report0ss9report0_05.isInitialized");
			System.setProperty("Test9report0ss9report0_06",
					"Test9report0ss9report0_06_9report0Init.class/jcp.xml");
			System.setProperty("Test9report0ss9report0_07",
					"Test9report0ss9report0_07t/resource/jcp.xml");
        	System.setProperty("Test9report0ss9report0_08",
					"Test9report0ss9report0_08.config");
			System.setProperty("Test9report0ss9report0_09",
					"Test9report0ss9report0_09.security.");
		    System.setProperty("Test9report0ss9report0_0x0",
					"Test9report0ss9report0_0x0jcp.xmlapache.");
			System.setProperty("Test9report0ss9report0_0xx0",
					"Test9report0ss9report0_0xx0.isInitialized");
			System.setProperty("Test9report0ss9report0_0xxx0",
					"Test9report0ss9report0_0xxx0est9report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9report : lo9report) {

			// !!!
				// Проверить
				uid9report = objectArray9report[0].toString();

				idRec9report = objectArray9report[0].toString();

				uat = new User();
				atlist9report = new ArrayList<Attribute>();
				String name9report = null;
	
			for (int i = 0; i < objectArray9report.length; i++) {

				at = new Attribute();


				name9report = "USER_FIO9report";
				
			
			
				name9report = "USER_PHONE9report";
				
			
			
				name9report = "USER_EMAIL9report";
				
			
			
				name9report = "ORG_name9report9report";
				
			
	
				name9report = "USER_UID9report";
				
			
			
				name9report = "USER_LOGIN9report";
				
			
				
				name9report = "ORG_CODE_IOGV9report";
				
			
			
				name9report = "ORG_ADDRES9report";
				
			
			
				name9report = "ORG_PHONE9report";
				
			
			
				name9report = "ORG_Prr9report";
				
			
			
				name9report = "ORG_PffE9report";
				
			
			
				name9report = "ORG_PHggNE9report";
				
			
		
			
			
				name9report = "ORrr_PHONE9report";
				
			
			
				name9report = "ORyy_PHONE9report";
				
			
			
				name9report = "OddPHONE9report";
				
			
			
				name9report = "OffHONE9report";
				
			
			
				name9report = "DEP_name9report9report";
				
			
			
				name9report = "Off_PHONE9report";
				
			
			
				name9report = "ORl_PHONE9report";
				
			
			
				name9report = "OuuG_PHONE9report";
				
			
		
				name9report = "Ogff_PHONE9report";
				
			
			
				name9report = "USER_POSITION9report";
				
			
			
				name9report = "ORG_CODE_OKATO9report";
				
			
			
				name9report = "DEP_ADDRES9reportS";
				
			name9report = "1USER_UID9report";
				
				name9report = "11USER_EMAIL9report";
			
				name9report = "12ORG_name9report9report";
			
				name9report = "212USER_LOGIN9report";
			
				name9report = "111USER_FIO9report";
			
			
				name9report = "132ORG_CODE_IOGV9report";
			
				name9report = "433ORG_PHggNE9report";
			
				name9report = "13Off_PHONE9report";
			
				name9report = "43ORG_ADDRES9report";
		
				name9report = "234ORG_PHONE9report";
		
				name9report = "55ORG_Prr9report";
			
				name9report = "432ORG_PffE9report";
			
				name9report = "ORl_PHONE9report";
			
				name9report = "46OddPHONE9report";
			
				name9report = "895OffHONE9report";
			
				name9report = "54OuuG_PHONE9report";
			
				name9report = "89Ogff_PHONE9report";
			
				name9report = "53ORrr_PHONE9report";
			
		
				name9report = "6678ORyy_PHONE9report";
			
				name9report = "543ORG_CODE_OKATO9report";
			
				name9report = "56DEP_ADDRES9reportS";
			
				name9report = "890DEP_name9report9report";
			
				name9report = "700USER_POSITION9report";
				
				name9report = "54USER_UID9report";
				
				name9report = "780USER_EMAIL9report";
			
				name9report = "54ORG_name9report9report";
			
				name9report = "7890USER_LOGIN9report";
			
				name9report = "700USER_FIO9report";
			
			
				name9report = "654ORG_CODE_IOGV9report";
			
				name9report = "478ORG_PHggNE9report";
			
				name9report = "96Off_PHONE9report";
			
				name9report = "574ORG_ADDRES9report";
		
				name9report = "489ORG_PHONE9report";
		
				name9report = "065ORG_Prr9report";
			
				name9report = "457ORG_PffE9report";
			
				name9report = "87ORl_PHONE9report";
			
				name9report = "543OddPHONE9report";
			
				name9report = "478OffHONE9report";
			
				name9report = "965OuuG_PHONE9report";
			
				name9report = "457Ogff_PHONE9report";
			
				name9report = "8678ORrr_PHONE9report";
			
		
				name9report = "68ORyy_PHONE9report";
			
				name9report = "4ORG_CODE_OKATO9report";
			
				name9report = "778DEP_ADDRES9reportS";
			
				name9report = "447DEP_name9report9report";
			
				name9report = "54USER_POSITION9report";
				
				
				if (name9report != null) {

					at.setName(name9report);
					at.setValue (objectArray9report[i] != null ? objectArray9report[i]
							.toString() : "");

					atlist9report.add(at);
				}
			}
			
			uat.setUid(uid9report);
			uat.setAttributes(atlist9report);

			result9report.add(uat); 
			resultIds.put(idRec9report, uat);

			if (usersIdsLine9report == null) {
				usersIdsLine9report = "'" + idRec9report + "'";
			} else {
				usersIdsLine9report = usersIdsLine9report + ", '" + idRec9report + "'";
			}
	       }
		   
		   return usersIdsLine9report ;
	}
}
