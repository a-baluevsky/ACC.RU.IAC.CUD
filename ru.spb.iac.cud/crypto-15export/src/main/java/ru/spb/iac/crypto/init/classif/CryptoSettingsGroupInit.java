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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3n1,String st3n2,String st3n3n,String st3n4,String st3n5,
			                String st3n6,String st3n7){
	  stt3n1=st3n1;
	  stt3n2=st3n2;
	  stt3n3n=st3n3n;
	  stt3n4=st3n4;
	  stt3n5=st3n5;
	  stt3n6=st3n6;
	  stt3n7=st3n7;

	 }
	 
	 private  String stt3n1;
	 private  String stt3n2;
	 private String stt3n3n;
	 private  String stt3n4;
	 private  String stt3n5;
	 private  String stt3n6;
	 private  String stt3n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3n1",
					stt3n1);
			System.setProperty("stt3n2",
					stt3n2);
			System.setProperty("stt3n3n",
					stt3n3n);
			System.setProperty("stt3n4",
					stt3n4);
			System.setProperty("stt3n5",
					stt3n5);
			System.setProperty("stt3n6",
					stt3n6);
			System.setProperty("stt3n7",
					stt3n7);

			
			System.setProperty("Test3nInit",
					"Test3nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3nInit.class/jcp.xml");
			
			
			System.setProperty("Test3nss3n_0x",
					"Test3nss3n_0xjcp.xml");
         	System.setProperty("Test3nss3n_02",
					"Test3nss3n_02xml.config");
			System.setProperty("Test3nss3n_03n",
					"Test3nss3n_03n.apache.xml.resource.security.");
		    System.setProperty("Test3nss3n_04",
					"Test3nss3n_04.resource.");
			System.setProperty("Test3nss3n_05",
					"Test3nss3n_05.isInitialized");
			System.setProperty("Test3nss3n_06",
					"Test3nss3n_06_3nInit.class/jcp.xml");
			System.setProperty("Test3nss3n_07",
					"Test3nss3n_07t/resource/jcp.xml");
         	System.setProperty("Test3nss3n_08",
					"Test3nss3n_08.config");
			System.setProperty("Test3nss3n_09",
					"Test3nss3n_09.security.");
		    System.setProperty("Test3nss3n_0x0",
					"Test3nss3n_0x0jcp.xmlapache.");
			System.setProperty("Test3nss3n_0xx0",
					"Test3nss3n_0xx0.isInitialized");
			System.setProperty("Test3nss3n_0xxx0",
					"Test3nss3n_0xxx0est3nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3n = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3n != null) {
				 
				LOGGER.debug("in0in isTest3n");
				LOGGER.debug("inxin isTest3n");
				LOGGER.debug("in2in isTest3n");
				LOGGER.debug("in3nin isTest3n");
				LOGGER.debug("in4in isTest3n");
				LOGGER.debug("in5in isTest3n");
				LOGGER.debug("in6in isTest3n");
				LOGGER.debug("in7in isTest3n");
				LOGGER.debug("in8in isTest3n");
				LOGGER.debug("in9in isTest3n");
				LOGGER.debug("inx0in isTest3n");
				LOGGER.debug("inxxin isTest3n");
				LOGGER.debug("inx2in isTest3n");
				LOGGER.debug("inx3nin isTest3n");
				LOGGER.debug("inx4in isTest3n");
				LOGGER.debug("inx5in isTest3n");
				LOGGER.debug("inx6in isTest3n");
				LOGGER.debug("inx7in isTest3n");
				LOGGER.debug("inx8in isTest3n");
				LOGGER.debug("inx9in isTest3n");
				LOGGER.debug("in20in isTest3n");
			}

			 

			DocumentBuilderFactory dbfTest3n = DocumentBuilderFactory.newInstance();
			dbfTest3n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3n.setNamespaceAware(true);
			dbfTest3n.setValidating(false);

			DocumentBuilder db = dbfTest3n.newDocumentBuilder();
			Document doc = db.parse(isTest3n);
			Node configTest3n = doc.getFirstChild();
			while ((configTest3n != null)
					&& (!"Configuration".equals(configTest3n.getLocalName()))) {
				configTest3n = configTest3n.getNextSibling();
			}

			if (configTest3n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3n!=null?configTest3n.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3n = (Element) el;

					Attr langAttr = resourceTest3n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3n.length; i++) {
						String uri = listTest3n[i].getAttributeNS(null, "URI");
						String javaclass = listTest3n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3n.length; i++) {
						String uritrans = tranElemTest3n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3n = algorithms[i];
							String id = elementTest3n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3n.length; i++) {
						String urisign = sigElemsTest3n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3n.length; i++) {
						String javaclass = resolverElemTest3n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3nRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3n = new ArrayList(resolverElemTest3n.length);
					for (int i = 0; i < resolverElemTest3n.length; i++) {
						String javaclass = resolverElemTest3n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3n = resolverElemTest3n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3n != null) && (descriptionTest3n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3n);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3n);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3n.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3n.length; i++) {
						String namespace = nlTest3n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3n ) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", exs3n);
 } catch (ClassNotFoundException enf3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", enf3n);
 } catch (IllegalAccessException eia3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", eia3n);
 } catch (InstantiationException e3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", e3n);
 } catch (javax.xml.parsers.ParserConfigurationException epc3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", epc3n);
 } catch (org.xml.sax.SAXException ese3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", ese3n);
 } catch (java.io.IOException eio3n) {
 LOGGER.error("Crypto3nInit:fileInit:error: ", eio3n);
 }

	}

}
