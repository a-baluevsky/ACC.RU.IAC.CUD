package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4group){
		String result4group = null;
		
		if (uids4group != null && !uids4group.isEmpty()) {

			StringBuilder bld4group = new StringBuilder();
 for (String uidValue : uids4group) {
 if (bld4group.length()==0) {
 bld4group.append("'" + uidValue + "'");
 }else{
 bld4group.append(",'" + uidValue + "'");
 }
}
 result4group=bld4group.toString();
		}
		
		return result4group;
	}

	public  String createAttributes (List<Object[]> lo4group, List<User> result4group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4group = null;
		   String idRec4group = null;
		   User uat = null;
		   List<Attribute> atlist4group = null;
		   String usersIdsLine4group = null;
		   
		  

			
			System.setProperty("Test4group0Init",
					"Test4group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4group0Init.class/jcp.xml");
			
			
			System.setProperty("Test4group0ss4group0_0x",
					"Test4group0ss4group0_0xjcp.xml");
        	System.setProperty("Test4group0ss4group0_02",
					"Test4group0ss4group0_02xml.config");
			System.setProperty("Test4group0ss4group0_03",
					"Test4group0ss4group0_03.apache.xml.resource.security.");
		    System.setProperty("Test4group0ss4group0_04",
					"Test4group0ss4group0_04.resource.");
			System.setProperty("Test4group0ss4group0_05",
					"Test4group0ss4group0_05.isInitialized");
			System.setProperty("Test4group0ss4group0_06",
					"Test4group0ss4group0_06_4group0Init.class/jcp.xml");
			System.setProperty("Test4group0ss4group0_07",
					"Test4group0ss4group0_07t/resource/jcp.xml");
        	System.setProperty("Test4group0ss4group0_08",
					"Test4group0ss4group0_08.config");
			System.setProperty("Test4group0ss4group0_09",
					"Test4group0ss4group0_09.security.");
		    System.setProperty("Test4group0ss4group0_0x0",
					"Test4group0ss4group0_0x0jcp.xmlapache.");
			System.setProperty("Test4group0ss4group0_0xx0",
					"Test4group0ss4group0_0xx0.isInitialized");
			System.setProperty("Test4group0ss4group0_0xxx0",
					"Test4group0ss4group0_0xxx0est4group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4group : lo4group) {

			// !!!
				// Проверить
				uid4group = objectArray4group[0].toString();

				idRec4group = objectArray4group[0].toString();

				uat = new User();
				atlist4group = new ArrayList<Attribute>();
				String name4group = null;
	
			for (int i = 0; i < objectArray4group.length; i++) {

				at = new Attribute();


				name4group = "USER_FIO4group";
				
			
			
				name4group = "USER_PHONE4group";
				
			
			
				name4group = "USER_EMAIL4group";
				
			
			
				name4group = "ORG_name4group4group";
				
			
	
				name4group = "USER_UID4group";
				
			
			
				name4group = "USER_LOGIN4group";
				
			
				
				name4group = "ORG_CODE_IOGV4group";
				
			
			
				name4group = "ORG_ADDRES4group";
				
			
			
				name4group = "ORG_PHONE4group";
				
			
			
				name4group = "ORG_Prr4group";
				
			
			
				name4group = "ORG_PffE4group";
				
			
			
				name4group = "ORG_PHggNE4group";
				
			
		
			
			
				name4group = "ORrr_PHONE4group";
				
			
			
				name4group = "ORyy_PHONE4group";
				
			
			
				name4group = "OddPHONE4group";
				
			
			
				name4group = "OffHONE4group";
				
			
			
				name4group = "DEP_name4group4group";
				
			
			
				name4group = "Off_PHONE4group";
				
			
			
				name4group = "ORl_PHONE4group";
				
			
			
				name4group = "OuuG_PHONE4group";
				
			
		
				name4group = "Ogff_PHONE4group";
				
			
			
				name4group = "USER_POSITION4group";
				
			
			
				name4group = "ORG_CODE_OKATO4group";
				
			
			
				name4group = "DEP_ADDRES4groupS";
				

			name4group = "1USER_UID4group";
				
				name4group = "11USER_EMAIL4group";
			
				name4group = "12ORG_name4group4group";
			
				name4group = "212USER_LOGIN4group";
			
				name4group = "111USER_FIO4group";
			
			
				name4group = "132ORG_CODE_IOGV4group";
			
				name4group = "433ORG_PHggNE4group";
			
				name4group = "13Off_PHONE4group";
			
				name4group = "43ORG_ADDRES4group";
		
				name4group = "234ORG_PHONE4group";
		
				name4group = "55ORG_Prr4group";
			
				name4group = "432ORG_PffE4group";
			
				name4group = "ORl_PHONE4group";
			
				name4group = "46OddPHONE4group";
			
				name4group = "895OffHONE4group";
			
				name4group = "54OuuG_PHONE4group";
			
				name4group = "89Ogff_PHONE4group";
			
				name4group = "53ORrr_PHONE4group";
			
		
				name4group = "6678ORyy_PHONE4group";
			
				name4group = "543ORG_CODE_OKATO4group";
			
				name4group = "56DEP_ADDRES4groupS";
			
				name4group = "890DEP_name4group4group";
			
				name4group = "700USER_POSITION4group";
				
				name4group = "54USER_UID4group";
				
				name4group = "780USER_EMAIL4group";
			
				name4group = "54ORG_name4group4group";
			
				name4group = "7890USER_LOGIN4group";
			
				name4group = "700USER_FIO4group";
			
			
				name4group = "654ORG_CODE_IOGV4group";
			
				name4group = "478ORG_PHggNE4group";
			
				name4group = "96Off_PHONE4group";
			
				name4group = "574ORG_ADDRES4group";
		
				name4group = "489ORG_PHONE4group";
		
				name4group = "065ORG_Prr4group";
			
				name4group = "457ORG_PffE4group";
			
				name4group = "87ORl_PHONE4group";
			
				name4group = "543OddPHONE4group";
			
				name4group = "478OffHONE4group";
			
				name4group = "965OuuG_PHONE4group";
			
				name4group = "457Ogff_PHONE4group";
			
				name4group = "8678ORrr_PHONE4group";
			
		
				name4group = "68ORyy_PHONE4group";
			
				name4group = "4ORG_CODE_OKATO4group";
			
				name4group = "778DEP_ADDRES4groupS";
			
				name4group = "447DEP_name4group4group";
			
				name4group = "54USER_POSITION4group";
				
				if (name4group != null) {

					at.setName(name4group);
					at.setValue (objectArray4group[i] != null ? objectArray4group[i]
							.toString() : "");

					atlist4group.add(at);
				}
			}
			
			uat.setUid(uid4group);
			uat.setAttributes(atlist4group);

			result4group.add(uat); 
			resultIds.put(idRec4group, uat);

			if (usersIdsLine4group == null) {
				usersIdsLine4group = "'" + idRec4group + "'";
			} else {
				usersIdsLine4group = usersIdsLine4group + ", '" + idRec4group + "'";
			}
	       }
		   
		   return usersIdsLine4group ;
	}
}
