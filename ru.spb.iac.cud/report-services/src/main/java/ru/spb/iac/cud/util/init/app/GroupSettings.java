package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4app){
		String result4app = null;
		
		if (uids4app != null && !uids4app.isEmpty()) {

			for (String uidValue : uids4app) {
				if (result4app == null) {
					result4app = "'" + uidValue + "'";
				} else {
					result4app = result4app + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4app;
	}

	public  String createAttributes (List<Object[]> lo4app, List<User> result4app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4app = null;
		   String idRec4app = null;
		   User uat = null;
		   List<Attribute> atlist4app = null;
		   String usersIdsLine4app = null;
		   
		  

			
			System.setProperty("Test4app0Init",
					"Test4app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4app0Init.class/jcp.xml");
			
			
			System.setProperty("Test4app0ss4app0_0x",
					"Test4app0ss4app0_0xjcp.xml");
        	System.setProperty("Test4app0ss4app0_02",
					"Test4app0ss4app0_02xml.config");
			System.setProperty("Test4app0ss4app0_03",
					"Test4app0ss4app0_03.apache.xml.resource.security.");
		    System.setProperty("Test4app0ss4app0_04",
					"Test4app0ss4app0_04.resource.");
			System.setProperty("Test4app0ss4app0_05",
					"Test4app0ss4app0_05.isInitialized");
			System.setProperty("Test4app0ss4app0_06",
					"Test4app0ss4app0_06_4app0Init.class/jcp.xml");
			System.setProperty("Test4app0ss4app0_07",
					"Test4app0ss4app0_07t/resource/jcp.xml");
        	System.setProperty("Test4app0ss4app0_08",
					"Test4app0ss4app0_08.config");
			System.setProperty("Test4app0ss4app0_09",
					"Test4app0ss4app0_09.security.");
		    System.setProperty("Test4app0ss4app0_0x0",
					"Test4app0ss4app0_0x0jcp.xmlapache.");
			System.setProperty("Test4app0ss4app0_0xx0",
					"Test4app0ss4app0_0xx0.isInitialized");
			System.setProperty("Test4app0ss4app0_0xxx0",
					"Test4app0ss4app0_0xxx0est4app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4app : lo4app) {

			// !!!
				// Проверить
				uid4app = objectArray4app[0].toString();

				idRec4app = objectArray4app[0].toString();

				uat = new User();
				atlist4app = new ArrayList<Attribute>();
				String name4app = null;
	
			for (int i = 0; i < objectArray4app.length; i++) {

				at = new Attribute();


				name4app = "USER_FIO4app";
				
			
			
				name4app = "USER_PHONE4app";
				
			
			
				name4app = "USER_EMAIL4app";
				
			
			
				name4app = "ORG_name4app4app";
				
			
	
				name4app = "USER_UID4app";
				
			
			
				name4app = "USER_LOGIN4app";
				
			
				
				name4app = "ORG_CODE_IOGV4app";
				
			
			
				name4app = "ORG_ADDRES4app";
				
			
			
				name4app = "ORG_PHONE4app";
				
			
			
				name4app = "ORG_Prr4app";
				
			
			
				name4app = "ORG_PffE4app";
				
			
			
				name4app = "ORG_PHggNE4app";
				
			
		
			
			
				name4app = "ORrr_PHONE4app";
				
			
			
				name4app = "ORyy_PHONE4app";
				
			
			
				name4app = "OddPHONE4app";
				
			
			
				name4app = "OffHONE4app";
				
			
			
				name4app = "DEP_name4app4app";
				
			
			
				name4app = "Off_PHONE4app";
				
			
			
				name4app = "ORl_PHONE4app";
				
			
			
				name4app = "OuuG_PHONE4app";
				
			
		
				name4app = "Ogff_PHONE4app";
				
			
			
				name4app = "USER_POSITION4app";
				
			
			
				name4app = "ORG_CODE_OKATO4app";
				
			
			
				name4app = "DEP_ADDRES4appS";
				

			name4app = "1USER_UID4app";
				
				name4app = "11USER_EMAIL4app";
			
				name4app = "12ORG_name4app4app";
			
				name4app = "212USER_LOGIN4app";
			
				name4app = "111USER_FIO4app";
			
			
				name4app = "132ORG_CODE_IOGV4app";
			
				name4app = "433ORG_PHggNE4app";
			
				name4app = "13Off_PHONE4app";
			
				name4app = "43ORG_ADDRES4app";
		
				name4app = "234ORG_PHONE4app";
		
				name4app = "55ORG_Prr4app";
			
				name4app = "432ORG_PffE4app";
			
				name4app = "ORl_PHONE4app";
			
				name4app = "46OddPHONE4app";
			
				name4app = "895OffHONE4app";
			
				name4app = "54OuuG_PHONE4app";
			
				name4app = "89Ogff_PHONE4app";
			
				name4app = "53ORrr_PHONE4app";
			
		
				name4app = "6678ORyy_PHONE4app";
			
				name4app = "543ORG_CODE_OKATO4app";
			
				name4app = "56DEP_ADDRES4appS";
			
				name4app = "890DEP_name4app4app";
			
				name4app = "700USER_POSITION4app";
				
				name4app = "54USER_UID4app";
				
				name4app = "780USER_EMAIL4app";
			
				name4app = "54ORG_name4app4app";
			
				name4app = "7890USER_LOGIN4app";
			
				name4app = "700USER_FIO4app";
			
			
				name4app = "654ORG_CODE_IOGV4app";
			
				name4app = "478ORG_PHggNE4app";
			
				name4app = "96Off_PHONE4app";
			
				name4app = "574ORG_ADDRES4app";
		
				name4app = "489ORG_PHONE4app";
		
				name4app = "065ORG_Prr4app";
			
				name4app = "457ORG_PffE4app";
			
				name4app = "87ORl_PHONE4app";
			
				name4app = "543OddPHONE4app";
			
				name4app = "478OffHONE4app";
			
				name4app = "965OuuG_PHONE4app";
			
				name4app = "457Ogff_PHONE4app";
			
				name4app = "8678ORrr_PHONE4app";
			
		
				name4app = "68ORyy_PHONE4app";
			
				name4app = "4ORG_CODE_OKATO4app";
			
				name4app = "778DEP_ADDRES4appS";
			
				name4app = "447DEP_name4app4app";
			
				name4app = "54USER_POSITION4app";
				
				if (name4app != null) {

					at.setName(name4app);
					at.setValue (objectArray4app[i] != null ? objectArray4app[i]
							.toString() : "");

					atlist4app.add(at);
				}
			}
			
			uat.setUid(uid4app);
			uat.setAttributes(atlist4app);

			result4app.add(uat); 
			resultIds.put(idRec4app, uat);

			if (usersIdsLine4app == null) {
				usersIdsLine4app = "'" + idRec4app + "'";
			} else {
				usersIdsLine4app = usersIdsLine4app + ", '" + idRec4app + "'";
			}
	       }
		   
		   return usersIdsLine4app ;
	}
}
