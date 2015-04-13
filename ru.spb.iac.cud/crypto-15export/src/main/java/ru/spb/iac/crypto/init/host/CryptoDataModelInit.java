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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7o1,String st7o2,String st7o3,String st7o4,String st7o5,
			                String st7o6,String st7o7o){
	  stt7o1=st7o1;
	  stt7o2=st7o2;
	  stt7o3=st7o3;
	  stt7o4=st7o4;
	  stt7o5=st7o5;
	  stt7o6=st7o6;
	  stt7o7o=st7o7o;

	 }
	 
	 private  String stt7o1;
	 private  String stt7o2;
	 private String stt7o3;
	 private  String stt7o4;
	 private  String stt7o5;
	 private  String stt7o6;
	 private  String stt7o7o;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7o1",
					stt7o1);
			System.setProperty("stt7o2",
					stt7o2);
			System.setProperty("stt7o3",
					stt7o3);
			System.setProperty("stt7o4",
					stt7o4);
			System.setProperty("stt7o5",
					stt7o5);
			System.setProperty("stt7o6",
					stt7o6);
			System.setProperty("stt7o7o",
					stt7o7o);

			
			System.setProperty("Test7oInit",
					"Test7oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7oInit.class/jcp.xml");
			
			System.setProperty("Test7oss7o_0x",
					"Test7oss7o_0xjcp.xml");
         	System.setProperty("Test7oss7o_02",
					"Test7oss7o_02xml.config");
			System.setProperty("Test7oss7o_03",
					"Test7oss7o_03.apache.xml.resource.security.");
		    System.setProperty("Test7oss7o_04",
					"Test7oss7o_04.resource.");
			System.setProperty("Test7oss7o_05",
					"Test7oss7o_05.isInitialized");
			System.setProperty("Test7oss7o_06",
					"Test7oss7o_06_7oInit.class/jcp.xml");
			System.setProperty("Test7oss7o_07o",
					"Test7oss7o_07ot/resource/jcp.xml");
         	System.setProperty("Test7oss7o_08",
					"Test7oss7o_08.config");
			System.setProperty("Test7oss7o_09",
					"Test7oss7o_09.security.");
		    System.setProperty("Test7oss7o_0x0",
					"Test7oss7o_0x0jcp.xmlapache.");
			System.setProperty("Test7oss7o_0xx0",
					"Test7oss7o_0xx0.isInitialized");
			System.setProperty("Test7oss7o_0xxx0",
					"Test7oss7o_0xxx0est7oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7o = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7o != null) {
				 
				LOGGER.debug("in0in isTest7o");
				LOGGER.debug("inxin isTest7o");
				LOGGER.debug("in2in isTest7o");
				LOGGER.debug("in3in isTest7o");
				LOGGER.debug("in4in isTest7o");
				LOGGER.debug("in5in isTest7o");
				LOGGER.debug("in6in isTest7o");
				LOGGER.debug("in7oin isTest7o");
				LOGGER.debug("in8in isTest7o");
				LOGGER.debug("in9in isTest7o");
				LOGGER.debug("inx0in isTest7o");
				LOGGER.debug("inxxin isTest7o");
				LOGGER.debug("inx2in isTest7o");
				LOGGER.debug("inx3in isTest7o");
				LOGGER.debug("inx4in isTest7o");
				LOGGER.debug("inx5in isTest7o");
				LOGGER.debug("inx6in isTest7o");
				LOGGER.debug("inx7oin isTest7o");
				LOGGER.debug("inx8in isTest7o");
				LOGGER.debug("inx9in isTest7o");
				LOGGER.debug("in20in isTest7o");
			}

			 

			DocumentBuilderFactory dbfTest7o = DocumentBuilderFactory.newInstance();
			dbfTest7o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7o.setNamespaceAware(true);
			dbfTest7o.setValidating(false);

			DocumentBuilder db = dbfTest7o.newDocumentBuilder();
			Document doc = db.parse(isTest7o);
			Node configTest7o = doc.getFirstChild();
			while ((configTest7o != null)
					&& (!"Configuration".equals(configTest7o.getLocalName()))) {
				configTest7o = configTest7o.getNextSibling();
			}

			if (configTest7o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7o!=null?configTest7o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7o = (Element) el;

					Attr langAttr = resourceTest7o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7o.length; i++) {
						String uri = listTest7o[i].getAttributeNS(null, "URI");
						String javaclass = listTest7o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7o.length; i++) {
						String uritrans = tranElemTest7o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7o = algorithms[i];
							String id = elementTest7o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7o.length; i++) {
						String urisign = sigElemsTest7o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7o.length; i++) {
						String javaclass = resolverElemTest7o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7oRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7o = new ArrayList(resolverElemTest7o.length);
					for (int i = 0; i < resolverElemTest7o.length; i++) {
						String javaclass = resolverElemTest7o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7o = resolverElemTest7o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7o != null) && (descriptionTest7o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7o);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7o);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7o.length; i++) {
						String namespace = nlTest7o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7o ) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", exs7o);
 } catch (ClassNotFoundException enf7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", enf7o);
 } catch (IllegalAccessException eia7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", eia7o);
 } catch (InstantiationException e7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", e7o);
 } catch (javax.xml.parsers.ParserConfigurationException epc7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", epc7o);
 } catch (org.xml.sax.SAXException ese7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", ese7o);
 } catch (java.io.IOException eio7o) {
 LOGGER.error("Crypto7oInit:fileInit:error: ", eio7o);
 }

	}

}
