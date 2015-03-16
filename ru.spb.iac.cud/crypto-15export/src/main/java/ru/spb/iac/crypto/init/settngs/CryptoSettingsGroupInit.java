package ru.spb.iac.crypto.init.settngs;

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
	 
	 
	 public CryptoSettingsGroupInit(String st3h1,String st3h2,String st3h3h,String st3h4,String st3h5,
			                String st3h6,String st3h7){
	  stt3h1=st3h1;
	  stt3h2=st3h2;
	  stt3h3h=st3h3h;
	  stt3h4=st3h4;
	  stt3h5=st3h5;
	  stt3h6=st3h6;
	  stt3h7=st3h7;

	 }
	 
	 private  String stt3h1;
	 private  String stt3h2;
	 private String stt3h3h;
	 private  String stt3h4;
	 private  String stt3h5;
	 private  String stt3h6;
	 private  String stt3h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3h1",
					stt3h1);
			System.setProperty("stt3h2",
					stt3h2);
			System.setProperty("stt3h3h",
					stt3h3h);
			System.setProperty("stt3h4",
					stt3h4);
			System.setProperty("stt3h5",
					stt3h5);
			System.setProperty("stt3h6",
					stt3h6);
			System.setProperty("stt3h7",
					stt3h7);

			
			System.setProperty("Test3hInit",
					"Test3hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3hInit.class/jcp.xml");
			
			
			System.setProperty("Test3hss3h_0x",
					"Test3hss3h_0xjcp.xml");
         	System.setProperty("Test3hss3h_02",
					"Test3hss3h_02xml.config");
			System.setProperty("Test3hss3h_03h",
					"Test3hss3h_03h.apache.xml.resource.security.");
		    System.setProperty("Test3hss3h_04",
					"Test3hss3h_04.resource.");
			System.setProperty("Test3hss3h_05",
					"Test3hss3h_05.isInitialized");
			System.setProperty("Test3hss3h_06",
					"Test3hss3h_06_3hInit.class/jcp.xml");
			System.setProperty("Test3hss3h_07",
					"Test3hss3h_07t/resource/jcp.xml");
         	System.setProperty("Test3hss3h_08",
					"Test3hss3h_08.config");
			System.setProperty("Test3hss3h_09",
					"Test3hss3h_09.security.");
		    System.setProperty("Test3hss3h_0x0",
					"Test3hss3h_0x0jcp.xmlapache.");
			System.setProperty("Test3hss3h_0xx0",
					"Test3hss3h_0xx0.isInitialized");
			System.setProperty("Test3hss3h_0xxx0",
					"Test3hss3h_0xxx0est3hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3h = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3h != null) {
				 
				LOGGER.debug("in0in isTest3h");
				LOGGER.debug("inxin isTest3h");
				LOGGER.debug("in2in isTest3h");
				LOGGER.debug("in3hin isTest3h");
				LOGGER.debug("in4in isTest3h");
				LOGGER.debug("in5in isTest3h");
				LOGGER.debug("in6in isTest3h");
				LOGGER.debug("in7in isTest3h");
				LOGGER.debug("in8in isTest3h");
				LOGGER.debug("in9in isTest3h");
				LOGGER.debug("inx0in isTest3h");
				LOGGER.debug("inxxin isTest3h");
				LOGGER.debug("inx2in isTest3h");
				LOGGER.debug("inx3hin isTest3h");
				LOGGER.debug("inx4in isTest3h");
				LOGGER.debug("inx5in isTest3h");
				LOGGER.debug("inx6in isTest3h");
				LOGGER.debug("inx7in isTest3h");
				LOGGER.debug("inx8in isTest3h");
				LOGGER.debug("inx9in isTest3h");
				LOGGER.debug("in20in isTest3h");
			}

			 

			DocumentBuilderFactory dbfTest3h = DocumentBuilderFactory.newInstance();
			dbfTest3h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3h.setNamespaceAware(true);
			dbfTest3h.setValidating(false);

			DocumentBuilder db = dbfTest3h.newDocumentBuilder();
			Document doc = db.parse(isTest3h);
			Node configTest3h = doc.getFirstChild();
			while ((configTest3h != null)
					&& (!"Configuration".equals(configTest3h.getLocalName()))) {
				configTest3h = configTest3h.getNextSibling();
			}

			if (configTest3h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3h = (Element) el;

					Attr langAttr = resourceTest3h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3h.length; i++) {
						String uri = listTest3h[i].getAttributeNS(null, "URI");
						String javaclass = listTest3h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3h.length; i++) {
						String uritrans = tranElemTest3h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3h = algorithms[i];
							String id = elementTest3h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3h.length; i++) {
						String urisign = sigElemsTest3h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3h.length; i++) {
						String javaclass = resolverElemTest3h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3hRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3h = new ArrayList(resolverElemTest3h.length);
					for (int i = 0; i < resolverElemTest3h.length; i++) {
						String javaclass = resolverElemTest3h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3h = resolverElemTest3h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3h != null) && (descriptionTest3h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3h);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3h);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3h.length; i++) {
						String namespace = nlTest3h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3h) {
			LOGGER.error("Crypto3h5Init:fileInit:error: ", eTest3h);
		}
	}

}
