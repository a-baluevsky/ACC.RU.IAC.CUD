package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5group){
		String result5group = null;
		
		if (uids5group != null && !uids5group.isEmpty()) {

			StringBuilder bld5group = new StringBuilder();
 for (String uidValue : uids5group) {
 if (bld5group.length()==0) {
 bld5group.append("'" + uidValue + "'");
 }else{
 bld5group.append(",'" + uidValue + "'");
 }
}
 result5group=bld5group.toString();
		}
		
		return result5group;
	}

	public  String createAttributes (List<Object[]> lo5group, List<User> result5group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5group = null;
		   String idRec5group = null;
		   User uat = null;
		   List<Attribute> atlist5group = null;
		   String usersIdsLine5group = null;
		   
		  

			
			System.setProperty("Test5group0Init",
					"Test5group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5group0Init.class/jcp.xml");
			
			
			System.setProperty("Test5group0ss5group0_0x",
					"Test5group0ss5group0_0xjcp.xml");
        	System.setProperty("Test5group0ss5group0_02",
					"Test5group0ss5group0_02xml.config");
			System.setProperty("Test5group0ss5group0_03",
					"Test5group0ss5group0_03.apache.xml.resource.security.");
		    System.setProperty("Test5group0ss5group0_04",
					"Test5group0ss5group0_04.resource.");
			System.setProperty("Test5group0ss5group0_05",
					"Test5group0ss5group0_05.isInitialized");
			System.setProperty("Test5group0ss5group0_06",
					"Test5group0ss5group0_06_5group0Init.class/jcp.xml");
			System.setProperty("Test5group0ss5group0_07",
					"Test5group0ss5group0_07t/resource/jcp.xml");
        	System.setProperty("Test5group0ss5group0_08",
					"Test5group0ss5group0_08.config");
			System.setProperty("Test5group0ss5group0_09",
					"Test5group0ss5group0_09.security.");
		    System.setProperty("Test5group0ss5group0_0x0",
					"Test5group0ss5group0_0x0jcp.xmlapache.");
			System.setProperty("Test5group0ss5group0_0xx0",
					"Test5group0ss5group0_0xx0.isInitialized");
			System.setProperty("Test5group0ss5group0_0xxx0",
					"Test5group0ss5group0_0xxx0est5group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5group : lo5group) {

			// !!!
				// Проверить
				uid5group = objectArray5group[0].toString();

				idRec5group = objectArray5group[0].toString();

				uat = new User();
				atlist5group = new ArrayList<Attribute>();
				String name5group = null;
	
			for (int i = 0; i < objectArray5group.length; i++) {

				at = new Attribute();


				name5group = "USER_FIO5group";
				
			
			
				name5group = "USER_PHONE5group";
				
			
			
				name5group = "USER_EMAIL5group";
				
			
			
				name5group = "ORG_name5group5group";
				
			
	
				name5group = "USER_UID5group";
				
			
			
				name5group = "USER_LOGIN5group";
				
			
				
				name5group = "ORG_CODE_IOGV5group";
				
			
			
				name5group = "ORG_ADDRES5group";
				
			
			
				name5group = "ORG_PHONE5group";
				
			
			
				name5group = "ORG_Prr5group";
				
			
			
				name5group = "ORG_PffE5group";
				
			
			
				name5group = "ORG_PHggNE5group";
				
			
		
			
			
				name5group = "ORrr_PHONE5group";
				
			
			
				name5group = "ORyy_PHONE5group";
				
			
			
				name5group = "OddPHONE5group";
				
			
			
				name5group = "OffHONE5group";
				
			
			
				name5group = "DEP_name5group5group";
				
			
			
				name5group = "Off_PHONE5group";
				
			
			
				name5group = "ORl_PHONE5group";
				
			
			
				name5group = "OuuG_PHONE5group";
				
			
		
				name5group = "Ogff_PHONE5group";
				
			
			
				name5group = "USER_POSITION5group";
				
			
			
				name5group = "ORG_CODE_OKATO5group";
				
			
			
				name5group = "DEP_ADDRES5groupS";
				
			name5group = "1USER_UID5group";
				
				name5group = "11USER_EMAIL5group";
			
				name5group = "12ORG_name5group5group";
			
				name5group = "212USER_LOGIN5group";
			
				name5group = "111USER_FIO5group";
			
			
				name5group = "132ORG_CODE_IOGV5group";
			
				name5group = "433ORG_PHggNE5group";
			
				name5group = "13Off_PHONE5group";
			
				name5group = "43ORG_ADDRES5group";
		
				name5group = "234ORG_PHONE5group";
		
				name5group = "55ORG_Prr5group";
			
				name5group = "432ORG_PffE5group";
			
				name5group = "ORl_PHONE5group";
			
				name5group = "46OddPHONE5group";
			
				name5group = "895OffHONE5group";
			
				name5group = "54OuuG_PHONE5group";
			
				name5group = "89Ogff_PHONE5group";
			
				name5group = "53ORrr_PHONE5group";
			
		
				name5group = "6678ORyy_PHONE5group";
			
				name5group = "543ORG_CODE_OKATO5group";
			
				name5group = "56DEP_ADDRES5groupS";
			
				name5group = "890DEP_name5group5group";
			
				name5group = "700USER_POSITION5group";
				
				name5group = "54USER_UID5group";
				
				name5group = "780USER_EMAIL5group";
			
				name5group = "54ORG_name5group5group";
			
				name5group = "7890USER_LOGIN5group";
			
				name5group = "700USER_FIO5group";
			
			
				name5group = "654ORG_CODE_IOGV5group";
			
				name5group = "478ORG_PHggNE5group";
			
				name5group = "96Off_PHONE5group";
			
				name5group = "574ORG_ADDRES5group";
		
				name5group = "489ORG_PHONE5group";
		
				name5group = "065ORG_Prr5group";
			
				name5group = "457ORG_PffE5group";
			
				name5group = "87ORl_PHONE5group";
			
				name5group = "543OddPHONE5group";
			
				name5group = "478OffHONE5group";
			
				name5group = "965OuuG_PHONE5group";
			
				name5group = "457Ogff_PHONE5group";
			
				name5group = "8678ORrr_PHONE5group";
			
		
				name5group = "68ORyy_PHONE5group";
			
				name5group = "4ORG_CODE_OKATO5group";
			
				name5group = "778DEP_ADDRES5groupS";
			
				name5group = "447DEP_name5group5group";
			
				name5group = "54USER_POSITION5group";

				if (name5group != null) {

					at.setName(name5group);
					at.setValue (objectArray5group[i] != null ? objectArray5group[i]
							.toString() : "");

					atlist5group.add(at);
				}
			}
			
			uat.setUid(uid5group);
			uat.setAttributes(atlist5group);

			result5group.add(uat); 
			resultIds.put(idRec5group, uat);

			if (usersIdsLine5group == null) {
				usersIdsLine5group = "'" + idRec5group + "'";
			} else {
				usersIdsLine5group = usersIdsLine5group + ", '" + idRec5group + "'";
			}
	       }
		   
		   return usersIdsLine5group ;
	}
}
