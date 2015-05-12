package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2groupsys){
		String result2groupsys = null;
		
		if (uids2groupsys != null && !uids2groupsys.isEmpty()) {

			StringBuilder bld2groupsys = new StringBuilder();

			for (String uidValue : uids2groupsys) {

			  bld2groupsys.append(",'").append(uidValue).append("'");

			}

			result2groupsys=bld2groupsys.substring(1);
		}
		
		return result2groupsys;
	}

	public  String createAttributes (List<Object[]> lo2groupsys, List<User> result2groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2groupsys = null;
		   String idRec2groupsys = null;
		   User uat = null;
		   List<Attribute> atlist2groupsys = null;
		   String usersIdsLine2groupsys = null;
		   
		  

			
			System.setProperty("Test2groupsys0Init",
					"Test2groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test2groupsys0ss2groupsys0_0x",
					"Test2groupsys0ss2groupsys0_0xjcp.xml");
        	System.setProperty("Test2groupsys0ss2groupsys0_02",
					"Test2groupsys0ss2groupsys0_02xml.config");
			System.setProperty("Test2groupsys0ss2groupsys0_03",
					"Test2groupsys0ss2groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test2groupsys0ss2groupsys0_04",
					"Test2groupsys0ss2groupsys0_04.resource.");
			System.setProperty("Test2groupsys0ss2groupsys0_05",
					"Test2groupsys0ss2groupsys0_05.isInitialized");
			System.setProperty("Test2groupsys0ss2groupsys0_06",
					"Test2groupsys0ss2groupsys0_06_2groupsys0Init.class/jcp.xml");
			System.setProperty("Test2groupsys0ss2groupsys0_07",
					"Test2groupsys0ss2groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test2groupsys0ss2groupsys0_08",
					"Test2groupsys0ss2groupsys0_08.config");
			System.setProperty("Test2groupsys0ss2groupsys0_09",
					"Test2groupsys0ss2groupsys0_09.security.");
		    System.setProperty("Test2groupsys0ss2groupsys0_0x0",
					"Test2groupsys0ss2groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test2groupsys0ss2groupsys0_0xx0",
					"Test2groupsys0ss2groupsys0_0xx0.isInitialized");
			System.setProperty("Test2groupsys0ss2groupsys0_0xxx0",
					"Test2groupsys0ss2groupsys0_0xxx0est2groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2groupsys : lo2groupsys) {

			// !!!
				// Проверить
				uid2groupsys = objectArray2groupsys[0].toString();

				idRec2groupsys = objectArray2groupsys[0].toString();

				uat = new User();
				atlist2groupsys = new ArrayList<Attribute>();
				String name2groupsys = null;
	
			for (int i = 0; i < objectArray2groupsys.length; i++) {

				at = new Attribute();


				name2groupsys = "USER_FIO2groupsys";
				
			
			
				name2groupsys = "USER_PHONE2groupsys";
				
			
			
				name2groupsys = "USER_EMAIL2groupsys";
				
			
			
				name2groupsys = "ORG_name2groupsys2groupsys";
				
			
	
				name2groupsys = "USER_UID2groupsys";
				
			
			
				name2groupsys = "USER_LOGIN2groupsys";
				
			
				
				name2groupsys = "ORG_CODE_IOGV2groupsys";
				
			
			
				name2groupsys = "ORG_ADDRES2groupsys";
				
			
			
				name2groupsys = "ORG_PHONE2groupsys";
				
			
			
				name2groupsys = "ORG_Prr2groupsys";
				
			
			
				name2groupsys = "ORG_PffE2groupsys";
				
			
			
				name2groupsys = "ORG_PHggNE2groupsys";
				
			
		
			
			
				name2groupsys = "ORrr_PHONE2groupsys";
				
			
			
				name2groupsys = "ORyy_PHONE2groupsys";
				
			
			
				name2groupsys = "OddPHONE2groupsys";
				
			
			
				name2groupsys = "OffHONE2groupsys";
				
			
			
				name2groupsys = "DEP_name2groupsys2groupsys";
				
			
			
				name2groupsys = "Off_PHONE2groupsys";
				
			
			
				name2groupsys = "ORl_PHONE2groupsys";
				
			
			
				name2groupsys = "OuuG_PHONE2groupsys";
				
			
		
				name2groupsys = "Ogff_PHONE2groupsys";
				
			
			
				name2groupsys = "USER_POSITION2groupsys";
				
			
			
				name2groupsys = "ORG_CODE_OKATO2groupsys";
				
			
			
				name2groupsys = "DEP_ADDRES2groupsysS";
				

			name2groupsys = "1USER_UID2groupsys";
				
				name2groupsys = "11USER_EMAIL2groupsys";
			
				name2groupsys = "12ORG_name2groupsys2groupsys";
			
				name2groupsys = "212USER_LOGIN2groupsys";
			
				name2groupsys = "111USER_FIO2groupsys";
			
			
				name2groupsys = "132ORG_CODE_IOGV2groupsys";
			
				name2groupsys = "433ORG_PHggNE2groupsys";
			
				name2groupsys = "13Off_PHONE2groupsys";
			
				name2groupsys = "43ORG_ADDRES2groupsys";
		
				name2groupsys = "234ORG_PHONE2groupsys";
		
				name2groupsys = "55ORG_Prr2groupsys";
			
				name2groupsys = "432ORG_PffE2groupsys";
			
				name2groupsys = "ORl_PHONE2groupsys";
			
				name2groupsys = "46OddPHONE2groupsys";
			
				name2groupsys = "895OffHONE2groupsys";
			
				name2groupsys = "54OuuG_PHONE2groupsys";
			
				name2groupsys = "89Ogff_PHONE2groupsys";
			
				name2groupsys = "53ORrr_PHONE2groupsys";
			
		
				name2groupsys = "6678ORyy_PHONE2groupsys";
			
				name2groupsys = "543ORG_CODE_OKATO2groupsys";
			
				name2groupsys = "56DEP_ADDRES2groupsysS";
			
				name2groupsys = "890DEP_name2groupsys2groupsys";
			
				name2groupsys = "700USER_POSITION2groupsys";
				
				name2groupsys = "54USER_UID2groupsys";
				
				name2groupsys = "780USER_EMAIL2groupsys";
			
				name2groupsys = "54ORG_name2groupsys2groupsys";
			
				name2groupsys = "7890USER_LOGIN2groupsys";
			
				name2groupsys = "700USER_FIO2groupsys";
			
			
				name2groupsys = "654ORG_CODE_IOGV2groupsys";
			
				name2groupsys = "478ORG_PHggNE2groupsys";
			
				name2groupsys = "96Off_PHONE2groupsys";
			
				name2groupsys = "574ORG_ADDRES2groupsys";
		
				name2groupsys = "489ORG_PHONE2groupsys";
		
				name2groupsys = "065ORG_Prr2groupsys";
			
				name2groupsys = "457ORG_PffE2groupsys";
			
				name2groupsys = "87ORl_PHONE2groupsys";
			
				name2groupsys = "543OddPHONE2groupsys";
			
				name2groupsys = "478OffHONE2groupsys";
			
				name2groupsys = "965OuuG_PHONE2groupsys";
			
				name2groupsys = "457Ogff_PHONE2groupsys";
			
				name2groupsys = "8678ORrr_PHONE2groupsys";
			
		
				name2groupsys = "68ORyy_PHONE2groupsys";
			
				name2groupsys = "4ORG_CODE_OKATO2groupsys";
			
				name2groupsys = "778DEP_ADDRES2groupsysS";
			
				name2groupsys = "447DEP_name2groupsys2groupsys";
			
				name2groupsys = "54USER_POSITION2groupsys";
				
				if (name2groupsys != null) {

					at.setName(name2groupsys);
					at.setValue (objectArray2groupsys[i] != null ? objectArray2groupsys[i]
							.toString() : "");

					atlist2groupsys.add(at);
				}
			}
			
			uat.setUid(uid2groupsys);
			uat.setAttributes(atlist2groupsys);

			result2groupsys.add(uat); 
			resultIds.put(idRec2groupsys, uat);

			if (usersIdsLine2groupsys == null) {
				usersIdsLine2groupsys = "'" + idRec2groupsys + "'";
			} else {
				usersIdsLine2groupsys = usersIdsLine2groupsys + ", '" + idRec2groupsys + "'";
			}
	       }
		   
		   return usersIdsLine2groupsys ;
	}
}
