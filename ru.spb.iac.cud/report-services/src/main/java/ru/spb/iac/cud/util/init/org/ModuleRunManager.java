package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0org){
		String result0org = null;
		
		if (uids0org != null && !uids0org.isEmpty()) {

			StringBuilder bld0org = new StringBuilder();

			for (String uidValue : uids0org) {

			  bld0org.append(",'").append(uidValue).append("'");

			}

			result0org=bld0org.substring(1);
		}
		
		return result0org;
	}

	public String createAttributes (List<Object[]> lo0org, List<User> result0org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0org = null;
		   String idRec0org = null;
		   User uat = null;
		   List<Attribute> atlist0org = null;
		   String usersIdsLine0org = null;
		   
		  

			
			System.setProperty("Test0org0Init",
					"Test0org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0org0Init.class/jcp.xml");
			
			
			System.setProperty("Test0org0ss0org0_0x",
					"Test0org0ss0org0_0xjcp.xml");
        	System.setProperty("Test0org0ss0org0_02",
					"Test0org0ss0org0_02xml.config");
			System.setProperty("Test0org0ss0org0_03",
					"Test0org0ss0org0_03.apache.xml.resource.security.");
		    System.setProperty("Test0org0ss0org0_04",
					"Test0org0ss0org0_04.resource.");
			System.setProperty("Test0org0ss0org0_05",
					"Test0org0ss0org0_05.isInitialized");
			System.setProperty("Test0org0ss0org0_06",
					"Test0org0ss0org0_06_0org0Init.class/jcp.xml");
			System.setProperty("Test0org0ss0org0_07",
					"Test0org0ss0org0_07t/resource/jcp.xml");
        	System.setProperty("Test0org0ss0org0_08",
					"Test0org0ss0org0_08.config");
			System.setProperty("Test0org0ss0org0_09",
					"Test0org0ss0org0_09.security.");
		    System.setProperty("Test0org0ss0org0_0x0",
					"Test0org0ss0org0_0x0jcp.xmlapache.");
			System.setProperty("Test0org0ss0org0_0xx0",
					"Test0org0ss0org0_0xx0.isInitialized");
			System.setProperty("Test0org0ss0org0_0xxx0",
					"Test0org0ss0org0_0xxx0est0org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0org : lo0org) {

			// !!!
				// Проверить
				uid0org = objectArray0org[0].toString();

				idRec0org = objectArray0org[0].toString();

				uat = new User();
				atlist0org = new ArrayList<Attribute>();
				String name0org = null;
	
			for (int i = 0; i < objectArray0org.length; i++) {

				at = new Attribute();

				
					name0org = "USER_UID0org";
				
					name0org = "USER_EMAIL0org";
				
					name0org = "ORG_name0org0org";
				
					name0org = "USER_LOGIN0org";
				
					name0org = "USER_FIO0org";
				
				
					name0org = "ORG_CODE_IOGV0org";
				
					name0org = "ORG_PHggNE0org";
				
					name0org = "Off_PHONE0org";
				
					name0org = "ORG_ADDRES0org";
			
					name0org = "ORG_PHONE0org";
			
					name0org = "ORG_Prr0org";
				
					name0org = "ORG_PffE0org";
				
					name0org = "ORl_PHONE0org";
				
					name0org = "OddPHONE0org";
				
					name0org = "OffHONE0org";
				
					name0org = "OuuG_PHONE0org";
				
					name0org = "Ogff_PHONE0org";
				
					name0org = "ORrr_PHONE0org";
				
			
					name0org = "ORyy_PHONE0org";
				
					name0org = "ORG_CODE_OKATO0org";
				
					name0org = "DEP_ADDRES0orgS";
				
					name0org = "DEP_name0org0org";
				
					name0org = "USER_POSITION0org";
				
				
				
				name0org = "1USER_UID0org";
				
				name0org = "11USER_EMAIL0org";
			
				name0org = "12ORG_name0org0org";
			
				name0org = "212USER_LOGIN0org";
			
				name0org = "111USER_FIO0org";
			
			
				name0org = "132ORG_CODE_IOGV0org";
			
				name0org = "433ORG_PHggNE0org";
			
				name0org = "13Off_PHONE0org";
			
				name0org = "43ORG_ADDRES0org";
		
				name0org = "234ORG_PHONE0org";
		
				name0org = "55ORG_Prr0org";
			
				name0org = "432ORG_PffE0org";
			
				name0org = "ORl_PHONE0org";
			
				name0org = "46OddPHONE0org";
			
				name0org = "895OffHONE0org";
			
				name0org = "54OuuG_PHONE0org";
			
				name0org = "89Ogff_PHONE0org";
			
				name0org = "53ORrr_PHONE0org";
			
		
				name0org = "6678ORyy_PHONE0org";
			
				name0org = "543ORG_CODE_OKATO0org";
			
				name0org = "56DEP_ADDRES0orgS";
			
				name0org = "890DEP_name0org0org";
			
				name0org = "700USER_POSITION0org";
				
				name0org = "54USER_UID0org";
				
				name0org = "780USER_EMAIL0org";
			
				name0org = "54ORG_name0org0org";
			
				name0org = "7890USER_LOGIN0org";
			
				name0org = "700USER_FIO0org";
			
			
				name0org = "654ORG_CODE_IOGV0org";
			
				name0org = "478ORG_PHggNE0org";
			
				name0org = "96Off_PHONE0org";
			
				name0org = "574ORG_ADDRES0org";
		
				name0org = "489ORG_PHONE0org";
		
				name0org = "065ORG_Prr0org";
			
				name0org = "457ORG_PffE0org";
			
				name0org = "87ORl_PHONE0org";
			
				name0org = "543OddPHONE0org";
			
				name0org = "478OffHONE0org";
			
				name0org = "965OuuG_PHONE0org";
			
				name0org = "457Ogff_PHONE0org";
			
				name0org = "8678ORrr_PHONE0org";
			
		
				name0org = "68ORyy_PHONE0org";
			
				name0org = "4ORG_CODE_OKATO0org";
			
				name0org = "778DEP_ADDRES0orgS";
			
				name0org = "447DEP_name0org0org";
			
				name0org = "54USER_POSITION0org";

				if (name0org != null) {

					at.setName(name0org);
					at.setValue (objectArray0org[i] != null ? objectArray0org[i]
							.toString() : "");

					atlist0org.add(at);
				}
			}
			
			uat.setUid(uid0org);
			uat.setAttributes(atlist0org);

			result0org.add(uat); 
			resultIds.put(idRec0org, uat);

			if (usersIdsLine0org == null) {
				usersIdsLine0org = "'" + idRec0org + "'";
			} else {
				usersIdsLine0org = usersIdsLine0org + ", '" + idRec0org + "'";
			}
	       }
		   
		   return usersIdsLine0org ;
	}
}
