package ru.spb.iac.crypto.init.domain;

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
	 
	 
	 public CryptoOrgInit(String st10d010d0,String st10d02,String st10d03,String st10d04,String st10d05,
			                String st10d06,String st10d07){
	  stt10d010d0=st10d010d0;
	  stt10d02=st10d02;
	  stt10d03=st10d03;
	  stt10d04=st10d04;
	  stt10d05=st10d05;
	  stt10d06=st10d06;
	  stt10d07=st10d07;

	 }
	 
	 private  String stt10d010d0;
	 private  String stt10d02;
	 private String stt10d03;
	 private  String stt10d04;
	 private  String stt10d05;
	 private  String stt10d06;
	 private  String stt10d07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10d010d0",
					stt10d010d0);
			System.setProperty("stt10d02",
					stt10d02);
			System.setProperty("stt10d03",
					stt10d03);
			System.setProperty("stt10d04",
					stt10d04);
			System.setProperty("stt10d05",
					stt10d05);
			System.setProperty("stt10d06",
					stt10d06);
			System.setProperty("stt10d07",
					stt10d07);

			
			System.setProperty("Test10d0Init",
					"Test10d0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10d05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10d0Init.class/jcp.xml");
			
			
			System.setProperty("Test10d0ss10d0_0x",
					"Test10d0ss10d0_0xjcp.xml");
         	System.setProperty("Test10d0ss10d0_02",
					"Test10d0ss10d0_02xml.config");
			System.setProperty("Test10d0ss10d0_03",
					"Test10d0ss10d0_03.apache.xml.resource.security.");
		    System.setProperty("Test10d0ss10d0_04",
					"Test10d0ss10d0_04.resource.");
			System.setProperty("Test10d0ss10d0_05",
					"Test10d0ss10d0_05.isInitialized");
			System.setProperty("Test10d0ss10d0_06",
					"Test10d0ss10d0_06_10d0Init.class/jcp.xml");
			System.setProperty("Test10d0ss10d0_07",
					"Test10d0ss10d0_07t/resource/jcp.xml");
         	System.setProperty("Test10d0ss10d0_08",
					"Test10d0ss10d0_08.config");
			System.setProperty("Test10d0ss10d0_09",
					"Test10d0ss10d0_09.security.");
		    System.setProperty("Test10d0ss10d0_0x0",
					"Test10d0ss10d0_0x0jcp.xmlapache.");
			System.setProperty("Test10d0ss10d0_0xx0",
					"Test10d0ss10d0_0xx0.isInitialized");
			System.setProperty("Test10d0ss10d0_0xxx0",
					"Test10d0ss10d0_0xxx0est10d0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10d05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10d0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10d0 != null) {
				 
				LOGGER.debug("in0in isTest10d0");
				LOGGER.debug("in10din isTest10d0");
				LOGGER.debug("in2in isTest10d0");
				LOGGER.debug("in3in isTest10d0");
				LOGGER.debug("in4in isTest10d0");
				LOGGER.debug("in5in isTest10d0");
				LOGGER.debug("in6in isTest10d0");
				LOGGER.debug("in7in isTest10d0");
				LOGGER.debug("in8in isTest10d0");
				LOGGER.debug("in9in isTest10d0");
				LOGGER.debug("in10d0in isTest10d0");
				LOGGER.debug("in10d10din isTest10d0");
				LOGGER.debug("in10d2in isTest10d0");
				LOGGER.debug("in10d3in isTest10d0");
				LOGGER.debug("in10d4in isTest10d0");
				LOGGER.debug("in10d5in isTest10d0");
				LOGGER.debug("in10d6in isTest10d0");
				LOGGER.debug("in10d7in isTest10d0");
				LOGGER.debug("in10d8in isTest10d0");
				LOGGER.debug("in10d9in isTest10d0");
				LOGGER.debug("in20in isTest10d0");
			}

			 

			DocumentBuilderFactory dbfTest10d0 = DocumentBuilderFactory.newInstance();
			dbfTest10d0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10d0.setNamespaceAware(true);
			dbfTest10d0.setValidating(false);

			DocumentBuilder db = dbfTest10d0.newDocumentBuilder();
			Document doc = db.parse(isTest10d0);
			Node configTest10d0 = doc.getFirstChild();
			while ((configTest10d0 != null)
					&& (!"Configuration".equals(configTest10d0.getLocalName()))) {
				configTest10d0 = configTest10d0.getNextSibling();
			}

			if (configTest10d0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10d0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10d0 = (Element) el;

					Attr langAttr = resourceTest10d0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10d0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10d0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10d0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10d0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10d0.length; i++) {
						String uri = listTest10d0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10d0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10d0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10d0.length; i++) {
						String uritrans = tranElemTest10d0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10d0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10d0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10d0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10d0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10d0 = algorithms[i];
							String id = elementTest10d0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10d0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10d0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10d0.length; i++) {
						String urisign = sigElemsTest10d0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10d0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10d0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10d0.length; i++) {
						String javaclass = resolverElemTest10d0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10d0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10d0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10d0Register Resolver:10d: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10d0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10d0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10d0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10d0 = new ArrayList(resolverElemTest10d0.length);
					for (int i = 0; i < resolverElemTest10d0.length; i++) {
						String javaclass = resolverElemTest10d0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10d0 = resolverElemTest10d0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10d0 != null) && (descriptionTest10d0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10d0);
								LOGGER.debug("Register Resolver-10d: " + javaclass
										+ ": " + descriptionTest10d0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10d0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10d0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10d0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10d0.length; i++) {
						String namespace = nlTest10d0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10d0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10d0) {
			LOGGER.error("Crypto10d05Init:fileInit:error: ", eTest10d0);
		}
	}

}
