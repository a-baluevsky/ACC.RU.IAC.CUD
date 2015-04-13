package ru.spb.iac.crypto.init.cpar;

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
	 
	 
	 public CryptoDataModelInit(String st7cb1,String st7cb2,String st7cb3,String st7cb4,String st7cb5,
			                String st7cb6,String st7cb7cb){
	  stt7cb1=st7cb1;
	  stt7cb2=st7cb2;
	  stt7cb3=st7cb3;
	  stt7cb4=st7cb4;
	  stt7cb5=st7cb5;
	  stt7cb6=st7cb6;
	  stt7cb7cb=st7cb7cb;

	 }
	 
	 private  String stt7cb1;
	 private  String stt7cb2;
	 private String stt7cb3;
	 private  String stt7cb4;
	 private  String stt7cb5;
	 private  String stt7cb6;
	 private  String stt7cb7cb;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7cb1",
					stt7cb1);
			System.setProperty("stt7cb2",
					stt7cb2);
			System.setProperty("stt7cb3",
					stt7cb3);
			System.setProperty("stt7cb4",
					stt7cb4);
			System.setProperty("stt7cb5",
					stt7cb5);
			System.setProperty("stt7cb6",
					stt7cb6);
			System.setProperty("stt7cb7cb",
					stt7cb7cb);

			
			System.setProperty("Test7cbInit",
					"Test7cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7cbInit.class/jcp.xml");
			
			System.setProperty("Test7cbss7cb_0x",
					"Test7cbss7cb_0xjcp.xml");
         	System.setProperty("Test7cbss7cb_02",
					"Test7cbss7cb_02xml.config");
			System.setProperty("Test7cbss7cb_03",
					"Test7cbss7cb_03.apache.xml.resource.security.");
		    System.setProperty("Test7cbss7cb_04",
					"Test7cbss7cb_04.resource.");
			System.setProperty("Test7cbss7cb_05",
					"Test7cbss7cb_05.isInitialized");
			System.setProperty("Test7cbss7cb_06",
					"Test7cbss7cb_06_7cbInit.class/jcp.xml");
			System.setProperty("Test7cbss7cb_07cb",
					"Test7cbss7cb_07cbt/resource/jcp.xml");
         	System.setProperty("Test7cbss7cb_08",
					"Test7cbss7cb_08.config");
			System.setProperty("Test7cbss7cb_09",
					"Test7cbss7cb_09.security.");
		    System.setProperty("Test7cbss7cb_0x0",
					"Test7cbss7cb_0x0jcp.xmlapache.");
			System.setProperty("Test7cbss7cb_0xx0",
					"Test7cbss7cb_0xx0.isInitialized");
			System.setProperty("Test7cbss7cb_0xxx0",
					"Test7cbss7cb_0xxx0est7cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7cb = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7cb != null) {
				 
				LOGGER.debug("in0in isTest7cb");
				LOGGER.debug("inxin isTest7cb");
				LOGGER.debug("in2in isTest7cb");
				LOGGER.debug("in3in isTest7cb");
				LOGGER.debug("in4in isTest7cb");
				LOGGER.debug("in5in isTest7cb");
				LOGGER.debug("in6in isTest7cb");
				LOGGER.debug("in7cbin isTest7cb");
				LOGGER.debug("in8in isTest7cb");
				LOGGER.debug("in9in isTest7cb");
				LOGGER.debug("inx0in isTest7cb");
				LOGGER.debug("inxxin isTest7cb");
				LOGGER.debug("inx2in isTest7cb");
				LOGGER.debug("inx3in isTest7cb");
				LOGGER.debug("inx4in isTest7cb");
				LOGGER.debug("inx5in isTest7cb");
				LOGGER.debug("inx6in isTest7cb");
				LOGGER.debug("inx7cbin isTest7cb");
				LOGGER.debug("inx8in isTest7cb");
				LOGGER.debug("inx9in isTest7cb");
				LOGGER.debug("in20in isTest7cb");
			}

			 

			DocumentBuilderFactory dbfTest7cb = DocumentBuilderFactory.newInstance();
			dbfTest7cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7cb.setNamespaceAware(true);
			dbfTest7cb.setValidating(false);

			DocumentBuilder db = dbfTest7cb.newDocumentBuilder();
			Document doc = db.parse(isTest7cb);
			Node configTest7cb = doc.getFirstChild();
			while ((configTest7cb != null)
					&& (!"Configuration".equals(configTest7cb.getLocalName()))) {
				configTest7cb = configTest7cb.getNextSibling();
			}

			if (configTest7cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7cb!=null?configTest7cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7cb = (Element) el;

					Attr langAttr = resourceTest7cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7cb.length; i++) {
						String uri = listTest7cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest7cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7cb.length; i++) {
						String uritrans = tranElemTest7cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7cb = algorithms[i];
							String id = elementTest7cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7cb.length; i++) {
						String urisign = sigElemsTest7cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7cb.length; i++) {
						String javaclass = resolverElemTest7cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7cbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7cb = new ArrayList(resolverElemTest7cb.length);
					for (int i = 0; i < resolverElemTest7cb.length; i++) {
						String javaclass = resolverElemTest7cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7cb = resolverElemTest7cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7cb != null) && (descriptionTest7cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7cb);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7cb);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7cb.length; i++) {
						String namespace = nlTest7cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7cb ) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", exs7cb);
 } catch (ClassNotFoundException enf7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", enf7cb);
 } catch (IllegalAccessException eia7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", eia7cb);
 } catch (InstantiationException e7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", e7cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", epc7cb);
 } catch (org.xml.sax.SAXException ese7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", ese7cb);
 } catch (java.io.IOException eio7cb) {
 LOGGER.error("Crypto7cbInit:fileInit:error: ", eio7cb);
 }

	}

}
