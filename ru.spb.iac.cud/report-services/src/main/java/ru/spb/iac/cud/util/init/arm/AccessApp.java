package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7arm){
		String result7arm = null;
		
		if (uids7arm != null && !uids7arm.isEmpty()) {

			StringBuilder bld7arm = new StringBuilder();
 for (String uidValue : uids7arm) {
 if (bld7arm.length()==0) {
 bld7arm.append("'" + uidValue + "'");
 }else{
 bld7arm.append(",'" + uidValue + "'");
 }
}
 result7arm=bld7arm.toString();
		}
		
		return result7arm;
	}

	public  String createAttributes (List<Object[]> lo7arm, List<User> result7arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7arm = null;
		   String idRec7arm = null;
		   User uat = null;
		   List<Attribute> atlist7arm = null;
		   String usersIdsLine7arm = null;
		   
		  

			
			System.setProperty("Test7arm0Init",
					"Test7arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test7arm0ss7arm0_0x",
					"Test7arm0ss7arm0_0xjcp.xml");
        	System.setProperty("Test7arm0ss7arm0_02",
					"Test7arm0ss7arm0_02xml.config");
			System.setProperty("Test7arm0ss7arm0_03",
					"Test7arm0ss7arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test7arm0ss7arm0_04",
					"Test7arm0ss7arm0_04.resource.");
			System.setProperty("Test7arm0ss7arm0_05",
					"Test7arm0ss7arm0_05.isInitialized");
			System.setProperty("Test7arm0ss7arm0_06",
					"Test7arm0ss7arm0_06_7arm0Init.class/jcp.xml");
			System.setProperty("Test7arm0ss7arm0_07",
					"Test7arm0ss7arm0_07t/resource/jcp.xml");
        	System.setProperty("Test7arm0ss7arm0_08",
					"Test7arm0ss7arm0_08.config");
			System.setProperty("Test7arm0ss7arm0_09",
					"Test7arm0ss7arm0_09.security.");
		    System.setProperty("Test7arm0ss7arm0_0x0",
					"Test7arm0ss7arm0_0x0jcp.xmlapache.");
			System.setProperty("Test7arm0ss7arm0_0xx0",
					"Test7arm0ss7arm0_0xx0.isInitialized");
			System.setProperty("Test7arm0ss7arm0_0xxx0",
					"Test7arm0ss7arm0_0xxx0est7arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7arm : lo7arm) {

			// !!!
				// Проверить
				uid7arm = objectArray7arm[0].toString();

				idRec7arm = objectArray7arm[0].toString();

				uat = new User();
				atlist7arm = new ArrayList<Attribute>();
				String name7arm = null;
	
			for (int i = 0; i < objectArray7arm.length; i++) {

				at = new Attribute();


				name7arm = "USER_FIO7arm";
				
			
			
				name7arm = "USER_PHONE7arm";
				
			
			
				name7arm = "USER_EMAIL7arm";
				
			
			
				name7arm = "ORG_name7arm7arm";
				
			
	
				name7arm = "USER_UID7arm";
				
			
			
				name7arm = "USER_LOGIN7arm";
				
			
				
				name7arm = "ORG_CODE_IOGV7arm";
				
			
			
				name7arm = "ORG_ADDRES7arm";
				
			
			
				name7arm = "ORG_PHONE7arm";
				
			
			
				name7arm = "ORG_Prr7arm";
				
			
			
				name7arm = "ORG_PffE7arm";
				
			
			
				name7arm = "ORG_PHggNE7arm";
				
			
		
			
			
				name7arm = "ORrr_PHONE7arm";
				
			
			
				name7arm = "ORyy_PHONE7arm";
				
			
			
				name7arm = "OddPHONE7arm";
				
			
			
				name7arm = "OffHONE7arm";
				
			
			
				name7arm = "DEP_name7arm7arm";
				
			
			
				name7arm = "Off_PHONE7arm";
				
			
			
				name7arm = "ORl_PHONE7arm";
				
			
			
				name7arm = "OuuG_PHONE7arm";
				
			
		
				name7arm = "Ogff_PHONE7arm";
				
			
			
				name7arm = "USER_POSITION7arm";
				
			
			
				name7arm = "ORG_CODE_OKATO7arm";
				
			
			
				name7arm = "DEP_ADDRES7armS";
				
				
			name7arm = "1USER_UID7arm";
				
				name7arm = "11USER_EMAIL7arm";
			
				name7arm = "12ORG_name7arm7arm";
			
				name7arm = "212USER_LOGIN7arm";
			
				name7arm = "111USER_FIO7arm";
			
			
				name7arm = "132ORG_CODE_IOGV7arm";
			
				name7arm = "433ORG_PHggNE7arm";
			
				name7arm = "13Off_PHONE7arm";
			
				name7arm = "43ORG_ADDRES7arm";
		
				name7arm = "234ORG_PHONE7arm";
		
				name7arm = "55ORG_Prr7arm";
			
				name7arm = "432ORG_PffE7arm";
			
				name7arm = "ORl_PHONE7arm";
			
				name7arm = "46OddPHONE7arm";
			
				name7arm = "895OffHONE7arm";
			
				name7arm = "54OuuG_PHONE7arm";
			
				name7arm = "89Ogff_PHONE7arm";
			
				name7arm = "53ORrr_PHONE7arm";
			
		
				name7arm = "6678ORyy_PHONE7arm";
			
				name7arm = "543ORG_CODE_OKATO7arm";
			
				name7arm = "56DEP_ADDRES7armS";
			
				name7arm = "890DEP_name7arm7arm";
			
				name7arm = "700USER_POSITION7arm";
				
				name7arm = "54USER_UID7arm";
				
				name7arm = "780USER_EMAIL7arm";
			
				name7arm = "54ORG_name7arm7arm";
			
				name7arm = "7890USER_LOGIN7arm";
			
				name7arm = "700USER_FIO7arm";
			
			
				name7arm = "654ORG_CODE_IOGV7arm";
			
				name7arm = "478ORG_PHggNE7arm";
			
				name7arm = "96Off_PHONE7arm";
			
				name7arm = "574ORG_ADDRES7arm";
		
				name7arm = "489ORG_PHONE7arm";
		
				name7arm = "065ORG_Prr7arm";
			
				name7arm = "457ORG_PffE7arm";
			
				name7arm = "87ORl_PHONE7arm";
			
				name7arm = "543OddPHONE7arm";
			
				name7arm = "478OffHONE7arm";
			
				name7arm = "965OuuG_PHONE7arm";
			
				name7arm = "457Ogff_PHONE7arm";
			
				name7arm = "8678ORrr_PHONE7arm";
			
		
				name7arm = "68ORyy_PHONE7arm";
			
				name7arm = "4ORG_CODE_OKATO7arm";
			
				name7arm = "778DEP_ADDRES7armS";
			
				name7arm = "447DEP_name7arm7arm";
			
				name7arm = "54USER_POSITION7arm";

				if (name7arm != null) {

					at.setName(name7arm);
					at.setValue (objectArray7arm[i] != null ? objectArray7arm[i]
							.toString() : "");

					atlist7arm.add(at);
				}
			}
			
			uat.setUid(uid7arm);
			uat.setAttributes(atlist7arm);

			result7arm.add(uat); 
			resultIds.put(idRec7arm, uat);

			if (usersIdsLine7arm == null) {
				usersIdsLine7arm = "'" + idRec7arm + "'";
			} else {
				usersIdsLine7arm = usersIdsLine7arm + ", '" + idRec7arm + "'";
			}
	       }
		   
		   return usersIdsLine7arm ;
	}
}
