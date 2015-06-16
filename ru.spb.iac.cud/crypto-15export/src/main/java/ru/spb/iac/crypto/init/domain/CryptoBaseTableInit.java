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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4db1,String st4db2,String st4db3,String st4db4db,String st4db5,
			                String st4db6,String st4db7){
	  stt4db1=st4db1;
	  stt4db2=st4db2;
	  stt4db3=st4db3;
	  stt4db4db=st4db4db;
	  stt4db5=st4db5;
	  stt4db6=st4db6;
	  stt4db7=st4db7;

	 }
	 
	 private  String stt4db1;
	 private  String stt4db2;
	 private String stt4db3;
	 private  String stt4db4db;
	 private  String stt4db5;
	 private  String stt4db6;
	 private  String stt4db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4db1",
					stt4db1);
			System.setProperty("stt4db2",
					stt4db2);
			System.setProperty("stt4db3",
					stt4db3);
			System.setProperty("stt4db4db",
					stt4db4db);
			System.setProperty("stt4db5",
					stt4db5);
			System.setProperty("stt4db6",
					stt4db6);
			System.setProperty("stt4db7",
					stt4db7);

			
			System.setProperty("Test4dbInit",
					"Test4dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4dbInit.class/jcp.xml");
			
			System.setProperty("Test4dbss4db_0x",
					"Test4dbss4db_0xjcp.xml");
         	System.setProperty("Test4dbss4db_02",
					"Test4dbss4db_02xml.config");
			System.setProperty("Test4dbss4db_03",
					"Test4dbss4db_03.apache.xml.resource.security.");
		    System.setProperty("Test4dbss4db_04db",
					"Test4dbss4db_04db.resource.");
			System.setProperty("Test4dbss4db_05",
					"Test4dbss4db_05.isInitialized");
			System.setProperty("Test4dbss4db_06",
					"Test4dbss4db_06_4dbInit.class/jcp.xml");
			System.setProperty("Test4dbss4db_07",
					"Test4dbss4db_07t/resource/jcp.xml");
         	System.setProperty("Test4dbss4db_08",
					"Test4dbss4db_08.config");
			System.setProperty("Test4dbss4db_09",
					"Test4dbss4db_09.security.");
		    System.setProperty("Test4dbss4db_0x0",
					"Test4dbss4db_0x0jcp.xmlapache.");
			System.setProperty("Test4dbss4db_0xx0",
					"Test4dbss4db_0xx0.isInitialized");
			System.setProperty("Test4dbss4db_0xxx0",
					"Test4dbss4db_0xxx0est4dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4db = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4db != null) {
				 
				LOGGER.debug("in0in isTest4db");
				LOGGER.debug("inxin isTest4db");
				LOGGER.debug("in2in isTest4db");
				LOGGER.debug("in3in isTest4db");
				LOGGER.debug("in4dbin isTest4db");
				LOGGER.debug("in5in isTest4db");
				LOGGER.debug("in6in isTest4db");
				LOGGER.debug("in7in isTest4db");
				LOGGER.debug("in8in isTest4db");
				LOGGER.debug("in9in isTest4db");
				LOGGER.debug("inx0in isTest4db");
				LOGGER.debug("inxxin isTest4db");
				LOGGER.debug("inx2in isTest4db");
				LOGGER.debug("inx3in isTest4db");
				LOGGER.debug("inx4dbin isTest4db");
				LOGGER.debug("inx5in isTest4db");
				LOGGER.debug("inx6in isTest4db");
				LOGGER.debug("inx7in isTest4db");
				LOGGER.debug("inx8in isTest4db");
				LOGGER.debug("inx9in isTest4db");
				LOGGER.debug("in20in isTest4db");
			}

			 

			DocumentBuilderFactory dbfTest4db = DocumentBuilderFactory.newInstance();
			dbfTest4db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4db.setNamespaceAware(true);
			dbfTest4db.setValidating(false);

			DocumentBuilder db = dbfTest4db.newDocumentBuilder();
			Document doc = db.parse(isTest4db);
			Node configTest4db = doc.getFirstChild();
			while ((configTest4db != null)
					&& (!"Configuration".equals(configTest4db.getLocalName()))) {
				configTest4db = configTest4db.getNextSibling();
			}

			if (configTest4db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4db!=null?configTest4db.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4db = (Element) el;

					Attr langAttr = resourceTest4db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4db.length; i++) {
						String uri = listTest4db[i].getAttributeNS(null, "URI");
						String javaclass = listTest4db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4db.length; i++) {
						String uritrans = tranElemTest4db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4db = algorithms[i];
							String id = elementTest4db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4db.length; i++) {
						String urisign = sigElemsTest4db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4db.length; i++) {
						String javaclass = resolverElemTest4db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4dbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4dbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest4db = new ArrayList<String>(resolverElemTest4db.length);
					for (int i = 0; i < resolverElemTest4db.length; i++) {
						String javaclass = resolverElemTest4db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4db = resolverElemTest4db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4db != null) && (descriptionTest4db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4db);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4db);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4db.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4db.length; i++) {
						String namespace = nlTest4db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4db ) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", exs4db);
 } catch (ClassNotFoundException enf4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", enf4db);
 } catch (IllegalAccessException eia4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", eia4db);
 } catch (InstantiationException e4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", e4db);
 } catch (javax.xml.parsers.ParserConfigurationException epc4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", epc4db);
 } catch (org.xml.sax.SAXException ese4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", ese4db);
 } catch (java.io.IOException eio4db) {
 LOGGER.error("Crypto4dbInit:fileInit:error: ", eio4db);
 }

	}

}
