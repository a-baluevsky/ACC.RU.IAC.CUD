package ru.spb.iac.crypto.init.cpar;

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

 public class CryptoOrgInit {

	 
	 public CryptoOrgInit(){
	 }
	 
	 
	 public CryptoOrgInit(String st1cb01cb0,String st1cb02,String st1cb03,String st1cb04,String st1cb05,
			                String st1cb06,String st1cb07){
	  stt1cb01cb0=st1cb01cb0;
	  stt1cb02=st1cb02;
	  stt1cb03=st1cb03;
	  stt1cb04=st1cb04;
	  stt1cb05=st1cb05;
	  stt1cb06=st1cb06;
	  stt1cb07=st1cb07;

	 }
	 
	 private  String stt1cb01cb0;
	 private  String stt1cb02;
	 private String stt1cb03;
	 private  String stt1cb04;
	 private  String stt1cb05;
	 private  String stt1cb06;
	 private  String stt1cb07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1cb01cb0",
					stt1cb01cb0);
			System.setProperty("stt1cb02",
					stt1cb02);
			System.setProperty("stt1cb03",
					stt1cb03);
			System.setProperty("stt1cb04",
					stt1cb04);
			System.setProperty("stt1cb05",
					stt1cb05);
			System.setProperty("stt1cb06",
					stt1cb06);
			System.setProperty("stt1cb07",
					stt1cb07);

			
			System.setProperty("Test1cb0Init",
					"Test1cb0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1cb05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1cb0Init.class/jcp.xml");
			
			
			System.setProperty("Test1cb0ss1cb0_0x",
					"Test1cb0ss1cb0_0xjcp.xml");
         	System.setProperty("Test1cb0ss1cb0_02",
					"Test1cb0ss1cb0_02xml.config");
			System.setProperty("Test1cb0ss1cb0_03",
					"Test1cb0ss1cb0_03.apache.xml.resource.security.");
		    System.setProperty("Test1cb0ss1cb0_04",
					"Test1cb0ss1cb0_04.resource.");
			System.setProperty("Test1cb0ss1cb0_05",
					"Test1cb0ss1cb0_05.isInitialized");
			System.setProperty("Test1cb0ss1cb0_06",
					"Test1cb0ss1cb0_06_1cb0Init.class/jcp.xml");
			System.setProperty("Test1cb0ss1cb0_07",
					"Test1cb0ss1cb0_07t/resource/jcp.xml");
         	System.setProperty("Test1cb0ss1cb0_08",
					"Test1cb0ss1cb0_08.config");
			System.setProperty("Test1cb0ss1cb0_09",
					"Test1cb0ss1cb0_09.security.");
		    System.setProperty("Test1cb0ss1cb0_0x0",
					"Test1cb0ss1cb0_0x0jcp.xmlapache.");
			System.setProperty("Test1cb0ss1cb0_0xx0",
					"Test1cb0ss1cb0_0xx0.isInitialized");
			System.setProperty("Test1cb0ss1cb0_0xxx0",
					"Test1cb0ss1cb0_0xxx0est1cb0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1cb05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1cb0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1cb0 != null) {
				 
				LOGGER.debug("in0in isTest1cb0");
				LOGGER.debug("in1cbin isTest1cb0");
				LOGGER.debug("in2in isTest1cb0");
				LOGGER.debug("in3in isTest1cb0");
				LOGGER.debug("in4in isTest1cb0");
				LOGGER.debug("in5in isTest1cb0");
				LOGGER.debug("in6in isTest1cb0");
				LOGGER.debug("in7in isTest1cb0");
				LOGGER.debug("in8in isTest1cb0");
				LOGGER.debug("in9in isTest1cb0");
				LOGGER.debug("in1cb0in isTest1cb0");
				LOGGER.debug("in1cb1cbin isTest1cb0");
				LOGGER.debug("in1cb2in isTest1cb0");
				LOGGER.debug("in1cb3in isTest1cb0");
				LOGGER.debug("in1cb4in isTest1cb0");
				LOGGER.debug("in1cb5in isTest1cb0");
				LOGGER.debug("in1cb6in isTest1cb0");
				LOGGER.debug("in1cb7in isTest1cb0");
				LOGGER.debug("in1cb8in isTest1cb0");
				LOGGER.debug("in1cb9in isTest1cb0");
				LOGGER.debug("in20in isTest1cb0");
			}

			 

			DocumentBuilderFactory dbfTest1cb0 = DocumentBuilderFactory.newInstance();
			dbfTest1cb0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1cb0.setNamespaceAware(true);
			dbfTest1cb0.setValidating(false);

			DocumentBuilder db = dbfTest1cb0.newDocumentBuilder();
			Document doc = db.parse(isTest1cb0);
			Node configTest1cb0 = doc.getFirstChild();
			while ((configTest1cb0 != null)
					&& (!"Configuration".equals(configTest1cb0.getLocalName()))) {
				configTest1cb0 = configTest1cb0.getNextSibling();
			}

			if (configTest1cb0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1cb0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1cb0 = (Element) el;

					Attr langAttr = resourceTest1cb0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1cb0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1cb0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1cb0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1cb0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1cb0.length; i++) {
						String uri = listTest1cb0[i].getAttributeNS(null, "URI");
						String javaclass = listTest1cb0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1cb0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1cb0.length; i++) {
						String uritrans = tranElemTest1cb0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1cb0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1cb0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1cb0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1cb0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1cb0 = algorithms[i];
							String id = elementTest1cb0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1cb0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1cb0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1cb0.length; i++) {
						String urisign = sigElemsTest1cb0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1cb0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1cb0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1cb0.length; i++) {
						String javaclass = resolverElemTest1cb0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1cb0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test1cb0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test1cb0Register Resolver:1cb: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1cb0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1cb0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1cb0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1cb0 = new ArrayList(resolverElemTest1cb0.length);
					for (int i = 0; i < resolverElemTest1cb0.length; i++) {
						String javaclass = resolverElemTest1cb0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1cb0 = resolverElemTest1cb0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1cb0 != null) && (descriptionTest1cb0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest1cb0);
								LOGGER.debug("Register Resolver-1cb: " + javaclass
										+ ": " + descriptionTest1cb0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1cb0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1cb0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1cb0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1cb0.length; i++) {
						String namespace = nlTest1cb0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1cb0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1cb0) {
			LOGGER.error("Crypto1cb05Init:fileInit:error: ", eTest1cb0);
		}
	}

}
