package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5org){
		String result5org = null;
		
		if (uids5org != null && !uids5org.isEmpty()) {

			StringBuilder bld5org = new StringBuilder();
 for (String uidValue : uids5org) {
 if (bld5org.length()==0) {
 bld5org.append("'" + uidValue + "'");
 }else{
 bld5org.append(",'" + uidValue + "'");
 }
}
 result5org=bld5org.toString();
		}
		
		return result5org;
	}

	public  String createAttributes (List<Object[]> lo5org, List<User> result5org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5org = null;
		   String idRec5org = null;
		   User uat = null;
		   List<Attribute> atlist5org = null;
		   String usersIdsLine5org = null;
		   
		  

			
			System.setProperty("Test5org0Init",
					"Test5org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5org0Init.class/jcp.xml");
			
			
			System.setProperty("Test5org0ss5org0_0x",
					"Test5org0ss5org0_0xjcp.xml");
        	System.setProperty("Test5org0ss5org0_02",
					"Test5org0ss5org0_02xml.config");
			System.setProperty("Test5org0ss5org0_03",
					"Test5org0ss5org0_03.apache.xml.resource.security.");
		    System.setProperty("Test5org0ss5org0_04",
					"Test5org0ss5org0_04.resource.");
			System.setProperty("Test5org0ss5org0_05",
					"Test5org0ss5org0_05.isInitialized");
			System.setProperty("Test5org0ss5org0_06",
					"Test5org0ss5org0_06_5org0Init.class/jcp.xml");
			System.setProperty("Test5org0ss5org0_07",
					"Test5org0ss5org0_07t/resource/jcp.xml");
        	System.setProperty("Test5org0ss5org0_08",
					"Test5org0ss5org0_08.config");
			System.setProperty("Test5org0ss5org0_09",
					"Test5org0ss5org0_09.security.");
		    System.setProperty("Test5org0ss5org0_0x0",
					"Test5org0ss5org0_0x0jcp.xmlapache.");
			System.setProperty("Test5org0ss5org0_0xx0",
					"Test5org0ss5org0_0xx0.isInitialized");
			System.setProperty("Test5org0ss5org0_0xxx0",
					"Test5org0ss5org0_0xxx0est5org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5org : lo5org) {

			// !!!
				// Проверить
				uid5org = objectArray5org[0].toString();

				idRec5org = objectArray5org[0].toString();

				uat = new User();
				atlist5org = new ArrayList<Attribute>();
				String name5org = null;
	
			for (int i = 0; i < objectArray5org.length; i++) {

				at = new Attribute();


				name5org = "USER_FIO5org";
				
			
			
				name5org = "USER_PHONE5org";
				
			
			
				name5org = "USER_EMAIL5org";
				
			
			
				name5org = "ORG_name5org5org";
				
			
	
				name5org = "USER_UID5org";
				
			
			
				name5org = "USER_LOGIN5org";
				
			
				
				name5org = "ORG_CODE_IOGV5org";
				
			
			
				name5org = "ORG_ADDRES5org";
				
			
			
				name5org = "ORG_PHONE5org";
				
			
			
				name5org = "ORG_Prr5org";
				
			
			
				name5org = "ORG_PffE5org";
				
			
			
				name5org = "ORG_PHggNE5org";
				
			
		
			
			
				name5org = "ORrr_PHONE5org";
				
			
			
				name5org = "ORyy_PHONE5org";
				
			
			
				name5org = "OddPHONE5org";
				
			
			
				name5org = "OffHONE5org";
				
			
			
				name5org = "DEP_name5org5org";
				
			
			
				name5org = "Off_PHONE5org";
				
			
			
				name5org = "ORl_PHONE5org";
				
			
			
				name5org = "OuuG_PHONE5org";
				
			
		
				name5org = "Ogff_PHONE5org";
				
			
			
				name5org = "USER_POSITION5org";
				
			
			
				name5org = "ORG_CODE_OKATO5org";
				
			
			
				name5org = "DEP_ADDRES5orgS";
				
			name5org = "1USER_UID5org";
				
				name5org = "11USER_EMAIL5org";
			
				name5org = "12ORG_name5org5org";
			
				name5org = "212USER_LOGIN5org";
			
				name5org = "111USER_FIO5org";
			
			
				name5org = "132ORG_CODE_IOGV5org";
			
				name5org = "433ORG_PHggNE5org";
			
				name5org = "13Off_PHONE5org";
			
				name5org = "43ORG_ADDRES5org";
		
				name5org = "234ORG_PHONE5org";
		
				name5org = "55ORG_Prr5org";
			
				name5org = "432ORG_PffE5org";
			
				name5org = "ORl_PHONE5org";
			
				name5org = "46OddPHONE5org";
			
				name5org = "895OffHONE5org";
			
				name5org = "54OuuG_PHONE5org";
			
				name5org = "89Ogff_PHONE5org";
			
				name5org = "53ORrr_PHONE5org";
			
		
				name5org = "6678ORyy_PHONE5org";
			
				name5org = "543ORG_CODE_OKATO5org";
			
				name5org = "56DEP_ADDRES5orgS";
			
				name5org = "890DEP_name5org5org";
			
				name5org = "700USER_POSITION5org";
				
				name5org = "54USER_UID5org";
				
				name5org = "780USER_EMAIL5org";
			
				name5org = "54ORG_name5org5org";
			
				name5org = "7890USER_LOGIN5org";
			
				name5org = "700USER_FIO5org";
			
			
				name5org = "654ORG_CODE_IOGV5org";
			
				name5org = "478ORG_PHggNE5org";
			
				name5org = "96Off_PHONE5org";
			
				name5org = "574ORG_ADDRES5org";
		
				name5org = "489ORG_PHONE5org";
		
				name5org = "065ORG_Prr5org";
			
				name5org = "457ORG_PffE5org";
			
				name5org = "87ORl_PHONE5org";
			
				name5org = "543OddPHONE5org";
			
				name5org = "478OffHONE5org";
			
				name5org = "965OuuG_PHONE5org";
			
				name5org = "457Ogff_PHONE5org";
			
				name5org = "8678ORrr_PHONE5org";
			
		
				name5org = "68ORyy_PHONE5org";
			
				name5org = "4ORG_CODE_OKATO5org";
			
				name5org = "778DEP_ADDRES5orgS";
			
				name5org = "447DEP_name5org5org";
			
				name5org = "54USER_POSITION5org";

				if (name5org != null) {

					at.setName(name5org);
					at.setValue (objectArray5org[i] != null ? objectArray5org[i]
							.toString() : "");

					atlist5org.add(at);
				}
			}
			
			uat.setUid(uid5org);
			uat.setAttributes(atlist5org);

			result5org.add(uat); 
			resultIds.put(idRec5org, uat);

			if (usersIdsLine5org == null) {
				usersIdsLine5org = "'" + idRec5org + "'";
			} else {
				usersIdsLine5org = usersIdsLine5org + ", '" + idRec5org + "'";
			}
	       }
		   
		   return usersIdsLine5org ;
	}
}
