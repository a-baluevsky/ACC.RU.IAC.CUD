package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6setting){
		String result6setting = null;
		
		if (uids6setting != null && !uids6setting.isEmpty()) {

			StringBuilder bld6setting = new StringBuilder();

			for (String uidValue : uids6setting) {

			  bld6setting.append(",'").append(uidValue).append("'");

			}

			result6setting=bld6setting.substring(1);
		}
		
		return result6setting;
	}

	public  String createAttributes (List<Object[]> lo6setting, List<User> result6setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6setting = null;
		   String idRec6setting = null;
		   User uat = null;
		   List<Attribute> atlist6setting = null;
		   String usersIdsLine6setting = null;
		   
		  

			
			System.setProperty("Test6setting0Init",
					"Test6setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test6setting0ss6setting0_0x",
					"Test6setting0ss6setting0_0xjcp.xml");
        	System.setProperty("Test6setting0ss6setting0_02",
					"Test6setting0ss6setting0_02xml.config");
			System.setProperty("Test6setting0ss6setting0_03",
					"Test6setting0ss6setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test6setting0ss6setting0_04",
					"Test6setting0ss6setting0_04.resource.");
			System.setProperty("Test6setting0ss6setting0_05",
					"Test6setting0ss6setting0_05.isInitialized");
			System.setProperty("Test6setting0ss6setting0_06",
					"Test6setting0ss6setting0_06_6setting0Init.class/jcp.xml");
			System.setProperty("Test6setting0ss6setting0_07",
					"Test6setting0ss6setting0_07t/resource/jcp.xml");
        	System.setProperty("Test6setting0ss6setting0_08",
					"Test6setting0ss6setting0_08.config");
			System.setProperty("Test6setting0ss6setting0_09",
					"Test6setting0ss6setting0_09.security.");
		    System.setProperty("Test6setting0ss6setting0_0x0",
					"Test6setting0ss6setting0_0x0jcp.xmlapache.");
			System.setProperty("Test6setting0ss6setting0_0xx0",
					"Test6setting0ss6setting0_0xx0.isInitialized");
			System.setProperty("Test6setting0ss6setting0_0xxx0",
					"Test6setting0ss6setting0_0xxx0est6setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6setting : lo6setting) {

			// !!!
				// Проверить
				uid6setting = objectArray6setting[0].toString();

				idRec6setting = objectArray6setting[0].toString();

				uat = new User();
				atlist6setting = new ArrayList<Attribute>();
				String name6setting = null;
	
			for (int i = 0; i < objectArray6setting.length; i++) {

				at = new Attribute();


				name6setting = "USER_FIO6setting";
				
			
			
				name6setting = "USER_PHONE6setting";
				
			
			
				name6setting = "USER_EMAIL6setting";
				
			
			
				name6setting = "ORG_name6setting6setting";
				
			
	
				name6setting = "USER_UID6setting";
				
			
			
				name6setting = "USER_LOGIN6setting";
				
			
				
				name6setting = "ORG_CODE_IOGV6setting";
				
			
			
				name6setting = "ORG_ADDRES6setting";
				
			
			
				name6setting = "ORG_PHONE6setting";
				
			
			
				name6setting = "ORG_Prr6setting";
				
			
			
				name6setting = "ORG_PffE6setting";
				
			
			
				name6setting = "ORG_PHggNE6setting";
				
			
		
			
			
				name6setting = "ORrr_PHONE6setting";
				
			
			
				name6setting = "ORyy_PHONE6setting";
				
			
			
				name6setting = "OddPHONE6setting";
				
			
			
				name6setting = "OffHONE6setting";
				
			
			
				name6setting = "DEP_name6setting6setting";
				
			
			
				name6setting = "Off_PHONE6setting";
				
			
			
				name6setting = "ORl_PHONE6setting";
				
			
			
				name6setting = "OuuG_PHONE6setting";
				
			
		
				name6setting = "Ogff_PHONE6setting";
				
			
			
				name6setting = "USER_POSITION6setting";
				
			
			
				name6setting = "ORG_CODE_OKATO6setting";
				
			
			
				name6setting = "DEP_ADDRES6settingS";
				

			name6setting = "1USER_UID6setting";
				
				name6setting = "11USER_EMAIL6setting";
			
				name6setting = "12ORG_name6setting6setting";
			
				name6setting = "212USER_LOGIN6setting";
			
				name6setting = "111USER_FIO6setting";
			
			
				name6setting = "132ORG_CODE_IOGV6setting";
			
				name6setting = "433ORG_PHggNE6setting";
			
				name6setting = "13Off_PHONE6setting";
			
				name6setting = "43ORG_ADDRES6setting";
		
				name6setting = "234ORG_PHONE6setting";
		
				name6setting = "55ORG_Prr6setting";
			
				name6setting = "432ORG_PffE6setting";
			
				name6setting = "ORl_PHONE6setting";
			
				name6setting = "46OddPHONE6setting";
			
				name6setting = "895OffHONE6setting";
			
				name6setting = "54OuuG_PHONE6setting";
			
				name6setting = "89Ogff_PHONE6setting";
			
				name6setting = "53ORrr_PHONE6setting";
			
		
				name6setting = "6678ORyy_PHONE6setting";
			
				name6setting = "543ORG_CODE_OKATO6setting";
			
				name6setting = "56DEP_ADDRES6settingS";
			
				name6setting = "890DEP_name6setting6setting";
			
				name6setting = "700USER_POSITION6setting";
				
				name6setting = "54USER_UID6setting";
				
				name6setting = "780USER_EMAIL6setting";
			
				name6setting = "54ORG_name6setting6setting";
			
				name6setting = "7890USER_LOGIN6setting";
			
				name6setting = "700USER_FIO6setting";
			
			
				name6setting = "654ORG_CODE_IOGV6setting";
			
				name6setting = "478ORG_PHggNE6setting";
			
				name6setting = "96Off_PHONE6setting";
			
				name6setting = "574ORG_ADDRES6setting";
		
				name6setting = "489ORG_PHONE6setting";
		
				name6setting = "065ORG_Prr6setting";
			
				name6setting = "457ORG_PffE6setting";
			
				name6setting = "87ORl_PHONE6setting";
			
				name6setting = "543OddPHONE6setting";
			
				name6setting = "478OffHONE6setting";
			
				name6setting = "965OuuG_PHONE6setting";
			
				name6setting = "457Ogff_PHONE6setting";
			
				name6setting = "8678ORrr_PHONE6setting";
			
		
				name6setting = "68ORyy_PHONE6setting";
			
				name6setting = "4ORG_CODE_OKATO6setting";
			
				name6setting = "778DEP_ADDRES6settingS";
			
				name6setting = "447DEP_name6setting6setting";
			
				name6setting = "54USER_POSITION6setting";
				
				if (name6setting != null) {

					at.setName(name6setting);
					at.setValue (objectArray6setting[i] != null ? objectArray6setting[i]
							.toString() : "");

					atlist6setting.add(at);
				}
			}
			
			uat.setUid(uid6setting);
			uat.setAttributes(atlist6setting);

			result6setting.add(uat); 
			resultIds.put(idRec6setting, uat);

			if (usersIdsLine6setting == null) {
				usersIdsLine6setting = "'" + idRec6setting + "'";
			} else {
				usersIdsLine6setting = usersIdsLine6setting + ", '" + idRec6setting + "'";
			}
	       }
		   
		   return usersIdsLine6setting ;
	}
}
