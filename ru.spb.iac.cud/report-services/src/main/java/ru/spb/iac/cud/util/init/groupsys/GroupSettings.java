package ru.spb.iac.cud.util.init.groupsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class GroupSettings {

	public GroupSettings(){
		
	}
	public String createLine (List<String> uids4groupsys){
		String result4groupsys = null;
		
		if (uids4groupsys != null && !uids4groupsys.isEmpty()) {

			for (String uidValue : uids4groupsys) {
				if (result4groupsys == null) {
					result4groupsys = "'" + uidValue + "'";
				} else {
					result4groupsys = result4groupsys + ", '" + uidValue + "'";
				}
			}
		}
		
		return result4groupsys;
	}

	public  String createAttributes (List<Object[]> lo4groupsys, List<User> result4groupsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid4groupsys = null;
		   String idRec4groupsys = null;
		   User uat = null;
		   List<Attribute> atlist4groupsys = null;
		   String usersIdsLine4groupsys = null;
		   
		  

			
			System.setProperty("Test4groupsys0Init",
					"Test4groupsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4groupsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4groupsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test4groupsys0ss4groupsys0_0x",
					"Test4groupsys0ss4groupsys0_0xjcp.xml");
        	System.setProperty("Test4groupsys0ss4groupsys0_02",
					"Test4groupsys0ss4groupsys0_02xml.config");
			System.setProperty("Test4groupsys0ss4groupsys0_03",
					"Test4groupsys0ss4groupsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test4groupsys0ss4groupsys0_04",
					"Test4groupsys0ss4groupsys0_04.resource.");
			System.setProperty("Test4groupsys0ss4groupsys0_05",
					"Test4groupsys0ss4groupsys0_05.isInitialized");
			System.setProperty("Test4groupsys0ss4groupsys0_06",
					"Test4groupsys0ss4groupsys0_06_4groupsys0Init.class/jcp.xml");
			System.setProperty("Test4groupsys0ss4groupsys0_07",
					"Test4groupsys0ss4groupsys0_07t/resource/jcp.xml");
        	System.setProperty("Test4groupsys0ss4groupsys0_08",
					"Test4groupsys0ss4groupsys0_08.config");
			System.setProperty("Test4groupsys0ss4groupsys0_09",
					"Test4groupsys0ss4groupsys0_09.security.");
		    System.setProperty("Test4groupsys0ss4groupsys0_0x0",
					"Test4groupsys0ss4groupsys0_0x0jcp.xmlapache.");
			System.setProperty("Test4groupsys0ss4groupsys0_0xx0",
					"Test4groupsys0ss4groupsys0_0xx0.isInitialized");
			System.setProperty("Test4groupsys0ss4groupsys0_0xxx0",
					"Test4groupsys0ss4groupsys0_0xxx0est4groupsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray4groupsys : lo4groupsys) {

			// !!!
				// Проверить
				uid4groupsys = objectArray4groupsys[0].toString();

				idRec4groupsys = objectArray4groupsys[0].toString();

				uat = new User();
				atlist4groupsys = new ArrayList<Attribute>();
				String name4groupsys = null;
	
			for (int i = 0; i < objectArray4groupsys.length; i++) {

				at = new Attribute();


				name4groupsys = "USER_FIO4groupsys";
				
			
			
				name4groupsys = "USER_PHONE4groupsys";
				
			
			
				name4groupsys = "USER_EMAIL4groupsys";
				
			
			
				name4groupsys = "ORG_name4groupsys4groupsys";
				
			
	
				name4groupsys = "USER_UID4groupsys";
				
			
			
				name4groupsys = "USER_LOGIN4groupsys";
				
			
				
				name4groupsys = "ORG_CODE_IOGV4groupsys";
				
			
			
				name4groupsys = "ORG_ADDRES4groupsys";
				
			
			
				name4groupsys = "ORG_PHONE4groupsys";
				
			
			
				name4groupsys = "ORG_Prr4groupsys";
				
			
			
				name4groupsys = "ORG_PffE4groupsys";
				
			
			
				name4groupsys = "ORG_PHggNE4groupsys";
				
			
		
			
			
				name4groupsys = "ORrr_PHONE4groupsys";
				
			
			
				name4groupsys = "ORyy_PHONE4groupsys";
				
			
			
				name4groupsys = "OddPHONE4groupsys";
				
			
			
				name4groupsys = "OffHONE4groupsys";
				
			
			
				name4groupsys = "DEP_name4groupsys4groupsys";
				
			
			
				name4groupsys = "Off_PHONE4groupsys";
				
			
			
				name4groupsys = "ORl_PHONE4groupsys";
				
			
			
				name4groupsys = "OuuG_PHONE4groupsys";
				
			
		
				name4groupsys = "Ogff_PHONE4groupsys";
				
			
			
				name4groupsys = "USER_POSITION4groupsys";
				
			
			
				name4groupsys = "ORG_CODE_OKATO4groupsys";
				
			
			
				name4groupsys = "DEP_ADDRES4groupsysS";
				

			name4groupsys = "1USER_UID4groupsys";
				
				name4groupsys = "11USER_EMAIL4groupsys";
			
				name4groupsys = "12ORG_name4groupsys4groupsys";
			
				name4groupsys = "212USER_LOGIN4groupsys";
			
				name4groupsys = "111USER_FIO4groupsys";
			
			
				name4groupsys = "132ORG_CODE_IOGV4groupsys";
			
				name4groupsys = "433ORG_PHggNE4groupsys";
			
				name4groupsys = "13Off_PHONE4groupsys";
			
				name4groupsys = "43ORG_ADDRES4groupsys";
		
				name4groupsys = "234ORG_PHONE4groupsys";
		
				name4groupsys = "55ORG_Prr4groupsys";
			
				name4groupsys = "432ORG_PffE4groupsys";
			
				name4groupsys = "ORl_PHONE4groupsys";
			
				name4groupsys = "46OddPHONE4groupsys";
			
				name4groupsys = "895OffHONE4groupsys";
			
				name4groupsys = "54OuuG_PHONE4groupsys";
			
				name4groupsys = "89Ogff_PHONE4groupsys";
			
				name4groupsys = "53ORrr_PHONE4groupsys";
			
		
				name4groupsys = "6678ORyy_PHONE4groupsys";
			
				name4groupsys = "543ORG_CODE_OKATO4groupsys";
			
				name4groupsys = "56DEP_ADDRES4groupsysS";
			
				name4groupsys = "890DEP_name4groupsys4groupsys";
			
				name4groupsys = "700USER_POSITION4groupsys";
				
				name4groupsys = "54USER_UID4groupsys";
				
				name4groupsys = "780USER_EMAIL4groupsys";
			
				name4groupsys = "54ORG_name4groupsys4groupsys";
			
				name4groupsys = "7890USER_LOGIN4groupsys";
			
				name4groupsys = "700USER_FIO4groupsys";
			
			
				name4groupsys = "654ORG_CODE_IOGV4groupsys";
			
				name4groupsys = "478ORG_PHggNE4groupsys";
			
				name4groupsys = "96Off_PHONE4groupsys";
			
				name4groupsys = "574ORG_ADDRES4groupsys";
		
				name4groupsys = "489ORG_PHONE4groupsys";
		
				name4groupsys = "065ORG_Prr4groupsys";
			
				name4groupsys = "457ORG_PffE4groupsys";
			
				name4groupsys = "87ORl_PHONE4groupsys";
			
				name4groupsys = "543OddPHONE4groupsys";
			
				name4groupsys = "478OffHONE4groupsys";
			
				name4groupsys = "965OuuG_PHONE4groupsys";
			
				name4groupsys = "457Ogff_PHONE4groupsys";
			
				name4groupsys = "8678ORrr_PHONE4groupsys";
			
		
				name4groupsys = "68ORyy_PHONE4groupsys";
			
				name4groupsys = "4ORG_CODE_OKATO4groupsys";
			
				name4groupsys = "778DEP_ADDRES4groupsysS";
			
				name4groupsys = "447DEP_name4groupsys4groupsys";
			
				name4groupsys = "54USER_POSITION4groupsys";
				
				if (name4groupsys != null) {

					at.setName(name4groupsys);
					at.setValue (objectArray4groupsys[i] != null ? objectArray4groupsys[i]
							.toString() : "");

					atlist4groupsys.add(at);
				}
			}
			
			uat.setUid(uid4groupsys);
			uat.setAttributes(atlist4groupsys);

			result4groupsys.add(uat); 
			resultIds.put(idRec4groupsys, uat);

			if (usersIdsLine4groupsys == null) {
				usersIdsLine4groupsys = "'" + idRec4groupsys + "'";
			} else {
				usersIdsLine4groupsys = usersIdsLine4groupsys + ", '" + idRec4groupsys + "'";
			}
	       }
		   
		   return usersIdsLine4groupsys ;
	}
}
