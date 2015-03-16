package ru.spb.iac.crypto.init.groupsys;

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
	 
	 
	 public CryptoOrgInit(String st10m010m0,String st10m02,String st10m03,String st10m04,String st10m05,
			                String st10m06,String st10m07){
	  stt10m010m0=st10m010m0;
	  stt10m02=st10m02;
	  stt10m03=st10m03;
	  stt10m04=st10m04;
	  stt10m05=st10m05;
	  stt10m06=st10m06;
	  stt10m07=st10m07;

	 }
	 
	 private  String stt10m010m0;
	 private  String stt10m02;
	 private String stt10m03;
	 private  String stt10m04;
	 private  String stt10m05;
	 private  String stt10m06;
	 private  String stt10m07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10m010m0",
					stt10m010m0);
			System.setProperty("stt10m02",
					stt10m02);
			System.setProperty("stt10m03",
					stt10m03);
			System.setProperty("stt10m04",
					stt10m04);
			System.setProperty("stt10m05",
					stt10m05);
			System.setProperty("stt10m06",
					stt10m06);
			System.setProperty("stt10m07",
					stt10m07);

			
			System.setProperty("Test10m0Init",
					"Test10m0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10m05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10m0Init.class/jcp.xml");
			
			
			System.setProperty("Test10m0ss10m0_0x",
					"Test10m0ss10m0_0xjcp.xml");
         	System.setProperty("Test10m0ss10m0_02",
					"Test10m0ss10m0_02xml.config");
			System.setProperty("Test10m0ss10m0_03",
					"Test10m0ss10m0_03.apache.xml.resource.security.");
		    System.setProperty("Test10m0ss10m0_04",
					"Test10m0ss10m0_04.resource.");
			System.setProperty("Test10m0ss10m0_05",
					"Test10m0ss10m0_05.isInitialized");
			System.setProperty("Test10m0ss10m0_06",
					"Test10m0ss10m0_06_10m0Init.class/jcp.xml");
			System.setProperty("Test10m0ss10m0_07",
					"Test10m0ss10m0_07t/resource/jcp.xml");
         	System.setProperty("Test10m0ss10m0_08",
					"Test10m0ss10m0_08.config");
			System.setProperty("Test10m0ss10m0_09",
					"Test10m0ss10m0_09.security.");
		    System.setProperty("Test10m0ss10m0_0x0",
					"Test10m0ss10m0_0x0jcp.xmlapache.");
			System.setProperty("Test10m0ss10m0_0xx0",
					"Test10m0ss10m0_0xx0.isInitialized");
			System.setProperty("Test10m0ss10m0_0xxx0",
					"Test10m0ss10m0_0xxx0est10m0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10m05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10m0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10m0 != null) {
				 
				LOGGER.debug("in0in isTest10m0");
				LOGGER.debug("in10min isTest10m0");
				LOGGER.debug("in2in isTest10m0");
				LOGGER.debug("in3in isTest10m0");
				LOGGER.debug("in4in isTest10m0");
				LOGGER.debug("in5in isTest10m0");
				LOGGER.debug("in6in isTest10m0");
				LOGGER.debug("in7in isTest10m0");
				LOGGER.debug("in8in isTest10m0");
				LOGGER.debug("in9in isTest10m0");
				LOGGER.debug("in10m0in isTest10m0");
				LOGGER.debug("in10m10min isTest10m0");
				LOGGER.debug("in10m2in isTest10m0");
				LOGGER.debug("in10m3in isTest10m0");
				LOGGER.debug("in10m4in isTest10m0");
				LOGGER.debug("in10m5in isTest10m0");
				LOGGER.debug("in10m6in isTest10m0");
				LOGGER.debug("in10m7in isTest10m0");
				LOGGER.debug("in10m8in isTest10m0");
				LOGGER.debug("in10m9in isTest10m0");
				LOGGER.debug("in20in isTest10m0");
			}

			 

			DocumentBuilderFactory dbfTest10m0 = DocumentBuilderFactory.newInstance();
			dbfTest10m0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10m0.setNamespaceAware(true);
			dbfTest10m0.setValidating(false);

			DocumentBuilder db = dbfTest10m0.newDocumentBuilder();
			Document doc = db.parse(isTest10m0);
			Node configTest10m0 = doc.getFirstChild();
			while ((configTest10m0 != null)
					&& (!"Configuration".equals(configTest10m0.getLocalName()))) {
				configTest10m0 = configTest10m0.getNextSibling();
			}

			if (configTest10m0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10m0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10m0 = (Element) el;

					Attr langAttr = resourceTest10m0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10m0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10m0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10m0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10m0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10m0.length; i++) {
						String uri = listTest10m0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10m0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10m0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10m0.length; i++) {
						String uritrans = tranElemTest10m0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10m0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10m0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10m0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10m0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10m0 = algorithms[i];
							String id = elementTest10m0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10m0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10m0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10m0.length; i++) {
						String urisign = sigElemsTest10m0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10m0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10m0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10m0.length; i++) {
						String javaclass = resolverElemTest10m0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10m0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10m0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10m0Register Resolver:10m: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10m0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10m0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10m0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10m0 = new ArrayList(resolverElemTest10m0.length);
					for (int i = 0; i < resolverElemTest10m0.length; i++) {
						String javaclass = resolverElemTest10m0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10m0 = resolverElemTest10m0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10m0 != null) && (descriptionTest10m0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10m0);
								LOGGER.debug("Register Resolver-10m: " + javaclass
										+ ": " + descriptionTest10m0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10m0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10m0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10m0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10m0.length; i++) {
						String namespace = nlTest10m0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10m0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10m0) {
			LOGGER.error("Crypto10m05Init:fileInit:error: ", eTest10m0);
		}
	}

}
