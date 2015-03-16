package ru.spb.iac.crypto.init.audit;

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
	 
	 
	 public CryptoOrgInit(String st10i010i0,String st10i02,String st10i03,String st10i04,String st10i05,
			                String st10i06,String st10i07){
	  stt10i010i0=st10i010i0;
	  stt10i02=st10i02;
	  stt10i03=st10i03;
	  stt10i04=st10i04;
	  stt10i05=st10i05;
	  stt10i06=st10i06;
	  stt10i07=st10i07;

	 }
	 
	 private  String stt10i010i0;
	 private  String stt10i02;
	 private String stt10i03;
	 private  String stt10i04;
	 private  String stt10i05;
	 private  String stt10i06;
	 private  String stt10i07;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoOrgInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt10i010i0",
					stt10i010i0);
			System.setProperty("stt10i02",
					stt10i02);
			System.setProperty("stt10i03",
					stt10i03);
			System.setProperty("stt10i04",
					stt10i04);
			System.setProperty("stt10i05",
					stt10i05);
			System.setProperty("stt10i06",
					stt10i06);
			System.setProperty("stt10i07",
					stt10i07);

			
			System.setProperty("Test10i0Init",
					"Test10i0Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto10i05Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest10i0Init.class/jcp.xml");
			
			
			System.setProperty("Test10i0ss10i0_0x",
					"Test10i0ss10i0_0xjcp.xml");
         	System.setProperty("Test10i0ss10i0_02",
					"Test10i0ss10i0_02xml.config");
			System.setProperty("Test10i0ss10i0_03",
					"Test10i0ss10i0_03.apache.xml.resource.security.");
		    System.setProperty("Test10i0ss10i0_04",
					"Test10i0ss10i0_04.resource.");
			System.setProperty("Test10i0ss10i0_05",
					"Test10i0ss10i0_05.isInitialized");
			System.setProperty("Test10i0ss10i0_06",
					"Test10i0ss10i0_06_10i0Init.class/jcp.xml");
			System.setProperty("Test10i0ss10i0_07",
					"Test10i0ss10i0_07t/resource/jcp.xml");
         	System.setProperty("Test10i0ss10i0_08",
					"Test10i0ss10i0_08.config");
			System.setProperty("Test10i0ss10i0_09",
					"Test10i0ss10i0_09.security.");
		    System.setProperty("Test10i0ss10i0_0x0",
					"Test10i0ss10i0_0x0jcp.xmlapache.");
			System.setProperty("Test10i0ss10i0_0xx0",
					"Test10i0ss10i0_0xx0.isInitialized");
			System.setProperty("Test10i0ss10i0_0xxx0",
					"Test10i0ss10i0_0xxx0est10i0Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto10i05Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest10i0 = CryptoOrgInit.class.getResourceAsStream("/jcp.xml");

			if (isTest10i0 != null) {
				 
				LOGGER.debug("in0in isTest10i0");
				LOGGER.debug("in10iin isTest10i0");
				LOGGER.debug("in2in isTest10i0");
				LOGGER.debug("in3in isTest10i0");
				LOGGER.debug("in4in isTest10i0");
				LOGGER.debug("in5in isTest10i0");
				LOGGER.debug("in6in isTest10i0");
				LOGGER.debug("in7in isTest10i0");
				LOGGER.debug("in8in isTest10i0");
				LOGGER.debug("in9in isTest10i0");
				LOGGER.debug("in10i0in isTest10i0");
				LOGGER.debug("in10i10iin isTest10i0");
				LOGGER.debug("in10i2in isTest10i0");
				LOGGER.debug("in10i3in isTest10i0");
				LOGGER.debug("in10i4in isTest10i0");
				LOGGER.debug("in10i5in isTest10i0");
				LOGGER.debug("in10i6in isTest10i0");
				LOGGER.debug("in10i7in isTest10i0");
				LOGGER.debug("in10i8in isTest10i0");
				LOGGER.debug("in10i9in isTest10i0");
				LOGGER.debug("in20in isTest10i0");
			}

			 

			DocumentBuilderFactory dbfTest10i0 = DocumentBuilderFactory.newInstance();
			dbfTest10i0.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest10i0.setNamespaceAware(true);
			dbfTest10i0.setValidating(false);

			DocumentBuilder db = dbfTest10i0.newDocumentBuilder();
			Document doc = db.parse(isTest10i0);
			Node configTest10i0 = doc.getFirstChild();
			while ((configTest10i0 != null)
					&& (!"Configuration".equals(configTest10i0.getLocalName()))) {
				configTest10i0 = configTest10i0.getNextSibling();
			}

			if (configTest10i0 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest10i0.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest10i0 = (Element) el;

					Attr langAttr = resourceTest10i0
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest10i0
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest10i0 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest10i0);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest10i0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest10i0.length; i++) {
						String uri = listTest10i0[i].getAttributeNS(null, "URI");
						String javaclass = listTest10i0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest10i0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest10i0.length; i++) {
						String uritrans = tranElemTest10i0[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest10i0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest10i0 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest10i0 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest10i0.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest10i0 = algorithms[i];
							String id = elementTest10i0.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest10i0));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest10i0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest10i0.length; i++) {
						String urisign = sigElemsTest10i0[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest10i0[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest10i0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest10i0.length; i++) {
						String javaclass = resolverElemTest10i0[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest10i0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("0:Test10i0Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("Test10i0Register Resolver:10i: " + javaclass
										+ ": " + description);
							

						} 
                     if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test10i0Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test10i0Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest10i0 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest10i0 = new ArrayList(resolverElemTest10i0.length);
					for (int i = 0; i < resolverElemTest10i0.length; i++) {
						String javaclass = resolverElemTest10i0[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest10i0 = resolverElemTest10i0[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest10i0 != null) && (descriptionTest10i0.length() > 0)) {
							
								LOGGER.debug("0-Register Resolver: " + javaclass
										+ ": " + descriptionTest10i0);
								LOGGER.debug("Register Resolver-10i: " + javaclass
										+ ": " + descriptionTest10i0);
							
						

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest10i0.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest10i0);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest10i0 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest10i0.length; i++) {
						String namespace = nlTest10i0[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest10i0[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest10i0) {
			LOGGER.error("Crypto10i05Init:fileInit:error: ", eTest10i0);
		}
	}

}
