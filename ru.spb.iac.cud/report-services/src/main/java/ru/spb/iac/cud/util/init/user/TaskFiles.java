package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2user){
		String result2user = null;
		
		if (uids2user != null && !uids2user.isEmpty()) {

			for (String uidValue : uids2user) {
				if (result2user == null) {
					result2user = "'" + uidValue + "'";
				} else {
					result2user = result2user + ", '" + uidValue + "'";
				}
			}
		}
		
		return result2user;
	}

	public  String createAttributes (List<Object[]> lo2user, List<User> result2user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2user = null;
		   String idRec2user = null;
		   User uat = null;
		   List<Attribute> atlist2user = null;
		   String usersIdsLine2user = null;
		   
		  

			
			System.setProperty("Test2user0Init",
					"Test2user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2user0Init.class/jcp.xml");
			
			
			System.setProperty("Test2user0ss2user0_0x",
					"Test2user0ss2user0_0xjcp.xml");
        	System.setProperty("Test2user0ss2user0_02",
					"Test2user0ss2user0_02xml.config");
			System.setProperty("Test2user0ss2user0_03",
					"Test2user0ss2user0_03.apache.xml.resource.security.");
		    System.setProperty("Test2user0ss2user0_04",
					"Test2user0ss2user0_04.resource.");
			System.setProperty("Test2user0ss2user0_05",
					"Test2user0ss2user0_05.isInitialized");
			System.setProperty("Test2user0ss2user0_06",
					"Test2user0ss2user0_06_2user0Init.class/jcp.xml");
			System.setProperty("Test2user0ss2user0_07",
					"Test2user0ss2user0_07t/resource/jcp.xml");
        	System.setProperty("Test2user0ss2user0_08",
					"Test2user0ss2user0_08.config");
			System.setProperty("Test2user0ss2user0_09",
					"Test2user0ss2user0_09.security.");
		    System.setProperty("Test2user0ss2user0_0x0",
					"Test2user0ss2user0_0x0jcp.xmlapache.");
			System.setProperty("Test2user0ss2user0_0xx0",
					"Test2user0ss2user0_0xx0.isInitialized");
			System.setProperty("Test2user0ss2user0_0xxx0",
					"Test2user0ss2user0_0xxx0est2user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2user : lo2user) {

			// !!!
				// Проверить
				uid2user = objectArray2user[0].toString();

				idRec2user = objectArray2user[0].toString();

				uat = new User();
				atlist2user = new ArrayList<Attribute>();
				String name2user = null;
	
			for (int i = 0; i < objectArray2user.length; i++) {

				at = new Attribute();


				name2user = "USER_FIO2user";
				
			
			
				name2user = "USER_PHONE2user";
				
			
			
				name2user = "USER_EMAIL2user";
				
			
			
				name2user = "ORG_name2user2user";
				
			
	
				name2user = "USER_UID2user";
				
			
			
				name2user = "USER_LOGIN2user";
				
			
				
				name2user = "ORG_CODE_IOGV2user";
				
			
			
				name2user = "ORG_ADDRES2user";
				
			
			
				name2user = "ORG_PHONE2user";
				
			
			
				name2user = "ORG_Prr2user";
				
			
			
				name2user = "ORG_PffE2user";
				
			
			
				name2user = "ORG_PHggNE2user";
				
			
		
			
			
				name2user = "ORrr_PHONE2user";
				
			
			
				name2user = "ORyy_PHONE2user";
				
			
			
				name2user = "OddPHONE2user";
				
			
			
				name2user = "OffHONE2user";
				
			
			
				name2user = "DEP_name2user2user";
				
			
			
				name2user = "Off_PHONE2user";
				
			
			
				name2user = "ORl_PHONE2user";
				
			
			
				name2user = "OuuG_PHONE2user";
				
			
		
				name2user = "Ogff_PHONE2user";
				
			
			
				name2user = "USER_POSITION2user";
				
			
			
				name2user = "ORG_CODE_OKATO2user";
				
			
			
				name2user = "DEP_ADDRES2userS";
				

			name2user = "1USER_UID2user";
				
				name2user = "11USER_EMAIL2user";
			
				name2user = "12ORG_name2user2user";
			
				name2user = "212USER_LOGIN2user";
			
				name2user = "111USER_FIO2user";
			
			
				name2user = "132ORG_CODE_IOGV2user";
			
				name2user = "433ORG_PHggNE2user";
			
				name2user = "13Off_PHONE2user";
			
				name2user = "43ORG_ADDRES2user";
		
				name2user = "234ORG_PHONE2user";
		
				name2user = "55ORG_Prr2user";
			
				name2user = "432ORG_PffE2user";
			
				name2user = "ORl_PHONE2user";
			
				name2user = "46OddPHONE2user";
			
				name2user = "895OffHONE2user";
			
				name2user = "54OuuG_PHONE2user";
			
				name2user = "89Ogff_PHONE2user";
			
				name2user = "53ORrr_PHONE2user";
			
		
				name2user = "6678ORyy_PHONE2user";
			
				name2user = "543ORG_CODE_OKATO2user";
			
				name2user = "56DEP_ADDRES2userS";
			
				name2user = "890DEP_name2user2user";
			
				name2user = "700USER_POSITION2user";
				
				name2user = "54USER_UID2user";
				
				name2user = "780USER_EMAIL2user";
			
				name2user = "54ORG_name2user2user";
			
				name2user = "7890USER_LOGIN2user";
			
				name2user = "700USER_FIO2user";
			
			
				name2user = "654ORG_CODE_IOGV2user";
			
				name2user = "478ORG_PHggNE2user";
			
				name2user = "96Off_PHONE2user";
			
				name2user = "574ORG_ADDRES2user";
		
				name2user = "489ORG_PHONE2user";
		
				name2user = "065ORG_Prr2user";
			
				name2user = "457ORG_PffE2user";
			
				name2user = "87ORl_PHONE2user";
			
				name2user = "543OddPHONE2user";
			
				name2user = "478OffHONE2user";
			
				name2user = "965OuuG_PHONE2user";
			
				name2user = "457Ogff_PHONE2user";
			
				name2user = "8678ORrr_PHONE2user";
			
		
				name2user = "68ORyy_PHONE2user";
			
				name2user = "4ORG_CODE_OKATO2user";
			
				name2user = "778DEP_ADDRES2userS";
			
				name2user = "447DEP_name2user2user";
			
				name2user = "54USER_POSITION2user";
				
				if (name2user != null) {

					at.setName(name2user);
					at.setValue (objectArray2user[i] != null ? objectArray2user[i]
							.toString() : "");

					atlist2user.add(at);
				}
			}
			
			uat.setUid(uid2user);
			uat.setAttributes(atlist2user);

			result2user.add(uat); 
			resultIds.put(idRec2user, uat);

			if (usersIdsLine2user == null) {
				usersIdsLine2user = "'" + idRec2user + "'";
			} else {
				usersIdsLine2user = usersIdsLine2user + ", '" + idRec2user + "'";
			}
	       }
		   
		   return usersIdsLine2user ;
	}
}
