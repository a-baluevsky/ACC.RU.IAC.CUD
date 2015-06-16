package ru.spb.iac.crypto.init.settngs;

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
	 
	 
	 public CryptoAuditSysInit(String st8h1,String st8h2,String st8h3,String st8h4,String st8h5,
			                String st8h6,String st8h7){
	  stt8h1=st8h1;
	  stt8h2=st8h2;
	  stt8h3=st8h3;
	  stt8h4=st8h4;
	  stt8h5=st8h5;
	  stt8h6=st8h6;
	  stt8h7=st8h7;

	 }
	 
	 private  String stt8h1;
	 private  String stt8h2;
	 private String stt8h3;
	 private  String stt8h4;
	 private  String stt8h5;
	 private  String stt8h6;
	 private  String stt8h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8h1",
					stt8h1);
			System.setProperty("stt8h2",
					stt8h2);
			System.setProperty("stt8h3",
					stt8h3);
			System.setProperty("stt8h4",
					stt8h4);
			System.setProperty("stt8h5",
					stt8h5);
			System.setProperty("stt8h6",
					stt8h6);
			System.setProperty("stt8h7",
					stt8h7);

			
			System.setProperty("Test8hInit",
					"Test8hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8hInit.class/jcp.xml");
			
			System.setProperty("Test8hss8h_0x",
					"Test8hss8h_0xjcp.xml");
         	System.setProperty("Test8hss8h_02",
					"Test8hss8h_02xml.config");
			System.setProperty("Test8hss8h_03",
					"Test8hss8h_03.apache.xml.resource.security.");
		    System.setProperty("Test8hss8h_04",
					"Test8hss8h_04.resource.");
			System.setProperty("Test8hss8h_05",
					"Test8hss8h_05.isInitialized");
			System.setProperty("Test8hss8h_06",
					"Test8hss8h_06_8hInit.class/jcp.xml");
			System.setProperty("Test8hss8h_07",
					"Test8hss8h_07t/resource/jcp.xml");
         	System.setProperty("Test8hss8h_08h",
					"Test8hss8h_08h.config");
			System.setProperty("Test8hss8h_09",
					"Test8hss8h_09.security.");
		    System.setProperty("Test8hss8h_0x0",
					"Test8hss8h_0x0jcp.xmlapache.");
			System.setProperty("Test8hss8h_0xx0",
					"Test8hss8h_0xx0.isInitialized");
			System.setProperty("Test8hss8h_0xxx0",
					"Test8hss8h_0xxx0est8hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8h = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8h != null) {
				 
				LOGGER.debug("in0in isTest8h");
				LOGGER.debug("inxin isTest8h");
				LOGGER.debug("in2in isTest8h");
				LOGGER.debug("in3in isTest8h");
				LOGGER.debug("in4in isTest8h");
				LOGGER.debug("in5in isTest8h");
				LOGGER.debug("in6in isTest8h");
				LOGGER.debug("in7in isTest8h");
				LOGGER.debug("in8hin isTest8h");
				LOGGER.debug("in9in isTest8h");
				LOGGER.debug("inx0in isTest8h");
				LOGGER.debug("inxxin isTest8h");
				LOGGER.debug("inx2in isTest8h");
				LOGGER.debug("inx3in isTest8h");
				LOGGER.debug("inx4in isTest8h");
				LOGGER.debug("inx5in isTest8h");
				LOGGER.debug("inx6in isTest8h");
				LOGGER.debug("inx7in isTest8h");
				LOGGER.debug("inx8hin isTest8h");
				LOGGER.debug("inx9in isTest8h");
				LOGGER.debug("in20in isTest8h");
			}

			 

			DocumentBuilderFactory dbfTest8h = DocumentBuilderFactory.newInstance();
			dbfTest8h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8h.setNamespaceAware(true);
			dbfTest8h.setValidating(false);

			DocumentBuilder db = dbfTest8h.newDocumentBuilder();
			Document doc = db.parse(isTest8h);
			Node configTest8h = doc.getFirstChild();
			while ((configTest8h != null)
					&& (!"Configuration".equals(configTest8h.getLocalName()))) {
				configTest8h = configTest8h.getNextSibling();
			}

			if (configTest8h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8h!=null?configTest8h.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8h = (Element) el;

					Attr langAttr = resourceTest8h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8h.length; i++) {
						String uri = listTest8h[i].getAttributeNS(null, "URI");
						String javaclass = listTest8h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8h.length; i++) {
						String uritrans = tranElemTest8h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8h = algorithms[i];
							String id = elementTest8h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8h.length; i++) {
						String urisign = sigElemsTest8h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8h.length; i++) {
						String javaclass = resolverElemTest8h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8hRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8h = new ArrayList<String>(resolverElemTest8h.length);
					for (int i = 0; i < resolverElemTest8h.length; i++) {
						String javaclass = resolverElemTest8h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8h = resolverElemTest8h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8h != null) && (descriptionTest8h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8h);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8h);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8h.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8h.length; i++) {
						String namespace = nlTest8h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8h ) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", exs8h);
 } catch (ClassNotFoundException enf8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", enf8h);
 } catch (IllegalAccessException eia8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", eia8h);
 } catch (InstantiationException e8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", e8h);
 } catch (javax.xml.parsers.ParserConfigurationException epc8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", epc8h);
 } catch (org.xml.sax.SAXException ese8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", ese8h);
 } catch (java.io.IOException eio8h) {
 LOGGER.error("Crypto8hInit:fileInit:error: ", eio8h);
 }

	}

}
