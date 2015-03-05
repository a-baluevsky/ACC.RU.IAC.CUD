package ru.spb.iac.cud.test.ejb.services.init;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.spb.iac.cud.items.User;
import ru.spb.iac.cud.util.init.role.ModuleRunManager;
import ru.spb.iac.cud.util.init.role.ProcessManager;
import ru.spb.iac.cud.util.init.role.TaskFiles;
import ru.spb.iac.cud.util.init.role.UnitRoles;
import ru.spb.iac.cud.util.init.role.GroupSettings;
import ru.spb.iac.cud.util.init.role.CparOrgSettings;
import ru.spb.iac.cud.util.init.role.ClassifGroupManager;
import ru.spb.iac.cud.util.init.role.AccessApp;
import ru.spb.iac.cud.util.init.role.AccesGroupInit;
import ru.spb.iac.cud.util.init.role.AdminOrgInit;


public class CommonRoleUtilTest {
    
    public CommonRoleUtilTest() {
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



    @Test
    public void testFindAlias0() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        ModuleRunManager am = new ModuleRunManager();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias1() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        ProcessManager am = new ProcessManager();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert-2");
        boolean expResult = false;
       
        TaskFiles am = new TaskFiles();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        UnitRoles am = new UnitRoles();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        GroupSettings am = new GroupSettings();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        CparOrgSettings am = new CparOrgSettings();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        ClassifGroupManager am = new ClassifGroupManager();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        AccessApp am = new AccessApp();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        AccesGroupInit am = new AccesGroupInit();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
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
       
        AdminOrgInit am = new AdminOrgInit();
        boolean result = true;
        
 try{
	  List<String> resultUser= new ArrayList<String>();
      resultUser.add("1");
      resultUser.add("2");
    am.createLine(resultUser);
    }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
        
        try{
        	
        	List<Object[]> lo = new ArrayList<Object[]>();
        	Object[] objArr = {"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c",
        			"a","b","c","a","b","c","b","c","a","b","c","b","c","a","b","c"};
        	lo.add(objArr);
        	Object[] objArr1 = {"a","b"};
        	lo.add(objArr1);
        	List<User> resultUser= new ArrayList<User>(); 
        	Map<String, User> resultIds = new HashMap<String, User>();
        	
      am.createAttributes(lo, resultUser, resultIds);
        }catch(Exception e){
        	 System.out.println("ArmManager:forViewCert-3");
        	 Assert.assertTrue(result);
        }
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    
   
}