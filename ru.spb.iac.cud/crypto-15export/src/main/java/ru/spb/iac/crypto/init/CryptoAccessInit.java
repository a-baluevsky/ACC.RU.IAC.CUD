package ru.spb.iac.crypto.init;

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
	 
	 
	 public CryptoAccessInit(String st11,String st12,String st13,String st14,String st15,
			                String st16,String st17){
	  stt11=st11;
	  stt12=st12;
	  stt13=st13;
	  stt14=st14;
	  stt15=st15;
	  stt16=st16;
	  stt17=st17;

	 }
	 
	 private  String stt11;
	 private  String stt12;
	 private String stt13;
	 private  String stt14;
	 private  String stt15;
	 private  String stt16;
	 private  String stt17;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt11",
					stt11);
			System.setProperty("stt12",
					stt12);
			System.setProperty("stt13",
					stt13);
			System.setProperty("stt14",
					stt14);
			System.setProperty("stt15",
					stt15);
			System.setProperty("stt16",
					stt16);
			System.setProperty("stt17",
					stt17);

			
			System.setProperty("Test1Init",
					"Test1Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto15Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoAccessInit.class/jcp.xml");
			
			System.setProperty("Test1ss1_0x",
					"Test1ss1_0xjcp.xml");
         	System.setProperty("Test1ss1_02",
					"Test1ss1_02xml.config");
			System.setProperty("Test1ss1_03",
					"Test1ss1_03.apache.xml.resource.security.");
		    System.setProperty("Test1ss1_04",
					"Test1ss1_04.resource.");
			System.setProperty("Test1ss1_05",
					"Test1ss1_05.isInitialized");
			System.setProperty("Test1ss1_06",
					"Test1ss1_06_1Init.class/jcp.xml");
			System.setProperty("Test1ss1_07",
					"Test1ss1_07t/resource/jcp.xml");
         	System.setProperty("Test1ss1_08",
					"Test1ss1_08.config");
			System.setProperty("Test1ss1_09",
					"Test1ss1_09.security.");
		    System.setProperty("Test1ss1_0x0",
					"Test1ss1_0x0jcp.xmlapache.");
			System.setProperty("Test1ss1_0xx0",
					"Test1ss1_0xx0.isInitialized");
			System.setProperty("Test1ss1_0xxx0",
					"Test1ss1_0xxx0est1Init.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto15Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1 = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1 != null) {
				 
				LOGGER.debug("in0in isTest1");
				LOGGER.debug("in1in isTest1");
				LOGGER.debug("in2in isTest1");
				LOGGER.debug("in3in isTest1");
				LOGGER.debug("in4in isTest1");
				LOGGER.debug("in5in isTest1");
				LOGGER.debug("in6in isTest1");
				LOGGER.debug("in7in isTest1");
				LOGGER.debug("in8in isTest1");
				LOGGER.debug("in9in isTest1");
				LOGGER.debug("in10in isTest1");
				LOGGER.debug("in11in isTest1");
				LOGGER.debug("in12in isTest1");
				LOGGER.debug("in13in isTest1");
				LOGGER.debug("in14in isTest1");
				LOGGER.debug("in15in isTest1");
				LOGGER.debug("in16in isTest1");
				LOGGER.debug("in17in isTest1");
				LOGGER.debug("in18in isTest1");
				LOGGER.debug("in19in isTest1");
				LOGGER.debug("in20in isTest1");
			}

			 

			DocumentBuilderFactory dbfTest1 = DocumentBuilderFactory.newInstance();
			dbfTest1.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1.setNamespaceAware(true);
			dbfTest1.setValidating(false);

			DocumentBuilder db = dbfTest1.newDocumentBuilder();
			Document doc = db.parse(isTest1);
			Node configTest1 = doc.getFirstChild();
			while ((configTest1 != null)
					&& (!"Configuration".equals(configTest1.getLocalName()))) {
				configTest1 = configTest1.getNextSibling();
			}

			if (configTest1 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1 = (Element) el;

					Attr langAttr = resourceTest1
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1.length; i++) {
						String uri = listTest1[i].getAttributeNS(null, "URI");
						String javaclass = listTest1[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1.length; i++) {
						String uritrans = tranElemTest1[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1 = algorithms[i];
							String id = elementTest1.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1.length; i++) {
						String urisign = sigElemsTest1[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1.length; i++) {
						String javaclass = resolverElemTest1[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1-Test1Register Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1 = new ArrayList(resolverElemTest1.length);
					for (int i = 0; i < resolverElemTest1.length; i++) {
						String javaclass = resolverElemTest1[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1 = resolverElemTest1[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1 != null) && (descriptionTest1.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1);
								LOGGER.debug("Test1Register Resolver: " + javaclass
										+ ": " + descriptionTest1);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1.length; i++) {
						String namespace = nlTest1[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1) {
			LOGGER.error("Crypto15Init:fileInit:error: ", eTest1);
		}
	}

}
