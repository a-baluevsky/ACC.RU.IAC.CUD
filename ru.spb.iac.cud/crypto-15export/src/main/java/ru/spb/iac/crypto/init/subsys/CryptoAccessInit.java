package ru.spb.iac.crypto.init.subsys;

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
	 
	 
	 public CryptoAccessInit(String st1k1k,String st1k2,String st1k3,String st1k4,String st1k5,
			                String st1k6,String st1k7){
	  stt1k1k=st1k1k;
	  stt1k2=st1k2;
	  stt1k3=st1k3;
	  stt1k4=st1k4;
	  stt1k5=st1k5;
	  stt1k6=st1k6;
	  stt1k7=st1k7;

	 }
	 
	 private  String stt1k1k;
	 private  String stt1k2;
	 private String stt1k3;
	 private  String stt1k4;
	 private  String stt1k5;
	 private  String stt1k6;
	 private  String stt1k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1k1k",
					stt1k1k);
			System.setProperty("stt1k2",
					stt1k2);
			System.setProperty("stt1k3",
					stt1k3);
			System.setProperty("stt1k4",
					stt1k4);
			System.setProperty("stt1k5",
					stt1k5);
			System.setProperty("stt1k6",
					stt1k6);
			System.setProperty("stt1k7",
					stt1k7);

			
			System.setProperty("Test1kInit",
					"Test1kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1kInit.class/jcp.xml");
			
			System.setProperty("Test1kss1k_0x",
					"Test1kss1k_0xjcp.xml");
         	System.setProperty("Test1kss1k_02",
					"Test1kss1k_02xml.config");
			System.setProperty("Test1kss1k_03",
					"Test1kss1k_03.apache.xml.resource.security.");
		    System.setProperty("Test1kss1k_04",
					"Test1kss1k_04.resource.");
			System.setProperty("Test1kss1k_05",
					"Test1kss1k_05.isInitialized");
			System.setProperty("Test1kss1k_06",
					"Test1kss1k_06_1kInit.class/jcp.xml");
			System.setProperty("Test1kss1k_07",
					"Test1kss1k_07t/resource/jcp.xml");
         	System.setProperty("Test1kss1k_08",
					"Test1kss1k_08.config");
			System.setProperty("Test1kss1k_09",
					"Test1kss1k_09.security.");
		    System.setProperty("Test1kss1k_0x0",
					"Test1kss1k_0x0jcp.xmlapache.");
			System.setProperty("Test1kss1k_0xx0",
					"Test1kss1k_0xx0.isInitialized");
			System.setProperty("Test1kss1k_0xxx0",
					"Test1kss1k_0xxx0est1kInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1k = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1k != null) {
				 
				LOGGER.debug("in0in isTest1k");
				LOGGER.debug("in1kin isTest1k");
				LOGGER.debug("in2in isTest1k");
				LOGGER.debug("in3in isTest1k");
				LOGGER.debug("in4in isTest1k");
				LOGGER.debug("in5in isTest1k");
				LOGGER.debug("in6in isTest1k");
				LOGGER.debug("in7in isTest1k");
				LOGGER.debug("in8in isTest1k");
				LOGGER.debug("in9in isTest1k");
				LOGGER.debug("in1k0in isTest1k");
				LOGGER.debug("in1k1kin isTest1k");
				LOGGER.debug("in1k2in isTest1k");
				LOGGER.debug("in1k3in isTest1k");
				LOGGER.debug("in1k4in isTest1k");
				LOGGER.debug("in1k5in isTest1k");
				LOGGER.debug("in1k6in isTest1k");
				LOGGER.debug("in1k7in isTest1k");
				LOGGER.debug("in1k8in isTest1k");
				LOGGER.debug("in1k9in isTest1k");
				LOGGER.debug("in20in isTest1k");
			}

			 

			DocumentBuilderFactory dbfTest1k = DocumentBuilderFactory.newInstance();
			dbfTest1k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1k.setNamespaceAware(true);
			dbfTest1k.setValidating(false);

			DocumentBuilder db = dbfTest1k.newDocumentBuilder();
			Document doc = db.parse(isTest1k);
			Node configTest1k = doc.getFirstChild();
			while ((configTest1k != null)
					&& (!"Configuration".equals(configTest1k.getLocalName()))) {
				configTest1k = configTest1k.getNextSibling();
			}

			if (configTest1k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1k!=null?configTest1k.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1k = (Element) el;

					Attr langAttr = resourceTest1k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1k.length; i++) {
						String uri = listTest1k[i].getAttributeNS(null, "URI");
						String javaclass = listTest1k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1k.length; i++) {
						String uritrans = tranElemTest1k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1k = algorithms[i];
							String id = elementTest1k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1k.length; i++) {
						String urisign = sigElemsTest1k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1k.length; i++) {
						String javaclass = resolverElemTest1k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1k-Test1kRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1k = new ArrayList(resolverElemTest1k.length);
					for (int i = 0; i < resolverElemTest1k.length; i++) {
						String javaclass = resolverElemTest1k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1k = resolverElemTest1k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1k != null) && (descriptionTest1k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1k);
								LOGGER.debug("Test1kRegister Resolver: " + javaclass
										+ ": " + descriptionTest1k);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1k.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1k.length; i++) {
						String namespace = nlTest1k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1k ) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", exs1k);
 } catch (ClassNotFoundException enf1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", enf1k);
 } catch (IllegalAccessException eia1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", eia1k);
 } catch (InstantiationException e1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", e1k);
 } catch (javax.xml.parsers.ParserConfigurationException epc1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", epc1k);
 } catch (org.xml.sax.SAXException ese1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", ese1k);
 } catch (java.io.IOException eio1k) {
 LOGGER.error("Crypto1kInit:fileInit:error: ", eio1k);
 }

	}

}
