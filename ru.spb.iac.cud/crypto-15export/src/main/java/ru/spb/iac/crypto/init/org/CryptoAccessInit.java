package ru.spb.iac.crypto.init.org;

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
	 
	 
	 public CryptoAccessInit(String st1l1l,String st1l2,String st1l3,String st1l4,String st1l5,
			                String st1l6,String st1l7){
	  stt1l1l=st1l1l;
	  stt1l2=st1l2;
	  stt1l3=st1l3;
	  stt1l4=st1l4;
	  stt1l5=st1l5;
	  stt1l6=st1l6;
	  stt1l7=st1l7;

	 }
	 
	 private  String stt1l1l;
	 private  String stt1l2;
	 private String stt1l3;
	 private  String stt1l4;
	 private  String stt1l5;
	 private  String stt1l6;
	 private  String stt1l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1l1l",
					stt1l1l);
			System.setProperty("stt1l2",
					stt1l2);
			System.setProperty("stt1l3",
					stt1l3);
			System.setProperty("stt1l4",
					stt1l4);
			System.setProperty("stt1l5",
					stt1l5);
			System.setProperty("stt1l6",
					stt1l6);
			System.setProperty("stt1l7",
					stt1l7);

			
			System.setProperty("Test1lInit",
					"Test1lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1lInit.class/jcp.xml");
			
			System.setProperty("Test1lss1l_0x",
					"Test1lss1l_0xjcp.xml");
         	System.setProperty("Test1lss1l_02",
					"Test1lss1l_02xml.config");
			System.setProperty("Test1lss1l_03",
					"Test1lss1l_03.apache.xml.resource.security.");
		    System.setProperty("Test1lss1l_04",
					"Test1lss1l_04.resource.");
			System.setProperty("Test1lss1l_05",
					"Test1lss1l_05.isInitialized");
			System.setProperty("Test1lss1l_06",
					"Test1lss1l_06_1lInit.class/jcp.xml");
			System.setProperty("Test1lss1l_07",
					"Test1lss1l_07t/resource/jcp.xml");
         	System.setProperty("Test1lss1l_08",
					"Test1lss1l_08.config");
			System.setProperty("Test1lss1l_09",
					"Test1lss1l_09.security.");
		    System.setProperty("Test1lss1l_0x0",
					"Test1lss1l_0x0jcp.xmlapache.");
			System.setProperty("Test1lss1l_0xx0",
					"Test1lss1l_0xx0.isInitialized");
			System.setProperty("Test1lss1l_0xxx0",
					"Test1lss1l_0xxx0est1lInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1l = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1l != null) {
				 
				LOGGER.debug("in0in isTest1l");
				LOGGER.debug("in1lin isTest1l");
				LOGGER.debug("in2in isTest1l");
				LOGGER.debug("in3in isTest1l");
				LOGGER.debug("in4in isTest1l");
				LOGGER.debug("in5in isTest1l");
				LOGGER.debug("in6in isTest1l");
				LOGGER.debug("in7in isTest1l");
				LOGGER.debug("in8in isTest1l");
				LOGGER.debug("in9in isTest1l");
				LOGGER.debug("in1l0in isTest1l");
				LOGGER.debug("in1l1lin isTest1l");
				LOGGER.debug("in1l2in isTest1l");
				LOGGER.debug("in1l3in isTest1l");
				LOGGER.debug("in1l4in isTest1l");
				LOGGER.debug("in1l5in isTest1l");
				LOGGER.debug("in1l6in isTest1l");
				LOGGER.debug("in1l7in isTest1l");
				LOGGER.debug("in1l8in isTest1l");
				LOGGER.debug("in1l9in isTest1l");
				LOGGER.debug("in20in isTest1l");
			}

			 

			DocumentBuilderFactory dbfTest1l = DocumentBuilderFactory.newInstance();
			dbfTest1l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1l.setNamespaceAware(true);
			dbfTest1l.setValidating(false);

			DocumentBuilder db = dbfTest1l.newDocumentBuilder();
			Document doc = db.parse(isTest1l);
			Node configTest1l = doc.getFirstChild();
			while ((configTest1l != null)
					&& (!"Configuration".equals(configTest1l.getLocalName()))) {
				configTest1l = configTest1l.getNextSibling();
			}

			if (configTest1l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1l.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1l = (Element) el;

					Attr langAttr = resourceTest1l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1l.length; i++) {
						String uri = listTest1l[i].getAttributeNS(null, "URI");
						String javaclass = listTest1l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1l.length; i++) {
						String uritrans = tranElemTest1l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1l = algorithms[i];
							String id = elementTest1l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1l.length; i++) {
						String urisign = sigElemsTest1l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1l.length; i++) {
						String javaclass = resolverElemTest1l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1l-Test1lRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1l = new ArrayList(resolverElemTest1l.length);
					for (int i = 0; i < resolverElemTest1l.length; i++) {
						String javaclass = resolverElemTest1l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1l = resolverElemTest1l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1l != null) && (descriptionTest1l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1l);
								LOGGER.debug("Test1lRegister Resolver: " + javaclass
										+ ": " + descriptionTest1l);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1l.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1l.length; i++) {
						String namespace = nlTest1l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1l) {
			LOGGER.error("Crypto1l5Init:fileInit:error: ", eTest1l);
		}
	}

}