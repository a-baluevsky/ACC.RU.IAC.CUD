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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1cb1cb,String st1cb2,String st1cb3,String st1cb4,String st1cb5,
			                String st1cb6,String st1cb7){
	  stt1cb1cb=st1cb1cb;
	  stt1cb2=st1cb2;
	  stt1cb3=st1cb3;
	  stt1cb4=st1cb4;
	  stt1cb5=st1cb5;
	  stt1cb6=st1cb6;
	  stt1cb7=st1cb7;

	 }
	 
	 private  String stt1cb1cb;
	 private  String stt1cb2;
	 private String stt1cb3;
	 private  String stt1cb4;
	 private  String stt1cb5;
	 private  String stt1cb6;
	 private  String stt1cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1cb1cb",
					stt1cb1cb);
			System.setProperty("stt1cb2",
					stt1cb2);
			System.setProperty("stt1cb3",
					stt1cb3);
			System.setProperty("stt1cb4",
					stt1cb4);
			System.setProperty("stt1cb5",
					stt1cb5);
			System.setProperty("stt1cb6",
					stt1cb6);
			System.setProperty("stt1cb7",
					stt1cb7);

			
			System.setProperty("Test1cbInit",
					"Test1cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1cbInit.class/jcp.xml");
			
			System.setProperty("Test1cbss1cb_0x",
					"Test1cbss1cb_0xjcp.xml");
         	System.setProperty("Test1cbss1cb_02",
					"Test1cbss1cb_02xml.config");
			System.setProperty("Test1cbss1cb_03",
					"Test1cbss1cb_03.apache.xml.resource.security.");
		    System.setProperty("Test1cbss1cb_04",
					"Test1cbss1cb_04.resource.");
			System.setProperty("Test1cbss1cb_05",
					"Test1cbss1cb_05.isInitialized");
			System.setProperty("Test1cbss1cb_06",
					"Test1cbss1cb_06_1cbInit.class/jcp.xml");
			System.setProperty("Test1cbss1cb_07",
					"Test1cbss1cb_07t/resource/jcp.xml");
         	System.setProperty("Test1cbss1cb_08",
					"Test1cbss1cb_08.config");
			System.setProperty("Test1cbss1cb_09",
					"Test1cbss1cb_09.security.");
		    System.setProperty("Test1cbss1cb_0x0",
					"Test1cbss1cb_0x0jcp.xmlapache.");
			System.setProperty("Test1cbss1cb_0xx0",
					"Test1cbss1cb_0xx0.isInitialized");
			System.setProperty("Test1cbss1cb_0xxx0",
					"Test1cbss1cb_0xxx0est1cbInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1cb = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1cb != null) {
				 
				LOGGER.debug("in0in isTest1cb");
				LOGGER.debug("in1cbin isTest1cb");
				LOGGER.debug("in2in isTest1cb");
				LOGGER.debug("in3in isTest1cb");
				LOGGER.debug("in4in isTest1cb");
				LOGGER.debug("in5in isTest1cb");
				LOGGER.debug("in6in isTest1cb");
				LOGGER.debug("in7in isTest1cb");
				LOGGER.debug("in8in isTest1cb");
				LOGGER.debug("in9in isTest1cb");
				LOGGER.debug("in1cb0in isTest1cb");
				LOGGER.debug("in1cb1cbin isTest1cb");
				LOGGER.debug("in1cb2in isTest1cb");
				LOGGER.debug("in1cb3in isTest1cb");
				LOGGER.debug("in1cb4in isTest1cb");
				LOGGER.debug("in1cb5in isTest1cb");
				LOGGER.debug("in1cb6in isTest1cb");
				LOGGER.debug("in1cb7in isTest1cb");
				LOGGER.debug("in1cb8in isTest1cb");
				LOGGER.debug("in1cb9in isTest1cb");
				LOGGER.debug("in20in isTest1cb");
			}

			 

			DocumentBuilderFactory dbfTest1cb = DocumentBuilderFactory.newInstance();
			dbfTest1cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1cb.setNamespaceAware(true);
			dbfTest1cb.setValidating(false);

			DocumentBuilder db = dbfTest1cb.newDocumentBuilder();
			Document doc = db.parse(isTest1cb);
			Node configTest1cb = doc.getFirstChild();
			while ((configTest1cb != null)
					&& (!"Configuration".equals(configTest1cb.getLocalName()))) {
				configTest1cb = configTest1cb.getNextSibling();
			}

			if (configTest1cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1cb!=null?configTest1cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1cb = (Element) el;

					Attr langAttr = resourceTest1cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1cb.length; i++) {
						String uri = listTest1cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest1cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1cb.length; i++) {
						String uritrans = tranElemTest1cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1cb = algorithms[i];
							String id = elementTest1cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1cb.length; i++) {
						String urisign = sigElemsTest1cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1cb.length; i++) {
						String javaclass = resolverElemTest1cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1cb-Test1cbRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest1cb = new ArrayList<String>(resolverElemTest1cb.length);
					for (int i = 0; i < resolverElemTest1cb.length; i++) {
						String javaclass = resolverElemTest1cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1cb = resolverElemTest1cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1cb != null) && (descriptionTest1cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1cb);
								LOGGER.debug("Test1cbRegister Resolver: " + javaclass
										+ ": " + descriptionTest1cb);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1cb.length; i++) {
						String namespace = nlTest1cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1cb ) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", exs1cb);
 } catch (ClassNotFoundException enf1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", enf1cb);
 } catch (IllegalAccessException eia1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", eia1cb);
 } catch (InstantiationException e1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", e1cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", epc1cb);
 } catch (org.xml.sax.SAXException ese1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", ese1cb);
 } catch (java.io.IOException eio1cb) {
 LOGGER.error("Crypto1cbInit:fileInit:error: ", eio1cb);
 }

	}

}
