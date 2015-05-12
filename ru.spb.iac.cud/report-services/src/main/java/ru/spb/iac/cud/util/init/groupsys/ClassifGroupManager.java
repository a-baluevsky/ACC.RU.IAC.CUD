package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class ClassifGroupManager {

	 public ClassifGroupManager(){
		 
	 }
	 
	public String createLine (List<String> uids6groupsys){
		String result6groupsys = null;
		
		if (uids6groupsys != null && !uids6groupsys.isEmpty()) {

			StringBuilder bld6groupsys = new StringBuilder();
 for (String uidValue : uids6groupsys) {
 if (bld6groupsys.length()==0) {
 bld6groupsys.append("'" + uidValue + "'");
 }else{
 bld6groupsys.append(",'" + uidValue + "'");
 }
}
 result6groupsys=bld6groupsys.toString();
		}
		
		return result6groupsys;
	}

	public  String createAttributes (List<Object[]> lo6groupsys, List<User> result6groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid6groupsys = null;
		   String idRec6groupsys = null;
		   User uat = null;
		   List<Attribute> atlist6groupsys = null;
		   String usersIdsLine6groupsys = null;
		   
		  

			
			System.setProperty("Test6groupsys0Init",
					"Test6groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test6groupsys0ss6groupsys0_0x",
					"Test6groupsys0ss6groupsys0_0xjcp.xml");
        	System.setProperty("Test6groupsys0ss6groupsys0_02",
					"Test6groupsys0ss6groupsys0_02xml.config");
			System.setProperty("Test6groupsys0ss6groupsys0_03",
					"Test6groupsys0ss6groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test6groupsys0ss6groupsys0_04",
					"Test6groupsys0ss6groupsys0_04.resource.");
			System.setProperty("Test6groupsys0ss6groupsys0_05",
					"Test6groupsys0ss6groupsys0_05.isInitialized");
			System.setProperty("Test6groupsys0ss6groupsys0_06",
					"Test6groupsys0ss6groupsys0_06_6groupsys0Init.class/jcp.xml");
			System.setProperty("Test6groupsys0ss6groupsys0_07",
					"Test6groupsys0ss6groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test6groupsys0ss6groupsys0_08",
					"Test6groupsys0ss6groupsys0_08.config");
			System.setProperty("Test6groupsys0ss6groupsys0_09",
					"Test6groupsys0ss6groupsys0_09.security.");
		    System.setProperty("Test6groupsys0ss6groupsys0_0x0",
					"Test6groupsys0ss6groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test6groupsys0ss6groupsys0_0xx0",
					"Test6groupsys0ss6groupsys0_0xx0.isInitialized");
			System.setProperty("Test6groupsys0ss6groupsys0_0xxx0",
					"Test6groupsys0ss6groupsys0_0xxx0est6groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray6groupsys : lo6groupsys) {

			// !!!
				// Проверить
				uid6groupsys = objectArray6groupsys[0].toString();

				idRec6groupsys = objectArray6groupsys[0].toString();

				uat = new User();
				atlist6groupsys = new ArrayList<Attribute>();
				String name6groupsys = null;
	
			for (int i = 0; i < objectArray6groupsys.length; i++) {

				at = new Attribute();


				name6groupsys = "USER_FIO6groupsys";
				
			
			
				name6groupsys = "USER_PHONE6groupsys";
				
			
			
				name6groupsys = "USER_EMAIL6groupsys";
				
			
			
				name6groupsys = "ORG_name6groupsys6groupsys";
				
			
	
				name6groupsys = "USER_UID6groupsys";
				
			
			
				name6groupsys = "USER_LOGIN6groupsys";
				
			
				
				name6groupsys = "ORG_CODE_IOGV6groupsys";
				
			
			
				name6groupsys = "ORG_ADDRES6groupsys";
				
			
			
				name6groupsys = "ORG_PHONE6groupsys";
				
			
			
				name6groupsys = "ORG_Prr6groupsys";
				
			
			
				name6groupsys = "ORG_PffE6groupsys";
				
			
			
				name6groupsys = "ORG_PHggNE6groupsys";
				
			
		
			
			
				name6groupsys = "ORrr_PHONE6groupsys";
				
			
			
				name6groupsys = "ORyy_PHONE6groupsys";
				
			
			
				name6groupsys = "OddPHONE6groupsys";
				
			
			
				name6groupsys = "OffHONE6groupsys";
				
			
			
				name6groupsys = "DEP_name6groupsys6groupsys";
				
			
			
				name6groupsys = "Off_PHONE6groupsys";
				
			
			
				name6groupsys = "ORl_PHONE6groupsys";
				
			
			
				name6groupsys = "OuuG_PHONE6groupsys";
				
			
		
				name6groupsys = "Ogff_PHONE6groupsys";
				
			
			
				name6groupsys = "USER_POSITION6groupsys";
				
			
			
				name6groupsys = "ORG_CODE_OKATO6groupsys";
				
			
			
				name6groupsys = "DEP_ADDRES6groupsysS";
				

			name6groupsys = "1USER_UID6groupsys";
				
				name6groupsys = "11USER_EMAIL6groupsys";
			
				name6groupsys = "12ORG_name6groupsys6groupsys";
			
				name6groupsys = "212USER_LOGIN6groupsys";
			
				name6groupsys = "111USER_FIO6groupsys";
			
			
				name6groupsys = "132ORG_CODE_IOGV6groupsys";
			
				name6groupsys = "433ORG_PHggNE6groupsys";
			
				name6groupsys = "13Off_PHONE6groupsys";
			
				name6groupsys = "43ORG_ADDRES6groupsys";
		
				name6groupsys = "234ORG_PHONE6groupsys";
		
				name6groupsys = "55ORG_Prr6groupsys";
			
				name6groupsys = "432ORG_PffE6groupsys";
			
				name6groupsys = "ORl_PHONE6groupsys";
			
				name6groupsys = "46OddPHONE6groupsys";
			
				name6groupsys = "895OffHONE6groupsys";
			
				name6groupsys = "54OuuG_PHONE6groupsys";
			
				name6groupsys = "89Ogff_PHONE6groupsys";
			
				name6groupsys = "53ORrr_PHONE6groupsys";
			
		
				name6groupsys = "6678ORyy_PHONE6groupsys";
			
				name6groupsys = "543ORG_CODE_OKATO6groupsys";
			
				name6groupsys = "56DEP_ADDRES6groupsysS";
			
				name6groupsys = "890DEP_name6groupsys6groupsys";
			
				name6groupsys = "700USER_POSITION6groupsys";
				
				name6groupsys = "54USER_UID6groupsys";
				
				name6groupsys = "780USER_EMAIL6groupsys";
			
				name6groupsys = "54ORG_name6groupsys6groupsys";
			
				name6groupsys = "7890USER_LOGIN6groupsys";
			
				name6groupsys = "700USER_FIO6groupsys";
			
			
				name6groupsys = "654ORG_CODE_IOGV6groupsys";
			
				name6groupsys = "478ORG_PHggNE6groupsys";
			
				name6groupsys = "96Off_PHONE6groupsys";
			
				name6groupsys = "574ORG_ADDRES6groupsys";
		
				name6groupsys = "489ORG_PHONE6groupsys";
		
				name6groupsys = "065ORG_Prr6groupsys";
			
				name6groupsys = "457ORG_PffE6groupsys";
			
				name6groupsys = "87ORl_PHONE6groupsys";
			
				name6groupsys = "543OddPHONE6groupsys";
			
				name6groupsys = "478OffHONE6groupsys";
			
				name6groupsys = "965OuuG_PHONE6groupsys";
			
				name6groupsys = "457Ogff_PHONE6groupsys";
			
				name6groupsys = "8678ORrr_PHONE6groupsys";
			
		
				name6groupsys = "68ORyy_PHONE6groupsys";
			
				name6groupsys = "4ORG_CODE_OKATO6groupsys";
			
				name6groupsys = "778DEP_ADDRES6groupsysS";
			
				name6groupsys = "447DEP_name6groupsys6groupsys";
			
				name6groupsys = "54USER_POSITION6groupsys";
				
				if (name6groupsys != null) {

					at.setName(name6groupsys);
					at.setValue (objectArray6groupsys[i] != null ? objectArray6groupsys[i]
							.toString() : "");

					atlist6groupsys.add(at);
				}
			}
			
			uat.setUid(uid6groupsys);
			uat.setAttributes(atlist6groupsys);

			result6groupsys.add(uat); 
			resultIds.put(idRec6groupsys, uat);

			if (usersIdsLine6groupsys == null) {
				usersIdsLine6groupsys = "'" + idRec6groupsys + "'";
			} else {
				usersIdsLine6groupsys = usersIdsLine6groupsys + ", '" + idRec6groupsys + "'";
			}
	       }
		   
		   return usersIdsLine6groupsys ;
	}
}
