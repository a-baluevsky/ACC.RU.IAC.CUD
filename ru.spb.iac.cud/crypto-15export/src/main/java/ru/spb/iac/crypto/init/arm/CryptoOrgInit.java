package ru.spb.iac.crypto.init.arm;

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
	 
	 
	 public CryptoOrgInit(String st1b01b0,String st1b02,String st1b03,String st1b04,String st1b05,
			                String st1b06,String st1b07){
	  stt1b01b0=st1b01b0;
	  stt1b02=st1b02;
	  stt1b03=st1b03;
	  stt1b04=st1b04;
	  stt1b05=st1b05;
	  stt1b06=st1b06;
	  stt1b07=st1b07;

	 }
	 
	 private  String stt1b01b0;
	 private  String stt1b02;
	 private String stt1b03;
	 private  String stt1b04;
	 private  String stt1b05;
	 private  String stt1b06;
	 private  String stt1b07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1b01b0",
					stt1b01b0);
			System.setProperty("stt1b02",
					stt1b02);
			System.setProperty("stt1b03",
					stt1b03);
			System.setProperty("stt1b04",
					stt1b04);
			System.setProperty("stt1b05",
					stt1b05);
			System.setProperty("stt1b06",
					stt1b06);
			System.setProperty("stt1b07",
					stt1b07);

			
			System.setProperty("Test1b0Init",
					"Test1b0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1b05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1b0Init.class/jcp.xml");
			
			
			System.setProperty("Test1b0ss1b0_0x",
					"Test1b0ss1b0_0xjcp.xml");
         	System.setProperty("Test1b0ss1b0_02",
					"Test1b0ss1b0_02xml.config");
			System.setProperty("Test1b0ss1b0_03",
					"Test1b0ss1b0_03.apache.xml.resource.security.");
		    System.setProperty("Test1b0ss1b0_04",
					"Test1b0ss1b0_04.resource.");
			System.setProperty("Test1b0ss1b0_05",
					"Test1b0ss1b0_05.isInitialized");
			System.setProperty("Test1b0ss1b0_06",
					"Test1b0ss1b0_06_1b0Init.class/jcp.xml");
			System.setProperty("Test1b0ss1b0_07",
					"Test1b0ss1b0_07t/resource/jcp.xml");
         	System.setProperty("Test1b0ss1b0_08",
					"Test1b0ss1b0_08.config");
			System.setProperty("Test1b0ss1b0_09",
					"Test1b0ss1b0_09.security.");
		    System.setProperty("Test1b0ss1b0_0x0",
					"Test1b0ss1b0_0x0jcp.xmlapache.");
			System.setProperty("Test1b0ss1b0_0xx0",
					"Test1b0ss1b0_0xx0.isInitialized");
			System.setProperty("Test1b0ss1b0_0xxx0",
					"Test1b0ss1b0_0xxx0est1b0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1b05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1b0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1b0 != null) {
				 
				LOGGER.debug("in0in isTest1b0");
				LOGGER.debug("in1bin isTest1b0");
				LOGGER.debug("in2in isTest1b0");
				LOGGER.debug("in3in isTest1b0");
				LOGGER.debug("in4in isTest1b0");
				LOGGER.debug("in5in isTest1b0");
				LOGGER.debug("in6in isTest1b0");
				LOGGER.debug("in7in isTest1b0");
				LOGGER.debug("in8in isTest1b0");
				LOGGER.debug("in9in isTest1b0");
				LOGGER.debug("in1b0in isTest1b0");
				LOGGER.debug("in1b1bin isTest1b0");
				LOGGER.debug("in1b2in isTest1b0");
				LOGGER.debug("in1b3in isTest1b0");
				LOGGER.debug("in1b4in isTest1b0");
				LOGGER.debug("in1b5in isTest1b0");
				LOGGER.debug("in1b6in isTest1b0");
				LOGGER.debug("in1b7in isTest1b0");
				LOGGER.debug("in1b8in isTest1b0");
				LOGGER.debug("in1b9in isTest1b0");
				LOGGER.debug("in20in isTest1b0");
			}

			 

			DocumentBuilderFactory dbfTest1b0 = DocumentBuilderFactory.newInstance();
			dbfTest1b0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1b0.setNamespaceAware(true);
			dbfTest1b0.setValidating(false);

			DocumentBuilder db = dbfTest1b0.newDocumentBuilder();
			Document doc = db.parse(isTest1b0);
			Node configTest1b0 = doc.getFirstChild();
			while ((configTest1b0 != null)
					&& (!"Configuration".equals(configTest1b0.getLocalName()))) {
				configTest1b0 = configTest1b0.getNextSibling();
			}

			if (configTest1b0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1b0!=null?configTest1b0.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1b0 = (Element) el;

					Attr langAttr = resourceTest1b0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1b0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1b0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1b0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1b0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1b0.length; i++) {
						String uri = listTest1b0[i].getAttributeNS(null, "URI");
						String javaclass = listTest1b0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1b0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1b0.length; i++) {
						String uritrans = tranElemTest1b0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1b0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1b0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1b0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1b0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1b0 = algorithms[i];
							String id = elementTest1b0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1b0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1b0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1b0.length; i++) {
						String urisign = sigElemsTest1b0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1b0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1b0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1b0.length; i++) {
						String javaclass = resolverElemTest1b0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1b0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test1b0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test1b0Register Resolver:1b: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1b0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1b0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1b0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1b0 = new ArrayList(resolverElemTest1b0.length);
					for (int i = 0; i < resolverElemTest1b0.length; i++) {
						String javaclass = resolverElemTest1b0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1b0 = resolverElemTest1b0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1b0 != null) && (descriptionTest1b0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest1b0);
								LOGGER.debug("Register Resolver-1b: " + javaclass
										+ ": " + descriptionTest1b0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1b0.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1b0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1b0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1b0.length; i++) {
						String namespace = nlTest1b0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1b0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1b0 ) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", exs1b0);
 } catch (ClassNotFoundException enf1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", enf1b0);
 } catch (IllegalAccessException eia1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", eia1b0);
 } catch (InstantiationException e1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", e1b0);
 } catch (javax.xml.parsers.ParserConfigurationException epc1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", epc1b0);
 } catch (org.xml.sax.SAXException ese1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", ese1b0);
 } catch (java.io.IOException eio1b0) {
 LOGGER.error("Crypto1b0Init:fileInit:error: ", eio1b0);
 }

	}

}
