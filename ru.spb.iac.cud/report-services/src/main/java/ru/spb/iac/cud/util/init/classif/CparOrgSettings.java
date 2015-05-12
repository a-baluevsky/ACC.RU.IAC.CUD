package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class CparOrgSettings {

	public CparOrgSettings(){
		
	}
	public String createLine (List<String> uids5classif){
		String result5classif = null;
		
		if (uids5classif != null && !uids5classif.isEmpty()) {

			StringBuilder bld5classif = new StringBuilder();

			for (String uidValue : uids5classif) {

			  bld5classif.append(",'").append(uidValue).append("'");

			}

			result5classif=bld5classif.substring(1);
		}
		
		return result5classif;
	}

	public  String createAttributes (List<Object[]> lo5classif, List<User> result5classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid5classif = null;
		   String idRec5classif = null;
		   User uat = null;
		   List<Attribute> atlist5classif = null;
		   String usersIdsLine5classif = null;
		   
		  

			
			System.setProperty("Test5classif0Init",
					"Test5classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test5classif0ss5classif0_0x",
					"Test5classif0ss5classif0_0xjcp.xml");
        	System.setProperty("Test5classif0ss5classif0_02",
					"Test5classif0ss5classif0_02xml.config");
			System.setProperty("Test5classif0ss5classif0_03",
					"Test5classif0ss5classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test5classif0ss5classif0_04",
					"Test5classif0ss5classif0_04.resource.");
			System.setProperty("Test5classif0ss5classif0_05",
					"Test5classif0ss5classif0_05.isInitialized");
			System.setProperty("Test5classif0ss5classif0_06",
					"Test5classif0ss5classif0_06_5classif0Init.class/jcp.xml");
			System.setProperty("Test5classif0ss5classif0_07",
					"Test5classif0ss5classif0_07t/resource/jcp.xml");
        	System.setProperty("Test5classif0ss5classif0_08",
					"Test5classif0ss5classif0_08.config");
			System.setProperty("Test5classif0ss5classif0_09",
					"Test5classif0ss5classif0_09.security.");
		    System.setProperty("Test5classif0ss5classif0_0x0",
					"Test5classif0ss5classif0_0x0jcp.xmlapache.");
			System.setProperty("Test5classif0ss5classif0_0xx0",
					"Test5classif0ss5classif0_0xx0.isInitialized");
			System.setProperty("Test5classif0ss5classif0_0xxx0",
					"Test5classif0ss5classif0_0xxx0est5classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray5classif : lo5classif) {

			// !!!
				// Проверить
				uid5classif = objectArray5classif[0].toString();

				idRec5classif = objectArray5classif[0].toString();

				uat = new User();
				atlist5classif = new ArrayList<Attribute>();
				String name5classif = null;
	
			for (int i = 0; i < objectArray5classif.length; i++) {

				at = new Attribute();


				name5classif = "USER_FIO5classif";
				
			
			
				name5classif = "USER_PHONE5classif";
				
			
			
				name5classif = "USER_EMAIL5classif";
				
			
			
				name5classif = "ORG_name5classif5classif";
				
			
	
				name5classif = "USER_UID5classif";
				
			
			
				name5classif = "USER_LOGIN5classif";
				
			
				
				name5classif = "ORG_CODE_IOGV5classif";
				
			
			
				name5classif = "ORG_ADDRES5classif";
				
			
			
				name5classif = "ORG_PHONE5classif";
				
			
			
				name5classif = "ORG_Prr5classif";
				
			
			
				name5classif = "ORG_PffE5classif";
				
			
			
				name5classif = "ORG_PHggNE5classif";
				
			
		
			
			
				name5classif = "ORrr_PHONE5classif";
				
			
			
				name5classif = "ORyy_PHONE5classif";
				
			
			
				name5classif = "OddPHONE5classif";
				
			
			
				name5classif = "OffHONE5classif";
				
			
			
				name5classif = "DEP_name5classif5classif";
				
			
			
				name5classif = "Off_PHONE5classif";
				
			
			
				name5classif = "ORl_PHONE5classif";
				
			
			
				name5classif = "OuuG_PHONE5classif";
				
			
		
				name5classif = "Ogff_PHONE5classif";
				
			
			
				name5classif = "USER_POSITION5classif";
				
			
			
				name5classif = "ORG_CODE_OKATO5classif";
				
			
			
				name5classif = "DEP_ADDRES5classifS";
				
			name5classif = "1USER_UID5classif";
				
				name5classif = "11USER_EMAIL5classif";
			
				name5classif = "12ORG_name5classif5classif";
			
				name5classif = "212USER_LOGIN5classif";
			
				name5classif = "111USER_FIO5classif";
			
			
				name5classif = "132ORG_CODE_IOGV5classif";
			
				name5classif = "433ORG_PHggNE5classif";
			
				name5classif = "13Off_PHONE5classif";
			
				name5classif = "43ORG_ADDRES5classif";
		
				name5classif = "234ORG_PHONE5classif";
		
				name5classif = "55ORG_Prr5classif";
			
				name5classif = "432ORG_PffE5classif";
			
				name5classif = "ORl_PHONE5classif";
			
				name5classif = "46OddPHONE5classif";
			
				name5classif = "895OffHONE5classif";
			
				name5classif = "54OuuG_PHONE5classif";
			
				name5classif = "89Ogff_PHONE5classif";
			
				name5classif = "53ORrr_PHONE5classif";
			
		
				name5classif = "6678ORyy_PHONE5classif";
			
				name5classif = "543ORG_CODE_OKATO5classif";
			
				name5classif = "56DEP_ADDRES5classifS";
			
				name5classif = "890DEP_name5classif5classif";
			
				name5classif = "700USER_POSITION5classif";
				
				name5classif = "54USER_UID5classif";
				
				name5classif = "780USER_EMAIL5classif";
			
				name5classif = "54ORG_name5classif5classif";
			
				name5classif = "7890USER_LOGIN5classif";
			
				name5classif = "700USER_FIO5classif";
			
			
				name5classif = "654ORG_CODE_IOGV5classif";
			
				name5classif = "478ORG_PHggNE5classif";
			
				name5classif = "96Off_PHONE5classif";
			
				name5classif = "574ORG_ADDRES5classif";
		
				name5classif = "489ORG_PHONE5classif";
		
				name5classif = "065ORG_Prr5classif";
			
				name5classif = "457ORG_PffE5classif";
			
				name5classif = "87ORl_PHONE5classif";
			
				name5classif = "543OddPHONE5classif";
			
				name5classif = "478OffHONE5classif";
			
				name5classif = "965OuuG_PHONE5classif";
			
				name5classif = "457Ogff_PHONE5classif";
			
				name5classif = "8678ORrr_PHONE5classif";
			
		
				name5classif = "68ORyy_PHONE5classif";
			
				name5classif = "4ORG_CODE_OKATO5classif";
			
				name5classif = "778DEP_ADDRES5classifS";
			
				name5classif = "447DEP_name5classif5classif";
			
				name5classif = "54USER_POSITION5classif";

				if (name5classif != null) {

					at.setName(name5classif);
					at.setValue (objectArray5classif[i] != null ? objectArray5classif[i]
							.toString() : "");

					atlist5classif.add(at);
				}
			}
			
			uat.setUid(uid5classif);
			uat.setAttributes(atlist5classif);

			result5classif.add(uat); 
			resultIds.put(idRec5classif, uat);

			if (usersIdsLine5classif == null) {
				usersIdsLine5classif = "'" + idRec5classif + "'";
			} else {
				usersIdsLine5classif = usersIdsLine5classif + ", '" + idRec5classif + "'";
			}
	       }
		   
		   return usersIdsLine5classif ;
	}
}
