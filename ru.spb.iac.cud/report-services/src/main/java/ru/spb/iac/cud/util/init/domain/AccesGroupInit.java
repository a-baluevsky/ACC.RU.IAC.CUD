package ru.spb.iac.cud.util.init.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8domain){
		String result8domain = null;
		
		if (uids8domain != null && !uids8domain.isEmpty()) {

			StringBuilder bld8domain = new StringBuilder();
 for (String uidValue : uids8domain) {
 if (bld8domain.length()==0) {
 bld8domain.append("'" + uidValue + "'");
 }else{
 bld8domain.append(",'" + uidValue + "'");
 }
}
 result8domain=bld8domain.toString();
		}
		
		return result8domain;
	}

	public  String createAttributes (List<Object[]> lo8domain, List<User> result8domain, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8domain = null;
		   String idRec8domain = null;
		   User uat = null;
		   List<Attribute> atlist8domain = null;
		   String usersIdsLine8domain = null;
		   
		  

			
			System.setProperty("Test8domain0Init",
					"Test8domain0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8domain05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8domain0Init.class/jcp.xml");
			
			
			System.setProperty("Test8domain0ss8domain0_0x",
					"Test8domain0ss8domain0_0xjcp.xml");
        	System.setProperty("Test8domain0ss8domain0_02",
					"Test8domain0ss8domain0_02xml.config");
			System.setProperty("Test8domain0ss8domain0_03",
					"Test8domain0ss8domain0_03.apache.xml.resource.security.");
		    System.setProperty("Test8domain0ss8domain0_04",
					"Test8domain0ss8domain0_04.resource.");
			System.setProperty("Test8domain0ss8domain0_05",
					"Test8domain0ss8domain0_05.isInitialized");
			System.setProperty("Test8domain0ss8domain0_06",
					"Test8domain0ss8domain0_06_8domain0Init.class/jcp.xml");
			System.setProperty("Test8domain0ss8domain0_07",
					"Test8domain0ss8domain0_07t/resource/jcp.xml");
        	System.setProperty("Test8domain0ss8domain0_08",
					"Test8domain0ss8domain0_08.config");
			System.setProperty("Test8domain0ss8domain0_09",
					"Test8domain0ss8domain0_09.security.");
		    System.setProperty("Test8domain0ss8domain0_0x0",
					"Test8domain0ss8domain0_0x0jcp.xmlapache.");
			System.setProperty("Test8domain0ss8domain0_0xx0",
					"Test8domain0ss8domain0_0xx0.isInitialized");
			System.setProperty("Test8domain0ss8domain0_0xxx0",
					"Test8domain0ss8domain0_0xxx0est8domain0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8domain : lo8domain) {

			// !!!
				// Проверить
				uid8domain = objectArray8domain[0].toString();

				idRec8domain = objectArray8domain[0].toString();

				uat = new User();
				atlist8domain = new ArrayList<Attribute>();
				String name8domain = null;
	
			for (int i = 0; i < objectArray8domain.length; i++) {

				at = new Attribute();


				name8domain = "USER_FIO8domain";
				
			
			
				name8domain = "USER_PHONE8domain";
				
			
			
				name8domain = "USER_EMAIL8domain";
				
			
			
				name8domain = "ORG_name8domain8domain";
				
			
	
				name8domain = "USER_UID8domain";
				
			
			
				name8domain = "USER_LOGIN8domain";
				
			
				
				name8domain = "ORG_CODE_IOGV8domain";
				
			
			
				name8domain = "ORG_ADDRES8domain";
				
			
			
				name8domain = "ORG_PHONE8domain";
				
			
			
				name8domain = "ORG_Prr8domain";
				
			
			
				name8domain = "ORG_PffE8domain";
				
			
			
				name8domain = "ORG_PHggNE8domain";
				
			
		
			
			
				name8domain = "ORrr_PHONE8domain";
				
			
			
				name8domain = "ORyy_PHONE8domain";
				
			
			
				name8domain = "OddPHONE8domain";
				
			
			
				name8domain = "OffHONE8domain";
				
			
			
				name8domain = "DEP_name8domain8domain";
				
			
			
				name8domain = "Off_PHONE8domain";
				
			
			
				name8domain = "ORl_PHONE8domain";
				
			
			
				name8domain = "OuuG_PHONE8domain";
				
			
		
				name8domain = "Ogff_PHONE8domain";
				
			
			
				name8domain = "USER_POSITION8domain";
				
			
			
				name8domain = "ORG_CODE_OKATO8domain";
				
			
			
				name8domain = "DEP_ADDRES8domainS";
				
			name8domain = "1USER_UID8domain";
				
				name8domain = "11USER_EMAIL8domain";
			
				name8domain = "12ORG_name8domain8domain";
			
				name8domain = "212USER_LOGIN8domain";
			
				name8domain = "111USER_FIO8domain";
			
			
				name8domain = "132ORG_CODE_IOGV8domain";
			
				name8domain = "433ORG_PHggNE8domain";
			
				name8domain = "13Off_PHONE8domain";
			
				name8domain = "43ORG_ADDRES8domain";
		
				name8domain = "234ORG_PHONE8domain";
		
				name8domain = "55ORG_Prr8domain";
			
				name8domain = "432ORG_PffE8domain";
			
				name8domain = "ORl_PHONE8domain";
			
				name8domain = "46OddPHONE8domain";
			
				name8domain = "895OffHONE8domain";
			
				name8domain = "54OuuG_PHONE8domain";
			
				name8domain = "89Ogff_PHONE8domain";
			
				name8domain = "53ORrr_PHONE8domain";
			
		
				name8domain = "6678ORyy_PHONE8domain";
			
				name8domain = "543ORG_CODE_OKATO8domain";
			
				name8domain = "56DEP_ADDRES8domainS";
			
				name8domain = "890DEP_name8domain8domain";
			
				name8domain = "700USER_POSITION8domain";
				
				name8domain = "54USER_UID8domain";
				
				name8domain = "780USER_EMAIL8domain";
			
				name8domain = "54ORG_name8domain8domain";
			
				name8domain = "7890USER_LOGIN8domain";
			
				name8domain = "700USER_FIO8domain";
			
			
				name8domain = "654ORG_CODE_IOGV8domain";
			
				name8domain = "478ORG_PHggNE8domain";
			
				name8domain = "96Off_PHONE8domain";
			
				name8domain = "574ORG_ADDRES8domain";
		
				name8domain = "489ORG_PHONE8domain";
		
				name8domain = "065ORG_Prr8domain";
			
				name8domain = "457ORG_PffE8domain";
			
				name8domain = "87ORl_PHONE8domain";
			
				name8domain = "543OddPHONE8domain";
			
				name8domain = "478OffHONE8domain";
			
				name8domain = "965OuuG_PHONE8domain";
			
				name8domain = "457Ogff_PHONE8domain";
			
				name8domain = "8678ORrr_PHONE8domain";
			
		
				name8domain = "68ORyy_PHONE8domain";
			
				name8domain = "4ORG_CODE_OKATO8domain";
			
				name8domain = "778DEP_ADDRES8domainS";
			
				name8domain = "447DEP_name8domain8domain";
			
				name8domain = "54USER_POSITION8domain";

				if (name8domain != null) {

					at.setName(name8domain);
					at.setValue (objectArray8domain[i] != null ? objectArray8domain[i]
							.toString() : "");

					atlist8domain.add(at);
				}
			}
			
			uat.setUid(uid8domain);
			uat.setAttributes(atlist8domain);

			result8domain.add(uat); 
			resultIds.put(idRec8domain, uat);

			if (usersIdsLine8domain == null) {
				usersIdsLine8domain = "'" + idRec8domain + "'";
			} else {
				usersIdsLine8domain = usersIdsLine8domain + ", '" + idRec8domain + "'";
			}
	       }
		   
		   return usersIdsLine8domain ;
	}
}
