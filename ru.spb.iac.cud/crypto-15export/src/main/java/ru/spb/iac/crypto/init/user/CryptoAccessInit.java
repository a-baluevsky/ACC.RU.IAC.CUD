package ru.spb.iac.crypto.init.user;

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
	 
	 
	 public CryptoAccessInit(String st1eb1eb,String st1eb2,String st1eb3,String st1eb4,String st1eb5,
			                String st1eb6,String st1eb7){
	  stt1eb1eb=st1eb1eb;
	  stt1eb2=st1eb2;
	  stt1eb3=st1eb3;
	  stt1eb4=st1eb4;
	  stt1eb5=st1eb5;
	  stt1eb6=st1eb6;
	  stt1eb7=st1eb7;

	 }
	 
	 private  String stt1eb1eb;
	 private  String stt1eb2;
	 private String stt1eb3;
	 private  String stt1eb4;
	 private  String stt1eb5;
	 private  String stt1eb6;
	 private  String stt1eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1eb1eb",
					stt1eb1eb);
			System.setProperty("stt1eb2",
					stt1eb2);
			System.setProperty("stt1eb3",
					stt1eb3);
			System.setProperty("stt1eb4",
					stt1eb4);
			System.setProperty("stt1eb5",
					stt1eb5);
			System.setProperty("stt1eb6",
					stt1eb6);
			System.setProperty("stt1eb7",
					stt1eb7);

			
			System.setProperty("Test1ebInit",
					"Test1ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1ebInit.class/jcp.xml");
			
			System.setProperty("Test1ebss1eb_0x",
					"Test1ebss1eb_0xjcp.xml");
         	System.setProperty("Test1ebss1eb_02",
					"Test1ebss1eb_02xml.config");
			System.setProperty("Test1ebss1eb_03",
					"Test1ebss1eb_03.apache.xml.resource.security.");
		    System.setProperty("Test1ebss1eb_04",
					"Test1ebss1eb_04.resource.");
			System.setProperty("Test1ebss1eb_05",
					"Test1ebss1eb_05.isInitialized");
			System.setProperty("Test1ebss1eb_06",
					"Test1ebss1eb_06_1ebInit.class/jcp.xml");
			System.setProperty("Test1ebss1eb_07",
					"Test1ebss1eb_07t/resource/jcp.xml");
         	System.setProperty("Test1ebss1eb_08",
					"Test1ebss1eb_08.config");
			System.setProperty("Test1ebss1eb_09",
					"Test1ebss1eb_09.security.");
		    System.setProperty("Test1ebss1eb_0x0",
					"Test1ebss1eb_0x0jcp.xmlapache.");
			System.setProperty("Test1ebss1eb_0xx0",
					"Test1ebss1eb_0xx0.isInitialized");
			System.setProperty("Test1ebss1eb_0xxx0",
					"Test1ebss1eb_0xxx0est1ebInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1eb = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1eb != null) {
				 
				LOGGER.debug("in0in isTest1eb");
				LOGGER.debug("in1ebin isTest1eb");
				LOGGER.debug("in2in isTest1eb");
				LOGGER.debug("in3in isTest1eb");
				LOGGER.debug("in4in isTest1eb");
				LOGGER.debug("in5in isTest1eb");
				LOGGER.debug("in6in isTest1eb");
				LOGGER.debug("in7in isTest1eb");
				LOGGER.debug("in8in isTest1eb");
				LOGGER.debug("in9in isTest1eb");
				LOGGER.debug("in1eb0in isTest1eb");
				LOGGER.debug("in1eb1ebin isTest1eb");
				LOGGER.debug("in1eb2in isTest1eb");
				LOGGER.debug("in1eb3in isTest1eb");
				LOGGER.debug("in1eb4in isTest1eb");
				LOGGER.debug("in1eb5in isTest1eb");
				LOGGER.debug("in1eb6in isTest1eb");
				LOGGER.debug("in1eb7in isTest1eb");
				LOGGER.debug("in1eb8in isTest1eb");
				LOGGER.debug("in1eb9in isTest1eb");
				LOGGER.debug("in20in isTest1eb");
			}

			 

			DocumentBuilderFactory dbfTest1eb = DocumentBuilderFactory.newInstance();
			dbfTest1eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1eb.setNamespaceAware(true);
			dbfTest1eb.setValidating(false);

			DocumentBuilder db = dbfTest1eb.newDocumentBuilder();
			Document doc = db.parse(isTest1eb);
			Node configTest1eb = doc.getFirstChild();
			while ((configTest1eb != null)
					&& (!"Configuration".equals(configTest1eb.getLocalName()))) {
				configTest1eb = configTest1eb.getNextSibling();
			}

			if (configTest1eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1eb!=null?configTest1eb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1eb = (Element) el;

					Attr langAttr = resourceTest1eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1eb.length; i++) {
						String uri = listTest1eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest1eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1eb.length; i++) {
						String uritrans = tranElemTest1eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1eb = algorithms[i];
							String id = elementTest1eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1eb.length; i++) {
						String urisign = sigElemsTest1eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1eb.length; i++) {
						String javaclass = resolverElemTest1eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1eb-Test1ebRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest1eb = new ArrayList<String>(resolverElemTest1eb.length);
					for (int i = 0; i < resolverElemTest1eb.length; i++) {
						String javaclass = resolverElemTest1eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1eb = resolverElemTest1eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1eb != null) && (descriptionTest1eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1eb);
								LOGGER.debug("Test1ebRegister Resolver: " + javaclass
										+ ": " + descriptionTest1eb);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1eb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1eb.length; i++) {
						String namespace = nlTest1eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1eb ) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", exs1eb);
 } catch (ClassNotFoundException enf1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", enf1eb);
 } catch (IllegalAccessException eia1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", eia1eb);
 } catch (InstantiationException e1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", e1eb);
 } catch (javax.xml.parsers.ParserConfigurationException epc1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", epc1eb);
 } catch (org.xml.sax.SAXException ese1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", ese1eb);
 } catch (java.io.IOException eio1eb) {
 LOGGER.error("Crypto1ebInit:fileInit:error: ", eio1eb);
 }

	}

}
