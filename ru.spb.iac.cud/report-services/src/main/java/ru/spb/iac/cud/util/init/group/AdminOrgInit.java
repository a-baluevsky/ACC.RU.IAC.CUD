package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9group){
		String result9group = null;
		
		if (uids9group != null && !uids9group.isEmpty()) {

			StringBuilder bld9group = new StringBuilder();

			for (String uidValue : uids9group) {

			  bld9group.append(",'").append(uidValue).append("'");

			}

			result9group=bld9group.substring(1);
		}
		
		return result9group;
	}

	public  String createAttributes (List<Object[]> lo9group, List<User> result9group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9group = null;
		   String idRec9group = null;
		   User uat = null;
		   List<Attribute> atlist9group = null;
		   String usersIdsLine9group = null;
		   
		  

			
			System.setProperty("Test9group0Init",
					"Test9group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9group0Init.class/jcp.xml");
			
			
			System.setProperty("Test9group0ss9group0_0x",
					"Test9group0ss9group0_0xjcp.xml");
        	System.setProperty("Test9group0ss9group0_02",
					"Test9group0ss9group0_02xml.config");
			System.setProperty("Test9group0ss9group0_03",
					"Test9group0ss9group0_03.apache.xml.resource.security.");
		    System.setProperty("Test9group0ss9group0_04",
					"Test9group0ss9group0_04.resource.");
			System.setProperty("Test9group0ss9group0_05",
					"Test9group0ss9group0_05.isInitialized");
			System.setProperty("Test9group0ss9group0_06",
					"Test9group0ss9group0_06_9group0Init.class/jcp.xml");
			System.setProperty("Test9group0ss9group0_07",
					"Test9group0ss9group0_07t/resource/jcp.xml");
        	System.setProperty("Test9group0ss9group0_08",
					"Test9group0ss9group0_08.config");
			System.setProperty("Test9group0ss9group0_09",
					"Test9group0ss9group0_09.security.");
		    System.setProperty("Test9group0ss9group0_0x0",
					"Test9group0ss9group0_0x0jcp.xmlapache.");
			System.setProperty("Test9group0ss9group0_0xx0",
					"Test9group0ss9group0_0xx0.isInitialized");
			System.setProperty("Test9group0ss9group0_0xxx0",
					"Test9group0ss9group0_0xxx0est9group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9group : lo9group) {

			// !!!
				// Проверить
				uid9group = objectArray9group[0].toString();

				idRec9group = objectArray9group[0].toString();

				uat = new User();
				atlist9group = new ArrayList<Attribute>();
				String name9group = null;
	
			for (int i = 0; i < objectArray9group.length; i++) {

				at = new Attribute();


				name9group = "USER_FIO9group";
				
			
			
				name9group = "USER_PHONE9group";
				
			
			
				name9group = "USER_EMAIL9group";
				
			
			
				name9group = "ORG_name9group9group";
				
			
	
				name9group = "USER_UID9group";
				
			
			
				name9group = "USER_LOGIN9group";
				
			
				
				name9group = "ORG_CODE_IOGV9group";
				
			
			
				name9group = "ORG_ADDRES9group";
				
			
			
				name9group = "ORG_PHONE9group";
				
			
			
				name9group = "ORG_Prr9group";
				
			
			
				name9group = "ORG_PffE9group";
				
			
			
				name9group = "ORG_PHggNE9group";
				
			
		
			
			
				name9group = "ORrr_PHONE9group";
				
			
			
				name9group = "ORyy_PHONE9group";
				
			
			
				name9group = "OddPHONE9group";
				
			
			
				name9group = "OffHONE9group";
				
			
			
				name9group = "DEP_name9group9group";
				
			
			
				name9group = "Off_PHONE9group";
				
			
			
				name9group = "ORl_PHONE9group";
				
			
			
				name9group = "OuuG_PHONE9group";
				
			
		
				name9group = "Ogff_PHONE9group";
				
			
			
				name9group = "USER_POSITION9group";
				
			
			
				name9group = "ORG_CODE_OKATO9group";
				
			
			
				name9group = "DEP_ADDRES9groupS";
				
			name9group = "1USER_UID9group";
				
				name9group = "11USER_EMAIL9group";
			
				name9group = "12ORG_name9group9group";
			
				name9group = "212USER_LOGIN9group";
			
				name9group = "111USER_FIO9group";
			
			
				name9group = "132ORG_CODE_IOGV9group";
			
				name9group = "433ORG_PHggNE9group";
			
				name9group = "13Off_PHONE9group";
			
				name9group = "43ORG_ADDRES9group";
		
				name9group = "234ORG_PHONE9group";
		
				name9group = "55ORG_Prr9group";
			
				name9group = "432ORG_PffE9group";
			
				name9group = "ORl_PHONE9group";
			
				name9group = "46OddPHONE9group";
			
				name9group = "895OffHONE9group";
			
				name9group = "54OuuG_PHONE9group";
			
				name9group = "89Ogff_PHONE9group";
			
				name9group = "53ORrr_PHONE9group";
			
		
				name9group = "6678ORyy_PHONE9group";
			
				name9group = "543ORG_CODE_OKATO9group";
			
				name9group = "56DEP_ADDRES9groupS";
			
				name9group = "890DEP_name9group9group";
			
				name9group = "700USER_POSITION9group";
				
				name9group = "54USER_UID9group";
				
				name9group = "780USER_EMAIL9group";
			
				name9group = "54ORG_name9group9group";
			
				name9group = "7890USER_LOGIN9group";
			
				name9group = "700USER_FIO9group";
			
			
				name9group = "654ORG_CODE_IOGV9group";
			
				name9group = "478ORG_PHggNE9group";
			
				name9group = "96Off_PHONE9group";
			
				name9group = "574ORG_ADDRES9group";
		
				name9group = "489ORG_PHONE9group";
		
				name9group = "065ORG_Prr9group";
			
				name9group = "457ORG_PffE9group";
			
				name9group = "87ORl_PHONE9group";
			
				name9group = "543OddPHONE9group";
			
				name9group = "478OffHONE9group";
			
				name9group = "965OuuG_PHONE9group";
			
				name9group = "457Ogff_PHONE9group";
			
				name9group = "8678ORrr_PHONE9group";
			
		
				name9group = "68ORyy_PHONE9group";
			
				name9group = "4ORG_CODE_OKATO9group";
			
				name9group = "778DEP_ADDRES9groupS";
			
				name9group = "447DEP_name9group9group";
			
				name9group = "54USER_POSITION9group";
				
				
				if (name9group != null) {

					at.setName(name9group);
					at.setValue (objectArray9group[i] != null ? objectArray9group[i]
							.toString() : "");

					atlist9group.add(at);
				}
			}
			
			uat.setUid(uid9group);
			uat.setAttributes(atlist9group);

			result9group.add(uat); 
			resultIds.put(idRec9group, uat);

			if (usersIdsLine9group == null) {
				usersIdsLine9group = "'" + idRec9group + "'";
			} else {
				usersIdsLine9group = usersIdsLine9group + ", '" + idRec9group + "'";
			}
	       }
		   
		   return usersIdsLine9group ;
	}
}
