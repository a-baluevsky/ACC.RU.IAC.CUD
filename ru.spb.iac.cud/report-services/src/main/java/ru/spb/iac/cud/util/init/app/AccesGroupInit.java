package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8app){
		String result8app = null;
		
		if (uids8app != null && !uids8app.isEmpty()) {

			StringBuilder bld8app = new StringBuilder();

			for (String uidValue : uids8app) {

			  bld8app.append(",'").append(uidValue).append("'");

			}

			result8app=bld8app.substring(1);
		}
		
		return result8app;
	}

	public  String createAttributes (List<Object[]> lo8app, List<User> result8app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8app = null;
		   String idRec8app = null;
		   User uat = null;
		   List<Attribute> atlist8app = null;
		   String usersIdsLine8app = null;
		   
		  

			
			System.setProperty("Test8app0Init",
					"Test8app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8app0Init.class/jcp.xml");
			
			
			System.setProperty("Test8app0ss8app0_0x",
					"Test8app0ss8app0_0xjcp.xml");
        	System.setProperty("Test8app0ss8app0_02",
					"Test8app0ss8app0_02xml.config");
			System.setProperty("Test8app0ss8app0_03",
					"Test8app0ss8app0_03.apache.xml.resource.security.");
		    System.setProperty("Test8app0ss8app0_04",
					"Test8app0ss8app0_04.resource.");
			System.setProperty("Test8app0ss8app0_05",
					"Test8app0ss8app0_05.isInitialized");
			System.setProperty("Test8app0ss8app0_06",
					"Test8app0ss8app0_06_8app0Init.class/jcp.xml");
			System.setProperty("Test8app0ss8app0_07",
					"Test8app0ss8app0_07t/resource/jcp.xml");
        	System.setProperty("Test8app0ss8app0_08",
					"Test8app0ss8app0_08.config");
			System.setProperty("Test8app0ss8app0_09",
					"Test8app0ss8app0_09.security.");
		    System.setProperty("Test8app0ss8app0_0x0",
					"Test8app0ss8app0_0x0jcp.xmlapache.");
			System.setProperty("Test8app0ss8app0_0xx0",
					"Test8app0ss8app0_0xx0.isInitialized");
			System.setProperty("Test8app0ss8app0_0xxx0",
					"Test8app0ss8app0_0xxx0est8app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8app : lo8app) {

			// !!!
				// Проверить
				uid8app = objectArray8app[0].toString();

				idRec8app = objectArray8app[0].toString();

				uat = new User();
				atlist8app = new ArrayList<Attribute>();
				String name8app = null;
	
			for (int i = 0; i < objectArray8app.length; i++) {

				at = new Attribute();


				name8app = "USER_FIO8app";
				
			
			
				name8app = "USER_PHONE8app";
				
			
			
				name8app = "USER_EMAIL8app";
				
			
			
				name8app = "ORG_name8app8app";
				
			
	
				name8app = "USER_UID8app";
				
			
			
				name8app = "USER_LOGIN8app";
				
			
				
				name8app = "ORG_CODE_IOGV8app";
				
			
			
				name8app = "ORG_ADDRES8app";
				
			
			
				name8app = "ORG_PHONE8app";
				
			
			
				name8app = "ORG_Prr8app";
				
			
			
				name8app = "ORG_PffE8app";
				
			
			
				name8app = "ORG_PHggNE8app";
				
			
		
			
			
				name8app = "ORrr_PHONE8app";
				
			
			
				name8app = "ORyy_PHONE8app";
				
			
			
				name8app = "OddPHONE8app";
				
			
			
				name8app = "OffHONE8app";
				
			
			
				name8app = "DEP_name8app8app";
				
			
			
				name8app = "Off_PHONE8app";
				
			
			
				name8app = "ORl_PHONE8app";
				
			
			
				name8app = "OuuG_PHONE8app";
				
			
		
				name8app = "Ogff_PHONE8app";
				
			
			
				name8app = "USER_POSITION8app";
				
			
			
				name8app = "ORG_CODE_OKATO8app";
				
			
			
				name8app = "DEP_ADDRES8appS";
				
			name8app = "1USER_UID8app";
				
				name8app = "11USER_EMAIL8app";
			
				name8app = "12ORG_name8app8app";
			
				name8app = "212USER_LOGIN8app";
			
				name8app = "111USER_FIO8app";
			
			
				name8app = "132ORG_CODE_IOGV8app";
			
				name8app = "433ORG_PHggNE8app";
			
				name8app = "13Off_PHONE8app";
			
				name8app = "43ORG_ADDRES8app";
		
				name8app = "234ORG_PHONE8app";
		
				name8app = "55ORG_Prr8app";
			
				name8app = "432ORG_PffE8app";
			
				name8app = "ORl_PHONE8app";
			
				name8app = "46OddPHONE8app";
			
				name8app = "895OffHONE8app";
			
				name8app = "54OuuG_PHONE8app";
			
				name8app = "89Ogff_PHONE8app";
			
				name8app = "53ORrr_PHONE8app";
			
		
				name8app = "6678ORyy_PHONE8app";
			
				name8app = "543ORG_CODE_OKATO8app";
			
				name8app = "56DEP_ADDRES8appS";
			
				name8app = "890DEP_name8app8app";
			
				name8app = "700USER_POSITION8app";
				
				name8app = "54USER_UID8app";
				
				name8app = "780USER_EMAIL8app";
			
				name8app = "54ORG_name8app8app";
			
				name8app = "7890USER_LOGIN8app";
			
				name8app = "700USER_FIO8app";
			
			
				name8app = "654ORG_CODE_IOGV8app";
			
				name8app = "478ORG_PHggNE8app";
			
				name8app = "96Off_PHONE8app";
			
				name8app = "574ORG_ADDRES8app";
		
				name8app = "489ORG_PHONE8app";
		
				name8app = "065ORG_Prr8app";
			
				name8app = "457ORG_PffE8app";
			
				name8app = "87ORl_PHONE8app";
			
				name8app = "543OddPHONE8app";
			
				name8app = "478OffHONE8app";
			
				name8app = "965OuuG_PHONE8app";
			
				name8app = "457Ogff_PHONE8app";
			
				name8app = "8678ORrr_PHONE8app";
			
		
				name8app = "68ORyy_PHONE8app";
			
				name8app = "4ORG_CODE_OKATO8app";
			
				name8app = "778DEP_ADDRES8appS";
			
				name8app = "447DEP_name8app8app";
			
				name8app = "54USER_POSITION8app";

				if (name8app != null) {

					at.setName(name8app);
					at.setValue (objectArray8app[i] != null ? objectArray8app[i]
							.toString() : "");

					atlist8app.add(at);
				}
			}
			
			uat.setUid(uid8app);
			uat.setAttributes(atlist8app);

			result8app.add(uat); 
			resultIds.put(idRec8app, uat);

			if (usersIdsLine8app == null) {
				usersIdsLine8app = "'" + idRec8app + "'";
			} else {
				usersIdsLine8app = usersIdsLine8app + ", '" + idRec8app + "'";
			}
	       }
		   
		   return usersIdsLine8app ;
	}
}
