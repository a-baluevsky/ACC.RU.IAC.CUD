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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5n1,String st5n2,String st5n3,String st5n4,String st5n5n,
			                String st5n6,String st5n7){
	  stt5n1=st5n1;
	  stt5n2=st5n2;
	  stt5n3=st5n3;
	  stt5n4=st5n4;
	  stt5n5n=st5n5n;
	  stt5n6=st5n6;
	  stt5n7=st5n7;

	 }
	 
	 private  String stt5n1;
	 private  String stt5n2;
	 private String stt5n3;
	 private  String stt5n4;
	 private  String stt5n5n;
	 private  String stt5n6;
	 private  String stt5n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5n1",
					stt5n1);
			System.setProperty("stt5n2",
					stt5n2);
			System.setProperty("stt5n3",
					stt5n3);
			System.setProperty("stt5n4",
					stt5n4);
			System.setProperty("stt5n5n",
					stt5n5n);
			System.setProperty("stt5n6",
					stt5n6);
			System.setProperty("stt5n7",
					stt5n7);

			
			System.setProperty("Test5nInit",
					"Test5nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5n5nInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5nInit.class/jcp.xml");
			
			System.setProperty("Test5nss5n_0x",
					"Test5nss5n_0xjcp.xml");
         	System.setProperty("Test5nss5n_02",
					"Test5nss5n_02xml.config");
			System.setProperty("Test5nss5n_03",
					"Test5nss5n_03.apache.xml.resource.security.");
		    System.setProperty("Test5nss5n_04",
					"Test5nss5n_04.resource.");
			System.setProperty("Test5nss5n_05n",
					"Test5nss5n_05n.isInitialized");
			System.setProperty("Test5nss5n_06",
					"Test5nss5n_06_5nInit.class/jcp.xml");
			System.setProperty("Test5nss5n_07",
					"Test5nss5n_07t/resource/jcp.xml");
         	System.setProperty("Test5nss5n_08",
					"Test5nss5n_08.config");
			System.setProperty("Test5nss5n_09",
					"Test5nss5n_09.security.");
		    System.setProperty("Test5nss5n_0x0",
					"Test5nss5n_0x0jcp.xmlapache.");
			System.setProperty("Test5nss5n_0xx0",
					"Test5nss5n_0xx0.isInitialized");
			System.setProperty("Test5nss5n_0xxx0",
					"Test5nss5n_0xxx0est5nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5n5nInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5n = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5n != null) {
				 
				LOGGER.debug("in0in isTest5n");
				LOGGER.debug("inxin isTest5n");
				LOGGER.debug("in2in isTest5n");
				LOGGER.debug("in3in isTest5n");
				LOGGER.debug("in4in isTest5n");
				LOGGER.debug("in5nin isTest5n");
				LOGGER.debug("in6in isTest5n");
				LOGGER.debug("in7in isTest5n");
				LOGGER.debug("in8in isTest5n");
				LOGGER.debug("in9in isTest5n");
				LOGGER.debug("inx0in isTest5n");
				LOGGER.debug("inxxin isTest5n");
				LOGGER.debug("inx2in isTest5n");
				LOGGER.debug("inx3in isTest5n");
				LOGGER.debug("inx4in isTest5n");
				LOGGER.debug("inx5nin isTest5n");
				LOGGER.debug("inx6in isTest5n");
				LOGGER.debug("inx7in isTest5n");
				LOGGER.debug("inx8in isTest5n");
				LOGGER.debug("inx9in isTest5n");
				LOGGER.debug("in20in isTest5n");
			}

			 

			DocumentBuilderFactory dbfTest5n = DocumentBuilderFactory.newInstance();
			dbfTest5n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5n.setNamespaceAware(true);
			dbfTest5n.setValidating(false);

			DocumentBuilder db = dbfTest5n.newDocumentBuilder();
			Document doc = db.parse(isTest5n);
			Node configTest5n = doc.getFirstChild();
			while ((configTest5n != null)
					&& (!"Configuration".equals(configTest5n.getLocalName()))) {
				configTest5n = configTest5n.getNextSibling();
			}

			if (configTest5n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5n!=null?configTest5n.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5n = (Element) el;

					Attr langAttr = resourceTest5n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5n.length; i++) {
						String uri = listTest5n[i].getAttributeNS(null, "URI");
						String javaclass = listTest5n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5n.length; i++) {
						String uritrans = tranElemTest5n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5n = algorithms[i];
							String id = elementTest5n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5n.length; i++) {
						String urisign = sigElemsTest5n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5n.length; i++) {
						String javaclass = resolverElemTest5n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5nRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5n = new ArrayList<String>(resolverElemTest5n.length);
					for (int i = 0; i < resolverElemTest5n.length; i++) {
						String javaclass = resolverElemTest5n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5n = resolverElemTest5n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5n != null) && (descriptionTest5n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5n);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5n);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5n.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5n.length; i++) {
						String namespace = nlTest5n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5n ) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", exs5n);
 } catch (ClassNotFoundException enf5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", enf5n);
 } catch (IllegalAccessException eia5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", eia5n);
 } catch (InstantiationException e5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", e5n);
 } catch (javax.xml.parsers.ParserConfigurationException epc5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", epc5n);
 } catch (org.xml.sax.SAXException ese5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", ese5n);
 } catch (java.io.IOException eio5n) {
 LOGGER.error("Crypto5nInit:fileInit:error: ", eio5n);
 }

	}

}
