package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6classif){
		String result6classif = null;
		
		if (uids6classif != null && !uids6classif.isEmpty()) {

			StringBuilder bld6classif = new StringBuilder();

			for (String uidValue : uids6classif) {

			  bld6classif.append(",'").append(uidValue).append("'");

			}

			result6classif=bld6classif.substring(1);
		}
		
		return result6classif;
	}

	public  String createAttributes (List<Object[]> lo6classif, List<User> result6classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6classif = null;
		   String idRec6classif = null;
		   User uat = null;
		   List<Attribute> atlist6classif = null;
		   String usersIdsLine6classif = null;
		   
		  

			
			System.setProperty("Test6classif0Init",
					"Test6classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test6classif0ss6classif0_0x",
					"Test6classif0ss6classif0_0xjcp.xml");
        	System.setProperty("Test6classif0ss6classif0_02",
					"Test6classif0ss6classif0_02xml.config");
			System.setProperty("Test6classif0ss6classif0_03",
					"Test6classif0ss6classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test6classif0ss6classif0_04",
					"Test6classif0ss6classif0_04.resource.");
			System.setProperty("Test6classif0ss6classif0_05",
					"Test6classif0ss6classif0_05.isInitialized");
			System.setProperty("Test6classif0ss6classif0_06",
					"Test6classif0ss6classif0_06_6classif0Init.class/jcp.xml");
			System.setProperty("Test6classif0ss6classif0_07",
					"Test6classif0ss6classif0_07t/resource/jcp.xml");
        	System.setProperty("Test6classif0ss6classif0_08",
					"Test6classif0ss6classif0_08.config");
			System.setProperty("Test6classif0ss6classif0_09",
					"Test6classif0ss6classif0_09.security.");
		    System.setProperty("Test6classif0ss6classif0_0x0",
					"Test6classif0ss6classif0_0x0jcp.xmlapache.");
			System.setProperty("Test6classif0ss6classif0_0xx0",
					"Test6classif0ss6classif0_0xx0.isInitialized");
			System.setProperty("Test6classif0ss6classif0_0xxx0",
					"Test6classif0ss6classif0_0xxx0est6classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6classif : lo6classif) {

			// !!!
				// Проверить
				uid6classif = objectArray6classif[0].toString();

				idRec6classif = objectArray6classif[0].toString();

				uat = new User();
				atlist6classif = new ArrayList<Attribute>();
				String name6classif = null;
	
			for (int i = 0; i < objectArray6classif.length; i++) {

				at = new Attribute();


				name6classif = "USER_FIO6classif";
				
			
			
				name6classif = "USER_PHONE6classif";
				
			
			
				name6classif = "USER_EMAIL6classif";
				
			
			
				name6classif = "ORG_name6classif6classif";
				
			
	
				name6classif = "USER_UID6classif";
				
			
			
				name6classif = "USER_LOGIN6classif";
				
			
				
				name6classif = "ORG_CODE_IOGV6classif";
				
			
			
				name6classif = "ORG_ADDRES6classif";
				
			
			
				name6classif = "ORG_PHONE6classif";
				
			
			
				name6classif = "ORG_Prr6classif";
				
			
			
				name6classif = "ORG_PffE6classif";
				
			
			
				name6classif = "ORG_PHggNE6classif";
				
			
		
			
			
				name6classif = "ORrr_PHONE6classif";
				
			
			
				name6classif = "ORyy_PHONE6classif";
				
			
			
				name6classif = "OddPHONE6classif";
				
			
			
				name6classif = "OffHONE6classif";
				
			
			
				name6classif = "DEP_name6classif6classif";
				
			
			
				name6classif = "Off_PHONE6classif";
				
			
			
				name6classif = "ORl_PHONE6classif";
				
			
			
				name6classif = "OuuG_PHONE6classif";
				
			
		
				name6classif = "Ogff_PHONE6classif";
				
			
			
				name6classif = "USER_POSITION6classif";
				
			
			
				name6classif = "ORG_CODE_OKATO6classif";
				
			
			
				name6classif = "DEP_ADDRES6classifS";
				

			name6classif = "1USER_UID6classif";
				
				name6classif = "11USER_EMAIL6classif";
			
				name6classif = "12ORG_name6classif6classif";
			
				name6classif = "212USER_LOGIN6classif";
			
				name6classif = "111USER_FIO6classif";
			
			
				name6classif = "132ORG_CODE_IOGV6classif";
			
				name6classif = "433ORG_PHggNE6classif";
			
				name6classif = "13Off_PHONE6classif";
			
				name6classif = "43ORG_ADDRES6classif";
		
				name6classif = "234ORG_PHONE6classif";
		
				name6classif = "55ORG_Prr6classif";
			
				name6classif = "432ORG_PffE6classif";
			
				name6classif = "ORl_PHONE6classif";
			
				name6classif = "46OddPHONE6classif";
			
				name6classif = "895OffHONE6classif";
			
				name6classif = "54OuuG_PHONE6classif";
			
				name6classif = "89Ogff_PHONE6classif";
			
				name6classif = "53ORrr_PHONE6classif";
			
		
				name6classif = "6678ORyy_PHONE6classif";
			
				name6classif = "543ORG_CODE_OKATO6classif";
			
				name6classif = "56DEP_ADDRES6classifS";
			
				name6classif = "890DEP_name6classif6classif";
			
				name6classif = "700USER_POSITION6classif";
				
				name6classif = "54USER_UID6classif";
				
				name6classif = "780USER_EMAIL6classif";
			
				name6classif = "54ORG_name6classif6classif";
			
				name6classif = "7890USER_LOGIN6classif";
			
				name6classif = "700USER_FIO6classif";
			
			
				name6classif = "654ORG_CODE_IOGV6classif";
			
				name6classif = "478ORG_PHggNE6classif";
			
				name6classif = "96Off_PHONE6classif";
			
				name6classif = "574ORG_ADDRES6classif";
		
				name6classif = "489ORG_PHONE6classif";
		
				name6classif = "065ORG_Prr6classif";
			
				name6classif = "457ORG_PffE6classif";
			
				name6classif = "87ORl_PHONE6classif";
			
				name6classif = "543OddPHONE6classif";
			
				name6classif = "478OffHONE6classif";
			
				name6classif = "965OuuG_PHONE6classif";
			
				name6classif = "457Ogff_PHONE6classif";
			
				name6classif = "8678ORrr_PHONE6classif";
			
		
				name6classif = "68ORyy_PHONE6classif";
			
				name6classif = "4ORG_CODE_OKATO6classif";
			
				name6classif = "778DEP_ADDRES6classifS";
			
				name6classif = "447DEP_name6classif6classif";
			
				name6classif = "54USER_POSITION6classif";
				
				if (name6classif != null) {

					at.setName(name6classif);
					at.setValue (objectArray6classif[i] != null ? objectArray6classif[i]
							.toString() : "");

					atlist6classif.add(at);
				}
			}
			
			uat.setUid(uid6classif);
			uat.setAttributes(atlist6classif);

			result6classif.add(uat); 
			resultIds.put(idRec6classif, uat);

			if (usersIdsLine6classif == null) {
				usersIdsLine6classif = "'" + idRec6classif + "'";
			} else {
				usersIdsLine6classif = usersIdsLine6classif + ", '" + idRec6classif + "'";
			}
	       }
		   
		   return usersIdsLine6classif ;
	}
}
