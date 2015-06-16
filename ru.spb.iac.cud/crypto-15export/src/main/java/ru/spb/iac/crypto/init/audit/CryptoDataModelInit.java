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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7i1,String st7i2,String st7i3,String st7i4,String st7i5,
			                String st7i6,String st7i7i){
	  stt7i1=st7i1;
	  stt7i2=st7i2;
	  stt7i3=st7i3;
	  stt7i4=st7i4;
	  stt7i5=st7i5;
	  stt7i6=st7i6;
	  stt7i7i=st7i7i;

	 }
	 
	 private  String stt7i1;
	 private  String stt7i2;
	 private String stt7i3;
	 private  String stt7i4;
	 private  String stt7i5;
	 private  String stt7i6;
	 private  String stt7i7i;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7i1",
					stt7i1);
			System.setProperty("stt7i2",
					stt7i2);
			System.setProperty("stt7i3",
					stt7i3);
			System.setProperty("stt7i4",
					stt7i4);
			System.setProperty("stt7i5",
					stt7i5);
			System.setProperty("stt7i6",
					stt7i6);
			System.setProperty("stt7i7i",
					stt7i7i);

			
			System.setProperty("Test7iInit",
					"Test7iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7iInit.class/jcp.xml");
			
			System.setProperty("Test7iss7i_0x",
					"Test7iss7i_0xjcp.xml");
         	System.setProperty("Test7iss7i_02",
					"Test7iss7i_02xml.config");
			System.setProperty("Test7iss7i_03",
					"Test7iss7i_03.apache.xml.resource.security.");
		    System.setProperty("Test7iss7i_04",
					"Test7iss7i_04.resource.");
			System.setProperty("Test7iss7i_05",
					"Test7iss7i_05.isInitialized");
			System.setProperty("Test7iss7i_06",
					"Test7iss7i_06_7iInit.class/jcp.xml");
			System.setProperty("Test7iss7i_07i",
					"Test7iss7i_07it/resource/jcp.xml");
         	System.setProperty("Test7iss7i_08",
					"Test7iss7i_08.config");
			System.setProperty("Test7iss7i_09",
					"Test7iss7i_09.security.");
		    System.setProperty("Test7iss7i_0x0",
					"Test7iss7i_0x0jcp.xmlapache.");
			System.setProperty("Test7iss7i_0xx0",
					"Test7iss7i_0xx0.isInitialized");
			System.setProperty("Test7iss7i_0xxx0",
					"Test7iss7i_0xxx0est7iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7i = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7i != null) {
				 
				LOGGER.debug("in0in isTest7i");
				LOGGER.debug("inxin isTest7i");
				LOGGER.debug("in2in isTest7i");
				LOGGER.debug("in3in isTest7i");
				LOGGER.debug("in4in isTest7i");
				LOGGER.debug("in5in isTest7i");
				LOGGER.debug("in6in isTest7i");
				LOGGER.debug("in7iin isTest7i");
				LOGGER.debug("in8in isTest7i");
				LOGGER.debug("in9in isTest7i");
				LOGGER.debug("inx0in isTest7i");
				LOGGER.debug("inxxin isTest7i");
				LOGGER.debug("inx2in isTest7i");
				LOGGER.debug("inx3in isTest7i");
				LOGGER.debug("inx4in isTest7i");
				LOGGER.debug("inx5in isTest7i");
				LOGGER.debug("inx6in isTest7i");
				LOGGER.debug("inx7iin isTest7i");
				LOGGER.debug("inx8in isTest7i");
				LOGGER.debug("inx9in isTest7i");
				LOGGER.debug("in20in isTest7i");
			}

			 

			DocumentBuilderFactory dbfTest7i = DocumentBuilderFactory.newInstance();
			dbfTest7i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7i.setNamespaceAware(true);
			dbfTest7i.setValidating(false);

			DocumentBuilder db = dbfTest7i.newDocumentBuilder();
			Document doc = db.parse(isTest7i);
			Node configTest7i = doc.getFirstChild();
			while ((configTest7i != null)
					&& (!"Configuration".equals(configTest7i.getLocalName()))) {
				configTest7i = configTest7i.getNextSibling();
			}

			if (configTest7i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7i!=null?configTest7i.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7i = (Element) el;

					Attr langAttr = resourceTest7i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7i.length; i++) {
						String uri = listTest7i[i].getAttributeNS(null, "URI");
						String javaclass = listTest7i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7i.length; i++) {
						String uritrans = tranElemTest7i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7i = algorithms[i];
							String id = elementTest7i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7i.length; i++) {
						String urisign = sigElemsTest7i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7i.length; i++) {
						String javaclass = resolverElemTest7i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7iRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest7i = new ArrayList<String>(resolverElemTest7i.length);
					for (int i = 0; i < resolverElemTest7i.length; i++) {
						String javaclass = resolverElemTest7i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7i = resolverElemTest7i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7i != null) && (descriptionTest7i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7i);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7i);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7i.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest7i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7i.length; i++) {
						String namespace = nlTest7i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs7i ) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", exs7i);
 } catch (ClassNotFoundException enf7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", enf7i);
 } catch (IllegalAccessException eia7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", eia7i);
 } catch (InstantiationException e7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", e7i);
 } catch (javax.xml.parsers.ParserConfigurationException epc7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", epc7i);
 } catch (org.xml.sax.SAXException ese7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", ese7i);
 } catch (java.io.IOException eio7i) {
 LOGGER.error("Crypto7iInit:fileInit:error: ", eio7i);
 }

	}

}
