package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoOrgInit(String st10p010p0,String st10p02,String st10p03,String st10p04,String st10p05,
			                String st10p06,String st10p07){
	  stt10p010p0=st10p010p0;
	  stt10p02=st10p02;
	  stt10p03=st10p03;
	  stt10p04=st10p04;
	  stt10p05=st10p05;
	  stt10p06=st10p06;
	  stt10p07=st10p07;

	 }
	 
	 private  String stt10p010p0;
	 private  String stt10p02;
	 private String stt10p03;
	 private  String stt10p04;
	 private  String stt10p05;
	 private  String stt10p06;
	 private  String stt10p07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10p010p0",
					stt10p010p0);
			System.setProperty("stt10p02",
					stt10p02);
			System.setProperty("stt10p03",
					stt10p03);
			System.setProperty("stt10p04",
					stt10p04);
			System.setProperty("stt10p05",
					stt10p05);
			System.setProperty("stt10p06",
					stt10p06);
			System.setProperty("stt10p07",
					stt10p07);

			
			System.setProperty("Test10p0Init",
					"Test10p0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10p05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10p0Init.class/jcp.xml");
			
			
			System.setProperty("Test10p0ss10p0_0x",
					"Test10p0ss10p0_0xjcp.xml");
         	System.setProperty("Test10p0ss10p0_02",
					"Test10p0ss10p0_02xml.config");
			System.setProperty("Test10p0ss10p0_03",
					"Test10p0ss10p0_03.apache.xml.resource.security.");
		    System.setProperty("Test10p0ss10p0_04",
					"Test10p0ss10p0_04.resource.");
			System.setProperty("Test10p0ss10p0_05",
					"Test10p0ss10p0_05.isInitialized");
			System.setProperty("Test10p0ss10p0_06",
					"Test10p0ss10p0_06_10p0Init.class/jcp.xml");
			System.setProperty("Test10p0ss10p0_07",
					"Test10p0ss10p0_07t/resource/jcp.xml");
         	System.setProperty("Test10p0ss10p0_08",
					"Test10p0ss10p0_08.config");
			System.setProperty("Test10p0ss10p0_09",
					"Test10p0ss10p0_09.security.");
		    System.setProperty("Test10p0ss10p0_0x0",
					"Test10p0ss10p0_0x0jcp.xmlapache.");
			System.setProperty("Test10p0ss10p0_0xx0",
					"Test10p0ss10p0_0xx0.isInitialized");
			System.setProperty("Test10p0ss10p0_0xxx0",
					"Test10p0ss10p0_0xxx0est10p0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10p05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10p0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10p0 != null) {
				 
				LOGGER.debug("in0in isTest10p0");
				LOGGER.debug("in10pin isTest10p0");
				LOGGER.debug("in2in isTest10p0");
				LOGGER.debug("in3in isTest10p0");
				LOGGER.debug("in4in isTest10p0");
				LOGGER.debug("in5in isTest10p0");
				LOGGER.debug("in6in isTest10p0");
				LOGGER.debug("in7in isTest10p0");
				LOGGER.debug("in8in isTest10p0");
				LOGGER.debug("in9in isTest10p0");
				LOGGER.debug("in10p0in isTest10p0");
				LOGGER.debug("in10p10pin isTest10p0");
				LOGGER.debug("in10p2in isTest10p0");
				LOGGER.debug("in10p3in isTest10p0");
				LOGGER.debug("in10p4in isTest10p0");
				LOGGER.debug("in10p5in isTest10p0");
				LOGGER.debug("in10p6in isTest10p0");
				LOGGER.debug("in10p7in isTest10p0");
				LOGGER.debug("in10p8in isTest10p0");
				LOGGER.debug("in10p9in isTest10p0");
				LOGGER.debug("in20in isTest10p0");
			}

			 

			DocumentBuilderFactory dbfTest10p0 = DocumentBuilderFactory.newInstance();
			dbfTest10p0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10p0.setNamespaceAware(true);
			dbfTest10p0.setValidating(false);

			DocumentBuilder db = dbfTest10p0.newDocumentBuilder();
			Document doc = db.parse(isTest10p0);
			Node configTest10p0 = doc.getFirstChild();
			while ((configTest10p0 != null)
					&& (!"Configuration".equals(configTest10p0.getLocalName()))) {
				configTest10p0 = configTest10p0.getNextSibling();
			}

			if (configTest10p0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10p0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10p0 = (Element) el;

					Attr langAttr = resourceTest10p0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10p0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10p0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10p0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10p0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10p0.length; i++) {
						String uri = listTest10p0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10p0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10p0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10p0.length; i++) {
						String uritrans = tranElemTest10p0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10p0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10p0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10p0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10p0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10p0 = algorithms[i];
							String id = elementTest10p0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10p0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10p0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10p0.length; i++) {
						String urisign = sigElemsTest10p0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10p0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10p0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10p0.length; i++) {
						String javaclass = resolverElemTest10p0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10p0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10p0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10p0Register Resolver:10p: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10p0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10p0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10p0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10p0 = new ArrayList(resolverElemTest10p0.length);
					for (int i = 0; i < resolverElemTest10p0.length; i++) {
						String javaclass = resolverElemTest10p0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10p0 = resolverElemTest10p0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10p0 != null) && (descriptionTest10p0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10p0);
								LOGGER.debug("Register Resolver-10p: " + javaclass
										+ ": " + descriptionTest10p0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10p0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10p0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10p0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10p0.length; i++) {
						String namespace = nlTest10p0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10p0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10p0) {
			LOGGER.error("Crypto10p05Init:fileInit:error: ", eTest10p0);
		}
	}

}
