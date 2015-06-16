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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1gb1gb,String st1gb2,String st1gb3,String st1gb4,String st1gb5,
			                String st1gb6,String st1gb7){
	  stt1gb1gb=st1gb1gb;
	  stt1gb2=st1gb2;
	  stt1gb3=st1gb3;
	  stt1gb4=st1gb4;
	  stt1gb5=st1gb5;
	  stt1gb6=st1gb6;
	  stt1gb7=st1gb7;

	 }
	 
	 private  String stt1gb1gb;
	 private  String stt1gb2;
	 private String stt1gb3;
	 private  String stt1gb4;
	 private  String stt1gb5;
	 private  String stt1gb6;
	 private  String stt1gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1gb1gb",
					stt1gb1gb);
			System.setProperty("stt1gb2",
					stt1gb2);
			System.setProperty("stt1gb3",
					stt1gb3);
			System.setProperty("stt1gb4",
					stt1gb4);
			System.setProperty("stt1gb5",
					stt1gb5);
			System.setProperty("stt1gb6",
					stt1gb6);
			System.setProperty("stt1gb7",
					stt1gb7);

			
			System.setProperty("Test1gbInit",
					"Test1gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1gbInit.class/jcp.xml");
			
			System.setProperty("Test1gbss1gb_0x",
					"Test1gbss1gb_0xjcp.xml");
         	System.setProperty("Test1gbss1gb_02",
					"Test1gbss1gb_02xml.config");
			System.setProperty("Test1gbss1gb_03",
					"Test1gbss1gb_03.apache.xml.resource.security.");
		    System.setProperty("Test1gbss1gb_04",
					"Test1gbss1gb_04.resource.");
			System.setProperty("Test1gbss1gb_05",
					"Test1gbss1gb_05.isInitialized");
			System.setProperty("Test1gbss1gb_06",
					"Test1gbss1gb_06_1gbInit.class/jcp.xml");
			System.setProperty("Test1gbss1gb_07",
					"Test1gbss1gb_07t/resource/jcp.xml");
         	System.setProperty("Test1gbss1gb_08",
					"Test1gbss1gb_08.config");
			System.setProperty("Test1gbss1gb_09",
					"Test1gbss1gb_09.security.");
		    System.setProperty("Test1gbss1gb_0x0",
					"Test1gbss1gb_0x0jcp.xmlapache.");
			System.setProperty("Test1gbss1gb_0xx0",
					"Test1gbss1gb_0xx0.isInitialized");
			System.setProperty("Test1gbss1gb_0xxx0",
					"Test1gbss1gb_0xxx0est1gbInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1gb = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1gb != null) {
				 
				LOGGER.debug("in0in isTest1gb");
				LOGGER.debug("in1gbin isTest1gb");
				LOGGER.debug("in2in isTest1gb");
				LOGGER.debug("in3in isTest1gb");
				LOGGER.debug("in4in isTest1gb");
				LOGGER.debug("in5in isTest1gb");
				LOGGER.debug("in6in isTest1gb");
				LOGGER.debug("in7in isTest1gb");
				LOGGER.debug("in8in isTest1gb");
				LOGGER.debug("in9in isTest1gb");
				LOGGER.debug("in1gb0in isTest1gb");
				LOGGER.debug("in1gb1gbin isTest1gb");
				LOGGER.debug("in1gb2in isTest1gb");
				LOGGER.debug("in1gb3in isTest1gb");
				LOGGER.debug("in1gb4in isTest1gb");
				LOGGER.debug("in1gb5in isTest1gb");
				LOGGER.debug("in1gb6in isTest1gb");
				LOGGER.debug("in1gb7in isTest1gb");
				LOGGER.debug("in1gb8in isTest1gb");
				LOGGER.debug("in1gb9in isTest1gb");
				LOGGER.debug("in20in isTest1gb");
			}

			 

			DocumentBuilderFactory dbfTest1gb = DocumentBuilderFactory.newInstance();
			dbfTest1gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1gb.setNamespaceAware(true);
			dbfTest1gb.setValidating(false);

			DocumentBuilder db = dbfTest1gb.newDocumentBuilder();
			Document doc = db.parse(isTest1gb);
			Node configTest1gb = doc.getFirstChild();
			while ((configTest1gb != null)
					&& (!"Configuration".equals(configTest1gb.getLocalName()))) {
				configTest1gb = configTest1gb.getNextSibling();
			}

			if (configTest1gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1gb!=null?configTest1gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1gb = (Element) el;

					Attr langAttr = resourceTest1gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1gb.length; i++) {
						String uri = listTest1gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest1gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1gb.length; i++) {
						String uritrans = tranElemTest1gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1gb = algorithms[i];
							String id = elementTest1gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1gb.length; i++) {
						String urisign = sigElemsTest1gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1gb.length; i++) {
						String javaclass = resolverElemTest1gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1gb-Test1gbRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest1gb = new ArrayList<String>(resolverElemTest1gb.length);
					for (int i = 0; i < resolverElemTest1gb.length; i++) {
						String javaclass = resolverElemTest1gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1gb = resolverElemTest1gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1gb != null) && (descriptionTest1gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1gb);
								LOGGER.debug("Test1gbRegister Resolver: " + javaclass
										+ ": " + descriptionTest1gb);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1gb.length; i++) {
						String namespace = nlTest1gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1gb ) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", exs1gb);
 } catch (ClassNotFoundException enf1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", enf1gb);
 } catch (IllegalAccessException eia1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", eia1gb);
 } catch (InstantiationException e1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", e1gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", epc1gb);
 } catch (org.xml.sax.SAXException ese1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", ese1gb);
 } catch (java.io.IOException eio1gb) {
 LOGGER.error("Crypto1gbInit:fileInit:error: ", eio1gb);
 }

	}

}
