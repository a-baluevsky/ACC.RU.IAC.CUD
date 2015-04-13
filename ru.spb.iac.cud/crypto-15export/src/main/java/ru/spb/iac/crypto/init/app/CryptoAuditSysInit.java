package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoAuditSysInit(String st8p1,String st8p2,String st8p3,String st8p4,String st8p5,
			                String st8p6,String st8p7){
	  stt8p1=st8p1;
	  stt8p2=st8p2;
	  stt8p3=st8p3;
	  stt8p4=st8p4;
	  stt8p5=st8p5;
	  stt8p6=st8p6;
	  stt8p7=st8p7;

	 }
	 
	 private  String stt8p1;
	 private  String stt8p2;
	 private String stt8p3;
	 private  String stt8p4;
	 private  String stt8p5;
	 private  String stt8p6;
	 private  String stt8p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8p1",
					stt8p1);
			System.setProperty("stt8p2",
					stt8p2);
			System.setProperty("stt8p3",
					stt8p3);
			System.setProperty("stt8p4",
					stt8p4);
			System.setProperty("stt8p5",
					stt8p5);
			System.setProperty("stt8p6",
					stt8p6);
			System.setProperty("stt8p7",
					stt8p7);

			
			System.setProperty("Test8pInit",
					"Test8pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8pInit.class/jcp.xml");
			
			System.setProperty("Test8pss8p_0x",
					"Test8pss8p_0xjcp.xml");
         	System.setProperty("Test8pss8p_02",
					"Test8pss8p_02xml.config");
			System.setProperty("Test8pss8p_03",
					"Test8pss8p_03.apache.xml.resource.security.");
		    System.setProperty("Test8pss8p_04",
					"Test8pss8p_04.resource.");
			System.setProperty("Test8pss8p_05",
					"Test8pss8p_05.isInitialized");
			System.setProperty("Test8pss8p_06",
					"Test8pss8p_06_8pInit.class/jcp.xml");
			System.setProperty("Test8pss8p_07",
					"Test8pss8p_07t/resource/jcp.xml");
         	System.setProperty("Test8pss8p_08p",
					"Test8pss8p_08p.config");
			System.setProperty("Test8pss8p_09",
					"Test8pss8p_09.security.");
		    System.setProperty("Test8pss8p_0x0",
					"Test8pss8p_0x0jcp.xmlapache.");
			System.setProperty("Test8pss8p_0xx0",
					"Test8pss8p_0xx0.isInitialized");
			System.setProperty("Test8pss8p_0xxx0",
					"Test8pss8p_0xxx0est8pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8p = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8p != null) {
				 
				LOGGER.debug("in0in isTest8p");
				LOGGER.debug("inxin isTest8p");
				LOGGER.debug("in2in isTest8p");
				LOGGER.debug("in3in isTest8p");
				LOGGER.debug("in4in isTest8p");
				LOGGER.debug("in5in isTest8p");
				LOGGER.debug("in6in isTest8p");
				LOGGER.debug("in7in isTest8p");
				LOGGER.debug("in8pin isTest8p");
				LOGGER.debug("in9in isTest8p");
				LOGGER.debug("inx0in isTest8p");
				LOGGER.debug("inxxin isTest8p");
				LOGGER.debug("inx2in isTest8p");
				LOGGER.debug("inx3in isTest8p");
				LOGGER.debug("inx4in isTest8p");
				LOGGER.debug("inx5in isTest8p");
				LOGGER.debug("inx6in isTest8p");
				LOGGER.debug("inx7in isTest8p");
				LOGGER.debug("inx8pin isTest8p");
				LOGGER.debug("inx9in isTest8p");
				LOGGER.debug("in20in isTest8p");
			}

			 

			DocumentBuilderFactory dbfTest8p = DocumentBuilderFactory.newInstance();
			dbfTest8p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8p.setNamespaceAware(true);
			dbfTest8p.setValidating(false);

			DocumentBuilder db = dbfTest8p.newDocumentBuilder();
			Document doc = db.parse(isTest8p);
			Node configTest8p = doc.getFirstChild();
			while ((configTest8p != null)
					&& (!"Configuration".equals(configTest8p.getLocalName()))) {
				configTest8p = configTest8p.getNextSibling();
			}

			if (configTest8p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8p!=null?configTest8p.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8p = (Element) el;

					Attr langAttr = resourceTest8p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8p.length; i++) {
						String uri = listTest8p[i].getAttributeNS(null, "URI");
						String javaclass = listTest8p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8p.length; i++) {
						String uritrans = tranElemTest8p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8p = algorithms[i];
							String id = elementTest8p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8p.length; i++) {
						String urisign = sigElemsTest8p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8p.length; i++) {
						String javaclass = resolverElemTest8p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8pRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8p = new ArrayList(resolverElemTest8p.length);
					for (int i = 0; i < resolverElemTest8p.length; i++) {
						String javaclass = resolverElemTest8p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8p = resolverElemTest8p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8p != null) && (descriptionTest8p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8p);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8p);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8p.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8p.length; i++) {
						String namespace = nlTest8p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8p ) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", exs8p);
 } catch (ClassNotFoundException enf8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", enf8p);
 } catch (IllegalAccessException eia8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", eia8p);
 } catch (InstantiationException e8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", e8p);
 } catch (javax.xml.parsers.ParserConfigurationException epc8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", epc8p);
 } catch (org.xml.sax.SAXException ese8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", ese8p);
 } catch (java.io.IOException eio8p) {
 LOGGER.error("Crypto8pInit:fileInit:error: ", eio8p);
 }

	}

}
