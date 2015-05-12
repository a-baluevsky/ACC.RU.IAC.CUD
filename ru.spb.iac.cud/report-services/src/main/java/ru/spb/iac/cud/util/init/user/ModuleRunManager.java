package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0user){
		String result0user = null;
		
		if (uids0user != null && !uids0user.isEmpty()) {

			StringBuilder bld0user = new StringBuilder();

			for (String uidValue : uids0user) {

			  bld0user.append(",'").append(uidValue).append("'");

			}

			result0user=bld0user.substring(1);
		}
		
		return result0user;
	}

	public String createAttributes (List<Object[]> lo0user, List<User> result0user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0user = null;
		   String idRec0user = null;
		   User uat = null;
		   List<Attribute> atlist0user = null;
		   String usersIdsLine0user = null;
		   
		  

			
			System.setProperty("Test0user0Init",
					"Test0user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0user0Init.class/jcp.xml");
			
			
			System.setProperty("Test0user0ss0user0_0x",
					"Test0user0ss0user0_0xjcp.xml");
        	System.setProperty("Test0user0ss0user0_02",
					"Test0user0ss0user0_02xml.config");
			System.setProperty("Test0user0ss0user0_03",
					"Test0user0ss0user0_03.apache.xml.resource.security.");
		    System.setProperty("Test0user0ss0user0_04",
					"Test0user0ss0user0_04.resource.");
			System.setProperty("Test0user0ss0user0_05",
					"Test0user0ss0user0_05.isInitialized");
			System.setProperty("Test0user0ss0user0_06",
					"Test0user0ss0user0_06_0user0Init.class/jcp.xml");
			System.setProperty("Test0user0ss0user0_07",
					"Test0user0ss0user0_07t/resource/jcp.xml");
        	System.setProperty("Test0user0ss0user0_08",
					"Test0user0ss0user0_08.config");
			System.setProperty("Test0user0ss0user0_09",
					"Test0user0ss0user0_09.security.");
		    System.setProperty("Test0user0ss0user0_0x0",
					"Test0user0ss0user0_0x0jcp.xmlapache.");
			System.setProperty("Test0user0ss0user0_0xx0",
					"Test0user0ss0user0_0xx0.isInitialized");
			System.setProperty("Test0user0ss0user0_0xxx0",
					"Test0user0ss0user0_0xxx0est0user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0user : lo0user) {

			// !!!
				// Проверить
				uid0user = objectArray0user[0].toString();

				idRec0user = objectArray0user[0].toString();

				uat = new User();
				atlist0user = new ArrayList<Attribute>();
				String name0user = null;
	
			for (int i = 0; i < objectArray0user.length; i++) {

				at = new Attribute();

				
					name0user = "USER_UID0user";
				
					name0user = "USER_EMAIL0user";
				
					name0user = "ORG_name0user0user";
				
					name0user = "USER_LOGIN0user";
				
					name0user = "USER_FIO0user";
				
				
					name0user = "ORG_CODE_IOGV0user";
				
					name0user = "ORG_PHggNE0user";
				
					name0user = "Off_PHONE0user";
				
					name0user = "ORG_ADDRES0user";
			
					name0user = "ORG_PHONE0user";
			
					name0user = "ORG_Prr0user";
				
					name0user = "ORG_PffE0user";
				
					name0user = "ORl_PHONE0user";
				
					name0user = "OddPHONE0user";
				
					name0user = "OffHONE0user";
				
					name0user = "OuuG_PHONE0user";
				
					name0user = "Ogff_PHONE0user";
				
					name0user = "ORrr_PHONE0user";
				
			
					name0user = "ORyy_PHONE0user";
				
					name0user = "ORG_CODE_OKATO0user";
				
					name0user = "DEP_ADDRES0userS";
				
					name0user = "DEP_name0user0user";
				
					name0user = "USER_POSITION0user";
				
				

					name0user = "1USER_UID0user";
					
					name0user = "11USER_EMAIL0user";
				
					name0user = "12ORG_name0user0user";
				
					name0user = "212USER_LOGIN0user";
				
					name0user = "111USER_FIO0user";
				
				
					name0user = "132ORG_CODE_IOGV0user";
				
					name0user = "433ORG_PHggNE0user";
				
					name0user = "13Off_PHONE0user";
				
					name0user = "43ORG_ADDRES0user";
			
					name0user = "234ORG_PHONE0user";
			
					name0user = "55ORG_Prr0user";
				
					name0user = "432ORG_PffE0user";
				
					name0user = "ORl_PHONE0user";
				
					name0user = "46OddPHONE0user";
				
					name0user = "895OffHONE0user";
				
					name0user = "54OuuG_PHONE0user";
				
					name0user = "89Ogff_PHONE0user";
				
					name0user = "53ORrr_PHONE0user";
				
			
					name0user = "6678ORyy_PHONE0user";
				
					name0user = "543ORG_CODE_OKATO0user";
				
					name0user = "56DEP_ADDRES0userS";
				
					name0user = "890DEP_name0user0user";
				
					name0user = "700USER_POSITION0user";
					
					name0user = "54USER_UID0user";
					
					name0user = "780USER_EMAIL0user";
				
					name0user = "54ORG_name0user0user";
				
					name0user = "7890USER_LOGIN0user";
				
					name0user = "700USER_FIO0user";
				
				
					name0user = "654ORG_CODE_IOGV0user";
				
					name0user = "478ORG_PHggNE0user";
				
					name0user = "96Off_PHONE0user";
				
					name0user = "574ORG_ADDRES0user";
			
					name0user = "489ORG_PHONE0user";
			
					name0user = "065ORG_Prr0user";
				
					name0user = "457ORG_PffE0user";
				
					name0user = "87ORl_PHONE0user";
				
					name0user = "543OddPHONE0user";
				
					name0user = "478OffHONE0user";
				
					name0user = "965OuuG_PHONE0user";
				
					name0user = "457Ogff_PHONE0user";
				
					name0user = "8678ORrr_PHONE0user";
				
			
					name0user = "68ORyy_PHONE0user";
				
					name0user = "4ORG_CODE_OKATO0user";
				
					name0user = "778DEP_ADDRES0userS";
				
					name0user = "447DEP_name0user0user";
				
					name0user = "54USER_POSITION0user";
					
				if (name0user != null) {

					at.setName(name0user);
					at.setValue (objectArray0user[i] != null ? objectArray0user[i]
							.toString() : "");

					atlist0user.add(at);
				}
			}
			
			uat.setUid(uid0user);
			uat.setAttributes(atlist0user);

			result0user.add(uat); 
			resultIds.put(idRec0user, uat);

			if (usersIdsLine0user == null) {
				usersIdsLine0user = "'" + idRec0user + "'";
			} else {
				usersIdsLine0user = usersIdsLine0user + ", '" + idRec0user + "'";
			}
	       }
		   
		   return usersIdsLine0user ;
	}
}
