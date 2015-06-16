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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5cb1,String st5cb2,String st5cb3,String st5cb4,String st5cb5cb,
			                String st5cb6,String st5cb7){
	  stt5cb1=st5cb1;
	  stt5cb2=st5cb2;
	  stt5cb3=st5cb3;
	  stt5cb4=st5cb4;
	  stt5cb5cb=st5cb5cb;
	  stt5cb6=st5cb6;
	  stt5cb7=st5cb7;

	 }
	 
	 private  String stt5cb1;
	 private  String stt5cb2;
	 private String stt5cb3;
	 private  String stt5cb4;
	 private  String stt5cb5cb;
	 private  String stt5cb6;
	 private  String stt5cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5cb1",
					stt5cb1);
			System.setProperty("stt5cb2",
					stt5cb2);
			System.setProperty("stt5cb3",
					stt5cb3);
			System.setProperty("stt5cb4",
					stt5cb4);
			System.setProperty("stt5cb5cb",
					stt5cb5cb);
			System.setProperty("stt5cb6",
					stt5cb6);
			System.setProperty("stt5cb7",
					stt5cb7);

			
			System.setProperty("Test5cbInit",
					"Test5cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5cb5cbInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5cbInit.class/jcp.xml");
			
			System.setProperty("Test5cbss5cb_0x",
					"Test5cbss5cb_0xjcp.xml");
         	System.setProperty("Test5cbss5cb_02",
					"Test5cbss5cb_02xml.config");
			System.setProperty("Test5cbss5cb_03",
					"Test5cbss5cb_03.apache.xml.resource.security.");
		    System.setProperty("Test5cbss5cb_04",
					"Test5cbss5cb_04.resource.");
			System.setProperty("Test5cbss5cb_05cb",
					"Test5cbss5cb_05cb.isInitialized");
			System.setProperty("Test5cbss5cb_06",
					"Test5cbss5cb_06_5cbInit.class/jcp.xml");
			System.setProperty("Test5cbss5cb_07",
					"Test5cbss5cb_07t/resource/jcp.xml");
         	System.setProperty("Test5cbss5cb_08",
					"Test5cbss5cb_08.config");
			System.setProperty("Test5cbss5cb_09",
					"Test5cbss5cb_09.security.");
		    System.setProperty("Test5cbss5cb_0x0",
					"Test5cbss5cb_0x0jcp.xmlapache.");
			System.setProperty("Test5cbss5cb_0xx0",
					"Test5cbss5cb_0xx0.isInitialized");
			System.setProperty("Test5cbss5cb_0xxx0",
					"Test5cbss5cb_0xxx0est5cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5cb5cbInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5cb = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5cb != null) {
				 
				LOGGER.debug("in0in isTest5cb");
				LOGGER.debug("inxin isTest5cb");
				LOGGER.debug("in2in isTest5cb");
				LOGGER.debug("in3in isTest5cb");
				LOGGER.debug("in4in isTest5cb");
				LOGGER.debug("in5cbin isTest5cb");
				LOGGER.debug("in6in isTest5cb");
				LOGGER.debug("in7in isTest5cb");
				LOGGER.debug("in8in isTest5cb");
				LOGGER.debug("in9in isTest5cb");
				LOGGER.debug("inx0in isTest5cb");
				LOGGER.debug("inxxin isTest5cb");
				LOGGER.debug("inx2in isTest5cb");
				LOGGER.debug("inx3in isTest5cb");
				LOGGER.debug("inx4in isTest5cb");
				LOGGER.debug("inx5cbin isTest5cb");
				LOGGER.debug("inx6in isTest5cb");
				LOGGER.debug("inx7in isTest5cb");
				LOGGER.debug("inx8in isTest5cb");
				LOGGER.debug("inx9in isTest5cb");
				LOGGER.debug("in20in isTest5cb");
			}

			 

			DocumentBuilderFactory dbfTest5cb = DocumentBuilderFactory.newInstance();
			dbfTest5cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5cb.setNamespaceAware(true);
			dbfTest5cb.setValidating(false);

			DocumentBuilder db = dbfTest5cb.newDocumentBuilder();
			Document doc = db.parse(isTest5cb);
			Node configTest5cb = doc.getFirstChild();
			while ((configTest5cb != null)
					&& (!"Configuration".equals(configTest5cb.getLocalName()))) {
				configTest5cb = configTest5cb.getNextSibling();
			}

			if (configTest5cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5cb!=null?configTest5cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5cb = (Element) el;

					Attr langAttr = resourceTest5cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5cb.length; i++) {
						String uri = listTest5cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest5cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5cb.length; i++) {
						String uritrans = tranElemTest5cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5cb = algorithms[i];
							String id = elementTest5cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5cb.length; i++) {
						String urisign = sigElemsTest5cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5cb.length; i++) {
						String javaclass = resolverElemTest5cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5cbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5cb = new ArrayList<String>(resolverElemTest5cb.length);
					for (int i = 0; i < resolverElemTest5cb.length; i++) {
						String javaclass = resolverElemTest5cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5cb = resolverElemTest5cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5cb != null) && (descriptionTest5cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5cb);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5cb);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5cb.length; i++) {
						String namespace = nlTest5cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5cb ) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", exs5cb);
 } catch (ClassNotFoundException enf5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", enf5cb);
 } catch (IllegalAccessException eia5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", eia5cb);
 } catch (InstantiationException e5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", e5cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", epc5cb);
 } catch (org.xml.sax.SAXException ese5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", ese5cb);
 } catch (java.io.IOException eio5cb) {
 LOGGER.error("Crypto5cbInit:fileInit:error: ", eio5cb);
 }

	}

}
