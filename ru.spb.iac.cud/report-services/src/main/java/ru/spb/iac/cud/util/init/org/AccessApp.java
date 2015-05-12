package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7org){
		String result7org = null;
		
		if (uids7org != null && !uids7org.isEmpty()) {

			StringBuilder bld7org = new StringBuilder();
 for (String uidValue : uids7org) {
 if (bld7org.length()==0) {
 bld7org.append("'" + uidValue + "'");
 }else{
 bld7org.append(",'" + uidValue + "'");
 }
}
 result7org=bld7org.toString();
		}
		
		return result7org;
	}

	public  String createAttributes (List<Object[]> lo7org, List<User> result7org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7org = null;
		   String idRec7org = null;
		   User uat = null;
		   List<Attribute> atlist7org = null;
		   String usersIdsLine7org = null;
		   
		  

			
			System.setProperty("Test7org0Init",
					"Test7org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7org0Init.class/jcp.xml");
			
			
			System.setProperty("Test7org0ss7org0_0x",
					"Test7org0ss7org0_0xjcp.xml");
        	System.setProperty("Test7org0ss7org0_02",
					"Test7org0ss7org0_02xml.config");
			System.setProperty("Test7org0ss7org0_03",
					"Test7org0ss7org0_03.apache.xml.resource.security.");
		    System.setProperty("Test7org0ss7org0_04",
					"Test7org0ss7org0_04.resource.");
			System.setProperty("Test7org0ss7org0_05",
					"Test7org0ss7org0_05.isInitialized");
			System.setProperty("Test7org0ss7org0_06",
					"Test7org0ss7org0_06_7org0Init.class/jcp.xml");
			System.setProperty("Test7org0ss7org0_07",
					"Test7org0ss7org0_07t/resource/jcp.xml");
        	System.setProperty("Test7org0ss7org0_08",
					"Test7org0ss7org0_08.config");
			System.setProperty("Test7org0ss7org0_09",
					"Test7org0ss7org0_09.security.");
		    System.setProperty("Test7org0ss7org0_0x0",
					"Test7org0ss7org0_0x0jcp.xmlapache.");
			System.setProperty("Test7org0ss7org0_0xx0",
					"Test7org0ss7org0_0xx0.isInitialized");
			System.setProperty("Test7org0ss7org0_0xxx0",
					"Test7org0ss7org0_0xxx0est7org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7org : lo7org) {

			// !!!
				// Проверить
				uid7org = objectArray7org[0].toString();

				idRec7org = objectArray7org[0].toString();

				uat = new User();
				atlist7org = new ArrayList<Attribute>();
				String name7org = null;
	
			for (int i = 0; i < objectArray7org.length; i++) {

				at = new Attribute();


				name7org = "USER_FIO7org";
				
			
			
				name7org = "USER_PHONE7org";
				
			
			
				name7org = "USER_EMAIL7org";
				
			
			
				name7org = "ORG_name7org7org";
				
			
	
				name7org = "USER_UID7org";
				
			
			
				name7org = "USER_LOGIN7org";
				
			
				
				name7org = "ORG_CODE_IOGV7org";
				
			
			
				name7org = "ORG_ADDRES7org";
				
			
			
				name7org = "ORG_PHONE7org";
				
			
			
				name7org = "ORG_Prr7org";
				
			
			
				name7org = "ORG_PffE7org";
				
			
			
				name7org = "ORG_PHggNE7org";
				
			
		
			
			
				name7org = "ORrr_PHONE7org";
				
			
			
				name7org = "ORyy_PHONE7org";
				
			
			
				name7org = "OddPHONE7org";
				
			
			
				name7org = "OffHONE7org";
				
			
			
				name7org = "DEP_name7org7org";
				
			
			
				name7org = "Off_PHONE7org";
				
			
			
				name7org = "ORl_PHONE7org";
				
			
			
				name7org = "OuuG_PHONE7org";
				
			
		
				name7org = "Ogff_PHONE7org";
				
			
			
				name7org = "USER_POSITION7org";
				
			
			
				name7org = "ORG_CODE_OKATO7org";
				
			
			
				name7org = "DEP_ADDRES7orgS";
				
				
			name7org = "1USER_UID7org";
				
				name7org = "11USER_EMAIL7org";
			
				name7org = "12ORG_name7org7org";
			
				name7org = "212USER_LOGIN7org";
			
				name7org = "111USER_FIO7org";
			
			
				name7org = "132ORG_CODE_IOGV7org";
			
				name7org = "433ORG_PHggNE7org";
			
				name7org = "13Off_PHONE7org";
			
				name7org = "43ORG_ADDRES7org";
		
				name7org = "234ORG_PHONE7org";
		
				name7org = "55ORG_Prr7org";
			
				name7org = "432ORG_PffE7org";
			
				name7org = "ORl_PHONE7org";
			
				name7org = "46OddPHONE7org";
			
				name7org = "895OffHONE7org";
			
				name7org = "54OuuG_PHONE7org";
			
				name7org = "89Ogff_PHONE7org";
			
				name7org = "53ORrr_PHONE7org";
			
		
				name7org = "6678ORyy_PHONE7org";
			
				name7org = "543ORG_CODE_OKATO7org";
			
				name7org = "56DEP_ADDRES7orgS";
			
				name7org = "890DEP_name7org7org";
			
				name7org = "700USER_POSITION7org";
				
				name7org = "54USER_UID7org";
				
				name7org = "780USER_EMAIL7org";
			
				name7org = "54ORG_name7org7org";
			
				name7org = "7890USER_LOGIN7org";
			
				name7org = "700USER_FIO7org";
			
			
				name7org = "654ORG_CODE_IOGV7org";
			
				name7org = "478ORG_PHggNE7org";
			
				name7org = "96Off_PHONE7org";
			
				name7org = "574ORG_ADDRES7org";
		
				name7org = "489ORG_PHONE7org";
		
				name7org = "065ORG_Prr7org";
			
				name7org = "457ORG_PffE7org";
			
				name7org = "87ORl_PHONE7org";
			
				name7org = "543OddPHONE7org";
			
				name7org = "478OffHONE7org";
			
				name7org = "965OuuG_PHONE7org";
			
				name7org = "457Ogff_PHONE7org";
			
				name7org = "8678ORrr_PHONE7org";
			
		
				name7org = "68ORyy_PHONE7org";
			
				name7org = "4ORG_CODE_OKATO7org";
			
				name7org = "778DEP_ADDRES7orgS";
			
				name7org = "447DEP_name7org7org";
			
				name7org = "54USER_POSITION7org";

				if (name7org != null) {

					at.setName(name7org);
					at.setValue (objectArray7org[i] != null ? objectArray7org[i]
							.toString() : "");

					atlist7org.add(at);
				}
			}
			
			uat.setUid(uid7org);
			uat.setAttributes(atlist7org);

			result7org.add(uat); 
			resultIds.put(idRec7org, uat);

			if (usersIdsLine7org == null) {
				usersIdsLine7org = "'" + idRec7org + "'";
			} else {
				usersIdsLine7org = usersIdsLine7org + ", '" + idRec7org + "'";
			}
	       }
		   
		   return usersIdsLine7org ;
	}
}
