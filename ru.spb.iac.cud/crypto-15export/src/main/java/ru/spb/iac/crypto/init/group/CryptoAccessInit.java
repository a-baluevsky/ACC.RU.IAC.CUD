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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1fb1fb,String st1fb2,String st1fb3,String st1fb4,String st1fb5,
			                String st1fb6,String st1fb7){
	  stt1fb1fb=st1fb1fb;
	  stt1fb2=st1fb2;
	  stt1fb3=st1fb3;
	  stt1fb4=st1fb4;
	  stt1fb5=st1fb5;
	  stt1fb6=st1fb6;
	  stt1fb7=st1fb7;

	 }
	 
	 private  String stt1fb1fb;
	 private  String stt1fb2;
	 private String stt1fb3;
	 private  String stt1fb4;
	 private  String stt1fb5;
	 private  String stt1fb6;
	 private  String stt1fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1fb1fb",
					stt1fb1fb);
			System.setProperty("stt1fb2",
					stt1fb2);
			System.setProperty("stt1fb3",
					stt1fb3);
			System.setProperty("stt1fb4",
					stt1fb4);
			System.setProperty("stt1fb5",
					stt1fb5);
			System.setProperty("stt1fb6",
					stt1fb6);
			System.setProperty("stt1fb7",
					stt1fb7);

			
			System.setProperty("Test1fbInit",
					"Test1fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1fbInit.class/jcp.xml");
			
			System.setProperty("Test1fbss1fb_0x",
					"Test1fbss1fb_0xjcp.xml");
         	System.setProperty("Test1fbss1fb_02",
					"Test1fbss1fb_02xml.config");
			System.setProperty("Test1fbss1fb_03",
					"Test1fbss1fb_03.apache.xml.resource.security.");
		    System.setProperty("Test1fbss1fb_04",
					"Test1fbss1fb_04.resource.");
			System.setProperty("Test1fbss1fb_05",
					"Test1fbss1fb_05.isInitialized");
			System.setProperty("Test1fbss1fb_06",
					"Test1fbss1fb_06_1fbInit.class/jcp.xml");
			System.setProperty("Test1fbss1fb_07",
					"Test1fbss1fb_07t/resource/jcp.xml");
         	System.setProperty("Test1fbss1fb_08",
					"Test1fbss1fb_08.config");
			System.setProperty("Test1fbss1fb_09",
					"Test1fbss1fb_09.security.");
		    System.setProperty("Test1fbss1fb_0x0",
					"Test1fbss1fb_0x0jcp.xmlapache.");
			System.setProperty("Test1fbss1fb_0xx0",
					"Test1fbss1fb_0xx0.isInitialized");
			System.setProperty("Test1fbss1fb_0xxx0",
					"Test1fbss1fb_0xxx0est1fbInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1fb = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1fb != null) {
				 
				LOGGER.debug("in0in isTest1fb");
				LOGGER.debug("in1fbin isTest1fb");
				LOGGER.debug("in2in isTest1fb");
				LOGGER.debug("in3in isTest1fb");
				LOGGER.debug("in4in isTest1fb");
				LOGGER.debug("in5in isTest1fb");
				LOGGER.debug("in6in isTest1fb");
				LOGGER.debug("in7in isTest1fb");
				LOGGER.debug("in8in isTest1fb");
				LOGGER.debug("in9in isTest1fb");
				LOGGER.debug("in1fb0in isTest1fb");
				LOGGER.debug("in1fb1fbin isTest1fb");
				LOGGER.debug("in1fb2in isTest1fb");
				LOGGER.debug("in1fb3in isTest1fb");
				LOGGER.debug("in1fb4in isTest1fb");
				LOGGER.debug("in1fb5in isTest1fb");
				LOGGER.debug("in1fb6in isTest1fb");
				LOGGER.debug("in1fb7in isTest1fb");
				LOGGER.debug("in1fb8in isTest1fb");
				LOGGER.debug("in1fb9in isTest1fb");
				LOGGER.debug("in20in isTest1fb");
			}

			 

			DocumentBuilderFactory dbfTest1fb = DocumentBuilderFactory.newInstance();
			dbfTest1fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1fb.setNamespaceAware(true);
			dbfTest1fb.setValidating(false);

			DocumentBuilder db = dbfTest1fb.newDocumentBuilder();
			Document doc = db.parse(isTest1fb);
			Node configTest1fb = doc.getFirstChild();
			while ((configTest1fb != null)
					&& (!"Configuration".equals(configTest1fb.getLocalName()))) {
				configTest1fb = configTest1fb.getNextSibling();
			}

			if (configTest1fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1fb!=null?configTest1fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1f != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1fb = (Element) el;

					Attr langAttr = resourceTest1fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1fb.length; i++) {
						String uri = listTest1fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest1fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1fb.length; i++) {
						String uritrans = tranElemTest1fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1fb = algorithms[i];
							String id = elementTest1fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1fb.length; i++) {
						String urisign = sigElemsTest1fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1fb.length; i++) {
						String javaclass = resolverElemTest1fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1fb-Test1fbRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1fb = new ArrayList(resolverElemTest1fb.length);
					for (int i = 0; i < resolverElemTest1fb.length; i++) {
						String javaclass = resolverElemTest1fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1fb = resolverElemTest1fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1fb != null) && (descriptionTest1fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1fb);
								LOGGER.debug("Test1fbRegister Resolver: " + javaclass
										+ ": " + descriptionTest1fb);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1fb.length; i++) {
						String namespace = nlTest1fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1fb ) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", exs1fb);
 } catch (ClassNotFoundException enf1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", enf1fb);
 } catch (IllegalAccessException eia1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", eia1fb);
 } catch (InstantiationException e1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", e1fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", epc1fb);
 } catch (org.xml.sax.SAXException ese1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", ese1fb);
 } catch (java.io.IOException eio1fb) {
 LOGGER.error("Crypto1fbInit:fileInit:error: ", eio1fb);
 }

	}

}
