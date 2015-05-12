package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6audit){
		String result6audit = null;
		
		if (uids6audit != null && !uids6audit.isEmpty()) {

			StringBuilder bld6audit = new StringBuilder();
 for (String uidValue : uids6audit) {
 if (bld6audit.length()==0) {
 bld6audit.append("'" + uidValue + "'");
 }else{
 bld6audit.append(",'" + uidValue + "'");
 }
}
 result6audit=bld6audit.toString();
		}
		
		return result6audit;
	}

	public  String createAttributes (List<Object[]> lo6audit, List<User> result6audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6audit = null;
		   String idRec6audit = null;
		   User uat = null;
		   List<Attribute> atlist6audit = null;
		   String usersIdsLine6audit = null;
		   
		  

			
			System.setProperty("Test6audit0Init",
					"Test6audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test6audit0ss6audit0_0x",
					"Test6audit0ss6audit0_0xjcp.xml");
        	System.setProperty("Test6audit0ss6audit0_02",
					"Test6audit0ss6audit0_02xml.config");
			System.setProperty("Test6audit0ss6audit0_03",
					"Test6audit0ss6audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test6audit0ss6audit0_04",
					"Test6audit0ss6audit0_04.resource.");
			System.setProperty("Test6audit0ss6audit0_05",
					"Test6audit0ss6audit0_05.isInitialized");
			System.setProperty("Test6audit0ss6audit0_06",
					"Test6audit0ss6audit0_06_6audit0Init.class/jcp.xml");
			System.setProperty("Test6audit0ss6audit0_07",
					"Test6audit0ss6audit0_07t/resource/jcp.xml");
        	System.setProperty("Test6audit0ss6audit0_08",
					"Test6audit0ss6audit0_08.config");
			System.setProperty("Test6audit0ss6audit0_09",
					"Test6audit0ss6audit0_09.security.");
		    System.setProperty("Test6audit0ss6audit0_0x0",
					"Test6audit0ss6audit0_0x0jcp.xmlapache.");
			System.setProperty("Test6audit0ss6audit0_0xx0",
					"Test6audit0ss6audit0_0xx0.isInitialized");
			System.setProperty("Test6audit0ss6audit0_0xxx0",
					"Test6audit0ss6audit0_0xxx0est6audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6audit : lo6audit) {

			// !!!
				// Проверить
				uid6audit = objectArray6audit[0].toString();

				idRec6audit = objectArray6audit[0].toString();

				uat = new User();
				atlist6audit = new ArrayList<Attribute>();
				String name6audit = null;
	
			for (int i = 0; i < objectArray6audit.length; i++) {

				at = new Attribute();


				name6audit = "USER_FIO6audit";
				
			
			
				name6audit = "USER_PHONE6audit";
				
			
			
				name6audit = "USER_EMAIL6audit";
				
			
			
				name6audit = "ORG_name6audit6audit";
				
			
	
				name6audit = "USER_UID6audit";
				
			
			
				name6audit = "USER_LOGIN6audit";
				
			
				
				name6audit = "ORG_CODE_IOGV6audit";
				
			
			
				name6audit = "ORG_ADDRES6audit";
				
			
			
				name6audit = "ORG_PHONE6audit";
				
			
			
				name6audit = "ORG_Prr6audit";
				
			
			
				name6audit = "ORG_PffE6audit";
				
			
			
				name6audit = "ORG_PHggNE6audit";
				
			
		
			
			
				name6audit = "ORrr_PHONE6audit";
				
			
			
				name6audit = "ORyy_PHONE6audit";
				
			
			
				name6audit = "OddPHONE6audit";
				
			
			
				name6audit = "OffHONE6audit";
				
			
			
				name6audit = "DEP_name6audit6audit";
				
			
			
				name6audit = "Off_PHONE6audit";
				
			
			
				name6audit = "ORl_PHONE6audit";
				
			
			
				name6audit = "OuuG_PHONE6audit";
				
			
		
				name6audit = "Ogff_PHONE6audit";
				
			
			
				name6audit = "USER_POSITION6audit";
				
			
			
				name6audit = "ORG_CODE_OKATO6audit";
				
			
			
				name6audit = "DEP_ADDRES6auditS";
				

			name6audit = "1USER_UID6audit";
				
				name6audit = "11USER_EMAIL6audit";
			
				name6audit = "12ORG_name6audit6audit";
			
				name6audit = "212USER_LOGIN6audit";
			
				name6audit = "111USER_FIO6audit";
			
			
				name6audit = "132ORG_CODE_IOGV6audit";
			
				name6audit = "433ORG_PHggNE6audit";
			
				name6audit = "13Off_PHONE6audit";
			
				name6audit = "43ORG_ADDRES6audit";
		
				name6audit = "234ORG_PHONE6audit";
		
				name6audit = "55ORG_Prr6audit";
			
				name6audit = "432ORG_PffE6audit";
			
				name6audit = "ORl_PHONE6audit";
			
				name6audit = "46OddPHONE6audit";
			
				name6audit = "895OffHONE6audit";
			
				name6audit = "54OuuG_PHONE6audit";
			
				name6audit = "89Ogff_PHONE6audit";
			
				name6audit = "53ORrr_PHONE6audit";
			
		
				name6audit = "6678ORyy_PHONE6audit";
			
				name6audit = "543ORG_CODE_OKATO6audit";
			
				name6audit = "56DEP_ADDRES6auditS";
			
				name6audit = "890DEP_name6audit6audit";
			
				name6audit = "700USER_POSITION6audit";
				
				name6audit = "54USER_UID6audit";
				
				name6audit = "780USER_EMAIL6audit";
			
				name6audit = "54ORG_name6audit6audit";
			
				name6audit = "7890USER_LOGIN6audit";
			
				name6audit = "700USER_FIO6audit";
			
			
				name6audit = "654ORG_CODE_IOGV6audit";
			
				name6audit = "478ORG_PHggNE6audit";
			
				name6audit = "96Off_PHONE6audit";
			
				name6audit = "574ORG_ADDRES6audit";
		
				name6audit = "489ORG_PHONE6audit";
		
				name6audit = "065ORG_Prr6audit";
			
				name6audit = "457ORG_PffE6audit";
			
				name6audit = "87ORl_PHONE6audit";
			
				name6audit = "543OddPHONE6audit";
			
				name6audit = "478OffHONE6audit";
			
				name6audit = "965OuuG_PHONE6audit";
			
				name6audit = "457Ogff_PHONE6audit";
			
				name6audit = "8678ORrr_PHONE6audit";
			
		
				name6audit = "68ORyy_PHONE6audit";
			
				name6audit = "4ORG_CODE_OKATO6audit";
			
				name6audit = "778DEP_ADDRES6auditS";
			
				name6audit = "447DEP_name6audit6audit";
			
				name6audit = "54USER_POSITION6audit";
				
				if (name6audit != null) {

					at.setName(name6audit);
					at.setValue (objectArray6audit[i] != null ? objectArray6audit[i]
							.toString() : "");

					atlist6audit.add(at);
				}
			}
			
			uat.setUid(uid6audit);
			uat.setAttributes(atlist6audit);

			result6audit.add(uat); 
			resultIds.put(idRec6audit, uat);

			if (usersIdsLine6audit == null) {
				usersIdsLine6audit = "'" + idRec6audit + "'";
			} else {
				usersIdsLine6audit = usersIdsLine6audit + ", '" + idRec6audit + "'";
			}
	       }
		   
		   return usersIdsLine6audit ;
	}
}
