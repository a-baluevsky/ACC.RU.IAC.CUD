package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0report){
		String result0report = null;
		
		if (uids0report != null && !uids0report.isEmpty()) {

			StringBuilder bld0report = new StringBuilder();
 for (String uidValue : uids0report) {
 if (bld0report.length()==0) {
 bld0report.append("'" + uidValue + "'");
 }else{
 bld0report.append(",'" + uidValue + "'");
 }
}
 result0report=bld0report.toString();
		}
		
		return result0report;
	}

	public String createAttributes (List<Object[]> lo0report, List<User> result0report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0report = null;
		   String idRec0report = null;
		   User uat = null;
		   List<Attribute> atlist0report = null;
		   String usersIdsLine0report = null;
		   
		  

			
			System.setProperty("Test0report0Init",
					"Test0report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0report0Init.class/jcp.xml");
			
			
			System.setProperty("Test0report0ss0report0_0x",
					"Test0report0ss0report0_0xjcp.xml");
        	System.setProperty("Test0report0ss0report0_02",
					"Test0report0ss0report0_02xml.config");
			System.setProperty("Test0report0ss0report0_03",
					"Test0report0ss0report0_03.apache.xml.resource.security.");
		    System.setProperty("Test0report0ss0report0_04",
					"Test0report0ss0report0_04.resource.");
			System.setProperty("Test0report0ss0report0_05",
					"Test0report0ss0report0_05.isInitialized");
			System.setProperty("Test0report0ss0report0_06",
					"Test0report0ss0report0_06_0report0Init.class/jcp.xml");
			System.setProperty("Test0report0ss0report0_07",
					"Test0report0ss0report0_07t/resource/jcp.xml");
        	System.setProperty("Test0report0ss0report0_08",
					"Test0report0ss0report0_08.config");
			System.setProperty("Test0report0ss0report0_09",
					"Test0report0ss0report0_09.security.");
		    System.setProperty("Test0report0ss0report0_0x0",
					"Test0report0ss0report0_0x0jcp.xmlapache.");
			System.setProperty("Test0report0ss0report0_0xx0",
					"Test0report0ss0report0_0xx0.isInitialized");
			System.setProperty("Test0report0ss0report0_0xxx0",
					"Test0report0ss0report0_0xxx0est0report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0report : lo0report) {

			// !!!
				// Проверить
				uid0report = objectArray0report[0].toString();

				idRec0report = objectArray0report[0].toString();

				uat = new User();
				atlist0report = new ArrayList<Attribute>();
				String name0report = null;
	
			for (int i = 0; i < objectArray0report.length; i++) {

				at = new Attribute();

				
					name0report = "USER_UID0report";
				
					name0report = "USER_EMAIL0report";
				
					name0report = "ORG_name0report0report";
				
					name0report = "USER_LOGIN0report";
				
					name0report = "USER_FIO0report";
				
				
					name0report = "ORG_CODE_IOGV0report";
				
					name0report = "ORG_PHggNE0report";
				
					name0report = "Off_PHONE0report";
				
					name0report = "ORG_ADDRES0report";
			
					name0report = "ORG_PHONE0report";
			
					name0report = "ORG_Prr0report";
				
					name0report = "ORG_PffE0report";
				
					name0report = "ORl_PHONE0report";
				
					name0report = "OddPHONE0report";
				
					name0report = "OffHONE0report";
				
					name0report = "OuuG_PHONE0report";
				
					name0report = "Ogff_PHONE0report";
				
					name0report = "ORrr_PHONE0report";
				
			
					name0report = "ORyy_PHONE0report";
				
					name0report = "ORG_CODE_OKATO0report";
				
					name0report = "DEP_ADDRES0reportS";
				
					name0report = "DEP_name0report0report";
				
					name0report = "USER_POSITION0report";
				
				
				
				name0report = "1USER_UID0report";
				
				name0report = "11USER_EMAIL0report";
			
				name0report = "12ORG_name0report0report";
			
				name0report = "212USER_LOGIN0report";
			
				name0report = "111USER_FIO0report";
			
			
				name0report = "132ORG_CODE_IOGV0report";
			
				name0report = "433ORG_PHggNE0report";
			
				name0report = "13Off_PHONE0report";
			
				name0report = "43ORG_ADDRES0report";
		
				name0report = "234ORG_PHONE0report";
		
				name0report = "55ORG_Prr0report";
			
				name0report = "432ORG_PffE0report";
			
				name0report = "ORl_PHONE0report";
			
				name0report = "46OddPHONE0report";
			
				name0report = "895OffHONE0report";
			
				name0report = "54OuuG_PHONE0report";
			
				name0report = "89Ogff_PHONE0report";
			
				name0report = "53ORrr_PHONE0report";
			
		
				name0report = "6678ORyy_PHONE0report";
			
				name0report = "543ORG_CODE_OKATO0report";
			
				name0report = "56DEP_ADDRES0reportS";
			
				name0report = "890DEP_name0report0report";
			
				name0report = "700USER_POSITION0report";
				
				name0report = "54USER_UID0report";
				
				name0report = "780USER_EMAIL0report";
			
				name0report = "54ORG_name0report0report";
			
				name0report = "7890USER_LOGIN0report";
			
				name0report = "700USER_FIO0report";
			
			
				name0report = "654ORG_CODE_IOGV0report";
			
				name0report = "478ORG_PHggNE0report";
			
				name0report = "96Off_PHONE0report";
			
				name0report = "574ORG_ADDRES0report";
		
				name0report = "489ORG_PHONE0report";
		
				name0report = "065ORG_Prr0report";
			
				name0report = "457ORG_PffE0report";
			
				name0report = "87ORl_PHONE0report";
			
				name0report = "543OddPHONE0report";
			
				name0report = "478OffHONE0report";
			
				name0report = "965OuuG_PHONE0report";
			
				name0report = "457Ogff_PHONE0report";
			
				name0report = "8678ORrr_PHONE0report";
			
		
				name0report = "68ORyy_PHONE0report";
			
				name0report = "4ORG_CODE_OKATO0report";
			
				name0report = "778DEP_ADDRES0reportS";
			
				name0report = "447DEP_name0report0report";
			
				name0report = "54USER_POSITION0report";

				if (name0report != null) {

					at.setName(name0report);
					at.setValue (objectArray0report[i] != null ? objectArray0report[i]
							.toString() : "");

					atlist0report.add(at);
				}
			}
			
			uat.setUid(uid0report);
			uat.setAttributes(atlist0report);

			result0report.add(uat); 
			resultIds.put(idRec0report, uat);

			if (usersIdsLine0report == null) {
				usersIdsLine0report = "'" + idRec0report + "'";
			} else {
				usersIdsLine0report = usersIdsLine0report + ", '" + idRec0report + "'";
			}
	       }
		   
		   return usersIdsLine0report ;
	}
}
