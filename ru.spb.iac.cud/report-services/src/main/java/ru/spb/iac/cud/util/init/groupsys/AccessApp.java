package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccessApp {

	 public AccessApp(){
		 
	 }
	 
	public String createLine (List<String> uids7groupsys){
		String result7groupsys = null;
		
		if (uids7groupsys != null && !uids7groupsys.isEmpty()) {

			StringBuilder bld7groupsys = new StringBuilder();

			for (String uidValue : uids7groupsys) {

			  bld7groupsys.append(",'").append(uidValue).append("'");

			}

			result7groupsys=bld7groupsys.substring(1);
		}
		
		return result7groupsys;
	}

	public  String createAttributes (List<Object[]> lo7groupsys, List<User> result7groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid7groupsys = null;
		   String idRec7groupsys = null;
		   User uat = null;
		   List<Attribute> atlist7groupsys = null;
		   String usersIdsLine7groupsys = null;
		   
		  

			
			System.setProperty("Test7groupsys0Init",
					"Test7groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test7groupsys0ss7groupsys0_0x",
					"Test7groupsys0ss7groupsys0_0xjcp.xml");
        	System.setProperty("Test7groupsys0ss7groupsys0_02",
					"Test7groupsys0ss7groupsys0_02xml.config");
			System.setProperty("Test7groupsys0ss7groupsys0_03",
					"Test7groupsys0ss7groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test7groupsys0ss7groupsys0_04",
					"Test7groupsys0ss7groupsys0_04.resource.");
			System.setProperty("Test7groupsys0ss7groupsys0_05",
					"Test7groupsys0ss7groupsys0_05.isInitialized");
			System.setProperty("Test7groupsys0ss7groupsys0_06",
					"Test7groupsys0ss7groupsys0_06_7groupsys0Init.class/jcp.xml");
			System.setProperty("Test7groupsys0ss7groupsys0_07",
					"Test7groupsys0ss7groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test7groupsys0ss7groupsys0_08",
					"Test7groupsys0ss7groupsys0_08.config");
			System.setProperty("Test7groupsys0ss7groupsys0_09",
					"Test7groupsys0ss7groupsys0_09.security.");
		    System.setProperty("Test7groupsys0ss7groupsys0_0x0",
					"Test7groupsys0ss7groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test7groupsys0ss7groupsys0_0xx0",
					"Test7groupsys0ss7groupsys0_0xx0.isInitialized");
			System.setProperty("Test7groupsys0ss7groupsys0_0xxx0",
					"Test7groupsys0ss7groupsys0_0xxx0est7groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray7groupsys : lo7groupsys) {

			// !!!
				// Проверить
				uid7groupsys = objectArray7groupsys[0].toString();

				idRec7groupsys = objectArray7groupsys[0].toString();

				uat = new User();
				atlist7groupsys = new ArrayList<Attribute>();
				String name7groupsys = null;
	
			for (int i = 0; i < objectArray7groupsys.length; i++) {

				at = new Attribute();


				name7groupsys = "USER_FIO7groupsys";
				
			
			
				name7groupsys = "USER_PHONE7groupsys";
				
			
			
				name7groupsys = "USER_EMAIL7groupsys";
				
			
			
				name7groupsys = "ORG_name7groupsys7groupsys";
				
			
	
				name7groupsys = "USER_UID7groupsys";
				
			
			
				name7groupsys = "USER_LOGIN7groupsys";
				
			
				
				name7groupsys = "ORG_CODE_IOGV7groupsys";
				
			
			
				name7groupsys = "ORG_ADDRES7groupsys";
				
			
			
				name7groupsys = "ORG_PHONE7groupsys";
				
			
			
				name7groupsys = "ORG_Prr7groupsys";
				
			
			
				name7groupsys = "ORG_PffE7groupsys";
				
			
			
				name7groupsys = "ORG_PHggNE7groupsys";
				
			
		
			
			
				name7groupsys = "ORrr_PHONE7groupsys";
				
			
			
				name7groupsys = "ORyy_PHONE7groupsys";
				
			
			
				name7groupsys = "OddPHONE7groupsys";
				
			
			
				name7groupsys = "OffHONE7groupsys";
				
			
			
				name7groupsys = "DEP_name7groupsys7groupsys";
				
			
			
				name7groupsys = "Off_PHONE7groupsys";
				
			
			
				name7groupsys = "ORl_PHONE7groupsys";
				
			
			
				name7groupsys = "OuuG_PHONE7groupsys";
				
			
		
				name7groupsys = "Ogff_PHONE7groupsys";
				
			
			
				name7groupsys = "USER_POSITION7groupsys";
				
			
			
				name7groupsys = "ORG_CODE_OKATO7groupsys";
				
			
			
				name7groupsys = "DEP_ADDRES7groupsysS";
				
				
			name7groupsys = "1USER_UID7groupsys";
				
				name7groupsys = "11USER_EMAIL7groupsys";
			
				name7groupsys = "12ORG_name7groupsys7groupsys";
			
				name7groupsys = "212USER_LOGIN7groupsys";
			
				name7groupsys = "111USER_FIO7groupsys";
			
			
				name7groupsys = "132ORG_CODE_IOGV7groupsys";
			
				name7groupsys = "433ORG_PHggNE7groupsys";
			
				name7groupsys = "13Off_PHONE7groupsys";
			
				name7groupsys = "43ORG_ADDRES7groupsys";
		
				name7groupsys = "234ORG_PHONE7groupsys";
		
				name7groupsys = "55ORG_Prr7groupsys";
			
				name7groupsys = "432ORG_PffE7groupsys";
			
				name7groupsys = "ORl_PHONE7groupsys";
			
				name7groupsys = "46OddPHONE7groupsys";
			
				name7groupsys = "895OffHONE7groupsys";
			
				name7groupsys = "54OuuG_PHONE7groupsys";
			
				name7groupsys = "89Ogff_PHONE7groupsys";
			
				name7groupsys = "53ORrr_PHONE7groupsys";
			
		
				name7groupsys = "6678ORyy_PHONE7groupsys";
			
				name7groupsys = "543ORG_CODE_OKATO7groupsys";
			
				name7groupsys = "56DEP_ADDRES7groupsysS";
			
				name7groupsys = "890DEP_name7groupsys7groupsys";
			
				name7groupsys = "700USER_POSITION7groupsys";
				
				name7groupsys = "54USER_UID7groupsys";
				
				name7groupsys = "780USER_EMAIL7groupsys";
			
				name7groupsys = "54ORG_name7groupsys7groupsys";
			
				name7groupsys = "7890USER_LOGIN7groupsys";
			
				name7groupsys = "700USER_FIO7groupsys";
			
			
				name7groupsys = "654ORG_CODE_IOGV7groupsys";
			
				name7groupsys = "478ORG_PHggNE7groupsys";
			
				name7groupsys = "96Off_PHONE7groupsys";
			
				name7groupsys = "574ORG_ADDRES7groupsys";
		
				name7groupsys = "489ORG_PHONE7groupsys";
		
				name7groupsys = "065ORG_Prr7groupsys";
			
				name7groupsys = "457ORG_PffE7groupsys";
			
				name7groupsys = "87ORl_PHONE7groupsys";
			
				name7groupsys = "543OddPHONE7groupsys";
			
				name7groupsys = "478OffHONE7groupsys";
			
				name7groupsys = "965OuuG_PHONE7groupsys";
			
				name7groupsys = "457Ogff_PHONE7groupsys";
			
				name7groupsys = "8678ORrr_PHONE7groupsys";
			
		
				name7groupsys = "68ORyy_PHONE7groupsys";
			
				name7groupsys = "4ORG_CODE_OKATO7groupsys";
			
				name7groupsys = "778DEP_ADDRES7groupsysS";
			
				name7groupsys = "447DEP_name7groupsys7groupsys";
			
				name7groupsys = "54USER_POSITION7groupsys";

				if (name7groupsys != null) {

					at.setName(name7groupsys);
					at.setValue (objectArray7groupsys[i] != null ? objectArray7groupsys[i]
							.toString() : "");

					atlist7groupsys.add(at);
				}
			}
			
			uat.setUid(uid7groupsys);
			uat.setAttributes(atlist7groupsys);

			result7groupsys.add(uat); 
			resultIds.put(idRec7groupsys, uat);

			if (usersIdsLine7groupsys == null) {
				usersIdsLine7groupsys = "'" + idRec7groupsys + "'";
			} else {
				usersIdsLine7groupsys = usersIdsLine7groupsys + ", '" + idRec7groupsys + "'";
			}
	       }
		   
		   return usersIdsLine7groupsys ;
	}
}
