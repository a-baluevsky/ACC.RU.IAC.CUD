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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8gb1,String st8gb2,String st8gb3,String st8gb4,String st8gb5,
			                String st8gb6,String st8gb7){
	  stt8gb1=st8gb1;
	  stt8gb2=st8gb2;
	  stt8gb3=st8gb3;
	  stt8gb4=st8gb4;
	  stt8gb5=st8gb5;
	  stt8gb6=st8gb6;
	  stt8gb7=st8gb7;

	 }
	 
	 private  String stt8gb1;
	 private  String stt8gb2;
	 private String stt8gb3;
	 private  String stt8gb4;
	 private  String stt8gb5;
	 private  String stt8gb6;
	 private  String stt8gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8gb1",
					stt8gb1);
			System.setProperty("stt8gb2",
					stt8gb2);
			System.setProperty("stt8gb3",
					stt8gb3);
			System.setProperty("stt8gb4",
					stt8gb4);
			System.setProperty("stt8gb5",
					stt8gb5);
			System.setProperty("stt8gb6",
					stt8gb6);
			System.setProperty("stt8gb7",
					stt8gb7);

			
			System.setProperty("Test8gbInit",
					"Test8gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8gbInit.class/jcp.xml");
			
			System.setProperty("Test8gbss8gb_0x",
					"Test8gbss8gb_0xjcp.xml");
         	System.setProperty("Test8gbss8gb_02",
					"Test8gbss8gb_02xml.config");
			System.setProperty("Test8gbss8gb_03",
					"Test8gbss8gb_03.apache.xml.resource.security.");
		    System.setProperty("Test8gbss8gb_04",
					"Test8gbss8gb_04.resource.");
			System.setProperty("Test8gbss8gb_05",
					"Test8gbss8gb_05.isInitialized");
			System.setProperty("Test8gbss8gb_06",
					"Test8gbss8gb_06_8gbInit.class/jcp.xml");
			System.setProperty("Test8gbss8gb_07",
					"Test8gbss8gb_07t/resource/jcp.xml");
         	System.setProperty("Test8gbss8gb_08gb",
					"Test8gbss8gb_08gb.config");
			System.setProperty("Test8gbss8gb_09",
					"Test8gbss8gb_09.security.");
		    System.setProperty("Test8gbss8gb_0x0",
					"Test8gbss8gb_0x0jcp.xmlapache.");
			System.setProperty("Test8gbss8gb_0xx0",
					"Test8gbss8gb_0xx0.isInitialized");
			System.setProperty("Test8gbss8gb_0xxx0",
					"Test8gbss8gb_0xxx0est8gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8gb = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8gb != null) {
				 
				LOGGER.debug("in0in isTest8gb");
				LOGGER.debug("inxin isTest8gb");
				LOGGER.debug("in2in isTest8gb");
				LOGGER.debug("in3in isTest8gb");
				LOGGER.debug("in4in isTest8gb");
				LOGGER.debug("in5in isTest8gb");
				LOGGER.debug("in6in isTest8gb");
				LOGGER.debug("in7in isTest8gb");
				LOGGER.debug("in8gbin isTest8gb");
				LOGGER.debug("in9in isTest8gb");
				LOGGER.debug("inx0in isTest8gb");
				LOGGER.debug("inxxin isTest8gb");
				LOGGER.debug("inx2in isTest8gb");
				LOGGER.debug("inx3in isTest8gb");
				LOGGER.debug("inx4in isTest8gb");
				LOGGER.debug("inx5in isTest8gb");
				LOGGER.debug("inx6in isTest8gb");
				LOGGER.debug("inx7in isTest8gb");
				LOGGER.debug("inx8gbin isTest8gb");
				LOGGER.debug("inx9in isTest8gb");
				LOGGER.debug("in20in isTest8gb");
			}

			 

			DocumentBuilderFactory dbfTest8gb = DocumentBuilderFactory.newInstance();
			dbfTest8gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8gb.setNamespaceAware(true);
			dbfTest8gb.setValidating(false);

			DocumentBuilder db = dbfTest8gb.newDocumentBuilder();
			Document doc = db.parse(isTest8gb);
			Node configTest8gb = doc.getFirstChild();
			while ((configTest8gb != null)
					&& (!"Configuration".equals(configTest8gb.getLocalName()))) {
				configTest8gb = configTest8gb.getNextSibling();
			}

			if (configTest8gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8gb!=null?configTest8gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8gb = (Element) el;

					Attr langAttr = resourceTest8gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8gb.length; i++) {
						String uri = listTest8gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest8gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8gb.length; i++) {
						String uritrans = tranElemTest8gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8gb = algorithms[i];
							String id = elementTest8gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8gb.length; i++) {
						String urisign = sigElemsTest8gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8gb.length; i++) {
						String javaclass = resolverElemTest8gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8gbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8gb = new ArrayList<String>(resolverElemTest8gb.length);
					for (int i = 0; i < resolverElemTest8gb.length; i++) {
						String javaclass = resolverElemTest8gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8gb = resolverElemTest8gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8gb != null) && (descriptionTest8gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8gb);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8gb);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8gb.length; i++) {
						String namespace = nlTest8gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8gb ) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", exs8gb);
 } catch (ClassNotFoundException enf8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", enf8gb);
 } catch (IllegalAccessException eia8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", eia8gb);
 } catch (InstantiationException e8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", e8gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", epc8gb);
 } catch (org.xml.sax.SAXException ese8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", ese8gb);
 } catch (java.io.IOException eio8gb) {
 LOGGER.error("Crypto8gbInit:fileInit:error: ", eio8gb);
 }

	}

}
