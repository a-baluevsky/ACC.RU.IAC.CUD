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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6gb1,String st6gb2,String st6gb3,String st6gb4,String st6gb5,
			                String st6gb6gb,String st6gb7){
	  stt6gb1=st6gb1;
	  stt6gb2=st6gb2;
	  stt6gb3=st6gb3;
	  stt6gb4=st6gb4;
	  stt6gb5=st6gb5;
	  stt6gb6gb=st6gb6gb;
	  stt6gb7=st6gb7;

	 }
	 
	 private  String stt6gb1;
	 private  String stt6gb2;
	 private String stt6gb3;
	 private  String stt6gb4;
	 private  String stt6gb5;
	 private  String stt6gb6gb;
	 private  String stt6gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6gb1",
					stt6gb1);
			System.setProperty("stt6gb2",
					stt6gb2);
			System.setProperty("stt6gb3",
					stt6gb3);
			System.setProperty("stt6gb4",
					stt6gb4);
			System.setProperty("stt6gb5",
					stt6gb5);
			System.setProperty("stt6gb6gb",
					stt6gb6gb);
			System.setProperty("stt6gb7",
					stt6gb7);

			
			System.setProperty("Test6gbInit",
					"Test6gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6gbInit.class/jcp.xml");
			
			System.setProperty("Test6gbss6gb_0x",
					"Test6gbss6gb_0xjcp.xml");
         	System.setProperty("Test6gbss6gb_02",
					"Test6gbss6gb_02xml.config");
			System.setProperty("Test6gbss6gb_03",
					"Test6gbss6gb_03.apache.xml.resource.security.");
		    System.setProperty("Test6gbss6gb_04",
					"Test6gbss6gb_04.resource.");
			System.setProperty("Test6gbss6gb_05",
					"Test6gbss6gb_05.isInitialized");
			System.setProperty("Test6gbss6gb_06gb",
					"Test6gbss6gb_06gb_6gbInit.class/jcp.xml");
			System.setProperty("Test6gbss6gb_07",
					"Test6gbss6gb_07t/resource/jcp.xml");
         	System.setProperty("Test6gbss6gb_08",
					"Test6gbss6gb_08.config");
			System.setProperty("Test6gbss6gb_09",
					"Test6gbss6gb_09.security.");
		    System.setProperty("Test6gbss6gb_0x0",
					"Test6gbss6gb_0x0jcp.xmlapache.");
			System.setProperty("Test6gbss6gb_0xx0",
					"Test6gbss6gb_0xx0.isInitialized");
			System.setProperty("Test6gbss6gb_0xxx0",
					"Test6gbss6gb_0xxx0est6gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6gb = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6gb != null) {
				 
				LOGGER.debug("in0in isTest6gb");
				LOGGER.debug("inxin isTest6gb");
				LOGGER.debug("in2in isTest6gb");
				LOGGER.debug("in3in isTest6gb");
				LOGGER.debug("in4in isTest6gb");
				LOGGER.debug("in5in isTest6gb");
				LOGGER.debug("in6gbin isTest6gb");
				LOGGER.debug("in7in isTest6gb");
				LOGGER.debug("in8in isTest6gb");
				LOGGER.debug("in9in isTest6gb");
				LOGGER.debug("inx0in isTest6gb");
				LOGGER.debug("inxxin isTest6gb");
				LOGGER.debug("inx2in isTest6gb");
				LOGGER.debug("inx3in isTest6gb");
				LOGGER.debug("inx4in isTest6gb");
				LOGGER.debug("inx5in isTest6gb");
				LOGGER.debug("inx6gbin isTest6gb");
				LOGGER.debug("inx7in isTest6gb");
				LOGGER.debug("inx8in isTest6gb");
				LOGGER.debug("inx9in isTest6gb");
				LOGGER.debug("in20in isTest6gb");
			}

			 

			DocumentBuilderFactory dbfTest6gb = DocumentBuilderFactory.newInstance();
			dbfTest6gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6gb.setNamespaceAware(true);
			dbfTest6gb.setValidating(false);

			DocumentBuilder db = dbfTest6gb.newDocumentBuilder();
			Document doc = db.parse(isTest6gb);
			Node configTest6gb = doc.getFirstChild();
			while ((configTest6gb != null)
					&& (!"Configuration".equals(configTest6gb.getLocalName()))) {
				configTest6gb = configTest6gb.getNextSibling();
			}

			if (configTest6gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6gb!=null?configTest6gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6gb = (Element) el;

					Attr langAttr = resourceTest6gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6gb.length; i++) {
						String uri = listTest6gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest6gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6gb.length; i++) {
						String uritrans = tranElemTest6gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6gb = algorithms[i];
							String id = elementTest6gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6gb.length; i++) {
						String urisign = sigElemsTest6gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6gb.length; i++) {
						String javaclass = resolverElemTest6gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6gbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6gbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6gb = new ArrayList(resolverElemTest6gb.length);
					for (int i = 0; i < resolverElemTest6gb.length; i++) {
						String javaclass = resolverElemTest6gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6gb = resolverElemTest6gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6gb != null) && (descriptionTest6gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6gb);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6gb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6gb.length; i++) {
						String namespace = nlTest6gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6gb ) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", exs6gb);
 } catch (ClassNotFoundException enf6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", enf6gb);
 } catch (IllegalAccessException eia6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", eia6gb);
 } catch (InstantiationException e6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", e6gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", epc6gb);
 } catch (org.xml.sax.SAXException ese6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", ese6gb);
 } catch (java.io.IOException eio6gb) {
 LOGGER.error("Crypto6gbInit:fileInit:error: ", eio6gb);
 }

	}

}
