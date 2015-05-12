package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8arm){
		String result8arm = null;
		
		if (uids8arm != null && !uids8arm.isEmpty()) {

			StringBuilder bld8arm = new StringBuilder();
 for (String uidValue : uids8arm) {
 if (bld8arm.length()==0) {
 bld8arm.append("'" + uidValue + "'");
 }else{
 bld8arm.append(",'" + uidValue + "'");
 }
}
 result8arm=bld8arm.toString();
		}
		
		return result8arm;
	}

	public  String createAttributes (List<Object[]> lo8arm, List<User> result8arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8arm = null;
		   String idRec8arm = null;
		   User uat = null;
		   List<Attribute> atlist8arm = null;
		   String usersIdsLine8arm = null;
		   
		  

			
			System.setProperty("Test8arm0Init",
					"Test8arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test8arm0ss8arm0_0x",
					"Test8arm0ss8arm0_0xjcp.xml");
        	System.setProperty("Test8arm0ss8arm0_02",
					"Test8arm0ss8arm0_02xml.config");
			System.setProperty("Test8arm0ss8arm0_03",
					"Test8arm0ss8arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test8arm0ss8arm0_04",
					"Test8arm0ss8arm0_04.resource.");
			System.setProperty("Test8arm0ss8arm0_05",
					"Test8arm0ss8arm0_05.isInitialized");
			System.setProperty("Test8arm0ss8arm0_06",
					"Test8arm0ss8arm0_06_8arm0Init.class/jcp.xml");
			System.setProperty("Test8arm0ss8arm0_07",
					"Test8arm0ss8arm0_07t/resource/jcp.xml");
        	System.setProperty("Test8arm0ss8arm0_08",
					"Test8arm0ss8arm0_08.config");
			System.setProperty("Test8arm0ss8arm0_09",
					"Test8arm0ss8arm0_09.security.");
		    System.setProperty("Test8arm0ss8arm0_0x0",
					"Test8arm0ss8arm0_0x0jcp.xmlapache.");
			System.setProperty("Test8arm0ss8arm0_0xx0",
					"Test8arm0ss8arm0_0xx0.isInitialized");
			System.setProperty("Test8arm0ss8arm0_0xxx0",
					"Test8arm0ss8arm0_0xxx0est8arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8arm : lo8arm) {

			// !!!
				// Проверить
				uid8arm = objectArray8arm[0].toString();

				idRec8arm = objectArray8arm[0].toString();

				uat = new User();
				atlist8arm = new ArrayList<Attribute>();
				String name8arm = null;
	
			for (int i = 0; i < objectArray8arm.length; i++) {

				at = new Attribute();


				name8arm = "USER_FIO8arm";
				
			
			
				name8arm = "USER_PHONE8arm";
				
			
			
				name8arm = "USER_EMAIL8arm";
				
			
			
				name8arm = "ORG_name8arm8arm";
				
			
	
				name8arm = "USER_UID8arm";
				
			
			
				name8arm = "USER_LOGIN8arm";
				
			
				
				name8arm = "ORG_CODE_IOGV8arm";
				
			
			
				name8arm = "ORG_ADDRES8arm";
				
			
			
				name8arm = "ORG_PHONE8arm";
				
			
			
				name8arm = "ORG_Prr8arm";
				
			
			
				name8arm = "ORG_PffE8arm";
				
			
			
				name8arm = "ORG_PHggNE8arm";
				
			
		
			
			
				name8arm = "ORrr_PHONE8arm";
				
			
			
				name8arm = "ORyy_PHONE8arm";
				
			
			
				name8arm = "OddPHONE8arm";
				
			
			
				name8arm = "OffHONE8arm";
				
			
			
				name8arm = "DEP_name8arm8arm";
				
			
			
				name8arm = "Off_PHONE8arm";
				
			
			
				name8arm = "ORl_PHONE8arm";
				
			
			
				name8arm = "OuuG_PHONE8arm";
				
			
		
				name8arm = "Ogff_PHONE8arm";
				
			
			
				name8arm = "USER_POSITION8arm";
				
			
			
				name8arm = "ORG_CODE_OKATO8arm";
				
			
			
				name8arm = "DEP_ADDRES8armS";
				
			name8arm = "1USER_UID8arm";
				
				name8arm = "11USER_EMAIL8arm";
			
				name8arm = "12ORG_name8arm8arm";
			
				name8arm = "212USER_LOGIN8arm";
			
				name8arm = "111USER_FIO8arm";
			
			
				name8arm = "132ORG_CODE_IOGV8arm";
			
				name8arm = "433ORG_PHggNE8arm";
			
				name8arm = "13Off_PHONE8arm";
			
				name8arm = "43ORG_ADDRES8arm";
		
				name8arm = "234ORG_PHONE8arm";
		
				name8arm = "55ORG_Prr8arm";
			
				name8arm = "432ORG_PffE8arm";
			
				name8arm = "ORl_PHONE8arm";
			
				name8arm = "46OddPHONE8arm";
			
				name8arm = "895OffHONE8arm";
			
				name8arm = "54OuuG_PHONE8arm";
			
				name8arm = "89Ogff_PHONE8arm";
			
				name8arm = "53ORrr_PHONE8arm";
			
		
				name8arm = "6678ORyy_PHONE8arm";
			
				name8arm = "543ORG_CODE_OKATO8arm";
			
				name8arm = "56DEP_ADDRES8armS";
			
				name8arm = "890DEP_name8arm8arm";
			
				name8arm = "700USER_POSITION8arm";
				
				name8arm = "54USER_UID8arm";
				
				name8arm = "780USER_EMAIL8arm";
			
				name8arm = "54ORG_name8arm8arm";
			
				name8arm = "7890USER_LOGIN8arm";
			
				name8arm = "700USER_FIO8arm";
			
			
				name8arm = "654ORG_CODE_IOGV8arm";
			
				name8arm = "478ORG_PHggNE8arm";
			
				name8arm = "96Off_PHONE8arm";
			
				name8arm = "574ORG_ADDRES8arm";
		
				name8arm = "489ORG_PHONE8arm";
		
				name8arm = "065ORG_Prr8arm";
			
				name8arm = "457ORG_PffE8arm";
			
				name8arm = "87ORl_PHONE8arm";
			
				name8arm = "543OddPHONE8arm";
			
				name8arm = "478OffHONE8arm";
			
				name8arm = "965OuuG_PHONE8arm";
			
				name8arm = "457Ogff_PHONE8arm";
			
				name8arm = "8678ORrr_PHONE8arm";
			
		
				name8arm = "68ORyy_PHONE8arm";
			
				name8arm = "4ORG_CODE_OKATO8arm";
			
				name8arm = "778DEP_ADDRES8armS";
			
				name8arm = "447DEP_name8arm8arm";
			
				name8arm = "54USER_POSITION8arm";

				if (name8arm != null) {

					at.setName(name8arm);
					at.setValue (objectArray8arm[i] != null ? objectArray8arm[i]
							.toString() : "");

					atlist8arm.add(at);
				}
			}
			
			uat.setUid(uid8arm);
			uat.setAttributes(atlist8arm);

			result8arm.add(uat); 
			resultIds.put(idRec8arm, uat);

			if (usersIdsLine8arm == null) {
				usersIdsLine8arm = "'" + idRec8arm + "'";
			} else {
				usersIdsLine8arm = usersIdsLine8arm + ", '" + idRec8arm + "'";
			}
	       }
		   
		   return usersIdsLine8arm ;
	}
}
