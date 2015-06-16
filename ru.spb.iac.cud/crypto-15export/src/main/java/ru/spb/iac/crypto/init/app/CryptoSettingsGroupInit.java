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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3p1,String st3p2,String st3p3p,String st3p4,String st3p5,
			                String st3p6,String st3p7){
	  stt3p1=st3p1;
	  stt3p2=st3p2;
	  stt3p3p=st3p3p;
	  stt3p4=st3p4;
	  stt3p5=st3p5;
	  stt3p6=st3p6;
	  stt3p7=st3p7;

	 }
	 
	 private  String stt3p1;
	 private  String stt3p2;
	 private String stt3p3p;
	 private  String stt3p4;
	 private  String stt3p5;
	 private  String stt3p6;
	 private  String stt3p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3p1",
					stt3p1);
			System.setProperty("stt3p2",
					stt3p2);
			System.setProperty("stt3p3p",
					stt3p3p);
			System.setProperty("stt3p4",
					stt3p4);
			System.setProperty("stt3p5",
					stt3p5);
			System.setProperty("stt3p6",
					stt3p6);
			System.setProperty("stt3p7",
					stt3p7);

			
			System.setProperty("Test3pInit",
					"Test3pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3pInit.class/jcp.xml");
			
			
			System.setProperty("Test3pss3p_0x",
					"Test3pss3p_0xjcp.xml");
         	System.setProperty("Test3pss3p_02",
					"Test3pss3p_02xml.config");
			System.setProperty("Test3pss3p_03p",
					"Test3pss3p_03p.apache.xml.resource.security.");
		    System.setProperty("Test3pss3p_04",
					"Test3pss3p_04.resource.");
			System.setProperty("Test3pss3p_05",
					"Test3pss3p_05.isInitialized");
			System.setProperty("Test3pss3p_06",
					"Test3pss3p_06_3pInit.class/jcp.xml");
			System.setProperty("Test3pss3p_07",
					"Test3pss3p_07t/resource/jcp.xml");
         	System.setProperty("Test3pss3p_08",
					"Test3pss3p_08.config");
			System.setProperty("Test3pss3p_09",
					"Test3pss3p_09.security.");
		    System.setProperty("Test3pss3p_0x0",
					"Test3pss3p_0x0jcp.xmlapache.");
			System.setProperty("Test3pss3p_0xx0",
					"Test3pss3p_0xx0.isInitialized");
			System.setProperty("Test3pss3p_0xxx0",
					"Test3pss3p_0xxx0est3pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3p = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3p != null) {
				 
				LOGGER.debug("in0in isTest3p");
				LOGGER.debug("inxin isTest3p");
				LOGGER.debug("in2in isTest3p");
				LOGGER.debug("in3pin isTest3p");
				LOGGER.debug("in4in isTest3p");
				LOGGER.debug("in5in isTest3p");
				LOGGER.debug("in6in isTest3p");
				LOGGER.debug("in7in isTest3p");
				LOGGER.debug("in8in isTest3p");
				LOGGER.debug("in9in isTest3p");
				LOGGER.debug("inx0in isTest3p");
				LOGGER.debug("inxxin isTest3p");
				LOGGER.debug("inx2in isTest3p");
				LOGGER.debug("inx3pin isTest3p");
				LOGGER.debug("inx4in isTest3p");
				LOGGER.debug("inx5in isTest3p");
				LOGGER.debug("inx6in isTest3p");
				LOGGER.debug("inx7in isTest3p");
				LOGGER.debug("inx8in isTest3p");
				LOGGER.debug("inx9in isTest3p");
				LOGGER.debug("in20in isTest3p");
			}

			 

			DocumentBuilderFactory dbfTest3p = DocumentBuilderFactory.newInstance();
			dbfTest3p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3p.setNamespaceAware(true);
			dbfTest3p.setValidating(false);

			DocumentBuilder db = dbfTest3p.newDocumentBuilder();
			Document doc = db.parse(isTest3p);
			Node configTest3p = doc.getFirstChild();
			while ((configTest3p != null)
					&& (!"Configuration".equals(configTest3p.getLocalName()))) {
				configTest3p = configTest3p.getNextSibling();
			}

			if (configTest3p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3p!=null?configTest3p.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3p = (Element) el;

					Attr langAttr = resourceTest3p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3p.length; i++) {
						String uri = listTest3p[i].getAttributeNS(null, "URI");
						String javaclass = listTest3p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3p.length; i++) {
						String uritrans = tranElemTest3p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3p = algorithms[i];
							String id = elementTest3p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3p.length; i++) {
						String urisign = sigElemsTest3p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3p.length; i++) {
						String javaclass = resolverElemTest3p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3pRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest3p = new ArrayList<String>(resolverElemTest3p.length);
					for (int i = 0; i < resolverElemTest3p.length; i++) {
						String javaclass = resolverElemTest3p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3p = resolverElemTest3p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3p != null) && (descriptionTest3p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3p);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3p);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3p.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3p.length; i++) {
						String namespace = nlTest3p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3p ) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", exs3p);
 } catch (ClassNotFoundException enf3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", enf3p);
 } catch (IllegalAccessException eia3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", eia3p);
 } catch (InstantiationException e3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", e3p);
 } catch (javax.xml.parsers.ParserConfigurationException epc3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", epc3p);
 } catch (org.xml.sax.SAXException ese3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", ese3p);
 } catch (java.io.IOException eio3p) {
 LOGGER.error("Crypto3pInit:fileInit:error: ", eio3p);
 }

	}

}
