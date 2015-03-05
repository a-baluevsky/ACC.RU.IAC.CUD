package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9classif){
		String result9classif = null;
		
		if (uids9classif != null && !uids9classif.isEmpty()) {

			for (String uidValue : uids9classif) {
				if (result9classif == null) {
					result9classif = "'" + uidValue + "'";
				} else {
					result9classif = result9classif + ", '" + uidValue + "'";
				}
			}
		}
		
		return result9classif;
	}

	public  String createAttributes (List<Object[]> lo9classif, List<User> result9classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9classif = null;
		   String idRec9classif = null;
		   User uat = null;
		   List<Attribute> atlist9classif = null;
		   String usersIdsLine9classif = null;
		   
		  

			
			System.setProperty("Test9classif0Init",
					"Test9classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test9classif0ss9classif0_0x",
					"Test9classif0ss9classif0_0xjcp.xml");
        	System.setProperty("Test9classif0ss9classif0_02",
					"Test9classif0ss9classif0_02xml.config");
			System.setProperty("Test9classif0ss9classif0_03",
					"Test9classif0ss9classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test9classif0ss9classif0_04",
					"Test9classif0ss9classif0_04.resource.");
			System.setProperty("Test9classif0ss9classif0_05",
					"Test9classif0ss9classif0_05.isInitialized");
			System.setProperty("Test9classif0ss9classif0_06",
					"Test9classif0ss9classif0_06_9classif0Init.class/jcp.xml");
			System.setProperty("Test9classif0ss9classif0_07",
					"Test9classif0ss9classif0_07t/resource/jcp.xml");
        	System.setProperty("Test9classif0ss9classif0_08",
					"Test9classif0ss9classif0_08.config");
			System.setProperty("Test9classif0ss9classif0_09",
					"Test9classif0ss9classif0_09.security.");
		    System.setProperty("Test9classif0ss9classif0_0x0",
					"Test9classif0ss9classif0_0x0jcp.xmlapache.");
			System.setProperty("Test9classif0ss9classif0_0xx0",
					"Test9classif0ss9classif0_0xx0.isInitialized");
			System.setProperty("Test9classif0ss9classif0_0xxx0",
					"Test9classif0ss9classif0_0xxx0est9classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9classif : lo9classif) {

			// !!!
				// Проверить
				uid9classif = objectArray9classif[0].toString();

				idRec9classif = objectArray9classif[0].toString();

				uat = new User();
				atlist9classif = new ArrayList<Attribute>();
				String name9classif = null;
	
			for (int i = 0; i < objectArray9classif.length; i++) {

				at = new Attribute();


				name9classif = "USER_FIO9classif";
				
			
			
				name9classif = "USER_PHONE9classif";
				
			
			
				name9classif = "USER_EMAIL9classif";
				
			
			
				name9classif = "ORG_name9classif9classif";
				
			
	
				name9classif = "USER_UID9classif";
				
			
			
				name9classif = "USER_LOGIN9classif";
				
			
				
				name9classif = "ORG_CODE_IOGV9classif";
				
			
			
				name9classif = "ORG_ADDRES9classif";
				
			
			
				name9classif = "ORG_PHONE9classif";
				
			
			
				name9classif = "ORG_Prr9classif";
				
			
			
				name9classif = "ORG_PffE9classif";
				
			
			
				name9classif = "ORG_PHggNE9classif";
				
			
		
			
			
				name9classif = "ORrr_PHONE9classif";
				
			
			
				name9classif = "ORyy_PHONE9classif";
				
			
			
				name9classif = "OddPHONE9classif";
				
			
			
				name9classif = "OffHONE9classif";
				
			
			
				name9classif = "DEP_name9classif9classif";
				
			
			
				name9classif = "Off_PHONE9classif";
				
			
			
				name9classif = "ORl_PHONE9classif";
				
			
			
				name9classif = "OuuG_PHONE9classif";
				
			
		
				name9classif = "Ogff_PHONE9classif";
				
			
			
				name9classif = "USER_POSITION9classif";
				
			
			
				name9classif = "ORG_CODE_OKATO9classif";
				
			
			
				name9classif = "DEP_ADDRES9classifS";
				
			name9classif = "1USER_UID9classif";
				
				name9classif = "11USER_EMAIL9classif";
			
				name9classif = "12ORG_name9classif9classif";
			
				name9classif = "212USER_LOGIN9classif";
			
				name9classif = "111USER_FIO9classif";
			
			
				name9classif = "132ORG_CODE_IOGV9classif";
			
				name9classif = "433ORG_PHggNE9classif";
			
				name9classif = "13Off_PHONE9classif";
			
				name9classif = "43ORG_ADDRES9classif";
		
				name9classif = "234ORG_PHONE9classif";
		
				name9classif = "55ORG_Prr9classif";
			
				name9classif = "432ORG_PffE9classif";
			
				name9classif = "ORl_PHONE9classif";
			
				name9classif = "46OddPHONE9classif";
			
				name9classif = "895OffHONE9classif";
			
				name9classif = "54OuuG_PHONE9classif";
			
				name9classif = "89Ogff_PHONE9classif";
			
				name9classif = "53ORrr_PHONE9classif";
			
		
				name9classif = "6678ORyy_PHONE9classif";
			
				name9classif = "543ORG_CODE_OKATO9classif";
			
				name9classif = "56DEP_ADDRES9classifS";
			
				name9classif = "890DEP_name9classif9classif";
			
				name9classif = "700USER_POSITION9classif";
				
				name9classif = "54USER_UID9classif";
				
				name9classif = "780USER_EMAIL9classif";
			
				name9classif = "54ORG_name9classif9classif";
			
				name9classif = "7890USER_LOGIN9classif";
			
				name9classif = "700USER_FIO9classif";
			
			
				name9classif = "654ORG_CODE_IOGV9classif";
			
				name9classif = "478ORG_PHggNE9classif";
			
				name9classif = "96Off_PHONE9classif";
			
				name9classif = "574ORG_ADDRES9classif";
		
				name9classif = "489ORG_PHONE9classif";
		
				name9classif = "065ORG_Prr9classif";
			
				name9classif = "457ORG_PffE9classif";
			
				name9classif = "87ORl_PHONE9classif";
			
				name9classif = "543OddPHONE9classif";
			
				name9classif = "478OffHONE9classif";
			
				name9classif = "965OuuG_PHONE9classif";
			
				name9classif = "457Ogff_PHONE9classif";
			
				name9classif = "8678ORrr_PHONE9classif";
			
		
				name9classif = "68ORyy_PHONE9classif";
			
				name9classif = "4ORG_CODE_OKATO9classif";
			
				name9classif = "778DEP_ADDRES9classifS";
			
				name9classif = "447DEP_name9classif9classif";
			
				name9classif = "54USER_POSITION9classif";
				
				
				if (name9classif != null) {

					at.setName(name9classif);
					at.setValue (objectArray9classif[i] != null ? objectArray9classif[i]
							.toString() : "");

					atlist9classif.add(at);
				}
			}
			
			uat.setUid(uid9classif);
			uat.setAttributes(atlist9classif);

			result9classif.add(uat); 
			resultIds.put(idRec9classif, uat);

			if (usersIdsLine9classif == null) {
				usersIdsLine9classif = "'" + idRec9classif + "'";
			} else {
				usersIdsLine9classif = usersIdsLine9classif + ", '" + idRec9classif + "'";
			}
	       }
		   
		   return usersIdsLine9classif ;
	}
}
