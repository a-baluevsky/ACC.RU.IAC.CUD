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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7n1,String st7n2,String st7n3,String st7n4,String st7n5,
			                String st7n6,String st7n7n){
	  stt7n1=st7n1;
	  stt7n2=st7n2;
	  stt7n3=st7n3;
	  stt7n4=st7n4;
	  stt7n5=st7n5;
	  stt7n6=st7n6;
	  stt7n7n=st7n7n;

	 }
	 
	 private  String stt7n1;
	 private  String stt7n2;
	 private String stt7n3;
	 private  String stt7n4;
	 private  String stt7n5;
	 private  String stt7n6;
	 private  String stt7n7n;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7n1",
					stt7n1);
			System.setProperty("stt7n2",
					stt7n2);
			System.setProperty("stt7n3",
					stt7n3);
			System.setProperty("stt7n4",
					stt7n4);
			System.setProperty("stt7n5",
					stt7n5);
			System.setProperty("stt7n6",
					stt7n6);
			System.setProperty("stt7n7n",
					stt7n7n);

			
			System.setProperty("Test7nInit",
					"Test7nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7nInit.class/jcp.xml");
			
			System.setProperty("Test7nss7n_0x",
					"Test7nss7n_0xjcp.xml");
         	System.setProperty("Test7nss7n_02",
					"Test7nss7n_02xml.config");
			System.setProperty("Test7nss7n_03",
					"Test7nss7n_03.apache.xml.resource.security.");
		    System.setProperty("Test7nss7n_04",
					"Test7nss7n_04.resource.");
			System.setProperty("Test7nss7n_05",
					"Test7nss7n_05.isInitialized");
			System.setProperty("Test7nss7n_06",
					"Test7nss7n_06_7nInit.class/jcp.xml");
			System.setProperty("Test7nss7n_07n",
					"Test7nss7n_07nt/resource/jcp.xml");
         	System.setProperty("Test7nss7n_08",
					"Test7nss7n_08.config");
			System.setProperty("Test7nss7n_09",
					"Test7nss7n_09.security.");
		    System.setProperty("Test7nss7n_0x0",
					"Test7nss7n_0x0jcp.xmlapache.");
			System.setProperty("Test7nss7n_0xx0",
					"Test7nss7n_0xx0.isInitialized");
			System.setProperty("Test7nss7n_0xxx0",
					"Test7nss7n_0xxx0est7nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7n = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7n != null) {
				 
				LOGGER.debug("in0in isTest7n");
				LOGGER.debug("inxin isTest7n");
				LOGGER.debug("in2in isTest7n");
				LOGGER.debug("in3in isTest7n");
				LOGGER.debug("in4in isTest7n");
				LOGGER.debug("in5in isTest7n");
				LOGGER.debug("in6in isTest7n");
				LOGGER.debug("in7nin isTest7n");
				LOGGER.debug("in8in isTest7n");
				LOGGER.debug("in9in isTest7n");
				LOGGER.debug("inx0in isTest7n");
				LOGGER.debug("inxxin isTest7n");
				LOGGER.debug("inx2in isTest7n");
				LOGGER.debug("inx3in isTest7n");
				LOGGER.debug("inx4in isTest7n");
				LOGGER.debug("inx5in isTest7n");
				LOGGER.debug("inx6in isTest7n");
				LOGGER.debug("inx7nin isTest7n");
				LOGGER.debug("inx8in isTest7n");
				LOGGER.debug("inx9in isTest7n");
				LOGGER.debug("in20in isTest7n");
			}

			 

			DocumentBuilderFactory dbfTest7n = DocumentBuilderFactory.newInstance();
			dbfTest7n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7n.setNamespaceAware(true);
			dbfTest7n.setValidating(false);

			DocumentBuilder db = dbfTest7n.newDocumentBuilder();
			Document doc = db.parse(isTest7n);
			Node configTest7n = doc.getFirstChild();
			while ((configTest7n != null)
					&& (!"Configuration".equals(configTest7n.getLocalName()))) {
				configTest7n = configTest7n.getNextSibling();
			}

			if (configTest7n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7n.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7n = (Element) el;

					Attr langAttr = resourceTest7n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7n.length; i++) {
						String uri = listTest7n[i].getAttributeNS(null, "URI");
						String javaclass = listTest7n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7n.length; i++) {
						String uritrans = tranElemTest7n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7n = algorithms[i];
							String id = elementTest7n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7n.length; i++) {
						String urisign = sigElemsTest7n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7n.length; i++) {
						String javaclass = resolverElemTest7n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7nRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7n = new ArrayList(resolverElemTest7n.length);
					for (int i = 0; i < resolverElemTest7n.length; i++) {
						String javaclass = resolverElemTest7n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7n = resolverElemTest7n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7n != null) && (descriptionTest7n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7n);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7n);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7n.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest7n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7n.length; i++) {
						String namespace = nlTest7n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest7n) {
			LOGGER.error("Crypto7n5Init:fileInit:error: ", eTest7n);
		}
	}

}
