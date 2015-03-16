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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6h1,String st6h2,String st6h3,String st6h4,String st6h5,
			                String st6h6h,String st6h7){
	  stt6h1=st6h1;
	  stt6h2=st6h2;
	  stt6h3=st6h3;
	  stt6h4=st6h4;
	  stt6h5=st6h5;
	  stt6h6h=st6h6h;
	  stt6h7=st6h7;

	 }
	 
	 private  String stt6h1;
	 private  String stt6h2;
	 private String stt6h3;
	 private  String stt6h4;
	 private  String stt6h5;
	 private  String stt6h6h;
	 private  String stt6h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6h1",
					stt6h1);
			System.setProperty("stt6h2",
					stt6h2);
			System.setProperty("stt6h3",
					stt6h3);
			System.setProperty("stt6h4",
					stt6h4);
			System.setProperty("stt6h5",
					stt6h5);
			System.setProperty("stt6h6h",
					stt6h6h);
			System.setProperty("stt6h7",
					stt6h7);

			
			System.setProperty("Test6hInit",
					"Test6hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6hInit.class/jcp.xml");
			
			System.setProperty("Test6hss6h_0x",
					"Test6hss6h_0xjcp.xml");
         	System.setProperty("Test6hss6h_02",
					"Test6hss6h_02xml.config");
			System.setProperty("Test6hss6h_03",
					"Test6hss6h_03.apache.xml.resource.security.");
		    System.setProperty("Test6hss6h_04",
					"Test6hss6h_04.resource.");
			System.setProperty("Test6hss6h_05",
					"Test6hss6h_05.isInitialized");
			System.setProperty("Test6hss6h_06h",
					"Test6hss6h_06h_6hInit.class/jcp.xml");
			System.setProperty("Test6hss6h_07",
					"Test6hss6h_07t/resource/jcp.xml");
         	System.setProperty("Test6hss6h_08",
					"Test6hss6h_08.config");
			System.setProperty("Test6hss6h_09",
					"Test6hss6h_09.security.");
		    System.setProperty("Test6hss6h_0x0",
					"Test6hss6h_0x0jcp.xmlapache.");
			System.setProperty("Test6hss6h_0xx0",
					"Test6hss6h_0xx0.isInitialized");
			System.setProperty("Test6hss6h_0xxx0",
					"Test6hss6h_0xxx0est6hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6h = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6h != null) {
				 
				LOGGER.debug("in0in isTest6h");
				LOGGER.debug("inxin isTest6h");
				LOGGER.debug("in2in isTest6h");
				LOGGER.debug("in3in isTest6h");
				LOGGER.debug("in4in isTest6h");
				LOGGER.debug("in5in isTest6h");
				LOGGER.debug("in6hin isTest6h");
				LOGGER.debug("in7in isTest6h");
				LOGGER.debug("in8in isTest6h");
				LOGGER.debug("in9in isTest6h");
				LOGGER.debug("inx0in isTest6h");
				LOGGER.debug("inxxin isTest6h");
				LOGGER.debug("inx2in isTest6h");
				LOGGER.debug("inx3in isTest6h");
				LOGGER.debug("inx4in isTest6h");
				LOGGER.debug("inx5in isTest6h");
				LOGGER.debug("inx6hin isTest6h");
				LOGGER.debug("inx7in isTest6h");
				LOGGER.debug("inx8in isTest6h");
				LOGGER.debug("inx9in isTest6h");
				LOGGER.debug("in20in isTest6h");
			}

			 

			DocumentBuilderFactory dbfTest6h = DocumentBuilderFactory.newInstance();
			dbfTest6h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6h.setNamespaceAware(true);
			dbfTest6h.setValidating(false);

			DocumentBuilder db = dbfTest6h.newDocumentBuilder();
			Document doc = db.parse(isTest6h);
			Node configTest6h = doc.getFirstChild();
			while ((configTest6h != null)
					&& (!"Configuration".equals(configTest6h.getLocalName()))) {
				configTest6h = configTest6h.getNextSibling();
			}

			if (configTest6h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6h = (Element) el;

					Attr langAttr = resourceTest6h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6h.length; i++) {
						String uri = listTest6h[i].getAttributeNS(null, "URI");
						String javaclass = listTest6h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6h.length; i++) {
						String uritrans = tranElemTest6h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6h = algorithms[i];
							String id = elementTest6h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6h.length; i++) {
						String urisign = sigElemsTest6h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6h.length; i++) {
						String javaclass = resolverElemTest6h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6hRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6hRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6h = new ArrayList(resolverElemTest6h.length);
					for (int i = 0; i < resolverElemTest6h.length; i++) {
						String javaclass = resolverElemTest6h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6h = resolverElemTest6h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6h != null) && (descriptionTest6h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6h);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6h);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6h.length; i++) {
						String namespace = nlTest6h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6h) {
			LOGGER.error("Crypto6h5Init:fileInit:error: ", eTest6h);
		}
	}

}
