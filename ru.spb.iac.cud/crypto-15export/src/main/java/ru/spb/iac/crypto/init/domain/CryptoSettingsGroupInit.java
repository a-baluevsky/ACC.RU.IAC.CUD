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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3db1,String st3db2,String st3db3db,String st3db4,String st3db5,
			                String st3db6,String st3db7){
	  stt3db1=st3db1;
	  stt3db2=st3db2;
	  stt3db3db=st3db3db;
	  stt3db4=st3db4;
	  stt3db5=st3db5;
	  stt3db6=st3db6;
	  stt3db7=st3db7;

	 }
	 
	 private  String stt3db1;
	 private  String stt3db2;
	 private String stt3db3db;
	 private  String stt3db4;
	 private  String stt3db5;
	 private  String stt3db6;
	 private  String stt3db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3db1",
					stt3db1);
			System.setProperty("stt3db2",
					stt3db2);
			System.setProperty("stt3db3db",
					stt3db3db);
			System.setProperty("stt3db4",
					stt3db4);
			System.setProperty("stt3db5",
					stt3db5);
			System.setProperty("stt3db6",
					stt3db6);
			System.setProperty("stt3db7",
					stt3db7);

			
			System.setProperty("Test3dbInit",
					"Test3dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3dbInit.class/jcp.xml");
			
			
			System.setProperty("Test3dbss3db_0x",
					"Test3dbss3db_0xjcp.xml");
         	System.setProperty("Test3dbss3db_02",
					"Test3dbss3db_02xml.config");
			System.setProperty("Test3dbss3db_03db",
					"Test3dbss3db_03db.apache.xml.resource.security.");
		    System.setProperty("Test3dbss3db_04",
					"Test3dbss3db_04.resource.");
			System.setProperty("Test3dbss3db_05",
					"Test3dbss3db_05.isInitialized");
			System.setProperty("Test3dbss3db_06",
					"Test3dbss3db_06_3dbInit.class/jcp.xml");
			System.setProperty("Test3dbss3db_07",
					"Test3dbss3db_07t/resource/jcp.xml");
         	System.setProperty("Test3dbss3db_08",
					"Test3dbss3db_08.config");
			System.setProperty("Test3dbss3db_09",
					"Test3dbss3db_09.security.");
		    System.setProperty("Test3dbss3db_0x0",
					"Test3dbss3db_0x0jcp.xmlapache.");
			System.setProperty("Test3dbss3db_0xx0",
					"Test3dbss3db_0xx0.isInitialized");
			System.setProperty("Test3dbss3db_0xxx0",
					"Test3dbss3db_0xxx0est3dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3db = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3db != null) {
				 
				LOGGER.debug("in0in isTest3db");
				LOGGER.debug("inxin isTest3db");
				LOGGER.debug("in2in isTest3db");
				LOGGER.debug("in3dbin isTest3db");
				LOGGER.debug("in4in isTest3db");
				LOGGER.debug("in5in isTest3db");
				LOGGER.debug("in6in isTest3db");
				LOGGER.debug("in7in isTest3db");
				LOGGER.debug("in8in isTest3db");
				LOGGER.debug("in9in isTest3db");
				LOGGER.debug("inx0in isTest3db");
				LOGGER.debug("inxxin isTest3db");
				LOGGER.debug("inx2in isTest3db");
				LOGGER.debug("inx3dbin isTest3db");
				LOGGER.debug("inx4in isTest3db");
				LOGGER.debug("inx5in isTest3db");
				LOGGER.debug("inx6in isTest3db");
				LOGGER.debug("inx7in isTest3db");
				LOGGER.debug("inx8in isTest3db");
				LOGGER.debug("inx9in isTest3db");
				LOGGER.debug("in20in isTest3db");
			}

			 

			DocumentBuilderFactory dbfTest3db = DocumentBuilderFactory.newInstance();
			dbfTest3db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3db.setNamespaceAware(true);
			dbfTest3db.setValidating(false);

			DocumentBuilder db = dbfTest3db.newDocumentBuilder();
			Document doc = db.parse(isTest3db);
			Node configTest3db = doc.getFirstChild();
			while ((configTest3db != null)
					&& (!"Configuration".equals(configTest3db.getLocalName()))) {
				configTest3db = configTest3db.getNextSibling();
			}

			if (configTest3db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3db.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3db = (Element) el;

					Attr langAttr = resourceTest3db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3db.length; i++) {
						String uri = listTest3db[i].getAttributeNS(null, "URI");
						String javaclass = listTest3db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3db.length; i++) {
						String uritrans = tranElemTest3db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3db = algorithms[i];
							String id = elementTest3db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3db.length; i++) {
						String urisign = sigElemsTest3db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3db.length; i++) {
						String javaclass = resolverElemTest3db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3dbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3db = new ArrayList(resolverElemTest3db.length);
					for (int i = 0; i < resolverElemTest3db.length; i++) {
						String javaclass = resolverElemTest3db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3db = resolverElemTest3db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3db != null) && (descriptionTest3db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3db);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3db);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3db.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3db.length; i++) {
						String namespace = nlTest3db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3db) {
			LOGGER.error("Crypto3db5Init:fileInit:error: ", eTest3db);
		}
	}

}
