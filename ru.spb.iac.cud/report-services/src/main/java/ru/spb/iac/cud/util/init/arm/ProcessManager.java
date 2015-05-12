package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1arm){
		String result1arm = null;
		
		if (uids1arm != null && !uids1arm.isEmpty()) {

			StringBuilder bld1arm = new StringBuilder();

			for (String uidValue : uids1arm) {

			  bld1arm.append(",'").append(uidValue).append("'");

			}

			result1arm=bld1arm.substring(1);
		}
		
		return result1arm;
	}

	public String createAttributes (List<Object[]> lo1arm, List<User> result1arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1arm = null;
		   String idRec1arm = null;
		   User uat = null;
		   List<Attribute> atlist1arm = null;
		   String usersIdsLine1arm = null;
		   
		  

			
			System.setProperty("Test1arm0Init",
					"Test1arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test1arm0ss1arm0_0x",
					"Test1arm0ss1arm0_0xjcp.xml");
        	System.setProperty("Test1arm0ss1arm0_02",
					"Test1arm0ss1arm0_02xml.config");
			System.setProperty("Test1arm0ss1arm0_03",
					"Test1arm0ss1arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test1arm0ss1arm0_04",
					"Test1arm0ss1arm0_04.resource.");
			System.setProperty("Test1arm0ss1arm0_05",
					"Test1arm0ss1arm0_05.isInitialized");
			System.setProperty("Test1arm0ss1arm0_06",
					"Test1arm0ss1arm0_06_1arm0Init.class/jcp.xml");
			System.setProperty("Test1arm0ss1arm0_07",
					"Test1arm0ss1arm0_07t/resource/jcp.xml");
        	System.setProperty("Test1arm0ss1arm0_08",
					"Test1arm0ss1arm0_08.config");
			System.setProperty("Test1arm0ss1arm0_09",
					"Test1arm0ss1arm0_09.security.");
		    System.setProperty("Test1arm0ss1arm0_0x0",
					"Test1arm0ss1arm0_0x0jcp.xmlapache.");
			System.setProperty("Test1arm0ss1arm0_0xx0",
					"Test1arm0ss1arm0_0xx0.isInitialized");
			System.setProperty("Test1arm0ss1arm0_0xxx0",
					"Test1arm0ss1arm0_0xxx0est1arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1arm : lo1arm) {

			// !!!
				// Проверить
				uid1arm = objectArray1arm[0].toString();

				idRec1arm = objectArray1arm[0].toString();

				uat = new User();
				atlist1arm = new ArrayList<Attribute>();
				String name1arm = null;
	
			for (int i = 0; i < objectArray1arm.length; i++) {

				at = new Attribute();

				

				
					name1arm = "USER_FIO1arm";
					
				
				
					name1arm = "USER_PHONE1arm";
					
				
				
					name1arm = "USER_EMAIL1arm";
					
				
				
					name1arm = "ORG_name1arm1arm";
					
				
		
					name1arm = "USER_UID1arm";
					
				
				
					name1arm = "USER_LOGIN1arm";
					
				
					
					name1arm = "ORG_CODE_IOGV1arm";
					
				
				
					name1arm = "ORG_ADDRES1arm";
					
				
				
					name1arm = "ORG_PHONE1arm";
					
				
				
					name1arm = "ORG_Prr1arm";
					
				
				
					name1arm = "ORG_PffE1arm";
					
				
				
					name1arm = "ORG_PHggNE1arm";
					
				
			
				
				
					name1arm = "ORrr_PHONE1arm";
					
				
				
					name1arm = "ORyy_PHONE1arm";
					
				
				
					name1arm = "OddPHONE1arm";
					
				
				
					name1arm = "OffHONE1arm";
					
				
				
					name1arm = "DEP_name1arm1arm";
					
				
				
					name1arm = "Off_PHONE1arm";
					
				
				
					name1arm = "ORl_PHONE1arm";
					
				
				
					name1arm = "OuuG_PHONE1arm";
					
				
			
					name1arm = "Ogff_PHONE1arm";
					
				
				
					name1arm = "USER_POSITION1arm";
					
				
				
					name1arm = "ORG_CODE_OKATO1arm";
					
				
				
					name1arm = "DEP_ADDRES1armS";
					
				
					name1arm = "1USER_UID1arm";
					
					name1arm = "11USER_EMAIL1arm";
				
					name1arm = "12ORG_name1arm1arm";
				
					name1arm = "212USER_LOGIN1arm";
				
					name1arm = "111USER_FIO1arm";
				
				
					name1arm = "132ORG_CODE_IOGV1arm";
				
					name1arm = "433ORG_PHggNE1arm";
				
					name1arm = "13Off_PHONE1arm";
				
					name1arm = "43ORG_ADDRES1arm";
			
					name1arm = "234ORG_PHONE1arm";
			
					name1arm = "55ORG_Prr1arm";
				
					name1arm = "432ORG_PffE1arm";
				
					name1arm = "ORl_PHONE1arm";
				
					name1arm = "46OddPHONE1arm";
				
					name1arm = "895OffHONE1arm";
				
					name1arm = "54OuuG_PHONE1arm";
				
					name1arm = "89Ogff_PHONE1arm";
				
					name1arm = "53ORrr_PHONE1arm";
				
			
					name1arm = "6678ORyy_PHONE1arm";
				
					name1arm = "543ORG_CODE_OKATO1arm";
				
					name1arm = "56DEP_ADDRES1armS";
				
					name1arm = "890DEP_name1arm1arm";
				
					name1arm = "700USER_POSITION1arm";
					
					name1arm = "54USER_UID1arm";
					
					name1arm = "780USER_EMAIL1arm";
				
					name1arm = "54ORG_name1arm1arm";
				
					name1arm = "7890USER_LOGIN1arm";
				
					name1arm = "700USER_FIO1arm";
				
				
					name1arm = "654ORG_CODE_IOGV1arm";
				
					name1arm = "478ORG_PHggNE1arm";
				
					name1arm = "96Off_PHONE1arm";
				
					name1arm = "574ORG_ADDRES1arm";
			
					name1arm = "489ORG_PHONE1arm";
			
					name1arm = "065ORG_Prr1arm";
				
					name1arm = "457ORG_PffE1arm";
				
					name1arm = "87ORl_PHONE1arm";
				
					name1arm = "543OddPHONE1arm";
				
					name1arm = "478OffHONE1arm";
				
					name1arm = "965OuuG_PHONE1arm";
				
					name1arm = "457Ogff_PHONE1arm";
				
					name1arm = "8678ORrr_PHONE1arm";
				
			
					name1arm = "68ORyy_PHONE1arm";
				
					name1arm = "4ORG_CODE_OKATO1arm";
				
					name1arm = "778DEP_ADDRES1armS";
				
					name1arm = "447DEP_name1arm1arm";
				
					name1arm = "54USER_POSITION1arm";

				if (name1arm != null) {

					at.setName(name1arm);
					at.setValue (objectArray1arm[i] != null ? objectArray1arm[i]
							.toString() : "");

					atlist1arm.add(at);
				}
			}
			
			uat.setUid(uid1arm);
			uat.setAttributes(atlist1arm);

			result1arm.add(uat); 
			resultIds.put(idRec1arm, uat);

			if (usersIdsLine1arm == null) {
				usersIdsLine1arm = "'" + idRec1arm + "'";
			} else {
				usersIdsLine1arm = usersIdsLine1arm + ", '" + idRec1arm + "'";
			}
	       }
		   
		   return usersIdsLine1arm ;
	}
}
