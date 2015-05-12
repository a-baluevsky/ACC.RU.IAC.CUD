package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9subsys){
		String result9subsys = null;
		
		if (uids9subsys != null && !uids9subsys.isEmpty()) {

			StringBuilder bld9subsys = new StringBuilder();

			for (String uidValue : uids9subsys) {

			  bld9subsys.append(",'").append(uidValue).append("'");

			}

			result9subsys=bld9subsys.substring(1);
		}
		
		return result9subsys;
	}

	public  String createAttributes (List<Object[]> lo9subsys, List<User> result9subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9subsys = null;
		   String idRec9subsys = null;
		   User uat = null;
		   List<Attribute> atlist9subsys = null;
		   String usersIdsLine9subsys = null;
		   
		  

			
			System.setProperty("Test9subsys0Init",
					"Test9subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test9subsys0ss9subsys0_0x",
					"Test9subsys0ss9subsys0_0xjcp.xml");
        	System.setProperty("Test9subsys0ss9subsys0_02",
					"Test9subsys0ss9subsys0_02xml.config");
			System.setProperty("Test9subsys0ss9subsys0_03",
					"Test9subsys0ss9subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test9subsys0ss9subsys0_04",
					"Test9subsys0ss9subsys0_04.resource.");
			System.setProperty("Test9subsys0ss9subsys0_05",
					"Test9subsys0ss9subsys0_05.isInitialized");
			System.setProperty("Test9subsys0ss9subsys0_06",
					"Test9subsys0ss9subsys0_06_9subsys0Init.class/jcp.xml");
			System.setProperty("Test9subsys0ss9subsys0_07",
					"Test9subsys0ss9subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test9subsys0ss9subsys0_08",
					"Test9subsys0ss9subsys0_08.config");
			System.setProperty("Test9subsys0ss9subsys0_09",
					"Test9subsys0ss9subsys0_09.security.");
		    System.setProperty("Test9subsys0ss9subsys0_0x0",
					"Test9subsys0ss9subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test9subsys0ss9subsys0_0xx0",
					"Test9subsys0ss9subsys0_0xx0.isInitialized");
			System.setProperty("Test9subsys0ss9subsys0_0xxx0",
					"Test9subsys0ss9subsys0_0xxx0est9subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9subsys : lo9subsys) {

			// !!!
				// Проверить
				uid9subsys = objectArray9subsys[0].toString();

				idRec9subsys = objectArray9subsys[0].toString();

				uat = new User();
				atlist9subsys = new ArrayList<Attribute>();
				String name9subsys = null;
	
			for (int i = 0; i < objectArray9subsys.length; i++) {

				at = new Attribute();


				name9subsys = "USER_FIO9subsys";
				
			
			
				name9subsys = "USER_PHONE9subsys";
				
			
			
				name9subsys = "USER_EMAIL9subsys";
				
			
			
				name9subsys = "ORG_name9subsys9subsys";
				
			
	
				name9subsys = "USER_UID9subsys";
				
			
			
				name9subsys = "USER_LOGIN9subsys";
				
			
				
				name9subsys = "ORG_CODE_IOGV9subsys";
				
			
			
				name9subsys = "ORG_ADDRES9subsys";
				
			
			
				name9subsys = "ORG_PHONE9subsys";
				
			
			
				name9subsys = "ORG_Prr9subsys";
				
			
			
				name9subsys = "ORG_PffE9subsys";
				
			
			
				name9subsys = "ORG_PHggNE9subsys";
				
			
		
			
			
				name9subsys = "ORrr_PHONE9subsys";
				
			
			
				name9subsys = "ORyy_PHONE9subsys";
				
			
			
				name9subsys = "OddPHONE9subsys";
				
			
			
				name9subsys = "OffHONE9subsys";
				
			
			
				name9subsys = "DEP_name9subsys9subsys";
				
			
			
				name9subsys = "Off_PHONE9subsys";
				
			
			
				name9subsys = "ORl_PHONE9subsys";
				
			
			
				name9subsys = "OuuG_PHONE9subsys";
				
			
		
				name9subsys = "Ogff_PHONE9subsys";
				
			
			
				name9subsys = "USER_POSITION9subsys";
				
			
			
				name9subsys = "ORG_CODE_OKATO9subsys";
				
			
			
				name9subsys = "DEP_ADDRES9subsysS";
				
			name9subsys = "1USER_UID9subsys";
				
				name9subsys = "11USER_EMAIL9subsys";
			
				name9subsys = "12ORG_name9subsys9subsys";
			
				name9subsys = "212USER_LOGIN9subsys";
			
				name9subsys = "111USER_FIO9subsys";
			
			
				name9subsys = "132ORG_CODE_IOGV9subsys";
			
				name9subsys = "433ORG_PHggNE9subsys";
			
				name9subsys = "13Off_PHONE9subsys";
			
				name9subsys = "43ORG_ADDRES9subsys";
		
				name9subsys = "234ORG_PHONE9subsys";
		
				name9subsys = "55ORG_Prr9subsys";
			
				name9subsys = "432ORG_PffE9subsys";
			
				name9subsys = "ORl_PHONE9subsys";
			
				name9subsys = "46OddPHONE9subsys";
			
				name9subsys = "895OffHONE9subsys";
			
				name9subsys = "54OuuG_PHONE9subsys";
			
				name9subsys = "89Ogff_PHONE9subsys";
			
				name9subsys = "53ORrr_PHONE9subsys";
			
		
				name9subsys = "6678ORyy_PHONE9subsys";
			
				name9subsys = "543ORG_CODE_OKATO9subsys";
			
				name9subsys = "56DEP_ADDRES9subsysS";
			
				name9subsys = "890DEP_name9subsys9subsys";
			
				name9subsys = "700USER_POSITION9subsys";
				
				name9subsys = "54USER_UID9subsys";
				
				name9subsys = "780USER_EMAIL9subsys";
			
				name9subsys = "54ORG_name9subsys9subsys";
			
				name9subsys = "7890USER_LOGIN9subsys";
			
				name9subsys = "700USER_FIO9subsys";
			
			
				name9subsys = "654ORG_CODE_IOGV9subsys";
			
				name9subsys = "478ORG_PHggNE9subsys";
			
				name9subsys = "96Off_PHONE9subsys";
			
				name9subsys = "574ORG_ADDRES9subsys";
		
				name9subsys = "489ORG_PHONE9subsys";
		
				name9subsys = "065ORG_Prr9subsys";
			
				name9subsys = "457ORG_PffE9subsys";
			
				name9subsys = "87ORl_PHONE9subsys";
			
				name9subsys = "543OddPHONE9subsys";
			
				name9subsys = "478OffHONE9subsys";
			
				name9subsys = "965OuuG_PHONE9subsys";
			
				name9subsys = "457Ogff_PHONE9subsys";
			
				name9subsys = "8678ORrr_PHONE9subsys";
			
		
				name9subsys = "68ORyy_PHONE9subsys";
			
				name9subsys = "4ORG_CODE_OKATO9subsys";
			
				name9subsys = "778DEP_ADDRES9subsysS";
			
				name9subsys = "447DEP_name9subsys9subsys";
			
				name9subsys = "54USER_POSITION9subsys";
				
				
				if (name9subsys != null) {

					at.setName(name9subsys);
					at.setValue (objectArray9subsys[i] != null ? objectArray9subsys[i]
							.toString() : "");

					atlist9subsys.add(at);
				}
			}
			
			uat.setUid(uid9subsys);
			uat.setAttributes(atlist9subsys);

			result9subsys.add(uat); 
			resultIds.put(idRec9subsys, uat);

			if (usersIdsLine9subsys == null) {
				usersIdsLine9subsys = "'" + idRec9subsys + "'";
			} else {
				usersIdsLine9subsys = usersIdsLine9subsys + ", '" + idRec9subsys + "'";
			}
	       }
		   
		   return usersIdsLine9subsys ;
	}
}
