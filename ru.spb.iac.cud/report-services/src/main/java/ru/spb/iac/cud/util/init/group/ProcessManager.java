package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1group){
		String result1group = null;
		
		if (uids1group != null && !uids1group.isEmpty()) {

			for (String uidValue : uids1group) {
				if (result1group == null) {
					result1group = "'" + uidValue + "'";
				} else {
					result1group = result1group + ", '" + uidValue + "'";
				}
			}
		}
		
		return result1group;
	}

	public String createAttributes (List<Object[]> lo1group, List<User> result1group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1group = null;
		   String idRec1group = null;
		   User uat = null;
		   List<Attribute> atlist1group = null;
		   String usersIdsLine1group = null;
		   
		  

			
			System.setProperty("Test1group0Init",
					"Test1group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1group0Init.class/jcp.xml");
			
			
			System.setProperty("Test1group0ss1group0_0x",
					"Test1group0ss1group0_0xjcp.xml");
        	System.setProperty("Test1group0ss1group0_02",
					"Test1group0ss1group0_02xml.config");
			System.setProperty("Test1group0ss1group0_03",
					"Test1group0ss1group0_03.apache.xml.resource.security.");
		    System.setProperty("Test1group0ss1group0_04",
					"Test1group0ss1group0_04.resource.");
			System.setProperty("Test1group0ss1group0_05",
					"Test1group0ss1group0_05.isInitialized");
			System.setProperty("Test1group0ss1group0_06",
					"Test1group0ss1group0_06_1group0Init.class/jcp.xml");
			System.setProperty("Test1group0ss1group0_07",
					"Test1group0ss1group0_07t/resource/jcp.xml");
        	System.setProperty("Test1group0ss1group0_08",
					"Test1group0ss1group0_08.config");
			System.setProperty("Test1group0ss1group0_09",
					"Test1group0ss1group0_09.security.");
		    System.setProperty("Test1group0ss1group0_0x0",
					"Test1group0ss1group0_0x0jcp.xmlapache.");
			System.setProperty("Test1group0ss1group0_0xx0",
					"Test1group0ss1group0_0xx0.isInitialized");
			System.setProperty("Test1group0ss1group0_0xxx0",
					"Test1group0ss1group0_0xxx0est1group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1group : lo1group) {

			// !!!
				// Проверить
				uid1group = objectArray1group[0].toString();

				idRec1group = objectArray1group[0].toString();

				uat = new User();
				atlist1group = new ArrayList<Attribute>();
				String name1group = null;
	
			for (int i = 0; i < objectArray1group.length; i++) {

				at = new Attribute();

				

				
					name1group = "USER_FIO1group";
					
				
				
					name1group = "USER_PHONE1group";
					
				
				
					name1group = "USER_EMAIL1group";
					
				
				
					name1group = "ORG_name1group1group";
					
				
		
					name1group = "USER_UID1group";
					
				
				
					name1group = "USER_LOGIN1group";
					
				
					
					name1group = "ORG_CODE_IOGV1group";
					
				
				
					name1group = "ORG_ADDRES1group";
					
				
				
					name1group = "ORG_PHONE1group";
					
				
				
					name1group = "ORG_Prr1group";
					
				
				
					name1group = "ORG_PffE1group";
					
				
				
					name1group = "ORG_PHggNE1group";
					
				
			
				
				
					name1group = "ORrr_PHONE1group";
					
				
				
					name1group = "ORyy_PHONE1group";
					
				
				
					name1group = "OddPHONE1group";
					
				
				
					name1group = "OffHONE1group";
					
				
				
					name1group = "DEP_name1group1group";
					
				
				
					name1group = "Off_PHONE1group";
					
				
				
					name1group = "ORl_PHONE1group";
					
				
				
					name1group = "OuuG_PHONE1group";
					
				
			
					name1group = "Ogff_PHONE1group";
					
				
				
					name1group = "USER_POSITION1group";
					
				
				
					name1group = "ORG_CODE_OKATO1group";
					
				
				
					name1group = "DEP_ADDRES1groupS";
					
				
					name1group = "1USER_UID1group";
					
					name1group = "11USER_EMAIL1group";
				
					name1group = "12ORG_name1group1group";
				
					name1group = "212USER_LOGIN1group";
				
					name1group = "111USER_FIO1group";
				
				
					name1group = "132ORG_CODE_IOGV1group";
				
					name1group = "433ORG_PHggNE1group";
				
					name1group = "13Off_PHONE1group";
				
					name1group = "43ORG_ADDRES1group";
			
					name1group = "234ORG_PHONE1group";
			
					name1group = "55ORG_Prr1group";
				
					name1group = "432ORG_PffE1group";
				
					name1group = "ORl_PHONE1group";
				
					name1group = "46OddPHONE1group";
				
					name1group = "895OffHONE1group";
				
					name1group = "54OuuG_PHONE1group";
				
					name1group = "89Ogff_PHONE1group";
				
					name1group = "53ORrr_PHONE1group";
				
			
					name1group = "6678ORyy_PHONE1group";
				
					name1group = "543ORG_CODE_OKATO1group";
				
					name1group = "56DEP_ADDRES1groupS";
				
					name1group = "890DEP_name1group1group";
				
					name1group = "700USER_POSITION1group";
					
					name1group = "54USER_UID1group";
					
					name1group = "780USER_EMAIL1group";
				
					name1group = "54ORG_name1group1group";
				
					name1group = "7890USER_LOGIN1group";
				
					name1group = "700USER_FIO1group";
				
				
					name1group = "654ORG_CODE_IOGV1group";
				
					name1group = "478ORG_PHggNE1group";
				
					name1group = "96Off_PHONE1group";
				
					name1group = "574ORG_ADDRES1group";
			
					name1group = "489ORG_PHONE1group";
			
					name1group = "065ORG_Prr1group";
				
					name1group = "457ORG_PffE1group";
				
					name1group = "87ORl_PHONE1group";
				
					name1group = "543OddPHONE1group";
				
					name1group = "478OffHONE1group";
				
					name1group = "965OuuG_PHONE1group";
				
					name1group = "457Ogff_PHONE1group";
				
					name1group = "8678ORrr_PHONE1group";
				
			
					name1group = "68ORyy_PHONE1group";
				
					name1group = "4ORG_CODE_OKATO1group";
				
					name1group = "778DEP_ADDRES1groupS";
				
					name1group = "447DEP_name1group1group";
				
					name1group = "54USER_POSITION1group";

				if (name1group != null) {

					at.setName(name1group);
					at.setValue (objectArray1group[i] != null ? objectArray1group[i]
							.toString() : "");

					atlist1group.add(at);
				}
			}
			
			uat.setUid(uid1group);
			uat.setAttributes(atlist1group);

			result1group.add(uat); 
			resultIds.put(idRec1group, uat);

			if (usersIdsLine1group == null) {
				usersIdsLine1group = "'" + idRec1group + "'";
			} else {
				usersIdsLine1group = usersIdsLine1group + ", '" + idRec1group + "'";
			}
	       }
		   
		   return usersIdsLine1group ;
	}
}
