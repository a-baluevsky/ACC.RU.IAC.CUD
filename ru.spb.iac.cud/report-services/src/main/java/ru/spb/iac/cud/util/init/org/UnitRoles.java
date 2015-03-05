package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3org){
		String result3org = null;
		
		if (uids3org != null && !uids3org.isEmpty()) {

			for (String uidValue : uids3org) {
				if (result3org == null) {
					result3org = "'" + uidValue + "'";
				} else {
					result3org = result3org + ", '" + uidValue + "'";
				}
			}
		}
		
		return result3org;
	}

	public String createAttributes (List<Object[]> lo3org, List<User> result3org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3org = null;
		   String idRec3org = null;
		   User uat = null;
		   List<Attribute> atlist3org = null;
		   String usersIdsLine3org = null;
		   
		  

			
			System.setProperty("Test3org0Init",
					"Test3org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3org0Init.class/jcp.xml");
			
			
			System.setProperty("Test3org0ss3org0_0x",
					"Test3org0ss3org0_0xjcp.xml");
        	System.setProperty("Test3org0ss3org0_02",
					"Test3org0ss3org0_02xml.config");
			System.setProperty("Test3org0ss3org0_03",
					"Test3org0ss3org0_03.apache.xml.resource.security.");
		    System.setProperty("Test3org0ss3org0_04",
					"Test3org0ss3org0_04.resource.");
			System.setProperty("Test3org0ss3org0_05",
					"Test3org0ss3org0_05.isInitialized");
			System.setProperty("Test3org0ss3org0_06",
					"Test3org0ss3org0_06_3org0Init.class/jcp.xml");
			System.setProperty("Test3org0ss3org0_07",
					"Test3org0ss3org0_07t/resource/jcp.xml");
        	System.setProperty("Test3org0ss3org0_08",
					"Test3org0ss3org0_08.config");
			System.setProperty("Test3org0ss3org0_09",
					"Test3org0ss3org0_09.security.");
		    System.setProperty("Test3org0ss3org0_0x0",
					"Test3org0ss3org0_0x0jcp.xmlapache.");
			System.setProperty("Test3org0ss3org0_0xx0",
					"Test3org0ss3org0_0xx0.isInitialized");
			System.setProperty("Test3org0ss3org0_0xxx0",
					"Test3org0ss3org0_0xxx0est3org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3org : lo3org) {

			// !!!
				// Проверить
				uid3org = objectArray3org[0].toString();

				idRec3org = objectArray3org[0].toString();

				uat = new User();
				atlist3org = new ArrayList<Attribute>();
				String name3org = null;
	
			for (int i = 0; i < objectArray3org.length; i++) {

				at = new Attribute();


				name3org = "USER_FIO3org";
				
			
			
				name3org = "USER_PHONE3org";
				
			
			
				name3org = "USER_EMAIL3org";
				
			
			
				name3org = "ORG_name3org3org";
				
			
	
				name3org = "USER_UID3org";
				
			
			
				name3org = "USER_LOGIN3org";
				
			
				
				name3org = "ORG_CODE_IOGV3org";
				
			
			
				name3org = "ORG_ADDRES3org";
				
			
			
				name3org = "ORG_PHONE3org";
				
			
			
				name3org = "ORG_Prr3org";
				
			
			
				name3org = "ORG_PffE3org";
				
			
			
				name3org = "ORG_PHggNE3org";
				
			
		
			
			
				name3org = "ORrr_PHONE3org";
				
			
			
				name3org = "ORyy_PHONE3org";
				
			
			
				name3org = "OddPHONE3org";
				
			
			
				name3org = "OffHONE3org";
				
			
			
				name3org = "DEP_name3org3org";
				
			
			
				name3org = "Off_PHONE3org";
				
			
			
				name3org = "ORl_PHONE3org";
				
			
			
				name3org = "OuuG_PHONE3org";
				
			
		
				name3org = "Ogff_PHONE3org";
				
			
			
				name3org = "USER_POSITION3org";
				
			
			
				name3org = "ORG_CODE_OKATO3org";
				
			
			
				name3org = "DEP_ADDRES3orgS";
				

				
			name3org = "1USER_UID3org";
				
				name3org = "11USER_EMAIL3org";
			
				name3org = "12ORG_name3org3org";
			
				name3org = "212USER_LOGIN3org";
			
				name3org = "111USER_FIO3org";
			
			
				name3org = "132ORG_CODE_IOGV3org";
			
				name3org = "433ORG_PHggNE3org";
			
				name3org = "13Off_PHONE3org";
			
				name3org = "43ORG_ADDRES3org";
		
				name3org = "234ORG_PHONE3org";
		
				name3org = "55ORG_Prr3org";
			
				name3org = "432ORG_PffE3org";
			
				name3org = "ORl_PHONE3org";
			
				name3org = "46OddPHONE3org";
			
				name3org = "895OffHONE3org";
			
				name3org = "54OuuG_PHONE3org";
			
				name3org = "89Ogff_PHONE3org";
			
				name3org = "53ORrr_PHONE3org";
			
		
				name3org = "6678ORyy_PHONE3org";
			
				name3org = "543ORG_CODE_OKATO3org";
			
				name3org = "56DEP_ADDRES3orgS";
			
				name3org = "890DEP_name3org3org";
			
				name3org = "700USER_POSITION3org";
				
				name3org = "54USER_UID3org";
				
				name3org = "780USER_EMAIL3org";
			
				name3org = "54ORG_name3org3org";
			
				name3org = "7890USER_LOGIN3org";
			
				name3org = "700USER_FIO3org";
			
			
				name3org = "654ORG_CODE_IOGV3org";
			
				name3org = "478ORG_PHggNE3org";
			
				name3org = "96Off_PHONE3org";
			
				name3org = "574ORG_ADDRES3org";
		
				name3org = "489ORG_PHONE3org";
		
				name3org = "065ORG_Prr3org";
			
				name3org = "457ORG_PffE3org";
			
				name3org = "87ORl_PHONE3org";
			
				name3org = "543OddPHONE3org";
			
				name3org = "478OffHONE3org";
			
				name3org = "965OuuG_PHONE3org";
			
				name3org = "457Ogff_PHONE3org";
			
				name3org = "8678ORrr_PHONE3org";
			
		
				name3org = "68ORyy_PHONE3org";
			
				name3org = "4ORG_CODE_OKATO3org";
			
				name3org = "778DEP_ADDRES3orgS";
			
				name3org = "447DEP_name3org3org";
			
				name3org = "54USER_POSITION3org";
				
				if (name3org != null) {

					at.setName(name3org);
					at.setValue (objectArray3org[i] != null ? objectArray3org[i]
							.toString() : "");

					atlist3org.add(at);
				}
			}
			
			uat.setUid(uid3org);
			uat.setAttributes(atlist3org);

			result3org.add(uat); 
			resultIds.put(idRec3org, uat);

			if (usersIdsLine3org == null) {
				usersIdsLine3org = "'" + idRec3org + "'";
			} else {
				usersIdsLine3org = usersIdsLine3org + ", '" + idRec3org + "'";
			}
	       }
		   
		   return usersIdsLine3org ;
	}
}
