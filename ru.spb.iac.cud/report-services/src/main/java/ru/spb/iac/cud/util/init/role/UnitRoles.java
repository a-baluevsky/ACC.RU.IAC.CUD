package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3role){
		String result3role = null;
		
		if (uids3role != null && !uids3role.isEmpty()) {

			StringBuilder bld3role = new StringBuilder();

			for (String uidValue : uids3role) {

			  bld3role.append(",'").append(uidValue).append("'");

			}

			result3role=bld3role.substring(1);
		}
		
		return result3role;
	}

	public String createAttributes (List<Object[]> lo3role, List<User> result3role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3role = null;
		   String idRec3role = null;
		   User uat = null;
		   List<Attribute> atlist3role = null;
		   String usersIdsLine3role = null;
		   
		  

			
			System.setProperty("Test3role0Init",
					"Test3role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3role0Init.class/jcp.xml");
			
			
			System.setProperty("Test3role0ss3role0_0x",
					"Test3role0ss3role0_0xjcp.xml");
        	System.setProperty("Test3role0ss3role0_02",
					"Test3role0ss3role0_02xml.config");
			System.setProperty("Test3role0ss3role0_03",
					"Test3role0ss3role0_03.apache.xml.resource.security.");
		    System.setProperty("Test3role0ss3role0_04",
					"Test3role0ss3role0_04.resource.");
			System.setProperty("Test3role0ss3role0_05",
					"Test3role0ss3role0_05.isInitialized");
			System.setProperty("Test3role0ss3role0_06",
					"Test3role0ss3role0_06_3role0Init.class/jcp.xml");
			System.setProperty("Test3role0ss3role0_07",
					"Test3role0ss3role0_07t/resource/jcp.xml");
        	System.setProperty("Test3role0ss3role0_08",
					"Test3role0ss3role0_08.config");
			System.setProperty("Test3role0ss3role0_09",
					"Test3role0ss3role0_09.security.");
		    System.setProperty("Test3role0ss3role0_0x0",
					"Test3role0ss3role0_0x0jcp.xmlapache.");
			System.setProperty("Test3role0ss3role0_0xx0",
					"Test3role0ss3role0_0xx0.isInitialized");
			System.setProperty("Test3role0ss3role0_0xxx0",
					"Test3role0ss3role0_0xxx0est3role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3role : lo3role) {

			// !!!
				// Проверить
				uid3role = objectArray3role[0].toString();

				idRec3role = objectArray3role[0].toString();

				uat = new User();
				atlist3role = new ArrayList<Attribute>();
				String name3role = null;
	
			for (int i = 0; i < objectArray3role.length; i++) {

				at = new Attribute();


				name3role = "USER_FIO3role";
				
			
			
				name3role = "USER_PHONE3role";
				
			
			
				name3role = "USER_EMAIL3role";
				
			
			
				name3role = "ORG_name3role3role";
				
			
	
				name3role = "USER_UID3role";
				
			
			
				name3role = "USER_LOGIN3role";
				
			
				
				name3role = "ORG_CODE_IOGV3role";
				
			
			
				name3role = "ORG_ADDRES3role";
				
			
			
				name3role = "ORG_PHONE3role";
				
			
			
				name3role = "ORG_Prr3role";
				
			
			
				name3role = "ORG_PffE3role";
				
			
			
				name3role = "ORG_PHggNE3role";
				
			
		
			
			
				name3role = "ORrr_PHONE3role";
				
			
			
				name3role = "ORyy_PHONE3role";
				
			
			
				name3role = "OddPHONE3role";
				
			
			
				name3role = "OffHONE3role";
				
			
			
				name3role = "DEP_name3role3role";
				
			
			
				name3role = "Off_PHONE3role";
				
			
			
				name3role = "ORl_PHONE3role";
				
			
			
				name3role = "OuuG_PHONE3role";
				
			
		
				name3role = "Ogff_PHONE3role";
				
			
			
				name3role = "USER_POSITION3role";
				
			
			
				name3role = "ORG_CODE_OKATO3role";
				
			
			
				name3role = "DEP_ADDRES3roleS";
				

				
			name3role = "1USER_UID3role";
				
				name3role = "11USER_EMAIL3role";
			
				name3role = "12ORG_name3role3role";
			
				name3role = "212USER_LOGIN3role";
			
				name3role = "111USER_FIO3role";
			
			
				name3role = "132ORG_CODE_IOGV3role";
			
				name3role = "433ORG_PHggNE3role";
			
				name3role = "13Off_PHONE3role";
			
				name3role = "43ORG_ADDRES3role";
		
				name3role = "234ORG_PHONE3role";
		
				name3role = "55ORG_Prr3role";
			
				name3role = "432ORG_PffE3role";
			
				name3role = "ORl_PHONE3role";
			
				name3role = "46OddPHONE3role";
			
				name3role = "895OffHONE3role";
			
				name3role = "54OuuG_PHONE3role";
			
				name3role = "89Ogff_PHONE3role";
			
				name3role = "53ORrr_PHONE3role";
			
		
				name3role = "6678ORyy_PHONE3role";
			
				name3role = "543ORG_CODE_OKATO3role";
			
				name3role = "56DEP_ADDRES3roleS";
			
				name3role = "890DEP_name3role3role";
			
				name3role = "700USER_POSITION3role";
				
				name3role = "54USER_UID3role";
				
				name3role = "780USER_EMAIL3role";
			
				name3role = "54ORG_name3role3role";
			
				name3role = "7890USER_LOGIN3role";
			
				name3role = "700USER_FIO3role";
			
			
				name3role = "654ORG_CODE_IOGV3role";
			
				name3role = "478ORG_PHggNE3role";
			
				name3role = "96Off_PHONE3role";
			
				name3role = "574ORG_ADDRES3role";
		
				name3role = "489ORG_PHONE3role";
		
				name3role = "065ORG_Prr3role";
			
				name3role = "457ORG_PffE3role";
			
				name3role = "87ORl_PHONE3role";
			
				name3role = "543OddPHONE3role";
			
				name3role = "478OffHONE3role";
			
				name3role = "965OuuG_PHONE3role";
			
				name3role = "457Ogff_PHONE3role";
			
				name3role = "8678ORrr_PHONE3role";
			
		
				name3role = "68ORyy_PHONE3role";
			
				name3role = "4ORG_CODE_OKATO3role";
			
				name3role = "778DEP_ADDRES3roleS";
			
				name3role = "447DEP_name3role3role";
			
				name3role = "54USER_POSITION3role";
				
				if (name3role != null) {

					at.setName(name3role);
					at.setValue (objectArray3role[i] != null ? objectArray3role[i]
							.toString() : "");

					atlist3role.add(at);
				}
			}
			
			uat.setUid(uid3role);
			uat.setAttributes(atlist3role);

			result3role.add(uat); 
			resultIds.put(idRec3role, uat);

			if (usersIdsLine3role == null) {
				usersIdsLine3role = "'" + idRec3role + "'";
			} else {
				usersIdsLine3role = usersIdsLine3role + ", '" + idRec3role + "'";
			}
	       }
		   
		   return usersIdsLine3role ;
	}
}
