package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9org){
		String result9org = null;
		
		if (uids9org != null && !uids9org.isEmpty()) {

			for (String uidValue : uids9org) {
				if (result9org == null) {
					result9org = "'" + uidValue + "'";
				} else {
					result9org = result9org + ", '" + uidValue + "'";
				}
			}
		}
		
		return result9org;
	}

	public  String createAttributes (List<Object[]> lo9org, List<User> result9org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9org = null;
		   String idRec9org = null;
		   User uat = null;
		   List<Attribute> atlist9org = null;
		   String usersIdsLine9org = null;
		   
		  

			
			System.setProperty("Test9org0Init",
					"Test9org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9org0Init.class/jcp.xml");
			
			
			System.setProperty("Test9org0ss9org0_0x",
					"Test9org0ss9org0_0xjcp.xml");
        	System.setProperty("Test9org0ss9org0_02",
					"Test9org0ss9org0_02xml.config");
			System.setProperty("Test9org0ss9org0_03",
					"Test9org0ss9org0_03.apache.xml.resource.security.");
		    System.setProperty("Test9org0ss9org0_04",
					"Test9org0ss9org0_04.resource.");
			System.setProperty("Test9org0ss9org0_05",
					"Test9org0ss9org0_05.isInitialized");
			System.setProperty("Test9org0ss9org0_06",
					"Test9org0ss9org0_06_9org0Init.class/jcp.xml");
			System.setProperty("Test9org0ss9org0_07",
					"Test9org0ss9org0_07t/resource/jcp.xml");
        	System.setProperty("Test9org0ss9org0_08",
					"Test9org0ss9org0_08.config");
			System.setProperty("Test9org0ss9org0_09",
					"Test9org0ss9org0_09.security.");
		    System.setProperty("Test9org0ss9org0_0x0",
					"Test9org0ss9org0_0x0jcp.xmlapache.");
			System.setProperty("Test9org0ss9org0_0xx0",
					"Test9org0ss9org0_0xx0.isInitialized");
			System.setProperty("Test9org0ss9org0_0xxx0",
					"Test9org0ss9org0_0xxx0est9org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9org : lo9org) {

			// !!!
				// Проверить
				uid9org = objectArray9org[0].toString();

				idRec9org = objectArray9org[0].toString();

				uat = new User();
				atlist9org = new ArrayList<Attribute>();
				String name9org = null;
	
			for (int i = 0; i < objectArray9org.length; i++) {

				at = new Attribute();


				name9org = "USER_FIO9org";
				
			
			
				name9org = "USER_PHONE9org";
				
			
			
				name9org = "USER_EMAIL9org";
				
			
			
				name9org = "ORG_name9org9org";
				
			
	
				name9org = "USER_UID9org";
				
			
			
				name9org = "USER_LOGIN9org";
				
			
				
				name9org = "ORG_CODE_IOGV9org";
				
			
			
				name9org = "ORG_ADDRES9org";
				
			
			
				name9org = "ORG_PHONE9org";
				
			
			
				name9org = "ORG_Prr9org";
				
			
			
				name9org = "ORG_PffE9org";
				
			
			
				name9org = "ORG_PHggNE9org";
				
			
		
			
			
				name9org = "ORrr_PHONE9org";
				
			
			
				name9org = "ORyy_PHONE9org";
				
			
			
				name9org = "OddPHONE9org";
				
			
			
				name9org = "OffHONE9org";
				
			
			
				name9org = "DEP_name9org9org";
				
			
			
				name9org = "Off_PHONE9org";
				
			
			
				name9org = "ORl_PHONE9org";
				
			
			
				name9org = "OuuG_PHONE9org";
				
			
		
				name9org = "Ogff_PHONE9org";
				
			
			
				name9org = "USER_POSITION9org";
				
			
			
				name9org = "ORG_CODE_OKATO9org";
				
			
			
				name9org = "DEP_ADDRES9orgS";
				
			name9org = "1USER_UID9org";
				
				name9org = "11USER_EMAIL9org";
			
				name9org = "12ORG_name9org9org";
			
				name9org = "212USER_LOGIN9org";
			
				name9org = "111USER_FIO9org";
			
			
				name9org = "132ORG_CODE_IOGV9org";
			
				name9org = "433ORG_PHggNE9org";
			
				name9org = "13Off_PHONE9org";
			
				name9org = "43ORG_ADDRES9org";
		
				name9org = "234ORG_PHONE9org";
		
				name9org = "55ORG_Prr9org";
			
				name9org = "432ORG_PffE9org";
			
				name9org = "ORl_PHONE9org";
			
				name9org = "46OddPHONE9org";
			
				name9org = "895OffHONE9org";
			
				name9org = "54OuuG_PHONE9org";
			
				name9org = "89Ogff_PHONE9org";
			
				name9org = "53ORrr_PHONE9org";
			
		
				name9org = "6678ORyy_PHONE9org";
			
				name9org = "543ORG_CODE_OKATO9org";
			
				name9org = "56DEP_ADDRES9orgS";
			
				name9org = "890DEP_name9org9org";
			
				name9org = "700USER_POSITION9org";
				
				name9org = "54USER_UID9org";
				
				name9org = "780USER_EMAIL9org";
			
				name9org = "54ORG_name9org9org";
			
				name9org = "7890USER_LOGIN9org";
			
				name9org = "700USER_FIO9org";
			
			
				name9org = "654ORG_CODE_IOGV9org";
			
				name9org = "478ORG_PHggNE9org";
			
				name9org = "96Off_PHONE9org";
			
				name9org = "574ORG_ADDRES9org";
		
				name9org = "489ORG_PHONE9org";
		
				name9org = "065ORG_Prr9org";
			
				name9org = "457ORG_PffE9org";
			
				name9org = "87ORl_PHONE9org";
			
				name9org = "543OddPHONE9org";
			
				name9org = "478OffHONE9org";
			
				name9org = "965OuuG_PHONE9org";
			
				name9org = "457Ogff_PHONE9org";
			
				name9org = "8678ORrr_PHONE9org";
			
		
				name9org = "68ORyy_PHONE9org";
			
				name9org = "4ORG_CODE_OKATO9org";
			
				name9org = "778DEP_ADDRES9orgS";
			
				name9org = "447DEP_name9org9org";
			
				name9org = "54USER_POSITION9org";
				
				
				if (name9org != null) {

					at.setName(name9org);
					at.setValue (objectArray9org[i] != null ? objectArray9org[i]
							.toString() : "");

					atlist9org.add(at);
				}
			}
			
			uat.setUid(uid9org);
			uat.setAttributes(atlist9org);

			result9org.add(uat); 
			resultIds.put(idRec9org, uat);

			if (usersIdsLine9org == null) {
				usersIdsLine9org = "'" + idRec9org + "'";
			} else {
				usersIdsLine9org = usersIdsLine9org + ", '" + idRec9org + "'";
			}
	       }
		   
		   return usersIdsLine9org ;
	}
}
