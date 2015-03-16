package ru.spb.iac.crypto.init.subsys;

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
	 
	 
	 public CryptoContextAppInit(String st6k1,String st6k2,String st6k3,String st6k4,String st6k5,
			                String st6k6k,String st6k7){
	  stt6k1=st6k1;
	  stt6k2=st6k2;
	  stt6k3=st6k3;
	  stt6k4=st6k4;
	  stt6k5=st6k5;
	  stt6k6k=st6k6k;
	  stt6k7=st6k7;

	 }
	 
	 private  String stt6k1;
	 private  String stt6k2;
	 private String stt6k3;
	 private  String stt6k4;
	 private  String stt6k5;
	 private  String stt6k6k;
	 private  String stt6k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6k1",
					stt6k1);
			System.setProperty("stt6k2",
					stt6k2);
			System.setProperty("stt6k3",
					stt6k3);
			System.setProperty("stt6k4",
					stt6k4);
			System.setProperty("stt6k5",
					stt6k5);
			System.setProperty("stt6k6k",
					stt6k6k);
			System.setProperty("stt6k7",
					stt6k7);

			
			System.setProperty("Test6kInit",
					"Test6kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6kInit.class/jcp.xml");
			
			System.setProperty("Test6kss6k_0x",
					"Test6kss6k_0xjcp.xml");
         	System.setProperty("Test6kss6k_02",
					"Test6kss6k_02xml.config");
			System.setProperty("Test6kss6k_03",
					"Test6kss6k_03.apache.xml.resource.security.");
		    System.setProperty("Test6kss6k_04",
					"Test6kss6k_04.resource.");
			System.setProperty("Test6kss6k_05",
					"Test6kss6k_05.isInitialized");
			System.setProperty("Test6kss6k_06k",
					"Test6kss6k_06k_6kInit.class/jcp.xml");
			System.setProperty("Test6kss6k_07",
					"Test6kss6k_07t/resource/jcp.xml");
         	System.setProperty("Test6kss6k_08",
					"Test6kss6k_08.config");
			System.setProperty("Test6kss6k_09",
					"Test6kss6k_09.security.");
		    System.setProperty("Test6kss6k_0x0",
					"Test6kss6k_0x0jcp.xmlapache.");
			System.setProperty("Test6kss6k_0xx0",
					"Test6kss6k_0xx0.isInitialized");
			System.setProperty("Test6kss6k_0xxx0",
					"Test6kss6k_0xxx0est6kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6k = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6k != null) {
				 
				LOGGER.debug("in0in isTest6k");
				LOGGER.debug("inxin isTest6k");
				LOGGER.debug("in2in isTest6k");
				LOGGER.debug("in3in isTest6k");
				LOGGER.debug("in4in isTest6k");
				LOGGER.debug("in5in isTest6k");
				LOGGER.debug("in6kin isTest6k");
				LOGGER.debug("in7in isTest6k");
				LOGGER.debug("in8in isTest6k");
				LOGGER.debug("in9in isTest6k");
				LOGGER.debug("inx0in isTest6k");
				LOGGER.debug("inxxin isTest6k");
				LOGGER.debug("inx2in isTest6k");
				LOGGER.debug("inx3in isTest6k");
				LOGGER.debug("inx4in isTest6k");
				LOGGER.debug("inx5in isTest6k");
				LOGGER.debug("inx6kin isTest6k");
				LOGGER.debug("inx7in isTest6k");
				LOGGER.debug("inx8in isTest6k");
				LOGGER.debug("inx9in isTest6k");
				LOGGER.debug("in20in isTest6k");
			}

			 

			DocumentBuilderFactory dbfTest6k = DocumentBuilderFactory.newInstance();
			dbfTest6k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6k.setNamespaceAware(true);
			dbfTest6k.setValidating(false);

			DocumentBuilder db = dbfTest6k.newDocumentBuilder();
			Document doc = db.parse(isTest6k);
			Node configTest6k = doc.getFirstChild();
			while ((configTest6k != null)
					&& (!"Configuration".equals(configTest6k.getLocalName()))) {
				configTest6k = configTest6k.getNextSibling();
			}

			if (configTest6k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6k.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6k = (Element) el;

					Attr langAttr = resourceTest6k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6k.length; i++) {
						String uri = listTest6k[i].getAttributeNS(null, "URI");
						String javaclass = listTest6k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6k.length; i++) {
						String uritrans = tranElemTest6k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6k = algorithms[i];
							String id = elementTest6k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6k.length; i++) {
						String urisign = sigElemsTest6k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6k.length; i++) {
						String javaclass = resolverElemTest6k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6kRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6kRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6k = new ArrayList(resolverElemTest6k.length);
					for (int i = 0; i < resolverElemTest6k.length; i++) {
						String javaclass = resolverElemTest6k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6k = resolverElemTest6k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6k != null) && (descriptionTest6k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6k);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6k);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6k.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6k.length; i++) {
						String namespace = nlTest6k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6k) {
			LOGGER.error("Crypto6k5Init:fileInit:error: ", eTest6k);
		}
	}

}
