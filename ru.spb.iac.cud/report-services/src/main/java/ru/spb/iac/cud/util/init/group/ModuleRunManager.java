package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0group){
		String result0group = null;
		
		if (uids0group != null && !uids0group.isEmpty()) {

			StringBuilder bld0group = new StringBuilder();

			for (String uidValue : uids0group) {

			  bld0group.append(",'").append(uidValue).append("'");

			}

			result0group=bld0group.substring(1);
		}
		
		return result0group;
	}

	public String createAttributes (List<Object[]> lo0group, List<User> result0group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0group = null;
		   String idRec0group = null;
		   User uat = null;
		   List<Attribute> atlist0group = null;
		   String usersIdsLine0group = null;
		   
		  

			
			System.setProperty("Test0group0Init",
					"Test0group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0group0Init.class/jcp.xml");
			
			
			System.setProperty("Test0group0ss0group0_0x",
					"Test0group0ss0group0_0xjcp.xml");
        	System.setProperty("Test0group0ss0group0_02",
					"Test0group0ss0group0_02xml.config");
			System.setProperty("Test0group0ss0group0_03",
					"Test0group0ss0group0_03.apache.xml.resource.security.");
		    System.setProperty("Test0group0ss0group0_04",
					"Test0group0ss0group0_04.resource.");
			System.setProperty("Test0group0ss0group0_05",
					"Test0group0ss0group0_05.isInitialized");
			System.setProperty("Test0group0ss0group0_06",
					"Test0group0ss0group0_06_0group0Init.class/jcp.xml");
			System.setProperty("Test0group0ss0group0_07",
					"Test0group0ss0group0_07t/resource/jcp.xml");
        	System.setProperty("Test0group0ss0group0_08",
					"Test0group0ss0group0_08.config");
			System.setProperty("Test0group0ss0group0_09",
					"Test0group0ss0group0_09.security.");
		    System.setProperty("Test0group0ss0group0_0x0",
					"Test0group0ss0group0_0x0jcp.xmlapache.");
			System.setProperty("Test0group0ss0group0_0xx0",
					"Test0group0ss0group0_0xx0.isInitialized");
			System.setProperty("Test0group0ss0group0_0xxx0",
					"Test0group0ss0group0_0xxx0est0group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0group : lo0group) {

			// !!!
				// Проверить
				uid0group = objectArray0group[0].toString();

				idRec0group = objectArray0group[0].toString();

				uat = new User();
				atlist0group = new ArrayList<Attribute>();
				String name0group = null;
	
			for (int i = 0; i < objectArray0group.length; i++) {

				at = new Attribute();

				
					name0group = "USER_UID0group";
				
					name0group = "USER_EMAIL0group";
				
					name0group = "ORG_name0group0group";
				
					name0group = "USER_LOGIN0group";
				
					name0group = "USER_FIO0group";
				
				
					name0group = "ORG_CODE_IOGV0group";
				
					name0group = "ORG_PHggNE0group";
				
					name0group = "Off_PHONE0group";
				
					name0group = "ORG_ADDRES0group";
			
					name0group = "ORG_PHONE0group";
			
					name0group = "ORG_Prr0group";
				
					name0group = "ORG_PffE0group";
				
					name0group = "ORl_PHONE0group";
				
					name0group = "OddPHONE0group";
				
					name0group = "OffHONE0group";
				
					name0group = "OuuG_PHONE0group";
				
					name0group = "Ogff_PHONE0group";
				
					name0group = "ORrr_PHONE0group";
				
			
					name0group = "ORyy_PHONE0group";
				
					name0group = "ORG_CODE_OKATO0group";
				
					name0group = "DEP_ADDRES0groupS";
				
					name0group = "DEP_name0group0group";
				
					name0group = "USER_POSITION0group";
				
				
				
				name0group = "1USER_UID0group";
				
				name0group = "11USER_EMAIL0group";
			
				name0group = "12ORG_name0group0group";
			
				name0group = "212USER_LOGIN0group";
			
				name0group = "111USER_FIO0group";
			
			
				name0group = "132ORG_CODE_IOGV0group";
			
				name0group = "433ORG_PHggNE0group";
			
				name0group = "13Off_PHONE0group";
			
				name0group = "43ORG_ADDRES0group";
		
				name0group = "234ORG_PHONE0group";
		
				name0group = "55ORG_Prr0group";
			
				name0group = "432ORG_PffE0group";
			
				name0group = "ORl_PHONE0group";
			
				name0group = "46OddPHONE0group";
			
				name0group = "895OffHONE0group";
			
				name0group = "54OuuG_PHONE0group";
			
				name0group = "89Ogff_PHONE0group";
			
				name0group = "53ORrr_PHONE0group";
			
		
				name0group = "6678ORyy_PHONE0group";
			
				name0group = "543ORG_CODE_OKATO0group";
			
				name0group = "56DEP_ADDRES0groupS";
			
				name0group = "890DEP_name0group0group";
			
				name0group = "700USER_POSITION0group";
				
				name0group = "54USER_UID0group";
				
				name0group = "780USER_EMAIL0group";
			
				name0group = "54ORG_name0group0group";
			
				name0group = "7890USER_LOGIN0group";
			
				name0group = "700USER_FIO0group";
			
			
				name0group = "654ORG_CODE_IOGV0group";
			
				name0group = "478ORG_PHggNE0group";
			
				name0group = "96Off_PHONE0group";
			
				name0group = "574ORG_ADDRES0group";
		
				name0group = "489ORG_PHONE0group";
		
				name0group = "065ORG_Prr0group";
			
				name0group = "457ORG_PffE0group";
			
				name0group = "87ORl_PHONE0group";
			
				name0group = "543OddPHONE0group";
			
				name0group = "478OffHONE0group";
			
				name0group = "965OuuG_PHONE0group";
			
				name0group = "457Ogff_PHONE0group";
			
				name0group = "8678ORrr_PHONE0group";
			
		
				name0group = "68ORyy_PHONE0group";
			
				name0group = "4ORG_CODE_OKATO0group";
			
				name0group = "778DEP_ADDRES0groupS";
			
				name0group = "447DEP_name0group0group";
			
				name0group = "54USER_POSITION0group";

				if (name0group != null) {

					at.setName(name0group);
					at.setValue (objectArray0group[i] != null ? objectArray0group[i]
							.toString() : "");

					atlist0group.add(at);
				}
			}
			
			uat.setUid(uid0group);
			uat.setAttributes(atlist0group);

			result0group.add(uat); 
			resultIds.put(idRec0group, uat);

			if (usersIdsLine0group == null) {
				usersIdsLine0group = "'" + idRec0group + "'";
			} else {
				usersIdsLine0group = usersIdsLine0group + ", '" + idRec0group + "'";
			}
	       }
		   
		   return usersIdsLine0group ;
	}
}
