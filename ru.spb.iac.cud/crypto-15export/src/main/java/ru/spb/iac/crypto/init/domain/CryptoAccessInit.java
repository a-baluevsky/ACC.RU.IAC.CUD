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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1db1db,String st1db2,String st1db3,String st1db4,String st1db5,
			                String st1db6,String st1db7){
	  stt1db1db=st1db1db;
	  stt1db2=st1db2;
	  stt1db3=st1db3;
	  stt1db4=st1db4;
	  stt1db5=st1db5;
	  stt1db6=st1db6;
	  stt1db7=st1db7;

	 }
	 
	 private  String stt1db1db;
	 private  String stt1db2;
	 private String stt1db3;
	 private  String stt1db4;
	 private  String stt1db5;
	 private  String stt1db6;
	 private  String stt1db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1db1db",
					stt1db1db);
			System.setProperty("stt1db2",
					stt1db2);
			System.setProperty("stt1db3",
					stt1db3);
			System.setProperty("stt1db4",
					stt1db4);
			System.setProperty("stt1db5",
					stt1db5);
			System.setProperty("stt1db6",
					stt1db6);
			System.setProperty("stt1db7",
					stt1db7);

			
			System.setProperty("Test1dbInit",
					"Test1dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1dbInit.class/jcp.xml");
			
			System.setProperty("Test1dbss1db_0x",
					"Test1dbss1db_0xjcp.xml");
         	System.setProperty("Test1dbss1db_02",
					"Test1dbss1db_02xml.config");
			System.setProperty("Test1dbss1db_03",
					"Test1dbss1db_03.apache.xml.resource.security.");
		    System.setProperty("Test1dbss1db_04",
					"Test1dbss1db_04.resource.");
			System.setProperty("Test1dbss1db_05",
					"Test1dbss1db_05.isInitialized");
			System.setProperty("Test1dbss1db_06",
					"Test1dbss1db_06_1dbInit.class/jcp.xml");
			System.setProperty("Test1dbss1db_07",
					"Test1dbss1db_07t/resource/jcp.xml");
         	System.setProperty("Test1dbss1db_08",
					"Test1dbss1db_08.config");
			System.setProperty("Test1dbss1db_09",
					"Test1dbss1db_09.security.");
		    System.setProperty("Test1dbss1db_0x0",
					"Test1dbss1db_0x0jcp.xmlapache.");
			System.setProperty("Test1dbss1db_0xx0",
					"Test1dbss1db_0xx0.isInitialized");
			System.setProperty("Test1dbss1db_0xxx0",
					"Test1dbss1db_0xxx0est1dbInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1db = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1db != null) {
				 
				LOGGER.debug("in0in isTest1db");
				LOGGER.debug("in1dbin isTest1db");
				LOGGER.debug("in2in isTest1db");
				LOGGER.debug("in3in isTest1db");
				LOGGER.debug("in4in isTest1db");
				LOGGER.debug("in5in isTest1db");
				LOGGER.debug("in6in isTest1db");
				LOGGER.debug("in7in isTest1db");
				LOGGER.debug("in8in isTest1db");
				LOGGER.debug("in9in isTest1db");
				LOGGER.debug("in1db0in isTest1db");
				LOGGER.debug("in1db1dbin isTest1db");
				LOGGER.debug("in1db2in isTest1db");
				LOGGER.debug("in1db3in isTest1db");
				LOGGER.debug("in1db4in isTest1db");
				LOGGER.debug("in1db5in isTest1db");
				LOGGER.debug("in1db6in isTest1db");
				LOGGER.debug("in1db7in isTest1db");
				LOGGER.debug("in1db8in isTest1db");
				LOGGER.debug("in1db9in isTest1db");
				LOGGER.debug("in20in isTest1db");
			}

			 

			DocumentBuilderFactory dbfTest1db = DocumentBuilderFactory.newInstance();
			dbfTest1db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1db.setNamespaceAware(true);
			dbfTest1db.setValidating(false);

			DocumentBuilder db = dbfTest1db.newDocumentBuilder();
			Document doc = db.parse(isTest1db);
			Node configTest1db = doc.getFirstChild();
			while ((configTest1db != null)
					&& (!"Configuration".equals(configTest1db.getLocalName()))) {
				configTest1db = configTest1db.getNextSibling();
			}

			if (configTest1db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1db.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1d != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1db = (Element) el;

					Attr langAttr = resourceTest1db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1db.length; i++) {
						String uri = listTest1db[i].getAttributeNS(null, "URI");
						String javaclass = listTest1db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1db.length; i++) {
						String uritrans = tranElemTest1db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1db = algorithms[i];
							String id = elementTest1db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1db.length; i++) {
						String urisign = sigElemsTest1db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1db.length; i++) {
						String javaclass = resolverElemTest1db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1db-Test1dbRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1db = new ArrayList(resolverElemTest1db.length);
					for (int i = 0; i < resolverElemTest1db.length; i++) {
						String javaclass = resolverElemTest1db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1db = resolverElemTest1db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1db != null) && (descriptionTest1db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1db);
								LOGGER.debug("Test1dbRegister Resolver: " + javaclass
										+ ": " + descriptionTest1db);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1db.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1db.length; i++) {
						String namespace = nlTest1db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1db) {
			LOGGER.error("Crypto1db5Init:fileInit:error: ", eTest1db);
		}
	}

}
