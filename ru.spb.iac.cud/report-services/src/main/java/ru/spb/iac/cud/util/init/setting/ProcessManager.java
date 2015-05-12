package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1setting){
		String result1setting = null;
		
		if (uids1setting != null && !uids1setting.isEmpty()) {

			StringBuilder bld1setting = new StringBuilder();

			for (String uidValue : uids1setting) {

			  bld1setting.append(",'").append(uidValue).append("'");

			}

			result1setting=bld1setting.substring(1);
		}
		
		return result1setting;
	}

	public String createAttributes (List<Object[]> lo1setting, List<User> result1setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1setting = null;
		   String idRec1setting = null;
		   User uat = null;
		   List<Attribute> atlist1setting = null;
		   String usersIdsLine1setting = null;
		   
		  

			
			System.setProperty("Test1setting0Init",
					"Test1setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test1setting0ss1setting0_0x",
					"Test1setting0ss1setting0_0xjcp.xml");
        	System.setProperty("Test1setting0ss1setting0_02",
					"Test1setting0ss1setting0_02xml.config");
			System.setProperty("Test1setting0ss1setting0_03",
					"Test1setting0ss1setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test1setting0ss1setting0_04",
					"Test1setting0ss1setting0_04.resource.");
			System.setProperty("Test1setting0ss1setting0_05",
					"Test1setting0ss1setting0_05.isInitialized");
			System.setProperty("Test1setting0ss1setting0_06",
					"Test1setting0ss1setting0_06_1setting0Init.class/jcp.xml");
			System.setProperty("Test1setting0ss1setting0_07",
					"Test1setting0ss1setting0_07t/resource/jcp.xml");
        	System.setProperty("Test1setting0ss1setting0_08",
					"Test1setting0ss1setting0_08.config");
			System.setProperty("Test1setting0ss1setting0_09",
					"Test1setting0ss1setting0_09.security.");
		    System.setProperty("Test1setting0ss1setting0_0x0",
					"Test1setting0ss1setting0_0x0jcp.xmlapache.");
			System.setProperty("Test1setting0ss1setting0_0xx0",
					"Test1setting0ss1setting0_0xx0.isInitialized");
			System.setProperty("Test1setting0ss1setting0_0xxx0",
					"Test1setting0ss1setting0_0xxx0est1setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1setting : lo1setting) {

			// !!!
				// Проверить
				uid1setting = objectArray1setting[0].toString();

				idRec1setting = objectArray1setting[0].toString();

				uat = new User();
				atlist1setting = new ArrayList<Attribute>();
				String name1setting = null;
	
			for (int i = 0; i < objectArray1setting.length; i++) {

				at = new Attribute();

				

				
					name1setting = "USER_FIO1setting";
					
				
				
					name1setting = "USER_PHONE1setting";
					
				
				
					name1setting = "USER_EMAIL1setting";
					
				
				
					name1setting = "ORG_name1setting1setting";
					
				
		
					name1setting = "USER_UID1setting";
					
				
				
					name1setting = "USER_LOGIN1setting";
					
				
					
					name1setting = "ORG_CODE_IOGV1setting";
					
				
				
					name1setting = "ORG_ADDRES1setting";
					
				
				
					name1setting = "ORG_PHONE1setting";
					
				
				
					name1setting = "ORG_Prr1setting";
					
				
				
					name1setting = "ORG_PffE1setting";
					
				
				
					name1setting = "ORG_PHggNE1setting";
					
				
			
				
				
					name1setting = "ORrr_PHONE1setting";
					
				
				
					name1setting = "ORyy_PHONE1setting";
					
				
				
					name1setting = "OddPHONE1setting";
					
				
				
					name1setting = "OffHONE1setting";
					
				
				
					name1setting = "DEP_name1setting1setting";
					
				
				
					name1setting = "Off_PHONE1setting";
					
				
				
					name1setting = "ORl_PHONE1setting";
					
				
				
					name1setting = "OuuG_PHONE1setting";
					
				
			
					name1setting = "Ogff_PHONE1setting";
					
				
				
					name1setting = "USER_POSITION1setting";
					
				
				
					name1setting = "ORG_CODE_OKATO1setting";
					
				
				
					name1setting = "DEP_ADDRES1settingS";
					
				
					name1setting = "1USER_UID1setting";
					
					name1setting = "11USER_EMAIL1setting";
				
					name1setting = "12ORG_name1setting1setting";
				
					name1setting = "212USER_LOGIN1setting";
				
					name1setting = "111USER_FIO1setting";
				
				
					name1setting = "132ORG_CODE_IOGV1setting";
				
					name1setting = "433ORG_PHggNE1setting";
				
					name1setting = "13Off_PHONE1setting";
				
					name1setting = "43ORG_ADDRES1setting";
			
					name1setting = "234ORG_PHONE1setting";
			
					name1setting = "55ORG_Prr1setting";
				
					name1setting = "432ORG_PffE1setting";
				
					name1setting = "ORl_PHONE1setting";
				
					name1setting = "46OddPHONE1setting";
				
					name1setting = "895OffHONE1setting";
				
					name1setting = "54OuuG_PHONE1setting";
				
					name1setting = "89Ogff_PHONE1setting";
				
					name1setting = "53ORrr_PHONE1setting";
				
			
					name1setting = "6678ORyy_PHONE1setting";
				
					name1setting = "543ORG_CODE_OKATO1setting";
				
					name1setting = "56DEP_ADDRES1settingS";
				
					name1setting = "890DEP_name1setting1setting";
				
					name1setting = "700USER_POSITION1setting";
					
					name1setting = "54USER_UID1setting";
					
					name1setting = "780USER_EMAIL1setting";
				
					name1setting = "54ORG_name1setting1setting";
				
					name1setting = "7890USER_LOGIN1setting";
				
					name1setting = "700USER_FIO1setting";
				
				
					name1setting = "654ORG_CODE_IOGV1setting";
				
					name1setting = "478ORG_PHggNE1setting";
				
					name1setting = "96Off_PHONE1setting";
				
					name1setting = "574ORG_ADDRES1setting";
			
					name1setting = "489ORG_PHONE1setting";
			
					name1setting = "065ORG_Prr1setting";
				
					name1setting = "457ORG_PffE1setting";
				
					name1setting = "87ORl_PHONE1setting";
				
					name1setting = "543OddPHONE1setting";
				
					name1setting = "478OffHONE1setting";
				
					name1setting = "965OuuG_PHONE1setting";
				
					name1setting = "457Ogff_PHONE1setting";
				
					name1setting = "8678ORrr_PHONE1setting";
				
			
					name1setting = "68ORyy_PHONE1setting";
				
					name1setting = "4ORG_CODE_OKATO1setting";
				
					name1setting = "778DEP_ADDRES1settingS";
				
					name1setting = "447DEP_name1setting1setting";
				
					name1setting = "54USER_POSITION1setting";

				if (name1setting != null) {

					at.setName(name1setting);
					at.setValue (objectArray1setting[i] != null ? objectArray1setting[i]
							.toString() : "");

					atlist1setting.add(at);
				}
			}
			
			uat.setUid(uid1setting);
			uat.setAttributes(atlist1setting);

			result1setting.add(uat); 
			resultIds.put(idRec1setting, uat);

			if (usersIdsLine1setting == null) {
				usersIdsLine1setting = "'" + idRec1setting + "'";
			} else {
				usersIdsLine1setting = usersIdsLine1setting + ", '" + idRec1setting + "'";
			}
	       }
		   
		   return usersIdsLine1setting ;
	}
}
