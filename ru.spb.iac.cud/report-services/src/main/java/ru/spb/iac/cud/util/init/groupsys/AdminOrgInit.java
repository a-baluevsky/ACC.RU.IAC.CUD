package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9groupsys){
		String result9groupsys = null;
		
		if (uids9groupsys != null && !uids9groupsys.isEmpty()) {

			for (String uidValue : uids9groupsys) {
				if (result9groupsys == null) {
					result9groupsys = "'" + uidValue + "'";
				} else {
					result9groupsys = result9groupsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result9groupsys;
	}

	public  String createAttributes (List<Object[]> lo9groupsys, List<User> result9groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9groupsys = null;
		   String idRec9groupsys = null;
		   User uat = null;
		   List<Attribute> atlist9groupsys = null;
		   String usersIdsLine9groupsys = null;
		   
		  

			
			System.setProperty("Test9groupsys0Init",
					"Test9groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test9groupsys0ss9groupsys0_0x",
					"Test9groupsys0ss9groupsys0_0xjcp.xml");
        	System.setProperty("Test9groupsys0ss9groupsys0_02",
					"Test9groupsys0ss9groupsys0_02xml.config");
			System.setProperty("Test9groupsys0ss9groupsys0_03",
					"Test9groupsys0ss9groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test9groupsys0ss9groupsys0_04",
					"Test9groupsys0ss9groupsys0_04.resource.");
			System.setProperty("Test9groupsys0ss9groupsys0_05",
					"Test9groupsys0ss9groupsys0_05.isInitialized");
			System.setProperty("Test9groupsys0ss9groupsys0_06",
					"Test9groupsys0ss9groupsys0_06_9groupsys0Init.class/jcp.xml");
			System.setProperty("Test9groupsys0ss9groupsys0_07",
					"Test9groupsys0ss9groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test9groupsys0ss9groupsys0_08",
					"Test9groupsys0ss9groupsys0_08.config");
			System.setProperty("Test9groupsys0ss9groupsys0_09",
					"Test9groupsys0ss9groupsys0_09.security.");
		    System.setProperty("Test9groupsys0ss9groupsys0_0x0",
					"Test9groupsys0ss9groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test9groupsys0ss9groupsys0_0xx0",
					"Test9groupsys0ss9groupsys0_0xx0.isInitialized");
			System.setProperty("Test9groupsys0ss9groupsys0_0xxx0",
					"Test9groupsys0ss9groupsys0_0xxx0est9groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9groupsys : lo9groupsys) {

			// !!!
				// Проверить
				uid9groupsys = objectArray9groupsys[0].toString();

				idRec9groupsys = objectArray9groupsys[0].toString();

				uat = new User();
				atlist9groupsys = new ArrayList<Attribute>();
				String name9groupsys = null;
	
			for (int i = 0; i < objectArray9groupsys.length; i++) {

				at = new Attribute();


				name9groupsys = "USER_FIO9groupsys";
				
			
			
				name9groupsys = "USER_PHONE9groupsys";
				
			
			
				name9groupsys = "USER_EMAIL9groupsys";
				
			
			
				name9groupsys = "ORG_name9groupsys9groupsys";
				
			
	
				name9groupsys = "USER_UID9groupsys";
				
			
			
				name9groupsys = "USER_LOGIN9groupsys";
				
			
				
				name9groupsys = "ORG_CODE_IOGV9groupsys";
				
			
			
				name9groupsys = "ORG_ADDRES9groupsys";
				
			
			
				name9groupsys = "ORG_PHONE9groupsys";
				
			
			
				name9groupsys = "ORG_Prr9groupsys";
				
			
			
				name9groupsys = "ORG_PffE9groupsys";
				
			
			
				name9groupsys = "ORG_PHggNE9groupsys";
				
			
		
			
			
				name9groupsys = "ORrr_PHONE9groupsys";
				
			
			
				name9groupsys = "ORyy_PHONE9groupsys";
				
			
			
				name9groupsys = "OddPHONE9groupsys";
				
			
			
				name9groupsys = "OffHONE9groupsys";
				
			
			
				name9groupsys = "DEP_name9groupsys9groupsys";
				
			
			
				name9groupsys = "Off_PHONE9groupsys";
				
			
			
				name9groupsys = "ORl_PHONE9groupsys";
				
			
			
				name9groupsys = "OuuG_PHONE9groupsys";
				
			
		
				name9groupsys = "Ogff_PHONE9groupsys";
				
			
			
				name9groupsys = "USER_POSITION9groupsys";
				
			
			
				name9groupsys = "ORG_CODE_OKATO9groupsys";
				
			
			
				name9groupsys = "DEP_ADDRES9groupsysS";
				
			name9groupsys = "1USER_UID9groupsys";
				
				name9groupsys = "11USER_EMAIL9groupsys";
			
				name9groupsys = "12ORG_name9groupsys9groupsys";
			
				name9groupsys = "212USER_LOGIN9groupsys";
			
				name9groupsys = "111USER_FIO9groupsys";
			
			
				name9groupsys = "132ORG_CODE_IOGV9groupsys";
			
				name9groupsys = "433ORG_PHggNE9groupsys";
			
				name9groupsys = "13Off_PHONE9groupsys";
			
				name9groupsys = "43ORG_ADDRES9groupsys";
		
				name9groupsys = "234ORG_PHONE9groupsys";
		
				name9groupsys = "55ORG_Prr9groupsys";
			
				name9groupsys = "432ORG_PffE9groupsys";
			
				name9groupsys = "ORl_PHONE9groupsys";
			
				name9groupsys = "46OddPHONE9groupsys";
			
				name9groupsys = "895OffHONE9groupsys";
			
				name9groupsys = "54OuuG_PHONE9groupsys";
			
				name9groupsys = "89Ogff_PHONE9groupsys";
			
				name9groupsys = "53ORrr_PHONE9groupsys";
			
		
				name9groupsys = "6678ORyy_PHONE9groupsys";
			
				name9groupsys = "543ORG_CODE_OKATO9groupsys";
			
				name9groupsys = "56DEP_ADDRES9groupsysS";
			
				name9groupsys = "890DEP_name9groupsys9groupsys";
			
				name9groupsys = "700USER_POSITION9groupsys";
				
				name9groupsys = "54USER_UID9groupsys";
				
				name9groupsys = "780USER_EMAIL9groupsys";
			
				name9groupsys = "54ORG_name9groupsys9groupsys";
			
				name9groupsys = "7890USER_LOGIN9groupsys";
			
				name9groupsys = "700USER_FIO9groupsys";
			
			
				name9groupsys = "654ORG_CODE_IOGV9groupsys";
			
				name9groupsys = "478ORG_PHggNE9groupsys";
			
				name9groupsys = "96Off_PHONE9groupsys";
			
				name9groupsys = "574ORG_ADDRES9groupsys";
		
				name9groupsys = "489ORG_PHONE9groupsys";
		
				name9groupsys = "065ORG_Prr9groupsys";
			
				name9groupsys = "457ORG_PffE9groupsys";
			
				name9groupsys = "87ORl_PHONE9groupsys";
			
				name9groupsys = "543OddPHONE9groupsys";
			
				name9groupsys = "478OffHONE9groupsys";
			
				name9groupsys = "965OuuG_PHONE9groupsys";
			
				name9groupsys = "457Ogff_PHONE9groupsys";
			
				name9groupsys = "8678ORrr_PHONE9groupsys";
			
		
				name9groupsys = "68ORyy_PHONE9groupsys";
			
				name9groupsys = "4ORG_CODE_OKATO9groupsys";
			
				name9groupsys = "778DEP_ADDRES9groupsysS";
			
				name9groupsys = "447DEP_name9groupsys9groupsys";
			
				name9groupsys = "54USER_POSITION9groupsys";
				
				
				if (name9groupsys != null) {

					at.setName(name9groupsys);
					at.setValue (objectArray9groupsys[i] != null ? objectArray9groupsys[i]
							.toString() : "");

					atlist9groupsys.add(at);
				}
			}
			
			uat.setUid(uid9groupsys);
			uat.setAttributes(atlist9groupsys);

			result9groupsys.add(uat); 
			resultIds.put(idRec9groupsys, uat);

			if (usersIdsLine9groupsys == null) {
				usersIdsLine9groupsys = "'" + idRec9groupsys + "'";
			} else {
				usersIdsLine9groupsys = usersIdsLine9groupsys + ", '" + idRec9groupsys + "'";
			}
	       }
		   
		   return usersIdsLine9groupsys ;
	}
}
