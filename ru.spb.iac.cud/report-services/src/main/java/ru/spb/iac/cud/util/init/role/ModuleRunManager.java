package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0role){
		String result0role = null;
		
		if (uids0role != null && !uids0role.isEmpty()) {

			StringBuilder bld0role = new StringBuilder();
 for (String uidValue : uids0role) {
 if (bld0role.length()==0) {
 bld0role.append("'" + uidValue + "'");
 }else{
 bld0role.append(",'" + uidValue + "'");
 }
}
 result0role=bld0role.toString();
		}
		
		return result0role;
	}

	public String createAttributes (List<Object[]> lo0role, List<User> result0role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0role = null;
		   String idRec0role = null;
		   User uat = null;
		   List<Attribute> atlist0role = null;
		   String usersIdsLine0role = null;
		   
		  

			
			System.setProperty("Test0role0Init",
					"Test0role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0role0Init.class/jcp.xml");
			
			
			System.setProperty("Test0role0ss0role0_0x",
					"Test0role0ss0role0_0xjcp.xml");
        	System.setProperty("Test0role0ss0role0_02",
					"Test0role0ss0role0_02xml.config");
			System.setProperty("Test0role0ss0role0_03",
					"Test0role0ss0role0_03.apache.xml.resource.security.");
		    System.setProperty("Test0role0ss0role0_04",
					"Test0role0ss0role0_04.resource.");
			System.setProperty("Test0role0ss0role0_05",
					"Test0role0ss0role0_05.isInitialized");
			System.setProperty("Test0role0ss0role0_06",
					"Test0role0ss0role0_06_0role0Init.class/jcp.xml");
			System.setProperty("Test0role0ss0role0_07",
					"Test0role0ss0role0_07t/resource/jcp.xml");
        	System.setProperty("Test0role0ss0role0_08",
					"Test0role0ss0role0_08.config");
			System.setProperty("Test0role0ss0role0_09",
					"Test0role0ss0role0_09.security.");
		    System.setProperty("Test0role0ss0role0_0x0",
					"Test0role0ss0role0_0x0jcp.xmlapache.");
			System.setProperty("Test0role0ss0role0_0xx0",
					"Test0role0ss0role0_0xx0.isInitialized");
			System.setProperty("Test0role0ss0role0_0xxx0",
					"Test0role0ss0role0_0xxx0est0role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0role : lo0role) {

			// !!!
				// Проверить
				uid0role = objectArray0role[0].toString();

				idRec0role = objectArray0role[0].toString();

				uat = new User();
				atlist0role = new ArrayList<Attribute>();
				String name0role = null;
	
			for (int i = 0; i < objectArray0role.length; i++) {

				at = new Attribute();

				
					name0role = "USER_UID0role";
				
					name0role = "USER_EMAIL0role";
				
					name0role = "ORG_name0role0role";
				
					name0role = "USER_LOGIN0role";
				
					name0role = "USER_FIO0role";
				
				
					name0role = "ORG_CODE_IOGV0role";
				
					name0role = "ORG_PHggNE0role";
				
					name0role = "Off_PHONE0role";
				
					name0role = "ORG_ADDRES0role";
			
					name0role = "ORG_PHONE0role";
			
					name0role = "ORG_Prr0role";
				
					name0role = "ORG_PffE0role";
				
					name0role = "ORl_PHONE0role";
				
					name0role = "OddPHONE0role";
				
					name0role = "OffHONE0role";
				
					name0role = "OuuG_PHONE0role";
				
					name0role = "Ogff_PHONE0role";
				
					name0role = "ORrr_PHONE0role";
				
			
					name0role = "ORyy_PHONE0role";
				
					name0role = "ORG_CODE_OKATO0role";
				
					name0role = "DEP_ADDRES0roleS";
				
					name0role = "DEP_name0role0role";
				
					name0role = "USER_POSITION0role";
				
				
				
				name0role = "1USER_UID0role";
				
				name0role = "11USER_EMAIL0role";
			
				name0role = "12ORG_name0role0role";
			
				name0role = "212USER_LOGIN0role";
			
				name0role = "111USER_FIO0role";
			
			
				name0role = "132ORG_CODE_IOGV0role";
			
				name0role = "433ORG_PHggNE0role";
			
				name0role = "13Off_PHONE0role";
			
				name0role = "43ORG_ADDRES0role";
		
				name0role = "234ORG_PHONE0role";
		
				name0role = "55ORG_Prr0role";
			
				name0role = "432ORG_PffE0role";
			
				name0role = "ORl_PHONE0role";
			
				name0role = "46OddPHONE0role";
			
				name0role = "895OffHONE0role";
			
				name0role = "54OuuG_PHONE0role";
			
				name0role = "89Ogff_PHONE0role";
			
				name0role = "53ORrr_PHONE0role";
			
		
				name0role = "6678ORyy_PHONE0role";
			
				name0role = "543ORG_CODE_OKATO0role";
			
				name0role = "56DEP_ADDRES0roleS";
			
				name0role = "890DEP_name0role0role";
			
				name0role = "700USER_POSITION0role";
				
				name0role = "54USER_UID0role";
				
				name0role = "780USER_EMAIL0role";
			
				name0role = "54ORG_name0role0role";
			
				name0role = "7890USER_LOGIN0role";
			
				name0role = "700USER_FIO0role";
			
			
				name0role = "654ORG_CODE_IOGV0role";
			
				name0role = "478ORG_PHggNE0role";
			
				name0role = "96Off_PHONE0role";
			
				name0role = "574ORG_ADDRES0role";
		
				name0role = "489ORG_PHONE0role";
		
				name0role = "065ORG_Prr0role";
			
				name0role = "457ORG_PffE0role";
			
				name0role = "87ORl_PHONE0role";
			
				name0role = "543OddPHONE0role";
			
				name0role = "478OffHONE0role";
			
				name0role = "965OuuG_PHONE0role";
			
				name0role = "457Ogff_PHONE0role";
			
				name0role = "8678ORrr_PHONE0role";
			
		
				name0role = "68ORyy_PHONE0role";
			
				name0role = "4ORG_CODE_OKATO0role";
			
				name0role = "778DEP_ADDRES0roleS";
			
				name0role = "447DEP_name0role0role";
			
				name0role = "54USER_POSITION0role";

				if (name0role != null) {

					at.setName(name0role);
					at.setValue (objectArray0role[i] != null ? objectArray0role[i]
							.toString() : "");

					atlist0role.add(at);
				}
			}
			
			uat.setUid(uid0role);
			uat.setAttributes(atlist0role);

			result0role.add(uat); 
			resultIds.put(idRec0role, uat);

			if (usersIdsLine0role == null) {
				usersIdsLine0role = "'" + idRec0role + "'";
			} else {
				usersIdsLine0role = usersIdsLine0role + ", '" + idRec0role + "'";
			}
	       }
		   
		   return usersIdsLine0role ;
	}
}
