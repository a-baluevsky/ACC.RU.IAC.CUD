package ru.spb.iac.crypto.init.report;

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
	 
	 
	 public CryptoOrgInit(String st10j010j0,String st10j02,String st10j03,String st10j04,String st10j05,
			                String st10j06,String st10j07){
	  stt10j010j0=st10j010j0;
	  stt10j02=st10j02;
	  stt10j03=st10j03;
	  stt10j04=st10j04;
	  stt10j05=st10j05;
	  stt10j06=st10j06;
	  stt10j07=st10j07;

	 }
	 
	 private  String stt10j010j0;
	 private  String stt10j02;
	 private String stt10j03;
	 private  String stt10j04;
	 private  String stt10j05;
	 private  String stt10j06;
	 private  String stt10j07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10j010j0",
					stt10j010j0);
			System.setProperty("stt10j02",
					stt10j02);
			System.setProperty("stt10j03",
					stt10j03);
			System.setProperty("stt10j04",
					stt10j04);
			System.setProperty("stt10j05",
					stt10j05);
			System.setProperty("stt10j06",
					stt10j06);
			System.setProperty("stt10j07",
					stt10j07);

			
			System.setProperty("Test10j0Init",
					"Test10j0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10j05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10j0Init.class/jcp.xml");
			
			
			System.setProperty("Test10j0ss10j0_0x",
					"Test10j0ss10j0_0xjcp.xml");
         	System.setProperty("Test10j0ss10j0_02",
					"Test10j0ss10j0_02xml.config");
			System.setProperty("Test10j0ss10j0_03",
					"Test10j0ss10j0_03.apache.xml.resource.security.");
		    System.setProperty("Test10j0ss10j0_04",
					"Test10j0ss10j0_04.resource.");
			System.setProperty("Test10j0ss10j0_05",
					"Test10j0ss10j0_05.isInitialized");
			System.setProperty("Test10j0ss10j0_06",
					"Test10j0ss10j0_06_10j0Init.class/jcp.xml");
			System.setProperty("Test10j0ss10j0_07",
					"Test10j0ss10j0_07t/resource/jcp.xml");
         	System.setProperty("Test10j0ss10j0_08",
					"Test10j0ss10j0_08.config");
			System.setProperty("Test10j0ss10j0_09",
					"Test10j0ss10j0_09.security.");
		    System.setProperty("Test10j0ss10j0_0x0",
					"Test10j0ss10j0_0x0jcp.xmlapache.");
			System.setProperty("Test10j0ss10j0_0xx0",
					"Test10j0ss10j0_0xx0.isInitialized");
			System.setProperty("Test10j0ss10j0_0xxx0",
					"Test10j0ss10j0_0xxx0est10j0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10j05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10j0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10j0 != null) {
				 
				LOGGER.debug("in0in isTest10j0");
				LOGGER.debug("in10jin isTest10j0");
				LOGGER.debug("in2in isTest10j0");
				LOGGER.debug("in3in isTest10j0");
				LOGGER.debug("in4in isTest10j0");
				LOGGER.debug("in5in isTest10j0");
				LOGGER.debug("in6in isTest10j0");
				LOGGER.debug("in7in isTest10j0");
				LOGGER.debug("in8in isTest10j0");
				LOGGER.debug("in9in isTest10j0");
				LOGGER.debug("in10j0in isTest10j0");
				LOGGER.debug("in10j10jin isTest10j0");
				LOGGER.debug("in10j2in isTest10j0");
				LOGGER.debug("in10j3in isTest10j0");
				LOGGER.debug("in10j4in isTest10j0");
				LOGGER.debug("in10j5in isTest10j0");
				LOGGER.debug("in10j6in isTest10j0");
				LOGGER.debug("in10j7in isTest10j0");
				LOGGER.debug("in10j8in isTest10j0");
				LOGGER.debug("in10j9in isTest10j0");
				LOGGER.debug("in20in isTest10j0");
			}

			 

			DocumentBuilderFactory dbfTest10j0 = DocumentBuilderFactory.newInstance();
			dbfTest10j0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10j0.setNamespaceAware(true);
			dbfTest10j0.setValidating(false);

			DocumentBuilder db = dbfTest10j0.newDocumentBuilder();
			Document doc = db.parse(isTest10j0);
			Node configTest10j0 = doc.getFirstChild();
			while ((configTest10j0 != null)
					&& (!"Configuration".equals(configTest10j0.getLocalName()))) {
				configTest10j0 = configTest10j0.getNextSibling();
			}

			if (configTest10j0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10j0!=null?configTest10j0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10j0 = (Element) el;

					Attr langAttr = resourceTest10j0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10j0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10j0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10j0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10j0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10j0.length; i++) {
						String uri = listTest10j0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10j0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10j0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10j0.length; i++) {
						String uritrans = tranElemTest10j0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10j0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10j0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10j0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10j0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10j0 = algorithms[i];
							String id = elementTest10j0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10j0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10j0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10j0.length; i++) {
						String urisign = sigElemsTest10j0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10j0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10j0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10j0.length; i++) {
						String javaclass = resolverElemTest10j0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10j0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10j0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10j0Register Resolver:10j: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10j0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10j0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10j0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest10j0 = new ArrayList<String>(resolverElemTest10j0.length);
					for (int i = 0; i < resolverElemTest10j0.length; i++) {
						String javaclass = resolverElemTest10j0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10j0 = resolverElemTest10j0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10j0 != null) && (descriptionTest10j0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10j0);
								LOGGER.debug("Register Resolver-10j: " + javaclass
										+ ": " + descriptionTest10j0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10j0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10j0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10j0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10j0.length; i++) {
						String namespace = nlTest10j0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10j0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10j0 ) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", exs10j0);
 } catch (ClassNotFoundException enf10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", enf10j0);
 } catch (IllegalAccessException eia10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", eia10j0);
 } catch (InstantiationException e10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", e10j0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", epc10j0);
 } catch (org.xml.sax.SAXException ese10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", ese10j0);
 } catch (java.io.IOException eio10j0) {
 LOGGER.error("Crypto10j0Init:fileInit:error: ", eio10j0);
 }

	}

}
