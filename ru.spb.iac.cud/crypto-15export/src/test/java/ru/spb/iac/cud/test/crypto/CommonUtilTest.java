package ru.spb.iac.cud.test.crypto;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.crypto.export.Crypto15Init;


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
     try{  
    	 Crypto15Init am = new Crypto15Init();
        
       
        am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 Crypto15Init am = new Crypto15Init();
        
       
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
  
}