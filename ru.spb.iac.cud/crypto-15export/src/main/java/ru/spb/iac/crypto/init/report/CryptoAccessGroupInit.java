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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2j1,String st2j2j,String st2j3,String st2j4,String st2j5,
			                String st2j6,String st2j7){
	  stt2j1=st2j1;
	  stt2j2j=st2j2j;
	  stt2j3=st2j3;
	  stt2j4=st2j4;
	  stt2j5=st2j5;
	  stt2j6=st2j6;
	  stt2j7=st2j7;

	 }
	 
	 private  String stt2j1;
	 private  String stt2j2j;
	 private String stt2j3;
	 private  String stt2j4;
	 private  String stt2j5;
	 private  String stt2j6;
	 private  String stt2j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2j1",
					stt2j1);
			System.setProperty("stt2j2j",
					stt2j2j);
			System.setProperty("stt2j3",
					stt2j3);
			System.setProperty("stt2j4",
					stt2j4);
			System.setProperty("stt2j5",
					stt2j5);
			System.setProperty("stt2j6",
					stt2j6);
			System.setProperty("stt2j7",
					stt2j7);

			
			System.setProperty("Test2jInit",
					"Test2jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2jInit.class/jcp.xml");
			
			System.setProperty("Test2jss2j_0x",
					"Test2jss2j_0xjcp.xml");
         	System.setProperty("Test2jss2j_02j",
					"Test2jss2j_02jxml.config");
			System.setProperty("Test2jss2j_03",
					"Test2jss2j_03.apache.xml.resource.security.");
		    System.setProperty("Test2jss2j_04",
					"Test2jss2j_04.resource.");
			System.setProperty("Test2jss2j_05",
					"Test2jss2j_05.isInitialized");
			System.setProperty("Test2jss2j_06",
					"Test2jss2j_06_2jInit.class/jcp.xml");
			System.setProperty("Test2jss2j_07",
					"Test2jss2j_07t/resource/jcp.xml");
         	System.setProperty("Test2jss2j_08",
					"Test2jss2j_08.config");
			System.setProperty("Test2jss2j_09",
					"Test2jss2j_09.security.");
		    System.setProperty("Test2jss2j_0x0",
					"Test2jss2j_0x0jcp.xmlapache.");
			System.setProperty("Test2jss2j_0xx0",
					"Test2jss2j_0xx0.isInitialized");
			System.setProperty("Test2jss2j_0xxx0",
					"Test2jss2j_0xxx0est2jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2j = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2j != null) {
				 
				LOGGER.debug("in0in isTest2j");
				LOGGER.debug("inxin isTest2j");
				LOGGER.debug("in2jin isTest2j");
				LOGGER.debug("in3in isTest2j");
				LOGGER.debug("in4in isTest2j");
				LOGGER.debug("in5in isTest2j");
				LOGGER.debug("in6in isTest2j");
				LOGGER.debug("in7in isTest2j");
				LOGGER.debug("in8in isTest2j");
				LOGGER.debug("in9in isTest2j");
				LOGGER.debug("inx0in isTest2j");
				LOGGER.debug("inxxin isTest2j");
				LOGGER.debug("inx2jin isTest2j");
				LOGGER.debug("inx3in isTest2j");
				LOGGER.debug("inx4in isTest2j");
				LOGGER.debug("inx5in isTest2j");
				LOGGER.debug("inx6in isTest2j");
				LOGGER.debug("inx7in isTest2j");
				LOGGER.debug("inx8in isTest2j");
				LOGGER.debug("inx9in isTest2j");
				LOGGER.debug("in2j0in isTest2j");
			}

			 

			DocumentBuilderFactory dbfTest2j = DocumentBuilderFactory.newInstance();
			dbfTest2j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2j.setNamespaceAware(true);
			dbfTest2j.setValidating(false);

			DocumentBuilder db = dbfTest2j.newDocumentBuilder();
			Document doc = db.parse(isTest2j);
			Node configTest2j = doc.getFirstChild();
			while ((configTest2j != null)
					&& (!"Configuration".equals(configTest2j.getLocalName()))) {
				configTest2j = configTest2j.getNextSibling();
			}

			if (configTest2j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2j!=null?configTest2j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2j = (Element) el;

					Attr langAttr = resourceTest2j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2j.length; i++) {
						String uri = listTest2j[i].getAttributeNS(null, "URI");
						String javaclass = listTest2j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2j.length; i++) {
						String uritrans = tranElemTest2j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2j = algorithms[i];
							String id = elementTest2j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2j.length; i++) {
						String urisign = sigElemsTest2j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2j.length; i++) {
						String javaclass = resolverElemTest2j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2jRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2j = new ArrayList(resolverElemTest2j.length);
					for (int i = 0; i < resolverElemTest2j.length; i++) {
						String javaclass = resolverElemTest2j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2j = resolverElemTest2j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2j != null) && (descriptionTest2j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2j);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2j);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2j.length; i++) {
						String namespace = nlTest2j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2j ) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", exs2j);
 } catch (ClassNotFoundException enf2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", enf2j);
 } catch (IllegalAccessException eia2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", eia2j);
 } catch (InstantiationException e2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", e2j);
 } catch (javax.xml.parsers.ParserConfigurationException epc2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", epc2j);
 } catch (org.xml.sax.SAXException ese2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", ese2j);
 } catch (java.io.IOException eio2j) {
 LOGGER.error("Crypto2jInit:fileInit:error: ", eio2j);
 }

	}

}
