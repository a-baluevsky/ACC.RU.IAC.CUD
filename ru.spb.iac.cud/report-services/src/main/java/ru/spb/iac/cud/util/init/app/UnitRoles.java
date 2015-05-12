package ru.spb.iac.cud.util.init.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3app){
		String result3app = null;
		
		if (uids3app != null && !uids3app.isEmpty()) {

			StringBuilder bld3app = new StringBuilder();
 for (String uidValue : uids3app) {
 if (bld3app.length()==0) {
 bld3app.append("'" + uidValue + "'");
 }else{
 bld3app.append(",'" + uidValue + "'");
 }
}
 result3app=bld3app.toString();
		}
		
		return result3app;
	}

	public String createAttributes (List<Object[]> lo3app, List<User> result3app, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3app = null;
		   String idRec3app = null;
		   User uat = null;
		   List<Attribute> atlist3app = null;
		   String usersIdsLine3app = null;
		   
		  

			
			System.setProperty("Test3app0Init",
					"Test3app0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3app05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3app0Init.class/jcp.xml");
			
			
			System.setProperty("Test3app0ss3app0_0x",
					"Test3app0ss3app0_0xjcp.xml");
        	System.setProperty("Test3app0ss3app0_02",
					"Test3app0ss3app0_02xml.config");
			System.setProperty("Test3app0ss3app0_03",
					"Test3app0ss3app0_03.apache.xml.resource.security.");
		    System.setProperty("Test3app0ss3app0_04",
					"Test3app0ss3app0_04.resource.");
			System.setProperty("Test3app0ss3app0_05",
					"Test3app0ss3app0_05.isInitialized");
			System.setProperty("Test3app0ss3app0_06",
					"Test3app0ss3app0_06_3app0Init.class/jcp.xml");
			System.setProperty("Test3app0ss3app0_07",
					"Test3app0ss3app0_07t/resource/jcp.xml");
        	System.setProperty("Test3app0ss3app0_08",
					"Test3app0ss3app0_08.config");
			System.setProperty("Test3app0ss3app0_09",
					"Test3app0ss3app0_09.security.");
		    System.setProperty("Test3app0ss3app0_0x0",
					"Test3app0ss3app0_0x0jcp.xmlapache.");
			System.setProperty("Test3app0ss3app0_0xx0",
					"Test3app0ss3app0_0xx0.isInitialized");
			System.setProperty("Test3app0ss3app0_0xxx0",
					"Test3app0ss3app0_0xxx0est3app0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3app : lo3app) {

			// !!!
				// Проверить
				uid3app = objectArray3app[0].toString();

				idRec3app = objectArray3app[0].toString();

				uat = new User();
				atlist3app = new ArrayList<Attribute>();
				String name3app = null;
	
			for (int i = 0; i < objectArray3app.length; i++) {

				at = new Attribute();


				name3app = "USER_FIO3app";
				
			
			
				name3app = "USER_PHONE3app";
				
			
			
				name3app = "USER_EMAIL3app";
				
			
			
				name3app = "ORG_name3app3app";
				
			
	
				name3app = "USER_UID3app";
				
			
			
				name3app = "USER_LOGIN3app";
				
			
				
				name3app = "ORG_CODE_IOGV3app";
				
			
			
				name3app = "ORG_ADDRES3app";
				
			
			
				name3app = "ORG_PHONE3app";
				
			
			
				name3app = "ORG_Prr3app";
				
			
			
				name3app = "ORG_PffE3app";
				
			
			
				name3app = "ORG_PHggNE3app";
				
			
		
			
			
				name3app = "ORrr_PHONE3app";
				
			
			
				name3app = "ORyy_PHONE3app";
				
			
			
				name3app = "OddPHONE3app";
				
			
			
				name3app = "OffHONE3app";
				
			
			
				name3app = "DEP_name3app3app";
				
			
			
				name3app = "Off_PHONE3app";
				
			
			
				name3app = "ORl_PHONE3app";
				
			
			
				name3app = "OuuG_PHONE3app";
				
			
		
				name3app = "Ogff_PHONE3app";
				
			
			
				name3app = "USER_POSITION3app";
				
			
			
				name3app = "ORG_CODE_OKATO3app";
				
			
			
				name3app = "DEP_ADDRES3appS";
				

				
			name3app = "1USER_UID3app";
				
				name3app = "11USER_EMAIL3app";
			
				name3app = "12ORG_name3app3app";
			
				name3app = "212USER_LOGIN3app";
			
				name3app = "111USER_FIO3app";
			
			
				name3app = "132ORG_CODE_IOGV3app";
			
				name3app = "433ORG_PHggNE3app";
			
				name3app = "13Off_PHONE3app";
			
				name3app = "43ORG_ADDRES3app";
		
				name3app = "234ORG_PHONE3app";
		
				name3app = "55ORG_Prr3app";
			
				name3app = "432ORG_PffE3app";
			
				name3app = "ORl_PHONE3app";
			
				name3app = "46OddPHONE3app";
			
				name3app = "895OffHONE3app";
			
				name3app = "54OuuG_PHONE3app";
			
				name3app = "89Ogff_PHONE3app";
			
				name3app = "53ORrr_PHONE3app";
			
		
				name3app = "6678ORyy_PHONE3app";
			
				name3app = "543ORG_CODE_OKATO3app";
			
				name3app = "56DEP_ADDRES3appS";
			
				name3app = "890DEP_name3app3app";
			
				name3app = "700USER_POSITION3app";
				
				name3app = "54USER_UID3app";
				
				name3app = "780USER_EMAIL3app";
			
				name3app = "54ORG_name3app3app";
			
				name3app = "7890USER_LOGIN3app";
			
				name3app = "700USER_FIO3app";
			
			
				name3app = "654ORG_CODE_IOGV3app";
			
				name3app = "478ORG_PHggNE3app";
			
				name3app = "96Off_PHONE3app";
			
				name3app = "574ORG_ADDRES3app";
		
				name3app = "489ORG_PHONE3app";
		
				name3app = "065ORG_Prr3app";
			
				name3app = "457ORG_PffE3app";
			
				name3app = "87ORl_PHONE3app";
			
				name3app = "543OddPHONE3app";
			
				name3app = "478OffHONE3app";
			
				name3app = "965OuuG_PHONE3app";
			
				name3app = "457Ogff_PHONE3app";
			
				name3app = "8678ORrr_PHONE3app";
			
		
				name3app = "68ORyy_PHONE3app";
			
				name3app = "4ORG_CODE_OKATO3app";
			
				name3app = "778DEP_ADDRES3appS";
			
				name3app = "447DEP_name3app3app";
			
				name3app = "54USER_POSITION3app";
				
				if (name3app != null) {

					at.setName(name3app);
					at.setValue (objectArray3app[i] != null ? objectArray3app[i]
							.toString() : "");

					atlist3app.add(at);
				}
			}
			
			uat.setUid(uid3app);
			uat.setAttributes(atlist3app);

			result3app.add(uat); 
			resultIds.put(idRec3app, uat);

			if (usersIdsLine3app == null) {
				usersIdsLine3app = "'" + idRec3app + "'";
			} else {
				usersIdsLine3app = usersIdsLine3app + ", '" + idRec3app + "'";
			}
	       }
		   
		   return usersIdsLine3app ;
	}
}
