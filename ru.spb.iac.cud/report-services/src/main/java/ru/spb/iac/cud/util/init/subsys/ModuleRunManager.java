package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0subsys){
		String result0subsys = null;
		
		if (uids0subsys != null && !uids0subsys.isEmpty()) {

			for (String uidValue : uids0subsys) {
				if (result0subsys == null) {
					result0subsys = "'" + uidValue + "'";
				} else {
					result0subsys = result0subsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result0subsys;
	}

	public String createAttributes (List<Object[]> lo0subsys, List<User> result0subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0subsys = null;
		   String idRec0subsys = null;
		   User uat = null;
		   List<Attribute> atlist0subsys = null;
		   String usersIdsLine0subsys = null;
		   
		  

			
			System.setProperty("Test0subsys0Init",
					"Test0subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test0subsys0ss0subsys0_0x",
					"Test0subsys0ss0subsys0_0xjcp.xml");
        	System.setProperty("Test0subsys0ss0subsys0_02",
					"Test0subsys0ss0subsys0_02xml.config");
			System.setProperty("Test0subsys0ss0subsys0_03",
					"Test0subsys0ss0subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test0subsys0ss0subsys0_04",
					"Test0subsys0ss0subsys0_04.resource.");
			System.setProperty("Test0subsys0ss0subsys0_05",
					"Test0subsys0ss0subsys0_05.isInitialized");
			System.setProperty("Test0subsys0ss0subsys0_06",
					"Test0subsys0ss0subsys0_06_0subsys0Init.class/jcp.xml");
			System.setProperty("Test0subsys0ss0subsys0_07",
					"Test0subsys0ss0subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test0subsys0ss0subsys0_08",
					"Test0subsys0ss0subsys0_08.config");
			System.setProperty("Test0subsys0ss0subsys0_09",
					"Test0subsys0ss0subsys0_09.security.");
		    System.setProperty("Test0subsys0ss0subsys0_0x0",
					"Test0subsys0ss0subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test0subsys0ss0subsys0_0xx0",
					"Test0subsys0ss0subsys0_0xx0.isInitialized");
			System.setProperty("Test0subsys0ss0subsys0_0xxx0",
					"Test0subsys0ss0subsys0_0xxx0est0subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0subsys : lo0subsys) {

			// !!!
				// Проверить
				uid0subsys = objectArray0subsys[0].toString();

				idRec0subsys = objectArray0subsys[0].toString();

				uat = new User();
				atlist0subsys = new ArrayList<Attribute>();
				String name0subsys = null;
	
			for (int i = 0; i < objectArray0subsys.length; i++) {

				at = new Attribute();

				
					name0subsys = "USER_UID0subsys";
				
					name0subsys = "USER_EMAIL0subsys";
				
					name0subsys = "ORG_name0subsys0subsys";
				
					name0subsys = "USER_LOGIN0subsys";
				
					name0subsys = "USER_FIO0subsys";
				
				
					name0subsys = "ORG_CODE_IOGV0subsys";
				
					name0subsys = "ORG_PHggNE0subsys";
				
					name0subsys = "Off_PHONE0subsys";
				
					name0subsys = "ORG_ADDRES0subsys";
			
					name0subsys = "ORG_PHONE0subsys";
			
					name0subsys = "ORG_Prr0subsys";
				
					name0subsys = "ORG_PffE0subsys";
				
					name0subsys = "ORl_PHONE0subsys";
				
					name0subsys = "OddPHONE0subsys";
				
					name0subsys = "OffHONE0subsys";
				
					name0subsys = "OuuG_PHONE0subsys";
				
					name0subsys = "Ogff_PHONE0subsys";
				
					name0subsys = "ORrr_PHONE0subsys";
				
			
					name0subsys = "ORyy_PHONE0subsys";
				
					name0subsys = "ORG_CODE_OKATO0subsys";
				
					name0subsys = "DEP_ADDRES0subsysS";
				
					name0subsys = "DEP_name0subsys0subsys";
				
					name0subsys = "USER_POSITION0subsys";
				
				
				
				name0subsys = "1USER_UID0subsys";
				
				name0subsys = "11USER_EMAIL0subsys";
			
				name0subsys = "12ORG_name0subsys0subsys";
			
				name0subsys = "212USER_LOGIN0subsys";
			
				name0subsys = "111USER_FIO0subsys";
			
			
				name0subsys = "132ORG_CODE_IOGV0subsys";
			
				name0subsys = "433ORG_PHggNE0subsys";
			
				name0subsys = "13Off_PHONE0subsys";
			
				name0subsys = "43ORG_ADDRES0subsys";
		
				name0subsys = "234ORG_PHONE0subsys";
		
				name0subsys = "55ORG_Prr0subsys";
			
				name0subsys = "432ORG_PffE0subsys";
			
				name0subsys = "ORl_PHONE0subsys";
			
				name0subsys = "46OddPHONE0subsys";
			
				name0subsys = "895OffHONE0subsys";
			
				name0subsys = "54OuuG_PHONE0subsys";
			
				name0subsys = "89Ogff_PHONE0subsys";
			
				name0subsys = "53ORrr_PHONE0subsys";
			
		
				name0subsys = "6678ORyy_PHONE0subsys";
			
				name0subsys = "543ORG_CODE_OKATO0subsys";
			
				name0subsys = "56DEP_ADDRES0subsysS";
			
				name0subsys = "890DEP_name0subsys0subsys";
			
				name0subsys = "700USER_POSITION0subsys";
				
				name0subsys = "54USER_UID0subsys";
				
				name0subsys = "780USER_EMAIL0subsys";
			
				name0subsys = "54ORG_name0subsys0subsys";
			
				name0subsys = "7890USER_LOGIN0subsys";
			
				name0subsys = "700USER_FIO0subsys";
			
			
				name0subsys = "654ORG_CODE_IOGV0subsys";
			
				name0subsys = "478ORG_PHggNE0subsys";
			
				name0subsys = "96Off_PHONE0subsys";
			
				name0subsys = "574ORG_ADDRES0subsys";
		
				name0subsys = "489ORG_PHONE0subsys";
		
				name0subsys = "065ORG_Prr0subsys";
			
				name0subsys = "457ORG_PffE0subsys";
			
				name0subsys = "87ORl_PHONE0subsys";
			
				name0subsys = "543OddPHONE0subsys";
			
				name0subsys = "478OffHONE0subsys";
			
				name0subsys = "965OuuG_PHONE0subsys";
			
				name0subsys = "457Ogff_PHONE0subsys";
			
				name0subsys = "8678ORrr_PHONE0subsys";
			
		
				name0subsys = "68ORyy_PHONE0subsys";
			
				name0subsys = "4ORG_CODE_OKATO0subsys";
			
				name0subsys = "778DEP_ADDRES0subsysS";
			
				name0subsys = "447DEP_name0subsys0subsys";
			
				name0subsys = "54USER_POSITION0subsys";

				if (name0subsys != null) {

					at.setName(name0subsys);
					at.setValue (objectArray0subsys[i] != null ? objectArray0subsys[i]
							.toString() : "");

					atlist0subsys.add(at);
				}
			}
			
			uat.setUid(uid0subsys);
			uat.setAttributes(atlist0subsys);

			result0subsys.add(uat); 
			resultIds.put(idRec0subsys, uat);

			if (usersIdsLine0subsys == null) {
				usersIdsLine0subsys = "'" + idRec0subsys + "'";
			} else {
				usersIdsLine0subsys = usersIdsLine0subsys + ", '" + idRec0subsys + "'";
			}
	       }
		   
		   return usersIdsLine0subsys ;
	}
}
