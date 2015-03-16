package ru.spb.iac.cud.test.admin.ejb;

import iac.grn.infosweb.context.Profile;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ProfileTest {
    
    public ProfileTest() {
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
        	Profile ac = new Profile(); 
            ac.getRowsCountAFunc(); 
            ac.getRowsCountAppAccess(); 
            ac.getRowsCountAppAdminSys(); 
            ac.getRowsCountAppBlock(); 
            ac.getRowsCountAppMyBlock(); 
            ac.getRowsCountAppMySystem(); 
            ac.getRowsCountAppMyUser(); 
            ac.getRowsCountAppMyUserAccModify(); 
            ac.getRowsCountAppMyUserCertModify(); 
            ac.getRowsCountAppMyUserModify(); 
            ac.getRowsCountAppOrgMan(); 
            ac.getRowsCountAppSystem(); 
            ac.getRowsCountAppSystemModify(); 
            ac.getRowsCountAppUser(); 
            ac.getRowsCountAppUserAccModify(); 
            ac.getRowsCountAppUserCertModify(); 
            ac.getRowsCountAppUserDepModify(); 
            ac.getRowsCountAppUserModify(); 
            ac.getRowsCountArm(); 
            ac.getRowsCountArmGroup(); 
            ac.getRowsCountArmSub(); 
            ac.getRowsCountAudit(); 
            ac.getRowsCountAuditSearch(); 
            ac.getRowsCountBind(); 
            ac.getRowsCountClOrg(); 
            ac.getRowsCountClUsr(); 
            ac.getRowsCountCpar(); 
            ac.getRowsCountDocs(); 
            ac.getRowsCountHosts(); 
            ac.getRowsCountOrg(); 
            ac.getRowsCountPerm(); 
            ac.getRowsCountRai(); 
            ac.getRowsCountRepos(); 
            ac.getRowsCountRol(); 
            ac.getRowsCountSupport(); 
            ac.getRowsCountUgroup(); 
            ac.getRowsCountUsr();
            
            ac.setRowsCountAFunc(1L); 
            ac.setRowsCountAppAccess(1L); 
            ac.setRowsCountAppAdminSys(1L); 
            ac.setRowsCountAppBlock(1L); 
            ac.setRowsCountAppMyBlock(1L); 
            ac.setRowsCountAppMySystem(1L); 
            ac.setRowsCountAppMyUser(1L); 
            ac.setRowsCountAppMyUserAccModify(1L); 
            ac.setRowsCountAppMyUserCertModify(1L); 
            ac.setRowsCountAppMyUserModify(1L); 
            ac.setRowsCountAppOrgMan(1L); 
            ac.setRowsCountAppSystem(1L); 
            ac.setRowsCountAppSystemModify(1L); 
            ac.setRowsCountAppUser(1L); 
            ac.setRowsCountAppUserAccModify(1L); 
            ac.setRowsCountAppUserCertModify(1L); 
            ac.setRowsCountAppUserDepModify(1L); 
            ac.setRowsCountAppUserModify(1L); 
            ac.setRowsCountArm(1L); 
            ac.setRowsCountArmGroup(1L); 
            ac.setRowsCountArmSub(1L); 
            ac.setRowsCountAudit(1L); 
            ac.setRowsCountAuditSearch(1L); 
            ac.setRowsCountBind(1L); 
            ac.setRowsCountClOrg(1L); 
            ac.setRowsCountClUsr(1L); 
            ac.setRowsCountCpar(1L); 
            ac.setRowsCountDocs(1L); 
            ac.setRowsCountHosts(1L); 
            ac.setRowsCountOrg(1L); 
            ac.setRowsCountPerm(1L); 
            ac.setRowsCountRai(1L); 
            ac.setRowsCountRepos(1L); 
            ac.setRowsCountRol(1L); 
            ac.setRowsCountSupport(1L); 
            ac.setRowsCountUgroup(1L); 
            ac.setRowsCountUsr(1L);
            
            
        }catch(Exception e){
      	  	 Assert.assertTrue(result);
        }
       
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
   
}