package ru.spb.iac.crypto.init.group;

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
	 
	 
	 public CryptoDomainInit(String st9fb1,String st9fb2,String st9fb3,String st9fb4,String st9fb5,
			                String st9fb6,String st9fb7){
	  stt9fb1=st9fb1;
	  stt9fb2=st9fb2;
	  stt9fb3=st9fb3;
	  stt9fb4=st9fb4;
	  stt9fb5=st9fb5;
	  stt9fb6=st9fb6;
	  stt9fb7=st9fb7;

	 }
	 
	 private  String stt9fb1;
	 private  String stt9fb2;
	 private String stt9fb3;
	 private  String stt9fb4;
	 private  String stt9fb5;
	 private  String stt9fb6;
	 private  String stt9fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9fb1",
					stt9fb1);
			System.setProperty("stt9fb2",
					stt9fb2);
			System.setProperty("stt9fb3",
					stt9fb3);
			System.setProperty("stt9fb4",
					stt9fb4);
			System.setProperty("stt9fb5",
					stt9fb5);
			System.setProperty("stt9fb6",
					stt9fb6);
			System.setProperty("stt9fb7",
					stt9fb7);

			
			System.setProperty("Test9fbInit",
					"Test9fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9fbInit.class/jcp.xml");
			
			
			System.setProperty("Test9fbss9fb_0x",
					"Test9fbss9fb_0xjcp.xml");
         	System.setProperty("Test9fbss9fb_02",
					"Test9fbss9fb_02xml.config");
			System.setProperty("Test9fbss9fb_03",
					"Test9fbss9fb_03.apache.xml.resource.security.");
		    System.setProperty("Test9fbss9fb_04",
					"Test9fbss9fb_04.resource.");
			System.setProperty("Test9fbss9fb_05",
					"Test9fbss9fb_05.isInitialized");
			System.setProperty("Test9fbss9fb_06",
					"Test9fbss9fb_06_9fbInit.class/jcp.xml");
			System.setProperty("Test9fbss9fb_07",
					"Test9fbss9fb_07t/resource/jcp.xml");
         	System.setProperty("Test9fbss9fb_08",
					"Test9fbss9fb_08.config");
			System.setProperty("Test9fbss9fb_09fb",
					"Test9fbss9fb_09fb.security.");
		    System.setProperty("Test9fbss9fb_0x0",
					"Test9fbss9fb_0x0jcp.xmlapache.");
			System.setProperty("Test9fbss9fb_0xx0",
					"Test9fbss9fb_0xx0.isInitialized");
			System.setProperty("Test9fbss9fb_0xxx0",
					"Test9fbss9fb_0xxx0est9fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9fb = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9fb != null) {
				 
				LOGGER.debug("in0in isTest9fb");
				LOGGER.debug("inxin isTest9fb");
				LOGGER.debug("in2in isTest9fb");
				LOGGER.debug("in3in isTest9fb");
				LOGGER.debug("in4in isTest9fb");
				LOGGER.debug("in5in isTest9fb");
				LOGGER.debug("in6in isTest9fb");
				LOGGER.debug("in7in isTest9fb");
				LOGGER.debug("in8in isTest9fb");
				LOGGER.debug("in9fbin isTest9fb");
				LOGGER.debug("inx0in isTest9fb");
				LOGGER.debug("inxxin isTest9fb");
				LOGGER.debug("inx2in isTest9fb");
				LOGGER.debug("inx3in isTest9fb");
				LOGGER.debug("inx4in isTest9fb");
				LOGGER.debug("inx5in isTest9fb");
				LOGGER.debug("inx6in isTest9fb");
				LOGGER.debug("inx7in isTest9fb");
				LOGGER.debug("inx8in isTest9fb");
				LOGGER.debug("inx9fbin isTest9fb");
				LOGGER.debug("in20in isTest9fb");
			}

			 

			DocumentBuilderFactory dbfTest9fb = DocumentBuilderFactory.newInstance();
			dbfTest9fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9fb.setNamespaceAware(true);
			dbfTest9fb.setValidating(false);

			DocumentBuilder db = dbfTest9fb.newDocumentBuilder();
			Document doc = db.parse(isTest9fb);
			Node configTest9fb = doc.getFirstChild();
			while ((configTest9fb != null)
					&& (!"Configuration".equals(configTest9fb.getLocalName()))) {
				configTest9fb = configTest9fb.getNextSibling();
			}

			if (configTest9fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9fb!=null?configTest9fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9fb = (Element) el;

					Attr langAttr = resourceTest9fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9fb.length; i++) {
						String uri = listTest9fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest9fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9fb.length; i++) {
						String uritrans = tranElemTest9fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9fb = algorithms[i];
							String id = elementTest9fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9fb.length; i++) {
						String urisign = sigElemsTest9fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9fb.length; i++) {
						String javaclass = resolverElemTest9fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9fbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9fb = new ArrayList(resolverElemTest9fb.length);
					for (int i = 0; i < resolverElemTest9fb.length; i++) {
						String javaclass = resolverElemTest9fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9fb = resolverElemTest9fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9fb != null) && (descriptionTest9fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9fb);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9fb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9fb.length; i++) {
						String namespace = nlTest9fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9fb ) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", exs9fb);
 } catch (ClassNotFoundException enf9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", enf9fb);
 } catch (IllegalAccessException eia9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", eia9fb);
 } catch (InstantiationException e9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", e9fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", epc9fb);
 } catch (org.xml.sax.SAXException ese9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", ese9fb);
 } catch (java.io.IOException eio9fb) {
 LOGGER.error("Crypto9fbInit:fileInit:error: ", eio9fb);
 }

	}

}
