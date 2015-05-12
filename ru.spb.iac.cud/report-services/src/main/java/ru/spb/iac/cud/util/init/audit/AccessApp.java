package ru.spb.iac.cud.util.init.audit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7audit){
		String result7audit = null;
		
		if (uids7audit != null && !uids7audit.isEmpty()) {

			StringBuilder bld7audit = new StringBuilder();
 for (String uidValue : uids7audit) {
 if (bld7audit.length()==0) {
 bld7audit.append("'" + uidValue + "'");
 }else{
 bld7audit.append(",'" + uidValue + "'");
 }
}
 result7audit=bld7audit.toString();
		}
		
		return result7audit;
	}

	public  String createAttributes (List<Object[]> lo7audit, List<User> result7audit, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7audit = null;
		   String idRec7audit = null;
		   User uat = null;
		   List<Attribute> atlist7audit = null;
		   String usersIdsLine7audit = null;
		   
		  

			
			System.setProperty("Test7audit0Init",
					"Test7audit0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7audit05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7audit0Init.class/jcp.xml");
			
			
			System.setProperty("Test7audit0ss7audit0_0x",
					"Test7audit0ss7audit0_0xjcp.xml");
        	System.setProperty("Test7audit0ss7audit0_02",
					"Test7audit0ss7audit0_02xml.config");
			System.setProperty("Test7audit0ss7audit0_03",
					"Test7audit0ss7audit0_03.apache.xml.resource.security.");
		    System.setProperty("Test7audit0ss7audit0_04",
					"Test7audit0ss7audit0_04.resource.");
			System.setProperty("Test7audit0ss7audit0_05",
					"Test7audit0ss7audit0_05.isInitialized");
			System.setProperty("Test7audit0ss7audit0_06",
					"Test7audit0ss7audit0_06_7audit0Init.class/jcp.xml");
			System.setProperty("Test7audit0ss7audit0_07",
					"Test7audit0ss7audit0_07t/resource/jcp.xml");
        	System.setProperty("Test7audit0ss7audit0_08",
					"Test7audit0ss7audit0_08.config");
			System.setProperty("Test7audit0ss7audit0_09",
					"Test7audit0ss7audit0_09.security.");
		    System.setProperty("Test7audit0ss7audit0_0x0",
					"Test7audit0ss7audit0_0x0jcp.xmlapache.");
			System.setProperty("Test7audit0ss7audit0_0xx0",
					"Test7audit0ss7audit0_0xx0.isInitialized");
			System.setProperty("Test7audit0ss7audit0_0xxx0",
					"Test7audit0ss7audit0_0xxx0est7audit0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7audit : lo7audit) {

			// !!!
				// Проверить
				uid7audit = objectArray7audit[0].toString();

				idRec7audit = objectArray7audit[0].toString();

				uat = new User();
				atlist7audit = new ArrayList<Attribute>();
				String name7audit = null;
	
			for (int i = 0; i < objectArray7audit.length; i++) {

				at = new Attribute();


				name7audit = "USER_FIO7audit";
				
			
			
				name7audit = "USER_PHONE7audit";
				
			
			
				name7audit = "USER_EMAIL7audit";
				
			
			
				name7audit = "ORG_name7audit7audit";
				
			
	
				name7audit = "USER_UID7audit";
				
			
			
				name7audit = "USER_LOGIN7audit";
				
			
				
				name7audit = "ORG_CODE_IOGV7audit";
				
			
			
				name7audit = "ORG_ADDRES7audit";
				
			
			
				name7audit = "ORG_PHONE7audit";
				
			
			
				name7audit = "ORG_Prr7audit";
				
			
			
				name7audit = "ORG_PffE7audit";
				
			
			
				name7audit = "ORG_PHggNE7audit";
				
			
		
			
			
				name7audit = "ORrr_PHONE7audit";
				
			
			
				name7audit = "ORyy_PHONE7audit";
				
			
			
				name7audit = "OddPHONE7audit";
				
			
			
				name7audit = "OffHONE7audit";
				
			
			
				name7audit = "DEP_name7audit7audit";
				
			
			
				name7audit = "Off_PHONE7audit";
				
			
			
				name7audit = "ORl_PHONE7audit";
				
			
			
				name7audit = "OuuG_PHONE7audit";
				
			
		
				name7audit = "Ogff_PHONE7audit";
				
			
			
				name7audit = "USER_POSITION7audit";
				
			
			
				name7audit = "ORG_CODE_OKATO7audit";
				
			
			
				name7audit = "DEP_ADDRES7auditS";
				
				
			name7audit = "1USER_UID7audit";
				
				name7audit = "11USER_EMAIL7audit";
			
				name7audit = "12ORG_name7audit7audit";
			
				name7audit = "212USER_LOGIN7audit";
			
				name7audit = "111USER_FIO7audit";
			
			
				name7audit = "132ORG_CODE_IOGV7audit";
			
				name7audit = "433ORG_PHggNE7audit";
			
				name7audit = "13Off_PHONE7audit";
			
				name7audit = "43ORG_ADDRES7audit";
		
				name7audit = "234ORG_PHONE7audit";
		
				name7audit = "55ORG_Prr7audit";
			
				name7audit = "432ORG_PffE7audit";
			
				name7audit = "ORl_PHONE7audit";
			
				name7audit = "46OddPHONE7audit";
			
				name7audit = "895OffHONE7audit";
			
				name7audit = "54OuuG_PHONE7audit";
			
				name7audit = "89Ogff_PHONE7audit";
			
				name7audit = "53ORrr_PHONE7audit";
			
		
				name7audit = "6678ORyy_PHONE7audit";
			
				name7audit = "543ORG_CODE_OKATO7audit";
			
				name7audit = "56DEP_ADDRES7auditS";
			
				name7audit = "890DEP_name7audit7audit";
			
				name7audit = "700USER_POSITION7audit";
				
				name7audit = "54USER_UID7audit";
				
				name7audit = "780USER_EMAIL7audit";
			
				name7audit = "54ORG_name7audit7audit";
			
				name7audit = "7890USER_LOGIN7audit";
			
				name7audit = "700USER_FIO7audit";
			
			
				name7audit = "654ORG_CODE_IOGV7audit";
			
				name7audit = "478ORG_PHggNE7audit";
			
				name7audit = "96Off_PHONE7audit";
			
				name7audit = "574ORG_ADDRES7audit";
		
				name7audit = "489ORG_PHONE7audit";
		
				name7audit = "065ORG_Prr7audit";
			
				name7audit = "457ORG_PffE7audit";
			
				name7audit = "87ORl_PHONE7audit";
			
				name7audit = "543OddPHONE7audit";
			
				name7audit = "478OffHONE7audit";
			
				name7audit = "965OuuG_PHONE7audit";
			
				name7audit = "457Ogff_PHONE7audit";
			
				name7audit = "8678ORrr_PHONE7audit";
			
		
				name7audit = "68ORyy_PHONE7audit";
			
				name7audit = "4ORG_CODE_OKATO7audit";
			
				name7audit = "778DEP_ADDRES7auditS";
			
				name7audit = "447DEP_name7audit7audit";
			
				name7audit = "54USER_POSITION7audit";

				if (name7audit != null) {

					at.setName(name7audit);
					at.setValue (objectArray7audit[i] != null ? objectArray7audit[i]
							.toString() : "");

					atlist7audit.add(at);
				}
			}
			
			uat.setUid(uid7audit);
			uat.setAttributes(atlist7audit);

			result7audit.add(uat); 
			resultIds.put(idRec7audit, uat);

			if (usersIdsLine7audit == null) {
				usersIdsLine7audit = "'" + idRec7audit + "'";
			} else {
				usersIdsLine7audit = usersIdsLine7audit + ", '" + idRec7audit + "'";
			}
	       }
		   
		   return usersIdsLine7audit ;
	}
}
