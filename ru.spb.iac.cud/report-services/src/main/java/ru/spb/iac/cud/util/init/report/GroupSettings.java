package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4report){
		String result4report = null;
		
		if (uids4report != null && !uids4report.isEmpty()) {

			for (String uidValue : uids4report) {
				if (result4report == null) {
					result4report = "'" + uidValue + "'";
				} else {
					result4report = result4report + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4report;
	}

	public  String createAttributes (List<Object[]> lo4report, List<User> result4report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4report = null;
		   String idRec4report = null;
		   User uat = null;
		   List<Attribute> atlist4report = null;
		   String usersIdsLine4report = null;
		   
		  

			
			System.setProperty("Test4report0Init",
					"Test4report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4report0Init.class/jcp.xml");
			
			
			System.setProperty("Test4report0ss4report0_0x",
					"Test4report0ss4report0_0xjcp.xml");
        	System.setProperty("Test4report0ss4report0_02",
					"Test4report0ss4report0_02xml.config");
			System.setProperty("Test4report0ss4report0_03",
					"Test4report0ss4report0_03.apache.xml.resource.security.");
		    System.setProperty("Test4report0ss4report0_04",
					"Test4report0ss4report0_04.resource.");
			System.setProperty("Test4report0ss4report0_05",
					"Test4report0ss4report0_05.isInitialized");
			System.setProperty("Test4report0ss4report0_06",
					"Test4report0ss4report0_06_4report0Init.class/jcp.xml");
			System.setProperty("Test4report0ss4report0_07",
					"Test4report0ss4report0_07t/resource/jcp.xml");
        	System.setProperty("Test4report0ss4report0_08",
					"Test4report0ss4report0_08.config");
			System.setProperty("Test4report0ss4report0_09",
					"Test4report0ss4report0_09.security.");
		    System.setProperty("Test4report0ss4report0_0x0",
					"Test4report0ss4report0_0x0jcp.xmlapache.");
			System.setProperty("Test4report0ss4report0_0xx0",
					"Test4report0ss4report0_0xx0.isInitialized");
			System.setProperty("Test4report0ss4report0_0xxx0",
					"Test4report0ss4report0_0xxx0est4report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4report : lo4report) {

			// !!!
				// Проверить
				uid4report = objectArray4report[0].toString();

				idRec4report = objectArray4report[0].toString();

				uat = new User();
				atlist4report = new ArrayList<Attribute>();
				String name4report = null;
	
			for (int i = 0; i < objectArray4report.length; i++) {

				at = new Attribute();


				name4report = "USER_FIO4report";
				
			
			
				name4report = "USER_PHONE4report";
				
			
			
				name4report = "USER_EMAIL4report";
				
			
			
				name4report = "ORG_name4report4report";
				
			
	
				name4report = "USER_UID4report";
				
			
			
				name4report = "USER_LOGIN4report";
				
			
				
				name4report = "ORG_CODE_IOGV4report";
				
			
			
				name4report = "ORG_ADDRES4report";
				
			
			
				name4report = "ORG_PHONE4report";
				
			
			
				name4report = "ORG_Prr4report";
				
			
			
				name4report = "ORG_PffE4report";
				
			
			
				name4report = "ORG_PHggNE4report";
				
			
		
			
			
				name4report = "ORrr_PHONE4report";
				
			
			
				name4report = "ORyy_PHONE4report";
				
			
			
				name4report = "OddPHONE4report";
				
			
			
				name4report = "OffHONE4report";
				
			
			
				name4report = "DEP_name4report4report";
				
			
			
				name4report = "Off_PHONE4report";
				
			
			
				name4report = "ORl_PHONE4report";
				
			
			
				name4report = "OuuG_PHONE4report";
				
			
		
				name4report = "Ogff_PHONE4report";
				
			
			
				name4report = "USER_POSITION4report";
				
			
			
				name4report = "ORG_CODE_OKATO4report";
				
			
			
				name4report = "DEP_ADDRES4reportS";
				

			name4report = "1USER_UID4report";
				
				name4report = "11USER_EMAIL4report";
			
				name4report = "12ORG_name4report4report";
			
				name4report = "212USER_LOGIN4report";
			
				name4report = "111USER_FIO4report";
			
			
				name4report = "132ORG_CODE_IOGV4report";
			
				name4report = "433ORG_PHggNE4report";
			
				name4report = "13Off_PHONE4report";
			
				name4report = "43ORG_ADDRES4report";
		
				name4report = "234ORG_PHONE4report";
		
				name4report = "55ORG_Prr4report";
			
				name4report = "432ORG_PffE4report";
			
				name4report = "ORl_PHONE4report";
			
				name4report = "46OddPHONE4report";
			
				name4report = "895OffHONE4report";
			
				name4report = "54OuuG_PHONE4report";
			
				name4report = "89Ogff_PHONE4report";
			
				name4report = "53ORrr_PHONE4report";
			
		
				name4report = "6678ORyy_PHONE4report";
			
				name4report = "543ORG_CODE_OKATO4report";
			
				name4report = "56DEP_ADDRES4reportS";
			
				name4report = "890DEP_name4report4report";
			
				name4report = "700USER_POSITION4report";
				
				name4report = "54USER_UID4report";
				
				name4report = "780USER_EMAIL4report";
			
				name4report = "54ORG_name4report4report";
			
				name4report = "7890USER_LOGIN4report";
			
				name4report = "700USER_FIO4report";
			
			
				name4report = "654ORG_CODE_IOGV4report";
			
				name4report = "478ORG_PHggNE4report";
			
				name4report = "96Off_PHONE4report";
			
				name4report = "574ORG_ADDRES4report";
		
				name4report = "489ORG_PHONE4report";
		
				name4report = "065ORG_Prr4report";
			
				name4report = "457ORG_PffE4report";
			
				name4report = "87ORl_PHONE4report";
			
				name4report = "543OddPHONE4report";
			
				name4report = "478OffHONE4report";
			
				name4report = "965OuuG_PHONE4report";
			
				name4report = "457Ogff_PHONE4report";
			
				name4report = "8678ORrr_PHONE4report";
			
		
				name4report = "68ORyy_PHONE4report";
			
				name4report = "4ORG_CODE_OKATO4report";
			
				name4report = "778DEP_ADDRES4reportS";
			
				name4report = "447DEP_name4report4report";
			
				name4report = "54USER_POSITION4report";
				
				if (name4report != null) {

					at.setName(name4report);
					at.setValue (objectArray4report[i] != null ? objectArray4report[i]
							.toString() : "");

					atlist4report.add(at);
				}
			}
			
			uat.setUid(uid4report);
			uat.setAttributes(atlist4report);

			result4report.add(uat); 
			resultIds.put(idRec4report, uat);

			if (usersIdsLine4report == null) {
				usersIdsLine4report = "'" + idRec4report + "'";
			} else {
				usersIdsLine4report = usersIdsLine4report + ", '" + idRec4report + "'";
			}
	       }
		   
		   return usersIdsLine4report ;
	}
}
