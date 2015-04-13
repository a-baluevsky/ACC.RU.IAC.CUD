package ru.spb.iac.crypto.init.groupsys;

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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8m1,String st8m2,String st8m3,String st8m4,String st8m5,
			                String st8m6,String st8m7){
	  stt8m1=st8m1;
	  stt8m2=st8m2;
	  stt8m3=st8m3;
	  stt8m4=st8m4;
	  stt8m5=st8m5;
	  stt8m6=st8m6;
	  stt8m7=st8m7;

	 }
	 
	 private  String stt8m1;
	 private  String stt8m2;
	 private String stt8m3;
	 private  String stt8m4;
	 private  String stt8m5;
	 private  String stt8m6;
	 private  String stt8m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8m1",
					stt8m1);
			System.setProperty("stt8m2",
					stt8m2);
			System.setProperty("stt8m3",
					stt8m3);
			System.setProperty("stt8m4",
					stt8m4);
			System.setProperty("stt8m5",
					stt8m5);
			System.setProperty("stt8m6",
					stt8m6);
			System.setProperty("stt8m7",
					stt8m7);

			
			System.setProperty("Test8mInit",
					"Test8mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8mInit.class/jcp.xml");
			
			System.setProperty("Test8mss8m_0x",
					"Test8mss8m_0xjcp.xml");
         	System.setProperty("Test8mss8m_02",
					"Test8mss8m_02xml.config");
			System.setProperty("Test8mss8m_03",
					"Test8mss8m_03.apache.xml.resource.security.");
		    System.setProperty("Test8mss8m_04",
					"Test8mss8m_04.resource.");
			System.setProperty("Test8mss8m_05",
					"Test8mss8m_05.isInitialized");
			System.setProperty("Test8mss8m_06",
					"Test8mss8m_06_8mInit.class/jcp.xml");
			System.setProperty("Test8mss8m_07",
					"Test8mss8m_07t/resource/jcp.xml");
         	System.setProperty("Test8mss8m_08m",
					"Test8mss8m_08m.config");
			System.setProperty("Test8mss8m_09",
					"Test8mss8m_09.security.");
		    System.setProperty("Test8mss8m_0x0",
					"Test8mss8m_0x0jcp.xmlapache.");
			System.setProperty("Test8mss8m_0xx0",
					"Test8mss8m_0xx0.isInitialized");
			System.setProperty("Test8mss8m_0xxx0",
					"Test8mss8m_0xxx0est8mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8m = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8m != null) {
				 
				LOGGER.debug("in0in isTest8m");
				LOGGER.debug("inxin isTest8m");
				LOGGER.debug("in2in isTest8m");
				LOGGER.debug("in3in isTest8m");
				LOGGER.debug("in4in isTest8m");
				LOGGER.debug("in5in isTest8m");
				LOGGER.debug("in6in isTest8m");
				LOGGER.debug("in7in isTest8m");
				LOGGER.debug("in8min isTest8m");
				LOGGER.debug("in9in isTest8m");
				LOGGER.debug("inx0in isTest8m");
				LOGGER.debug("inxxin isTest8m");
				LOGGER.debug("inx2in isTest8m");
				LOGGER.debug("inx3in isTest8m");
				LOGGER.debug("inx4in isTest8m");
				LOGGER.debug("inx5in isTest8m");
				LOGGER.debug("inx6in isTest8m");
				LOGGER.debug("inx7in isTest8m");
				LOGGER.debug("inx8min isTest8m");
				LOGGER.debug("inx9in isTest8m");
				LOGGER.debug("in20in isTest8m");
			}

			 

			DocumentBuilderFactory dbfTest8m = DocumentBuilderFactory.newInstance();
			dbfTest8m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8m.setNamespaceAware(true);
			dbfTest8m.setValidating(false);

			DocumentBuilder db = dbfTest8m.newDocumentBuilder();
			Document doc = db.parse(isTest8m);
			Node configTest8m = doc.getFirstChild();
			while ((configTest8m != null)
					&& (!"Configuration".equals(configTest8m.getLocalName()))) {
				configTest8m = configTest8m.getNextSibling();
			}

			if (configTest8m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8m!=null?configTest8m.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8m = (Element) el;

					Attr langAttr = resourceTest8m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8m.length; i++) {
						String uri = listTest8m[i].getAttributeNS(null, "URI");
						String javaclass = listTest8m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8m.length; i++) {
						String uritrans = tranElemTest8m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8m = algorithms[i];
							String id = elementTest8m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8m.length; i++) {
						String urisign = sigElemsTest8m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8m.length; i++) {
						String javaclass = resolverElemTest8m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8mRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8m = new ArrayList(resolverElemTest8m.length);
					for (int i = 0; i < resolverElemTest8m.length; i++) {
						String javaclass = resolverElemTest8m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8m = resolverElemTest8m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8m != null) && (descriptionTest8m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8m);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8m);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8m.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8m.length; i++) {
						String namespace = nlTest8m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8m ) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", exs8m);
 } catch (ClassNotFoundException enf8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", enf8m);
 } catch (IllegalAccessException eia8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", eia8m);
 } catch (InstantiationException e8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", e8m);
 } catch (javax.xml.parsers.ParserConfigurationException epc8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", epc8m);
 } catch (org.xml.sax.SAXException ese8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", ese8m);
 } catch (java.io.IOException eio8m) {
 LOGGER.error("Crypto8mInit:fileInit:error: ", eio8m);
 }

	}

}
