package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8groupsys){
		String result8groupsys = null;
		
		if (uids8groupsys != null && !uids8groupsys.isEmpty()) {

			for (String uidValue : uids8groupsys) {
				if (result8groupsys == null) {
					result8groupsys = "'" + uidValue + "'";
				} else {
					result8groupsys = result8groupsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result8groupsys;
	}

	public  String createAttributes (List<Object[]> lo8groupsys, List<User> result8groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8groupsys = null;
		   String idRec8groupsys = null;
		   User uat = null;
		   List<Attribute> atlist8groupsys = null;
		   String usersIdsLine8groupsys = null;
		   
		  

			
			System.setProperty("Test8groupsys0Init",
					"Test8groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test8groupsys0ss8groupsys0_0x",
					"Test8groupsys0ss8groupsys0_0xjcp.xml");
        	System.setProperty("Test8groupsys0ss8groupsys0_02",
					"Test8groupsys0ss8groupsys0_02xml.config");
			System.setProperty("Test8groupsys0ss8groupsys0_03",
					"Test8groupsys0ss8groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test8groupsys0ss8groupsys0_04",
					"Test8groupsys0ss8groupsys0_04.resource.");
			System.setProperty("Test8groupsys0ss8groupsys0_05",
					"Test8groupsys0ss8groupsys0_05.isInitialized");
			System.setProperty("Test8groupsys0ss8groupsys0_06",
					"Test8groupsys0ss8groupsys0_06_8groupsys0Init.class/jcp.xml");
			System.setProperty("Test8groupsys0ss8groupsys0_07",
					"Test8groupsys0ss8groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test8groupsys0ss8groupsys0_08",
					"Test8groupsys0ss8groupsys0_08.config");
			System.setProperty("Test8groupsys0ss8groupsys0_09",
					"Test8groupsys0ss8groupsys0_09.security.");
		    System.setProperty("Test8groupsys0ss8groupsys0_0x0",
					"Test8groupsys0ss8groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test8groupsys0ss8groupsys0_0xx0",
					"Test8groupsys0ss8groupsys0_0xx0.isInitialized");
			System.setProperty("Test8groupsys0ss8groupsys0_0xxx0",
					"Test8groupsys0ss8groupsys0_0xxx0est8groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8groupsys : lo8groupsys) {

			// !!!
				// Проверить
				uid8groupsys = objectArray8groupsys[0].toString();

				idRec8groupsys = objectArray8groupsys[0].toString();

				uat = new User();
				atlist8groupsys = new ArrayList<Attribute>();
				String name8groupsys = null;
	
			for (int i = 0; i < objectArray8groupsys.length; i++) {

				at = new Attribute();


				name8groupsys = "USER_FIO8groupsys";
				
			
			
				name8groupsys = "USER_PHONE8groupsys";
				
			
			
				name8groupsys = "USER_EMAIL8groupsys";
				
			
			
				name8groupsys = "ORG_name8groupsys8groupsys";
				
			
	
				name8groupsys = "USER_UID8groupsys";
				
			
			
				name8groupsys = "USER_LOGIN8groupsys";
				
			
				
				name8groupsys = "ORG_CODE_IOGV8groupsys";
				
			
			
				name8groupsys = "ORG_ADDRES8groupsys";
				
			
			
				name8groupsys = "ORG_PHONE8groupsys";
				
			
			
				name8groupsys = "ORG_Prr8groupsys";
				
			
			
				name8groupsys = "ORG_PffE8groupsys";
				
			
			
				name8groupsys = "ORG_PHggNE8groupsys";
				
			
		
			
			
				name8groupsys = "ORrr_PHONE8groupsys";
				
			
			
				name8groupsys = "ORyy_PHONE8groupsys";
				
			
			
				name8groupsys = "OddPHONE8groupsys";
				
			
			
				name8groupsys = "OffHONE8groupsys";
				
			
			
				name8groupsys = "DEP_name8groupsys8groupsys";
				
			
			
				name8groupsys = "Off_PHONE8groupsys";
				
			
			
				name8groupsys = "ORl_PHONE8groupsys";
				
			
			
				name8groupsys = "OuuG_PHONE8groupsys";
				
			
		
				name8groupsys = "Ogff_PHONE8groupsys";
				
			
			
				name8groupsys = "USER_POSITION8groupsys";
				
			
			
				name8groupsys = "ORG_CODE_OKATO8groupsys";
				
			
			
				name8groupsys = "DEP_ADDRES8groupsysS";
				
			name8groupsys = "1USER_UID8groupsys";
				
				name8groupsys = "11USER_EMAIL8groupsys";
			
				name8groupsys = "12ORG_name8groupsys8groupsys";
			
				name8groupsys = "212USER_LOGIN8groupsys";
			
				name8groupsys = "111USER_FIO8groupsys";
			
			
				name8groupsys = "132ORG_CODE_IOGV8groupsys";
			
				name8groupsys = "433ORG_PHggNE8groupsys";
			
				name8groupsys = "13Off_PHONE8groupsys";
			
				name8groupsys = "43ORG_ADDRES8groupsys";
		
				name8groupsys = "234ORG_PHONE8groupsys";
		
				name8groupsys = "55ORG_Prr8groupsys";
			
				name8groupsys = "432ORG_PffE8groupsys";
			
				name8groupsys = "ORl_PHONE8groupsys";
			
				name8groupsys = "46OddPHONE8groupsys";
			
				name8groupsys = "895OffHONE8groupsys";
			
				name8groupsys = "54OuuG_PHONE8groupsys";
			
				name8groupsys = "89Ogff_PHONE8groupsys";
			
				name8groupsys = "53ORrr_PHONE8groupsys";
			
		
				name8groupsys = "6678ORyy_PHONE8groupsys";
			
				name8groupsys = "543ORG_CODE_OKATO8groupsys";
			
				name8groupsys = "56DEP_ADDRES8groupsysS";
			
				name8groupsys = "890DEP_name8groupsys8groupsys";
			
				name8groupsys = "700USER_POSITION8groupsys";
				
				name8groupsys = "54USER_UID8groupsys";
				
				name8groupsys = "780USER_EMAIL8groupsys";
			
				name8groupsys = "54ORG_name8groupsys8groupsys";
			
				name8groupsys = "7890USER_LOGIN8groupsys";
			
				name8groupsys = "700USER_FIO8groupsys";
			
			
				name8groupsys = "654ORG_CODE_IOGV8groupsys";
			
				name8groupsys = "478ORG_PHggNE8groupsys";
			
				name8groupsys = "96Off_PHONE8groupsys";
			
				name8groupsys = "574ORG_ADDRES8groupsys";
		
				name8groupsys = "489ORG_PHONE8groupsys";
		
				name8groupsys = "065ORG_Prr8groupsys";
			
				name8groupsys = "457ORG_PffE8groupsys";
			
				name8groupsys = "87ORl_PHONE8groupsys";
			
				name8groupsys = "543OddPHONE8groupsys";
			
				name8groupsys = "478OffHONE8groupsys";
			
				name8groupsys = "965OuuG_PHONE8groupsys";
			
				name8groupsys = "457Ogff_PHONE8groupsys";
			
				name8groupsys = "8678ORrr_PHONE8groupsys";
			
		
				name8groupsys = "68ORyy_PHONE8groupsys";
			
				name8groupsys = "4ORG_CODE_OKATO8groupsys";
			
				name8groupsys = "778DEP_ADDRES8groupsysS";
			
				name8groupsys = "447DEP_name8groupsys8groupsys";
			
				name8groupsys = "54USER_POSITION8groupsys";

				if (name8groupsys != null) {

					at.setName(name8groupsys);
					at.setValue (objectArray8groupsys[i] != null ? objectArray8groupsys[i]
							.toString() : "");

					atlist8groupsys.add(at);
				}
			}
			
			uat.setUid(uid8groupsys);
			uat.setAttributes(atlist8groupsys);

			result8groupsys.add(uat); 
			resultIds.put(idRec8groupsys, uat);

			if (usersIdsLine8groupsys == null) {
				usersIdsLine8groupsys = "'" + idRec8groupsys + "'";
			} else {
				usersIdsLine8groupsys = usersIdsLine8groupsys + ", '" + idRec8groupsys + "'";
			}
	       }
		   
		   return usersIdsLine8groupsys ;
	}
}
