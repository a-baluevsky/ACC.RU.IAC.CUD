package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3domain){
		String result3domain = null;
		
		if (uids3domain != null && !uids3domain.isEmpty()) {

			StringBuilder bld3domain = new StringBuilder();
 for (String uidValue : uids3domain) {
 if (bld3domain.length()==0) {
 bld3domain.append("'" + uidValue + "'");
 }else{
 bld3domain.append(",'" + uidValue + "'");
 }
}
 result3domain=bld3domain.toString();
		}
		
		return result3domain;
	}

	public String createAttributes (List<Object[]> lo3domain, List<User> result3domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3domain = null;
		   String idRec3domain = null;
		   User uat = null;
		   List<Attribute> atlist3domain = null;
		   String usersIdsLine3domain = null;
		   
		  

			
			System.setProperty("Test3domain0Init",
					"Test3domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test3domain0ss3domain0_0x",
					"Test3domain0ss3domain0_0xjcp.xml");
        	System.setProperty("Test3domain0ss3domain0_02",
					"Test3domain0ss3domain0_02xml.config");
			System.setProperty("Test3domain0ss3domain0_03",
					"Test3domain0ss3domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test3domain0ss3domain0_04",
					"Test3domain0ss3domain0_04.resource.");
			System.setProperty("Test3domain0ss3domain0_05",
					"Test3domain0ss3domain0_05.isInitialized");
			System.setProperty("Test3domain0ss3domain0_06",
					"Test3domain0ss3domain0_06_3domain0Init.class/jcp.xml");
			System.setProperty("Test3domain0ss3domain0_07",
					"Test3domain0ss3domain0_07t/resource/jcp.xml");
        	System.setProperty("Test3domain0ss3domain0_08",
					"Test3domain0ss3domain0_08.config");
			System.setProperty("Test3domain0ss3domain0_09",
					"Test3domain0ss3domain0_09.security.");
		    System.setProperty("Test3domain0ss3domain0_0x0",
					"Test3domain0ss3domain0_0x0jcp.xmlapache.");
			System.setProperty("Test3domain0ss3domain0_0xx0",
					"Test3domain0ss3domain0_0xx0.isInitialized");
			System.setProperty("Test3domain0ss3domain0_0xxx0",
					"Test3domain0ss3domain0_0xxx0est3domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3domain : lo3domain) {

			// !!!
				// Проверить
				uid3domain = objectArray3domain[0].toString();

				idRec3domain = objectArray3domain[0].toString();

				uat = new User();
				atlist3domain = new ArrayList<Attribute>();
				String name3domain = null;
	
			for (int i = 0; i < objectArray3domain.length; i++) {

				at = new Attribute();


				name3domain = "USER_FIO3domain";
				
			
			
				name3domain = "USER_PHONE3domain";
				
			
			
				name3domain = "USER_EMAIL3domain";
				
			
			
				name3domain = "ORG_name3domain3domain";
				
			
	
				name3domain = "USER_UID3domain";
				
			
			
				name3domain = "USER_LOGIN3domain";
				
			
				
				name3domain = "ORG_CODE_IOGV3domain";
				
			
			
				name3domain = "ORG_ADDRES3domain";
				
			
			
				name3domain = "ORG_PHONE3domain";
				
			
			
				name3domain = "ORG_Prr3domain";
				
			
			
				name3domain = "ORG_PffE3domain";
				
			
			
				name3domain = "ORG_PHggNE3domain";
				
			
		
			
			
				name3domain = "ORrr_PHONE3domain";
				
			
			
				name3domain = "ORyy_PHONE3domain";
				
			
			
				name3domain = "OddPHONE3domain";
				
			
			
				name3domain = "OffHONE3domain";
				
			
			
				name3domain = "DEP_name3domain3domain";
				
			
			
				name3domain = "Off_PHONE3domain";
				
			
			
				name3domain = "ORl_PHONE3domain";
				
			
			
				name3domain = "OuuG_PHONE3domain";
				
			
		
				name3domain = "Ogff_PHONE3domain";
				
			
			
				name3domain = "USER_POSITION3domain";
				
			
			
				name3domain = "ORG_CODE_OKATO3domain";
				
			
			
				name3domain = "DEP_ADDRES3domainS";
				

				
			name3domain = "1USER_UID3domain";
				
				name3domain = "11USER_EMAIL3domain";
			
				name3domain = "12ORG_name3domain3domain";
			
				name3domain = "212USER_LOGIN3domain";
			
				name3domain = "111USER_FIO3domain";
			
			
				name3domain = "132ORG_CODE_IOGV3domain";
			
				name3domain = "433ORG_PHggNE3domain";
			
				name3domain = "13Off_PHONE3domain";
			
				name3domain = "43ORG_ADDRES3domain";
		
				name3domain = "234ORG_PHONE3domain";
		
				name3domain = "55ORG_Prr3domain";
			
				name3domain = "432ORG_PffE3domain";
			
				name3domain = "ORl_PHONE3domain";
			
				name3domain = "46OddPHONE3domain";
			
				name3domain = "895OffHONE3domain";
			
				name3domain = "54OuuG_PHONE3domain";
			
				name3domain = "89Ogff_PHONE3domain";
			
				name3domain = "53ORrr_PHONE3domain";
			
		
				name3domain = "6678ORyy_PHONE3domain";
			
				name3domain = "543ORG_CODE_OKATO3domain";
			
				name3domain = "56DEP_ADDRES3domainS";
			
				name3domain = "890DEP_name3domain3domain";
			
				name3domain = "700USER_POSITION3domain";
				
				name3domain = "54USER_UID3domain";
				
				name3domain = "780USER_EMAIL3domain";
			
				name3domain = "54ORG_name3domain3domain";
			
				name3domain = "7890USER_LOGIN3domain";
			
				name3domain = "700USER_FIO3domain";
			
			
				name3domain = "654ORG_CODE_IOGV3domain";
			
				name3domain = "478ORG_PHggNE3domain";
			
				name3domain = "96Off_PHONE3domain";
			
				name3domain = "574ORG_ADDRES3domain";
		
				name3domain = "489ORG_PHONE3domain";
		
				name3domain = "065ORG_Prr3domain";
			
				name3domain = "457ORG_PffE3domain";
			
				name3domain = "87ORl_PHONE3domain";
			
				name3domain = "543OddPHONE3domain";
			
				name3domain = "478OffHONE3domain";
			
				name3domain = "965OuuG_PHONE3domain";
			
				name3domain = "457Ogff_PHONE3domain";
			
				name3domain = "8678ORrr_PHONE3domain";
			
		
				name3domain = "68ORyy_PHONE3domain";
			
				name3domain = "4ORG_CODE_OKATO3domain";
			
				name3domain = "778DEP_ADDRES3domainS";
			
				name3domain = "447DEP_name3domain3domain";
			
				name3domain = "54USER_POSITION3domain";
				
				if (name3domain != null) {

					at.setName(name3domain);
					at.setValue (objectArray3domain[i] != null ? objectArray3domain[i]
							.toString() : "");

					atlist3domain.add(at);
				}
			}
			
			uat.setUid(uid3domain);
			uat.setAttributes(atlist3domain);

			result3domain.add(uat); 
			resultIds.put(idRec3domain, uat);

			if (usersIdsLine3domain == null) {
				usersIdsLine3domain = "'" + idRec3domain + "'";
			} else {
				usersIdsLine3domain = usersIdsLine3domain + ", '" + idRec3domain + "'";
			}
	       }
		   
		   return usersIdsLine3domain ;
	}
}
