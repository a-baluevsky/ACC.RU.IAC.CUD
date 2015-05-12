package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8classif){
		String result8classif = null;
		
		if (uids8classif != null && !uids8classif.isEmpty()) {

			StringBuilder bld8classif = new StringBuilder();

			for (String uidValue : uids8classif) {

			  bld8classif.append(",'").append(uidValue).append("'");

			}

			result8classif=bld8classif.substring(1);
		}
		
		return result8classif;
	}

	public  String createAttributes (List<Object[]> lo8classif, List<User> result8classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8classif = null;
		   String idRec8classif = null;
		   User uat = null;
		   List<Attribute> atlist8classif = null;
		   String usersIdsLine8classif = null;
		   
		  

			
			System.setProperty("Test8classif0Init",
					"Test8classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test8classif0ss8classif0_0x",
					"Test8classif0ss8classif0_0xjcp.xml");
        	System.setProperty("Test8classif0ss8classif0_02",
					"Test8classif0ss8classif0_02xml.config");
			System.setProperty("Test8classif0ss8classif0_03",
					"Test8classif0ss8classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test8classif0ss8classif0_04",
					"Test8classif0ss8classif0_04.resource.");
			System.setProperty("Test8classif0ss8classif0_05",
					"Test8classif0ss8classif0_05.isInitialized");
			System.setProperty("Test8classif0ss8classif0_06",
					"Test8classif0ss8classif0_06_8classif0Init.class/jcp.xml");
			System.setProperty("Test8classif0ss8classif0_07",
					"Test8classif0ss8classif0_07t/resource/jcp.xml");
        	System.setProperty("Test8classif0ss8classif0_08",
					"Test8classif0ss8classif0_08.config");
			System.setProperty("Test8classif0ss8classif0_09",
					"Test8classif0ss8classif0_09.security.");
		    System.setProperty("Test8classif0ss8classif0_0x0",
					"Test8classif0ss8classif0_0x0jcp.xmlapache.");
			System.setProperty("Test8classif0ss8classif0_0xx0",
					"Test8classif0ss8classif0_0xx0.isInitialized");
			System.setProperty("Test8classif0ss8classif0_0xxx0",
					"Test8classif0ss8classif0_0xxx0est8classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8classif : lo8classif) {

			// !!!
				// Проверить
				uid8classif = objectArray8classif[0].toString();

				idRec8classif = objectArray8classif[0].toString();

				uat = new User();
				atlist8classif = new ArrayList<Attribute>();
				String name8classif = null;
	
			for (int i = 0; i < objectArray8classif.length; i++) {

				at = new Attribute();


				name8classif = "USER_FIO8classif";
				
			
			
				name8classif = "USER_PHONE8classif";
				
			
			
				name8classif = "USER_EMAIL8classif";
				
			
			
				name8classif = "ORG_name8classif8classif";
				
			
	
				name8classif = "USER_UID8classif";
				
			
			
				name8classif = "USER_LOGIN8classif";
				
			
				
				name8classif = "ORG_CODE_IOGV8classif";
				
			
			
				name8classif = "ORG_ADDRES8classif";
				
			
			
				name8classif = "ORG_PHONE8classif";
				
			
			
				name8classif = "ORG_Prr8classif";
				
			
			
				name8classif = "ORG_PffE8classif";
				
			
			
				name8classif = "ORG_PHggNE8classif";
				
			
		
			
			
				name8classif = "ORrr_PHONE8classif";
				
			
			
				name8classif = "ORyy_PHONE8classif";
				
			
			
				name8classif = "OddPHONE8classif";
				
			
			
				name8classif = "OffHONE8classif";
				
			
			
				name8classif = "DEP_name8classif8classif";
				
			
			
				name8classif = "Off_PHONE8classif";
				
			
			
				name8classif = "ORl_PHONE8classif";
				
			
			
				name8classif = "OuuG_PHONE8classif";
				
			
		
				name8classif = "Ogff_PHONE8classif";
				
			
			
				name8classif = "USER_POSITION8classif";
				
			
			
				name8classif = "ORG_CODE_OKATO8classif";
				
			
			
				name8classif = "DEP_ADDRES8classifS";
				
			name8classif = "1USER_UID8classif";
				
				name8classif = "11USER_EMAIL8classif";
			
				name8classif = "12ORG_name8classif8classif";
			
				name8classif = "212USER_LOGIN8classif";
			
				name8classif = "111USER_FIO8classif";
			
			
				name8classif = "132ORG_CODE_IOGV8classif";
			
				name8classif = "433ORG_PHggNE8classif";
			
				name8classif = "13Off_PHONE8classif";
			
				name8classif = "43ORG_ADDRES8classif";
		
				name8classif = "234ORG_PHONE8classif";
		
				name8classif = "55ORG_Prr8classif";
			
				name8classif = "432ORG_PffE8classif";
			
				name8classif = "ORl_PHONE8classif";
			
				name8classif = "46OddPHONE8classif";
			
				name8classif = "895OffHONE8classif";
			
				name8classif = "54OuuG_PHONE8classif";
			
				name8classif = "89Ogff_PHONE8classif";
			
				name8classif = "53ORrr_PHONE8classif";
			
		
				name8classif = "6678ORyy_PHONE8classif";
			
				name8classif = "543ORG_CODE_OKATO8classif";
			
				name8classif = "56DEP_ADDRES8classifS";
			
				name8classif = "890DEP_name8classif8classif";
			
				name8classif = "700USER_POSITION8classif";
				
				name8classif = "54USER_UID8classif";
				
				name8classif = "780USER_EMAIL8classif";
			
				name8classif = "54ORG_name8classif8classif";
			
				name8classif = "7890USER_LOGIN8classif";
			
				name8classif = "700USER_FIO8classif";
			
			
				name8classif = "654ORG_CODE_IOGV8classif";
			
				name8classif = "478ORG_PHggNE8classif";
			
				name8classif = "96Off_PHONE8classif";
			
				name8classif = "574ORG_ADDRES8classif";
		
				name8classif = "489ORG_PHONE8classif";
		
				name8classif = "065ORG_Prr8classif";
			
				name8classif = "457ORG_PffE8classif";
			
				name8classif = "87ORl_PHONE8classif";
			
				name8classif = "543OddPHONE8classif";
			
				name8classif = "478OffHONE8classif";
			
				name8classif = "965OuuG_PHONE8classif";
			
				name8classif = "457Ogff_PHONE8classif";
			
				name8classif = "8678ORrr_PHONE8classif";
			
		
				name8classif = "68ORyy_PHONE8classif";
			
				name8classif = "4ORG_CODE_OKATO8classif";
			
				name8classif = "778DEP_ADDRES8classifS";
			
				name8classif = "447DEP_name8classif8classif";
			
				name8classif = "54USER_POSITION8classif";

				if (name8classif != null) {

					at.setName(name8classif);
					at.setValue (objectArray8classif[i] != null ? objectArray8classif[i]
							.toString() : "");

					atlist8classif.add(at);
				}
			}
			
			uat.setUid(uid8classif);
			uat.setAttributes(atlist8classif);

			result8classif.add(uat); 
			resultIds.put(idRec8classif, uat);

			if (usersIdsLine8classif == null) {
				usersIdsLine8classif = "'" + idRec8classif + "'";
			} else {
				usersIdsLine8classif = usersIdsLine8classif + ", '" + idRec8classif + "'";
			}
	       }
		   
		   return usersIdsLine8classif ;
	}
}
