package ru.spb.iac.crypto.init.org;

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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6l1,String st6l2,String st6l3,String st6l4,String st6l5,
			                String st6l6l,String st6l7){
	  stt6l1=st6l1;
	  stt6l2=st6l2;
	  stt6l3=st6l3;
	  stt6l4=st6l4;
	  stt6l5=st6l5;
	  stt6l6l=st6l6l;
	  stt6l7=st6l7;

	 }
	 
	 private  String stt6l1;
	 private  String stt6l2;
	 private String stt6l3;
	 private  String stt6l4;
	 private  String stt6l5;
	 private  String stt6l6l;
	 private  String stt6l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6l1",
					stt6l1);
			System.setProperty("stt6l2",
					stt6l2);
			System.setProperty("stt6l3",
					stt6l3);
			System.setProperty("stt6l4",
					stt6l4);
			System.setProperty("stt6l5",
					stt6l5);
			System.setProperty("stt6l6l",
					stt6l6l);
			System.setProperty("stt6l7",
					stt6l7);

			
			System.setProperty("Test6lInit",
					"Test6lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6lInit.class/jcp.xml");
			
			System.setProperty("Test6lss6l_0x",
					"Test6lss6l_0xjcp.xml");
         	System.setProperty("Test6lss6l_02",
					"Test6lss6l_02xml.config");
			System.setProperty("Test6lss6l_03",
					"Test6lss6l_03.apache.xml.resource.security.");
		    System.setProperty("Test6lss6l_04",
					"Test6lss6l_04.resource.");
			System.setProperty("Test6lss6l_05",
					"Test6lss6l_05.isInitialized");
			System.setProperty("Test6lss6l_06l",
					"Test6lss6l_06l_6lInit.class/jcp.xml");
			System.setProperty("Test6lss6l_07",
					"Test6lss6l_07t/resource/jcp.xml");
         	System.setProperty("Test6lss6l_08",
					"Test6lss6l_08.config");
			System.setProperty("Test6lss6l_09",
					"Test6lss6l_09.security.");
		    System.setProperty("Test6lss6l_0x0",
					"Test6lss6l_0x0jcp.xmlapache.");
			System.setProperty("Test6lss6l_0xx0",
					"Test6lss6l_0xx0.isInitialized");
			System.setProperty("Test6lss6l_0xxx0",
					"Test6lss6l_0xxx0est6lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6l = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6l != null) {
				 
				LOGGER.debug("in0in isTest6l");
				LOGGER.debug("inxin isTest6l");
				LOGGER.debug("in2in isTest6l");
				LOGGER.debug("in3in isTest6l");
				LOGGER.debug("in4in isTest6l");
				LOGGER.debug("in5in isTest6l");
				LOGGER.debug("in6lin isTest6l");
				LOGGER.debug("in7in isTest6l");
				LOGGER.debug("in8in isTest6l");
				LOGGER.debug("in9in isTest6l");
				LOGGER.debug("inx0in isTest6l");
				LOGGER.debug("inxxin isTest6l");
				LOGGER.debug("inx2in isTest6l");
				LOGGER.debug("inx3in isTest6l");
				LOGGER.debug("inx4in isTest6l");
				LOGGER.debug("inx5in isTest6l");
				LOGGER.debug("inx6lin isTest6l");
				LOGGER.debug("inx7in isTest6l");
				LOGGER.debug("inx8in isTest6l");
				LOGGER.debug("inx9in isTest6l");
				LOGGER.debug("in20in isTest6l");
			}

			 

			DocumentBuilderFactory dbfTest6l = DocumentBuilderFactory.newInstance();
			dbfTest6l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6l.setNamespaceAware(true);
			dbfTest6l.setValidating(false);

			DocumentBuilder db = dbfTest6l.newDocumentBuilder();
			Document doc = db.parse(isTest6l);
			Node configTest6l = doc.getFirstChild();
			while ((configTest6l != null)
					&& (!"Configuration".equals(configTest6l.getLocalName()))) {
				configTest6l = configTest6l.getNextSibling();
			}

			if (configTest6l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6l!=null?configTest6l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6l = (Element) el;

					Attr langAttr = resourceTest6l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6l.length; i++) {
						String uri = listTest6l[i].getAttributeNS(null, "URI");
						String javaclass = listTest6l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6l.length; i++) {
						String uritrans = tranElemTest6l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6l = algorithms[i];
							String id = elementTest6l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6l.length; i++) {
						String urisign = sigElemsTest6l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6l.length; i++) {
						String javaclass = resolverElemTest6l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6lRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6lRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest6l = new ArrayList<String>(resolverElemTest6l.length);
					for (int i = 0; i < resolverElemTest6l.length; i++) {
						String javaclass = resolverElemTest6l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6l = resolverElemTest6l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6l != null) && (descriptionTest6l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6l);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6l);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6l.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6l.length; i++) {
						String namespace = nlTest6l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6l ) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", exs6l);
 } catch (ClassNotFoundException enf6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", enf6l);
 } catch (IllegalAccessException eia6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", eia6l);
 } catch (InstantiationException e6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", e6l);
 } catch (javax.xml.parsers.ParserConfigurationException epc6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", epc6l);
 } catch (org.xml.sax.SAXException ese6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", ese6l);
 } catch (java.io.IOException eio6l) {
 LOGGER.error("Crypto6lInit:fileInit:error: ", eio6l);
 }
	}

}
