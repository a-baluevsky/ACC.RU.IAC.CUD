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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7fb1,String st7fb2,String st7fb3,String st7fb4,String st7fb5,
			                String st7fb6,String st7fb7fb){
	  stt7fb1=st7fb1;
	  stt7fb2=st7fb2;
	  stt7fb3=st7fb3;
	  stt7fb4=st7fb4;
	  stt7fb5=st7fb5;
	  stt7fb6=st7fb6;
	  stt7fb7fb=st7fb7fb;

	 }
	 
	 private  String stt7fb1;
	 private  String stt7fb2;
	 private String stt7fb3;
	 private  String stt7fb4;
	 private  String stt7fb5;
	 private  String stt7fb6;
	 private  String stt7fb7fb;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7fb1",
					stt7fb1);
			System.setProperty("stt7fb2",
					stt7fb2);
			System.setProperty("stt7fb3",
					stt7fb3);
			System.setProperty("stt7fb4",
					stt7fb4);
			System.setProperty("stt7fb5",
					stt7fb5);
			System.setProperty("stt7fb6",
					stt7fb6);
			System.setProperty("stt7fb7fb",
					stt7fb7fb);

			
			System.setProperty("Test7fbInit",
					"Test7fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7fbInit.class/jcp.xml");
			
			System.setProperty("Test7fbss7fb_0x",
					"Test7fbss7fb_0xjcp.xml");
         	System.setProperty("Test7fbss7fb_02",
					"Test7fbss7fb_02xml.config");
			System.setProperty("Test7fbss7fb_03",
					"Test7fbss7fb_03.apache.xml.resource.security.");
		    System.setProperty("Test7fbss7fb_04",
					"Test7fbss7fb_04.resource.");
			System.setProperty("Test7fbss7fb_05",
					"Test7fbss7fb_05.isInitialized");
			System.setProperty("Test7fbss7fb_06",
					"Test7fbss7fb_06_7fbInit.class/jcp.xml");
			System.setProperty("Test7fbss7fb_07fb",
					"Test7fbss7fb_07fbt/resource/jcp.xml");
         	System.setProperty("Test7fbss7fb_08",
					"Test7fbss7fb_08.config");
			System.setProperty("Test7fbss7fb_09",
					"Test7fbss7fb_09.security.");
		    System.setProperty("Test7fbss7fb_0x0",
					"Test7fbss7fb_0x0jcp.xmlapache.");
			System.setProperty("Test7fbss7fb_0xx0",
					"Test7fbss7fb_0xx0.isInitialized");
			System.setProperty("Test7fbss7fb_0xxx0",
					"Test7fbss7fb_0xxx0est7fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7fb = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7fb != null) {
				 
				LOGGER.debug("in0in isTest7fb");
				LOGGER.debug("inxin isTest7fb");
				LOGGER.debug("in2in isTest7fb");
				LOGGER.debug("in3in isTest7fb");
				LOGGER.debug("in4in isTest7fb");
				LOGGER.debug("in5in isTest7fb");
				LOGGER.debug("in6in isTest7fb");
				LOGGER.debug("in7fbin isTest7fb");
				LOGGER.debug("in8in isTest7fb");
				LOGGER.debug("in9in isTest7fb");
				LOGGER.debug("inx0in isTest7fb");
				LOGGER.debug("inxxin isTest7fb");
				LOGGER.debug("inx2in isTest7fb");
				LOGGER.debug("inx3in isTest7fb");
				LOGGER.debug("inx4in isTest7fb");
				LOGGER.debug("inx5in isTest7fb");
				LOGGER.debug("inx6in isTest7fb");
				LOGGER.debug("inx7fbin isTest7fb");
				LOGGER.debug("inx8in isTest7fb");
				LOGGER.debug("inx9in isTest7fb");
				LOGGER.debug("in20in isTest7fb");
			}

			 

			DocumentBuilderFactory dbfTest7fb = DocumentBuilderFactory.newInstance();
			dbfTest7fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7fb.setNamespaceAware(true);
			dbfTest7fb.setValidating(false);

			DocumentBuilder db = dbfTest7fb.newDocumentBuilder();
			Document doc = db.parse(isTest7fb);
			Node configTest7fb = doc.getFirstChild();
			while ((configTest7fb != null)
					&& (!"Configuration".equals(configTest7fb.getLocalName()))) {
				configTest7fb = configTest7fb.getNextSibling();
			}

			if (configTest7fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7fb!=null?configTest7fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7fb = (Element) el;

					Attr langAttr = resourceTest7fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7fb.length; i++) {
						String uri = listTest7fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest7fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7fb.length; i++) {
						String uritrans = tranElemTest7fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7fb = algorithms[i];
							String id = elementTest7fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7fb.length; i++) {
						String urisign = sigElemsTest7fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7fb.length; i++) {
						String javaclass = resolverElemTest7fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7fbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7fb = new ArrayList(resolverElemTest7fb.length);
					for (int i = 0; i < resolverElemTest7fb.length; i++) {
						String javaclass = resolverElemTest7fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7fb = resolverElemTest7fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7fb != null) && (descriptionTest7fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7fb);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7fb);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7fb.length; i++) {
						String namespace = nlTest7fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7fb ) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", exs7fb);
 } catch (ClassNotFoundException enf7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", enf7fb);
 } catch (IllegalAccessException eia7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", eia7fb);
 } catch (InstantiationException e7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", e7fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", epc7fb);
 } catch (org.xml.sax.SAXException ese7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", ese7fb);
 } catch (java.io.IOException eio7fb) {
 LOGGER.error("Crypto7fbInit:fileInit:error: ", eio7fb);
 }

	}

}
