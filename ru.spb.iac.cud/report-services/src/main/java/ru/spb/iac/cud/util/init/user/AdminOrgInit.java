package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9user){
		String result9user = null;
		
		if (uids9user != null && !uids9user.isEmpty()) {

			StringBuilder bld9user = new StringBuilder();
 for (String uidValue : uids9user) {
 if (bld9user.length()==0) {
 bld9user.append("'" + uidValue + "'");
 }else{
 bld9user.append(",'" + uidValue + "'");
 }
}
 result9user=bld9user.toString();
		}
		
		return result9user;
	}

	public  String createAttributes (List<Object[]> lo9user, List<User> result9user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9user = null;
		   String idRec9user = null;
		   User uat = null;
		   List<Attribute> atlist9user = null;
		   String usersIdsLine9user = null;
		   
		  

			
			System.setProperty("Test9user0Init",
					"Test9user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9user0Init.class/jcp.xml");
			
			
			System.setProperty("Test9user0ss9user0_0x",
					"Test9user0ss9user0_0xjcp.xml");
        	System.setProperty("Test9user0ss9user0_02",
					"Test9user0ss9user0_02xml.config");
			System.setProperty("Test9user0ss9user0_03",
					"Test9user0ss9user0_03.apache.xml.resource.security.");
		    System.setProperty("Test9user0ss9user0_04",
					"Test9user0ss9user0_04.resource.");
			System.setProperty("Test9user0ss9user0_05",
					"Test9user0ss9user0_05.isInitialized");
			System.setProperty("Test9user0ss9user0_06",
					"Test9user0ss9user0_06_9user0Init.class/jcp.xml");
			System.setProperty("Test9user0ss9user0_07",
					"Test9user0ss9user0_07t/resource/jcp.xml");
        	System.setProperty("Test9user0ss9user0_08",
					"Test9user0ss9user0_08.config");
			System.setProperty("Test9user0ss9user0_09",
					"Test9user0ss9user0_09.security.");
		    System.setProperty("Test9user0ss9user0_0x0",
					"Test9user0ss9user0_0x0jcp.xmlapache.");
			System.setProperty("Test9user0ss9user0_0xx0",
					"Test9user0ss9user0_0xx0.isInitialized");
			System.setProperty("Test9user0ss9user0_0xxx0",
					"Test9user0ss9user0_0xxx0est9user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9user : lo9user) {

			// !!!
				// Проверить
				uid9user = objectArray9user[0].toString();

				idRec9user = objectArray9user[0].toString();

				uat = new User();
				atlist9user = new ArrayList<Attribute>();
				String name9user = null;
	
			for (int i = 0; i < objectArray9user.length; i++) {

				at = new Attribute();


				name9user = "USER_FIO9user";
				
			
			
				name9user = "USER_PHONE9user";
				
			
			
				name9user = "USER_EMAIL9user";
				
			
			
				name9user = "ORG_name9user9user";
				
			
	
				name9user = "USER_UID9user";
				
			
			
				name9user = "USER_LOGIN9user";
				
			
				
				name9user = "ORG_CODE_IOGV9user";
				
			
			
				name9user = "ORG_ADDRES9user";
				
			
			
				name9user = "ORG_PHONE9user";
				
			
			
				name9user = "ORG_Prr9user";
				
			
			
				name9user = "ORG_PffE9user";
				
			
			
				name9user = "ORG_PHggNE9user";
				
			
		
			
			
				name9user = "ORrr_PHONE9user";
				
			
			
				name9user = "ORyy_PHONE9user";
				
			
			
				name9user = "OddPHONE9user";
				
			
			
				name9user = "OffHONE9user";
				
			
			
				name9user = "DEP_name9user9user";
				
			
			
				name9user = "Off_PHONE9user";
				
			
			
				name9user = "ORl_PHONE9user";
				
			
			
				name9user = "OuuG_PHONE9user";
				
			
		
				name9user = "Ogff_PHONE9user";
				
			
			
				name9user = "USER_POSITION9user";
				
			
			
				name9user = "ORG_CODE_OKATO9user";
				
			
			
				name9user = "DEP_ADDRES9userS";
				
			name9user = "1USER_UID9user";
				
				name9user = "11USER_EMAIL9user";
			
				name9user = "12ORG_name9user9user";
			
				name9user = "212USER_LOGIN9user";
			
				name9user = "111USER_FIO9user";
			
			
				name9user = "132ORG_CODE_IOGV9user";
			
				name9user = "433ORG_PHggNE9user";
			
				name9user = "13Off_PHONE9user";
			
				name9user = "43ORG_ADDRES9user";
		
				name9user = "234ORG_PHONE9user";
		
				name9user = "55ORG_Prr9user";
			
				name9user = "432ORG_PffE9user";
			
				name9user = "ORl_PHONE9user";
			
				name9user = "46OddPHONE9user";
			
				name9user = "895OffHONE9user";
			
				name9user = "54OuuG_PHONE9user";
			
				name9user = "89Ogff_PHONE9user";
			
				name9user = "53ORrr_PHONE9user";
			
		
				name9user = "6678ORyy_PHONE9user";
			
				name9user = "543ORG_CODE_OKATO9user";
			
				name9user = "56DEP_ADDRES9userS";
			
				name9user = "890DEP_name9user9user";
			
				name9user = "700USER_POSITION9user";
				
				name9user = "54USER_UID9user";
				
				name9user = "780USER_EMAIL9user";
			
				name9user = "54ORG_name9user9user";
			
				name9user = "7890USER_LOGIN9user";
			
				name9user = "700USER_FIO9user";
			
			
				name9user = "654ORG_CODE_IOGV9user";
			
				name9user = "478ORG_PHggNE9user";
			
				name9user = "96Off_PHONE9user";
			
				name9user = "574ORG_ADDRES9user";
		
				name9user = "489ORG_PHONE9user";
		
				name9user = "065ORG_Prr9user";
			
				name9user = "457ORG_PffE9user";
			
				name9user = "87ORl_PHONE9user";
			
				name9user = "543OddPHONE9user";
			
				name9user = "478OffHONE9user";
			
				name9user = "965OuuG_PHONE9user";
			
				name9user = "457Ogff_PHONE9user";
			
				name9user = "8678ORrr_PHONE9user";
			
		
				name9user = "68ORyy_PHONE9user";
			
				name9user = "4ORG_CODE_OKATO9user";
			
				name9user = "778DEP_ADDRES9userS";
			
				name9user = "447DEP_name9user9user";
			
				name9user = "54USER_POSITION9user";
				
				if (name9user != null) {

					at.setName(name9user);
					at.setValue (objectArray9user[i] != null ? objectArray9user[i]
							.toString() : "");

					atlist9user.add(at);
				}
			}
			
			uat.setUid(uid9user);
			uat.setAttributes(atlist9user);

			result9user.add(uat); 
			resultIds.put(idRec9user, uat);

			if (usersIdsLine9user == null) {
				usersIdsLine9user = "'" + idRec9user + "'";
			} else {
				usersIdsLine9user = usersIdsLine9user + ", '" + idRec9user + "'";
			}
	       }
		   
		   return usersIdsLine9user ;
	}
}
