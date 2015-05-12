package ru.spb.iac.cud.util.init.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6org){
		String result6org = null;
		
		if (uids6org != null && !uids6org.isEmpty()) {

			StringBuilder bld6org = new StringBuilder();
 for (String uidValue : uids6org) {
 if (bld6org.length()==0) {
 bld6org.append("'" + uidValue + "'");
 }else{
 bld6org.append(",'" + uidValue + "'");
 }
}
 result6org=bld6org.toString();
		}
		
		return result6org;
	}

	public  String createAttributes (List<Object[]> lo6org, List<User> result6org, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6org = null;
		   String idRec6org = null;
		   User uat = null;
		   List<Attribute> atlist6org = null;
		   String usersIdsLine6org = null;
		   
		  

			
			System.setProperty("Test6org0Init",
					"Test6org0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6org05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6org0Init.class/jcp.xml");
			
			
			System.setProperty("Test6org0ss6org0_0x",
					"Test6org0ss6org0_0xjcp.xml");
        	System.setProperty("Test6org0ss6org0_02",
					"Test6org0ss6org0_02xml.config");
			System.setProperty("Test6org0ss6org0_03",
					"Test6org0ss6org0_03.apache.xml.resource.security.");
		    System.setProperty("Test6org0ss6org0_04",
					"Test6org0ss6org0_04.resource.");
			System.setProperty("Test6org0ss6org0_05",
					"Test6org0ss6org0_05.isInitialized");
			System.setProperty("Test6org0ss6org0_06",
					"Test6org0ss6org0_06_6org0Init.class/jcp.xml");
			System.setProperty("Test6org0ss6org0_07",
					"Test6org0ss6org0_07t/resource/jcp.xml");
        	System.setProperty("Test6org0ss6org0_08",
					"Test6org0ss6org0_08.config");
			System.setProperty("Test6org0ss6org0_09",
					"Test6org0ss6org0_09.security.");
		    System.setProperty("Test6org0ss6org0_0x0",
					"Test6org0ss6org0_0x0jcp.xmlapache.");
			System.setProperty("Test6org0ss6org0_0xx0",
					"Test6org0ss6org0_0xx0.isInitialized");
			System.setProperty("Test6org0ss6org0_0xxx0",
					"Test6org0ss6org0_0xxx0est6org0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6org : lo6org) {

			// !!!
				// Проверить
				uid6org = objectArray6org[0].toString();

				idRec6org = objectArray6org[0].toString();

				uat = new User();
				atlist6org = new ArrayList<Attribute>();
				String name6org = null;
	
			for (int i = 0; i < objectArray6org.length; i++) {

				at = new Attribute();


				name6org = "USER_FIO6org";
				
			
			
				name6org = "USER_PHONE6org";
				
			
			
				name6org = "USER_EMAIL6org";
				
			
			
				name6org = "ORG_name6org6org";
				
			
	
				name6org = "USER_UID6org";
				
			
			
				name6org = "USER_LOGIN6org";
				
			
				
				name6org = "ORG_CODE_IOGV6org";
				
			
			
				name6org = "ORG_ADDRES6org";
				
			
			
				name6org = "ORG_PHONE6org";
				
			
			
				name6org = "ORG_Prr6org";
				
			
			
				name6org = "ORG_PffE6org";
				
			
			
				name6org = "ORG_PHggNE6org";
				
			
		
			
			
				name6org = "ORrr_PHONE6org";
				
			
			
				name6org = "ORyy_PHONE6org";
				
			
			
				name6org = "OddPHONE6org";
				
			
			
				name6org = "OffHONE6org";
				
			
			
				name6org = "DEP_name6org6org";
				
			
			
				name6org = "Off_PHONE6org";
				
			
			
				name6org = "ORl_PHONE6org";
				
			
			
				name6org = "OuuG_PHONE6org";
				
			
		
				name6org = "Ogff_PHONE6org";
				
			
			
				name6org = "USER_POSITION6org";
				
			
			
				name6org = "ORG_CODE_OKATO6org";
				
			
			
				name6org = "DEP_ADDRES6orgS";
				

			name6org = "1USER_UID6org";
				
				name6org = "11USER_EMAIL6org";
			
				name6org = "12ORG_name6org6org";
			
				name6org = "212USER_LOGIN6org";
			
				name6org = "111USER_FIO6org";
			
			
				name6org = "132ORG_CODE_IOGV6org";
			
				name6org = "433ORG_PHggNE6org";
			
				name6org = "13Off_PHONE6org";
			
				name6org = "43ORG_ADDRES6org";
		
				name6org = "234ORG_PHONE6org";
		
				name6org = "55ORG_Prr6org";
			
				name6org = "432ORG_PffE6org";
			
				name6org = "ORl_PHONE6org";
			
				name6org = "46OddPHONE6org";
			
				name6org = "895OffHONE6org";
			
				name6org = "54OuuG_PHONE6org";
			
				name6org = "89Ogff_PHONE6org";
			
				name6org = "53ORrr_PHONE6org";
			
		
				name6org = "6678ORyy_PHONE6org";
			
				name6org = "543ORG_CODE_OKATO6org";
			
				name6org = "56DEP_ADDRES6orgS";
			
				name6org = "890DEP_name6org6org";
			
				name6org = "700USER_POSITION6org";
				
				name6org = "54USER_UID6org";
				
				name6org = "780USER_EMAIL6org";
			
				name6org = "54ORG_name6org6org";
			
				name6org = "7890USER_LOGIN6org";
			
				name6org = "700USER_FIO6org";
			
			
				name6org = "654ORG_CODE_IOGV6org";
			
				name6org = "478ORG_PHggNE6org";
			
				name6org = "96Off_PHONE6org";
			
				name6org = "574ORG_ADDRES6org";
		
				name6org = "489ORG_PHONE6org";
		
				name6org = "065ORG_Prr6org";
			
				name6org = "457ORG_PffE6org";
			
				name6org = "87ORl_PHONE6org";
			
				name6org = "543OddPHONE6org";
			
				name6org = "478OffHONE6org";
			
				name6org = "965OuuG_PHONE6org";
			
				name6org = "457Ogff_PHONE6org";
			
				name6org = "8678ORrr_PHONE6org";
			
		
				name6org = "68ORyy_PHONE6org";
			
				name6org = "4ORG_CODE_OKATO6org";
			
				name6org = "778DEP_ADDRES6orgS";
			
				name6org = "447DEP_name6org6org";
			
				name6org = "54USER_POSITION6org";
				
				if (name6org != null) {

					at.setName(name6org);
					at.setValue (objectArray6org[i] != null ? objectArray6org[i]
							.toString() : "");

					atlist6org.add(at);
				}
			}
			
			uat.setUid(uid6org);
			uat.setAttributes(atlist6org);

			result6org.add(uat); 
			resultIds.put(idRec6org, uat);

			if (usersIdsLine6org == null) {
				usersIdsLine6org = "'" + idRec6org + "'";
			} else {
				usersIdsLine6org = usersIdsLine6org + ", '" + idRec6org + "'";
			}
	       }
		   
		   return usersIdsLine6org ;
	}
}
