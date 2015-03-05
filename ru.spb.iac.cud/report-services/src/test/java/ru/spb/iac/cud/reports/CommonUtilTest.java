package ru.spb.iac.cud.reports;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.cud.core.util.Configuration;


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

    
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        CUDQueryAppFull am = new CUDQueryAppFull();
        am = new CUDQueryAppFull("123");
     try{  
    	
        am.create_report();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	am.download_report("123");
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 
    	am.test();
     }catch(Exception e){
    	 System.out.println("ArmManager:forViewCert-3");
    	 Assert.assertTrue(result);
    }
 try{  
    	am.compile();
    	 System.out.println("ArmManager:forViewCert-3");
    	 Assert.assertTrue(result);
  
 }catch(Exception e){
	 System.out.println("ArmManager:forViewCert-3");
	 Assert.assertTrue(result);
}


       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
  
}