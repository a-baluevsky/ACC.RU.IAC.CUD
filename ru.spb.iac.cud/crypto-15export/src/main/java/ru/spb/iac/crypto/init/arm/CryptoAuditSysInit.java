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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8b1,String st8b2,String st8b3,String st8b4,String st8b5,
			                String st8b6,String st8b7){
	  stt8b1=st8b1;
	  stt8b2=st8b2;
	  stt8b3=st8b3;
	  stt8b4=st8b4;
	  stt8b5=st8b5;
	  stt8b6=st8b6;
	  stt8b7=st8b7;

	 }
	 
	 private  String stt8b1;
	 private  String stt8b2;
	 private String stt8b3;
	 private  String stt8b4;
	 private  String stt8b5;
	 private  String stt8b6;
	 private  String stt8b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8b1",
					stt8b1);
			System.setProperty("stt8b2",
					stt8b2);
			System.setProperty("stt8b3",
					stt8b3);
			System.setProperty("stt8b4",
					stt8b4);
			System.setProperty("stt8b5",
					stt8b5);
			System.setProperty("stt8b6",
					stt8b6);
			System.setProperty("stt8b7",
					stt8b7);

			
			System.setProperty("Test8bInit",
					"Test8bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8bInit.class/jcp.xml");
			
			System.setProperty("Test8bss8b_0x",
					"Test8bss8b_0xjcp.xml");
         	System.setProperty("Test8bss8b_02",
					"Test8bss8b_02xml.config");
			System.setProperty("Test8bss8b_03",
					"Test8bss8b_03.apache.xml.resource.security.");
		    System.setProperty("Test8bss8b_04",
					"Test8bss8b_04.resource.");
			System.setProperty("Test8bss8b_05",
					"Test8bss8b_05.isInitialized");
			System.setProperty("Test8bss8b_06",
					"Test8bss8b_06_8bInit.class/jcp.xml");
			System.setProperty("Test8bss8b_07",
					"Test8bss8b_07t/resource/jcp.xml");
         	System.setProperty("Test8bss8b_08b",
					"Test8bss8b_08b.config");
			System.setProperty("Test8bss8b_09",
					"Test8bss8b_09.security.");
		    System.setProperty("Test8bss8b_0x0",
					"Test8bss8b_0x0jcp.xmlapache.");
			System.setProperty("Test8bss8b_0xx0",
					"Test8bss8b_0xx0.isInitialized");
			System.setProperty("Test8bss8b_0xxx0",
					"Test8bss8b_0xxx0est8bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8b = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8b != null) {
				 
				LOGGER.debug("in0in isTest8b");
				LOGGER.debug("inxin isTest8b");
				LOGGER.debug("in2in isTest8b");
				LOGGER.debug("in3in isTest8b");
				LOGGER.debug("in4in isTest8b");
				LOGGER.debug("in5in isTest8b");
				LOGGER.debug("in6in isTest8b");
				LOGGER.debug("in7in isTest8b");
				LOGGER.debug("in8bin isTest8b");
				LOGGER.debug("in9in isTest8b");
				LOGGER.debug("inx0in isTest8b");
				LOGGER.debug("inxxin isTest8b");
				LOGGER.debug("inx2in isTest8b");
				LOGGER.debug("inx3in isTest8b");
				LOGGER.debug("inx4in isTest8b");
				LOGGER.debug("inx5in isTest8b");
				LOGGER.debug("inx6in isTest8b");
				LOGGER.debug("inx7in isTest8b");
				LOGGER.debug("inx8bin isTest8b");
				LOGGER.debug("inx9in isTest8b");
				LOGGER.debug("in20in isTest8b");
			}

			 

			DocumentBuilderFactory dbfTest8b = DocumentBuilderFactory.newInstance();
			dbfTest8b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8b.setNamespaceAware(true);
			dbfTest8b.setValidating(false);

			DocumentBuilder db = dbfTest8b.newDocumentBuilder();
			Document doc = db.parse(isTest8b);
			Node configTest8b = doc.getFirstChild();
			while ((configTest8b != null)
					&& (!"Configuration".equals(configTest8b.getLocalName()))) {
				configTest8b = configTest8b.getNextSibling();
			}

			if (configTest8b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8b!=null?configTest8b.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8b = (Element) el;

					Attr langAttr = resourceTest8b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8b.length; i++) {
						String uri = listTest8b[i].getAttributeNS(null, "URI");
						String javaclass = listTest8b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8b.length; i++) {
						String uritrans = tranElemTest8b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8b = algorithms[i];
							String id = elementTest8b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8b.length; i++) {
						String urisign = sigElemsTest8b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8b.length; i++) {
						String javaclass = resolverElemTest8b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8bRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8b = new ArrayList<String>(resolverElemTest8b.length);
					for (int i = 0; i < resolverElemTest8b.length; i++) {
						String javaclass = resolverElemTest8b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8b = resolverElemTest8b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8b != null) && (descriptionTest8b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8b);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8b);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8b.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8b.length; i++) {
						String namespace = nlTest8b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8b ) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", exs8b);
 } catch (ClassNotFoundException enf8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", enf8b);
 } catch (IllegalAccessException eia8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", eia8b);
 } catch (InstantiationException e8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", e8b);
 } catch (javax.xml.parsers.ParserConfigurationException epc8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", epc8b);
 } catch (org.xml.sax.SAXException ese8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", ese8b);
 } catch (java.io.IOException eio8b) {
 LOGGER.error("Crypto8bInit:fileInit:error: ", eio8b);
 }

	}

}
