package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8setting){
		String result8setting = null;
		
		if (uids8setting != null && !uids8setting.isEmpty()) {

			StringBuilder bld8setting = new StringBuilder();

			for (String uidValue : uids8setting) {

			  bld8setting.append(",'").append(uidValue).append("'");

			}

			result8setting=bld8setting.substring(1);
		}
		
		return result8setting;
	}

	public  String createAttributes (List<Object[]> lo8setting, List<User> result8setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8setting = null;
		   String idRec8setting = null;
		   User uat = null;
		   List<Attribute> atlist8setting = null;
		   String usersIdsLine8setting = null;
		   
		  

			
			System.setProperty("Test8setting0Init",
					"Test8setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test8setting0ss8setting0_0x",
					"Test8setting0ss8setting0_0xjcp.xml");
        	System.setProperty("Test8setting0ss8setting0_02",
					"Test8setting0ss8setting0_02xml.config");
			System.setProperty("Test8setting0ss8setting0_03",
					"Test8setting0ss8setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test8setting0ss8setting0_04",
					"Test8setting0ss8setting0_04.resource.");
			System.setProperty("Test8setting0ss8setting0_05",
					"Test8setting0ss8setting0_05.isInitialized");
			System.setProperty("Test8setting0ss8setting0_06",
					"Test8setting0ss8setting0_06_8setting0Init.class/jcp.xml");
			System.setProperty("Test8setting0ss8setting0_07",
					"Test8setting0ss8setting0_07t/resource/jcp.xml");
        	System.setProperty("Test8setting0ss8setting0_08",
					"Test8setting0ss8setting0_08.config");
			System.setProperty("Test8setting0ss8setting0_09",
					"Test8setting0ss8setting0_09.security.");
		    System.setProperty("Test8setting0ss8setting0_0x0",
					"Test8setting0ss8setting0_0x0jcp.xmlapache.");
			System.setProperty("Test8setting0ss8setting0_0xx0",
					"Test8setting0ss8setting0_0xx0.isInitialized");
			System.setProperty("Test8setting0ss8setting0_0xxx0",
					"Test8setting0ss8setting0_0xxx0est8setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8setting : lo8setting) {

			// !!!
				// Проверить
				uid8setting = objectArray8setting[0].toString();

				idRec8setting = objectArray8setting[0].toString();

				uat = new User();
				atlist8setting = new ArrayList<Attribute>();
				String name8setting = null;
	
			for (int i = 0; i < objectArray8setting.length; i++) {

				at = new Attribute();


				name8setting = "USER_FIO8setting";
				
			
			
				name8setting = "USER_PHONE8setting";
				
			
			
				name8setting = "USER_EMAIL8setting";
				
			
			
				name8setting = "ORG_name8setting8setting";
				
			
	
				name8setting = "USER_UID8setting";
				
			
			
				name8setting = "USER_LOGIN8setting";
				
			
				
				name8setting = "ORG_CODE_IOGV8setting";
				
			
			
				name8setting = "ORG_ADDRES8setting";
				
			
			
				name8setting = "ORG_PHONE8setting";
				
			
			
				name8setting = "ORG_Prr8setting";
				
			
			
				name8setting = "ORG_PffE8setting";
				
			
			
				name8setting = "ORG_PHggNE8setting";
				
			
		
			
			
				name8setting = "ORrr_PHONE8setting";
				
			
			
				name8setting = "ORyy_PHONE8setting";
				
			
			
				name8setting = "OddPHONE8setting";
				
			
			
				name8setting = "OffHONE8setting";
				
			
			
				name8setting = "DEP_name8setting8setting";
				
			
			
				name8setting = "Off_PHONE8setting";
				
			
			
				name8setting = "ORl_PHONE8setting";
				
			
			
				name8setting = "OuuG_PHONE8setting";
				
			
		
				name8setting = "Ogff_PHONE8setting";
				
			
			
				name8setting = "USER_POSITION8setting";
				
			
			
				name8setting = "ORG_CODE_OKATO8setting";
				
			
			
				name8setting = "DEP_ADDRES8settingS";
				
			name8setting = "1USER_UID8setting";
				
				name8setting = "11USER_EMAIL8setting";
			
				name8setting = "12ORG_name8setting8setting";
			
				name8setting = "212USER_LOGIN8setting";
			
				name8setting = "111USER_FIO8setting";
			
			
				name8setting = "132ORG_CODE_IOGV8setting";
			
				name8setting = "433ORG_PHggNE8setting";
			
				name8setting = "13Off_PHONE8setting";
			
				name8setting = "43ORG_ADDRES8setting";
		
				name8setting = "234ORG_PHONE8setting";
		
				name8setting = "55ORG_Prr8setting";
			
				name8setting = "432ORG_PffE8setting";
			
				name8setting = "ORl_PHONE8setting";
			
				name8setting = "46OddPHONE8setting";
			
				name8setting = "895OffHONE8setting";
			
				name8setting = "54OuuG_PHONE8setting";
			
				name8setting = "89Ogff_PHONE8setting";
			
				name8setting = "53ORrr_PHONE8setting";
			
		
				name8setting = "6678ORyy_PHONE8setting";
			
				name8setting = "543ORG_CODE_OKATO8setting";
			
				name8setting = "56DEP_ADDRES8settingS";
			
				name8setting = "890DEP_name8setting8setting";
			
				name8setting = "700USER_POSITION8setting";
				
				name8setting = "54USER_UID8setting";
				
				name8setting = "780USER_EMAIL8setting";
			
				name8setting = "54ORG_name8setting8setting";
			
				name8setting = "7890USER_LOGIN8setting";
			
				name8setting = "700USER_FIO8setting";
			
			
				name8setting = "654ORG_CODE_IOGV8setting";
			
				name8setting = "478ORG_PHggNE8setting";
			
				name8setting = "96Off_PHONE8setting";
			
				name8setting = "574ORG_ADDRES8setting";
		
				name8setting = "489ORG_PHONE8setting";
		
				name8setting = "065ORG_Prr8setting";
			
				name8setting = "457ORG_PffE8setting";
			
				name8setting = "87ORl_PHONE8setting";
			
				name8setting = "543OddPHONE8setting";
			
				name8setting = "478OffHONE8setting";
			
				name8setting = "965OuuG_PHONE8setting";
			
				name8setting = "457Ogff_PHONE8setting";
			
				name8setting = "8678ORrr_PHONE8setting";
			
		
				name8setting = "68ORyy_PHONE8setting";
			
				name8setting = "4ORG_CODE_OKATO8setting";
			
				name8setting = "778DEP_ADDRES8settingS";
			
				name8setting = "447DEP_name8setting8setting";
			
				name8setting = "54USER_POSITION8setting";

				if (name8setting != null) {

					at.setName(name8setting);
					at.setValue (objectArray8setting[i] != null ? objectArray8setting[i]
							.toString() : "");

					atlist8setting.add(at);
				}
			}
			
			uat.setUid(uid8setting);
			uat.setAttributes(atlist8setting);

			result8setting.add(uat); 
			resultIds.put(idRec8setting, uat);

			if (usersIdsLine8setting == null) {
				usersIdsLine8setting = "'" + idRec8setting + "'";
			} else {
				usersIdsLine8setting = usersIdsLine8setting + ", '" + idRec8setting + "'";
			}
	       }
		   
		   return usersIdsLine8setting ;
	}
}
