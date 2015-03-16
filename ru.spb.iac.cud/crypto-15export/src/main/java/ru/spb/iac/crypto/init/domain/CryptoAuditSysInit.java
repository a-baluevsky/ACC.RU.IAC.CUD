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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8db1,String st8db2,String st8db3,String st8db4,String st8db5,
			                String st8db6,String st8db7){
	  stt8db1=st8db1;
	  stt8db2=st8db2;
	  stt8db3=st8db3;
	  stt8db4=st8db4;
	  stt8db5=st8db5;
	  stt8db6=st8db6;
	  stt8db7=st8db7;

	 }
	 
	 private  String stt8db1;
	 private  String stt8db2;
	 private String stt8db3;
	 private  String stt8db4;
	 private  String stt8db5;
	 private  String stt8db6;
	 private  String stt8db7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8db1",
					stt8db1);
			System.setProperty("stt8db2",
					stt8db2);
			System.setProperty("stt8db3",
					stt8db3);
			System.setProperty("stt8db4",
					stt8db4);
			System.setProperty("stt8db5",
					stt8db5);
			System.setProperty("stt8db6",
					stt8db6);
			System.setProperty("stt8db7",
					stt8db7);

			
			System.setProperty("Test8dbInit",
					"Test8dbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8db5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8dbInit.class/jcp.xml");
			
			System.setProperty("Test8dbss8db_0x",
					"Test8dbss8db_0xjcp.xml");
         	System.setProperty("Test8dbss8db_02",
					"Test8dbss8db_02xml.config");
			System.setProperty("Test8dbss8db_03",
					"Test8dbss8db_03.apache.xml.resource.security.");
		    System.setProperty("Test8dbss8db_04",
					"Test8dbss8db_04.resource.");
			System.setProperty("Test8dbss8db_05",
					"Test8dbss8db_05.isInitialized");
			System.setProperty("Test8dbss8db_06",
					"Test8dbss8db_06_8dbInit.class/jcp.xml");
			System.setProperty("Test8dbss8db_07",
					"Test8dbss8db_07t/resource/jcp.xml");
         	System.setProperty("Test8dbss8db_08db",
					"Test8dbss8db_08db.config");
			System.setProperty("Test8dbss8db_09",
					"Test8dbss8db_09.security.");
		    System.setProperty("Test8dbss8db_0x0",
					"Test8dbss8db_0x0jcp.xmlapache.");
			System.setProperty("Test8dbss8db_0xx0",
					"Test8dbss8db_0xx0.isInitialized");
			System.setProperty("Test8dbss8db_0xxx0",
					"Test8dbss8db_0xxx0est8dbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8db5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8db = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8db != null) {
				 
				LOGGER.debug("in0in isTest8db");
				LOGGER.debug("inxin isTest8db");
				LOGGER.debug("in2in isTest8db");
				LOGGER.debug("in3in isTest8db");
				LOGGER.debug("in4in isTest8db");
				LOGGER.debug("in5in isTest8db");
				LOGGER.debug("in6in isTest8db");
				LOGGER.debug("in7in isTest8db");
				LOGGER.debug("in8dbin isTest8db");
				LOGGER.debug("in9in isTest8db");
				LOGGER.debug("inx0in isTest8db");
				LOGGER.debug("inxxin isTest8db");
				LOGGER.debug("inx2in isTest8db");
				LOGGER.debug("inx3in isTest8db");
				LOGGER.debug("inx4in isTest8db");
				LOGGER.debug("inx5in isTest8db");
				LOGGER.debug("inx6in isTest8db");
				LOGGER.debug("inx7in isTest8db");
				LOGGER.debug("inx8dbin isTest8db");
				LOGGER.debug("inx9in isTest8db");
				LOGGER.debug("in20in isTest8db");
			}

			 

			DocumentBuilderFactory dbfTest8db = DocumentBuilderFactory.newInstance();
			dbfTest8db.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8db.setNamespaceAware(true);
			dbfTest8db.setValidating(false);

			DocumentBuilder db = dbfTest8db.newDocumentBuilder();
			Document doc = db.parse(isTest8db);
			Node configTest8db = doc.getFirstChild();
			while ((configTest8db != null)
					&& (!"Configuration".equals(configTest8db.getLocalName()))) {
				configTest8db = configTest8db.getNextSibling();
			}

			if (configTest8db != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8db.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8db = (Element) el;

					Attr langAttr = resourceTest8db
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8db
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8db = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8db);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8db.length; i++) {
						String uri = listTest8db[i].getAttributeNS(null, "URI");
						String javaclass = listTest8db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8db.length; i++) {
						String uritrans = tranElemTest8db[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8db = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8db != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8db.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8db = algorithms[i];
							String id = elementTest8db.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8db));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8db.length; i++) {
						String urisign = sigElemsTest8db[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8db[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8db.length; i++) {
						String javaclass = resolverElemTest8db[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8dbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8dbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8dbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8dbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8db = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8db = new ArrayList(resolverElemTest8db.length);
					for (int i = 0; i < resolverElemTest8db.length; i++) {
						String javaclass = resolverElemTest8db[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8db = resolverElemTest8db[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8db != null) && (descriptionTest8db.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8db);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8db);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8db.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8db);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8db = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8db.length; i++) {
						String namespace = nlTest8db[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8db[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8db) {
			LOGGER.error("Crypto8db5Init:fileInit:error: ", eTest8db);
		}
	}

}
