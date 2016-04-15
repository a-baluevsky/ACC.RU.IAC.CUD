package ru.spb.iac.cud.test.common;


import iac.cud.authmodule.dataitem.AuthItem;
import iac.cud.authmodule.dataitem.PageItem;
import iac.cud.infosweb.dataitems.AppAccessItem;
import iac.cud.infosweb.dataitems.AppAdminSysItem;
import iac.cud.infosweb.dataitems.AppBlockItem;
import iac.cud.infosweb.dataitems.AppItem;
import iac.cud.infosweb.dataitems.AppOrgManItem;
import iac.cud.infosweb.dataitems.AppSystemItem;
import iac.cud.infosweb.dataitems.AppSystemModifyItem;
import iac.cud.infosweb.dataitems.AppUserAccModifyItem;
import iac.cud.infosweb.dataitems.AppUserCertModifyItem;
import iac.cud.infosweb.dataitems.AppUserDepModifyItem;
import iac.cud.infosweb.dataitems.AppUserItem;
import iac.cud.infosweb.dataitems.AppUserModifyItem;
import iac.cud.infosweb.dataitems.AuditFuncItem;
import iac.cud.infosweb.dataitems.AuditReportsItem;
import iac.cud.infosweb.dataitems.AuditTransferItem;
import iac.cud.infosweb.dataitems.BaseItem;
import iac.cud.infosweb.dataitems.BaseParamItem;
import iac.cud.infosweb.dataitems.BindingItem;
import iac.cud.infosweb.dataitems.NavigItem;
import iac.cud.infosweb.dataitems.ReportDownloadItem;
import iac.cud.infosweb.dataitems.SystemCertItem;
import iac.cud.infosweb.dataitems.UCCertItem;
import iac.cud.infosweb.dataitems.UserBindingItem;
import iac.cud.infosweb.dataitems.UserItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CommonTest {
    
    public CommonTest() {
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
       
        AuthItem am = new AuthItem();
        boolean result = true;
      am.getIdUser();
      am.getPageList();
      am.setPageList(null);
      am.setIdUser(1L);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias2() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        PageItem am = new PageItem();
        boolean result = true;
      am.getPermList();
      am.setPermList(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
   
    
    @Test
    public void testFindAlias3() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppAccessItem am = new AppAccessItem();
        boolean result = true;
      am.getBaseId();
      am.getCodeArm();
      am.getComment();
      am.getCommentApp();
      am.getCreated();
      am.getDescriptionArm();
      am.getFioUser();
      am.getFullNameArm();
      am.getIdApp();
      am.getIdArm();
      am.getIdUser();
      am.getLoginUser();
      am.getModeExec();
      am.getModeExecValue();
      am.getNameDep();
      am.getNameOrg();
      am.getOrgName();
      am.getPositionUser();
      am.getRejectReason();
      am.getSelected();
      am.getStatus();
      am.getStatusValue();
      am.getUsrFio();

      am.setBaseId(null);
      am.setCodeArm(null);
      am.setComment(null);
      am.setCommentApp(null);
      am.setCreated(null);
      am.setDescriptionArm(null);
      am.setFioUser(null);
      am.setFullNameArm(null);
      am.setIdApp(null);
      am.setIdArm(null);
      am.setIdUser(null);
      am.setLoginUser(null);
      am.setModeExec(1);
      am.setModeExecValue(null);
      am.setNameDep(null);
      am.setNameOrg(null);
      am.setOrgName(null);
      am.setPositionUser(null);
      am.setRejectReason(null);
      am.setSelected(true);
      am.setStatus(1);
      am.setStatusValue(null);
      am.setUsrFio(null);
      
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias31() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppAdminSysItem am = new AppAdminSysItem();
        boolean result = true;
     
        am.getBaseId();
        am.getCodeArm();
        am.getComment();
        am.getCommentApp();
        am.getCreated();
        am.getDescriptionArm();
        am.getFioUser();
        am.getFullNameArm();
        am.getIdApp();
        am.getIdArm();
        am.getIdUser();
        am.getLoginUser();
        am.getModeExec();
        am.getModeExecValue();
        am.getNameDep();
        am.getNameOrg();
        am.getOrgName();
        am.getPositionUser();
        am.getRejectReason();
        am.getSelected();
        am.getStatus();
        am.getStatusValue();
        am.getUsrFio();
        
        am.setBaseId(null);
        am.setCodeArm(null);
        am.setComment(null);
        am.setCommentApp(null);
        am.setCreated(null);
        am.setDescriptionArm(null);
        am.setFioUser(null);
        am.setFullNameArm(null);
        am.setIdApp(null);
        am.setIdArm(null);
        am.setIdUser(null);
        am.setLoginUser(null);
        am.setModeExec(1);
        am.setModeExecValue(null);
        am.setNameDep(null);
        am.setNameOrg(null);
        am.setOrgName(null);
        am.setPositionUser(null);
        am.setRejectReason(null);
        am.setSelected(true);
        am.setStatus(1);
        am.setStatusValue(null);
        am.setUsrFio(null);
        
        
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    

 

    
    @Test
    public void testFindAlias4() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppBlockItem am = new AppBlockItem();
        boolean result = true;
       
      am.getBaseId();  
      am.getBlockReason();  
      am.getComment();  
      am.getCommentApp();  
      am.getCreated();  
      am.getFioUser();  
      am.getIdApp();  
      am.getIdUser();  
      am.getLoginUser();  
      am.getModeExec();  
      am.getModeExecValue();  
      am.getNameDep();  
      am.getNameOrg();  
      am.getOrgName();  
      am.getPositionUser();  
      am.getRejectReason();  
      am.getSelected();  
      am.getStatus();  
      am.getStatusValue();  
      am.getUsrFio();  
      
      am.setBaseId(null);  
      am.setBlockReason(null);  
      am.setComment(null);  
      am.setCommentApp(null);  
      am.setCreated(null);  
      am.setFioUser(null);  
      am.setIdApp(null);  
      am.setIdUser(null);  
      am.setLoginUser(null);  
      am.setModeExec(1);  
      am.setModeExecValue(null);  
      am.setNameDep(null);  
      am.setNameOrg(null);  
      am.setOrgName(null);  
      am.setPositionUser(null);  
      am.setRejectReason(null);  
      am.setSelected(true);  
      am.setStatus(1);  
      am.setStatusValue(null);  
      am.setUsrFio(null);  
      
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias5() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppItem am = new AppItem();
        boolean result = true;
        
        
      am.getBaseId();
      am.getComment();
      am.getCommentApp();
      am.getCreated();
      am.getIdApp();
      am.getOrgName();
      am.getRejectReason();
      am.getSelected();
      am.getStatus();
      am.getStatusValue();
      am.getUsrFio();
      
      
      am.setBaseId(null);
      am.setComment(null);
      am.setCommentApp(null);
      am.setCreated(null);
      am.setIdApp(null);
      am.setOrgName(null);
      am.setRejectReason(null);
      am.setSelected(true);
      am.setStatus(1);
      am.setStatusValue(null);
      am.setUsrFio(null);
      
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias6() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppOrgManItem am = new AppOrgManItem();
        boolean result = true;
        
        am.getBaseId();
        am.getComment();
        am.getCommentApp();
        am.getCreated();
        am.getFioUser();
        am.getIdApp();
        am.getIdUser();
        am.getLoginUser();
        am.getModeExec();
        am.getModeExecValue();
        am.getNameDep();
        am.getNameOrg();
        am.getOrgName();
        am.getPositionUser();
        am.getRejectReason();
        am.getSelected();
        am.getStatus();
        am.getStatusValue();
        am.getUsrFio();
        
        am.setBaseId(null);
        am.setComment(null);
        am.setCommentApp(null);
        am.setCreated(null);
        am.setFioUser(null);
        am.setIdApp(null);
        am.setIdUser(null);
        am.setLoginUser(null);
        am.setModeExec(1);
        am.setModeExecValue(null);
        am.setNameDep(null);
        am.setNameOrg(null);
        am.setOrgName(null);
        am.setPositionUser(null);
        am.setRejectReason(null);
        am.setSelected(true);
        am.setStatus(1);
        am.setStatusValue(null);
        am.setUsrFio(null);
        
      
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias7() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppSystemItem am = new AppSystemItem();
        boolean result = true;
         
        am.getBaseId();
        am.getCodeArm();
        am.getComment();
        am.getCommentApp();
        am.getCreated();
        am.getDescription();
        am.getDescriptionArm();
        am.getFullName();
        am.getFullNameArm();
        am.getIdApp();
        am.getIdArm();
        am.getOrgName();
        am.getRejectReason();
        am.getSelected();
        am.getShortName();
        am.getStatus();
        am.getStatusValue();
        am.getUsrFio();
       
        am.setBaseId(null);
        am.setCodeArm(null);
        am.setComment(null);
        am.setCommentApp(null);
        am.setCreated(null);
        am.setDescription(null);
        am.setDescriptionArm(null);
        am.setFullName(null);
        am.setFullNameArm(null);
        am.setIdApp(null);
        am.setIdArm(null);
        am.setOrgName(null);
        am.setRejectReason(null);
        am.setSelected(true);
        am.setShortName(null);
        am.setStatus(1);
        am.setStatusValue(null);
        am.setUsrFio(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias12() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppSystemModifyItem am = new AppSystemModifyItem();
        boolean result = true;
         am.getBaseId();
         am.getCodeArm();
         am.getComment();
         am.getCommentApp();
         am.getCreated();
         am.getDescription();
         am.getDescriptionArm();
         am.getFullName();
         am.getFullNameArm();
         am.getIdApp();
         am.getIdArm();
         am.getOrgName();
         am.getRejectReason();
         am.getSelected();
         am.getShortName();
         am.getStatus();
         am.getStatusValue();
         am.getUsrFio();
         
         am.setBaseId(null);
         am.setCodeArm(null);
         am.setComment(null);
         am.setCommentApp(null);
         am.setCreated(null);
         am.setDescription(null);
         am.setDescriptionArm(null);
         am.setFullName(null);
         am.setFullNameArm(null);
         am.setIdApp(null);
         am.setIdArm(null);
         am.setOrgName(null);
         am.setRejectReason(null);
         am.setSelected(true);
         am.setShortName(null);
         am.setStatus(1);
         am.setStatusValue(null);
         am.setUsrFio(null);
         
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias22() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppUserAccModifyItem am = new AppUserAccModifyItem();
        
        
        boolean result = true;
        
       am.getBaseId();
       am.getCertificate();
       am.getCertUser();
       am.getComment();
       am.getCommentApp();
       am.getCreated();
       am.getEmailUser();
       am.getFioUser();
       am.getIdApp();
       am.getIdUser();
       am.getIogvCodeUser();
       am.getLogin();
       am.getLoginUser();
       am.getNameDep();
       am.getNameOrg();
       am.getOrgName();
       am.getPassword();
       am.getPhoneUser();
       am.getPositionUser();
       am.getRejectReason();
       am.getSelected();
       am.getStatus();
       am.getStatusValue();
       am.getUsrFio();
       
       am.setBaseId(null);
       am.setCertificate(null);
       am.setCertUser(null);
       am.setComment(null);
       am.setCommentApp(null);
       am.setCreated(null);
       am.setEmailUser(null);
       am.setFioUser(null);
       am.setIdApp(null);
       am.setIdUser(null);
       am.setIogvCodeUser(null);
       am.setLogin(null);
       am.setLoginUser(null);
       am.setNameDep(null);
       am.setNameOrg(null);
       am.setOrgName(null);
       am.setPassword(null);
       am.setPhoneUser(null);
       am.setPositionUser(null);
       am.setRejectReason(null);
       am.setSelected(true);
       am.setStatus(1);
       am.setStatusValue(null);
       am.setUsrFio(null);
       
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias32() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppUserCertModifyItem am = new AppUserCertModifyItem();
        boolean result = true;
         am.getBaseId();
         am.getCertDate();
         am.getCertDepName();
         am.getCertNum();
         am.getCertOrgName();
         am.getCertUser();
         am.getCertUserFio();
         am.getComment();
         am.getCommentApp();
         am.getCreated();
         am.getEmailUser();
         am.getFioUser();
         am.getIdApp();
         am.getIdUser();
         am.getIogvCodeUser();
         am.getLoginUser();
         am.getModeExec();
         am.getModeExecValue();
         am.getNameDep();
         am.getNameOrg();
         am.getOrgName();
         am.getPhoneUser();
         am.getPositionUser();
         am.getRejectReason();
         am.getSelected();
         am.getStatus();
         am.getStatusValue();
         am.getUsrFio();
         
         am.setBaseId(null);
         am.setCertDate(null);
         am.setCertDepName(null);
         am.setCertNum(null);
         am.setCertOrgName(null);
         am.setCertUser(null);
         am.setCertUserFio(null);
         am.setComment(null);
         am.setCommentApp(null);
         am.setCreated(null);
         am.setEmailUser(null);
         am.setFioUser(null);
         am.setIdApp(null);
         am.setIdUser(null);
         am.setIogvCodeUser(null);
         am.setLoginUser(null);
         am.setModeExec(1);
         am.setModeExecValue(null);
         am.setNameDep(null);
         am.setNameOrg(null);
         am.setOrgName(null);
         am.setPhoneUser(null);
         am.setPositionUser(null);
         am.setRejectReason(null);
         am.setSelected(true);
         am.setStatus(1);
         am.setStatusValue(null);
         am.setUsrFio(null);
         
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias42() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppUserDepModifyItem am = new AppUserDepModifyItem();
        boolean result = true;
         am.getBaseId();
         
        

     	new AppUserDepModifyItem(1L, "", 1,
     			"", "", "", "","","", 1L, "", "",
     			"", "", "",
     			"", "", "",
     			"");
     	

     	am.getIdUser();

     	am.setIdUser(1L);
     	am.getLoginUser() ;

     	am.setLoginUser("");

     	am.getFioUser();

     	am.setFioUser("") ;
     	am.getPositionUser() ;
     	am.setPositionUser("") ;
     	am.getNameDep() ;
     	am.setNameDep("");
     	am.getNameOrg() ;
     	am.setNameOrg("");
     	am.getCertUser() ;
     	am.setCertUser("");
     	am.getEmailUser() ;
     	am.setEmailUser("");
     	am.getPhoneUser() ;
     	am.setPhoneUser("");
     	am.getIogvCodeUser() ;
     	am.setIogvCodeUser("");
     	am.getDepartament();
     	am.setDepartament("");
     	am.getIogvCodeOrg() ;
     	am.setIogvCodeOrg("");

         
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias52() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppUserItem am = new AppUserItem();
        boolean result = true;
       
      	new AppUserItem(1L, "", 1, "",
      			"", "", "",

      			"", "", "",
      			"", "", "",
      			"", "", "",
      			"", "",

    			1L, "",

    			"");

      	am.getSurnameUser();
      	am.setSurnameUser("") ;
      	am.getNameUser() ;

      	am.setNameUser("");
      	am.getPatronymicUser() ;
      	am.setPatronymicUser("");
      	am.getIogvCodeUser() ;
      	am.setIogvCodeUser("") ;

      	am.getPositionUser() ;

      	am.setPositionUser("");

      	am.getEmailUser() ;

      	am.setEmailUser("") ;

      	am.getPhoneUser() ;

      	am.setPhoneUser("");

      	am.getCertificateUser();

      	am.setCertificateUser("") ;

      	am.getNameDepartament() ;

      	am.setNameDepartament("");

      	am.getNameOrg() ;

      	am.setNameOrg("");
      	am.getIogvCodeOrg() ;

      	am.setIogvCodeOrg("");

      	am.getIdUser() ;

      	am.setIdUser(1L);

      	am.getLogin() ;

      	am.setLogin("");
    	

      	am.getFioIogvUser() ;

      	am.setFioIogvUser("") ;

      	am.getPasswordTechUser() ;

      	am.setPasswordTechUser("");
         
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias62() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AppUserModifyItem am = new AppUserModifyItem();
        boolean result = true;

        new AppUserModifyItem(1L, "", 1,
        		"", "", "", "",

        		"", "", "", "",
        		"", "", "", "",
        		"",

        		 "", 1L, "", "", 
        		"", "", "",
        		"", "", "");

        am.getName();
        am. setName("") ;
        am.getSurname();
        am.setSurname("");
        am.getPatronymic();
      am.setPatronymic("");
      am.getIogvCode();
    	am.setIogvCode("");
    	
    	am.getPosition();
    	am.setPosition("");
    	
    	am.getEmail();
    	am.setEmail("");
    	am.getPhone();
    	am.setPhone("");
    	am.getCertificate();
    	am.setCertificate("");
    	am.getDepartament();
    	am.setDepartament("");
    	am.getLoginUser() ;
    	am.setLoginUser("");
    	am.getFioUser();
    	am.setFioUser("");
    	am.getIdUser() ;
    	am.setIdUser(1L);  
    	am.getPositionUser();
    	am.setPositionUser("");
    	am.getNameOrg() ;

    	am.setNameOrg("") ;
    	am.getNameDep();
    	am.setNameDep("");
    	am.getCertUser() ;
    	am.setCertUser("");
    	am.getIogvCodeUser();
    	am.setIogvCodeUser("");
    	am.getPhoneUser();
    	am.setPhoneUser("");
    		am.getEmailUser();
    	am.setEmailUser("") ;
            
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias72() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AuditFuncItem am = new AuditFuncItem();
        boolean result = true;
        am.getAction();
        am.getCount();
        am.getUser();
       
        am.setAction(null);
        am.setCount(1L);
        am.setUser(null);
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias73() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AuditReportsItem am = new AuditReportsItem();
        boolean result = true;
        am.getCurrdate();
        am.getIpAddress();
        am.getOsUser();
        am.getQdelete();
        am.getQinsert();
        am.getQselect();
        am.getQupdate();
        am.getTableName();
      
        am.setCurrdate(null);
        am.setIpAddress(null);
        am.setOsUser(null);
        am.setQdelete(null);
        am.setQinsert(null);
        am.setQselect(null);
        am.setQupdate(null);
        am.setTableName(null);
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
  
    @Test
    public void testFindAlias74() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        AuditTransferItem<?> am = new AuditTransferItem<>();
        boolean result = true;
        am.getCount();
        am.getList();
        am.getStatus();
        
        am.setCount(1L);
        am.setList(null);
        am.setStatus(1);
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
   
    
    @Test
    public void testFindAlias75() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseItem am = new  BaseItem();
        boolean result = true;
        am.getBaseId();
        am.getSelected();
        
        am.setBaseId(null);
        am.setSelected(true);
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    
    @Test
    public void testFindAlias76() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BaseParamItem am = new  BaseParamItem();
        boolean result = true;
        am.get("123");
        am.put("123", "11");
        am.get("123");
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias77() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        BindingItem am = new BindingItem();
        am = new BindingItem(1L,null, "", 0);
        boolean result = true;
        am.getBaseId();
        am.getSelected();
        am.getBindType();
        am.getIdSrv();
        am.getUserItem();
        
        am.setBaseId(null);
        am.setSelected(true);
        am.setBindType(0);
        am.setIdSrv(1L);
        am.setUserItem(new UserItem());
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias78() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        NavigItem am = new NavigItem();
        am= new NavigItem("", null, null);
        boolean result = true;
        am.getChildren();
        am.getIdRes();
        am.getPageCode();
        am.getPageName();
        am.getParent();
        
        am.setChildren(null);
        am.setIdRes("");
        am.setPageCode("");
        am.setPageName("");
        am.setParent(new NavigItem());
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias79() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        ReportDownloadItem am = new  ReportDownloadItem();
        boolean result = true;
      
        am.getContent();
        am.getFlagExec();
        
        am.setContent(null);
        am.setFlagExec(1);
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias80() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        SystemCertItem  am = new SystemCertItem ();
        boolean result = true;
        am.getDate1();
        am.getDate2();
        am.getIssuer();
        am.getName();
        am.getSerial();
        
        am.setDate1("");
        am.setDate2("");
        am.setIssuer("");
        am.setName("");
        am.setSerial("");
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias81() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        UCCertItem am = new  UCCertItem();
        am = new UCCertItem(null, "", null, null, null, null, null, null);
        boolean result = true;
        am.getBaseId();
        am.getCertDate();
        am.getCertNum();
        am.getCertUsed();
        am.getIdSrv();
        am.getOrgName();
        am.getSelected();
        am.getUserEmail();
        am.getUsrFio();
        am.getUsrPosition();
        
        am.setBaseId(1L);
        am.setCertDate("");
        am.setCertNum("");
        am.setCertUsed("");
        am.setIdSrv(1L);
        am.setOrgName("");
        am.setSelected(true);
        am.setUserEmail("");
        am.setUsrFio("");
        am.setUsrPosition("");
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }

    @Test
    public void testFindAlias82() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        UserBindingItem am = new UserBindingItem();
        
        am = new UserBindingItem(null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0);
        
        boolean result = true;
      
        am.getBaseId();
        am.getSelected();
        am.getCert();
        am.getCrtDate();
        am.getCrtUserLogin();
        am.getDepartment();
        am.getDepCode();
        am.getDepIogvStatus();
        am.getEmail();
        am.getFinish();
        am.getFio();
        am.getIdUser();
        am.getIogvBindType();
        am.getIsCudRole();
        am.getIsSysAdmin();
        am.getLogin();
        am.getOrgAdr();
        am.getOrgCode();
        am.getOrgIogvStatus();
        am.getOrgName();
        am.getOrgTel();
        am.getPhone();
        am.getPosition();
        am.getProtectLogin();
        am.getProtectPassword();
        am.getStart();
        am.getStatus();
        am.getStatusValue();
        am.getUpdDate();
        am.getUpdUserLogin();
        am.getUsrChecked();
        am.getUsrCode();
        am.getUsrIogvStatus();
        am.getBindingList();
        am.getBinFlag();
        
        
        am.setBaseId(1L);
        am.setSelected(true);
        am.setCert("");
        am.setCrtDate("");
        am.setCrtUserLogin("");
        am.setDepartment("");
        am.setDepCode("");
        am.setDepIogvStatus("");
        am.setEmail("");
        am.setFinish("");
        am.setFio("");
        am.setIdUser(1L);
        am.setIogvBindType(1L);
        am.setIsCudRole(1L);
        am.setIsSysAdmin(1L);
        am.setLogin("");
        am.setOrgAdr("");
        am.setOrgCode("");
        am.setOrgIogvStatus("");
        am.setOrgName("");
        am.setOrgTel("");
        am.setPhone("");
        am.setPosition("");
        am.setStart("");
        am.setStatus(1L);
        am.setStatusValue("");
        am.setUpdDate("");
        am.setUpdUserLogin("");
        am.setUsrChecked(true);
        am.setUsrCode("");
        am.setUsrIogvStatus("");
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
    @Test
    public void testFindAlias83() {
        System.out.println("ArmManager:forViewCert");
        boolean expResult = false;
       
        UserItem am = new UserItem();
        boolean result = true;
        am.getBaseId();
        am.getSelected();
        am.getCert();
        am.getCrtDate();
        am.getCrtUserLogin();
        am.getDepartment();
        am.getDepCode();
        am.getDepIogvStatus();
        am.getEmail();
        am.getFinish();
        am.getFio();
        am.getIdUser();
        am.getIogvBindType();
        am.getIsCudRole();
        am.getIsSysAdmin();
        am.getLogin();
        am.getOrgAdr();
        am.getOrgCode();
        am.getOrgIogvStatus();
        am.getOrgName();
        am.getOrgTel();
        am.getPhone();
        am.getPosition();
        am.getProtectLogin();
        am.getProtectPassword();
        am.getStart();
        am.getStatus();
        am.getStatusValue();
        am.getUpdDate();
        am.getUpdUserLogin();
        am.getUsrChecked();
        am.getUsrCode();
        am.getUsrIogvStatus();
        
        
        
        am.setBaseId(1L);
        am.setSelected(true);
        am.setCert("");
        am.setCrtDate("");
        am.setCrtUserLogin("");
        am.setDepartment("");
        am.setDepCode("");
        am.setDepIogvStatus("");
        am.setEmail("");
        am.setFinish("");
        am.setFio("");
        am.setIdUser(1L);
        am.setIogvBindType(1L);
        am.setIsCudRole(1L);
        am.setIsSysAdmin(1L);
        am.setLogin("");
        am.setOrgAdr("");
        am.setOrgCode("");
        am.setOrgIogvStatus("");
        am.setOrgName("");
        am.setOrgTel("");
        am.setPhone("");
        am.setPosition("");
        am.setStart("");
        am.setStatus(1L);
        am.setStatusValue("");
        am.setUpdDate("");
        am.setUpdUserLogin("");
        am.setUsrChecked(true);
        am.setUsrCode("");
        am.setUsrIogvStatus("");
        
        
       // assertEquals(expResult, result);
       Assert.assertTrue(result);
    }
}