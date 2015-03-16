package ru.spb.iac.crypto.init.settngs;

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
	 
	 
	 public CryptoDomainInit(String st9h1,String st9h2,String st9h3,String st9h4,String st9h5,
			                String st9h6,String st9h7){
	  stt9h1=st9h1;
	  stt9h2=st9h2;
	  stt9h3=st9h3;
	  stt9h4=st9h4;
	  stt9h5=st9h5;
	  stt9h6=st9h6;
	  stt9h7=st9h7;

	 }
	 
	 private  String stt9h1;
	 private  String stt9h2;
	 private String stt9h3;
	 private  String stt9h4;
	 private  String stt9h5;
	 private  String stt9h6;
	 private  String stt9h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9h1",
					stt9h1);
			System.setProperty("stt9h2",
					stt9h2);
			System.setProperty("stt9h3",
					stt9h3);
			System.setProperty("stt9h4",
					stt9h4);
			System.setProperty("stt9h5",
					stt9h5);
			System.setProperty("stt9h6",
					stt9h6);
			System.setProperty("stt9h7",
					stt9h7);

			
			System.setProperty("Test9hInit",
					"Test9hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9hInit.class/jcp.xml");
			
			
			System.setProperty("Test9hss9h_0x",
					"Test9hss9h_0xjcp.xml");
         	System.setProperty("Test9hss9h_02",
					"Test9hss9h_02xml.config");
			System.setProperty("Test9hss9h_03",
					"Test9hss9h_03.apache.xml.resource.security.");
		    System.setProperty("Test9hss9h_04",
					"Test9hss9h_04.resource.");
			System.setProperty("Test9hss9h_05",
					"Test9hss9h_05.isInitialized");
			System.setProperty("Test9hss9h_06",
					"Test9hss9h_06_9hInit.class/jcp.xml");
			System.setProperty("Test9hss9h_07",
					"Test9hss9h_07t/resource/jcp.xml");
         	System.setProperty("Test9hss9h_08",
					"Test9hss9h_08.config");
			System.setProperty("Test9hss9h_09h",
					"Test9hss9h_09h.security.");
		    System.setProperty("Test9hss9h_0x0",
					"Test9hss9h_0x0jcp.xmlapache.");
			System.setProperty("Test9hss9h_0xx0",
					"Test9hss9h_0xx0.isInitialized");
			System.setProperty("Test9hss9h_0xxx0",
					"Test9hss9h_0xxx0est9hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9h = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9h != null) {
				 
				LOGGER.debug("in0in isTest9h");
				LOGGER.debug("inxin isTest9h");
				LOGGER.debug("in2in isTest9h");
				LOGGER.debug("in3in isTest9h");
				LOGGER.debug("in4in isTest9h");
				LOGGER.debug("in5in isTest9h");
				LOGGER.debug("in6in isTest9h");
				LOGGER.debug("in7in isTest9h");
				LOGGER.debug("in8in isTest9h");
				LOGGER.debug("in9hin isTest9h");
				LOGGER.debug("inx0in isTest9h");
				LOGGER.debug("inxxin isTest9h");
				LOGGER.debug("inx2in isTest9h");
				LOGGER.debug("inx3in isTest9h");
				LOGGER.debug("inx4in isTest9h");
				LOGGER.debug("inx5in isTest9h");
				LOGGER.debug("inx6in isTest9h");
				LOGGER.debug("inx7in isTest9h");
				LOGGER.debug("inx8in isTest9h");
				LOGGER.debug("inx9hin isTest9h");
				LOGGER.debug("in20in isTest9h");
			}

			 

			DocumentBuilderFactory dbfTest9h = DocumentBuilderFactory.newInstance();
			dbfTest9h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9h.setNamespaceAware(true);
			dbfTest9h.setValidating(false);

			DocumentBuilder db = dbfTest9h.newDocumentBuilder();
			Document doc = db.parse(isTest9h);
			Node configTest9h = doc.getFirstChild();
			while ((configTest9h != null)
					&& (!"Configuration".equals(configTest9h.getLocalName()))) {
				configTest9h = configTest9h.getNextSibling();
			}

			if (configTest9h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9h = (Element) el;

					Attr langAttr = resourceTest9h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9h.length; i++) {
						String uri = listTest9h[i].getAttributeNS(null, "URI");
						String javaclass = listTest9h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9h.length; i++) {
						String uritrans = tranElemTest9h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9h = algorithms[i];
							String id = elementTest9h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9h.length; i++) {
						String urisign = sigElemsTest9h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9h.length; i++) {
						String javaclass = resolverElemTest9h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9hRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9h = new ArrayList(resolverElemTest9h.length);
					for (int i = 0; i < resolverElemTest9h.length; i++) {
						String javaclass = resolverElemTest9h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9h = resolverElemTest9h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9h != null) && (descriptionTest9h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9h);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9h);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9h.length; i++) {
						String namespace = nlTest9h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9h) {
			LOGGER.error("Crypto9h5Init:fileInit:error: ", eTest9h);
		}
	}

}
