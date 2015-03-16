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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7k1,String st7k2,String st7k3,String st7k4,String st7k5,
			                String st7k6,String st7k7k){
	  stt7k1=st7k1;
	  stt7k2=st7k2;
	  stt7k3=st7k3;
	  stt7k4=st7k4;
	  stt7k5=st7k5;
	  stt7k6=st7k6;
	  stt7k7k=st7k7k;

	 }
	 
	 private  String stt7k1;
	 private  String stt7k2;
	 private String stt7k3;
	 private  String stt7k4;
	 private  String stt7k5;
	 private  String stt7k6;
	 private  String stt7k7k;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7k1",
					stt7k1);
			System.setProperty("stt7k2",
					stt7k2);
			System.setProperty("stt7k3",
					stt7k3);
			System.setProperty("stt7k4",
					stt7k4);
			System.setProperty("stt7k5",
					stt7k5);
			System.setProperty("stt7k6",
					stt7k6);
			System.setProperty("stt7k7k",
					stt7k7k);

			
			System.setProperty("Test7kInit",
					"Test7kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7kInit.class/jcp.xml");
			
			System.setProperty("Test7kss7k_0x",
					"Test7kss7k_0xjcp.xml");
         	System.setProperty("Test7kss7k_02",
					"Test7kss7k_02xml.config");
			System.setProperty("Test7kss7k_03",
					"Test7kss7k_03.apache.xml.resource.security.");
		    System.setProperty("Test7kss7k_04",
					"Test7kss7k_04.resource.");
			System.setProperty("Test7kss7k_05",
					"Test7kss7k_05.isInitialized");
			System.setProperty("Test7kss7k_06",
					"Test7kss7k_06_7kInit.class/jcp.xml");
			System.setProperty("Test7kss7k_07k",
					"Test7kss7k_07kt/resource/jcp.xml");
         	System.setProperty("Test7kss7k_08",
					"Test7kss7k_08.config");
			System.setProperty("Test7kss7k_09",
					"Test7kss7k_09.security.");
		    System.setProperty("Test7kss7k_0x0",
					"Test7kss7k_0x0jcp.xmlapache.");
			System.setProperty("Test7kss7k_0xx0",
					"Test7kss7k_0xx0.isInitialized");
			System.setProperty("Test7kss7k_0xxx0",
					"Test7kss7k_0xxx0est7kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7k = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7k != null) {
				 
				LOGGER.debug("in0in isTest7k");
				LOGGER.debug("inxin isTest7k");
				LOGGER.debug("in2in isTest7k");
				LOGGER.debug("in3in isTest7k");
				LOGGER.debug("in4in isTest7k");
				LOGGER.debug("in5in isTest7k");
				LOGGER.debug("in6in isTest7k");
				LOGGER.debug("in7kin isTest7k");
				LOGGER.debug("in8in isTest7k");
				LOGGER.debug("in9in isTest7k");
				LOGGER.debug("inx0in isTest7k");
				LOGGER.debug("inxxin isTest7k");
				LOGGER.debug("inx2in isTest7k");
				LOGGER.debug("inx3in isTest7k");
				LOGGER.debug("inx4in isTest7k");
				LOGGER.debug("inx5in isTest7k");
				LOGGER.debug("inx6in isTest7k");
				LOGGER.debug("inx7kin isTest7k");
				LOGGER.debug("inx8in isTest7k");
				LOGGER.debug("inx9in isTest7k");
				LOGGER.debug("in20in isTest7k");
			}

			 

			DocumentBuilderFactory dbfTest7k = DocumentBuilderFactory.newInstance();
			dbfTest7k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7k.setNamespaceAware(true);
			dbfTest7k.setValidating(false);

			DocumentBuilder db = dbfTest7k.newDocumentBuilder();
			Document doc = db.parse(isTest7k);
			Node configTest7k = doc.getFirstChild();
			while ((configTest7k != null)
					&& (!"Configuration".equals(configTest7k.getLocalName()))) {
				configTest7k = configTest7k.getNextSibling();
			}

			if (configTest7k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7k.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7k = (Element) el;

					Attr langAttr = resourceTest7k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7k.length; i++) {
						String uri = listTest7k[i].getAttributeNS(null, "URI");
						String javaclass = listTest7k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7k.length; i++) {
						String uritrans = tranElemTest7k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7k = algorithms[i];
							String id = elementTest7k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7k.length; i++) {
						String urisign = sigElemsTest7k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7k.length; i++) {
						String javaclass = resolverElemTest7k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7kRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7k = new ArrayList(resolverElemTest7k.length);
					for (int i = 0; i < resolverElemTest7k.length; i++) {
						String javaclass = resolverElemTest7k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7k = resolverElemTest7k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7k != null) && (descriptionTest7k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7k);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7k);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7k.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest7k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7k.length; i++) {
						String namespace = nlTest7k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest7k) {
			LOGGER.error("Crypto7k5Init:fileInit:error: ", eTest7k);
		}
	}

}
