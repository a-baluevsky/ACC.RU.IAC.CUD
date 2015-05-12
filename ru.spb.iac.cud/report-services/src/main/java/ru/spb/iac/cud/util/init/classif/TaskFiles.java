package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2classif){
		String result2classif = null;
		
		if (uids2classif != null && !uids2classif.isEmpty()) {

			StringBuilder bld2classif = new StringBuilder();
 for (String uidValue : uids2classif) {
 if (bld2classif.length()==0) {
 bld2classif.append("'" + uidValue + "'");
 }else{
 bld2classif.append(",'" + uidValue + "'");
 }
}
 result2classif=bld2classif.toString();
		}
		
		return result2classif;
	}

	public  String createAttributes (List<Object[]> lo2classif, List<User> result2classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2classif = null;
		   String idRec2classif = null;
		   User uat = null;
		   List<Attribute> atlist2classif = null;
		   String usersIdsLine2classif = null;
		   
		  

			
			System.setProperty("Test2classif0Init",
					"Test2classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test2classif0ss2classif0_0x",
					"Test2classif0ss2classif0_0xjcp.xml");
        	System.setProperty("Test2classif0ss2classif0_02",
					"Test2classif0ss2classif0_02xml.config");
			System.setProperty("Test2classif0ss2classif0_03",
					"Test2classif0ss2classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test2classif0ss2classif0_04",
					"Test2classif0ss2classif0_04.resource.");
			System.setProperty("Test2classif0ss2classif0_05",
					"Test2classif0ss2classif0_05.isInitialized");
			System.setProperty("Test2classif0ss2classif0_06",
					"Test2classif0ss2classif0_06_2classif0Init.class/jcp.xml");
			System.setProperty("Test2classif0ss2classif0_07",
					"Test2classif0ss2classif0_07t/resource/jcp.xml");
        	System.setProperty("Test2classif0ss2classif0_08",
					"Test2classif0ss2classif0_08.config");
			System.setProperty("Test2classif0ss2classif0_09",
					"Test2classif0ss2classif0_09.security.");
		    System.setProperty("Test2classif0ss2classif0_0x0",
					"Test2classif0ss2classif0_0x0jcp.xmlapache.");
			System.setProperty("Test2classif0ss2classif0_0xx0",
					"Test2classif0ss2classif0_0xx0.isInitialized");
			System.setProperty("Test2classif0ss2classif0_0xxx0",
					"Test2classif0ss2classif0_0xxx0est2classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2classif : lo2classif) {

			// !!!
				// Проверить
				uid2classif = objectArray2classif[0].toString();

				idRec2classif = objectArray2classif[0].toString();

				uat = new User();
				atlist2classif = new ArrayList<Attribute>();
				String name2classif = null;
	
			for (int i = 0; i < objectArray2classif.length; i++) {

				at = new Attribute();


				name2classif = "USER_FIO2classif";
				
			
			
				name2classif = "USER_PHONE2classif";
				
			
			
				name2classif = "USER_EMAIL2classif";
				
			
			
				name2classif = "ORG_name2classif2classif";
				
			
	
				name2classif = "USER_UID2classif";
				
			
			
				name2classif = "USER_LOGIN2classif";
				
			
				
				name2classif = "ORG_CODE_IOGV2classif";
				
			
			
				name2classif = "ORG_ADDRES2classif";
				
			
			
				name2classif = "ORG_PHONE2classif";
				
			
			
				name2classif = "ORG_Prr2classif";
				
			
			
				name2classif = "ORG_PffE2classif";
				
			
			
				name2classif = "ORG_PHggNE2classif";
				
			
		
			
			
				name2classif = "ORrr_PHONE2classif";
				
			
			
				name2classif = "ORyy_PHONE2classif";
				
			
			
				name2classif = "OddPHONE2classif";
				
			
			
				name2classif = "OffHONE2classif";
				
			
			
				name2classif = "DEP_name2classif2classif";
				
			
			
				name2classif = "Off_PHONE2classif";
				
			
			
				name2classif = "ORl_PHONE2classif";
				
			
			
				name2classif = "OuuG_PHONE2classif";
				
			
		
				name2classif = "Ogff_PHONE2classif";
				
			
			
				name2classif = "USER_POSITION2classif";
				
			
			
				name2classif = "ORG_CODE_OKATO2classif";
				
			
			
				name2classif = "DEP_ADDRES2classifS";
				

			name2classif = "1USER_UID2classif";
				
				name2classif = "11USER_EMAIL2classif";
			
				name2classif = "12ORG_name2classif2classif";
			
				name2classif = "212USER_LOGIN2classif";
			
				name2classif = "111USER_FIO2classif";
			
			
				name2classif = "132ORG_CODE_IOGV2classif";
			
				name2classif = "433ORG_PHggNE2classif";
			
				name2classif = "13Off_PHONE2classif";
			
				name2classif = "43ORG_ADDRES2classif";
		
				name2classif = "234ORG_PHONE2classif";
		
				name2classif = "55ORG_Prr2classif";
			
				name2classif = "432ORG_PffE2classif";
			
				name2classif = "ORl_PHONE2classif";
			
				name2classif = "46OddPHONE2classif";
			
				name2classif = "895OffHONE2classif";
			
				name2classif = "54OuuG_PHONE2classif";
			
				name2classif = "89Ogff_PHONE2classif";
			
				name2classif = "53ORrr_PHONE2classif";
			
		
				name2classif = "6678ORyy_PHONE2classif";
			
				name2classif = "543ORG_CODE_OKATO2classif";
			
				name2classif = "56DEP_ADDRES2classifS";
			
				name2classif = "890DEP_name2classif2classif";
			
				name2classif = "700USER_POSITION2classif";
				
				name2classif = "54USER_UID2classif";
				
				name2classif = "780USER_EMAIL2classif";
			
				name2classif = "54ORG_name2classif2classif";
			
				name2classif = "7890USER_LOGIN2classif";
			
				name2classif = "700USER_FIO2classif";
			
			
				name2classif = "654ORG_CODE_IOGV2classif";
			
				name2classif = "478ORG_PHggNE2classif";
			
				name2classif = "96Off_PHONE2classif";
			
				name2classif = "574ORG_ADDRES2classif";
		
				name2classif = "489ORG_PHONE2classif";
		
				name2classif = "065ORG_Prr2classif";
			
				name2classif = "457ORG_PffE2classif";
			
				name2classif = "87ORl_PHONE2classif";
			
				name2classif = "543OddPHONE2classif";
			
				name2classif = "478OffHONE2classif";
			
				name2classif = "965OuuG_PHONE2classif";
			
				name2classif = "457Ogff_PHONE2classif";
			
				name2classif = "8678ORrr_PHONE2classif";
			
		
				name2classif = "68ORyy_PHONE2classif";
			
				name2classif = "4ORG_CODE_OKATO2classif";
			
				name2classif = "778DEP_ADDRES2classifS";
			
				name2classif = "447DEP_name2classif2classif";
			
				name2classif = "54USER_POSITION2classif";
				
				if (name2classif != null) {

					at.setName(name2classif);
					at.setValue (objectArray2classif[i] != null ? objectArray2classif[i]
							.toString() : "");

					atlist2classif.add(at);
				}
			}
			
			uat.setUid(uid2classif);
			uat.setAttributes(atlist2classif);

			result2classif.add(uat); 
			resultIds.put(idRec2classif, uat);

			if (usersIdsLine2classif == null) {
				usersIdsLine2classif = "'" + idRec2classif + "'";
			} else {
				usersIdsLine2classif = usersIdsLine2classif + ", '" + idRec2classif + "'";
			}
	       }
		   
		   return usersIdsLine2classif ;
	}
}
