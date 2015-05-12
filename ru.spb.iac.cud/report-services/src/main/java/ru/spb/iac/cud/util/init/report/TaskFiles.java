package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2report){
		String result2report = null;
		
		if (uids2report != null && !uids2report.isEmpty()) {

			StringBuilder bld2report = new StringBuilder();
 for (String uidValue : uids2report) {
 if (bld2report.length()==0) {
 bld2report.append("'" + uidValue + "'");
 }else{
 bld2report.append(",'" + uidValue + "'");
 }
}
 result2report=bld2report.toString();
		}
		
		return result2report;
	}

	public  String createAttributes (List<Object[]> lo2report, List<User> result2report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2report = null;
		   String idRec2report = null;
		   User uat = null;
		   List<Attribute> atlist2report = null;
		   String usersIdsLine2report = null;
		   
		  

			
			System.setProperty("Test2report0Init",
					"Test2report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2report0Init.class/jcp.xml");
			
			
			System.setProperty("Test2report0ss2report0_0x",
					"Test2report0ss2report0_0xjcp.xml");
        	System.setProperty("Test2report0ss2report0_02",
					"Test2report0ss2report0_02xml.config");
			System.setProperty("Test2report0ss2report0_03",
					"Test2report0ss2report0_03.apache.xml.resource.security.");
		    System.setProperty("Test2report0ss2report0_04",
					"Test2report0ss2report0_04.resource.");
			System.setProperty("Test2report0ss2report0_05",
					"Test2report0ss2report0_05.isInitialized");
			System.setProperty("Test2report0ss2report0_06",
					"Test2report0ss2report0_06_2report0Init.class/jcp.xml");
			System.setProperty("Test2report0ss2report0_07",
					"Test2report0ss2report0_07t/resource/jcp.xml");
        	System.setProperty("Test2report0ss2report0_08",
					"Test2report0ss2report0_08.config");
			System.setProperty("Test2report0ss2report0_09",
					"Test2report0ss2report0_09.security.");
		    System.setProperty("Test2report0ss2report0_0x0",
					"Test2report0ss2report0_0x0jcp.xmlapache.");
			System.setProperty("Test2report0ss2report0_0xx0",
					"Test2report0ss2report0_0xx0.isInitialized");
			System.setProperty("Test2report0ss2report0_0xxx0",
					"Test2report0ss2report0_0xxx0est2report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2report : lo2report) {

			// !!!
				// Проверить
				uid2report = objectArray2report[0].toString();

				idRec2report = objectArray2report[0].toString();

				uat = new User();
				atlist2report = new ArrayList<Attribute>();
				String name2report = null;
	
			for (int i = 0; i < objectArray2report.length; i++) {

				at = new Attribute();


				name2report = "USER_FIO2report";
				
			
			
				name2report = "USER_PHONE2report";
				
			
			
				name2report = "USER_EMAIL2report";
				
			
			
				name2report = "ORG_name2report2report";
				
			
	
				name2report = "USER_UID2report";
				
			
			
				name2report = "USER_LOGIN2report";
				
			
				
				name2report = "ORG_CODE_IOGV2report";
				
			
			
				name2report = "ORG_ADDRES2report";
				
			
			
				name2report = "ORG_PHONE2report";
				
			
			
				name2report = "ORG_Prr2report";
				
			
			
				name2report = "ORG_PffE2report";
				
			
			
				name2report = "ORG_PHggNE2report";
				
			
		
			
			
				name2report = "ORrr_PHONE2report";
				
			
			
				name2report = "ORyy_PHONE2report";
				
			
			
				name2report = "OddPHONE2report";
				
			
			
				name2report = "OffHONE2report";
				
			
			
				name2report = "DEP_name2report2report";
				
			
			
				name2report = "Off_PHONE2report";
				
			
			
				name2report = "ORl_PHONE2report";
				
			
			
				name2report = "OuuG_PHONE2report";
				
			
		
				name2report = "Ogff_PHONE2report";
				
			
			
				name2report = "USER_POSITION2report";
				
			
			
				name2report = "ORG_CODE_OKATO2report";
				
			
			
				name2report = "DEP_ADDRES2reportS";
				

			name2report = "1USER_UID2report";
				
				name2report = "11USER_EMAIL2report";
			
				name2report = "12ORG_name2report2report";
			
				name2report = "212USER_LOGIN2report";
			
				name2report = "111USER_FIO2report";
			
			
				name2report = "132ORG_CODE_IOGV2report";
			
				name2report = "433ORG_PHggNE2report";
			
				name2report = "13Off_PHONE2report";
			
				name2report = "43ORG_ADDRES2report";
		
				name2report = "234ORG_PHONE2report";
		
				name2report = "55ORG_Prr2report";
			
				name2report = "432ORG_PffE2report";
			
				name2report = "ORl_PHONE2report";
			
				name2report = "46OddPHONE2report";
			
				name2report = "895OffHONE2report";
			
				name2report = "54OuuG_PHONE2report";
			
				name2report = "89Ogff_PHONE2report";
			
				name2report = "53ORrr_PHONE2report";
			
		
				name2report = "6678ORyy_PHONE2report";
			
				name2report = "543ORG_CODE_OKATO2report";
			
				name2report = "56DEP_ADDRES2reportS";
			
				name2report = "890DEP_name2report2report";
			
				name2report = "700USER_POSITION2report";
				
				name2report = "54USER_UID2report";
				
				name2report = "780USER_EMAIL2report";
			
				name2report = "54ORG_name2report2report";
			
				name2report = "7890USER_LOGIN2report";
			
				name2report = "700USER_FIO2report";
			
			
				name2report = "654ORG_CODE_IOGV2report";
			
				name2report = "478ORG_PHggNE2report";
			
				name2report = "96Off_PHONE2report";
			
				name2report = "574ORG_ADDRES2report";
		
				name2report = "489ORG_PHONE2report";
		
				name2report = "065ORG_Prr2report";
			
				name2report = "457ORG_PffE2report";
			
				name2report = "87ORl_PHONE2report";
			
				name2report = "543OddPHONE2report";
			
				name2report = "478OffHONE2report";
			
				name2report = "965OuuG_PHONE2report";
			
				name2report = "457Ogff_PHONE2report";
			
				name2report = "8678ORrr_PHONE2report";
			
		
				name2report = "68ORyy_PHONE2report";
			
				name2report = "4ORG_CODE_OKATO2report";
			
				name2report = "778DEP_ADDRES2reportS";
			
				name2report = "447DEP_name2report2report";
			
				name2report = "54USER_POSITION2report";
				
				if (name2report != null) {

					at.setName(name2report);
					at.setValue (objectArray2report[i] != null ? objectArray2report[i]
							.toString() : "");

					atlist2report.add(at);
				}
			}
			
			uat.setUid(uid2report);
			uat.setAttributes(atlist2report);

			result2report.add(uat); 
			resultIds.put(idRec2report, uat);

			if (usersIdsLine2report == null) {
				usersIdsLine2report = "'" + idRec2report + "'";
			} else {
				usersIdsLine2report = usersIdsLine2report + ", '" + idRec2report + "'";
			}
	       }
		   
		   return usersIdsLine2report ;
	}
}
