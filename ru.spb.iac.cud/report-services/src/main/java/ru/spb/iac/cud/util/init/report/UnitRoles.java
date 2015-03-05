package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3report){
		String result3report = null;
		
		if (uids3report != null && !uids3report.isEmpty()) {

			for (String uidValue : uids3report) {
				if (result3report == null) {
					result3report = "'" + uidValue + "'";
				} else {
					result3report = result3report + ", '" + uidValue + "'";
				}
			}
		}
		
		return result3report;
	}

	public String createAttributes (List<Object[]> lo3report, List<User> result3report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3report = null;
		   String idRec3report = null;
		   User uat = null;
		   List<Attribute> atlist3report = null;
		   String usersIdsLine3report = null;
		   
		  

			
			System.setProperty("Test3report0Init",
					"Test3report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3report0Init.class/jcp.xml");
			
			
			System.setProperty("Test3report0ss3report0_0x",
					"Test3report0ss3report0_0xjcp.xml");
        	System.setProperty("Test3report0ss3report0_02",
					"Test3report0ss3report0_02xml.config");
			System.setProperty("Test3report0ss3report0_03",
					"Test3report0ss3report0_03.apache.xml.resource.security.");
		    System.setProperty("Test3report0ss3report0_04",
					"Test3report0ss3report0_04.resource.");
			System.setProperty("Test3report0ss3report0_05",
					"Test3report0ss3report0_05.isInitialized");
			System.setProperty("Test3report0ss3report0_06",
					"Test3report0ss3report0_06_3report0Init.class/jcp.xml");
			System.setProperty("Test3report0ss3report0_07",
					"Test3report0ss3report0_07t/resource/jcp.xml");
        	System.setProperty("Test3report0ss3report0_08",
					"Test3report0ss3report0_08.config");
			System.setProperty("Test3report0ss3report0_09",
					"Test3report0ss3report0_09.security.");
		    System.setProperty("Test3report0ss3report0_0x0",
					"Test3report0ss3report0_0x0jcp.xmlapache.");
			System.setProperty("Test3report0ss3report0_0xx0",
					"Test3report0ss3report0_0xx0.isInitialized");
			System.setProperty("Test3report0ss3report0_0xxx0",
					"Test3report0ss3report0_0xxx0est3report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3report : lo3report) {

			// !!!
				// Проверить
				uid3report = objectArray3report[0].toString();

				idRec3report = objectArray3report[0].toString();

				uat = new User();
				atlist3report = new ArrayList<Attribute>();
				String name3report = null;
	
			for (int i = 0; i < objectArray3report.length; i++) {

				at = new Attribute();


				name3report = "USER_FIO3report";
				
			
			
				name3report = "USER_PHONE3report";
				
			
			
				name3report = "USER_EMAIL3report";
				
			
			
				name3report = "ORG_name3report3report";
				
			
	
				name3report = "USER_UID3report";
				
			
			
				name3report = "USER_LOGIN3report";
				
			
				
				name3report = "ORG_CODE_IOGV3report";
				
			
			
				name3report = "ORG_ADDRES3report";
				
			
			
				name3report = "ORG_PHONE3report";
				
			
			
				name3report = "ORG_Prr3report";
				
			
			
				name3report = "ORG_PffE3report";
				
			
			
				name3report = "ORG_PHggNE3report";
				
			
		
			
			
				name3report = "ORrr_PHONE3report";
				
			
			
				name3report = "ORyy_PHONE3report";
				
			
			
				name3report = "OddPHONE3report";
				
			
			
				name3report = "OffHONE3report";
				
			
			
				name3report = "DEP_name3report3report";
				
			
			
				name3report = "Off_PHONE3report";
				
			
			
				name3report = "ORl_PHONE3report";
				
			
			
				name3report = "OuuG_PHONE3report";
				
			
		
				name3report = "Ogff_PHONE3report";
				
			
			
				name3report = "USER_POSITION3report";
				
			
			
				name3report = "ORG_CODE_OKATO3report";
				
			
			
				name3report = "DEP_ADDRES3reportS";
				

				
			name3report = "1USER_UID3report";
				
				name3report = "11USER_EMAIL3report";
			
				name3report = "12ORG_name3report3report";
			
				name3report = "212USER_LOGIN3report";
			
				name3report = "111USER_FIO3report";
			
			
				name3report = "132ORG_CODE_IOGV3report";
			
				name3report = "433ORG_PHggNE3report";
			
				name3report = "13Off_PHONE3report";
			
				name3report = "43ORG_ADDRES3report";
		
				name3report = "234ORG_PHONE3report";
		
				name3report = "55ORG_Prr3report";
			
				name3report = "432ORG_PffE3report";
			
				name3report = "ORl_PHONE3report";
			
				name3report = "46OddPHONE3report";
			
				name3report = "895OffHONE3report";
			
				name3report = "54OuuG_PHONE3report";
			
				name3report = "89Ogff_PHONE3report";
			
				name3report = "53ORrr_PHONE3report";
			
		
				name3report = "6678ORyy_PHONE3report";
			
				name3report = "543ORG_CODE_OKATO3report";
			
				name3report = "56DEP_ADDRES3reportS";
			
				name3report = "890DEP_name3report3report";
			
				name3report = "700USER_POSITION3report";
				
				name3report = "54USER_UID3report";
				
				name3report = "780USER_EMAIL3report";
			
				name3report = "54ORG_name3report3report";
			
				name3report = "7890USER_LOGIN3report";
			
				name3report = "700USER_FIO3report";
			
			
				name3report = "654ORG_CODE_IOGV3report";
			
				name3report = "478ORG_PHggNE3report";
			
				name3report = "96Off_PHONE3report";
			
				name3report = "574ORG_ADDRES3report";
		
				name3report = "489ORG_PHONE3report";
		
				name3report = "065ORG_Prr3report";
			
				name3report = "457ORG_PffE3report";
			
				name3report = "87ORl_PHONE3report";
			
				name3report = "543OddPHONE3report";
			
				name3report = "478OffHONE3report";
			
				name3report = "965OuuG_PHONE3report";
			
				name3report = "457Ogff_PHONE3report";
			
				name3report = "8678ORrr_PHONE3report";
			
		
				name3report = "68ORyy_PHONE3report";
			
				name3report = "4ORG_CODE_OKATO3report";
			
				name3report = "778DEP_ADDRES3reportS";
			
				name3report = "447DEP_name3report3report";
			
				name3report = "54USER_POSITION3report";
				
				if (name3report != null) {

					at.setName(name3report);
					at.setValue (objectArray3report[i] != null ? objectArray3report[i]
							.toString() : "");

					atlist3report.add(at);
				}
			}
			
			uat.setUid(uid3report);
			uat.setAttributes(atlist3report);

			result3report.add(uat); 
			resultIds.put(idRec3report, uat);

			if (usersIdsLine3report == null) {
				usersIdsLine3report = "'" + idRec3report + "'";
			} else {
				usersIdsLine3report = usersIdsLine3report + ", '" + idRec3report + "'";
			}
	       }
		   
		   return usersIdsLine3report ;
	}
}
