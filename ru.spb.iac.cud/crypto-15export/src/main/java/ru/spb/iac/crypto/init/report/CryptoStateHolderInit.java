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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5j1,String st5j2,String st5j3,String st5j4,String st5j5j,
			                String st5j6,String st5j7){
	  stt5j1=st5j1;
	  stt5j2=st5j2;
	  stt5j3=st5j3;
	  stt5j4=st5j4;
	  stt5j5j=st5j5j;
	  stt5j6=st5j6;
	  stt5j7=st5j7;

	 }
	 
	 private  String stt5j1;
	 private  String stt5j2;
	 private String stt5j3;
	 private  String stt5j4;
	 private  String stt5j5j;
	 private  String stt5j6;
	 private  String stt5j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5j1",
					stt5j1);
			System.setProperty("stt5j2",
					stt5j2);
			System.setProperty("stt5j3",
					stt5j3);
			System.setProperty("stt5j4",
					stt5j4);
			System.setProperty("stt5j5j",
					stt5j5j);
			System.setProperty("stt5j6",
					stt5j6);
			System.setProperty("stt5j7",
					stt5j7);

			
			System.setProperty("Test5jInit",
					"Test5jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5j5jInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5jInit.class/jcp.xml");
			
			System.setProperty("Test5jss5j_0x",
					"Test5jss5j_0xjcp.xml");
         	System.setProperty("Test5jss5j_02",
					"Test5jss5j_02xml.config");
			System.setProperty("Test5jss5j_03",
					"Test5jss5j_03.apache.xml.resource.security.");
		    System.setProperty("Test5jss5j_04",
					"Test5jss5j_04.resource.");
			System.setProperty("Test5jss5j_05j",
					"Test5jss5j_05j.isInitialized");
			System.setProperty("Test5jss5j_06",
					"Test5jss5j_06_5jInit.class/jcp.xml");
			System.setProperty("Test5jss5j_07",
					"Test5jss5j_07t/resource/jcp.xml");
         	System.setProperty("Test5jss5j_08",
					"Test5jss5j_08.config");
			System.setProperty("Test5jss5j_09",
					"Test5jss5j_09.security.");
		    System.setProperty("Test5jss5j_0x0",
					"Test5jss5j_0x0jcp.xmlapache.");
			System.setProperty("Test5jss5j_0xx0",
					"Test5jss5j_0xx0.isInitialized");
			System.setProperty("Test5jss5j_0xxx0",
					"Test5jss5j_0xxx0est5jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5j5jInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5j = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5j != null) {
				 
				LOGGER.debug("in0in isTest5j");
				LOGGER.debug("inxin isTest5j");
				LOGGER.debug("in2in isTest5j");
				LOGGER.debug("in3in isTest5j");
				LOGGER.debug("in4in isTest5j");
				LOGGER.debug("in5jin isTest5j");
				LOGGER.debug("in6in isTest5j");
				LOGGER.debug("in7in isTest5j");
				LOGGER.debug("in8in isTest5j");
				LOGGER.debug("in9in isTest5j");
				LOGGER.debug("inx0in isTest5j");
				LOGGER.debug("inxxin isTest5j");
				LOGGER.debug("inx2in isTest5j");
				LOGGER.debug("inx3in isTest5j");
				LOGGER.debug("inx4in isTest5j");
				LOGGER.debug("inx5jin isTest5j");
				LOGGER.debug("inx6in isTest5j");
				LOGGER.debug("inx7in isTest5j");
				LOGGER.debug("inx8in isTest5j");
				LOGGER.debug("inx9in isTest5j");
				LOGGER.debug("in20in isTest5j");
			}

			 

			DocumentBuilderFactory dbfTest5j = DocumentBuilderFactory.newInstance();
			dbfTest5j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5j.setNamespaceAware(true);
			dbfTest5j.setValidating(false);

			DocumentBuilder db = dbfTest5j.newDocumentBuilder();
			Document doc = db.parse(isTest5j);
			Node configTest5j = doc.getFirstChild();
			while ((configTest5j != null)
					&& (!"Configuration".equals(configTest5j.getLocalName()))) {
				configTest5j = configTest5j.getNextSibling();
			}

			if (configTest5j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5j!=null?configTest5j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5j = (Element) el;

					Attr langAttr = resourceTest5j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5j.length; i++) {
						String uri = listTest5j[i].getAttributeNS(null, "URI");
						String javaclass = listTest5j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5j.length; i++) {
						String uritrans = tranElemTest5j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5j = algorithms[i];
							String id = elementTest5j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5j.length; i++) {
						String urisign = sigElemsTest5j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5j.length; i++) {
						String javaclass = resolverElemTest5j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5jRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5j = new ArrayList(resolverElemTest5j.length);
					for (int i = 0; i < resolverElemTest5j.length; i++) {
						String javaclass = resolverElemTest5j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5j = resolverElemTest5j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5j != null) && (descriptionTest5j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5j);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5j);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5j.length; i++) {
						String namespace = nlTest5j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5j ) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", exs5j);
 } catch (ClassNotFoundException enf5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", enf5j);
 } catch (IllegalAccessException eia5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", eia5j);
 } catch (InstantiationException e5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", e5j);
 } catch (javax.xml.parsers.ParserConfigurationException epc5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", epc5j);
 } catch (org.xml.sax.SAXException ese5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", ese5j);
 } catch (java.io.IOException eio5j) {
 LOGGER.error("Crypto5jInit:fileInit:error: ", eio5j);
 }

	}

}
