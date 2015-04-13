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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7db1,String st7db2,String st7db3,String st7db4,String st7db5,
			                String st7db6,String st7db7db){
	  stt7db1=st7db1;
	  stt7db2=st7db2;
	  stt7db3=st7db3;
	  stt7db4=st7db4;
	  stt7db5=st7db5;
	  stt7db6=st7db6;
	  stt7db7db=st7db7db;

	 }
	 
	 private  String stt7db1;
	 private  String stt7db2;
	 private String stt7db3;
	 private  String stt7db4;
	 private  String stt7db5;
	 private  String stt7db6;
	 private  String stt7db7db;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7db1",
					stt7db1);
			System.setProperty("stt7db2",
					stt7db2);
			System.setProperty("stt7db3",
					stt7db3);
			System.setProperty("stt7db4",
					stt7db4);
			System.setProperty("stt7db5",
					stt7db5);
			System.setProperty("stt7db6",
					stt7db6);
			System.setProperty("stt7db7db",
					stt7db7db);

			
			System.setProperty("Test7dbInit",
					"Test7dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7dbInit.class/jcp.xml");
			
			System.setProperty("Test7dbss7db_0x",
					"Test7dbss7db_0xjcp.xml");
         	System.setProperty("Test7dbss7db_02",
					"Test7dbss7db_02xml.config");
			System.setProperty("Test7dbss7db_03",
					"Test7dbss7db_03.apache.xml.resource.security.");
		    System.setProperty("Test7dbss7db_04",
					"Test7dbss7db_04.resource.");
			System.setProperty("Test7dbss7db_05",
					"Test7dbss7db_05.isInitialized");
			System.setProperty("Test7dbss7db_06",
					"Test7dbss7db_06_7dbInit.class/jcp.xml");
			System.setProperty("Test7dbss7db_07db",
					"Test7dbss7db_07dbt/resource/jcp.xml");
         	System.setProperty("Test7dbss7db_08",
					"Test7dbss7db_08.config");
			System.setProperty("Test7dbss7db_09",
					"Test7dbss7db_09.security.");
		    System.setProperty("Test7dbss7db_0x0",
					"Test7dbss7db_0x0jcp.xmlapache.");
			System.setProperty("Test7dbss7db_0xx0",
					"Test7dbss7db_0xx0.isInitialized");
			System.setProperty("Test7dbss7db_0xxx0",
					"Test7dbss7db_0xxx0est7dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7db = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7db != null) {
				 
				LOGGER.debug("in0in isTest7db");
				LOGGER.debug("inxin isTest7db");
				LOGGER.debug("in2in isTest7db");
				LOGGER.debug("in3in isTest7db");
				LOGGER.debug("in4in isTest7db");
				LOGGER.debug("in5in isTest7db");
				LOGGER.debug("in6in isTest7db");
				LOGGER.debug("in7dbin isTest7db");
				LOGGER.debug("in8in isTest7db");
				LOGGER.debug("in9in isTest7db");
				LOGGER.debug("inx0in isTest7db");
				LOGGER.debug("inxxin isTest7db");
				LOGGER.debug("inx2in isTest7db");
				LOGGER.debug("inx3in isTest7db");
				LOGGER.debug("inx4in isTest7db");
				LOGGER.debug("inx5in isTest7db");
				LOGGER.debug("inx6in isTest7db");
				LOGGER.debug("inx7dbin isTest7db");
				LOGGER.debug("inx8in isTest7db");
				LOGGER.debug("inx9in isTest7db");
				LOGGER.debug("in20in isTest7db");
			}

			 

			DocumentBuilderFactory dbfTest7db = DocumentBuilderFactory.newInstance();
			dbfTest7db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7db.setNamespaceAware(true);
			dbfTest7db.setValidating(false);

			DocumentBuilder db = dbfTest7db.newDocumentBuilder();
			Document doc = db.parse(isTest7db);
			Node configTest7db = doc.getFirstChild();
			while ((configTest7db != null)
					&& (!"Configuration".equals(configTest7db.getLocalName()))) {
				configTest7db = configTest7db.getNextSibling();
			}

			if (configTest7db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7db!=null?configTest7db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7db = (Element) el;

					Attr langAttr = resourceTest7db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7db.length; i++) {
						String uri = listTest7db[i].getAttributeNS(null, "URI");
						String javaclass = listTest7db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7db.length; i++) {
						String uritrans = tranElemTest7db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7db = algorithms[i];
							String id = elementTest7db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7db.length; i++) {
						String urisign = sigElemsTest7db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7db.length; i++) {
						String javaclass = resolverElemTest7db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7dbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7db = new ArrayList(resolverElemTest7db.length);
					for (int i = 0; i < resolverElemTest7db.length; i++) {
						String javaclass = resolverElemTest7db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7db = resolverElemTest7db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7db != null) && (descriptionTest7db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7db);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7db);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7db.length; i++) {
						String namespace = nlTest7db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7db ) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", exs7db);
 } catch (ClassNotFoundException enf7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", enf7db);
 } catch (IllegalAccessException eia7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", eia7db);
 } catch (InstantiationException e7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", e7db);
 } catch (javax.xml.parsers.ParserConfigurationException epc7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", epc7db);
 } catch (org.xml.sax.SAXException ese7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", ese7db);
 } catch (java.io.IOException eio7db) {
 LOGGER.error("Crypto7dbInit:fileInit:error: ", eio7db);
 }

	}

}
