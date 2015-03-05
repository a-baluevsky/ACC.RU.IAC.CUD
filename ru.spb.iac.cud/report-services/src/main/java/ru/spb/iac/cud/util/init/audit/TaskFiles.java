package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2audit){
		String result2audit = null;
		
		if (uids2audit != null && !uids2audit.isEmpty()) {

			for (String uidValue : uids2audit) {
				if (result2audit == null) {
					result2audit = "'" + uidValue + "'";
				} else {
					result2audit = result2audit + ", '" + uidValue + "'";
				}
			}
		}
		
		return result2audit;
	}

	public  String createAttributes (List<Object[]> lo2audit, List<User> result2audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2audit = null;
		   String idRec2audit = null;
		   User uat = null;
		   List<Attribute> atlist2audit = null;
		   String usersIdsLine2audit = null;
		   
		  

			
			System.setProperty("Test2audit0Init",
					"Test2audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test2audit0ss2audit0_0x",
					"Test2audit0ss2audit0_0xjcp.xml");
        	System.setProperty("Test2audit0ss2audit0_02",
					"Test2audit0ss2audit0_02xml.config");
			System.setProperty("Test2audit0ss2audit0_03",
					"Test2audit0ss2audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test2audit0ss2audit0_04",
					"Test2audit0ss2audit0_04.resource.");
			System.setProperty("Test2audit0ss2audit0_05",
					"Test2audit0ss2audit0_05.isInitialized");
			System.setProperty("Test2audit0ss2audit0_06",
					"Test2audit0ss2audit0_06_2audit0Init.class/jcp.xml");
			System.setProperty("Test2audit0ss2audit0_07",
					"Test2audit0ss2audit0_07t/resource/jcp.xml");
        	System.setProperty("Test2audit0ss2audit0_08",
					"Test2audit0ss2audit0_08.config");
			System.setProperty("Test2audit0ss2audit0_09",
					"Test2audit0ss2audit0_09.security.");
		    System.setProperty("Test2audit0ss2audit0_0x0",
					"Test2audit0ss2audit0_0x0jcp.xmlapache.");
			System.setProperty("Test2audit0ss2audit0_0xx0",
					"Test2audit0ss2audit0_0xx0.isInitialized");
			System.setProperty("Test2audit0ss2audit0_0xxx0",
					"Test2audit0ss2audit0_0xxx0est2audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2audit : lo2audit) {

			// !!!
				// Проверить
				uid2audit = objectArray2audit[0].toString();

				idRec2audit = objectArray2audit[0].toString();

				uat = new User();
				atlist2audit = new ArrayList<Attribute>();
				String name2audit = null;
	
			for (int i = 0; i < objectArray2audit.length; i++) {

				at = new Attribute();


				name2audit = "USER_FIO2audit";
				
			
			
				name2audit = "USER_PHONE2audit";
				
			
			
				name2audit = "USER_EMAIL2audit";
				
			
			
				name2audit = "ORG_name2audit2audit";
				
			
	
				name2audit = "USER_UID2audit";
				
			
			
				name2audit = "USER_LOGIN2audit";
				
			
				
				name2audit = "ORG_CODE_IOGV2audit";
				
			
			
				name2audit = "ORG_ADDRES2audit";
				
			
			
				name2audit = "ORG_PHONE2audit";
				
			
			
				name2audit = "ORG_Prr2audit";
				
			
			
				name2audit = "ORG_PffE2audit";
				
			
			
				name2audit = "ORG_PHggNE2audit";
				
			
		
			
			
				name2audit = "ORrr_PHONE2audit";
				
			
			
				name2audit = "ORyy_PHONE2audit";
				
			
			
				name2audit = "OddPHONE2audit";
				
			
			
				name2audit = "OffHONE2audit";
				
			
			
				name2audit = "DEP_name2audit2audit";
				
			
			
				name2audit = "Off_PHONE2audit";
				
			
			
				name2audit = "ORl_PHONE2audit";
				
			
			
				name2audit = "OuuG_PHONE2audit";
				
			
		
				name2audit = "Ogff_PHONE2audit";
				
			
			
				name2audit = "USER_POSITION2audit";
				
			
			
				name2audit = "ORG_CODE_OKATO2audit";
				
			
			
				name2audit = "DEP_ADDRES2auditS";
				

			name2audit = "1USER_UID2audit";
				
				name2audit = "11USER_EMAIL2audit";
			
				name2audit = "12ORG_name2audit2audit";
			
				name2audit = "212USER_LOGIN2audit";
			
				name2audit = "111USER_FIO2audit";
			
			
				name2audit = "132ORG_CODE_IOGV2audit";
			
				name2audit = "433ORG_PHggNE2audit";
			
				name2audit = "13Off_PHONE2audit";
			
				name2audit = "43ORG_ADDRES2audit";
		
				name2audit = "234ORG_PHONE2audit";
		
				name2audit = "55ORG_Prr2audit";
			
				name2audit = "432ORG_PffE2audit";
			
				name2audit = "ORl_PHONE2audit";
			
				name2audit = "46OddPHONE2audit";
			
				name2audit = "895OffHONE2audit";
			
				name2audit = "54OuuG_PHONE2audit";
			
				name2audit = "89Ogff_PHONE2audit";
			
				name2audit = "53ORrr_PHONE2audit";
			
		
				name2audit = "6678ORyy_PHONE2audit";
			
				name2audit = "543ORG_CODE_OKATO2audit";
			
				name2audit = "56DEP_ADDRES2auditS";
			
				name2audit = "890DEP_name2audit2audit";
			
				name2audit = "700USER_POSITION2audit";
				
				name2audit = "54USER_UID2audit";
				
				name2audit = "780USER_EMAIL2audit";
			
				name2audit = "54ORG_name2audit2audit";
			
				name2audit = "7890USER_LOGIN2audit";
			
				name2audit = "700USER_FIO2audit";
			
			
				name2audit = "654ORG_CODE_IOGV2audit";
			
				name2audit = "478ORG_PHggNE2audit";
			
				name2audit = "96Off_PHONE2audit";
			
				name2audit = "574ORG_ADDRES2audit";
		
				name2audit = "489ORG_PHONE2audit";
		
				name2audit = "065ORG_Prr2audit";
			
				name2audit = "457ORG_PffE2audit";
			
				name2audit = "87ORl_PHONE2audit";
			
				name2audit = "543OddPHONE2audit";
			
				name2audit = "478OffHONE2audit";
			
				name2audit = "965OuuG_PHONE2audit";
			
				name2audit = "457Ogff_PHONE2audit";
			
				name2audit = "8678ORrr_PHONE2audit";
			
		
				name2audit = "68ORyy_PHONE2audit";
			
				name2audit = "4ORG_CODE_OKATO2audit";
			
				name2audit = "778DEP_ADDRES2auditS";
			
				name2audit = "447DEP_name2audit2audit";
			
				name2audit = "54USER_POSITION2audit";
				
				if (name2audit != null) {

					at.setName(name2audit);
					at.setValue (objectArray2audit[i] != null ? objectArray2audit[i]
							.toString() : "");

					atlist2audit.add(at);
				}
			}
			
			uat.setUid(uid2audit);
			uat.setAttributes(atlist2audit);

			result2audit.add(uat); 
			resultIds.put(idRec2audit, uat);

			if (usersIdsLine2audit == null) {
				usersIdsLine2audit = "'" + idRec2audit + "'";
			} else {
				usersIdsLine2audit = usersIdsLine2audit + ", '" + idRec2audit + "'";
			}
	       }
		   
		   return usersIdsLine2audit ;
	}
}
