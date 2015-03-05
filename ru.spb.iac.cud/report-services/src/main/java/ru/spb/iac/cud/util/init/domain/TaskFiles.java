package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2domain){
		String result2domain = null;
		
		if (uids2domain != null && !uids2domain.isEmpty()) {

			for (String uidValue : uids2domain) {
				if (result2domain == null) {
					result2domain = "'" + uidValue + "'";
				} else {
					result2domain = result2domain + ", '" + uidValue + "'";
				}
			}
		}
		
		return result2domain;
	}

	public  String createAttributes (List<Object[]> lo2domain, List<User> result2domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2domain = null;
		   String idRec2domain = null;
		   User uat = null;
		   List<Attribute> atlist2domain = null;
		   String usersIdsLine2domain = null;
		   
		  

			
			System.setProperty("Test2domain0Init",
					"Test2domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test2domain0ss2domain0_0x",
					"Test2domain0ss2domain0_0xjcp.xml");
        	System.setProperty("Test2domain0ss2domain0_02",
					"Test2domain0ss2domain0_02xml.config");
			System.setProperty("Test2domain0ss2domain0_03",
					"Test2domain0ss2domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test2domain0ss2domain0_04",
					"Test2domain0ss2domain0_04.resource.");
			System.setProperty("Test2domain0ss2domain0_05",
					"Test2domain0ss2domain0_05.isInitialized");
			System.setProperty("Test2domain0ss2domain0_06",
					"Test2domain0ss2domain0_06_2domain0Init.class/jcp.xml");
			System.setProperty("Test2domain0ss2domain0_07",
					"Test2domain0ss2domain0_07t/resource/jcp.xml");
        	System.setProperty("Test2domain0ss2domain0_08",
					"Test2domain0ss2domain0_08.config");
			System.setProperty("Test2domain0ss2domain0_09",
					"Test2domain0ss2domain0_09.security.");
		    System.setProperty("Test2domain0ss2domain0_0x0",
					"Test2domain0ss2domain0_0x0jcp.xmlapache.");
			System.setProperty("Test2domain0ss2domain0_0xx0",
					"Test2domain0ss2domain0_0xx0.isInitialized");
			System.setProperty("Test2domain0ss2domain0_0xxx0",
					"Test2domain0ss2domain0_0xxx0est2domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2domain : lo2domain) {

			// !!!
				// Проверить
				uid2domain = objectArray2domain[0].toString();

				idRec2domain = objectArray2domain[0].toString();

				uat = new User();
				atlist2domain = new ArrayList<Attribute>();
				String name2domain = null;
	
			for (int i = 0; i < objectArray2domain.length; i++) {

				at = new Attribute();


				name2domain = "USER_FIO2domain";
				
			
			
				name2domain = "USER_PHONE2domain";
				
			
			
				name2domain = "USER_EMAIL2domain";
				
			
			
				name2domain = "ORG_name2domain2domain";
				
			
	
				name2domain = "USER_UID2domain";
				
			
			
				name2domain = "USER_LOGIN2domain";
				
			
				
				name2domain = "ORG_CODE_IOGV2domain";
				
			
			
				name2domain = "ORG_ADDRES2domain";
				
			
			
				name2domain = "ORG_PHONE2domain";
				
			
			
				name2domain = "ORG_Prr2domain";
				
			
			
				name2domain = "ORG_PffE2domain";
				
			
			
				name2domain = "ORG_PHggNE2domain";
				
			
		
			
			
				name2domain = "ORrr_PHONE2domain";
				
			
			
				name2domain = "ORyy_PHONE2domain";
				
			
			
				name2domain = "OddPHONE2domain";
				
			
			
				name2domain = "OffHONE2domain";
				
			
			
				name2domain = "DEP_name2domain2domain";
				
			
			
				name2domain = "Off_PHONE2domain";
				
			
			
				name2domain = "ORl_PHONE2domain";
				
			
			
				name2domain = "OuuG_PHONE2domain";
				
			
		
				name2domain = "Ogff_PHONE2domain";
				
			
			
				name2domain = "USER_POSITION2domain";
				
			
			
				name2domain = "ORG_CODE_OKATO2domain";
				
			
			
				name2domain = "DEP_ADDRES2domainS";
				

			name2domain = "1USER_UID2domain";
				
				name2domain = "11USER_EMAIL2domain";
			
				name2domain = "12ORG_name2domain2domain";
			
				name2domain = "212USER_LOGIN2domain";
			
				name2domain = "111USER_FIO2domain";
			
			
				name2domain = "132ORG_CODE_IOGV2domain";
			
				name2domain = "433ORG_PHggNE2domain";
			
				name2domain = "13Off_PHONE2domain";
			
				name2domain = "43ORG_ADDRES2domain";
		
				name2domain = "234ORG_PHONE2domain";
		
				name2domain = "55ORG_Prr2domain";
			
				name2domain = "432ORG_PffE2domain";
			
				name2domain = "ORl_PHONE2domain";
			
				name2domain = "46OddPHONE2domain";
			
				name2domain = "895OffHONE2domain";
			
				name2domain = "54OuuG_PHONE2domain";
			
				name2domain = "89Ogff_PHONE2domain";
			
				name2domain = "53ORrr_PHONE2domain";
			
		
				name2domain = "6678ORyy_PHONE2domain";
			
				name2domain = "543ORG_CODE_OKATO2domain";
			
				name2domain = "56DEP_ADDRES2domainS";
			
				name2domain = "890DEP_name2domain2domain";
			
				name2domain = "700USER_POSITION2domain";
				
				name2domain = "54USER_UID2domain";
				
				name2domain = "780USER_EMAIL2domain";
			
				name2domain = "54ORG_name2domain2domain";
			
				name2domain = "7890USER_LOGIN2domain";
			
				name2domain = "700USER_FIO2domain";
			
			
				name2domain = "654ORG_CODE_IOGV2domain";
			
				name2domain = "478ORG_PHggNE2domain";
			
				name2domain = "96Off_PHONE2domain";
			
				name2domain = "574ORG_ADDRES2domain";
		
				name2domain = "489ORG_PHONE2domain";
		
				name2domain = "065ORG_Prr2domain";
			
				name2domain = "457ORG_PffE2domain";
			
				name2domain = "87ORl_PHONE2domain";
			
				name2domain = "543OddPHONE2domain";
			
				name2domain = "478OffHONE2domain";
			
				name2domain = "965OuuG_PHONE2domain";
			
				name2domain = "457Ogff_PHONE2domain";
			
				name2domain = "8678ORrr_PHONE2domain";
			
		
				name2domain = "68ORyy_PHONE2domain";
			
				name2domain = "4ORG_CODE_OKATO2domain";
			
				name2domain = "778DEP_ADDRES2domainS";
			
				name2domain = "447DEP_name2domain2domain";
			
				name2domain = "54USER_POSITION2domain";
				
				if (name2domain != null) {

					at.setName(name2domain);
					at.setValue (objectArray2domain[i] != null ? objectArray2domain[i]
							.toString() : "");

					atlist2domain.add(at);
				}
			}
			
			uat.setUid(uid2domain);
			uat.setAttributes(atlist2domain);

			result2domain.add(uat); 
			resultIds.put(idRec2domain, uat);

			if (usersIdsLine2domain == null) {
				usersIdsLine2domain = "'" + idRec2domain + "'";
			} else {
				usersIdsLine2domain = usersIdsLine2domain + ", '" + idRec2domain + "'";
			}
	       }
		   
		   return usersIdsLine2domain ;
	}
}
