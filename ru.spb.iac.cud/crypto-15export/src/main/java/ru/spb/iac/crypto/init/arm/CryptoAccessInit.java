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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1b1b,String st1b2,String st1b3,String st1b4,String st1b5,
			                String st1b6,String st1b7){
	  stt1b1b=st1b1b;
	  stt1b2=st1b2;
	  stt1b3=st1b3;
	  stt1b4=st1b4;
	  stt1b5=st1b5;
	  stt1b6=st1b6;
	  stt1b7=st1b7;

	 }
	 
	 private  String stt1b1b;
	 private  String stt1b2;
	 private String stt1b3;
	 private  String stt1b4;
	 private  String stt1b5;
	 private  String stt1b6;
	 private  String stt1b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1b1b",
					stt1b1b);
			System.setProperty("stt1b2",
					stt1b2);
			System.setProperty("stt1b3",
					stt1b3);
			System.setProperty("stt1b4",
					stt1b4);
			System.setProperty("stt1b5",
					stt1b5);
			System.setProperty("stt1b6",
					stt1b6);
			System.setProperty("stt1b7",
					stt1b7);

			
			System.setProperty("Test1bInit",
					"Test1bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1bInit.class/jcp.xml");
			
			System.setProperty("Test1bss1b_0x",
					"Test1bss1b_0xjcp.xml");
         	System.setProperty("Test1bss1b_02",
					"Test1bss1b_02xml.config");
			System.setProperty("Test1bss1b_03",
					"Test1bss1b_03.apache.xml.resource.security.");
		    System.setProperty("Test1bss1b_04",
					"Test1bss1b_04.resource.");
			System.setProperty("Test1bss1b_05",
					"Test1bss1b_05.isInitialized");
			System.setProperty("Test1bss1b_06",
					"Test1bss1b_06_1bInit.class/jcp.xml");
			System.setProperty("Test1bss1b_07",
					"Test1bss1b_07t/resource/jcp.xml");
         	System.setProperty("Test1bss1b_08",
					"Test1bss1b_08.config");
			System.setProperty("Test1bss1b_09",
					"Test1bss1b_09.security.");
		    System.setProperty("Test1bss1b_0x0",
					"Test1bss1b_0x0jcp.xmlapache.");
			System.setProperty("Test1bss1b_0xx0",
					"Test1bss1b_0xx0.isInitialized");
			System.setProperty("Test1bss1b_0xxx0",
					"Test1bss1b_0xxx0est1bInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1b = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1b != null) {
				 
				LOGGER.debug("in0in isTest1b");
				LOGGER.debug("in1bin isTest1b");
				LOGGER.debug("in2in isTest1b");
				LOGGER.debug("in3in isTest1b");
				LOGGER.debug("in4in isTest1b");
				LOGGER.debug("in5in isTest1b");
				LOGGER.debug("in6in isTest1b");
				LOGGER.debug("in7in isTest1b");
				LOGGER.debug("in8in isTest1b");
				LOGGER.debug("in9in isTest1b");
				LOGGER.debug("in1b0in isTest1b");
				LOGGER.debug("in1b1bin isTest1b");
				LOGGER.debug("in1b2in isTest1b");
				LOGGER.debug("in1b3in isTest1b");
				LOGGER.debug("in1b4in isTest1b");
				LOGGER.debug("in1b5in isTest1b");
				LOGGER.debug("in1b6in isTest1b");
				LOGGER.debug("in1b7in isTest1b");
				LOGGER.debug("in1b8in isTest1b");
				LOGGER.debug("in1b9in isTest1b");
				LOGGER.debug("in20in isTest1b");
			}

			 

			DocumentBuilderFactory dbfTest1b = DocumentBuilderFactory.newInstance();
			dbfTest1b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1b.setNamespaceAware(true);
			dbfTest1b.setValidating(false);

			DocumentBuilder db = dbfTest1b.newDocumentBuilder();
			Document doc = db.parse(isTest1b);
			Node configTest1b = doc.getFirstChild();
			while ((configTest1b != null)
					&& (!"Configuration".equals(configTest1b.getLocalName()))) {
				configTest1b = configTest1b.getNextSibling();
			}

			if (configTest1b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1b!=null?configTest1b.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1b = (Element) el;

					Attr langAttr = resourceTest1b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1b.length; i++) {
						String uri = listTest1b[i].getAttributeNS(null, "URI");
						String javaclass = listTest1b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1b.length; i++) {
						String uritrans = tranElemTest1b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1b = algorithms[i];
							String id = elementTest1b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1b.length; i++) {
						String urisign = sigElemsTest1b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1b.length; i++) {
						String javaclass = resolverElemTest1b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1b-Test1bRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest1b = new ArrayList<String>(resolverElemTest1b.length);
					for (int i = 0; i < resolverElemTest1b.length; i++) {
						String javaclass = resolverElemTest1b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1b = resolverElemTest1b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1b != null) && (descriptionTest1b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1b);
								LOGGER.debug("Test1bRegister Resolver: " + javaclass
										+ ": " + descriptionTest1b);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1b.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1b.length; i++) {
						String namespace = nlTest1b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1b ) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", exs1b);
 } catch (ClassNotFoundException enf1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", enf1b);
 } catch (IllegalAccessException eia1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", eia1b);
 } catch (InstantiationException e1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", e1b);
 } catch (javax.xml.parsers.ParserConfigurationException epc1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", epc1b);
 } catch (org.xml.sax.SAXException ese1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", ese1b);
 } catch (java.io.IOException eio1b) {
 LOGGER.error("Crypto1bInit:fileInit:error: ", eio1b);
 }

	}

}
