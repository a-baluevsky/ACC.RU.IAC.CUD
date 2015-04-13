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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9p1,String st9p2,String st9p3,String st9p4,String st9p5,
			                String st9p6,String st9p7){
	  stt9p1=st9p1;
	  stt9p2=st9p2;
	  stt9p3=st9p3;
	  stt9p4=st9p4;
	  stt9p5=st9p5;
	  stt9p6=st9p6;
	  stt9p7=st9p7;

	 }
	 
	 private  String stt9p1;
	 private  String stt9p2;
	 private String stt9p3;
	 private  String stt9p4;
	 private  String stt9p5;
	 private  String stt9p6;
	 private  String stt9p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9p1",
					stt9p1);
			System.setProperty("stt9p2",
					stt9p2);
			System.setProperty("stt9p3",
					stt9p3);
			System.setProperty("stt9p4",
					stt9p4);
			System.setProperty("stt9p5",
					stt9p5);
			System.setProperty("stt9p6",
					stt9p6);
			System.setProperty("stt9p7",
					stt9p7);

			
			System.setProperty("Test9pInit",
					"Test9pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9pInit.class/jcp.xml");
			
			
			System.setProperty("Test9pss9p_0x",
					"Test9pss9p_0xjcp.xml");
         	System.setProperty("Test9pss9p_02",
					"Test9pss9p_02xml.config");
			System.setProperty("Test9pss9p_03",
					"Test9pss9p_03.apache.xml.resource.security.");
		    System.setProperty("Test9pss9p_04",
					"Test9pss9p_04.resource.");
			System.setProperty("Test9pss9p_05",
					"Test9pss9p_05.isInitialized");
			System.setProperty("Test9pss9p_06",
					"Test9pss9p_06_9pInit.class/jcp.xml");
			System.setProperty("Test9pss9p_07",
					"Test9pss9p_07t/resource/jcp.xml");
         	System.setProperty("Test9pss9p_08",
					"Test9pss9p_08.config");
			System.setProperty("Test9pss9p_09p",
					"Test9pss9p_09p.security.");
		    System.setProperty("Test9pss9p_0x0",
					"Test9pss9p_0x0jcp.xmlapache.");
			System.setProperty("Test9pss9p_0xx0",
					"Test9pss9p_0xx0.isInitialized");
			System.setProperty("Test9pss9p_0xxx0",
					"Test9pss9p_0xxx0est9pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9p = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9p != null) {
				 
				LOGGER.debug("in0in isTest9p");
				LOGGER.debug("inxin isTest9p");
				LOGGER.debug("in2in isTest9p");
				LOGGER.debug("in3in isTest9p");
				LOGGER.debug("in4in isTest9p");
				LOGGER.debug("in5in isTest9p");
				LOGGER.debug("in6in isTest9p");
				LOGGER.debug("in7in isTest9p");
				LOGGER.debug("in8in isTest9p");
				LOGGER.debug("in9pin isTest9p");
				LOGGER.debug("inx0in isTest9p");
				LOGGER.debug("inxxin isTest9p");
				LOGGER.debug("inx2in isTest9p");
				LOGGER.debug("inx3in isTest9p");
				LOGGER.debug("inx4in isTest9p");
				LOGGER.debug("inx5in isTest9p");
				LOGGER.debug("inx6in isTest9p");
				LOGGER.debug("inx7in isTest9p");
				LOGGER.debug("inx8in isTest9p");
				LOGGER.debug("inx9pin isTest9p");
				LOGGER.debug("in20in isTest9p");
			}

			 

			DocumentBuilderFactory dbfTest9p = DocumentBuilderFactory.newInstance();
			dbfTest9p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9p.setNamespaceAware(true);
			dbfTest9p.setValidating(false);

			DocumentBuilder db = dbfTest9p.newDocumentBuilder();
			Document doc = db.parse(isTest9p);
			Node configTest9p = doc.getFirstChild();
			while ((configTest9p != null)
					&& (!"Configuration".equals(configTest9p.getLocalName()))) {
				configTest9p = configTest9p.getNextSibling();
			}

			if (configTest9p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9p!=null?configTest9p.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9p = (Element) el;

					Attr langAttr = resourceTest9p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9p.length; i++) {
						String uri = listTest9p[i].getAttributeNS(null, "URI");
						String javaclass = listTest9p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9p.length; i++) {
						String uritrans = tranElemTest9p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9p = algorithms[i];
							String id = elementTest9p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9p.length; i++) {
						String urisign = sigElemsTest9p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9p.length; i++) {
						String javaclass = resolverElemTest9p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9pRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9p = new ArrayList(resolverElemTest9p.length);
					for (int i = 0; i < resolverElemTest9p.length; i++) {
						String javaclass = resolverElemTest9p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9p = resolverElemTest9p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9p != null) && (descriptionTest9p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9p);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9p);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9p.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9p.length; i++) {
						String namespace = nlTest9p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9p ) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", exs9p);
 } catch (ClassNotFoundException enf9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", enf9p);
 } catch (IllegalAccessException eia9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", eia9p);
 } catch (InstantiationException e9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", e9p);
 } catch (javax.xml.parsers.ParserConfigurationException epc9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", epc9p);
 } catch (org.xml.sax.SAXException ese9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", ese9p);
 } catch (java.io.IOException eio9p) {
 LOGGER.error("Crypto9pInit:fileInit:error: ", eio9p);
 }

	}

}
