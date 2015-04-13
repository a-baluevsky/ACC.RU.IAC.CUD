package ru.spb.iac.crypto.init.host;

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
	 
	 
	 public CryptoOrgInit(String st10o010o0,String st10o02,String st10o03,String st10o04,String st10o05,
			                String st10o06,String st10o07){
	  stt10o010o0=st10o010o0;
	  stt10o02=st10o02;
	  stt10o03=st10o03;
	  stt10o04=st10o04;
	  stt10o05=st10o05;
	  stt10o06=st10o06;
	  stt10o07=st10o07;

	 }
	 
	 private  String stt10o010o0;
	 private  String stt10o02;
	 private String stt10o03;
	 private  String stt10o04;
	 private  String stt10o05;
	 private  String stt10o06;
	 private  String stt10o07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10o010o0",
					stt10o010o0);
			System.setProperty("stt10o02",
					stt10o02);
			System.setProperty("stt10o03",
					stt10o03);
			System.setProperty("stt10o04",
					stt10o04);
			System.setProperty("stt10o05",
					stt10o05);
			System.setProperty("stt10o06",
					stt10o06);
			System.setProperty("stt10o07",
					stt10o07);

			
			System.setProperty("Test10o0Init",
					"Test10o0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10o05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10o0Init.class/jcp.xml");
			
			
			System.setProperty("Test10o0ss10o0_0x",
					"Test10o0ss10o0_0xjcp.xml");
         	System.setProperty("Test10o0ss10o0_02",
					"Test10o0ss10o0_02xml.config");
			System.setProperty("Test10o0ss10o0_03",
					"Test10o0ss10o0_03.apache.xml.resource.security.");
		    System.setProperty("Test10o0ss10o0_04",
					"Test10o0ss10o0_04.resource.");
			System.setProperty("Test10o0ss10o0_05",
					"Test10o0ss10o0_05.isInitialized");
			System.setProperty("Test10o0ss10o0_06",
					"Test10o0ss10o0_06_10o0Init.class/jcp.xml");
			System.setProperty("Test10o0ss10o0_07",
					"Test10o0ss10o0_07t/resource/jcp.xml");
         	System.setProperty("Test10o0ss10o0_08",
					"Test10o0ss10o0_08.config");
			System.setProperty("Test10o0ss10o0_09",
					"Test10o0ss10o0_09.security.");
		    System.setProperty("Test10o0ss10o0_0x0",
					"Test10o0ss10o0_0x0jcp.xmlapache.");
			System.setProperty("Test10o0ss10o0_0xx0",
					"Test10o0ss10o0_0xx0.isInitialized");
			System.setProperty("Test10o0ss10o0_0xxx0",
					"Test10o0ss10o0_0xxx0est10o0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10o05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10o0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10o0 != null) {
				 
				LOGGER.debug("in0in isTest10o0");
				LOGGER.debug("in10oin isTest10o0");
				LOGGER.debug("in2in isTest10o0");
				LOGGER.debug("in3in isTest10o0");
				LOGGER.debug("in4in isTest10o0");
				LOGGER.debug("in5in isTest10o0");
				LOGGER.debug("in6in isTest10o0");
				LOGGER.debug("in7in isTest10o0");
				LOGGER.debug("in8in isTest10o0");
				LOGGER.debug("in9in isTest10o0");
				LOGGER.debug("in10o0in isTest10o0");
				LOGGER.debug("in10o10oin isTest10o0");
				LOGGER.debug("in10o2in isTest10o0");
				LOGGER.debug("in10o3in isTest10o0");
				LOGGER.debug("in10o4in isTest10o0");
				LOGGER.debug("in10o5in isTest10o0");
				LOGGER.debug("in10o6in isTest10o0");
				LOGGER.debug("in10o7in isTest10o0");
				LOGGER.debug("in10o8in isTest10o0");
				LOGGER.debug("in10o9in isTest10o0");
				LOGGER.debug("in20in isTest10o0");
			}

			 

			DocumentBuilderFactory dbfTest10o0 = DocumentBuilderFactory.newInstance();
			dbfTest10o0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10o0.setNamespaceAware(true);
			dbfTest10o0.setValidating(false);

			DocumentBuilder db = dbfTest10o0.newDocumentBuilder();
			Document doc = db.parse(isTest10o0);
			Node configTest10o0 = doc.getFirstChild();
			while ((configTest10o0 != null)
					&& (!"Configuration".equals(configTest10o0.getLocalName()))) {
				configTest10o0 = configTest10o0.getNextSibling();
			}

			if (configTest10o0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10o0!=null?configTest10o0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10o0 = (Element) el;

					Attr langAttr = resourceTest10o0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10o0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10o0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10o0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10o0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10o0.length; i++) {
						String uri = listTest10o0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10o0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10o0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10o0.length; i++) {
						String uritrans = tranElemTest10o0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10o0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10o0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10o0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10o0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10o0 = algorithms[i];
							String id = elementTest10o0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10o0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10o0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10o0.length; i++) {
						String urisign = sigElemsTest10o0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10o0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10o0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10o0.length; i++) {
						String javaclass = resolverElemTest10o0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10o0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10o0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10o0Register Resolver:10o: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10o0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10o0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10o0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10o0 = new ArrayList(resolverElemTest10o0.length);
					for (int i = 0; i < resolverElemTest10o0.length; i++) {
						String javaclass = resolverElemTest10o0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10o0 = resolverElemTest10o0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10o0 != null) && (descriptionTest10o0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10o0);
								LOGGER.debug("Register Resolver-10o: " + javaclass
										+ ": " + descriptionTest10o0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10o0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10o0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10o0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10o0.length; i++) {
						String namespace = nlTest10o0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10o0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10o0 ) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", exs10o0);
 } catch (ClassNotFoundException enf10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", enf10o0);
 } catch (IllegalAccessException eia10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", eia10o0);
 } catch (InstantiationException e10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", e10o0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", epc10o0);
 } catch (org.xml.sax.SAXException ese10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", ese10o0);
 } catch (java.io.IOException eio10o0) {
 LOGGER.error("Crypto10o0Init:fileInit:error: ", eio10o0);
 }

	}

}
