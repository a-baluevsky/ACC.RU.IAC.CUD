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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6fb1,String st6fb2,String st6fb3,String st6fb4,String st6fb5,
			                String st6fb6fb,String st6fb7){
	  stt6fb1=st6fb1;
	  stt6fb2=st6fb2;
	  stt6fb3=st6fb3;
	  stt6fb4=st6fb4;
	  stt6fb5=st6fb5;
	  stt6fb6fb=st6fb6fb;
	  stt6fb7=st6fb7;

	 }
	 
	 private  String stt6fb1;
	 private  String stt6fb2;
	 private String stt6fb3;
	 private  String stt6fb4;
	 private  String stt6fb5;
	 private  String stt6fb6fb;
	 private  String stt6fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6fb1",
					stt6fb1);
			System.setProperty("stt6fb2",
					stt6fb2);
			System.setProperty("stt6fb3",
					stt6fb3);
			System.setProperty("stt6fb4",
					stt6fb4);
			System.setProperty("stt6fb5",
					stt6fb5);
			System.setProperty("stt6fb6fb",
					stt6fb6fb);
			System.setProperty("stt6fb7",
					stt6fb7);

			
			System.setProperty("Test6fbInit",
					"Test6fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6fbInit.class/jcp.xml");
			
			System.setProperty("Test6fbss6fb_0x",
					"Test6fbss6fb_0xjcp.xml");
         	System.setProperty("Test6fbss6fb_02",
					"Test6fbss6fb_02xml.config");
			System.setProperty("Test6fbss6fb_03",
					"Test6fbss6fb_03.apache.xml.resource.security.");
		    System.setProperty("Test6fbss6fb_04",
					"Test6fbss6fb_04.resource.");
			System.setProperty("Test6fbss6fb_05",
					"Test6fbss6fb_05.isInitialized");
			System.setProperty("Test6fbss6fb_06fb",
					"Test6fbss6fb_06fb_6fbInit.class/jcp.xml");
			System.setProperty("Test6fbss6fb_07",
					"Test6fbss6fb_07t/resource/jcp.xml");
         	System.setProperty("Test6fbss6fb_08",
					"Test6fbss6fb_08.config");
			System.setProperty("Test6fbss6fb_09",
					"Test6fbss6fb_09.security.");
		    System.setProperty("Test6fbss6fb_0x0",
					"Test6fbss6fb_0x0jcp.xmlapache.");
			System.setProperty("Test6fbss6fb_0xx0",
					"Test6fbss6fb_0xx0.isInitialized");
			System.setProperty("Test6fbss6fb_0xxx0",
					"Test6fbss6fb_0xxx0est6fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6fb = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6fb != null) {
				 
				LOGGER.debug("in0in isTest6fb");
				LOGGER.debug("inxin isTest6fb");
				LOGGER.debug("in2in isTest6fb");
				LOGGER.debug("in3in isTest6fb");
				LOGGER.debug("in4in isTest6fb");
				LOGGER.debug("in5in isTest6fb");
				LOGGER.debug("in6fbin isTest6fb");
				LOGGER.debug("in7in isTest6fb");
				LOGGER.debug("in8in isTest6fb");
				LOGGER.debug("in9in isTest6fb");
				LOGGER.debug("inx0in isTest6fb");
				LOGGER.debug("inxxin isTest6fb");
				LOGGER.debug("inx2in isTest6fb");
				LOGGER.debug("inx3in isTest6fb");
				LOGGER.debug("inx4in isTest6fb");
				LOGGER.debug("inx5in isTest6fb");
				LOGGER.debug("inx6fbin isTest6fb");
				LOGGER.debug("inx7in isTest6fb");
				LOGGER.debug("inx8in isTest6fb");
				LOGGER.debug("inx9in isTest6fb");
				LOGGER.debug("in20in isTest6fb");
			}

			 

			DocumentBuilderFactory dbfTest6fb = DocumentBuilderFactory.newInstance();
			dbfTest6fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6fb.setNamespaceAware(true);
			dbfTest6fb.setValidating(false);

			DocumentBuilder db = dbfTest6fb.newDocumentBuilder();
			Document doc = db.parse(isTest6fb);
			Node configTest6fb = doc.getFirstChild();
			while ((configTest6fb != null)
					&& (!"Configuration".equals(configTest6fb.getLocalName()))) {
				configTest6fb = configTest6fb.getNextSibling();
			}

			if (configTest6fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6fb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6fb = (Element) el;

					Attr langAttr = resourceTest6fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6fb.length; i++) {
						String uri = listTest6fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest6fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6fb.length; i++) {
						String uritrans = tranElemTest6fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6fb = algorithms[i];
							String id = elementTest6fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6fb.length; i++) {
						String urisign = sigElemsTest6fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6fb.length; i++) {
						String javaclass = resolverElemTest6fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6fbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6fbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6fb = new ArrayList(resolverElemTest6fb.length);
					for (int i = 0; i < resolverElemTest6fb.length; i++) {
						String javaclass = resolverElemTest6fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6fb = resolverElemTest6fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6fb != null) && (descriptionTest6fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6fb);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6fb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6fb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6fb.length; i++) {
						String namespace = nlTest6fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6fb) {
			LOGGER.error("Crypto6fb5Init:fileInit:error: ", eTest6fb);
		}
	}

}