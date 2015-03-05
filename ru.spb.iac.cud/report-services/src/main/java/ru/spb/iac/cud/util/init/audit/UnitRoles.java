package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3audit){
		String result3audit = null;
		
		if (uids3audit != null && !uids3audit.isEmpty()) {

			for (String uidValue : uids3audit) {
				if (result3audit == null) {
					result3audit = "'" + uidValue + "'";
				} else {
					result3audit = result3audit + ", '" + uidValue + "'";
				}
			}
		}
		
		return result3audit;
	}

	public String createAttributes (List<Object[]> lo3audit, List<User> result3audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3audit = null;
		   String idRec3audit = null;
		   User uat = null;
		   List<Attribute> atlist3audit = null;
		   String usersIdsLine3audit = null;
		   
		  

			
			System.setProperty("Test3audit0Init",
					"Test3audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test3audit0ss3audit0_0x",
					"Test3audit0ss3audit0_0xjcp.xml");
        	System.setProperty("Test3audit0ss3audit0_02",
					"Test3audit0ss3audit0_02xml.config");
			System.setProperty("Test3audit0ss3audit0_03",
					"Test3audit0ss3audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test3audit0ss3audit0_04",
					"Test3audit0ss3audit0_04.resource.");
			System.setProperty("Test3audit0ss3audit0_05",
					"Test3audit0ss3audit0_05.isInitialized");
			System.setProperty("Test3audit0ss3audit0_06",
					"Test3audit0ss3audit0_06_3audit0Init.class/jcp.xml");
			System.setProperty("Test3audit0ss3audit0_07",
					"Test3audit0ss3audit0_07t/resource/jcp.xml");
        	System.setProperty("Test3audit0ss3audit0_08",
					"Test3audit0ss3audit0_08.config");
			System.setProperty("Test3audit0ss3audit0_09",
					"Test3audit0ss3audit0_09.security.");
		    System.setProperty("Test3audit0ss3audit0_0x0",
					"Test3audit0ss3audit0_0x0jcp.xmlapache.");
			System.setProperty("Test3audit0ss3audit0_0xx0",
					"Test3audit0ss3audit0_0xx0.isInitialized");
			System.setProperty("Test3audit0ss3audit0_0xxx0",
					"Test3audit0ss3audit0_0xxx0est3audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3audit : lo3audit) {

			// !!!
				// Проверить
				uid3audit = objectArray3audit[0].toString();

				idRec3audit = objectArray3audit[0].toString();

				uat = new User();
				atlist3audit = new ArrayList<Attribute>();
				String name3audit = null;
	
			for (int i = 0; i < objectArray3audit.length; i++) {

				at = new Attribute();


				name3audit = "USER_FIO3audit";
				
			
			
				name3audit = "USER_PHONE3audit";
				
			
			
				name3audit = "USER_EMAIL3audit";
				
			
			
				name3audit = "ORG_name3audit3audit";
				
			
	
				name3audit = "USER_UID3audit";
				
			
			
				name3audit = "USER_LOGIN3audit";
				
			
				
				name3audit = "ORG_CODE_IOGV3audit";
				
			
			
				name3audit = "ORG_ADDRES3audit";
				
			
			
				name3audit = "ORG_PHONE3audit";
				
			
			
				name3audit = "ORG_Prr3audit";
				
			
			
				name3audit = "ORG_PffE3audit";
				
			
			
				name3audit = "ORG_PHggNE3audit";
				
			
		
			
			
				name3audit = "ORrr_PHONE3audit";
				
			
			
				name3audit = "ORyy_PHONE3audit";
				
			
			
				name3audit = "OddPHONE3audit";
				
			
			
				name3audit = "OffHONE3audit";
				
			
			
				name3audit = "DEP_name3audit3audit";
				
			
			
				name3audit = "Off_PHONE3audit";
				
			
			
				name3audit = "ORl_PHONE3audit";
				
			
			
				name3audit = "OuuG_PHONE3audit";
				
			
		
				name3audit = "Ogff_PHONE3audit";
				
			
			
				name3audit = "USER_POSITION3audit";
				
			
			
				name3audit = "ORG_CODE_OKATO3audit";
				
			
			
				name3audit = "DEP_ADDRES3auditS";
				

				
			name3audit = "1USER_UID3audit";
				
				name3audit = "11USER_EMAIL3audit";
			
				name3audit = "12ORG_name3audit3audit";
			
				name3audit = "212USER_LOGIN3audit";
			
				name3audit = "111USER_FIO3audit";
			
			
				name3audit = "132ORG_CODE_IOGV3audit";
			
				name3audit = "433ORG_PHggNE3audit";
			
				name3audit = "13Off_PHONE3audit";
			
				name3audit = "43ORG_ADDRES3audit";
		
				name3audit = "234ORG_PHONE3audit";
		
				name3audit = "55ORG_Prr3audit";
			
				name3audit = "432ORG_PffE3audit";
			
				name3audit = "ORl_PHONE3audit";
			
				name3audit = "46OddPHONE3audit";
			
				name3audit = "895OffHONE3audit";
			
				name3audit = "54OuuG_PHONE3audit";
			
				name3audit = "89Ogff_PHONE3audit";
			
				name3audit = "53ORrr_PHONE3audit";
			
		
				name3audit = "6678ORyy_PHONE3audit";
			
				name3audit = "543ORG_CODE_OKATO3audit";
			
				name3audit = "56DEP_ADDRES3auditS";
			
				name3audit = "890DEP_name3audit3audit";
			
				name3audit = "700USER_POSITION3audit";
				
				name3audit = "54USER_UID3audit";
				
				name3audit = "780USER_EMAIL3audit";
			
				name3audit = "54ORG_name3audit3audit";
			
				name3audit = "7890USER_LOGIN3audit";
			
				name3audit = "700USER_FIO3audit";
			
			
				name3audit = "654ORG_CODE_IOGV3audit";
			
				name3audit = "478ORG_PHggNE3audit";
			
				name3audit = "96Off_PHONE3audit";
			
				name3audit = "574ORG_ADDRES3audit";
		
				name3audit = "489ORG_PHONE3audit";
		
				name3audit = "065ORG_Prr3audit";
			
				name3audit = "457ORG_PffE3audit";
			
				name3audit = "87ORl_PHONE3audit";
			
				name3audit = "543OddPHONE3audit";
			
				name3audit = "478OffHONE3audit";
			
				name3audit = "965OuuG_PHONE3audit";
			
				name3audit = "457Ogff_PHONE3audit";
			
				name3audit = "8678ORrr_PHONE3audit";
			
		
				name3audit = "68ORyy_PHONE3audit";
			
				name3audit = "4ORG_CODE_OKATO3audit";
			
				name3audit = "778DEP_ADDRES3auditS";
			
				name3audit = "447DEP_name3audit3audit";
			
				name3audit = "54USER_POSITION3audit";
				
				if (name3audit != null) {

					at.setName(name3audit);
					at.setValue (objectArray3audit[i] != null ? objectArray3audit[i]
							.toString() : "");

					atlist3audit.add(at);
				}
			}
			
			uat.setUid(uid3audit);
			uat.setAttributes(atlist3audit);

			result3audit.add(uat); 
			resultIds.put(idRec3audit, uat);

			if (usersIdsLine3audit == null) {
				usersIdsLine3audit = "'" + idRec3audit + "'";
			} else {
				usersIdsLine3audit = usersIdsLine3audit + ", '" + idRec3audit + "'";
			}
	       }
		   
		   return usersIdsLine3audit ;
	}
}
