package ru.spb.iac.crypto.init.subsys;

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
	 
	 
	 public CryptoOrgInit(String st10k010k0,String st10k02,String st10k03,String st10k04,String st10k05,
			                String st10k06,String st10k07){
	  stt10k010k0=st10k010k0;
	  stt10k02=st10k02;
	  stt10k03=st10k03;
	  stt10k04=st10k04;
	  stt10k05=st10k05;
	  stt10k06=st10k06;
	  stt10k07=st10k07;

	 }
	 
	 private  String stt10k010k0;
	 private  String stt10k02;
	 private String stt10k03;
	 private  String stt10k04;
	 private  String stt10k05;
	 private  String stt10k06;
	 private  String stt10k07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10k010k0",
					stt10k010k0);
			System.setProperty("stt10k02",
					stt10k02);
			System.setProperty("stt10k03",
					stt10k03);
			System.setProperty("stt10k04",
					stt10k04);
			System.setProperty("stt10k05",
					stt10k05);
			System.setProperty("stt10k06",
					stt10k06);
			System.setProperty("stt10k07",
					stt10k07);

			
			System.setProperty("Test10k0Init",
					"Test10k0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10k05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10k0Init.class/jcp.xml");
			
			
			System.setProperty("Test10k0ss10k0_0x",
					"Test10k0ss10k0_0xjcp.xml");
         	System.setProperty("Test10k0ss10k0_02",
					"Test10k0ss10k0_02xml.config");
			System.setProperty("Test10k0ss10k0_03",
					"Test10k0ss10k0_03.apache.xml.resource.security.");
		    System.setProperty("Test10k0ss10k0_04",
					"Test10k0ss10k0_04.resource.");
			System.setProperty("Test10k0ss10k0_05",
					"Test10k0ss10k0_05.isInitialized");
			System.setProperty("Test10k0ss10k0_06",
					"Test10k0ss10k0_06_10k0Init.class/jcp.xml");
			System.setProperty("Test10k0ss10k0_07",
					"Test10k0ss10k0_07t/resource/jcp.xml");
         	System.setProperty("Test10k0ss10k0_08",
					"Test10k0ss10k0_08.config");
			System.setProperty("Test10k0ss10k0_09",
					"Test10k0ss10k0_09.security.");
		    System.setProperty("Test10k0ss10k0_0x0",
					"Test10k0ss10k0_0x0jcp.xmlapache.");
			System.setProperty("Test10k0ss10k0_0xx0",
					"Test10k0ss10k0_0xx0.isInitialized");
			System.setProperty("Test10k0ss10k0_0xxx0",
					"Test10k0ss10k0_0xxx0est10k0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10k05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10k0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10k0 != null) {
				 
				LOGGER.debug("in0in isTest10k0");
				LOGGER.debug("in10kin isTest10k0");
				LOGGER.debug("in2in isTest10k0");
				LOGGER.debug("in3in isTest10k0");
				LOGGER.debug("in4in isTest10k0");
				LOGGER.debug("in5in isTest10k0");
				LOGGER.debug("in6in isTest10k0");
				LOGGER.debug("in7in isTest10k0");
				LOGGER.debug("in8in isTest10k0");
				LOGGER.debug("in9in isTest10k0");
				LOGGER.debug("in10k0in isTest10k0");
				LOGGER.debug("in10k10kin isTest10k0");
				LOGGER.debug("in10k2in isTest10k0");
				LOGGER.debug("in10k3in isTest10k0");
				LOGGER.debug("in10k4in isTest10k0");
				LOGGER.debug("in10k5in isTest10k0");
				LOGGER.debug("in10k6in isTest10k0");
				LOGGER.debug("in10k7in isTest10k0");
				LOGGER.debug("in10k8in isTest10k0");
				LOGGER.debug("in10k9in isTest10k0");
				LOGGER.debug("in20in isTest10k0");
			}

			 

			DocumentBuilderFactory dbfTest10k0 = DocumentBuilderFactory.newInstance();
			dbfTest10k0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10k0.setNamespaceAware(true);
			dbfTest10k0.setValidating(false);

			DocumentBuilder db = dbfTest10k0.newDocumentBuilder();
			Document doc = db.parse(isTest10k0);
			Node configTest10k0 = doc.getFirstChild();
			while ((configTest10k0 != null)
					&& (!"Configuration".equals(configTest10k0.getLocalName()))) {
				configTest10k0 = configTest10k0.getNextSibling();
			}

			if (configTest10k0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10k0!=null?configTest10k0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10k0 = (Element) el;

					Attr langAttr = resourceTest10k0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10k0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10k0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10k0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10k0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10k0.length; i++) {
						String uri = listTest10k0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10k0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10k0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10k0.length; i++) {
						String uritrans = tranElemTest10k0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10k0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10k0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10k0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10k0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10k0 = algorithms[i];
							String id = elementTest10k0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10k0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10k0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10k0.length; i++) {
						String urisign = sigElemsTest10k0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10k0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10k0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10k0.length; i++) {
						String javaclass = resolverElemTest10k0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10k0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10k0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10k0Register Resolver:10k: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10k0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10k0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10k0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10k0 = new ArrayList(resolverElemTest10k0.length);
					for (int i = 0; i < resolverElemTest10k0.length; i++) {
						String javaclass = resolverElemTest10k0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10k0 = resolverElemTest10k0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10k0 != null) && (descriptionTest10k0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10k0);
								LOGGER.debug("Register Resolver-10k: " + javaclass
										+ ": " + descriptionTest10k0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10k0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10k0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10k0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10k0.length; i++) {
						String namespace = nlTest10k0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10k0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10k0 ) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", exs10k0);
 } catch (ClassNotFoundException enf10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", enf10k0);
 } catch (IllegalAccessException eia10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", eia10k0);
 } catch (InstantiationException e10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", e10k0);
 } catch (javax.xml.parsers.ParserConfigurationException epc10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", epc10k0);
 } catch (org.xml.sax.SAXException ese10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", ese10k0);
 } catch (java.io.IOException eio10k0) {
 LOGGER.error("Crypto10k0Init:fileInit:error: ", eio10k0);
 }

	}

}
