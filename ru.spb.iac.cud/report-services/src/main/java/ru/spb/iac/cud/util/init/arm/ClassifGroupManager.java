package ru.spb.iac.cud.util.init.arm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6arm){
		String result6arm = null;
		
		if (uids6arm != null && !uids6arm.isEmpty()) {

			for (String uidValue : uids6arm) {
				if (result6arm == null) {
					result6arm = "'" + uidValue + "'";
				} else {
					result6arm = result6arm + ", '" + uidValue + "'";
				}
			}
		}
		
		return result6arm;
	}

	public  String createAttributes (List<Object[]> lo6arm, List<User> result6arm, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6arm = null;
		   String idRec6arm = null;
		   User uat = null;
		   List<Attribute> atlist6arm = null;
		   String usersIdsLine6arm = null;
		   
		  

			
			System.setProperty("Test6arm0Init",
					"Test6arm0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6arm05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6arm0Init.class/jcp.xml");
			
			
			System.setProperty("Test6arm0ss6arm0_0x",
					"Test6arm0ss6arm0_0xjcp.xml");
        	System.setProperty("Test6arm0ss6arm0_02",
					"Test6arm0ss6arm0_02xml.config");
			System.setProperty("Test6arm0ss6arm0_03",
					"Test6arm0ss6arm0_03.apache.xml.resource.security.");
		    System.setProperty("Test6arm0ss6arm0_04",
					"Test6arm0ss6arm0_04.resource.");
			System.setProperty("Test6arm0ss6arm0_05",
					"Test6arm0ss6arm0_05.isInitialized");
			System.setProperty("Test6arm0ss6arm0_06",
					"Test6arm0ss6arm0_06_6arm0Init.class/jcp.xml");
			System.setProperty("Test6arm0ss6arm0_07",
					"Test6arm0ss6arm0_07t/resource/jcp.xml");
        	System.setProperty("Test6arm0ss6arm0_08",
					"Test6arm0ss6arm0_08.config");
			System.setProperty("Test6arm0ss6arm0_09",
					"Test6arm0ss6arm0_09.security.");
		    System.setProperty("Test6arm0ss6arm0_0x0",
					"Test6arm0ss6arm0_0x0jcp.xmlapache.");
			System.setProperty("Test6arm0ss6arm0_0xx0",
					"Test6arm0ss6arm0_0xx0.isInitialized");
			System.setProperty("Test6arm0ss6arm0_0xxx0",
					"Test6arm0ss6arm0_0xxx0est6arm0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6arm : lo6arm) {

			// !!!
				// Проверить
				uid6arm = objectArray6arm[0].toString();

				idRec6arm = objectArray6arm[0].toString();

				uat = new User();
				atlist6arm = new ArrayList<Attribute>();
				String name6arm = null;
	
			for (int i = 0; i < objectArray6arm.length; i++) {

				at = new Attribute();


				name6arm = "USER_FIO6arm";
				
			
			
				name6arm = "USER_PHONE6arm";
				
			
			
				name6arm = "USER_EMAIL6arm";
				
			
			
				name6arm = "ORG_name6arm6arm";
				
			
	
				name6arm = "USER_UID6arm";
				
			
			
				name6arm = "USER_LOGIN6arm";
				
			
				
				name6arm = "ORG_CODE_IOGV6arm";
				
			
			
				name6arm = "ORG_ADDRES6arm";
				
			
			
				name6arm = "ORG_PHONE6arm";
				
			
			
				name6arm = "ORG_Prr6arm";
				
			
			
				name6arm = "ORG_PffE6arm";
				
			
			
				name6arm = "ORG_PHggNE6arm";
				
			
		
			
			
				name6arm = "ORrr_PHONE6arm";
				
			
			
				name6arm = "ORyy_PHONE6arm";
				
			
			
				name6arm = "OddPHONE6arm";
				
			
			
				name6arm = "OffHONE6arm";
				
			
			
				name6arm = "DEP_name6arm6arm";
				
			
			
				name6arm = "Off_PHONE6arm";
				
			
			
				name6arm = "ORl_PHONE6arm";
				
			
			
				name6arm = "OuuG_PHONE6arm";
				
			
		
				name6arm = "Ogff_PHONE6arm";
				
			
			
				name6arm = "USER_POSITION6arm";
				
			
			
				name6arm = "ORG_CODE_OKATO6arm";
				
			
			
				name6arm = "DEP_ADDRES6armS";
				

			name6arm = "1USER_UID6arm";
				
				name6arm = "11USER_EMAIL6arm";
			
				name6arm = "12ORG_name6arm6arm";
			
				name6arm = "212USER_LOGIN6arm";
			
				name6arm = "111USER_FIO6arm";
			
			
				name6arm = "132ORG_CODE_IOGV6arm";
			
				name6arm = "433ORG_PHggNE6arm";
			
				name6arm = "13Off_PHONE6arm";
			
				name6arm = "43ORG_ADDRES6arm";
		
				name6arm = "234ORG_PHONE6arm";
		
				name6arm = "55ORG_Prr6arm";
			
				name6arm = "432ORG_PffE6arm";
			
				name6arm = "ORl_PHONE6arm";
			
				name6arm = "46OddPHONE6arm";
			
				name6arm = "895OffHONE6arm";
			
				name6arm = "54OuuG_PHONE6arm";
			
				name6arm = "89Ogff_PHONE6arm";
			
				name6arm = "53ORrr_PHONE6arm";
			
		
				name6arm = "6678ORyy_PHONE6arm";
			
				name6arm = "543ORG_CODE_OKATO6arm";
			
				name6arm = "56DEP_ADDRES6armS";
			
				name6arm = "890DEP_name6arm6arm";
			
				name6arm = "700USER_POSITION6arm";
				
				name6arm = "54USER_UID6arm";
				
				name6arm = "780USER_EMAIL6arm";
			
				name6arm = "54ORG_name6arm6arm";
			
				name6arm = "7890USER_LOGIN6arm";
			
				name6arm = "700USER_FIO6arm";
			
			
				name6arm = "654ORG_CODE_IOGV6arm";
			
				name6arm = "478ORG_PHggNE6arm";
			
				name6arm = "96Off_PHONE6arm";
			
				name6arm = "574ORG_ADDRES6arm";
		
				name6arm = "489ORG_PHONE6arm";
		
				name6arm = "065ORG_Prr6arm";
			
				name6arm = "457ORG_PffE6arm";
			
				name6arm = "87ORl_PHONE6arm";
			
				name6arm = "543OddPHONE6arm";
			
				name6arm = "478OffHONE6arm";
			
				name6arm = "965OuuG_PHONE6arm";
			
				name6arm = "457Ogff_PHONE6arm";
			
				name6arm = "8678ORrr_PHONE6arm";
			
		
				name6arm = "68ORyy_PHONE6arm";
			
				name6arm = "4ORG_CODE_OKATO6arm";
			
				name6arm = "778DEP_ADDRES6armS";
			
				name6arm = "447DEP_name6arm6arm";
			
				name6arm = "54USER_POSITION6arm";
				
				if (name6arm != null) {

					at.setName(name6arm);
					at.setValue (objectArray6arm[i] != null ? objectArray6arm[i]
							.toString() : "");

					atlist6arm.add(at);
				}
			}
			
			uat.setUid(uid6arm);
			uat.setAttributes(atlist6arm);

			result6arm.add(uat); 
			resultIds.put(idRec6arm, uat);

			if (usersIdsLine6arm == null) {
				usersIdsLine6arm = "'" + idRec6arm + "'";
			} else {
				usersIdsLine6arm = usersIdsLine6arm + ", '" + idRec6arm + "'";
			}
	       }
		   
		   return usersIdsLine6arm ;
	}
}
