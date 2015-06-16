package ru.spb.iac.crypto.init.user;

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
	 
	 
	 public CryptoStateHolderInit(String st5eb1,String st5eb2,String st5eb3,String st5eb4,String st5eb5eb,
			                String st5eb6,String st5eb7){
	  stt5eb1=st5eb1;
	  stt5eb2=st5eb2;
	  stt5eb3=st5eb3;
	  stt5eb4=st5eb4;
	  stt5eb5eb=st5eb5eb;
	  stt5eb6=st5eb6;
	  stt5eb7=st5eb7;

	 }
	 
	 private  String stt5eb1;
	 private  String stt5eb2;
	 private String stt5eb3;
	 private  String stt5eb4;
	 private  String stt5eb5eb;
	 private  String stt5eb6;
	 private  String stt5eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5eb1",
					stt5eb1);
			System.setProperty("stt5eb2",
					stt5eb2);
			System.setProperty("stt5eb3",
					stt5eb3);
			System.setProperty("stt5eb4",
					stt5eb4);
			System.setProperty("stt5eb5eb",
					stt5eb5eb);
			System.setProperty("stt5eb6",
					stt5eb6);
			System.setProperty("stt5eb7",
					stt5eb7);

			
			System.setProperty("Test5ebInit",
					"Test5ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5eb5ebInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5ebInit.class/jcp.xml");
			
			System.setProperty("Test5ebss5eb_0x",
					"Test5ebss5eb_0xjcp.xml");
         	System.setProperty("Test5ebss5eb_02",
					"Test5ebss5eb_02xml.config");
			System.setProperty("Test5ebss5eb_03",
					"Test5ebss5eb_03.apache.xml.resource.security.");
		    System.setProperty("Test5ebss5eb_04",
					"Test5ebss5eb_04.resource.");
			System.setProperty("Test5ebss5eb_05eb",
					"Test5ebss5eb_05eb.isInitialized");
			System.setProperty("Test5ebss5eb_06",
					"Test5ebss5eb_06_5ebInit.class/jcp.xml");
			System.setProperty("Test5ebss5eb_07",
					"Test5ebss5eb_07t/resource/jcp.xml");
         	System.setProperty("Test5ebss5eb_08",
					"Test5ebss5eb_08.config");
			System.setProperty("Test5ebss5eb_09",
					"Test5ebss5eb_09.security.");
		    System.setProperty("Test5ebss5eb_0x0",
					"Test5ebss5eb_0x0jcp.xmlapache.");
			System.setProperty("Test5ebss5eb_0xx0",
					"Test5ebss5eb_0xx0.isInitialized");
			System.setProperty("Test5ebss5eb_0xxx0",
					"Test5ebss5eb_0xxx0est5ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5eb5ebInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5eb = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5eb != null) {
				 
				LOGGER.debug("in0in isTest5eb");
				LOGGER.debug("inxin isTest5eb");
				LOGGER.debug("in2in isTest5eb");
				LOGGER.debug("in3in isTest5eb");
				LOGGER.debug("in4in isTest5eb");
				LOGGER.debug("in5ebin isTest5eb");
				LOGGER.debug("in6in isTest5eb");
				LOGGER.debug("in7in isTest5eb");
				LOGGER.debug("in8in isTest5eb");
				LOGGER.debug("in9in isTest5eb");
				LOGGER.debug("inx0in isTest5eb");
				LOGGER.debug("inxxin isTest5eb");
				LOGGER.debug("inx2in isTest5eb");
				LOGGER.debug("inx3in isTest5eb");
				LOGGER.debug("inx4in isTest5eb");
				LOGGER.debug("inx5ebin isTest5eb");
				LOGGER.debug("inx6in isTest5eb");
				LOGGER.debug("inx7in isTest5eb");
				LOGGER.debug("inx8in isTest5eb");
				LOGGER.debug("inx9in isTest5eb");
				LOGGER.debug("in20in isTest5eb");
			}

			 

			DocumentBuilderFactory dbfTest5eb = DocumentBuilderFactory.newInstance();
			dbfTest5eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5eb.setNamespaceAware(true);
			dbfTest5eb.setValidating(false);

			DocumentBuilder db = dbfTest5eb.newDocumentBuilder();
			Document doc = db.parse(isTest5eb);
			Node configTest5eb = doc.getFirstChild();
			while ((configTest5eb != null)
					&& (!"Configuration".equals(configTest5eb.getLocalName()))) {
				configTest5eb = configTest5eb.getNextSibling();
			}

			if (configTest5eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5eb!=null?configTest5eb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5eb = (Element) el;

					Attr langAttr = resourceTest5eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5eb.length; i++) {
						String uri = listTest5eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest5eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5eb.length; i++) {
						String uritrans = tranElemTest5eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5eb = algorithms[i];
							String id = elementTest5eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5eb.length; i++) {
						String urisign = sigElemsTest5eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5eb.length; i++) {
						String javaclass = resolverElemTest5eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5ebRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5eb = new ArrayList<String>(resolverElemTest5eb.length);
					for (int i = 0; i < resolverElemTest5eb.length; i++) {
						String javaclass = resolverElemTest5eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5eb = resolverElemTest5eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5eb != null) && (descriptionTest5eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5eb);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5eb);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5eb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5eb.length; i++) {
						String namespace = nlTest5eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5eb ) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", exs5eb);
 } catch (ClassNotFoundException enf5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", enf5eb);
 } catch (IllegalAccessException eia5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", eia5eb);
 } catch (InstantiationException e5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", e5eb);
 } catch (javax.xml.parsers.ParserConfigurationException epc5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", epc5eb);
 } catch (org.xml.sax.SAXException ese5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", ese5eb);
 } catch (java.io.IOException eio5eb) {
 LOGGER.error("Crypto5ebInit:fileInit:error: ", eio5eb);
 }

	}

}
