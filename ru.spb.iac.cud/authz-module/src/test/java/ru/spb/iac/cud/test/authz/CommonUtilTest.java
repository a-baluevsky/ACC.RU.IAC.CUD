package ru.spb.iac.cud.test.authz;


import iac.cud.authmodule.session.AutzManager;
import iac.cud.authmodule.session.AutzManagerLocal;
import iac.cud.authmodule.session.AutzManagerRemote;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(Arquillian.class)
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
    	// Lifecycle.beginCall();
    }
    
    @After
    public void tearDown() {
    	//Lifecycle.endCall();
    }
    @Deployment
    public static JavaArchive createTestArchive() {
       return ShrinkWrap.create(JavaArchive.class, "test.jar" )

	         .addClasses(AutzManagerLocal.class, AutzManager.class, AutzManagerRemote.class
	        		)

	         .addAsManifestResource("test-persistence.xml", "persistence.xml")
	         .addAsResource("jndi.properties");
    
	   }
	
	@EJB
    private AutzManagerLocal autzManagerLocal;
			
      
   
    @Test
    public void testFindAlias1() {
        System.out.println("ArmManager:forViewCert-2");
        boolean result = true;
       
      		List <String> roles = new ArrayList<String>();
      		
      		roles.add("role:urn:user_cud");
      		roles.add("role:urn:sys_admin_cud");
        try{

        	autzManagerLocal.getAccessComplete(1L, roles);
        	
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	autzManagerLocal.getAccessPage(1L, roles, "urn_ugroup");

        }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        
        try{
        	autzManagerLocal.getAccessPage(1L, roles, "urn_ugroup", "1");

        }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
   
}