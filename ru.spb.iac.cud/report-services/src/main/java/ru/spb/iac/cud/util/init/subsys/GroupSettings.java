package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4subsys){
		String result4subsys = null;
		
		if (uids4subsys != null && !uids4subsys.isEmpty()) {

			StringBuilder bld4subsys = new StringBuilder();

			for (String uidValue : uids4subsys) {

			  bld4subsys.append(",'").append(uidValue).append("'");

			}

			result4subsys=bld4subsys.substring(1);
		}
		
		return result4subsys;
	}

	public  String createAttributes (List<Object[]> lo4subsys, List<User> result4subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4subsys = null;
		   String idRec4subsys = null;
		   User uat = null;
		   List<Attribute> atlist4subsys = null;
		   String usersIdsLine4subsys = null;
		   
		  

			
			System.setProperty("Test4subsys0Init",
					"Test4subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test4subsys0ss4subsys0_0x",
					"Test4subsys0ss4subsys0_0xjcp.xml");
        	System.setProperty("Test4subsys0ss4subsys0_02",
					"Test4subsys0ss4subsys0_02xml.config");
			System.setProperty("Test4subsys0ss4subsys0_03",
					"Test4subsys0ss4subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test4subsys0ss4subsys0_04",
					"Test4subsys0ss4subsys0_04.resource.");
			System.setProperty("Test4subsys0ss4subsys0_05",
					"Test4subsys0ss4subsys0_05.isInitialized");
			System.setProperty("Test4subsys0ss4subsys0_06",
					"Test4subsys0ss4subsys0_06_4subsys0Init.class/jcp.xml");
			System.setProperty("Test4subsys0ss4subsys0_07",
					"Test4subsys0ss4subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test4subsys0ss4subsys0_08",
					"Test4subsys0ss4subsys0_08.config");
			System.setProperty("Test4subsys0ss4subsys0_09",
					"Test4subsys0ss4subsys0_09.security.");
		    System.setProperty("Test4subsys0ss4subsys0_0x0",
					"Test4subsys0ss4subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test4subsys0ss4subsys0_0xx0",
					"Test4subsys0ss4subsys0_0xx0.isInitialized");
			System.setProperty("Test4subsys0ss4subsys0_0xxx0",
					"Test4subsys0ss4subsys0_0xxx0est4subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4subsys : lo4subsys) {

			// !!!
				// Проверить
				uid4subsys = objectArray4subsys[0].toString();

				idRec4subsys = objectArray4subsys[0].toString();

				uat = new User();
				atlist4subsys = new ArrayList<Attribute>();
				String name4subsys = null;
	
			for (int i = 0; i < objectArray4subsys.length; i++) {

				at = new Attribute();


				name4subsys = "USER_FIO4subsys";
				
			
			
				name4subsys = "USER_PHONE4subsys";
				
			
			
				name4subsys = "USER_EMAIL4subsys";
				
			
			
				name4subsys = "ORG_name4subsys4subsys";
				
			
	
				name4subsys = "USER_UID4subsys";
				
			
			
				name4subsys = "USER_LOGIN4subsys";
				
			
				
				name4subsys = "ORG_CODE_IOGV4subsys";
				
			
			
				name4subsys = "ORG_ADDRES4subsys";
				
			
			
				name4subsys = "ORG_PHONE4subsys";
				
			
			
				name4subsys = "ORG_Prr4subsys";
				
			
			
				name4subsys = "ORG_PffE4subsys";
				
			
			
				name4subsys = "ORG_PHggNE4subsys";
				
			
		
			
			
				name4subsys = "ORrr_PHONE4subsys";
				
			
			
				name4subsys = "ORyy_PHONE4subsys";
				
			
			
				name4subsys = "OddPHONE4subsys";
				
			
			
				name4subsys = "OffHONE4subsys";
				
			
			
				name4subsys = "DEP_name4subsys4subsys";
				
			
			
				name4subsys = "Off_PHONE4subsys";
				
			
			
				name4subsys = "ORl_PHONE4subsys";
				
			
			
				name4subsys = "OuuG_PHONE4subsys";
				
			
		
				name4subsys = "Ogff_PHONE4subsys";
				
			
			
				name4subsys = "USER_POSITION4subsys";
				
			
			
				name4subsys = "ORG_CODE_OKATO4subsys";
				
			
			
				name4subsys = "DEP_ADDRES4subsysS";
				

			name4subsys = "1USER_UID4subsys";
				
				name4subsys = "11USER_EMAIL4subsys";
			
				name4subsys = "12ORG_name4subsys4subsys";
			
				name4subsys = "212USER_LOGIN4subsys";
			
				name4subsys = "111USER_FIO4subsys";
			
			
				name4subsys = "132ORG_CODE_IOGV4subsys";
			
				name4subsys = "433ORG_PHggNE4subsys";
			
				name4subsys = "13Off_PHONE4subsys";
			
				name4subsys = "43ORG_ADDRES4subsys";
		
				name4subsys = "234ORG_PHONE4subsys";
		
				name4subsys = "55ORG_Prr4subsys";
			
				name4subsys = "432ORG_PffE4subsys";
			
				name4subsys = "ORl_PHONE4subsys";
			
				name4subsys = "46OddPHONE4subsys";
			
				name4subsys = "895OffHONE4subsys";
			
				name4subsys = "54OuuG_PHONE4subsys";
			
				name4subsys = "89Ogff_PHONE4subsys";
			
				name4subsys = "53ORrr_PHONE4subsys";
			
		
				name4subsys = "6678ORyy_PHONE4subsys";
			
				name4subsys = "543ORG_CODE_OKATO4subsys";
			
				name4subsys = "56DEP_ADDRES4subsysS";
			
				name4subsys = "890DEP_name4subsys4subsys";
			
				name4subsys = "700USER_POSITION4subsys";
				
				name4subsys = "54USER_UID4subsys";
				
				name4subsys = "780USER_EMAIL4subsys";
			
				name4subsys = "54ORG_name4subsys4subsys";
			
				name4subsys = "7890USER_LOGIN4subsys";
			
				name4subsys = "700USER_FIO4subsys";
			
			
				name4subsys = "654ORG_CODE_IOGV4subsys";
			
				name4subsys = "478ORG_PHggNE4subsys";
			
				name4subsys = "96Off_PHONE4subsys";
			
				name4subsys = "574ORG_ADDRES4subsys";
		
				name4subsys = "489ORG_PHONE4subsys";
		
				name4subsys = "065ORG_Prr4subsys";
			
				name4subsys = "457ORG_PffE4subsys";
			
				name4subsys = "87ORl_PHONE4subsys";
			
				name4subsys = "543OddPHONE4subsys";
			
				name4subsys = "478OffHONE4subsys";
			
				name4subsys = "965OuuG_PHONE4subsys";
			
				name4subsys = "457Ogff_PHONE4subsys";
			
				name4subsys = "8678ORrr_PHONE4subsys";
			
		
				name4subsys = "68ORyy_PHONE4subsys";
			
				name4subsys = "4ORG_CODE_OKATO4subsys";
			
				name4subsys = "778DEP_ADDRES4subsysS";
			
				name4subsys = "447DEP_name4subsys4subsys";
			
				name4subsys = "54USER_POSITION4subsys";
				
				if (name4subsys != null) {

					at.setName(name4subsys);
					at.setValue (objectArray4subsys[i] != null ? objectArray4subsys[i]
							.toString() : "");

					atlist4subsys.add(at);
				}
			}
			
			uat.setUid(uid4subsys);
			uat.setAttributes(atlist4subsys);

			result4subsys.add(uat); 
			resultIds.put(idRec4subsys, uat);

			if (usersIdsLine4subsys == null) {
				usersIdsLine4subsys = "'" + idRec4subsys + "'";
			} else {
				usersIdsLine4subsys = usersIdsLine4subsys + ", '" + idRec4subsys + "'";
			}
	       }
		   
		   return usersIdsLine4subsys ;
	}
}
