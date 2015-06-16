package ru.spb.iac.crypto.init;

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
	 
	 
	 public CryptoStateHolderInit(String st51,String st52,String st53,String st54,String st55,
			                String st56,String st57){
	  stt51=st51;
	  stt52=st52;
	  stt53=st53;
	  stt54=st54;
	  stt55=st55;
	  stt56=st56;
	  stt57=st57;

	 }
	 
	 private  String stt51;
	 private  String stt52;
	 private String stt53;
	 private  String stt54;
	 private  String stt55;
	 private  String stt56;
	 private  String stt57;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt51",
					stt51);
			System.setProperty("stt52",
					stt52);
			System.setProperty("stt53",
					stt53);
			System.setProperty("stt54",
					stt54);
			System.setProperty("stt55",
					stt55);
			System.setProperty("stt56",
					stt56);
			System.setProperty("stt57",
					stt57);

			
			System.setProperty("Test5Init",
					"Test5Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto55Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoStateHolderInit.class/jcp.xml");
			
			System.setProperty("Test5ss5_0x",
					"Test5ss5_0xjcp.xml");
         	System.setProperty("Test5ss5_02",
					"Test5ss5_02xml.config");
			System.setProperty("Test5ss5_03",
					"Test5ss5_03.apache.xml.resource.security.");
		    System.setProperty("Test5ss5_04",
					"Test5ss5_04.resource.");
			System.setProperty("Test5ss5_05",
					"Test5ss5_05.isInitialized");
			System.setProperty("Test5ss5_06",
					"Test5ss5_06_5Init.class/jcp.xml");
			System.setProperty("Test5ss5_07",
					"Test5ss5_07t/resource/jcp.xml");
         	System.setProperty("Test5ss5_08",
					"Test5ss5_08.config");
			System.setProperty("Test5ss5_09",
					"Test5ss5_09.security.");
		    System.setProperty("Test5ss5_0x0",
					"Test5ss5_0x0jcp.xmlapache.");
			System.setProperty("Test5ss5_0xx0",
					"Test5ss5_0xx0.isInitialized");
			System.setProperty("Test5ss5_0xxx0",
					"Test5ss5_0xxx0est5Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto55Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5 = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5 != null) {
				 
				LOGGER.debug("in0in isTest5");
				LOGGER.debug("inxin isTest5");
				LOGGER.debug("in2in isTest5");
				LOGGER.debug("in3in isTest5");
				LOGGER.debug("in4in isTest5");
				LOGGER.debug("in5in isTest5");
				LOGGER.debug("in6in isTest5");
				LOGGER.debug("in7in isTest5");
				LOGGER.debug("in8in isTest5");
				LOGGER.debug("in9in isTest5");
				LOGGER.debug("inx0in isTest5");
				LOGGER.debug("inxxin isTest5");
				LOGGER.debug("inx2in isTest5");
				LOGGER.debug("inx3in isTest5");
				LOGGER.debug("inx4in isTest5");
				LOGGER.debug("inx5in isTest5");
				LOGGER.debug("inx6in isTest5");
				LOGGER.debug("inx7in isTest5");
				LOGGER.debug("inx8in isTest5");
				LOGGER.debug("inx9in isTest5");
				LOGGER.debug("in20in isTest5");
			}

			 

			DocumentBuilderFactory dbfTest5 = DocumentBuilderFactory.newInstance();
			dbfTest5.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5.setNamespaceAware(true);
			dbfTest5.setValidating(false);

			DocumentBuilder db = dbfTest5.newDocumentBuilder();
			Document doc = db.parse(isTest5);
			Node configTest5 = doc.getFirstChild();
			while ((configTest5 != null)
					&& (!"Configuration".equals(configTest5.getLocalName()))) {
				configTest5 = configTest5.getNextSibling();
			}

			if (configTest5 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5!=null?configTest5.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5 = (Element) el;

					Attr langAttr = resourceTest5
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5.length; i++) {
						String uri = listTest5[i].getAttributeNS(null, "URI");
						String javaclass = listTest5[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5.length; i++) {
						String uritrans = tranElemTest5[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5 = algorithms[i];
							String id = elementTest5.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5.length; i++) {
						String urisign = sigElemsTest5[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5.length; i++) {
						String javaclass = resolverElemTest5[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5Register Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5 = new ArrayList<String>(resolverElemTest5.length);
					for (int i = 0; i < resolverElemTest5.length; i++) {
						String javaclass = resolverElemTest5[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5 = resolverElemTest5[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5 != null) && (descriptionTest5.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5.length; i++) {
						String namespace = nlTest5[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5 ) {
 LOGGER.error("Crypto5Init:fileInit:error: ", exs5);
 } catch (ClassNotFoundException enf5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", enf5);
 } catch (IllegalAccessException eia5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", eia5);
 } catch (InstantiationException e5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", e5);
 } catch (javax.xml.parsers.ParserConfigurationException epc5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", epc5);
 } catch (org.xml.sax.SAXException ese5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", ese5);
 } catch (java.io.IOException eio5) {
 LOGGER.error("Crypto5Init:fileInit:error: ", eio5);
 }

	}

}
