package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3groupsys){
		String result3groupsys = null;
		
		if (uids3groupsys != null && !uids3groupsys.isEmpty()) {

			StringBuilder bld3groupsys = new StringBuilder();

			for (String uidValue : uids3groupsys) {

			  bld3groupsys.append(",'").append(uidValue).append("'");

			}

			result3groupsys=bld3groupsys.substring(1);
		}
		
		return result3groupsys;
	}

	public String createAttributes (List<Object[]> lo3groupsys, List<User> result3groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3groupsys = null;
		   String idRec3groupsys = null;
		   User uat = null;
		   List<Attribute> atlist3groupsys = null;
		   String usersIdsLine3groupsys = null;
		   
		  

			
			System.setProperty("Test3groupsys0Init",
					"Test3groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test3groupsys0ss3groupsys0_0x",
					"Test3groupsys0ss3groupsys0_0xjcp.xml");
        	System.setProperty("Test3groupsys0ss3groupsys0_02",
					"Test3groupsys0ss3groupsys0_02xml.config");
			System.setProperty("Test3groupsys0ss3groupsys0_03",
					"Test3groupsys0ss3groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test3groupsys0ss3groupsys0_04",
					"Test3groupsys0ss3groupsys0_04.resource.");
			System.setProperty("Test3groupsys0ss3groupsys0_05",
					"Test3groupsys0ss3groupsys0_05.isInitialized");
			System.setProperty("Test3groupsys0ss3groupsys0_06",
					"Test3groupsys0ss3groupsys0_06_3groupsys0Init.class/jcp.xml");
			System.setProperty("Test3groupsys0ss3groupsys0_07",
					"Test3groupsys0ss3groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test3groupsys0ss3groupsys0_08",
					"Test3groupsys0ss3groupsys0_08.config");
			System.setProperty("Test3groupsys0ss3groupsys0_09",
					"Test3groupsys0ss3groupsys0_09.security.");
		    System.setProperty("Test3groupsys0ss3groupsys0_0x0",
					"Test3groupsys0ss3groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test3groupsys0ss3groupsys0_0xx0",
					"Test3groupsys0ss3groupsys0_0xx0.isInitialized");
			System.setProperty("Test3groupsys0ss3groupsys0_0xxx0",
					"Test3groupsys0ss3groupsys0_0xxx0est3groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3groupsys : lo3groupsys) {

			// !!!
				// Проверить
				uid3groupsys = objectArray3groupsys[0].toString();

				idRec3groupsys = objectArray3groupsys[0].toString();

				uat = new User();
				atlist3groupsys = new ArrayList<Attribute>();
				String name3groupsys = null;
	
			for (int i = 0; i < objectArray3groupsys.length; i++) {

				at = new Attribute();


				name3groupsys = "USER_FIO3groupsys";
				
			
			
				name3groupsys = "USER_PHONE3groupsys";
				
			
			
				name3groupsys = "USER_EMAIL3groupsys";
				
			
			
				name3groupsys = "ORG_name3groupsys3groupsys";
				
			
	
				name3groupsys = "USER_UID3groupsys";
				
			
			
				name3groupsys = "USER_LOGIN3groupsys";
				
			
				
				name3groupsys = "ORG_CODE_IOGV3groupsys";
				
			
			
				name3groupsys = "ORG_ADDRES3groupsys";
				
			
			
				name3groupsys = "ORG_PHONE3groupsys";
				
			
			
				name3groupsys = "ORG_Prr3groupsys";
				
			
			
				name3groupsys = "ORG_PffE3groupsys";
				
			
			
				name3groupsys = "ORG_PHggNE3groupsys";
				
			
		
			
			
				name3groupsys = "ORrr_PHONE3groupsys";
				
			
			
				name3groupsys = "ORyy_PHONE3groupsys";
				
			
			
				name3groupsys = "OddPHONE3groupsys";
				
			
			
				name3groupsys = "OffHONE3groupsys";
				
			
			
				name3groupsys = "DEP_name3groupsys3groupsys";
				
			
			
				name3groupsys = "Off_PHONE3groupsys";
				
			
			
				name3groupsys = "ORl_PHONE3groupsys";
				
			
			
				name3groupsys = "OuuG_PHONE3groupsys";
				
			
		
				name3groupsys = "Ogff_PHONE3groupsys";
				
			
			
				name3groupsys = "USER_POSITION3groupsys";
				
			
			
				name3groupsys = "ORG_CODE_OKATO3groupsys";
				
			
			
				name3groupsys = "DEP_ADDRES3groupsysS";
				

				
			name3groupsys = "1USER_UID3groupsys";
				
				name3groupsys = "11USER_EMAIL3groupsys";
			
				name3groupsys = "12ORG_name3groupsys3groupsys";
			
				name3groupsys = "212USER_LOGIN3groupsys";
			
				name3groupsys = "111USER_FIO3groupsys";
			
			
				name3groupsys = "132ORG_CODE_IOGV3groupsys";
			
				name3groupsys = "433ORG_PHggNE3groupsys";
			
				name3groupsys = "13Off_PHONE3groupsys";
			
				name3groupsys = "43ORG_ADDRES3groupsys";
		
				name3groupsys = "234ORG_PHONE3groupsys";
		
				name3groupsys = "55ORG_Prr3groupsys";
			
				name3groupsys = "432ORG_PffE3groupsys";
			
				name3groupsys = "ORl_PHONE3groupsys";
			
				name3groupsys = "46OddPHONE3groupsys";
			
				name3groupsys = "895OffHONE3groupsys";
			
				name3groupsys = "54OuuG_PHONE3groupsys";
			
				name3groupsys = "89Ogff_PHONE3groupsys";
			
				name3groupsys = "53ORrr_PHONE3groupsys";
			
		
				name3groupsys = "6678ORyy_PHONE3groupsys";
			
				name3groupsys = "543ORG_CODE_OKATO3groupsys";
			
				name3groupsys = "56DEP_ADDRES3groupsysS";
			
				name3groupsys = "890DEP_name3groupsys3groupsys";
			
				name3groupsys = "700USER_POSITION3groupsys";
				
				name3groupsys = "54USER_UID3groupsys";
				
				name3groupsys = "780USER_EMAIL3groupsys";
			
				name3groupsys = "54ORG_name3groupsys3groupsys";
			
				name3groupsys = "7890USER_LOGIN3groupsys";
			
				name3groupsys = "700USER_FIO3groupsys";
			
			
				name3groupsys = "654ORG_CODE_IOGV3groupsys";
			
				name3groupsys = "478ORG_PHggNE3groupsys";
			
				name3groupsys = "96Off_PHONE3groupsys";
			
				name3groupsys = "574ORG_ADDRES3groupsys";
		
				name3groupsys = "489ORG_PHONE3groupsys";
		
				name3groupsys = "065ORG_Prr3groupsys";
			
				name3groupsys = "457ORG_PffE3groupsys";
			
				name3groupsys = "87ORl_PHONE3groupsys";
			
				name3groupsys = "543OddPHONE3groupsys";
			
				name3groupsys = "478OffHONE3groupsys";
			
				name3groupsys = "965OuuG_PHONE3groupsys";
			
				name3groupsys = "457Ogff_PHONE3groupsys";
			
				name3groupsys = "8678ORrr_PHONE3groupsys";
			
		
				name3groupsys = "68ORyy_PHONE3groupsys";
			
				name3groupsys = "4ORG_CODE_OKATO3groupsys";
			
				name3groupsys = "778DEP_ADDRES3groupsysS";
			
				name3groupsys = "447DEP_name3groupsys3groupsys";
			
				name3groupsys = "54USER_POSITION3groupsys";
				
				if (name3groupsys != null) {

					at.setName(name3groupsys);
					at.setValue (objectArray3groupsys[i] != null ? objectArray3groupsys[i]
							.toString() : "");

					atlist3groupsys.add(at);
				}
			}
			
			uat.setUid(uid3groupsys);
			uat.setAttributes(atlist3groupsys);

			result3groupsys.add(uat); 
			resultIds.put(idRec3groupsys, uat);

			if (usersIdsLine3groupsys == null) {
				usersIdsLine3groupsys = "'" + idRec3groupsys + "'";
			} else {
				usersIdsLine3groupsys = usersIdsLine3groupsys + ", '" + idRec3groupsys + "'";
			}
	       }
		   
		   return usersIdsLine3groupsys ;
	}
}
