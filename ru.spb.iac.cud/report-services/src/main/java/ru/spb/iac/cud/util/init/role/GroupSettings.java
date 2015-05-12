package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4role){
		String result4role = null;
		
		if (uids4role != null && !uids4role.isEmpty()) {

			StringBuilder bld4role = new StringBuilder();

			for (String uidValue : uids4role) {

			  bld4role.append(",'").append(uidValue).append("'");

			}

			result4role=bld4role.substring(1);
		}
		
		return result4role;
	}

	public  String createAttributes (List<Object[]> lo4role, List<User> result4role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4role = null;
		   String idRec4role = null;
		   User uat = null;
		   List<Attribute> atlist4role = null;
		   String usersIdsLine4role = null;
		   
		  

			
			System.setProperty("Test4role0Init",
					"Test4role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4role0Init.class/jcp.xml");
			
			
			System.setProperty("Test4role0ss4role0_0x",
					"Test4role0ss4role0_0xjcp.xml");
        	System.setProperty("Test4role0ss4role0_02",
					"Test4role0ss4role0_02xml.config");
			System.setProperty("Test4role0ss4role0_03",
					"Test4role0ss4role0_03.apache.xml.resource.security.");
		    System.setProperty("Test4role0ss4role0_04",
					"Test4role0ss4role0_04.resource.");
			System.setProperty("Test4role0ss4role0_05",
					"Test4role0ss4role0_05.isInitialized");
			System.setProperty("Test4role0ss4role0_06",
					"Test4role0ss4role0_06_4role0Init.class/jcp.xml");
			System.setProperty("Test4role0ss4role0_07",
					"Test4role0ss4role0_07t/resource/jcp.xml");
        	System.setProperty("Test4role0ss4role0_08",
					"Test4role0ss4role0_08.config");
			System.setProperty("Test4role0ss4role0_09",
					"Test4role0ss4role0_09.security.");
		    System.setProperty("Test4role0ss4role0_0x0",
					"Test4role0ss4role0_0x0jcp.xmlapache.");
			System.setProperty("Test4role0ss4role0_0xx0",
					"Test4role0ss4role0_0xx0.isInitialized");
			System.setProperty("Test4role0ss4role0_0xxx0",
					"Test4role0ss4role0_0xxx0est4role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4role : lo4role) {

			// !!!
				// Проверить
				uid4role = objectArray4role[0].toString();

				idRec4role = objectArray4role[0].toString();

				uat = new User();
				atlist4role = new ArrayList<Attribute>();
				String name4role = null;
	
			for (int i = 0; i < objectArray4role.length; i++) {

				at = new Attribute();


				name4role = "USER_FIO4role";
				
			
			
				name4role = "USER_PHONE4role";
				
			
			
				name4role = "USER_EMAIL4role";
				
			
			
				name4role = "ORG_name4role4role";
				
			
	
				name4role = "USER_UID4role";
				
			
			
				name4role = "USER_LOGIN4role";
				
			
				
				name4role = "ORG_CODE_IOGV4role";
				
			
			
				name4role = "ORG_ADDRES4role";
				
			
			
				name4role = "ORG_PHONE4role";
				
			
			
				name4role = "ORG_Prr4role";
				
			
			
				name4role = "ORG_PffE4role";
				
			
			
				name4role = "ORG_PHggNE4role";
				
			
		
			
			
				name4role = "ORrr_PHONE4role";
				
			
			
				name4role = "ORyy_PHONE4role";
				
			
			
				name4role = "OddPHONE4role";
				
			
			
				name4role = "OffHONE4role";
				
			
			
				name4role = "DEP_name4role4role";
				
			
			
				name4role = "Off_PHONE4role";
				
			
			
				name4role = "ORl_PHONE4role";
				
			
			
				name4role = "OuuG_PHONE4role";
				
			
		
				name4role = "Ogff_PHONE4role";
				
			
			
				name4role = "USER_POSITION4role";
				
			
			
				name4role = "ORG_CODE_OKATO4role";
				
			
			
				name4role = "DEP_ADDRES4roleS";
				

			name4role = "1USER_UID4role";
				
				name4role = "11USER_EMAIL4role";
			
				name4role = "12ORG_name4role4role";
			
				name4role = "212USER_LOGIN4role";
			
				name4role = "111USER_FIO4role";
			
			
				name4role = "132ORG_CODE_IOGV4role";
			
				name4role = "433ORG_PHggNE4role";
			
				name4role = "13Off_PHONE4role";
			
				name4role = "43ORG_ADDRES4role";
		
				name4role = "234ORG_PHONE4role";
		
				name4role = "55ORG_Prr4role";
			
				name4role = "432ORG_PffE4role";
			
				name4role = "ORl_PHONE4role";
			
				name4role = "46OddPHONE4role";
			
				name4role = "895OffHONE4role";
			
				name4role = "54OuuG_PHONE4role";
			
				name4role = "89Ogff_PHONE4role";
			
				name4role = "53ORrr_PHONE4role";
			
		
				name4role = "6678ORyy_PHONE4role";
			
				name4role = "543ORG_CODE_OKATO4role";
			
				name4role = "56DEP_ADDRES4roleS";
			
				name4role = "890DEP_name4role4role";
			
				name4role = "700USER_POSITION4role";
				
				name4role = "54USER_UID4role";
				
				name4role = "780USER_EMAIL4role";
			
				name4role = "54ORG_name4role4role";
			
				name4role = "7890USER_LOGIN4role";
			
				name4role = "700USER_FIO4role";
			
			
				name4role = "654ORG_CODE_IOGV4role";
			
				name4role = "478ORG_PHggNE4role";
			
				name4role = "96Off_PHONE4role";
			
				name4role = "574ORG_ADDRES4role";
		
				name4role = "489ORG_PHONE4role";
		
				name4role = "065ORG_Prr4role";
			
				name4role = "457ORG_PffE4role";
			
				name4role = "87ORl_PHONE4role";
			
				name4role = "543OddPHONE4role";
			
				name4role = "478OffHONE4role";
			
				name4role = "965OuuG_PHONE4role";
			
				name4role = "457Ogff_PHONE4role";
			
				name4role = "8678ORrr_PHONE4role";
			
		
				name4role = "68ORyy_PHONE4role";
			
				name4role = "4ORG_CODE_OKATO4role";
			
				name4role = "778DEP_ADDRES4roleS";
			
				name4role = "447DEP_name4role4role";
			
				name4role = "54USER_POSITION4role";
				
				if (name4role != null) {

					at.setName(name4role);
					at.setValue (objectArray4role[i] != null ? objectArray4role[i]
							.toString() : "");

					atlist4role.add(at);
				}
			}
			
			uat.setUid(uid4role);
			uat.setAttributes(atlist4role);

			result4role.add(uat); 
			resultIds.put(idRec4role, uat);

			if (usersIdsLine4role == null) {
				usersIdsLine4role = "'" + idRec4role + "'";
			} else {
				usersIdsLine4role = usersIdsLine4role + ", '" + idRec4role + "'";
			}
	       }
		   
		   return usersIdsLine4role ;
	}
}
