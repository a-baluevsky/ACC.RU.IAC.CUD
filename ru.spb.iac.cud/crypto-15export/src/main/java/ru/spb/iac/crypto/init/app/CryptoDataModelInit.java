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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7p1,String st7p2,String st7p3,String st7p4,String st7p5,
			                String st7p6,String st7p7p){
	  stt7p1=st7p1;
	  stt7p2=st7p2;
	  stt7p3=st7p3;
	  stt7p4=st7p4;
	  stt7p5=st7p5;
	  stt7p6=st7p6;
	  stt7p7p=st7p7p;

	 }
	 
	 private  String stt7p1;
	 private  String stt7p2;
	 private String stt7p3;
	 private  String stt7p4;
	 private  String stt7p5;
	 private  String stt7p6;
	 private  String stt7p7p;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7p1",
					stt7p1);
			System.setProperty("stt7p2",
					stt7p2);
			System.setProperty("stt7p3",
					stt7p3);
			System.setProperty("stt7p4",
					stt7p4);
			System.setProperty("stt7p5",
					stt7p5);
			System.setProperty("stt7p6",
					stt7p6);
			System.setProperty("stt7p7p",
					stt7p7p);

			
			System.setProperty("Test7pInit",
					"Test7pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7pInit.class/jcp.xml");
			
			System.setProperty("Test7pss7p_0x",
					"Test7pss7p_0xjcp.xml");
         	System.setProperty("Test7pss7p_02",
					"Test7pss7p_02xml.config");
			System.setProperty("Test7pss7p_03",
					"Test7pss7p_03.apache.xml.resource.security.");
		    System.setProperty("Test7pss7p_04",
					"Test7pss7p_04.resource.");
			System.setProperty("Test7pss7p_05",
					"Test7pss7p_05.isInitialized");
			System.setProperty("Test7pss7p_06",
					"Test7pss7p_06_7pInit.class/jcp.xml");
			System.setProperty("Test7pss7p_07p",
					"Test7pss7p_07pt/resource/jcp.xml");
         	System.setProperty("Test7pss7p_08",
					"Test7pss7p_08.config");
			System.setProperty("Test7pss7p_09",
					"Test7pss7p_09.security.");
		    System.setProperty("Test7pss7p_0x0",
					"Test7pss7p_0x0jcp.xmlapache.");
			System.setProperty("Test7pss7p_0xx0",
					"Test7pss7p_0xx0.isInitialized");
			System.setProperty("Test7pss7p_0xxx0",
					"Test7pss7p_0xxx0est7pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7p = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7p != null) {
				 
				LOGGER.debug("in0in isTest7p");
				LOGGER.debug("inxin isTest7p");
				LOGGER.debug("in2in isTest7p");
				LOGGER.debug("in3in isTest7p");
				LOGGER.debug("in4in isTest7p");
				LOGGER.debug("in5in isTest7p");
				LOGGER.debug("in6in isTest7p");
				LOGGER.debug("in7pin isTest7p");
				LOGGER.debug("in8in isTest7p");
				LOGGER.debug("in9in isTest7p");
				LOGGER.debug("inx0in isTest7p");
				LOGGER.debug("inxxin isTest7p");
				LOGGER.debug("inx2in isTest7p");
				LOGGER.debug("inx3in isTest7p");
				LOGGER.debug("inx4in isTest7p");
				LOGGER.debug("inx5in isTest7p");
				LOGGER.debug("inx6in isTest7p");
				LOGGER.debug("inx7pin isTest7p");
				LOGGER.debug("inx8in isTest7p");
				LOGGER.debug("inx9in isTest7p");
				LOGGER.debug("in20in isTest7p");
			}

			 

			DocumentBuilderFactory dbfTest7p = DocumentBuilderFactory.newInstance();
			dbfTest7p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7p.setNamespaceAware(true);
			dbfTest7p.setValidating(false);

			DocumentBuilder db = dbfTest7p.newDocumentBuilder();
			Document doc = db.parse(isTest7p);
			Node configTest7p = doc.getFirstChild();
			while ((configTest7p != null)
					&& (!"Configuration".equals(configTest7p.getLocalName()))) {
				configTest7p = configTest7p.getNextSibling();
			}

			if (configTest7p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7p!=null?configTest7p.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7p = (Element) el;

					Attr langAttr = resourceTest7p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7p.length; i++) {
						String uri = listTest7p[i].getAttributeNS(null, "URI");
						String javaclass = listTest7p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7p.length; i++) {
						String uritrans = tranElemTest7p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7p = algorithms[i];
							String id = elementTest7p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7p.length; i++) {
						String urisign = sigElemsTest7p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7p.length; i++) {
						String javaclass = resolverElemTest7p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7pRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest7p = new ArrayList<String>(resolverElemTest7p.length);
					for (int i = 0; i < resolverElemTest7p.length; i++) {
						String javaclass = resolverElemTest7p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7p = resolverElemTest7p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7p != null) && (descriptionTest7p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7p);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7p);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7p.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7p.length; i++) {
						String namespace = nlTest7p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7p ) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", exs7p);
 } catch (ClassNotFoundException enf7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", enf7p);
 } catch (IllegalAccessException eia7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", eia7p);
 } catch (InstantiationException e7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", e7p);
 } catch (javax.xml.parsers.ParserConfigurationException epc7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", epc7p);
 } catch (org.xml.sax.SAXException ese7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", ese7p);
 } catch (java.io.IOException eio7p) {
 LOGGER.error("Crypto7pInit:fileInit:error: ", eio7p);
 }

	}

}
