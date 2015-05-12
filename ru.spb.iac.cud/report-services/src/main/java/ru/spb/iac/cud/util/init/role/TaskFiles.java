package ru.spb.iac.cud.util.init.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class TaskFiles {

	 public TaskFiles(){
		 
	 }
	public  String createLine (List<String> uids2role){
		String result2role = null;
		
		if (uids2role != null && !uids2role.isEmpty()) {

			StringBuilder bld2role = new StringBuilder();
 for (String uidValue : uids2role) {
 if (bld2role.length()==0) {
 bld2role.append("'" + uidValue + "'");
 }else{
 bld2role.append(",'" + uidValue + "'");
 }
}
 result2role=bld2role.toString();
		}
		
		return result2role;
	}

	public  String createAttributes (List<Object[]> lo2role, List<User> result2role, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid2role = null;
		   String idRec2role = null;
		   User uat = null;
		   List<Attribute> atlist2role = null;
		   String usersIdsLine2role = null;
		   
		  

			
			System.setProperty("Test2role0Init",
					"Test2role0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2role05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2role0Init.class/jcp.xml");
			
			
			System.setProperty("Test2role0ss2role0_0x",
					"Test2role0ss2role0_0xjcp.xml");
        	System.setProperty("Test2role0ss2role0_02",
					"Test2role0ss2role0_02xml.config");
			System.setProperty("Test2role0ss2role0_03",
					"Test2role0ss2role0_03.apache.xml.resource.security.");
		    System.setProperty("Test2role0ss2role0_04",
					"Test2role0ss2role0_04.resource.");
			System.setProperty("Test2role0ss2role0_05",
					"Test2role0ss2role0_05.isInitialized");
			System.setProperty("Test2role0ss2role0_06",
					"Test2role0ss2role0_06_2role0Init.class/jcp.xml");
			System.setProperty("Test2role0ss2role0_07",
					"Test2role0ss2role0_07t/resource/jcp.xml");
        	System.setProperty("Test2role0ss2role0_08",
					"Test2role0ss2role0_08.config");
			System.setProperty("Test2role0ss2role0_09",
					"Test2role0ss2role0_09.security.");
		    System.setProperty("Test2role0ss2role0_0x0",
					"Test2role0ss2role0_0x0jcp.xmlapache.");
			System.setProperty("Test2role0ss2role0_0xx0",
					"Test2role0ss2role0_0xx0.isInitialized");
			System.setProperty("Test2role0ss2role0_0xxx0",
					"Test2role0ss2role0_0xxx0est2role0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray2role : lo2role) {

			// !!!
				// Проверить
				uid2role = objectArray2role[0].toString();

				idRec2role = objectArray2role[0].toString();

				uat = new User();
				atlist2role = new ArrayList<Attribute>();
				String name2role = null;
	
			for (int i = 0; i < objectArray2role.length; i++) {

				at = new Attribute();


				name2role = "USER_FIO2role";
				
			
			
				name2role = "USER_PHONE2role";
				
			
			
				name2role = "USER_EMAIL2role";
				
			
			
				name2role = "ORG_name2role2role";
				
			
	
				name2role = "USER_UID2role";
				
			
			
				name2role = "USER_LOGIN2role";
				
			
				
				name2role = "ORG_CODE_IOGV2role";
				
			
			
				name2role = "ORG_ADDRES2role";
				
			
			
				name2role = "ORG_PHONE2role";
				
			
			
				name2role = "ORG_Prr2role";
				
			
			
				name2role = "ORG_PffE2role";
				
			
			
				name2role = "ORG_PHggNE2role";
				
			
		
			
			
				name2role = "ORrr_PHONE2role";
				
			
			
				name2role = "ORyy_PHONE2role";
				
			
			
				name2role = "OddPHONE2role";
				
			
			
				name2role = "OffHONE2role";
				
			
			
				name2role = "DEP_name2role2role";
				
			
			
				name2role = "Off_PHONE2role";
				
			
			
				name2role = "ORl_PHONE2role";
				
			
			
				name2role = "OuuG_PHONE2role";
				
			
		
				name2role = "Ogff_PHONE2role";
				
			
			
				name2role = "USER_POSITION2role";
				
			
			
				name2role = "ORG_CODE_OKATO2role";
				
			
			
				name2role = "DEP_ADDRES2roleS";
				

			name2role = "1USER_UID2role";
				
				name2role = "11USER_EMAIL2role";
			
				name2role = "12ORG_name2role2role";
			
				name2role = "212USER_LOGIN2role";
			
				name2role = "111USER_FIO2role";
			
			
				name2role = "132ORG_CODE_IOGV2role";
			
				name2role = "433ORG_PHggNE2role";
			
				name2role = "13Off_PHONE2role";
			
				name2role = "43ORG_ADDRES2role";
		
				name2role = "234ORG_PHONE2role";
		
				name2role = "55ORG_Prr2role";
			
				name2role = "432ORG_PffE2role";
			
				name2role = "ORl_PHONE2role";
			
				name2role = "46OddPHONE2role";
			
				name2role = "895OffHONE2role";
			
				name2role = "54OuuG_PHONE2role";
			
				name2role = "89Ogff_PHONE2role";
			
				name2role = "53ORrr_PHONE2role";
			
		
				name2role = "6678ORyy_PHONE2role";
			
				name2role = "543ORG_CODE_OKATO2role";
			
				name2role = "56DEP_ADDRES2roleS";
			
				name2role = "890DEP_name2role2role";
			
				name2role = "700USER_POSITION2role";
				
				name2role = "54USER_UID2role";
				
				name2role = "780USER_EMAIL2role";
			
				name2role = "54ORG_name2role2role";
			
				name2role = "7890USER_LOGIN2role";
			
				name2role = "700USER_FIO2role";
			
			
				name2role = "654ORG_CODE_IOGV2role";
			
				name2role = "478ORG_PHggNE2role";
			
				name2role = "96Off_PHONE2role";
			
				name2role = "574ORG_ADDRES2role";
		
				name2role = "489ORG_PHONE2role";
		
				name2role = "065ORG_Prr2role";
			
				name2role = "457ORG_PffE2role";
			
				name2role = "87ORl_PHONE2role";
			
				name2role = "543OddPHONE2role";
			
				name2role = "478OffHONE2role";
			
				name2role = "965OuuG_PHONE2role";
			
				name2role = "457Ogff_PHONE2role";
			
				name2role = "8678ORrr_PHONE2role";
			
		
				name2role = "68ORyy_PHONE2role";
			
				name2role = "4ORG_CODE_OKATO2role";
			
				name2role = "778DEP_ADDRES2roleS";
			
				name2role = "447DEP_name2role2role";
			
				name2role = "54USER_POSITION2role";
				
				if (name2role != null) {

					at.setName(name2role);
					at.setValue (objectArray2role[i] != null ? objectArray2role[i]
							.toString() : "");

					atlist2role.add(at);
				}
			}
			
			uat.setUid(uid2role);
			uat.setAttributes(atlist2role);

			result2role.add(uat); 
			resultIds.put(idRec2role, uat);

			if (usersIdsLine2role == null) {
				usersIdsLine2role = "'" + idRec2role + "'";
			} else {
				usersIdsLine2role = usersIdsLine2role + ", '" + idRec2role + "'";
			}
	       }
		   
		   return usersIdsLine2role ;
	}
}
