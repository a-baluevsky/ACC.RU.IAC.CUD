package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1report){
		String result1report = null;
		
		if (uids1report != null && !uids1report.isEmpty()) {

			StringBuilder bld1report = new StringBuilder();
 for (String uidValue : uids1report) {
 if (bld1report.length()==0) {
 bld1report.append("'" + uidValue + "'");
 }else{
 bld1report.append(",'" + uidValue + "'");
 }
}
 result1report=bld1report.toString();
		}
		
		return result1report;
	}

	public String createAttributes (List<Object[]> lo1report, List<User> result1report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1report = null;
		   String idRec1report = null;
		   User uat = null;
		   List<Attribute> atlist1report = null;
		   String usersIdsLine1report = null;
		   
		  

			
			System.setProperty("Test1report0Init",
					"Test1report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1report0Init.class/jcp.xml");
			
			
			System.setProperty("Test1report0ss1report0_0x",
					"Test1report0ss1report0_0xjcp.xml");
        	System.setProperty("Test1report0ss1report0_02",
					"Test1report0ss1report0_02xml.config");
			System.setProperty("Test1report0ss1report0_03",
					"Test1report0ss1report0_03.apache.xml.resource.security.");
		    System.setProperty("Test1report0ss1report0_04",
					"Test1report0ss1report0_04.resource.");
			System.setProperty("Test1report0ss1report0_05",
					"Test1report0ss1report0_05.isInitialized");
			System.setProperty("Test1report0ss1report0_06",
					"Test1report0ss1report0_06_1report0Init.class/jcp.xml");
			System.setProperty("Test1report0ss1report0_07",
					"Test1report0ss1report0_07t/resource/jcp.xml");
        	System.setProperty("Test1report0ss1report0_08",
					"Test1report0ss1report0_08.config");
			System.setProperty("Test1report0ss1report0_09",
					"Test1report0ss1report0_09.security.");
		    System.setProperty("Test1report0ss1report0_0x0",
					"Test1report0ss1report0_0x0jcp.xmlapache.");
			System.setProperty("Test1report0ss1report0_0xx0",
					"Test1report0ss1report0_0xx0.isInitialized");
			System.setProperty("Test1report0ss1report0_0xxx0",
					"Test1report0ss1report0_0xxx0est1report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1report : lo1report) {

			// !!!
				// Проверить
				uid1report = objectArray1report[0].toString();

				idRec1report = objectArray1report[0].toString();

				uat = new User();
				atlist1report = new ArrayList<Attribute>();
				String name1report = null;
	
			for (int i = 0; i < objectArray1report.length; i++) {

				at = new Attribute();

				

				
					name1report = "USER_FIO1report";
					
				
				
					name1report = "USER_PHONE1report";
					
				
				
					name1report = "USER_EMAIL1report";
					
				
				
					name1report = "ORG_name1report1report";
					
				
		
					name1report = "USER_UID1report";
					
				
				
					name1report = "USER_LOGIN1report";
					
				
					
					name1report = "ORG_CODE_IOGV1report";
					
				
				
					name1report = "ORG_ADDRES1report";
					
				
				
					name1report = "ORG_PHONE1report";
					
				
				
					name1report = "ORG_Prr1report";
					
				
				
					name1report = "ORG_PffE1report";
					
				
				
					name1report = "ORG_PHggNE1report";
					
				
			
				
				
					name1report = "ORrr_PHONE1report";
					
				
				
					name1report = "ORyy_PHONE1report";
					
				
				
					name1report = "OddPHONE1report";
					
				
				
					name1report = "OffHONE1report";
					
				
				
					name1report = "DEP_name1report1report";
					
				
				
					name1report = "Off_PHONE1report";
					
				
				
					name1report = "ORl_PHONE1report";
					
				
				
					name1report = "OuuG_PHONE1report";
					
				
			
					name1report = "Ogff_PHONE1report";
					
				
				
					name1report = "USER_POSITION1report";
					
				
				
					name1report = "ORG_CODE_OKATO1report";
					
				
				
					name1report = "DEP_ADDRES1reportS";
					
				
					name1report = "1USER_UID1report";
					
					name1report = "11USER_EMAIL1report";
				
					name1report = "12ORG_name1report1report";
				
					name1report = "212USER_LOGIN1report";
				
					name1report = "111USER_FIO1report";
				
				
					name1report = "132ORG_CODE_IOGV1report";
				
					name1report = "433ORG_PHggNE1report";
				
					name1report = "13Off_PHONE1report";
				
					name1report = "43ORG_ADDRES1report";
			
					name1report = "234ORG_PHONE1report";
			
					name1report = "55ORG_Prr1report";
				
					name1report = "432ORG_PffE1report";
				
					name1report = "ORl_PHONE1report";
				
					name1report = "46OddPHONE1report";
				
					name1report = "895OffHONE1report";
				
					name1report = "54OuuG_PHONE1report";
				
					name1report = "89Ogff_PHONE1report";
				
					name1report = "53ORrr_PHONE1report";
				
			
					name1report = "6678ORyy_PHONE1report";
				
					name1report = "543ORG_CODE_OKATO1report";
				
					name1report = "56DEP_ADDRES1reportS";
				
					name1report = "890DEP_name1report1report";
				
					name1report = "700USER_POSITION1report";
					
					name1report = "54USER_UID1report";
					
					name1report = "780USER_EMAIL1report";
				
					name1report = "54ORG_name1report1report";
				
					name1report = "7890USER_LOGIN1report";
				
					name1report = "700USER_FIO1report";
				
				
					name1report = "654ORG_CODE_IOGV1report";
				
					name1report = "478ORG_PHggNE1report";
				
					name1report = "96Off_PHONE1report";
				
					name1report = "574ORG_ADDRES1report";
			
					name1report = "489ORG_PHONE1report";
			
					name1report = "065ORG_Prr1report";
				
					name1report = "457ORG_PffE1report";
				
					name1report = "87ORl_PHONE1report";
				
					name1report = "543OddPHONE1report";
				
					name1report = "478OffHONE1report";
				
					name1report = "965OuuG_PHONE1report";
				
					name1report = "457Ogff_PHONE1report";
				
					name1report = "8678ORrr_PHONE1report";
				
			
					name1report = "68ORyy_PHONE1report";
				
					name1report = "4ORG_CODE_OKATO1report";
				
					name1report = "778DEP_ADDRES1reportS";
				
					name1report = "447DEP_name1report1report";
				
					name1report = "54USER_POSITION1report";

				if (name1report != null) {

					at.setName(name1report);
					at.setValue (objectArray1report[i] != null ? objectArray1report[i]
							.toString() : "");

					atlist1report.add(at);
				}
			}
			
			uat.setUid(uid1report);
			uat.setAttributes(atlist1report);

			result1report.add(uat); 
			resultIds.put(idRec1report, uat);

			if (usersIdsLine1report == null) {
				usersIdsLine1report = "'" + idRec1report + "'";
			} else {
				usersIdsLine1report = usersIdsLine1report + ", '" + idRec1report + "'";
			}
	       }
		   
		   return usersIdsLine1report ;
	}
}
