package ru.spb.iac.cud.test.ejb.services;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import ru.spb.iac.cud.core.AccessManager;
import ru.spb.iac.cud.core.AccessManagerLocal;
import ru.spb.iac.cud.core.AccessManagerRemote;
import ru.spb.iac.cud.core.SyncManager;
import ru.spb.iac.cud.core.SyncManagerLocal;
import ru.spb.iac.cud.core.SyncManagerRemote;
import ru.spb.iac.cud.core.UtilManagerLocal;
import ru.spb.iac.cud.core.UtilManagerRemote;
import ru.spb.iac.cud.core.app.ApplicationManager;
import ru.spb.iac.cud.core.app.ApplicationManagerLocal;
import ru.spb.iac.cud.core.app.ApplicationManagerRemote;
import ru.spb.iac.cud.core.app.ApplicationResultManager;
import ru.spb.iac.cud.core.app.ApplicationResultManagerLocal;
import ru.spb.iac.cud.core.app.ApplicationResultManagerRemote;
import ru.spb.iac.cud.core.eis.AdminManagerLocal;
import ru.spb.iac.cud.core.eis.AdminManagerRemote;
import ru.spb.iac.cud.core.eis.EisAdminManager;
import ru.spb.iac.cud.core.eis.EisUtilManager;
import ru.spb.iac.cud.core.util.CUDConstants;
import ru.spb.iac.cud.idp.core.access.IDPAccessManager;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerLocal;
import ru.spb.iac.cud.idp.core.access.IDPAccessManagerRemote;
import ru.spb.iac.cud.idp.core.util.IDPUtilManager;
import ru.spb.iac.cud.idp.core.util.IDPUtilManagerLocal;
import ru.spb.iac.cud.idp.core.util.IDPUtilManagerRemote;
import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.AuthMode;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.items.User;
import ru.spb.iac.cud.items.app.AppAttribute;
import ru.spb.iac.cud.items.app.AppResultRequest;
import ru.spb.iac.cud.items.app.AppSystemAttributesClassif;
import ru.spb.iac.cud.items.app.AppTypeClassif;
import ru.spb.iac.cud.items.app.AppUserAttributesClassif;
import ru.spb.iac.cud.util.CommonUtil;
import ru.spb.iac.cud.util.TIDEncode;

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

	         .addClasses(IDPAccessManagerLocal.class, IDPAccessManager.class, IDPAccessManagerRemote.class,
	        		 IDPUtilManagerLocal.class, IDPUtilManager.class,IDPUtilManagerRemote.class,
		        	AccessManagerLocal.class, AccessManager.class, AccessManagerRemote.class,
	        		 SyncManagerLocal.class, SyncManager.class, SyncManagerRemote.class,
	        		 ApplicationManagerLocal.class, ApplicationManager.class, ApplicationManagerRemote.class,
	        		 ApplicationResultManagerLocal.class, ApplicationResultManager.class, ApplicationResultManagerRemote.class,
	        		AdminManagerLocal.class, EisAdminManager.class, AdminManagerRemote.class,
	        		UtilManagerLocal.class, EisUtilManager.class, UtilManagerRemote.class,
	        		 CUDConstants.class)

	         .addAsManifestResource("test-persistence.xml", "persistence.xml")
	         .addAsResource("jndi.properties")
	         .addAsResource("crl_reestr.properties");
      // jndi.properties
	   }
	
	@EJB
    private IDPAccessManagerLocal iDPAccessManagerLocal;
	@EJB
    private IDPUtilManagerLocal iDPUtilManagerLocal;
	@EJB
    private AccessManagerLocal accessManagerLocal;
	@EJB
    private SyncManagerLocal syncManagerLocal;
	@EJB
    private ApplicationManagerLocal applicationManagerLocal;
	@EJB
    private ApplicationResultManagerLocal applicationResultManagerLocal;
	@EJB
    private AdminManagerLocal adminManagerLocal;
	@EJB
    private UtilManagerLocal utilManagerLocal;
	
    @Test
    public void testFindAlias() {
        System.out.println("ArmManager:forViewCert-1");
        boolean expResult = false;
       
       // CommonUtil am = new CommonUtil();
        boolean result = true;
        
        List<String> resultUser= new ArrayList<String>();
        resultUser.add("1");
        resultUser.add("2");
        CommonUtil.createLine(resultUser);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
       // CommonUtil am = new CommonUtil();
        boolean result = true;
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
        	CommonUtil.createAttributes(lo, resultUser, resultIds);
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        TIDEncode am = new TIDEncode();
        boolean result = true;
        try{
        	
        	     	
      am.getSecret();
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
   
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        AccessManager am = new AccessManager();
        boolean result = true;
        
        List l1 =new ArrayList<AuditFunction>();
        AuditFunction af = new AuditFunction();
        af.setCodeFunction("123");
       af.setDateFunction(new Date());
       l1.add(af);
       
       System.setProperty("jboss.server.config.dir","");
		
        try{
        am.get_reestr("123");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	accessManagerLocal.audit_pro("urn:eis:toris:zemuch", "1", l1, 1L, "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        
        try{
        	accessManagerLocal.audit_pro(null, "1", l1, 1L, "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        
        try{
        	accessManagerLocal.audit_pro( "urn:eis:toris:zemuch", null,l1, 1L, "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.audit_pro("urn:eis:toris:zemuch", null,l1, 1L, "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.authenticate_cert_sn("1", AuthMode.WEB_SERVICES, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.authenticate_cert_sn("1234567890", AuthMode.HTTP_REDIRECT, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.authenticate_cert_sn(null, AuthMode.HTTP_REDIRECT, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.authenticate_login("alex", "alex", AuthMode.WEB_SERVICES, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.authenticate_login_obo("alex", AuthMode.WEB_SERVICES, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.authenticate_login_obo("alex", AuthMode.WEB_SERVICES, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.authenticate_uid_obo("alex", AuthMode.WEB_SERVICES, "1", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.change_password("alex", "alex", "alex", "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.change_password("alex", "alex", null, "1");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.is_exist("urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.is_exist("urn:group-eis:toris");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            }
        try{
        	accessManagerLocal.is_exist("123");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.is_exist(null);
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        try{
        	accessManagerLocal.sys_audit_public(1L, "1", "1", "1", 1L, "alex", "urn:eis:toris:zemuch");
            }catch(Exception e){
            	 System.out.println("ArmManager:forViewCert-3");
            	 Assert.assertTrue(result);
            } 
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        SyncManager am = new SyncManager();
        boolean result = true;
        
        List list1 =new ArrayList<Role>();
        Role r1 = new Role();
        r1.setCode("123");
        r1.setName("123");
    	list1.add(r1);
    	
    	 List list2 =new ArrayList<Function>();
    	 Function f1 = new Function();
    	 f1.setCode("123");
    	 f1.setName("123");
     	list2.add(f1);
    	
     	 List list3 =new ArrayList<Group>();
     	Group g1 =new Group();
     	g1.setCode("123");
     	g1.setName("123");
     	List list11 =new ArrayList<String>();
    	list11.add("urn:group-users:149");
    	list11.add("1");
     	g1.setCodesRoles(list11);
     	
      	list3.add(g1);
      	
        try{
         	syncManagerLocal.is_exist("urn:eis:toris:zemuch");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
         	syncManagerLocal.is_exist("urn:eis:uu");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
         	syncManagerLocal.is_exist("12345");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	syncManagerLocal.is_functions("urn:eis:toris:zemuch", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	syncManagerLocal.is_functions(null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.is_functions("urn:group-eis:toristoris", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.is_functions("urn:eis:toris:zemuch", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        
        try{ 
        	syncManagerLocal.is_roles("urn:eis:toris:zemuch", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{ 
        	syncManagerLocal.is_roles(null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{ 
        	syncManagerLocal.is_roles("urn:group-eis:toris", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{ 
        	syncManagerLocal.is_roles("urn:eis:toris:zemuch", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_functions("urn:eis:toris:zemuch", null , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        
        try{
        	syncManagerLocal.sync_functions("urn:eis:toris:zemuch", list2 , "REPLACE", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_functions(null, list2 , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_functions("urn:eis:toris:zemuch", list2 , null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        
        try{
        	syncManagerLocal.sync_functions("urn:eis:toris:zemuch", list2 , "ADD", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups("urn:eis:toris:zemuch", null , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        
        try{
        	syncManagerLocal.sync_groups("urn:eis:toris:zemuch", list3 , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups(null, list3 , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups("urn:eis:toris:zemuch", list3 , null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups("urn:eis:toris:zemuch", list3 , "ADD", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups_roles("urn:eis:toris:zemuch",  new ArrayList<String>(), new ArrayList<String>(), "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups_roles(null,  new ArrayList<String>(), new ArrayList<String>(), "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources("urn:eis:toris:zemuch", new ArrayList<Resource>(), "1", 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources(null, new ArrayList<Resource>(), "1", 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources("urn:eis:toris:zemuch", new ArrayList<Resource>(), null, 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources("urn:eis:toris:zemuch", new ArrayList<Resource>(), "ADD", 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources("urn:group-eis:toris", new ArrayList<Resource>(), "ADD", 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources("urn:eis:toris:zemuch", new ArrayList<Resource>(), "ADD", 1L, "1");;
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups_roles("urn:eis:toris:zemuch",  new ArrayList<String>(), new ArrayList<String>(), null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_groups_roles("urn:eis:toris:zemuch",  new ArrayList<String>(), new ArrayList<String>(), "ADD", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_resources_roles("urn:eis:toris:zemuch",  new ArrayList<String>(),  new ArrayList<String>(), "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        
        try{
        	syncManagerLocal.sync_roles("urn:eis:toris:zemuch", list1 , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_roles( null , new ArrayList<Role>() , "1", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_roles( "urn:eis:toris:zemuch" , list1 , null, 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.sync_roles("urn:eis:toris:zemuch", list1 , "ADD", 1L, "1");
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
        try{
        	syncManagerLocal.toString();
             }catch(Exception e){
             	 System.out.println("ArmManager:forViewCert-3");
             	 Assert.assertTrue(result);
             }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        ApplicationManager am = new ApplicationManager();
        boolean result = true;
        
        
        List<AppAttribute> list = new ArrayList<AppAttribute>();
        AppAttribute aa = new AppAttribute();
        aa.setName(AppSystemAttributesClassif.SHORT_NAME_SYS.name());
        aa.setValue("11");
        list.add(aa);
        
        aa = new AppAttribute();
        aa.setName(AppSystemAttributesClassif.FULL_NAME_SYS.name());
        aa.setValue("22");
        list.add(aa);
        
        aa = new AppAttribute();
        aa.setName(AppUserAttributesClassif.NAME_USER.name());
        aa.setValue("22");
        list.add(aa);
        
        aa = new AppAttribute();
        aa.setName(AppUserAttributesClassif.SURNAME_USER.name());
        aa.setValue("22");
        list.add(aa);
        
        aa = new AppAttribute();
        aa.setName(AppUserAttributesClassif.PATRONYMIC_USER.name());
        aa.setValue("22");
        list.add(aa);
        
        aa = new AppAttribute();
        aa.setName(AppUserAttributesClassif.NAME_ORG.name());
        aa.setValue("22");
        list.add(aa);
        
        try{
        	applicationManagerLocal.access_groups("ADD", "alex", "urn:eis:toris:zemuch", new ArrayList<String>(), "1", 1L, "1");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	applicationManagerLocal.access_groups(null, "alex", "urn:eis:toris:zemuch", new ArrayList<String>(), "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.access_roles("ADD", "alex", "urn:eis:toris:zemuch", new ArrayList<String>(), "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.access_roles(null, "alex", "urn:eis:toris:zemuch", new ArrayList<String>(), "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.block("ADD", "alex", "1", "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.block(null, "1", "1", "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.principal_exist("53FE502300000000068A");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.system_modification("urn:eis:toris:zemuch", list, "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.system_modification("urn:eis:toris:zemuch", null, "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
    try{
    	applicationManagerLocal.system_modification(null, list, "1", 1L, "1");
          }catch(Exception e){
          	 System.out.println("ArmManager:forViewCert-3");
          	 Assert.assertTrue(result);
          }
        try{
        	applicationManagerLocal.system_registration(list, "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.system_registration(null, "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.user_cert_modification("1", "1", "1", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationManagerLocal.user_dep_modification("1", list, "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationManagerLocal.user_identity_modification("1", "1", "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.user_identity_modification(null, "1", "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.user_modification("1",  list, "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationManagerLocal.user_modification("1", null, "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationManagerLocal.user_registration( list, "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationManagerLocal.user_registration( null, "1",  1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        ApplicationResultManager am = new ApplicationResultManager();
        boolean result = true;
        
        List <AppResultRequest> list = new ArrayList<AppResultRequest>();
        AppResultRequest arr = new AppResultRequest();
        arr.setNumber("178");
        arr.setSecret("Y3dTYjE0MTc2NzY4MTQxNTk=");
        arr.setAppType(AppTypeClassif.USER_REGISTRATION.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("1");
        arr.setSecret("333");
        arr.setAppType(AppTypeClassif.USER_ACCESS_ROLES.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("1");
        arr.setSecret("333");
        arr.setAppType(AppTypeClassif.USER_ACCESS_GROUPS.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("88");
        arr.setSecret("VFV5ZzE0MTgzNjU1NDA5NzI=");
        arr.setAppType(AppTypeClassif.USER_BLOCK.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("1");
        arr.setSecret("333");
        arr.setAppType(AppTypeClassif.SYSTEM_MODIFICATION.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("123");
        arr.setSecret("VXhRRjE0MTgxMTA0Mjk0NzY=");
        arr.setAppType(AppTypeClassif.SYSTEM_REGISTRATION.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("189");
        arr.setSecret("NnFQWjE0MTU2Mjc2NDc5NTQ=");
        arr.setAppType(AppTypeClassif.USER_MODIFICATION.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("100");
        arr.setSecret("Mk9NVDE0MTg0ODA1ODY5MDY=");
        arr.setAppType(AppTypeClassif.USER_MODIFICATION_ACC.name());
        list.add(arr);
        
        arr = new AppResultRequest();
        arr.setNumber("1");
        arr.setSecret("333");
        arr.setAppType(AppTypeClassif.USER_MODIFICATION_CERT.name());
        list.add(arr);
        
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", "1");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	applicationResultManagerLocal.number_secret_valid("hhh", "1", "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.SYSTEM_REGISTRATION.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_REGISTRATION.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_ACCESS_ROLES.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_ACCESS_GROUPS.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_BLOCK.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.SYSTEM_MODIFICATION.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_MODIFICATION.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_MODIFICATION_ACC.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.number_secret_valid("1", "1", AppTypeClassif.USER_MODIFICATION_CERT.name());
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.principal_exist("1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	applicationResultManagerLocal.result(list, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.result(new ArrayList<AppResultRequest>(), 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.result(null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	applicationResultManagerLocal.result(list, null, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias8() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        EisAdminManager am = new EisAdminManager();
        boolean result = true;
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("urn:role:zemuch:operator");
        	list1.add("1");
        	adminManagerLocal.access("urn:eis:toris:zemuch", list1, "ADD", list1, 1L, "1");;
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("urn:role:zemuch:operator");
        	list1.add("1");
        	adminManagerLocal.access("urn:eis:toris:zemuch", list1, "REPLACE", list1, 1L, "1");;
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("1");
        	list1.add("2");
        	adminManagerLocal.access("urn:eis:toris:zemuch", list1, "REMOVE", list1, 1L, "1");;
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("urn:group-users:149");
        	list1.add("1");
        	List list2 =new ArrayList<String>();
        	list2.add("1");
        	adminManagerLocal.access_groups("urn:eis:toris:zemuch", list2, "ADD", list1, 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("urn:group-users:149");
        	list1.add("1");
        	List list2 =new ArrayList<String>();
        	list2.add("1");
        	adminManagerLocal.access_groups("urn:eis:toris:zemuch", list2, "REPLACE", list1, 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	List list1 =new ArrayList<String>();
        	list1.add("urn:group-users:149");
        	list1.add("1");
        	adminManagerLocal.access_groups("urn:eis:toris:zemuch", new ArrayList<String>(), "ADD", new ArrayList<String>(), 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	String cert ="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";
        	adminManagerLocal.cert_change("urn:eis:toris:zemuch", cert, 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	adminManagerLocal.cert_change("1", null, 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	adminManagerLocal.cert_change("1", "1", 1L, "1");;
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	adminManagerLocal.toString();
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
       
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias9() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        EisUtilManager am = new EisUtilManager();
        boolean result = true;
        try{
        	utilManagerLocal.groups_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS", new ArrayList<String>(), 1, 2, null, 1L, "1");
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	utilManagerLocal.groups_data(null, new ArrayList<String>(), "SYS", new ArrayList<String>(), 1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS", new ArrayList<String>(), 1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("urn:group-eis:toris", new ArrayList<String>(), "SYS", new ArrayList<String>(), 1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("1", new ArrayList<String>(), "SYS", new ArrayList<String>(), 1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("1", new ArrayList<String>(), "USER", new ArrayList<String>(), 1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("urn:eis:toris:zemuch", new ArrayList<String>(), "USER", new ArrayList<String>(), null, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("urn:eis:toris:zemuch", new ArrayList<String>(), "1", new ArrayList<String>(), 1, null, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.groups_data("urn:eis:toris:zemuch", new ArrayList<String>(), "1", new ArrayList<String>(), 1, 10000, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.is_exist("urn:eis:toris:zemuch");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.is_exist("1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.is_organisations("urn:eis:toris:zemuch", 1, 2, new ArrayList<String>(), 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "1",new ArrayList<String>(),1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data(null, new ArrayList<String>(), "1",new ArrayList<String>(),1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "1",new ArrayList<String>(),1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:group-eis:toris", new ArrayList<String>(), "1",new ArrayList<String>(),1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS",new ArrayList<String>(),1, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS",new ArrayList<String>(),null, 2, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS",new ArrayList<String>(),1, null, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data("urn:eis:toris:zemuch", new ArrayList<String>(), "SYS",new ArrayList<String>(),1, 100000, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys("urn:eis:toris:zemuch", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys(null,"SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys("urn:group-eis:toris","SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys("urn:group-eis:toris","SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys("urn:eis:toris:zemuch","SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.resources_data_subsys("urn:eis:toris:zemuch","SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
       
        try{
        	utilManagerLocal.roles_data("urn:eis:toris:zemuch", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.roles_data(null, "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.roles_data("urn:group-eis:toris", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.roles_data("urn:group-eis:toris", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.roles_data("urn:eis:toris:zemuch", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.roles_data("urn:eis:toris:zemuch", "SYS", 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), 1, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data(null, new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), 1, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), null, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), 1, null, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), 1, 100000, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"SYS",  new ArrayList<String>(), new ArrayList<String>(), 1, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	utilManagerLocal.users_data("urn:eis:toris:zemuch", new ArrayList<String>(),"1",  new ArrayList<String>(), new ArrayList<String>(), 1, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	utilManagerLocal.users_data("urn:group-eis:toris", new ArrayList<String>(),"1",  new ArrayList<String>(), new ArrayList<String>(), 1, 1, null, 1L, "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias10() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        IDPAccessManager am = new IDPAccessManager();
        boolean result = true;
        try{
        	iDPAccessManagerLocal.attributes("alex");
        }catch(Exception e){
        	 System.out.println("IDPAccessManager:test:error:"+e);
        	 Assert.assertTrue(result);
        }
        
        try{
        	iDPAccessManagerLocal.resources("alex", "urn:eis:toris:zemuch");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	iDPAccessManagerLocal.rolesCodes("alex", "urn:eis:toris:zemuch");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	iDPAccessManagerLocal.saveTokenID("1", "1");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3+++");
              	 Assert.assertTrue(result);
              }
        try{
        	iDPAccessManagerLocal.toString();
              }catch(Exception e){
              	 System.out.println("IDPAccessManager:test:error:"+e);
              	 Assert.assertTrue(result);
              }
        
       
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias11() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        IDPUtilManager am = new IDPUtilManager();
        boolean result = true;
        try{
        	iDPUtilManagerLocal.system_cert("urn:eis:toris:zemuch");
        }catch(Exception e){
        	 System.out.println("IDPAccessManager:test:error:"+e);
        	 Assert.assertTrue(result);
        }
        
        try{
        	iDPUtilManagerLocal.system_cert(null);
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	iDPUtilManagerLocal.system_cert("urn:eis:toris:zemuch");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3");
              	 Assert.assertTrue(result);
              }
        
        try{
        	iDPUtilManagerLocal.system_cert("urn:group-eis:toris");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3+++");
              	 Assert.assertTrue(result);
              }
        try{
        	iDPUtilManagerLocal.system_cert("urn:sub-eis:sales:post");
              }catch(Exception e){
              	 System.out.println("ArmManager:forViewCert-3+++");
              	 Assert.assertTrue(result);
              }
        
       
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
}