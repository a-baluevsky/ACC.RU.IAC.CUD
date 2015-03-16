package ru.spb.iac.crypto.init.classif;

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
	 
	 
	 public CryptoContextAppInit(String st6n1,String st6n2,String st6n3,String st6n4,String st6n5,
			                String st6n6n,String st6n7){
	  stt6n1=st6n1;
	  stt6n2=st6n2;
	  stt6n3=st6n3;
	  stt6n4=st6n4;
	  stt6n5=st6n5;
	  stt6n6n=st6n6n;
	  stt6n7=st6n7;

	 }
	 
	 private  String stt6n1;
	 private  String stt6n2;
	 private String stt6n3;
	 private  String stt6n4;
	 private  String stt6n5;
	 private  String stt6n6n;
	 private  String stt6n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6n1",
					stt6n1);
			System.setProperty("stt6n2",
					stt6n2);
			System.setProperty("stt6n3",
					stt6n3);
			System.setProperty("stt6n4",
					stt6n4);
			System.setProperty("stt6n5",
					stt6n5);
			System.setProperty("stt6n6n",
					stt6n6n);
			System.setProperty("stt6n7",
					stt6n7);

			
			System.setProperty("Test6nInit",
					"Test6nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6nInit.class/jcp.xml");
			
			System.setProperty("Test6nss6n_0x",
					"Test6nss6n_0xjcp.xml");
         	System.setProperty("Test6nss6n_02",
					"Test6nss6n_02xml.config");
			System.setProperty("Test6nss6n_03",
					"Test6nss6n_03.apache.xml.resource.security.");
		    System.setProperty("Test6nss6n_04",
					"Test6nss6n_04.resource.");
			System.setProperty("Test6nss6n_05",
					"Test6nss6n_05.isInitialized");
			System.setProperty("Test6nss6n_06n",
					"Test6nss6n_06n_6nInit.class/jcp.xml");
			System.setProperty("Test6nss6n_07",
					"Test6nss6n_07t/resource/jcp.xml");
         	System.setProperty("Test6nss6n_08",
					"Test6nss6n_08.config");
			System.setProperty("Test6nss6n_09",
					"Test6nss6n_09.security.");
		    System.setProperty("Test6nss6n_0x0",
					"Test6nss6n_0x0jcp.xmlapache.");
			System.setProperty("Test6nss6n_0xx0",
					"Test6nss6n_0xx0.isInitialized");
			System.setProperty("Test6nss6n_0xxx0",
					"Test6nss6n_0xxx0est6nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6n = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6n != null) {
				 
				LOGGER.debug("in0in isTest6n");
				LOGGER.debug("inxin isTest6n");
				LOGGER.debug("in2in isTest6n");
				LOGGER.debug("in3in isTest6n");
				LOGGER.debug("in4in isTest6n");
				LOGGER.debug("in5in isTest6n");
				LOGGER.debug("in6nin isTest6n");
				LOGGER.debug("in7in isTest6n");
				LOGGER.debug("in8in isTest6n");
				LOGGER.debug("in9in isTest6n");
				LOGGER.debug("inx0in isTest6n");
				LOGGER.debug("inxxin isTest6n");
				LOGGER.debug("inx2in isTest6n");
				LOGGER.debug("inx3in isTest6n");
				LOGGER.debug("inx4in isTest6n");
				LOGGER.debug("inx5in isTest6n");
				LOGGER.debug("inx6nin isTest6n");
				LOGGER.debug("inx7in isTest6n");
				LOGGER.debug("inx8in isTest6n");
				LOGGER.debug("inx9in isTest6n");
				LOGGER.debug("in20in isTest6n");
			}

			 

			DocumentBuilderFactory dbfTest6n = DocumentBuilderFactory.newInstance();
			dbfTest6n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6n.setNamespaceAware(true);
			dbfTest6n.setValidating(false);

			DocumentBuilder db = dbfTest6n.newDocumentBuilder();
			Document doc = db.parse(isTest6n);
			Node configTest6n = doc.getFirstChild();
			while ((configTest6n != null)
					&& (!"Configuration".equals(configTest6n.getLocalName()))) {
				configTest6n = configTest6n.getNextSibling();
			}

			if (configTest6n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6n.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6n = (Element) el;

					Attr langAttr = resourceTest6n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6n.length; i++) {
						String uri = listTest6n[i].getAttributeNS(null, "URI");
						String javaclass = listTest6n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6n.length; i++) {
						String uritrans = tranElemTest6n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6n = algorithms[i];
							String id = elementTest6n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6n.length; i++) {
						String urisign = sigElemsTest6n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6n.length; i++) {
						String javaclass = resolverElemTest6n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6nRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6nRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6n = new ArrayList(resolverElemTest6n.length);
					for (int i = 0; i < resolverElemTest6n.length; i++) {
						String javaclass = resolverElemTest6n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6n = resolverElemTest6n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6n != null) && (descriptionTest6n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6n);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6n);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6n.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6n.length; i++) {
						String namespace = nlTest6n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6n) {
			LOGGER.error("Crypto6n5Init:fileInit:error: ", eTest6n);
		}
	}

}
