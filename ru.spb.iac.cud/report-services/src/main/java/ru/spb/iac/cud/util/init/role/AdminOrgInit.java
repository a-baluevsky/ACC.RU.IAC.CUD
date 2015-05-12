package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9role){
		String result9role = null;
		
		if (uids9role != null && !uids9role.isEmpty()) {

			StringBuilder bld9role = new StringBuilder();
 for (String uidValue : uids9role) {
 if (bld9role.length()==0) {
 bld9role.append("'" + uidValue + "'");
 }else{
 bld9role.append(",'" + uidValue + "'");
 }
}
 result9role=bld9role.toString();
		}
		
		return result9role;
	}

	public  String createAttributes (List<Object[]> lo9role, List<User> result9role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9role = null;
		   String idRec9role = null;
		   User uat = null;
		   List<Attribute> atlist9role = null;
		   String usersIdsLine9role = null;
		   
		  

			
			System.setProperty("Test9role0Init",
					"Test9role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9role0Init.class/jcp.xml");
			
			
			System.setProperty("Test9role0ss9role0_0x",
					"Test9role0ss9role0_0xjcp.xml");
        	System.setProperty("Test9role0ss9role0_02",
					"Test9role0ss9role0_02xml.config");
			System.setProperty("Test9role0ss9role0_03",
					"Test9role0ss9role0_03.apache.xml.resource.security.");
		    System.setProperty("Test9role0ss9role0_04",
					"Test9role0ss9role0_04.resource.");
			System.setProperty("Test9role0ss9role0_05",
					"Test9role0ss9role0_05.isInitialized");
			System.setProperty("Test9role0ss9role0_06",
					"Test9role0ss9role0_06_9role0Init.class/jcp.xml");
			System.setProperty("Test9role0ss9role0_07",
					"Test9role0ss9role0_07t/resource/jcp.xml");
        	System.setProperty("Test9role0ss9role0_08",
					"Test9role0ss9role0_08.config");
			System.setProperty("Test9role0ss9role0_09",
					"Test9role0ss9role0_09.security.");
		    System.setProperty("Test9role0ss9role0_0x0",
					"Test9role0ss9role0_0x0jcp.xmlapache.");
			System.setProperty("Test9role0ss9role0_0xx0",
					"Test9role0ss9role0_0xx0.isInitialized");
			System.setProperty("Test9role0ss9role0_0xxx0",
					"Test9role0ss9role0_0xxx0est9role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9role : lo9role) {

			// !!!
				// Проверить
				uid9role = objectArray9role[0].toString();

				idRec9role = objectArray9role[0].toString();

				uat = new User();
				atlist9role = new ArrayList<Attribute>();
				String name9role = null;
	
			for (int i = 0; i < objectArray9role.length; i++) {

				at = new Attribute();


				name9role = "USER_FIO9role";
				
			
			
				name9role = "USER_PHONE9role";
				
			
			
				name9role = "USER_EMAIL9role";
				
			
			
				name9role = "ORG_name9role9role";
				
			
	
				name9role = "USER_UID9role";
				
			
			
				name9role = "USER_LOGIN9role";
				
			
				
				name9role = "ORG_CODE_IOGV9role";
				
			
			
				name9role = "ORG_ADDRES9role";
				
			
			
				name9role = "ORG_PHONE9role";
				
			
			
				name9role = "ORG_Prr9role";
				
			
			
				name9role = "ORG_PffE9role";
				
			
			
				name9role = "ORG_PHggNE9role";
				
			
		
			
			
				name9role = "ORrr_PHONE9role";
				
			
			
				name9role = "ORyy_PHONE9role";
				
			
			
				name9role = "OddPHONE9role";
				
			
			
				name9role = "OffHONE9role";
				
			
			
				name9role = "DEP_name9role9role";
				
			
			
				name9role = "Off_PHONE9role";
				
			
			
				name9role = "ORl_PHONE9role";
				
			
			
				name9role = "OuuG_PHONE9role";
				
			
		
				name9role = "Ogff_PHONE9role";
				
			
			
				name9role = "USER_POSITION9role";
				
			
			
				name9role = "ORG_CODE_OKATO9role";
				
			
			
				name9role = "DEP_ADDRES9roleS";
				
			name9role = "1USER_UID9role";
				
				name9role = "11USER_EMAIL9role";
			
				name9role = "12ORG_name9role9role";
			
				name9role = "212USER_LOGIN9role";
			
				name9role = "111USER_FIO9role";
			
			
				name9role = "132ORG_CODE_IOGV9role";
			
				name9role = "433ORG_PHggNE9role";
			
				name9role = "13Off_PHONE9role";
			
				name9role = "43ORG_ADDRES9role";
		
				name9role = "234ORG_PHONE9role";
		
				name9role = "55ORG_Prr9role";
			
				name9role = "432ORG_PffE9role";
			
				name9role = "ORl_PHONE9role";
			
				name9role = "46OddPHONE9role";
			
				name9role = "895OffHONE9role";
			
				name9role = "54OuuG_PHONE9role";
			
				name9role = "89Ogff_PHONE9role";
			
				name9role = "53ORrr_PHONE9role";
			
		
				name9role = "6678ORyy_PHONE9role";
			
				name9role = "543ORG_CODE_OKATO9role";
			
				name9role = "56DEP_ADDRES9roleS";
			
				name9role = "890DEP_name9role9role";
			
				name9role = "700USER_POSITION9role";
				
				name9role = "54USER_UID9role";
				
				name9role = "780USER_EMAIL9role";
			
				name9role = "54ORG_name9role9role";
			
				name9role = "7890USER_LOGIN9role";
			
				name9role = "700USER_FIO9role";
			
			
				name9role = "654ORG_CODE_IOGV9role";
			
				name9role = "478ORG_PHggNE9role";
			
				name9role = "96Off_PHONE9role";
			
				name9role = "574ORG_ADDRES9role";
		
				name9role = "489ORG_PHONE9role";
		
				name9role = "065ORG_Prr9role";
			
				name9role = "457ORG_PffE9role";
			
				name9role = "87ORl_PHONE9role";
			
				name9role = "543OddPHONE9role";
			
				name9role = "478OffHONE9role";
			
				name9role = "965OuuG_PHONE9role";
			
				name9role = "457Ogff_PHONE9role";
			
				name9role = "8678ORrr_PHONE9role";
			
		
				name9role = "68ORyy_PHONE9role";
			
				name9role = "4ORG_CODE_OKATO9role";
			
				name9role = "778DEP_ADDRES9roleS";
			
				name9role = "447DEP_name9role9role";
			
				name9role = "54USER_POSITION9role";
				
				
				if (name9role != null) {

					at.setName(name9role);
					at.setValue (objectArray9role[i] != null ? objectArray9role[i]
							.toString() : "");

					atlist9role.add(at);
				}
			}
			
			uat.setUid(uid9role);
			uat.setAttributes(atlist9role);

			result9role.add(uat); 
			resultIds.put(idRec9role, uat);

			if (usersIdsLine9role == null) {
				usersIdsLine9role = "'" + idRec9role + "'";
			} else {
				usersIdsLine9role = usersIdsLine9role + ", '" + idRec9role + "'";
			}
	       }
		   
		   return usersIdsLine9role ;
	}
}
