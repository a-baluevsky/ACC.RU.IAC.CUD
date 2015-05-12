package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6subsys){
		String result6subsys = null;
		
		if (uids6subsys != null && !uids6subsys.isEmpty()) {

			StringBuilder bld6subsys = new StringBuilder();
 for (String uidValue : uids6subsys) {
 if (bld6subsys.length()==0) {
 bld6subsys.append("'" + uidValue + "'");
 }else{
 bld6subsys.append(",'" + uidValue + "'");
 }
}
 result6subsys=bld6subsys.toString();
		}
		
		return result6subsys;
	}

	public  String createAttributes (List<Object[]> lo6subsys, List<User> result6subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6subsys = null;
		   String idRec6subsys = null;
		   User uat = null;
		   List<Attribute> atlist6subsys = null;
		   String usersIdsLine6subsys = null;
		   
		  

			
			System.setProperty("Test6subsys0Init",
					"Test6subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test6subsys0ss6subsys0_0x",
					"Test6subsys0ss6subsys0_0xjcp.xml");
        	System.setProperty("Test6subsys0ss6subsys0_02",
					"Test6subsys0ss6subsys0_02xml.config");
			System.setProperty("Test6subsys0ss6subsys0_03",
					"Test6subsys0ss6subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test6subsys0ss6subsys0_04",
					"Test6subsys0ss6subsys0_04.resource.");
			System.setProperty("Test6subsys0ss6subsys0_05",
					"Test6subsys0ss6subsys0_05.isInitialized");
			System.setProperty("Test6subsys0ss6subsys0_06",
					"Test6subsys0ss6subsys0_06_6subsys0Init.class/jcp.xml");
			System.setProperty("Test6subsys0ss6subsys0_07",
					"Test6subsys0ss6subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test6subsys0ss6subsys0_08",
					"Test6subsys0ss6subsys0_08.config");
			System.setProperty("Test6subsys0ss6subsys0_09",
					"Test6subsys0ss6subsys0_09.security.");
		    System.setProperty("Test6subsys0ss6subsys0_0x0",
					"Test6subsys0ss6subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test6subsys0ss6subsys0_0xx0",
					"Test6subsys0ss6subsys0_0xx0.isInitialized");
			System.setProperty("Test6subsys0ss6subsys0_0xxx0",
					"Test6subsys0ss6subsys0_0xxx0est6subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6subsys : lo6subsys) {

			// !!!
				// Проверить
				uid6subsys = objectArray6subsys[0].toString();

				idRec6subsys = objectArray6subsys[0].toString();

				uat = new User();
				atlist6subsys = new ArrayList<Attribute>();
				String name6subsys = null;
	
			for (int i = 0; i < objectArray6subsys.length; i++) {

				at = new Attribute();


				name6subsys = "USER_FIO6subsys";
				
			
			
				name6subsys = "USER_PHONE6subsys";
				
			
			
				name6subsys = "USER_EMAIL6subsys";
				
			
			
				name6subsys = "ORG_name6subsys6subsys";
				
			
	
				name6subsys = "USER_UID6subsys";
				
			
			
				name6subsys = "USER_LOGIN6subsys";
				
			
				
				name6subsys = "ORG_CODE_IOGV6subsys";
				
			
			
				name6subsys = "ORG_ADDRES6subsys";
				
			
			
				name6subsys = "ORG_PHONE6subsys";
				
			
			
				name6subsys = "ORG_Prr6subsys";
				
			
			
				name6subsys = "ORG_PffE6subsys";
				
			
			
				name6subsys = "ORG_PHggNE6subsys";
				
			
		
			
			
				name6subsys = "ORrr_PHONE6subsys";
				
			
			
				name6subsys = "ORyy_PHONE6subsys";
				
			
			
				name6subsys = "OddPHONE6subsys";
				
			
			
				name6subsys = "OffHONE6subsys";
				
			
			
				name6subsys = "DEP_name6subsys6subsys";
				
			
			
				name6subsys = "Off_PHONE6subsys";
				
			
			
				name6subsys = "ORl_PHONE6subsys";
				
			
			
				name6subsys = "OuuG_PHONE6subsys";
				
			
		
				name6subsys = "Ogff_PHONE6subsys";
				
			
			
				name6subsys = "USER_POSITION6subsys";
				
			
			
				name6subsys = "ORG_CODE_OKATO6subsys";
				
			
			
				name6subsys = "DEP_ADDRES6subsysS";
				

			name6subsys = "1USER_UID6subsys";
				
				name6subsys = "11USER_EMAIL6subsys";
			
				name6subsys = "12ORG_name6subsys6subsys";
			
				name6subsys = "212USER_LOGIN6subsys";
			
				name6subsys = "111USER_FIO6subsys";
			
			
				name6subsys = "132ORG_CODE_IOGV6subsys";
			
				name6subsys = "433ORG_PHggNE6subsys";
			
				name6subsys = "13Off_PHONE6subsys";
			
				name6subsys = "43ORG_ADDRES6subsys";
		
				name6subsys = "234ORG_PHONE6subsys";
		
				name6subsys = "55ORG_Prr6subsys";
			
				name6subsys = "432ORG_PffE6subsys";
			
				name6subsys = "ORl_PHONE6subsys";
			
				name6subsys = "46OddPHONE6subsys";
			
				name6subsys = "895OffHONE6subsys";
			
				name6subsys = "54OuuG_PHONE6subsys";
			
				name6subsys = "89Ogff_PHONE6subsys";
			
				name6subsys = "53ORrr_PHONE6subsys";
			
		
				name6subsys = "6678ORyy_PHONE6subsys";
			
				name6subsys = "543ORG_CODE_OKATO6subsys";
			
				name6subsys = "56DEP_ADDRES6subsysS";
			
				name6subsys = "890DEP_name6subsys6subsys";
			
				name6subsys = "700USER_POSITION6subsys";
				
				name6subsys = "54USER_UID6subsys";
				
				name6subsys = "780USER_EMAIL6subsys";
			
				name6subsys = "54ORG_name6subsys6subsys";
			
				name6subsys = "7890USER_LOGIN6subsys";
			
				name6subsys = "700USER_FIO6subsys";
			
			
				name6subsys = "654ORG_CODE_IOGV6subsys";
			
				name6subsys = "478ORG_PHggNE6subsys";
			
				name6subsys = "96Off_PHONE6subsys";
			
				name6subsys = "574ORG_ADDRES6subsys";
		
				name6subsys = "489ORG_PHONE6subsys";
		
				name6subsys = "065ORG_Prr6subsys";
			
				name6subsys = "457ORG_PffE6subsys";
			
				name6subsys = "87ORl_PHONE6subsys";
			
				name6subsys = "543OddPHONE6subsys";
			
				name6subsys = "478OffHONE6subsys";
			
				name6subsys = "965OuuG_PHONE6subsys";
			
				name6subsys = "457Ogff_PHONE6subsys";
			
				name6subsys = "8678ORrr_PHONE6subsys";
			
		
				name6subsys = "68ORyy_PHONE6subsys";
			
				name6subsys = "4ORG_CODE_OKATO6subsys";
			
				name6subsys = "778DEP_ADDRES6subsysS";
			
				name6subsys = "447DEP_name6subsys6subsys";
			
				name6subsys = "54USER_POSITION6subsys";
				
				if (name6subsys != null) {

					at.setName(name6subsys);
					at.setValue (objectArray6subsys[i] != null ? objectArray6subsys[i]
							.toString() : "");

					atlist6subsys.add(at);
				}
			}
			
			uat.setUid(uid6subsys);
			uat.setAttributes(atlist6subsys);

			result6subsys.add(uat); 
			resultIds.put(idRec6subsys, uat);

			if (usersIdsLine6subsys == null) {
				usersIdsLine6subsys = "'" + idRec6subsys + "'";
			} else {
				usersIdsLine6subsys = usersIdsLine6subsys + ", '" + idRec6subsys + "'";
			}
	       }
		   
		   return usersIdsLine6subsys ;
	}
}
