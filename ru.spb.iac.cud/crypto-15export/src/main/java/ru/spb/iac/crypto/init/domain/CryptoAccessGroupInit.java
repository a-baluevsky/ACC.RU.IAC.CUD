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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2db1,String st2db2db,String st2db3,String st2db4,String st2db5,
			                String st2db6,String st2db7){
	  stt2db1=st2db1;
	  stt2db2db=st2db2db;
	  stt2db3=st2db3;
	  stt2db4=st2db4;
	  stt2db5=st2db5;
	  stt2db6=st2db6;
	  stt2db7=st2db7;

	 }
	 
	 private  String stt2db1;
	 private  String stt2db2db;
	 private String stt2db3;
	 private  String stt2db4;
	 private  String stt2db5;
	 private  String stt2db6;
	 private  String stt2db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2db1",
					stt2db1);
			System.setProperty("stt2db2db",
					stt2db2db);
			System.setProperty("stt2db3",
					stt2db3);
			System.setProperty("stt2db4",
					stt2db4);
			System.setProperty("stt2db5",
					stt2db5);
			System.setProperty("stt2db6",
					stt2db6);
			System.setProperty("stt2db7",
					stt2db7);

			
			System.setProperty("Test2dbInit",
					"Test2dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2dbInit.class/jcp.xml");
			
			System.setProperty("Test2dbss2db_0x",
					"Test2dbss2db_0xjcp.xml");
         	System.setProperty("Test2dbss2db_02db",
					"Test2dbss2db_02dbxml.config");
			System.setProperty("Test2dbss2db_03",
					"Test2dbss2db_03.apache.xml.resource.security.");
		    System.setProperty("Test2dbss2db_04",
					"Test2dbss2db_04.resource.");
			System.setProperty("Test2dbss2db_05",
					"Test2dbss2db_05.isInitialized");
			System.setProperty("Test2dbss2db_06",
					"Test2dbss2db_06_2dbInit.class/jcp.xml");
			System.setProperty("Test2dbss2db_07",
					"Test2dbss2db_07t/resource/jcp.xml");
         	System.setProperty("Test2dbss2db_08",
					"Test2dbss2db_08.config");
			System.setProperty("Test2dbss2db_09",
					"Test2dbss2db_09.security.");
		    System.setProperty("Test2dbss2db_0x0",
					"Test2dbss2db_0x0jcp.xmlapache.");
			System.setProperty("Test2dbss2db_0xx0",
					"Test2dbss2db_0xx0.isInitialized");
			System.setProperty("Test2dbss2db_0xxx0",
					"Test2dbss2db_0xxx0est2dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2db = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2db != null) {
				 
				LOGGER.debug("in0in isTest2db");
				LOGGER.debug("inxin isTest2db");
				LOGGER.debug("in2dbin isTest2db");
				LOGGER.debug("in3in isTest2db");
				LOGGER.debug("in4in isTest2db");
				LOGGER.debug("in5in isTest2db");
				LOGGER.debug("in6in isTest2db");
				LOGGER.debug("in7in isTest2db");
				LOGGER.debug("in8in isTest2db");
				LOGGER.debug("in9in isTest2db");
				LOGGER.debug("inx0in isTest2db");
				LOGGER.debug("inxxin isTest2db");
				LOGGER.debug("inx2dbin isTest2db");
				LOGGER.debug("inx3in isTest2db");
				LOGGER.debug("inx4in isTest2db");
				LOGGER.debug("inx5in isTest2db");
				LOGGER.debug("inx6in isTest2db");
				LOGGER.debug("inx7in isTest2db");
				LOGGER.debug("inx8in isTest2db");
				LOGGER.debug("inx9in isTest2db");
				LOGGER.debug("in2db0in isTest2db");
			}

			 

			DocumentBuilderFactory dbfTest2db = DocumentBuilderFactory.newInstance();
			dbfTest2db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2db.setNamespaceAware(true);
			dbfTest2db.setValidating(false);

			DocumentBuilder db = dbfTest2db.newDocumentBuilder();
			Document doc = db.parse(isTest2db);
			Node configTest2db = doc.getFirstChild();
			while ((configTest2db != null)
					&& (!"Configuration".equals(configTest2db.getLocalName()))) {
				configTest2db = configTest2db.getNextSibling();
			}

			if (configTest2db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2db!=null?configTest2db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2db = (Element) el;

					Attr langAttr = resourceTest2db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2db.length; i++) {
						String uri = listTest2db[i].getAttributeNS(null, "URI");
						String javaclass = listTest2db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2db.length; i++) {
						String uritrans = tranElemTest2db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2db = algorithms[i];
							String id = elementTest2db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2db.length; i++) {
						String urisign = sigElemsTest2db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2db.length; i++) {
						String javaclass = resolverElemTest2db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2dbRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2db = new ArrayList(resolverElemTest2db.length);
					for (int i = 0; i < resolverElemTest2db.length; i++) {
						String javaclass = resolverElemTest2db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2db = resolverElemTest2db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2db != null) && (descriptionTest2db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2db);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2db);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2db.length; i++) {
						String namespace = nlTest2db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2db ) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", exs2db);
 } catch (ClassNotFoundException enf2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", enf2db);
 } catch (IllegalAccessException eia2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", eia2db);
 } catch (InstantiationException e2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", e2db);
 } catch (javax.xml.parsers.ParserConfigurationException epc2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", epc2db);
 } catch (org.xml.sax.SAXException ese2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", ese2db);
 } catch (java.io.IOException eio2db) {
 LOGGER.error("Crypto2dbInit:fileInit:error: ", eio2db);
 }

	}

}
