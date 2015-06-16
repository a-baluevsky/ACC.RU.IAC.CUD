package ru.spb.iac.crypto.init.domain;

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
	 
	 
	 public CryptoContextAppInit(String st6db1,String st6db2,String st6db3,String st6db4,String st6db5,
			                String st6db6db,String st6db7){
	  stt6db1=st6db1;
	  stt6db2=st6db2;
	  stt6db3=st6db3;
	  stt6db4=st6db4;
	  stt6db5=st6db5;
	  stt6db6db=st6db6db;
	  stt6db7=st6db7;

	 }
	 
	 private  String stt6db1;
	 private  String stt6db2;
	 private String stt6db3;
	 private  String stt6db4;
	 private  String stt6db5;
	 private  String stt6db6db;
	 private  String stt6db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6db1",
					stt6db1);
			System.setProperty("stt6db2",
					stt6db2);
			System.setProperty("stt6db3",
					stt6db3);
			System.setProperty("stt6db4",
					stt6db4);
			System.setProperty("stt6db5",
					stt6db5);
			System.setProperty("stt6db6db",
					stt6db6db);
			System.setProperty("stt6db7",
					stt6db7);

			
			System.setProperty("Test6dbInit",
					"Test6dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6dbInit.class/jcp.xml");
			
			System.setProperty("Test6dbss6db_0x",
					"Test6dbss6db_0xjcp.xml");
         	System.setProperty("Test6dbss6db_02",
					"Test6dbss6db_02xml.config");
			System.setProperty("Test6dbss6db_03",
					"Test6dbss6db_03.apache.xml.resource.security.");
		    System.setProperty("Test6dbss6db_04",
					"Test6dbss6db_04.resource.");
			System.setProperty("Test6dbss6db_05",
					"Test6dbss6db_05.isInitialized");
			System.setProperty("Test6dbss6db_06db",
					"Test6dbss6db_06db_6dbInit.class/jcp.xml");
			System.setProperty("Test6dbss6db_07",
					"Test6dbss6db_07t/resource/jcp.xml");
         	System.setProperty("Test6dbss6db_08",
					"Test6dbss6db_08.config");
			System.setProperty("Test6dbss6db_09",
					"Test6dbss6db_09.security.");
		    System.setProperty("Test6dbss6db_0x0",
					"Test6dbss6db_0x0jcp.xmlapache.");
			System.setProperty("Test6dbss6db_0xx0",
					"Test6dbss6db_0xx0.isInitialized");
			System.setProperty("Test6dbss6db_0xxx0",
					"Test6dbss6db_0xxx0est6dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6db = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6db != null) {
				 
				LOGGER.debug("in0in isTest6db");
				LOGGER.debug("inxin isTest6db");
				LOGGER.debug("in2in isTest6db");
				LOGGER.debug("in3in isTest6db");
				LOGGER.debug("in4in isTest6db");
				LOGGER.debug("in5in isTest6db");
				LOGGER.debug("in6dbin isTest6db");
				LOGGER.debug("in7in isTest6db");
				LOGGER.debug("in8in isTest6db");
				LOGGER.debug("in9in isTest6db");
				LOGGER.debug("inx0in isTest6db");
				LOGGER.debug("inxxin isTest6db");
				LOGGER.debug("inx2in isTest6db");
				LOGGER.debug("inx3in isTest6db");
				LOGGER.debug("inx4in isTest6db");
				LOGGER.debug("inx5in isTest6db");
				LOGGER.debug("inx6dbin isTest6db");
				LOGGER.debug("inx7in isTest6db");
				LOGGER.debug("inx8in isTest6db");
				LOGGER.debug("inx9in isTest6db");
				LOGGER.debug("in20in isTest6db");
			}

			 

			DocumentBuilderFactory dbfTest6db = DocumentBuilderFactory.newInstance();
			dbfTest6db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6db.setNamespaceAware(true);
			dbfTest6db.setValidating(false);

			DocumentBuilder db = dbfTest6db.newDocumentBuilder();
			Document doc = db.parse(isTest6db);
			Node configTest6db = doc.getFirstChild();
			while ((configTest6db != null)
					&& (!"Configuration".equals(configTest6db.getLocalName()))) {
				configTest6db = configTest6db.getNextSibling();
			}

			if (configTest6db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6db!=null?configTest6db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6db = (Element) el;

					Attr langAttr = resourceTest6db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6db.length; i++) {
						String uri = listTest6db[i].getAttributeNS(null, "URI");
						String javaclass = listTest6db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6db.length; i++) {
						String uritrans = tranElemTest6db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6db = algorithms[i];
							String id = elementTest6db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6db.length; i++) {
						String urisign = sigElemsTest6db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6db.length; i++) {
						String javaclass = resolverElemTest6db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6dbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6dbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest6db = new ArrayList<String>(resolverElemTest6db.length);
					for (int i = 0; i < resolverElemTest6db.length; i++) {
						String javaclass = resolverElemTest6db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6db = resolverElemTest6db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6db != null) && (descriptionTest6db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6db);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6db);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6db.length; i++) {
						String namespace = nlTest6db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6db ) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", exs6db);
 } catch (ClassNotFoundException enf6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", enf6db);
 } catch (IllegalAccessException eia6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", eia6db);
 } catch (InstantiationException e6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", e6db);
 } catch (javax.xml.parsers.ParserConfigurationException epc6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", epc6db);
 } catch (org.xml.sax.SAXException ese6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", ese6db);
 } catch (java.io.IOException eio6db) {
 LOGGER.error("Crypto6dbInit:fileInit:error: ", eio6db);
 }

	}

}
