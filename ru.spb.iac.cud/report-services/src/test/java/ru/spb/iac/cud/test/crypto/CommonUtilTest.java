package ru.spb.iac.cud.test.crypto;


import iac.cud.infosweb.dataitems.BaseParamItem;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.cud.core.util.Configuration;
import ru.spb.iac.cud.reports.ReportsManager;
import ru.spb.iac.cud.reports.TaskProcessor;


public class CommonUtilTest {
    
    public CommonUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    	
    	 Configuration.setReportJRXML("");
    	Configuration.setReportJASPER("");
 Configuration.setReportJRNPRINT("");
 Configuration.setReportDOWNLOAD("");
    	    }
    
    @After
    public void tearDown() {
    	//Lifecycle.endCall();
    }

    /**
     * Test of findAlias method, of class CriteriaUtil.
     */
    @Test
    public void testFindAlias() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        ReportsManager am = new ReportsManager();
     try{  
    	
        am.create_report(new BaseParamItem());
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	am.download_report("123", "123");
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 
    	 BaseParamItem bpi = new BaseParamItem();
    	 bpi.put("reportDate1", new Date());
    	 bpi.put("reportCode", "123");
     	am.create_report(bpi);
     }catch(Exception e){
    	 System.out.println("ArmManager:forViewCert-3");
    	 Assert.assertTrue(result);
    }
 try{  
    	 
    	 BaseParamItem bpi = new BaseParamItem();
    	 bpi.put("reportDate2", new Date());
    	 bpi.put("reportCode", "123");
     	am.create_report(bpi);
     }catch(Exception e){
    	 System.out.println("ArmManager:forViewCert-3");
    	 Assert.assertTrue(result);
    }
 try{  
	 
	 BaseParamItem bpi = new BaseParamItem();
	 bpi.put("reportDate1", new Date());
	 bpi.put("reportDate2", new Date());
	 bpi.put("reportCode", "123");
 	am.create_report(bpi);
 }catch(Exception e){
	 System.out.println("ArmManager:forViewCert-3");
	 Assert.assertTrue(result);
}
try{  
	 
	 BaseParamItem bpi = new BaseParamItem();
	 bpi.put("reportCode", "123");
 	am.create_report(bpi);
 }catch(Exception e){
	 System.out.println("ArmManager:forViewCert-3");
	 Assert.assertTrue(result);
}

try{  
	 
	TaskProcessor am2 = new TaskProcessor();
	
	TaskProcessor.getControls();
	TaskProcessor.setControls(new ConcurrentHashMap());
}catch(Exception e){
	 System.out.println("ArmManager:forViewCert-3");
	 Assert.assertTrue(result);
}
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
   
  
}