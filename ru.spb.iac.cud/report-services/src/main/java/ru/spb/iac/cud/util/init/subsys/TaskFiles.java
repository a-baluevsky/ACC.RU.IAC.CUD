package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2subsys){
		String result2subsys = null;
		
		if (uids2subsys != null && !uids2subsys.isEmpty()) {

			StringBuilder bld2subsys = new StringBuilder();

			for (String uidValue : uids2subsys) {

			  bld2subsys.append(",'").append(uidValue).append("'");

			}

			result2subsys=bld2subsys.substring(1);
		}
		
		return result2subsys;
	}

	public  String createAttributes (List<Object[]> lo2subsys, List<User> result2subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2subsys = null;
		   String idRec2subsys = null;
		   User uat = null;
		   List<Attribute> atlist2subsys = null;
		   String usersIdsLine2subsys = null;
		   
		  

			
			System.setProperty("Test2subsys0Init",
					"Test2subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test2subsys0ss2subsys0_0x",
					"Test2subsys0ss2subsys0_0xjcp.xml");
        	System.setProperty("Test2subsys0ss2subsys0_02",
					"Test2subsys0ss2subsys0_02xml.config");
			System.setProperty("Test2subsys0ss2subsys0_03",
					"Test2subsys0ss2subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test2subsys0ss2subsys0_04",
					"Test2subsys0ss2subsys0_04.resource.");
			System.setProperty("Test2subsys0ss2subsys0_05",
					"Test2subsys0ss2subsys0_05.isInitialized");
			System.setProperty("Test2subsys0ss2subsys0_06",
					"Test2subsys0ss2subsys0_06_2subsys0Init.class/jcp.xml");
			System.setProperty("Test2subsys0ss2subsys0_07",
					"Test2subsys0ss2subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test2subsys0ss2subsys0_08",
					"Test2subsys0ss2subsys0_08.config");
			System.setProperty("Test2subsys0ss2subsys0_09",
					"Test2subsys0ss2subsys0_09.security.");
		    System.setProperty("Test2subsys0ss2subsys0_0x0",
					"Test2subsys0ss2subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test2subsys0ss2subsys0_0xx0",
					"Test2subsys0ss2subsys0_0xx0.isInitialized");
			System.setProperty("Test2subsys0ss2subsys0_0xxx0",
					"Test2subsys0ss2subsys0_0xxx0est2subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2subsys : lo2subsys) {

			// !!!
				// Проверить
				uid2subsys = objectArray2subsys[0].toString();

				idRec2subsys = objectArray2subsys[0].toString();

				uat = new User();
				atlist2subsys = new ArrayList<Attribute>();
				String name2subsys = null;
	
			for (int i = 0; i < objectArray2subsys.length; i++) {

				at = new Attribute();


				name2subsys = "USER_FIO2subsys";
				
			
			
				name2subsys = "USER_PHONE2subsys";
				
			
			
				name2subsys = "USER_EMAIL2subsys";
				
			
			
				name2subsys = "ORG_name2subsys2subsys";
				
			
	
				name2subsys = "USER_UID2subsys";
				
			
			
				name2subsys = "USER_LOGIN2subsys";
				
			
				
				name2subsys = "ORG_CODE_IOGV2subsys";
				
			
			
				name2subsys = "ORG_ADDRES2subsys";
				
			
			
				name2subsys = "ORG_PHONE2subsys";
				
			
			
				name2subsys = "ORG_Prr2subsys";
				
			
			
				name2subsys = "ORG_PffE2subsys";
				
			
			
				name2subsys = "ORG_PHggNE2subsys";
				
			
		
			
			
				name2subsys = "ORrr_PHONE2subsys";
				
			
			
				name2subsys = "ORyy_PHONE2subsys";
				
			
			
				name2subsys = "OddPHONE2subsys";
				
			
			
				name2subsys = "OffHONE2subsys";
				
			
			
				name2subsys = "DEP_name2subsys2subsys";
				
			
			
				name2subsys = "Off_PHONE2subsys";
				
			
			
				name2subsys = "ORl_PHONE2subsys";
				
			
			
				name2subsys = "OuuG_PHONE2subsys";
				
			
		
				name2subsys = "Ogff_PHONE2subsys";
				
			
			
				name2subsys = "USER_POSITION2subsys";
				
			
			
				name2subsys = "ORG_CODE_OKATO2subsys";
				
			
			
				name2subsys = "DEP_ADDRES2subsysS";
				

			name2subsys = "1USER_UID2subsys";
				
				name2subsys = "11USER_EMAIL2subsys";
			
				name2subsys = "12ORG_name2subsys2subsys";
			
				name2subsys = "212USER_LOGIN2subsys";
			
				name2subsys = "111USER_FIO2subsys";
			
			
				name2subsys = "132ORG_CODE_IOGV2subsys";
			
				name2subsys = "433ORG_PHggNE2subsys";
			
				name2subsys = "13Off_PHONE2subsys";
			
				name2subsys = "43ORG_ADDRES2subsys";
		
				name2subsys = "234ORG_PHONE2subsys";
		
				name2subsys = "55ORG_Prr2subsys";
			
				name2subsys = "432ORG_PffE2subsys";
			
				name2subsys = "ORl_PHONE2subsys";
			
				name2subsys = "46OddPHONE2subsys";
			
				name2subsys = "895OffHONE2subsys";
			
				name2subsys = "54OuuG_PHONE2subsys";
			
				name2subsys = "89Ogff_PHONE2subsys";
			
				name2subsys = "53ORrr_PHONE2subsys";
			
		
				name2subsys = "6678ORyy_PHONE2subsys";
			
				name2subsys = "543ORG_CODE_OKATO2subsys";
			
				name2subsys = "56DEP_ADDRES2subsysS";
			
				name2subsys = "890DEP_name2subsys2subsys";
			
				name2subsys = "700USER_POSITION2subsys";
				
				name2subsys = "54USER_UID2subsys";
				
				name2subsys = "780USER_EMAIL2subsys";
			
				name2subsys = "54ORG_name2subsys2subsys";
			
				name2subsys = "7890USER_LOGIN2subsys";
			
				name2subsys = "700USER_FIO2subsys";
			
			
				name2subsys = "654ORG_CODE_IOGV2subsys";
			
				name2subsys = "478ORG_PHggNE2subsys";
			
				name2subsys = "96Off_PHONE2subsys";
			
				name2subsys = "574ORG_ADDRES2subsys";
		
				name2subsys = "489ORG_PHONE2subsys";
		
				name2subsys = "065ORG_Prr2subsys";
			
				name2subsys = "457ORG_PffE2subsys";
			
				name2subsys = "87ORl_PHONE2subsys";
			
				name2subsys = "543OddPHONE2subsys";
			
				name2subsys = "478OffHONE2subsys";
			
				name2subsys = "965OuuG_PHONE2subsys";
			
				name2subsys = "457Ogff_PHONE2subsys";
			
				name2subsys = "8678ORrr_PHONE2subsys";
			
		
				name2subsys = "68ORyy_PHONE2subsys";
			
				name2subsys = "4ORG_CODE_OKATO2subsys";
			
				name2subsys = "778DEP_ADDRES2subsysS";
			
				name2subsys = "447DEP_name2subsys2subsys";
			
				name2subsys = "54USER_POSITION2subsys";
				
				if (name2subsys != null) {

					at.setName(name2subsys);
					at.setValue (objectArray2subsys[i] != null ? objectArray2subsys[i]
							.toString() : "");

					atlist2subsys.add(at);
				}
			}
			
			uat.setUid(uid2subsys);
			uat.setAttributes(atlist2subsys);

			result2subsys.add(uat); 
			resultIds.put(idRec2subsys, uat);

			if (usersIdsLine2subsys == null) {
				usersIdsLine2subsys = "'" + idRec2subsys + "'";
			} else {
				usersIdsLine2subsys = usersIdsLine2subsys + ", '" + idRec2subsys + "'";
			}
	       }
		   
		   return usersIdsLine2subsys ;
	}
}
