package ru.spb.iac.crypto.init.user;

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
	 
	 
	 public CryptoDataModelInit(String st7eb1,String st7eb2,String st7eb3,String st7eb4,String st7eb5,
			                String st7eb6,String st7eb7eb){
	  stt7eb1=st7eb1;
	  stt7eb2=st7eb2;
	  stt7eb3=st7eb3;
	  stt7eb4=st7eb4;
	  stt7eb5=st7eb5;
	  stt7eb6=st7eb6;
	  stt7eb7eb=st7eb7eb;

	 }
	 
	 private  String stt7eb1;
	 private  String stt7eb2;
	 private String stt7eb3;
	 private  String stt7eb4;
	 private  String stt7eb5;
	 private  String stt7eb6;
	 private  String stt7eb7eb;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7eb1",
					stt7eb1);
			System.setProperty("stt7eb2",
					stt7eb2);
			System.setProperty("stt7eb3",
					stt7eb3);
			System.setProperty("stt7eb4",
					stt7eb4);
			System.setProperty("stt7eb5",
					stt7eb5);
			System.setProperty("stt7eb6",
					stt7eb6);
			System.setProperty("stt7eb7eb",
					stt7eb7eb);

			
			System.setProperty("Test7ebInit",
					"Test7ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7ebInit.class/jcp.xml");
			
			System.setProperty("Test7ebss7eb_0x",
					"Test7ebss7eb_0xjcp.xml");
         	System.setProperty("Test7ebss7eb_02",
					"Test7ebss7eb_02xml.config");
			System.setProperty("Test7ebss7eb_03",
					"Test7ebss7eb_03.apache.xml.resource.security.");
		    System.setProperty("Test7ebss7eb_04",
					"Test7ebss7eb_04.resource.");
			System.setProperty("Test7ebss7eb_05",
					"Test7ebss7eb_05.isInitialized");
			System.setProperty("Test7ebss7eb_06",
					"Test7ebss7eb_06_7ebInit.class/jcp.xml");
			System.setProperty("Test7ebss7eb_07eb",
					"Test7ebss7eb_07ebt/resource/jcp.xml");
         	System.setProperty("Test7ebss7eb_08",
					"Test7ebss7eb_08.config");
			System.setProperty("Test7ebss7eb_09",
					"Test7ebss7eb_09.security.");
		    System.setProperty("Test7ebss7eb_0x0",
					"Test7ebss7eb_0x0jcp.xmlapache.");
			System.setProperty("Test7ebss7eb_0xx0",
					"Test7ebss7eb_0xx0.isInitialized");
			System.setProperty("Test7ebss7eb_0xxx0",
					"Test7ebss7eb_0xxx0est7ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7eb = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7eb != null) {
				 
				LOGGER.debug("in0in isTest7eb");
				LOGGER.debug("inxin isTest7eb");
				LOGGER.debug("in2in isTest7eb");
				LOGGER.debug("in3in isTest7eb");
				LOGGER.debug("in4in isTest7eb");
				LOGGER.debug("in5in isTest7eb");
				LOGGER.debug("in6in isTest7eb");
				LOGGER.debug("in7ebin isTest7eb");
				LOGGER.debug("in8in isTest7eb");
				LOGGER.debug("in9in isTest7eb");
				LOGGER.debug("inx0in isTest7eb");
				LOGGER.debug("inxxin isTest7eb");
				LOGGER.debug("inx2in isTest7eb");
				LOGGER.debug("inx3in isTest7eb");
				LOGGER.debug("inx4in isTest7eb");
				LOGGER.debug("inx5in isTest7eb");
				LOGGER.debug("inx6in isTest7eb");
				LOGGER.debug("inx7ebin isTest7eb");
				LOGGER.debug("inx8in isTest7eb");
				LOGGER.debug("inx9in isTest7eb");
				LOGGER.debug("in20in isTest7eb");
			}

			 

			DocumentBuilderFactory dbfTest7eb = DocumentBuilderFactory.newInstance();
			dbfTest7eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7eb.setNamespaceAware(true);
			dbfTest7eb.setValidating(false);

			DocumentBuilder db = dbfTest7eb.newDocumentBuilder();
			Document doc = db.parse(isTest7eb);
			Node configTest7eb = doc.getFirstChild();
			while ((configTest7eb != null)
					&& (!"Configuration".equals(configTest7eb.getLocalName()))) {
				configTest7eb = configTest7eb.getNextSibling();
			}

			if (configTest7eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7eb!=null?configTest7eb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7eb = (Element) el;

					Attr langAttr = resourceTest7eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7eb.length; i++) {
						String uri = listTest7eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest7eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7eb.length; i++) {
						String uritrans = tranElemTest7eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7eb = algorithms[i];
							String id = elementTest7eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7eb.length; i++) {
						String urisign = sigElemsTest7eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7eb.length; i++) {
						String javaclass = resolverElemTest7eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7ebRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest7eb = new ArrayList<String>(resolverElemTest7eb.length);
					for (int i = 0; i < resolverElemTest7eb.length; i++) {
						String javaclass = resolverElemTest7eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7eb = resolverElemTest7eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7eb != null) && (descriptionTest7eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7eb);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7eb);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7eb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7eb.length; i++) {
						String namespace = nlTest7eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7eb ) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", exs7eb);
 } catch (ClassNotFoundException enf7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", enf7eb);
 } catch (IllegalAccessException eia7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", eia7eb);
 } catch (InstantiationException e7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", e7eb);
 } catch (javax.xml.parsers.ParserConfigurationException epc7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", epc7eb);
 } catch (org.xml.sax.SAXException ese7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", ese7eb);
 } catch (java.io.IOException eio7eb) {
 LOGGER.error("Crypto7ebInit:fileInit:error: ", eio7eb);
 }

	}

}
