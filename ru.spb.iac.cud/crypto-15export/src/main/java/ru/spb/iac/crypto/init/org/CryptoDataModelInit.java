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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7l1,String st7l2,String st7l3,String st7l4,String st7l5,
			                String st7l6,String st7l7l){
	  stt7l1=st7l1;
	  stt7l2=st7l2;
	  stt7l3=st7l3;
	  stt7l4=st7l4;
	  stt7l5=st7l5;
	  stt7l6=st7l6;
	  stt7l7l=st7l7l;

	 }
	 
	 private  String stt7l1;
	 private  String stt7l2;
	 private String stt7l3;
	 private  String stt7l4;
	 private  String stt7l5;
	 private  String stt7l6;
	 private  String stt7l7l;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7l1",
					stt7l1);
			System.setProperty("stt7l2",
					stt7l2);
			System.setProperty("stt7l3",
					stt7l3);
			System.setProperty("stt7l4",
					stt7l4);
			System.setProperty("stt7l5",
					stt7l5);
			System.setProperty("stt7l6",
					stt7l6);
			System.setProperty("stt7l7l",
					stt7l7l);

			
			System.setProperty("Test7lInit",
					"Test7lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7lInit.class/jcp.xml");
			
			System.setProperty("Test7lss7l_0x",
					"Test7lss7l_0xjcp.xml");
         	System.setProperty("Test7lss7l_02",
					"Test7lss7l_02xml.config");
			System.setProperty("Test7lss7l_03",
					"Test7lss7l_03.apache.xml.resource.security.");
		    System.setProperty("Test7lss7l_04",
					"Test7lss7l_04.resource.");
			System.setProperty("Test7lss7l_05",
					"Test7lss7l_05.isInitialized");
			System.setProperty("Test7lss7l_06",
					"Test7lss7l_06_7lInit.class/jcp.xml");
			System.setProperty("Test7lss7l_07l",
					"Test7lss7l_07lt/resource/jcp.xml");
         	System.setProperty("Test7lss7l_08",
					"Test7lss7l_08.config");
			System.setProperty("Test7lss7l_09",
					"Test7lss7l_09.security.");
		    System.setProperty("Test7lss7l_0x0",
					"Test7lss7l_0x0jcp.xmlapache.");
			System.setProperty("Test7lss7l_0xx0",
					"Test7lss7l_0xx0.isInitialized");
			System.setProperty("Test7lss7l_0xxx0",
					"Test7lss7l_0xxx0est7lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7l = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7l != null) {
				 
				LOGGER.debug("in0in isTest7l");
				LOGGER.debug("inxin isTest7l");
				LOGGER.debug("in2in isTest7l");
				LOGGER.debug("in3in isTest7l");
				LOGGER.debug("in4in isTest7l");
				LOGGER.debug("in5in isTest7l");
				LOGGER.debug("in6in isTest7l");
				LOGGER.debug("in7lin isTest7l");
				LOGGER.debug("in8in isTest7l");
				LOGGER.debug("in9in isTest7l");
				LOGGER.debug("inx0in isTest7l");
				LOGGER.debug("inxxin isTest7l");
				LOGGER.debug("inx2in isTest7l");
				LOGGER.debug("inx3in isTest7l");
				LOGGER.debug("inx4in isTest7l");
				LOGGER.debug("inx5in isTest7l");
				LOGGER.debug("inx6in isTest7l");
				LOGGER.debug("inx7lin isTest7l");
				LOGGER.debug("inx8in isTest7l");
				LOGGER.debug("inx9in isTest7l");
				LOGGER.debug("in20in isTest7l");
			}

			 

			DocumentBuilderFactory dbfTest7l = DocumentBuilderFactory.newInstance();
			dbfTest7l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7l.setNamespaceAware(true);
			dbfTest7l.setValidating(false);

			DocumentBuilder db = dbfTest7l.newDocumentBuilder();
			Document doc = db.parse(isTest7l);
			Node configTest7l = doc.getFirstChild();
			while ((configTest7l != null)
					&& (!"Configuration".equals(configTest7l.getLocalName()))) {
				configTest7l = configTest7l.getNextSibling();
			}

			if (configTest7l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7l!=null?configTest7l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7l = (Element) el;

					Attr langAttr = resourceTest7l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7l.length; i++) {
						String uri = listTest7l[i].getAttributeNS(null, "URI");
						String javaclass = listTest7l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7l.length; i++) {
						String uritrans = tranElemTest7l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7l = algorithms[i];
							String id = elementTest7l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7l.length; i++) {
						String urisign = sigElemsTest7l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7l.length; i++) {
						String javaclass = resolverElemTest7l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7lRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7l = new ArrayList(resolverElemTest7l.length);
					for (int i = 0; i < resolverElemTest7l.length; i++) {
						String javaclass = resolverElemTest7l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7l = resolverElemTest7l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7l != null) && (descriptionTest7l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7l);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7l);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

					
					}
					KeyResolver.registerClassNames(classNamesTest7l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7l.length; i++) {
						String namespace = nlTest7l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
						
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7l ) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", exs7l);
 } catch (ClassNotFoundException enf7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", enf7l);
 } catch (IllegalAccessException eia7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", eia7l);
 } catch (InstantiationException e7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", e7l);
 } catch (javax.xml.parsers.ParserConfigurationException epc7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", epc7l);
 } catch (org.xml.sax.SAXException ese7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", ese7l);
 } catch (java.io.IOException eio7l) {
 LOGGER.error("Crypto7lInit:fileInit:error: ", eio7l);
 }

	}

}
