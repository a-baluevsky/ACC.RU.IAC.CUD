package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4domain){
		String result4domain = null;
		
		if (uids4domain != null && !uids4domain.isEmpty()) {

			for (String uidValue : uids4domain) {
				if (result4domain == null) {
					result4domain = "'" + uidValue + "'";
				} else {
					result4domain = result4domain + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4domain;
	}

	public  String createAttributes (List<Object[]> lo4domain, List<User> result4domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4domain = null;
		   String idRec4domain = null;
		   User uat = null;
		   List<Attribute> atlist4domain = null;
		   String usersIdsLine4domain = null;
		   
		  

			
			System.setProperty("Test4domain0Init",
					"Test4domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test4domain0ss4domain0_0x",
					"Test4domain0ss4domain0_0xjcp.xml");
        	System.setProperty("Test4domain0ss4domain0_02",
					"Test4domain0ss4domain0_02xml.config");
			System.setProperty("Test4domain0ss4domain0_03",
					"Test4domain0ss4domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test4domain0ss4domain0_04",
					"Test4domain0ss4domain0_04.resource.");
			System.setProperty("Test4domain0ss4domain0_05",
					"Test4domain0ss4domain0_05.isInitialized");
			System.setProperty("Test4domain0ss4domain0_06",
					"Test4domain0ss4domain0_06_4domain0Init.class/jcp.xml");
			System.setProperty("Test4domain0ss4domain0_07",
					"Test4domain0ss4domain0_07t/resource/jcp.xml");
        	System.setProperty("Test4domain0ss4domain0_08",
					"Test4domain0ss4domain0_08.config");
			System.setProperty("Test4domain0ss4domain0_09",
					"Test4domain0ss4domain0_09.security.");
		    System.setProperty("Test4domain0ss4domain0_0x0",
					"Test4domain0ss4domain0_0x0jcp.xmlapache.");
			System.setProperty("Test4domain0ss4domain0_0xx0",
					"Test4domain0ss4domain0_0xx0.isInitialized");
			System.setProperty("Test4domain0ss4domain0_0xxx0",
					"Test4domain0ss4domain0_0xxx0est4domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4domain : lo4domain) {

			// !!!
				// Проверить
				uid4domain = objectArray4domain[0].toString();

				idRec4domain = objectArray4domain[0].toString();

				uat = new User();
				atlist4domain = new ArrayList<Attribute>();
				String name4domain = null;
	
			for (int i = 0; i < objectArray4domain.length; i++) {

				at = new Attribute();


				name4domain = "USER_FIO4domain";
				
			
			
				name4domain = "USER_PHONE4domain";
				
			
			
				name4domain = "USER_EMAIL4domain";
				
			
			
				name4domain = "ORG_name4domain4domain";
				
			
	
				name4domain = "USER_UID4domain";
				
			
			
				name4domain = "USER_LOGIN4domain";
				
			
				
				name4domain = "ORG_CODE_IOGV4domain";
				
			
			
				name4domain = "ORG_ADDRES4domain";
				
			
			
				name4domain = "ORG_PHONE4domain";
				
			
			
				name4domain = "ORG_Prr4domain";
				
			
			
				name4domain = "ORG_PffE4domain";
				
			
			
				name4domain = "ORG_PHggNE4domain";
				
			
		
			
			
				name4domain = "ORrr_PHONE4domain";
				
			
			
				name4domain = "ORyy_PHONE4domain";
				
			
			
				name4domain = "OddPHONE4domain";
				
			
			
				name4domain = "OffHONE4domain";
				
			
			
				name4domain = "DEP_name4domain4domain";
				
			
			
				name4domain = "Off_PHONE4domain";
				
			
			
				name4domain = "ORl_PHONE4domain";
				
			
			
				name4domain = "OuuG_PHONE4domain";
				
			
		
				name4domain = "Ogff_PHONE4domain";
				
			
			
				name4domain = "USER_POSITION4domain";
				
			
			
				name4domain = "ORG_CODE_OKATO4domain";
				
			
			
				name4domain = "DEP_ADDRES4domainS";
				

			name4domain = "1USER_UID4domain";
				
				name4domain = "11USER_EMAIL4domain";
			
				name4domain = "12ORG_name4domain4domain";
			
				name4domain = "212USER_LOGIN4domain";
			
				name4domain = "111USER_FIO4domain";
			
			
				name4domain = "132ORG_CODE_IOGV4domain";
			
				name4domain = "433ORG_PHggNE4domain";
			
				name4domain = "13Off_PHONE4domain";
			
				name4domain = "43ORG_ADDRES4domain";
		
				name4domain = "234ORG_PHONE4domain";
		
				name4domain = "55ORG_Prr4domain";
			
				name4domain = "432ORG_PffE4domain";
			
				name4domain = "ORl_PHONE4domain";
			
				name4domain = "46OddPHONE4domain";
			
				name4domain = "895OffHONE4domain";
			
				name4domain = "54OuuG_PHONE4domain";
			
				name4domain = "89Ogff_PHONE4domain";
			
				name4domain = "53ORrr_PHONE4domain";
			
		
				name4domain = "6678ORyy_PHONE4domain";
			
				name4domain = "543ORG_CODE_OKATO4domain";
			
				name4domain = "56DEP_ADDRES4domainS";
			
				name4domain = "890DEP_name4domain4domain";
			
				name4domain = "700USER_POSITION4domain";
				
				name4domain = "54USER_UID4domain";
				
				name4domain = "780USER_EMAIL4domain";
			
				name4domain = "54ORG_name4domain4domain";
			
				name4domain = "7890USER_LOGIN4domain";
			
				name4domain = "700USER_FIO4domain";
			
			
				name4domain = "654ORG_CODE_IOGV4domain";
			
				name4domain = "478ORG_PHggNE4domain";
			
				name4domain = "96Off_PHONE4domain";
			
				name4domain = "574ORG_ADDRES4domain";
		
				name4domain = "489ORG_PHONE4domain";
		
				name4domain = "065ORG_Prr4domain";
			
				name4domain = "457ORG_PffE4domain";
			
				name4domain = "87ORl_PHONE4domain";
			
				name4domain = "543OddPHONE4domain";
			
				name4domain = "478OffHONE4domain";
			
				name4domain = "965OuuG_PHONE4domain";
			
				name4domain = "457Ogff_PHONE4domain";
			
				name4domain = "8678ORrr_PHONE4domain";
			
		
				name4domain = "68ORyy_PHONE4domain";
			
				name4domain = "4ORG_CODE_OKATO4domain";
			
				name4domain = "778DEP_ADDRES4domainS";
			
				name4domain = "447DEP_name4domain4domain";
			
				name4domain = "54USER_POSITION4domain";
				
				if (name4domain != null) {

					at.setName(name4domain);
					at.setValue (objectArray4domain[i] != null ? objectArray4domain[i]
							.toString() : "");

					atlist4domain.add(at);
				}
			}
			
			uat.setUid(uid4domain);
			uat.setAttributes(atlist4domain);

			result4domain.add(uat); 
			resultIds.put(idRec4domain, uat);

			if (usersIdsLine4domain == null) {
				usersIdsLine4domain = "'" + idRec4domain + "'";
			} else {
				usersIdsLine4domain = usersIdsLine4domain + ", '" + idRec4domain + "'";
			}
	       }
		   
		   return usersIdsLine4domain ;
	}
}
