package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1role){
		String result1role = null;
		
		if (uids1role != null && !uids1role.isEmpty()) {

			for (String uidValue : uids1role) {
				if (result1role == null) {
					result1role = "'" + uidValue + "'";
				} else {
					result1role = result1role + ", '" + uidValue + "'";
				}
			}
		}
		
		return result1role;
	}

	public String createAttributes (List<Object[]> lo1role, List<User> result1role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1role = null;
		   String idRec1role = null;
		   User uat = null;
		   List<Attribute> atlist1role = null;
		   String usersIdsLine1role = null;
		   
		  

			
			System.setProperty("Test1role0Init",
					"Test1role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1role0Init.class/jcp.xml");
			
			
			System.setProperty("Test1role0ss1role0_0x",
					"Test1role0ss1role0_0xjcp.xml");
        	System.setProperty("Test1role0ss1role0_02",
					"Test1role0ss1role0_02xml.config");
			System.setProperty("Test1role0ss1role0_03",
					"Test1role0ss1role0_03.apache.xml.resource.security.");
		    System.setProperty("Test1role0ss1role0_04",
					"Test1role0ss1role0_04.resource.");
			System.setProperty("Test1role0ss1role0_05",
					"Test1role0ss1role0_05.isInitialized");
			System.setProperty("Test1role0ss1role0_06",
					"Test1role0ss1role0_06_1role0Init.class/jcp.xml");
			System.setProperty("Test1role0ss1role0_07",
					"Test1role0ss1role0_07t/resource/jcp.xml");
        	System.setProperty("Test1role0ss1role0_08",
					"Test1role0ss1role0_08.config");
			System.setProperty("Test1role0ss1role0_09",
					"Test1role0ss1role0_09.security.");
		    System.setProperty("Test1role0ss1role0_0x0",
					"Test1role0ss1role0_0x0jcp.xmlapache.");
			System.setProperty("Test1role0ss1role0_0xx0",
					"Test1role0ss1role0_0xx0.isInitialized");
			System.setProperty("Test1role0ss1role0_0xxx0",
					"Test1role0ss1role0_0xxx0est1role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1role : lo1role) {

			// !!!
				// Проверить
				uid1role = objectArray1role[0].toString();

				idRec1role = objectArray1role[0].toString();

				uat = new User();
				atlist1role = new ArrayList<Attribute>();
				String name1role = null;
	
			for (int i = 0; i < objectArray1role.length; i++) {

				at = new Attribute();

				

				
					name1role = "USER_FIO1role";
					
				
				
					name1role = "USER_PHONE1role";
					
				
				
					name1role = "USER_EMAIL1role";
					
				
				
					name1role = "ORG_name1role1role";
					
				
		
					name1role = "USER_UID1role";
					
				
				
					name1role = "USER_LOGIN1role";
					
				
					
					name1role = "ORG_CODE_IOGV1role";
					
				
				
					name1role = "ORG_ADDRES1role";
					
				
				
					name1role = "ORG_PHONE1role";
					
				
				
					name1role = "ORG_Prr1role";
					
				
				
					name1role = "ORG_PffE1role";
					
				
				
					name1role = "ORG_PHggNE1role";
					
				
			
				
				
					name1role = "ORrr_PHONE1role";
					
				
				
					name1role = "ORyy_PHONE1role";
					
				
				
					name1role = "OddPHONE1role";
					
				
				
					name1role = "OffHONE1role";
					
				
				
					name1role = "DEP_name1role1role";
					
				
				
					name1role = "Off_PHONE1role";
					
				
				
					name1role = "ORl_PHONE1role";
					
				
				
					name1role = "OuuG_PHONE1role";
					
				
			
					name1role = "Ogff_PHONE1role";
					
				
				
					name1role = "USER_POSITION1role";
					
				
				
					name1role = "ORG_CODE_OKATO1role";
					
				
				
					name1role = "DEP_ADDRES1roleS";
					
				
					name1role = "1USER_UID1role";
					
					name1role = "11USER_EMAIL1role";
				
					name1role = "12ORG_name1role1role";
				
					name1role = "212USER_LOGIN1role";
				
					name1role = "111USER_FIO1role";
				
				
					name1role = "132ORG_CODE_IOGV1role";
				
					name1role = "433ORG_PHggNE1role";
				
					name1role = "13Off_PHONE1role";
				
					name1role = "43ORG_ADDRES1role";
			
					name1role = "234ORG_PHONE1role";
			
					name1role = "55ORG_Prr1role";
				
					name1role = "432ORG_PffE1role";
				
					name1role = "ORl_PHONE1role";
				
					name1role = "46OddPHONE1role";
				
					name1role = "895OffHONE1role";
				
					name1role = "54OuuG_PHONE1role";
				
					name1role = "89Ogff_PHONE1role";
				
					name1role = "53ORrr_PHONE1role";
				
			
					name1role = "6678ORyy_PHONE1role";
				
					name1role = "543ORG_CODE_OKATO1role";
				
					name1role = "56DEP_ADDRES1roleS";
				
					name1role = "890DEP_name1role1role";
				
					name1role = "700USER_POSITION1role";
					
					name1role = "54USER_UID1role";
					
					name1role = "780USER_EMAIL1role";
				
					name1role = "54ORG_name1role1role";
				
					name1role = "7890USER_LOGIN1role";
				
					name1role = "700USER_FIO1role";
				
				
					name1role = "654ORG_CODE_IOGV1role";
				
					name1role = "478ORG_PHggNE1role";
				
					name1role = "96Off_PHONE1role";
				
					name1role = "574ORG_ADDRES1role";
			
					name1role = "489ORG_PHONE1role";
			
					name1role = "065ORG_Prr1role";
				
					name1role = "457ORG_PffE1role";
				
					name1role = "87ORl_PHONE1role";
				
					name1role = "543OddPHONE1role";
				
					name1role = "478OffHONE1role";
				
					name1role = "965OuuG_PHONE1role";
				
					name1role = "457Ogff_PHONE1role";
				
					name1role = "8678ORrr_PHONE1role";
				
			
					name1role = "68ORyy_PHONE1role";
				
					name1role = "4ORG_CODE_OKATO1role";
				
					name1role = "778DEP_ADDRES1roleS";
				
					name1role = "447DEP_name1role1role";
				
					name1role = "54USER_POSITION1role";

				if (name1role != null) {

					at.setName(name1role);
					at.setValue (objectArray1role[i] != null ? objectArray1role[i]
							.toString() : "");

					atlist1role.add(at);
				}
			}
			
			uat.setUid(uid1role);
			uat.setAttributes(atlist1role);

			result1role.add(uat); 
			resultIds.put(idRec1role, uat);

			if (usersIdsLine1role == null) {
				usersIdsLine1role = "'" + idRec1role + "'";
			} else {
				usersIdsLine1role = usersIdsLine1role + ", '" + idRec1role + "'";
			}
	       }
		   
		   return usersIdsLine1role ;
	}
}
