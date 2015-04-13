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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st41,String st42,String st43,String st44,String st45,
			                String st46,String st47){
	  stt41=st41;
	  stt42=st42;
	  stt43=st43;
	  stt44=st44;
	  stt45=st45;
	  stt46=st46;
	  stt47=st47;

	 }
	 
	 private  String stt41;
	 private  String stt42;
	 private String stt43;
	 private  String stt44;
	 private  String stt45;
	 private  String stt46;
	 private  String stt47;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt41",
					stt41);
			System.setProperty("stt42",
					stt42);
			System.setProperty("stt43",
					stt43);
			System.setProperty("stt44",
					stt44);
			System.setProperty("stt45",
					stt45);
			System.setProperty("stt46",
					stt46);
			System.setProperty("stt47",
					stt47);

			
			System.setProperty("Test4Init",
					"Test4Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto45Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoBaseTableInit.class/jcp.xml");
			
			System.setProperty("Test4ss4_0x",
					"Test4ss4_0xjcp.xml");
         	System.setProperty("Test4ss4_02",
					"Test4ss4_02xml.config");
			System.setProperty("Test4ss4_03",
					"Test4ss4_03.apache.xml.resource.security.");
		    System.setProperty("Test4ss4_04",
					"Test4ss4_04.resource.");
			System.setProperty("Test4ss4_05",
					"Test4ss4_05.isInitialized");
			System.setProperty("Test4ss4_06",
					"Test4ss4_06_4Init.class/jcp.xml");
			System.setProperty("Test4ss4_07",
					"Test4ss4_07t/resource/jcp.xml");
         	System.setProperty("Test4ss4_08",
					"Test4ss4_08.config");
			System.setProperty("Test4ss4_09",
					"Test4ss4_09.security.");
		    System.setProperty("Test4ss4_0x0",
					"Test4ss4_0x0jcp.xmlapache.");
			System.setProperty("Test4ss4_0xx0",
					"Test4ss4_0xx0.isInitialized");
			System.setProperty("Test4ss4_0xxx0",
					"Test4ss4_0xxx0est4Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto45Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4 = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4 != null) {
				 
				LOGGER.debug("in0in isTest4");
				LOGGER.debug("inxin isTest4");
				LOGGER.debug("in2in isTest4");
				LOGGER.debug("in3in isTest4");
				LOGGER.debug("in4in isTest4");
				LOGGER.debug("in5in isTest4");
				LOGGER.debug("in6in isTest4");
				LOGGER.debug("in7in isTest4");
				LOGGER.debug("in8in isTest4");
				LOGGER.debug("in9in isTest4");
				LOGGER.debug("inx0in isTest4");
				LOGGER.debug("inxxin isTest4");
				LOGGER.debug("inx2in isTest4");
				LOGGER.debug("inx3in isTest4");
				LOGGER.debug("inx4in isTest4");
				LOGGER.debug("inx5in isTest4");
				LOGGER.debug("inx6in isTest4");
				LOGGER.debug("inx7in isTest4");
				LOGGER.debug("inx8in isTest4");
				LOGGER.debug("inx9in isTest4");
				LOGGER.debug("in20in isTest4");
			}

			 

			DocumentBuilderFactory dbfTest4 = DocumentBuilderFactory.newInstance();
			dbfTest4.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4.setNamespaceAware(true);
			dbfTest4.setValidating(false);

			DocumentBuilder db = dbfTest4.newDocumentBuilder();
			Document doc = db.parse(isTest4);
			Node configTest4 = doc.getFirstChild();
			while ((configTest4 != null)
					&& (!"Configuration".equals(configTest4.getLocalName()))) {
				configTest4 = configTest4.getNextSibling();
			}

			if (configTest4 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4!=null?configTest4.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4 = (Element) el;

					Attr langAttr = resourceTest4
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4.length; i++) {
						String uri = listTest4[i].getAttributeNS(null, "URI");
						String javaclass = listTest4[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4.length; i++) {
						String uritrans = tranElemTest4[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4 = algorithms[i];
							String id = elementTest4.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4.length; i++) {
						String urisign = sigElemsTest4[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4.length; i++) {
						String javaclass = resolverElemTest4[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4Register Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4Register Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4 = new ArrayList(resolverElemTest4.length);
					for (int i = 0; i < resolverElemTest4.length; i++) {
						String javaclass = resolverElemTest4[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4 = resolverElemTest4[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4 != null) && (descriptionTest4.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4.length; i++) {
						String namespace = nlTest4[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4 ) {
 LOGGER.error("Crypto4Init:fileInit:error: ", exs4);
 } catch (ClassNotFoundException enf4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", enf4);
 } catch (IllegalAccessException eia4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", eia4);
 } catch (InstantiationException e4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", e4);
 } catch (javax.xml.parsers.ParserConfigurationException epc4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", epc4);
 } catch (org.xml.sax.SAXException ese4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", ese4);
 } catch (java.io.IOException eio4) {
 LOGGER.error("Crypto4Init:fileInit:error: ", eio4);
 }

	}

}
