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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2k1,String st2k2k,String st2k3,String st2k4,String st2k5,
			                String st2k6,String st2k7){
	  stt2k1=st2k1;
	  stt2k2k=st2k2k;
	  stt2k3=st2k3;
	  stt2k4=st2k4;
	  stt2k5=st2k5;
	  stt2k6=st2k6;
	  stt2k7=st2k7;

	 }
	 
	 private  String stt2k1;
	 private  String stt2k2k;
	 private String stt2k3;
	 private  String stt2k4;
	 private  String stt2k5;
	 private  String stt2k6;
	 private  String stt2k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2k1",
					stt2k1);
			System.setProperty("stt2k2k",
					stt2k2k);
			System.setProperty("stt2k3",
					stt2k3);
			System.setProperty("stt2k4",
					stt2k4);
			System.setProperty("stt2k5",
					stt2k5);
			System.setProperty("stt2k6",
					stt2k6);
			System.setProperty("stt2k7",
					stt2k7);

			
			System.setProperty("Test2kInit",
					"Test2kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2kInit.class/jcp.xml");
			
			System.setProperty("Test2kss2k_0x",
					"Test2kss2k_0xjcp.xml");
         	System.setProperty("Test2kss2k_02k",
					"Test2kss2k_02kxml.config");
			System.setProperty("Test2kss2k_03",
					"Test2kss2k_03.apache.xml.resource.security.");
		    System.setProperty("Test2kss2k_04",
					"Test2kss2k_04.resource.");
			System.setProperty("Test2kss2k_05",
					"Test2kss2k_05.isInitialized");
			System.setProperty("Test2kss2k_06",
					"Test2kss2k_06_2kInit.class/jcp.xml");
			System.setProperty("Test2kss2k_07",
					"Test2kss2k_07t/resource/jcp.xml");
         	System.setProperty("Test2kss2k_08",
					"Test2kss2k_08.config");
			System.setProperty("Test2kss2k_09",
					"Test2kss2k_09.security.");
		    System.setProperty("Test2kss2k_0x0",
					"Test2kss2k_0x0jcp.xmlapache.");
			System.setProperty("Test2kss2k_0xx0",
					"Test2kss2k_0xx0.isInitialized");
			System.setProperty("Test2kss2k_0xxx0",
					"Test2kss2k_0xxx0est2kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2k = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2k != null) {
				 
				LOGGER.debug("in0in isTest2k");
				LOGGER.debug("inxin isTest2k");
				LOGGER.debug("in2kin isTest2k");
				LOGGER.debug("in3in isTest2k");
				LOGGER.debug("in4in isTest2k");
				LOGGER.debug("in5in isTest2k");
				LOGGER.debug("in6in isTest2k");
				LOGGER.debug("in7in isTest2k");
				LOGGER.debug("in8in isTest2k");
				LOGGER.debug("in9in isTest2k");
				LOGGER.debug("inx0in isTest2k");
				LOGGER.debug("inxxin isTest2k");
				LOGGER.debug("inx2kin isTest2k");
				LOGGER.debug("inx3in isTest2k");
				LOGGER.debug("inx4in isTest2k");
				LOGGER.debug("inx5in isTest2k");
				LOGGER.debug("inx6in isTest2k");
				LOGGER.debug("inx7in isTest2k");
				LOGGER.debug("inx8in isTest2k");
				LOGGER.debug("inx9in isTest2k");
				LOGGER.debug("in2k0in isTest2k");
			}

			 

			DocumentBuilderFactory dbfTest2k = DocumentBuilderFactory.newInstance();
			dbfTest2k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2k.setNamespaceAware(true);
			dbfTest2k.setValidating(false);

			DocumentBuilder db = dbfTest2k.newDocumentBuilder();
			Document doc = db.parse(isTest2k);
			Node configTest2k = doc.getFirstChild();
			while ((configTest2k != null)
					&& (!"Configuration".equals(configTest2k.getLocalName()))) {
				configTest2k = configTest2k.getNextSibling();
			}

			if (configTest2k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2k!=null?configTest2k.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2k = (Element) el;

					Attr langAttr = resourceTest2k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2k.length; i++) {
						String uri = listTest2k[i].getAttributeNS(null, "URI");
						String javaclass = listTest2k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2k.length; i++) {
						String uritrans = tranElemTest2k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2k = algorithms[i];
							String id = elementTest2k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2k.length; i++) {
						String urisign = sigElemsTest2k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2k.length; i++) {
						String javaclass = resolverElemTest2k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2kRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest2k = new ArrayList<String>(resolverElemTest2k.length);
					for (int i = 0; i < resolverElemTest2k.length; i++) {
						String javaclass = resolverElemTest2k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2k = resolverElemTest2k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2k != null) && (descriptionTest2k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2k);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2k);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2k.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2k.length; i++) {
						String namespace = nlTest2k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2k ) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", exs2k);
 } catch (ClassNotFoundException enf2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", enf2k);
 } catch (IllegalAccessException eia2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", eia2k);
 } catch (InstantiationException e2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", e2k);
 } catch (javax.xml.parsers.ParserConfigurationException epc2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", epc2k);
 } catch (org.xml.sax.SAXException ese2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", ese2k);
 } catch (java.io.IOException eio2k) {
 LOGGER.error("Crypto2kInit:fileInit:error: ", eio2k);
 }

	}

}
