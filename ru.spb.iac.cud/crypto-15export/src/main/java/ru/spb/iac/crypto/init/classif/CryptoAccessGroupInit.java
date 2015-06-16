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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2n1,String st2n2n,String st2n3,String st2n4,String st2n5,
			                String st2n6,String st2n7){
	  stt2n1=st2n1;
	  stt2n2n=st2n2n;
	  stt2n3=st2n3;
	  stt2n4=st2n4;
	  stt2n5=st2n5;
	  stt2n6=st2n6;
	  stt2n7=st2n7;

	 }
	 
	 private  String stt2n1;
	 private  String stt2n2n;
	 private String stt2n3;
	 private  String stt2n4;
	 private  String stt2n5;
	 private  String stt2n6;
	 private  String stt2n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2n1",
					stt2n1);
			System.setProperty("stt2n2n",
					stt2n2n);
			System.setProperty("stt2n3",
					stt2n3);
			System.setProperty("stt2n4",
					stt2n4);
			System.setProperty("stt2n5",
					stt2n5);
			System.setProperty("stt2n6",
					stt2n6);
			System.setProperty("stt2n7",
					stt2n7);

			
			System.setProperty("Test2nInit",
					"Test2nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2nInit.class/jcp.xml");
			
			System.setProperty("Test2nss2n_0x",
					"Test2nss2n_0xjcp.xml");
         	System.setProperty("Test2nss2n_02n",
					"Test2nss2n_02nxml.config");
			System.setProperty("Test2nss2n_03",
					"Test2nss2n_03.apache.xml.resource.security.");
		    System.setProperty("Test2nss2n_04",
					"Test2nss2n_04.resource.");
			System.setProperty("Test2nss2n_05",
					"Test2nss2n_05.isInitialized");
			System.setProperty("Test2nss2n_06",
					"Test2nss2n_06_2nInit.class/jcp.xml");
			System.setProperty("Test2nss2n_07",
					"Test2nss2n_07t/resource/jcp.xml");
         	System.setProperty("Test2nss2n_08",
					"Test2nss2n_08.config");
			System.setProperty("Test2nss2n_09",
					"Test2nss2n_09.security.");
		    System.setProperty("Test2nss2n_0x0",
					"Test2nss2n_0x0jcp.xmlapache.");
			System.setProperty("Test2nss2n_0xx0",
					"Test2nss2n_0xx0.isInitialized");
			System.setProperty("Test2nss2n_0xxx0",
					"Test2nss2n_0xxx0est2nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2n = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2n != null) {
				 
				LOGGER.debug("in0in isTest2n");
				LOGGER.debug("inxin isTest2n");
				LOGGER.debug("in2nin isTest2n");
				LOGGER.debug("in3in isTest2n");
				LOGGER.debug("in4in isTest2n");
				LOGGER.debug("in5in isTest2n");
				LOGGER.debug("in6in isTest2n");
				LOGGER.debug("in7in isTest2n");
				LOGGER.debug("in8in isTest2n");
				LOGGER.debug("in9in isTest2n");
				LOGGER.debug("inx0in isTest2n");
				LOGGER.debug("inxxin isTest2n");
				LOGGER.debug("inx2nin isTest2n");
				LOGGER.debug("inx3in isTest2n");
				LOGGER.debug("inx4in isTest2n");
				LOGGER.debug("inx5in isTest2n");
				LOGGER.debug("inx6in isTest2n");
				LOGGER.debug("inx7in isTest2n");
				LOGGER.debug("inx8in isTest2n");
				LOGGER.debug("inx9in isTest2n");
				LOGGER.debug("in2n0in isTest2n");
			}

			 

			DocumentBuilderFactory dbfTest2n = DocumentBuilderFactory.newInstance();
			dbfTest2n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2n.setNamespaceAware(true);
			dbfTest2n.setValidating(false);

			DocumentBuilder db = dbfTest2n.newDocumentBuilder();
			Document doc = db.parse(isTest2n);
			Node configTest2n = doc.getFirstChild();
			while ((configTest2n != null)
					&& (!"Configuration".equals(configTest2n.getLocalName()))) {
				configTest2n = configTest2n.getNextSibling();
			}

			if (configTest2n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2n!=null?configTest2n.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2n = (Element) el;

					Attr langAttr = resourceTest2n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2n.length; i++) {
						String uri = listTest2n[i].getAttributeNS(null, "URI");
						String javaclass = listTest2n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2n.length; i++) {
						String uritrans = tranElemTest2n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2n = algorithms[i];
							String id = elementTest2n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2n.length; i++) {
						String urisign = sigElemsTest2n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2n.length; i++) {
						String javaclass = resolverElemTest2n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2nRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest2n = new ArrayList<String>(resolverElemTest2n.length);
					for (int i = 0; i < resolverElemTest2n.length; i++) {
						String javaclass = resolverElemTest2n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2n = resolverElemTest2n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2n != null) && (descriptionTest2n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2n);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2n);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2n.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2n.length; i++) {
						String namespace = nlTest2n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2n ) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", exs2n);
 } catch (ClassNotFoundException enf2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", enf2n);
 } catch (IllegalAccessException eia2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", eia2n);
 } catch (InstantiationException e2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", e2n);
 } catch (javax.xml.parsers.ParserConfigurationException epc2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", epc2n);
 } catch (org.xml.sax.SAXException ese2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", ese2n);
 } catch (java.io.IOException eio2n) {
 LOGGER.error("Crypto2nInit:fileInit:error: ", eio2n);
 }

	}

}
