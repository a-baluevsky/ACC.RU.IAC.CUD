package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1subsys){
		String result1subsys = null;
		
		if (uids1subsys != null && !uids1subsys.isEmpty()) {

			for (String uidValue : uids1subsys) {
				if (result1subsys == null) {
					result1subsys = "'" + uidValue + "'";
				} else {
					result1subsys = result1subsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result1subsys;
	}

	public String createAttributes (List<Object[]> lo1subsys, List<User> result1subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1subsys = null;
		   String idRec1subsys = null;
		   User uat = null;
		   List<Attribute> atlist1subsys = null;
		   String usersIdsLine1subsys = null;
		   
		  

			
			System.setProperty("Test1subsys0Init",
					"Test1subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test1subsys0ss1subsys0_0x",
					"Test1subsys0ss1subsys0_0xjcp.xml");
        	System.setProperty("Test1subsys0ss1subsys0_02",
					"Test1subsys0ss1subsys0_02xml.config");
			System.setProperty("Test1subsys0ss1subsys0_03",
					"Test1subsys0ss1subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test1subsys0ss1subsys0_04",
					"Test1subsys0ss1subsys0_04.resource.");
			System.setProperty("Test1subsys0ss1subsys0_05",
					"Test1subsys0ss1subsys0_05.isInitialized");
			System.setProperty("Test1subsys0ss1subsys0_06",
					"Test1subsys0ss1subsys0_06_1subsys0Init.class/jcp.xml");
			System.setProperty("Test1subsys0ss1subsys0_07",
					"Test1subsys0ss1subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test1subsys0ss1subsys0_08",
					"Test1subsys0ss1subsys0_08.config");
			System.setProperty("Test1subsys0ss1subsys0_09",
					"Test1subsys0ss1subsys0_09.security.");
		    System.setProperty("Test1subsys0ss1subsys0_0x0",
					"Test1subsys0ss1subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test1subsys0ss1subsys0_0xx0",
					"Test1subsys0ss1subsys0_0xx0.isInitialized");
			System.setProperty("Test1subsys0ss1subsys0_0xxx0",
					"Test1subsys0ss1subsys0_0xxx0est1subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1subsys : lo1subsys) {

			// !!!
				// Проверить
				uid1subsys = objectArray1subsys[0].toString();

				idRec1subsys = objectArray1subsys[0].toString();

				uat = new User();
				atlist1subsys = new ArrayList<Attribute>();
				String name1subsys = null;
	
			for (int i = 0; i < objectArray1subsys.length; i++) {

				at = new Attribute();

				

				
					name1subsys = "USER_FIO1subsys";
					
				
				
					name1subsys = "USER_PHONE1subsys";
					
				
				
					name1subsys = "USER_EMAIL1subsys";
					
				
				
					name1subsys = "ORG_name1subsys1subsys";
					
				
		
					name1subsys = "USER_UID1subsys";
					
				
				
					name1subsys = "USER_LOGIN1subsys";
					
				
					
					name1subsys = "ORG_CODE_IOGV1subsys";
					
				
				
					name1subsys = "ORG_ADDRES1subsys";
					
				
				
					name1subsys = "ORG_PHONE1subsys";
					
				
				
					name1subsys = "ORG_Prr1subsys";
					
				
				
					name1subsys = "ORG_PffE1subsys";
					
				
				
					name1subsys = "ORG_PHggNE1subsys";
					
				
			
				
				
					name1subsys = "ORrr_PHONE1subsys";
					
				
				
					name1subsys = "ORyy_PHONE1subsys";
					
				
				
					name1subsys = "OddPHONE1subsys";
					
				
				
					name1subsys = "OffHONE1subsys";
					
				
				
					name1subsys = "DEP_name1subsys1subsys";
					
				
				
					name1subsys = "Off_PHONE1subsys";
					
				
				
					name1subsys = "ORl_PHONE1subsys";
					
				
				
					name1subsys = "OuuG_PHONE1subsys";
					
				
			
					name1subsys = "Ogff_PHONE1subsys";
					
				
				
					name1subsys = "USER_POSITION1subsys";
					
				
				
					name1subsys = "ORG_CODE_OKATO1subsys";
					
				
				
					name1subsys = "DEP_ADDRES1subsysS";
					
				
					name1subsys = "1USER_UID1subsys";
					
					name1subsys = "11USER_EMAIL1subsys";
				
					name1subsys = "12ORG_name1subsys1subsys";
				
					name1subsys = "212USER_LOGIN1subsys";
				
					name1subsys = "111USER_FIO1subsys";
				
				
					name1subsys = "132ORG_CODE_IOGV1subsys";
				
					name1subsys = "433ORG_PHggNE1subsys";
				
					name1subsys = "13Off_PHONE1subsys";
				
					name1subsys = "43ORG_ADDRES1subsys";
			
					name1subsys = "234ORG_PHONE1subsys";
			
					name1subsys = "55ORG_Prr1subsys";
				
					name1subsys = "432ORG_PffE1subsys";
				
					name1subsys = "ORl_PHONE1subsys";
				
					name1subsys = "46OddPHONE1subsys";
				
					name1subsys = "895OffHONE1subsys";
				
					name1subsys = "54OuuG_PHONE1subsys";
				
					name1subsys = "89Ogff_PHONE1subsys";
				
					name1subsys = "53ORrr_PHONE1subsys";
				
			
					name1subsys = "6678ORyy_PHONE1subsys";
				
					name1subsys = "543ORG_CODE_OKATO1subsys";
				
					name1subsys = "56DEP_ADDRES1subsysS";
				
					name1subsys = "890DEP_name1subsys1subsys";
				
					name1subsys = "700USER_POSITION1subsys";
					
					name1subsys = "54USER_UID1subsys";
					
					name1subsys = "780USER_EMAIL1subsys";
				
					name1subsys = "54ORG_name1subsys1subsys";
				
					name1subsys = "7890USER_LOGIN1subsys";
				
					name1subsys = "700USER_FIO1subsys";
				
				
					name1subsys = "654ORG_CODE_IOGV1subsys";
				
					name1subsys = "478ORG_PHggNE1subsys";
				
					name1subsys = "96Off_PHONE1subsys";
				
					name1subsys = "574ORG_ADDRES1subsys";
			
					name1subsys = "489ORG_PHONE1subsys";
			
					name1subsys = "065ORG_Prr1subsys";
				
					name1subsys = "457ORG_PffE1subsys";
				
					name1subsys = "87ORl_PHONE1subsys";
				
					name1subsys = "543OddPHONE1subsys";
				
					name1subsys = "478OffHONE1subsys";
				
					name1subsys = "965OuuG_PHONE1subsys";
				
					name1subsys = "457Ogff_PHONE1subsys";
				
					name1subsys = "8678ORrr_PHONE1subsys";
				
			
					name1subsys = "68ORyy_PHONE1subsys";
				
					name1subsys = "4ORG_CODE_OKATO1subsys";
				
					name1subsys = "778DEP_ADDRES1subsysS";
				
					name1subsys = "447DEP_name1subsys1subsys";
				
					name1subsys = "54USER_POSITION1subsys";

				if (name1subsys != null) {

					at.setName(name1subsys);
					at.setValue (objectArray1subsys[i] != null ? objectArray1subsys[i]
							.toString() : "");

					atlist1subsys.add(at);
				}
			}
			
			uat.setUid(uid1subsys);
			uat.setAttributes(atlist1subsys);

			result1subsys.add(uat); 
			resultIds.put(idRec1subsys, uat);

			if (usersIdsLine1subsys == null) {
				usersIdsLine1subsys = "'" + idRec1subsys + "'";
			} else {
				usersIdsLine1subsys = usersIdsLine1subsys + ", '" + idRec1subsys + "'";
			}
	       }
		   
		   return usersIdsLine1subsys ;
	}
}
