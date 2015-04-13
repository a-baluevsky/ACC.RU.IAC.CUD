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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7j1,String st7j2,String st7j3,String st7j4,String st7j5,
			                String st7j6,String st7j7j){
	  stt7j1=st7j1;
	  stt7j2=st7j2;
	  stt7j3=st7j3;
	  stt7j4=st7j4;
	  stt7j5=st7j5;
	  stt7j6=st7j6;
	  stt7j7j=st7j7j;

	 }
	 
	 private  String stt7j1;
	 private  String stt7j2;
	 private String stt7j3;
	 private  String stt7j4;
	 private  String stt7j5;
	 private  String stt7j6;
	 private  String stt7j7j;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7j1",
					stt7j1);
			System.setProperty("stt7j2",
					stt7j2);
			System.setProperty("stt7j3",
					stt7j3);
			System.setProperty("stt7j4",
					stt7j4);
			System.setProperty("stt7j5",
					stt7j5);
			System.setProperty("stt7j6",
					stt7j6);
			System.setProperty("stt7j7j",
					stt7j7j);

			
			System.setProperty("Test7jInit",
					"Test7jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7jInit.class/jcp.xml");
			
			System.setProperty("Test7jss7j_0x",
					"Test7jss7j_0xjcp.xml");
         	System.setProperty("Test7jss7j_02",
					"Test7jss7j_02xml.config");
			System.setProperty("Test7jss7j_03",
					"Test7jss7j_03.apache.xml.resource.security.");
		    System.setProperty("Test7jss7j_04",
					"Test7jss7j_04.resource.");
			System.setProperty("Test7jss7j_05",
					"Test7jss7j_05.isInitialized");
			System.setProperty("Test7jss7j_06",
					"Test7jss7j_06_7jInit.class/jcp.xml");
			System.setProperty("Test7jss7j_07j",
					"Test7jss7j_07jt/resource/jcp.xml");
         	System.setProperty("Test7jss7j_08",
					"Test7jss7j_08.config");
			System.setProperty("Test7jss7j_09",
					"Test7jss7j_09.security.");
		    System.setProperty("Test7jss7j_0x0",
					"Test7jss7j_0x0jcp.xmlapache.");
			System.setProperty("Test7jss7j_0xx0",
					"Test7jss7j_0xx0.isInitialized");
			System.setProperty("Test7jss7j_0xxx0",
					"Test7jss7j_0xxx0est7jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7j = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7j != null) {
				 
				LOGGER.debug("in0in isTest7j");
				LOGGER.debug("inxin isTest7j");
				LOGGER.debug("in2in isTest7j");
				LOGGER.debug("in3in isTest7j");
				LOGGER.debug("in4in isTest7j");
				LOGGER.debug("in5in isTest7j");
				LOGGER.debug("in6in isTest7j");
				LOGGER.debug("in7jin isTest7j");
				LOGGER.debug("in8in isTest7j");
				LOGGER.debug("in9in isTest7j");
				LOGGER.debug("inx0in isTest7j");
				LOGGER.debug("inxxin isTest7j");
				LOGGER.debug("inx2in isTest7j");
				LOGGER.debug("inx3in isTest7j");
				LOGGER.debug("inx4in isTest7j");
				LOGGER.debug("inx5in isTest7j");
				LOGGER.debug("inx6in isTest7j");
				LOGGER.debug("inx7jin isTest7j");
				LOGGER.debug("inx8in isTest7j");
				LOGGER.debug("inx9in isTest7j");
				LOGGER.debug("in20in isTest7j");
			}

			 

			DocumentBuilderFactory dbfTest7j = DocumentBuilderFactory.newInstance();
			dbfTest7j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7j.setNamespaceAware(true);
			dbfTest7j.setValidating(false);

			DocumentBuilder db = dbfTest7j.newDocumentBuilder();
			Document doc = db.parse(isTest7j);
			Node configTest7j = doc.getFirstChild();
			while ((configTest7j != null)
					&& (!"Configuration".equals(configTest7j.getLocalName()))) {
				configTest7j = configTest7j.getNextSibling();
			}

			if (configTest7j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7j!=null?configTest7j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7j = (Element) el;

					Attr langAttr = resourceTest7j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7j.length; i++) {
						String uri = listTest7j[i].getAttributeNS(null, "URI");
						String javaclass = listTest7j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7j.length; i++) {
						String uritrans = tranElemTest7j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7j = algorithms[i];
							String id = elementTest7j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7j.length; i++) {
						String urisign = sigElemsTest7j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7j.length; i++) {
						String javaclass = resolverElemTest7j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7jRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7j = new ArrayList(resolverElemTest7j.length);
					for (int i = 0; i < resolverElemTest7j.length; i++) {
						String javaclass = resolverElemTest7j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7j = resolverElemTest7j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7j != null) && (descriptionTest7j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7j);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7j);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7j.length; i++) {
						String namespace = nlTest7j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7j ) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", exs7j);
 } catch (ClassNotFoundException enf7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", enf7j);
 } catch (IllegalAccessException eia7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", eia7j);
 } catch (InstantiationException e7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", e7j);
 } catch (javax.xml.parsers.ParserConfigurationException epc7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", epc7j);
 } catch (org.xml.sax.SAXException ese7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", ese7j);
 } catch (java.io.IOException eio7j) {
 LOGGER.error("Crypto7jInit:fileInit:error: ", eio7j);
 }

	}

}
