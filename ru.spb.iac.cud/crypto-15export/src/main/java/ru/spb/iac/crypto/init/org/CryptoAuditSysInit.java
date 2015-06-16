package ru.spb.iac.crypto.init.org;

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
	 
	 
	 public CryptoAuditSysInit(String st8l1,String st8l2,String st8l3,String st8l4,String st8l5,
			                String st8l6,String st8l7){
	  stt8l1=st8l1;
	  stt8l2=st8l2;
	  stt8l3=st8l3;
	  stt8l4=st8l4;
	  stt8l5=st8l5;
	  stt8l6=st8l6;
	  stt8l7=st8l7;

	 }
	 
	 private  String stt8l1;
	 private  String stt8l2;
	 private String stt8l3;
	 private  String stt8l4;
	 private  String stt8l5;
	 private  String stt8l6;
	 private  String stt8l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8l1",
					stt8l1);
			System.setProperty("stt8l2",
					stt8l2);
			System.setProperty("stt8l3",
					stt8l3);
			System.setProperty("stt8l4",
					stt8l4);
			System.setProperty("stt8l5",
					stt8l5);
			System.setProperty("stt8l6",
					stt8l6);
			System.setProperty("stt8l7",
					stt8l7);

			
			System.setProperty("Test8lInit",
					"Test8lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8lInit.class/jcp.xml");
			
			System.setProperty("Test8lss8l_0x",
					"Test8lss8l_0xjcp.xml");
         	System.setProperty("Test8lss8l_02",
					"Test8lss8l_02xml.config");
			System.setProperty("Test8lss8l_03",
					"Test8lss8l_03.apache.xml.resource.security.");
		    System.setProperty("Test8lss8l_04",
					"Test8lss8l_04.resource.");
			System.setProperty("Test8lss8l_05",
					"Test8lss8l_05.isInitialized");
			System.setProperty("Test8lss8l_06",
					"Test8lss8l_06_8lInit.class/jcp.xml");
			System.setProperty("Test8lss8l_07",
					"Test8lss8l_07t/resource/jcp.xml");
         	System.setProperty("Test8lss8l_08l",
					"Test8lss8l_08l.config");
			System.setProperty("Test8lss8l_09",
					"Test8lss8l_09.security.");
		    System.setProperty("Test8lss8l_0x0",
					"Test8lss8l_0x0jcp.xmlapache.");
			System.setProperty("Test8lss8l_0xx0",
					"Test8lss8l_0xx0.isInitialized");
			System.setProperty("Test8lss8l_0xxx0",
					"Test8lss8l_0xxx0est8lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8l = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8l != null) {
				 
				LOGGER.debug("in0in isTest8l");
				LOGGER.debug("inxin isTest8l");
				LOGGER.debug("in2in isTest8l");
				LOGGER.debug("in3in isTest8l");
				LOGGER.debug("in4in isTest8l");
				LOGGER.debug("in5in isTest8l");
				LOGGER.debug("in6in isTest8l");
				LOGGER.debug("in7in isTest8l");
				LOGGER.debug("in8lin isTest8l");
				LOGGER.debug("in9in isTest8l");
				LOGGER.debug("inx0in isTest8l");
				LOGGER.debug("inxxin isTest8l");
				LOGGER.debug("inx2in isTest8l");
				LOGGER.debug("inx3in isTest8l");
				LOGGER.debug("inx4in isTest8l");
				LOGGER.debug("inx5in isTest8l");
				LOGGER.debug("inx6in isTest8l");
				LOGGER.debug("inx7in isTest8l");
				LOGGER.debug("inx8lin isTest8l");
				LOGGER.debug("inx9in isTest8l");
				LOGGER.debug("in20in isTest8l");
			}

			 

			DocumentBuilderFactory dbfTest8l = DocumentBuilderFactory.newInstance();
			dbfTest8l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8l.setNamespaceAware(true);
			dbfTest8l.setValidating(false);

			DocumentBuilder db = dbfTest8l.newDocumentBuilder();
			Document doc = db.parse(isTest8l);
			Node configTest8l = doc.getFirstChild();
			while ((configTest8l != null)
					&& (!"Configuration".equals(configTest8l.getLocalName()))) {
				configTest8l = configTest8l.getNextSibling();
			}

			if (configTest8l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8l!=null?configTest8l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8l = (Element) el;

					Attr langAttr = resourceTest8l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8l.length; i++) {
						String uri = listTest8l[i].getAttributeNS(null, "URI");
						String javaclass = listTest8l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8l.length; i++) {
						String uritrans = tranElemTest8l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8l = algorithms[i];
							String id = elementTest8l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8l.length; i++) {
						String urisign = sigElemsTest8l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8l.length; i++) {
						String javaclass = resolverElemTest8l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8lRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8l = new ArrayList<String>(resolverElemTest8l.length);
					for (int i = 0; i < resolverElemTest8l.length; i++) {
						String javaclass = resolverElemTest8l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8l = resolverElemTest8l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8l != null) && (descriptionTest8l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8l);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8l);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8l.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8l.length; i++) {
						String namespace = nlTest8l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8l ) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", exs8l);
 } catch (ClassNotFoundException enf8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", enf8l);
 } catch (IllegalAccessException eia8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", eia8l);
 } catch (InstantiationException e8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", e8l);
 } catch (javax.xml.parsers.ParserConfigurationException epc8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", epc8l);
 } catch (org.xml.sax.SAXException ese8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", ese8l);
 } catch (java.io.IOException eio8l) {
 LOGGER.error("Crypto8lInit:fileInit:error: ", eio8l);
 }

	}

}
