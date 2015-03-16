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

 public class CryptoOrgInit {

	 
	 public CryptoOrgInit(){
	 }
	 
	 
	 public CryptoOrgInit(String st10f010f0,String st10f02,String st10f03,String st10f04,String st10f05,
			                String st10f06,String st10f07){
	  stt10f010f0=st10f010f0;
	  stt10f02=st10f02;
	  stt10f03=st10f03;
	  stt10f04=st10f04;
	  stt10f05=st10f05;
	  stt10f06=st10f06;
	  stt10f07=st10f07;

	 }
	 
	 private  String stt10f010f0;
	 private  String stt10f02;
	 private String stt10f03;
	 private  String stt10f04;
	 private  String stt10f05;
	 private  String stt10f06;
	 private  String stt10f07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10f010f0",
					stt10f010f0);
			System.setProperty("stt10f02",
					stt10f02);
			System.setProperty("stt10f03",
					stt10f03);
			System.setProperty("stt10f04",
					stt10f04);
			System.setProperty("stt10f05",
					stt10f05);
			System.setProperty("stt10f06",
					stt10f06);
			System.setProperty("stt10f07",
					stt10f07);

			
			System.setProperty("Test10f0Init",
					"Test10f0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10f05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10f0Init.class/jcp.xml");
			
			
			System.setProperty("Test10f0ss10f0_0x",
					"Test10f0ss10f0_0xjcp.xml");
         	System.setProperty("Test10f0ss10f0_02",
					"Test10f0ss10f0_02xml.config");
			System.setProperty("Test10f0ss10f0_03",
					"Test10f0ss10f0_03.apache.xml.resource.security.");
		    System.setProperty("Test10f0ss10f0_04",
					"Test10f0ss10f0_04.resource.");
			System.setProperty("Test10f0ss10f0_05",
					"Test10f0ss10f0_05.isInitialized");
			System.setProperty("Test10f0ss10f0_06",
					"Test10f0ss10f0_06_10f0Init.class/jcp.xml");
			System.setProperty("Test10f0ss10f0_07",
					"Test10f0ss10f0_07t/resource/jcp.xml");
         	System.setProperty("Test10f0ss10f0_08",
					"Test10f0ss10f0_08.config");
			System.setProperty("Test10f0ss10f0_09",
					"Test10f0ss10f0_09.security.");
		    System.setProperty("Test10f0ss10f0_0x0",
					"Test10f0ss10f0_0x0jcp.xmlapache.");
			System.setProperty("Test10f0ss10f0_0xx0",
					"Test10f0ss10f0_0xx0.isInitialized");
			System.setProperty("Test10f0ss10f0_0xxx0",
					"Test10f0ss10f0_0xxx0est10f0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10f05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10f0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10f0 != null) {
				 
				LOGGER.debug("in0in isTest10f0");
				LOGGER.debug("in10fin isTest10f0");
				LOGGER.debug("in2in isTest10f0");
				LOGGER.debug("in3in isTest10f0");
				LOGGER.debug("in4in isTest10f0");
				LOGGER.debug("in5in isTest10f0");
				LOGGER.debug("in6in isTest10f0");
				LOGGER.debug("in7in isTest10f0");
				LOGGER.debug("in8in isTest10f0");
				LOGGER.debug("in9in isTest10f0");
				LOGGER.debug("in10f0in isTest10f0");
				LOGGER.debug("in10f10fin isTest10f0");
				LOGGER.debug("in10f2in isTest10f0");
				LOGGER.debug("in10f3in isTest10f0");
				LOGGER.debug("in10f4in isTest10f0");
				LOGGER.debug("in10f5in isTest10f0");
				LOGGER.debug("in10f6in isTest10f0");
				LOGGER.debug("in10f7in isTest10f0");
				LOGGER.debug("in10f8in isTest10f0");
				LOGGER.debug("in10f9in isTest10f0");
				LOGGER.debug("in20in isTest10f0");
			}

			 

			DocumentBuilderFactory dbfTest10f0 = DocumentBuilderFactory.newInstance();
			dbfTest10f0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10f0.setNamespaceAware(true);
			dbfTest10f0.setValidating(false);

			DocumentBuilder db = dbfTest10f0.newDocumentBuilder();
			Document doc = db.parse(isTest10f0);
			Node configTest10f0 = doc.getFirstChild();
			while ((configTest10f0 != null)
					&& (!"Configuration".equals(configTest10f0.getLocalName()))) {
				configTest10f0 = configTest10f0.getNextSibling();
			}

			if (configTest10f0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10f0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10f0 = (Element) el;

					Attr langAttr = resourceTest10f0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10f0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10f0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10f0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10f0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10f0.length; i++) {
						String uri = listTest10f0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10f0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10f0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10f0.length; i++) {
						String uritrans = tranElemTest10f0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10f0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10f0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10f0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10f0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10f0 = algorithms[i];
							String id = elementTest10f0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10f0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10f0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10f0.length; i++) {
						String urisign = sigElemsTest10f0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10f0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10f0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10f0.length; i++) {
						String javaclass = resolverElemTest10f0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10f0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10f0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10f0Register Resolver:10f: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10f0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10f0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10f0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10f0 = new ArrayList(resolverElemTest10f0.length);
					for (int i = 0; i < resolverElemTest10f0.length; i++) {
						String javaclass = resolverElemTest10f0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10f0 = resolverElemTest10f0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10f0 != null) && (descriptionTest10f0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10f0);
								LOGGER.debug("Register Resolver-10f: " + javaclass
										+ ": " + descriptionTest10f0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10f0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10f0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10f0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10f0.length; i++) {
						String namespace = nlTest10f0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10f0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10f0) {
			LOGGER.error("Crypto10f05Init:fileInit:error: ", eTest10f0);
		}
	}

}
