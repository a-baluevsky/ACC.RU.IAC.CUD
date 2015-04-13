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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st61,String st62,String st63,String st64,String st65,
			                String st66,String st67){
	  stt61=st61;
	  stt62=st62;
	  stt63=st63;
	  stt64=st64;
	  stt65=st65;
	  stt66=st66;
	  stt67=st67;

	 }
	 
	 private  String stt61;
	 private  String stt62;
	 private String stt63;
	 private  String stt64;
	 private  String stt65;
	 private  String stt66;
	 private  String stt67;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt61",
					stt61);
			System.setProperty("stt62",
					stt62);
			System.setProperty("stt63",
					stt63);
			System.setProperty("stt64",
					stt64);
			System.setProperty("stt65",
					stt65);
			System.setProperty("stt66",
					stt66);
			System.setProperty("stt67",
					stt67);

			
			System.setProperty("Test6Init",
					"Test6Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto65Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoContextAppInit.class/jcp.xml");
			
			System.setProperty("Test6ss6_0x",
					"Test6ss6_0xjcp.xml");
         	System.setProperty("Test6ss6_02",
					"Test6ss6_02xml.config");
			System.setProperty("Test6ss6_03",
					"Test6ss6_03.apache.xml.resource.security.");
		    System.setProperty("Test6ss6_04",
					"Test6ss6_04.resource.");
			System.setProperty("Test6ss6_05",
					"Test6ss6_05.isInitialized");
			System.setProperty("Test6ss6_06",
					"Test6ss6_06_6Init.class/jcp.xml");
			System.setProperty("Test6ss6_07",
					"Test6ss6_07t/resource/jcp.xml");
         	System.setProperty("Test6ss6_08",
					"Test6ss6_08.config");
			System.setProperty("Test6ss6_09",
					"Test6ss6_09.security.");
		    System.setProperty("Test6ss6_0x0",
					"Test6ss6_0x0jcp.xmlapache.");
			System.setProperty("Test6ss6_0xx0",
					"Test6ss6_0xx0.isInitialized");
			System.setProperty("Test6ss6_0xxx0",
					"Test6ss6_0xxx0est6Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto65Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6 = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6 != null) {
				 
				LOGGER.debug("in0in isTest6");
				LOGGER.debug("inxin isTest6");
				LOGGER.debug("in2in isTest6");
				LOGGER.debug("in3in isTest6");
				LOGGER.debug("in4in isTest6");
				LOGGER.debug("in5in isTest6");
				LOGGER.debug("in6in isTest6");
				LOGGER.debug("in7in isTest6");
				LOGGER.debug("in8in isTest6");
				LOGGER.debug("in9in isTest6");
				LOGGER.debug("inx0in isTest6");
				LOGGER.debug("inxxin isTest6");
				LOGGER.debug("inx2in isTest6");
				LOGGER.debug("inx3in isTest6");
				LOGGER.debug("inx4in isTest6");
				LOGGER.debug("inx5in isTest6");
				LOGGER.debug("inx6in isTest6");
				LOGGER.debug("inx7in isTest6");
				LOGGER.debug("inx8in isTest6");
				LOGGER.debug("inx9in isTest6");
				LOGGER.debug("in20in isTest6");
			}

			 

			DocumentBuilderFactory dbfTest6 = DocumentBuilderFactory.newInstance();
			dbfTest6.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6.setNamespaceAware(true);
			dbfTest6.setValidating(false);

			DocumentBuilder db = dbfTest6.newDocumentBuilder();
			Document doc = db.parse(isTest6);
			Node configTest6 = doc.getFirstChild();
			while ((configTest6 != null)
					&& (!"Configuration".equals(configTest6.getLocalName()))) {
				configTest6 = configTest6.getNextSibling();
			}

			if (configTest6 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6!=null?configTest6.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6 = (Element) el;

					Attr langAttr = resourceTest6
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6.length; i++) {
						String uri = listTest6[i].getAttributeNS(null, "URI");
						String javaclass = listTest6[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6.length; i++) {
						String uritrans = tranElemTest6[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6 = algorithms[i];
							String id = elementTest6.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6.length; i++) {
						String urisign = sigElemsTest6[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6.length; i++) {
						String javaclass = resolverElemTest6[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6Register Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6Register Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6 = new ArrayList(resolverElemTest6.length);
					for (int i = 0; i < resolverElemTest6.length; i++) {
						String javaclass = resolverElemTest6[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6 = resolverElemTest6[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6 != null) && (descriptionTest6.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6.length; i++) {
						String namespace = nlTest6[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6 ) {
 LOGGER.error("Crypto6Init:fileInit:error: ", exs6);
 } catch (ClassNotFoundException enf6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", enf6);
 } catch (IllegalAccessException eia6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", eia6);
 } catch (InstantiationException e6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", e6);
 } catch (javax.xml.parsers.ParserConfigurationException epc6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", epc6);
 } catch (org.xml.sax.SAXException ese6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", ese6);
 } catch (java.io.IOException eio6) {
 LOGGER.error("Crypto6Init:fileInit:error: ", eio6);
 }

	}

}
