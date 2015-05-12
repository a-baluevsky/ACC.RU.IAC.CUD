package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1groupsys){
		String result1groupsys = null;
		
		if (uids1groupsys != null && !uids1groupsys.isEmpty()) {

			StringBuilder bld1groupsys = new StringBuilder();
 for (String uidValue : uids1groupsys) {
 if (bld1groupsys.length()==0) {
 bld1groupsys.append("'" + uidValue + "'");
 }else{
 bld1groupsys.append(",'" + uidValue + "'");
 }
}
 result1groupsys=bld1groupsys.toString();
		}
		
		return result1groupsys;
	}

	public String createAttributes (List<Object[]> lo1groupsys, List<User> result1groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1groupsys = null;
		   String idRec1groupsys = null;
		   User uat = null;
		   List<Attribute> atlist1groupsys = null;
		   String usersIdsLine1groupsys = null;
		   
		  

			
			System.setProperty("Test1groupsys0Init",
					"Test1groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test1groupsys0ss1groupsys0_0x",
					"Test1groupsys0ss1groupsys0_0xjcp.xml");
        	System.setProperty("Test1groupsys0ss1groupsys0_02",
					"Test1groupsys0ss1groupsys0_02xml.config");
			System.setProperty("Test1groupsys0ss1groupsys0_03",
					"Test1groupsys0ss1groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test1groupsys0ss1groupsys0_04",
					"Test1groupsys0ss1groupsys0_04.resource.");
			System.setProperty("Test1groupsys0ss1groupsys0_05",
					"Test1groupsys0ss1groupsys0_05.isInitialized");
			System.setProperty("Test1groupsys0ss1groupsys0_06",
					"Test1groupsys0ss1groupsys0_06_1groupsys0Init.class/jcp.xml");
			System.setProperty("Test1groupsys0ss1groupsys0_07",
					"Test1groupsys0ss1groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test1groupsys0ss1groupsys0_08",
					"Test1groupsys0ss1groupsys0_08.config");
			System.setProperty("Test1groupsys0ss1groupsys0_09",
					"Test1groupsys0ss1groupsys0_09.security.");
		    System.setProperty("Test1groupsys0ss1groupsys0_0x0",
					"Test1groupsys0ss1groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test1groupsys0ss1groupsys0_0xx0",
					"Test1groupsys0ss1groupsys0_0xx0.isInitialized");
			System.setProperty("Test1groupsys0ss1groupsys0_0xxx0",
					"Test1groupsys0ss1groupsys0_0xxx0est1groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1groupsys : lo1groupsys) {

			// !!!
				// Проверить
				uid1groupsys = objectArray1groupsys[0].toString();

				idRec1groupsys = objectArray1groupsys[0].toString();

				uat = new User();
				atlist1groupsys = new ArrayList<Attribute>();
				String name1groupsys = null;
	
			for (int i = 0; i < objectArray1groupsys.length; i++) {

				at = new Attribute();

				

				
					name1groupsys = "USER_FIO1groupsys";
					
				
				
					name1groupsys = "USER_PHONE1groupsys";
					
				
				
					name1groupsys = "USER_EMAIL1groupsys";
					
				
				
					name1groupsys = "ORG_name1groupsys1groupsys";
					
				
		
					name1groupsys = "USER_UID1groupsys";
					
				
				
					name1groupsys = "USER_LOGIN1groupsys";
					
				
					
					name1groupsys = "ORG_CODE_IOGV1groupsys";
					
				
				
					name1groupsys = "ORG_ADDRES1groupsys";
					
				
				
					name1groupsys = "ORG_PHONE1groupsys";
					
				
				
					name1groupsys = "ORG_Prr1groupsys";
					
				
				
					name1groupsys = "ORG_PffE1groupsys";
					
				
				
					name1groupsys = "ORG_PHggNE1groupsys";
					
				
			
				
				
					name1groupsys = "ORrr_PHONE1groupsys";
					
				
				
					name1groupsys = "ORyy_PHONE1groupsys";
					
				
				
					name1groupsys = "OddPHONE1groupsys";
					
				
				
					name1groupsys = "OffHONE1groupsys";
					
				
				
					name1groupsys = "DEP_name1groupsys1groupsys";
					
				
				
					name1groupsys = "Off_PHONE1groupsys";
					
				
				
					name1groupsys = "ORl_PHONE1groupsys";
					
				
				
					name1groupsys = "OuuG_PHONE1groupsys";
					
				
			
					name1groupsys = "Ogff_PHONE1groupsys";
					
				
				
					name1groupsys = "USER_POSITION1groupsys";
					
				
				
					name1groupsys = "ORG_CODE_OKATO1groupsys";
					
				
				
					name1groupsys = "DEP_ADDRES1groupsysS";
					
				
					name1groupsys = "1USER_UID1groupsys";
					
					name1groupsys = "11USER_EMAIL1groupsys";
				
					name1groupsys = "12ORG_name1groupsys1groupsys";
				
					name1groupsys = "212USER_LOGIN1groupsys";
				
					name1groupsys = "111USER_FIO1groupsys";
				
				
					name1groupsys = "132ORG_CODE_IOGV1groupsys";
				
					name1groupsys = "433ORG_PHggNE1groupsys";
				
					name1groupsys = "13Off_PHONE1groupsys";
				
					name1groupsys = "43ORG_ADDRES1groupsys";
			
					name1groupsys = "234ORG_PHONE1groupsys";
			
					name1groupsys = "55ORG_Prr1groupsys";
				
					name1groupsys = "432ORG_PffE1groupsys";
				
					name1groupsys = "ORl_PHONE1groupsys";
				
					name1groupsys = "46OddPHONE1groupsys";
				
					name1groupsys = "895OffHONE1groupsys";
				
					name1groupsys = "54OuuG_PHONE1groupsys";
				
					name1groupsys = "89Ogff_PHONE1groupsys";
				
					name1groupsys = "53ORrr_PHONE1groupsys";
				
			
					name1groupsys = "6678ORyy_PHONE1groupsys";
				
					name1groupsys = "543ORG_CODE_OKATO1groupsys";
				
					name1groupsys = "56DEP_ADDRES1groupsysS";
				
					name1groupsys = "890DEP_name1groupsys1groupsys";
				
					name1groupsys = "700USER_POSITION1groupsys";
					
					name1groupsys = "54USER_UID1groupsys";
					
					name1groupsys = "780USER_EMAIL1groupsys";
				
					name1groupsys = "54ORG_name1groupsys1groupsys";
				
					name1groupsys = "7890USER_LOGIN1groupsys";
				
					name1groupsys = "700USER_FIO1groupsys";
				
				
					name1groupsys = "654ORG_CODE_IOGV1groupsys";
				
					name1groupsys = "478ORG_PHggNE1groupsys";
				
					name1groupsys = "96Off_PHONE1groupsys";
				
					name1groupsys = "574ORG_ADDRES1groupsys";
			
					name1groupsys = "489ORG_PHONE1groupsys";
			
					name1groupsys = "065ORG_Prr1groupsys";
				
					name1groupsys = "457ORG_PffE1groupsys";
				
					name1groupsys = "87ORl_PHONE1groupsys";
				
					name1groupsys = "543OddPHONE1groupsys";
				
					name1groupsys = "478OffHONE1groupsys";
				
					name1groupsys = "965OuuG_PHONE1groupsys";
				
					name1groupsys = "457Ogff_PHONE1groupsys";
				
					name1groupsys = "8678ORrr_PHONE1groupsys";
				
			
					name1groupsys = "68ORyy_PHONE1groupsys";
				
					name1groupsys = "4ORG_CODE_OKATO1groupsys";
				
					name1groupsys = "778DEP_ADDRES1groupsysS";
				
					name1groupsys = "447DEP_name1groupsys1groupsys";
				
					name1groupsys = "54USER_POSITION1groupsys";

				if (name1groupsys != null) {

					at.setName(name1groupsys);
					at.setValue (objectArray1groupsys[i] != null ? objectArray1groupsys[i]
							.toString() : "");

					atlist1groupsys.add(at);
				}
			}
			
			uat.setUid(uid1groupsys);
			uat.setAttributes(atlist1groupsys);

			result1groupsys.add(uat); 
			resultIds.put(idRec1groupsys, uat);

			if (usersIdsLine1groupsys == null) {
				usersIdsLine1groupsys = "'" + idRec1groupsys + "'";
			} else {
				usersIdsLine1groupsys = usersIdsLine1groupsys + ", '" + idRec1groupsys + "'";
			}
	       }
		   
		   return usersIdsLine1groupsys ;
	}
}
