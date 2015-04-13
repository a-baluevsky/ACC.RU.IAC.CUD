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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2h1,String st2h2h,String st2h3,String st2h4,String st2h5,
			                String st2h6,String st2h7){
	  stt2h1=st2h1;
	  stt2h2h=st2h2h;
	  stt2h3=st2h3;
	  stt2h4=st2h4;
	  stt2h5=st2h5;
	  stt2h6=st2h6;
	  stt2h7=st2h7;

	 }
	 
	 private  String stt2h1;
	 private  String stt2h2h;
	 private String stt2h3;
	 private  String stt2h4;
	 private  String stt2h5;
	 private  String stt2h6;
	 private  String stt2h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2h1",
					stt2h1);
			System.setProperty("stt2h2h",
					stt2h2h);
			System.setProperty("stt2h3",
					stt2h3);
			System.setProperty("stt2h4",
					stt2h4);
			System.setProperty("stt2h5",
					stt2h5);
			System.setProperty("stt2h6",
					stt2h6);
			System.setProperty("stt2h7",
					stt2h7);

			
			System.setProperty("Test2hInit",
					"Test2hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2hInit.class/jcp.xml");
			
			System.setProperty("Test2hss2h_0x",
					"Test2hss2h_0xjcp.xml");
         	System.setProperty("Test2hss2h_02h",
					"Test2hss2h_02hxml.config");
			System.setProperty("Test2hss2h_03",
					"Test2hss2h_03.apache.xml.resource.security.");
		    System.setProperty("Test2hss2h_04",
					"Test2hss2h_04.resource.");
			System.setProperty("Test2hss2h_05",
					"Test2hss2h_05.isInitialized");
			System.setProperty("Test2hss2h_06",
					"Test2hss2h_06_2hInit.class/jcp.xml");
			System.setProperty("Test2hss2h_07",
					"Test2hss2h_07t/resource/jcp.xml");
         	System.setProperty("Test2hss2h_08",
					"Test2hss2h_08.config");
			System.setProperty("Test2hss2h_09",
					"Test2hss2h_09.security.");
		    System.setProperty("Test2hss2h_0x0",
					"Test2hss2h_0x0jcp.xmlapache.");
			System.setProperty("Test2hss2h_0xx0",
					"Test2hss2h_0xx0.isInitialized");
			System.setProperty("Test2hss2h_0xxx0",
					"Test2hss2h_0xxx0est2hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2h = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2h != null) {
				 
				LOGGER.debug("in0in isTest2h");
				LOGGER.debug("inxin isTest2h");
				LOGGER.debug("in2hin isTest2h");
				LOGGER.debug("in3in isTest2h");
				LOGGER.debug("in4in isTest2h");
				LOGGER.debug("in5in isTest2h");
				LOGGER.debug("in6in isTest2h");
				LOGGER.debug("in7in isTest2h");
				LOGGER.debug("in8in isTest2h");
				LOGGER.debug("in9in isTest2h");
				LOGGER.debug("inx0in isTest2h");
				LOGGER.debug("inxxin isTest2h");
				LOGGER.debug("inx2hin isTest2h");
				LOGGER.debug("inx3in isTest2h");
				LOGGER.debug("inx4in isTest2h");
				LOGGER.debug("inx5in isTest2h");
				LOGGER.debug("inx6in isTest2h");
				LOGGER.debug("inx7in isTest2h");
				LOGGER.debug("inx8in isTest2h");
				LOGGER.debug("inx9in isTest2h");
				LOGGER.debug("in2h0in isTest2h");
			}

			 

			DocumentBuilderFactory dbfTest2h = DocumentBuilderFactory.newInstance();
			dbfTest2h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2h.setNamespaceAware(true);
			dbfTest2h.setValidating(false);

			DocumentBuilder db = dbfTest2h.newDocumentBuilder();
			Document doc = db.parse(isTest2h);
			Node configTest2h = doc.getFirstChild();
			while ((configTest2h != null)
					&& (!"Configuration".equals(configTest2h.getLocalName()))) {
				configTest2h = configTest2h.getNextSibling();
			}

			if (configTest2h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2h!=null?configTest2h.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2h = (Element) el;

					Attr langAttr = resourceTest2h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2h.length; i++) {
						String uri = listTest2h[i].getAttributeNS(null, "URI");
						String javaclass = listTest2h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2h.length; i++) {
						String uritrans = tranElemTest2h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2h = algorithms[i];
							String id = elementTest2h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2h.length; i++) {
						String urisign = sigElemsTest2h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2h.length; i++) {
						String javaclass = resolverElemTest2h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2hRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2hRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2h = new ArrayList(resolverElemTest2h.length);
					for (int i = 0; i < resolverElemTest2h.length; i++) {
						String javaclass = resolverElemTest2h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2h = resolverElemTest2h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2h != null) && (descriptionTest2h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2h);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2h);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2h.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2h.length; i++) {
						String namespace = nlTest2h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2h ) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", exs2h);
 } catch (ClassNotFoundException enf2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", enf2h);
 } catch (IllegalAccessException eia2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", eia2h);
 } catch (InstantiationException e2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", e2h);
 } catch (javax.xml.parsers.ParserConfigurationException epc2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", epc2h);
 } catch (org.xml.sax.SAXException ese2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", ese2h);
 } catch (java.io.IOException eio2h) {
 LOGGER.error("Crypto2hInit:fileInit:error: ", eio2h);
 }

	}

}
