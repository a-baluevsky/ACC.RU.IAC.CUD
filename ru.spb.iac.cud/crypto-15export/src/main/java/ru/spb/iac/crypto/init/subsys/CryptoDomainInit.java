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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9k1,String st9k2,String st9k3,String st9k4,String st9k5,
			                String st9k6,String st9k7){
	  stt9k1=st9k1;
	  stt9k2=st9k2;
	  stt9k3=st9k3;
	  stt9k4=st9k4;
	  stt9k5=st9k5;
	  stt9k6=st9k6;
	  stt9k7=st9k7;

	 }
	 
	 private  String stt9k1;
	 private  String stt9k2;
	 private String stt9k3;
	 private  String stt9k4;
	 private  String stt9k5;
	 private  String stt9k6;
	 private  String stt9k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9k1",
					stt9k1);
			System.setProperty("stt9k2",
					stt9k2);
			System.setProperty("stt9k3",
					stt9k3);
			System.setProperty("stt9k4",
					stt9k4);
			System.setProperty("stt9k5",
					stt9k5);
			System.setProperty("stt9k6",
					stt9k6);
			System.setProperty("stt9k7",
					stt9k7);

			
			System.setProperty("Test9kInit",
					"Test9kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9kInit.class/jcp.xml");
			
			
			System.setProperty("Test9kss9k_0x",
					"Test9kss9k_0xjcp.xml");
         	System.setProperty("Test9kss9k_02",
					"Test9kss9k_02xml.config");
			System.setProperty("Test9kss9k_03",
					"Test9kss9k_03.apache.xml.resource.security.");
		    System.setProperty("Test9kss9k_04",
					"Test9kss9k_04.resource.");
			System.setProperty("Test9kss9k_05",
					"Test9kss9k_05.isInitialized");
			System.setProperty("Test9kss9k_06",
					"Test9kss9k_06_9kInit.class/jcp.xml");
			System.setProperty("Test9kss9k_07",
					"Test9kss9k_07t/resource/jcp.xml");
         	System.setProperty("Test9kss9k_08",
					"Test9kss9k_08.config");
			System.setProperty("Test9kss9k_09k",
					"Test9kss9k_09k.security.");
		    System.setProperty("Test9kss9k_0x0",
					"Test9kss9k_0x0jcp.xmlapache.");
			System.setProperty("Test9kss9k_0xx0",
					"Test9kss9k_0xx0.isInitialized");
			System.setProperty("Test9kss9k_0xxx0",
					"Test9kss9k_0xxx0est9kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9k = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9k != null) {
				 
				LOGGER.debug("in0in isTest9k");
				LOGGER.debug("inxin isTest9k");
				LOGGER.debug("in2in isTest9k");
				LOGGER.debug("in3in isTest9k");
				LOGGER.debug("in4in isTest9k");
				LOGGER.debug("in5in isTest9k");
				LOGGER.debug("in6in isTest9k");
				LOGGER.debug("in7in isTest9k");
				LOGGER.debug("in8in isTest9k");
				LOGGER.debug("in9kin isTest9k");
				LOGGER.debug("inx0in isTest9k");
				LOGGER.debug("inxxin isTest9k");
				LOGGER.debug("inx2in isTest9k");
				LOGGER.debug("inx3in isTest9k");
				LOGGER.debug("inx4in isTest9k");
				LOGGER.debug("inx5in isTest9k");
				LOGGER.debug("inx6in isTest9k");
				LOGGER.debug("inx7in isTest9k");
				LOGGER.debug("inx8in isTest9k");
				LOGGER.debug("inx9kin isTest9k");
				LOGGER.debug("in20in isTest9k");
			}

			 

			DocumentBuilderFactory dbfTest9k = DocumentBuilderFactory.newInstance();
			dbfTest9k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9k.setNamespaceAware(true);
			dbfTest9k.setValidating(false);

			DocumentBuilder db = dbfTest9k.newDocumentBuilder();
			Document doc = db.parse(isTest9k);
			Node configTest9k = doc.getFirstChild();
			while ((configTest9k != null)
					&& (!"Configuration".equals(configTest9k.getLocalName()))) {
				configTest9k = configTest9k.getNextSibling();
			}

			if (configTest9k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9k.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9k = (Element) el;

					Attr langAttr = resourceTest9k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9k.length; i++) {
						String uri = listTest9k[i].getAttributeNS(null, "URI");
						String javaclass = listTest9k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9k.length; i++) {
						String uritrans = tranElemTest9k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9k = algorithms[i];
							String id = elementTest9k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9k.length; i++) {
						String urisign = sigElemsTest9k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9k.length; i++) {
						String javaclass = resolverElemTest9k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9kRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9k = new ArrayList(resolverElemTest9k.length);
					for (int i = 0; i < resolverElemTest9k.length; i++) {
						String javaclass = resolverElemTest9k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9k = resolverElemTest9k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9k != null) && (descriptionTest9k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9k);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9k);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9k.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9k.length; i++) {
						String namespace = nlTest9k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9k) {
			LOGGER.error("Crypto9k5Init:fileInit:error: ", eTest9k);
		}
	}

}