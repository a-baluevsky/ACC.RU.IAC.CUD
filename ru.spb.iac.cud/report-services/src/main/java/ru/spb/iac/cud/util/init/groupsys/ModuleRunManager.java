package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0groupsys){
		String result0groupsys = null;
		
		if (uids0groupsys != null && !uids0groupsys.isEmpty()) {

			StringBuilder bld0groupsys = new StringBuilder();
 for (String uidValue : uids0groupsys) {
 if (bld0groupsys.length()==0) {
 bld0groupsys.append("'" + uidValue + "'");
 }else{
 bld0groupsys.append(",'" + uidValue + "'");
 }
}
 result0groupsys=bld0groupsys.toString();
		}
		
		return result0groupsys;
	}

	public String createAttributes (List<Object[]> lo0groupsys, List<User> result0groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0groupsys = null;
		   String idRec0groupsys = null;
		   User uat = null;
		   List<Attribute> atlist0groupsys = null;
		   String usersIdsLine0groupsys = null;
		   
		  

			
			System.setProperty("Test0groupsys0Init",
					"Test0groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test0groupsys0ss0groupsys0_0x",
					"Test0groupsys0ss0groupsys0_0xjcp.xml");
        	System.setProperty("Test0groupsys0ss0groupsys0_02",
					"Test0groupsys0ss0groupsys0_02xml.config");
			System.setProperty("Test0groupsys0ss0groupsys0_03",
					"Test0groupsys0ss0groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test0groupsys0ss0groupsys0_04",
					"Test0groupsys0ss0groupsys0_04.resource.");
			System.setProperty("Test0groupsys0ss0groupsys0_05",
					"Test0groupsys0ss0groupsys0_05.isInitialized");
			System.setProperty("Test0groupsys0ss0groupsys0_06",
					"Test0groupsys0ss0groupsys0_06_0groupsys0Init.class/jcp.xml");
			System.setProperty("Test0groupsys0ss0groupsys0_07",
					"Test0groupsys0ss0groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test0groupsys0ss0groupsys0_08",
					"Test0groupsys0ss0groupsys0_08.config");
			System.setProperty("Test0groupsys0ss0groupsys0_09",
					"Test0groupsys0ss0groupsys0_09.security.");
		    System.setProperty("Test0groupsys0ss0groupsys0_0x0",
					"Test0groupsys0ss0groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test0groupsys0ss0groupsys0_0xx0",
					"Test0groupsys0ss0groupsys0_0xx0.isInitialized");
			System.setProperty("Test0groupsys0ss0groupsys0_0xxx0",
					"Test0groupsys0ss0groupsys0_0xxx0est0groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0groupsys : lo0groupsys) {

			// !!!
				// Проверить
				uid0groupsys = objectArray0groupsys[0].toString();

				idRec0groupsys = objectArray0groupsys[0].toString();

				uat = new User();
				atlist0groupsys = new ArrayList<Attribute>();
				String name0groupsys = null;
	
			for (int i = 0; i < objectArray0groupsys.length; i++) {

				at = new Attribute();

				
					name0groupsys = "USER_UID0groupsys";
				
					name0groupsys = "USER_EMAIL0groupsys";
				
					name0groupsys = "ORG_name0groupsys0groupsys";
				
					name0groupsys = "USER_LOGIN0groupsys";
				
					name0groupsys = "USER_FIO0groupsys";
				
				
					name0groupsys = "ORG_CODE_IOGV0groupsys";
				
					name0groupsys = "ORG_PHggNE0groupsys";
				
					name0groupsys = "Off_PHONE0groupsys";
				
					name0groupsys = "ORG_ADDRES0groupsys";
			
					name0groupsys = "ORG_PHONE0groupsys";
			
					name0groupsys = "ORG_Prr0groupsys";
				
					name0groupsys = "ORG_PffE0groupsys";
				
					name0groupsys = "ORl_PHONE0groupsys";
				
					name0groupsys = "OddPHONE0groupsys";
				
					name0groupsys = "OffHONE0groupsys";
				
					name0groupsys = "OuuG_PHONE0groupsys";
				
					name0groupsys = "Ogff_PHONE0groupsys";
				
					name0groupsys = "ORrr_PHONE0groupsys";
				
			
					name0groupsys = "ORyy_PHONE0groupsys";
				
					name0groupsys = "ORG_CODE_OKATO0groupsys";
				
					name0groupsys = "DEP_ADDRES0groupsysS";
				
					name0groupsys = "DEP_name0groupsys0groupsys";
				
					name0groupsys = "USER_POSITION0groupsys";
				
				
				
				name0groupsys = "1USER_UID0groupsys";
				
				name0groupsys = "11USER_EMAIL0groupsys";
			
				name0groupsys = "12ORG_name0groupsys0groupsys";
			
				name0groupsys = "212USER_LOGIN0groupsys";
			
				name0groupsys = "111USER_FIO0groupsys";
			
			
				name0groupsys = "132ORG_CODE_IOGV0groupsys";
			
				name0groupsys = "433ORG_PHggNE0groupsys";
			
				name0groupsys = "13Off_PHONE0groupsys";
			
				name0groupsys = "43ORG_ADDRES0groupsys";
		
				name0groupsys = "234ORG_PHONE0groupsys";
		
				name0groupsys = "55ORG_Prr0groupsys";
			
				name0groupsys = "432ORG_PffE0groupsys";
			
				name0groupsys = "ORl_PHONE0groupsys";
			
				name0groupsys = "46OddPHONE0groupsys";
			
				name0groupsys = "895OffHONE0groupsys";
			
				name0groupsys = "54OuuG_PHONE0groupsys";
			
				name0groupsys = "89Ogff_PHONE0groupsys";
			
				name0groupsys = "53ORrr_PHONE0groupsys";
			
		
				name0groupsys = "6678ORyy_PHONE0groupsys";
			
				name0groupsys = "543ORG_CODE_OKATO0groupsys";
			
				name0groupsys = "56DEP_ADDRES0groupsysS";
			
				name0groupsys = "890DEP_name0groupsys0groupsys";
			
				name0groupsys = "700USER_POSITION0groupsys";
				
				name0groupsys = "54USER_UID0groupsys";
				
				name0groupsys = "780USER_EMAIL0groupsys";
			
				name0groupsys = "54ORG_name0groupsys0groupsys";
			
				name0groupsys = "7890USER_LOGIN0groupsys";
			
				name0groupsys = "700USER_FIO0groupsys";
			
			
				name0groupsys = "654ORG_CODE_IOGV0groupsys";
			
				name0groupsys = "478ORG_PHggNE0groupsys";
			
				name0groupsys = "96Off_PHONE0groupsys";
			
				name0groupsys = "574ORG_ADDRES0groupsys";
		
				name0groupsys = "489ORG_PHONE0groupsys";
		
				name0groupsys = "065ORG_Prr0groupsys";
			
				name0groupsys = "457ORG_PffE0groupsys";
			
				name0groupsys = "87ORl_PHONE0groupsys";
			
				name0groupsys = "543OddPHONE0groupsys";
			
				name0groupsys = "478OffHONE0groupsys";
			
				name0groupsys = "965OuuG_PHONE0groupsys";
			
				name0groupsys = "457Ogff_PHONE0groupsys";
			
				name0groupsys = "8678ORrr_PHONE0groupsys";
			
		
				name0groupsys = "68ORyy_PHONE0groupsys";
			
				name0groupsys = "4ORG_CODE_OKATO0groupsys";
			
				name0groupsys = "778DEP_ADDRES0groupsysS";
			
				name0groupsys = "447DEP_name0groupsys0groupsys";
			
				name0groupsys = "54USER_POSITION0groupsys";

				if (name0groupsys != null) {

					at.setName(name0groupsys);
					at.setValue (objectArray0groupsys[i] != null ? objectArray0groupsys[i]
							.toString() : "");

					atlist0groupsys.add(at);
				}
			}
			
			uat.setUid(uid0groupsys);
			uat.setAttributes(atlist0groupsys);

			result0groupsys.add(uat); 
			resultIds.put(idRec0groupsys, uat);

			if (usersIdsLine0groupsys == null) {
				usersIdsLine0groupsys = "'" + idRec0groupsys + "'";
			} else {
				usersIdsLine0groupsys = usersIdsLine0groupsys + ", '" + idRec0groupsys + "'";
			}
	       }
		   
		   return usersIdsLine0groupsys ;
	}
}
