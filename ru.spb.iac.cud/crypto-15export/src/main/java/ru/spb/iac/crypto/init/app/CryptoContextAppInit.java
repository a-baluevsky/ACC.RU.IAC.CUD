package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoContextAppInit(String st6p1,String st6p2,String st6p3,String st6p4,String st6p5,
			                String st6p6p,String st6p7){
	  stt6p1=st6p1;
	  stt6p2=st6p2;
	  stt6p3=st6p3;
	  stt6p4=st6p4;
	  stt6p5=st6p5;
	  stt6p6p=st6p6p;
	  stt6p7=st6p7;

	 }
	 
	 private  String stt6p1;
	 private  String stt6p2;
	 private String stt6p3;
	 private  String stt6p4;
	 private  String stt6p5;
	 private  String stt6p6p;
	 private  String stt6p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6p1",
					stt6p1);
			System.setProperty("stt6p2",
					stt6p2);
			System.setProperty("stt6p3",
					stt6p3);
			System.setProperty("stt6p4",
					stt6p4);
			System.setProperty("stt6p5",
					stt6p5);
			System.setProperty("stt6p6p",
					stt6p6p);
			System.setProperty("stt6p7",
					stt6p7);

			
			System.setProperty("Test6pInit",
					"Test6pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6pInit.class/jcp.xml");
			
			System.setProperty("Test6pss6p_0x",
					"Test6pss6p_0xjcp.xml");
         	System.setProperty("Test6pss6p_02",
					"Test6pss6p_02xml.config");
			System.setProperty("Test6pss6p_03",
					"Test6pss6p_03.apache.xml.resource.security.");
		    System.setProperty("Test6pss6p_04",
					"Test6pss6p_04.resource.");
			System.setProperty("Test6pss6p_05",
					"Test6pss6p_05.isInitialized");
			System.setProperty("Test6pss6p_06p",
					"Test6pss6p_06p_6pInit.class/jcp.xml");
			System.setProperty("Test6pss6p_07",
					"Test6pss6p_07t/resource/jcp.xml");
         	System.setProperty("Test6pss6p_08",
					"Test6pss6p_08.config");
			System.setProperty("Test6pss6p_09",
					"Test6pss6p_09.security.");
		    System.setProperty("Test6pss6p_0x0",
					"Test6pss6p_0x0jcp.xmlapache.");
			System.setProperty("Test6pss6p_0xx0",
					"Test6pss6p_0xx0.isInitialized");
			System.setProperty("Test6pss6p_0xxx0",
					"Test6pss6p_0xxx0est6pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6p = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6p != null) {
				 
				LOGGER.debug("in0in isTest6p");
				LOGGER.debug("inxin isTest6p");
				LOGGER.debug("in2in isTest6p");
				LOGGER.debug("in3in isTest6p");
				LOGGER.debug("in4in isTest6p");
				LOGGER.debug("in5in isTest6p");
				LOGGER.debug("in6pin isTest6p");
				LOGGER.debug("in7in isTest6p");
				LOGGER.debug("in8in isTest6p");
				LOGGER.debug("in9in isTest6p");
				LOGGER.debug("inx0in isTest6p");
				LOGGER.debug("inxxin isTest6p");
				LOGGER.debug("inx2in isTest6p");
				LOGGER.debug("inx3in isTest6p");
				LOGGER.debug("inx4in isTest6p");
				LOGGER.debug("inx5in isTest6p");
				LOGGER.debug("inx6pin isTest6p");
				LOGGER.debug("inx7in isTest6p");
				LOGGER.debug("inx8in isTest6p");
				LOGGER.debug("inx9in isTest6p");
				LOGGER.debug("in20in isTest6p");
			}

			 

			DocumentBuilderFactory dbfTest6p = DocumentBuilderFactory.newInstance();
			dbfTest6p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6p.setNamespaceAware(true);
			dbfTest6p.setValidating(false);

			DocumentBuilder db = dbfTest6p.newDocumentBuilder();
			Document doc = db.parse(isTest6p);
			Node configTest6p = doc.getFirstChild();
			while ((configTest6p != null)
					&& (!"Configuration".equals(configTest6p.getLocalName()))) {
				configTest6p = configTest6p.getNextSibling();
			}

			if (configTest6p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6p.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6p = (Element) el;

					Attr langAttr = resourceTest6p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6p.length; i++) {
						String uri = listTest6p[i].getAttributeNS(null, "URI");
						String javaclass = listTest6p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6p.length; i++) {
						String uritrans = tranElemTest6p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6p = algorithms[i];
							String id = elementTest6p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6p.length; i++) {
						String urisign = sigElemsTest6p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6p.length; i++) {
						String javaclass = resolverElemTest6p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6pRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6pRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6p = new ArrayList(resolverElemTest6p.length);
					for (int i = 0; i < resolverElemTest6p.length; i++) {
						String javaclass = resolverElemTest6p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6p = resolverElemTest6p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6p != null) && (descriptionTest6p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6p);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6p);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6p.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6p.length; i++) {
						String namespace = nlTest6p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6p) {
			LOGGER.error("Crypto6p5Init:fileInit:error: ", eTest6p);
		}
	}

}
