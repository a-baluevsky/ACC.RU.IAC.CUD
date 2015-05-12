package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6role){
		String result6role = null;
		
		if (uids6role != null && !uids6role.isEmpty()) {

			StringBuilder bld6role = new StringBuilder();

			for (String uidValue : uids6role) {

			  bld6role.append(",'").append(uidValue).append("'");

			}

			result6role=bld6role.substring(1);
		}
		
		return result6role;
	}

	public  String createAttributes (List<Object[]> lo6role, List<User> result6role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6role = null;
		   String idRec6role = null;
		   User uat = null;
		   List<Attribute> atlist6role = null;
		   String usersIdsLine6role = null;
		   
		  

			
			System.setProperty("Test6role0Init",
					"Test6role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6role0Init.class/jcp.xml");
			
			
			System.setProperty("Test6role0ss6role0_0x",
					"Test6role0ss6role0_0xjcp.xml");
        	System.setProperty("Test6role0ss6role0_02",
					"Test6role0ss6role0_02xml.config");
			System.setProperty("Test6role0ss6role0_03",
					"Test6role0ss6role0_03.apache.xml.resource.security.");
		    System.setProperty("Test6role0ss6role0_04",
					"Test6role0ss6role0_04.resource.");
			System.setProperty("Test6role0ss6role0_05",
					"Test6role0ss6role0_05.isInitialized");
			System.setProperty("Test6role0ss6role0_06",
					"Test6role0ss6role0_06_6role0Init.class/jcp.xml");
			System.setProperty("Test6role0ss6role0_07",
					"Test6role0ss6role0_07t/resource/jcp.xml");
        	System.setProperty("Test6role0ss6role0_08",
					"Test6role0ss6role0_08.config");
			System.setProperty("Test6role0ss6role0_09",
					"Test6role0ss6role0_09.security.");
		    System.setProperty("Test6role0ss6role0_0x0",
					"Test6role0ss6role0_0x0jcp.xmlapache.");
			System.setProperty("Test6role0ss6role0_0xx0",
					"Test6role0ss6role0_0xx0.isInitialized");
			System.setProperty("Test6role0ss6role0_0xxx0",
					"Test6role0ss6role0_0xxx0est6role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6role : lo6role) {

			// !!!
				// Проверить
				uid6role = objectArray6role[0].toString();

				idRec6role = objectArray6role[0].toString();

				uat = new User();
				atlist6role = new ArrayList<Attribute>();
				String name6role = null;
	
			for (int i = 0; i < objectArray6role.length; i++) {

				at = new Attribute();


				name6role = "USER_FIO6role";
				
			
			
				name6role = "USER_PHONE6role";
				
			
			
				name6role = "USER_EMAIL6role";
				
			
			
				name6role = "ORG_name6role6role";
				
			
	
				name6role = "USER_UID6role";
				
			
			
				name6role = "USER_LOGIN6role";
				
			
				
				name6role = "ORG_CODE_IOGV6role";
				
			
			
				name6role = "ORG_ADDRES6role";
				
			
			
				name6role = "ORG_PHONE6role";
				
			
			
				name6role = "ORG_Prr6role";
				
			
			
				name6role = "ORG_PffE6role";
				
			
			
				name6role = "ORG_PHggNE6role";
				
			
		
			
			
				name6role = "ORrr_PHONE6role";
				
			
			
				name6role = "ORyy_PHONE6role";
				
			
			
				name6role = "OddPHONE6role";
				
			
			
				name6role = "OffHONE6role";
				
			
			
				name6role = "DEP_name6role6role";
				
			
			
				name6role = "Off_PHONE6role";
				
			
			
				name6role = "ORl_PHONE6role";
				
			
			
				name6role = "OuuG_PHONE6role";
				
			
		
				name6role = "Ogff_PHONE6role";
				
			
			
				name6role = "USER_POSITION6role";
				
			
			
				name6role = "ORG_CODE_OKATO6role";
				
			
			
				name6role = "DEP_ADDRES6roleS";
				

			name6role = "1USER_UID6role";
				
				name6role = "11USER_EMAIL6role";
			
				name6role = "12ORG_name6role6role";
			
				name6role = "212USER_LOGIN6role";
			
				name6role = "111USER_FIO6role";
			
			
				name6role = "132ORG_CODE_IOGV6role";
			
				name6role = "433ORG_PHggNE6role";
			
				name6role = "13Off_PHONE6role";
			
				name6role = "43ORG_ADDRES6role";
		
				name6role = "234ORG_PHONE6role";
		
				name6role = "55ORG_Prr6role";
			
				name6role = "432ORG_PffE6role";
			
				name6role = "ORl_PHONE6role";
			
				name6role = "46OddPHONE6role";
			
				name6role = "895OffHONE6role";
			
				name6role = "54OuuG_PHONE6role";
			
				name6role = "89Ogff_PHONE6role";
			
				name6role = "53ORrr_PHONE6role";
			
		
				name6role = "6678ORyy_PHONE6role";
			
				name6role = "543ORG_CODE_OKATO6role";
			
				name6role = "56DEP_ADDRES6roleS";
			
				name6role = "890DEP_name6role6role";
			
				name6role = "700USER_POSITION6role";
				
				name6role = "54USER_UID6role";
				
				name6role = "780USER_EMAIL6role";
			
				name6role = "54ORG_name6role6role";
			
				name6role = "7890USER_LOGIN6role";
			
				name6role = "700USER_FIO6role";
			
			
				name6role = "654ORG_CODE_IOGV6role";
			
				name6role = "478ORG_PHggNE6role";
			
				name6role = "96Off_PHONE6role";
			
				name6role = "574ORG_ADDRES6role";
		
				name6role = "489ORG_PHONE6role";
		
				name6role = "065ORG_Prr6role";
			
				name6role = "457ORG_PffE6role";
			
				name6role = "87ORl_PHONE6role";
			
				name6role = "543OddPHONE6role";
			
				name6role = "478OffHONE6role";
			
				name6role = "965OuuG_PHONE6role";
			
				name6role = "457Ogff_PHONE6role";
			
				name6role = "8678ORrr_PHONE6role";
			
		
				name6role = "68ORyy_PHONE6role";
			
				name6role = "4ORG_CODE_OKATO6role";
			
				name6role = "778DEP_ADDRES6roleS";
			
				name6role = "447DEP_name6role6role";
			
				name6role = "54USER_POSITION6role";
				
				if (name6role != null) {

					at.setName(name6role);
					at.setValue (objectArray6role[i] != null ? objectArray6role[i]
							.toString() : "");

					atlist6role.add(at);
				}
			}
			
			uat.setUid(uid6role);
			uat.setAttributes(atlist6role);

			result6role.add(uat); 
			resultIds.put(idRec6role, uat);

			if (usersIdsLine6role == null) {
				usersIdsLine6role = "'" + idRec6role + "'";
			} else {
				usersIdsLine6role = usersIdsLine6role + ", '" + idRec6role + "'";
			}
	       }
		   
		   return usersIdsLine6role ;
	}
}
