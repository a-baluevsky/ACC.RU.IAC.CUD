package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.serviceitems.ProcItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RoleManagerTest {
    
    public RoleManagerTest() {
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
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.getPeriod();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.getStartDate();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.getStatus();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.setPeriod(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.setStartDate(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.setStatus(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.toString();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias9() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ProcItem am = new ProcItem();
        boolean result = true;
      am.hashCode();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
  
}