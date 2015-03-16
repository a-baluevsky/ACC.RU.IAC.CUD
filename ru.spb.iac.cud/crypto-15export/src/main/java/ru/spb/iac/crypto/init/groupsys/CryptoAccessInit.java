package ru.spb.iac.crypto.init.groupsys;

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
	 
	 
	 public CryptoAccessInit(String st1m1m,String st1m2,String st1m3,String st1m4,String st1m5,
			                String st1m6,String st1m7){
	  stt1m1m=st1m1m;
	  stt1m2=st1m2;
	  stt1m3=st1m3;
	  stt1m4=st1m4;
	  stt1m5=st1m5;
	  stt1m6=st1m6;
	  stt1m7=st1m7;

	 }
	 
	 private  String stt1m1m;
	 private  String stt1m2;
	 private String stt1m3;
	 private  String stt1m4;
	 private  String stt1m5;
	 private  String stt1m6;
	 private  String stt1m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1m1m",
					stt1m1m);
			System.setProperty("stt1m2",
					stt1m2);
			System.setProperty("stt1m3",
					stt1m3);
			System.setProperty("stt1m4",
					stt1m4);
			System.setProperty("stt1m5",
					stt1m5);
			System.setProperty("stt1m6",
					stt1m6);
			System.setProperty("stt1m7",
					stt1m7);

			
			System.setProperty("Test1mInit",
					"Test1mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1mInit.class/jcp.xml");
			
			System.setProperty("Test1mss1m_0x",
					"Test1mss1m_0xjcp.xml");
         	System.setProperty("Test1mss1m_02",
					"Test1mss1m_02xml.config");
			System.setProperty("Test1mss1m_03",
					"Test1mss1m_03.apache.xml.resource.security.");
		    System.setProperty("Test1mss1m_04",
					"Test1mss1m_04.resource.");
			System.setProperty("Test1mss1m_05",
					"Test1mss1m_05.isInitialized");
			System.setProperty("Test1mss1m_06",
					"Test1mss1m_06_1mInit.class/jcp.xml");
			System.setProperty("Test1mss1m_07",
					"Test1mss1m_07t/resource/jcp.xml");
         	System.setProperty("Test1mss1m_08",
					"Test1mss1m_08.config");
			System.setProperty("Test1mss1m_09",
					"Test1mss1m_09.security.");
		    System.setProperty("Test1mss1m_0x0",
					"Test1mss1m_0x0jcp.xmlapache.");
			System.setProperty("Test1mss1m_0xx0",
					"Test1mss1m_0xx0.isInitialized");
			System.setProperty("Test1mss1m_0xxx0",
					"Test1mss1m_0xxx0est1mInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1m = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1m != null) {
				 
				LOGGER.debug("in0in isTest1m");
				LOGGER.debug("in1min isTest1m");
				LOGGER.debug("in2in isTest1m");
				LOGGER.debug("in3in isTest1m");
				LOGGER.debug("in4in isTest1m");
				LOGGER.debug("in5in isTest1m");
				LOGGER.debug("in6in isTest1m");
				LOGGER.debug("in7in isTest1m");
				LOGGER.debug("in8in isTest1m");
				LOGGER.debug("in9in isTest1m");
				LOGGER.debug("in1m0in isTest1m");
				LOGGER.debug("in1m1min isTest1m");
				LOGGER.debug("in1m2in isTest1m");
				LOGGER.debug("in1m3in isTest1m");
				LOGGER.debug("in1m4in isTest1m");
				LOGGER.debug("in1m5in isTest1m");
				LOGGER.debug("in1m6in isTest1m");
				LOGGER.debug("in1m7in isTest1m");
				LOGGER.debug("in1m8in isTest1m");
				LOGGER.debug("in1m9in isTest1m");
				LOGGER.debug("in20in isTest1m");
			}

			 

			DocumentBuilderFactory dbfTest1m = DocumentBuilderFactory.newInstance();
			dbfTest1m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1m.setNamespaceAware(true);
			dbfTest1m.setValidating(false);

			DocumentBuilder db = dbfTest1m.newDocumentBuilder();
			Document doc = db.parse(isTest1m);
			Node configTest1m = doc.getFirstChild();
			while ((configTest1m != null)
					&& (!"Configuration".equals(configTest1m.getLocalName()))) {
				configTest1m = configTest1m.getNextSibling();
			}

			if (configTest1m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1m.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1m = (Element) el;

					Attr langAttr = resourceTest1m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1m.length; i++) {
						String uri = listTest1m[i].getAttributeNS(null, "URI");
						String javaclass = listTest1m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1m.length; i++) {
						String uritrans = tranElemTest1m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1m = algorithms[i];
							String id = elementTest1m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1m.length; i++) {
						String urisign = sigElemsTest1m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1m.length; i++) {
						String javaclass = resolverElemTest1m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1m-Test1mRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1m = new ArrayList(resolverElemTest1m.length);
					for (int i = 0; i < resolverElemTest1m.length; i++) {
						String javaclass = resolverElemTest1m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1m = resolverElemTest1m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1m != null) && (descriptionTest1m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1m);
								LOGGER.debug("Test1mRegister Resolver: " + javaclass
										+ ": " + descriptionTest1m);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1m.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1m.length; i++) {
						String namespace = nlTest1m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1m) {
			LOGGER.error("Crypto1m5Init:fileInit:error: ", eTest1m);
		}
	}

}
