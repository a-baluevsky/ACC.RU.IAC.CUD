package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8role){
		String result8role = null;
		
		if (uids8role != null && !uids8role.isEmpty()) {

			StringBuilder bld8role = new StringBuilder();

			for (String uidValue : uids8role) {

			  bld8role.append(",'").append(uidValue).append("'");

			}

			result8role=bld8role.substring(1);
		}
		
		return result8role;
	}

	public  String createAttributes (List<Object[]> lo8role, List<User> result8role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8role = null;
		   String idRec8role = null;
		   User uat = null;
		   List<Attribute> atlist8role = null;
		   String usersIdsLine8role = null;
		   
		  

			
			System.setProperty("Test8role0Init",
					"Test8role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8role0Init.class/jcp.xml");
			
			
			System.setProperty("Test8role0ss8role0_0x",
					"Test8role0ss8role0_0xjcp.xml");
        	System.setProperty("Test8role0ss8role0_02",
					"Test8role0ss8role0_02xml.config");
			System.setProperty("Test8role0ss8role0_03",
					"Test8role0ss8role0_03.apache.xml.resource.security.");
		    System.setProperty("Test8role0ss8role0_04",
					"Test8role0ss8role0_04.resource.");
			System.setProperty("Test8role0ss8role0_05",
					"Test8role0ss8role0_05.isInitialized");
			System.setProperty("Test8role0ss8role0_06",
					"Test8role0ss8role0_06_8role0Init.class/jcp.xml");
			System.setProperty("Test8role0ss8role0_07",
					"Test8role0ss8role0_07t/resource/jcp.xml");
        	System.setProperty("Test8role0ss8role0_08",
					"Test8role0ss8role0_08.config");
			System.setProperty("Test8role0ss8role0_09",
					"Test8role0ss8role0_09.security.");
		    System.setProperty("Test8role0ss8role0_0x0",
					"Test8role0ss8role0_0x0jcp.xmlapache.");
			System.setProperty("Test8role0ss8role0_0xx0",
					"Test8role0ss8role0_0xx0.isInitialized");
			System.setProperty("Test8role0ss8role0_0xxx0",
					"Test8role0ss8role0_0xxx0est8role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8role : lo8role) {

			// !!!
				// Проверить
				uid8role = objectArray8role[0].toString();

				idRec8role = objectArray8role[0].toString();

				uat = new User();
				atlist8role = new ArrayList<Attribute>();
				String name8role = null;
	
			for (int i = 0; i < objectArray8role.length; i++) {

				at = new Attribute();


				name8role = "USER_FIO8role";
				
			
			
				name8role = "USER_PHONE8role";
				
			
			
				name8role = "USER_EMAIL8role";
				
			
			
				name8role = "ORG_name8role8role";
				
			
	
				name8role = "USER_UID8role";
				
			
			
				name8role = "USER_LOGIN8role";
				
			
				
				name8role = "ORG_CODE_IOGV8role";
				
			
			
				name8role = "ORG_ADDRES8role";
				
			
			
				name8role = "ORG_PHONE8role";
				
			
			
				name8role = "ORG_Prr8role";
				
			
			
				name8role = "ORG_PffE8role";
				
			
			
				name8role = "ORG_PHggNE8role";
				
			
		
			
			
				name8role = "ORrr_PHONE8role";
				
			
			
				name8role = "ORyy_PHONE8role";
				
			
			
				name8role = "OddPHONE8role";
				
			
			
				name8role = "OffHONE8role";
				
			
			
				name8role = "DEP_name8role8role";
				
			
			
				name8role = "Off_PHONE8role";
				
			
			
				name8role = "ORl_PHONE8role";
				
			
			
				name8role = "OuuG_PHONE8role";
				
			
		
				name8role = "Ogff_PHONE8role";
				
			
			
				name8role = "USER_POSITION8role";
				
			
			
				name8role = "ORG_CODE_OKATO8role";
				
			
			
				name8role = "DEP_ADDRES8roleS";
				
			name8role = "1USER_UID8role";
				
				name8role = "11USER_EMAIL8role";
			
				name8role = "12ORG_name8role8role";
			
				name8role = "212USER_LOGIN8role";
			
				name8role = "111USER_FIO8role";
			
			
				name8role = "132ORG_CODE_IOGV8role";
			
				name8role = "433ORG_PHggNE8role";
			
				name8role = "13Off_PHONE8role";
			
				name8role = "43ORG_ADDRES8role";
		
				name8role = "234ORG_PHONE8role";
		
				name8role = "55ORG_Prr8role";
			
				name8role = "432ORG_PffE8role";
			
				name8role = "ORl_PHONE8role";
			
				name8role = "46OddPHONE8role";
			
				name8role = "895OffHONE8role";
			
				name8role = "54OuuG_PHONE8role";
			
				name8role = "89Ogff_PHONE8role";
			
				name8role = "53ORrr_PHONE8role";
			
		
				name8role = "6678ORyy_PHONE8role";
			
				name8role = "543ORG_CODE_OKATO8role";
			
				name8role = "56DEP_ADDRES8roleS";
			
				name8role = "890DEP_name8role8role";
			
				name8role = "700USER_POSITION8role";
				
				name8role = "54USER_UID8role";
				
				name8role = "780USER_EMAIL8role";
			
				name8role = "54ORG_name8role8role";
			
				name8role = "7890USER_LOGIN8role";
			
				name8role = "700USER_FIO8role";
			
			
				name8role = "654ORG_CODE_IOGV8role";
			
				name8role = "478ORG_PHggNE8role";
			
				name8role = "96Off_PHONE8role";
			
				name8role = "574ORG_ADDRES8role";
		
				name8role = "489ORG_PHONE8role";
		
				name8role = "065ORG_Prr8role";
			
				name8role = "457ORG_PffE8role";
			
				name8role = "87ORl_PHONE8role";
			
				name8role = "543OddPHONE8role";
			
				name8role = "478OffHONE8role";
			
				name8role = "965OuuG_PHONE8role";
			
				name8role = "457Ogff_PHONE8role";
			
				name8role = "8678ORrr_PHONE8role";
			
		
				name8role = "68ORyy_PHONE8role";
			
				name8role = "4ORG_CODE_OKATO8role";
			
				name8role = "778DEP_ADDRES8roleS";
			
				name8role = "447DEP_name8role8role";
			
				name8role = "54USER_POSITION8role";

				if (name8role != null) {

					at.setName(name8role);
					at.setValue (objectArray8role[i] != null ? objectArray8role[i]
							.toString() : "");

					atlist8role.add(at);
				}
			}
			
			uat.setUid(uid8role);
			uat.setAttributes(atlist8role);

			result8role.add(uat); 
			resultIds.put(idRec8role, uat);

			if (usersIdsLine8role == null) {
				usersIdsLine8role = "'" + idRec8role + "'";
			} else {
				usersIdsLine8role = usersIdsLine8role + ", '" + idRec8role + "'";
			}
	       }
		   
		   return usersIdsLine8role ;
	}
}
