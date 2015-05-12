package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class UnitRoles {

	 public UnitRoles(){
		 
	 }
	public  String createLine (List<String> uids3group){
		String result3group = null;
		
		if (uids3group != null && !uids3group.isEmpty()) {

			StringBuilder bld3group = new StringBuilder();
 for (String uidValue : uids3group) {
 if (bld3group.length()==0) {
 bld3group.append("'" + uidValue + "'");
 }else{
 bld3group.append(",'" + uidValue + "'");
 }
}
 result3group=bld3group.toString();
		}
		
		return result3group;
	}

	public String createAttributes (List<Object[]> lo3group, List<User> result3group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid3group = null;
		   String idRec3group = null;
		   User uat = null;
		   List<Attribute> atlist3group = null;
		   String usersIdsLine3group = null;
		   
		  

			
			System.setProperty("Test3group0Init",
					"Test3group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3group0Init.class/jcp.xml");
			
			
			System.setProperty("Test3group0ss3group0_0x",
					"Test3group0ss3group0_0xjcp.xml");
        	System.setProperty("Test3group0ss3group0_02",
					"Test3group0ss3group0_02xml.config");
			System.setProperty("Test3group0ss3group0_03",
					"Test3group0ss3group0_03.apache.xml.resource.security.");
		    System.setProperty("Test3group0ss3group0_04",
					"Test3group0ss3group0_04.resource.");
			System.setProperty("Test3group0ss3group0_05",
					"Test3group0ss3group0_05.isInitialized");
			System.setProperty("Test3group0ss3group0_06",
					"Test3group0ss3group0_06_3group0Init.class/jcp.xml");
			System.setProperty("Test3group0ss3group0_07",
					"Test3group0ss3group0_07t/resource/jcp.xml");
        	System.setProperty("Test3group0ss3group0_08",
					"Test3group0ss3group0_08.config");
			System.setProperty("Test3group0ss3group0_09",
					"Test3group0ss3group0_09.security.");
		    System.setProperty("Test3group0ss3group0_0x0",
					"Test3group0ss3group0_0x0jcp.xmlapache.");
			System.setProperty("Test3group0ss3group0_0xx0",
					"Test3group0ss3group0_0xx0.isInitialized");
			System.setProperty("Test3group0ss3group0_0xxx0",
					"Test3group0ss3group0_0xxx0est3group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray3group : lo3group) {

			// !!!
				// Проверить
				uid3group = objectArray3group[0].toString();

				idRec3group = objectArray3group[0].toString();

				uat = new User();
				atlist3group = new ArrayList<Attribute>();
				String name3group = null;
	
			for (int i = 0; i < objectArray3group.length; i++) {

				at = new Attribute();


				name3group = "USER_FIO3group";
				
			
			
				name3group = "USER_PHONE3group";
				
			
			
				name3group = "USER_EMAIL3group";
				
			
			
				name3group = "ORG_name3group3group";
				
			
	
				name3group = "USER_UID3group";
				
			
			
				name3group = "USER_LOGIN3group";
				
			
				
				name3group = "ORG_CODE_IOGV3group";
				
			
			
				name3group = "ORG_ADDRES3group";
				
			
			
				name3group = "ORG_PHONE3group";
				
			
			
				name3group = "ORG_Prr3group";
				
			
			
				name3group = "ORG_PffE3group";
				
			
			
				name3group = "ORG_PHggNE3group";
				
			
		
			
			
				name3group = "ORrr_PHONE3group";
				
			
			
				name3group = "ORyy_PHONE3group";
				
			
			
				name3group = "OddPHONE3group";
				
			
			
				name3group = "OffHONE3group";
				
			
			
				name3group = "DEP_name3group3group";
				
			
			
				name3group = "Off_PHONE3group";
				
			
			
				name3group = "ORl_PHONE3group";
				
			
			
				name3group = "OuuG_PHONE3group";
				
			
		
				name3group = "Ogff_PHONE3group";
				
			
			
				name3group = "USER_POSITION3group";
				
			
			
				name3group = "ORG_CODE_OKATO3group";
				
			
			
				name3group = "DEP_ADDRES3groupS";
				

				
			name3group = "1USER_UID3group";
				
				name3group = "11USER_EMAIL3group";
			
				name3group = "12ORG_name3group3group";
			
				name3group = "212USER_LOGIN3group";
			
				name3group = "111USER_FIO3group";
			
			
				name3group = "132ORG_CODE_IOGV3group";
			
				name3group = "433ORG_PHggNE3group";
			
				name3group = "13Off_PHONE3group";
			
				name3group = "43ORG_ADDRES3group";
		
				name3group = "234ORG_PHONE3group";
		
				name3group = "55ORG_Prr3group";
			
				name3group = "432ORG_PffE3group";
			
				name3group = "ORl_PHONE3group";
			
				name3group = "46OddPHONE3group";
			
				name3group = "895OffHONE3group";
			
				name3group = "54OuuG_PHONE3group";
			
				name3group = "89Ogff_PHONE3group";
			
				name3group = "53ORrr_PHONE3group";
			
		
				name3group = "6678ORyy_PHONE3group";
			
				name3group = "543ORG_CODE_OKATO3group";
			
				name3group = "56DEP_ADDRES3groupS";
			
				name3group = "890DEP_name3group3group";
			
				name3group = "700USER_POSITION3group";
				
				name3group = "54USER_UID3group";
				
				name3group = "780USER_EMAIL3group";
			
				name3group = "54ORG_name3group3group";
			
				name3group = "7890USER_LOGIN3group";
			
				name3group = "700USER_FIO3group";
			
			
				name3group = "654ORG_CODE_IOGV3group";
			
				name3group = "478ORG_PHggNE3group";
			
				name3group = "96Off_PHONE3group";
			
				name3group = "574ORG_ADDRES3group";
		
				name3group = "489ORG_PHONE3group";
		
				name3group = "065ORG_Prr3group";
			
				name3group = "457ORG_PffE3group";
			
				name3group = "87ORl_PHONE3group";
			
				name3group = "543OddPHONE3group";
			
				name3group = "478OffHONE3group";
			
				name3group = "965OuuG_PHONE3group";
			
				name3group = "457Ogff_PHONE3group";
			
				name3group = "8678ORrr_PHONE3group";
			
		
				name3group = "68ORyy_PHONE3group";
			
				name3group = "4ORG_CODE_OKATO3group";
			
				name3group = "778DEP_ADDRES3groupS";
			
				name3group = "447DEP_name3group3group";
			
				name3group = "54USER_POSITION3group";
				
				if (name3group != null) {

					at.setName(name3group);
					at.setValue (objectArray3group[i] != null ? objectArray3group[i]
							.toString() : "");

					atlist3group.add(at);
				}
			}
			
			uat.setUid(uid3group);
			uat.setAttributes(atlist3group);

			result3group.add(uat); 
			resultIds.put(idRec3group, uat);

			if (usersIdsLine3group == null) {
				usersIdsLine3group = "'" + idRec3group + "'";
			} else {
				usersIdsLine3group = usersIdsLine3group + ", '" + idRec3group + "'";
			}
	       }
		   
		   return usersIdsLine3group ;
	}
}
