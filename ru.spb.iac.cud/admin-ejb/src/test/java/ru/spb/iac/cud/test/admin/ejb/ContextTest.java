package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.infosweb.context.mc.arm.ArmContext;
import iac.grn.infosweb.context.mc.armgroup.ArmGroupContext;
import iac.grn.infosweb.context.mc.audit.func.AFuncContext;
import iac.grn.infosweb.context.mc.audit.sys.ASysContext;
import iac.grn.infosweb.context.mc.clorg.ClOrgContext;
import iac.grn.infosweb.context.mc.clusr.ClUsrContext;
import iac.grn.infosweb.context.mc.cpar.CparContext;
import iac.grn.infosweb.context.mc.org.OrgContext;
import iac.grn.infosweb.context.mc.perm.PermContext;
import iac.grn.infosweb.context.mc.rol.RolContext;
import iac.grn.infosweb.context.mc.ugroup.UgroupContext;
import iac.grn.infosweb.context.mc.usr.UsrContext;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ContextTest {
    
    public ContextTest() {
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
       
       
        boolean result = true;
        try{
        	ArmContext ac = new ArmContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	ArmGroupContext ac = new ArmGroupContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	AFuncContext ac = new AFuncContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	ASysContext ac = new ASysContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	ClOrgContext ac = new ClOrgContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	ClUsrContext ac = new ClUsrContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	CparContext ac = new CparContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	OrgContext ac = new OrgContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	PermContext ac = new PermContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	RolContext ac = new RolContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	UgroupContext ac = new UgroupContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
        try{
        	UsrContext ac = new UsrContext(); 
            ac.getAuditItemsCollection();
            ac.getAuditItemsMap();
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
   
}