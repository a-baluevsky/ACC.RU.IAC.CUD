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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9n1,String st9n2,String st9n3,String st9n4,String st9n5,
			                String st9n6,String st9n7){
	  stt9n1=st9n1;
	  stt9n2=st9n2;
	  stt9n3=st9n3;
	  stt9n4=st9n4;
	  stt9n5=st9n5;
	  stt9n6=st9n6;
	  stt9n7=st9n7;

	 }
	 
	 private  String stt9n1;
	 private  String stt9n2;
	 private String stt9n3;
	 private  String stt9n4;
	 private  String stt9n5;
	 private  String stt9n6;
	 private  String stt9n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9n1",
					stt9n1);
			System.setProperty("stt9n2",
					stt9n2);
			System.setProperty("stt9n3",
					stt9n3);
			System.setProperty("stt9n4",
					stt9n4);
			System.setProperty("stt9n5",
					stt9n5);
			System.setProperty("stt9n6",
					stt9n6);
			System.setProperty("stt9n7",
					stt9n7);

			
			System.setProperty("Test9nInit",
					"Test9nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9nInit.class/jcp.xml");
			
			
			System.setProperty("Test9nss9n_0x",
					"Test9nss9n_0xjcp.xml");
         	System.setProperty("Test9nss9n_02",
					"Test9nss9n_02xml.config");
			System.setProperty("Test9nss9n_03",
					"Test9nss9n_03.apache.xml.resource.security.");
		    System.setProperty("Test9nss9n_04",
					"Test9nss9n_04.resource.");
			System.setProperty("Test9nss9n_05",
					"Test9nss9n_05.isInitialized");
			System.setProperty("Test9nss9n_06",
					"Test9nss9n_06_9nInit.class/jcp.xml");
			System.setProperty("Test9nss9n_07",
					"Test9nss9n_07t/resource/jcp.xml");
         	System.setProperty("Test9nss9n_08",
					"Test9nss9n_08.config");
			System.setProperty("Test9nss9n_09n",
					"Test9nss9n_09n.security.");
		    System.setProperty("Test9nss9n_0x0",
					"Test9nss9n_0x0jcp.xmlapache.");
			System.setProperty("Test9nss9n_0xx0",
					"Test9nss9n_0xx0.isInitialized");
			System.setProperty("Test9nss9n_0xxx0",
					"Test9nss9n_0xxx0est9nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9n = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9n != null) {
				 
				LOGGER.debug("in0in isTest9n");
				LOGGER.debug("inxin isTest9n");
				LOGGER.debug("in2in isTest9n");
				LOGGER.debug("in3in isTest9n");
				LOGGER.debug("in4in isTest9n");
				LOGGER.debug("in5in isTest9n");
				LOGGER.debug("in6in isTest9n");
				LOGGER.debug("in7in isTest9n");
				LOGGER.debug("in8in isTest9n");
				LOGGER.debug("in9nin isTest9n");
				LOGGER.debug("inx0in isTest9n");
				LOGGER.debug("inxxin isTest9n");
				LOGGER.debug("inx2in isTest9n");
				LOGGER.debug("inx3in isTest9n");
				LOGGER.debug("inx4in isTest9n");
				LOGGER.debug("inx5in isTest9n");
				LOGGER.debug("inx6in isTest9n");
				LOGGER.debug("inx7in isTest9n");
				LOGGER.debug("inx8in isTest9n");
				LOGGER.debug("inx9nin isTest9n");
				LOGGER.debug("in20in isTest9n");
			}

			 

			DocumentBuilderFactory dbfTest9n = DocumentBuilderFactory.newInstance();
			dbfTest9n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9n.setNamespaceAware(true);
			dbfTest9n.setValidating(false);

			DocumentBuilder db = dbfTest9n.newDocumentBuilder();
			Document doc = db.parse(isTest9n);
			Node configTest9n = doc.getFirstChild();
			while ((configTest9n != null)
					&& (!"Configuration".equals(configTest9n.getLocalName()))) {
				configTest9n = configTest9n.getNextSibling();
			}

			if (configTest9n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9n!=null?configTest9n.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9n = (Element) el;

					Attr langAttr = resourceTest9n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9n.length; i++) {
						String uri = listTest9n[i].getAttributeNS(null, "URI");
						String javaclass = listTest9n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9n.length; i++) {
						String uritrans = tranElemTest9n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9n = algorithms[i];
							String id = elementTest9n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9n.length; i++) {
						String urisign = sigElemsTest9n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9n.length; i++) {
						String javaclass = resolverElemTest9n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9nRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9n = new ArrayList<String>(resolverElemTest9n.length);
					for (int i = 0; i < resolverElemTest9n.length; i++) {
						String javaclass = resolverElemTest9n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9n = resolverElemTest9n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9n != null) && (descriptionTest9n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9n);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9n);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9n.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9n.length; i++) {
						String namespace = nlTest9n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9n ) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", exs9n);
 } catch (ClassNotFoundException enf9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", enf9n);
 } catch (IllegalAccessException eia9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", eia9n);
 } catch (InstantiationException e9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", e9n);
 } catch (javax.xml.parsers.ParserConfigurationException epc9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", epc9n);
 } catch (org.xml.sax.SAXException ese9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", ese9n);
 } catch (java.io.IOException eio9n) {
 LOGGER.error("Crypto9nInit:fileInit:error: ", eio9n);
 }

	}

}
