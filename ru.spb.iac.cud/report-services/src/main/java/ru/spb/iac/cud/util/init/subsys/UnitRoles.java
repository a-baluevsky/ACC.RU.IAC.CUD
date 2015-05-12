package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3subsys){
		String result3subsys = null;
		
		if (uids3subsys != null && !uids3subsys.isEmpty()) {

			StringBuilder bld3subsys = new StringBuilder();

			for (String uidValue : uids3subsys) {

			  bld3subsys.append(",'").append(uidValue).append("'");

			}

			result3subsys=bld3subsys.substring(1);
		}
		
		return result3subsys;
	}

	public String createAttributes (List<Object[]> lo3subsys, List<User> result3subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3subsys = null;
		   String idRec3subsys = null;
		   User uat = null;
		   List<Attribute> atlist3subsys = null;
		   String usersIdsLine3subsys = null;
		   
		  

			
			System.setProperty("Test3subsys0Init",
					"Test3subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test3subsys0ss3subsys0_0x",
					"Test3subsys0ss3subsys0_0xjcp.xml");
        	System.setProperty("Test3subsys0ss3subsys0_02",
					"Test3subsys0ss3subsys0_02xml.config");
			System.setProperty("Test3subsys0ss3subsys0_03",
					"Test3subsys0ss3subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test3subsys0ss3subsys0_04",
					"Test3subsys0ss3subsys0_04.resource.");
			System.setProperty("Test3subsys0ss3subsys0_05",
					"Test3subsys0ss3subsys0_05.isInitialized");
			System.setProperty("Test3subsys0ss3subsys0_06",
					"Test3subsys0ss3subsys0_06_3subsys0Init.class/jcp.xml");
			System.setProperty("Test3subsys0ss3subsys0_07",
					"Test3subsys0ss3subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test3subsys0ss3subsys0_08",
					"Test3subsys0ss3subsys0_08.config");
			System.setProperty("Test3subsys0ss3subsys0_09",
					"Test3subsys0ss3subsys0_09.security.");
		    System.setProperty("Test3subsys0ss3subsys0_0x0",
					"Test3subsys0ss3subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test3subsys0ss3subsys0_0xx0",
					"Test3subsys0ss3subsys0_0xx0.isInitialized");
			System.setProperty("Test3subsys0ss3subsys0_0xxx0",
					"Test3subsys0ss3subsys0_0xxx0est3subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3subsys : lo3subsys) {

			// !!!
				// Проверить
				uid3subsys = objectArray3subsys[0].toString();

				idRec3subsys = objectArray3subsys[0].toString();

				uat = new User();
				atlist3subsys = new ArrayList<Attribute>();
				String name3subsys = null;
	
			for (int i = 0; i < objectArray3subsys.length; i++) {

				at = new Attribute();


				name3subsys = "USER_FIO3subsys";
				
			
			
				name3subsys = "USER_PHONE3subsys";
				
			
			
				name3subsys = "USER_EMAIL3subsys";
				
			
			
				name3subsys = "ORG_name3subsys3subsys";
				
			
	
				name3subsys = "USER_UID3subsys";
				
			
			
				name3subsys = "USER_LOGIN3subsys";
				
			
				
				name3subsys = "ORG_CODE_IOGV3subsys";
				
			
			
				name3subsys = "ORG_ADDRES3subsys";
				
			
			
				name3subsys = "ORG_PHONE3subsys";
				
			
			
				name3subsys = "ORG_Prr3subsys";
				
			
			
				name3subsys = "ORG_PffE3subsys";
				
			
			
				name3subsys = "ORG_PHggNE3subsys";
				
			
		
			
			
				name3subsys = "ORrr_PHONE3subsys";
				
			
			
				name3subsys = "ORyy_PHONE3subsys";
				
			
			
				name3subsys = "OddPHONE3subsys";
				
			
			
				name3subsys = "OffHONE3subsys";
				
			
			
				name3subsys = "DEP_name3subsys3subsys";
				
			
			
				name3subsys = "Off_PHONE3subsys";
				
			
			
				name3subsys = "ORl_PHONE3subsys";
				
			
			
				name3subsys = "OuuG_PHONE3subsys";
				
			
		
				name3subsys = "Ogff_PHONE3subsys";
				
			
			
				name3subsys = "USER_POSITION3subsys";
				
			
			
				name3subsys = "ORG_CODE_OKATO3subsys";
				
			
			
				name3subsys = "DEP_ADDRES3subsysS";
				

				
			name3subsys = "1USER_UID3subsys";
				
				name3subsys = "11USER_EMAIL3subsys";
			
				name3subsys = "12ORG_name3subsys3subsys";
			
				name3subsys = "212USER_LOGIN3subsys";
			
				name3subsys = "111USER_FIO3subsys";
			
			
				name3subsys = "132ORG_CODE_IOGV3subsys";
			
				name3subsys = "433ORG_PHggNE3subsys";
			
				name3subsys = "13Off_PHONE3subsys";
			
				name3subsys = "43ORG_ADDRES3subsys";
		
				name3subsys = "234ORG_PHONE3subsys";
		
				name3subsys = "55ORG_Prr3subsys";
			
				name3subsys = "432ORG_PffE3subsys";
			
				name3subsys = "ORl_PHONE3subsys";
			
				name3subsys = "46OddPHONE3subsys";
			
				name3subsys = "895OffHONE3subsys";
			
				name3subsys = "54OuuG_PHONE3subsys";
			
				name3subsys = "89Ogff_PHONE3subsys";
			
				name3subsys = "53ORrr_PHONE3subsys";
			
		
				name3subsys = "6678ORyy_PHONE3subsys";
			
				name3subsys = "543ORG_CODE_OKATO3subsys";
			
				name3subsys = "56DEP_ADDRES3subsysS";
			
				name3subsys = "890DEP_name3subsys3subsys";
			
				name3subsys = "700USER_POSITION3subsys";
				
				name3subsys = "54USER_UID3subsys";
				
				name3subsys = "780USER_EMAIL3subsys";
			
				name3subsys = "54ORG_name3subsys3subsys";
			
				name3subsys = "7890USER_LOGIN3subsys";
			
				name3subsys = "700USER_FIO3subsys";
			
			
				name3subsys = "654ORG_CODE_IOGV3subsys";
			
				name3subsys = "478ORG_PHggNE3subsys";
			
				name3subsys = "96Off_PHONE3subsys";
			
				name3subsys = "574ORG_ADDRES3subsys";
		
				name3subsys = "489ORG_PHONE3subsys";
		
				name3subsys = "065ORG_Prr3subsys";
			
				name3subsys = "457ORG_PffE3subsys";
			
				name3subsys = "87ORl_PHONE3subsys";
			
				name3subsys = "543OddPHONE3subsys";
			
				name3subsys = "478OffHONE3subsys";
			
				name3subsys = "965OuuG_PHONE3subsys";
			
				name3subsys = "457Ogff_PHONE3subsys";
			
				name3subsys = "8678ORrr_PHONE3subsys";
			
		
				name3subsys = "68ORyy_PHONE3subsys";
			
				name3subsys = "4ORG_CODE_OKATO3subsys";
			
				name3subsys = "778DEP_ADDRES3subsysS";
			
				name3subsys = "447DEP_name3subsys3subsys";
			
				name3subsys = "54USER_POSITION3subsys";
				
				if (name3subsys != null) {

					at.setName(name3subsys);
					at.setValue (objectArray3subsys[i] != null ? objectArray3subsys[i]
							.toString() : "");

					atlist3subsys.add(at);
				}
			}
			
			uat.setUid(uid3subsys);
			uat.setAttributes(atlist3subsys);

			result3subsys.add(uat); 
			resultIds.put(idRec3subsys, uat);

			if (usersIdsLine3subsys == null) {
				usersIdsLine3subsys = "'" + idRec3subsys + "'";
			} else {
				usersIdsLine3subsys = usersIdsLine3subsys + ", '" + idRec3subsys + "'";
			}
	       }
		   
		   return usersIdsLine3subsys ;
	}
}
