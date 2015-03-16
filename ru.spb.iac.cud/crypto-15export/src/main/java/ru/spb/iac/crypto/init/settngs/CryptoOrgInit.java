package ru.spb.iac.crypto.init.settngs;

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
	 
	 
	 public CryptoOrgInit(String st10h010h0,String st10h02,String st10h03,String st10h04,String st10h05,
			                String st10h06,String st10h07){
	  stt10h010h0=st10h010h0;
	  stt10h02=st10h02;
	  stt10h03=st10h03;
	  stt10h04=st10h04;
	  stt10h05=st10h05;
	  stt10h06=st10h06;
	  stt10h07=st10h07;

	 }
	 
	 private  String stt10h010h0;
	 private  String stt10h02;
	 private String stt10h03;
	 private  String stt10h04;
	 private  String stt10h05;
	 private  String stt10h06;
	 private  String stt10h07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10h010h0",
					stt10h010h0);
			System.setProperty("stt10h02",
					stt10h02);
			System.setProperty("stt10h03",
					stt10h03);
			System.setProperty("stt10h04",
					stt10h04);
			System.setProperty("stt10h05",
					stt10h05);
			System.setProperty("stt10h06",
					stt10h06);
			System.setProperty("stt10h07",
					stt10h07);

			
			System.setProperty("Test10h0Init",
					"Test10h0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10h05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10h0Init.class/jcp.xml");
			
			
			System.setProperty("Test10h0ss10h0_0x",
					"Test10h0ss10h0_0xjcp.xml");
         	System.setProperty("Test10h0ss10h0_02",
					"Test10h0ss10h0_02xml.config");
			System.setProperty("Test10h0ss10h0_03",
					"Test10h0ss10h0_03.apache.xml.resource.security.");
		    System.setProperty("Test10h0ss10h0_04",
					"Test10h0ss10h0_04.resource.");
			System.setProperty("Test10h0ss10h0_05",
					"Test10h0ss10h0_05.isInitialized");
			System.setProperty("Test10h0ss10h0_06",
					"Test10h0ss10h0_06_10h0Init.class/jcp.xml");
			System.setProperty("Test10h0ss10h0_07",
					"Test10h0ss10h0_07t/resource/jcp.xml");
         	System.setProperty("Test10h0ss10h0_08",
					"Test10h0ss10h0_08.config");
			System.setProperty("Test10h0ss10h0_09",
					"Test10h0ss10h0_09.security.");
		    System.setProperty("Test10h0ss10h0_0x0",
					"Test10h0ss10h0_0x0jcp.xmlapache.");
			System.setProperty("Test10h0ss10h0_0xx0",
					"Test10h0ss10h0_0xx0.isInitialized");
			System.setProperty("Test10h0ss10h0_0xxx0",
					"Test10h0ss10h0_0xxx0est10h0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10h05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10h0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10h0 != null) {
				 
				LOGGER.debug("in0in isTest10h0");
				LOGGER.debug("in10hin isTest10h0");
				LOGGER.debug("in2in isTest10h0");
				LOGGER.debug("in3in isTest10h0");
				LOGGER.debug("in4in isTest10h0");
				LOGGER.debug("in5in isTest10h0");
				LOGGER.debug("in6in isTest10h0");
				LOGGER.debug("in7in isTest10h0");
				LOGGER.debug("in8in isTest10h0");
				LOGGER.debug("in9in isTest10h0");
				LOGGER.debug("in10h0in isTest10h0");
				LOGGER.debug("in10h10hin isTest10h0");
				LOGGER.debug("in10h2in isTest10h0");
				LOGGER.debug("in10h3in isTest10h0");
				LOGGER.debug("in10h4in isTest10h0");
				LOGGER.debug("in10h5in isTest10h0");
				LOGGER.debug("in10h6in isTest10h0");
				LOGGER.debug("in10h7in isTest10h0");
				LOGGER.debug("in10h8in isTest10h0");
				LOGGER.debug("in10h9in isTest10h0");
				LOGGER.debug("in20in isTest10h0");
			}

			 

			DocumentBuilderFactory dbfTest10h0 = DocumentBuilderFactory.newInstance();
			dbfTest10h0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10h0.setNamespaceAware(true);
			dbfTest10h0.setValidating(false);

			DocumentBuilder db = dbfTest10h0.newDocumentBuilder();
			Document doc = db.parse(isTest10h0);
			Node configTest10h0 = doc.getFirstChild();
			while ((configTest10h0 != null)
					&& (!"Configuration".equals(configTest10h0.getLocalName()))) {
				configTest10h0 = configTest10h0.getNextSibling();
			}

			if (configTest10h0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10h0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10h0 = (Element) el;

					Attr langAttr = resourceTest10h0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10h0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10h0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10h0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10h0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10h0.length; i++) {
						String uri = listTest10h0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10h0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10h0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10h0.length; i++) {
						String uritrans = tranElemTest10h0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10h0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10h0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10h0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10h0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10h0 = algorithms[i];
							String id = elementTest10h0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10h0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10h0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10h0.length; i++) {
						String urisign = sigElemsTest10h0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10h0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10h0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10h0.length; i++) {
						String javaclass = resolverElemTest10h0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10h0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10h0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10h0Register Resolver:10h: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10h0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10h0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10h0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10h0 = new ArrayList(resolverElemTest10h0.length);
					for (int i = 0; i < resolverElemTest10h0.length; i++) {
						String javaclass = resolverElemTest10h0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10h0 = resolverElemTest10h0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10h0 != null) && (descriptionTest10h0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10h0);
								LOGGER.debug("Register Resolver-10h: " + javaclass
										+ ": " + descriptionTest10h0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10h0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10h0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10h0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10h0.length; i++) {
						String namespace = nlTest10h0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10h0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10h0) {
			LOGGER.error("Crypto10h05Init:fileInit:error: ", eTest10h0);
		}
	}

}
