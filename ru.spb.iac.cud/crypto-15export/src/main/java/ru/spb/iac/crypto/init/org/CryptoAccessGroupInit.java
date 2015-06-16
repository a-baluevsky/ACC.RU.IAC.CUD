package ru.spb.iac.crypto.init.org;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.keys.keyresolver.KeyResolver;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2l1,String st2l2l,String st2l3,String st2l4,String st2l5,
			                String st2l6,String st2l7){
	  stt2l1=st2l1;
	  stt2l2l=st2l2l;
	  stt2l3=st2l3;
	  stt2l4=st2l4;
	  stt2l5=st2l5;
	  stt2l6=st2l6;
	  stt2l7=st2l7;

	 }
	 
	 private  String stt2l1;
	 private  String stt2l2l;
	 private String stt2l3;
	 private  String stt2l4;
	 private  String stt2l5;
	 private  String stt2l6;
	 private  String stt2l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2l1",
					stt2l1);
			System.setProperty("stt2l2l",
					stt2l2l);
			System.setProperty("stt2l3",
					stt2l3);
			System.setProperty("stt2l4",
					stt2l4);
			System.setProperty("stt2l5",
					stt2l5);
			System.setProperty("stt2l6",
					stt2l6);
			System.setProperty("stt2l7",
					stt2l7);

			
			System.setProperty("Test2lInit",
					"Test2lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2lInit.class/jcp.xml");
			
			System.setProperty("Test2lss2l_0x",
					"Test2lss2l_0xjcp.xml");
         	System.setProperty("Test2lss2l_02l",
					"Test2lss2l_02lxml.config");
			System.setProperty("Test2lss2l_03",
					"Test2lss2l_03.apache.xml.resource.security.");
		    System.setProperty("Test2lss2l_04",
					"Test2lss2l_04.resource.");
			System.setProperty("Test2lss2l_05",
					"Test2lss2l_05.isInitialized");
			System.setProperty("Test2lss2l_06",
					"Test2lss2l_06_2lInit.class/jcp.xml");
			System.setProperty("Test2lss2l_07",
					"Test2lss2l_07t/resource/jcp.xml");
         	System.setProperty("Test2lss2l_08",
					"Test2lss2l_08.config");
			System.setProperty("Test2lss2l_09",
					"Test2lss2l_09.security.");
		    System.setProperty("Test2lss2l_0x0",
					"Test2lss2l_0x0jcp.xmlapache.");
			System.setProperty("Test2lss2l_0xx0",
					"Test2lss2l_0xx0.isInitialized");
			System.setProperty("Test2lss2l_0xxx0",
					"Test2lss2l_0xxx0est2lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2l5Init:init:error:", e);
		}
	}
	public void fileInit() {

		 
		try {
			InputStream isTest2l = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2l != null) {
				 
				LOGGER.debug("in0in isTest2l");
				LOGGER.debug("inxin isTest2l");
				LOGGER.debug("in2lin isTest2l");
				LOGGER.debug("in3in isTest2l");
				LOGGER.debug("in4in isTest2l");
				LOGGER.debug("in5in isTest2l");
				LOGGER.debug("in6in isTest2l");
				LOGGER.debug("in7in isTest2l");
				LOGGER.debug("in8in isTest2l");
				LOGGER.debug("in9in isTest2l");
				LOGGER.debug("inx0in isTest2l");
				LOGGER.debug("inxxin isTest2l");
				LOGGER.debug("inx2lin isTest2l");
				LOGGER.debug("inx3in isTest2l");
				LOGGER.debug("inx4in isTest2l");
				LOGGER.debug("inx5in isTest2l");
				LOGGER.debug("inx6in isTest2l");
				LOGGER.debug("inx7in isTest2l");
				LOGGER.debug("inx8in isTest2l");
				LOGGER.debug("inx9in isTest2l");
				LOGGER.debug("in2l0in isTest2l");
			}

			 

			DocumentBuilderFactory dbfTest2l = DocumentBuilderFactory.newInstance();
			dbfTest2l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2l.setNamespaceAware(true);
			dbfTest2l.setValidating(false);

			DocumentBuilder db = dbfTest2l.newDocumentBuilder();
			Document doc = db.parse(isTest2l);
			Node configTest2l = doc.getFirstChild();
			while ((configTest2l != null)
					&& (!"Configuration".equals(configTest2l.getLocalName()))) {
				configTest2l = configTest2l.getNextSibling();
			}

			if (configTest2l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			
				
			for (Node el = configTest2l!=null?configTest2l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				
				
				if (1 != el.getNodeType()) {
				
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2l = (Element) el;

					Attr langAttr = resourceTest2l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2l.length; i++) {
						String uri = listTest2l[i].getAttributeNS(null, "URI");
						String javaclass = listTest2l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2l.length; i++) {
						String uritrans = tranElemTest2l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2l = algorithms[i];
							String id = elementTest2l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2l.length; i++) {
						String urisign = sigElemsTest2l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2l.length; i++) {
						String javaclass = resolverElemTest2l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2lRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest2l = new ArrayList<String>(resolverElemTest2l.length);
					for (int i = 0; i < resolverElemTest2l.length; i++) {
						String javaclass = resolverElemTest2l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2l = resolverElemTest2l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2l != null) && (descriptionTest2l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2l);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2l);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2l.add(javaclass);

					}
					KeyResolver.registerClassNames(classNamesTest2l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2l.length; i++) {
						String namespace = nlTest2l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
	
	} catch (XMLSecurityException exs2l5 ) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", exs2l5);
	} catch (ClassNotFoundException enf2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", enf2l5);
	} catch (IllegalAccessException eia2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", eia2l5);
	} catch (InstantiationException e2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", e2l5);
	} catch (ParserConfigurationException epc2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", epc2l5);
	} catch (SAXException ese2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", ese2l5);
	} catch (IOException eio2l5) {
		LOGGER.error("Crypto2l5Init:fileInit:error: ", eio2l5);
	}
	}

}
