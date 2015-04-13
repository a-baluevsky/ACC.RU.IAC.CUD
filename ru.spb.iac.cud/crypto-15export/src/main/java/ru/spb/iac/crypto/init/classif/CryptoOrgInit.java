package ru.spb.iac.crypto.init.classif;

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
	 
	 
	 public CryptoOrgInit(String st10n010n0,String st10n02,String st10n03,String st10n04,String st10n05,
			                String st10n06,String st10n07){
	  stt10n010n0=st10n010n0;
	  stt10n02=st10n02;
	  stt10n03=st10n03;
	  stt10n04=st10n04;
	  stt10n05=st10n05;
	  stt10n06=st10n06;
	  stt10n07=st10n07;

	 }
	 
	 private  String stt10n010n0;
	 private  String stt10n02;
	 private String stt10n03;
	 private  String stt10n04;
	 private  String stt10n05;
	 private  String stt10n06;
	 private  String stt10n07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10n010n0",
					stt10n010n0);
			System.setProperty("stt10n02",
					stt10n02);
			System.setProperty("stt10n03",
					stt10n03);
			System.setProperty("stt10n04",
					stt10n04);
			System.setProperty("stt10n05",
					stt10n05);
			System.setProperty("stt10n06",
					stt10n06);
			System.setProperty("stt10n07",
					stt10n07);

			
			System.setProperty("Test10n0Init",
					"Test10n0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10n05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10n0Init.class/jcp.xml");
			
			
			System.setProperty("Test10n0ss10n0_0x",
					"Test10n0ss10n0_0xjcp.xml");
         	System.setProperty("Test10n0ss10n0_02",
					"Test10n0ss10n0_02xml.config");
			System.setProperty("Test10n0ss10n0_03",
					"Test10n0ss10n0_03.apache.xml.resource.security.");
		    System.setProperty("Test10n0ss10n0_04",
					"Test10n0ss10n0_04.resource.");
			System.setProperty("Test10n0ss10n0_05",
					"Test10n0ss10n0_05.isInitialized");
			System.setProperty("Test10n0ss10n0_06",
					"Test10n0ss10n0_06_10n0Init.class/jcp.xml");
			System.setProperty("Test10n0ss10n0_07",
					"Test10n0ss10n0_07t/resource/jcp.xml");
         	System.setProperty("Test10n0ss10n0_08",
					"Test10n0ss10n0_08.config");
			System.setProperty("Test10n0ss10n0_09",
					"Test10n0ss10n0_09.security.");
		    System.setProperty("Test10n0ss10n0_0x0",
					"Test10n0ss10n0_0x0jcp.xmlapache.");
			System.setProperty("Test10n0ss10n0_0xx0",
					"Test10n0ss10n0_0xx0.isInitialized");
			System.setProperty("Test10n0ss10n0_0xxx0",
					"Test10n0ss10n0_0xxx0est10n0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10n05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10n0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10n0 != null) {
				 
				LOGGER.debug("in0in isTest10n0");
				LOGGER.debug("in10nin isTest10n0");
				LOGGER.debug("in2in isTest10n0");
				LOGGER.debug("in3in isTest10n0");
				LOGGER.debug("in4in isTest10n0");
				LOGGER.debug("in5in isTest10n0");
				LOGGER.debug("in6in isTest10n0");
				LOGGER.debug("in7in isTest10n0");
				LOGGER.debug("in8in isTest10n0");
				LOGGER.debug("in9in isTest10n0");
				LOGGER.debug("in10n0in isTest10n0");
				LOGGER.debug("in10n10nin isTest10n0");
				LOGGER.debug("in10n2in isTest10n0");
				LOGGER.debug("in10n3in isTest10n0");
				LOGGER.debug("in10n4in isTest10n0");
				LOGGER.debug("in10n5in isTest10n0");
				LOGGER.debug("in10n6in isTest10n0");
				LOGGER.debug("in10n7in isTest10n0");
				LOGGER.debug("in10n8in isTest10n0");
				LOGGER.debug("in10n9in isTest10n0");
				LOGGER.debug("in20in isTest10n0");
			}

			 

			DocumentBuilderFactory dbfTest10n0 = DocumentBuilderFactory.newInstance();
			dbfTest10n0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10n0.setNamespaceAware(true);
			dbfTest10n0.setValidating(false);

			DocumentBuilder db = dbfTest10n0.newDocumentBuilder();
			Document doc = db.parse(isTest10n0);
			Node configTest10n0 = doc.getFirstChild();
			while ((configTest10n0 != null)
					&& (!"Configuration".equals(configTest10n0.getLocalName()))) {
				configTest10n0 = configTest10n0.getNextSibling();
			}

			if (configTest10n0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10n0!=null?configTest10n0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10n0 = (Element) el;

					Attr langAttr = resourceTest10n0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10n0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10n0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10n0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10n0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10n0.length; i++) {
						String uri = listTest10n0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10n0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10n0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10n0.length; i++) {
						String uritrans = tranElemTest10n0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10n0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10n0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10n0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10n0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10n0 = algorithms[i];
							String id = elementTest10n0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10n0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10n0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10n0.length; i++) {
						String urisign = sigElemsTest10n0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10n0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10n0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10n0.length; i++) {
						String javaclass = resolverElemTest10n0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10n0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10n0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10n0Register Resolver:10n: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10n0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10n0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10n0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10n0 = new ArrayList(resolverElemTest10n0.length);
					for (int i = 0; i < resolverElemTest10n0.length; i++) {
						String javaclass = resolverElemTest10n0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10n0 = resolverElemTest10n0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10n0 != null) && (descriptionTest10n0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10n0);
								LOGGER.debug("Register Resolver-10n: " + javaclass
										+ ": " + descriptionTest10n0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10n0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10n0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10n0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10n0.length; i++) {
						String namespace = nlTest10n0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10n0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10n0 ) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", exs10n0);
 } catch (ClassNotFoundException enf10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", enf10n0);
 } catch (IllegalAccessException eia10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", eia10n0);
 } catch (InstantiationException e10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", e10n0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", epc10n0);
 } catch (org.xml.sax.SAXException ese10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", ese10n0);
 } catch (java.io.IOException eio10n0) {
 LOGGER.error("Crypto10n0Init:fileInit:error: ", eio10n0);
 }

	}

}
