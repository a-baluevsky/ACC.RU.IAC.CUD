package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1org){
		String result1org = null;
		
		if (uids1org != null && !uids1org.isEmpty()) {

			for (String uidValue : uids1org) {
				if (result1org == null) {
					result1org = "'" + uidValue + "'";
				} else {
					result1org = result1org + ", '" + uidValue + "'";
				}
			}
		}
		
		return result1org;
	}

	public String createAttributes (List<Object[]> lo1org, List<User> result1org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1org = null;
		   String idRec1org = null;
		   User uat = null;
		   List<Attribute> atlist1org = null;
		   String usersIdsLine1org = null;
		   
		  

			
			System.setProperty("Test1org0Init",
					"Test1org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1org0Init.class/jcp.xml");
			
			
			System.setProperty("Test1org0ss1org0_0x",
					"Test1org0ss1org0_0xjcp.xml");
        	System.setProperty("Test1org0ss1org0_02",
					"Test1org0ss1org0_02xml.config");
			System.setProperty("Test1org0ss1org0_03",
					"Test1org0ss1org0_03.apache.xml.resource.security.");
		    System.setProperty("Test1org0ss1org0_04",
					"Test1org0ss1org0_04.resource.");
			System.setProperty("Test1org0ss1org0_05",
					"Test1org0ss1org0_05.isInitialized");
			System.setProperty("Test1org0ss1org0_06",
					"Test1org0ss1org0_06_1org0Init.class/jcp.xml");
			System.setProperty("Test1org0ss1org0_07",
					"Test1org0ss1org0_07t/resource/jcp.xml");
        	System.setProperty("Test1org0ss1org0_08",
					"Test1org0ss1org0_08.config");
			System.setProperty("Test1org0ss1org0_09",
					"Test1org0ss1org0_09.security.");
		    System.setProperty("Test1org0ss1org0_0x0",
					"Test1org0ss1org0_0x0jcp.xmlapache.");
			System.setProperty("Test1org0ss1org0_0xx0",
					"Test1org0ss1org0_0xx0.isInitialized");
			System.setProperty("Test1org0ss1org0_0xxx0",
					"Test1org0ss1org0_0xxx0est1org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1org : lo1org) {

			// !!!
				// Проверить
				uid1org = objectArray1org[0].toString();

				idRec1org = objectArray1org[0].toString();

				uat = new User();
				atlist1org = new ArrayList<Attribute>();
				String name1org = null;
	
			for (int i = 0; i < objectArray1org.length; i++) {

				at = new Attribute();

				

				
					name1org = "USER_FIO1org";
					
				
				
					name1org = "USER_PHONE1org";
					
				
				
					name1org = "USER_EMAIL1org";
					
				
				
					name1org = "ORG_name1org1org";
					
				
		
					name1org = "USER_UID1org";
					
				
				
					name1org = "USER_LOGIN1org";
					
				
					
					name1org = "ORG_CODE_IOGV1org";
					
				
				
					name1org = "ORG_ADDRES1org";
					
				
				
					name1org = "ORG_PHONE1org";
					
				
				
					name1org = "ORG_Prr1org";
					
				
				
					name1org = "ORG_PffE1org";
					
				
				
					name1org = "ORG_PHggNE1org";
					
				
			
				
				
					name1org = "ORrr_PHONE1org";
					
				
				
					name1org = "ORyy_PHONE1org";
					
				
				
					name1org = "OddPHONE1org";
					
				
				
					name1org = "OffHONE1org";
					
				
				
					name1org = "DEP_name1org1org";
					
				
				
					name1org = "Off_PHONE1org";
					
				
				
					name1org = "ORl_PHONE1org";
					
				
				
					name1org = "OuuG_PHONE1org";
					
				
			
					name1org = "Ogff_PHONE1org";
					
				
				
					name1org = "USER_POSITION1org";
					
				
				
					name1org = "ORG_CODE_OKATO1org";
					
				
				
					name1org = "DEP_ADDRES1orgS";
					
				
					name1org = "1USER_UID1org";
					
					name1org = "11USER_EMAIL1org";
				
					name1org = "12ORG_name1org1org";
				
					name1org = "212USER_LOGIN1org";
				
					name1org = "111USER_FIO1org";
				
				
					name1org = "132ORG_CODE_IOGV1org";
				
					name1org = "433ORG_PHggNE1org";
				
					name1org = "13Off_PHONE1org";
				
					name1org = "43ORG_ADDRES1org";
			
					name1org = "234ORG_PHONE1org";
			
					name1org = "55ORG_Prr1org";
				
					name1org = "432ORG_PffE1org";
				
					name1org = "ORl_PHONE1org";
				
					name1org = "46OddPHONE1org";
				
					name1org = "895OffHONE1org";
				
					name1org = "54OuuG_PHONE1org";
				
					name1org = "89Ogff_PHONE1org";
				
					name1org = "53ORrr_PHONE1org";
				
			
					name1org = "6678ORyy_PHONE1org";
				
					name1org = "543ORG_CODE_OKATO1org";
				
					name1org = "56DEP_ADDRES1orgS";
				
					name1org = "890DEP_name1org1org";
				
					name1org = "700USER_POSITION1org";
					
					name1org = "54USER_UID1org";
					
					name1org = "780USER_EMAIL1org";
				
					name1org = "54ORG_name1org1org";
				
					name1org = "7890USER_LOGIN1org";
				
					name1org = "700USER_FIO1org";
				
				
					name1org = "654ORG_CODE_IOGV1org";
				
					name1org = "478ORG_PHggNE1org";
				
					name1org = "96Off_PHONE1org";
				
					name1org = "574ORG_ADDRES1org";
			
					name1org = "489ORG_PHONE1org";
			
					name1org = "065ORG_Prr1org";
				
					name1org = "457ORG_PffE1org";
				
					name1org = "87ORl_PHONE1org";
				
					name1org = "543OddPHONE1org";
				
					name1org = "478OffHONE1org";
				
					name1org = "965OuuG_PHONE1org";
				
					name1org = "457Ogff_PHONE1org";
				
					name1org = "8678ORrr_PHONE1org";
				
			
					name1org = "68ORyy_PHONE1org";
				
					name1org = "4ORG_CODE_OKATO1org";
				
					name1org = "778DEP_ADDRES1orgS";
				
					name1org = "447DEP_name1org1org";
				
					name1org = "54USER_POSITION1org";

				if (name1org != null) {

					at.setName(name1org);
					at.setValue (objectArray1org[i] != null ? objectArray1org[i]
							.toString() : "");

					atlist1org.add(at);
				}
			}
			
			uat.setUid(uid1org);
			uat.setAttributes(atlist1org);

			result1org.add(uat); 
			resultIds.put(idRec1org, uat);

			if (usersIdsLine1org == null) {
				usersIdsLine1org = "'" + idRec1org + "'";
			} else {
				usersIdsLine1org = usersIdsLine1org + ", '" + idRec1org + "'";
			}
	       }
		   
		   return usersIdsLine1org ;
	}
}
