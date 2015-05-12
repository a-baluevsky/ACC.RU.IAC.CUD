package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2org){
		String result2org = null;
		
		if (uids2org != null && !uids2org.isEmpty()) {

			StringBuilder bld2org = new StringBuilder();

			for (String uidValue : uids2org) {

			  bld2org.append(",'").append(uidValue).append("'");

			}

			result2org=bld2org.substring(1);
		}
		
		return result2org;
	}

	public  String createAttributes (List<Object[]> lo2org, List<User> result2org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2org = null;
		   String idRec2org = null;
		   User uat = null;
		   List<Attribute> atlist2org = null;
		   String usersIdsLine2org = null;
		   
		  

			
			System.setProperty("Test2org0Init",
					"Test2org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2org0Init.class/jcp.xml");
			
			
			System.setProperty("Test2org0ss2org0_0x",
					"Test2org0ss2org0_0xjcp.xml");
        	System.setProperty("Test2org0ss2org0_02",
					"Test2org0ss2org0_02xml.config");
			System.setProperty("Test2org0ss2org0_03",
					"Test2org0ss2org0_03.apache.xml.resource.security.");
		    System.setProperty("Test2org0ss2org0_04",
					"Test2org0ss2org0_04.resource.");
			System.setProperty("Test2org0ss2org0_05",
					"Test2org0ss2org0_05.isInitialized");
			System.setProperty("Test2org0ss2org0_06",
					"Test2org0ss2org0_06_2org0Init.class/jcp.xml");
			System.setProperty("Test2org0ss2org0_07",
					"Test2org0ss2org0_07t/resource/jcp.xml");
        	System.setProperty("Test2org0ss2org0_08",
					"Test2org0ss2org0_08.config");
			System.setProperty("Test2org0ss2org0_09",
					"Test2org0ss2org0_09.security.");
		    System.setProperty("Test2org0ss2org0_0x0",
					"Test2org0ss2org0_0x0jcp.xmlapache.");
			System.setProperty("Test2org0ss2org0_0xx0",
					"Test2org0ss2org0_0xx0.isInitialized");
			System.setProperty("Test2org0ss2org0_0xxx0",
					"Test2org0ss2org0_0xxx0est2org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2org : lo2org) {

			// !!!
				// Проверить
				uid2org = objectArray2org[0].toString();

				idRec2org = objectArray2org[0].toString();

				uat = new User();
				atlist2org = new ArrayList<Attribute>();
				String name2org = null;
	
			for (int i = 0; i < objectArray2org.length; i++) {

				at = new Attribute();


				name2org = "USER_FIO2org";
				
			
			
				name2org = "USER_PHONE2org";
				
			
			
				name2org = "USER_EMAIL2org";
				
			
			
				name2org = "ORG_name2org2org";
				
			
	
				name2org = "USER_UID2org";
				
			
			
				name2org = "USER_LOGIN2org";
				
			
				
				name2org = "ORG_CODE_IOGV2org";
				
			
			
				name2org = "ORG_ADDRES2org";
				
			
			
				name2org = "ORG_PHONE2org";
				
			
			
				name2org = "ORG_Prr2org";
				
			
			
				name2org = "ORG_PffE2org";
				
			
			
				name2org = "ORG_PHggNE2org";
				
			
		
			
			
				name2org = "ORrr_PHONE2org";
				
			
			
				name2org = "ORyy_PHONE2org";
				
			
			
				name2org = "OddPHONE2org";
				
			
			
				name2org = "OffHONE2org";
				
			
			
				name2org = "DEP_name2org2org";
				
			
			
				name2org = "Off_PHONE2org";
				
			
			
				name2org = "ORl_PHONE2org";
				
			
			
				name2org = "OuuG_PHONE2org";
				
			
		
				name2org = "Ogff_PHONE2org";
				
			
			
				name2org = "USER_POSITION2org";
				
			
			
				name2org = "ORG_CODE_OKATO2org";
				
			
			
				name2org = "DEP_ADDRES2orgS";
				

			name2org = "1USER_UID2org";
				
				name2org = "11USER_EMAIL2org";
			
				name2org = "12ORG_name2org2org";
			
				name2org = "212USER_LOGIN2org";
			
				name2org = "111USER_FIO2org";
			
			
				name2org = "132ORG_CODE_IOGV2org";
			
				name2org = "433ORG_PHggNE2org";
			
				name2org = "13Off_PHONE2org";
			
				name2org = "43ORG_ADDRES2org";
		
				name2org = "234ORG_PHONE2org";
		
				name2org = "55ORG_Prr2org";
			
				name2org = "432ORG_PffE2org";
			
				name2org = "ORl_PHONE2org";
			
				name2org = "46OddPHONE2org";
			
				name2org = "895OffHONE2org";
			
				name2org = "54OuuG_PHONE2org";
			
				name2org = "89Ogff_PHONE2org";
			
				name2org = "53ORrr_PHONE2org";
			
		
				name2org = "6678ORyy_PHONE2org";
			
				name2org = "543ORG_CODE_OKATO2org";
			
				name2org = "56DEP_ADDRES2orgS";
			
				name2org = "890DEP_name2org2org";
			
				name2org = "700USER_POSITION2org";
				
				name2org = "54USER_UID2org";
				
				name2org = "780USER_EMAIL2org";
			
				name2org = "54ORG_name2org2org";
			
				name2org = "7890USER_LOGIN2org";
			
				name2org = "700USER_FIO2org";
			
			
				name2org = "654ORG_CODE_IOGV2org";
			
				name2org = "478ORG_PHggNE2org";
			
				name2org = "96Off_PHONE2org";
			
				name2org = "574ORG_ADDRES2org";
		
				name2org = "489ORG_PHONE2org";
		
				name2org = "065ORG_Prr2org";
			
				name2org = "457ORG_PffE2org";
			
				name2org = "87ORl_PHONE2org";
			
				name2org = "543OddPHONE2org";
			
				name2org = "478OffHONE2org";
			
				name2org = "965OuuG_PHONE2org";
			
				name2org = "457Ogff_PHONE2org";
			
				name2org = "8678ORrr_PHONE2org";
			
		
				name2org = "68ORyy_PHONE2org";
			
				name2org = "4ORG_CODE_OKATO2org";
			
				name2org = "778DEP_ADDRES2orgS";
			
				name2org = "447DEP_name2org2org";
			
				name2org = "54USER_POSITION2org";
				
				if (name2org != null) {

					at.setName(name2org);
					at.setValue (objectArray2org[i] != null ? objectArray2org[i]
							.toString() : "");

					atlist2org.add(at);
				}
			}
			
			uat.setUid(uid2org);
			uat.setAttributes(atlist2org);

			result2org.add(uat); 
			resultIds.put(idRec2org, uat);

			if (usersIdsLine2org == null) {
				usersIdsLine2org = "'" + idRec2org + "'";
			} else {
				usersIdsLine2org = usersIdsLine2org + ", '" + idRec2org + "'";
			}
	       }
		   
		   return usersIdsLine2org ;
	}
}
