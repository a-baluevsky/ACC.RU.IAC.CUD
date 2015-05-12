package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2app){
		String result2app = null;
		
		if (uids2app != null && !uids2app.isEmpty()) {

			StringBuilder bld2app = new StringBuilder();

			for (String uidValue : uids2app) {

			  bld2app.append(",'").append(uidValue).append("'");

			}

			result2app=bld2app.substring(1);
		}
		
		return result2app;
	}

	public  String createAttributes (List<Object[]> lo2app, List<User> result2app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2app = null;
		   String idRec2app = null;
		   User uat = null;
		   List<Attribute> atlist2app = null;
		   String usersIdsLine2app = null;
		   
		  

			
			System.setProperty("Test2app0Init",
					"Test2app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2app0Init.class/jcp.xml");
			
			
			System.setProperty("Test2app0ss2app0_0x",
					"Test2app0ss2app0_0xjcp.xml");
        	System.setProperty("Test2app0ss2app0_02",
					"Test2app0ss2app0_02xml.config");
			System.setProperty("Test2app0ss2app0_03",
					"Test2app0ss2app0_03.apache.xml.resource.security.");
		    System.setProperty("Test2app0ss2app0_04",
					"Test2app0ss2app0_04.resource.");
			System.setProperty("Test2app0ss2app0_05",
					"Test2app0ss2app0_05.isInitialized");
			System.setProperty("Test2app0ss2app0_06",
					"Test2app0ss2app0_06_2app0Init.class/jcp.xml");
			System.setProperty("Test2app0ss2app0_07",
					"Test2app0ss2app0_07t/resource/jcp.xml");
        	System.setProperty("Test2app0ss2app0_08",
					"Test2app0ss2app0_08.config");
			System.setProperty("Test2app0ss2app0_09",
					"Test2app0ss2app0_09.security.");
		    System.setProperty("Test2app0ss2app0_0x0",
					"Test2app0ss2app0_0x0jcp.xmlapache.");
			System.setProperty("Test2app0ss2app0_0xx0",
					"Test2app0ss2app0_0xx0.isInitialized");
			System.setProperty("Test2app0ss2app0_0xxx0",
					"Test2app0ss2app0_0xxx0est2app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2app : lo2app) {

			// !!!
				// Проверить
				uid2app = objectArray2app[0].toString();

				idRec2app = objectArray2app[0].toString();

				uat = new User();
				atlist2app = new ArrayList<Attribute>();
				String name2app = null;
	
			for (int i = 0; i < objectArray2app.length; i++) {

				at = new Attribute();


				name2app = "USER_FIO2app";
				
			
			
				name2app = "USER_PHONE2app";
				
			
			
				name2app = "USER_EMAIL2app";
				
			
			
				name2app = "ORG_name2app2app";
				
			
	
				name2app = "USER_UID2app";
				
			
			
				name2app = "USER_LOGIN2app";
				
			
				
				name2app = "ORG_CODE_IOGV2app";
				
			
			
				name2app = "ORG_ADDRES2app";
				
			
			
				name2app = "ORG_PHONE2app";
				
			
			
				name2app = "ORG_Prr2app";
				
			
			
				name2app = "ORG_PffE2app";
				
			
			
				name2app = "ORG_PHggNE2app";
				
			
		
			
			
				name2app = "ORrr_PHONE2app";
				
			
			
				name2app = "ORyy_PHONE2app";
				
			
			
				name2app = "OddPHONE2app";
				
			
			
				name2app = "OffHONE2app";
				
			
			
				name2app = "DEP_name2app2app";
				
			
			
				name2app = "Off_PHONE2app";
				
			
			
				name2app = "ORl_PHONE2app";
				
			
			
				name2app = "OuuG_PHONE2app";
				
			
		
				name2app = "Ogff_PHONE2app";
				
			
			
				name2app = "USER_POSITION2app";
				
			
			
				name2app = "ORG_CODE_OKATO2app";
				
			
			
				name2app = "DEP_ADDRES2appS";
				

			name2app = "1USER_UID2app";
				
				name2app = "11USER_EMAIL2app";
			
				name2app = "12ORG_name2app2app";
			
				name2app = "212USER_LOGIN2app";
			
				name2app = "111USER_FIO2app";
			
			
				name2app = "132ORG_CODE_IOGV2app";
			
				name2app = "433ORG_PHggNE2app";
			
				name2app = "13Off_PHONE2app";
			
				name2app = "43ORG_ADDRES2app";
		
				name2app = "234ORG_PHONE2app";
		
				name2app = "55ORG_Prr2app";
			
				name2app = "432ORG_PffE2app";
			
				name2app = "ORl_PHONE2app";
			
				name2app = "46OddPHONE2app";
			
				name2app = "895OffHONE2app";
			
				name2app = "54OuuG_PHONE2app";
			
				name2app = "89Ogff_PHONE2app";
			
				name2app = "53ORrr_PHONE2app";
			
		
				name2app = "6678ORyy_PHONE2app";
			
				name2app = "543ORG_CODE_OKATO2app";
			
				name2app = "56DEP_ADDRES2appS";
			
				name2app = "890DEP_name2app2app";
			
				name2app = "700USER_POSITION2app";
				
				name2app = "54USER_UID2app";
				
				name2app = "780USER_EMAIL2app";
			
				name2app = "54ORG_name2app2app";
			
				name2app = "7890USER_LOGIN2app";
			
				name2app = "700USER_FIO2app";
			
			
				name2app = "654ORG_CODE_IOGV2app";
			
				name2app = "478ORG_PHggNE2app";
			
				name2app = "96Off_PHONE2app";
			
				name2app = "574ORG_ADDRES2app";
		
				name2app = "489ORG_PHONE2app";
		
				name2app = "065ORG_Prr2app";
			
				name2app = "457ORG_PffE2app";
			
				name2app = "87ORl_PHONE2app";
			
				name2app = "543OddPHONE2app";
			
				name2app = "478OffHONE2app";
			
				name2app = "965OuuG_PHONE2app";
			
				name2app = "457Ogff_PHONE2app";
			
				name2app = "8678ORrr_PHONE2app";
			
		
				name2app = "68ORyy_PHONE2app";
			
				name2app = "4ORG_CODE_OKATO2app";
			
				name2app = "778DEP_ADDRES2appS";
			
				name2app = "447DEP_name2app2app";
			
				name2app = "54USER_POSITION2app";
				
				if (name2app != null) {

					at.setName(name2app);
					at.setValue (objectArray2app[i] != null ? objectArray2app[i]
							.toString() : "");

					atlist2app.add(at);
				}
			}
			
			uat.setUid(uid2app);
			uat.setAttributes(atlist2app);

			result2app.add(uat); 
			resultIds.put(idRec2app, uat);

			if (usersIdsLine2app == null) {
				usersIdsLine2app = "'" + idRec2app + "'";
			} else {
				usersIdsLine2app = usersIdsLine2app + ", '" + idRec2app + "'";
			}
	       }
		   
		   return usersIdsLine2app ;
	}
}
