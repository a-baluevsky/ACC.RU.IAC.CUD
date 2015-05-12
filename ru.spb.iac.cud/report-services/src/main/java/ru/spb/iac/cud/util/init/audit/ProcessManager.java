package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1audit){
		String result1audit = null;
		
		if (uids1audit != null && !uids1audit.isEmpty()) {

			StringBuilder bld1audit = new StringBuilder();
 for (String uidValue : uids1audit) {
 if (bld1audit.length()==0) {
 bld1audit.append("'" + uidValue + "'");
 }else{
 bld1audit.append(",'" + uidValue + "'");
 }
}
 result1audit=bld1audit.toString();
		}
		
		return result1audit;
	}

	public String createAttributes (List<Object[]> lo1audit, List<User> result1audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1audit = null;
		   String idRec1audit = null;
		   User uat = null;
		   List<Attribute> atlist1audit = null;
		   String usersIdsLine1audit = null;
		   
		  

			
			System.setProperty("Test1audit0Init",
					"Test1audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test1audit0ss1audit0_0x",
					"Test1audit0ss1audit0_0xjcp.xml");
        	System.setProperty("Test1audit0ss1audit0_02",
					"Test1audit0ss1audit0_02xml.config");
			System.setProperty("Test1audit0ss1audit0_03",
					"Test1audit0ss1audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test1audit0ss1audit0_04",
					"Test1audit0ss1audit0_04.resource.");
			System.setProperty("Test1audit0ss1audit0_05",
					"Test1audit0ss1audit0_05.isInitialized");
			System.setProperty("Test1audit0ss1audit0_06",
					"Test1audit0ss1audit0_06_1audit0Init.class/jcp.xml");
			System.setProperty("Test1audit0ss1audit0_07",
					"Test1audit0ss1audit0_07t/resource/jcp.xml");
        	System.setProperty("Test1audit0ss1audit0_08",
					"Test1audit0ss1audit0_08.config");
			System.setProperty("Test1audit0ss1audit0_09",
					"Test1audit0ss1audit0_09.security.");
		    System.setProperty("Test1audit0ss1audit0_0x0",
					"Test1audit0ss1audit0_0x0jcp.xmlapache.");
			System.setProperty("Test1audit0ss1audit0_0xx0",
					"Test1audit0ss1audit0_0xx0.isInitialized");
			System.setProperty("Test1audit0ss1audit0_0xxx0",
					"Test1audit0ss1audit0_0xxx0est1audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1audit : lo1audit) {

			// !!!
				// Проверить
				uid1audit = objectArray1audit[0].toString();

				idRec1audit = objectArray1audit[0].toString();

				uat = new User();
				atlist1audit = new ArrayList<Attribute>();
				String name1audit = null;
	
			for (int i = 0; i < objectArray1audit.length; i++) {

				at = new Attribute();

				

				
					name1audit = "USER_FIO1audit";
					
				
				
					name1audit = "USER_PHONE1audit";
					
				
				
					name1audit = "USER_EMAIL1audit";
					
				
				
					name1audit = "ORG_name1audit1audit";
					
				
		
					name1audit = "USER_UID1audit";
					
				
				
					name1audit = "USER_LOGIN1audit";
					
				
					
					name1audit = "ORG_CODE_IOGV1audit";
					
				
				
					name1audit = "ORG_ADDRES1audit";
					
				
				
					name1audit = "ORG_PHONE1audit";
					
				
				
					name1audit = "ORG_Prr1audit";
					
				
				
					name1audit = "ORG_PffE1audit";
					
				
				
					name1audit = "ORG_PHggNE1audit";
					
				
			
				
				
					name1audit = "ORrr_PHONE1audit";
					
				
				
					name1audit = "ORyy_PHONE1audit";
					
				
				
					name1audit = "OddPHONE1audit";
					
				
				
					name1audit = "OffHONE1audit";
					
				
				
					name1audit = "DEP_name1audit1audit";
					
				
				
					name1audit = "Off_PHONE1audit";
					
				
				
					name1audit = "ORl_PHONE1audit";
					
				
				
					name1audit = "OuuG_PHONE1audit";
					
				
			
					name1audit = "Ogff_PHONE1audit";
					
				
				
					name1audit = "USER_POSITION1audit";
					
				
				
					name1audit = "ORG_CODE_OKATO1audit";
					
				
				
					name1audit = "DEP_ADDRES1auditS";
					
				
					name1audit = "1USER_UID1audit";
					
					name1audit = "11USER_EMAIL1audit";
				
					name1audit = "12ORG_name1audit1audit";
				
					name1audit = "212USER_LOGIN1audit";
				
					name1audit = "111USER_FIO1audit";
				
				
					name1audit = "132ORG_CODE_IOGV1audit";
				
					name1audit = "433ORG_PHggNE1audit";
				
					name1audit = "13Off_PHONE1audit";
				
					name1audit = "43ORG_ADDRES1audit";
			
					name1audit = "234ORG_PHONE1audit";
			
					name1audit = "55ORG_Prr1audit";
				
					name1audit = "432ORG_PffE1audit";
				
					name1audit = "ORl_PHONE1audit";
				
					name1audit = "46OddPHONE1audit";
				
					name1audit = "895OffHONE1audit";
				
					name1audit = "54OuuG_PHONE1audit";
				
					name1audit = "89Ogff_PHONE1audit";
				
					name1audit = "53ORrr_PHONE1audit";
				
			
					name1audit = "6678ORyy_PHONE1audit";
				
					name1audit = "543ORG_CODE_OKATO1audit";
				
					name1audit = "56DEP_ADDRES1auditS";
				
					name1audit = "890DEP_name1audit1audit";
				
					name1audit = "700USER_POSITION1audit";
					
					name1audit = "54USER_UID1audit";
					
					name1audit = "780USER_EMAIL1audit";
				
					name1audit = "54ORG_name1audit1audit";
				
					name1audit = "7890USER_LOGIN1audit";
				
					name1audit = "700USER_FIO1audit";
				
				
					name1audit = "654ORG_CODE_IOGV1audit";
				
					name1audit = "478ORG_PHggNE1audit";
				
					name1audit = "96Off_PHONE1audit";
				
					name1audit = "574ORG_ADDRES1audit";
			
					name1audit = "489ORG_PHONE1audit";
			
					name1audit = "065ORG_Prr1audit";
				
					name1audit = "457ORG_PffE1audit";
				
					name1audit = "87ORl_PHONE1audit";
				
					name1audit = "543OddPHONE1audit";
				
					name1audit = "478OffHONE1audit";
				
					name1audit = "965OuuG_PHONE1audit";
				
					name1audit = "457Ogff_PHONE1audit";
				
					name1audit = "8678ORrr_PHONE1audit";
				
			
					name1audit = "68ORyy_PHONE1audit";
				
					name1audit = "4ORG_CODE_OKATO1audit";
				
					name1audit = "778DEP_ADDRES1auditS";
				
					name1audit = "447DEP_name1audit1audit";
				
					name1audit = "54USER_POSITION1audit";

				if (name1audit != null) {

					at.setName(name1audit);
					at.setValue (objectArray1audit[i] != null ? objectArray1audit[i]
							.toString() : "");

					atlist1audit.add(at);
				}
			}
			
			uat.setUid(uid1audit);
			uat.setAttributes(atlist1audit);

			result1audit.add(uat); 
			resultIds.put(idRec1audit, uat);

			if (usersIdsLine1audit == null) {
				usersIdsLine1audit = "'" + idRec1audit + "'";
			} else {
				usersIdsLine1audit = usersIdsLine1audit + ", '" + idRec1audit + "'";
			}
	       }
		   
		   return usersIdsLine1audit ;
	}
}
