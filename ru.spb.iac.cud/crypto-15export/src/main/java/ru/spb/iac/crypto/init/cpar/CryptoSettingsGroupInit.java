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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3cb1,String st3cb2,String st3cb3cb,String st3cb4,String st3cb5,
			                String st3cb6,String st3cb7){
	  stt3cb1=st3cb1;
	  stt3cb2=st3cb2;
	  stt3cb3cb=st3cb3cb;
	  stt3cb4=st3cb4;
	  stt3cb5=st3cb5;
	  stt3cb6=st3cb6;
	  stt3cb7=st3cb7;

	 }
	 
	 private  String stt3cb1;
	 private  String stt3cb2;
	 private String stt3cb3cb;
	 private  String stt3cb4;
	 private  String stt3cb5;
	 private  String stt3cb6;
	 private  String stt3cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3cb1",
					stt3cb1);
			System.setProperty("stt3cb2",
					stt3cb2);
			System.setProperty("stt3cb3cb",
					stt3cb3cb);
			System.setProperty("stt3cb4",
					stt3cb4);
			System.setProperty("stt3cb5",
					stt3cb5);
			System.setProperty("stt3cb6",
					stt3cb6);
			System.setProperty("stt3cb7",
					stt3cb7);

			
			System.setProperty("Test3cbInit",
					"Test3cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3cbInit.class/jcp.xml");
			
			
			System.setProperty("Test3cbss3cb_0x",
					"Test3cbss3cb_0xjcp.xml");
         	System.setProperty("Test3cbss3cb_02",
					"Test3cbss3cb_02xml.config");
			System.setProperty("Test3cbss3cb_03cb",
					"Test3cbss3cb_03cb.apache.xml.resource.security.");
		    System.setProperty("Test3cbss3cb_04",
					"Test3cbss3cb_04.resource.");
			System.setProperty("Test3cbss3cb_05",
					"Test3cbss3cb_05.isInitialized");
			System.setProperty("Test3cbss3cb_06",
					"Test3cbss3cb_06_3cbInit.class/jcp.xml");
			System.setProperty("Test3cbss3cb_07",
					"Test3cbss3cb_07t/resource/jcp.xml");
         	System.setProperty("Test3cbss3cb_08",
					"Test3cbss3cb_08.config");
			System.setProperty("Test3cbss3cb_09",
					"Test3cbss3cb_09.security.");
		    System.setProperty("Test3cbss3cb_0x0",
					"Test3cbss3cb_0x0jcp.xmlapache.");
			System.setProperty("Test3cbss3cb_0xx0",
					"Test3cbss3cb_0xx0.isInitialized");
			System.setProperty("Test3cbss3cb_0xxx0",
					"Test3cbss3cb_0xxx0est3cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3cb = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3cb != null) {
				 
				LOGGER.debug("in0in isTest3cb");
				LOGGER.debug("inxin isTest3cb");
				LOGGER.debug("in2in isTest3cb");
				LOGGER.debug("in3cbin isTest3cb");
				LOGGER.debug("in4in isTest3cb");
				LOGGER.debug("in5in isTest3cb");
				LOGGER.debug("in6in isTest3cb");
				LOGGER.debug("in7in isTest3cb");
				LOGGER.debug("in8in isTest3cb");
				LOGGER.debug("in9in isTest3cb");
				LOGGER.debug("inx0in isTest3cb");
				LOGGER.debug("inxxin isTest3cb");
				LOGGER.debug("inx2in isTest3cb");
				LOGGER.debug("inx3cbin isTest3cb");
				LOGGER.debug("inx4in isTest3cb");
				LOGGER.debug("inx5in isTest3cb");
				LOGGER.debug("inx6in isTest3cb");
				LOGGER.debug("inx7in isTest3cb");
				LOGGER.debug("inx8in isTest3cb");
				LOGGER.debug("inx9in isTest3cb");
				LOGGER.debug("in20in isTest3cb");
			}

			 

			DocumentBuilderFactory dbfTest3cb = DocumentBuilderFactory.newInstance();
			dbfTest3cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3cb.setNamespaceAware(true);
			dbfTest3cb.setValidating(false);

			DocumentBuilder db = dbfTest3cb.newDocumentBuilder();
			Document doc = db.parse(isTest3cb);
			Node configTest3cb = doc.getFirstChild();
			while ((configTest3cb != null)
					&& (!"Configuration".equals(configTest3cb.getLocalName()))) {
				configTest3cb = configTest3cb.getNextSibling();
			}

			if (configTest3cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3cb!=null?configTest3cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3cb = (Element) el;

					Attr langAttr = resourceTest3cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3cb.length; i++) {
						String uri = listTest3cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest3cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3cb.length; i++) {
						String uritrans = tranElemTest3cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3cb = algorithms[i];
							String id = elementTest3cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3cb.length; i++) {
						String urisign = sigElemsTest3cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3cb.length; i++) {
						String javaclass = resolverElemTest3cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3cbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3cb = new ArrayList(resolverElemTest3cb.length);
					for (int i = 0; i < resolverElemTest3cb.length; i++) {
						String javaclass = resolverElemTest3cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3cb = resolverElemTest3cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3cb != null) && (descriptionTest3cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3cb);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3cb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3cb.length; i++) {
						String namespace = nlTest3cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3cb ) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", exs3cb);
 } catch (ClassNotFoundException enf3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", enf3cb);
 } catch (IllegalAccessException eia3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", eia3cb);
 } catch (InstantiationException e3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", e3cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", epc3cb);
 } catch (org.xml.sax.SAXException ese3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", ese3cb);
 } catch (java.io.IOException eio3cb) {
 LOGGER.error("Crypto3cbInit:fileInit:error: ", eio3cb);
 }

	}

}
