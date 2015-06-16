package ru.spb.iac.crypto.init;

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
	 
	 
	 public CryptoOrgInit(String st1010,String st102,String st103,String st104,String st105,
			                String st106,String st107){
	  stt1010=st1010;
	  stt102=st102;
	  stt103=st103;
	  stt104=st104;
	  stt105=st105;
	  stt106=st106;
	  stt107=st107;

	 }
	 
	 private  String stt1010;
	 private  String stt102;
	 private String stt103;
	 private  String stt104;
	 private  String stt105;
	 private  String stt106;
	 private  String stt107;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1010",
					stt1010);
			System.setProperty("stt102",
					stt102);
			System.setProperty("stt103",
					stt103);
			System.setProperty("stt104",
					stt104);
			System.setProperty("stt105",
					stt105);
			System.setProperty("stt106",
					stt106);
			System.setProperty("stt107",
					stt107);

			
			System.setProperty("Test10Init",
					"Test10Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto105Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoOrgInit.class/jcp.xml");
			
			
			System.setProperty("Test10ss10_0x",
					"Test10ss10_0xjcp.xml");
         	System.setProperty("Test10ss10_02",
					"Test10ss10_02xml.config");
			System.setProperty("Test10ss10_03",
					"Test10ss10_03.apache.xml.resource.security.");
		    System.setProperty("Test10ss10_04",
					"Test10ss10_04.resource.");
			System.setProperty("Test10ss10_05",
					"Test10ss10_05.isInitialized");
			System.setProperty("Test10ss10_06",
					"Test10ss10_06_10Init.class/jcp.xml");
			System.setProperty("Test10ss10_07",
					"Test10ss10_07t/resource/jcp.xml");
         	System.setProperty("Test10ss10_08",
					"Test10ss10_08.config");
			System.setProperty("Test10ss10_09",
					"Test10ss10_09.security.");
		    System.setProperty("Test10ss10_0x0",
					"Test10ss10_0x0jcp.xmlapache.");
			System.setProperty("Test10ss10_0xx0",
					"Test10ss10_0xx0.isInitialized");
			System.setProperty("Test10ss10_0xxx0",
					"Test10ss10_0xxx0est10Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto105Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10 != null) {
				 
				LOGGER.debug("in0in isTest10");
				LOGGER.debug("in1in isTest10");
				LOGGER.debug("in2in isTest10");
				LOGGER.debug("in3in isTest10");
				LOGGER.debug("in4in isTest10");
				LOGGER.debug("in5in isTest10");
				LOGGER.debug("in6in isTest10");
				LOGGER.debug("in7in isTest10");
				LOGGER.debug("in8in isTest10");
				LOGGER.debug("in9in isTest10");
				LOGGER.debug("in10in isTest10");
				LOGGER.debug("in11in isTest10");
				LOGGER.debug("in12in isTest10");
				LOGGER.debug("in13in isTest10");
				LOGGER.debug("in14in isTest10");
				LOGGER.debug("in15in isTest10");
				LOGGER.debug("in16in isTest10");
				LOGGER.debug("in17in isTest10");
				LOGGER.debug("in18in isTest10");
				LOGGER.debug("in19in isTest10");
				LOGGER.debug("in20in isTest10");
			}

			 

			DocumentBuilderFactory dbfTest10 = DocumentBuilderFactory.newInstance();
			dbfTest10.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10.setNamespaceAware(true);
			dbfTest10.setValidating(false);

			DocumentBuilder db = dbfTest10.newDocumentBuilder();
			Document doc = db.parse(isTest10);
			Node configTest10 = doc.getFirstChild();
			while ((configTest10 != null)
					&& (!"Configuration".equals(configTest10.getLocalName()))) {
				configTest10 = configTest10.getNextSibling();
			}

			if (configTest10 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10!=null?configTest10.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10 = (Element) el;

					Attr langAttr = resourceTest10
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10.length; i++) {
						String uri = listTest10[i].getAttributeNS(null, "URI");
						String javaclass = listTest10[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10.length; i++) {
						String uritrans = tranElemTest10[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10 = algorithms[i];
							String id = elementTest10.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10.length; i++) {
						String urisign = sigElemsTest10[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10.length; i++) {
						String javaclass = resolverElemTest10[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10Register Resolver:1: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest10 = new ArrayList<String>(resolverElemTest10.length);
					for (int i = 0; i < resolverElemTest10.length; i++) {
						String javaclass = resolverElemTest10[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10 = resolverElemTest10[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10 != null) && (descriptionTest10.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10);
								LOGGER.debug("Register Resolver-1: " + javaclass
										+ ": " + descriptionTest10);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest10);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10.length; i++) {
						String namespace = nlTest10[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs10 ) {
 LOGGER.error("Crypto10Init:fileInit:error: ", exs10);
 } catch (ClassNotFoundException enf10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", enf10);
 } catch (IllegalAccessException eia10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", eia10);
 } catch (InstantiationException e10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", e10);
 } catch (javax.xml.parsers.ParserConfigurationException epc10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", epc10);
 } catch (org.xml.sax.SAXException ese10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", ese10);
 } catch (java.io.IOException eio10) {
 LOGGER.error("Crypto10Init:fileInit:error: ", eio10);
 }

	}

}
