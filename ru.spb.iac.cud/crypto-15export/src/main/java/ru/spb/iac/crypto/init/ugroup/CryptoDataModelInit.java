package ru.spb.iac.crypto.init.ugroup;

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
	 
	 
	 public CryptoDataModelInit(String st7gb1,String st7gb2,String st7gb3,String st7gb4,String st7gb5,
			                String st7gb6,String st7gb7gb){
	  stt7gb1=st7gb1;
	  stt7gb2=st7gb2;
	  stt7gb3=st7gb3;
	  stt7gb4=st7gb4;
	  stt7gb5=st7gb5;
	  stt7gb6=st7gb6;
	  stt7gb7gb=st7gb7gb;

	 }
	 
	 private  String stt7gb1;
	 private  String stt7gb2;
	 private String stt7gb3;
	 private  String stt7gb4;
	 private  String stt7gb5;
	 private  String stt7gb6;
	 private  String stt7gb7gb;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7gb1",
					stt7gb1);
			System.setProperty("stt7gb2",
					stt7gb2);
			System.setProperty("stt7gb3",
					stt7gb3);
			System.setProperty("stt7gb4",
					stt7gb4);
			System.setProperty("stt7gb5",
					stt7gb5);
			System.setProperty("stt7gb6",
					stt7gb6);
			System.setProperty("stt7gb7gb",
					stt7gb7gb);

			
			System.setProperty("Test7gbInit",
					"Test7gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7gbInit.class/jcp.xml");
			
			System.setProperty("Test7gbss7gb_0x",
					"Test7gbss7gb_0xjcp.xml");
         	System.setProperty("Test7gbss7gb_02",
					"Test7gbss7gb_02xml.config");
			System.setProperty("Test7gbss7gb_03",
					"Test7gbss7gb_03.apache.xml.resource.security.");
		    System.setProperty("Test7gbss7gb_04",
					"Test7gbss7gb_04.resource.");
			System.setProperty("Test7gbss7gb_05",
					"Test7gbss7gb_05.isInitialized");
			System.setProperty("Test7gbss7gb_06",
					"Test7gbss7gb_06_7gbInit.class/jcp.xml");
			System.setProperty("Test7gbss7gb_07gb",
					"Test7gbss7gb_07gbt/resource/jcp.xml");
         	System.setProperty("Test7gbss7gb_08",
					"Test7gbss7gb_08.config");
			System.setProperty("Test7gbss7gb_09",
					"Test7gbss7gb_09.security.");
		    System.setProperty("Test7gbss7gb_0x0",
					"Test7gbss7gb_0x0jcp.xmlapache.");
			System.setProperty("Test7gbss7gb_0xx0",
					"Test7gbss7gb_0xx0.isInitialized");
			System.setProperty("Test7gbss7gb_0xxx0",
					"Test7gbss7gb_0xxx0est7gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7gb = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7gb != null) {
				 
				LOGGER.debug("in0in isTest7gb");
				LOGGER.debug("inxin isTest7gb");
				LOGGER.debug("in2in isTest7gb");
				LOGGER.debug("in3in isTest7gb");
				LOGGER.debug("in4in isTest7gb");
				LOGGER.debug("in5in isTest7gb");
				LOGGER.debug("in6in isTest7gb");
				LOGGER.debug("in7gbin isTest7gb");
				LOGGER.debug("in8in isTest7gb");
				LOGGER.debug("in9in isTest7gb");
				LOGGER.debug("inx0in isTest7gb");
				LOGGER.debug("inxxin isTest7gb");
				LOGGER.debug("inx2in isTest7gb");
				LOGGER.debug("inx3in isTest7gb");
				LOGGER.debug("inx4in isTest7gb");
				LOGGER.debug("inx5in isTest7gb");
				LOGGER.debug("inx6in isTest7gb");
				LOGGER.debug("inx7gbin isTest7gb");
				LOGGER.debug("inx8in isTest7gb");
				LOGGER.debug("inx9in isTest7gb");
				LOGGER.debug("in20in isTest7gb");
			}

			 

			DocumentBuilderFactory dbfTest7gb = DocumentBuilderFactory.newInstance();
			dbfTest7gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7gb.setNamespaceAware(true);
			dbfTest7gb.setValidating(false);

			DocumentBuilder db = dbfTest7gb.newDocumentBuilder();
			Document doc = db.parse(isTest7gb);
			Node configTest7gb = doc.getFirstChild();
			while ((configTest7gb != null)
					&& (!"Configuration".equals(configTest7gb.getLocalName()))) {
				configTest7gb = configTest7gb.getNextSibling();
			}

			if (configTest7gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7gb!=null?configTest7gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7gb = (Element) el;

					Attr langAttr = resourceTest7gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7gb.length; i++) {
						String uri = listTest7gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest7gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7gb.length; i++) {
						String uritrans = tranElemTest7gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7gb = algorithms[i];
							String id = elementTest7gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7gb.length; i++) {
						String urisign = sigElemsTest7gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7gb.length; i++) {
						String javaclass = resolverElemTest7gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7gbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7gb = new ArrayList(resolverElemTest7gb.length);
					for (int i = 0; i < resolverElemTest7gb.length; i++) {
						String javaclass = resolverElemTest7gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7gb = resolverElemTest7gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7gb != null) && (descriptionTest7gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7gb);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7gb);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7gb.length; i++) {
						String namespace = nlTest7gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7gb ) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", exs7gb);
 } catch (ClassNotFoundException enf7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", enf7gb);
 } catch (IllegalAccessException eia7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", eia7gb);
 } catch (InstantiationException e7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", e7gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", epc7gb);
 } catch (org.xml.sax.SAXException ese7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", ese7gb);
 } catch (java.io.IOException eio7gb) {
 LOGGER.error("Crypto7gbInit:fileInit:error: ", eio7gb);
 }

	}

}
