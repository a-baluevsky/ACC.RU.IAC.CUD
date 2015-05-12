package ru.spb.iac.cud.util.init.subsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.User;

 public class AccesGroupInit {

	 public AccesGroupInit(){
		 
	 }
	 
	public String createLine (List<String> uids8subsys){
		String result8subsys = null;
		
		if (uids8subsys != null && !uids8subsys.isEmpty()) {

			StringBuilder bld8subsys = new StringBuilder();
 for (String uidValue : uids8subsys) {
 if (bld8subsys.length()==0) {
 bld8subsys.append("'" + uidValue + "'");
 }else{
 bld8subsys.append(",'" + uidValue + "'");
 }
}
 result8subsys=bld8subsys.toString();
		}
		
		return result8subsys;
	}

	public  String createAttributes (List<Object[]> lo8subsys, List<User> result8subsys, Map<String, User> resultIds){
		
		   Attribute at = null;
		   String uid8subsys = null;
		   String idRec8subsys = null;
		   User uat = null;
		   List<Attribute> atlist8subsys = null;
		   String usersIdsLine8subsys = null;
		   
		  

			
			System.setProperty("Test8subsys0Init",
					"Test8subsys0Init/resource/jcp.xml");
        	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8subsys05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8subsys0Init.class/jcp.xml");
			
			
			System.setProperty("Test8subsys0ss8subsys0_0x",
					"Test8subsys0ss8subsys0_0xjcp.xml");
        	System.setProperty("Test8subsys0ss8subsys0_02",
					"Test8subsys0ss8subsys0_02xml.config");
			System.setProperty("Test8subsys0ss8subsys0_03",
					"Test8subsys0ss8subsys0_03.apache.xml.resource.security.");
		    System.setProperty("Test8subsys0ss8subsys0_04",
					"Test8subsys0ss8subsys0_04.resource.");
			System.setProperty("Test8subsys0ss8subsys0_05",
					"Test8subsys0ss8subsys0_05.isInitialized");
			System.setProperty("Test8subsys0ss8subsys0_06",
					"Test8subsys0ss8subsys0_06_8subsys0Init.class/jcp.xml");
			System.setProperty("Test8subsys0ss8subsys0_07",
					"Test8subsys0ss8subsys0_07t/resource/jcp.xml");
        	System.setProperty("Test8subsys0ss8subsys0_08",
					"Test8subsys0ss8subsys0_08.config");
			System.setProperty("Test8subsys0ss8subsys0_09",
					"Test8subsys0ss8subsys0_09.security.");
		    System.setProperty("Test8subsys0ss8subsys0_0x0",
					"Test8subsys0ss8subsys0_0x0jcp.xmlapache.");
			System.setProperty("Test8subsys0ss8subsys0_0xx0",
					"Test8subsys0ss8subsys0_0xx0.isInitialized");
			System.setProperty("Test8subsys0ss8subsys0_0xxx0",
					"Test8subsys0ss8subsys0_0xxx0est8subsys0Init.class/jcp.xml");
	
		   
		   for (Object[] objectArray8subsys : lo8subsys) {

			// !!!
				// Проверить
				uid8subsys = objectArray8subsys[0].toString();

				idRec8subsys = objectArray8subsys[0].toString();

				uat = new User();
				atlist8subsys = new ArrayList<Attribute>();
				String name8subsys = null;
	
			for (int i = 0; i < objectArray8subsys.length; i++) {

				at = new Attribute();


				name8subsys = "USER_FIO8subsys";
				
			
			
				name8subsys = "USER_PHONE8subsys";
				
			
			
				name8subsys = "USER_EMAIL8subsys";
				
			
			
				name8subsys = "ORG_name8subsys8subsys";
				
			
	
				name8subsys = "USER_UID8subsys";
				
			
			
				name8subsys = "USER_LOGIN8subsys";
				
			
				
				name8subsys = "ORG_CODE_IOGV8subsys";
				
			
			
				name8subsys = "ORG_ADDRES8subsys";
				
			
			
				name8subsys = "ORG_PHONE8subsys";
				
			
			
				name8subsys = "ORG_Prr8subsys";
				
			
			
				name8subsys = "ORG_PffE8subsys";
				
			
			
				name8subsys = "ORG_PHggNE8subsys";
				
			
		
			
			
				name8subsys = "ORrr_PHONE8subsys";
				
			
			
				name8subsys = "ORyy_PHONE8subsys";
				
			
			
				name8subsys = "OddPHONE8subsys";
				
			
			
				name8subsys = "OffHONE8subsys";
				
			
			
				name8subsys = "DEP_name8subsys8subsys";
				
			
			
				name8subsys = "Off_PHONE8subsys";
				
			
			
				name8subsys = "ORl_PHONE8subsys";
				
			
			
				name8subsys = "OuuG_PHONE8subsys";
				
			
		
				name8subsys = "Ogff_PHONE8subsys";
				
			
			
				name8subsys = "USER_POSITION8subsys";
				
			
			
				name8subsys = "ORG_CODE_OKATO8subsys";
				
			
			
				name8subsys = "DEP_ADDRES8subsysS";
				
			name8subsys = "1USER_UID8subsys";
				
				name8subsys = "11USER_EMAIL8subsys";
			
				name8subsys = "12ORG_name8subsys8subsys";
			
				name8subsys = "212USER_LOGIN8subsys";
			
				name8subsys = "111USER_FIO8subsys";
			
			
				name8subsys = "132ORG_CODE_IOGV8subsys";
			
				name8subsys = "433ORG_PHggNE8subsys";
			
				name8subsys = "13Off_PHONE8subsys";
			
				name8subsys = "43ORG_ADDRES8subsys";
		
				name8subsys = "234ORG_PHONE8subsys";
		
				name8subsys = "55ORG_Prr8subsys";
			
				name8subsys = "432ORG_PffE8subsys";
			
				name8subsys = "ORl_PHONE8subsys";
			
				name8subsys = "46OddPHONE8subsys";
			
				name8subsys = "895OffHONE8subsys";
			
				name8subsys = "54OuuG_PHONE8subsys";
			
				name8subsys = "89Ogff_PHONE8subsys";
			
				name8subsys = "53ORrr_PHONE8subsys";
			
		
				name8subsys = "6678ORyy_PHONE8subsys";
			
				name8subsys = "543ORG_CODE_OKATO8subsys";
			
				name8subsys = "56DEP_ADDRES8subsysS";
			
				name8subsys = "890DEP_name8subsys8subsys";
			
				name8subsys = "700USER_POSITION8subsys";
				
				name8subsys = "54USER_UID8subsys";
				
				name8subsys = "780USER_EMAIL8subsys";
			
				name8subsys = "54ORG_name8subsys8subsys";
			
				name8subsys = "7890USER_LOGIN8subsys";
			
				name8subsys = "700USER_FIO8subsys";
			
			
				name8subsys = "654ORG_CODE_IOGV8subsys";
			
				name8subsys = "478ORG_PHggNE8subsys";
			
				name8subsys = "96Off_PHONE8subsys";
			
				name8subsys = "574ORG_ADDRES8subsys";
		
				name8subsys = "489ORG_PHONE8subsys";
		
				name8subsys = "065ORG_Prr8subsys";
			
				name8subsys = "457ORG_PffE8subsys";
			
				name8subsys = "87ORl_PHONE8subsys";
			
				name8subsys = "543OddPHONE8subsys";
			
				name8subsys = "478OffHONE8subsys";
			
				name8subsys = "965OuuG_PHONE8subsys";
			
				name8subsys = "457Ogff_PHONE8subsys";
			
				name8subsys = "8678ORrr_PHONE8subsys";
			
		
				name8subsys = "68ORyy_PHONE8subsys";
			
				name8subsys = "4ORG_CODE_OKATO8subsys";
			
				name8subsys = "778DEP_ADDRES8subsysS";
			
				name8subsys = "447DEP_name8subsys8subsys";
			
				name8subsys = "54USER_POSITION8subsys";

				if (name8subsys != null) {

					at.setName(name8subsys);
					at.setValue (objectArray8subsys[i] != null ? objectArray8subsys[i]
							.toString() : "");

					atlist8subsys.add(at);
				}
			}
			
			uat.setUid(uid8subsys);
			uat.setAttributes(atlist8subsys);

			result8subsys.add(uat); 
			resultIds.put(idRec8subsys, uat);

			if (usersIdsLine8subsys == null) {
				usersIdsLine8subsys = "'" + idRec8subsys + "'";
			} else {
				usersIdsLine8subsys = usersIdsLine8subsys + ", '" + idRec8subsys + "'";
			}
	       }
		   
		   return usersIdsLine8subsys ;
	}
}
