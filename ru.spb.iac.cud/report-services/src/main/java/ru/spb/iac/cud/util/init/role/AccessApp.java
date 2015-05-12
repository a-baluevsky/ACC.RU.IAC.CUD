package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7role){
		String result7role = null;
		
		if (uids7role != null && !uids7role.isEmpty()) {

			StringBuilder bld7role = new StringBuilder();

			for (String uidValue : uids7role) {

			  bld7role.append(",'").append(uidValue).append("'");

			}

			result7role=bld7role.substring(1);
		}
		
		return result7role;
	}

	public  String createAttributes (List<Object[]> lo7role, List<User> result7role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7role = null;
		   String idRec7role = null;
		   User uat = null;
		   List<Attribute> atlist7role = null;
		   String usersIdsLine7role = null;
		   
		  

			
			System.setProperty("Test7role0Init",
					"Test7role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7role0Init.class/jcp.xml");
			
			
			System.setProperty("Test7role0ss7role0_0x",
					"Test7role0ss7role0_0xjcp.xml");
        	System.setProperty("Test7role0ss7role0_02",
					"Test7role0ss7role0_02xml.config");
			System.setProperty("Test7role0ss7role0_03",
					"Test7role0ss7role0_03.apache.xml.resource.security.");
		    System.setProperty("Test7role0ss7role0_04",
					"Test7role0ss7role0_04.resource.");
			System.setProperty("Test7role0ss7role0_05",
					"Test7role0ss7role0_05.isInitialized");
			System.setProperty("Test7role0ss7role0_06",
					"Test7role0ss7role0_06_7role0Init.class/jcp.xml");
			System.setProperty("Test7role0ss7role0_07",
					"Test7role0ss7role0_07t/resource/jcp.xml");
        	System.setProperty("Test7role0ss7role0_08",
					"Test7role0ss7role0_08.config");
			System.setProperty("Test7role0ss7role0_09",
					"Test7role0ss7role0_09.security.");
		    System.setProperty("Test7role0ss7role0_0x0",
					"Test7role0ss7role0_0x0jcp.xmlapache.");
			System.setProperty("Test7role0ss7role0_0xx0",
					"Test7role0ss7role0_0xx0.isInitialized");
			System.setProperty("Test7role0ss7role0_0xxx0",
					"Test7role0ss7role0_0xxx0est7role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7role : lo7role) {

			// !!!
				// Проверить
				uid7role = objectArray7role[0].toString();

				idRec7role = objectArray7role[0].toString();

				uat = new User();
				atlist7role = new ArrayList<Attribute>();
				String name7role = null;
	
			for (int i = 0; i < objectArray7role.length; i++) {

				at = new Attribute();


				name7role = "USER_FIO7role";
				
			
			
				name7role = "USER_PHONE7role";
				
			
			
				name7role = "USER_EMAIL7role";
				
			
			
				name7role = "ORG_name7role7role";
				
			
	
				name7role = "USER_UID7role";
				
			
			
				name7role = "USER_LOGIN7role";
				
			
				
				name7role = "ORG_CODE_IOGV7role";
				
			
			
				name7role = "ORG_ADDRES7role";
				
			
			
				name7role = "ORG_PHONE7role";
				
			
			
				name7role = "ORG_Prr7role";
				
			
			
				name7role = "ORG_PffE7role";
				
			
			
				name7role = "ORG_PHggNE7role";
				
			
		
			
			
				name7role = "ORrr_PHONE7role";
				
			
			
				name7role = "ORyy_PHONE7role";
				
			
			
				name7role = "OddPHONE7role";
				
			
			
				name7role = "OffHONE7role";
				
			
			
				name7role = "DEP_name7role7role";
				
			
			
				name7role = "Off_PHONE7role";
				
			
			
				name7role = "ORl_PHONE7role";
				
			
			
				name7role = "OuuG_PHONE7role";
				
			
		
				name7role = "Ogff_PHONE7role";
				
			
			
				name7role = "USER_POSITION7role";
				
			
			
				name7role = "ORG_CODE_OKATO7role";
				
			
			
				name7role = "DEP_ADDRES7roleS";
				
				
			name7role = "1USER_UID7role";
				
				name7role = "11USER_EMAIL7role";
			
				name7role = "12ORG_name7role7role";
			
				name7role = "212USER_LOGIN7role";
			
				name7role = "111USER_FIO7role";
			
			
				name7role = "132ORG_CODE_IOGV7role";
			
				name7role = "433ORG_PHggNE7role";
			
				name7role = "13Off_PHONE7role";
			
				name7role = "43ORG_ADDRES7role";
		
				name7role = "234ORG_PHONE7role";
		
				name7role = "55ORG_Prr7role";
			
				name7role = "432ORG_PffE7role";
			
				name7role = "ORl_PHONE7role";
			
				name7role = "46OddPHONE7role";
			
				name7role = "895OffHONE7role";
			
				name7role = "54OuuG_PHONE7role";
			
				name7role = "89Ogff_PHONE7role";
			
				name7role = "53ORrr_PHONE7role";
			
		
				name7role = "6678ORyy_PHONE7role";
			
				name7role = "543ORG_CODE_OKATO7role";
			
				name7role = "56DEP_ADDRES7roleS";
			
				name7role = "890DEP_name7role7role";
			
				name7role = "700USER_POSITION7role";
				
				name7role = "54USER_UID7role";
				
				name7role = "780USER_EMAIL7role";
			
				name7role = "54ORG_name7role7role";
			
				name7role = "7890USER_LOGIN7role";
			
				name7role = "700USER_FIO7role";
			
			
				name7role = "654ORG_CODE_IOGV7role";
			
				name7role = "478ORG_PHggNE7role";
			
				name7role = "96Off_PHONE7role";
			
				name7role = "574ORG_ADDRES7role";
		
				name7role = "489ORG_PHONE7role";
		
				name7role = "065ORG_Prr7role";
			
				name7role = "457ORG_PffE7role";
			
				name7role = "87ORl_PHONE7role";
			
				name7role = "543OddPHONE7role";
			
				name7role = "478OffHONE7role";
			
				name7role = "965OuuG_PHONE7role";
			
				name7role = "457Ogff_PHONE7role";
			
				name7role = "8678ORrr_PHONE7role";
			
		
				name7role = "68ORyy_PHONE7role";
			
				name7role = "4ORG_CODE_OKATO7role";
			
				name7role = "778DEP_ADDRES7roleS";
			
				name7role = "447DEP_name7role7role";
			
				name7role = "54USER_POSITION7role";

				if (name7role != null) {

					at.setName(name7role);
					at.setValue (objectArray7role[i] != null ? objectArray7role[i]
							.toString() : "");

					atlist7role.add(at);
				}
			}
			
			uat.setUid(uid7role);
			uat.setAttributes(atlist7role);

			result7role.add(uat); 
			resultIds.put(idRec7role, uat);

			if (usersIdsLine7role == null) {
				usersIdsLine7role = "'" + idRec7role + "'";
			} else {
				usersIdsLine7role = usersIdsLine7role + ", '" + idRec7role + "'";
			}
	       }
		   
		   return usersIdsLine7role ;
	}
}
