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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3gb1,String st3gb2,String st3gb3gb,String st3gb4,String st3gb5,
			                String st3gb6,String st3gb7){
	  stt3gb1=st3gb1;
	  stt3gb2=st3gb2;
	  stt3gb3gb=st3gb3gb;
	  stt3gb4=st3gb4;
	  stt3gb5=st3gb5;
	  stt3gb6=st3gb6;
	  stt3gb7=st3gb7;

	 }
	 
	 private  String stt3gb1;
	 private  String stt3gb2;
	 private String stt3gb3gb;
	 private  String stt3gb4;
	 private  String stt3gb5;
	 private  String stt3gb6;
	 private  String stt3gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3gb1",
					stt3gb1);
			System.setProperty("stt3gb2",
					stt3gb2);
			System.setProperty("stt3gb3gb",
					stt3gb3gb);
			System.setProperty("stt3gb4",
					stt3gb4);
			System.setProperty("stt3gb5",
					stt3gb5);
			System.setProperty("stt3gb6",
					stt3gb6);
			System.setProperty("stt3gb7",
					stt3gb7);

			
			System.setProperty("Test3gbInit",
					"Test3gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3gbInit.class/jcp.xml");
			
			
			System.setProperty("Test3gbss3gb_0x",
					"Test3gbss3gb_0xjcp.xml");
         	System.setProperty("Test3gbss3gb_02",
					"Test3gbss3gb_02xml.config");
			System.setProperty("Test3gbss3gb_03gb",
					"Test3gbss3gb_03gb.apache.xml.resource.security.");
		    System.setProperty("Test3gbss3gb_04",
					"Test3gbss3gb_04.resource.");
			System.setProperty("Test3gbss3gb_05",
					"Test3gbss3gb_05.isInitialized");
			System.setProperty("Test3gbss3gb_06",
					"Test3gbss3gb_06_3gbInit.class/jcp.xml");
			System.setProperty("Test3gbss3gb_07",
					"Test3gbss3gb_07t/resource/jcp.xml");
         	System.setProperty("Test3gbss3gb_08",
					"Test3gbss3gb_08.config");
			System.setProperty("Test3gbss3gb_09",
					"Test3gbss3gb_09.security.");
		    System.setProperty("Test3gbss3gb_0x0",
					"Test3gbss3gb_0x0jcp.xmlapache.");
			System.setProperty("Test3gbss3gb_0xx0",
					"Test3gbss3gb_0xx0.isInitialized");
			System.setProperty("Test3gbss3gb_0xxx0",
					"Test3gbss3gb_0xxx0est3gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3gb = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3gb != null) {
				 
				LOGGER.debug("in0in isTest3gb");
				LOGGER.debug("inxin isTest3gb");
				LOGGER.debug("in2in isTest3gb");
				LOGGER.debug("in3gbin isTest3gb");
				LOGGER.debug("in4in isTest3gb");
				LOGGER.debug("in5in isTest3gb");
				LOGGER.debug("in6in isTest3gb");
				LOGGER.debug("in7in isTest3gb");
				LOGGER.debug("in8in isTest3gb");
				LOGGER.debug("in9in isTest3gb");
				LOGGER.debug("inx0in isTest3gb");
				LOGGER.debug("inxxin isTest3gb");
				LOGGER.debug("inx2in isTest3gb");
				LOGGER.debug("inx3gbin isTest3gb");
				LOGGER.debug("inx4in isTest3gb");
				LOGGER.debug("inx5in isTest3gb");
				LOGGER.debug("inx6in isTest3gb");
				LOGGER.debug("inx7in isTest3gb");
				LOGGER.debug("inx8in isTest3gb");
				LOGGER.debug("inx9in isTest3gb");
				LOGGER.debug("in20in isTest3gb");
			}

			 

			DocumentBuilderFactory dbfTest3gb = DocumentBuilderFactory.newInstance();
			dbfTest3gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3gb.setNamespaceAware(true);
			dbfTest3gb.setValidating(false);

			DocumentBuilder db = dbfTest3gb.newDocumentBuilder();
			Document doc = db.parse(isTest3gb);
			Node configTest3gb = doc.getFirstChild();
			while ((configTest3gb != null)
					&& (!"Configuration".equals(configTest3gb.getLocalName()))) {
				configTest3gb = configTest3gb.getNextSibling();
			}

			if (configTest3gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3gb!=null?configTest3gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3gb = (Element) el;

					Attr langAttr = resourceTest3gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3gb.length; i++) {
						String uri = listTest3gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest3gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3gb.length; i++) {
						String uritrans = tranElemTest3gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3gb = algorithms[i];
							String id = elementTest3gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3gb.length; i++) {
						String urisign = sigElemsTest3gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3gb.length; i++) {
						String javaclass = resolverElemTest3gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3gbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest3gb = new ArrayList<String>(resolverElemTest3gb.length);
					for (int i = 0; i < resolverElemTest3gb.length; i++) {
						String javaclass = resolverElemTest3gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3gb = resolverElemTest3gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3gb != null) && (descriptionTest3gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3gb);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3gb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3gb.length; i++) {
						String namespace = nlTest3gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3gb ) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", exs3gb);
 } catch (ClassNotFoundException enf3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", enf3gb);
 } catch (IllegalAccessException eia3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", eia3gb);
 } catch (InstantiationException e3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", e3gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", epc3gb);
 } catch (org.xml.sax.SAXException ese3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", ese3gb);
 } catch (java.io.IOException eio3gb) {
 LOGGER.error("Crypto3gbInit:fileInit:error: ", eio3gb);
 }

	}

}
