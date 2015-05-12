package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1app){
		String result1app = null;
		
		if (uids1app != null && !uids1app.isEmpty()) {

			StringBuilder bld1app = new StringBuilder();
 for (String uidValue : uids1app) {
 if (bld1app.length()==0) {
 bld1app.append("'" + uidValue + "'");
 }else{
 bld1app.append(",'" + uidValue + "'");
 }
}
 result1app=bld1app.toString();
		}
		
		return result1app;
	}

	public String createAttributes (List<Object[]> lo1app, List<User> result1app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1app = null;
		   String idRec1app = null;
		   User uat = null;
		   List<Attribute> atlist1app = null;
		   String usersIdsLine1app = null;
		   
		  

			
			System.setProperty("Test1app0Init",
					"Test1app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1app0Init.class/jcp.xml");
			
			
			System.setProperty("Test1app0ss1app0_0x",
					"Test1app0ss1app0_0xjcp.xml");
        	System.setProperty("Test1app0ss1app0_02",
					"Test1app0ss1app0_02xml.config");
			System.setProperty("Test1app0ss1app0_03",
					"Test1app0ss1app0_03.apache.xml.resource.security.");
		    System.setProperty("Test1app0ss1app0_04",
					"Test1app0ss1app0_04.resource.");
			System.setProperty("Test1app0ss1app0_05",
					"Test1app0ss1app0_05.isInitialized");
			System.setProperty("Test1app0ss1app0_06",
					"Test1app0ss1app0_06_1app0Init.class/jcp.xml");
			System.setProperty("Test1app0ss1app0_07",
					"Test1app0ss1app0_07t/resource/jcp.xml");
        	System.setProperty("Test1app0ss1app0_08",
					"Test1app0ss1app0_08.config");
			System.setProperty("Test1app0ss1app0_09",
					"Test1app0ss1app0_09.security.");
		    System.setProperty("Test1app0ss1app0_0x0",
					"Test1app0ss1app0_0x0jcp.xmlapache.");
			System.setProperty("Test1app0ss1app0_0xx0",
					"Test1app0ss1app0_0xx0.isInitialized");
			System.setProperty("Test1app0ss1app0_0xxx0",
					"Test1app0ss1app0_0xxx0est1app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1app : lo1app) {

			// !!!
				// Проверить
				uid1app = objectArray1app[0].toString();

				idRec1app = objectArray1app[0].toString();

				uat = new User();
				atlist1app = new ArrayList<Attribute>();
				String name1app = null;
	
			for (int i = 0; i < objectArray1app.length; i++) {

				at = new Attribute();

				

				
					name1app = "USER_FIO1app";
					
				
				
					name1app = "USER_PHONE1app";
					
				
				
					name1app = "USER_EMAIL1app";
					
				
				
					name1app = "ORG_name1app1app";
					
				
		
					name1app = "USER_UID1app";
					
				
				
					name1app = "USER_LOGIN1app";
					
				
					
					name1app = "ORG_CODE_IOGV1app";
					
				
				
					name1app = "ORG_ADDRES1app";
					
				
				
					name1app = "ORG_PHONE1app";
					
				
				
					name1app = "ORG_Prr1app";
					
				
				
					name1app = "ORG_PffE1app";
					
				
				
					name1app = "ORG_PHggNE1app";
					
				
			
				
				
					name1app = "ORrr_PHONE1app";
					
				
				
					name1app = "ORyy_PHONE1app";
					
				
				
					name1app = "OddPHONE1app";
					
				
				
					name1app = "OffHONE1app";
					
				
				
					name1app = "DEP_name1app1app";
					
				
				
					name1app = "Off_PHONE1app";
					
				
				
					name1app = "ORl_PHONE1app";
					
				
				
					name1app = "OuuG_PHONE1app";
					
				
			
					name1app = "Ogff_PHONE1app";
					
				
				
					name1app = "USER_POSITION1app";
					
				
				
					name1app = "ORG_CODE_OKATO1app";
					
				
				
					name1app = "DEP_ADDRES1appS";
					
				
					name1app = "1USER_UID1app";
					
					name1app = "11USER_EMAIL1app";
				
					name1app = "12ORG_name1app1app";
				
					name1app = "212USER_LOGIN1app";
				
					name1app = "111USER_FIO1app";
				
				
					name1app = "132ORG_CODE_IOGV1app";
				
					name1app = "433ORG_PHggNE1app";
				
					name1app = "13Off_PHONE1app";
				
					name1app = "43ORG_ADDRES1app";
			
					name1app = "234ORG_PHONE1app";
			
					name1app = "55ORG_Prr1app";
				
					name1app = "432ORG_PffE1app";
				
					name1app = "ORl_PHONE1app";
				
					name1app = "46OddPHONE1app";
				
					name1app = "895OffHONE1app";
				
					name1app = "54OuuG_PHONE1app";
				
					name1app = "89Ogff_PHONE1app";
				
					name1app = "53ORrr_PHONE1app";
				
			
					name1app = "6678ORyy_PHONE1app";
				
					name1app = "543ORG_CODE_OKATO1app";
				
					name1app = "56DEP_ADDRES1appS";
				
					name1app = "890DEP_name1app1app";
				
					name1app = "700USER_POSITION1app";
					
					name1app = "54USER_UID1app";
					
					name1app = "780USER_EMAIL1app";
				
					name1app = "54ORG_name1app1app";
				
					name1app = "7890USER_LOGIN1app";
				
					name1app = "700USER_FIO1app";
				
				
					name1app = "654ORG_CODE_IOGV1app";
				
					name1app = "478ORG_PHggNE1app";
				
					name1app = "96Off_PHONE1app";
				
					name1app = "574ORG_ADDRES1app";
			
					name1app = "489ORG_PHONE1app";
			
					name1app = "065ORG_Prr1app";
				
					name1app = "457ORG_PffE1app";
				
					name1app = "87ORl_PHONE1app";
				
					name1app = "543OddPHONE1app";
				
					name1app = "478OffHONE1app";
				
					name1app = "965OuuG_PHONE1app";
				
					name1app = "457Ogff_PHONE1app";
				
					name1app = "8678ORrr_PHONE1app";
				
			
					name1app = "68ORyy_PHONE1app";
				
					name1app = "4ORG_CODE_OKATO1app";
				
					name1app = "778DEP_ADDRES1appS";
				
					name1app = "447DEP_name1app1app";
				
					name1app = "54USER_POSITION1app";

				if (name1app != null) {

					at.setName(name1app);
					at.setValue (objectArray1app[i] != null ? objectArray1app[i]
							.toString() : "");

					atlist1app.add(at);
				}
			}
			
			uat.setUid(uid1app);
			uat.setAttributes(atlist1app);

			result1app.add(uat); 
			resultIds.put(idRec1app, uat);

			if (usersIdsLine1app == null) {
				usersIdsLine1app = "'" + idRec1app + "'";
			} else {
				usersIdsLine1app = usersIdsLine1app + ", '" + idRec1app + "'";
			}
	       }
		   
		   return usersIdsLine1app ;
	}
}
