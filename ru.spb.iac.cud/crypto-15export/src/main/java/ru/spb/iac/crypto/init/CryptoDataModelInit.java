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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st71,String st72,String st73,String st74,String st75,
			                String st76,String st77){
	  stt71=st71;
	  stt72=st72;
	  stt73=st73;
	  stt74=st74;
	  stt75=st75;
	  stt76=st76;
	  stt77=st77;

	 }
	 
	 private  String stt71;
	 private  String stt72;
	 private String stt73;
	 private  String stt74;
	 private  String stt75;
	 private  String stt76;
	 private  String stt77;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt71",
					stt71);
			System.setProperty("stt72",
					stt72);
			System.setProperty("stt73",
					stt73);
			System.setProperty("stt74",
					stt74);
			System.setProperty("stt75",
					stt75);
			System.setProperty("stt76",
					stt76);
			System.setProperty("stt77",
					stt77);

			
			System.setProperty("Test7Init",
					"Test7Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto75Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoDataModelInit.class/jcp.xml");
			
			System.setProperty("Test7ss7_0x",
					"Test7ss7_0xjcp.xml");
         	System.setProperty("Test7ss7_02",
					"Test7ss7_02xml.config");
			System.setProperty("Test7ss7_03",
					"Test7ss7_03.apache.xml.resource.security.");
		    System.setProperty("Test7ss7_04",
					"Test7ss7_04.resource.");
			System.setProperty("Test7ss7_05",
					"Test7ss7_05.isInitialized");
			System.setProperty("Test7ss7_06",
					"Test7ss7_06_7Init.class/jcp.xml");
			System.setProperty("Test7ss7_07",
					"Test7ss7_07t/resource/jcp.xml");
         	System.setProperty("Test7ss7_08",
					"Test7ss7_08.config");
			System.setProperty("Test7ss7_09",
					"Test7ss7_09.security.");
		    System.setProperty("Test7ss7_0x0",
					"Test7ss7_0x0jcp.xmlapache.");
			System.setProperty("Test7ss7_0xx0",
					"Test7ss7_0xx0.isInitialized");
			System.setProperty("Test7ss7_0xxx0",
					"Test7ss7_0xxx0est7Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto75Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7 = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7 != null) {
				 
				LOGGER.debug("in0in isTest7");
				LOGGER.debug("inxin isTest7");
				LOGGER.debug("in2in isTest7");
				LOGGER.debug("in3in isTest7");
				LOGGER.debug("in4in isTest7");
				LOGGER.debug("in5in isTest7");
				LOGGER.debug("in6in isTest7");
				LOGGER.debug("in7in isTest7");
				LOGGER.debug("in8in isTest7");
				LOGGER.debug("in9in isTest7");
				LOGGER.debug("inx0in isTest7");
				LOGGER.debug("inxxin isTest7");
				LOGGER.debug("inx2in isTest7");
				LOGGER.debug("inx3in isTest7");
				LOGGER.debug("inx4in isTest7");
				LOGGER.debug("inx5in isTest7");
				LOGGER.debug("inx6in isTest7");
				LOGGER.debug("inx7in isTest7");
				LOGGER.debug("inx8in isTest7");
				LOGGER.debug("inx9in isTest7");
				LOGGER.debug("in20in isTest7");
			}

			 

			DocumentBuilderFactory dbfTest7 = DocumentBuilderFactory.newInstance();
			dbfTest7.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7.setNamespaceAware(true);
			dbfTest7.setValidating(false);

			DocumentBuilder db = dbfTest7.newDocumentBuilder();
			Document doc = db.parse(isTest7);
			Node configTest7 = doc.getFirstChild();
			while ((configTest7 != null)
					&& (!"Configuration".equals(configTest7.getLocalName()))) {
				configTest7 = configTest7.getNextSibling();
			}

			if (configTest7 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7!=null?configTest7.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7 = (Element) el;

					Attr langAttr = resourceTest7
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7.length; i++) {
						String uri = listTest7[i].getAttributeNS(null, "URI");
						String javaclass = listTest7[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7.length; i++) {
						String uritrans = tranElemTest7[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7 = algorithms[i];
							String id = elementTest7.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7.length; i++) {
						String urisign = sigElemsTest7[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7.length; i++) {
						String javaclass = resolverElemTest7[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7Register Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest7 = new ArrayList<String>(resolverElemTest7.length);
					for (int i = 0; i < resolverElemTest7.length; i++) {
						String javaclass = resolverElemTest7[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7 = resolverElemTest7[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7 != null) && (descriptionTest7.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7.length; i++) {
						String namespace = nlTest7[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7 ) {
 LOGGER.error("Crypto7Init:fileInit:error: ", exs7);
 } catch (ClassNotFoundException enf7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", enf7);
 } catch (IllegalAccessException eia7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", eia7);
 } catch (InstantiationException e7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", e7);
 } catch (javax.xml.parsers.ParserConfigurationException epc7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", epc7);
 } catch (org.xml.sax.SAXException ese7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", ese7);
 } catch (java.io.IOException eio7) {
 LOGGER.error("Crypto7Init:fileInit:error: ", eio7);
 }

	}

}
