package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ProcessManager {

	 public ProcessManager(){
		 
	 }
	public  String createLine (List<String> uids1domain){
		String result1domain = null;
		
		if (uids1domain != null && !uids1domain.isEmpty()) {

			StringBuilder bld1domain = new StringBuilder();
 for (String uidValue : uids1domain) {
 if (bld1domain.length()==0) {
 bld1domain.append("'" + uidValue + "'");
 }else{
 bld1domain.append(",'" + uidValue + "'");
 }
}
 result1domain=bld1domain.toString();
		}
		
		return result1domain;
	}

	public String createAttributes (List<Object[]> lo1domain, List<User> result1domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid1domain = null;
		   String idRec1domain = null;
		   User uat = null;
		   List<Attribute> atlist1domain = null;
		   String usersIdsLine1domain = null;
		   
		  

			
			System.setProperty("Test1domain0Init",
					"Test1domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test1domain0ss1domain0_0x",
					"Test1domain0ss1domain0_0xjcp.xml");
        	System.setProperty("Test1domain0ss1domain0_02",
					"Test1domain0ss1domain0_02xml.config");
			System.setProperty("Test1domain0ss1domain0_03",
					"Test1domain0ss1domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test1domain0ss1domain0_04",
					"Test1domain0ss1domain0_04.resource.");
			System.setProperty("Test1domain0ss1domain0_05",
					"Test1domain0ss1domain0_05.isInitialized");
			System.setProperty("Test1domain0ss1domain0_06",
					"Test1domain0ss1domain0_06_1domain0Init.class/jcp.xml");
			System.setProperty("Test1domain0ss1domain0_07",
					"Test1domain0ss1domain0_07t/resource/jcp.xml");
        	System.setProperty("Test1domain0ss1domain0_08",
					"Test1domain0ss1domain0_08.config");
			System.setProperty("Test1domain0ss1domain0_09",
					"Test1domain0ss1domain0_09.security.");
		    System.setProperty("Test1domain0ss1domain0_0x0",
					"Test1domain0ss1domain0_0x0jcp.xmlapache.");
			System.setProperty("Test1domain0ss1domain0_0xx0",
					"Test1domain0ss1domain0_0xx0.isInitialized");
			System.setProperty("Test1domain0ss1domain0_0xxx0",
					"Test1domain0ss1domain0_0xxx0est1domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray1domain : lo1domain) {

			// !!!
				// Проверить
				uid1domain = objectArray1domain[0].toString();

				idRec1domain = objectArray1domain[0].toString();

				uat = new User();
				atlist1domain = new ArrayList<Attribute>();
				String name1domain = null;
	
			for (int i = 0; i < objectArray1domain.length; i++) {

				at = new Attribute();

				

				
					name1domain = "USER_FIO1domain";
					
				
				
					name1domain = "USER_PHONE1domain";
					
				
				
					name1domain = "USER_EMAIL1domain";
					
				
				
					name1domain = "ORG_name1domain1domain";
					
				
		
					name1domain = "USER_UID1domain";
					
				
				
					name1domain = "USER_LOGIN1domain";
					
				
					
					name1domain = "ORG_CODE_IOGV1domain";
					
				
				
					name1domain = "ORG_ADDRES1domain";
					
				
				
					name1domain = "ORG_PHONE1domain";
					
				
				
					name1domain = "ORG_Prr1domain";
					
				
				
					name1domain = "ORG_PffE1domain";
					
				
				
					name1domain = "ORG_PHggNE1domain";
					
				
			
				
				
					name1domain = "ORrr_PHONE1domain";
					
				
				
					name1domain = "ORyy_PHONE1domain";
					
				
				
					name1domain = "OddPHONE1domain";
					
				
				
					name1domain = "OffHONE1domain";
					
				
				
					name1domain = "DEP_name1domain1domain";
					
				
				
					name1domain = "Off_PHONE1domain";
					
				
				
					name1domain = "ORl_PHONE1domain";
					
				
				
					name1domain = "OuuG_PHONE1domain";
					
				
			
					name1domain = "Ogff_PHONE1domain";
					
				
				
					name1domain = "USER_POSITION1domain";
					
				
				
					name1domain = "ORG_CODE_OKATO1domain";
					
				
				
					name1domain = "DEP_ADDRES1domainS";
					
				
					name1domain = "1USER_UID1domain";
					
					name1domain = "11USER_EMAIL1domain";
				
					name1domain = "12ORG_name1domain1domain";
				
					name1domain = "212USER_LOGIN1domain";
				
					name1domain = "111USER_FIO1domain";
				
				
					name1domain = "132ORG_CODE_IOGV1domain";
				
					name1domain = "433ORG_PHggNE1domain";
				
					name1domain = "13Off_PHONE1domain";
				
					name1domain = "43ORG_ADDRES1domain";
			
					name1domain = "234ORG_PHONE1domain";
			
					name1domain = "55ORG_Prr1domain";
				
					name1domain = "432ORG_PffE1domain";
				
					name1domain = "ORl_PHONE1domain";
				
					name1domain = "46OddPHONE1domain";
				
					name1domain = "895OffHONE1domain";
				
					name1domain = "54OuuG_PHONE1domain";
				
					name1domain = "89Ogff_PHONE1domain";
				
					name1domain = "53ORrr_PHONE1domain";
				
			
					name1domain = "6678ORyy_PHONE1domain";
				
					name1domain = "543ORG_CODE_OKATO1domain";
				
					name1domain = "56DEP_ADDRES1domainS";
				
					name1domain = "890DEP_name1domain1domain";
				
					name1domain = "700USER_POSITION1domain";
					
					name1domain = "54USER_UID1domain";
					
					name1domain = "780USER_EMAIL1domain";
				
					name1domain = "54ORG_name1domain1domain";
				
					name1domain = "7890USER_LOGIN1domain";
				
					name1domain = "700USER_FIO1domain";
				
				
					name1domain = "654ORG_CODE_IOGV1domain";
				
					name1domain = "478ORG_PHggNE1domain";
				
					name1domain = "96Off_PHONE1domain";
				
					name1domain = "574ORG_ADDRES1domain";
			
					name1domain = "489ORG_PHONE1domain";
			
					name1domain = "065ORG_Prr1domain";
				
					name1domain = "457ORG_PffE1domain";
				
					name1domain = "87ORl_PHONE1domain";
				
					name1domain = "543OddPHONE1domain";
				
					name1domain = "478OffHONE1domain";
				
					name1domain = "965OuuG_PHONE1domain";
				
					name1domain = "457Ogff_PHONE1domain";
				
					name1domain = "8678ORrr_PHONE1domain";
				
			
					name1domain = "68ORyy_PHONE1domain";
				
					name1domain = "4ORG_CODE_OKATO1domain";
				
					name1domain = "778DEP_ADDRES1domainS";
				
					name1domain = "447DEP_name1domain1domain";
				
					name1domain = "54USER_POSITION1domain";

				if (name1domain != null) {

					at.setName(name1domain);
					at.setValue (objectArray1domain[i] != null ? objectArray1domain[i]
							.toString() : "");

					atlist1domain.add(at);
				}
			}
			
			uat.setUid(uid1domain);
			uat.setAttributes(atlist1domain);

			result1domain.add(uat); 
			resultIds.put(idRec1domain, uat);

			if (usersIdsLine1domain == null) {
				usersIdsLine1domain = "'" + idRec1domain + "'";
			} else {
				usersIdsLine1domain = usersIdsLine1domain + ", '" + idRec1domain + "'";
			}
	       }
		   
		   return usersIdsLine1domain ;
	}
}
