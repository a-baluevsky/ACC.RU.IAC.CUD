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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7h1,String st7h2,String st7h3,String st7h4,String st7h5,
			                String st7h6,String st7h7h){
	  stt7h1=st7h1;
	  stt7h2=st7h2;
	  stt7h3=st7h3;
	  stt7h4=st7h4;
	  stt7h5=st7h5;
	  stt7h6=st7h6;
	  stt7h7h=st7h7h;

	 }
	 
	 private  String stt7h1;
	 private  String stt7h2;
	 private String stt7h3;
	 private  String stt7h4;
	 private  String stt7h5;
	 private  String stt7h6;
	 private  String stt7h7h;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7h1",
					stt7h1);
			System.setProperty("stt7h2",
					stt7h2);
			System.setProperty("stt7h3",
					stt7h3);
			System.setProperty("stt7h4",
					stt7h4);
			System.setProperty("stt7h5",
					stt7h5);
			System.setProperty("stt7h6",
					stt7h6);
			System.setProperty("stt7h7h",
					stt7h7h);

			
			System.setProperty("Test7hInit",
					"Test7hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7hInit.class/jcp.xml");
			
			System.setProperty("Test7hss7h_0x",
					"Test7hss7h_0xjcp.xml");
         	System.setProperty("Test7hss7h_02",
					"Test7hss7h_02xml.config");
			System.setProperty("Test7hss7h_03",
					"Test7hss7h_03.apache.xml.resource.security.");
		    System.setProperty("Test7hss7h_04",
					"Test7hss7h_04.resource.");
			System.setProperty("Test7hss7h_05",
					"Test7hss7h_05.isInitialized");
			System.setProperty("Test7hss7h_06",
					"Test7hss7h_06_7hInit.class/jcp.xml");
			System.setProperty("Test7hss7h_07h",
					"Test7hss7h_07ht/resource/jcp.xml");
         	System.setProperty("Test7hss7h_08",
					"Test7hss7h_08.config");
			System.setProperty("Test7hss7h_09",
					"Test7hss7h_09.security.");
		    System.setProperty("Test7hss7h_0x0",
					"Test7hss7h_0x0jcp.xmlapache.");
			System.setProperty("Test7hss7h_0xx0",
					"Test7hss7h_0xx0.isInitialized");
			System.setProperty("Test7hss7h_0xxx0",
					"Test7hss7h_0xxx0est7hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7h = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7h != null) {
				 
				LOGGER.debug("in0in isTest7h");
				LOGGER.debug("inxin isTest7h");
				LOGGER.debug("in2in isTest7h");
				LOGGER.debug("in3in isTest7h");
				LOGGER.debug("in4in isTest7h");
				LOGGER.debug("in5in isTest7h");
				LOGGER.debug("in6in isTest7h");
				LOGGER.debug("in7hin isTest7h");
				LOGGER.debug("in8in isTest7h");
				LOGGER.debug("in9in isTest7h");
				LOGGER.debug("inx0in isTest7h");
				LOGGER.debug("inxxin isTest7h");
				LOGGER.debug("inx2in isTest7h");
				LOGGER.debug("inx3in isTest7h");
				LOGGER.debug("inx4in isTest7h");
				LOGGER.debug("inx5in isTest7h");
				LOGGER.debug("inx6in isTest7h");
				LOGGER.debug("inx7hin isTest7h");
				LOGGER.debug("inx8in isTest7h");
				LOGGER.debug("inx9in isTest7h");
				LOGGER.debug("in20in isTest7h");
			}

			 

			DocumentBuilderFactory dbfTest7h = DocumentBuilderFactory.newInstance();
			dbfTest7h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7h.setNamespaceAware(true);
			dbfTest7h.setValidating(false);

			DocumentBuilder db = dbfTest7h.newDocumentBuilder();
			Document doc = db.parse(isTest7h);
			Node configTest7h = doc.getFirstChild();
			while ((configTest7h != null)
					&& (!"Configuration".equals(configTest7h.getLocalName()))) {
				configTest7h = configTest7h.getNextSibling();
			}

			if (configTest7h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7h = (Element) el;

					Attr langAttr = resourceTest7h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7h.length; i++) {
						String uri = listTest7h[i].getAttributeNS(null, "URI");
						String javaclass = listTest7h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7h.length; i++) {
						String uritrans = tranElemTest7h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7h = algorithms[i];
							String id = elementTest7h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7h.length; i++) {
						String urisign = sigElemsTest7h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7h.length; i++) {
						String javaclass = resolverElemTest7h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7hRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7h = new ArrayList(resolverElemTest7h.length);
					for (int i = 0; i < resolverElemTest7h.length; i++) {
						String javaclass = resolverElemTest7h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7h = resolverElemTest7h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7h != null) && (descriptionTest7h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7h);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7h);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest7h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7h.length; i++) {
						String namespace = nlTest7h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest7h) {
			LOGGER.error("Crypto7h5Init:fileInit:error: ", eTest7h);
		}
	}

}
