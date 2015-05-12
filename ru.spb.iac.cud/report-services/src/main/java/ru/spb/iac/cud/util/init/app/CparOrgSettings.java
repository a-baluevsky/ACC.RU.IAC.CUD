package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5app){
		String result5app = null;
		
		if (uids5app != null && !uids5app.isEmpty()) {

			StringBuilder bld5app = new StringBuilder();
 for (String uidValue : uids5app) {
 if (bld5app.length()==0) {
 bld5app.append("'" + uidValue + "'");
 }else{
 bld5app.append(",'" + uidValue + "'");
 }
}
 result5app=bld5app.toString();
		}
		
		return result5app;
	}

	public  String createAttributes (List<Object[]> lo5app, List<User> result5app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5app = null;
		   String idRec5app = null;
		   User uat = null;
		   List<Attribute> atlist5app = null;
		   String usersIdsLine5app = null;
		   
		  

			
			System.setProperty("Test5app0Init",
					"Test5app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5app0Init.class/jcp.xml");
			
			
			System.setProperty("Test5app0ss5app0_0x",
					"Test5app0ss5app0_0xjcp.xml");
        	System.setProperty("Test5app0ss5app0_02",
					"Test5app0ss5app0_02xml.config");
			System.setProperty("Test5app0ss5app0_03",
					"Test5app0ss5app0_03.apache.xml.resource.security.");
		    System.setProperty("Test5app0ss5app0_04",
					"Test5app0ss5app0_04.resource.");
			System.setProperty("Test5app0ss5app0_05",
					"Test5app0ss5app0_05.isInitialized");
			System.setProperty("Test5app0ss5app0_06",
					"Test5app0ss5app0_06_5app0Init.class/jcp.xml");
			System.setProperty("Test5app0ss5app0_07",
					"Test5app0ss5app0_07t/resource/jcp.xml");
        	System.setProperty("Test5app0ss5app0_08",
					"Test5app0ss5app0_08.config");
			System.setProperty("Test5app0ss5app0_09",
					"Test5app0ss5app0_09.security.");
		    System.setProperty("Test5app0ss5app0_0x0",
					"Test5app0ss5app0_0x0jcp.xmlapache.");
			System.setProperty("Test5app0ss5app0_0xx0",
					"Test5app0ss5app0_0xx0.isInitialized");
			System.setProperty("Test5app0ss5app0_0xxx0",
					"Test5app0ss5app0_0xxx0est5app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5app : lo5app) {

			// !!!
				// Проверить
				uid5app = objectArray5app[0].toString();

				idRec5app = objectArray5app[0].toString();

				uat = new User();
				atlist5app = new ArrayList<Attribute>();
				String name5app = null;
	
			for (int i = 0; i < objectArray5app.length; i++) {

				at = new Attribute();


				name5app = "USER_FIO5app";
				
			
			
				name5app = "USER_PHONE5app";
				
			
			
				name5app = "USER_EMAIL5app";
				
			
			
				name5app = "ORG_name5app5app";
				
			
	
				name5app = "USER_UID5app";
				
			
			
				name5app = "USER_LOGIN5app";
				
			
				
				name5app = "ORG_CODE_IOGV5app";
				
			
			
				name5app = "ORG_ADDRES5app";
				
			
			
				name5app = "ORG_PHONE5app";
				
			
			
				name5app = "ORG_Prr5app";
				
			
			
				name5app = "ORG_PffE5app";
				
			
			
				name5app = "ORG_PHggNE5app";
				
			
		
			
			
				name5app = "ORrr_PHONE5app";
				
			
			
				name5app = "ORyy_PHONE5app";
				
			
			
				name5app = "OddPHONE5app";
				
			
			
				name5app = "OffHONE5app";
				
			
			
				name5app = "DEP_name5app5app";
				
			
			
				name5app = "Off_PHONE5app";
				
			
			
				name5app = "ORl_PHONE5app";
				
			
			
				name5app = "OuuG_PHONE5app";
				
			
		
				name5app = "Ogff_PHONE5app";
				
			
			
				name5app = "USER_POSITION5app";
				
			
			
				name5app = "ORG_CODE_OKATO5app";
				
			
			
				name5app = "DEP_ADDRES5appS";
				
			name5app = "1USER_UID5app";
				
				name5app = "11USER_EMAIL5app";
			
				name5app = "12ORG_name5app5app";
			
				name5app = "212USER_LOGIN5app";
			
				name5app = "111USER_FIO5app";
			
			
				name5app = "132ORG_CODE_IOGV5app";
			
				name5app = "433ORG_PHggNE5app";
			
				name5app = "13Off_PHONE5app";
			
				name5app = "43ORG_ADDRES5app";
		
				name5app = "234ORG_PHONE5app";
		
				name5app = "55ORG_Prr5app";
			
				name5app = "432ORG_PffE5app";
			
				name5app = "ORl_PHONE5app";
			
				name5app = "46OddPHONE5app";
			
				name5app = "895OffHONE5app";
			
				name5app = "54OuuG_PHONE5app";
			
				name5app = "89Ogff_PHONE5app";
			
				name5app = "53ORrr_PHONE5app";
			
		
				name5app = "6678ORyy_PHONE5app";
			
				name5app = "543ORG_CODE_OKATO5app";
			
				name5app = "56DEP_ADDRES5appS";
			
				name5app = "890DEP_name5app5app";
			
				name5app = "700USER_POSITION5app";
				
				name5app = "54USER_UID5app";
				
				name5app = "780USER_EMAIL5app";
			
				name5app = "54ORG_name5app5app";
			
				name5app = "7890USER_LOGIN5app";
			
				name5app = "700USER_FIO5app";
			
			
				name5app = "654ORG_CODE_IOGV5app";
			
				name5app = "478ORG_PHggNE5app";
			
				name5app = "96Off_PHONE5app";
			
				name5app = "574ORG_ADDRES5app";
		
				name5app = "489ORG_PHONE5app";
		
				name5app = "065ORG_Prr5app";
			
				name5app = "457ORG_PffE5app";
			
				name5app = "87ORl_PHONE5app";
			
				name5app = "543OddPHONE5app";
			
				name5app = "478OffHONE5app";
			
				name5app = "965OuuG_PHONE5app";
			
				name5app = "457Ogff_PHONE5app";
			
				name5app = "8678ORrr_PHONE5app";
			
		
				name5app = "68ORyy_PHONE5app";
			
				name5app = "4ORG_CODE_OKATO5app";
			
				name5app = "778DEP_ADDRES5appS";
			
				name5app = "447DEP_name5app5app";
			
				name5app = "54USER_POSITION5app";

				if (name5app != null) {

					at.setName(name5app);
					at.setValue (objectArray5app[i] != null ? objectArray5app[i]
							.toString() : "");

					atlist5app.add(at);
				}
			}
			
			uat.setUid(uid5app);
			uat.setAttributes(atlist5app);

			result5app.add(uat); 
			resultIds.put(idRec5app, uat);

			if (usersIdsLine5app == null) {
				usersIdsLine5app = "'" + idRec5app + "'";
			} else {
				usersIdsLine5app = usersIdsLine5app + ", '" + idRec5app + "'";
			}
	       }
		   
		   return usersIdsLine5app ;
	}
}
