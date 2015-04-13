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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6j1,String st6j2,String st6j3,String st6j4,String st6j5,
			                String st6j6j,String st6j7){
	  stt6j1=st6j1;
	  stt6j2=st6j2;
	  stt6j3=st6j3;
	  stt6j4=st6j4;
	  stt6j5=st6j5;
	  stt6j6j=st6j6j;
	  stt6j7=st6j7;

	 }
	 
	 private  String stt6j1;
	 private  String stt6j2;
	 private String stt6j3;
	 private  String stt6j4;
	 private  String stt6j5;
	 private  String stt6j6j;
	 private  String stt6j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6j1",
					stt6j1);
			System.setProperty("stt6j2",
					stt6j2);
			System.setProperty("stt6j3",
					stt6j3);
			System.setProperty("stt6j4",
					stt6j4);
			System.setProperty("stt6j5",
					stt6j5);
			System.setProperty("stt6j6j",
					stt6j6j);
			System.setProperty("stt6j7",
					stt6j7);

			
			System.setProperty("Test6jInit",
					"Test6jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6jInit.class/jcp.xml");
			
			System.setProperty("Test6jss6j_0x",
					"Test6jss6j_0xjcp.xml");
         	System.setProperty("Test6jss6j_02",
					"Test6jss6j_02xml.config");
			System.setProperty("Test6jss6j_03",
					"Test6jss6j_03.apache.xml.resource.security.");
		    System.setProperty("Test6jss6j_04",
					"Test6jss6j_04.resource.");
			System.setProperty("Test6jss6j_05",
					"Test6jss6j_05.isInitialized");
			System.setProperty("Test6jss6j_06j",
					"Test6jss6j_06j_6jInit.class/jcp.xml");
			System.setProperty("Test6jss6j_07",
					"Test6jss6j_07t/resource/jcp.xml");
         	System.setProperty("Test6jss6j_08",
					"Test6jss6j_08.config");
			System.setProperty("Test6jss6j_09",
					"Test6jss6j_09.security.");
		    System.setProperty("Test6jss6j_0x0",
					"Test6jss6j_0x0jcp.xmlapache.");
			System.setProperty("Test6jss6j_0xx0",
					"Test6jss6j_0xx0.isInitialized");
			System.setProperty("Test6jss6j_0xxx0",
					"Test6jss6j_0xxx0est6jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6j = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6j != null) {
				 
				LOGGER.debug("in0in isTest6j");
				LOGGER.debug("inxin isTest6j");
				LOGGER.debug("in2in isTest6j");
				LOGGER.debug("in3in isTest6j");
				LOGGER.debug("in4in isTest6j");
				LOGGER.debug("in5in isTest6j");
				LOGGER.debug("in6jin isTest6j");
				LOGGER.debug("in7in isTest6j");
				LOGGER.debug("in8in isTest6j");
				LOGGER.debug("in9in isTest6j");
				LOGGER.debug("inx0in isTest6j");
				LOGGER.debug("inxxin isTest6j");
				LOGGER.debug("inx2in isTest6j");
				LOGGER.debug("inx3in isTest6j");
				LOGGER.debug("inx4in isTest6j");
				LOGGER.debug("inx5in isTest6j");
				LOGGER.debug("inx6jin isTest6j");
				LOGGER.debug("inx7in isTest6j");
				LOGGER.debug("inx8in isTest6j");
				LOGGER.debug("inx9in isTest6j");
				LOGGER.debug("in20in isTest6j");
			}

			 

			DocumentBuilderFactory dbfTest6j = DocumentBuilderFactory.newInstance();
			dbfTest6j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6j.setNamespaceAware(true);
			dbfTest6j.setValidating(false);

			DocumentBuilder db = dbfTest6j.newDocumentBuilder();
			Document doc = db.parse(isTest6j);
			Node configTest6j = doc.getFirstChild();
			while ((configTest6j != null)
					&& (!"Configuration".equals(configTest6j.getLocalName()))) {
				configTest6j = configTest6j.getNextSibling();
			}

			if (configTest6j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6j!=null?configTest6j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6j = (Element) el;

					Attr langAttr = resourceTest6j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6j.length; i++) {
						String uri = listTest6j[i].getAttributeNS(null, "URI");
						String javaclass = listTest6j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6j.length; i++) {
						String uritrans = tranElemTest6j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6j = algorithms[i];
							String id = elementTest6j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6j.length; i++) {
						String urisign = sigElemsTest6j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6j.length; i++) {
						String javaclass = resolverElemTest6j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6jRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6jRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6j = new ArrayList(resolverElemTest6j.length);
					for (int i = 0; i < resolverElemTest6j.length; i++) {
						String javaclass = resolverElemTest6j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6j = resolverElemTest6j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6j != null) && (descriptionTest6j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6j);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6j);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6j.length; i++) {
						String namespace = nlTest6j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6j ) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", exs6j);
 } catch (ClassNotFoundException enf6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", enf6j);
 } catch (IllegalAccessException eia6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", eia6j);
 } catch (InstantiationException e6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", e6j);
 } catch (javax.xml.parsers.ParserConfigurationException epc6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", epc6j);
 } catch (org.xml.sax.SAXException ese6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", ese6j);
 } catch (java.io.IOException eio6j) {
 LOGGER.error("Crypto6jInit:fileInit:error: ", eio6j);
 }

	}

}
