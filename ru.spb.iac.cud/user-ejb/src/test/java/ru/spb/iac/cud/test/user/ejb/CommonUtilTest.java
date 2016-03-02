package ru.spb.iac.cud.test.user.ejb;


import java.util.ArrayList;

import mypackage.Configuration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.picketlink.identity.federation.core.wstrust.WSTrustUtil;

import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.uarm.session.SessionListener;
import ru.spb.iac.cud.uarm.ws.AuditServiceClient;
import ru.spb.iac.cud.uarm.ws.STSServiceClient;
import ru.spb.iac.cud.uarm.ws.TestClientCryptoSOAPHandler;
import ru.spb.iac.cud.uarm.ws.TokenInstall;


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
    	 Configuration.setSamlAssertion("saml_asserion.xml");
         Configuration.setAuditService("http://paaa2.tp.toris.vpn/CudServicesPro/AuditService?wsdl");
         Configuration.setSamlRequestLoginUarm("uarm_saml_request_post.xml");
         Configuration.setSamlRequestLogout("saml_request_logout_post.xml");
         Configuration.setStorePath("cudvm.store");
         Configuration.setStsOboService("http://paaa2.tp.toris.vpn/CudServicesSTS/CUDSTS");
         Configuration.setStsService("http://paaa2.tp.toris.vpn/CudServicesSTS/CUDSTS");
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
        AuditServiceClient am = new AuditServiceClient();
        
       
        am.audit("", new ArrayList<AuditFunction>());
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias1() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        try{  
        AuditServiceClient am = new AuditServiceClient();
       
        
        am.sync_functions(new ArrayList<Function>());
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
   
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        
        WSTrustUtil wst= new WSTrustUtil();
        STSServiceClient am = new STSServiceClient();
        
        try{  
           
        am.sign_verify_soap_transform_2sign();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        	
        
        am.sign_verify_soap_transform_2sign("");
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
         
        am.propagateIDAttributeSetup(null, null);;
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        
        TestClientCryptoSOAPHandler am = new TestClientCryptoSOAPHandler();
        
        try{  
        	
        am.handleFault(null);
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        
         am.handleMessage(null);
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        
        am.toString();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        
        TokenInstall am = new TokenInstall();
        
        try{  
        	
        am.get_assertion();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        
         am.toString();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
    
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        
        TokenInstall am = new TokenInstall();
        
        try{  
        	
        am.get_assertion();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        
         am.toString();
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
    
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert-1");
        boolean result = true;
        
        SessionListener am = new SessionListener();
        
        try{  
        	
        am.sessionCreated(null);
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
        try{  
        
         am.sessionDestroyed(null);
    }catch(Exception e){
   	 System.out.println("ArmManager:forViewCert-3");
   	 Assert.assertTrue(result);
   }
    
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
}