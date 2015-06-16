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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9gb1,String st9gb2,String st9gb3,String st9gb4,String st9gb5,
			                String st9gb6,String st9gb7){
	  stt9gb1=st9gb1;
	  stt9gb2=st9gb2;
	  stt9gb3=st9gb3;
	  stt9gb4=st9gb4;
	  stt9gb5=st9gb5;
	  stt9gb6=st9gb6;
	  stt9gb7=st9gb7;

	 }
	 
	 private  String stt9gb1;
	 private  String stt9gb2;
	 private String stt9gb3;
	 private  String stt9gb4;
	 private  String stt9gb5;
	 private  String stt9gb6;
	 private  String stt9gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9gb1",
					stt9gb1);
			System.setProperty("stt9gb2",
					stt9gb2);
			System.setProperty("stt9gb3",
					stt9gb3);
			System.setProperty("stt9gb4",
					stt9gb4);
			System.setProperty("stt9gb5",
					stt9gb5);
			System.setProperty("stt9gb6",
					stt9gb6);
			System.setProperty("stt9gb7",
					stt9gb7);

			
			System.setProperty("Test9gbInit",
					"Test9gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9gbInit.class/jcp.xml");
			
			
			System.setProperty("Test9gbss9gb_0x",
					"Test9gbss9gb_0xjcp.xml");
         	System.setProperty("Test9gbss9gb_02",
					"Test9gbss9gb_02xml.config");
			System.setProperty("Test9gbss9gb_03",
					"Test9gbss9gb_03.apache.xml.resource.security.");
		    System.setProperty("Test9gbss9gb_04",
					"Test9gbss9gb_04.resource.");
			System.setProperty("Test9gbss9gb_05",
					"Test9gbss9gb_05.isInitialized");
			System.setProperty("Test9gbss9gb_06",
					"Test9gbss9gb_06_9gbInit.class/jcp.xml");
			System.setProperty("Test9gbss9gb_07",
					"Test9gbss9gb_07t/resource/jcp.xml");
         	System.setProperty("Test9gbss9gb_08",
					"Test9gbss9gb_08.config");
			System.setProperty("Test9gbss9gb_09gb",
					"Test9gbss9gb_09gb.security.");
		    System.setProperty("Test9gbss9gb_0x0",
					"Test9gbss9gb_0x0jcp.xmlapache.");
			System.setProperty("Test9gbss9gb_0xx0",
					"Test9gbss9gb_0xx0.isInitialized");
			System.setProperty("Test9gbss9gb_0xxx0",
					"Test9gbss9gb_0xxx0est9gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9gb = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9gb != null) {
				 
				LOGGER.debug("in0in isTest9gb");
				LOGGER.debug("inxin isTest9gb");
				LOGGER.debug("in2in isTest9gb");
				LOGGER.debug("in3in isTest9gb");
				LOGGER.debug("in4in isTest9gb");
				LOGGER.debug("in5in isTest9gb");
				LOGGER.debug("in6in isTest9gb");
				LOGGER.debug("in7in isTest9gb");
				LOGGER.debug("in8in isTest9gb");
				LOGGER.debug("in9gbin isTest9gb");
				LOGGER.debug("inx0in isTest9gb");
				LOGGER.debug("inxxin isTest9gb");
				LOGGER.debug("inx2in isTest9gb");
				LOGGER.debug("inx3in isTest9gb");
				LOGGER.debug("inx4in isTest9gb");
				LOGGER.debug("inx5in isTest9gb");
				LOGGER.debug("inx6in isTest9gb");
				LOGGER.debug("inx7in isTest9gb");
				LOGGER.debug("inx8in isTest9gb");
				LOGGER.debug("inx9gbin isTest9gb");
				LOGGER.debug("in20in isTest9gb");
			}

			 

			DocumentBuilderFactory dbfTest9gb = DocumentBuilderFactory.newInstance();
			dbfTest9gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9gb.setNamespaceAware(true);
			dbfTest9gb.setValidating(false);

			DocumentBuilder db = dbfTest9gb.newDocumentBuilder();
			Document doc = db.parse(isTest9gb);
			Node configTest9gb = doc.getFirstChild();
			while ((configTest9gb != null)
					&& (!"Configuration".equals(configTest9gb.getLocalName()))) {
				configTest9gb = configTest9gb.getNextSibling();
			}

			if (configTest9gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9gb!=null?configTest9gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9gb = (Element) el;

					Attr langAttr = resourceTest9gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9gb.length; i++) {
						String uri = listTest9gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest9gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9gb.length; i++) {
						String uritrans = tranElemTest9gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9gb = algorithms[i];
							String id = elementTest9gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9gb.length; i++) {
						String urisign = sigElemsTest9gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9gb.length; i++) {
						String javaclass = resolverElemTest9gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9gbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest9gb = new ArrayList<String>(resolverElemTest9gb.length);
					for (int i = 0; i < resolverElemTest9gb.length; i++) {
						String javaclass = resolverElemTest9gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9gb = resolverElemTest9gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9gb != null) && (descriptionTest9gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9gb);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9gb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest9gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9gb.length; i++) {
						String namespace = nlTest9gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs9gb ) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", exs9gb);
 } catch (ClassNotFoundException enf9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", enf9gb);
 } catch (IllegalAccessException eia9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", eia9gb);
 } catch (InstantiationException e9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", e9gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", epc9gb);
 } catch (org.xml.sax.SAXException ese9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", ese9gb);
 } catch (java.io.IOException eio9gb) {
 LOGGER.error("Crypto9gbInit:fileInit:error: ", eio9gb);
 }

	}

}
