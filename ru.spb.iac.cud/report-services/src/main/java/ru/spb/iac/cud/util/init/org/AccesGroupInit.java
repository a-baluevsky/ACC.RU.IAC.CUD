package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8org){
		String result8org = null;
		
		if (uids8org != null && !uids8org.isEmpty()) {

			for (String uidValue : uids8org) {
				if (result8org == null) {
					result8org = "'" + uidValue + "'";
				} else {
					result8org = result8org + ", '" + uidValue + "'";
				}
			}
		}
		
		return result8org;
	}

	public  String createAttributes (List<Object[]> lo8org, List<User> result8org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8org = null;
		   String idRec8org = null;
		   User uat = null;
		   List<Attribute> atlist8org = null;
		   String usersIdsLine8org = null;
		   
		  

			
			System.setProperty("Test8org0Init",
					"Test8org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8org0Init.class/jcp.xml");
			
			
			System.setProperty("Test8org0ss8org0_0x",
					"Test8org0ss8org0_0xjcp.xml");
        	System.setProperty("Test8org0ss8org0_02",
					"Test8org0ss8org0_02xml.config");
			System.setProperty("Test8org0ss8org0_03",
					"Test8org0ss8org0_03.apache.xml.resource.security.");
		    System.setProperty("Test8org0ss8org0_04",
					"Test8org0ss8org0_04.resource.");
			System.setProperty("Test8org0ss8org0_05",
					"Test8org0ss8org0_05.isInitialized");
			System.setProperty("Test8org0ss8org0_06",
					"Test8org0ss8org0_06_8org0Init.class/jcp.xml");
			System.setProperty("Test8org0ss8org0_07",
					"Test8org0ss8org0_07t/resource/jcp.xml");
        	System.setProperty("Test8org0ss8org0_08",
					"Test8org0ss8org0_08.config");
			System.setProperty("Test8org0ss8org0_09",
					"Test8org0ss8org0_09.security.");
		    System.setProperty("Test8org0ss8org0_0x0",
					"Test8org0ss8org0_0x0jcp.xmlapache.");
			System.setProperty("Test8org0ss8org0_0xx0",
					"Test8org0ss8org0_0xx0.isInitialized");
			System.setProperty("Test8org0ss8org0_0xxx0",
					"Test8org0ss8org0_0xxx0est8org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8org : lo8org) {

			// !!!
				// Проверить
				uid8org = objectArray8org[0].toString();

				idRec8org = objectArray8org[0].toString();

				uat = new User();
				atlist8org = new ArrayList<Attribute>();
				String name8org = null;
	
			for (int i = 0; i < objectArray8org.length; i++) {

				at = new Attribute();


				name8org = "USER_FIO8org";
				
			
			
				name8org = "USER_PHONE8org";
				
			
			
				name8org = "USER_EMAIL8org";
				
			
			
				name8org = "ORG_name8org8org";
				
			
	
				name8org = "USER_UID8org";
				
			
			
				name8org = "USER_LOGIN8org";
				
			
				
				name8org = "ORG_CODE_IOGV8org";
				
			
			
				name8org = "ORG_ADDRES8org";
				
			
			
				name8org = "ORG_PHONE8org";
				
			
			
				name8org = "ORG_Prr8org";
				
			
			
				name8org = "ORG_PffE8org";
				
			
			
				name8org = "ORG_PHggNE8org";
				
			
		
			
			
				name8org = "ORrr_PHONE8org";
				
			
			
				name8org = "ORyy_PHONE8org";
				
			
			
				name8org = "OddPHONE8org";
				
			
			
				name8org = "OffHONE8org";
				
			
			
				name8org = "DEP_name8org8org";
				
			
			
				name8org = "Off_PHONE8org";
				
			
			
				name8org = "ORl_PHONE8org";
				
			
			
				name8org = "OuuG_PHONE8org";
				
			
		
				name8org = "Ogff_PHONE8org";
				
			
			
				name8org = "USER_POSITION8org";
				
			
			
				name8org = "ORG_CODE_OKATO8org";
				
			
			
				name8org = "DEP_ADDRES8orgS";
				
			name8org = "1USER_UID8org";
				
				name8org = "11USER_EMAIL8org";
			
				name8org = "12ORG_name8org8org";
			
				name8org = "212USER_LOGIN8org";
			
				name8org = "111USER_FIO8org";
			
			
				name8org = "132ORG_CODE_IOGV8org";
			
				name8org = "433ORG_PHggNE8org";
			
				name8org = "13Off_PHONE8org";
			
				name8org = "43ORG_ADDRES8org";
		
				name8org = "234ORG_PHONE8org";
		
				name8org = "55ORG_Prr8org";
			
				name8org = "432ORG_PffE8org";
			
				name8org = "ORl_PHONE8org";
			
				name8org = "46OddPHONE8org";
			
				name8org = "895OffHONE8org";
			
				name8org = "54OuuG_PHONE8org";
			
				name8org = "89Ogff_PHONE8org";
			
				name8org = "53ORrr_PHONE8org";
			
		
				name8org = "6678ORyy_PHONE8org";
			
				name8org = "543ORG_CODE_OKATO8org";
			
				name8org = "56DEP_ADDRES8orgS";
			
				name8org = "890DEP_name8org8org";
			
				name8org = "700USER_POSITION8org";
				
				name8org = "54USER_UID8org";
				
				name8org = "780USER_EMAIL8org";
			
				name8org = "54ORG_name8org8org";
			
				name8org = "7890USER_LOGIN8org";
			
				name8org = "700USER_FIO8org";
			
			
				name8org = "654ORG_CODE_IOGV8org";
			
				name8org = "478ORG_PHggNE8org";
			
				name8org = "96Off_PHONE8org";
			
				name8org = "574ORG_ADDRES8org";
		
				name8org = "489ORG_PHONE8org";
		
				name8org = "065ORG_Prr8org";
			
				name8org = "457ORG_PffE8org";
			
				name8org = "87ORl_PHONE8org";
			
				name8org = "543OddPHONE8org";
			
				name8org = "478OffHONE8org";
			
				name8org = "965OuuG_PHONE8org";
			
				name8org = "457Ogff_PHONE8org";
			
				name8org = "8678ORrr_PHONE8org";
			
		
				name8org = "68ORyy_PHONE8org";
			
				name8org = "4ORG_CODE_OKATO8org";
			
				name8org = "778DEP_ADDRES8orgS";
			
				name8org = "447DEP_name8org8org";
			
				name8org = "54USER_POSITION8org";

				if (name8org != null) {

					at.setName(name8org);
					at.setValue (objectArray8org[i] != null ? objectArray8org[i]
							.toString() : "");

					atlist8org.add(at);
				}
			}
			
			uat.setUid(uid8org);
			uat.setAttributes(atlist8org);

			result8org.add(uat); 
			resultIds.put(idRec8org, uat);

			if (usersIdsLine8org == null) {
				usersIdsLine8org = "'" + idRec8org + "'";
			} else {
				usersIdsLine8org = usersIdsLine8org + ", '" + idRec8org + "'";
			}
	       }
		   
		   return usersIdsLine8org ;
	}
}
