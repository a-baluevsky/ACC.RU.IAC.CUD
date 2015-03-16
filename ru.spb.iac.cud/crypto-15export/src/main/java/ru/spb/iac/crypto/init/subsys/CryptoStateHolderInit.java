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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5k1,String st5k2,String st5k3,String st5k4,String st5k5k,
			                String st5k6,String st5k7){
	  stt5k1=st5k1;
	  stt5k2=st5k2;
	  stt5k3=st5k3;
	  stt5k4=st5k4;
	  stt5k5k=st5k5k;
	  stt5k6=st5k6;
	  stt5k7=st5k7;

	 }
	 
	 private  String stt5k1;
	 private  String stt5k2;
	 private String stt5k3;
	 private  String stt5k4;
	 private  String stt5k5k;
	 private  String stt5k6;
	 private  String stt5k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5k1",
					stt5k1);
			System.setProperty("stt5k2",
					stt5k2);
			System.setProperty("stt5k3",
					stt5k3);
			System.setProperty("stt5k4",
					stt5k4);
			System.setProperty("stt5k5k",
					stt5k5k);
			System.setProperty("stt5k6",
					stt5k6);
			System.setProperty("stt5k7",
					stt5k7);

			
			System.setProperty("Test5kInit",
					"Test5kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5k5kInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5kInit.class/jcp.xml");
			
			System.setProperty("Test5kss5k_0x",
					"Test5kss5k_0xjcp.xml");
         	System.setProperty("Test5kss5k_02",
					"Test5kss5k_02xml.config");
			System.setProperty("Test5kss5k_03",
					"Test5kss5k_03.apache.xml.resource.security.");
		    System.setProperty("Test5kss5k_04",
					"Test5kss5k_04.resource.");
			System.setProperty("Test5kss5k_05k",
					"Test5kss5k_05k.isInitialized");
			System.setProperty("Test5kss5k_06",
					"Test5kss5k_06_5kInit.class/jcp.xml");
			System.setProperty("Test5kss5k_07",
					"Test5kss5k_07t/resource/jcp.xml");
         	System.setProperty("Test5kss5k_08",
					"Test5kss5k_08.config");
			System.setProperty("Test5kss5k_09",
					"Test5kss5k_09.security.");
		    System.setProperty("Test5kss5k_0x0",
					"Test5kss5k_0x0jcp.xmlapache.");
			System.setProperty("Test5kss5k_0xx0",
					"Test5kss5k_0xx0.isInitialized");
			System.setProperty("Test5kss5k_0xxx0",
					"Test5kss5k_0xxx0est5kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5k5kInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5k = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5k != null) {
				 
				LOGGER.debug("in0in isTest5k");
				LOGGER.debug("inxin isTest5k");
				LOGGER.debug("in2in isTest5k");
				LOGGER.debug("in3in isTest5k");
				LOGGER.debug("in4in isTest5k");
				LOGGER.debug("in5kin isTest5k");
				LOGGER.debug("in6in isTest5k");
				LOGGER.debug("in7in isTest5k");
				LOGGER.debug("in8in isTest5k");
				LOGGER.debug("in9in isTest5k");
				LOGGER.debug("inx0in isTest5k");
				LOGGER.debug("inxxin isTest5k");
				LOGGER.debug("inx2in isTest5k");
				LOGGER.debug("inx3in isTest5k");
				LOGGER.debug("inx4in isTest5k");
				LOGGER.debug("inx5kin isTest5k");
				LOGGER.debug("inx6in isTest5k");
				LOGGER.debug("inx7in isTest5k");
				LOGGER.debug("inx8in isTest5k");
				LOGGER.debug("inx9in isTest5k");
				LOGGER.debug("in20in isTest5k");
			}

			 

			DocumentBuilderFactory dbfTest5k = DocumentBuilderFactory.newInstance();
			dbfTest5k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5k.setNamespaceAware(true);
			dbfTest5k.setValidating(false);

			DocumentBuilder db = dbfTest5k.newDocumentBuilder();
			Document doc = db.parse(isTest5k);
			Node configTest5k = doc.getFirstChild();
			while ((configTest5k != null)
					&& (!"Configuration".equals(configTest5k.getLocalName()))) {
				configTest5k = configTest5k.getNextSibling();
			}

			if (configTest5k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5k.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5k = (Element) el;

					Attr langAttr = resourceTest5k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5k.length; i++) {
						String uri = listTest5k[i].getAttributeNS(null, "URI");
						String javaclass = listTest5k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5k.length; i++) {
						String uritrans = tranElemTest5k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5k = algorithms[i];
							String id = elementTest5k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5k.length; i++) {
						String urisign = sigElemsTest5k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5k.length; i++) {
						String javaclass = resolverElemTest5k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5kRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5kRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5k = new ArrayList(resolverElemTest5k.length);
					for (int i = 0; i < resolverElemTest5k.length; i++) {
						String javaclass = resolverElemTest5k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5k = resolverElemTest5k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5k != null) && (descriptionTest5k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5k);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5k);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5k.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5k.length; i++) {
						String namespace = nlTest5k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5k) {
			LOGGER.error("Crypto5k5kInit:fileInit:error: ", eTest5k);
		}
	}

}
