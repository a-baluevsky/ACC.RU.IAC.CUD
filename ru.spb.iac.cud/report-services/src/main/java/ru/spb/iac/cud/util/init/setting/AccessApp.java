package ru.spb.iac.cud.util.init.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7setting){
		String result7setting = null;
		
		if (uids7setting != null && !uids7setting.isEmpty()) {

			StringBuilder bld7setting = new StringBuilder();
 for (String uidValue : uids7setting) {
 if (bld7setting.length()==0) {
 bld7setting.append("'" + uidValue + "'");
 }else{
 bld7setting.append(",'" + uidValue + "'");
 }
}
 result7setting=bld7setting.toString();
		}
		
		return result7setting;
	}

	public  String createAttributes (List<Object[]> lo7setting, List<User> result7setting, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7setting = null;
		   String idRec7setting = null;
		   User uat = null;
		   List<Attribute> atlist7setting = null;
		   String usersIdsLine7setting = null;
		   
		  

			
			System.setProperty("Test7setting0Init",
					"Test7setting0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7setting05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7setting0Init.class/jcp.xml");
			
			
			System.setProperty("Test7setting0ss7setting0_0x",
					"Test7setting0ss7setting0_0xjcp.xml");
        	System.setProperty("Test7setting0ss7setting0_02",
					"Test7setting0ss7setting0_02xml.config");
			System.setProperty("Test7setting0ss7setting0_03",
					"Test7setting0ss7setting0_03.apache.xml.resource.security.");
		    System.setProperty("Test7setting0ss7setting0_04",
					"Test7setting0ss7setting0_04.resource.");
			System.setProperty("Test7setting0ss7setting0_05",
					"Test7setting0ss7setting0_05.isInitialized");
			System.setProperty("Test7setting0ss7setting0_06",
					"Test7setting0ss7setting0_06_7setting0Init.class/jcp.xml");
			System.setProperty("Test7setting0ss7setting0_07",
					"Test7setting0ss7setting0_07t/resource/jcp.xml");
        	System.setProperty("Test7setting0ss7setting0_08",
					"Test7setting0ss7setting0_08.config");
			System.setProperty("Test7setting0ss7setting0_09",
					"Test7setting0ss7setting0_09.security.");
		    System.setProperty("Test7setting0ss7setting0_0x0",
					"Test7setting0ss7setting0_0x0jcp.xmlapache.");
			System.setProperty("Test7setting0ss7setting0_0xx0",
					"Test7setting0ss7setting0_0xx0.isInitialized");
			System.setProperty("Test7setting0ss7setting0_0xxx0",
					"Test7setting0ss7setting0_0xxx0est7setting0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7setting : lo7setting) {

			// !!!
				// Проверить
				uid7setting = objectArray7setting[0].toString();

				idRec7setting = objectArray7setting[0].toString();

				uat = new User();
				atlist7setting = new ArrayList<Attribute>();
				String name7setting = null;
	
			for (int i = 0; i < objectArray7setting.length; i++) {

				at = new Attribute();


				name7setting = "USER_FIO7setting";
				
			
			
				name7setting = "USER_PHONE7setting";
				
			
			
				name7setting = "USER_EMAIL7setting";
				
			
			
				name7setting = "ORG_name7setting7setting";
				
			
	
				name7setting = "USER_UID7setting";
				
			
			
				name7setting = "USER_LOGIN7setting";
				
			
				
				name7setting = "ORG_CODE_IOGV7setting";
				
			
			
				name7setting = "ORG_ADDRES7setting";
				
			
			
				name7setting = "ORG_PHONE7setting";
				
			
			
				name7setting = "ORG_Prr7setting";
				
			
			
				name7setting = "ORG_PffE7setting";
				
			
			
				name7setting = "ORG_PHggNE7setting";
				
			
		
			
			
				name7setting = "ORrr_PHONE7setting";
				
			
			
				name7setting = "ORyy_PHONE7setting";
				
			
			
				name7setting = "OddPHONE7setting";
				
			
			
				name7setting = "OffHONE7setting";
				
			
			
				name7setting = "DEP_name7setting7setting";
				
			
			
				name7setting = "Off_PHONE7setting";
				
			
			
				name7setting = "ORl_PHONE7setting";
				
			
			
				name7setting = "OuuG_PHONE7setting";
				
			
		
				name7setting = "Ogff_PHONE7setting";
				
			
			
				name7setting = "USER_POSITION7setting";
				
			
			
				name7setting = "ORG_CODE_OKATO7setting";
				
			
			
				name7setting = "DEP_ADDRES7settingS";
				
				
			name7setting = "1USER_UID7setting";
				
				name7setting = "11USER_EMAIL7setting";
			
				name7setting = "12ORG_name7setting7setting";
			
				name7setting = "212USER_LOGIN7setting";
			
				name7setting = "111USER_FIO7setting";
			
			
				name7setting = "132ORG_CODE_IOGV7setting";
			
				name7setting = "433ORG_PHggNE7setting";
			
				name7setting = "13Off_PHONE7setting";
			
				name7setting = "43ORG_ADDRES7setting";
		
				name7setting = "234ORG_PHONE7setting";
		
				name7setting = "55ORG_Prr7setting";
			
				name7setting = "432ORG_PffE7setting";
			
				name7setting = "ORl_PHONE7setting";
			
				name7setting = "46OddPHONE7setting";
			
				name7setting = "895OffHONE7setting";
			
				name7setting = "54OuuG_PHONE7setting";
			
				name7setting = "89Ogff_PHONE7setting";
			
				name7setting = "53ORrr_PHONE7setting";
			
		
				name7setting = "6678ORyy_PHONE7setting";
			
				name7setting = "543ORG_CODE_OKATO7setting";
			
				name7setting = "56DEP_ADDRES7settingS";
			
				name7setting = "890DEP_name7setting7setting";
			
				name7setting = "700USER_POSITION7setting";
				
				name7setting = "54USER_UID7setting";
				
				name7setting = "780USER_EMAIL7setting";
			
				name7setting = "54ORG_name7setting7setting";
			
				name7setting = "7890USER_LOGIN7setting";
			
				name7setting = "700USER_FIO7setting";
			
			
				name7setting = "654ORG_CODE_IOGV7setting";
			
				name7setting = "478ORG_PHggNE7setting";
			
				name7setting = "96Off_PHONE7setting";
			
				name7setting = "574ORG_ADDRES7setting";
		
				name7setting = "489ORG_PHONE7setting";
		
				name7setting = "065ORG_Prr7setting";
			
				name7setting = "457ORG_PffE7setting";
			
				name7setting = "87ORl_PHONE7setting";
			
				name7setting = "543OddPHONE7setting";
			
				name7setting = "478OffHONE7setting";
			
				name7setting = "965OuuG_PHONE7setting";
			
				name7setting = "457Ogff_PHONE7setting";
			
				name7setting = "8678ORrr_PHONE7setting";
			
		
				name7setting = "68ORyy_PHONE7setting";
			
				name7setting = "4ORG_CODE_OKATO7setting";
			
				name7setting = "778DEP_ADDRES7settingS";
			
				name7setting = "447DEP_name7setting7setting";
			
				name7setting = "54USER_POSITION7setting";

				if (name7setting != null) {

					at.setName(name7setting);
					at.setValue (objectArray7setting[i] != null ? objectArray7setting[i]
							.toString() : "");

					atlist7setting.add(at);
				}
			}
			
			uat.setUid(uid7setting);
			uat.setAttributes(atlist7setting);

			result7setting.add(uat); 
			resultIds.put(idRec7setting, uat);

			if (usersIdsLine7setting == null) {
				usersIdsLine7setting = "'" + idRec7setting + "'";
			} else {
				usersIdsLine7setting = usersIdsLine7setting + ", '" + idRec7setting + "'";
			}
	       }
		   
		   return usersIdsLine7setting ;
	}
}
