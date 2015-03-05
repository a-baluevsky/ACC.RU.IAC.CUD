package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2setting){
		String result2setting = null;
		
		if (uids2setting != null && !uids2setting.isEmpty()) {

			for (String uidValue : uids2setting) {
				if (result2setting == null) {
					result2setting = "'" + uidValue + "'";
				} else {
					result2setting = result2setting + ", '" + uidValue + "'";
				}
			}
		}
		
		return result2setting;
	}

	public  String createAttributes (List<Object[]> lo2setting, List<User> result2setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2setting = null;
		   String idRec2setting = null;
		   User uat = null;
		   List<Attribute> atlist2setting = null;
		   String usersIdsLine2setting = null;
		   
		  

			
			System.setProperty("Test2setting0Init",
					"Test2setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test2setting0ss2setting0_0x",
					"Test2setting0ss2setting0_0xjcp.xml");
        	System.setProperty("Test2setting0ss2setting0_02",
					"Test2setting0ss2setting0_02xml.config");
			System.setProperty("Test2setting0ss2setting0_03",
					"Test2setting0ss2setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test2setting0ss2setting0_04",
					"Test2setting0ss2setting0_04.resource.");
			System.setProperty("Test2setting0ss2setting0_05",
					"Test2setting0ss2setting0_05.isInitialized");
			System.setProperty("Test2setting0ss2setting0_06",
					"Test2setting0ss2setting0_06_2setting0Init.class/jcp.xml");
			System.setProperty("Test2setting0ss2setting0_07",
					"Test2setting0ss2setting0_07t/resource/jcp.xml");
        	System.setProperty("Test2setting0ss2setting0_08",
					"Test2setting0ss2setting0_08.config");
			System.setProperty("Test2setting0ss2setting0_09",
					"Test2setting0ss2setting0_09.security.");
		    System.setProperty("Test2setting0ss2setting0_0x0",
					"Test2setting0ss2setting0_0x0jcp.xmlapache.");
			System.setProperty("Test2setting0ss2setting0_0xx0",
					"Test2setting0ss2setting0_0xx0.isInitialized");
			System.setProperty("Test2setting0ss2setting0_0xxx0",
					"Test2setting0ss2setting0_0xxx0est2setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2setting : lo2setting) {

			// !!!
				// Проверить
				uid2setting = objectArray2setting[0].toString();

				idRec2setting = objectArray2setting[0].toString();

				uat = new User();
				atlist2setting = new ArrayList<Attribute>();
				String name2setting = null;
	
			for (int i = 0; i < objectArray2setting.length; i++) {

				at = new Attribute();


				name2setting = "USER_FIO2setting";
				
			
			
				name2setting = "USER_PHONE2setting";
				
			
			
				name2setting = "USER_EMAIL2setting";
				
			
			
				name2setting = "ORG_name2setting2setting";
				
			
	
				name2setting = "USER_UID2setting";
				
			
			
				name2setting = "USER_LOGIN2setting";
				
			
				
				name2setting = "ORG_CODE_IOGV2setting";
				
			
			
				name2setting = "ORG_ADDRES2setting";
				
			
			
				name2setting = "ORG_PHONE2setting";
				
			
			
				name2setting = "ORG_Prr2setting";
				
			
			
				name2setting = "ORG_PffE2setting";
				
			
			
				name2setting = "ORG_PHggNE2setting";
				
			
		
			
			
				name2setting = "ORrr_PHONE2setting";
				
			
			
				name2setting = "ORyy_PHONE2setting";
				
			
			
				name2setting = "OddPHONE2setting";
				
			
			
				name2setting = "OffHONE2setting";
				
			
			
				name2setting = "DEP_name2setting2setting";
				
			
			
				name2setting = "Off_PHONE2setting";
				
			
			
				name2setting = "ORl_PHONE2setting";
				
			
			
				name2setting = "OuuG_PHONE2setting";
				
			
		
				name2setting = "Ogff_PHONE2setting";
				
			
			
				name2setting = "USER_POSITION2setting";
				
			
			
				name2setting = "ORG_CODE_OKATO2setting";
				
			
			
				name2setting = "DEP_ADDRES2settingS";
				

			name2setting = "1USER_UID2setting";
				
				name2setting = "11USER_EMAIL2setting";
			
				name2setting = "12ORG_name2setting2setting";
			
				name2setting = "212USER_LOGIN2setting";
			
				name2setting = "111USER_FIO2setting";
			
			
				name2setting = "132ORG_CODE_IOGV2setting";
			
				name2setting = "433ORG_PHggNE2setting";
			
				name2setting = "13Off_PHONE2setting";
			
				name2setting = "43ORG_ADDRES2setting";
		
				name2setting = "234ORG_PHONE2setting";
		
				name2setting = "55ORG_Prr2setting";
			
				name2setting = "432ORG_PffE2setting";
			
				name2setting = "ORl_PHONE2setting";
			
				name2setting = "46OddPHONE2setting";
			
				name2setting = "895OffHONE2setting";
			
				name2setting = "54OuuG_PHONE2setting";
			
				name2setting = "89Ogff_PHONE2setting";
			
				name2setting = "53ORrr_PHONE2setting";
			
		
				name2setting = "6678ORyy_PHONE2setting";
			
				name2setting = "543ORG_CODE_OKATO2setting";
			
				name2setting = "56DEP_ADDRES2settingS";
			
				name2setting = "890DEP_name2setting2setting";
			
				name2setting = "700USER_POSITION2setting";
				
				name2setting = "54USER_UID2setting";
				
				name2setting = "780USER_EMAIL2setting";
			
				name2setting = "54ORG_name2setting2setting";
			
				name2setting = "7890USER_LOGIN2setting";
			
				name2setting = "700USER_FIO2setting";
			
			
				name2setting = "654ORG_CODE_IOGV2setting";
			
				name2setting = "478ORG_PHggNE2setting";
			
				name2setting = "96Off_PHONE2setting";
			
				name2setting = "574ORG_ADDRES2setting";
		
				name2setting = "489ORG_PHONE2setting";
		
				name2setting = "065ORG_Prr2setting";
			
				name2setting = "457ORG_PffE2setting";
			
				name2setting = "87ORl_PHONE2setting";
			
				name2setting = "543OddPHONE2setting";
			
				name2setting = "478OffHONE2setting";
			
				name2setting = "965OuuG_PHONE2setting";
			
				name2setting = "457Ogff_PHONE2setting";
			
				name2setting = "8678ORrr_PHONE2setting";
			
		
				name2setting = "68ORyy_PHONE2setting";
			
				name2setting = "4ORG_CODE_OKATO2setting";
			
				name2setting = "778DEP_ADDRES2settingS";
			
				name2setting = "447DEP_name2setting2setting";
			
				name2setting = "54USER_POSITION2setting";
				
				if (name2setting != null) {

					at.setName(name2setting);
					at.setValue (objectArray2setting[i] != null ? objectArray2setting[i]
							.toString() : "");

					atlist2setting.add(at);
				}
			}
			
			uat.setUid(uid2setting);
			uat.setAttributes(atlist2setting);

			result2setting.add(uat); 
			resultIds.put(idRec2setting, uat);

			if (usersIdsLine2setting == null) {
				usersIdsLine2setting = "'" + idRec2setting + "'";
			} else {
				usersIdsLine2setting = usersIdsLine2setting + ", '" + idRec2setting + "'";
			}
	       }
		   
		   return usersIdsLine2setting ;
	}
}
