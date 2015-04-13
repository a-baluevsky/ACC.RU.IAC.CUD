package ru.spb.iac.crypto.init.user;

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

 public class CryptoOrgInit {

	 
	 public CryptoOrgInit(){
	 }
	 
	 
	 public CryptoOrgInit(String st10e010e0,String st10e02,String st10e03,String st10e04,String st10e05,
			                String st10e06,String st10e07){
	  stt10e010e0=st10e010e0;
	  stt10e02=st10e02;
	  stt10e03=st10e03;
	  stt10e04=st10e04;
	  stt10e05=st10e05;
	  stt10e06=st10e06;
	  stt10e07=st10e07;

	 }
	 
	 private  String stt10e010e0;
	 private  String stt10e02;
	 private String stt10e03;
	 private  String stt10e04;
	 private  String stt10e05;
	 private  String stt10e06;
	 private  String stt10e07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10e010e0",
					stt10e010e0);
			System.setProperty("stt10e02",
					stt10e02);
			System.setProperty("stt10e03",
					stt10e03);
			System.setProperty("stt10e04",
					stt10e04);
			System.setProperty("stt10e05",
					stt10e05);
			System.setProperty("stt10e06",
					stt10e06);
			System.setProperty("stt10e07",
					stt10e07);

			
			System.setProperty("Test10e0Init",
					"Test10e0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10e05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10e0Init.class/jcp.xml");
			
			
			System.setProperty("Test10e0ss10e0_0x",
					"Test10e0ss10e0_0xjcp.xml");
         	System.setProperty("Test10e0ss10e0_02",
					"Test10e0ss10e0_02xml.config");
			System.setProperty("Test10e0ss10e0_03",
					"Test10e0ss10e0_03.apache.xml.resource.security.");
		    System.setProperty("Test10e0ss10e0_04",
					"Test10e0ss10e0_04.resource.");
			System.setProperty("Test10e0ss10e0_05",
					"Test10e0ss10e0_05.isInitialized");
			System.setProperty("Test10e0ss10e0_06",
					"Test10e0ss10e0_06_10e0Init.class/jcp.xml");
			System.setProperty("Test10e0ss10e0_07",
					"Test10e0ss10e0_07t/resource/jcp.xml");
         	System.setProperty("Test10e0ss10e0_08",
					"Test10e0ss10e0_08.config");
			System.setProperty("Test10e0ss10e0_09",
					"Test10e0ss10e0_09.security.");
		    System.setProperty("Test10e0ss10e0_0x0",
					"Test10e0ss10e0_0x0jcp.xmlapache.");
			System.setProperty("Test10e0ss10e0_0xx0",
					"Test10e0ss10e0_0xx0.isInitialized");
			System.setProperty("Test10e0ss10e0_0xxx0",
					"Test10e0ss10e0_0xxx0est10e0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10e05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10e0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10e0 != null) {
				 
				LOGGER.debug("in0in isTest10e0");
				LOGGER.debug("in10ein isTest10e0");
				LOGGER.debug("in2in isTest10e0");
				LOGGER.debug("in3in isTest10e0");
				LOGGER.debug("in4in isTest10e0");
				LOGGER.debug("in5in isTest10e0");
				LOGGER.debug("in6in isTest10e0");
				LOGGER.debug("in7in isTest10e0");
				LOGGER.debug("in8in isTest10e0");
				LOGGER.debug("in9in isTest10e0");
				LOGGER.debug("in10e0in isTest10e0");
				LOGGER.debug("in10e10ein isTest10e0");
				LOGGER.debug("in10e2in isTest10e0");
				LOGGER.debug("in10e3in isTest10e0");
				LOGGER.debug("in10e4in isTest10e0");
				LOGGER.debug("in10e5in isTest10e0");
				LOGGER.debug("in10e6in isTest10e0");
				LOGGER.debug("in10e7in isTest10e0");
				LOGGER.debug("in10e8in isTest10e0");
				LOGGER.debug("in10e9in isTest10e0");
				LOGGER.debug("in20in isTest10e0");
			}

			 

			DocumentBuilderFactory dbfTest10e0 = DocumentBuilderFactory.newInstance();
			dbfTest10e0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10e0.setNamespaceAware(true);
			dbfTest10e0.setValidating(false);

			DocumentBuilder db = dbfTest10e0.newDocumentBuilder();
			Document doc = db.parse(isTest10e0);
			Node configTest10e0 = doc.getFirstChild();
			while ((configTest10e0 != null)
					&& (!"Configuration".equals(configTest10e0.getLocalName()))) {
				configTest10e0 = configTest10e0.getNextSibling();
			}

			if (configTest10e0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10e0!=null?configTest10e0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10e0 = (Element) el;

					Attr langAttr = resourceTest10e0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10e0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10e0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10e0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10e0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10e0.length; i++) {
						String uri = listTest10e0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10e0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10e0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10e0.length; i++) {
						String uritrans = tranElemTest10e0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10e0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10e0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10e0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10e0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10e0 = algorithms[i];
							String id = elementTest10e0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10e0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10e0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10e0.length; i++) {
						String urisign = sigElemsTest10e0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10e0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10e0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10e0.length; i++) {
						String javaclass = resolverElemTest10e0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10e0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10e0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10e0Register Resolver:10e: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10e0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10e0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10e0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10e0 = new ArrayList(resolverElemTest10e0.length);
					for (int i = 0; i < resolverElemTest10e0.length; i++) {
						String javaclass = resolverElemTest10e0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10e0 = resolverElemTest10e0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10e0 != null) && (descriptionTest10e0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10e0);
								LOGGER.debug("Register Resolver-10e: " + javaclass
										+ ": " + descriptionTest10e0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10e0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10e0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10e0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10e0.length; i++) {
						String namespace = nlTest10e0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10e0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10e0 ) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", exs10e0);
 } catch (ClassNotFoundException enf10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", enf10e0);
 } catch (IllegalAccessException eia10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", eia10e0);
 } catch (InstantiationException e10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", e10e0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", epc10e0);
 } catch (org.xml.sax.SAXException ese10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", ese10e0);
 } catch (java.io.IOException eio10e0) {
 LOGGER.error("Crypto10e0Init:fileInit:error: ", eio10e0);
 }

	}

}
