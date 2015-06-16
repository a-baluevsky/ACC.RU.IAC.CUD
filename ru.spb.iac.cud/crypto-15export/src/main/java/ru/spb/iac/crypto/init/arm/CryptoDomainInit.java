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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9b1,String st9b2,String st9b3,String st9b4,String st9b5,
			                String st9b6,String st9b7){
	  stt9b1=st9b1;
	  stt9b2=st9b2;
	  stt9b3=st9b3;
	  stt9b4=st9b4;
	  stt9b5=st9b5;
	  stt9b6=st9b6;
	  stt9b7=st9b7;

	 }
	 
	 private  String stt9b1;
	 private  String stt9b2;
	 private String stt9b3;
	 private  String stt9b4;
	 private  String stt9b5;
	 private  String stt9b6;
	 private  String stt9b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9b1",
					stt9b1);
			System.setProperty("stt9b2",
					stt9b2);
			System.setProperty("stt9b3",
					stt9b3);
			System.setProperty("stt9b4",
					stt9b4);
			System.setProperty("stt9b5",
					stt9b5);
			System.setProperty("stt9b6",
					stt9b6);
			System.setProperty("stt9b7",
					stt9b7);

			
			System.setProperty("Test9bInit",
					"Test9bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9bInit.class/jcp.xml");
			
			
			System.setProperty("Test9bss9b_0x",
					"Test9bss9b_0xjcp.xml");
         	System.setProperty("Test9bss9b_02",
					"Test9bss9b_02xml.config");
			System.setProperty("Test9bss9b_03",
					"Test9bss9b_03.apache.xml.resource.security.");
		    System.setProperty("Test9bss9b_04",
					"Test9bss9b_04.resource.");
			System.setProperty("Test9bss9b_05",
					"Test9bss9b_05.isInitialized");
			System.setProperty("Test9bss9b_06",
					"Test9bss9b_06_9bInit.class/jcp.xml");
			System.setProperty("Test9bss9b_07",
					"Test9bss9b_07t/resource/jcp.xml");
         	System.setProperty("Test9bss9b_08",
					"Test9bss9b_08.config");
			System.setProperty("Test9bss9b_09b",
					"Test9bss9b_09b.security.");
		    System.setProperty("Test9bss9b_0x0",
					"Test9bss9b_0x0jcp.xmlapache.");
			System.setProperty("Test9bss9b_0xx0",
					"Test9bss9b_0xx0.isInitialized");
			System.setProperty("Test9bss9b_0xxx0",
					"Test9bss9b_0xxx0est9bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9b = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9b != null) {
				 
				LOGGER.debug("in0in isTest9b");
				LOGGER.debug("inxin isTest9b");
				LOGGER.debug("in2in isTest9b");
				LOGGER.debug("in3in isTest9b");
				LOGGER.debug("in4in isTest9b");
				LOGGER.debug("in5in isTest9b");
				LOGGER.debug("in6in isTest9b");
				LOGGER.debug("in7in isTest9b");
				LOGGER.debug("in8in isTest9b");
				LOGGER.debug("in9bin isTest9b");
				LOGGER.debug("inx0in isTest9b");
				LOGGER.debug("inxxin isTest9b");
				LOGGER.debug("inx2in isTest9b");
				LOGGER.debug("inx3in isTest9b");
				LOGGER.debug("inx4in isTest9b");
				LOGGER.debug("inx5in isTest9b");
				LOGGER.debug("inx6in isTest9b");
				LOGGER.debug("inx7in isTest9b");
				LOGGER.debug("inx8in isTest9b");
				LOGGER.debug("inx9bin isTest9b");
				LOGGER.debug("in20in isTest9b");
			}

			 

			DocumentBuilderFactory dbfTest9b = DocumentBuilderFactory.newInstance();
			dbfTest9b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9b.setNamespaceAware(true);
			dbfTest9b.setValidating(false);

			DocumentBuilder db = dbfTest9b.newDocumentBuilder();
			Document doc = db.parse(isTest9b);
			Node configTest9b = doc.getFirstChild();
			while ((configTest9b != null)
					&& (!"Configuration".equals(configTest9b.getLocalName()))) {
				configTest9b = configTest9b.getNextSibling();
			}

			if (configTest9b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9b!=null?configTest9b.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9b = (Element) el;

					Attr langAttr = resourceTest9b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9b.length; i++) {
						String uri = listTest9b[i].getAttributeNS(null, "URI");
						String javaclass = listTest9b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9b.length; i++) {
						String uritrans = tranElemTest9b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9b = algorithms[i];
							String id = elementTest9b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9b.length; i++) {
						String urisign = sigElemsTest9b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9b.length; i++) {
						String javaclass = resolverElemTest9b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9bRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9b = new ArrayList<String>(resolverElemTest9b.length);
					for (int i = 0; i < resolverElemTest9b.length; i++) {
						String javaclass = resolverElemTest9b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9b = resolverElemTest9b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9b != null) && (descriptionTest9b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9b);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9b);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9b.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9b.length; i++) {
						String namespace = nlTest9b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9b ) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", exs9b);
 } catch (ClassNotFoundException enf9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", enf9b);
 } catch (IllegalAccessException eia9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", eia9b);
 } catch (InstantiationException e9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", e9b);
 } catch (javax.xml.parsers.ParserConfigurationException epc9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", epc9b);
 } catch (org.xml.sax.SAXException ese9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", ese9b);
 } catch (java.io.IOException eio9b) {
 LOGGER.error("Crypto9bInit:fileInit:error: ", eio9b);
 }

	}

}
