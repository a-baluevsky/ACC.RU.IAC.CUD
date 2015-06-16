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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2gb1,String st2gb2gb,String st2gb3,String st2gb4,String st2gb5,
			                String st2gb6,String st2gb7){
	  stt2gb1=st2gb1;
	  stt2gb2gb=st2gb2gb;
	  stt2gb3=st2gb3;
	  stt2gb4=st2gb4;
	  stt2gb5=st2gb5;
	  stt2gb6=st2gb6;
	  stt2gb7=st2gb7;

	 }
	 
	 private  String stt2gb1;
	 private  String stt2gb2gb;
	 private String stt2gb3;
	 private  String stt2gb4;
	 private  String stt2gb5;
	 private  String stt2gb6;
	 private  String stt2gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2gb1",
					stt2gb1);
			System.setProperty("stt2gb2gb",
					stt2gb2gb);
			System.setProperty("stt2gb3",
					stt2gb3);
			System.setProperty("stt2gb4",
					stt2gb4);
			System.setProperty("stt2gb5",
					stt2gb5);
			System.setProperty("stt2gb6",
					stt2gb6);
			System.setProperty("stt2gb7",
					stt2gb7);

			
			System.setProperty("Test2gbInit",
					"Test2gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2gbInit.class/jcp.xml");
			
			System.setProperty("Test2gbss2gb_0x",
					"Test2gbss2gb_0xjcp.xml");
         	System.setProperty("Test2gbss2gb_02gb",
					"Test2gbss2gb_02gbxml.config");
			System.setProperty("Test2gbss2gb_03",
					"Test2gbss2gb_03.apache.xml.resource.security.");
		    System.setProperty("Test2gbss2gb_04",
					"Test2gbss2gb_04.resource.");
			System.setProperty("Test2gbss2gb_05",
					"Test2gbss2gb_05.isInitialized");
			System.setProperty("Test2gbss2gb_06",
					"Test2gbss2gb_06_2gbInit.class/jcp.xml");
			System.setProperty("Test2gbss2gb_07",
					"Test2gbss2gb_07t/resource/jcp.xml");
         	System.setProperty("Test2gbss2gb_08",
					"Test2gbss2gb_08.config");
			System.setProperty("Test2gbss2gb_09",
					"Test2gbss2gb_09.security.");
		    System.setProperty("Test2gbss2gb_0x0",
					"Test2gbss2gb_0x0jcp.xmlapache.");
			System.setProperty("Test2gbss2gb_0xx0",
					"Test2gbss2gb_0xx0.isInitialized");
			System.setProperty("Test2gbss2gb_0xxx0",
					"Test2gbss2gb_0xxx0est2gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2gb = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2gb != null) {
				 
				LOGGER.debug("in0in isTest2gb");
				LOGGER.debug("inxin isTest2gb");
				LOGGER.debug("in2gbin isTest2gb");
				LOGGER.debug("in3in isTest2gb");
				LOGGER.debug("in4in isTest2gb");
				LOGGER.debug("in5in isTest2gb");
				LOGGER.debug("in6in isTest2gb");
				LOGGER.debug("in7in isTest2gb");
				LOGGER.debug("in8in isTest2gb");
				LOGGER.debug("in9in isTest2gb");
				LOGGER.debug("inx0in isTest2gb");
				LOGGER.debug("inxxin isTest2gb");
				LOGGER.debug("inx2gbin isTest2gb");
				LOGGER.debug("inx3in isTest2gb");
				LOGGER.debug("inx4in isTest2gb");
				LOGGER.debug("inx5in isTest2gb");
				LOGGER.debug("inx6in isTest2gb");
				LOGGER.debug("inx7in isTest2gb");
				LOGGER.debug("inx8in isTest2gb");
				LOGGER.debug("inx9in isTest2gb");
				LOGGER.debug("in2gb0in isTest2gb");
			}

			 

			DocumentBuilderFactory dbfTest2gb = DocumentBuilderFactory.newInstance();
			dbfTest2gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2gb.setNamespaceAware(true);
			dbfTest2gb.setValidating(false);

			DocumentBuilder db = dbfTest2gb.newDocumentBuilder();
			Document doc = db.parse(isTest2gb);
			Node configTest2gb = doc.getFirstChild();
			while ((configTest2gb != null)
					&& (!"Configuration".equals(configTest2gb.getLocalName()))) {
				configTest2gb = configTest2gb.getNextSibling();
			}

			if (configTest2gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2gb!=null?configTest2gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2gb = (Element) el;

					Attr langAttr = resourceTest2gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2gb.length; i++) {
						String uri = listTest2gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest2gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2gb.length; i++) {
						String uritrans = tranElemTest2gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2gb = algorithms[i];
							String id = elementTest2gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2gb.length; i++) {
						String urisign = sigElemsTest2gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2gb.length; i++) {
						String javaclass = resolverElemTest2gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2gbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2gbRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest2gb = new ArrayList<String>(resolverElemTest2gb.length);
					for (int i = 0; i < resolverElemTest2gb.length; i++) {
						String javaclass = resolverElemTest2gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2gb = resolverElemTest2gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2gb != null) && (descriptionTest2gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2gb);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2gb);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest2gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2gb.length; i++) {
						String namespace = nlTest2gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs2gb ) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", exs2gb);
 } catch (ClassNotFoundException enf2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", enf2gb);
 } catch (IllegalAccessException eia2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", eia2gb);
 } catch (InstantiationException e2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", e2gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", epc2gb);
 } catch (org.xml.sax.SAXException ese2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", ese2gb);
 } catch (java.io.IOException eio2gb) {
 LOGGER.error("Crypto2gbInit:fileInit:error: ", eio2gb);
 }

	}

}
