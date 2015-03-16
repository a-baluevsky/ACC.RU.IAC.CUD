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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8k1,String st8k2,String st8k3,String st8k4,String st8k5,
			                String st8k6,String st8k7){
	  stt8k1=st8k1;
	  stt8k2=st8k2;
	  stt8k3=st8k3;
	  stt8k4=st8k4;
	  stt8k5=st8k5;
	  stt8k6=st8k6;
	  stt8k7=st8k7;

	 }
	 
	 private  String stt8k1;
	 private  String stt8k2;
	 private String stt8k3;
	 private  String stt8k4;
	 private  String stt8k5;
	 private  String stt8k6;
	 private  String stt8k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8k1",
					stt8k1);
			System.setProperty("stt8k2",
					stt8k2);
			System.setProperty("stt8k3",
					stt8k3);
			System.setProperty("stt8k4",
					stt8k4);
			System.setProperty("stt8k5",
					stt8k5);
			System.setProperty("stt8k6",
					stt8k6);
			System.setProperty("stt8k7",
					stt8k7);

			
			System.setProperty("Test8kInit",
					"Test8kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8kInit.class/jcp.xml");
			
			System.setProperty("Test8kss8k_0x",
					"Test8kss8k_0xjcp.xml");
         	System.setProperty("Test8kss8k_02",
					"Test8kss8k_02xml.config");
			System.setProperty("Test8kss8k_03",
					"Test8kss8k_03.apache.xml.resource.security.");
		    System.setProperty("Test8kss8k_04",
					"Test8kss8k_04.resource.");
			System.setProperty("Test8kss8k_05",
					"Test8kss8k_05.isInitialized");
			System.setProperty("Test8kss8k_06",
					"Test8kss8k_06_8kInit.class/jcp.xml");
			System.setProperty("Test8kss8k_07",
					"Test8kss8k_07t/resource/jcp.xml");
         	System.setProperty("Test8kss8k_08k",
					"Test8kss8k_08k.config");
			System.setProperty("Test8kss8k_09",
					"Test8kss8k_09.security.");
		    System.setProperty("Test8kss8k_0x0",
					"Test8kss8k_0x0jcp.xmlapache.");
			System.setProperty("Test8kss8k_0xx0",
					"Test8kss8k_0xx0.isInitialized");
			System.setProperty("Test8kss8k_0xxx0",
					"Test8kss8k_0xxx0est8kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8k = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8k != null) {
				 
				LOGGER.debug("in0in isTest8k");
				LOGGER.debug("inxin isTest8k");
				LOGGER.debug("in2in isTest8k");
				LOGGER.debug("in3in isTest8k");
				LOGGER.debug("in4in isTest8k");
				LOGGER.debug("in5in isTest8k");
				LOGGER.debug("in6in isTest8k");
				LOGGER.debug("in7in isTest8k");
				LOGGER.debug("in8kin isTest8k");
				LOGGER.debug("in9in isTest8k");
				LOGGER.debug("inx0in isTest8k");
				LOGGER.debug("inxxin isTest8k");
				LOGGER.debug("inx2in isTest8k");
				LOGGER.debug("inx3in isTest8k");
				LOGGER.debug("inx4in isTest8k");
				LOGGER.debug("inx5in isTest8k");
				LOGGER.debug("inx6in isTest8k");
				LOGGER.debug("inx7in isTest8k");
				LOGGER.debug("inx8kin isTest8k");
				LOGGER.debug("inx9in isTest8k");
				LOGGER.debug("in20in isTest8k");
			}

			 

			DocumentBuilderFactory dbfTest8k = DocumentBuilderFactory.newInstance();
			dbfTest8k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8k.setNamespaceAware(true);
			dbfTest8k.setValidating(false);

			DocumentBuilder db = dbfTest8k.newDocumentBuilder();
			Document doc = db.parse(isTest8k);
			Node configTest8k = doc.getFirstChild();
			while ((configTest8k != null)
					&& (!"Configuration".equals(configTest8k.getLocalName()))) {
				configTest8k = configTest8k.getNextSibling();
			}

			if (configTest8k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8k.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8k = (Element) el;

					Attr langAttr = resourceTest8k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8k.length; i++) {
						String uri = listTest8k[i].getAttributeNS(null, "URI");
						String javaclass = listTest8k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8k.length; i++) {
						String uritrans = tranElemTest8k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8k = algorithms[i];
							String id = elementTest8k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8k.length; i++) {
						String urisign = sigElemsTest8k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8k.length; i++) {
						String javaclass = resolverElemTest8k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8kRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8k = new ArrayList(resolverElemTest8k.length);
					for (int i = 0; i < resolverElemTest8k.length; i++) {
						String javaclass = resolverElemTest8k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8k = resolverElemTest8k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8k != null) && (descriptionTest8k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8k);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8k);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8k.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8k.length; i++) {
						String namespace = nlTest8k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8k) {
			LOGGER.error("Crypto8k5Init:fileInit:error: ", eTest8k);
		}
	}

}
