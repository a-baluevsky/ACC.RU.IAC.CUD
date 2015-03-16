package ru.spb.iac.crypto.init.report;

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
	 
	 
	 public CryptoAccessInit(String st1j1j,String st1j2,String st1j3,String st1j4,String st1j5,
			                String st1j6,String st1j7){
	  stt1j1j=st1j1j;
	  stt1j2=st1j2;
	  stt1j3=st1j3;
	  stt1j4=st1j4;
	  stt1j5=st1j5;
	  stt1j6=st1j6;
	  stt1j7=st1j7;

	 }
	 
	 private  String stt1j1j;
	 private  String stt1j2;
	 private String stt1j3;
	 private  String stt1j4;
	 private  String stt1j5;
	 private  String stt1j6;
	 private  String stt1j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1j1j",
					stt1j1j);
			System.setProperty("stt1j2",
					stt1j2);
			System.setProperty("stt1j3",
					stt1j3);
			System.setProperty("stt1j4",
					stt1j4);
			System.setProperty("stt1j5",
					stt1j5);
			System.setProperty("stt1j6",
					stt1j6);
			System.setProperty("stt1j7",
					stt1j7);

			
			System.setProperty("Test1jInit",
					"Test1jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1jInit.class/jcp.xml");
			
			System.setProperty("Test1jss1j_0x",
					"Test1jss1j_0xjcp.xml");
         	System.setProperty("Test1jss1j_02",
					"Test1jss1j_02xml.config");
			System.setProperty("Test1jss1j_03",
					"Test1jss1j_03.apache.xml.resource.security.");
		    System.setProperty("Test1jss1j_04",
					"Test1jss1j_04.resource.");
			System.setProperty("Test1jss1j_05",
					"Test1jss1j_05.isInitialized");
			System.setProperty("Test1jss1j_06",
					"Test1jss1j_06_1jInit.class/jcp.xml");
			System.setProperty("Test1jss1j_07",
					"Test1jss1j_07t/resource/jcp.xml");
         	System.setProperty("Test1jss1j_08",
					"Test1jss1j_08.config");
			System.setProperty("Test1jss1j_09",
					"Test1jss1j_09.security.");
		    System.setProperty("Test1jss1j_0x0",
					"Test1jss1j_0x0jcp.xmlapache.");
			System.setProperty("Test1jss1j_0xx0",
					"Test1jss1j_0xx0.isInitialized");
			System.setProperty("Test1jss1j_0xxx0",
					"Test1jss1j_0xxx0est1jInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1j = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1j != null) {
				 
				LOGGER.debug("in0in isTest1j");
				LOGGER.debug("in1jin isTest1j");
				LOGGER.debug("in2in isTest1j");
				LOGGER.debug("in3in isTest1j");
				LOGGER.debug("in4in isTest1j");
				LOGGER.debug("in5in isTest1j");
				LOGGER.debug("in6in isTest1j");
				LOGGER.debug("in7in isTest1j");
				LOGGER.debug("in8in isTest1j");
				LOGGER.debug("in9in isTest1j");
				LOGGER.debug("in1j0in isTest1j");
				LOGGER.debug("in1j1jin isTest1j");
				LOGGER.debug("in1j2in isTest1j");
				LOGGER.debug("in1j3in isTest1j");
				LOGGER.debug("in1j4in isTest1j");
				LOGGER.debug("in1j5in isTest1j");
				LOGGER.debug("in1j6in isTest1j");
				LOGGER.debug("in1j7in isTest1j");
				LOGGER.debug("in1j8in isTest1j");
				LOGGER.debug("in1j9in isTest1j");
				LOGGER.debug("in20in isTest1j");
			}

			 

			DocumentBuilderFactory dbfTest1j = DocumentBuilderFactory.newInstance();
			dbfTest1j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1j.setNamespaceAware(true);
			dbfTest1j.setValidating(false);

			DocumentBuilder db = dbfTest1j.newDocumentBuilder();
			Document doc = db.parse(isTest1j);
			Node configTest1j = doc.getFirstChild();
			while ((configTest1j != null)
					&& (!"Configuration".equals(configTest1j.getLocalName()))) {
				configTest1j = configTest1j.getNextSibling();
			}

			if (configTest1j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1j.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1j = (Element) el;

					Attr langAttr = resourceTest1j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1j.length; i++) {
						String uri = listTest1j[i].getAttributeNS(null, "URI");
						String javaclass = listTest1j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1j.length; i++) {
						String uritrans = tranElemTest1j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1j = algorithms[i];
							String id = elementTest1j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1j.length; i++) {
						String urisign = sigElemsTest1j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1j.length; i++) {
						String javaclass = resolverElemTest1j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1j-Test1jRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1j = new ArrayList(resolverElemTest1j.length);
					for (int i = 0; i < resolverElemTest1j.length; i++) {
						String javaclass = resolverElemTest1j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1j = resolverElemTest1j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1j != null) && (descriptionTest1j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1j);
								LOGGER.debug("Test1jRegister Resolver: " + javaclass
										+ ": " + descriptionTest1j);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1j.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1j.length; i++) {
						String namespace = nlTest1j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1j) {
			LOGGER.error("Crypto1j5Init:fileInit:error: ", eTest1j);
		}
	}

}
