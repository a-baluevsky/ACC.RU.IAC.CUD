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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9l1,String st9l2,String st9l3,String st9l4,String st9l5,
			                String st9l6,String st9l7){
	  stt9l1=st9l1;
	  stt9l2=st9l2;
	  stt9l3=st9l3;
	  stt9l4=st9l4;
	  stt9l5=st9l5;
	  stt9l6=st9l6;
	  stt9l7=st9l7;

	 }
	 
	 private  String stt9l1;
	 private  String stt9l2;
	 private String stt9l3;
	 private  String stt9l4;
	 private  String stt9l5;
	 private  String stt9l6;
	 private  String stt9l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9l1",
					stt9l1);
			System.setProperty("stt9l2",
					stt9l2);
			System.setProperty("stt9l3",
					stt9l3);
			System.setProperty("stt9l4",
					stt9l4);
			System.setProperty("stt9l5",
					stt9l5);
			System.setProperty("stt9l6",
					stt9l6);
			System.setProperty("stt9l7",
					stt9l7);

			
			System.setProperty("Test9lInit",
					"Test9lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9lInit.class/jcp.xml");
			
			
			System.setProperty("Test9lss9l_0x",
					"Test9lss9l_0xjcp.xml");
         	System.setProperty("Test9lss9l_02",
					"Test9lss9l_02xml.config");
			System.setProperty("Test9lss9l_03",
					"Test9lss9l_03.apache.xml.resource.security.");
		    System.setProperty("Test9lss9l_04",
					"Test9lss9l_04.resource.");
			System.setProperty("Test9lss9l_05",
					"Test9lss9l_05.isInitialized");
			System.setProperty("Test9lss9l_06",
					"Test9lss9l_06_9lInit.class/jcp.xml");
			System.setProperty("Test9lss9l_07",
					"Test9lss9l_07t/resource/jcp.xml");
         	System.setProperty("Test9lss9l_08",
					"Test9lss9l_08.config");
			System.setProperty("Test9lss9l_09l",
					"Test9lss9l_09l.security.");
		    System.setProperty("Test9lss9l_0x0",
					"Test9lss9l_0x0jcp.xmlapache.");
			System.setProperty("Test9lss9l_0xx0",
					"Test9lss9l_0xx0.isInitialized");
			System.setProperty("Test9lss9l_0xxx0",
					"Test9lss9l_0xxx0est9lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9l = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9l != null) {
				 
				LOGGER.debug("in0in isTest9l");
				LOGGER.debug("inxin isTest9l");
				LOGGER.debug("in2in isTest9l");
				LOGGER.debug("in3in isTest9l");
				LOGGER.debug("in4in isTest9l");
				LOGGER.debug("in5in isTest9l");
				LOGGER.debug("in6in isTest9l");
				LOGGER.debug("in7in isTest9l");
				LOGGER.debug("in8in isTest9l");
				LOGGER.debug("in9lin isTest9l");
				LOGGER.debug("inx0in isTest9l");
				LOGGER.debug("inxxin isTest9l");
				LOGGER.debug("inx2in isTest9l");
				LOGGER.debug("inx3in isTest9l");
				LOGGER.debug("inx4in isTest9l");
				LOGGER.debug("inx5in isTest9l");
				LOGGER.debug("inx6in isTest9l");
				LOGGER.debug("inx7in isTest9l");
				LOGGER.debug("inx8in isTest9l");
				LOGGER.debug("inx9lin isTest9l");
				LOGGER.debug("in20in isTest9l");
			}

			 

			DocumentBuilderFactory dbfTest9l = DocumentBuilderFactory.newInstance();
			dbfTest9l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9l.setNamespaceAware(true);
			dbfTest9l.setValidating(false);

			DocumentBuilder db = dbfTest9l.newDocumentBuilder();
			Document doc = db.parse(isTest9l);
			Node configTest9l = doc.getFirstChild();
			while ((configTest9l != null)
					&& (!"Configuration".equals(configTest9l.getLocalName()))) {
				configTest9l = configTest9l.getNextSibling();
			}

			if (configTest9l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9l!=null?configTest9l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9l = (Element) el;

					Attr langAttr = resourceTest9l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9l.length; i++) {
						String uri = listTest9l[i].getAttributeNS(null, "URI");
						String javaclass = listTest9l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9l.length; i++) {
						String uritrans = tranElemTest9l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9l = algorithms[i];
							String id = elementTest9l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9l.length; i++) {
						String urisign = sigElemsTest9l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9l.length; i++) {
						String javaclass = resolverElemTest9l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9lRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9l = new ArrayList(resolverElemTest9l.length);
					for (int i = 0; i < resolverElemTest9l.length; i++) {
						String javaclass = resolverElemTest9l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9l = resolverElemTest9l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9l != null) && (descriptionTest9l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9l);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9l);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9l.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9l.length; i++) {
						String namespace = nlTest9l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9l ) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", exs9l);
 } catch (ClassNotFoundException enf9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", enf9l);
 } catch (IllegalAccessException eia9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", eia9l);
 } catch (InstantiationException e9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", e9l);
 } catch (javax.xml.parsers.ParserConfigurationException epc9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", epc9l);
 } catch (org.xml.sax.SAXException ese9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", ese9l);
 } catch (java.io.IOException eio9l) {
 LOGGER.error("Crypto9lInit:fileInit:error: ", eio9l);
 }

	}

}
