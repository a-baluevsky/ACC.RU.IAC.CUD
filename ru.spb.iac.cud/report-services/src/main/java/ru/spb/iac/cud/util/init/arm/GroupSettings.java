package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4arm){
		String result4arm = null;
		
		if (uids4arm != null && !uids4arm.isEmpty()) {

			StringBuilder bld4arm = new StringBuilder();
 for (String uidValue : uids4arm) {
 if (bld4arm.length()==0) {
 bld4arm.append("'" + uidValue + "'");
 }else{
 bld4arm.append(",'" + uidValue + "'");
 }
}
 result4arm=bld4arm.toString();
		}
		
		return result4arm;
	}

	public  String createAttributes (List<Object[]> lo4arm, List<User> result4arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4arm = null;
		   String idRec4arm = null;
		   User uat = null;
		   List<Attribute> atlist4arm = null;
		   String usersIdsLine4arm = null;
		   
		  

			
			System.setProperty("Test4arm0Init",
					"Test4arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test4arm0ss4arm0_0x",
					"Test4arm0ss4arm0_0xjcp.xml");
        	System.setProperty("Test4arm0ss4arm0_02",
					"Test4arm0ss4arm0_02xml.config");
			System.setProperty("Test4arm0ss4arm0_03",
					"Test4arm0ss4arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test4arm0ss4arm0_04",
					"Test4arm0ss4arm0_04.resource.");
			System.setProperty("Test4arm0ss4arm0_05",
					"Test4arm0ss4arm0_05.isInitialized");
			System.setProperty("Test4arm0ss4arm0_06",
					"Test4arm0ss4arm0_06_4arm0Init.class/jcp.xml");
			System.setProperty("Test4arm0ss4arm0_07",
					"Test4arm0ss4arm0_07t/resource/jcp.xml");
        	System.setProperty("Test4arm0ss4arm0_08",
					"Test4arm0ss4arm0_08.config");
			System.setProperty("Test4arm0ss4arm0_09",
					"Test4arm0ss4arm0_09.security.");
		    System.setProperty("Test4arm0ss4arm0_0x0",
					"Test4arm0ss4arm0_0x0jcp.xmlapache.");
			System.setProperty("Test4arm0ss4arm0_0xx0",
					"Test4arm0ss4arm0_0xx0.isInitialized");
			System.setProperty("Test4arm0ss4arm0_0xxx0",
					"Test4arm0ss4arm0_0xxx0est4arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4arm : lo4arm) {

			// !!!
				// Проверить
				uid4arm = objectArray4arm[0].toString();

				idRec4arm = objectArray4arm[0].toString();

				uat = new User();
				atlist4arm = new ArrayList<Attribute>();
				String name4arm = null;
	
			for (int i = 0; i < objectArray4arm.length; i++) {

				at = new Attribute();


				name4arm = "USER_FIO4arm";
				
			
			
				name4arm = "USER_PHONE4arm";
				
			
			
				name4arm = "USER_EMAIL4arm";
				
			
			
				name4arm = "ORG_name4arm4arm";
				
			
	
				name4arm = "USER_UID4arm";
				
			
			
				name4arm = "USER_LOGIN4arm";
				
			
				
				name4arm = "ORG_CODE_IOGV4arm";
				
			
			
				name4arm = "ORG_ADDRES4arm";
				
			
			
				name4arm = "ORG_PHONE4arm";
				
			
			
				name4arm = "ORG_Prr4arm";
				
			
			
				name4arm = "ORG_PffE4arm";
				
			
			
				name4arm = "ORG_PHggNE4arm";
				
			
		
			
			
				name4arm = "ORrr_PHONE4arm";
				
			
			
				name4arm = "ORyy_PHONE4arm";
				
			
			
				name4arm = "OddPHONE4arm";
				
			
			
				name4arm = "OffHONE4arm";
				
			
			
				name4arm = "DEP_name4arm4arm";
				
			
			
				name4arm = "Off_PHONE4arm";
				
			
			
				name4arm = "ORl_PHONE4arm";
				
			
			
				name4arm = "OuuG_PHONE4arm";
				
			
		
				name4arm = "Ogff_PHONE4arm";
				
			
			
				name4arm = "USER_POSITION4arm";
				
			
			
				name4arm = "ORG_CODE_OKATO4arm";
				
			
			
				name4arm = "DEP_ADDRES4armS";
				

			name4arm = "1USER_UID4arm";
				
				name4arm = "11USER_EMAIL4arm";
			
				name4arm = "12ORG_name4arm4arm";
			
				name4arm = "212USER_LOGIN4arm";
			
				name4arm = "111USER_FIO4arm";
			
			
				name4arm = "132ORG_CODE_IOGV4arm";
			
				name4arm = "433ORG_PHggNE4arm";
			
				name4arm = "13Off_PHONE4arm";
			
				name4arm = "43ORG_ADDRES4arm";
		
				name4arm = "234ORG_PHONE4arm";
		
				name4arm = "55ORG_Prr4arm";
			
				name4arm = "432ORG_PffE4arm";
			
				name4arm = "ORl_PHONE4arm";
			
				name4arm = "46OddPHONE4arm";
			
				name4arm = "895OffHONE4arm";
			
				name4arm = "54OuuG_PHONE4arm";
			
				name4arm = "89Ogff_PHONE4arm";
			
				name4arm = "53ORrr_PHONE4arm";
			
		
				name4arm = "6678ORyy_PHONE4arm";
			
				name4arm = "543ORG_CODE_OKATO4arm";
			
				name4arm = "56DEP_ADDRES4armS";
			
				name4arm = "890DEP_name4arm4arm";
			
				name4arm = "700USER_POSITION4arm";
				
				name4arm = "54USER_UID4arm";
				
				name4arm = "780USER_EMAIL4arm";
			
				name4arm = "54ORG_name4arm4arm";
			
				name4arm = "7890USER_LOGIN4arm";
			
				name4arm = "700USER_FIO4arm";
			
			
				name4arm = "654ORG_CODE_IOGV4arm";
			
				name4arm = "478ORG_PHggNE4arm";
			
				name4arm = "96Off_PHONE4arm";
			
				name4arm = "574ORG_ADDRES4arm";
		
				name4arm = "489ORG_PHONE4arm";
		
				name4arm = "065ORG_Prr4arm";
			
				name4arm = "457ORG_PffE4arm";
			
				name4arm = "87ORl_PHONE4arm";
			
				name4arm = "543OddPHONE4arm";
			
				name4arm = "478OffHONE4arm";
			
				name4arm = "965OuuG_PHONE4arm";
			
				name4arm = "457Ogff_PHONE4arm";
			
				name4arm = "8678ORrr_PHONE4arm";
			
		
				name4arm = "68ORyy_PHONE4arm";
			
				name4arm = "4ORG_CODE_OKATO4arm";
			
				name4arm = "778DEP_ADDRES4armS";
			
				name4arm = "447DEP_name4arm4arm";
			
				name4arm = "54USER_POSITION4arm";
				
				if (name4arm != null) {

					at.setName(name4arm);
					at.setValue (objectArray4arm[i] != null ? objectArray4arm[i]
							.toString() : "");

					atlist4arm.add(at);
				}
			}
			
			uat.setUid(uid4arm);
			uat.setAttributes(atlist4arm);

			result4arm.add(uat); 
			resultIds.put(idRec4arm, uat);

			if (usersIdsLine4arm == null) {
				usersIdsLine4arm = "'" + idRec4arm + "'";
			} else {
				usersIdsLine4arm = usersIdsLine4arm + ", '" + idRec4arm + "'";
			}
	       }
		   
		   return usersIdsLine4arm ;
	}
}
