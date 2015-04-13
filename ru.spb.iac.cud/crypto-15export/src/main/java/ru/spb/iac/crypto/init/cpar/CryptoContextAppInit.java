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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6cb1,String st6cb2,String st6cb3,String st6cb4,String st6cb5,
			                String st6cb6cb,String st6cb7){
	  stt6cb1=st6cb1;
	  stt6cb2=st6cb2;
	  stt6cb3=st6cb3;
	  stt6cb4=st6cb4;
	  stt6cb5=st6cb5;
	  stt6cb6cb=st6cb6cb;
	  stt6cb7=st6cb7;

	 }
	 
	 private  String stt6cb1;
	 private  String stt6cb2;
	 private String stt6cb3;
	 private  String stt6cb4;
	 private  String stt6cb5;
	 private  String stt6cb6cb;
	 private  String stt6cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6cb1",
					stt6cb1);
			System.setProperty("stt6cb2",
					stt6cb2);
			System.setProperty("stt6cb3",
					stt6cb3);
			System.setProperty("stt6cb4",
					stt6cb4);
			System.setProperty("stt6cb5",
					stt6cb5);
			System.setProperty("stt6cb6cb",
					stt6cb6cb);
			System.setProperty("stt6cb7",
					stt6cb7);

			
			System.setProperty("Test6cbInit",
					"Test6cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6cbInit.class/jcp.xml");
			
			System.setProperty("Test6cbss6cb_0x",
					"Test6cbss6cb_0xjcp.xml");
         	System.setProperty("Test6cbss6cb_02",
					"Test6cbss6cb_02xml.config");
			System.setProperty("Test6cbss6cb_03",
					"Test6cbss6cb_03.apache.xml.resource.security.");
		    System.setProperty("Test6cbss6cb_04",
					"Test6cbss6cb_04.resource.");
			System.setProperty("Test6cbss6cb_05",
					"Test6cbss6cb_05.isInitialized");
			System.setProperty("Test6cbss6cb_06cb",
					"Test6cbss6cb_06cb_6cbInit.class/jcp.xml");
			System.setProperty("Test6cbss6cb_07",
					"Test6cbss6cb_07t/resource/jcp.xml");
         	System.setProperty("Test6cbss6cb_08",
					"Test6cbss6cb_08.config");
			System.setProperty("Test6cbss6cb_09",
					"Test6cbss6cb_09.security.");
		    System.setProperty("Test6cbss6cb_0x0",
					"Test6cbss6cb_0x0jcp.xmlapache.");
			System.setProperty("Test6cbss6cb_0xx0",
					"Test6cbss6cb_0xx0.isInitialized");
			System.setProperty("Test6cbss6cb_0xxx0",
					"Test6cbss6cb_0xxx0est6cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6cb = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6cb != null) {
				 
				LOGGER.debug("in0in isTest6cb");
				LOGGER.debug("inxin isTest6cb");
				LOGGER.debug("in2in isTest6cb");
				LOGGER.debug("in3in isTest6cb");
				LOGGER.debug("in4in isTest6cb");
				LOGGER.debug("in5in isTest6cb");
				LOGGER.debug("in6cbin isTest6cb");
				LOGGER.debug("in7in isTest6cb");
				LOGGER.debug("in8in isTest6cb");
				LOGGER.debug("in9in isTest6cb");
				LOGGER.debug("inx0in isTest6cb");
				LOGGER.debug("inxxin isTest6cb");
				LOGGER.debug("inx2in isTest6cb");
				LOGGER.debug("inx3in isTest6cb");
				LOGGER.debug("inx4in isTest6cb");
				LOGGER.debug("inx5in isTest6cb");
				LOGGER.debug("inx6cbin isTest6cb");
				LOGGER.debug("inx7in isTest6cb");
				LOGGER.debug("inx8in isTest6cb");
				LOGGER.debug("inx9in isTest6cb");
				LOGGER.debug("in20in isTest6cb");
			}

			 

			DocumentBuilderFactory dbfTest6cb = DocumentBuilderFactory.newInstance();
			dbfTest6cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6cb.setNamespaceAware(true);
			dbfTest6cb.setValidating(false);

			DocumentBuilder db = dbfTest6cb.newDocumentBuilder();
			Document doc = db.parse(isTest6cb);
			Node configTest6cb = doc.getFirstChild();
			while ((configTest6cb != null)
					&& (!"Configuration".equals(configTest6cb.getLocalName()))) {
				configTest6cb = configTest6cb.getNextSibling();
			}

			if (configTest6cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6cb!=null?configTest6cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6cb = (Element) el;

					Attr langAttr = resourceTest6cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6cb.length; i++) {
						String uri = listTest6cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest6cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6cb.length; i++) {
						String uritrans = tranElemTest6cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6cb = algorithms[i];
							String id = elementTest6cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6cb.length; i++) {
						String urisign = sigElemsTest6cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6cb.length; i++) {
						String javaclass = resolverElemTest6cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6cbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6cbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6cb = new ArrayList(resolverElemTest6cb.length);
					for (int i = 0; i < resolverElemTest6cb.length; i++) {
						String javaclass = resolverElemTest6cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6cb = resolverElemTest6cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6cb != null) && (descriptionTest6cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6cb);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6cb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6cb.length; i++) {
						String namespace = nlTest6cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6cb ) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", exs6cb);
 } catch (ClassNotFoundException enf6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", enf6cb);
 } catch (IllegalAccessException eia6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", eia6cb);
 } catch (InstantiationException e6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", e6cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", epc6cb);
 } catch (org.xml.sax.SAXException ese6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", ese6cb);
 } catch (java.io.IOException eio6cb) {
 LOGGER.error("Crypto6cbInit:fileInit:error: ", eio6cb);
 }

	}

}
