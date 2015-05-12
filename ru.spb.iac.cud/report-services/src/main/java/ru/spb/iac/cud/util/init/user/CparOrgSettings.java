package ru.spb.iac.cud.util.init.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5user){
		String result5user = null;
		
		if (uids5user != null && !uids5user.isEmpty()) {

			StringBuilder bld5user = new StringBuilder();
 for (String uidValue : uids5user) {
 if (bld5user.length()==0) {
 bld5user.append("'" + uidValue + "'");
 }else{
 bld5user.append(",'" + uidValue + "'");
 }
}
 result5user=bld5user.toString();
		}
		
		return result5user;
	}

	public  String createAttributes (List<Object[]> lo5user, List<User> result5user, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5user = null;
		   String idRec5user = null;
		   User uat = null;
		   List<Attribute> atlist5user = null;
		   String usersIdsLine5user = null;
		   
		  

			
			System.setProperty("Test5user0Init",
					"Test5user0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5user05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5user0Init.class/jcp.xml");
			
			
			System.setProperty("Test5user0ss5user0_0x",
					"Test5user0ss5user0_0xjcp.xml");
        	System.setProperty("Test5user0ss5user0_02",
					"Test5user0ss5user0_02xml.config");
			System.setProperty("Test5user0ss5user0_03",
					"Test5user0ss5user0_03.apache.xml.resource.security.");
		    System.setProperty("Test5user0ss5user0_04",
					"Test5user0ss5user0_04.resource.");
			System.setProperty("Test5user0ss5user0_05",
					"Test5user0ss5user0_05.isInitialized");
			System.setProperty("Test5user0ss5user0_06",
					"Test5user0ss5user0_06_5user0Init.class/jcp.xml");
			System.setProperty("Test5user0ss5user0_07",
					"Test5user0ss5user0_07t/resource/jcp.xml");
        	System.setProperty("Test5user0ss5user0_08",
					"Test5user0ss5user0_08.config");
			System.setProperty("Test5user0ss5user0_09",
					"Test5user0ss5user0_09.security.");
		    System.setProperty("Test5user0ss5user0_0x0",
					"Test5user0ss5user0_0x0jcp.xmlapache.");
			System.setProperty("Test5user0ss5user0_0xx0",
					"Test5user0ss5user0_0xx0.isInitialized");
			System.setProperty("Test5user0ss5user0_0xxx0",
					"Test5user0ss5user0_0xxx0est5user0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5user : lo5user) {

			// !!!
				// Проверить
				uid5user = objectArray5user[0].toString();

				idRec5user = objectArray5user[0].toString();

				uat = new User();
				atlist5user = new ArrayList<Attribute>();
				String name5user = null;
	
			for (int i = 0; i < objectArray5user.length; i++) {

				at = new Attribute();


				name5user = "USER_FIO5user";
				
			
			
				name5user = "USER_PHONE5user";
				
			
			
				name5user = "USER_EMAIL5user";
				
			
			
				name5user = "ORG_name5user5user";
				
			
	
				name5user = "USER_UID5user";
				
			
			
				name5user = "USER_LOGIN5user";
				
			
				
				name5user = "ORG_CODE_IOGV5user";
				
			
			
				name5user = "ORG_ADDRES5user";
				
			
			
				name5user = "ORG_PHONE5user";
				
			
			
				name5user = "ORG_Prr5user";
				
			
			
				name5user = "ORG_PffE5user";
				
			
			
				name5user = "ORG_PHggNE5user";
				
			
		
			
			
				name5user = "ORrr_PHONE5user";
				
			
			
				name5user = "ORyy_PHONE5user";
				
			
			
				name5user = "OddPHONE5user";
				
			
			
				name5user = "OffHONE5user";
				
			
			
				name5user = "DEP_name5user5user";
				
			
			
				name5user = "Off_PHONE5user";
				
			
			
				name5user = "ORl_PHONE5user";
				
			
			
				name5user = "OuuG_PHONE5user";
				
			
		
				name5user = "Ogff_PHONE5user";
				
			
			
				name5user = "USER_POSITION5user";
				
			
			
				name5user = "ORG_CODE_OKATO5user";
				
			
			
				name5user = "DEP_ADDRES5userS";
				
			name5user = "1USER_UID5user";
				
				name5user = "11USER_EMAIL5user";
			
				name5user = "12ORG_name5user5user";
			
				name5user = "212USER_LOGIN5user";
			
				name5user = "111USER_FIO5user";
			
			
				name5user = "132ORG_CODE_IOGV5user";
			
				name5user = "433ORG_PHggNE5user";
			
				name5user = "13Off_PHONE5user";
			
				name5user = "43ORG_ADDRES5user";
		
				name5user = "234ORG_PHONE5user";
		
				name5user = "55ORG_Prr5user";
			
				name5user = "432ORG_PffE5user";
			
				name5user = "ORl_PHONE5user";
			
				name5user = "46OddPHONE5user";
			
				name5user = "895OffHONE5user";
			
				name5user = "54OuuG_PHONE5user";
			
				name5user = "89Ogff_PHONE5user";
			
				name5user = "53ORrr_PHONE5user";
			
		
				name5user = "6678ORyy_PHONE5user";
			
				name5user = "543ORG_CODE_OKATO5user";
			
				name5user = "56DEP_ADDRES5userS";
			
				name5user = "890DEP_name5user5user";
			
				name5user = "700USER_POSITION5user";
				
				name5user = "54USER_UID5user";
				
				name5user = "780USER_EMAIL5user";
			
				name5user = "54ORG_name5user5user";
			
				name5user = "7890USER_LOGIN5user";
			
				name5user = "700USER_FIO5user";
			
			
				name5user = "654ORG_CODE_IOGV5user";
			
				name5user = "478ORG_PHggNE5user";
			
				name5user = "96Off_PHONE5user";
			
				name5user = "574ORG_ADDRES5user";
		
				name5user = "489ORG_PHONE5user";
		
				name5user = "065ORG_Prr5user";
			
				name5user = "457ORG_PffE5user";
			
				name5user = "87ORl_PHONE5user";
			
				name5user = "543OddPHONE5user";
			
				name5user = "478OffHONE5user";
			
				name5user = "965OuuG_PHONE5user";
			
				name5user = "457Ogff_PHONE5user";
			
				name5user = "8678ORrr_PHONE5user";
			
		
				name5user = "68ORyy_PHONE5user";
			
				name5user = "4ORG_CODE_OKATO5user";
			
				name5user = "778DEP_ADDRES5userS";
			
				name5user = "447DEP_name5user5user";
			
				name5user = "54USER_POSITION5user";

				if (name5user != null) {

					at.setName(name5user);
					at.setValue (objectArray5user[i] != null ? objectArray5user[i]
							.toString() : "");

					atlist5user.add(at);
				}
			}
			
			uat.setUid(uid5user);
			uat.setAttributes(atlist5user);

			result5user.add(uat); 
			resultIds.put(idRec5user, uat);

			if (usersIdsLine5user == null) {
				usersIdsLine5user = "'" + idRec5user + "'";
			} else {
				usersIdsLine5user = usersIdsLine5user + ", '" + idRec5user + "'";
			}
	       }
		   
		   return usersIdsLine5user ;
	}
}
