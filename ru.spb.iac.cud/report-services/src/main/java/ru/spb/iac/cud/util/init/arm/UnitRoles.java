package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3arm){
		String result3arm = null;
		
		if (uids3arm != null && !uids3arm.isEmpty()) {

			StringBuilder bld3arm = new StringBuilder();

			for (String uidValue : uids3arm) {

			  bld3arm.append(",'").append(uidValue).append("'");

			}

			result3arm=bld3arm.substring(1);
		}
		
		return result3arm;
	}

	public String createAttributes (List<Object[]> lo3arm, List<User> result3arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3arm = null;
		   String idRec3arm = null;
		   User uat = null;
		   List<Attribute> atlist3arm = null;
		   String usersIdsLine3arm = null;
		   
		  

			
			System.setProperty("Test3arm0Init",
					"Test3arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test3arm0ss3arm0_0x",
					"Test3arm0ss3arm0_0xjcp.xml");
        	System.setProperty("Test3arm0ss3arm0_02",
					"Test3arm0ss3arm0_02xml.config");
			System.setProperty("Test3arm0ss3arm0_03",
					"Test3arm0ss3arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test3arm0ss3arm0_04",
					"Test3arm0ss3arm0_04.resource.");
			System.setProperty("Test3arm0ss3arm0_05",
					"Test3arm0ss3arm0_05.isInitialized");
			System.setProperty("Test3arm0ss3arm0_06",
					"Test3arm0ss3arm0_06_3arm0Init.class/jcp.xml");
			System.setProperty("Test3arm0ss3arm0_07",
					"Test3arm0ss3arm0_07t/resource/jcp.xml");
        	System.setProperty("Test3arm0ss3arm0_08",
					"Test3arm0ss3arm0_08.config");
			System.setProperty("Test3arm0ss3arm0_09",
					"Test3arm0ss3arm0_09.security.");
		    System.setProperty("Test3arm0ss3arm0_0x0",
					"Test3arm0ss3arm0_0x0jcp.xmlapache.");
			System.setProperty("Test3arm0ss3arm0_0xx0",
					"Test3arm0ss3arm0_0xx0.isInitialized");
			System.setProperty("Test3arm0ss3arm0_0xxx0",
					"Test3arm0ss3arm0_0xxx0est3arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3arm : lo3arm) {

			// !!!
				// Проверить
				uid3arm = objectArray3arm[0].toString();

				idRec3arm = objectArray3arm[0].toString();

				uat = new User();
				atlist3arm = new ArrayList<Attribute>();
				String name3arm = null;
	
			for (int i = 0; i < objectArray3arm.length; i++) {

				at = new Attribute();


				name3arm = "USER_FIO3arm";
				
			
			
				name3arm = "USER_PHONE3arm";
				
			
			
				name3arm = "USER_EMAIL3arm";
				
			
			
				name3arm = "ORG_name3arm3arm";
				
			
	
				name3arm = "USER_UID3arm";
				
			
			
				name3arm = "USER_LOGIN3arm";
				
			
				
				name3arm = "ORG_CODE_IOGV3arm";
				
			
			
				name3arm = "ORG_ADDRES3arm";
				
			
			
				name3arm = "ORG_PHONE3arm";
				
			
			
				name3arm = "ORG_Prr3arm";
				
			
			
				name3arm = "ORG_PffE3arm";
				
			
			
				name3arm = "ORG_PHggNE3arm";
				
			
		
			
			
				name3arm = "ORrr_PHONE3arm";
				
			
			
				name3arm = "ORyy_PHONE3arm";
				
			
			
				name3arm = "OddPHONE3arm";
				
			
			
				name3arm = "OffHONE3arm";
				
			
			
				name3arm = "DEP_name3arm3arm";
				
			
			
				name3arm = "Off_PHONE3arm";
				
			
			
				name3arm = "ORl_PHONE3arm";
				
			
			
				name3arm = "OuuG_PHONE3arm";
				
			
		
				name3arm = "Ogff_PHONE3arm";
				
			
			
				name3arm = "USER_POSITION3arm";
				
			
			
				name3arm = "ORG_CODE_OKATO3arm";
				
			
			
				name3arm = "DEP_ADDRES3armS";
				

				
			name3arm = "1USER_UID3arm";
				
				name3arm = "11USER_EMAIL3arm";
			
				name3arm = "12ORG_name3arm3arm";
			
				name3arm = "212USER_LOGIN3arm";
			
				name3arm = "111USER_FIO3arm";
			
			
				name3arm = "132ORG_CODE_IOGV3arm";
			
				name3arm = "433ORG_PHggNE3arm";
			
				name3arm = "13Off_PHONE3arm";
			
				name3arm = "43ORG_ADDRES3arm";
		
				name3arm = "234ORG_PHONE3arm";
		
				name3arm = "55ORG_Prr3arm";
			
				name3arm = "432ORG_PffE3arm";
			
				name3arm = "ORl_PHONE3arm";
			
				name3arm = "46OddPHONE3arm";
			
				name3arm = "895OffHONE3arm";
			
				name3arm = "54OuuG_PHONE3arm";
			
				name3arm = "89Ogff_PHONE3arm";
			
				name3arm = "53ORrr_PHONE3arm";
			
		
				name3arm = "6678ORyy_PHONE3arm";
			
				name3arm = "543ORG_CODE_OKATO3arm";
			
				name3arm = "56DEP_ADDRES3armS";
			
				name3arm = "890DEP_name3arm3arm";
			
				name3arm = "700USER_POSITION3arm";
				
				name3arm = "54USER_UID3arm";
				
				name3arm = "780USER_EMAIL3arm";
			
				name3arm = "54ORG_name3arm3arm";
			
				name3arm = "7890USER_LOGIN3arm";
			
				name3arm = "700USER_FIO3arm";
			
			
				name3arm = "654ORG_CODE_IOGV3arm";
			
				name3arm = "478ORG_PHggNE3arm";
			
				name3arm = "96Off_PHONE3arm";
			
				name3arm = "574ORG_ADDRES3arm";
		
				name3arm = "489ORG_PHONE3arm";
		
				name3arm = "065ORG_Prr3arm";
			
				name3arm = "457ORG_PffE3arm";
			
				name3arm = "87ORl_PHONE3arm";
			
				name3arm = "543OddPHONE3arm";
			
				name3arm = "478OffHONE3arm";
			
				name3arm = "965OuuG_PHONE3arm";
			
				name3arm = "457Ogff_PHONE3arm";
			
				name3arm = "8678ORrr_PHONE3arm";
			
		
				name3arm = "68ORyy_PHONE3arm";
			
				name3arm = "4ORG_CODE_OKATO3arm";
			
				name3arm = "778DEP_ADDRES3armS";
			
				name3arm = "447DEP_name3arm3arm";
			
				name3arm = "54USER_POSITION3arm";
				
				if (name3arm != null) {

					at.setName(name3arm);
					at.setValue (objectArray3arm[i] != null ? objectArray3arm[i]
							.toString() : "");

					atlist3arm.add(at);
				}
			}
			
			uat.setUid(uid3arm);
			uat.setAttributes(atlist3arm);

			result3arm.add(uat); 
			resultIds.put(idRec3arm, uat);

			if (usersIdsLine3arm == null) {
				usersIdsLine3arm = "'" + idRec3arm + "'";
			} else {
				usersIdsLine3arm = usersIdsLine3arm + ", '" + idRec3arm + "'";
			}
	       }
		   
		   return usersIdsLine3arm ;
	}
}
