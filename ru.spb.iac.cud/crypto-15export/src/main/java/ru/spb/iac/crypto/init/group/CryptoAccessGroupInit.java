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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2fb1,String st2fb2fb,String st2fb3,String st2fb4,String st2fb5,
			                String st2fb6,String st2fb7){
	  stt2fb1=st2fb1;
	  stt2fb2fb=st2fb2fb;
	  stt2fb3=st2fb3;
	  stt2fb4=st2fb4;
	  stt2fb5=st2fb5;
	  stt2fb6=st2fb6;
	  stt2fb7=st2fb7;

	 }
	 
	 private  String stt2fb1;
	 private  String stt2fb2fb;
	 private String stt2fb3;
	 private  String stt2fb4;
	 private  String stt2fb5;
	 private  String stt2fb6;
	 private  String stt2fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2fb1",
					stt2fb1);
			System.setProperty("stt2fb2fb",
					stt2fb2fb);
			System.setProperty("stt2fb3",
					stt2fb3);
			System.setProperty("stt2fb4",
					stt2fb4);
			System.setProperty("stt2fb5",
					stt2fb5);
			System.setProperty("stt2fb6",
					stt2fb6);
			System.setProperty("stt2fb7",
					stt2fb7);

			
			System.setProperty("Test2fbInit",
					"Test2fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2fbInit.class/jcp.xml");
			
			System.setProperty("Test2fbss2fb_0x",
					"Test2fbss2fb_0xjcp.xml");
         	System.setProperty("Test2fbss2fb_02fb",
					"Test2fbss2fb_02fbxml.config");
			System.setProperty("Test2fbss2fb_03",
					"Test2fbss2fb_03.apache.xml.resource.security.");
		    System.setProperty("Test2fbss2fb_04",
					"Test2fbss2fb_04.resource.");
			System.setProperty("Test2fbss2fb_05",
					"Test2fbss2fb_05.isInitialized");
			System.setProperty("Test2fbss2fb_06",
					"Test2fbss2fb_06_2fbInit.class/jcp.xml");
			System.setProperty("Test2fbss2fb_07",
					"Test2fbss2fb_07t/resource/jcp.xml");
         	System.setProperty("Test2fbss2fb_08",
					"Test2fbss2fb_08.config");
			System.setProperty("Test2fbss2fb_09",
					"Test2fbss2fb_09.security.");
		    System.setProperty("Test2fbss2fb_0x0",
					"Test2fbss2fb_0x0jcp.xmlapache.");
			System.setProperty("Test2fbss2fb_0xx0",
					"Test2fbss2fb_0xx0.isInitialized");
			System.setProperty("Test2fbss2fb_0xxx0",
					"Test2fbss2fb_0xxx0est2fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2fb = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2fb != null) {
				 
				LOGGER.debug("in0in isTest2fb");
				LOGGER.debug("inxin isTest2fb");
				LOGGER.debug("in2fbin isTest2fb");
				LOGGER.debug("in3in isTest2fb");
				LOGGER.debug("in4in isTest2fb");
				LOGGER.debug("in5in isTest2fb");
				LOGGER.debug("in6in isTest2fb");
				LOGGER.debug("in7in isTest2fb");
				LOGGER.debug("in8in isTest2fb");
				LOGGER.debug("in9in isTest2fb");
				LOGGER.debug("inx0in isTest2fb");
				LOGGER.debug("inxxin isTest2fb");
				LOGGER.debug("inx2fbin isTest2fb");
				LOGGER.debug("inx3in isTest2fb");
				LOGGER.debug("inx4in isTest2fb");
				LOGGER.debug("inx5in isTest2fb");
				LOGGER.debug("inx6in isTest2fb");
				LOGGER.debug("inx7in isTest2fb");
				LOGGER.debug("inx8in isTest2fb");
				LOGGER.debug("inx9in isTest2fb");
				LOGGER.debug("in2fb0in isTest2fb");
			}

			 

			DocumentBuilderFactory dbfTest2fb = DocumentBuilderFactory.newInstance();
			dbfTest2fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2fb.setNamespaceAware(true);
			dbfTest2fb.setValidating(false);

			DocumentBuilder db = dbfTest2fb.newDocumentBuilder();
			Document doc = db.parse(isTest2fb);
			Node configTest2fb = doc.getFirstChild();
			while ((configTest2fb != null)
					&& (!"Configuration".equals(configTest2fb.getLocalName()))) {
				configTest2fb = configTest2fb.getNextSibling();
			}

			if (configTest2fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2fb!=null?configTest2fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2fb = (Element) el;

					Attr langAttr = resourceTest2fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2fb.length; i++) {
						String uri = listTest2fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest2fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2fb.length; i++) {
						String uritrans = tranElemTest2fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2fb = algorithms[i];
							String id = elementTest2fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2fb.length; i++) {
						String urisign = sigElemsTest2fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2fb.length; i++) {
						String javaclass = resolverElemTest2fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2fbRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest2fb = new ArrayList<String>(resolverElemTest2fb.length);
					for (int i = 0; i < resolverElemTest2fb.length; i++) {
						String javaclass = resolverElemTest2fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2fb = resolverElemTest2fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2fb != null) && (descriptionTest2fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2fb);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2fb);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2fb.length; i++) {
						String namespace = nlTest2fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2fb ) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", exs2fb);
 } catch (ClassNotFoundException enf2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", enf2fb);
 } catch (IllegalAccessException eia2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", eia2fb);
 } catch (InstantiationException e2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", e2fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", epc2fb);
 } catch (org.xml.sax.SAXException ese2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", ese2fb);
 } catch (java.io.IOException eio2fb) {
 LOGGER.error("Crypto2fbInit:fileInit:error: ", eio2fb);
 }

	}

}
