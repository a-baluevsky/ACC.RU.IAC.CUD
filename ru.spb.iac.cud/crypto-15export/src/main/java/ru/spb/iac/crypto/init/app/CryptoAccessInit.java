package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoAccessInit(String st1p1p,String st1p2,String st1p3,String st1p4,String st1p5,
			                String st1p6,String st1p7){
	  stt1p1p=st1p1p;
	  stt1p2=st1p2;
	  stt1p3=st1p3;
	  stt1p4=st1p4;
	  stt1p5=st1p5;
	  stt1p6=st1p6;
	  stt1p7=st1p7;

	 }
	 
	 private  String stt1p1p;
	 private  String stt1p2;
	 private String stt1p3;
	 private  String stt1p4;
	 private  String stt1p5;
	 private  String stt1p6;
	 private  String stt1p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1p1p",
					stt1p1p);
			System.setProperty("stt1p2",
					stt1p2);
			System.setProperty("stt1p3",
					stt1p3);
			System.setProperty("stt1p4",
					stt1p4);
			System.setProperty("stt1p5",
					stt1p5);
			System.setProperty("stt1p6",
					stt1p6);
			System.setProperty("stt1p7",
					stt1p7);

			
			System.setProperty("Test1pInit",
					"Test1pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1pInit.class/jcp.xml");
			
			System.setProperty("Test1pss1p_0x",
					"Test1pss1p_0xjcp.xml");
         	System.setProperty("Test1pss1p_02",
					"Test1pss1p_02xml.config");
			System.setProperty("Test1pss1p_03",
					"Test1pss1p_03.apache.xml.resource.security.");
		    System.setProperty("Test1pss1p_04",
					"Test1pss1p_04.resource.");
			System.setProperty("Test1pss1p_05",
					"Test1pss1p_05.isInitialized");
			System.setProperty("Test1pss1p_06",
					"Test1pss1p_06_1pInit.class/jcp.xml");
			System.setProperty("Test1pss1p_07",
					"Test1pss1p_07t/resource/jcp.xml");
         	System.setProperty("Test1pss1p_08",
					"Test1pss1p_08.config");
			System.setProperty("Test1pss1p_09",
					"Test1pss1p_09.security.");
		    System.setProperty("Test1pss1p_0x0",
					"Test1pss1p_0x0jcp.xmlapache.");
			System.setProperty("Test1pss1p_0xx0",
					"Test1pss1p_0xx0.isInitialized");
			System.setProperty("Test1pss1p_0xxx0",
					"Test1pss1p_0xxx0est1pInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1p = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1p != null) {
				 
				LOGGER.debug("in0in isTest1p");
				LOGGER.debug("in1pin isTest1p");
				LOGGER.debug("in2in isTest1p");
				LOGGER.debug("in3in isTest1p");
				LOGGER.debug("in4in isTest1p");
				LOGGER.debug("in5in isTest1p");
				LOGGER.debug("in6in isTest1p");
				LOGGER.debug("in7in isTest1p");
				LOGGER.debug("in8in isTest1p");
				LOGGER.debug("in9in isTest1p");
				LOGGER.debug("in1p0in isTest1p");
				LOGGER.debug("in1p1pin isTest1p");
				LOGGER.debug("in1p2in isTest1p");
				LOGGER.debug("in1p3in isTest1p");
				LOGGER.debug("in1p4in isTest1p");
				LOGGER.debug("in1p5in isTest1p");
				LOGGER.debug("in1p6in isTest1p");
				LOGGER.debug("in1p7in isTest1p");
				LOGGER.debug("in1p8in isTest1p");
				LOGGER.debug("in1p9in isTest1p");
				LOGGER.debug("in20in isTest1p");
			}

			 

			DocumentBuilderFactory dbfTest1p = DocumentBuilderFactory.newInstance();
			dbfTest1p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1p.setNamespaceAware(true);
			dbfTest1p.setValidating(false);

			DocumentBuilder db = dbfTest1p.newDocumentBuilder();
			Document doc = db.parse(isTest1p);
			Node configTest1p = doc.getFirstChild();
			while ((configTest1p != null)
					&& (!"Configuration".equals(configTest1p.getLocalName()))) {
				configTest1p = configTest1p.getNextSibling();
			}

			if (configTest1p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1p.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1p = (Element) el;

					Attr langAttr = resourceTest1p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1p.length; i++) {
						String uri = listTest1p[i].getAttributeNS(null, "URI");
						String javaclass = listTest1p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1p.length; i++) {
						String uritrans = tranElemTest1p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1p = algorithms[i];
							String id = elementTest1p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1p.length; i++) {
						String urisign = sigElemsTest1p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1p.length; i++) {
						String javaclass = resolverElemTest1p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1p-Test1pRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1p = new ArrayList(resolverElemTest1p.length);
					for (int i = 0; i < resolverElemTest1p.length; i++) {
						String javaclass = resolverElemTest1p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1p = resolverElemTest1p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1p != null) && (descriptionTest1p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1p);
								LOGGER.debug("Test1pRegister Resolver: " + javaclass
										+ ": " + descriptionTest1p);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1p.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1p.length; i++) {
						String namespace = nlTest1p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1p) {
			LOGGER.error("Crypto1p5Init:fileInit:error: ", eTest1p);
		}
	}

}
