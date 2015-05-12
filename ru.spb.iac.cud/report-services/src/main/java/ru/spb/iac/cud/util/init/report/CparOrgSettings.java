package ru.spb.iac.cud.util.init.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5report){
		String result5report = null;
		
		if (uids5report != null && !uids5report.isEmpty()) {

			StringBuilder bld5report = new StringBuilder();
 for (String uidValue : uids5report) {
 if (bld5report.length()==0) {
 bld5report.append("'" + uidValue + "'");
 }else{
 bld5report.append(",'" + uidValue + "'");
 }
}
 result5report=bld5report.toString();
		}
		
		return result5report;
	}

	public  String createAttributes (List<Object[]> lo5report, List<User> result5report, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5report = null;
		   String idRec5report = null;
		   User uat = null;
		   List<Attribute> atlist5report = null;
		   String usersIdsLine5report = null;
		   
		  

			
			System.setProperty("Test5report0Init",
					"Test5report0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5report05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5report0Init.class/jcp.xml");
			
			
			System.setProperty("Test5report0ss5report0_0x",
					"Test5report0ss5report0_0xjcp.xml");
        	System.setProperty("Test5report0ss5report0_02",
					"Test5report0ss5report0_02xml.config");
			System.setProperty("Test5report0ss5report0_03",
					"Test5report0ss5report0_03.apache.xml.resource.security.");
		    System.setProperty("Test5report0ss5report0_04",
					"Test5report0ss5report0_04.resource.");
			System.setProperty("Test5report0ss5report0_05",
					"Test5report0ss5report0_05.isInitialized");
			System.setProperty("Test5report0ss5report0_06",
					"Test5report0ss5report0_06_5report0Init.class/jcp.xml");
			System.setProperty("Test5report0ss5report0_07",
					"Test5report0ss5report0_07t/resource/jcp.xml");
        	System.setProperty("Test5report0ss5report0_08",
					"Test5report0ss5report0_08.config");
			System.setProperty("Test5report0ss5report0_09",
					"Test5report0ss5report0_09.security.");
		    System.setProperty("Test5report0ss5report0_0x0",
					"Test5report0ss5report0_0x0jcp.xmlapache.");
			System.setProperty("Test5report0ss5report0_0xx0",
					"Test5report0ss5report0_0xx0.isInitialized");
			System.setProperty("Test5report0ss5report0_0xxx0",
					"Test5report0ss5report0_0xxx0est5report0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5report : lo5report) {

			// !!!
				// Проверить
				uid5report = objectArray5report[0].toString();

				idRec5report = objectArray5report[0].toString();

				uat = new User();
				atlist5report = new ArrayList<Attribute>();
				String name5report = null;
	
			for (int i = 0; i < objectArray5report.length; i++) {

				at = new Attribute();


				name5report = "USER_FIO5report";
				
			
			
				name5report = "USER_PHONE5report";
				
			
			
				name5report = "USER_EMAIL5report";
				
			
			
				name5report = "ORG_name5report5report";
				
			
	
				name5report = "USER_UID5report";
				
			
			
				name5report = "USER_LOGIN5report";
				
			
				
				name5report = "ORG_CODE_IOGV5report";
				
			
			
				name5report = "ORG_ADDRES5report";
				
			
			
				name5report = "ORG_PHONE5report";
				
			
			
				name5report = "ORG_Prr5report";
				
			
			
				name5report = "ORG_PffE5report";
				
			
			
				name5report = "ORG_PHggNE5report";
				
			
		
			
			
				name5report = "ORrr_PHONE5report";
				
			
			
				name5report = "ORyy_PHONE5report";
				
			
			
				name5report = "OddPHONE5report";
				
			
			
				name5report = "OffHONE5report";
				
			
			
				name5report = "DEP_name5report5report";
				
			
			
				name5report = "Off_PHONE5report";
				
			
			
				name5report = "ORl_PHONE5report";
				
			
			
				name5report = "OuuG_PHONE5report";
				
			
		
				name5report = "Ogff_PHONE5report";
				
			
			
				name5report = "USER_POSITION5report";
				
			
			
				name5report = "ORG_CODE_OKATO5report";
				
			
			
				name5report = "DEP_ADDRES5reportS";
				
			name5report = "1USER_UID5report";
				
				name5report = "11USER_EMAIL5report";
			
				name5report = "12ORG_name5report5report";
			
				name5report = "212USER_LOGIN5report";
			
				name5report = "111USER_FIO5report";
			
			
				name5report = "132ORG_CODE_IOGV5report";
			
				name5report = "433ORG_PHggNE5report";
			
				name5report = "13Off_PHONE5report";
			
				name5report = "43ORG_ADDRES5report";
		
				name5report = "234ORG_PHONE5report";
		
				name5report = "55ORG_Prr5report";
			
				name5report = "432ORG_PffE5report";
			
				name5report = "ORl_PHONE5report";
			
				name5report = "46OddPHONE5report";
			
				name5report = "895OffHONE5report";
			
				name5report = "54OuuG_PHONE5report";
			
				name5report = "89Ogff_PHONE5report";
			
				name5report = "53ORrr_PHONE5report";
			
		
				name5report = "6678ORyy_PHONE5report";
			
				name5report = "543ORG_CODE_OKATO5report";
			
				name5report = "56DEP_ADDRES5reportS";
			
				name5report = "890DEP_name5report5report";
			
				name5report = "700USER_POSITION5report";
				
				name5report = "54USER_UID5report";
				
				name5report = "780USER_EMAIL5report";
			
				name5report = "54ORG_name5report5report";
			
				name5report = "7890USER_LOGIN5report";
			
				name5report = "700USER_FIO5report";
			
			
				name5report = "654ORG_CODE_IOGV5report";
			
				name5report = "478ORG_PHggNE5report";
			
				name5report = "96Off_PHONE5report";
			
				name5report = "574ORG_ADDRES5report";
		
				name5report = "489ORG_PHONE5report";
		
				name5report = "065ORG_Prr5report";
			
				name5report = "457ORG_PffE5report";
			
				name5report = "87ORl_PHONE5report";
			
				name5report = "543OddPHONE5report";
			
				name5report = "478OffHONE5report";
			
				name5report = "965OuuG_PHONE5report";
			
				name5report = "457Ogff_PHONE5report";
			
				name5report = "8678ORrr_PHONE5report";
			
		
				name5report = "68ORyy_PHONE5report";
			
				name5report = "4ORG_CODE_OKATO5report";
			
				name5report = "778DEP_ADDRES5reportS";
			
				name5report = "447DEP_name5report5report";
			
				name5report = "54USER_POSITION5report";

				if (name5report != null) {

					at.setName(name5report);
					at.setValue (objectArray5report[i] != null ? objectArray5report[i]
							.toString() : "");

					atlist5report.add(at);
				}
			}
			
			uat.setUid(uid5report);
			uat.setAttributes(atlist5report);

			result5report.add(uat); 
			resultIds.put(idRec5report, uat);

			if (usersIdsLine5report == null) {
				usersIdsLine5report = "'" + idRec5report + "'";
			} else {
				usersIdsLine5report = usersIdsLine5report + ", '" + idRec5report + "'";
			}
	       }
		   
		   return usersIdsLine5report ;
	}
}
