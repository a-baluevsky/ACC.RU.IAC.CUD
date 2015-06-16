package ru.spb.iac.crypto.init.group;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.keys.keyresolver.KeyResolver;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8fb1,String st8fb2,String st8fb3,String st8fb4,String st8fb5,
			                String st8fb6,String st8fb7){
	  stt8fb1=st8fb1;
	  stt8fb2=st8fb2;
	  stt8fb3=st8fb3;
	  stt8fb4=st8fb4;
	  stt8fb5=st8fb5;
	  stt8fb6=st8fb6;
	  stt8fb7=st8fb7;

	 }
	 
	 private  String stt8fb1;
	 private  String stt8fb2;
	 private String stt8fb3;
	 private  String stt8fb4;
	 private  String stt8fb5;
	 private  String stt8fb6;
	 private  String stt8fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8fb1",
					stt8fb1);
			System.setProperty("stt8fb2",
					stt8fb2);
			System.setProperty("stt8fb3",
					stt8fb3);
			System.setProperty("stt8fb4",
					stt8fb4);
			System.setProperty("stt8fb5",
					stt8fb5);
			System.setProperty("stt8fb6",
					stt8fb6);
			System.setProperty("stt8fb7",
					stt8fb7);

			
			System.setProperty("Test8fbInit",
					"Test8fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8fbInit.class/jcp.xml");
			
			System.setProperty("Test8fbss8fb_0x",
					"Test8fbss8fb_0xjcp.xml");
         	System.setProperty("Test8fbss8fb_02",
					"Test8fbss8fb_02xml.config");
			System.setProperty("Test8fbss8fb_03",
					"Test8fbss8fb_03.apache.xml.resource.security.");
		    System.setProperty("Test8fbss8fb_04",
					"Test8fbss8fb_04.resource.");
			System.setProperty("Test8fbss8fb_05",
					"Test8fbss8fb_05.isInitialized");
			System.setProperty("Test8fbss8fb_06",
					"Test8fbss8fb_06_8fbInit.class/jcp.xml");
			System.setProperty("Test8fbss8fb_07",
					"Test8fbss8fb_07t/resource/jcp.xml");
         	System.setProperty("Test8fbss8fb_08fb",
					"Test8fbss8fb_08fb.config");
			System.setProperty("Test8fbss8fb_09",
					"Test8fbss8fb_09.security.");
		    System.setProperty("Test8fbss8fb_0x0",
					"Test8fbss8fb_0x0jcp.xmlapache.");
			System.setProperty("Test8fbss8fb_0xx0",
					"Test8fbss8fb_0xx0.isInitialized");
			System.setProperty("Test8fbss8fb_0xxx0",
					"Test8fbss8fb_0xxx0est8fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8fb = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8fb != null) {
				 
				LOGGER.debug("in0in isTest8fb");
				LOGGER.debug("inxin isTest8fb");
				LOGGER.debug("in2in isTest8fb");
				LOGGER.debug("in3in isTest8fb");
				LOGGER.debug("in4in isTest8fb");
				LOGGER.debug("in5in isTest8fb");
				LOGGER.debug("in6in isTest8fb");
				LOGGER.debug("in7in isTest8fb");
				LOGGER.debug("in8fbin isTest8fb");
				LOGGER.debug("in9in isTest8fb");
				LOGGER.debug("inx0in isTest8fb");
				LOGGER.debug("inxxin isTest8fb");
				LOGGER.debug("inx2in isTest8fb");
				LOGGER.debug("inx3in isTest8fb");
				LOGGER.debug("inx4in isTest8fb");
				LOGGER.debug("inx5in isTest8fb");
				LOGGER.debug("inx6in isTest8fb");
				LOGGER.debug("inx7in isTest8fb");
				LOGGER.debug("inx8fbin isTest8fb");
				LOGGER.debug("inx9in isTest8fb");
				LOGGER.debug("in20in isTest8fb");
			}

			 

			DocumentBuilderFactory dbfTest8fb = DocumentBuilderFactory.newInstance();
			dbfTest8fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8fb.setNamespaceAware(true);
			dbfTest8fb.setValidating(false);

			DocumentBuilder db = dbfTest8fb.newDocumentBuilder();
			Document doc = db.parse(isTest8fb);
			Node configTest8fb = doc.getFirstChild();
			while ((configTest8fb != null)
					&& (!"Configuration".equals(configTest8fb.getLocalName()))) {
				configTest8fb = configTest8fb.getNextSibling();
			}

			if (configTest8fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8fb!=null?configTest8fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8fb = (Element) el;

					Attr langAttr = resourceTest8fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8fb.length; i++) {
						String uri = listTest8fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest8fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8fb.length; i++) {
						String uritrans = tranElemTest8fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8fb = algorithms[i];
							String id = elementTest8fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8fb.length; i++) {
						String urisign = sigElemsTest8fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8fb.length; i++) {
						String javaclass = resolverElemTest8fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8fbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8fb = new ArrayList<String>(resolverElemTest8fb.length);
					for (int i = 0; i < resolverElemTest8fb.length; i++) {
						String javaclass = resolverElemTest8fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8fb = resolverElemTest8fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8fb != null) && (descriptionTest8fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8fb);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8fb);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8fb.length; i++) {
						String namespace = nlTest8fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8fb ) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", exs8fb);
 } catch (ClassNotFoundException enf8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", enf8fb);
 } catch (IllegalAccessException eia8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", eia8fb);
 } catch (InstantiationException e8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", e8fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", epc8fb);
 } catch (org.xml.sax.SAXException ese8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", ese8fb);
 } catch (java.io.IOException eio8fb) {
 LOGGER.error("Crypto8fbInit:fileInit:error: ", eio8fb);
 }

	}

}
