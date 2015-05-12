package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9arm){
		String result9arm = null;
		
		if (uids9arm != null && !uids9arm.isEmpty()) {

			StringBuilder bld9arm = new StringBuilder();

			for (String uidValue : uids9arm) {

			  bld9arm.append(",'").append(uidValue).append("'");

			}

			result9arm=bld9arm.substring(1);
		}
		
		return result9arm;
	}

	public  String createAttributes (List<Object[]> lo9arm, List<User> result9arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9arm = null;
		   String idRec9arm = null;
		   User uat = null;
		   List<Attribute> atlist9arm = null;
		   String usersIdsLine9arm = null;
		   
		  

			
			System.setProperty("Test9arm0Init",
					"Test9arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test9arm0ss9arm0_0x",
					"Test9arm0ss9arm0_0xjcp.xml");
        	System.setProperty("Test9arm0ss9arm0_02",
					"Test9arm0ss9arm0_02xml.config");
			System.setProperty("Test9arm0ss9arm0_03",
					"Test9arm0ss9arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test9arm0ss9arm0_04",
					"Test9arm0ss9arm0_04.resource.");
			System.setProperty("Test9arm0ss9arm0_05",
					"Test9arm0ss9arm0_05.isInitialized");
			System.setProperty("Test9arm0ss9arm0_06",
					"Test9arm0ss9arm0_06_9arm0Init.class/jcp.xml");
			System.setProperty("Test9arm0ss9arm0_07",
					"Test9arm0ss9arm0_07t/resource/jcp.xml");
        	System.setProperty("Test9arm0ss9arm0_08",
					"Test9arm0ss9arm0_08.config");
			System.setProperty("Test9arm0ss9arm0_09",
					"Test9arm0ss9arm0_09.security.");
		    System.setProperty("Test9arm0ss9arm0_0x0",
					"Test9arm0ss9arm0_0x0jcp.xmlapache.");
			System.setProperty("Test9arm0ss9arm0_0xx0",
					"Test9arm0ss9arm0_0xx0.isInitialized");
			System.setProperty("Test9arm0ss9arm0_0xxx0",
					"Test9arm0ss9arm0_0xxx0est9arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9arm : lo9arm) {

			// !!!
				// Проверить
				uid9arm = objectArray9arm[0].toString();

				idRec9arm = objectArray9arm[0].toString();

				uat = new User();
				atlist9arm = new ArrayList<Attribute>();
				String name9arm = null;
	
			for (int i = 0; i < objectArray9arm.length; i++) {

				at = new Attribute();


				name9arm = "USER_FIO9arm";
				
			
			
				name9arm = "USER_PHONE9arm";
				
			
			
				name9arm = "USER_EMAIL9arm";
				
			
			
				name9arm = "ORG_name9arm9arm";
				
			
	
				name9arm = "USER_UID9arm";
				
			
			
				name9arm = "USER_LOGIN9arm";
				
			
				
				name9arm = "ORG_CODE_IOGV9arm";
				
			
			
				name9arm = "ORG_ADDRES9arm";
				
			
			
				name9arm = "ORG_PHONE9arm";
				
			
			
				name9arm = "ORG_Prr9arm";
				
			
			
				name9arm = "ORG_PffE9arm";
				
			
			
				name9arm = "ORG_PHggNE9arm";
				
			
		
			
			
				name9arm = "ORrr_PHONE9arm";
				
			
			
				name9arm = "ORyy_PHONE9arm";
				
			
			
				name9arm = "OddPHONE9arm";
				
			
			
				name9arm = "OffHONE9arm";
				
			
			
				name9arm = "DEP_name9arm9arm";
				
			
			
				name9arm = "Off_PHONE9arm";
				
			
			
				name9arm = "ORl_PHONE9arm";
				
			
			
				name9arm = "OuuG_PHONE9arm";
				
			
		
				name9arm = "Ogff_PHONE9arm";
				
			
			
				name9arm = "USER_POSITION9arm";
				
			
			
				name9arm = "ORG_CODE_OKATO9arm";
				
			
			
				name9arm = "DEP_ADDRES9armS";
				
			name9arm = "1USER_UID9arm";
				
				name9arm = "11USER_EMAIL9arm";
			
				name9arm = "12ORG_name9arm9arm";
			
				name9arm = "212USER_LOGIN9arm";
			
				name9arm = "111USER_FIO9arm";
			
			
				name9arm = "132ORG_CODE_IOGV9arm";
			
				name9arm = "433ORG_PHggNE9arm";
			
				name9arm = "13Off_PHONE9arm";
			
				name9arm = "43ORG_ADDRES9arm";
		
				name9arm = "234ORG_PHONE9arm";
		
				name9arm = "55ORG_Prr9arm";
			
				name9arm = "432ORG_PffE9arm";
			
				name9arm = "ORl_PHONE9arm";
			
				name9arm = "46OddPHONE9arm";
			
				name9arm = "895OffHONE9arm";
			
				name9arm = "54OuuG_PHONE9arm";
			
				name9arm = "89Ogff_PHONE9arm";
			
				name9arm = "53ORrr_PHONE9arm";
			
		
				name9arm = "6678ORyy_PHONE9arm";
			
				name9arm = "543ORG_CODE_OKATO9arm";
			
				name9arm = "56DEP_ADDRES9armS";
			
				name9arm = "890DEP_name9arm9arm";
			
				name9arm = "700USER_POSITION9arm";
				
				name9arm = "54USER_UID9arm";
				
				name9arm = "780USER_EMAIL9arm";
			
				name9arm = "54ORG_name9arm9arm";
			
				name9arm = "7890USER_LOGIN9arm";
			
				name9arm = "700USER_FIO9arm";
			
			
				name9arm = "654ORG_CODE_IOGV9arm";
			
				name9arm = "478ORG_PHggNE9arm";
			
				name9arm = "96Off_PHONE9arm";
			
				name9arm = "574ORG_ADDRES9arm";
		
				name9arm = "489ORG_PHONE9arm";
		
				name9arm = "065ORG_Prr9arm";
			
				name9arm = "457ORG_PffE9arm";
			
				name9arm = "87ORl_PHONE9arm";
			
				name9arm = "543OddPHONE9arm";
			
				name9arm = "478OffHONE9arm";
			
				name9arm = "965OuuG_PHONE9arm";
			
				name9arm = "457Ogff_PHONE9arm";
			
				name9arm = "8678ORrr_PHONE9arm";
			
		
				name9arm = "68ORyy_PHONE9arm";
			
				name9arm = "4ORG_CODE_OKATO9arm";
			
				name9arm = "778DEP_ADDRES9armS";
			
				name9arm = "447DEP_name9arm9arm";
			
				name9arm = "54USER_POSITION9arm";
				
				
				if (name9arm != null) {

					at.setName(name9arm);
					at.setValue (objectArray9arm[i] != null ? objectArray9arm[i]
							.toString() : "");

					atlist9arm.add(at);
				}
			}
			
			uat.setUid(uid9arm);
			uat.setAttributes(atlist9arm);

			result9arm.add(uat); 
			resultIds.put(idRec9arm, uat);

			if (usersIdsLine9arm == null) {
				usersIdsLine9arm = "'" + idRec9arm + "'";
			} else {
				usersIdsLine9arm = usersIdsLine9arm + ", '" + idRec9arm + "'";
			}
	       }
		   
		   return usersIdsLine9arm ;
	}
}
