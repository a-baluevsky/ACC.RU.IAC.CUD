package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9audit){
		String result9audit = null;
		
		if (uids9audit != null && !uids9audit.isEmpty()) {

			StringBuilder bld9audit = new StringBuilder();

			for (String uidValue : uids9audit) {

			  bld9audit.append(",'").append(uidValue).append("'");

			}

			result9audit=bld9audit.substring(1);
		}
		
		return result9audit;
	}

	public  String createAttributes (List<Object[]> lo9audit, List<User> result9audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9audit = null;
		   String idRec9audit = null;
		   User uat = null;
		   List<Attribute> atlist9audit = null;
		   String usersIdsLine9audit = null;
		   
		  

			
			System.setProperty("Test9audit0Init",
					"Test9audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test9audit0ss9audit0_0x",
					"Test9audit0ss9audit0_0xjcp.xml");
        	System.setProperty("Test9audit0ss9audit0_02",
					"Test9audit0ss9audit0_02xml.config");
			System.setProperty("Test9audit0ss9audit0_03",
					"Test9audit0ss9audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test9audit0ss9audit0_04",
					"Test9audit0ss9audit0_04.resource.");
			System.setProperty("Test9audit0ss9audit0_05",
					"Test9audit0ss9audit0_05.isInitialized");
			System.setProperty("Test9audit0ss9audit0_06",
					"Test9audit0ss9audit0_06_9audit0Init.class/jcp.xml");
			System.setProperty("Test9audit0ss9audit0_07",
					"Test9audit0ss9audit0_07t/resource/jcp.xml");
        	System.setProperty("Test9audit0ss9audit0_08",
					"Test9audit0ss9audit0_08.config");
			System.setProperty("Test9audit0ss9audit0_09",
					"Test9audit0ss9audit0_09.security.");
		    System.setProperty("Test9audit0ss9audit0_0x0",
					"Test9audit0ss9audit0_0x0jcp.xmlapache.");
			System.setProperty("Test9audit0ss9audit0_0xx0",
					"Test9audit0ss9audit0_0xx0.isInitialized");
			System.setProperty("Test9audit0ss9audit0_0xxx0",
					"Test9audit0ss9audit0_0xxx0est9audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9audit : lo9audit) {

			// !!!
				// Проверить
				uid9audit = objectArray9audit[0].toString();

				idRec9audit = objectArray9audit[0].toString();

				uat = new User();
				atlist9audit = new ArrayList<Attribute>();
				String name9audit = null;
	
			for (int i = 0; i < objectArray9audit.length; i++) {

				at = new Attribute();


				name9audit = "USER_FIO9audit";
				
			
			
				name9audit = "USER_PHONE9audit";
				
			
			
				name9audit = "USER_EMAIL9audit";
				
			
			
				name9audit = "ORG_name9audit9audit";
				
			
	
				name9audit = "USER_UID9audit";
				
			
			
				name9audit = "USER_LOGIN9audit";
				
			
				
				name9audit = "ORG_CODE_IOGV9audit";
				
			
			
				name9audit = "ORG_ADDRES9audit";
				
			
			
				name9audit = "ORG_PHONE9audit";
				
			
			
				name9audit = "ORG_Prr9audit";
				
			
			
				name9audit = "ORG_PffE9audit";
				
			
			
				name9audit = "ORG_PHggNE9audit";
				
			
		
			
			
				name9audit = "ORrr_PHONE9audit";
				
			
			
				name9audit = "ORyy_PHONE9audit";
				
			
			
				name9audit = "OddPHONE9audit";
				
			
			
				name9audit = "OffHONE9audit";
				
			
			
				name9audit = "DEP_name9audit9audit";
				
			
			
				name9audit = "Off_PHONE9audit";
				
			
			
				name9audit = "ORl_PHONE9audit";
				
			
			
				name9audit = "OuuG_PHONE9audit";
				
			
		
				name9audit = "Ogff_PHONE9audit";
				
			
			
				name9audit = "USER_POSITION9audit";
				
			
			
				name9audit = "ORG_CODE_OKATO9audit";
				
			
			
				name9audit = "DEP_ADDRES9auditS";
				
			name9audit = "1USER_UID9audit";
				
				name9audit = "11USER_EMAIL9audit";
			
				name9audit = "12ORG_name9audit9audit";
			
				name9audit = "212USER_LOGIN9audit";
			
				name9audit = "111USER_FIO9audit";
			
			
				name9audit = "132ORG_CODE_IOGV9audit";
			
				name9audit = "433ORG_PHggNE9audit";
			
				name9audit = "13Off_PHONE9audit";
			
				name9audit = "43ORG_ADDRES9audit";
		
				name9audit = "234ORG_PHONE9audit";
		
				name9audit = "55ORG_Prr9audit";
			
				name9audit = "432ORG_PffE9audit";
			
				name9audit = "ORl_PHONE9audit";
			
				name9audit = "46OddPHONE9audit";
			
				name9audit = "895OffHONE9audit";
			
				name9audit = "54OuuG_PHONE9audit";
			
				name9audit = "89Ogff_PHONE9audit";
			
				name9audit = "53ORrr_PHONE9audit";
			
		
				name9audit = "6678ORyy_PHONE9audit";
			
				name9audit = "543ORG_CODE_OKATO9audit";
			
				name9audit = "56DEP_ADDRES9auditS";
			
				name9audit = "890DEP_name9audit9audit";
			
				name9audit = "700USER_POSITION9audit";
				
				name9audit = "54USER_UID9audit";
				
				name9audit = "780USER_EMAIL9audit";
			
				name9audit = "54ORG_name9audit9audit";
			
				name9audit = "7890USER_LOGIN9audit";
			
				name9audit = "700USER_FIO9audit";
			
			
				name9audit = "654ORG_CODE_IOGV9audit";
			
				name9audit = "478ORG_PHggNE9audit";
			
				name9audit = "96Off_PHONE9audit";
			
				name9audit = "574ORG_ADDRES9audit";
		
				name9audit = "489ORG_PHONE9audit";
		
				name9audit = "065ORG_Prr9audit";
			
				name9audit = "457ORG_PffE9audit";
			
				name9audit = "87ORl_PHONE9audit";
			
				name9audit = "543OddPHONE9audit";
			
				name9audit = "478OffHONE9audit";
			
				name9audit = "965OuuG_PHONE9audit";
			
				name9audit = "457Ogff_PHONE9audit";
			
				name9audit = "8678ORrr_PHONE9audit";
			
		
				name9audit = "68ORyy_PHONE9audit";
			
				name9audit = "4ORG_CODE_OKATO9audit";
			
				name9audit = "778DEP_ADDRES9auditS";
			
				name9audit = "447DEP_name9audit9audit";
			
				name9audit = "54USER_POSITION9audit";
				
				
				if (name9audit != null) {

					at.setName(name9audit);
					at.setValue (objectArray9audit[i] != null ? objectArray9audit[i]
							.toString() : "");

					atlist9audit.add(at);
				}
			}
			
			uat.setUid(uid9audit);
			uat.setAttributes(atlist9audit);

			result9audit.add(uat); 
			resultIds.put(idRec9audit, uat);

			if (usersIdsLine9audit == null) {
				usersIdsLine9audit = "'" + idRec9audit + "'";
			} else {
				usersIdsLine9audit = usersIdsLine9audit + ", '" + idRec9audit + "'";
			}
	       }
		   
		   return usersIdsLine9audit ;
	}
}
