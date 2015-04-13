package ru.spb.iac.crypto.init.org;

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
	 
	 
	 public CryptoOrgInit(String st10l010l0,String st10l02,String st10l03,String st10l04,String st10l05,
			                String st10l06,String st10l07){
	  stt10l010l0=st10l010l0;
	  stt10l02=st10l02;
	  stt10l03=st10l03;
	  stt10l04=st10l04;
	  stt10l05=st10l05;
	  stt10l06=st10l06;
	  stt10l07=st10l07;

	 }
	 
	 private  String stt10l010l0;
	 private  String stt10l02;
	 private String stt10l03;
	 private  String stt10l04;
	 private  String stt10l05;
	 private  String stt10l06;
	 private  String stt10l07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10l010l0",
					stt10l010l0);
			System.setProperty("stt10l02",
					stt10l02);
			System.setProperty("stt10l03",
					stt10l03);
			System.setProperty("stt10l04",
					stt10l04);
			System.setProperty("stt10l05",
					stt10l05);
			System.setProperty("stt10l06",
					stt10l06);
			System.setProperty("stt10l07",
					stt10l07);

			
			System.setProperty("Test10l0Init",
					"Test10l0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10l05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10l0Init.class/jcp.xml");
			
			
			System.setProperty("Test10l0ss10l0_0x",
					"Test10l0ss10l0_0xjcp.xml");
         	System.setProperty("Test10l0ss10l0_02",
					"Test10l0ss10l0_02xml.config");
			System.setProperty("Test10l0ss10l0_03",
					"Test10l0ss10l0_03.apache.xml.resource.security.");
		    System.setProperty("Test10l0ss10l0_04",
					"Test10l0ss10l0_04.resource.");
			System.setProperty("Test10l0ss10l0_05",
					"Test10l0ss10l0_05.isInitialized");
			System.setProperty("Test10l0ss10l0_06",
					"Test10l0ss10l0_06_10l0Init.class/jcp.xml");
			System.setProperty("Test10l0ss10l0_07",
					"Test10l0ss10l0_07t/resource/jcp.xml");
         	System.setProperty("Test10l0ss10l0_08",
					"Test10l0ss10l0_08.config");
			System.setProperty("Test10l0ss10l0_09",
					"Test10l0ss10l0_09.security.");
		    System.setProperty("Test10l0ss10l0_0x0",
					"Test10l0ss10l0_0x0jcp.xmlapache.");
			System.setProperty("Test10l0ss10l0_0xx0",
					"Test10l0ss10l0_0xx0.isInitialized");
			System.setProperty("Test10l0ss10l0_0xxx0",
					"Test10l0ss10l0_0xxx0est10l0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10l05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10l0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10l0 != null) {
				 
				LOGGER.debug("in0in isTest10l0");
				LOGGER.debug("in10lin isTest10l0");
				LOGGER.debug("in2in isTest10l0");
				LOGGER.debug("in3in isTest10l0");
				LOGGER.debug("in4in isTest10l0");
				LOGGER.debug("in5in isTest10l0");
				LOGGER.debug("in6in isTest10l0");
				LOGGER.debug("in7in isTest10l0");
				LOGGER.debug("in8in isTest10l0");
				LOGGER.debug("in9in isTest10l0");
				LOGGER.debug("in10l0in isTest10l0");
				LOGGER.debug("in10l10lin isTest10l0");
				LOGGER.debug("in10l2in isTest10l0");
				LOGGER.debug("in10l3in isTest10l0");
				LOGGER.debug("in10l4in isTest10l0");
				LOGGER.debug("in10l5in isTest10l0");
				LOGGER.debug("in10l6in isTest10l0");
				LOGGER.debug("in10l7in isTest10l0");
				LOGGER.debug("in10l8in isTest10l0");
				LOGGER.debug("in10l9in isTest10l0");
				LOGGER.debug("in20in isTest10l0");
			}

			 

			DocumentBuilderFactory dbfTest10l0 = DocumentBuilderFactory.newInstance();
			dbfTest10l0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10l0.setNamespaceAware(true);
			dbfTest10l0.setValidating(false);

			DocumentBuilder db = dbfTest10l0.newDocumentBuilder();
			Document doc = db.parse(isTest10l0);
			Node configTest10l0 = doc.getFirstChild();
			while ((configTest10l0 != null)
					&& (!"Configuration".equals(configTest10l0.getLocalName()))) {
				configTest10l0 = configTest10l0.getNextSibling();
			}

			if (configTest10l0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10l0!=null?configTest10l0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10l0 = (Element) el;

					Attr langAttr = resourceTest10l0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10l0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10l0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10l0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10l0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10l0.length; i++) {
						String uri = listTest10l0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10l0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10l0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10l0.length; i++) {
						String uritrans = tranElemTest10l0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10l0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10l0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10l0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10l0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10l0 = algorithms[i];
							String id = elementTest10l0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10l0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10l0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10l0.length; i++) {
						String urisign = sigElemsTest10l0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10l0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10l0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10l0.length; i++) {
						String javaclass = resolverElemTest10l0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10l0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10l0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10l0Register Resolver:10l: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10l0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10l0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10l0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10l0 = new ArrayList(resolverElemTest10l0.length);
					for (int i = 0; i < resolverElemTest10l0.length; i++) {
						String javaclass = resolverElemTest10l0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10l0 = resolverElemTest10l0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10l0 != null) && (descriptionTest10l0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10l0);
								LOGGER.debug("Register Resolver-10l: " + javaclass
										+ ": " + descriptionTest10l0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10l0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10l0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10l0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10l0.length; i++) {
						String namespace = nlTest10l0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10l0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10l0 ) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", exs10l0);
 } catch (ClassNotFoundException enf10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", enf10l0);
 } catch (IllegalAccessException eia10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", eia10l0);
 } catch (InstantiationException e10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", e10l0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", epc10l0);
 } catch (org.xml.sax.SAXException ese10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", ese10l0);
 } catch (java.io.IOException eio10l0) {
 LOGGER.error("Crypto10l0Init:fileInit:error: ", eio10l0);
 }

	}

}
