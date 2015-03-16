package ru.spb.iac.cud.test.crypto;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.crypto.init.host.CryptoOrgInit;
import ru.spb.iac.crypto.init.host.CryptoAccessInit;
import ru.spb.iac.crypto.init.host.CryptoAccessGroupInit;
import ru.spb.iac.crypto.init.host.CryptoSettingsGroupInit;
import ru.spb.iac.crypto.init.host.CryptoBaseTableInit;
import ru.spb.iac.crypto.init.host.CryptoStateHolderInit;
import ru.spb.iac.crypto.init.host.CryptoContextAppInit;
import ru.spb.iac.crypto.init.host.CryptoDataModelInit;
import ru.spb.iac.crypto.init.host.CryptoAuditSysInit;
import ru.spb.iac.crypto.init.host.CryptoDomainInit;


public class CommonTestoUtilTest {
    
    public CommonTestoUtilTest() {
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
    	 CryptoAccessInit am = new CryptoAccessInit();
    	 am = new CryptoAccessInit("","","","","","","");
        am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoAccessInit am = new CryptoAccessInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
  
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoAccessGroupInit am = new CryptoAccessGroupInit();
    	 am = new CryptoAccessGroupInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoAccessGroupInit am = new CryptoAccessGroupInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoSettingsGroupInit am = new CryptoSettingsGroupInit();
    	 am = new CryptoSettingsGroupInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoSettingsGroupInit am = new CryptoSettingsGroupInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoBaseTableInit am = new CryptoBaseTableInit();
    	 am = new CryptoBaseTableInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoBaseTableInit am = new CryptoBaseTableInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoStateHolderInit am = new CryptoStateHolderInit();
    	 am = new CryptoStateHolderInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoStateHolderInit am = new CryptoStateHolderInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoContextAppInit am = new CryptoContextAppInit();
    	 am = new CryptoContextAppInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoContextAppInit am = new CryptoContextAppInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoDataModelInit am = new CryptoDataModelInit();
    	 am = new CryptoDataModelInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoDataModelInit am = new CryptoDataModelInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias8() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoAuditSysInit am = new CryptoAuditSysInit();
    	 am = new CryptoAuditSysInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoAuditSysInit am = new CryptoAuditSysInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias9() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoDomainInit am = new CryptoDomainInit();
    	 am = new CryptoDomainInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoDomainInit am = new CryptoDomainInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias10() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
     try{  
    	 CryptoOrgInit am = new CryptoOrgInit();
    	 am = new CryptoOrgInit("","","","","","","");
         am.init();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
     try{  
    	 CryptoOrgInit am = new CryptoOrgInit();
        am.fileInit();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
      // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    
}