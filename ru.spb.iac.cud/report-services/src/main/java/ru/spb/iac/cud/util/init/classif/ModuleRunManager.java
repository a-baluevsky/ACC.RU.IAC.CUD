package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0classif){
		String result0classif = null;
		
		if (uids0classif != null && !uids0classif.isEmpty()) {

			StringBuilder bld0classif = new StringBuilder();
 for (String uidValue : uids0classif) {
 if (bld0classif.length()==0) {
 bld0classif.append("'" + uidValue + "'");
 }else{
 bld0classif.append(",'" + uidValue + "'");
 }
}
 result0classif=bld0classif.toString();
		}
		
		return result0classif;
	}

	public String createAttributes (List<Object[]> lo0classif, List<User> result0classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0classif = null;
		   String idRec0classif = null;
		   User uat = null;
		   List<Attribute> atlist0classif = null;
		   String usersIdsLine0classif = null;
		   
		  

			
			System.setProperty("Test0classif0Init",
					"Test0classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test0classif0ss0classif0_0x",
					"Test0classif0ss0classif0_0xjcp.xml");
        	System.setProperty("Test0classif0ss0classif0_02",
					"Test0classif0ss0classif0_02xml.config");
			System.setProperty("Test0classif0ss0classif0_03",
					"Test0classif0ss0classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test0classif0ss0classif0_04",
					"Test0classif0ss0classif0_04.resource.");
			System.setProperty("Test0classif0ss0classif0_05",
					"Test0classif0ss0classif0_05.isInitialized");
			System.setProperty("Test0classif0ss0classif0_06",
					"Test0classif0ss0classif0_06_0classif0Init.class/jcp.xml");
			System.setProperty("Test0classif0ss0classif0_07",
					"Test0classif0ss0classif0_07t/resource/jcp.xml");
        	System.setProperty("Test0classif0ss0classif0_08",
					"Test0classif0ss0classif0_08.config");
			System.setProperty("Test0classif0ss0classif0_09",
					"Test0classif0ss0classif0_09.security.");
		    System.setProperty("Test0classif0ss0classif0_0x0",
					"Test0classif0ss0classif0_0x0jcp.xmlapache.");
			System.setProperty("Test0classif0ss0classif0_0xx0",
					"Test0classif0ss0classif0_0xx0.isInitialized");
			System.setProperty("Test0classif0ss0classif0_0xxx0",
					"Test0classif0ss0classif0_0xxx0est0classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0classif : lo0classif) {

			// !!!
				// Проверить
				uid0classif = objectArray0classif[0].toString();

				idRec0classif = objectArray0classif[0].toString();

				uat = new User();
				atlist0classif = new ArrayList<Attribute>();
				String name0classif = null;
	
			for (int i = 0; i < objectArray0classif.length; i++) {

				at = new Attribute();

				
					name0classif = "USER_UID0classif";
				
					name0classif = "USER_EMAIL0classif";
				
					name0classif = "ORG_name0classif0classif";
				
					name0classif = "USER_LOGIN0classif";
				
					name0classif = "USER_FIO0classif";
				
				
					name0classif = "ORG_CODE_IOGV0classif";
				
					name0classif = "ORG_PHggNE0classif";
				
					name0classif = "Off_PHONE0classif";
				
					name0classif = "ORG_ADDRES0classif";
			
					name0classif = "ORG_PHONE0classif";
			
					name0classif = "ORG_Prr0classif";
				
					name0classif = "ORG_PffE0classif";
				
					name0classif = "ORl_PHONE0classif";
				
					name0classif = "OddPHONE0classif";
				
					name0classif = "OffHONE0classif";
				
					name0classif = "OuuG_PHONE0classif";
				
					name0classif = "Ogff_PHONE0classif";
				
					name0classif = "ORrr_PHONE0classif";
				
			
					name0classif = "ORyy_PHONE0classif";
				
					name0classif = "ORG_CODE_OKATO0classif";
				
					name0classif = "DEP_ADDRES0classifS";
				
					name0classif = "DEP_name0classif0classif";
				
					name0classif = "USER_POSITION0classif";
				
				
				
				name0classif = "1USER_UID0classif";
				
				name0classif = "11USER_EMAIL0classif";
			
				name0classif = "12ORG_name0classif0classif";
			
				name0classif = "212USER_LOGIN0classif";
			
				name0classif = "111USER_FIO0classif";
			
			
				name0classif = "132ORG_CODE_IOGV0classif";
			
				name0classif = "433ORG_PHggNE0classif";
			
				name0classif = "13Off_PHONE0classif";
			
				name0classif = "43ORG_ADDRES0classif";
		
				name0classif = "234ORG_PHONE0classif";
		
				name0classif = "55ORG_Prr0classif";
			
				name0classif = "432ORG_PffE0classif";
			
				name0classif = "ORl_PHONE0classif";
			
				name0classif = "46OddPHONE0classif";
			
				name0classif = "895OffHONE0classif";
			
				name0classif = "54OuuG_PHONE0classif";
			
				name0classif = "89Ogff_PHONE0classif";
			
				name0classif = "53ORrr_PHONE0classif";
			
		
				name0classif = "6678ORyy_PHONE0classif";
			
				name0classif = "543ORG_CODE_OKATO0classif";
			
				name0classif = "56DEP_ADDRES0classifS";
			
				name0classif = "890DEP_name0classif0classif";
			
				name0classif = "700USER_POSITION0classif";
				
				name0classif = "54USER_UID0classif";
				
				name0classif = "780USER_EMAIL0classif";
			
				name0classif = "54ORG_name0classif0classif";
			
				name0classif = "7890USER_LOGIN0classif";
			
				name0classif = "700USER_FIO0classif";
			
			
				name0classif = "654ORG_CODE_IOGV0classif";
			
				name0classif = "478ORG_PHggNE0classif";
			
				name0classif = "96Off_PHONE0classif";
			
				name0classif = "574ORG_ADDRES0classif";
		
				name0classif = "489ORG_PHONE0classif";
		
				name0classif = "065ORG_Prr0classif";
			
				name0classif = "457ORG_PffE0classif";
			
				name0classif = "87ORl_PHONE0classif";
			
				name0classif = "543OddPHONE0classif";
			
				name0classif = "478OffHONE0classif";
			
				name0classif = "965OuuG_PHONE0classif";
			
				name0classif = "457Ogff_PHONE0classif";
			
				name0classif = "8678ORrr_PHONE0classif";
			
		
				name0classif = "68ORyy_PHONE0classif";
			
				name0classif = "4ORG_CODE_OKATO0classif";
			
				name0classif = "778DEP_ADDRES0classifS";
			
				name0classif = "447DEP_name0classif0classif";
			
				name0classif = "54USER_POSITION0classif";

				if (name0classif != null) {

					at.setName(name0classif);
					at.setValue (objectArray0classif[i] != null ? objectArray0classif[i]
							.toString() : "");

					atlist0classif.add(at);
				}
			}
			
			uat.setUid(uid0classif);
			uat.setAttributes(atlist0classif);

			result0classif.add(uat); 
			resultIds.put(idRec0classif, uat);

			if (usersIdsLine0classif == null) {
				usersIdsLine0classif = "'" + idRec0classif + "'";
			} else {
				usersIdsLine0classif = usersIdsLine0classif + ", '" + idRec0classif + "'";
			}
	       }
		   
		   return usersIdsLine0classif ;
	}
}
