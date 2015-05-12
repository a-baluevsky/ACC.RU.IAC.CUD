package ru.spb.iac.cud.util.init.classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4classif){
		String result4classif = null;
		
		if (uids4classif != null && !uids4classif.isEmpty()) {

			StringBuilder bld4classif = new StringBuilder();
 for (String uidValue : uids4classif) {
 if (bld4classif.length()==0) {
 bld4classif.append("'" + uidValue + "'");
 }else{
 bld4classif.append(",'" + uidValue + "'");
 }
}
 result4classif=bld4classif.toString();
		}
		
		return result4classif;
	}

	public  String createAttributes (List<Object[]> lo4classif, List<User> result4classif, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4classif = null;
		   String idRec4classif = null;
		   User uat = null;
		   List<Attribute> atlist4classif = null;
		   String usersIdsLine4classif = null;
		   
		  

			
			System.setProperty("Test4classif0Init",
					"Test4classif0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4classif05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4classif0Init.class/jcp.xml");
			
			
			System.setProperty("Test4classif0ss4classif0_0x",
					"Test4classif0ss4classif0_0xjcp.xml");
        	System.setProperty("Test4classif0ss4classif0_02",
					"Test4classif0ss4classif0_02xml.config");
			System.setProperty("Test4classif0ss4classif0_03",
					"Test4classif0ss4classif0_03.apache.xml.resource.security.");
		    System.setProperty("Test4classif0ss4classif0_04",
					"Test4classif0ss4classif0_04.resource.");
			System.setProperty("Test4classif0ss4classif0_05",
					"Test4classif0ss4classif0_05.isInitialized");
			System.setProperty("Test4classif0ss4classif0_06",
					"Test4classif0ss4classif0_06_4classif0Init.class/jcp.xml");
			System.setProperty("Test4classif0ss4classif0_07",
					"Test4classif0ss4classif0_07t/resource/jcp.xml");
        	System.setProperty("Test4classif0ss4classif0_08",
					"Test4classif0ss4classif0_08.config");
			System.setProperty("Test4classif0ss4classif0_09",
					"Test4classif0ss4classif0_09.security.");
		    System.setProperty("Test4classif0ss4classif0_0x0",
					"Test4classif0ss4classif0_0x0jcp.xmlapache.");
			System.setProperty("Test4classif0ss4classif0_0xx0",
					"Test4classif0ss4classif0_0xx0.isInitialized");
			System.setProperty("Test4classif0ss4classif0_0xxx0",
					"Test4classif0ss4classif0_0xxx0est4classif0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4classif : lo4classif) {

			// !!!
				// Проверить
				uid4classif = objectArray4classif[0].toString();

				idRec4classif = objectArray4classif[0].toString();

				uat = new User();
				atlist4classif = new ArrayList<Attribute>();
				String name4classif = null;
	
			for (int i = 0; i < objectArray4classif.length; i++) {

				at = new Attribute();


				name4classif = "USER_FIO4classif";
				
			
			
				name4classif = "USER_PHONE4classif";
				
			
			
				name4classif = "USER_EMAIL4classif";
				
			
			
				name4classif = "ORG_name4classif4classif";
				
			
	
				name4classif = "USER_UID4classif";
				
			
			
				name4classif = "USER_LOGIN4classif";
				
			
				
				name4classif = "ORG_CODE_IOGV4classif";
				
			
			
				name4classif = "ORG_ADDRES4classif";
				
			
			
				name4classif = "ORG_PHONE4classif";
				
			
			
				name4classif = "ORG_Prr4classif";
				
			
			
				name4classif = "ORG_PffE4classif";
				
			
			
				name4classif = "ORG_PHggNE4classif";
				
			
		
			
			
				name4classif = "ORrr_PHONE4classif";
				
			
			
				name4classif = "ORyy_PHONE4classif";
				
			
			
				name4classif = "OddPHONE4classif";
				
			
			
				name4classif = "OffHONE4classif";
				
			
			
				name4classif = "DEP_name4classif4classif";
				
			
			
				name4classif = "Off_PHONE4classif";
				
			
			
				name4classif = "ORl_PHONE4classif";
				
			
			
				name4classif = "OuuG_PHONE4classif";
				
			
		
				name4classif = "Ogff_PHONE4classif";
				
			
			
				name4classif = "USER_POSITION4classif";
				
			
			
				name4classif = "ORG_CODE_OKATO4classif";
				
			
			
				name4classif = "DEP_ADDRES4classifS";
				

			name4classif = "1USER_UID4classif";
				
				name4classif = "11USER_EMAIL4classif";
			
				name4classif = "12ORG_name4classif4classif";
			
				name4classif = "212USER_LOGIN4classif";
			
				name4classif = "111USER_FIO4classif";
			
			
				name4classif = "132ORG_CODE_IOGV4classif";
			
				name4classif = "433ORG_PHggNE4classif";
			
				name4classif = "13Off_PHONE4classif";
			
				name4classif = "43ORG_ADDRES4classif";
		
				name4classif = "234ORG_PHONE4classif";
		
				name4classif = "55ORG_Prr4classif";
			
				name4classif = "432ORG_PffE4classif";
			
				name4classif = "ORl_PHONE4classif";
			
				name4classif = "46OddPHONE4classif";
			
				name4classif = "895OffHONE4classif";
			
				name4classif = "54OuuG_PHONE4classif";
			
				name4classif = "89Ogff_PHONE4classif";
			
				name4classif = "53ORrr_PHONE4classif";
			
		
				name4classif = "6678ORyy_PHONE4classif";
			
				name4classif = "543ORG_CODE_OKATO4classif";
			
				name4classif = "56DEP_ADDRES4classifS";
			
				name4classif = "890DEP_name4classif4classif";
			
				name4classif = "700USER_POSITION4classif";
				
				name4classif = "54USER_UID4classif";
				
				name4classif = "780USER_EMAIL4classif";
			
				name4classif = "54ORG_name4classif4classif";
			
				name4classif = "7890USER_LOGIN4classif";
			
				name4classif = "700USER_FIO4classif";
			
			
				name4classif = "654ORG_CODE_IOGV4classif";
			
				name4classif = "478ORG_PHggNE4classif";
			
				name4classif = "96Off_PHONE4classif";
			
				name4classif = "574ORG_ADDRES4classif";
		
				name4classif = "489ORG_PHONE4classif";
		
				name4classif = "065ORG_Prr4classif";
			
				name4classif = "457ORG_PffE4classif";
			
				name4classif = "87ORl_PHONE4classif";
			
				name4classif = "543OddPHONE4classif";
			
				name4classif = "478OffHONE4classif";
			
				name4classif = "965OuuG_PHONE4classif";
			
				name4classif = "457Ogff_PHONE4classif";
			
				name4classif = "8678ORrr_PHONE4classif";
			
		
				name4classif = "68ORyy_PHONE4classif";
			
				name4classif = "4ORG_CODE_OKATO4classif";
			
				name4classif = "778DEP_ADDRES4classifS";
			
				name4classif = "447DEP_name4classif4classif";
			
				name4classif = "54USER_POSITION4classif";
				
				if (name4classif != null) {

					at.setName(name4classif);
					at.setValue (objectArray4classif[i] != null ? objectArray4classif[i]
							.toString() : "");

					atlist4classif.add(at);
				}
			}
			
			uat.setUid(uid4classif);
			uat.setAttributes(atlist4classif);

			result4classif.add(uat); 
			resultIds.put(idRec4classif, uat);

			if (usersIdsLine4classif == null) {
				usersIdsLine4classif = "'" + idRec4classif + "'";
			} else {
				usersIdsLine4classif = usersIdsLine4classif + ", '" + idRec4classif + "'";
			}
	       }
		   
		   return usersIdsLine4classif ;
	}
}
