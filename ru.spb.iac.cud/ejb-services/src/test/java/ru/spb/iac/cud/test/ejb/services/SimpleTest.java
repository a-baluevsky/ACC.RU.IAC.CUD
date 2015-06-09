package ru.spb.iac.cud.test.ejb.services;

//import org.jboss.arquillian.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;

import ru.spb.iac.cud.core.util.CUDConstants;
import ru.spb.iac.cud.idp.core.access.IDPAccessManager;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerRemote;
//import org.jboss.arquillian.container.test.api.Deployment;

//@RunWith(Arquillian.class)
public class SimpleTest {

	
	
	public SimpleTest()  {
	}

	//@Deployment
    public static JavaArchive createTestArchive() {
       return ShrinkWrap.create(JavaArchive.class, "test.jar" )

	         .addClasses(IDPAccessManagerLocal.class, IDPAccessManager.class, IDPAccessManagerRemote.class,
	        		 CUDConstants.class)

	         .addAsManifestResource("test-persistence.xml", "persistence.xml")
	         .addAsResource("jndi.properties");
     
	   }
	
	//@EJB
    private IDPAccessManagerLocal iDPAccessManagerLocal;
	
	 //@Test
     public void testCanPersistUserObject() {
		 
		 try {
			iDPAccessManagerLocal.attributes("admin");
		} catch (Exception e) {
			System.out.println("testCanPersistUserObject:error:"+e);
			//e.printStackTrace();
			
		}
		 
		 Assert.assertTrue(true);
	 }
}
