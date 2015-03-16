package ru.spb.iac.crypto.init.arm;

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
	 
	 
	 public CryptoDataModelInit(String st7b1,String st7b2,String st7b3,String st7b4,String st7b5,
			                String st7b6,String st7b7b){
	  stt7b1=st7b1;
	  stt7b2=st7b2;
	  stt7b3=st7b3;
	  stt7b4=st7b4;
	  stt7b5=st7b5;
	  stt7b6=st7b6;
	  stt7b7b=st7b7b;

	 }
	 
	 private  String stt7b1;
	 private  String stt7b2;
	 private String stt7b3;
	 private  String stt7b4;
	 private  String stt7b5;
	 private  String stt7b6;
	 private  String stt7b7b;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7b1",
					stt7b1);
			System.setProperty("stt7b2",
					stt7b2);
			System.setProperty("stt7b3",
					stt7b3);
			System.setProperty("stt7b4",
					stt7b4);
			System.setProperty("stt7b5",
					stt7b5);
			System.setProperty("stt7b6",
					stt7b6);
			System.setProperty("stt7b7b",
					stt7b7b);

			
			System.setProperty("Test7bInit",
					"Test7bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7bInit.class/jcp.xml");
			
			System.setProperty("Test7bss7b_0x",
					"Test7bss7b_0xjcp.xml");
         	System.setProperty("Test7bss7b_02",
					"Test7bss7b_02xml.config");
			System.setProperty("Test7bss7b_03",
					"Test7bss7b_03.apache.xml.resource.security.");
		    System.setProperty("Test7bss7b_04",
					"Test7bss7b_04.resource.");
			System.setProperty("Test7bss7b_05",
					"Test7bss7b_05.isInitialized");
			System.setProperty("Test7bss7b_06",
					"Test7bss7b_06_7bInit.class/jcp.xml");
			System.setProperty("Test7bss7b_07b",
					"Test7bss7b_07bt/resource/jcp.xml");
         	System.setProperty("Test7bss7b_08",
					"Test7bss7b_08.config");
			System.setProperty("Test7bss7b_09",
					"Test7bss7b_09.security.");
		    System.setProperty("Test7bss7b_0x0",
					"Test7bss7b_0x0jcp.xmlapache.");
			System.setProperty("Test7bss7b_0xx0",
					"Test7bss7b_0xx0.isInitialized");
			System.setProperty("Test7bss7b_0xxx0",
					"Test7bss7b_0xxx0est7bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7b = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7b != null) {
				 
				LOGGER.debug("in0in isTest7b");
				LOGGER.debug("inxin isTest7b");
				LOGGER.debug("in2in isTest7b");
				LOGGER.debug("in3in isTest7b");
				LOGGER.debug("in4in isTest7b");
				LOGGER.debug("in5in isTest7b");
				LOGGER.debug("in6in isTest7b");
				LOGGER.debug("in7bin isTest7b");
				LOGGER.debug("in8in isTest7b");
				LOGGER.debug("in9in isTest7b");
				LOGGER.debug("inx0in isTest7b");
				LOGGER.debug("inxxin isTest7b");
				LOGGER.debug("inx2in isTest7b");
				LOGGER.debug("inx3in isTest7b");
				LOGGER.debug("inx4in isTest7b");
				LOGGER.debug("inx5in isTest7b");
				LOGGER.debug("inx6in isTest7b");
				LOGGER.debug("inx7bin isTest7b");
				LOGGER.debug("inx8in isTest7b");
				LOGGER.debug("inx9in isTest7b");
				LOGGER.debug("in20in isTest7b");
			}

			 

			DocumentBuilderFactory dbfTest7b = DocumentBuilderFactory.newInstance();
			dbfTest7b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7b.setNamespaceAware(true);
			dbfTest7b.setValidating(false);

			DocumentBuilder db = dbfTest7b.newDocumentBuilder();
			Document doc = db.parse(isTest7b);
			Node configTest7b = doc.getFirstChild();
			while ((configTest7b != null)
					&& (!"Configuration".equals(configTest7b.getLocalName()))) {
				configTest7b = configTest7b.getNextSibling();
			}

			if (configTest7b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7b.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7b = (Element) el;

					Attr langAttr = resourceTest7b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7b.length; i++) {
						String uri = listTest7b[i].getAttributeNS(null, "URI");
						String javaclass = listTest7b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7b.length; i++) {
						String uritrans = tranElemTest7b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7b = algorithms[i];
							String id = elementTest7b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7b.length; i++) {
						String urisign = sigElemsTest7b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7b.length; i++) {
						String javaclass = resolverElemTest7b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7bRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7b = new ArrayList(resolverElemTest7b.length);
					for (int i = 0; i < resolverElemTest7b.length; i++) {
						String javaclass = resolverElemTest7b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7b = resolverElemTest7b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7b != null) && (descriptionTest7b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7b);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7b);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7b.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest7b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7b.length; i++) {
						String namespace = nlTest7b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest7b) {
			LOGGER.error("Crypto7b5Init:fileInit:error: ", eTest7b);
		}
	}

}