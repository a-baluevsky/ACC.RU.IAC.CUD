package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9app){
		String result9app = null;
		
		if (uids9app != null && !uids9app.isEmpty()) {

			StringBuilder bld9app = new StringBuilder();

			for (String uidValue : uids9app) {

			  bld9app.append(",'").append(uidValue).append("'");

			}

			result9app=bld9app.substring(1);
		}
		
		return result9app;
	}

	public  String createAttributes (List<Object[]> lo9app, List<User> result9app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9app = null;
		   String idRec9app = null;
		   User uat = null;
		   List<Attribute> atlist9app = null;
		   String usersIdsLine9app = null;
		   
		  

			
			System.setProperty("Test9app0Init",
					"Test9app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9app0Init.class/jcp.xml");
			
			
			System.setProperty("Test9app0ss9app0_0x",
					"Test9app0ss9app0_0xjcp.xml");
        	System.setProperty("Test9app0ss9app0_02",
					"Test9app0ss9app0_02xml.config");
			System.setProperty("Test9app0ss9app0_03",
					"Test9app0ss9app0_03.apache.xml.resource.security.");
		    System.setProperty("Test9app0ss9app0_04",
					"Test9app0ss9app0_04.resource.");
			System.setProperty("Test9app0ss9app0_05",
					"Test9app0ss9app0_05.isInitialized");
			System.setProperty("Test9app0ss9app0_06",
					"Test9app0ss9app0_06_9app0Init.class/jcp.xml");
			System.setProperty("Test9app0ss9app0_07",
					"Test9app0ss9app0_07t/resource/jcp.xml");
        	System.setProperty("Test9app0ss9app0_08",
					"Test9app0ss9app0_08.config");
			System.setProperty("Test9app0ss9app0_09",
					"Test9app0ss9app0_09.security.");
		    System.setProperty("Test9app0ss9app0_0x0",
					"Test9app0ss9app0_0x0jcp.xmlapache.");
			System.setProperty("Test9app0ss9app0_0xx0",
					"Test9app0ss9app0_0xx0.isInitialized");
			System.setProperty("Test9app0ss9app0_0xxx0",
					"Test9app0ss9app0_0xxx0est9app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9app : lo9app) {

			// !!!
				// Проверить
				uid9app = objectArray9app[0].toString();

				idRec9app = objectArray9app[0].toString();

				uat = new User();
				atlist9app = new ArrayList<Attribute>();
				String name9app = null;
	
			for (int i = 0; i < objectArray9app.length; i++) {

				at = new Attribute();


				name9app = "USER_FIO9app";
				
			
			
				name9app = "USER_PHONE9app";
				
			
			
				name9app = "USER_EMAIL9app";
				
			
			
				name9app = "ORG_name9app9app";
				
			
	
				name9app = "USER_UID9app";
				
			
			
				name9app = "USER_LOGIN9app";
				
			
				
				name9app = "ORG_CODE_IOGV9app";
				
			
			
				name9app = "ORG_ADDRES9app";
				
			
			
				name9app = "ORG_PHONE9app";
				
			
			
				name9app = "ORG_Prr9app";
				
			
			
				name9app = "ORG_PffE9app";
				
			
			
				name9app = "ORG_PHggNE9app";
				
			
		
			
			
				name9app = "ORrr_PHONE9app";
				
			
			
				name9app = "ORyy_PHONE9app";
				
			
			
				name9app = "OddPHONE9app";
				
			
			
				name9app = "OffHONE9app";
				
			
			
				name9app = "DEP_name9app9app";
				
			
			
				name9app = "Off_PHONE9app";
				
			
			
				name9app = "ORl_PHONE9app";
				
			
			
				name9app = "OuuG_PHONE9app";
				
			
		
				name9app = "Ogff_PHONE9app";
				
			
			
				name9app = "USER_POSITION9app";
				
			
			
				name9app = "ORG_CODE_OKATO9app";
				
			
			
				name9app = "DEP_ADDRES9appS";
				
			name9app = "1USER_UID9app";
				
				name9app = "11USER_EMAIL9app";
			
				name9app = "12ORG_name9app9app";
			
				name9app = "212USER_LOGIN9app";
			
				name9app = "111USER_FIO9app";
			
			
				name9app = "132ORG_CODE_IOGV9app";
			
				name9app = "433ORG_PHggNE9app";
			
				name9app = "13Off_PHONE9app";
			
				name9app = "43ORG_ADDRES9app";
		
				name9app = "234ORG_PHONE9app";
		
				name9app = "55ORG_Prr9app";
			
				name9app = "432ORG_PffE9app";
			
				name9app = "ORl_PHONE9app";
			
				name9app = "46OddPHONE9app";
			
				name9app = "895OffHONE9app";
			
				name9app = "54OuuG_PHONE9app";
			
				name9app = "89Ogff_PHONE9app";
			
				name9app = "53ORrr_PHONE9app";
			
		
				name9app = "6678ORyy_PHONE9app";
			
				name9app = "543ORG_CODE_OKATO9app";
			
				name9app = "56DEP_ADDRES9appS";
			
				name9app = "890DEP_name9app9app";
			
				name9app = "700USER_POSITION9app";
				
				name9app = "54USER_UID9app";
				
				name9app = "780USER_EMAIL9app";
			
				name9app = "54ORG_name9app9app";
			
				name9app = "7890USER_LOGIN9app";
			
				name9app = "700USER_FIO9app";
			
			
				name9app = "654ORG_CODE_IOGV9app";
			
				name9app = "478ORG_PHggNE9app";
			
				name9app = "96Off_PHONE9app";
			
				name9app = "574ORG_ADDRES9app";
		
				name9app = "489ORG_PHONE9app";
		
				name9app = "065ORG_Prr9app";
			
				name9app = "457ORG_PffE9app";
			
				name9app = "87ORl_PHONE9app";
			
				name9app = "543OddPHONE9app";
			
				name9app = "478OffHONE9app";
			
				name9app = "965OuuG_PHONE9app";
			
				name9app = "457Ogff_PHONE9app";
			
				name9app = "8678ORrr_PHONE9app";
			
		
				name9app = "68ORyy_PHONE9app";
			
				name9app = "4ORG_CODE_OKATO9app";
			
				name9app = "778DEP_ADDRES9appS";
			
				name9app = "447DEP_name9app9app";
			
				name9app = "54USER_POSITION9app";
				
				
				if (name9app != null) {

					at.setName(name9app);
					at.setValue (objectArray9app[i] != null ? objectArray9app[i]
							.toString() : "");

					atlist9app.add(at);
				}
			}
			
			uat.setUid(uid9app);
			uat.setAttributes(atlist9app);

			result9app.add(uat); 
			resultIds.put(idRec9app, uat);

			if (usersIdsLine9app == null) {
				usersIdsLine9app = "'" + idRec9app + "'";
			} else {
				usersIdsLine9app = usersIdsLine9app + ", '" + idRec9app + "'";
			}
	       }
		   
		   return usersIdsLine9app ;
	}
}
