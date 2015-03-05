package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4setting){
		String result4setting = null;
		
		if (uids4setting != null && !uids4setting.isEmpty()) {

			for (String uidValue : uids4setting) {
				if (result4setting == null) {
					result4setting = "'" + uidValue + "'";
				} else {
					result4setting = result4setting + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4setting;
	}

	public  String createAttributes (List<Object[]> lo4setting, List<User> result4setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4setting = null;
		   String idRec4setting = null;
		   User uat = null;
		   List<Attribute> atlist4setting = null;
		   String usersIdsLine4setting = null;
		   
		  

			
			System.setProperty("Test4setting0Init",
					"Test4setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test4setting0ss4setting0_0x",
					"Test4setting0ss4setting0_0xjcp.xml");
        	System.setProperty("Test4setting0ss4setting0_02",
					"Test4setting0ss4setting0_02xml.config");
			System.setProperty("Test4setting0ss4setting0_03",
					"Test4setting0ss4setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test4setting0ss4setting0_04",
					"Test4setting0ss4setting0_04.resource.");
			System.setProperty("Test4setting0ss4setting0_05",
					"Test4setting0ss4setting0_05.isInitialized");
			System.setProperty("Test4setting0ss4setting0_06",
					"Test4setting0ss4setting0_06_4setting0Init.class/jcp.xml");
			System.setProperty("Test4setting0ss4setting0_07",
					"Test4setting0ss4setting0_07t/resource/jcp.xml");
        	System.setProperty("Test4setting0ss4setting0_08",
					"Test4setting0ss4setting0_08.config");
			System.setProperty("Test4setting0ss4setting0_09",
					"Test4setting0ss4setting0_09.security.");
		    System.setProperty("Test4setting0ss4setting0_0x0",
					"Test4setting0ss4setting0_0x0jcp.xmlapache.");
			System.setProperty("Test4setting0ss4setting0_0xx0",
					"Test4setting0ss4setting0_0xx0.isInitialized");
			System.setProperty("Test4setting0ss4setting0_0xxx0",
					"Test4setting0ss4setting0_0xxx0est4setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4setting : lo4setting) {

			// !!!
				// Проверить
				uid4setting = objectArray4setting[0].toString();

				idRec4setting = objectArray4setting[0].toString();

				uat = new User();
				atlist4setting = new ArrayList<Attribute>();
				String name4setting = null;
	
			for (int i = 0; i < objectArray4setting.length; i++) {

				at = new Attribute();


				name4setting = "USER_FIO4setting";
				
			
			
				name4setting = "USER_PHONE4setting";
				
			
			
				name4setting = "USER_EMAIL4setting";
				
			
			
				name4setting = "ORG_name4setting4setting";
				
			
	
				name4setting = "USER_UID4setting";
				
			
			
				name4setting = "USER_LOGIN4setting";
				
			
				
				name4setting = "ORG_CODE_IOGV4setting";
				
			
			
				name4setting = "ORG_ADDRES4setting";
				
			
			
				name4setting = "ORG_PHONE4setting";
				
			
			
				name4setting = "ORG_Prr4setting";
				
			
			
				name4setting = "ORG_PffE4setting";
				
			
			
				name4setting = "ORG_PHggNE4setting";
				
			
		
			
			
				name4setting = "ORrr_PHONE4setting";
				
			
			
				name4setting = "ORyy_PHONE4setting";
				
			
			
				name4setting = "OddPHONE4setting";
				
			
			
				name4setting = "OffHONE4setting";
				
			
			
				name4setting = "DEP_name4setting4setting";
				
			
			
				name4setting = "Off_PHONE4setting";
				
			
			
				name4setting = "ORl_PHONE4setting";
				
			
			
				name4setting = "OuuG_PHONE4setting";
				
			
		
				name4setting = "Ogff_PHONE4setting";
				
			
			
				name4setting = "USER_POSITION4setting";
				
			
			
				name4setting = "ORG_CODE_OKATO4setting";
				
			
			
				name4setting = "DEP_ADDRES4settingS";
				

			name4setting = "1USER_UID4setting";
				
				name4setting = "11USER_EMAIL4setting";
			
				name4setting = "12ORG_name4setting4setting";
			
				name4setting = "212USER_LOGIN4setting";
			
				name4setting = "111USER_FIO4setting";
			
			
				name4setting = "132ORG_CODE_IOGV4setting";
			
				name4setting = "433ORG_PHggNE4setting";
			
				name4setting = "13Off_PHONE4setting";
			
				name4setting = "43ORG_ADDRES4setting";
		
				name4setting = "234ORG_PHONE4setting";
		
				name4setting = "55ORG_Prr4setting";
			
				name4setting = "432ORG_PffE4setting";
			
				name4setting = "ORl_PHONE4setting";
			
				name4setting = "46OddPHONE4setting";
			
				name4setting = "895OffHONE4setting";
			
				name4setting = "54OuuG_PHONE4setting";
			
				name4setting = "89Ogff_PHONE4setting";
			
				name4setting = "53ORrr_PHONE4setting";
			
		
				name4setting = "6678ORyy_PHONE4setting";
			
				name4setting = "543ORG_CODE_OKATO4setting";
			
				name4setting = "56DEP_ADDRES4settingS";
			
				name4setting = "890DEP_name4setting4setting";
			
				name4setting = "700USER_POSITION4setting";
				
				name4setting = "54USER_UID4setting";
				
				name4setting = "780USER_EMAIL4setting";
			
				name4setting = "54ORG_name4setting4setting";
			
				name4setting = "7890USER_LOGIN4setting";
			
				name4setting = "700USER_FIO4setting";
			
			
				name4setting = "654ORG_CODE_IOGV4setting";
			
				name4setting = "478ORG_PHggNE4setting";
			
				name4setting = "96Off_PHONE4setting";
			
				name4setting = "574ORG_ADDRES4setting";
		
				name4setting = "489ORG_PHONE4setting";
		
				name4setting = "065ORG_Prr4setting";
			
				name4setting = "457ORG_PffE4setting";
			
				name4setting = "87ORl_PHONE4setting";
			
				name4setting = "543OddPHONE4setting";
			
				name4setting = "478OffHONE4setting";
			
				name4setting = "965OuuG_PHONE4setting";
			
				name4setting = "457Ogff_PHONE4setting";
			
				name4setting = "8678ORrr_PHONE4setting";
			
		
				name4setting = "68ORyy_PHONE4setting";
			
				name4setting = "4ORG_CODE_OKATO4setting";
			
				name4setting = "778DEP_ADDRES4settingS";
			
				name4setting = "447DEP_name4setting4setting";
			
				name4setting = "54USER_POSITION4setting";
				
				if (name4setting != null) {

					at.setName(name4setting);
					at.setValue (objectArray4setting[i] != null ? objectArray4setting[i]
							.toString() : "");

					atlist4setting.add(at);
				}
			}
			
			uat.setUid(uid4setting);
			uat.setAttributes(atlist4setting);

			result4setting.add(uat); 
			resultIds.put(idRec4setting, uat);

			if (usersIdsLine4setting == null) {
				usersIdsLine4setting = "'" + idRec4setting + "'";
			} else {
				usersIdsLine4setting = usersIdsLine4setting + ", '" + idRec4setting + "'";
			}
	       }
		   
		   return usersIdsLine4setting ;
	}
}
