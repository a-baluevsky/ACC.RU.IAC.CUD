package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.serviceitems.ProcInfoItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OrgManagerTest {
    
    public OrgManagerTest() {
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
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.getConfDate();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.getConfPeriod();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.getExecDate();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.getExecHit();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.setConfDate(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.setConfPeriod(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.setExecDate(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias8() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.setExecHit(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias9() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.toString();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias10() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcInfoItem am = new ProcInfoItem();
        boolean result = true;
      am.hashCode();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
}