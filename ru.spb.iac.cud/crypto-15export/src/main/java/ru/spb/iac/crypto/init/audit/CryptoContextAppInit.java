package ru.spb.iac.crypto.init.audit;

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
	 
	 
	 public CryptoContextAppInit(String st6i1,String st6i2,String st6i3,String st6i4,String st6i5,
			                String st6i6i,String st6i7){
	  stt6i1=st6i1;
	  stt6i2=st6i2;
	  stt6i3=st6i3;
	  stt6i4=st6i4;
	  stt6i5=st6i5;
	  stt6i6i=st6i6i;
	  stt6i7=st6i7;

	 }
	 
	 private  String stt6i1;
	 private  String stt6i2;
	 private String stt6i3;
	 private  String stt6i4;
	 private  String stt6i5;
	 private  String stt6i6i;
	 private  String stt6i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoContextAppInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt6i1",
					stt6i1);
			System.setProperty("stt6i2",
					stt6i2);
			System.setProperty("stt6i3",
					stt6i3);
			System.setProperty("stt6i4",
					stt6i4);
			System.setProperty("stt6i5",
					stt6i5);
			System.setProperty("stt6i6i",
					stt6i6i);
			System.setProperty("stt6i7",
					stt6i7);

			
			System.setProperty("Test6iInit",
					"Test6iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto6i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest6iInit.class/jcp.xml");
			
			System.setProperty("Test6iss6i_0x",
					"Test6iss6i_0xjcp.xml");
         	System.setProperty("Test6iss6i_02",
					"Test6iss6i_02xml.config");
			System.setProperty("Test6iss6i_03",
					"Test6iss6i_03.apache.xml.resource.security.");
		    System.setProperty("Test6iss6i_04",
					"Test6iss6i_04.resource.");
			System.setProperty("Test6iss6i_05",
					"Test6iss6i_05.isInitialized");
			System.setProperty("Test6iss6i_06i",
					"Test6iss6i_06i_6iInit.class/jcp.xml");
			System.setProperty("Test6iss6i_07",
					"Test6iss6i_07t/resource/jcp.xml");
         	System.setProperty("Test6iss6i_08",
					"Test6iss6i_08.config");
			System.setProperty("Test6iss6i_09",
					"Test6iss6i_09.security.");
		    System.setProperty("Test6iss6i_0x0",
					"Test6iss6i_0x0jcp.xmlapache.");
			System.setProperty("Test6iss6i_0xx0",
					"Test6iss6i_0xx0.isInitialized");
			System.setProperty("Test6iss6i_0xxx0",
					"Test6iss6i_0xxx0est6iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto6i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest6i = CryptoContextAppInit.class.getResourceAsStream("/jcp.xml");

			if (isTest6i != null) {
				 
				LOGGER.debug("in0in isTest6i");
				LOGGER.debug("inxin isTest6i");
				LOGGER.debug("in2in isTest6i");
				LOGGER.debug("in3in isTest6i");
				LOGGER.debug("in4in isTest6i");
				LOGGER.debug("in5in isTest6i");
				LOGGER.debug("in6iin isTest6i");
				LOGGER.debug("in7in isTest6i");
				LOGGER.debug("in8in isTest6i");
				LOGGER.debug("in9in isTest6i");
				LOGGER.debug("inx0in isTest6i");
				LOGGER.debug("inxxin isTest6i");
				LOGGER.debug("inx2in isTest6i");
				LOGGER.debug("inx3in isTest6i");
				LOGGER.debug("inx4in isTest6i");
				LOGGER.debug("inx5in isTest6i");
				LOGGER.debug("inx6iin isTest6i");
				LOGGER.debug("inx7in isTest6i");
				LOGGER.debug("inx8in isTest6i");
				LOGGER.debug("inx9in isTest6i");
				LOGGER.debug("in20in isTest6i");
			}

			 

			DocumentBuilderFactory dbfTest6i = DocumentBuilderFactory.newInstance();
			dbfTest6i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest6i.setNamespaceAware(true);
			dbfTest6i.setValidating(false);

			DocumentBuilder db = dbfTest6i.newDocumentBuilder();
			Document doc = db.parse(isTest6i);
			Node configTest6i = doc.getFirstChild();
			while ((configTest6i != null)
					&& (!"Configuration".equals(configTest6i.getLocalName()))) {
				configTest6i = configTest6i.getNextSibling();
			}

			if (configTest6i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest6i!=null?configTest6i.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest6i = (Element) el;

					Attr langAttr = resourceTest6i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest6i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest6i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest6i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest6i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest6i.length; i++) {
						String uri = listTest6i[i].getAttributeNS(null, "URI");
						String javaclass = listTest6i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest6i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest6i.length; i++) {
						String uritrans = tranElemTest6i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest6i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest6i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest6i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest6i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest6i = algorithms[i];
							String id = elementTest6i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest6i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest6i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest6i.length; i++) {
						String urisign = sigElemsTest6i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest6i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest6i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest6i.length; i++) {
						String javaclass = resolverElemTest6i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest6i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test6iRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("jhgTest6iRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test6iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test6iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest6i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest6i = new ArrayList(resolverElemTest6i.length);
					for (int i = 0; i < resolverElemTest6i.length; i++) {
						String javaclass = resolverElemTest6i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest6i = resolverElemTest6i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest6i != null) && (descriptionTest6i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest6i);
								LOGGER.debug("ffRegister Resolver: " + javaclass
										+ ": " + descriptionTest6i);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest6i.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest6i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest6i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest6i.length; i++) {
						String namespace = nlTest6i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest6i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs6i ) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", exs6i);
 } catch (ClassNotFoundException enf6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", enf6i);
 } catch (IllegalAccessException eia6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", eia6i);
 } catch (InstantiationException e6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", e6i);
 } catch (javax.xml.parsers.ParserConfigurationException epc6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", epc6i);
 } catch (org.xml.sax.SAXException ese6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", ese6i);
 } catch (java.io.IOException eio6i) {
 LOGGER.error("Crypto6iInit:fileInit:error: ", eio6i);
 }

	}

}
