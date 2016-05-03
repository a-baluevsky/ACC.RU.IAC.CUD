package iac.grn.infosweb.session;



import iac.cud.authmodule.dataitem.AuthItem;
import iac.cud.authmodule.dataitem.PageItem;
import iac.cud.authmodule.session.AutzManagerLocal;
import iac.cud.authmodule.session.CUDAuthManagerLocal;
import iac.cud.infosweb.dataitems.UserItem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URLEncoder;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.namespace.QName;

import org.apache.xml.security.encryption.EncryptedData;
import org.apache.xml.security.encryption.EncryptedKey;
import org.apache.xml.security.encryption.XMLCipher;
import org.apache.xml.security.encryption.XMLEncryptionException;
import org.apache.xml.security.transforms.Transforms;
import org.picketlink.common.constants.GeneralConstants;
import org.picketlink.common.constants.JBossSAMLConstants;
import org.picketlink.common.constants.JBossSAMLURIConstants;
import org.picketlink.common.util.Base64;
import org.picketlink.common.util.StaxParserUtil;
import org.picketlink.common.util.StringUtil;
import org.picketlink.identity.federation.api.saml.v2.request.SAML2Request;
import org.picketlink.identity.federation.api.saml.v2.response.SAML2Response;
import org.picketlink.identity.federation.api.saml.v2.sig.SAML2Signature;
import org.picketlink.identity.federation.core.parsers.saml.SAMLParser;
import org.picketlink.identity.federation.core.saml.v2.util.AssertionUtil;
import org.picketlink.identity.federation.core.saml.v2.util.DocumentUtil;
import org.picketlink.identity.federation.core.util.JAXPValidationUtil;
import org.picketlink.identity.federation.saml.v2.assertion.AssertionType;
import org.picketlink.identity.federation.saml.v2.assertion.AttributeStatementType;
import org.picketlink.identity.federation.saml.v2.assertion.AttributeStatementType.ASTChoiceType;
import org.picketlink.identity.federation.saml.v2.assertion.AttributeType;
import org.picketlink.identity.federation.saml.v2.assertion.NameIDType;
import org.picketlink.identity.federation.saml.v2.assertion.StatementAbstractType;
import org.picketlink.identity.federation.saml.v2.assertion.SubjectType;
import org.picketlink.identity.federation.saml.v2.assertion.SubjectType.STSubType;
import org.picketlink.identity.federation.saml.v2.protocol.AuthnRequestType;
import org.picketlink.identity.federation.saml.v2.protocol.LogoutRequestType;
import org.picketlink.identity.federation.saml.v2.protocol.ResponseType;
import org.picketlink.identity.federation.web.util.PostBindingUtil;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.CryptoPro.JCPxml.xmldsig.JCPXMLDSigInit;
import ru.spb.iac.crypto.export.Crypto15Init;
//import ru.spb.iac.crypto.export.Crypto15Init;
/**
 * Управляющий бин, ответственный за аутентификацию пользователей и 
 * проверку прав доступа к требуемым ресурсам
 * @author bubnov
 *
 */

 public class Authenticator
{
	
