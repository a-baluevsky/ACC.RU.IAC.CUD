package ru.spb.iac.crypto.init.classif;

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
	 
	 
	 public CryptoAccessInit(String st1n1n,String st1n2,String st1n3,String st1n4,String st1n5,
			                String st1n6,String st1n7){
	  stt1n1n=st1n1n;
	  stt1n2=st1n2;
	  stt1n3=st1n3;
	  stt1n4=st1n4;
	  stt1n5=st1n5;
	  stt1n6=st1n6;
	  stt1n7=st1n7;

	 }
	 
	 private  String stt1n1n;
	 private  String stt1n2;
	 private String stt1n3;
	 private  String stt1n4;
	 private  String stt1n5;
	 private  String stt1n6;
	 private  String stt1n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1n1n",
					stt1n1n);
			System.setProperty("stt1n2",
					stt1n2);
			System.setProperty("stt1n3",
					stt1n3);
			System.setProperty("stt1n4",
					stt1n4);
			System.setProperty("stt1n5",
					stt1n5);
			System.setProperty("stt1n6",
					stt1n6);
			System.setProperty("stt1n7",
					stt1n7);

			
			System.setProperty("Test1nInit",
					"Test1nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1nInit.class/jcp.xml");
			
			System.setProperty("Test1nss1n_0x",
					"Test1nss1n_0xjcp.xml");
         	System.setProperty("Test1nss1n_02",
					"Test1nss1n_02xml.config");
			System.setProperty("Test1nss1n_03",
					"Test1nss1n_03.apache.xml.resource.security.");
		    System.setProperty("Test1nss1n_04",
					"Test1nss1n_04.resource.");
			System.setProperty("Test1nss1n_05",
					"Test1nss1n_05.isInitialized");
			System.setProperty("Test1nss1n_06",
					"Test1nss1n_06_1nInit.class/jcp.xml");
			System.setProperty("Test1nss1n_07",
					"Test1nss1n_07t/resource/jcp.xml");
         	System.setProperty("Test1nss1n_08",
					"Test1nss1n_08.config");
			System.setProperty("Test1nss1n_09",
					"Test1nss1n_09.security.");
		    System.setProperty("Test1nss1n_0x0",
					"Test1nss1n_0x0jcp.xmlapache.");
			System.setProperty("Test1nss1n_0xx0",
					"Test1nss1n_0xx0.isInitialized");
			System.setProperty("Test1nss1n_0xxx0",
					"Test1nss1n_0xxx0est1nInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1n = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1n != null) {
				 
				LOGGER.debug("in0in isTest1n");
				LOGGER.debug("in1nin isTest1n");
				LOGGER.debug("in2in isTest1n");
				LOGGER.debug("in3in isTest1n");
				LOGGER.debug("in4in isTest1n");
				LOGGER.debug("in5in isTest1n");
				LOGGER.debug("in6in isTest1n");
				LOGGER.debug("in7in isTest1n");
				LOGGER.debug("in8in isTest1n");
				LOGGER.debug("in9in isTest1n");
				LOGGER.debug("in1n0in isTest1n");
				LOGGER.debug("in1n1nin isTest1n");
				LOGGER.debug("in1n2in isTest1n");
				LOGGER.debug("in1n3in isTest1n");
				LOGGER.debug("in1n4in isTest1n");
				LOGGER.debug("in1n5in isTest1n");
				LOGGER.debug("in1n6in isTest1n");
				LOGGER.debug("in1n7in isTest1n");
				LOGGER.debug("in1n8in isTest1n");
				LOGGER.debug("in1n9in isTest1n");
				LOGGER.debug("in20in isTest1n");
			}

			 

			DocumentBuilderFactory dbfTest1n = DocumentBuilderFactory.newInstance();
			dbfTest1n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1n.setNamespaceAware(true);
			dbfTest1n.setValidating(false);

			DocumentBuilder db = dbfTest1n.newDocumentBuilder();
			Document doc = db.parse(isTest1n);
			Node configTest1n = doc.getFirstChild();
			while ((configTest1n != null)
					&& (!"Configuration".equals(configTest1n.getLocalName()))) {
				configTest1n = configTest1n.getNextSibling();
			}

			if (configTest1n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1n!=null?configTest1n.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1n = (Element) el;

					Attr langAttr = resourceTest1n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1n.length; i++) {
						String uri = listTest1n[i].getAttributeNS(null, "URI");
						String javaclass = listTest1n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1n.length; i++) {
						String uritrans = tranElemTest1n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1n = algorithms[i];
							String id = elementTest1n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1n.length; i++) {
						String urisign = sigElemsTest1n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1n.length; i++) {
						String javaclass = resolverElemTest1n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1n-Test1nRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest1n = new ArrayList<String>(resolverElemTest1n.length);
					for (int i = 0; i < resolverElemTest1n.length; i++) {
						String javaclass = resolverElemTest1n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1n = resolverElemTest1n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1n != null) && (descriptionTest1n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1n);
								LOGGER.debug("Test1nRegister Resolver: " + javaclass
										+ ": " + descriptionTest1n);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1n.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1n.length; i++) {
						String namespace = nlTest1n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1n ) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", exs1n);
 } catch (ClassNotFoundException enf1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", enf1n);
 } catch (IllegalAccessException eia1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", eia1n);
 } catch (InstantiationException e1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", e1n);
 } catch (javax.xml.parsers.ParserConfigurationException epc1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", epc1n);
 } catch (org.xml.sax.SAXException ese1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", ese1n);
 } catch (java.io.IOException eio1n) {
 LOGGER.error("Crypto1nInit:fileInit:error: ", eio1n);
 }

	}

}
