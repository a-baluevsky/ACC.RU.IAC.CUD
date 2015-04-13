package ru.spb.iac.crypto.init.arm;

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
	 
	 
	 public CryptoSettingsGroupInit(String st3b1,String st3b2,String st3b3b,String st3b4,String st3b5,
			                String st3b6,String st3b7){
	  stt3b1=st3b1;
	  stt3b2=st3b2;
	  stt3b3b=st3b3b;
	  stt3b4=st3b4;
	  stt3b5=st3b5;
	  stt3b6=st3b6;
	  stt3b7=st3b7;

	 }
	 
	 private  String stt3b1;
	 private  String stt3b2;
	 private String stt3b3b;
	 private  String stt3b4;
	 private  String stt3b5;
	 private  String stt3b6;
	 private  String stt3b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3b1",
					stt3b1);
			System.setProperty("stt3b2",
					stt3b2);
			System.setProperty("stt3b3b",
					stt3b3b);
			System.setProperty("stt3b4",
					stt3b4);
			System.setProperty("stt3b5",
					stt3b5);
			System.setProperty("stt3b6",
					stt3b6);
			System.setProperty("stt3b7",
					stt3b7);

			
			System.setProperty("Test3bInit",
					"Test3bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3bInit.class/jcp.xml");
			
			
			System.setProperty("Test3bss3b_0x",
					"Test3bss3b_0xjcp.xml");
         	System.setProperty("Test3bss3b_02",
					"Test3bss3b_02xml.config");
			System.setProperty("Test3bss3b_03b",
					"Test3bss3b_03b.apache.xml.resource.security.");
		    System.setProperty("Test3bss3b_04",
					"Test3bss3b_04.resource.");
			System.setProperty("Test3bss3b_05",
					"Test3bss3b_05.isInitialized");
			System.setProperty("Test3bss3b_06",
					"Test3bss3b_06_3bInit.class/jcp.xml");
			System.setProperty("Test3bss3b_07",
					"Test3bss3b_07t/resource/jcp.xml");
         	System.setProperty("Test3bss3b_08",
					"Test3bss3b_08.config");
			System.setProperty("Test3bss3b_09",
					"Test3bss3b_09.security.");
		    System.setProperty("Test3bss3b_0x0",
					"Test3bss3b_0x0jcp.xmlapache.");
			System.setProperty("Test3bss3b_0xx0",
					"Test3bss3b_0xx0.isInitialized");
			System.setProperty("Test3bss3b_0xxx0",
					"Test3bss3b_0xxx0est3bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3b = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3b != null) {
				 
				LOGGER.debug("in0in isTest3b");
				LOGGER.debug("inxin isTest3b");
				LOGGER.debug("in2in isTest3b");
				LOGGER.debug("in3bin isTest3b");
				LOGGER.debug("in4in isTest3b");
				LOGGER.debug("in5in isTest3b");
				LOGGER.debug("in6in isTest3b");
				LOGGER.debug("in7in isTest3b");
				LOGGER.debug("in8in isTest3b");
				LOGGER.debug("in9in isTest3b");
				LOGGER.debug("inx0in isTest3b");
				LOGGER.debug("inxxin isTest3b");
				LOGGER.debug("inx2in isTest3b");
				LOGGER.debug("inx3bin isTest3b");
				LOGGER.debug("inx4in isTest3b");
				LOGGER.debug("inx5in isTest3b");
				LOGGER.debug("inx6in isTest3b");
				LOGGER.debug("inx7in isTest3b");
				LOGGER.debug("inx8in isTest3b");
				LOGGER.debug("inx9in isTest3b");
				LOGGER.debug("in20in isTest3b");
			}

			 

			DocumentBuilderFactory dbfTest3b = DocumentBuilderFactory.newInstance();
			dbfTest3b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3b.setNamespaceAware(true);
			dbfTest3b.setValidating(false);

			DocumentBuilder db = dbfTest3b.newDocumentBuilder();
			Document doc = db.parse(isTest3b);
			Node configTest3b = doc.getFirstChild();
			while ((configTest3b != null)
					&& (!"Configuration".equals(configTest3b.getLocalName()))) {
				configTest3b = configTest3b.getNextSibling();
			}

			if (configTest3b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3b!=null?configTest3b.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3b = (Element) el;

					Attr langAttr = resourceTest3b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3b.length; i++) {
						String uri = listTest3b[i].getAttributeNS(null, "URI");
						String javaclass = listTest3b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3b.length; i++) {
						String uritrans = tranElemTest3b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3b = algorithms[i];
							String id = elementTest3b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3b.length; i++) {
						String urisign = sigElemsTest3b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3b.length; i++) {
						String javaclass = resolverElemTest3b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3bRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3b = new ArrayList(resolverElemTest3b.length);
					for (int i = 0; i < resolverElemTest3b.length; i++) {
						String javaclass = resolverElemTest3b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3b = resolverElemTest3b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3b != null) && (descriptionTest3b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3b);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3b);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3b.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3b.length; i++) {
						String namespace = nlTest3b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3b ) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", exs3b);
 } catch (ClassNotFoundException enf3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", enf3b);
 } catch (IllegalAccessException eia3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", eia3b);
 } catch (InstantiationException e3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", e3b);
 } catch (javax.xml.parsers.ParserConfigurationException epc3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", epc3b);
 } catch (org.xml.sax.SAXException ese3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", ese3b);
 } catch (java.io.IOException eio3b) {
 LOGGER.error("Crypto3bInit:fileInit:error: ", eio3b);
 }

	}

}
