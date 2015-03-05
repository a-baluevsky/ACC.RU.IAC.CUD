package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0app){
		String result0app = null;
		
		if (uids0app != null && !uids0app.isEmpty()) {

			for (String uidValue : uids0app) {
				if (result0app == null) {
					result0app = "'" + uidValue + "'";
				} else {
					result0app = result0app + ", '" + uidValue + "'";
				}
			}
		}
		
		return result0app;
	}

	public String createAttributes (List<Object[]> lo0app, List<User> result0app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0app = null;
		   String idRec0app = null;
		   User uat = null;
		   List<Attribute> atlist0app = null;
		   String usersIdsLine0app = null;
		   
		  

			
			System.setProperty("Test0app0Init",
					"Test0app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0app0Init.class/jcp.xml");
			
			
			System.setProperty("Test0app0ss0app0_0x",
					"Test0app0ss0app0_0xjcp.xml");
        	System.setProperty("Test0app0ss0app0_02",
					"Test0app0ss0app0_02xml.config");
			System.setProperty("Test0app0ss0app0_03",
					"Test0app0ss0app0_03.apache.xml.resource.security.");
		    System.setProperty("Test0app0ss0app0_04",
					"Test0app0ss0app0_04.resource.");
			System.setProperty("Test0app0ss0app0_05",
					"Test0app0ss0app0_05.isInitialized");
			System.setProperty("Test0app0ss0app0_06",
					"Test0app0ss0app0_06_0app0Init.class/jcp.xml");
			System.setProperty("Test0app0ss0app0_07",
					"Test0app0ss0app0_07t/resource/jcp.xml");
        	System.setProperty("Test0app0ss0app0_08",
					"Test0app0ss0app0_08.config");
			System.setProperty("Test0app0ss0app0_09",
					"Test0app0ss0app0_09.security.");
		    System.setProperty("Test0app0ss0app0_0x0",
					"Test0app0ss0app0_0x0jcp.xmlapache.");
			System.setProperty("Test0app0ss0app0_0xx0",
					"Test0app0ss0app0_0xx0.isInitialized");
			System.setProperty("Test0app0ss0app0_0xxx0",
					"Test0app0ss0app0_0xxx0est0app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0app : lo0app) {

			// !!!
				// Проверить
				uid0app = objectArray0app[0].toString();

				idRec0app = objectArray0app[0].toString();

				uat = new User();
				atlist0app = new ArrayList<Attribute>();
				String name0app = null;
	
			for (int i = 0; i < objectArray0app.length; i++) {

				at = new Attribute();

				
					name0app = "USER_UID0app";
				
					name0app = "USER_EMAIL0app";
				
					name0app = "ORG_name0app0app";
				
					name0app = "USER_LOGIN0app";
				
					name0app = "USER_FIO0app";
				
				
					name0app = "ORG_CODE_IOGV0app";
				
					name0app = "ORG_PHggNE0app";
				
					name0app = "Off_PHONE0app";
				
					name0app = "ORG_ADDRES0app";
			
					name0app = "ORG_PHONE0app";
			
					name0app = "ORG_Prr0app";
				
					name0app = "ORG_PffE0app";
				
					name0app = "ORl_PHONE0app";
				
					name0app = "OddPHONE0app";
				
					name0app = "OffHONE0app";
				
					name0app = "OuuG_PHONE0app";
				
					name0app = "Ogff_PHONE0app";
				
					name0app = "ORrr_PHONE0app";
				
			
					name0app = "ORyy_PHONE0app";
				
					name0app = "ORG_CODE_OKATO0app";
				
					name0app = "DEP_ADDRES0appS";
				
					name0app = "DEP_name0app0app";
				
					name0app = "USER_POSITION0app";
				
				
				
				name0app = "1USER_UID0app";
				
				name0app = "11USER_EMAIL0app";
			
				name0app = "12ORG_name0app0app";
			
				name0app = "212USER_LOGIN0app";
			
				name0app = "111USER_FIO0app";
			
			
				name0app = "132ORG_CODE_IOGV0app";
			
				name0app = "433ORG_PHggNE0app";
			
				name0app = "13Off_PHONE0app";
			
				name0app = "43ORG_ADDRES0app";
		
				name0app = "234ORG_PHONE0app";
		
				name0app = "55ORG_Prr0app";
			
				name0app = "432ORG_PffE0app";
			
				name0app = "ORl_PHONE0app";
			
				name0app = "46OddPHONE0app";
			
				name0app = "895OffHONE0app";
			
				name0app = "54OuuG_PHONE0app";
			
				name0app = "89Ogff_PHONE0app";
			
				name0app = "53ORrr_PHONE0app";
			
		
				name0app = "6678ORyy_PHONE0app";
			
				name0app = "543ORG_CODE_OKATO0app";
			
				name0app = "56DEP_ADDRES0appS";
			
				name0app = "890DEP_name0app0app";
			
				name0app = "700USER_POSITION0app";
				
				name0app = "54USER_UID0app";
				
				name0app = "780USER_EMAIL0app";
			
				name0app = "54ORG_name0app0app";
			
				name0app = "7890USER_LOGIN0app";
			
				name0app = "700USER_FIO0app";
			
			
				name0app = "654ORG_CODE_IOGV0app";
			
				name0app = "478ORG_PHggNE0app";
			
				name0app = "96Off_PHONE0app";
			
				name0app = "574ORG_ADDRES0app";
		
				name0app = "489ORG_PHONE0app";
		
				name0app = "065ORG_Prr0app";
			
				name0app = "457ORG_PffE0app";
			
				name0app = "87ORl_PHONE0app";
			
				name0app = "543OddPHONE0app";
			
				name0app = "478OffHONE0app";
			
				name0app = "965OuuG_PHONE0app";
			
				name0app = "457Ogff_PHONE0app";
			
				name0app = "8678ORrr_PHONE0app";
			
		
				name0app = "68ORyy_PHONE0app";
			
				name0app = "4ORG_CODE_OKATO0app";
			
				name0app = "778DEP_ADDRES0appS";
			
				name0app = "447DEP_name0app0app";
			
				name0app = "54USER_POSITION0app";

				if (name0app != null) {

					at.setName(name0app);
					at.setValue (objectArray0app[i] != null ? objectArray0app[i]
							.toString() : "");

					atlist0app.add(at);
				}
			}
			
			uat.setUid(uid0app);
			uat.setAttributes(atlist0app);

			result0app.add(uat); 
			resultIds.put(idRec0app, uat);

			if (usersIdsLine0app == null) {
				usersIdsLine0app = "'" + idRec0app + "'";
			} else {
				usersIdsLine0app = usersIdsLine0app + ", '" + idRec0app + "'";
			}
	       }
		   
		   return usersIdsLine0app ;
	}
}
