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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9o1,String st9o2,String st9o3,String st9o4,String st9o5,
			                String st9o6,String st9o7){
	  stt9o1=st9o1;
	  stt9o2=st9o2;
	  stt9o3=st9o3;
	  stt9o4=st9o4;
	  stt9o5=st9o5;
	  stt9o6=st9o6;
	  stt9o7=st9o7;

	 }
	 
	 private  String stt9o1;
	 private  String stt9o2;
	 private String stt9o3;
	 private  String stt9o4;
	 private  String stt9o5;
	 private  String stt9o6;
	 private  String stt9o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9o1",
					stt9o1);
			System.setProperty("stt9o2",
					stt9o2);
			System.setProperty("stt9o3",
					stt9o3);
			System.setProperty("stt9o4",
					stt9o4);
			System.setProperty("stt9o5",
					stt9o5);
			System.setProperty("stt9o6",
					stt9o6);
			System.setProperty("stt9o7",
					stt9o7);

			
			System.setProperty("Test9oInit",
					"Test9oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9oInit.class/jcp.xml");
			
			
			System.setProperty("Test9oss9o_0x",
					"Test9oss9o_0xjcp.xml");
         	System.setProperty("Test9oss9o_02",
					"Test9oss9o_02xml.config");
			System.setProperty("Test9oss9o_03",
					"Test9oss9o_03.apache.xml.resource.security.");
		    System.setProperty("Test9oss9o_04",
					"Test9oss9o_04.resource.");
			System.setProperty("Test9oss9o_05",
					"Test9oss9o_05.isInitialized");
			System.setProperty("Test9oss9o_06",
					"Test9oss9o_06_9oInit.class/jcp.xml");
			System.setProperty("Test9oss9o_07",
					"Test9oss9o_07t/resource/jcp.xml");
         	System.setProperty("Test9oss9o_08",
					"Test9oss9o_08.config");
			System.setProperty("Test9oss9o_09o",
					"Test9oss9o_09o.security.");
		    System.setProperty("Test9oss9o_0x0",
					"Test9oss9o_0x0jcp.xmlapache.");
			System.setProperty("Test9oss9o_0xx0",
					"Test9oss9o_0xx0.isInitialized");
			System.setProperty("Test9oss9o_0xxx0",
					"Test9oss9o_0xxx0est9oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9o = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9o != null) {
				 
				LOGGER.debug("in0in isTest9o");
				LOGGER.debug("inxin isTest9o");
				LOGGER.debug("in2in isTest9o");
				LOGGER.debug("in3in isTest9o");
				LOGGER.debug("in4in isTest9o");
				LOGGER.debug("in5in isTest9o");
				LOGGER.debug("in6in isTest9o");
				LOGGER.debug("in7in isTest9o");
				LOGGER.debug("in8in isTest9o");
				LOGGER.debug("in9oin isTest9o");
				LOGGER.debug("inx0in isTest9o");
				LOGGER.debug("inxxin isTest9o");
				LOGGER.debug("inx2in isTest9o");
				LOGGER.debug("inx3in isTest9o");
				LOGGER.debug("inx4in isTest9o");
				LOGGER.debug("inx5in isTest9o");
				LOGGER.debug("inx6in isTest9o");
				LOGGER.debug("inx7in isTest9o");
				LOGGER.debug("inx8in isTest9o");
				LOGGER.debug("inx9oin isTest9o");
				LOGGER.debug("in20in isTest9o");
			}

			 

			DocumentBuilderFactory dbfTest9o = DocumentBuilderFactory.newInstance();
			dbfTest9o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9o.setNamespaceAware(true);
			dbfTest9o.setValidating(false);

			DocumentBuilder db = dbfTest9o.newDocumentBuilder();
			Document doc = db.parse(isTest9o);
			Node configTest9o = doc.getFirstChild();
			while ((configTest9o != null)
					&& (!"Configuration".equals(configTest9o.getLocalName()))) {
				configTest9o = configTest9o.getNextSibling();
			}

			if (configTest9o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9o!=null?configTest9o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9o = (Element) el;

					Attr langAttr = resourceTest9o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9o.length; i++) {
						String uri = listTest9o[i].getAttributeNS(null, "URI");
						String javaclass = listTest9o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9o.length; i++) {
						String uritrans = tranElemTest9o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9o = algorithms[i];
							String id = elementTest9o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9o.length; i++) {
						String urisign = sigElemsTest9o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9o.length; i++) {
						String javaclass = resolverElemTest9o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9oRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9o = new ArrayList<String>(resolverElemTest9o.length);
					for (int i = 0; i < resolverElemTest9o.length; i++) {
						String javaclass = resolverElemTest9o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9o = resolverElemTest9o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9o != null) && (descriptionTest9o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9o);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9o);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9o.length; i++) {
						String namespace = nlTest9o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9o ) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", exs9o);
 } catch (ClassNotFoundException enf9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", enf9o);
 } catch (IllegalAccessException eia9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", eia9o);
 } catch (InstantiationException e9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", e9o);
 } catch (javax.xml.parsers.ParserConfigurationException epc9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", epc9o);
 } catch (org.xml.sax.SAXException ese9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", ese9o);
 } catch (java.io.IOException eio9o) {
 LOGGER.error("Crypto9oInit:fileInit:error: ", eio9o);
 }

	}

}
