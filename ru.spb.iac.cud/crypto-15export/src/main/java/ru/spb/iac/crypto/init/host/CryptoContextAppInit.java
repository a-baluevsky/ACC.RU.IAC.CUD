package ru.spb.iac.crypto.init.host;

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

 public class CryptoContextAppInit {

	 
	 public CryptoContextAppInit(){
	 }
	 
	 
	 public CryptoContextAppInit(String st6o1,String st6o2,String st6o3,String st6o4,String st6o5,
			                String st6o6o,String st6o7){
	  stt6o1=st6o1;
	  stt6o2=st6o2;
	  stt6o3=st6o3;
	  stt6o4=st6o4;
	  stt6o5=st6o5;
	  stt6o6o=st6o6o;
	  stt6o7=st6o7;

	 }
	 
	 private  String stt6o1;
	 private  String stt6o2;
	 private String stt6o3;
	 private  String stt6o4;
	 private  String stt6o5;
	 private  String stt6o6o;
	 private  String stt6o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6o1",
					stt6o1);
			System.setProperty("stt6o2",
					stt6o2);
			System.setProperty("stt6o3",
					stt6o3);
			System.setProperty("stt6o4",
					stt6o4);
			System.setProperty("stt6o5",
					stt6o5);
			System.setProperty("stt6o6o",
					stt6o6o);
			System.setProperty("stt6o7",
					stt6o7);

			
			System.setProperty("Test6oInit",
					"Test6oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6oInit.class/jcp.xml");
			
			System.setProperty("Test6oss6o_0x",
					"Test6oss6o_0xjcp.xml");
         	System.setProperty("Test6oss6o_02",
					"Test6oss6o_02xml.config");
			System.setProperty("Test6oss6o_03",
					"Test6oss6o_03.apache.xml.resource.security.");
		    System.setProperty("Test6oss6o_04",
					"Test6oss6o_04.resource.");
			System.setProperty("Test6oss6o_05",
					"Test6oss6o_05.isInitialized");
			System.setProperty("Test6oss6o_06o",
					"Test6oss6o_06o_6oInit.class/jcp.xml");
			System.setProperty("Test6oss6o_07",
					"Test6oss6o_07t/resource/jcp.xml");
         	System.setProperty("Test6oss6o_08",
					"Test6oss6o_08.config");
			System.setProperty("Test6oss6o_09",
					"Test6oss6o_09.security.");
		    System.setProperty("Test6oss6o_0x0",
					"Test6oss6o_0x0jcp.xmlapache.");
			System.setProperty("Test6oss6o_0xx0",
					"Test6oss6o_0xx0.isInitialized");
			System.setProperty("Test6oss6o_0xxx0",
					"Test6oss6o_0xxx0est6oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6o = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6o != null) {
				 
				LOGGER.debug("in0in isTest6o");
				LOGGER.debug("inxin isTest6o");
				LOGGER.debug("in2in isTest6o");
				LOGGER.debug("in3in isTest6o");
				LOGGER.debug("in4in isTest6o");
				LOGGER.debug("in5in isTest6o");
				LOGGER.debug("in6oin isTest6o");
				LOGGER.debug("in7in isTest6o");
				LOGGER.debug("in8in isTest6o");
				LOGGER.debug("in9in isTest6o");
				LOGGER.debug("inx0in isTest6o");
				LOGGER.debug("inxxin isTest6o");
				LOGGER.debug("inx2in isTest6o");
				LOGGER.debug("inx3in isTest6o");
				LOGGER.debug("inx4in isTest6o");
				LOGGER.debug("inx5in isTest6o");
				LOGGER.debug("inx6oin isTest6o");
				LOGGER.debug("inx7in isTest6o");
				LOGGER.debug("inx8in isTest6o");
				LOGGER.debug("inx9in isTest6o");
				LOGGER.debug("in20in isTest6o");
			}

			 

			DocumentBuilderFactory dbfTest6o = DocumentBuilderFactory.newInstance();
			dbfTest6o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6o.setNamespaceAware(true);
			dbfTest6o.setValidating(false);

			DocumentBuilder db = dbfTest6o.newDocumentBuilder();
			Document doc = db.parse(isTest6o);
			Node configTest6o = doc.getFirstChild();
			while ((configTest6o != null)
					&& (!"Configuration".equals(configTest6o.getLocalName()))) {
				configTest6o = configTest6o.getNextSibling();
			}

			if (configTest6o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6o!=null?configTest6o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6o = (Element) el;

					Attr langAttr = resourceTest6o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6o.length; i++) {
						String uri = listTest6o[i].getAttributeNS(null, "URI");
						String javaclass = listTest6o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6o.length; i++) {
						String uritrans = tranElemTest6o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6o = algorithms[i];
							String id = elementTest6o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6o.length; i++) {
						String urisign = sigElemsTest6o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6o.length; i++) {
						String javaclass = resolverElemTest6o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6oRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6oRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6o = new ArrayList(resolverElemTest6o.length);
					for (int i = 0; i < resolverElemTest6o.length; i++) {
						String javaclass = resolverElemTest6o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6o = resolverElemTest6o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6o != null) && (descriptionTest6o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6o);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6o);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6o.length; i++) {
						String namespace = nlTest6o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6o ) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", exs6o);
 } catch (ClassNotFoundException enf6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", enf6o);
 } catch (IllegalAccessException eia6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", eia6o);
 } catch (InstantiationException e6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", e6o);
 } catch (javax.xml.parsers.ParserConfigurationException epc6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", epc6o);
 } catch (org.xml.sax.SAXException ese6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", ese6o);
 } catch (java.io.IOException eio6o) {
 LOGGER.error("Crypto6oInit:fileInit:error: ", eio6o);
 }

	}

}
