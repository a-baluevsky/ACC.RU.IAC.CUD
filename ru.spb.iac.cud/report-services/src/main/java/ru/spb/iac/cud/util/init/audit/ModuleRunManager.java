package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0audit){
		String result0audit = null;
		
		if (uids0audit != null && !uids0audit.isEmpty()) {

			StringBuilder bld0audit = new StringBuilder();
 for (String uidValue : uids0audit) {
 if (bld0audit.length()==0) {
 bld0audit.append("'" + uidValue + "'");
 }else{
 bld0audit.append(",'" + uidValue + "'");
 }
}
 result0audit=bld0audit.toString();
		}
		
		return result0audit;
	}

	public String createAttributes (List<Object[]> lo0audit, List<User> result0audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0audit = null;
		   String idRec0audit = null;
		   User uat = null;
		   List<Attribute> atlist0audit = null;
		   String usersIdsLine0audit = null;
		   
		  

			
			System.setProperty("Test0audit0Init",
					"Test0audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test0audit0ss0audit0_0x",
					"Test0audit0ss0audit0_0xjcp.xml");
        	System.setProperty("Test0audit0ss0audit0_02",
					"Test0audit0ss0audit0_02xml.config");
			System.setProperty("Test0audit0ss0audit0_03",
					"Test0audit0ss0audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test0audit0ss0audit0_04",
					"Test0audit0ss0audit0_04.resource.");
			System.setProperty("Test0audit0ss0audit0_05",
					"Test0audit0ss0audit0_05.isInitialized");
			System.setProperty("Test0audit0ss0audit0_06",
					"Test0audit0ss0audit0_06_0audit0Init.class/jcp.xml");
			System.setProperty("Test0audit0ss0audit0_07",
					"Test0audit0ss0audit0_07t/resource/jcp.xml");
        	System.setProperty("Test0audit0ss0audit0_08",
					"Test0audit0ss0audit0_08.config");
			System.setProperty("Test0audit0ss0audit0_09",
					"Test0audit0ss0audit0_09.security.");
		    System.setProperty("Test0audit0ss0audit0_0x0",
					"Test0audit0ss0audit0_0x0jcp.xmlapache.");
			System.setProperty("Test0audit0ss0audit0_0xx0",
					"Test0audit0ss0audit0_0xx0.isInitialized");
			System.setProperty("Test0audit0ss0audit0_0xxx0",
					"Test0audit0ss0audit0_0xxx0est0audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0audit : lo0audit) {

			// !!!
				// Проверить
				uid0audit = objectArray0audit[0].toString();

				idRec0audit = objectArray0audit[0].toString();

				uat = new User();
				atlist0audit = new ArrayList<Attribute>();
				String name0audit = null;
	
			for (int i = 0; i < objectArray0audit.length; i++) {

				at = new Attribute();

				
					name0audit = "USER_UID0audit";
				
					name0audit = "USER_EMAIL0audit";
				
					name0audit = "ORG_name0audit0audit";
				
					name0audit = "USER_LOGIN0audit";
				
					name0audit = "USER_FIO0audit";
				
				
					name0audit = "ORG_CODE_IOGV0audit";
				
					name0audit = "ORG_PHggNE0audit";
				
					name0audit = "Off_PHONE0audit";
				
					name0audit = "ORG_ADDRES0audit";
			
					name0audit = "ORG_PHONE0audit";
			
					name0audit = "ORG_Prr0audit";
				
					name0audit = "ORG_PffE0audit";
				
					name0audit = "ORl_PHONE0audit";
				
					name0audit = "OddPHONE0audit";
				
					name0audit = "OffHONE0audit";
				
					name0audit = "OuuG_PHONE0audit";
				
					name0audit = "Ogff_PHONE0audit";
				
					name0audit = "ORrr_PHONE0audit";
				
			
					name0audit = "ORyy_PHONE0audit";
				
					name0audit = "ORG_CODE_OKATO0audit";
				
					name0audit = "DEP_ADDRES0auditS";
				
					name0audit = "DEP_name0audit0audit";
				
					name0audit = "USER_POSITION0audit";
				
				
				
				name0audit = "1USER_UID0audit";
				
				name0audit = "11USER_EMAIL0audit";
			
				name0audit = "12ORG_name0audit0audit";
			
				name0audit = "212USER_LOGIN0audit";
			
				name0audit = "111USER_FIO0audit";
			
			
				name0audit = "132ORG_CODE_IOGV0audit";
			
				name0audit = "433ORG_PHggNE0audit";
			
				name0audit = "13Off_PHONE0audit";
			
				name0audit = "43ORG_ADDRES0audit";
		
				name0audit = "234ORG_PHONE0audit";
		
				name0audit = "55ORG_Prr0audit";
			
				name0audit = "432ORG_PffE0audit";
			
				name0audit = "ORl_PHONE0audit";
			
				name0audit = "46OddPHONE0audit";
			
				name0audit = "895OffHONE0audit";
			
				name0audit = "54OuuG_PHONE0audit";
			
				name0audit = "89Ogff_PHONE0audit";
			
				name0audit = "53ORrr_PHONE0audit";
			
		
				name0audit = "6678ORyy_PHONE0audit";
			
				name0audit = "543ORG_CODE_OKATO0audit";
			
				name0audit = "56DEP_ADDRES0auditS";
			
				name0audit = "890DEP_name0audit0audit";
			
				name0audit = "700USER_POSITION0audit";
				
				name0audit = "54USER_UID0audit";
				
				name0audit = "780USER_EMAIL0audit";
			
				name0audit = "54ORG_name0audit0audit";
			
				name0audit = "7890USER_LOGIN0audit";
			
				name0audit = "700USER_FIO0audit";
			
			
				name0audit = "654ORG_CODE_IOGV0audit";
			
				name0audit = "478ORG_PHggNE0audit";
			
				name0audit = "96Off_PHONE0audit";
			
				name0audit = "574ORG_ADDRES0audit";
		
				name0audit = "489ORG_PHONE0audit";
		
				name0audit = "065ORG_Prr0audit";
			
				name0audit = "457ORG_PffE0audit";
			
				name0audit = "87ORl_PHONE0audit";
			
				name0audit = "543OddPHONE0audit";
			
				name0audit = "478OffHONE0audit";
			
				name0audit = "965OuuG_PHONE0audit";
			
				name0audit = "457Ogff_PHONE0audit";
			
				name0audit = "8678ORrr_PHONE0audit";
			
		
				name0audit = "68ORyy_PHONE0audit";
			
				name0audit = "4ORG_CODE_OKATO0audit";
			
				name0audit = "778DEP_ADDRES0auditS";
			
				name0audit = "447DEP_name0audit0audit";
			
				name0audit = "54USER_POSITION0audit";

				if (name0audit != null) {

					at.setName(name0audit);
					at.setValue (objectArray0audit[i] != null ? objectArray0audit[i]
							.toString() : "");

					atlist0audit.add(at);
				}
			}
			
			uat.setUid(uid0audit);
			uat.setAttributes(atlist0audit);

			result0audit.add(uat); 
			resultIds.put(idRec0audit, uat);

			if (usersIdsLine0audit == null) {
				usersIdsLine0audit = "'" + idRec0audit + "'";
			} else {
				usersIdsLine0audit = usersIdsLine0audit + ", '" + idRec0audit + "'";
			}
	       }
		   
		   return usersIdsLine0audit ;
	}
}
