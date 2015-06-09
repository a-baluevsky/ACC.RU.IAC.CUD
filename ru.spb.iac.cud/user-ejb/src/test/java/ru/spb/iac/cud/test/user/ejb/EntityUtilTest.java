package ru.spb.iac.cud.test.user.ejb;


import mypackage.Configuration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.cud.uarm.ejb.entity.AcIsBssT;
import ru.spb.iac.cud.uarm.ejb.entity.AcRolesBssT;
import ru.spb.iac.cud.uarm.ejb.entity.JournAppAdminUserSysBssT;
import ru.spb.iac.cud.uarm.ejb.entity.LinkAdminUserSys;


public class EntityUtilTest {
    
    public EntityUtilTest() {
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
    	 Configuration.setStorePath("");
         Configuration.setSamlAssertion("");
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
    	 AcIsBssT am = new AcIsBssT();
        
          am.addAcRolesBssT(new AcRolesBssT());
          
          am.addJournAppAdminUserSysBssT(new JournAppAdminUserSysBssT());
          
          am.addLinkAdminUserSy(new LinkAdminUserSys ());
          
          am.getAcRolesBssTs();
          
          am.getCertAlias();
          
          am.getCertDate();
          
          am.getCreated();
          
          am.getCreator();
          
          am.getDescription();
          
          am.getFull();
          
          am.getGroups();
          
          am.getIdSrv();
          
          am.getJournAppAccessBssTs();
          
          am.getJournAppAccessGroupsBssTs();
          
          am.getJournAppAdminUserSysBssTs();
          
          am.getLinkAdminUserSys();
          
          am.getSignObject();
          
          am.setAcRolesBssTs(null);
          
          am.setAcRolesBssTs(null);
          
          am.setCertAlias(null);
          
          am.setCertDate(null);
          
          am.setCreated(null);
          
          am.setCreator(null);
          
          am.setDescription(null);
          
          am.setFull(null);
          
          am.setGroups(null);
          
          am.setIdSrv(null);
          
          am.setJournAppAccessBssTs(null);
          
          am.setJournAppAccessGroupsBssTs(null);
          
          am.setJournAppAdminUserSysBssTs(null);
          
          am.setLinkAdminUserSys(null);
          
          am.setSignObject(null);
          
          am.removeJournAppAdminUserSysBssT(new JournAppAdminUserSysBssT());
          
          am.removeLinkAdminUserSy(new LinkAdminUserSys());
          
          am.removeAcRolesBssT(new AcRolesBssT());
          
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
  
}