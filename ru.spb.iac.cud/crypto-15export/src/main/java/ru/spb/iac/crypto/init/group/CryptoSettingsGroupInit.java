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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3fb1,String st3fb2,String st3fb3fb,String st3fb4,String st3fb5,
			                String st3fb6,String st3fb7){
	  stt3fb1=st3fb1;
	  stt3fb2=st3fb2;
	  stt3fb3fb=st3fb3fb;
	  stt3fb4=st3fb4;
	  stt3fb5=st3fb5;
	  stt3fb6=st3fb6;
	  stt3fb7=st3fb7;

	 }
	 
	 private  String stt3fb1;
	 private  String stt3fb2;
	 private String stt3fb3fb;
	 private  String stt3fb4;
	 private  String stt3fb5;
	 private  String stt3fb6;
	 private  String stt3fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3fb1",
					stt3fb1);
			System.setProperty("stt3fb2",
					stt3fb2);
			System.setProperty("stt3fb3fb",
					stt3fb3fb);
			System.setProperty("stt3fb4",
					stt3fb4);
			System.setProperty("stt3fb5",
					stt3fb5);
			System.setProperty("stt3fb6",
					stt3fb6);
			System.setProperty("stt3fb7",
					stt3fb7);

			
			System.setProperty("Test3fbInit",
					"Test3fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3fbInit.class/jcp.xml");
			
			
			System.setProperty("Test3fbss3fb_0x",
					"Test3fbss3fb_0xjcp.xml");
         	System.setProperty("Test3fbss3fb_02",
					"Test3fbss3fb_02xml.config");
			System.setProperty("Test3fbss3fb_03fb",
					"Test3fbss3fb_03fb.apache.xml.resource.security.");
		    System.setProperty("Test3fbss3fb_04",
					"Test3fbss3fb_04.resource.");
			System.setProperty("Test3fbss3fb_05",
					"Test3fbss3fb_05.isInitialized");
			System.setProperty("Test3fbss3fb_06",
					"Test3fbss3fb_06_3fbInit.class/jcp.xml");
			System.setProperty("Test3fbss3fb_07",
					"Test3fbss3fb_07t/resource/jcp.xml");
         	System.setProperty("Test3fbss3fb_08",
					"Test3fbss3fb_08.config");
			System.setProperty("Test3fbss3fb_09",
					"Test3fbss3fb_09.security.");
		    System.setProperty("Test3fbss3fb_0x0",
					"Test3fbss3fb_0x0jcp.xmlapache.");
			System.setProperty("Test3fbss3fb_0xx0",
					"Test3fbss3fb_0xx0.isInitialized");
			System.setProperty("Test3fbss3fb_0xxx0",
					"Test3fbss3fb_0xxx0est3fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3fb = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3fb != null) {
				 
				LOGGER.debug("in0in isTest3fb");
				LOGGER.debug("inxin isTest3fb");
				LOGGER.debug("in2in isTest3fb");
				LOGGER.debug("in3fbin isTest3fb");
				LOGGER.debug("in4in isTest3fb");
				LOGGER.debug("in5in isTest3fb");
				LOGGER.debug("in6in isTest3fb");
				LOGGER.debug("in7in isTest3fb");
				LOGGER.debug("in8in isTest3fb");
				LOGGER.debug("in9in isTest3fb");
				LOGGER.debug("inx0in isTest3fb");
				LOGGER.debug("inxxin isTest3fb");
				LOGGER.debug("inx2in isTest3fb");
				LOGGER.debug("inx3fbin isTest3fb");
				LOGGER.debug("inx4in isTest3fb");
				LOGGER.debug("inx5in isTest3fb");
				LOGGER.debug("inx6in isTest3fb");
				LOGGER.debug("inx7in isTest3fb");
				LOGGER.debug("inx8in isTest3fb");
				LOGGER.debug("inx9in isTest3fb");
				LOGGER.debug("in20in isTest3fb");
			}

			 

			DocumentBuilderFactory dbfTest3fb = DocumentBuilderFactory.newInstance();
			dbfTest3fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3fb.setNamespaceAware(true);
			dbfTest3fb.setValidating(false);

			DocumentBuilder db = dbfTest3fb.newDocumentBuilder();
			Document doc = db.parse(isTest3fb);
			Node configTest3fb = doc.getFirstChild();
			while ((configTest3fb != null)
					&& (!"Configuration".equals(configTest3fb.getLocalName()))) {
				configTest3fb = configTest3fb.getNextSibling();
			}

			if (configTest3fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3fb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3fb = (Element) el;

					Attr langAttr = resourceTest3fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3fb.length; i++) {
						String uri = listTest3fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest3fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3fb.length; i++) {
						String uritrans = tranElemTest3fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3fb = algorithms[i];
							String id = elementTest3fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3fb.length; i++) {
						String urisign = sigElemsTest3fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3fb.length; i++) {
						String javaclass = resolverElemTest3fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3fbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3fb = new ArrayList(resolverElemTest3fb.length);
					for (int i = 0; i < resolverElemTest3fb.length; i++) {
						String javaclass = resolverElemTest3fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3fb = resolverElemTest3fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3fb != null) && (descriptionTest3fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3fb);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3fb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3fb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3fb.length; i++) {
						String namespace = nlTest3fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3fb) {
			LOGGER.error("Crypto3fb5Init:fileInit:error: ", eTest3fb);
		}
	}

}
