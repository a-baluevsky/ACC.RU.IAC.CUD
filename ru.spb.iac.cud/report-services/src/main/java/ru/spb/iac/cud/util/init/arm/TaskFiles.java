package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2arm){
		String result2arm = null;
		
		if (uids2arm != null && !uids2arm.isEmpty()) {

			for (String uidValue : uids2arm) {
				if (result2arm == null) {
					result2arm = "'" + uidValue + "'";
				} else {
					result2arm = result2arm + ", '" + uidValue + "'";
				}
			}
		}
		
		return result2arm;
	}

	public  String createAttributes (List<Object[]> lo2arm, List<User> result2arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2arm = null;
		   String idRec2arm = null;
		   User uat = null;
		   List<Attribute> atlist2arm = null;
		   String usersIdsLine2arm = null;
		   
		  

			
			System.setProperty("Test2arm0Init",
					"Test2arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test2arm0ss2arm0_0x",
					"Test2arm0ss2arm0_0xjcp.xml");
        	System.setProperty("Test2arm0ss2arm0_02",
					"Test2arm0ss2arm0_02xml.config");
			System.setProperty("Test2arm0ss2arm0_03",
					"Test2arm0ss2arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test2arm0ss2arm0_04",
					"Test2arm0ss2arm0_04.resource.");
			System.setProperty("Test2arm0ss2arm0_05",
					"Test2arm0ss2arm0_05.isInitialized");
			System.setProperty("Test2arm0ss2arm0_06",
					"Test2arm0ss2arm0_06_2arm0Init.class/jcp.xml");
			System.setProperty("Test2arm0ss2arm0_07",
					"Test2arm0ss2arm0_07t/resource/jcp.xml");
        	System.setProperty("Test2arm0ss2arm0_08",
					"Test2arm0ss2arm0_08.config");
			System.setProperty("Test2arm0ss2arm0_09",
					"Test2arm0ss2arm0_09.security.");
		    System.setProperty("Test2arm0ss2arm0_0x0",
					"Test2arm0ss2arm0_0x0jcp.xmlapache.");
			System.setProperty("Test2arm0ss2arm0_0xx0",
					"Test2arm0ss2arm0_0xx0.isInitialized");
			System.setProperty("Test2arm0ss2arm0_0xxx0",
					"Test2arm0ss2arm0_0xxx0est2arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2arm : lo2arm) {

			// !!!
				// Проверить
				uid2arm = objectArray2arm[0].toString();

				idRec2arm = objectArray2arm[0].toString();

				uat = new User();
				atlist2arm = new ArrayList<Attribute>();
				String name2arm = null;
	
			for (int i = 0; i < objectArray2arm.length; i++) {

				at = new Attribute();


				name2arm = "USER_FIO2arm";
				
			
			
				name2arm = "USER_PHONE2arm";
				
			
			
				name2arm = "USER_EMAIL2arm";
				
			
			
				name2arm = "ORG_name2arm2arm";
				
			
	
				name2arm = "USER_UID2arm";
				
			
			
				name2arm = "USER_LOGIN2arm";
				
			
				
				name2arm = "ORG_CODE_IOGV2arm";
				
			
			
				name2arm = "ORG_ADDRES2arm";
				
			
			
				name2arm = "ORG_PHONE2arm";
				
			
			
				name2arm = "ORG_Prr2arm";
				
			
			
				name2arm = "ORG_PffE2arm";
				
			
			
				name2arm = "ORG_PHggNE2arm";
				
			
		
			
			
				name2arm = "ORrr_PHONE2arm";
				
			
			
				name2arm = "ORyy_PHONE2arm";
				
			
			
				name2arm = "OddPHONE2arm";
				
			
			
				name2arm = "OffHONE2arm";
				
			
			
				name2arm = "DEP_name2arm2arm";
				
			
			
				name2arm = "Off_PHONE2arm";
				
			
			
				name2arm = "ORl_PHONE2arm";
				
			
			
				name2arm = "OuuG_PHONE2arm";
				
			
		
				name2arm = "Ogff_PHONE2arm";
				
			
			
				name2arm = "USER_POSITION2arm";
				
			
			
				name2arm = "ORG_CODE_OKATO2arm";
				
			
			
				name2arm = "DEP_ADDRES2armS";
				

			name2arm = "1USER_UID2arm";
				
				name2arm = "11USER_EMAIL2arm";
			
				name2arm = "12ORG_name2arm2arm";
			
				name2arm = "212USER_LOGIN2arm";
			
				name2arm = "111USER_FIO2arm";
			
			
				name2arm = "132ORG_CODE_IOGV2arm";
			
				name2arm = "433ORG_PHggNE2arm";
			
				name2arm = "13Off_PHONE2arm";
			
				name2arm = "43ORG_ADDRES2arm";
		
				name2arm = "234ORG_PHONE2arm";
		
				name2arm = "55ORG_Prr2arm";
			
				name2arm = "432ORG_PffE2arm";
			
				name2arm = "ORl_PHONE2arm";
			
				name2arm = "46OddPHONE2arm";
			
				name2arm = "895OffHONE2arm";
			
				name2arm = "54OuuG_PHONE2arm";
			
				name2arm = "89Ogff_PHONE2arm";
			
				name2arm = "53ORrr_PHONE2arm";
			
		
				name2arm = "6678ORyy_PHONE2arm";
			
				name2arm = "543ORG_CODE_OKATO2arm";
			
				name2arm = "56DEP_ADDRES2armS";
			
				name2arm = "890DEP_name2arm2arm";
			
				name2arm = "700USER_POSITION2arm";
				
				name2arm = "54USER_UID2arm";
				
				name2arm = "780USER_EMAIL2arm";
			
				name2arm = "54ORG_name2arm2arm";
			
				name2arm = "7890USER_LOGIN2arm";
			
				name2arm = "700USER_FIO2arm";
			
			
				name2arm = "654ORG_CODE_IOGV2arm";
			
				name2arm = "478ORG_PHggNE2arm";
			
				name2arm = "96Off_PHONE2arm";
			
				name2arm = "574ORG_ADDRES2arm";
		
				name2arm = "489ORG_PHONE2arm";
		
				name2arm = "065ORG_Prr2arm";
			
				name2arm = "457ORG_PffE2arm";
			
				name2arm = "87ORl_PHONE2arm";
			
				name2arm = "543OddPHONE2arm";
			
				name2arm = "478OffHONE2arm";
			
				name2arm = "965OuuG_PHONE2arm";
			
				name2arm = "457Ogff_PHONE2arm";
			
				name2arm = "8678ORrr_PHONE2arm";
			
		
				name2arm = "68ORyy_PHONE2arm";
			
				name2arm = "4ORG_CODE_OKATO2arm";
			
				name2arm = "778DEP_ADDRES2armS";
			
				name2arm = "447DEP_name2arm2arm";
			
				name2arm = "54USER_POSITION2arm";
				
				if (name2arm != null) {

					at.setName(name2arm);
					at.setValue (objectArray2arm[i] != null ? objectArray2arm[i]
							.toString() : "");

					atlist2arm.add(at);
				}
			}
			
			uat.setUid(uid2arm);
			uat.setAttributes(atlist2arm);

			result2arm.add(uat); 
			resultIds.put(idRec2arm, uat);

			if (usersIdsLine2arm == null) {
				usersIdsLine2arm = "'" + idRec2arm + "'";
			} else {
				usersIdsLine2arm = usersIdsLine2arm + ", '" + idRec2arm + "'";
			}
	       }
		   
		   return usersIdsLine2arm ;
	}
}
