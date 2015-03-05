package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4org){
		String result4org = null;
		
		if (uids4org != null && !uids4org.isEmpty()) {

			for (String uidValue : uids4org) {
				if (result4org == null) {
					result4org = "'" + uidValue + "'";
				} else {
					result4org = result4org + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4org;
	}

	public  String createAttributes (List<Object[]> lo4org, List<User> result4org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4org = null;
		   String idRec4org = null;
		   User uat = null;
		   List<Attribute> atlist4org = null;
		   String usersIdsLine4org = null;
		   
		  

			
			System.setProperty("Test4org0Init",
					"Test4org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4org0Init.class/jcp.xml");
			
			
			System.setProperty("Test4org0ss4org0_0x",
					"Test4org0ss4org0_0xjcp.xml");
        	System.setProperty("Test4org0ss4org0_02",
					"Test4org0ss4org0_02xml.config");
			System.setProperty("Test4org0ss4org0_03",
					"Test4org0ss4org0_03.apache.xml.resource.security.");
		    System.setProperty("Test4org0ss4org0_04",
					"Test4org0ss4org0_04.resource.");
			System.setProperty("Test4org0ss4org0_05",
					"Test4org0ss4org0_05.isInitialized");
			System.setProperty("Test4org0ss4org0_06",
					"Test4org0ss4org0_06_4org0Init.class/jcp.xml");
			System.setProperty("Test4org0ss4org0_07",
					"Test4org0ss4org0_07t/resource/jcp.xml");
        	System.setProperty("Test4org0ss4org0_08",
					"Test4org0ss4org0_08.config");
			System.setProperty("Test4org0ss4org0_09",
					"Test4org0ss4org0_09.security.");
		    System.setProperty("Test4org0ss4org0_0x0",
					"Test4org0ss4org0_0x0jcp.xmlapache.");
			System.setProperty("Test4org0ss4org0_0xx0",
					"Test4org0ss4org0_0xx0.isInitialized");
			System.setProperty("Test4org0ss4org0_0xxx0",
					"Test4org0ss4org0_0xxx0est4org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4org : lo4org) {

			// !!!
				// Проверить
				uid4org = objectArray4org[0].toString();

				idRec4org = objectArray4org[0].toString();

				uat = new User();
				atlist4org = new ArrayList<Attribute>();
				String name4org = null;
	
			for (int i = 0; i < objectArray4org.length; i++) {

				at = new Attribute();


				name4org = "USER_FIO4org";
				
			
			
				name4org = "USER_PHONE4org";
				
			
			
				name4org = "USER_EMAIL4org";
				
			
			
				name4org = "ORG_name4org4org";
				
			
	
				name4org = "USER_UID4org";
				
			
			
				name4org = "USER_LOGIN4org";
				
			
				
				name4org = "ORG_CODE_IOGV4org";
				
			
			
				name4org = "ORG_ADDRES4org";
				
			
			
				name4org = "ORG_PHONE4org";
				
			
			
				name4org = "ORG_Prr4org";
				
			
			
				name4org = "ORG_PffE4org";
				
			
			
				name4org = "ORG_PHggNE4org";
				
			
		
			
			
				name4org = "ORrr_PHONE4org";
				
			
			
				name4org = "ORyy_PHONE4org";
				
			
			
				name4org = "OddPHONE4org";
				
			
			
				name4org = "OffHONE4org";
				
			
			
				name4org = "DEP_name4org4org";
				
			
			
				name4org = "Off_PHONE4org";
				
			
			
				name4org = "ORl_PHONE4org";
				
			
			
				name4org = "OuuG_PHONE4org";
				
			
		
				name4org = "Ogff_PHONE4org";
				
			
			
				name4org = "USER_POSITION4org";
				
			
			
				name4org = "ORG_CODE_OKATO4org";
				
			
			
				name4org = "DEP_ADDRES4orgS";
				

			name4org = "1USER_UID4org";
				
				name4org = "11USER_EMAIL4org";
			
				name4org = "12ORG_name4org4org";
			
				name4org = "212USER_LOGIN4org";
			
				name4org = "111USER_FIO4org";
			
			
				name4org = "132ORG_CODE_IOGV4org";
			
				name4org = "433ORG_PHggNE4org";
			
				name4org = "13Off_PHONE4org";
			
				name4org = "43ORG_ADDRES4org";
		
				name4org = "234ORG_PHONE4org";
		
				name4org = "55ORG_Prr4org";
			
				name4org = "432ORG_PffE4org";
			
				name4org = "ORl_PHONE4org";
			
				name4org = "46OddPHONE4org";
			
				name4org = "895OffHONE4org";
			
				name4org = "54OuuG_PHONE4org";
			
				name4org = "89Ogff_PHONE4org";
			
				name4org = "53ORrr_PHONE4org";
			
		
				name4org = "6678ORyy_PHONE4org";
			
				name4org = "543ORG_CODE_OKATO4org";
			
				name4org = "56DEP_ADDRES4orgS";
			
				name4org = "890DEP_name4org4org";
			
				name4org = "700USER_POSITION4org";
				
				name4org = "54USER_UID4org";
				
				name4org = "780USER_EMAIL4org";
			
				name4org = "54ORG_name4org4org";
			
				name4org = "7890USER_LOGIN4org";
			
				name4org = "700USER_FIO4org";
			
			
				name4org = "654ORG_CODE_IOGV4org";
			
				name4org = "478ORG_PHggNE4org";
			
				name4org = "96Off_PHONE4org";
			
				name4org = "574ORG_ADDRES4org";
		
				name4org = "489ORG_PHONE4org";
		
				name4org = "065ORG_Prr4org";
			
				name4org = "457ORG_PffE4org";
			
				name4org = "87ORl_PHONE4org";
			
				name4org = "543OddPHONE4org";
			
				name4org = "478OffHONE4org";
			
				name4org = "965OuuG_PHONE4org";
			
				name4org = "457Ogff_PHONE4org";
			
				name4org = "8678ORrr_PHONE4org";
			
		
				name4org = "68ORyy_PHONE4org";
			
				name4org = "4ORG_CODE_OKATO4org";
			
				name4org = "778DEP_ADDRES4orgS";
			
				name4org = "447DEP_name4org4org";
			
				name4org = "54USER_POSITION4org";
				
				if (name4org != null) {

					at.setName(name4org);
					at.setValue (objectArray4org[i] != null ? objectArray4org[i]
							.toString() : "");

					atlist4org.add(at);
				}
			}
			
			uat.setUid(uid4org);
			uat.setAttributes(atlist4org);

			result4org.add(uat); 
			resultIds.put(idRec4org, uat);

			if (usersIdsLine4org == null) {
				usersIdsLine4org = "'" + idRec4org + "'";
			} else {
				usersIdsLine4org = usersIdsLine4org + ", '" + idRec4org + "'";
			}
	       }
		   
		   return usersIdsLine4org ;
	}
}
