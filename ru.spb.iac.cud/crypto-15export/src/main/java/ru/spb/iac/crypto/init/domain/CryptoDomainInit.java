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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9db1,String st9db2,String st9db3,String st9db4,String st9db5,
			                String st9db6,String st9db7){
	  stt9db1=st9db1;
	  stt9db2=st9db2;
	  stt9db3=st9db3;
	  stt9db4=st9db4;
	  stt9db5=st9db5;
	  stt9db6=st9db6;
	  stt9db7=st9db7;

	 }
	 
	 private  String stt9db1;
	 private  String stt9db2;
	 private String stt9db3;
	 private  String stt9db4;
	 private  String stt9db5;
	 private  String stt9db6;
	 private  String stt9db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9db1",
					stt9db1);
			System.setProperty("stt9db2",
					stt9db2);
			System.setProperty("stt9db3",
					stt9db3);
			System.setProperty("stt9db4",
					stt9db4);
			System.setProperty("stt9db5",
					stt9db5);
			System.setProperty("stt9db6",
					stt9db6);
			System.setProperty("stt9db7",
					stt9db7);

			
			System.setProperty("Test9dbInit",
					"Test9dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9dbInit.class/jcp.xml");
			
			
			System.setProperty("Test9dbss9db_0x",
					"Test9dbss9db_0xjcp.xml");
         	System.setProperty("Test9dbss9db_02",
					"Test9dbss9db_02xml.config");
			System.setProperty("Test9dbss9db_03",
					"Test9dbss9db_03.apache.xml.resource.security.");
		    System.setProperty("Test9dbss9db_04",
					"Test9dbss9db_04.resource.");
			System.setProperty("Test9dbss9db_05",
					"Test9dbss9db_05.isInitialized");
			System.setProperty("Test9dbss9db_06",
					"Test9dbss9db_06_9dbInit.class/jcp.xml");
			System.setProperty("Test9dbss9db_07",
					"Test9dbss9db_07t/resource/jcp.xml");
         	System.setProperty("Test9dbss9db_08",
					"Test9dbss9db_08.config");
			System.setProperty("Test9dbss9db_09db",
					"Test9dbss9db_09db.security.");
		    System.setProperty("Test9dbss9db_0x0",
					"Test9dbss9db_0x0jcp.xmlapache.");
			System.setProperty("Test9dbss9db_0xx0",
					"Test9dbss9db_0xx0.isInitialized");
			System.setProperty("Test9dbss9db_0xxx0",
					"Test9dbss9db_0xxx0est9dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9db = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9db != null) {
				 
				LOGGER.debug("in0in isTest9db");
				LOGGER.debug("inxin isTest9db");
				LOGGER.debug("in2in isTest9db");
				LOGGER.debug("in3in isTest9db");
				LOGGER.debug("in4in isTest9db");
				LOGGER.debug("in5in isTest9db");
				LOGGER.debug("in6in isTest9db");
				LOGGER.debug("in7in isTest9db");
				LOGGER.debug("in8in isTest9db");
				LOGGER.debug("in9dbin isTest9db");
				LOGGER.debug("inx0in isTest9db");
				LOGGER.debug("inxxin isTest9db");
				LOGGER.debug("inx2in isTest9db");
				LOGGER.debug("inx3in isTest9db");
				LOGGER.debug("inx4in isTest9db");
				LOGGER.debug("inx5in isTest9db");
				LOGGER.debug("inx6in isTest9db");
				LOGGER.debug("inx7in isTest9db");
				LOGGER.debug("inx8in isTest9db");
				LOGGER.debug("inx9dbin isTest9db");
				LOGGER.debug("in20in isTest9db");
			}

			 

			DocumentBuilderFactory dbfTest9db = DocumentBuilderFactory.newInstance();
			dbfTest9db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9db.setNamespaceAware(true);
			dbfTest9db.setValidating(false);

			DocumentBuilder db = dbfTest9db.newDocumentBuilder();
			Document doc = db.parse(isTest9db);
			Node configTest9db = doc.getFirstChild();
			while ((configTest9db != null)
					&& (!"Configuration".equals(configTest9db.getLocalName()))) {
				configTest9db = configTest9db.getNextSibling();
			}

			if (configTest9db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9db!=null?configTest9db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9db = (Element) el;

					Attr langAttr = resourceTest9db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9db.length; i++) {
						String uri = listTest9db[i].getAttributeNS(null, "URI");
						String javaclass = listTest9db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9db.length; i++) {
						String uritrans = tranElemTest9db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9db = algorithms[i];
							String id = elementTest9db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9db.length; i++) {
						String urisign = sigElemsTest9db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9db.length; i++) {
						String javaclass = resolverElemTest9db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9dbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9db = new ArrayList(resolverElemTest9db.length);
					for (int i = 0; i < resolverElemTest9db.length; i++) {
						String javaclass = resolverElemTest9db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9db = resolverElemTest9db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9db != null) && (descriptionTest9db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9db);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9db);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9db.length; i++) {
						String namespace = nlTest9db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9db ) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", exs9db);
 } catch (ClassNotFoundException enf9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", enf9db);
 } catch (IllegalAccessException eia9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", eia9db);
 } catch (InstantiationException e9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", e9db);
 } catch (javax.xml.parsers.ParserConfigurationException epc9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", epc9db);
 } catch (org.xml.sax.SAXException ese9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", ese9db);
 } catch (java.io.IOException eio9db) {
 LOGGER.error("Crypto9dbInit:fileInit:error: ", eio9db);
 }

	}

}
