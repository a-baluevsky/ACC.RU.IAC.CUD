package ru.spb.iac.crypto.init.groupsys;

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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6m1,String st6m2,String st6m3,String st6m4,String st6m5,
			                String st6m6m,String st6m7){
	  stt6m1=st6m1;
	  stt6m2=st6m2;
	  stt6m3=st6m3;
	  stt6m4=st6m4;
	  stt6m5=st6m5;
	  stt6m6m=st6m6m;
	  stt6m7=st6m7;

	 }
	 
	 private  String stt6m1;
	 private  String stt6m2;
	 private String stt6m3;
	 private  String stt6m4;
	 private  String stt6m5;
	 private  String stt6m6m;
	 private  String stt6m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6m1",
					stt6m1);
			System.setProperty("stt6m2",
					stt6m2);
			System.setProperty("stt6m3",
					stt6m3);
			System.setProperty("stt6m4",
					stt6m4);
			System.setProperty("stt6m5",
					stt6m5);
			System.setProperty("stt6m6m",
					stt6m6m);
			System.setProperty("stt6m7",
					stt6m7);

			
			System.setProperty("Test6mInit",
					"Test6mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6mInit.class/jcp.xml");
			
			System.setProperty("Test6mss6m_0x",
					"Test6mss6m_0xjcp.xml");
         	System.setProperty("Test6mss6m_02",
					"Test6mss6m_02xml.config");
			System.setProperty("Test6mss6m_03",
					"Test6mss6m_03.apache.xml.resource.security.");
		    System.setProperty("Test6mss6m_04",
					"Test6mss6m_04.resource.");
			System.setProperty("Test6mss6m_05",
					"Test6mss6m_05.isInitialized");
			System.setProperty("Test6mss6m_06m",
					"Test6mss6m_06m_6mInit.class/jcp.xml");
			System.setProperty("Test6mss6m_07",
					"Test6mss6m_07t/resource/jcp.xml");
         	System.setProperty("Test6mss6m_08",
					"Test6mss6m_08.config");
			System.setProperty("Test6mss6m_09",
					"Test6mss6m_09.security.");
		    System.setProperty("Test6mss6m_0x0",
					"Test6mss6m_0x0jcp.xmlapache.");
			System.setProperty("Test6mss6m_0xx0",
					"Test6mss6m_0xx0.isInitialized");
			System.setProperty("Test6mss6m_0xxx0",
					"Test6mss6m_0xxx0est6mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6m = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6m != null) {
				 
				LOGGER.debug("in0in isTest6m");
				LOGGER.debug("inxin isTest6m");
				LOGGER.debug("in2in isTest6m");
				LOGGER.debug("in3in isTest6m");
				LOGGER.debug("in4in isTest6m");
				LOGGER.debug("in5in isTest6m");
				LOGGER.debug("in6min isTest6m");
				LOGGER.debug("in7in isTest6m");
				LOGGER.debug("in8in isTest6m");
				LOGGER.debug("in9in isTest6m");
				LOGGER.debug("inx0in isTest6m");
				LOGGER.debug("inxxin isTest6m");
				LOGGER.debug("inx2in isTest6m");
				LOGGER.debug("inx3in isTest6m");
				LOGGER.debug("inx4in isTest6m");
				LOGGER.debug("inx5in isTest6m");
				LOGGER.debug("inx6min isTest6m");
				LOGGER.debug("inx7in isTest6m");
				LOGGER.debug("inx8in isTest6m");
				LOGGER.debug("inx9in isTest6m");
				LOGGER.debug("in20in isTest6m");
			}

			 

			DocumentBuilderFactory dbfTest6m = DocumentBuilderFactory.newInstance();
			dbfTest6m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6m.setNamespaceAware(true);
			dbfTest6m.setValidating(false);

			DocumentBuilder db = dbfTest6m.newDocumentBuilder();
			Document doc = db.parse(isTest6m);
			Node configTest6m = doc.getFirstChild();
			while ((configTest6m != null)
					&& (!"Configuration".equals(configTest6m.getLocalName()))) {
				configTest6m = configTest6m.getNextSibling();
			}

			if (configTest6m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6m!=null?configTest6m.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6m = (Element) el;

					Attr langAttr = resourceTest6m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6m.length; i++) {
						String uri = listTest6m[i].getAttributeNS(null, "URI");
						String javaclass = listTest6m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6m.length; i++) {
						String uritrans = tranElemTest6m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6m = algorithms[i];
							String id = elementTest6m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6m.length; i++) {
						String urisign = sigElemsTest6m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6m.length; i++) {
						String javaclass = resolverElemTest6m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6mRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6mRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6m = new ArrayList(resolverElemTest6m.length);
					for (int i = 0; i < resolverElemTest6m.length; i++) {
						String javaclass = resolverElemTest6m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6m = resolverElemTest6m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6m != null) && (descriptionTest6m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6m);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6m);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6m.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6m.length; i++) {
						String namespace = nlTest6m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6m ) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", exs6m);
 } catch (ClassNotFoundException enf6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", enf6m);
 } catch (IllegalAccessException eia6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", eia6m);
 } catch (InstantiationException e6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", e6m);
 } catch (javax.xml.parsers.ParserConfigurationException epc6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", epc6m);
 } catch (org.xml.sax.SAXException ese6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", ese6m);
 } catch (java.io.IOException eio6m) {
 LOGGER.error("Crypto6mInit:fileInit:error: ", eio6m);
 }

	}

}
