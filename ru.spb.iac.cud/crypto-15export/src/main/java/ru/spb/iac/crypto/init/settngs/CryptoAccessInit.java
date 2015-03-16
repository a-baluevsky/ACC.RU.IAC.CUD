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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1h1h,String st1h2,String st1h3,String st1h4,String st1h5,
			                String st1h6,String st1h7){
	  stt1h1h=st1h1h;
	  stt1h2=st1h2;
	  stt1h3=st1h3;
	  stt1h4=st1h4;
	  stt1h5=st1h5;
	  stt1h6=st1h6;
	  stt1h7=st1h7;

	 }
	 
	 private  String stt1h1h;
	 private  String stt1h2;
	 private String stt1h3;
	 private  String stt1h4;
	 private  String stt1h5;
	 private  String stt1h6;
	 private  String stt1h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1h1h",
					stt1h1h);
			System.setProperty("stt1h2",
					stt1h2);
			System.setProperty("stt1h3",
					stt1h3);
			System.setProperty("stt1h4",
					stt1h4);
			System.setProperty("stt1h5",
					stt1h5);
			System.setProperty("stt1h6",
					stt1h6);
			System.setProperty("stt1h7",
					stt1h7);

			
			System.setProperty("Test1hInit",
					"Test1hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1hInit.class/jcp.xml");
			
			System.setProperty("Test1hss1h_0x",
					"Test1hss1h_0xjcp.xml");
         	System.setProperty("Test1hss1h_02",
					"Test1hss1h_02xml.config");
			System.setProperty("Test1hss1h_03",
					"Test1hss1h_03.apache.xml.resource.security.");
		    System.setProperty("Test1hss1h_04",
					"Test1hss1h_04.resource.");
			System.setProperty("Test1hss1h_05",
					"Test1hss1h_05.isInitialized");
			System.setProperty("Test1hss1h_06",
					"Test1hss1h_06_1hInit.class/jcp.xml");
			System.setProperty("Test1hss1h_07",
					"Test1hss1h_07t/resource/jcp.xml");
         	System.setProperty("Test1hss1h_08",
					"Test1hss1h_08.config");
			System.setProperty("Test1hss1h_09",
					"Test1hss1h_09.security.");
		    System.setProperty("Test1hss1h_0x0",
					"Test1hss1h_0x0jcp.xmlapache.");
			System.setProperty("Test1hss1h_0xx0",
					"Test1hss1h_0xx0.isInitialized");
			System.setProperty("Test1hss1h_0xxx0",
					"Test1hss1h_0xxx0est1hInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1h = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1h != null) {
				 
				LOGGER.debug("in0in isTest1h");
				LOGGER.debug("in1hin isTest1h");
				LOGGER.debug("in2in isTest1h");
				LOGGER.debug("in3in isTest1h");
				LOGGER.debug("in4in isTest1h");
				LOGGER.debug("in5in isTest1h");
				LOGGER.debug("in6in isTest1h");
				LOGGER.debug("in7in isTest1h");
				LOGGER.debug("in8in isTest1h");
				LOGGER.debug("in9in isTest1h");
				LOGGER.debug("in1h0in isTest1h");
				LOGGER.debug("in1h1hin isTest1h");
				LOGGER.debug("in1h2in isTest1h");
				LOGGER.debug("in1h3in isTest1h");
				LOGGER.debug("in1h4in isTest1h");
				LOGGER.debug("in1h5in isTest1h");
				LOGGER.debug("in1h6in isTest1h");
				LOGGER.debug("in1h7in isTest1h");
				LOGGER.debug("in1h8in isTest1h");
				LOGGER.debug("in1h9in isTest1h");
				LOGGER.debug("in20in isTest1h");
			}

			 

			DocumentBuilderFactory dbfTest1h = DocumentBuilderFactory.newInstance();
			dbfTest1h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1h.setNamespaceAware(true);
			dbfTest1h.setValidating(false);

			DocumentBuilder db = dbfTest1h.newDocumentBuilder();
			Document doc = db.parse(isTest1h);
			Node configTest1h = doc.getFirstChild();
			while ((configTest1h != null)
					&& (!"Configuration".equals(configTest1h.getLocalName()))) {
				configTest1h = configTest1h.getNextSibling();
			}

			if (configTest1h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1h = (Element) el;

					Attr langAttr = resourceTest1h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1h.length; i++) {
						String uri = listTest1h[i].getAttributeNS(null, "URI");
						String javaclass = listTest1h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1h.length; i++) {
						String uritrans = tranElemTest1h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1h = algorithms[i];
							String id = elementTest1h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1h.length; i++) {
						String urisign = sigElemsTest1h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1h.length; i++) {
						String javaclass = resolverElemTest1h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1h-Test1hRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1h = new ArrayList(resolverElemTest1h.length);
					for (int i = 0; i < resolverElemTest1h.length; i++) {
						String javaclass = resolverElemTest1h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1h = resolverElemTest1h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1h != null) && (descriptionTest1h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1h);
								LOGGER.debug("Test1hRegister Resolver: " + javaclass
										+ ": " + descriptionTest1h);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1h.length; i++) {
						String namespace = nlTest1h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1h) {
			LOGGER.error("Crypto1h5Init:fileInit:error: ", eTest1h);
		}
	}

}
