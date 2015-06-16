package ru.spb.iac.crypto.init.cpar;

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
	 
	 
	 public CryptoDomainInit(String st9cb1,String st9cb2,String st9cb3,String st9cb4,String st9cb5,
			                String st9cb6,String st9cb7){
	  stt9cb1=st9cb1;
	  stt9cb2=st9cb2;
	  stt9cb3=st9cb3;
	  stt9cb4=st9cb4;
	  stt9cb5=st9cb5;
	  stt9cb6=st9cb6;
	  stt9cb7=st9cb7;

	 }
	 
	 private  String stt9cb1;
	 private  String stt9cb2;
	 private String stt9cb3;
	 private  String stt9cb4;
	 private  String stt9cb5;
	 private  String stt9cb6;
	 private  String stt9cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9cb1",
					stt9cb1);
			System.setProperty("stt9cb2",
					stt9cb2);
			System.setProperty("stt9cb3",
					stt9cb3);
			System.setProperty("stt9cb4",
					stt9cb4);
			System.setProperty("stt9cb5",
					stt9cb5);
			System.setProperty("stt9cb6",
					stt9cb6);
			System.setProperty("stt9cb7",
					stt9cb7);

			
			System.setProperty("Test9cbInit",
					"Test9cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9cbInit.class/jcp.xml");
			
			
			System.setProperty("Test9cbss9cb_0x",
					"Test9cbss9cb_0xjcp.xml");
         	System.setProperty("Test9cbss9cb_02",
					"Test9cbss9cb_02xml.config");
			System.setProperty("Test9cbss9cb_03",
					"Test9cbss9cb_03.apache.xml.resource.security.");
		    System.setProperty("Test9cbss9cb_04",
					"Test9cbss9cb_04.resource.");
			System.setProperty("Test9cbss9cb_05",
					"Test9cbss9cb_05.isInitialized");
			System.setProperty("Test9cbss9cb_06",
					"Test9cbss9cb_06_9cbInit.class/jcp.xml");
			System.setProperty("Test9cbss9cb_07",
					"Test9cbss9cb_07t/resource/jcp.xml");
         	System.setProperty("Test9cbss9cb_08",
					"Test9cbss9cb_08.config");
			System.setProperty("Test9cbss9cb_09cb",
					"Test9cbss9cb_09cb.security.");
		    System.setProperty("Test9cbss9cb_0x0",
					"Test9cbss9cb_0x0jcp.xmlapache.");
			System.setProperty("Test9cbss9cb_0xx0",
					"Test9cbss9cb_0xx0.isInitialized");
			System.setProperty("Test9cbss9cb_0xxx0",
					"Test9cbss9cb_0xxx0est9cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9cb = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9cb != null) {
				 
				LOGGER.debug("in0in isTest9cb");
				LOGGER.debug("inxin isTest9cb");
				LOGGER.debug("in2in isTest9cb");
				LOGGER.debug("in3in isTest9cb");
				LOGGER.debug("in4in isTest9cb");
				LOGGER.debug("in5in isTest9cb");
				LOGGER.debug("in6in isTest9cb");
				LOGGER.debug("in7in isTest9cb");
				LOGGER.debug("in8in isTest9cb");
				LOGGER.debug("in9cbin isTest9cb");
				LOGGER.debug("inx0in isTest9cb");
				LOGGER.debug("inxxin isTest9cb");
				LOGGER.debug("inx2in isTest9cb");
				LOGGER.debug("inx3in isTest9cb");
				LOGGER.debug("inx4in isTest9cb");
				LOGGER.debug("inx5in isTest9cb");
				LOGGER.debug("inx6in isTest9cb");
				LOGGER.debug("inx7in isTest9cb");
				LOGGER.debug("inx8in isTest9cb");
				LOGGER.debug("inx9cbin isTest9cb");
				LOGGER.debug("in20in isTest9cb");
			}

			 

			DocumentBuilderFactory dbfTest9cb = DocumentBuilderFactory.newInstance();
			dbfTest9cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9cb.setNamespaceAware(true);
			dbfTest9cb.setValidating(false);

			DocumentBuilder db = dbfTest9cb.newDocumentBuilder();
			Document doc = db.parse(isTest9cb);
			Node configTest9cb = doc.getFirstChild();
			while ((configTest9cb != null)
					&& (!"Configuration".equals(configTest9cb.getLocalName()))) {
				configTest9cb = configTest9cb.getNextSibling();
			}

			if (configTest9cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9cb!=null?configTest9cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9cb = (Element) el;

					Attr langAttr = resourceTest9cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9cb.length; i++) {
						String uri = listTest9cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest9cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9cb.length; i++) {
						String uritrans = tranElemTest9cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9cb = algorithms[i];
							String id = elementTest9cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9cb.length; i++) {
						String urisign = sigElemsTest9cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9cb.length; i++) {
						String javaclass = resolverElemTest9cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9cbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9cb = new ArrayList<String>(resolverElemTest9cb.length);
					for (int i = 0; i < resolverElemTest9cb.length; i++) {
						String javaclass = resolverElemTest9cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9cb = resolverElemTest9cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9cb != null) && (descriptionTest9cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9cb);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9cb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9cb.length; i++) {
						String namespace = nlTest9cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9cb ) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", exs9cb);
 } catch (ClassNotFoundException enf9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", enf9cb);
 } catch (IllegalAccessException eia9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", eia9cb);
 } catch (InstantiationException e9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", e9cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", epc9cb);
 } catch (org.xml.sax.SAXException ese9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", ese9cb);
 } catch (java.io.IOException eio9cb) {
 LOGGER.error("Crypto9cbInit:fileInit:error: ", eio9cb);
 }

	}

}
