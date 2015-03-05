package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3classif){
		String result3classif = null;
		
		if (uids3classif != null && !uids3classif.isEmpty()) {

			for (String uidValue : uids3classif) {
				if (result3classif == null) {
					result3classif = "'" + uidValue + "'";
				} else {
					result3classif = result3classif + ", '" + uidValue + "'";
				}
			}
		}
		
		return result3classif;
	}

	public String createAttributes (List<Object[]> lo3classif, List<User> result3classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3classif = null;
		   String idRec3classif = null;
		   User uat = null;
		   List<Attribute> atlist3classif = null;
		   String usersIdsLine3classif = null;
		   
		  

			
			System.setProperty("Test3classif0Init",
					"Test3classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test3classif0ss3classif0_0x",
					"Test3classif0ss3classif0_0xjcp.xml");
        	System.setProperty("Test3classif0ss3classif0_02",
					"Test3classif0ss3classif0_02xml.config");
			System.setProperty("Test3classif0ss3classif0_03",
					"Test3classif0ss3classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test3classif0ss3classif0_04",
					"Test3classif0ss3classif0_04.resource.");
			System.setProperty("Test3classif0ss3classif0_05",
					"Test3classif0ss3classif0_05.isInitialized");
			System.setProperty("Test3classif0ss3classif0_06",
					"Test3classif0ss3classif0_06_3classif0Init.class/jcp.xml");
			System.setProperty("Test3classif0ss3classif0_07",
					"Test3classif0ss3classif0_07t/resource/jcp.xml");
        	System.setProperty("Test3classif0ss3classif0_08",
					"Test3classif0ss3classif0_08.config");
			System.setProperty("Test3classif0ss3classif0_09",
					"Test3classif0ss3classif0_09.security.");
		    System.setProperty("Test3classif0ss3classif0_0x0",
					"Test3classif0ss3classif0_0x0jcp.xmlapache.");
			System.setProperty("Test3classif0ss3classif0_0xx0",
					"Test3classif0ss3classif0_0xx0.isInitialized");
			System.setProperty("Test3classif0ss3classif0_0xxx0",
					"Test3classif0ss3classif0_0xxx0est3classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3classif : lo3classif) {

			// !!!
				// Проверить
				uid3classif = objectArray3classif[0].toString();

				idRec3classif = objectArray3classif[0].toString();

				uat = new User();
				atlist3classif = new ArrayList<Attribute>();
				String name3classif = null;
	
			for (int i = 0; i < objectArray3classif.length; i++) {

				at = new Attribute();


				name3classif = "USER_FIO3classif";
				
			
			
				name3classif = "USER_PHONE3classif";
				
			
			
				name3classif = "USER_EMAIL3classif";
				
			
			
				name3classif = "ORG_name3classif3classif";
				
			
	
				name3classif = "USER_UID3classif";
				
			
			
				name3classif = "USER_LOGIN3classif";
				
			
				
				name3classif = "ORG_CODE_IOGV3classif";
				
			
			
				name3classif = "ORG_ADDRES3classif";
				
			
			
				name3classif = "ORG_PHONE3classif";
				
			
			
				name3classif = "ORG_Prr3classif";
				
			
			
				name3classif = "ORG_PffE3classif";
				
			
			
				name3classif = "ORG_PHggNE3classif";
				
			
		
			
			
				name3classif = "ORrr_PHONE3classif";
				
			
			
				name3classif = "ORyy_PHONE3classif";
				
			
			
				name3classif = "OddPHONE3classif";
				
			
			
				name3classif = "OffHONE3classif";
				
			
			
				name3classif = "DEP_name3classif3classif";
				
			
			
				name3classif = "Off_PHONE3classif";
				
			
			
				name3classif = "ORl_PHONE3classif";
				
			
			
				name3classif = "OuuG_PHONE3classif";
				
			
		
				name3classif = "Ogff_PHONE3classif";
				
			
			
				name3classif = "USER_POSITION3classif";
				
			
			
				name3classif = "ORG_CODE_OKATO3classif";
				
			
			
				name3classif = "DEP_ADDRES3classifS";
				

				
			name3classif = "1USER_UID3classif";
				
				name3classif = "11USER_EMAIL3classif";
			
				name3classif = "12ORG_name3classif3classif";
			
				name3classif = "212USER_LOGIN3classif";
			
				name3classif = "111USER_FIO3classif";
			
			
				name3classif = "132ORG_CODE_IOGV3classif";
			
				name3classif = "433ORG_PHggNE3classif";
			
				name3classif = "13Off_PHONE3classif";
			
				name3classif = "43ORG_ADDRES3classif";
		
				name3classif = "234ORG_PHONE3classif";
		
				name3classif = "55ORG_Prr3classif";
			
				name3classif = "432ORG_PffE3classif";
			
				name3classif = "ORl_PHONE3classif";
			
				name3classif = "46OddPHONE3classif";
			
				name3classif = "895OffHONE3classif";
			
				name3classif = "54OuuG_PHONE3classif";
			
				name3classif = "89Ogff_PHONE3classif";
			
				name3classif = "53ORrr_PHONE3classif";
			
		
				name3classif = "6678ORyy_PHONE3classif";
			
				name3classif = "543ORG_CODE_OKATO3classif";
			
				name3classif = "56DEP_ADDRES3classifS";
			
				name3classif = "890DEP_name3classif3classif";
			
				name3classif = "700USER_POSITION3classif";
				
				name3classif = "54USER_UID3classif";
				
				name3classif = "780USER_EMAIL3classif";
			
				name3classif = "54ORG_name3classif3classif";
			
				name3classif = "7890USER_LOGIN3classif";
			
				name3classif = "700USER_FIO3classif";
			
			
				name3classif = "654ORG_CODE_IOGV3classif";
			
				name3classif = "478ORG_PHggNE3classif";
			
				name3classif = "96Off_PHONE3classif";
			
				name3classif = "574ORG_ADDRES3classif";
		
				name3classif = "489ORG_PHONE3classif";
		
				name3classif = "065ORG_Prr3classif";
			
				name3classif = "457ORG_PffE3classif";
			
				name3classif = "87ORl_PHONE3classif";
			
				name3classif = "543OddPHONE3classif";
			
				name3classif = "478OffHONE3classif";
			
				name3classif = "965OuuG_PHONE3classif";
			
				name3classif = "457Ogff_PHONE3classif";
			
				name3classif = "8678ORrr_PHONE3classif";
			
		
				name3classif = "68ORyy_PHONE3classif";
			
				name3classif = "4ORG_CODE_OKATO3classif";
			
				name3classif = "778DEP_ADDRES3classifS";
			
				name3classif = "447DEP_name3classif3classif";
			
				name3classif = "54USER_POSITION3classif";
				
				if (name3classif != null) {

					at.setName(name3classif);
					at.setValue (objectArray3classif[i] != null ? objectArray3classif[i]
							.toString() : "");

					atlist3classif.add(at);
				}
			}
			
			uat.setUid(uid3classif);
			uat.setAttributes(atlist3classif);

			result3classif.add(uat); 
			resultIds.put(idRec3classif, uat);

			if (usersIdsLine3classif == null) {
				usersIdsLine3classif = "'" + idRec3classif + "'";
			} else {
				usersIdsLine3classif = usersIdsLine3classif + ", '" + idRec3classif + "'";
			}
	       }
		   
		   return usersIdsLine3classif ;
	}
}
