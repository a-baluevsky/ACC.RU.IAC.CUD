package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9setting){
		String result9setting = null;
		
		if (uids9setting != null && !uids9setting.isEmpty()) {

			StringBuilder bld9setting = new StringBuilder();

			for (String uidValue : uids9setting) {

			  bld9setting.append(",'").append(uidValue).append("'");

			}

			result9setting=bld9setting.substring(1);
		}
		
		return result9setting;
	}

	public  String createAttributes (List<Object[]> lo9setting, List<User> result9setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9setting = null;
		   String idRec9setting = null;
		   User uat = null;
		   List<Attribute> atlist9setting = null;
		   String usersIdsLine9setting = null;
		   
		  

			
			System.setProperty("Test9setting0Init",
					"Test9setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test9setting0ss9setting0_0x",
					"Test9setting0ss9setting0_0xjcp.xml");
        	System.setProperty("Test9setting0ss9setting0_02",
					"Test9setting0ss9setting0_02xml.config");
			System.setProperty("Test9setting0ss9setting0_03",
					"Test9setting0ss9setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test9setting0ss9setting0_04",
					"Test9setting0ss9setting0_04.resource.");
			System.setProperty("Test9setting0ss9setting0_05",
					"Test9setting0ss9setting0_05.isInitialized");
			System.setProperty("Test9setting0ss9setting0_06",
					"Test9setting0ss9setting0_06_9setting0Init.class/jcp.xml");
			System.setProperty("Test9setting0ss9setting0_07",
					"Test9setting0ss9setting0_07t/resource/jcp.xml");
        	System.setProperty("Test9setting0ss9setting0_08",
					"Test9setting0ss9setting0_08.config");
			System.setProperty("Test9setting0ss9setting0_09",
					"Test9setting0ss9setting0_09.security.");
		    System.setProperty("Test9setting0ss9setting0_0x0",
					"Test9setting0ss9setting0_0x0jcp.xmlapache.");
			System.setProperty("Test9setting0ss9setting0_0xx0",
					"Test9setting0ss9setting0_0xx0.isInitialized");
			System.setProperty("Test9setting0ss9setting0_0xxx0",
					"Test9setting0ss9setting0_0xxx0est9setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9setting : lo9setting) {

			// !!!
				// Проверить
				uid9setting = objectArray9setting[0].toString();

				idRec9setting = objectArray9setting[0].toString();

				uat = new User();
				atlist9setting = new ArrayList<Attribute>();
				String name9setting = null;
	
			for (int i = 0; i < objectArray9setting.length; i++) {

				at = new Attribute();


				name9setting = "USER_FIO9setting";
				
			
			
				name9setting = "USER_PHONE9setting";
				
			
			
				name9setting = "USER_EMAIL9setting";
				
			
			
				name9setting = "ORG_name9setting9setting";
				
			
	
				name9setting = "USER_UID9setting";
				
			
			
				name9setting = "USER_LOGIN9setting";
				
			
				
				name9setting = "ORG_CODE_IOGV9setting";
				
			
			
				name9setting = "ORG_ADDRES9setting";
				
			
			
				name9setting = "ORG_PHONE9setting";
				
			
			
				name9setting = "ORG_Prr9setting";
				
			
			
				name9setting = "ORG_PffE9setting";
				
			
			
				name9setting = "ORG_PHggNE9setting";
				
			
		
			
			
				name9setting = "ORrr_PHONE9setting";
				
			
			
				name9setting = "ORyy_PHONE9setting";
				
			
			
				name9setting = "OddPHONE9setting";
				
			
			
				name9setting = "OffHONE9setting";
				
			
			
				name9setting = "DEP_name9setting9setting";
				
			
			
				name9setting = "Off_PHONE9setting";
				
			
			
				name9setting = "ORl_PHONE9setting";
				
			
			
				name9setting = "OuuG_PHONE9setting";
				
			
		
				name9setting = "Ogff_PHONE9setting";
				
			
			
				name9setting = "USER_POSITION9setting";
				
			
			
				name9setting = "ORG_CODE_OKATO9setting";
				
			
			
				name9setting = "DEP_ADDRES9settingS";
				
			name9setting = "1USER_UID9setting";
				
				name9setting = "11USER_EMAIL9setting";
			
				name9setting = "12ORG_name9setting9setting";
			
				name9setting = "212USER_LOGIN9setting";
			
				name9setting = "111USER_FIO9setting";
			
			
				name9setting = "132ORG_CODE_IOGV9setting";
			
				name9setting = "433ORG_PHggNE9setting";
			
				name9setting = "13Off_PHONE9setting";
			
				name9setting = "43ORG_ADDRES9setting";
		
				name9setting = "234ORG_PHONE9setting";
		
				name9setting = "55ORG_Prr9setting";
			
				name9setting = "432ORG_PffE9setting";
			
				name9setting = "ORl_PHONE9setting";
			
				name9setting = "46OddPHONE9setting";
			
				name9setting = "895OffHONE9setting";
			
				name9setting = "54OuuG_PHONE9setting";
			
				name9setting = "89Ogff_PHONE9setting";
			
				name9setting = "53ORrr_PHONE9setting";
			
		
				name9setting = "6678ORyy_PHONE9setting";
			
				name9setting = "543ORG_CODE_OKATO9setting";
			
				name9setting = "56DEP_ADDRES9settingS";
			
				name9setting = "890DEP_name9setting9setting";
			
				name9setting = "700USER_POSITION9setting";
				
				name9setting = "54USER_UID9setting";
				
				name9setting = "780USER_EMAIL9setting";
			
				name9setting = "54ORG_name9setting9setting";
			
				name9setting = "7890USER_LOGIN9setting";
			
				name9setting = "700USER_FIO9setting";
			
			
				name9setting = "654ORG_CODE_IOGV9setting";
			
				name9setting = "478ORG_PHggNE9setting";
			
				name9setting = "96Off_PHONE9setting";
			
				name9setting = "574ORG_ADDRES9setting";
		
				name9setting = "489ORG_PHONE9setting";
		
				name9setting = "065ORG_Prr9setting";
			
				name9setting = "457ORG_PffE9setting";
			
				name9setting = "87ORl_PHONE9setting";
			
				name9setting = "543OddPHONE9setting";
			
				name9setting = "478OffHONE9setting";
			
				name9setting = "965OuuG_PHONE9setting";
			
				name9setting = "457Ogff_PHONE9setting";
			
				name9setting = "8678ORrr_PHONE9setting";
			
		
				name9setting = "68ORyy_PHONE9setting";
			
				name9setting = "4ORG_CODE_OKATO9setting";
			
				name9setting = "778DEP_ADDRES9settingS";
			
				name9setting = "447DEP_name9setting9setting";
			
				name9setting = "54USER_POSITION9setting";
				
				
				if (name9setting != null) {

					at.setName(name9setting);
					at.setValue (objectArray9setting[i] != null ? objectArray9setting[i]
							.toString() : "");

					atlist9setting.add(at);
				}
			}
			
			uat.setUid(uid9setting);
			uat.setAttributes(atlist9setting);

			result9setting.add(uat); 
			resultIds.put(idRec9setting, uat);

			if (usersIdsLine9setting == null) {
				usersIdsLine9setting = "'" + idRec9setting + "'";
			} else {
				usersIdsLine9setting = usersIdsLine9setting + ", '" + idRec9setting + "'";
			}
	       }
		   
		   return usersIdsLine9setting ;
	}
}
