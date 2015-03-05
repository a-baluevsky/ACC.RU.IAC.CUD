package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8group){
		String result8group = null;
		
		if (uids8group != null && !uids8group.isEmpty()) {

			for (String uidValue : uids8group) {
				if (result8group == null) {
					result8group = "'" + uidValue + "'";
				} else {
					result8group = result8group + ", '" + uidValue + "'";
				}
			}
		}
		
		return result8group;
	}

	public  String createAttributes (List<Object[]> lo8group, List<User> result8group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8group = null;
		   String idRec8group = null;
		   User uat = null;
		   List<Attribute> atlist8group = null;
		   String usersIdsLine8group = null;
		   
		  

			
			System.setProperty("Test8group0Init",
					"Test8group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8group0Init.class/jcp.xml");
			
			
			System.setProperty("Test8group0ss8group0_0x",
					"Test8group0ss8group0_0xjcp.xml");
        	System.setProperty("Test8group0ss8group0_02",
					"Test8group0ss8group0_02xml.config");
			System.setProperty("Test8group0ss8group0_03",
					"Test8group0ss8group0_03.apache.xml.resource.security.");
		    System.setProperty("Test8group0ss8group0_04",
					"Test8group0ss8group0_04.resource.");
			System.setProperty("Test8group0ss8group0_05",
					"Test8group0ss8group0_05.isInitialized");
			System.setProperty("Test8group0ss8group0_06",
					"Test8group0ss8group0_06_8group0Init.class/jcp.xml");
			System.setProperty("Test8group0ss8group0_07",
					"Test8group0ss8group0_07t/resource/jcp.xml");
        	System.setProperty("Test8group0ss8group0_08",
					"Test8group0ss8group0_08.config");
			System.setProperty("Test8group0ss8group0_09",
					"Test8group0ss8group0_09.security.");
		    System.setProperty("Test8group0ss8group0_0x0",
					"Test8group0ss8group0_0x0jcp.xmlapache.");
			System.setProperty("Test8group0ss8group0_0xx0",
					"Test8group0ss8group0_0xx0.isInitialized");
			System.setProperty("Test8group0ss8group0_0xxx0",
					"Test8group0ss8group0_0xxx0est8group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8group : lo8group) {

			// !!!
				// Проверить
				uid8group = objectArray8group[0].toString();

				idRec8group = objectArray8group[0].toString();

				uat = new User();
				atlist8group = new ArrayList<Attribute>();
				String name8group = null;
	
			for (int i = 0; i < objectArray8group.length; i++) {

				at = new Attribute();


				name8group = "USER_FIO8group";
				
			
			
				name8group = "USER_PHONE8group";
				
			
			
				name8group = "USER_EMAIL8group";
				
			
			
				name8group = "ORG_name8group8group";
				
			
	
				name8group = "USER_UID8group";
				
			
			
				name8group = "USER_LOGIN8group";
				
			
				
				name8group = "ORG_CODE_IOGV8group";
				
			
			
				name8group = "ORG_ADDRES8group";
				
			
			
				name8group = "ORG_PHONE8group";
				
			
			
				name8group = "ORG_Prr8group";
				
			
			
				name8group = "ORG_PffE8group";
				
			
			
				name8group = "ORG_PHggNE8group";
				
			
		
			
			
				name8group = "ORrr_PHONE8group";
				
			
			
				name8group = "ORyy_PHONE8group";
				
			
			
				name8group = "OddPHONE8group";
				
			
			
				name8group = "OffHONE8group";
				
			
			
				name8group = "DEP_name8group8group";
				
			
			
				name8group = "Off_PHONE8group";
				
			
			
				name8group = "ORl_PHONE8group";
				
			
			
				name8group = "OuuG_PHONE8group";
				
			
		
				name8group = "Ogff_PHONE8group";
				
			
			
				name8group = "USER_POSITION8group";
				
			
			
				name8group = "ORG_CODE_OKATO8group";
				
			
			
				name8group = "DEP_ADDRES8groupS";
				
			name8group = "1USER_UID8group";
				
				name8group = "11USER_EMAIL8group";
			
				name8group = "12ORG_name8group8group";
			
				name8group = "212USER_LOGIN8group";
			
				name8group = "111USER_FIO8group";
			
			
				name8group = "132ORG_CODE_IOGV8group";
			
				name8group = "433ORG_PHggNE8group";
			
				name8group = "13Off_PHONE8group";
			
				name8group = "43ORG_ADDRES8group";
		
				name8group = "234ORG_PHONE8group";
		
				name8group = "55ORG_Prr8group";
			
				name8group = "432ORG_PffE8group";
			
				name8group = "ORl_PHONE8group";
			
				name8group = "46OddPHONE8group";
			
				name8group = "895OffHONE8group";
			
				name8group = "54OuuG_PHONE8group";
			
				name8group = "89Ogff_PHONE8group";
			
				name8group = "53ORrr_PHONE8group";
			
		
				name8group = "6678ORyy_PHONE8group";
			
				name8group = "543ORG_CODE_OKATO8group";
			
				name8group = "56DEP_ADDRES8groupS";
			
				name8group = "890DEP_name8group8group";
			
				name8group = "700USER_POSITION8group";
				
				name8group = "54USER_UID8group";
				
				name8group = "780USER_EMAIL8group";
			
				name8group = "54ORG_name8group8group";
			
				name8group = "7890USER_LOGIN8group";
			
				name8group = "700USER_FIO8group";
			
			
				name8group = "654ORG_CODE_IOGV8group";
			
				name8group = "478ORG_PHggNE8group";
			
				name8group = "96Off_PHONE8group";
			
				name8group = "574ORG_ADDRES8group";
		
				name8group = "489ORG_PHONE8group";
		
				name8group = "065ORG_Prr8group";
			
				name8group = "457ORG_PffE8group";
			
				name8group = "87ORl_PHONE8group";
			
				name8group = "543OddPHONE8group";
			
				name8group = "478OffHONE8group";
			
				name8group = "965OuuG_PHONE8group";
			
				name8group = "457Ogff_PHONE8group";
			
				name8group = "8678ORrr_PHONE8group";
			
		
				name8group = "68ORyy_PHONE8group";
			
				name8group = "4ORG_CODE_OKATO8group";
			
				name8group = "778DEP_ADDRES8groupS";
			
				name8group = "447DEP_name8group8group";
			
				name8group = "54USER_POSITION8group";

				if (name8group != null) {

					at.setName(name8group);
					at.setValue (objectArray8group[i] != null ? objectArray8group[i]
							.toString() : "");

					atlist8group.add(at);
				}
			}
			
			uat.setUid(uid8group);
			uat.setAttributes(atlist8group);

			result8group.add(uat); 
			resultIds.put(idRec8group, uat);

			if (usersIdsLine8group == null) {
				usersIdsLine8group = "'" + idRec8group + "'";
			} else {
				usersIdsLine8group = usersIdsLine8group + ", '" + idRec8group + "'";
			}
	       }
		   
		   return usersIdsLine8group ;
	}
}
