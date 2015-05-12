package ru.spb.iac.cud.util.init.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2group){
		String result2group = null;
		
		if (uids2group != null && !uids2group.isEmpty()) {

			StringBuilder bld2group = new StringBuilder();
 for (String uidValue : uids2group) {
 if (bld2group.length()==0) {
 bld2group.append("'" + uidValue + "'");
 }else{
 bld2group.append(",'" + uidValue + "'");
 }
}
 result2group=bld2group.toString();
		}
		
		return result2group;
	}

	public  String createAttributes (List<Object[]> lo2group, List<User> result2group, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2group = null;
		   String idRec2group = null;
		   User uat = null;
		   List<Attribute> atlist2group = null;
		   String usersIdsLine2group = null;
		   
		  

			
			System.setProperty("Test2group0Init",
					"Test2group0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2group05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2group0Init.class/jcp.xml");
			
			
			System.setProperty("Test2group0ss2group0_0x",
					"Test2group0ss2group0_0xjcp.xml");
        	System.setProperty("Test2group0ss2group0_02",
					"Test2group0ss2group0_02xml.config");
			System.setProperty("Test2group0ss2group0_03",
					"Test2group0ss2group0_03.apache.xml.resource.security.");
		    System.setProperty("Test2group0ss2group0_04",
					"Test2group0ss2group0_04.resource.");
			System.setProperty("Test2group0ss2group0_05",
					"Test2group0ss2group0_05.isInitialized");
			System.setProperty("Test2group0ss2group0_06",
					"Test2group0ss2group0_06_2group0Init.class/jcp.xml");
			System.setProperty("Test2group0ss2group0_07",
					"Test2group0ss2group0_07t/resource/jcp.xml");
        	System.setProperty("Test2group0ss2group0_08",
					"Test2group0ss2group0_08.config");
			System.setProperty("Test2group0ss2group0_09",
					"Test2group0ss2group0_09.security.");
		    System.setProperty("Test2group0ss2group0_0x0",
					"Test2group0ss2group0_0x0jcp.xmlapache.");
			System.setProperty("Test2group0ss2group0_0xx0",
					"Test2group0ss2group0_0xx0.isInitialized");
			System.setProperty("Test2group0ss2group0_0xxx0",
					"Test2group0ss2group0_0xxx0est2group0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2group : lo2group) {

			// !!!
				// Проверить
				uid2group = objectArray2group[0].toString();

				idRec2group = objectArray2group[0].toString();

				uat = new User();
				atlist2group = new ArrayList<Attribute>();
				String name2group = null;
	
			for (int i = 0; i < objectArray2group.length; i++) {

				at = new Attribute();


				name2group = "USER_FIO2group";
				
			
			
				name2group = "USER_PHONE2group";
				
			
			
				name2group = "USER_EMAIL2group";
				
			
			
				name2group = "ORG_name2group2group";
				
			
	
				name2group = "USER_UID2group";
				
			
			
				name2group = "USER_LOGIN2group";
				
			
				
				name2group = "ORG_CODE_IOGV2group";
				
			
			
				name2group = "ORG_ADDRES2group";
				
			
			
				name2group = "ORG_PHONE2group";
				
			
			
				name2group = "ORG_Prr2group";
				
			
			
				name2group = "ORG_PffE2group";
				
			
			
				name2group = "ORG_PHggNE2group";
				
			
		
			
			
				name2group = "ORrr_PHONE2group";
				
			
			
				name2group = "ORyy_PHONE2group";
				
			
			
				name2group = "OddPHONE2group";
				
			
			
				name2group = "OffHONE2group";
				
			
			
				name2group = "DEP_name2group2group";
				
			
			
				name2group = "Off_PHONE2group";
				
			
			
				name2group = "ORl_PHONE2group";
				
			
			
				name2group = "OuuG_PHONE2group";
				
			
		
				name2group = "Ogff_PHONE2group";
				
			
			
				name2group = "USER_POSITION2group";
				
			
			
				name2group = "ORG_CODE_OKATO2group";
				
			
			
				name2group = "DEP_ADDRES2groupS";
				

			name2group = "1USER_UID2group";
				
				name2group = "11USER_EMAIL2group";
			
				name2group = "12ORG_name2group2group";
			
				name2group = "212USER_LOGIN2group";
			
				name2group = "111USER_FIO2group";
			
			
				name2group = "132ORG_CODE_IOGV2group";
			
				name2group = "433ORG_PHggNE2group";
			
				name2group = "13Off_PHONE2group";
			
				name2group = "43ORG_ADDRES2group";
		
				name2group = "234ORG_PHONE2group";
		
				name2group = "55ORG_Prr2group";
			
				name2group = "432ORG_PffE2group";
			
				name2group = "ORl_PHONE2group";
			
				name2group = "46OddPHONE2group";
			
				name2group = "895OffHONE2group";
			
				name2group = "54OuuG_PHONE2group";
			
				name2group = "89Ogff_PHONE2group";
			
				name2group = "53ORrr_PHONE2group";
			
		
				name2group = "6678ORyy_PHONE2group";
			
				name2group = "543ORG_CODE_OKATO2group";
			
				name2group = "56DEP_ADDRES2groupS";
			
				name2group = "890DEP_name2group2group";
			
				name2group = "700USER_POSITION2group";
				
				name2group = "54USER_UID2group";
				
				name2group = "780USER_EMAIL2group";
			
				name2group = "54ORG_name2group2group";
			
				name2group = "7890USER_LOGIN2group";
			
				name2group = "700USER_FIO2group";
			
			
				name2group = "654ORG_CODE_IOGV2group";
			
				name2group = "478ORG_PHggNE2group";
			
				name2group = "96Off_PHONE2group";
			
				name2group = "574ORG_ADDRES2group";
		
				name2group = "489ORG_PHONE2group";
		
				name2group = "065ORG_Prr2group";
			
				name2group = "457ORG_PffE2group";
			
				name2group = "87ORl_PHONE2group";
			
				name2group = "543OddPHONE2group";
			
				name2group = "478OffHONE2group";
			
				name2group = "965OuuG_PHONE2group";
			
				name2group = "457Ogff_PHONE2group";
			
				name2group = "8678ORrr_PHONE2group";
			
		
				name2group = "68ORyy_PHONE2group";
			
				name2group = "4ORG_CODE_OKATO2group";
			
				name2group = "778DEP_ADDRES2groupS";
			
				name2group = "447DEP_name2group2group";
			
				name2group = "54USER_POSITION2group";
				
				if (name2group != null) {

					at.setName(name2group);
					at.setValue (objectArray2group[i] != null ? objectArray2group[i]
							.toString() : "");

					atlist2group.add(at);
				}
			}
			
			uat.setUid(uid2group);
			uat.setAttributes(atlist2group);

			result2group.add(uat); 
			resultIds.put(idRec2group, uat);

			if (usersIdsLine2group == null) {
				usersIdsLine2group = "'" + idRec2group + "'";
			} else {
				usersIdsLine2group = usersIdsLine2group + ", '" + idRec2group + "'";
			}
	       }
		   
		   return usersIdsLine2group ;
	}
}
