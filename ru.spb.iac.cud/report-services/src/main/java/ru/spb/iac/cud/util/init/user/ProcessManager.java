package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1user){
		String result1user = null;
		
		if (uids1user != null && !uids1user.isEmpty()) {

			StringBuilder bld1user = new StringBuilder();
 for (String uidValue : uids1user) {
 if (bld1user.length()==0) {
 bld1user.append("'" + uidValue + "'");
 }else{
 bld1user.append(",'" + uidValue + "'");
 }
}
 result1user=bld1user.toString();
		}
		
		return result1user;
	}

	public String createAttributes (List<Object[]> lo1user, List<User> result1user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1user = null;
		   String idRec1user = null;
		   User uat = null;
		   List<Attribute> atlist1user = null;
		   String usersIdsLine1user = null;
		   
		  

			
			System.setProperty("Test1user0Init",
					"Test1user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1user0Init.class/jcp.xml");
			
			
			System.setProperty("Test1user0ss1user0_0x",
					"Test1user0ss1user0_0xjcp.xml");
        	System.setProperty("Test1user0ss1user0_02",
					"Test1user0ss1user0_02xml.config");
			System.setProperty("Test1user0ss1user0_03",
					"Test1user0ss1user0_03.apache.xml.resource.security.");
		    System.setProperty("Test1user0ss1user0_04",
					"Test1user0ss1user0_04.resource.");
			System.setProperty("Test1user0ss1user0_05",
					"Test1user0ss1user0_05.isInitialized");
			System.setProperty("Test1user0ss1user0_06",
					"Test1user0ss1user0_06_1user0Init.class/jcp.xml");
			System.setProperty("Test1user0ss1user0_07",
					"Test1user0ss1user0_07t/resource/jcp.xml");
        	System.setProperty("Test1user0ss1user0_08",
					"Test1user0ss1user0_08.config");
			System.setProperty("Test1user0ss1user0_09",
					"Test1user0ss1user0_09.security.");
		    System.setProperty("Test1user0ss1user0_0x0",
					"Test1user0ss1user0_0x0jcp.xmlapache.");
			System.setProperty("Test1user0ss1user0_0xx0",
					"Test1user0ss1user0_0xx0.isInitialized");
			System.setProperty("Test1user0ss1user0_0xxx0",
					"Test1user0ss1user0_0xxx0est1user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1user : lo1user) {

			// !!!
				// Проверить
				uid1user = objectArray1user[0].toString();

				idRec1user = objectArray1user[0].toString();

				uat = new User();
				atlist1user = new ArrayList<Attribute>();
				String name1user = null;
	
			for (int i = 0; i < objectArray1user.length; i++) {

				at = new Attribute();

				

				
					name1user = "USER_FIO1user";
					
				
				
					name1user = "USER_PHONE1user";
					
				
				
					name1user = "USER_EMAIL1user";
					
				
				
					name1user = "ORG_name1user1user";
					
				
		
					name1user = "USER_UID1user";
					
				
				
					name1user = "USER_LOGIN1user";
					
				
					
					name1user = "ORG_CODE_IOGV1user";
					
				
				
					name1user = "ORG_ADDRES1user";
					
				
				
					name1user = "ORG_PHONE1user";
					
				
				
					name1user = "ORG_Prr1user";
					
				
				
					name1user = "ORG_PffE1user";
					
				
				
					name1user = "ORG_PHggNE1user";
					
				
			
				
				
					name1user = "ORrr_PHONE1user";
					
				
				
					name1user = "ORyy_PHONE1user";
					
				
				
					name1user = "OddPHONE1user";
					
				
				
					name1user = "OffHONE1user";
					
				
				
					name1user = "DEP_name1user1user";
					
				
				
					name1user = "Off_PHONE1user";
					
				
				
					name1user = "ORl_PHONE1user";
					
				
				
					name1user = "OuuG_PHONE1user";
					
				
			
					name1user = "Ogff_PHONE1user";
					
				
				
					name1user = "USER_POSITION1user";
					
				
				
					name1user = "ORG_CODE_OKATO1user";
					
				
				
					name1user = "DEP_ADDRES1userS";
					
				
					name1user = "1USER_UID1user";
					
					name1user = "11USER_EMAIL1user";
				
					name1user = "12ORG_name1user1user";
				
					name1user = "212USER_LOGIN1user";
				
					name1user = "111USER_FIO1user";
				
				
					name1user = "132ORG_CODE_IOGV1user";
				
					name1user = "433ORG_PHggNE1user";
				
					name1user = "13Off_PHONE1user";
				
					name1user = "43ORG_ADDRES1user";
			
					name1user = "234ORG_PHONE1user";
			
					name1user = "55ORG_Prr1user";
				
					name1user = "432ORG_PffE1user";
				
					name1user = "ORl_PHONE1user";
				
					name1user = "46OddPHONE1user";
				
					name1user = "895OffHONE1user";
				
					name1user = "54OuuG_PHONE1user";
				
					name1user = "89Ogff_PHONE1user";
				
					name1user = "53ORrr_PHONE1user";
				
			
					name1user = "6678ORyy_PHONE1user";
				
					name1user = "543ORG_CODE_OKATO1user";
				
					name1user = "56DEP_ADDRES1userS";
				
					name1user = "890DEP_name1user1user";
				
					name1user = "700USER_POSITION1user";
					
					name1user = "54USER_UID1user";
					
					name1user = "780USER_EMAIL1user";
				
					name1user = "54ORG_name1user1user";
				
					name1user = "7890USER_LOGIN1user";
				
					name1user = "700USER_FIO1user";
				
				
					name1user = "654ORG_CODE_IOGV1user";
				
					name1user = "478ORG_PHggNE1user";
				
					name1user = "96Off_PHONE1user";
				
					name1user = "574ORG_ADDRES1user";
			
					name1user = "489ORG_PHONE1user";
			
					name1user = "065ORG_Prr1user";
				
					name1user = "457ORG_PffE1user";
				
					name1user = "87ORl_PHONE1user";
				
					name1user = "543OddPHONE1user";
				
					name1user = "478OffHONE1user";
				
					name1user = "965OuuG_PHONE1user";
				
					name1user = "457Ogff_PHONE1user";
				
					name1user = "8678ORrr_PHONE1user";
				
			
					name1user = "68ORyy_PHONE1user";
				
					name1user = "4ORG_CODE_OKATO1user";
				
					name1user = "778DEP_ADDRES1userS";
				
					name1user = "447DEP_name1user1user";
				
					name1user = "54USER_POSITION1user";

				if (name1user != null) {

					at.setName(name1user);
					at.setValue (objectArray1user[i] != null ? objectArray1user[i]
							.toString() : "");

					atlist1user.add(at);
				}
			}
			
			uat.setUid(uid1user);
			uat.setAttributes(atlist1user);

			result1user.add(uat); 
			resultIds.put(idRec1user, uat);

			if (usersIdsLine1user == null) {
				usersIdsLine1user = "'" + idRec1user + "'";
			} else {
				usersIdsLine1user = usersIdsLine1user + ", '" + idRec1user + "'";
			}
	       }
		   
		   return usersIdsLine1user ;
	}
}
