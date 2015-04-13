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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3k1,String st3k2,String st3k3k,String st3k4,String st3k5,
			                String st3k6,String st3k7){
	  stt3k1=st3k1;
	  stt3k2=st3k2;
	  stt3k3k=st3k3k;
	  stt3k4=st3k4;
	  stt3k5=st3k5;
	  stt3k6=st3k6;
	  stt3k7=st3k7;

	 }
	 
	 private  String stt3k1;
	 private  String stt3k2;
	 private String stt3k3k;
	 private  String stt3k4;
	 private  String stt3k5;
	 private  String stt3k6;
	 private  String stt3k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3k1",
					stt3k1);
			System.setProperty("stt3k2",
					stt3k2);
			System.setProperty("stt3k3k",
					stt3k3k);
			System.setProperty("stt3k4",
					stt3k4);
			System.setProperty("stt3k5",
					stt3k5);
			System.setProperty("stt3k6",
					stt3k6);
			System.setProperty("stt3k7",
					stt3k7);

			
			System.setProperty("Test3kInit",
					"Test3kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3kInit.class/jcp.xml");
			
			
			System.setProperty("Test3kss3k_0x",
					"Test3kss3k_0xjcp.xml");
         	System.setProperty("Test3kss3k_02",
					"Test3kss3k_02xml.config");
			System.setProperty("Test3kss3k_03k",
					"Test3kss3k_03k.apache.xml.resource.security.");
		    System.setProperty("Test3kss3k_04",
					"Test3kss3k_04.resource.");
			System.setProperty("Test3kss3k_05",
					"Test3kss3k_05.isInitialized");
			System.setProperty("Test3kss3k_06",
					"Test3kss3k_06_3kInit.class/jcp.xml");
			System.setProperty("Test3kss3k_07",
					"Test3kss3k_07t/resource/jcp.xml");
         	System.setProperty("Test3kss3k_08",
					"Test3kss3k_08.config");
			System.setProperty("Test3kss3k_09",
					"Test3kss3k_09.security.");
		    System.setProperty("Test3kss3k_0x0",
					"Test3kss3k_0x0jcp.xmlapache.");
			System.setProperty("Test3kss3k_0xx0",
					"Test3kss3k_0xx0.isInitialized");
			System.setProperty("Test3kss3k_0xxx0",
					"Test3kss3k_0xxx0est3kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3k = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3k != null) {
				 
				LOGGER.debug("in0in isTest3k");
				LOGGER.debug("inxin isTest3k");
				LOGGER.debug("in2in isTest3k");
				LOGGER.debug("in3kin isTest3k");
				LOGGER.debug("in4in isTest3k");
				LOGGER.debug("in5in isTest3k");
				LOGGER.debug("in6in isTest3k");
				LOGGER.debug("in7in isTest3k");
				LOGGER.debug("in8in isTest3k");
				LOGGER.debug("in9in isTest3k");
				LOGGER.debug("inx0in isTest3k");
				LOGGER.debug("inxxin isTest3k");
				LOGGER.debug("inx2in isTest3k");
				LOGGER.debug("inx3kin isTest3k");
				LOGGER.debug("inx4in isTest3k");
				LOGGER.debug("inx5in isTest3k");
				LOGGER.debug("inx6in isTest3k");
				LOGGER.debug("inx7in isTest3k");
				LOGGER.debug("inx8in isTest3k");
				LOGGER.debug("inx9in isTest3k");
				LOGGER.debug("in20in isTest3k");
			}

			 

			DocumentBuilderFactory dbfTest3k = DocumentBuilderFactory.newInstance();
			dbfTest3k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3k.setNamespaceAware(true);
			dbfTest3k.setValidating(false);

			DocumentBuilder db = dbfTest3k.newDocumentBuilder();
			Document doc = db.parse(isTest3k);
			Node configTest3k = doc.getFirstChild();
			while ((configTest3k != null)
					&& (!"Configuration".equals(configTest3k.getLocalName()))) {
				configTest3k = configTest3k.getNextSibling();
			}

			if (configTest3k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3k!=null?configTest3k.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3k = (Element) el;

					Attr langAttr = resourceTest3k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3k.length; i++) {
						String uri = listTest3k[i].getAttributeNS(null, "URI");
						String javaclass = listTest3k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3k.length; i++) {
						String uritrans = tranElemTest3k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3k = algorithms[i];
							String id = elementTest3k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3k.length; i++) {
						String urisign = sigElemsTest3k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3k.length; i++) {
						String javaclass = resolverElemTest3k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3kRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3k = new ArrayList(resolverElemTest3k.length);
					for (int i = 0; i < resolverElemTest3k.length; i++) {
						String javaclass = resolverElemTest3k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3k = resolverElemTest3k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3k != null) && (descriptionTest3k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3k);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3k);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3k.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3k.length; i++) {
						String namespace = nlTest3k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3k ) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", exs3k);
 } catch (ClassNotFoundException enf3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", enf3k);
 } catch (IllegalAccessException eia3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", eia3k);
 } catch (InstantiationException e3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", e3k);
 } catch (javax.xml.parsers.ParserConfigurationException epc3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", epc3k);
 } catch (org.xml.sax.SAXException ese3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", ese3k);
 } catch (java.io.IOException eio3k) {
 LOGGER.error("Crypto3kInit:fileInit:error: ", eio3k);
 }

	}

}
