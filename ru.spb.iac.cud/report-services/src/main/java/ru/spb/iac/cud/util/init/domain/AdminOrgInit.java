package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AdminOrgInit {

	 public AdminOrgInit(){
		 
	 }
	 
	public  String createLine (List<String> uids9domain){
		String result9domain = null;
		
		if (uids9domain != null && !uids9domain.isEmpty()) {

			StringBuilder bld9domain = new StringBuilder();
 for (String uidValue : uids9domain) {
 if (bld9domain.length()==0) {
 bld9domain.append("'" + uidValue + "'");
 }else{
 bld9domain.append(",'" + uidValue + "'");
 }
}
 result9domain=bld9domain.toString();
		}
		
		return result9domain;
	}

	public  String createAttributes (List<Object[]> lo9domain, List<User> result9domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid9domain = null;
		   String idRec9domain = null;
		   User uat = null;
		   List<Attribute> atlist9domain = null;
		   String usersIdsLine9domain = null;
		   
		  

			
			System.setProperty("Test9domain0Init",
					"Test9domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test9domain0ss9domain0_0x",
					"Test9domain0ss9domain0_0xjcp.xml");
        	System.setProperty("Test9domain0ss9domain0_02",
					"Test9domain0ss9domain0_02xml.config");
			System.setProperty("Test9domain0ss9domain0_03",
					"Test9domain0ss9domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test9domain0ss9domain0_04",
					"Test9domain0ss9domain0_04.resource.");
			System.setProperty("Test9domain0ss9domain0_05",
					"Test9domain0ss9domain0_05.isInitialized");
			System.setProperty("Test9domain0ss9domain0_06",
					"Test9domain0ss9domain0_06_9domain0Init.class/jcp.xml");
			System.setProperty("Test9domain0ss9domain0_07",
					"Test9domain0ss9domain0_07t/resource/jcp.xml");
        	System.setProperty("Test9domain0ss9domain0_08",
					"Test9domain0ss9domain0_08.config");
			System.setProperty("Test9domain0ss9domain0_09",
					"Test9domain0ss9domain0_09.security.");
		    System.setProperty("Test9domain0ss9domain0_0x0",
					"Test9domain0ss9domain0_0x0jcp.xmlapache.");
			System.setProperty("Test9domain0ss9domain0_0xx0",
					"Test9domain0ss9domain0_0xx0.isInitialized");
			System.setProperty("Test9domain0ss9domain0_0xxx0",
					"Test9domain0ss9domain0_0xxx0est9domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray9domain : lo9domain) {

			// !!!
				// Проверить
				uid9domain = objectArray9domain[0].toString();

				idRec9domain = objectArray9domain[0].toString();

				uat = new User();
				atlist9domain = new ArrayList<Attribute>();
				String name9domain = null;
	
			for (int i = 0; i < objectArray9domain.length; i++) {

				at = new Attribute();


				name9domain = "USER_FIO9domain";
				
			
			
				name9domain = "USER_PHONE9domain";
				
			
			
				name9domain = "USER_EMAIL9domain";
				
			
			
				name9domain = "ORG_name9domain9domain";
				
			
	
				name9domain = "USER_UID9domain";
				
			
			
				name9domain = "USER_LOGIN9domain";
				
			
				
				name9domain = "ORG_CODE_IOGV9domain";
				
			
			
				name9domain = "ORG_ADDRES9domain";
				
			
			
				name9domain = "ORG_PHONE9domain";
				
			
			
				name9domain = "ORG_Prr9domain";
				
			
			
				name9domain = "ORG_PffE9domain";
				
			
			
				name9domain = "ORG_PHggNE9domain";
				
			
		
			
			
				name9domain = "ORrr_PHONE9domain";
				
			
			
				name9domain = "ORyy_PHONE9domain";
				
			
			
				name9domain = "OddPHONE9domain";
				
			
			
				name9domain = "OffHONE9domain";
				
			
			
				name9domain = "DEP_name9domain9domain";
				
			
			
				name9domain = "Off_PHONE9domain";
				
			
			
				name9domain = "ORl_PHONE9domain";
				
			
			
				name9domain = "OuuG_PHONE9domain";
				
			
		
				name9domain = "Ogff_PHONE9domain";
				
			
			
				name9domain = "USER_POSITION9domain";
				
			
			
				name9domain = "ORG_CODE_OKATO9domain";
				
			
			
				name9domain = "DEP_ADDRES9domainS";
				
			name9domain = "1USER_UID9domain";
				
				name9domain = "11USER_EMAIL9domain";
			
				name9domain = "12ORG_name9domain9domain";
			
				name9domain = "212USER_LOGIN9domain";
			
				name9domain = "111USER_FIO9domain";
			
			
				name9domain = "132ORG_CODE_IOGV9domain";
			
				name9domain = "433ORG_PHggNE9domain";
			
				name9domain = "13Off_PHONE9domain";
			
				name9domain = "43ORG_ADDRES9domain";
		
				name9domain = "234ORG_PHONE9domain";
		
				name9domain = "55ORG_Prr9domain";
			
				name9domain = "432ORG_PffE9domain";
			
				name9domain = "ORl_PHONE9domain";
			
				name9domain = "46OddPHONE9domain";
			
				name9domain = "895OffHONE9domain";
			
				name9domain = "54OuuG_PHONE9domain";
			
				name9domain = "89Ogff_PHONE9domain";
			
				name9domain = "53ORrr_PHONE9domain";
			
		
				name9domain = "6678ORyy_PHONE9domain";
			
				name9domain = "543ORG_CODE_OKATO9domain";
			
				name9domain = "56DEP_ADDRES9domainS";
			
				name9domain = "890DEP_name9domain9domain";
			
				name9domain = "700USER_POSITION9domain";
				
				name9domain = "54USER_UID9domain";
				
				name9domain = "780USER_EMAIL9domain";
			
				name9domain = "54ORG_name9domain9domain";
			
				name9domain = "7890USER_LOGIN9domain";
			
				name9domain = "700USER_FIO9domain";
			
			
				name9domain = "654ORG_CODE_IOGV9domain";
			
				name9domain = "478ORG_PHggNE9domain";
			
				name9domain = "96Off_PHONE9domain";
			
				name9domain = "574ORG_ADDRES9domain";
		
				name9domain = "489ORG_PHONE9domain";
		
				name9domain = "065ORG_Prr9domain";
			
				name9domain = "457ORG_PffE9domain";
			
				name9domain = "87ORl_PHONE9domain";
			
				name9domain = "543OddPHONE9domain";
			
				name9domain = "478OffHONE9domain";
			
				name9domain = "965OuuG_PHONE9domain";
			
				name9domain = "457Ogff_PHONE9domain";
			
				name9domain = "8678ORrr_PHONE9domain";
			
		
				name9domain = "68ORyy_PHONE9domain";
			
				name9domain = "4ORG_CODE_OKATO9domain";
			
				name9domain = "778DEP_ADDRES9domainS";
			
				name9domain = "447DEP_name9domain9domain";
			
				name9domain = "54USER_POSITION9domain";
				
				
				if (name9domain != null) {

					at.setName(name9domain);
					at.setValue (objectArray9domain[i] != null ? objectArray9domain[i]
							.toString() : "");

					atlist9domain.add(at);
				}
			}
			
			uat.setUid(uid9domain);
			uat.setAttributes(atlist9domain);

			result9domain.add(uat); 
			resultIds.put(idRec9domain, uat);

			if (usersIdsLine9domain == null) {
				usersIdsLine9domain = "'" + idRec9domain + "'";
			} else {
				usersIdsLine9domain = usersIdsLine9domain + ", '" + idRec9domain + "'";
			}
	       }
		   
		   return usersIdsLine9domain ;
	}
}
