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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9j1,String st9j2,String st9j3,String st9j4,String st9j5,
			                String st9j6,String st9j7){
	  stt9j1=st9j1;
	  stt9j2=st9j2;
	  stt9j3=st9j3;
	  stt9j4=st9j4;
	  stt9j5=st9j5;
	  stt9j6=st9j6;
	  stt9j7=st9j7;

	 }
	 
	 private  String stt9j1;
	 private  String stt9j2;
	 private String stt9j3;
	 private  String stt9j4;
	 private  String stt9j5;
	 private  String stt9j6;
	 private  String stt9j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9j1",
					stt9j1);
			System.setProperty("stt9j2",
					stt9j2);
			System.setProperty("stt9j3",
					stt9j3);
			System.setProperty("stt9j4",
					stt9j4);
			System.setProperty("stt9j5",
					stt9j5);
			System.setProperty("stt9j6",
					stt9j6);
			System.setProperty("stt9j7",
					stt9j7);

			
			System.setProperty("Test9jInit",
					"Test9jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9jInit.class/jcp.xml");
			
			
			System.setProperty("Test9jss9j_0x",
					"Test9jss9j_0xjcp.xml");
         	System.setProperty("Test9jss9j_02",
					"Test9jss9j_02xml.config");
			System.setProperty("Test9jss9j_03",
					"Test9jss9j_03.apache.xml.resource.security.");
		    System.setProperty("Test9jss9j_04",
					"Test9jss9j_04.resource.");
			System.setProperty("Test9jss9j_05",
					"Test9jss9j_05.isInitialized");
			System.setProperty("Test9jss9j_06",
					"Test9jss9j_06_9jInit.class/jcp.xml");
			System.setProperty("Test9jss9j_07",
					"Test9jss9j_07t/resource/jcp.xml");
         	System.setProperty("Test9jss9j_08",
					"Test9jss9j_08.config");
			System.setProperty("Test9jss9j_09j",
					"Test9jss9j_09j.security.");
		    System.setProperty("Test9jss9j_0x0",
					"Test9jss9j_0x0jcp.xmlapache.");
			System.setProperty("Test9jss9j_0xx0",
					"Test9jss9j_0xx0.isInitialized");
			System.setProperty("Test9jss9j_0xxx0",
					"Test9jss9j_0xxx0est9jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9j = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9j != null) {
				 
				LOGGER.debug("in0in isTest9j");
				LOGGER.debug("inxin isTest9j");
				LOGGER.debug("in2in isTest9j");
				LOGGER.debug("in3in isTest9j");
				LOGGER.debug("in4in isTest9j");
				LOGGER.debug("in5in isTest9j");
				LOGGER.debug("in6in isTest9j");
				LOGGER.debug("in7in isTest9j");
				LOGGER.debug("in8in isTest9j");
				LOGGER.debug("in9jin isTest9j");
				LOGGER.debug("inx0in isTest9j");
				LOGGER.debug("inxxin isTest9j");
				LOGGER.debug("inx2in isTest9j");
				LOGGER.debug("inx3in isTest9j");
				LOGGER.debug("inx4in isTest9j");
				LOGGER.debug("inx5in isTest9j");
				LOGGER.debug("inx6in isTest9j");
				LOGGER.debug("inx7in isTest9j");
				LOGGER.debug("inx8in isTest9j");
				LOGGER.debug("inx9jin isTest9j");
				LOGGER.debug("in20in isTest9j");
			}

			 

			DocumentBuilderFactory dbfTest9j = DocumentBuilderFactory.newInstance();
			dbfTest9j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9j.setNamespaceAware(true);
			dbfTest9j.setValidating(false);

			DocumentBuilder db = dbfTest9j.newDocumentBuilder();
			Document doc = db.parse(isTest9j);
			Node configTest9j = doc.getFirstChild();
			while ((configTest9j != null)
					&& (!"Configuration".equals(configTest9j.getLocalName()))) {
				configTest9j = configTest9j.getNextSibling();
			}

			if (configTest9j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9j!=null?configTest9j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9j = (Element) el;

					Attr langAttr = resourceTest9j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9j.length; i++) {
						String uri = listTest9j[i].getAttributeNS(null, "URI");
						String javaclass = listTest9j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9j.length; i++) {
						String uritrans = tranElemTest9j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9j = algorithms[i];
							String id = elementTest9j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9j.length; i++) {
						String urisign = sigElemsTest9j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9j.length; i++) {
						String javaclass = resolverElemTest9j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9jRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9j = new ArrayList<String>(resolverElemTest9j.length);
					for (int i = 0; i < resolverElemTest9j.length; i++) {
						String javaclass = resolverElemTest9j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9j = resolverElemTest9j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9j != null) && (descriptionTest9j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9j);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9j);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9j.length; i++) {
						String namespace = nlTest9j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9j ) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", exs9j);
 } catch (ClassNotFoundException enf9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", enf9j);
 } catch (IllegalAccessException eia9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", eia9j);
 } catch (InstantiationException e9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", e9j);
 } catch (javax.xml.parsers.ParserConfigurationException epc9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", epc9j);
 } catch (org.xml.sax.SAXException ese9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", ese9j);
 } catch (java.io.IOException eio9j) {
 LOGGER.error("Crypto9jInit:fileInit:error: ", eio9j);
 }

	}

}
