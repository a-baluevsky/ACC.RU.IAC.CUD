package ru.spb.iac.crypto.init;

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
	 
	 
	 public CryptoSettingsGroupInit(String st31,String st32,String st33,String st34,String st35,
			                String st36,String st37){
	  stt31=st31;
	  stt32=st32;
	  stt33=st33;
	  stt34=st34;
	  stt35=st35;
	  stt36=st36;
	  stt37=st37;

	 }
	 
	 private  String stt31;
	 private  String stt32;
	 private String stt33;
	 private  String stt34;
	 private  String stt35;
	 private  String stt36;
	 private  String stt37;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt31",
					stt31);
			System.setProperty("stt32",
					stt32);
			System.setProperty("stt33",
					stt33);
			System.setProperty("stt34",
					stt34);
			System.setProperty("stt35",
					stt35);
			System.setProperty("stt36",
					stt36);
			System.setProperty("stt37",
					stt37);

			
			System.setProperty("Test3Init",
					"Test3Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto35Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoSettingsGroupInit.class/jcp.xml");
			
			
			System.setProperty("Test3ss3_0x",
					"Test3ss3_0xjcp.xml");
         	System.setProperty("Test3ss3_02",
					"Test3ss3_02xml.config");
			System.setProperty("Test3ss3_03",
					"Test3ss3_03.apache.xml.resource.security.");
		    System.setProperty("Test3ss3_04",
					"Test3ss3_04.resource.");
			System.setProperty("Test3ss3_05",
					"Test3ss3_05.isInitialized");
			System.setProperty("Test3ss3_06",
					"Test3ss3_06_3Init.class/jcp.xml");
			System.setProperty("Test3ss3_07",
					"Test3ss3_07t/resource/jcp.xml");
         	System.setProperty("Test3ss3_08",
					"Test3ss3_08.config");
			System.setProperty("Test3ss3_09",
					"Test3ss3_09.security.");
		    System.setProperty("Test3ss3_0x0",
					"Test3ss3_0x0jcp.xmlapache.");
			System.setProperty("Test3ss3_0xx0",
					"Test3ss3_0xx0.isInitialized");
			System.setProperty("Test3ss3_0xxx0",
					"Test3ss3_0xxx0est3Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto35Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3 = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3 != null) {
				 
				LOGGER.debug("in0in isTest3");
				LOGGER.debug("inxin isTest3");
				LOGGER.debug("in2in isTest3");
				LOGGER.debug("in3in isTest3");
				LOGGER.debug("in4in isTest3");
				LOGGER.debug("in5in isTest3");
				LOGGER.debug("in6in isTest3");
				LOGGER.debug("in7in isTest3");
				LOGGER.debug("in8in isTest3");
				LOGGER.debug("in9in isTest3");
				LOGGER.debug("inx0in isTest3");
				LOGGER.debug("inxxin isTest3");
				LOGGER.debug("inx2in isTest3");
				LOGGER.debug("inx3in isTest3");
				LOGGER.debug("inx4in isTest3");
				LOGGER.debug("inx5in isTest3");
				LOGGER.debug("inx6in isTest3");
				LOGGER.debug("inx7in isTest3");
				LOGGER.debug("inx8in isTest3");
				LOGGER.debug("inx9in isTest3");
				LOGGER.debug("in20in isTest3");
			}

			 

			DocumentBuilderFactory dbfTest3 = DocumentBuilderFactory.newInstance();
			dbfTest3.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3.setNamespaceAware(true);
			dbfTest3.setValidating(false);

			DocumentBuilder db = dbfTest3.newDocumentBuilder();
			Document doc = db.parse(isTest3);
			Node configTest3 = doc.getFirstChild();
			while ((configTest3 != null)
					&& (!"Configuration".equals(configTest3.getLocalName()))) {
				configTest3 = configTest3.getNextSibling();
			}

			if (configTest3 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3!=null?configTest3.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3 = (Element) el;

					Attr langAttr = resourceTest3
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3.length; i++) {
						String uri = listTest3[i].getAttributeNS(null, "URI");
						String javaclass = listTest3[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3.length; i++) {
						String uritrans = tranElemTest3[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3 = algorithms[i];
							String id = elementTest3.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3.length; i++) {
						String urisign = sigElemsTest3[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3.length; i++) {
						String javaclass = resolverElemTest3[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3Register Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3 = new ArrayList(resolverElemTest3.length);
					for (int i = 0; i < resolverElemTest3.length; i++) {
						String javaclass = resolverElemTest3[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3 = resolverElemTest3[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3 != null) && (descriptionTest3.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3.length; i++) {
						String namespace = nlTest3[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3 ) {
 LOGGER.error("Crypto3Init:fileInit:error: ", exs3);
 } catch (ClassNotFoundException enf3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", enf3);
 } catch (IllegalAccessException eia3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", eia3);
 } catch (InstantiationException e3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", e3);
 } catch (javax.xml.parsers.ParserConfigurationException epc3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", epc3);
 } catch (org.xml.sax.SAXException ese3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", ese3);
 } catch (java.io.IOException eio3) {
 LOGGER.error("Crypto3Init:fileInit:error: ", eio3);
 }

	}

}
