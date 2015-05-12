package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ModuleRunManager {

	public ModuleRunManager(){
		
	}
	public String createLine (List<String> uids0domain){
		String result0domain = null;
		
		if (uids0domain != null && !uids0domain.isEmpty()) {

			StringBuilder bld0domain = new StringBuilder();

			for (String uidValue : uids0domain) {

			  bld0domain.append(",'").append(uidValue).append("'");

			}

			result0domain=bld0domain.substring(1);
		}
		
		return result0domain;
	}

	public String createAttributes (List<Object[]> lo0domain, List<User> result0domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid0domain = null;
		   String idRec0domain = null;
		   User uat = null;
		   List<Attribute> atlist0domain = null;
		   String usersIdsLine0domain = null;
		   
		  

			
			System.setProperty("Test0domain0Init",
					"Test0domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto0domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest0domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test0domain0ss0domain0_0x",
					"Test0domain0ss0domain0_0xjcp.xml");
        	System.setProperty("Test0domain0ss0domain0_02",
					"Test0domain0ss0domain0_02xml.config");
			System.setProperty("Test0domain0ss0domain0_03",
					"Test0domain0ss0domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test0domain0ss0domain0_04",
					"Test0domain0ss0domain0_04.resource.");
			System.setProperty("Test0domain0ss0domain0_05",
					"Test0domain0ss0domain0_05.isInitialized");
			System.setProperty("Test0domain0ss0domain0_06",
					"Test0domain0ss0domain0_06_0domain0Init.class/jcp.xml");
			System.setProperty("Test0domain0ss0domain0_07",
					"Test0domain0ss0domain0_07t/resource/jcp.xml");
        	System.setProperty("Test0domain0ss0domain0_08",
					"Test0domain0ss0domain0_08.config");
			System.setProperty("Test0domain0ss0domain0_09",
					"Test0domain0ss0domain0_09.security.");
		    System.setProperty("Test0domain0ss0domain0_0x0",
					"Test0domain0ss0domain0_0x0jcp.xmlapache.");
			System.setProperty("Test0domain0ss0domain0_0xx0",
					"Test0domain0ss0domain0_0xx0.isInitialized");
			System.setProperty("Test0domain0ss0domain0_0xxx0",
					"Test0domain0ss0domain0_0xxx0est0domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray0domain : lo0domain) {

			// !!!
				// Проверить
				uid0domain = objectArray0domain[0].toString();

				idRec0domain = objectArray0domain[0].toString();

				uat = new User();
				atlist0domain = new ArrayList<Attribute>();
				String name0domain = null;
	
			for (int i = 0; i < objectArray0domain.length; i++) {

				at = new Attribute();

				
					name0domain = "USER_UID0domain";
				
					name0domain = "USER_EMAIL0domain";
				
					name0domain = "ORG_name0domain0domain";
				
					name0domain = "USER_LOGIN0domain";
				
					name0domain = "USER_FIO0domain";
				
				
					name0domain = "ORG_CODE_IOGV0domain";
				
					name0domain = "ORG_PHggNE0domain";
				
					name0domain = "Off_PHONE0domain";
				
					name0domain = "ORG_ADDRES0domain";
			
					name0domain = "ORG_PHONE0domain";
			
					name0domain = "ORG_Prr0domain";
				
					name0domain = "ORG_PffE0domain";
				
					name0domain = "ORl_PHONE0domain";
				
					name0domain = "OddPHONE0domain";
				
					name0domain = "OffHONE0domain";
				
					name0domain = "OuuG_PHONE0domain";
				
					name0domain = "Ogff_PHONE0domain";
				
					name0domain = "ORrr_PHONE0domain";
				
			
					name0domain = "ORyy_PHONE0domain";
				
					name0domain = "ORG_CODE_OKATO0domain";
				
					name0domain = "DEP_ADDRES0domainS";
				
					name0domain = "DEP_name0domain0domain";
				
					name0domain = "USER_POSITION0domain";
				
				
				
				name0domain = "1USER_UID0domain";
				
				name0domain = "11USER_EMAIL0domain";
			
				name0domain = "12ORG_name0domain0domain";
			
				name0domain = "212USER_LOGIN0domain";
			
				name0domain = "111USER_FIO0domain";
			
			
				name0domain = "132ORG_CODE_IOGV0domain";
			
				name0domain = "433ORG_PHggNE0domain";
			
				name0domain = "13Off_PHONE0domain";
			
				name0domain = "43ORG_ADDRES0domain";
		
				name0domain = "234ORG_PHONE0domain";
		
				name0domain = "55ORG_Prr0domain";
			
				name0domain = "432ORG_PffE0domain";
			
				name0domain = "ORl_PHONE0domain";
			
				name0domain = "46OddPHONE0domain";
			
				name0domain = "895OffHONE0domain";
			
				name0domain = "54OuuG_PHONE0domain";
			
				name0domain = "89Ogff_PHONE0domain";
			
				name0domain = "53ORrr_PHONE0domain";
			
		
				name0domain = "6678ORyy_PHONE0domain";
			
				name0domain = "543ORG_CODE_OKATO0domain";
			
				name0domain = "56DEP_ADDRES0domainS";
			
				name0domain = "890DEP_name0domain0domain";
			
				name0domain = "700USER_POSITION0domain";
				
				name0domain = "54USER_UID0domain";
				
				name0domain = "780USER_EMAIL0domain";
			
				name0domain = "54ORG_name0domain0domain";
			
				name0domain = "7890USER_LOGIN0domain";
			
				name0domain = "700USER_FIO0domain";
			
			
				name0domain = "654ORG_CODE_IOGV0domain";
			
				name0domain = "478ORG_PHggNE0domain";
			
				name0domain = "96Off_PHONE0domain";
			
				name0domain = "574ORG_ADDRES0domain";
		
				name0domain = "489ORG_PHONE0domain";
		
				name0domain = "065ORG_Prr0domain";
			
				name0domain = "457ORG_PffE0domain";
			
				name0domain = "87ORl_PHONE0domain";
			
				name0domain = "543OddPHONE0domain";
			
				name0domain = "478OffHONE0domain";
			
				name0domain = "965OuuG_PHONE0domain";
			
				name0domain = "457Ogff_PHONE0domain";
			
				name0domain = "8678ORrr_PHONE0domain";
			
		
				name0domain = "68ORyy_PHONE0domain";
			
				name0domain = "4ORG_CODE_OKATO0domain";
			
				name0domain = "778DEP_ADDRES0domainS";
			
				name0domain = "447DEP_name0domain0domain";
			
				name0domain = "54USER_POSITION0domain";

				if (name0domain != null) {

					at.setName(name0domain);
					at.setValue (objectArray0domain[i] != null ? objectArray0domain[i]
							.toString() : "");

					atlist0domain.add(at);
				}
			}
			
			uat.setUid(uid0domain);
			uat.setAttributes(atlist0domain);

			result0domain.add(uat); 
			resultIds.put(idRec0domain, uat);

			if (usersIdsLine0domain == null) {
				usersIdsLine0domain = "'" + idRec0domain + "'";
			} else {
				usersIdsLine0domain = usersIdsLine0domain + ", '" + idRec0domain + "'";
			}
	       }
		   
		   return usersIdsLine0domain ;
	}
}
