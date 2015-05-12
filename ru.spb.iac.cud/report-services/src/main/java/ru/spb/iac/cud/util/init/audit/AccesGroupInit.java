package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8audit){
		String result8audit = null;
		
		if (uids8audit != null && !uids8audit.isEmpty()) {

			StringBuilder bld8audit = new StringBuilder();
 for (String uidValue : uids8audit) {
 if (bld8audit.length()==0) {
 bld8audit.append("'" + uidValue + "'");
 }else{
 bld8audit.append(",'" + uidValue + "'");
 }
}
 result8audit=bld8audit.toString();
		}
		
		return result8audit;
	}

	public  String createAttributes (List<Object[]> lo8audit, List<User> result8audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8audit = null;
		   String idRec8audit = null;
		   User uat = null;
		   List<Attribute> atlist8audit = null;
		   String usersIdsLine8audit = null;
		   
		  

			
			System.setProperty("Test8audit0Init",
					"Test8audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test8audit0ss8audit0_0x",
					"Test8audit0ss8audit0_0xjcp.xml");
        	System.setProperty("Test8audit0ss8audit0_02",
					"Test8audit0ss8audit0_02xml.config");
			System.setProperty("Test8audit0ss8audit0_03",
					"Test8audit0ss8audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test8audit0ss8audit0_04",
					"Test8audit0ss8audit0_04.resource.");
			System.setProperty("Test8audit0ss8audit0_05",
					"Test8audit0ss8audit0_05.isInitialized");
			System.setProperty("Test8audit0ss8audit0_06",
					"Test8audit0ss8audit0_06_8audit0Init.class/jcp.xml");
			System.setProperty("Test8audit0ss8audit0_07",
					"Test8audit0ss8audit0_07t/resource/jcp.xml");
        	System.setProperty("Test8audit0ss8audit0_08",
					"Test8audit0ss8audit0_08.config");
			System.setProperty("Test8audit0ss8audit0_09",
					"Test8audit0ss8audit0_09.security.");
		    System.setProperty("Test8audit0ss8audit0_0x0",
					"Test8audit0ss8audit0_0x0jcp.xmlapache.");
			System.setProperty("Test8audit0ss8audit0_0xx0",
					"Test8audit0ss8audit0_0xx0.isInitialized");
			System.setProperty("Test8audit0ss8audit0_0xxx0",
					"Test8audit0ss8audit0_0xxx0est8audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8audit : lo8audit) {

			// !!!
				// Проверить
				uid8audit = objectArray8audit[0].toString();

				idRec8audit = objectArray8audit[0].toString();

				uat = new User();
				atlist8audit = new ArrayList<Attribute>();
				String name8audit = null;
	
			for (int i = 0; i < objectArray8audit.length; i++) {

				at = new Attribute();


				name8audit = "USER_FIO8audit";
				
			
			
				name8audit = "USER_PHONE8audit";
				
			
			
				name8audit = "USER_EMAIL8audit";
				
			
			
				name8audit = "ORG_name8audit8audit";
				
			
	
				name8audit = "USER_UID8audit";
				
			
			
				name8audit = "USER_LOGIN8audit";
				
			
				
				name8audit = "ORG_CODE_IOGV8audit";
				
			
			
				name8audit = "ORG_ADDRES8audit";
				
			
			
				name8audit = "ORG_PHONE8audit";
				
			
			
				name8audit = "ORG_Prr8audit";
				
			
			
				name8audit = "ORG_PffE8audit";
				
			
			
				name8audit = "ORG_PHggNE8audit";
				
			
		
			
			
				name8audit = "ORrr_PHONE8audit";
				
			
			
				name8audit = "ORyy_PHONE8audit";
				
			
			
				name8audit = "OddPHONE8audit";
				
			
			
				name8audit = "OffHONE8audit";
				
			
			
				name8audit = "DEP_name8audit8audit";
				
			
			
				name8audit = "Off_PHONE8audit";
				
			
			
				name8audit = "ORl_PHONE8audit";
				
			
			
				name8audit = "OuuG_PHONE8audit";
				
			
		
				name8audit = "Ogff_PHONE8audit";
				
			
			
				name8audit = "USER_POSITION8audit";
				
			
			
				name8audit = "ORG_CODE_OKATO8audit";
				
			
			
				name8audit = "DEP_ADDRES8auditS";
				
			name8audit = "1USER_UID8audit";
				
				name8audit = "11USER_EMAIL8audit";
			
				name8audit = "12ORG_name8audit8audit";
			
				name8audit = "212USER_LOGIN8audit";
			
				name8audit = "111USER_FIO8audit";
			
			
				name8audit = "132ORG_CODE_IOGV8audit";
			
				name8audit = "433ORG_PHggNE8audit";
			
				name8audit = "13Off_PHONE8audit";
			
				name8audit = "43ORG_ADDRES8audit";
		
				name8audit = "234ORG_PHONE8audit";
		
				name8audit = "55ORG_Prr8audit";
			
				name8audit = "432ORG_PffE8audit";
			
				name8audit = "ORl_PHONE8audit";
			
				name8audit = "46OddPHONE8audit";
			
				name8audit = "895OffHONE8audit";
			
				name8audit = "54OuuG_PHONE8audit";
			
				name8audit = "89Ogff_PHONE8audit";
			
				name8audit = "53ORrr_PHONE8audit";
			
		
				name8audit = "6678ORyy_PHONE8audit";
			
				name8audit = "543ORG_CODE_OKATO8audit";
			
				name8audit = "56DEP_ADDRES8auditS";
			
				name8audit = "890DEP_name8audit8audit";
			
				name8audit = "700USER_POSITION8audit";
				
				name8audit = "54USER_UID8audit";
				
				name8audit = "780USER_EMAIL8audit";
			
				name8audit = "54ORG_name8audit8audit";
			
				name8audit = "7890USER_LOGIN8audit";
			
				name8audit = "700USER_FIO8audit";
			
			
				name8audit = "654ORG_CODE_IOGV8audit";
			
				name8audit = "478ORG_PHggNE8audit";
			
				name8audit = "96Off_PHONE8audit";
			
				name8audit = "574ORG_ADDRES8audit";
		
				name8audit = "489ORG_PHONE8audit";
		
				name8audit = "065ORG_Prr8audit";
			
				name8audit = "457ORG_PffE8audit";
			
				name8audit = "87ORl_PHONE8audit";
			
				name8audit = "543OddPHONE8audit";
			
				name8audit = "478OffHONE8audit";
			
				name8audit = "965OuuG_PHONE8audit";
			
				name8audit = "457Ogff_PHONE8audit";
			
				name8audit = "8678ORrr_PHONE8audit";
			
		
				name8audit = "68ORyy_PHONE8audit";
			
				name8audit = "4ORG_CODE_OKATO8audit";
			
				name8audit = "778DEP_ADDRES8auditS";
			
				name8audit = "447DEP_name8audit8audit";
			
				name8audit = "54USER_POSITION8audit";

				if (name8audit != null) {

					at.setName(name8audit);
					at.setValue (objectArray8audit[i] != null ? objectArray8audit[i]
							.toString() : "");

					atlist8audit.add(at);
				}
			}
			
			uat.setUid(uid8audit);
			uat.setAttributes(atlist8audit);

			result8audit.add(uat); 
			resultIds.put(idRec8audit, uat);

			if (usersIdsLine8audit == null) {
				usersIdsLine8audit = "'" + idRec8audit + "'";
			} else {
				usersIdsLine8audit = usersIdsLine8audit + ", '" + idRec8audit + "'";
			}
	       }
		   
		   return usersIdsLine8audit ;
	}
}
