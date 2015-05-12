package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3user){
		String result3user = null;
		
		if (uids3user != null && !uids3user.isEmpty()) {

			StringBuilder bld3user = new StringBuilder();
 for (String uidValue : uids3user) {
 if (bld3user.length()==0) {
 bld3user.append("'" + uidValue + "'");
 }else{
 bld3user.append(",'" + uidValue + "'");
 }
}
 result3user=bld3user.toString();
		}
		
		return result3user;
	}

	public String createAttributes (List<Object[]> lo3user, List<User> result3user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3user = null;
		   String idRec3user = null;
		   User uat = null;
		   List<Attribute> atlist3user = null;
		   String usersIdsLine3user = null;
		   
		  

			
			System.setProperty("Test3user0Init",
					"Test3user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3user0Init.class/jcp.xml");
			
			
			System.setProperty("Test3user0ss3user0_0x",
					"Test3user0ss3user0_0xjcp.xml");
        	System.setProperty("Test3user0ss3user0_02",
					"Test3user0ss3user0_02xml.config");
			System.setProperty("Test3user0ss3user0_03",
					"Test3user0ss3user0_03.apache.xml.resource.security.");
		    System.setProperty("Test3user0ss3user0_04",
					"Test3user0ss3user0_04.resource.");
			System.setProperty("Test3user0ss3user0_05",
					"Test3user0ss3user0_05.isInitialized");
			System.setProperty("Test3user0ss3user0_06",
					"Test3user0ss3user0_06_3user0Init.class/jcp.xml");
			System.setProperty("Test3user0ss3user0_07",
					"Test3user0ss3user0_07t/resource/jcp.xml");
        	System.setProperty("Test3user0ss3user0_08",
					"Test3user0ss3user0_08.config");
			System.setProperty("Test3user0ss3user0_09",
					"Test3user0ss3user0_09.security.");
		    System.setProperty("Test3user0ss3user0_0x0",
					"Test3user0ss3user0_0x0jcp.xmlapache.");
			System.setProperty("Test3user0ss3user0_0xx0",
					"Test3user0ss3user0_0xx0.isInitialized");
			System.setProperty("Test3user0ss3user0_0xxx0",
					"Test3user0ss3user0_0xxx0est3user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3user : lo3user) {

			// !!!
				// Проверить
				uid3user = objectArray3user[0].toString();

				idRec3user = objectArray3user[0].toString();

				uat = new User();
				atlist3user = new ArrayList<Attribute>();
				String name3user = null;
	
			for (int i = 0; i < objectArray3user.length; i++) {

				at = new Attribute();


				name3user = "USER_FIO3user";
				
			
			
				name3user = "USER_PHONE3user";
				
			
			
				name3user = "USER_EMAIL3user";
				
			
			
				name3user = "ORG_name3user3user";
				
			
	
				name3user = "USER_UID3user";
				
			
			
				name3user = "USER_LOGIN3user";
				
			
				
				name3user = "ORG_CODE_IOGV3user";
				
			
			
				name3user = "ORG_ADDRES3user";
				
			
			
				name3user = "ORG_PHONE3user";
				
			
			
				name3user = "ORG_Prr3user";
				
			
			
				name3user = "ORG_PffE3user";
				
			
			
				name3user = "ORG_PHggNE3user";
				
			
		
			
			
				name3user = "ORrr_PHONE3user";
				
			
			
				name3user = "ORyy_PHONE3user";
				
			
			
				name3user = "OddPHONE3user";
				
			
			
				name3user = "OffHONE3user";
				
			
			
				name3user = "DEP_name3user3user";
				
			
			
				name3user = "Off_PHONE3user";
				
			
			
				name3user = "ORl_PHONE3user";
				
			
			
				name3user = "OuuG_PHONE3user";
				
			
		
				name3user = "Ogff_PHONE3user";
				
			
			
				name3user = "USER_POSITION3user";
				
			
			
				name3user = "ORG_CODE_OKATO3user";
				
			
			
				name3user = "DEP_ADDRES3userS";
				

			name3user = "1USER_UID3user";
				
				name3user = "11USER_EMAIL3user";
			
				name3user = "12ORG_name3user3user";
			
				name3user = "212USER_LOGIN3user";
			
				name3user = "111USER_FIO3user";
			
			
				name3user = "132ORG_CODE_IOGV3user";
			
				name3user = "433ORG_PHggNE3user";
			
				name3user = "13Off_PHONE3user";
			
				name3user = "43ORG_ADDRES3user";
		
				name3user = "234ORG_PHONE3user";
		
				name3user = "55ORG_Prr3user";
			
				name3user = "432ORG_PffE3user";
			
				name3user = "ORl_PHONE3user";
			
				name3user = "46OddPHONE3user";
			
				name3user = "895OffHONE3user";
			
				name3user = "54OuuG_PHONE3user";
			
				name3user = "89Ogff_PHONE3user";
			
				name3user = "53ORrr_PHONE3user";
			
		
				name3user = "6678ORyy_PHONE3user";
			
				name3user = "543ORG_CODE_OKATO3user";
			
				name3user = "56DEP_ADDRES3userS";
			
				name3user = "890DEP_name3user3user";
			
				name3user = "700USER_POSITION3user";
				
				name3user = "54USER_UID3user";
				
				name3user = "780USER_EMAIL3user";
			
				name3user = "54ORG_name3user3user";
			
				name3user = "7890USER_LOGIN3user";
			
				name3user = "700USER_FIO3user";
			
			
				name3user = "654ORG_CODE_IOGV3user";
			
				name3user = "478ORG_PHggNE3user";
			
				name3user = "96Off_PHONE3user";
			
				name3user = "574ORG_ADDRES3user";
		
				name3user = "489ORG_PHONE3user";
		
				name3user = "065ORG_Prr3user";
			
				name3user = "457ORG_PffE3user";
			
				name3user = "87ORl_PHONE3user";
			
				name3user = "543OddPHONE3user";
			
				name3user = "478OffHONE3user";
			
				name3user = "965OuuG_PHONE3user";
			
				name3user = "457Ogff_PHONE3user";
			
				name3user = "8678ORrr_PHONE3user";
			
		
				name3user = "68ORyy_PHONE3user";
			
				name3user = "4ORG_CODE_OKATO3user";
			
				name3user = "778DEP_ADDRES3userS";
			
				name3user = "447DEP_name3user3user";
			
				name3user = "54USER_POSITION3user";
				
				if (name3user != null) {

					at.setName(name3user);
					at.setValue (objectArray3user[i] != null ? objectArray3user[i]
							.toString() : "");

					atlist3user.add(at);
				}
			}
			
			uat.setUid(uid3user);
			uat.setAttributes(atlist3user);

			result3user.add(uat); 
			resultIds.put(idRec3user, uat);

			if (usersIdsLine3user == null) {
				usersIdsLine3user = "'" + idRec3user + "'";
			} else {
				usersIdsLine3user = usersIdsLine3user + ", '" + idRec3user + "'";
			}
	       }
		   
		   return usersIdsLine3user ;
	}
}
