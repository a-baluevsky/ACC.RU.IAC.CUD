package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4user){
		String result4user = null;
		
		if (uids4user != null && !uids4user.isEmpty()) {

			StringBuilder bld4user = new StringBuilder();

			for (String uidValue : uids4user) {

			  bld4user.append(",'").append(uidValue).append("'");

			}

			result4user=bld4user.substring(1);
		}
		
		return result4user;
	}

	public  String createAttributes (List<Object[]> lo4user, List<User> result4user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4user = null;
		   String idRec4user = null;
		   User uat = null;
		   List<Attribute> atlist4user = null;
		   String usersIdsLine4user = null;
		   
		  

			
			System.setProperty("Test4user0Init",
					"Test4user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4user0Init.class/jcp.xml");
			
			
			System.setProperty("Test4user0ss4user0_0x",
					"Test4user0ss4user0_0xjcp.xml");
        	System.setProperty("Test4user0ss4user0_02",
					"Test4user0ss4user0_02xml.config");
			System.setProperty("Test4user0ss4user0_03",
					"Test4user0ss4user0_03.apache.xml.resource.security.");
		    System.setProperty("Test4user0ss4user0_04",
					"Test4user0ss4user0_04.resource.");
			System.setProperty("Test4user0ss4user0_05",
					"Test4user0ss4user0_05.isInitialized");
			System.setProperty("Test4user0ss4user0_06",
					"Test4user0ss4user0_06_4user0Init.class/jcp.xml");
			System.setProperty("Test4user0ss4user0_07",
					"Test4user0ss4user0_07t/resource/jcp.xml");
        	System.setProperty("Test4user0ss4user0_08",
					"Test4user0ss4user0_08.config");
			System.setProperty("Test4user0ss4user0_09",
					"Test4user0ss4user0_09.security.");
		    System.setProperty("Test4user0ss4user0_0x0",
					"Test4user0ss4user0_0x0jcp.xmlapache.");
			System.setProperty("Test4user0ss4user0_0xx0",
					"Test4user0ss4user0_0xx0.isInitialized");
			System.setProperty("Test4user0ss4user0_0xxx0",
					"Test4user0ss4user0_0xxx0est4user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4user : lo4user) {

			// !!!
				// Проверить
				uid4user = objectArray4user[0].toString();

				idRec4user = objectArray4user[0].toString();

				uat = new User();
				atlist4user = new ArrayList<Attribute>();
				String name4user = null;
	
			for (int i = 0; i < objectArray4user.length; i++) {

				at = new Attribute();


				name4user = "USER_FIO4user";
				
			
			
				name4user = "USER_PHONE4user";
				
			
			
				name4user = "USER_EMAIL4user";
				
			
			
				name4user = "ORG_name4user4user";
				
			
	
				name4user = "USER_UID4user";
				
			
			
				name4user = "USER_LOGIN4user";
				
			
				
				name4user = "ORG_CODE_IOGV4user";
				
			
			
				name4user = "ORG_ADDRES4user";
				
			
			
				name4user = "ORG_PHONE4user";
				
			
			
				name4user = "ORG_Prr4user";
				
			
			
				name4user = "ORG_PffE4user";
				
			
			
				name4user = "ORG_PHggNE4user";
				
			
		
			
			
				name4user = "ORrr_PHONE4user";
				
			
			
				name4user = "ORyy_PHONE4user";
				
			
			
				name4user = "OddPHONE4user";
				
			
			
				name4user = "OffHONE4user";
				
			
			
				name4user = "DEP_name4user4user";
				
			
			
				name4user = "Off_PHONE4user";
				
			
			
				name4user = "ORl_PHONE4user";
				
			
			
				name4user = "OuuG_PHONE4user";
				
			
		
				name4user = "Ogff_PHONE4user";
				
			
			
				name4user = "USER_POSITION4user";
				
			
			
				name4user = "ORG_CODE_OKATO4user";
				
			
			
				name4user = "DEP_ADDRES4userS";
				

			name4user = "1USER_UID4user";
				
				name4user = "11USER_EMAIL4user";
			
				name4user = "12ORG_name4user4user";
			
				name4user = "212USER_LOGIN4user";
			
				name4user = "111USER_FIO4user";
			
			
				name4user = "132ORG_CODE_IOGV4user";
			
				name4user = "433ORG_PHggNE4user";
			
				name4user = "13Off_PHONE4user";
			
				name4user = "43ORG_ADDRES4user";
		
				name4user = "234ORG_PHONE4user";
		
				name4user = "55ORG_Prr4user";
			
				name4user = "432ORG_PffE4user";
			
				name4user = "ORl_PHONE4user";
			
				name4user = "46OddPHONE4user";
			
				name4user = "895OffHONE4user";
			
				name4user = "54OuuG_PHONE4user";
			
				name4user = "89Ogff_PHONE4user";
			
				name4user = "53ORrr_PHONE4user";
			
		
				name4user = "6678ORyy_PHONE4user";
			
				name4user = "543ORG_CODE_OKATO4user";
			
				name4user = "56DEP_ADDRES4userS";
			
				name4user = "890DEP_name4user4user";
			
				name4user = "700USER_POSITION4user";
				
				name4user = "54USER_UID4user";
				
				name4user = "780USER_EMAIL4user";
			
				name4user = "54ORG_name4user4user";
			
				name4user = "7890USER_LOGIN4user";
			
				name4user = "700USER_FIO4user";
			
			
				name4user = "654ORG_CODE_IOGV4user";
			
				name4user = "478ORG_PHggNE4user";
			
				name4user = "96Off_PHONE4user";
			
				name4user = "574ORG_ADDRES4user";
		
				name4user = "489ORG_PHONE4user";
		
				name4user = "065ORG_Prr4user";
			
				name4user = "457ORG_PffE4user";
			
				name4user = "87ORl_PHONE4user";
			
				name4user = "543OddPHONE4user";
			
				name4user = "478OffHONE4user";
			
				name4user = "965OuuG_PHONE4user";
			
				name4user = "457Ogff_PHONE4user";
			
				name4user = "8678ORrr_PHONE4user";
			
		
				name4user = "68ORyy_PHONE4user";
			
				name4user = "4ORG_CODE_OKATO4user";
			
				name4user = "778DEP_ADDRES4userS";
			
				name4user = "447DEP_name4user4user";
			
				name4user = "54USER_POSITION4user";
				
				if (name4user != null) {

					at.setName(name4user);
					at.setValue (objectArray4user[i] != null ? objectArray4user[i]
							.toString() : "");

					atlist4user.add(at);
				}
			}
			
			uat.setUid(uid4user);
			uat.setAttributes(atlist4user);

			result4user.add(uat); 
			resultIds.put(idRec4user, uat);

			if (usersIdsLine4user == null) {
				usersIdsLine4user = "'" + idRec4user + "'";
			} else {
				usersIdsLine4user = usersIdsLine4user + ", '" + idRec4user + "'";
			}
	       }
		   
		   return usersIdsLine4user ;
	}
}
