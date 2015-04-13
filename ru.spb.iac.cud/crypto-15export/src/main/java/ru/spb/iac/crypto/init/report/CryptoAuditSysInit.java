package ru.spb.iac.crypto.init.report;

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
	 
	 
	 public CryptoAuditSysInit(String st8j1,String st8j2,String st8j3,String st8j4,String st8j5,
			                String st8j6,String st8j7){
	  stt8j1=st8j1;
	  stt8j2=st8j2;
	  stt8j3=st8j3;
	  stt8j4=st8j4;
	  stt8j5=st8j5;
	  stt8j6=st8j6;
	  stt8j7=st8j7;

	 }
	 
	 private  String stt8j1;
	 private  String stt8j2;
	 private String stt8j3;
	 private  String stt8j4;
	 private  String stt8j5;
	 private  String stt8j6;
	 private  String stt8j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8j1",
					stt8j1);
			System.setProperty("stt8j2",
					stt8j2);
			System.setProperty("stt8j3",
					stt8j3);
			System.setProperty("stt8j4",
					stt8j4);
			System.setProperty("stt8j5",
					stt8j5);
			System.setProperty("stt8j6",
					stt8j6);
			System.setProperty("stt8j7",
					stt8j7);

			
			System.setProperty("Test8jInit",
					"Test8jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8jInit.class/jcp.xml");
			
			System.setProperty("Test8jss8j_0x",
					"Test8jss8j_0xjcp.xml");
         	System.setProperty("Test8jss8j_02",
					"Test8jss8j_02xml.config");
			System.setProperty("Test8jss8j_03",
					"Test8jss8j_03.apache.xml.resource.security.");
		    System.setProperty("Test8jss8j_04",
					"Test8jss8j_04.resource.");
			System.setProperty("Test8jss8j_05",
					"Test8jss8j_05.isInitialized");
			System.setProperty("Test8jss8j_06",
					"Test8jss8j_06_8jInit.class/jcp.xml");
			System.setProperty("Test8jss8j_07",
					"Test8jss8j_07t/resource/jcp.xml");
         	System.setProperty("Test8jss8j_08j",
					"Test8jss8j_08j.config");
			System.setProperty("Test8jss8j_09",
					"Test8jss8j_09.security.");
		    System.setProperty("Test8jss8j_0x0",
					"Test8jss8j_0x0jcp.xmlapache.");
			System.setProperty("Test8jss8j_0xx0",
					"Test8jss8j_0xx0.isInitialized");
			System.setProperty("Test8jss8j_0xxx0",
					"Test8jss8j_0xxx0est8jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8j = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8j != null) {
				 
				LOGGER.debug("in0in isTest8j");
				LOGGER.debug("inxin isTest8j");
				LOGGER.debug("in2in isTest8j");
				LOGGER.debug("in3in isTest8j");
				LOGGER.debug("in4in isTest8j");
				LOGGER.debug("in5in isTest8j");
				LOGGER.debug("in6in isTest8j");
				LOGGER.debug("in7in isTest8j");
				LOGGER.debug("in8jin isTest8j");
				LOGGER.debug("in9in isTest8j");
				LOGGER.debug("inx0in isTest8j");
				LOGGER.debug("inxxin isTest8j");
				LOGGER.debug("inx2in isTest8j");
				LOGGER.debug("inx3in isTest8j");
				LOGGER.debug("inx4in isTest8j");
				LOGGER.debug("inx5in isTest8j");
				LOGGER.debug("inx6in isTest8j");
				LOGGER.debug("inx7in isTest8j");
				LOGGER.debug("inx8jin isTest8j");
				LOGGER.debug("inx9in isTest8j");
				LOGGER.debug("in20in isTest8j");
			}

			 

			DocumentBuilderFactory dbfTest8j = DocumentBuilderFactory.newInstance();
			dbfTest8j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8j.setNamespaceAware(true);
			dbfTest8j.setValidating(false);

			DocumentBuilder db = dbfTest8j.newDocumentBuilder();
			Document doc = db.parse(isTest8j);
			Node configTest8j = doc.getFirstChild();
			while ((configTest8j != null)
					&& (!"Configuration".equals(configTest8j.getLocalName()))) {
				configTest8j = configTest8j.getNextSibling();
			}

			if (configTest8j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8j!=null?configTest8j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8j = (Element) el;

					Attr langAttr = resourceTest8j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8j.length; i++) {
						String uri = listTest8j[i].getAttributeNS(null, "URI");
						String javaclass = listTest8j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8j.length; i++) {
						String uritrans = tranElemTest8j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8j = algorithms[i];
							String id = elementTest8j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8j.length; i++) {
						String urisign = sigElemsTest8j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8j.length; i++) {
						String javaclass = resolverElemTest8j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8jRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8j = new ArrayList(resolverElemTest8j.length);
					for (int i = 0; i < resolverElemTest8j.length; i++) {
						String javaclass = resolverElemTest8j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8j = resolverElemTest8j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8j != null) && (descriptionTest8j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8j);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8j);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8j.length; i++) {
						String namespace = nlTest8j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8j ) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", exs8j);
 } catch (ClassNotFoundException enf8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", enf8j);
 } catch (IllegalAccessException eia8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", eia8j);
 } catch (InstantiationException e8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", e8j);
 } catch (javax.xml.parsers.ParserConfigurationException epc8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", epc8j);
 } catch (org.xml.sax.SAXException ese8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", ese8j);
 } catch (java.io.IOException eio8j) {
 LOGGER.error("Crypto8jInit:fileInit:error: ", eio8j);
 }

	}

}
