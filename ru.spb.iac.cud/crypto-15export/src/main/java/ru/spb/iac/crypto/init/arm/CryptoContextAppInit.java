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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6b1,String st6b2,String st6b3,String st6b4,String st6b5,
			                String st6b6b,String st6b7){
	  stt6b1=st6b1;
	  stt6b2=st6b2;
	  stt6b3=st6b3;
	  stt6b4=st6b4;
	  stt6b5=st6b5;
	  stt6b6b=st6b6b;
	  stt6b7=st6b7;

	 }
	 
	 private  String stt6b1;
	 private  String stt6b2;
	 private String stt6b3;
	 private  String stt6b4;
	 private  String stt6b5;
	 private  String stt6b6b;
	 private  String stt6b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6b1",
					stt6b1);
			System.setProperty("stt6b2",
					stt6b2);
			System.setProperty("stt6b3",
					stt6b3);
			System.setProperty("stt6b4",
					stt6b4);
			System.setProperty("stt6b5",
					stt6b5);
			System.setProperty("stt6b6b",
					stt6b6b);
			System.setProperty("stt6b7",
					stt6b7);

			
			System.setProperty("Test6bInit",
					"Test6bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6bInit.class/jcp.xml");
			
			System.setProperty("Test6bss6b_0x",
					"Test6bss6b_0xjcp.xml");
         	System.setProperty("Test6bss6b_02",
					"Test6bss6b_02xml.config");
			System.setProperty("Test6bss6b_03",
					"Test6bss6b_03.apache.xml.resource.security.");
		    System.setProperty("Test6bss6b_04",
					"Test6bss6b_04.resource.");
			System.setProperty("Test6bss6b_05",
					"Test6bss6b_05.isInitialized");
			System.setProperty("Test6bss6b_06b",
					"Test6bss6b_06b_6bInit.class/jcp.xml");
			System.setProperty("Test6bss6b_07",
					"Test6bss6b_07t/resource/jcp.xml");
         	System.setProperty("Test6bss6b_08",
					"Test6bss6b_08.config");
			System.setProperty("Test6bss6b_09",
					"Test6bss6b_09.security.");
		    System.setProperty("Test6bss6b_0x0",
					"Test6bss6b_0x0jcp.xmlapache.");
			System.setProperty("Test6bss6b_0xx0",
					"Test6bss6b_0xx0.isInitialized");
			System.setProperty("Test6bss6b_0xxx0",
					"Test6bss6b_0xxx0est6bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6b = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6b != null) {
				 
				LOGGER.debug("in0in isTest6b");
				LOGGER.debug("inxin isTest6b");
				LOGGER.debug("in2in isTest6b");
				LOGGER.debug("in3in isTest6b");
				LOGGER.debug("in4in isTest6b");
				LOGGER.debug("in5in isTest6b");
				LOGGER.debug("in6bin isTest6b");
				LOGGER.debug("in7in isTest6b");
				LOGGER.debug("in8in isTest6b");
				LOGGER.debug("in9in isTest6b");
				LOGGER.debug("inx0in isTest6b");
				LOGGER.debug("inxxin isTest6b");
				LOGGER.debug("inx2in isTest6b");
				LOGGER.debug("inx3in isTest6b");
				LOGGER.debug("inx4in isTest6b");
				LOGGER.debug("inx5in isTest6b");
				LOGGER.debug("inx6bin isTest6b");
				LOGGER.debug("inx7in isTest6b");
				LOGGER.debug("inx8in isTest6b");
				LOGGER.debug("inx9in isTest6b");
				LOGGER.debug("in20in isTest6b");
			}

			 

			DocumentBuilderFactory dbfTest6b = DocumentBuilderFactory.newInstance();
			dbfTest6b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6b.setNamespaceAware(true);
			dbfTest6b.setValidating(false);

			DocumentBuilder db = dbfTest6b.newDocumentBuilder();
			Document doc = db.parse(isTest6b);
			Node configTest6b = doc.getFirstChild();
			while ((configTest6b != null)
					&& (!"Configuration".equals(configTest6b.getLocalName()))) {
				configTest6b = configTest6b.getNextSibling();
			}

			if (configTest6b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6b.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6b = (Element) el;

					Attr langAttr = resourceTest6b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6b.length; i++) {
						String uri = listTest6b[i].getAttributeNS(null, "URI");
						String javaclass = listTest6b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6b.length; i++) {
						String uritrans = tranElemTest6b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6b = algorithms[i];
							String id = elementTest6b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6b.length; i++) {
						String urisign = sigElemsTest6b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6b.length; i++) {
						String javaclass = resolverElemTest6b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6bRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6bRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6b = new ArrayList(resolverElemTest6b.length);
					for (int i = 0; i < resolverElemTest6b.length; i++) {
						String javaclass = resolverElemTest6b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6b = resolverElemTest6b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6b != null) && (descriptionTest6b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6b);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6b);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6b.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6b.length; i++) {
						String namespace = nlTest6b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6b) {
			LOGGER.error("Crypto6b5Init:fileInit:error: ", eTest6b);
		}
	}

}
