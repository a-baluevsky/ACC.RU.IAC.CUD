package ru.spb.iac.crypto.init.ugroup;

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
	 
	 
	 public CryptoStateHolderInit(String st5gb1,String st5gb2,String st5gb3,String st5gb4,String st5gb5gb,
			                String st5gb6,String st5gb7){
	  stt5gb1=st5gb1;
	  stt5gb2=st5gb2;
	  stt5gb3=st5gb3;
	  stt5gb4=st5gb4;
	  stt5gb5gb=st5gb5gb;
	  stt5gb6=st5gb6;
	  stt5gb7=st5gb7;

	 }
	 
	 private  String stt5gb1;
	 private  String stt5gb2;
	 private String stt5gb3;
	 private  String stt5gb4;
	 private  String stt5gb5gb;
	 private  String stt5gb6;
	 private  String stt5gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5gb1",
					stt5gb1);
			System.setProperty("stt5gb2",
					stt5gb2);
			System.setProperty("stt5gb3",
					stt5gb3);
			System.setProperty("stt5gb4",
					stt5gb4);
			System.setProperty("stt5gb5gb",
					stt5gb5gb);
			System.setProperty("stt5gb6",
					stt5gb6);
			System.setProperty("stt5gb7",
					stt5gb7);

			
			System.setProperty("Test5gbInit",
					"Test5gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5gb5gbInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5gbInit.class/jcp.xml");
			
			System.setProperty("Test5gbss5gb_0x",
					"Test5gbss5gb_0xjcp.xml");
         	System.setProperty("Test5gbss5gb_02",
					"Test5gbss5gb_02xml.config");
			System.setProperty("Test5gbss5gb_03",
					"Test5gbss5gb_03.apache.xml.resource.security.");
		    System.setProperty("Test5gbss5gb_04",
					"Test5gbss5gb_04.resource.");
			System.setProperty("Test5gbss5gb_05gb",
					"Test5gbss5gb_05gb.isInitialized");
			System.setProperty("Test5gbss5gb_06",
					"Test5gbss5gb_06_5gbInit.class/jcp.xml");
			System.setProperty("Test5gbss5gb_07",
					"Test5gbss5gb_07t/resource/jcp.xml");
         	System.setProperty("Test5gbss5gb_08",
					"Test5gbss5gb_08.config");
			System.setProperty("Test5gbss5gb_09",
					"Test5gbss5gb_09.security.");
		    System.setProperty("Test5gbss5gb_0x0",
					"Test5gbss5gb_0x0jcp.xmlapache.");
			System.setProperty("Test5gbss5gb_0xx0",
					"Test5gbss5gb_0xx0.isInitialized");
			System.setProperty("Test5gbss5gb_0xxx0",
					"Test5gbss5gb_0xxx0est5gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5gb5gbInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5gb = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5gb != null) {
				 
				LOGGER.debug("in0in isTest5gb");
				LOGGER.debug("inxin isTest5gb");
				LOGGER.debug("in2in isTest5gb");
				LOGGER.debug("in3in isTest5gb");
				LOGGER.debug("in4in isTest5gb");
				LOGGER.debug("in5gbin isTest5gb");
				LOGGER.debug("in6in isTest5gb");
				LOGGER.debug("in7in isTest5gb");
				LOGGER.debug("in8in isTest5gb");
				LOGGER.debug("in9in isTest5gb");
				LOGGER.debug("inx0in isTest5gb");
				LOGGER.debug("inxxin isTest5gb");
				LOGGER.debug("inx2in isTest5gb");
				LOGGER.debug("inx3in isTest5gb");
				LOGGER.debug("inx4in isTest5gb");
				LOGGER.debug("inx5gbin isTest5gb");
				LOGGER.debug("inx6in isTest5gb");
				LOGGER.debug("inx7in isTest5gb");
				LOGGER.debug("inx8in isTest5gb");
				LOGGER.debug("inx9in isTest5gb");
				LOGGER.debug("in20in isTest5gb");
			}

			 

			DocumentBuilderFactory dbfTest5gb = DocumentBuilderFactory.newInstance();
			dbfTest5gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5gb.setNamespaceAware(true);
			dbfTest5gb.setValidating(false);

			DocumentBuilder db = dbfTest5gb.newDocumentBuilder();
			Document doc = db.parse(isTest5gb);
			Node configTest5gb = doc.getFirstChild();
			while ((configTest5gb != null)
					&& (!"Configuration".equals(configTest5gb.getLocalName()))) {
				configTest5gb = configTest5gb.getNextSibling();
			}

			if (configTest5gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5gb!=null?configTest5gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5gb = (Element) el;

					Attr langAttr = resourceTest5gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5gb.length; i++) {
						String uri = listTest5gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest5gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5gb.length; i++) {
						String uritrans = tranElemTest5gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5gb = algorithms[i];
							String id = elementTest5gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5gb.length; i++) {
						String urisign = sigElemsTest5gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5gb.length; i++) {
						String javaclass = resolverElemTest5gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5gbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5gb = new ArrayList(resolverElemTest5gb.length);
					for (int i = 0; i < resolverElemTest5gb.length; i++) {
						String javaclass = resolverElemTest5gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5gb = resolverElemTest5gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5gb != null) && (descriptionTest5gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5gb);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5gb);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5gb.length; i++) {
						String namespace = nlTest5gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5gb ) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", exs5gb);
 } catch (ClassNotFoundException enf5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", enf5gb);
 } catch (IllegalAccessException eia5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", eia5gb);
 } catch (InstantiationException e5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", e5gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", epc5gb);
 } catch (org.xml.sax.SAXException ese5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", ese5gb);
 } catch (java.io.IOException eio5gb) {
 LOGGER.error("Crypto5gbInit:fileInit:error: ", eio5gb);
 }

	}

}
