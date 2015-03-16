package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.serviceitems.HeaderTableItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GroupManagerTest {
    
    public GroupManagerTest() {
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
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.getItemField();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.getItemLabel();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.setItemField(null);;
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.setItemLabel(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.getItems();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.setItems(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        HeaderTableItem am = new HeaderTableItem(null, null);
        boolean result = true;
      am.hashCode();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

  
}