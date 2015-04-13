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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st81,String st82,String st83,String st84,String st85,
			                String st86,String st87){
	  stt81=st81;
	  stt82=st82;
	  stt83=st83;
	  stt84=st84;
	  stt85=st85;
	  stt86=st86;
	  stt87=st87;

	 }
	 
	 private  String stt81;
	 private  String stt82;
	 private String stt83;
	 private  String stt84;
	 private  String stt85;
	 private  String stt86;
	 private  String stt87;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt81",
					stt81);
			System.setProperty("stt82",
					stt82);
			System.setProperty("stt83",
					stt83);
			System.setProperty("stt84",
					stt84);
			System.setProperty("stt85",
					stt85);
			System.setProperty("stt86",
					stt86);
			System.setProperty("stt87",
					stt87);

			
			System.setProperty("Test8Init",
					"Test8Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto85Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoAuditSysInit.class/jcp.xml");
			
			System.setProperty("Test8ss8_0x",
					"Test8ss8_0xjcp.xml");
         	System.setProperty("Test8ss8_02",
					"Test8ss8_02xml.config");
			System.setProperty("Test8ss8_03",
					"Test8ss8_03.apache.xml.resource.security.");
		    System.setProperty("Test8ss8_04",
					"Test8ss8_04.resource.");
			System.setProperty("Test8ss8_05",
					"Test8ss8_05.isInitialized");
			System.setProperty("Test8ss8_06",
					"Test8ss8_06_8Init.class/jcp.xml");
			System.setProperty("Test8ss8_07",
					"Test8ss8_07t/resource/jcp.xml");
         	System.setProperty("Test8ss8_08",
					"Test8ss8_08.config");
			System.setProperty("Test8ss8_09",
					"Test8ss8_09.security.");
		    System.setProperty("Test8ss8_0x0",
					"Test8ss8_0x0jcp.xmlapache.");
			System.setProperty("Test8ss8_0xx0",
					"Test8ss8_0xx0.isInitialized");
			System.setProperty("Test8ss8_0xxx0",
					"Test8ss8_0xxx0est8Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto85Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8 = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8 != null) {
				 
				LOGGER.debug("in0in isTest8");
				LOGGER.debug("inxin isTest8");
				LOGGER.debug("in2in isTest8");
				LOGGER.debug("in3in isTest8");
				LOGGER.debug("in4in isTest8");
				LOGGER.debug("in5in isTest8");
				LOGGER.debug("in6in isTest8");
				LOGGER.debug("in7in isTest8");
				LOGGER.debug("in8in isTest8");
				LOGGER.debug("in9in isTest8");
				LOGGER.debug("inx0in isTest8");
				LOGGER.debug("inxxin isTest8");
				LOGGER.debug("inx2in isTest8");
				LOGGER.debug("inx3in isTest8");
				LOGGER.debug("inx4in isTest8");
				LOGGER.debug("inx5in isTest8");
				LOGGER.debug("inx6in isTest8");
				LOGGER.debug("inx7in isTest8");
				LOGGER.debug("inx8in isTest8");
				LOGGER.debug("inx9in isTest8");
				LOGGER.debug("in20in isTest8");
			}

			 

			DocumentBuilderFactory dbfTest8 = DocumentBuilderFactory.newInstance();
			dbfTest8.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8.setNamespaceAware(true);
			dbfTest8.setValidating(false);

			DocumentBuilder db = dbfTest8.newDocumentBuilder();
			Document doc = db.parse(isTest8);
			Node configTest8 = doc.getFirstChild();
			while ((configTest8 != null)
					&& (!"Configuration".equals(configTest8.getLocalName()))) {
				configTest8 = configTest8.getNextSibling();
			}

			if (configTest8 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8!=null?configTest8.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8 = (Element) el;

					Attr langAttr = resourceTest8
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8.length; i++) {
						String uri = listTest8[i].getAttributeNS(null, "URI");
						String javaclass = listTest8[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8.length; i++) {
						String uritrans = tranElemTest8[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8 = algorithms[i];
							String id = elementTest8.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8.length; i++) {
						String urisign = sigElemsTest8[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8.length; i++) {
						String javaclass = resolverElemTest8[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8Register Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8 = new ArrayList(resolverElemTest8.length);
					for (int i = 0; i < resolverElemTest8.length; i++) {
						String javaclass = resolverElemTest8[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8 = resolverElemTest8[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8 != null) && (descriptionTest8.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8.length; i++) {
						String namespace = nlTest8[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8 ) {
 LOGGER.error("Crypto8Init:fileInit:error: ", exs8);
 } catch (ClassNotFoundException enf8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", enf8);
 } catch (IllegalAccessException eia8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", eia8);
 } catch (InstantiationException e8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", e8);
 } catch (javax.xml.parsers.ParserConfigurationException epc8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", epc8);
 } catch (org.xml.sax.SAXException ese8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", ese8);
 } catch (java.io.IOException eio8) {
 LOGGER.error("Crypto8Init:fileInit:error: ", eio8);
 }

	}

}
