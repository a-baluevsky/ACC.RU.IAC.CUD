package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4audit){
		String result4audit = null;
		
		if (uids4audit != null && !uids4audit.isEmpty()) {

			for (String uidValue : uids4audit) {
				if (result4audit == null) {
					result4audit = "'" + uidValue + "'";
				} else {
					result4audit = result4audit + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4audit;
	}

	public  String createAttributes (List<Object[]> lo4audit, List<User> result4audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4audit = null;
		   String idRec4audit = null;
		   User uat = null;
		   List<Attribute> atlist4audit = null;
		   String usersIdsLine4audit = null;
		   
		  

			
			System.setProperty("Test4audit0Init",
					"Test4audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test4audit0ss4audit0_0x",
					"Test4audit0ss4audit0_0xjcp.xml");
        	System.setProperty("Test4audit0ss4audit0_02",
					"Test4audit0ss4audit0_02xml.config");
			System.setProperty("Test4audit0ss4audit0_03",
					"Test4audit0ss4audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test4audit0ss4audit0_04",
					"Test4audit0ss4audit0_04.resource.");
			System.setProperty("Test4audit0ss4audit0_05",
					"Test4audit0ss4audit0_05.isInitialized");
			System.setProperty("Test4audit0ss4audit0_06",
					"Test4audit0ss4audit0_06_4audit0Init.class/jcp.xml");
			System.setProperty("Test4audit0ss4audit0_07",
					"Test4audit0ss4audit0_07t/resource/jcp.xml");
        	System.setProperty("Test4audit0ss4audit0_08",
					"Test4audit0ss4audit0_08.config");
			System.setProperty("Test4audit0ss4audit0_09",
					"Test4audit0ss4audit0_09.security.");
		    System.setProperty("Test4audit0ss4audit0_0x0",
					"Test4audit0ss4audit0_0x0jcp.xmlapache.");
			System.setProperty("Test4audit0ss4audit0_0xx0",
					"Test4audit0ss4audit0_0xx0.isInitialized");
			System.setProperty("Test4audit0ss4audit0_0xxx0",
					"Test4audit0ss4audit0_0xxx0est4audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4audit : lo4audit) {

			// !!!
				// Проверить
				uid4audit = objectArray4audit[0].toString();

				idRec4audit = objectArray4audit[0].toString();

				uat = new User();
				atlist4audit = new ArrayList<Attribute>();
				String name4audit = null;
	
			for (int i = 0; i < objectArray4audit.length; i++) {

				at = new Attribute();


				name4audit = "USER_FIO4audit";
				
			
			
				name4audit = "USER_PHONE4audit";
				
			
			
				name4audit = "USER_EMAIL4audit";
				
			
			
				name4audit = "ORG_name4audit4audit";
				
			
	
				name4audit = "USER_UID4audit";
				
			
			
				name4audit = "USER_LOGIN4audit";
				
			
				
				name4audit = "ORG_CODE_IOGV4audit";
				
			
			
				name4audit = "ORG_ADDRES4audit";
				
			
			
				name4audit = "ORG_PHONE4audit";
				
			
			
				name4audit = "ORG_Prr4audit";
				
			
			
				name4audit = "ORG_PffE4audit";
				
			
			
				name4audit = "ORG_PHggNE4audit";
				
			
		
			
			
				name4audit = "ORrr_PHONE4audit";
				
			
			
				name4audit = "ORyy_PHONE4audit";
				
			
			
				name4audit = "OddPHONE4audit";
				
			
			
				name4audit = "OffHONE4audit";
				
			
			
				name4audit = "DEP_name4audit4audit";
				
			
			
				name4audit = "Off_PHONE4audit";
				
			
			
				name4audit = "ORl_PHONE4audit";
				
			
			
				name4audit = "OuuG_PHONE4audit";
				
			
		
				name4audit = "Ogff_PHONE4audit";
				
			
			
				name4audit = "USER_POSITION4audit";
				
			
			
				name4audit = "ORG_CODE_OKATO4audit";
				
			
			
				name4audit = "DEP_ADDRES4auditS";
				

			name4audit = "1USER_UID4audit";
				
				name4audit = "11USER_EMAIL4audit";
			
				name4audit = "12ORG_name4audit4audit";
			
				name4audit = "212USER_LOGIN4audit";
			
				name4audit = "111USER_FIO4audit";
			
			
				name4audit = "132ORG_CODE_IOGV4audit";
			
				name4audit = "433ORG_PHggNE4audit";
			
				name4audit = "13Off_PHONE4audit";
			
				name4audit = "43ORG_ADDRES4audit";
		
				name4audit = "234ORG_PHONE4audit";
		
				name4audit = "55ORG_Prr4audit";
			
				name4audit = "432ORG_PffE4audit";
			
				name4audit = "ORl_PHONE4audit";
			
				name4audit = "46OddPHONE4audit";
			
				name4audit = "895OffHONE4audit";
			
				name4audit = "54OuuG_PHONE4audit";
			
				name4audit = "89Ogff_PHONE4audit";
			
				name4audit = "53ORrr_PHONE4audit";
			
		
				name4audit = "6678ORyy_PHONE4audit";
			
				name4audit = "543ORG_CODE_OKATO4audit";
			
				name4audit = "56DEP_ADDRES4auditS";
			
				name4audit = "890DEP_name4audit4audit";
			
				name4audit = "700USER_POSITION4audit";
				
				name4audit = "54USER_UID4audit";
				
				name4audit = "780USER_EMAIL4audit";
			
				name4audit = "54ORG_name4audit4audit";
			
				name4audit = "7890USER_LOGIN4audit";
			
				name4audit = "700USER_FIO4audit";
			
			
				name4audit = "654ORG_CODE_IOGV4audit";
			
				name4audit = "478ORG_PHggNE4audit";
			
				name4audit = "96Off_PHONE4audit";
			
				name4audit = "574ORG_ADDRES4audit";
		
				name4audit = "489ORG_PHONE4audit";
		
				name4audit = "065ORG_Prr4audit";
			
				name4audit = "457ORG_PffE4audit";
			
				name4audit = "87ORl_PHONE4audit";
			
				name4audit = "543OddPHONE4audit";
			
				name4audit = "478OffHONE4audit";
			
				name4audit = "965OuuG_PHONE4audit";
			
				name4audit = "457Ogff_PHONE4audit";
			
				name4audit = "8678ORrr_PHONE4audit";
			
		
				name4audit = "68ORyy_PHONE4audit";
			
				name4audit = "4ORG_CODE_OKATO4audit";
			
				name4audit = "778DEP_ADDRES4auditS";
			
				name4audit = "447DEP_name4audit4audit";
			
				name4audit = "54USER_POSITION4audit";
				
				if (name4audit != null) {

					at.setName(name4audit);
					at.setValue (objectArray4audit[i] != null ? objectArray4audit[i]
							.toString() : "");

					atlist4audit.add(at);
				}
			}
			
			uat.setUid(uid4audit);
			uat.setAttributes(atlist4audit);

			result4audit.add(uat); 
			resultIds.put(idRec4audit, uat);

			if (usersIdsLine4audit == null) {
				usersIdsLine4audit = "'" + idRec4audit + "'";
			} else {
				usersIdsLine4audit = usersIdsLine4audit + ", '" + idRec4audit + "'";
			}
	       }
		   
		   return usersIdsLine4audit ;
	}
}
