package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1classif){
		String result1classif = null;
		
		if (uids1classif != null && !uids1classif.isEmpty()) {

			StringBuilder bld1classif = new StringBuilder();
 for (String uidValue : uids1classif) {
 if (bld1classif.length()==0) {
 bld1classif.append("'" + uidValue + "'");
 }else{
 bld1classif.append(",'" + uidValue + "'");
 }
}
 result1classif=bld1classif.toString();
		}
		
		return result1classif;
	}

	public String createAttributes (List<Object[]> lo1classif, List<User> result1classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1classif = null;
		   String idRec1classif = null;
		   User uat = null;
		   List<Attribute> atlist1classif = null;
		   String usersIdsLine1classif = null;
		   
		  

			
			System.setProperty("Test1classif0Init",
					"Test1classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test1classif0ss1classif0_0x",
					"Test1classif0ss1classif0_0xjcp.xml");
        	System.setProperty("Test1classif0ss1classif0_02",
					"Test1classif0ss1classif0_02xml.config");
			System.setProperty("Test1classif0ss1classif0_03",
					"Test1classif0ss1classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test1classif0ss1classif0_04",
					"Test1classif0ss1classif0_04.resource.");
			System.setProperty("Test1classif0ss1classif0_05",
					"Test1classif0ss1classif0_05.isInitialized");
			System.setProperty("Test1classif0ss1classif0_06",
					"Test1classif0ss1classif0_06_1classif0Init.class/jcp.xml");
			System.setProperty("Test1classif0ss1classif0_07",
					"Test1classif0ss1classif0_07t/resource/jcp.xml");
        	System.setProperty("Test1classif0ss1classif0_08",
					"Test1classif0ss1classif0_08.config");
			System.setProperty("Test1classif0ss1classif0_09",
					"Test1classif0ss1classif0_09.security.");
		    System.setProperty("Test1classif0ss1classif0_0x0",
					"Test1classif0ss1classif0_0x0jcp.xmlapache.");
			System.setProperty("Test1classif0ss1classif0_0xx0",
					"Test1classif0ss1classif0_0xx0.isInitialized");
			System.setProperty("Test1classif0ss1classif0_0xxx0",
					"Test1classif0ss1classif0_0xxx0est1classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1classif : lo1classif) {

			// !!!
				// Проверить
				uid1classif = objectArray1classif[0].toString();

				idRec1classif = objectArray1classif[0].toString();

				uat = new User();
				atlist1classif = new ArrayList<Attribute>();
				String name1classif = null;
	
			for (int i = 0; i < objectArray1classif.length; i++) {

				at = new Attribute();

				

				
					name1classif = "USER_FIO1classif";
					
				
				
					name1classif = "USER_PHONE1classif";
					
				
				
					name1classif = "USER_EMAIL1classif";
					
				
				
					name1classif = "ORG_name1classif1classif";
					
				
		
					name1classif = "USER_UID1classif";
					
				
				
					name1classif = "USER_LOGIN1classif";
					
				
					
					name1classif = "ORG_CODE_IOGV1classif";
					
				
				
					name1classif = "ORG_ADDRES1classif";
					
				
				
					name1classif = "ORG_PHONE1classif";
					
				
				
					name1classif = "ORG_Prr1classif";
					
				
				
					name1classif = "ORG_PffE1classif";
					
				
				
					name1classif = "ORG_PHggNE1classif";
					
				
			
				
				
					name1classif = "ORrr_PHONE1classif";
					
				
				
					name1classif = "ORyy_PHONE1classif";
					
				
				
					name1classif = "OddPHONE1classif";
					
				
				
					name1classif = "OffHONE1classif";
					
				
				
					name1classif = "DEP_name1classif1classif";
					
				
				
					name1classif = "Off_PHONE1classif";
					
				
				
					name1classif = "ORl_PHONE1classif";
					
				
				
					name1classif = "OuuG_PHONE1classif";
					
				
			
					name1classif = "Ogff_PHONE1classif";
					
				
				
					name1classif = "USER_POSITION1classif";
					
				
				
					name1classif = "ORG_CODE_OKATO1classif";
					
				
				
					name1classif = "DEP_ADDRES1classifS";
					
				
					name1classif = "1USER_UID1classif";
					
					name1classif = "11USER_EMAIL1classif";
				
					name1classif = "12ORG_name1classif1classif";
				
					name1classif = "212USER_LOGIN1classif";
				
					name1classif = "111USER_FIO1classif";
				
				
					name1classif = "132ORG_CODE_IOGV1classif";
				
					name1classif = "433ORG_PHggNE1classif";
				
					name1classif = "13Off_PHONE1classif";
				
					name1classif = "43ORG_ADDRES1classif";
			
					name1classif = "234ORG_PHONE1classif";
			
					name1classif = "55ORG_Prr1classif";
				
					name1classif = "432ORG_PffE1classif";
				
					name1classif = "ORl_PHONE1classif";
				
					name1classif = "46OddPHONE1classif";
				
					name1classif = "895OffHONE1classif";
				
					name1classif = "54OuuG_PHONE1classif";
				
					name1classif = "89Ogff_PHONE1classif";
				
					name1classif = "53ORrr_PHONE1classif";
				
			
					name1classif = "6678ORyy_PHONE1classif";
				
					name1classif = "543ORG_CODE_OKATO1classif";
				
					name1classif = "56DEP_ADDRES1classifS";
				
					name1classif = "890DEP_name1classif1classif";
				
					name1classif = "700USER_POSITION1classif";
					
					name1classif = "54USER_UID1classif";
					
					name1classif = "780USER_EMAIL1classif";
				
					name1classif = "54ORG_name1classif1classif";
				
					name1classif = "7890USER_LOGIN1classif";
				
					name1classif = "700USER_FIO1classif";
				
				
					name1classif = "654ORG_CODE_IOGV1classif";
				
					name1classif = "478ORG_PHggNE1classif";
				
					name1classif = "96Off_PHONE1classif";
				
					name1classif = "574ORG_ADDRES1classif";
			
					name1classif = "489ORG_PHONE1classif";
			
					name1classif = "065ORG_Prr1classif";
				
					name1classif = "457ORG_PffE1classif";
				
					name1classif = "87ORl_PHONE1classif";
				
					name1classif = "543OddPHONE1classif";
				
					name1classif = "478OffHONE1classif";
				
					name1classif = "965OuuG_PHONE1classif";
				
					name1classif = "457Ogff_PHONE1classif";
				
					name1classif = "8678ORrr_PHONE1classif";
				
			
					name1classif = "68ORyy_PHONE1classif";
				
					name1classif = "4ORG_CODE_OKATO1classif";
				
					name1classif = "778DEP_ADDRES1classifS";
				
					name1classif = "447DEP_name1classif1classif";
				
					name1classif = "54USER_POSITION1classif";

				if (name1classif != null) {

					at.setName(name1classif);
					at.setValue (objectArray1classif[i] != null ? objectArray1classif[i]
							.toString() : "");

					atlist1classif.add(at);
				}
			}
			
			uat.setUid(uid1classif);
			uat.setAttributes(atlist1classif);

			result1classif.add(uat); 
			resultIds.put(idRec1classif, uat);

			if (usersIdsLine1classif == null) {
				usersIdsLine1classif = "'" + idRec1classif + "'";
			} else {
				usersIdsLine1classif = usersIdsLine1classif + ", '" + idRec1classif + "'";
			}
	       }
		   
		   return usersIdsLine1classif ;
	}
}
