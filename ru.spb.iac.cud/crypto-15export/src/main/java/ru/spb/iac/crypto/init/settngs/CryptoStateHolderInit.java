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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5h1,String st5h2,String st5h3,String st5h4,String st5h5h,
			                String st5h6,String st5h7){
	  stt5h1=st5h1;
	  stt5h2=st5h2;
	  stt5h3=st5h3;
	  stt5h4=st5h4;
	  stt5h5h=st5h5h;
	  stt5h6=st5h6;
	  stt5h7=st5h7;

	 }
	 
	 private  String stt5h1;
	 private  String stt5h2;
	 private String stt5h3;
	 private  String stt5h4;
	 private  String stt5h5h;
	 private  String stt5h6;
	 private  String stt5h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5h1",
					stt5h1);
			System.setProperty("stt5h2",
					stt5h2);
			System.setProperty("stt5h3",
					stt5h3);
			System.setProperty("stt5h4",
					stt5h4);
			System.setProperty("stt5h5h",
					stt5h5h);
			System.setProperty("stt5h6",
					stt5h6);
			System.setProperty("stt5h7",
					stt5h7);

			
			System.setProperty("Test5hInit",
					"Test5hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5h5hInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5hInit.class/jcp.xml");
			
			System.setProperty("Test5hss5h_0x",
					"Test5hss5h_0xjcp.xml");
         	System.setProperty("Test5hss5h_02",
					"Test5hss5h_02xml.config");
			System.setProperty("Test5hss5h_03",
					"Test5hss5h_03.apache.xml.resource.security.");
		    System.setProperty("Test5hss5h_04",
					"Test5hss5h_04.resource.");
			System.setProperty("Test5hss5h_05h",
					"Test5hss5h_05h.isInitialized");
			System.setProperty("Test5hss5h_06",
					"Test5hss5h_06_5hInit.class/jcp.xml");
			System.setProperty("Test5hss5h_07",
					"Test5hss5h_07t/resource/jcp.xml");
         	System.setProperty("Test5hss5h_08",
					"Test5hss5h_08.config");
			System.setProperty("Test5hss5h_09",
					"Test5hss5h_09.security.");
		    System.setProperty("Test5hss5h_0x0",
					"Test5hss5h_0x0jcp.xmlapache.");
			System.setProperty("Test5hss5h_0xx0",
					"Test5hss5h_0xx0.isInitialized");
			System.setProperty("Test5hss5h_0xxx0",
					"Test5hss5h_0xxx0est5hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5h5hInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5h = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5h != null) {
				 
				LOGGER.debug("in0in isTest5h");
				LOGGER.debug("inxin isTest5h");
				LOGGER.debug("in2in isTest5h");
				LOGGER.debug("in3in isTest5h");
				LOGGER.debug("in4in isTest5h");
				LOGGER.debug("in5hin isTest5h");
				LOGGER.debug("in6in isTest5h");
				LOGGER.debug("in7in isTest5h");
				LOGGER.debug("in8in isTest5h");
				LOGGER.debug("in9in isTest5h");
				LOGGER.debug("inx0in isTest5h");
				LOGGER.debug("inxxin isTest5h");
				LOGGER.debug("inx2in isTest5h");
				LOGGER.debug("inx3in isTest5h");
				LOGGER.debug("inx4in isTest5h");
				LOGGER.debug("inx5hin isTest5h");
				LOGGER.debug("inx6in isTest5h");
				LOGGER.debug("inx7in isTest5h");
				LOGGER.debug("inx8in isTest5h");
				LOGGER.debug("inx9in isTest5h");
				LOGGER.debug("in20in isTest5h");
			}

			 

			DocumentBuilderFactory dbfTest5h = DocumentBuilderFactory.newInstance();
			dbfTest5h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5h.setNamespaceAware(true);
			dbfTest5h.setValidating(false);

			DocumentBuilder db = dbfTest5h.newDocumentBuilder();
			Document doc = db.parse(isTest5h);
			Node configTest5h = doc.getFirstChild();
			while ((configTest5h != null)
					&& (!"Configuration".equals(configTest5h.getLocalName()))) {
				configTest5h = configTest5h.getNextSibling();
			}

			if (configTest5h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5h.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5h = (Element) el;

					Attr langAttr = resourceTest5h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5h.length; i++) {
						String uri = listTest5h[i].getAttributeNS(null, "URI");
						String javaclass = listTest5h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5h.length; i++) {
						String uritrans = tranElemTest5h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5h = algorithms[i];
							String id = elementTest5h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5h.length; i++) {
						String urisign = sigElemsTest5h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5h.length; i++) {
						String javaclass = resolverElemTest5h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5hRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5h = new ArrayList(resolverElemTest5h.length);
					for (int i = 0; i < resolverElemTest5h.length; i++) {
						String javaclass = resolverElemTest5h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5h = resolverElemTest5h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5h != null) && (descriptionTest5h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5h);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5h);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5h.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5h.length; i++) {
						String namespace = nlTest5h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5h) {
			LOGGER.error("Crypto5h5hInit:fileInit:error: ", eTest5h);
		}
	}

}
