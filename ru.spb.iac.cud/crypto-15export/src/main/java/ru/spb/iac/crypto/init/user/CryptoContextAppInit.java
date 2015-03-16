package ru.spb.iac.crypto.init.user;

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
	 
	 
	 public CryptoContextAppInit(String st6eb1,String st6eb2,String st6eb3,String st6eb4,String st6eb5,
			                String st6eb6eb,String st6eb7){
	  stt6eb1=st6eb1;
	  stt6eb2=st6eb2;
	  stt6eb3=st6eb3;
	  stt6eb4=st6eb4;
	  stt6eb5=st6eb5;
	  stt6eb6eb=st6eb6eb;
	  stt6eb7=st6eb7;

	 }
	 
	 private  String stt6eb1;
	 private  String stt6eb2;
	 private String stt6eb3;
	 private  String stt6eb4;
	 private  String stt6eb5;
	 private  String stt6eb6eb;
	 private  String stt6eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6eb1",
					stt6eb1);
			System.setProperty("stt6eb2",
					stt6eb2);
			System.setProperty("stt6eb3",
					stt6eb3);
			System.setProperty("stt6eb4",
					stt6eb4);
			System.setProperty("stt6eb5",
					stt6eb5);
			System.setProperty("stt6eb6eb",
					stt6eb6eb);
			System.setProperty("stt6eb7",
					stt6eb7);

			
			System.setProperty("Test6ebInit",
					"Test6ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6ebInit.class/jcp.xml");
			
			System.setProperty("Test6ebss6eb_0x",
					"Test6ebss6eb_0xjcp.xml");
         	System.setProperty("Test6ebss6eb_02",
					"Test6ebss6eb_02xml.config");
			System.setProperty("Test6ebss6eb_03",
					"Test6ebss6eb_03.apache.xml.resource.security.");
		    System.setProperty("Test6ebss6eb_04",
					"Test6ebss6eb_04.resource.");
			System.setProperty("Test6ebss6eb_05",
					"Test6ebss6eb_05.isInitialized");
			System.setProperty("Test6ebss6eb_06eb",
					"Test6ebss6eb_06eb_6ebInit.class/jcp.xml");
			System.setProperty("Test6ebss6eb_07",
					"Test6ebss6eb_07t/resource/jcp.xml");
         	System.setProperty("Test6ebss6eb_08",
					"Test6ebss6eb_08.config");
			System.setProperty("Test6ebss6eb_09",
					"Test6ebss6eb_09.security.");
		    System.setProperty("Test6ebss6eb_0x0",
					"Test6ebss6eb_0x0jcp.xmlapache.");
			System.setProperty("Test6ebss6eb_0xx0",
					"Test6ebss6eb_0xx0.isInitialized");
			System.setProperty("Test6ebss6eb_0xxx0",
					"Test6ebss6eb_0xxx0est6ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6eb = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6eb != null) {
				 
				LOGGER.debug("in0in isTest6eb");
				LOGGER.debug("inxin isTest6eb");
				LOGGER.debug("in2in isTest6eb");
				LOGGER.debug("in3in isTest6eb");
				LOGGER.debug("in4in isTest6eb");
				LOGGER.debug("in5in isTest6eb");
				LOGGER.debug("in6ebin isTest6eb");
				LOGGER.debug("in7in isTest6eb");
				LOGGER.debug("in8in isTest6eb");
				LOGGER.debug("in9in isTest6eb");
				LOGGER.debug("inx0in isTest6eb");
				LOGGER.debug("inxxin isTest6eb");
				LOGGER.debug("inx2in isTest6eb");
				LOGGER.debug("inx3in isTest6eb");
				LOGGER.debug("inx4in isTest6eb");
				LOGGER.debug("inx5in isTest6eb");
				LOGGER.debug("inx6ebin isTest6eb");
				LOGGER.debug("inx7in isTest6eb");
				LOGGER.debug("inx8in isTest6eb");
				LOGGER.debug("inx9in isTest6eb");
				LOGGER.debug("in20in isTest6eb");
			}

			 

			DocumentBuilderFactory dbfTest6eb = DocumentBuilderFactory.newInstance();
			dbfTest6eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6eb.setNamespaceAware(true);
			dbfTest6eb.setValidating(false);

			DocumentBuilder db = dbfTest6eb.newDocumentBuilder();
			Document doc = db.parse(isTest6eb);
			Node configTest6eb = doc.getFirstChild();
			while ((configTest6eb != null)
					&& (!"Configuration".equals(configTest6eb.getLocalName()))) {
				configTest6eb = configTest6eb.getNextSibling();
			}

			if (configTest6eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6eb = (Element) el;

					Attr langAttr = resourceTest6eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6eb.length; i++) {
						String uri = listTest6eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest6eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6eb.length; i++) {
						String uritrans = tranElemTest6eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6eb = algorithms[i];
							String id = elementTest6eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6eb.length; i++) {
						String urisign = sigElemsTest6eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6eb.length; i++) {
						String javaclass = resolverElemTest6eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6ebRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6ebRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6eb = new ArrayList(resolverElemTest6eb.length);
					for (int i = 0; i < resolverElemTest6eb.length; i++) {
						String javaclass = resolverElemTest6eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6eb = resolverElemTest6eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6eb != null) && (descriptionTest6eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6eb);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6eb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest6eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6eb.length; i++) {
						String namespace = nlTest6eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest6eb) {
			LOGGER.error("Crypto6eb5Init:fileInit:error: ", eTest6eb);
		}
	}

}
