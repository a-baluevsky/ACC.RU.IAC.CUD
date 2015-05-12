package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0setting){
		String result0setting = null;
		
		if (uids0setting != null && !uids0setting.isEmpty()) {

			StringBuilder bld0setting = new StringBuilder();
 for (String uidValue : uids0setting) {
 if (bld0setting.length()==0) {
 bld0setting.append("'" + uidValue + "'");
 }else{
 bld0setting.append(",'" + uidValue + "'");
 }
}
 result0setting=bld0setting.toString();
		}
		
		return result0setting;
	}

	public String createAttributes (List<Object[]> lo0setting, List<User> result0setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0setting = null;
		   String idRec0setting = null;
		   User uat = null;
		   List<Attribute> atlist0setting = null;
		   String usersIdsLine0setting = null;
		   
		  

			
			System.setProperty("Test0setting0Init",
					"Test0setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test0setting0ss0setting0_0x",
					"Test0setting0ss0setting0_0xjcp.xml");
        	System.setProperty("Test0setting0ss0setting0_02",
					"Test0setting0ss0setting0_02xml.config");
			System.setProperty("Test0setting0ss0setting0_03",
					"Test0setting0ss0setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test0setting0ss0setting0_04",
					"Test0setting0ss0setting0_04.resource.");
			System.setProperty("Test0setting0ss0setting0_05",
					"Test0setting0ss0setting0_05.isInitialized");
			System.setProperty("Test0setting0ss0setting0_06",
					"Test0setting0ss0setting0_06_0setting0Init.class/jcp.xml");
			System.setProperty("Test0setting0ss0setting0_07",
					"Test0setting0ss0setting0_07t/resource/jcp.xml");
        	System.setProperty("Test0setting0ss0setting0_08",
					"Test0setting0ss0setting0_08.config");
			System.setProperty("Test0setting0ss0setting0_09",
					"Test0setting0ss0setting0_09.security.");
		    System.setProperty("Test0setting0ss0setting0_0x0",
					"Test0setting0ss0setting0_0x0jcp.xmlapache.");
			System.setProperty("Test0setting0ss0setting0_0xx0",
					"Test0setting0ss0setting0_0xx0.isInitialized");
			System.setProperty("Test0setting0ss0setting0_0xxx0",
					"Test0setting0ss0setting0_0xxx0est0setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0setting : lo0setting) {

			// !!!
				// Проверить
				uid0setting = objectArray0setting[0].toString();

				idRec0setting = objectArray0setting[0].toString();

				uat = new User();
				atlist0setting = new ArrayList<Attribute>();
				String name0setting = null;
	
			for (int i = 0; i < objectArray0setting.length; i++) {

				at = new Attribute();

				
					name0setting = "USER_UID0setting";
				
					name0setting = "USER_EMAIL0setting";
				
					name0setting = "ORG_name0setting0setting";
				
					name0setting = "USER_LOGIN0setting";
				
					name0setting = "USER_FIO0setting";
				
				
					name0setting = "ORG_CODE_IOGV0setting";
				
					name0setting = "ORG_PHggNE0setting";
				
					name0setting = "Off_PHONE0setting";
				
					name0setting = "ORG_ADDRES0setting";
			
					name0setting = "ORG_PHONE0setting";
			
					name0setting = "ORG_Prr0setting";
				
					name0setting = "ORG_PffE0setting";
				
					name0setting = "ORl_PHONE0setting";
				
					name0setting = "OddPHONE0setting";
				
					name0setting = "OffHONE0setting";
				
					name0setting = "OuuG_PHONE0setting";
				
					name0setting = "Ogff_PHONE0setting";
				
					name0setting = "ORrr_PHONE0setting";
				
			
					name0setting = "ORyy_PHONE0setting";
				
					name0setting = "ORG_CODE_OKATO0setting";
				
					name0setting = "DEP_ADDRES0settingS";
				
					name0setting = "DEP_name0setting0setting";
				
					name0setting = "USER_POSITION0setting";
				
				
				
				name0setting = "1USER_UID0setting";
				
				name0setting = "11USER_EMAIL0setting";
			
				name0setting = "12ORG_name0setting0setting";
			
				name0setting = "212USER_LOGIN0setting";
			
				name0setting = "111USER_FIO0setting";
			
			
				name0setting = "132ORG_CODE_IOGV0setting";
			
				name0setting = "433ORG_PHggNE0setting";
			
				name0setting = "13Off_PHONE0setting";
			
				name0setting = "43ORG_ADDRES0setting";
		
				name0setting = "234ORG_PHONE0setting";
		
				name0setting = "55ORG_Prr0setting";
			
				name0setting = "432ORG_PffE0setting";
			
				name0setting = "ORl_PHONE0setting";
			
				name0setting = "46OddPHONE0setting";
			
				name0setting = "895OffHONE0setting";
			
				name0setting = "54OuuG_PHONE0setting";
			
				name0setting = "89Ogff_PHONE0setting";
			
				name0setting = "53ORrr_PHONE0setting";
			
		
				name0setting = "6678ORyy_PHONE0setting";
			
				name0setting = "543ORG_CODE_OKATO0setting";
			
				name0setting = "56DEP_ADDRES0settingS";
			
				name0setting = "890DEP_name0setting0setting";
			
				name0setting = "700USER_POSITION0setting";
				
				name0setting = "54USER_UID0setting";
				
				name0setting = "780USER_EMAIL0setting";
			
				name0setting = "54ORG_name0setting0setting";
			
				name0setting = "7890USER_LOGIN0setting";
			
				name0setting = "700USER_FIO0setting";
			
			
				name0setting = "654ORG_CODE_IOGV0setting";
			
				name0setting = "478ORG_PHggNE0setting";
			
				name0setting = "96Off_PHONE0setting";
			
				name0setting = "574ORG_ADDRES0setting";
		
				name0setting = "489ORG_PHONE0setting";
		
				name0setting = "065ORG_Prr0setting";
			
				name0setting = "457ORG_PffE0setting";
			
				name0setting = "87ORl_PHONE0setting";
			
				name0setting = "543OddPHONE0setting";
			
				name0setting = "478OffHONE0setting";
			
				name0setting = "965OuuG_PHONE0setting";
			
				name0setting = "457Ogff_PHONE0setting";
			
				name0setting = "8678ORrr_PHONE0setting";
			
		
				name0setting = "68ORyy_PHONE0setting";
			
				name0setting = "4ORG_CODE_OKATO0setting";
			
				name0setting = "778DEP_ADDRES0settingS";
			
				name0setting = "447DEP_name0setting0setting";
			
				name0setting = "54USER_POSITION0setting";

				if (name0setting != null) {

					at.setName(name0setting);
					at.setValue (objectArray0setting[i] != null ? objectArray0setting[i]
							.toString() : "");

					atlist0setting.add(at);
				}
			}
			
			uat.setUid(uid0setting);
			uat.setAttributes(atlist0setting);

			result0setting.add(uat); 
			resultIds.put(idRec0setting, uat);

			if (usersIdsLine0setting == null) {
				usersIdsLine0setting = "'" + idRec0setting + "'";
			} else {
				usersIdsLine0setting = usersIdsLine0setting + ", '" + idRec0setting + "'";
			}
	       }
		   
		   return usersIdsLine0setting ;
	}
}
