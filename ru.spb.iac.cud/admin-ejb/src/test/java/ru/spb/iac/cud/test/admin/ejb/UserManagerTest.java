package ru.spb.iac.cud.test.admin.ejb;

import mypackage.Configuration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UserManagerTest {
    
    public UserManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    	// Lifecycle.beginCall();
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
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getArchiveAuditFunc();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getArchiveAuditSys();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getArchiveToken();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getAuditService();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getClassifLoadPatch();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getClassifLoadTmp();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getClassifService();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias8() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getJasperLogin();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias9() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getJasperPassword();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias10() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getJasperServer();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias11() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getSamlAssertion();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias12() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getSamlRequestLogin();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias13() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getSamlRequestLogout();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias14() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getStorePath();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias15() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getStsOboService();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias16() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getStsService();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias17() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getUccert();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias18() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        Configuration am = new Configuration();
        boolean result = true;
      am.getUcCertReestr();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
}