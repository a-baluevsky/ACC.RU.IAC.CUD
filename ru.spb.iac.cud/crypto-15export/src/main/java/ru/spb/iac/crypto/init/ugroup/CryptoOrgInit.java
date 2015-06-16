package ru.spb.iac.crypto.init.ugroup;

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
	 
	 
	 public CryptoOrgInit(String st10g010g0,String st10g02,String st10g03,String st10g04,String st10g05,
			                String st10g06,String st10g07){
	  stt10g010g0=st10g010g0;
	  stt10g02=st10g02;
	  stt10g03=st10g03;
	  stt10g04=st10g04;
	  stt10g05=st10g05;
	  stt10g06=st10g06;
	  stt10g07=st10g07;

	 }
	 
	 private  String stt10g010g0;
	 private  String stt10g02;
	 private String stt10g03;
	 private  String stt10g04;
	 private  String stt10g05;
	 private  String stt10g06;
	 private  String stt10g07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10g010g0",
					stt10g010g0);
			System.setProperty("stt10g02",
					stt10g02);
			System.setProperty("stt10g03",
					stt10g03);
			System.setProperty("stt10g04",
					stt10g04);
			System.setProperty("stt10g05",
					stt10g05);
			System.setProperty("stt10g06",
					stt10g06);
			System.setProperty("stt10g07",
					stt10g07);

			
			System.setProperty("Test10g0Init",
					"Test10g0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10g05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10g0Init.class/jcp.xml");
			
			
			System.setProperty("Test10g0ss10g0_0x",
					"Test10g0ss10g0_0xjcp.xml");
         	System.setProperty("Test10g0ss10g0_02",
					"Test10g0ss10g0_02xml.config");
			System.setProperty("Test10g0ss10g0_03",
					"Test10g0ss10g0_03.apache.xml.resource.security.");
		    System.setProperty("Test10g0ss10g0_04",
					"Test10g0ss10g0_04.resource.");
			System.setProperty("Test10g0ss10g0_05",
					"Test10g0ss10g0_05.isInitialized");
			System.setProperty("Test10g0ss10g0_06",
					"Test10g0ss10g0_06_10g0Init.class/jcp.xml");
			System.setProperty("Test10g0ss10g0_07",
					"Test10g0ss10g0_07t/resource/jcp.xml");
         	System.setProperty("Test10g0ss10g0_08",
					"Test10g0ss10g0_08.config");
			System.setProperty("Test10g0ss10g0_09",
					"Test10g0ss10g0_09.security.");
		    System.setProperty("Test10g0ss10g0_0x0",
					"Test10g0ss10g0_0x0jcp.xmlapache.");
			System.setProperty("Test10g0ss10g0_0xx0",
					"Test10g0ss10g0_0xx0.isInitialized");
			System.setProperty("Test10g0ss10g0_0xxx0",
					"Test10g0ss10g0_0xxx0est10g0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10g05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10g0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10g0 != null) {
				 
				LOGGER.debug("in0in isTest10g0");
				LOGGER.debug("in10gin isTest10g0");
				LOGGER.debug("in2in isTest10g0");
				LOGGER.debug("in3in isTest10g0");
				LOGGER.debug("in4in isTest10g0");
				LOGGER.debug("in5in isTest10g0");
				LOGGER.debug("in6in isTest10g0");
				LOGGER.debug("in7in isTest10g0");
				LOGGER.debug("in8in isTest10g0");
				LOGGER.debug("in9in isTest10g0");
				LOGGER.debug("in10g0in isTest10g0");
				LOGGER.debug("in10g10gin isTest10g0");
				LOGGER.debug("in10g2in isTest10g0");
				LOGGER.debug("in10g3in isTest10g0");
				LOGGER.debug("in10g4in isTest10g0");
				LOGGER.debug("in10g5in isTest10g0");
				LOGGER.debug("in10g6in isTest10g0");
				LOGGER.debug("in10g7in isTest10g0");
				LOGGER.debug("in10g8in isTest10g0");
				LOGGER.debug("in10g9in isTest10g0");
				LOGGER.debug("in20in isTest10g0");
			}

			 

			DocumentBuilderFactory dbfTest10g0 = DocumentBuilderFactory.newInstance();
			dbfTest10g0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10g0.setNamespaceAware(true);
			dbfTest10g0.setValidating(false);

			DocumentBuilder db = dbfTest10g0.newDocumentBuilder();
			Document doc = db.parse(isTest10g0);
			Node configTest10g0 = doc.getFirstChild();
			while ((configTest10g0 != null)
					&& (!"Configuration".equals(configTest10g0.getLocalName()))) {
				configTest10g0 = configTest10g0.getNextSibling();
			}

			if (configTest10g0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10g0!=null?configTest10g0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10g0 = (Element) el;

					Attr langAttr = resourceTest10g0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10g0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10g0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10g0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10g0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10g0.length; i++) {
						String uri = listTest10g0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10g0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10g0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10g0.length; i++) {
						String uritrans = tranElemTest10g0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10g0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10g0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10g0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10g0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10g0 = algorithms[i];
							String id = elementTest10g0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10g0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10g0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10g0.length; i++) {
						String urisign = sigElemsTest10g0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10g0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10g0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10g0.length; i++) {
						String javaclass = resolverElemTest10g0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10g0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10g0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10g0Register Resolver:10g: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10g0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10g0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10g0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest10g0 = new ArrayList<String>(resolverElemTest10g0.length);
					for (int i = 0; i < resolverElemTest10g0.length; i++) {
						String javaclass = resolverElemTest10g0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10g0 = resolverElemTest10g0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10g0 != null) && (descriptionTest10g0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10g0);
								LOGGER.debug("Register Resolver-10g: " + javaclass
										+ ": " + descriptionTest10g0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10g0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10g0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10g0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10g0.length; i++) {
						String namespace = nlTest10g0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10g0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10g0 ) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", exs10g0);
 } catch (ClassNotFoundException enf10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", enf10g0);
 } catch (IllegalAccessException eia10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", eia10g0);
 } catch (InstantiationException e10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", e10g0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", epc10g0);
 } catch (org.xml.sax.SAXException ese10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", ese10g0);
 } catch (java.io.IOException eio10g0) {
 LOGGER.error("Crypto10g0Init:fileInit:error: ", eio10g0);
 }

	}

}
