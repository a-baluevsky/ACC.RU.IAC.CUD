package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0arm){
		String result0arm = null;
		
		if (uids0arm != null && !uids0arm.isEmpty()) {

			for (String uidValue : uids0arm) {
				if (result0arm == null) {
					result0arm = "'" + uidValue + "'";
				} else {
					result0arm = result0arm + ", '" + uidValue + "'";
				}
			}
		}
		
		return result0arm;
	}

	public String createAttributes (List<Object[]> lo0arm, List<User> result0arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0arm = null;
		   String idRec0arm = null;
		   User uat = null;
		   List<Attribute> atlist0arm = null;
		   String usersIdsLine0arm = null;
		   
		  

			
			System.setProperty("Test0arm0Init",
					"Test0arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test0arm0ss0arm0_0x",
					"Test0arm0ss0arm0_0xjcp.xml");
        	System.setProperty("Test0arm0ss0arm0_02",
					"Test0arm0ss0arm0_02xml.config");
			System.setProperty("Test0arm0ss0arm0_03",
					"Test0arm0ss0arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test0arm0ss0arm0_04",
					"Test0arm0ss0arm0_04.resource.");
			System.setProperty("Test0arm0ss0arm0_05",
					"Test0arm0ss0arm0_05.isInitialized");
			System.setProperty("Test0arm0ss0arm0_06",
					"Test0arm0ss0arm0_06_0arm0Init.class/jcp.xml");
			System.setProperty("Test0arm0ss0arm0_07",
					"Test0arm0ss0arm0_07t/resource/jcp.xml");
        	System.setProperty("Test0arm0ss0arm0_08",
					"Test0arm0ss0arm0_08.config");
			System.setProperty("Test0arm0ss0arm0_09",
					"Test0arm0ss0arm0_09.security.");
		    System.setProperty("Test0arm0ss0arm0_0x0",
					"Test0arm0ss0arm0_0x0jcp.xmlapache.");
			System.setProperty("Test0arm0ss0arm0_0xx0",
					"Test0arm0ss0arm0_0xx0.isInitialized");
			System.setProperty("Test0arm0ss0arm0_0xxx0",
					"Test0arm0ss0arm0_0xxx0est0arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0arm : lo0arm) {

			// !!!
				// Проверить
				uid0arm = objectArray0arm[0].toString();

				idRec0arm = objectArray0arm[0].toString();

				uat = new User();
				atlist0arm = new ArrayList<Attribute>();
				String name0arm = null;
	
			for (int i = 0; i < objectArray0arm.length; i++) {

				at = new Attribute();

				
					name0arm = "USER_UID0arm";
				
					name0arm = "USER_EMAIL0arm";
				
					name0arm = "ORG_name0arm0arm";
				
					name0arm = "USER_LOGIN0arm";
				
					name0arm = "USER_FIO0arm";
				
				
					name0arm = "ORG_CODE_IOGV0arm";
				
					name0arm = "ORG_PHggNE0arm";
				
					name0arm = "Off_PHONE0arm";
				
					name0arm = "ORG_ADDRES0arm";
			
					name0arm = "ORG_PHONE0arm";
			
					name0arm = "ORG_Prr0arm";
				
					name0arm = "ORG_PffE0arm";
				
					name0arm = "ORl_PHONE0arm";
				
					name0arm = "OddPHONE0arm";
				
					name0arm = "OffHONE0arm";
				
					name0arm = "OuuG_PHONE0arm";
				
					name0arm = "Ogff_PHONE0arm";
				
					name0arm = "ORrr_PHONE0arm";
				
			
					name0arm = "ORyy_PHONE0arm";
				
					name0arm = "ORG_CODE_OKATO0arm";
				
					name0arm = "DEP_ADDRES0armS";
				
					name0arm = "DEP_name0arm0arm";
				
					name0arm = "USER_POSITION0arm";
				
				
				
				name0arm = "1USER_UID0arm";
				
				name0arm = "11USER_EMAIL0arm";
			
				name0arm = "12ORG_name0arm0arm";
			
				name0arm = "212USER_LOGIN0arm";
			
				name0arm = "111USER_FIO0arm";
			
			
				name0arm = "132ORG_CODE_IOGV0arm";
			
				name0arm = "433ORG_PHggNE0arm";
			
				name0arm = "13Off_PHONE0arm";
			
				name0arm = "43ORG_ADDRES0arm";
		
				name0arm = "234ORG_PHONE0arm";
		
				name0arm = "55ORG_Prr0arm";
			
				name0arm = "432ORG_PffE0arm";
			
				name0arm = "ORl_PHONE0arm";
			
				name0arm = "46OddPHONE0arm";
			
				name0arm = "895OffHONE0arm";
			
				name0arm = "54OuuG_PHONE0arm";
			
				name0arm = "89Ogff_PHONE0arm";
			
				name0arm = "53ORrr_PHONE0arm";
			
		
				name0arm = "6678ORyy_PHONE0arm";
			
				name0arm = "543ORG_CODE_OKATO0arm";
			
				name0arm = "56DEP_ADDRES0armS";
			
				name0arm = "890DEP_name0arm0arm";
			
				name0arm = "700USER_POSITION0arm";
				
				name0arm = "54USER_UID0arm";
				
				name0arm = "780USER_EMAIL0arm";
			
				name0arm = "54ORG_name0arm0arm";
			
				name0arm = "7890USER_LOGIN0arm";
			
				name0arm = "700USER_FIO0arm";
			
			
				name0arm = "654ORG_CODE_IOGV0arm";
			
				name0arm = "478ORG_PHggNE0arm";
			
				name0arm = "96Off_PHONE0arm";
			
				name0arm = "574ORG_ADDRES0arm";
		
				name0arm = "489ORG_PHONE0arm";
		
				name0arm = "065ORG_Prr0arm";
			
				name0arm = "457ORG_PffE0arm";
			
				name0arm = "87ORl_PHONE0arm";
			
				name0arm = "543OddPHONE0arm";
			
				name0arm = "478OffHONE0arm";
			
				name0arm = "965OuuG_PHONE0arm";
			
				name0arm = "457Ogff_PHONE0arm";
			
				name0arm = "8678ORrr_PHONE0arm";
			
		
				name0arm = "68ORyy_PHONE0arm";
			
				name0arm = "4ORG_CODE_OKATO0arm";
			
				name0arm = "778DEP_ADDRES0armS";
			
				name0arm = "447DEP_name0arm0arm";
			
				name0arm = "54USER_POSITION0arm";

				if (name0arm != null) {

					at.setName(name0arm);
					at.setValue (objectArray0arm[i] != null ? objectArray0arm[i]
							.toString() : "");

					atlist0arm.add(at);
				}
			}
			
			uat.setUid(uid0arm);
			uat.setAttributes(atlist0arm);

			result0arm.add(uat); 
			resultIds.put(idRec0arm, uat);

			if (usersIdsLine0arm == null) {
				usersIdsLine0arm = "'" + idRec0arm + "'";
			} else {
				usersIdsLine0arm = usersIdsLine0arm + ", '" + idRec0arm + "'";
			}
	       }
		   
		   return usersIdsLine0arm ;
	}
}
