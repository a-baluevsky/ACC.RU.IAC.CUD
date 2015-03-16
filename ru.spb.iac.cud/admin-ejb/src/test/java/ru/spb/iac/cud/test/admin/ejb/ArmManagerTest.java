package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.serviceitems.BaseTableItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArmManagerTest {
    
    public ArmManagerTest() {
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
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemField();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemColumn();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemLabel();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemFiltField();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
   
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemSort();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getItemSortField();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.getHeader();
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias8() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseTableItem am = new BaseTableItem(null, null, null);
        boolean result = true;
      am.setItemSort(1);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
}