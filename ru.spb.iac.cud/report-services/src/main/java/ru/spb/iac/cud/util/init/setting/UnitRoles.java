package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3setting){
		String result3setting = null;
		
		if (uids3setting != null && !uids3setting.isEmpty()) {

			StringBuilder bld3setting = new StringBuilder();
 for (String uidValue : uids3setting) {
 if (bld3setting.length()==0) {
 bld3setting.append("'" + uidValue + "'");
 }else{
 bld3setting.append(",'" + uidValue + "'");
 }
}
 result3setting=bld3setting.toString();
		}
		
		return result3setting;
	}

	public String createAttributes (List<Object[]> lo3setting, List<User> result3setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3setting = null;
		   String idRec3setting = null;
		   User uat = null;
		   List<Attribute> atlist3setting = null;
		   String usersIdsLine3setting = null;
		   
		  

			
			System.setProperty("Test3setting0Init",
					"Test3setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test3setting0ss3setting0_0x",
					"Test3setting0ss3setting0_0xjcp.xml");
        	System.setProperty("Test3setting0ss3setting0_02",
					"Test3setting0ss3setting0_02xml.config");
			System.setProperty("Test3setting0ss3setting0_03",
					"Test3setting0ss3setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test3setting0ss3setting0_04",
					"Test3setting0ss3setting0_04.resource.");
			System.setProperty("Test3setting0ss3setting0_05",
					"Test3setting0ss3setting0_05.isInitialized");
			System.setProperty("Test3setting0ss3setting0_06",
					"Test3setting0ss3setting0_06_3setting0Init.class/jcp.xml");
			System.setProperty("Test3setting0ss3setting0_07",
					"Test3setting0ss3setting0_07t/resource/jcp.xml");
        	System.setProperty("Test3setting0ss3setting0_08",
					"Test3setting0ss3setting0_08.config");
			System.setProperty("Test3setting0ss3setting0_09",
					"Test3setting0ss3setting0_09.security.");
		    System.setProperty("Test3setting0ss3setting0_0x0",
					"Test3setting0ss3setting0_0x0jcp.xmlapache.");
			System.setProperty("Test3setting0ss3setting0_0xx0",
					"Test3setting0ss3setting0_0xx0.isInitialized");
			System.setProperty("Test3setting0ss3setting0_0xxx0",
					"Test3setting0ss3setting0_0xxx0est3setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3setting : lo3setting) {

			// !!!
				// Проверить
				uid3setting = objectArray3setting[0].toString();

				idRec3setting = objectArray3setting[0].toString();

				uat = new User();
				atlist3setting = new ArrayList<Attribute>();
				String name3setting = null;
	
			for (int i = 0; i < objectArray3setting.length; i++) {

				at = new Attribute();


				name3setting = "USER_FIO3setting";
				
			
			
				name3setting = "USER_PHONE3setting";
				
			
			
				name3setting = "USER_EMAIL3setting";
				
			
			
				name3setting = "ORG_name3setting3setting";
				
			
	
				name3setting = "USER_UID3setting";
				
			
			
				name3setting = "USER_LOGIN3setting";
				
			
				
				name3setting = "ORG_CODE_IOGV3setting";
				
			
			
				name3setting = "ORG_ADDRES3setting";
				
			
			
				name3setting = "ORG_PHONE3setting";
				
			
			
				name3setting = "ORG_Prr3setting";
				
			
			
				name3setting = "ORG_PffE3setting";
				
			
			
				name3setting = "ORG_PHggNE3setting";
				
			
		
			
			
				name3setting = "ORrr_PHONE3setting";
				
			
			
				name3setting = "ORyy_PHONE3setting";
				
			
			
				name3setting = "OddPHONE3setting";
				
			
			
				name3setting = "OffHONE3setting";
				
			
			
				name3setting = "DEP_name3setting3setting";
				
			
			
				name3setting = "Off_PHONE3setting";
				
			
			
				name3setting = "ORl_PHONE3setting";
				
			
			
				name3setting = "OuuG_PHONE3setting";
				
			
		
				name3setting = "Ogff_PHONE3setting";
				
			
			
				name3setting = "USER_POSITION3setting";
				
			
			
				name3setting = "ORG_CODE_OKATO3setting";
				
			
			
				name3setting = "DEP_ADDRES3settingS";
				

				
			name3setting = "1USER_UID3setting";
				
				name3setting = "11USER_EMAIL3setting";
			
				name3setting = "12ORG_name3setting3setting";
			
				name3setting = "212USER_LOGIN3setting";
			
				name3setting = "111USER_FIO3setting";
			
			
				name3setting = "132ORG_CODE_IOGV3setting";
			
				name3setting = "433ORG_PHggNE3setting";
			
				name3setting = "13Off_PHONE3setting";
			
				name3setting = "43ORG_ADDRES3setting";
		
				name3setting = "234ORG_PHONE3setting";
		
				name3setting = "55ORG_Prr3setting";
			
				name3setting = "432ORG_PffE3setting";
			
				name3setting = "ORl_PHONE3setting";
			
				name3setting = "46OddPHONE3setting";
			
				name3setting = "895OffHONE3setting";
			
				name3setting = "54OuuG_PHONE3setting";
			
				name3setting = "89Ogff_PHONE3setting";
			
				name3setting = "53ORrr_PHONE3setting";
			
		
				name3setting = "6678ORyy_PHONE3setting";
			
				name3setting = "543ORG_CODE_OKATO3setting";
			
				name3setting = "56DEP_ADDRES3settingS";
			
				name3setting = "890DEP_name3setting3setting";
			
				name3setting = "700USER_POSITION3setting";
				
				name3setting = "54USER_UID3setting";
				
				name3setting = "780USER_EMAIL3setting";
			
				name3setting = "54ORG_name3setting3setting";
			
				name3setting = "7890USER_LOGIN3setting";
			
				name3setting = "700USER_FIO3setting";
			
			
				name3setting = "654ORG_CODE_IOGV3setting";
			
				name3setting = "478ORG_PHggNE3setting";
			
				name3setting = "96Off_PHONE3setting";
			
				name3setting = "574ORG_ADDRES3setting";
		
				name3setting = "489ORG_PHONE3setting";
		
				name3setting = "065ORG_Prr3setting";
			
				name3setting = "457ORG_PffE3setting";
			
				name3setting = "87ORl_PHONE3setting";
			
				name3setting = "543OddPHONE3setting";
			
				name3setting = "478OffHONE3setting";
			
				name3setting = "965OuuG_PHONE3setting";
			
				name3setting = "457Ogff_PHONE3setting";
			
				name3setting = "8678ORrr_PHONE3setting";
			
		
				name3setting = "68ORyy_PHONE3setting";
			
				name3setting = "4ORG_CODE_OKATO3setting";
			
				name3setting = "778DEP_ADDRES3settingS";
			
				name3setting = "447DEP_name3setting3setting";
			
				name3setting = "54USER_POSITION3setting";
				
				if (name3setting != null) {

					at.setName(name3setting);
					at.setValue (objectArray3setting[i] != null ? objectArray3setting[i]
							.toString() : "");

					atlist3setting.add(at);
				}
			}
			
			uat.setUid(uid3setting);
			uat.setAttributes(atlist3setting);

			result3setting.add(uat); 
			resultIds.put(idRec3setting, uat);

			if (usersIdsLine3setting == null) {
				usersIdsLine3setting = "'" + idRec3setting + "'";
			} else {
				usersIdsLine3setting = usersIdsLine3setting + ", '" + idRec3setting + "'";
			}
	       }
		   
		   return usersIdsLine3setting ;
	}
}
