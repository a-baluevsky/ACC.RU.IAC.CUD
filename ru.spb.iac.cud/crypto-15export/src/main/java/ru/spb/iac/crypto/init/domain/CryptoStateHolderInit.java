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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5db1,String st5db2,String st5db3,String st5db4,String st5db5db,
			                String st5db6,String st5db7){
	  stt5db1=st5db1;
	  stt5db2=st5db2;
	  stt5db3=st5db3;
	  stt5db4=st5db4;
	  stt5db5db=st5db5db;
	  stt5db6=st5db6;
	  stt5db7=st5db7;

	 }
	 
	 private  String stt5db1;
	 private  String stt5db2;
	 private String stt5db3;
	 private  String stt5db4;
	 private  String stt5db5db;
	 private  String stt5db6;
	 private  String stt5db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5db1",
					stt5db1);
			System.setProperty("stt5db2",
					stt5db2);
			System.setProperty("stt5db3",
					stt5db3);
			System.setProperty("stt5db4",
					stt5db4);
			System.setProperty("stt5db5db",
					stt5db5db);
			System.setProperty("stt5db6",
					stt5db6);
			System.setProperty("stt5db7",
					stt5db7);

			
			System.setProperty("Test5dbInit",
					"Test5dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5db5dbInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5dbInit.class/jcp.xml");
			
			System.setProperty("Test5dbss5db_0x",
					"Test5dbss5db_0xjcp.xml");
         	System.setProperty("Test5dbss5db_02",
					"Test5dbss5db_02xml.config");
			System.setProperty("Test5dbss5db_03",
					"Test5dbss5db_03.apache.xml.resource.security.");
		    System.setProperty("Test5dbss5db_04",
					"Test5dbss5db_04.resource.");
			System.setProperty("Test5dbss5db_05db",
					"Test5dbss5db_05db.isInitialized");
			System.setProperty("Test5dbss5db_06",
					"Test5dbss5db_06_5dbInit.class/jcp.xml");
			System.setProperty("Test5dbss5db_07",
					"Test5dbss5db_07t/resource/jcp.xml");
         	System.setProperty("Test5dbss5db_08",
					"Test5dbss5db_08.config");
			System.setProperty("Test5dbss5db_09",
					"Test5dbss5db_09.security.");
		    System.setProperty("Test5dbss5db_0x0",
					"Test5dbss5db_0x0jcp.xmlapache.");
			System.setProperty("Test5dbss5db_0xx0",
					"Test5dbss5db_0xx0.isInitialized");
			System.setProperty("Test5dbss5db_0xxx0",
					"Test5dbss5db_0xxx0est5dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5db5dbInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5db = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5db != null) {
				 
				LOGGER.debug("in0in isTest5db");
				LOGGER.debug("inxin isTest5db");
				LOGGER.debug("in2in isTest5db");
				LOGGER.debug("in3in isTest5db");
				LOGGER.debug("in4in isTest5db");
				LOGGER.debug("in5dbin isTest5db");
				LOGGER.debug("in6in isTest5db");
				LOGGER.debug("in7in isTest5db");
				LOGGER.debug("in8in isTest5db");
				LOGGER.debug("in9in isTest5db");
				LOGGER.debug("inx0in isTest5db");
				LOGGER.debug("inxxin isTest5db");
				LOGGER.debug("inx2in isTest5db");
				LOGGER.debug("inx3in isTest5db");
				LOGGER.debug("inx4in isTest5db");
				LOGGER.debug("inx5dbin isTest5db");
				LOGGER.debug("inx6in isTest5db");
				LOGGER.debug("inx7in isTest5db");
				LOGGER.debug("inx8in isTest5db");
				LOGGER.debug("inx9in isTest5db");
				LOGGER.debug("in20in isTest5db");
			}

			 

			DocumentBuilderFactory dbfTest5db = DocumentBuilderFactory.newInstance();
			dbfTest5db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5db.setNamespaceAware(true);
			dbfTest5db.setValidating(false);

			DocumentBuilder db = dbfTest5db.newDocumentBuilder();
			Document doc = db.parse(isTest5db);
			Node configTest5db = doc.getFirstChild();
			while ((configTest5db != null)
					&& (!"Configuration".equals(configTest5db.getLocalName()))) {
				configTest5db = configTest5db.getNextSibling();
			}

			if (configTest5db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5db!=null?configTest5db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5db = (Element) el;

					Attr langAttr = resourceTest5db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5db.length; i++) {
						String uri = listTest5db[i].getAttributeNS(null, "URI");
						String javaclass = listTest5db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5db.length; i++) {
						String uritrans = tranElemTest5db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5db = algorithms[i];
							String id = elementTest5db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5db.length; i++) {
						String urisign = sigElemsTest5db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5db.length; i++) {
						String javaclass = resolverElemTest5db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5dbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5db = new ArrayList(resolverElemTest5db.length);
					for (int i = 0; i < resolverElemTest5db.length; i++) {
						String javaclass = resolverElemTest5db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5db = resolverElemTest5db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5db != null) && (descriptionTest5db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5db);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5db);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5db.length; i++) {
						String namespace = nlTest5db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5db ) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", exs5db);
 } catch (ClassNotFoundException enf5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", enf5db);
 } catch (IllegalAccessException eia5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", eia5db);
 } catch (InstantiationException e5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", e5db);
 } catch (javax.xml.parsers.ParserConfigurationException epc5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", epc5db);
 } catch (org.xml.sax.SAXException ese5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", ese5db);
 } catch (java.io.IOException eio5db) {
 LOGGER.error("Crypto5dbInit:fileInit:error: ", eio5db);
 }

	}

}