	private static final String auth_type_x509 = "urn:oasis:names:tc:SAML:2.0:ac:classes:X509";
	
   
    final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Authenticator.class);
    
    static String SamlRequestLogin="/opt/toris/data/saml/oauth_saml_request_post.xml";
    static String SamlRequestLogout="/opt/toris/data/saml/oauth_saml_request_logout_post.xml";
    

    @Context HttpServletRequest httpServletRequest;
    
    @Context HttpServletResponse httpServletResponse;
    
    public static final String ROLE_SYS_ADMIN_CUD = "role:urn:sys_admin_cud";
    
    public static final String CIPHER_DATA_LOCALNAME = "CipherData";

    public static final String ENCRYPTED_KEY_LOCALNAME = "EncryptedKey";

    public static final String DS_KEY_INFO = "ds:KeyInfo";

    public static final String XMLNS = "http://www.w3.org/2000/xmlns/";

    public static String XMLSIG_NS = "http://www.w3.org/2000/09/xmldsig#";

    public static String XMLENC_NS = "http://www.w3.org/2001/04/xmlenc#";
    
    private static final String CIPHER_ALG = "GOST28147/CFB/NoPadding";
    
    private static final String CIPHER_ALG_TRANSPORT = "GostTransport";
    
    private boolean flagOBO = false;
    
    private int resultAuthOBO = 0;
    
    private Document assertionOBO = null;
    
    private static PublicKey publicKey = null;
    
    private static PrivateKey privateKey = null;
    
    private static boolean isSignRequired = true;
   
   public void cudAuth(HttpServletRequest request, HttpServletResponse response) throws Exception{
	   
	  char[] signingKeyPass="Access_Control".toCharArray();
		String signingAlias="cudvm_export";
		 
		System.out.println("authenticator:cudAuth:001");
   	try{
   	 LOGGER.debug("authenticator:cudAuth:01_new");
   	 
     LOGGER.debug("authenticator:cudAuth:01_logger");
   	
   		
   	 
   	 String destination = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/cudidp/loginEncrypt";
   
   	 String assertionConsumerServiceURL = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/picketlink-oauth-provider-wwwserver/auth/login_response?"+request.getQueryString();
   	 
   	 LOGGER.debug("authenticator:cudAuth:01+:"+request.getContextPath());
   	
   	 LOGGER.debug("authenticator:cudAuth:011+:"+request.getQueryString());
   	 
   	 updateCertKeys(signingAlias, signingKeyPass);

   	Document samlDocument = get_saml_assertion_from_xml(assertionConsumerServiceURL, privateKey, publicKey);
   	 
    Node nextSibling = getNextSiblingOfIssuer(samlDocument);
	 
	 
	  Provider xmlDSigProvider = new ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI();
	  
	   XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM", xmlDSigProvider);

	 
	 //используется когда подписывается какой-то узел в документе
	  //извдекается этот узел, создаётся пустой документ, в него помещается этот узел
	  // и через propagateIDAttributeSetup из узла, который надо подписать в новый переносятся id  
	 //   propaga/teIDAttributeSetup/
	 	
	    List<Transform> transformList = new ArrayList<Transform>();
		Transform transform = fac.newTransform(Transform.ENVELOPED, (XMLStructure) null);
		Transform transformC14N = fac.newTransform(Transforms.TRANSFORM_C14N_EXCL_OMIT_COMMENTS, (XMLStructure) null);
		transformList.add(transform);
		transformList.add(transformC14N);
		
		 String id = samlDocument.getDocumentElement().getAttribute("ID");
		 String referenceURI = "#" + id;
		 
		 Reference ref1 = fac.newReference(referenceURI, fac.newDigestMethod("http://www.w3.org/2001/04/xmldsig-more#gostr3411", null) 
	        		,transformList, null, null);
	      List<Reference> referenceList = new ArrayList<Reference>();
	        
	        referenceList.add(ref1);
	        
	        SignedInfo si = fac.newSignedInfo( fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE,
					 								(C14NMethodParameterSpec) null),
					 						   fac.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", null),
					 						  referenceList);

			KeyInfoFactory kif = fac.getKeyInfoFactory();
			
			KeyValue kv = kif.newKeyValue(publicKey);
			KeyInfo ki = kif.newKeyInfo(Collections.singletonList(kv));
			
					
			
	  	    javax.xml.crypto.dsig.XMLSignature sig = fac.newXMLSignature(si, ki);
//!!!
	  	  
	  	  configureIdAttribute(samlDocument);
	  	  
	  	
			//куда вставлять подпись
	  	    //nextSibling - перед ним будет вставлена подпись
	  	    //nextSibling для <saml:Issuer> - это <samlp:NameIDPolicy>
	  	    //и Signature будет между <saml:Issuer> и <samlp:NameIDPolicy>
			DOMSignContext signContext = new DOMSignContext(privateKey, samlDocument.getDocumentElement(), nextSibling); 
			
			signContext.putNamespacePrefix(XMLSignature.XMLNS, "dsig");
			
			//фиксация аттрибута id в подписываемом элементе
			//место ответственное за факт появления Pre-digested input в логе
		
		// вместо этого используется configureIdAttribute	
		
		
			    
	    sig.sign(signContext);
	
	 
	  
	    
	      
	 byte[] responseBytes = DocumentUtil.getDocumentAsString(samlDocument).getBytes("UTF-8");

	
	 String samlRequest=Base64.encodeBytes(responseBytes, Base64.DONT_BREAK_LINES);
	 
	 
   
   	 
	 sendPost(samlRequest, destination, response);
	 
	 
	 
   	}catch(Exception e){
   	 LOGGER.error("authenticator:cudAuth:error:"+e);
    	  throw e;
   	}
    }
 
   public void cudLogout(String login) throws Exception{
	   
		  char[] signingKeyPass="Access_Control".toCharArray();
			String signingAlias="cudvm_export";
			 
	   	try{
	   	 LOGGER.debug("authenticator:cudLogout:01");
	  	 
	   	 HttpServletResponse response = httpServletResponse;
	   	 HttpServletRequest request = httpServletRequest;  	
	   	 
	   	 String destination = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/cudidp/logout";
	   
	   	 String logoutBackUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/infoscud/";
	   	 
	   	 LOGGER.debug("authenticator:cudLogout:02:"+destination);
	   	 LOGGER.debug("authenticator:cudLogout:03:"+logoutBackUrl);
	   	
	 
	   	updateCertKeys(signingAlias, signingKeyPass);
	   	Document samlDocument = get_saml_logout_from_xml(logoutBackUrl, login);
	   	
	   	LOGGER.debug("authenticator:cudLogout:04:"+DocumentUtil.asString(samlDocument));
	   	
	    Node nextSibling = getNextSiblingOfIssuer(samlDocument);
		 
		 
		  Provider xmlDSigProvider = new ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI();
		  
		  
		   XMLSignatureFactory facLogout = XMLSignatureFactory.getInstance("DOM", xmlDSigProvider);

		 
		 //используется когда подписывается какой-то узел в документе
		  //извдекается этот узел, создаётся пустой документ, в него помещается этот узел
		  // и через propagateIDAttributeSetupиз узла, который надо подписать в новый переносятся id  
		 //   /propagateIDAttributeSetup
		 	
		    List<Transform> transformList = new ArrayList<Transform>();
			Transform transform = facLogout.newTransform(Transform.ENVELOPED, (XMLStructure) null);
			Transform transformC14N = facLogout.newTransform(Transforms.TRANSFORM_C14N_EXCL_OMIT_COMMENTS, (XMLStructure) null);
			transformList.add(transform);
			transformList.add(transformC14N);
			
			 String id = samlDocument.getDocumentElement().getAttribute("ID");
			 String referenceURI = "#" + id;
			 
			 Reference ref1 = facLogout.newReference(referenceURI, facLogout.newDigestMethod("http://www.w3.org/2001/04/xmldsig-more#gostr3411", null) 
		        		,transformList, null, null);
		      List<Reference> referenceList = new ArrayList<Reference>();
		        
		        referenceList.add(ref1);
		        
		        SignedInfo si = facLogout.newSignedInfo( facLogout.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE,
						 								(C14NMethodParameterSpec) null),
						 						   facLogout.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411", null),
						 						  referenceList);

				KeyInfoFactory kif = facLogout.getKeyInfoFactory();
				
				KeyValue kv = kif.newKeyValue(publicKey);
				KeyInfo ki = kif.newKeyInfo(Collections.singletonList(kv));
				
						
				
		  	    javax.xml.crypto.dsig.XMLSignature sig = facLogout.newXMLSignature(si, ki);
	//!!!
		  	  
		  	  configureIdAttribute(samlDocument);
		  	  
		  	
				//куда вставлять подпись
		  	    //nextSibling - перед ним будет вставлена подпись
		  	    //nextSibling для <saml:Issuer> - это <samlp:NameIDPolicy>
		  	    //и Signature будет между <saml:Issuer> и <samlp:NameIDPolicy>
				DOMSignContext signContext = new DOMSignContext(privateKey, samlDocument.getDocumentElement(), nextSibling); 
				
				signContext.putNamespacePrefix(XMLSignature.XMLNS, "dsig");
				
				//фиксация аттрибута id в подписываемом элементе
				//место ответственное за факт появления Pre-digested input в логе
			
			// вместо этого используется configureIdAttribute	
			
				    
		    sig.sign(signContext);
		
		    LOGGER.debug("authenticator:cudLogout:05:"+DocumentUtil.asString(samlDocument));
		  
		    
		      
		 byte[] responseBytesLogout = DocumentUtil.getDocumentAsString(samlDocument).getBytes("UTF-8");

		 String samlRequest=Base64.encodeBytes(responseBytesLogout, Base64.DONT_BREAK_LINES);
		 
		 
	   
		 LOGGER.debug("authenticator:cudLogout:06");
		 
		 sendPost(samlRequest, destination, response);
		 
		 LOGGER.debug("authenticator:cudLogout:07");
		 
		 
		 
	   	}catch(Exception eLogout){
	   	 LOGGER.error("authenticator:cudLogout:error:"+eLogout);
	   	  throw eLogout;
	   	}
	    }
   
  
   private static Document get_saml_assertion_from_xml(String assertionConsumerServiceURL, PrivateKey privateKeyClient, PublicKey publicKeyCUD){
		
		 Document result = null;
		 InputStream samlAssertionInputStream = null;	
			try{
			
			 LOGGER.debug("get_saml_assertion_from_xml:01");
			 
			   samlAssertionInputStream = new FileInputStream(SamlRequestLogin);
				  
			   
			  
			   
		        SAMLParser samlParser = new SAMLParser();
		        
		        
		        
		        Object parsedObject = samlParser.parse(samlAssertionInputStream);

		       
		        
		        // cast the parsed object to the expected type, in this case AssertionType
		        AuthnRequestType authn = (AuthnRequestType) parsedObject;
		        
		       
		        
		        //!!! важная установка
		        authn.setAssertionConsumerServiceURL(new URI(assertionConsumerServiceURL));
		        
		        
		        //external passive auth
		        String samlDestination = getSAMLDestination(privateKeyClient, publicKeyCUD);
		        
		        authn.setDestination(URI.create(samlDestination));		        
		        
		        SAML2Request  sr = new SAML2Request();
		        
		       Document docAuthn = sr.convert(authn);
		     
		      
		       result = docAuthn;
		        
		      
			  		      
		  }catch(Exception e3){
				 LOGGER.error("get_saml_assertion_from_xml:error:"+e3);
		  }finally{
			  try{
				  if(samlAssertionInputStream!=null){
					  samlAssertionInputStream.close();
				  }
			  }catch(Exception e){
				  
			  }
		  }
			return result;
		}
   
   private static Document get_saml_logout_from_xml(String logoutBackUrl, String login){
		
		 Document result = null;
		 InputStream samlAssertionInputStream = null;	
		
			try{
			
			 LOGGER.debug("get_saml_logout_from_xml:01");
			 
			   samlAssertionInputStream = new FileInputStream(SamlRequestLogout);

		       SAMLParser samlParser = new SAMLParser();
		        
		        
		        
		        Object parsedObject = samlParser.parse(samlAssertionInputStream);

		       
		           
		        LogoutRequestType logout = (LogoutRequestType) parsedObject;
		        
		       
		        String samlDestination = logout.getDestination().toString()
		        		                 + "?logoutBackUrl="+URLEncoder.encode(logoutBackUrl, "utf-8");
		        
		        logout.setDestination(URI.create(samlDestination));		        
		        
		        NameIDType nameID = new NameIDType();
		        	
		        
		        nameID.setValue(login);
		        
		        logout.setNameID(nameID);
		        
		        SAML2Request  sr = new SAML2Request();
		        
		       Document docAuthnLogout = sr.convert(logout);
		     
		      
		       result = docAuthnLogout;
		        
		      
			  		      
		  }catch(Exception er){
				 LOGGER.error("get_saml_logout_from_xml:error:"+er);
		  }finally{
			  try{
				  if(samlAssertionInputStream!=null){
					  samlAssertionInputStream.close();
				  }
			  }catch(Exception err){
				  LOGGER.error("get_saml_logout_from_xml:error:"+err);
			  }
		  }
			return result;
		}
   
   public static Node getNextSiblingOfIssuer(Document doc) {
       
		 
				  
		    NodeList nl = doc.getElementsByTagNameNS(JBossSAMLURIConstants.ASSERTION_NSURI.get(), JBossSAMLConstants.ISSUER.get());
		   // "urn:oasis:names:tc:SAML:2.0:assertion", "Issuer"
	        if (nl.getLength() > 0) {
	            Node issuer = nl.item(0);

	           
	            return issuer.getNextSibling();
	        }
	        return null;
	    }

   private static void configureIdAttribute(Document document) {
      // Estabilish the IDness of the ID attribute.
       document.getDocumentElement().setIdAttribute("ID", true);

       NodeList nodes = document.getElementsByTagNameNS(JBossSAMLURIConstants.ASSERTION_NSURI.get(),
               JBossSAMLConstants.ASSERTION.get());

       for (int i = 0; i < nodes.getLength(); i++) {
           Node n = nodes.item(i);
           if (n instanceof Element) {
               ((Element) n).setIdAttribute("ID", true);
           }
       }
   }
   
    
    
    public String localLogout(){
    	
       LOGGER.debug("localLogout:01");
       
       
      try{
    	  cudLogout((String)httpServletRequest.getSession().getAttribute("user_login"));
    	   /*
    	   if(Identity.instance().isLoggedIn()){
    	   
		    	   Identity.instance().logout();
		  	 
		 	       LOGGER.debug("localLogout:02_2:"+currentUser.getLogin());
		 	  
		    	   cudLogout(currentUser.getLogin());
		    	   
		   	   	 
		    	  
		    	  // пока закомментировал, ещё не решил, будет ли такой  logout.
		    		  
		    	   LOGGER.debug("localLogout:03");
    	   
    	   }*/
    	   
       }catch(Exception e){
    	   LOGGER.error("localLogoutError:"+e);
       }
       
       return "loggedOut";
    }
    
 
    public void sendPost(String samlMessage, String destination, HttpServletResponse response) throws Exception {
       
    	try{
    	LOGGER.debug("Authenticator:sendPost:01");
    	 
    	 
    	String key = GeneralConstants.SAML_REQUEST_KEY ;
    	
        if (destination == null) {
        	LOGGER.error("Authenticator:sendPost:Destination is null");
            throw new Exception("Authenticator:sendPost:Destination is null");
        }
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        common(response);
        StringBuilder builder = new StringBuilder();

        builder.append("<HTML>");
        builder.append("<HEAD>");
        
        builder.append("<TITLE>HTTP Post Binding (Request)</TITLE>");
       
        builder.append("</HEAD>");
        builder.append("<BODY Onload=\"document.forms[0].submit()\">");

        builder.append("<FORM METHOD=\"POST\" ACTION=\"" + destination + "\">");
        builder.append("<INPUT TYPE=\"HIDDEN\" NAME=\"" + key + "\"" + " VALUE=\"" + samlMessage + "\"/>");
       
     
     
        
        builder.append("<NOSCRIPT>");
        builder.append("<P>JavaScript is disabled. We strongly recommend to enable it. Click the button below to continue.</P>");
        builder.append("<INPUT TYPE=\"SUBMIT\" VALUE=\"CONTINUE\" />");
        builder.append("</NOSCRIPT>");

        builder.append("</FORM></BODY></HTML>");
        
        String str = builder.toString();
       
        
      
        
        out.println(str);
	    out.close();
	    
	    LOGGER.debug("Authenticator:sendPost:03");
	    
       
        
    	}catch(Exception e){
    		LOGGER.error("Authenticator:sendPost:error:"+e);
        	}
    }

    private static void common(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache, no-store");
    } 
    
    private static String[] login_password_encrypt(String login, String password, PrivateKey privateKeyClient, PublicKey publicKeyCUD) {
		
        String[] result = null;   
		try{
		
		  //шифрование
		  final byte[] data_pass = password.getBytes("utf-8");
		  byte[] data_login = null;
			
		  if(login!=null){
			  data_login = login.getBytes("utf-8");
		  }
		  
		  SecretKey secretKey = KeyGenerator.getInstance("GOST28147").generateKey();
		 
		  Cipher cipher = Cipher.getInstance(CIPHER_ALG);
	      cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	      final byte[] iv = cipher.getIV();
	    
	      final byte[] encryptedtext_pass = cipher.doFinal(data_pass, 0, data_pass.length);
	      byte[] encryptedtext_login = null;
	      
	      if(login!=null){
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(iv));
	        encryptedtext_login = cipher.doFinal(data_login, 0, data_login.length);
	      }
	      
	 	  Cipher wrapCipher = Cipher.getInstance(CIPHER_ALG_TRANSPORT);
		  wrapCipher.init(Cipher.WRAP_MODE, publicKeyCUD);
		  byte[] wrappedSecretKey = wrapCipher.wrap(secretKey);
		 
		  
		  result = new String[4]; 
		  
		 // org.apache.commons.codec.binary.Base64
		  String passwordEncryptBase64 = Base64.encodeBytes(encryptedtext_pass, Base64.DONT_BREAK_LINES);
		  String loginEncryptBase64 = null;
		  if(login!=null){
		    loginEncryptBase64 = Base64.encodeBytes(encryptedtext_login, Base64.DONT_BREAK_LINES);
		  }	 
		  
		  String secretKeyBase64 = Base64.encodeBytes(wrappedSecretKey, Base64.DONT_BREAK_LINES);
		  String ivBase64 = Base64.encodeBytes(iv, Base64.DONT_BREAK_LINES);
		  		
		  result[0]=passwordEncryptBase64;
		  result[1]=loginEncryptBase64;
		  result[2]=secretKeyBase64;
		  result[3]=ivBase64;
		  
		  LOGGER.debug("passwordEncryptBase64:"+passwordEncryptBase64);
		  LOGGER.debug("loginEncryptBase64:"+loginEncryptBase64);
		  LOGGER.debug("secretKeyBase64:"+secretKeyBase64);
		  LOGGER.debug("ivBase64:"+ivBase64);
	       
		  
		//расшифровка
		
		  
		}catch(Exception e){
			LOGGER.error("error:"+e);
		}
		return result;
	}
   private static String getSAMLDestination(PrivateKey privateKeyClient, PublicKey publicKeyCUD) {
		
        String result = null;   
		try{
			LOGGER.debug("getSAMLDestination:01");
 
			String login_key = "login";
	         String password_encrypt_key = "epassword";
	        String secret_key_key = "skey";
	        String initialization_vector_key = "ivector";
	        String login = "les";
	        String password = "les";
	    	
	        String passwordEncryptBase64 = null;
	       String secretKeyBase64 = null;
			String ivBase64 = null;
			
			final int encrypt_data_length = 4;
			  
	        String[] encrypt_data = login_password_encrypt(null, password, privateKeyClient, publicKeyCUD);
	        
	        if(encrypt_data!=null&&encrypt_data.length==encrypt_data_length){
	            passwordEncryptBase64 = encrypt_data[0];
	            
	            secretKeyBase64 = encrypt_data[2];
	            ivBase64 = encrypt_data[3];
	        }
	       
	       if(	passwordEncryptBase64==null || 
	    		secretKeyBase64==null || 
	    		ivBase64==null ) {
	    	   throw new IllegalArgumentException("passwordEncryptBase64, secretKeyBase64, ivBase64 can't be null!");
	       }
	    	   
	        
	       result="?"+login_key+"="+URLEncoder.encode(login, "UTF-8")
	        	   + "&"+password_encrypt_key+"="+URLEncoder.encode(passwordEncryptBase64, "UTF-8")
	        	   + "&"+secret_key_key+"="+URLEncoder.encode(secretKeyBase64, "UTF-8")
	        	   + "&"+initialization_vector_key+"="+URLEncoder.encode(ivBase64, "UTF-8");
	       		
	    	//resu/lt=/"?tokenId="
	     	//	+ "MV8xNDEyNjY5MzcyMDg4X3VybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphYzpjbGFzc2VzOnBhc3N3b3JkX3NnR21Gemt5T1JJOXd4TjY2Ynl2aGMvTFBpNlRpL0tWblo1NmVsVG9LbmljV2RWQUxEU0dqbUNWSUxFdmtDV0FXcm8xV0xlaDd1ZkR0MmE0RWlVbmVBPT0=";
	   
		}catch(Exception e){
			LOGGER.error("getSAMLDestination:error:"+e);
		}
		return result;
	}
    
	 private AssertionType decrypt(Document doc, PrivateKey privateKey){
		 AssertionType result = null;
		 try{
			 
			 LOGGER.debug("decrypt:01");
			 
			 Element enc = DocumentUtil.getElement(doc, new QName(JBossSAMLConstants.ENCRYPTED_ASSERTION.get()));
		        if (enc == null){
		        	 throw new Exception("Cannot find ENCRYPTED_ASSERTION element");
		        }
		       Document newDoc = DocumentUtil.createDocument();
		        Node importedNode = newDoc.importNode(enc, true);
		        newDoc.appendChild(importedNode);

		        Element decryptedDocumentElement = decryptElementInDocument(newDoc, privateKey);
			        
		        
		        
		        SAMLParser parser = new SAMLParser();

		        JAXPValidationUtil.checkSchemaValidation(decryptedDocumentElement);
		        AssertionType assertion = (AssertionType)parser.parse(StaxParserUtil.getXMLEventReader(DocumentUtil.getNodeAsStream(decryptedDocumentElement)));

		        result=assertion;
		        
		        Document assDoc = AssertionUtil.asDocument(assertion);
		        
		       LOGGER.debug("Authenticator:decrypt:03:"+DocumentUtil.asString(assDoc));
		        
		  	 
			 
		 }catch(Exception e3){
			 LOGGER.error("decrypt:error:"+e3);
	     }
		return result;
	 }
	 
	 
	 public static Element decryptElementInDocument(Document documentWithEncryptedElement, PrivateKey privateKey)
	            throws Exception {
		  
		  LOGGER.debug("decryptElementInDocument:01");
			
		  if(!org.apache.xml.security.Init.isInitialized()){
		    org.apache.xml.security.Init.init();
		  }
		  if(!JCPXMLDSigInit.isInitialized()) {
			LOGGER.debug("GostXMLEncryptionUtil:static:02+");
		  //  JCPX/MLDSigInit/.init(/);
			 Crypto15Init.fileInit();
		    LOGGER.debug("GostXMLEncryptionUtil:static:03");
		  }
		  
	        if (documentWithEncryptedElement == null) {
				throw new Exception("Input document is null");
			}

	        // Look for encrypted data element
	        Element documentRoot = documentWithEncryptedElement.getDocumentElement();
	        Element encDataElement =  (Element) documentRoot.getFirstChild();
	        if (encDataElement == null) {
				throw new Exception("No element representing the encrypted data found");
			}

	       
	        
	        // Look at siblings for the key
	        Element encKeyElement = getNextElementNode(encDataElement.getNextSibling());
	        if (encKeyElement == null) {
	        	
	        	 
	            // Search the enc data element for enc key
	            NodeList nodeList = encDataElement.getElementsByTagNameNS(XMLENC_NS, ENCRYPTED_KEY_LOCALNAME);

	            if (nodeList == null || nodeList.getLength() == 0) {
					throw new Exception("Encrypted Key not found in the enc data");
				}

	            encKeyElement = (Element) nodeList.item(0);
	        }

	        
	        
	        XMLCipher cipher;
	        EncryptedData encryptedData;
	        EncryptedKey encryptedKey;
	        try {
	         	
	            cipher = XMLCipher.getInstance();
	            cipher.init(XMLCipher.DECRYPT_MODE, null);
	            encryptedData = cipher.loadEncryptedData(documentWithEncryptedElement, encDataElement);
	            encryptedKey = cipher.loadEncryptedKey(documentWithEncryptedElement, encKeyElement);
	            
	        } catch (XMLEncryptionException e1) {
	        	throw new Exception(e1);
	        }

	        if (encryptedData != null && encryptedKey != null) {
                String encAlgoURL = encryptedData.getEncryptionMethod().getAlgorithm();
                XMLCipher keyCipher = XMLCipher.getInstance();
                keyCipher.init(XMLCipher.UNWRAP_MODE, privateKey);
                Key encryptionKey = keyCipher.decryptKey(encryptedKey, encAlgoURL);
                cipher = XMLCipher.getInstance();
                cipher.init(XMLCipher.DECRYPT_MODE, encryptionKey);

                Document decryptedDoc = cipher.doFinal(documentWithEncryptedElement, encDataElement);
		        Element decryptedRoot = decryptedDoc.getDocumentElement();
		        //<saml:EncryptedAssertion xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"><saml:Assertion...
		        Element dataElement = (Element)decryptedRoot.getFirstChild();
		        //<saml:Assertion...
		        if (dataElement == null) {
					throw new Exception("Data Element after encryption is null");
				}
		        decryptedRoot.removeChild(dataElement);
		        decryptedDoc.replaceChild(dataElement, decryptedRoot);
	         // заменяем <saml:EncryptedAssertion (decryptedRoot) на <saml:Assertion (dataElement)		    	        
		        return decryptedDoc.getDocumentElement();
	        } else	       
	        	throw new Exception("Encrypted Data and Encrypted Key must be present");
	    }
	 
	 private static Element getNextElementNode(Node node) {
		 
	        while (node != null) {
	        	 
	            if (Node.ELEMENT_NODE == node.getNodeType()){
	            	 
	                return (Element) node;}
	            node = node.getNextSibling();
	        }
	        return null;
	    }
	
	 private boolean assValid(Element signedDoc, PublicKey publicKey){
		 
		 boolean result = false;
		 try{
			    SAML2Signature samlSignature = new GOSTSAML2Signature();
		        samlSignature.setSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411");
				samlSignature.setDigestMethod("http://www.w3.org/2001/04/xmldsig-more#gostr3411");
			
				
			    Document doc = DocumentUtil.createDocument();
		        Node n = doc.importNode( signedDoc, true);
		        doc.appendChild(n);

		        result = samlSignature.validate(doc, publicKey);
		        
		 }catch(Exception e){
			 LOGGER.error("Authenticator:assValid:error:"+e);
		 }
		 return result;
	 }
	 
	 private static Document get_saml_assertion_from_response (String pSAMLResponse){
			
		 Document result = null;
		 InputStream dataStream = null;	
		 
			try{
	
				 LOGGER.debug("get_saml_assertion_from_xml:01");
			 
			 
			 dataStream = PostBindingUtil.base64DecodeAsStream(pSAMLResponse);
			
			     SAMLParser samlParser = new SAMLParser();

		        Object parsedObject = samlParser.parse(dataStream);

		        // cast the parsed object to the expected type, in this case AssertionType
		        ResponseType authn = (ResponseType) parsedObject;

		         SAML2Response sr = new SAML2Response();
		        
		       Document docAuthn = sr.convert(authn);
		        
		       result = docAuthn;
		        
		       
			  		      
		  }catch(Exception e3){
				 LOGGER.error("get_saml_assertion_from_xml:error:"+e3);
		  }finally{
			  try{
				  if(dataStream!=null){
					  dataStream.close();
				  }
			  }catch(Exception e){
				  LOGGER.error("get_saml_assertion_from_xml:dataStream.close:error:"+e);
			  }
		  }
			return result;
		}
	 
	 private List<String> getRoles(AttributeStatementType attributeStatement, Map<String, String> userAttrib) throws Exception {
        
		 LOGGER.debug("Authenticator:getRoles:01");
		 
		 List<String> roles = new ArrayList<String>();

        
         // PLFED-140: which of the attribute statements represent roles?
         List<String> roleKeys = new ArrayList<String>();

         
         String roleKey = "USER_ROLES";
         roleKeys.addAll(StringUtil.tokenize(roleKey));
          
         List<ASTChoiceType> attList = attributeStatement.getAttributes();
         for (ASTChoiceType obj : attList) {
             AttributeType attr = obj.getAttribute();
             
             
             
             if (!roleKeys.contains(attr.getName())){
                //аттрибут
            	 List<Object> attributeValues = attr.getAttributeValue();
                 if (attributeValues != null) {
                     for (Object attrValue : attributeValues) {
                    	 
                    	 if (attrValue instanceof String) {
                        	 
                             userAttrib.put(attr.getName(), (String) attrValue);
                         } else {
							throw new Exception(attrValue.toString());
						}
                     }
                 }
             }else{
            	 //роли
             List<Object> attributeValues = attr.getAttributeValue();
             if (attributeValues != null) {
                 for (Object attrValue : attributeValues) {
                	 
                	 
                	 
                     if (attrValue instanceof String) {
                    	 
                         roles.add((String) attrValue);
                     } else {
						throw new Exception(attrValue.toString());
					}
                 }
             }
           }
         }
         return roles;
     }
	 
	
	  public int getResultAuthOBO() {
		return resultAuthOBO;
	}
	public void setResultAuthOBO(int resultAuthOBO) {
		this.resultAuthOBO = resultAuthOBO;
	}
	
	 private static void updateCertKeys(String signingAlias, char[] signingKeyPass) 
			   throws KeyStoreException, NoSuchProviderException, NoSuchAlgorithmException, 
			   			CertificateException, IOException, UnrecoverableKeyException 
	   {
		  if(publicKey==null) {
			    KeyStore ks  = KeyStore.getInstance("HDImageStore", "JCP");
				ks.load(null, null);			
				 privateKey = (PrivateKey)ks.getKey(signingAlias, signingKeyPass);		
				 publicKey = ks.getCertificate("cudvm_export").getPublicKey();		  
		  }	   
	   }
	   
	 
	 
	 
	 public boolean authenticate(HttpServletRequest request, String pSAMLResponse)
	   {
		   
		   LOGGER.debug("authenticator:authenticate:01");
		   
		   char[] signingKeyPass="Access_Control".toCharArray();
			 String signingAlias="cudvm_export";
			 
		   try{
			   
			
			   LOGGER.debug("authenticator:authenticate:02_2");
			  
			  	updateCertKeys(signingAlias, signingKeyPass);;
				Document  samlDocument;
				AssertionType ass;
				
				LOGGER.debug("authenticator:authenticate:02_3");
				
					//обычная аутентификация
					
					//на самом деле samlDocument -это <samlp:Response>, а не Assertion
					samlDocument= get_saml_assertion_from_response(pSAMLResponse); 	
					
					//сначала можно проверять сигнатуру
					//т.к. idp сначала шифрует, потом подписывает
					//кодируется только assertion
					//декодируем лишь для извлечения assertion
					ass = decrypt(samlDocument, privateKey);
					
					LOGGER.debug("authenticator:authenticate:01_2");
					
					Document assDoc = AssertionUtil.asDocument(ass);
					
					//проверка сигнатуры Assertion
					boolean assValid = assValid(assDoc.getDocumentElement(), publicKey);
					
					LOGGER.debug("authenticator:authenticate:01_3:"+assValid);
					
					if(assValid==false){
			    		  throw new Exception("Signature Assertion is not valid!!!");
			    	 }
	
				
				
				
			if(isSignRequired){	
				
				//проверка сигнатуры
				
				 Provider xmlDSigProvider = new ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI();
			   	  
		    	 XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM", xmlDSigProvider);
		        	
		    	 LOGGER.debug("test1:01_1");
		    	 
		    	 configureIdAttribute(samlDocument);
		    	 
		    	 
		       NodeList nl = samlDocument.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
		         if (nl == null || nl.getLength() == 0) {
		        	 throw new Exception("Cannot find Signature element");
		         }
		    	 
		    		 
		    	 Node signatureNode1 = nl.item(0);
		    		 
		    	 LOGGER.debug("SignValidateSOAPHandler:handleMessage:07_3");
		    	 
		         //signature
		    	 
		    	 if(signatureNode1==null){
		    		 LOGGER.debug("SignValidateSOAPHandler:handleMessage:08");
		    	        throw new Exception("This service requires <dsig:Signature>, which is missing!!!");
		    	 }

		    	 LOGGER.debug("SignValidateSOAPHandler:handleMessage:09:"+signatureNode1.getNodeName());
		     
		         DOMValidateContext valContext1 = new DOMValidateContext(publicKey, signatureNode1);
		        
		        
		    	 javax.xml.crypto.dsig.XMLSignature signature1 = fac.unmarshalXMLSignature(valContext1);
		         
		    	  boolean result1 = signature1.validate(valContext1);
		    			 
		    	  LOGGER.debug("SignValidateSOAPHandler:010+:"+result1);
				
		    	  if(result1==false){
		    		  throw new Exception("Signature is not valid!!!");
		    	  }
		    	  
		       }  
		    	  
				//разбор пришедшего токена
		    	boolean  expiredAssertion = AssertionUtil.hasExpired(ass);
				
		    	 LOGGER.debug("expiredAssertion:"+expiredAssertion);
		    
		    	 if(expiredAssertion){
		    		  throw new Exception("expiredAssertion!!!");
		    	  }
		    	
		    	
		    	 SubjectType subject = ass.getSubject();
		          
		    	 if (subject == null) {
					throw new Exception("Subject in the assertion");
				}

		            STSubType subType = subject.getSubType();
		            if (subType == null) {
						throw new Exception("Unable to find subtype via subject");
					}
		            NameIDType nameID = (NameIDType) subType.getBaseID();

		            if (nameID == null) {
						throw  new Exception("Unable to find username via subject");
					}

		            final String userName = nameID.getValue();
		            
		            LOGGER.debug("userName:"+userName);
		            
		            
		            List<String> roles = new ArrayList<String>();
		            Map<String, String> userAttrib = new HashMap<String, String>(); 
		            
		            
		            Set<StatementAbstractType> statements = ass.getStatements();
		            for (StatementAbstractType statement : statements) {
		                if (statement instanceof AttributeStatementType) {
		                    AttributeStatementType attributeStatement = (AttributeStatementType) statement;
		                    roles.addAll(getRoles(attributeStatement, userAttrib));
		                }
		            }

		            LOGGER.debug("Authenticator:70");
		    	
		          
		
			
			  
			  if(roles.isEmpty()){
				  LOGGER.debug("authenticator:authenticate:03");
					  return false;
			  }
			
			  List<String> roleStList = roles;
			  List<String> rolesInfoList = roles;
					  
				  
			  String fio = null, org =null, tel = null, email = null, 
					 login = null, orgIOGVCode=null, uid = null;
			 
			  
			  fio = userAttrib.get("USER_FIO");
			  org = userAttrib.get("ORG_NAME");
			  tel = userAttrib.get("USER_PHONE");
			  email = userAttrib.get("USER_EMAIL");
			  login = userAttrib.get("USER_LOGIN");
			  orgIOGVCode = userAttrib.get("ORG_CODE_IOGV");	
			  uid = userAttrib.get("USER_UID");
			 // base64TokenID "TOKEN_ID"
			  
			  LOGGER.debug("Authenticator:71:"+fio);
			  
			  //проверка чисто для информации
			  //закомментирована для скорости работы
			 
			  //--------------------------------------------------
			  
			  UserItem currentUser = new UserItem();
			  
			  
			  currentUser.setFio(fio);
			  currentUser.setOrgName(org);
			  currentUser.setPhone(tel);
			  currentUser.setEmail(email);
			  currentUser.setLogin(login);
			 
			  currentUser.setOrgCode(orgIOGVCode);
			  
			 // currentUser.setRolesInfoList(rolesInfoList);
			  
			 	  
			  currentUser.setIdUser(Long.valueOf(uid));
			  
		  
			  request.getSession().setAttribute("user_login", uid);
			  request.getSession().setAttribute("currentUser", currentUser);
			  request.getSession().setAttribute("rolesInfoList", rolesInfoList);
			  
			  return true;
			  
		   }catch(Exception e){
			 LOGGER.error("authenticator:authenticate:Error+:"+e);
			 
	         return false;
		   }
		}
	 
}
