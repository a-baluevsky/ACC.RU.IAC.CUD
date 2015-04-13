package ru.spb.iac.crypto.init.report;

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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4j1,String st4j2,String st4j3,String st4j4j,String st4j5,
			                String st4j6,String st4j7){
	  stt4j1=st4j1;
	  stt4j2=st4j2;
	  stt4j3=st4j3;
	  stt4j4j=st4j4j;
	  stt4j5=st4j5;
	  stt4j6=st4j6;
	  stt4j7=st4j7;

	 }
	 
	 private  String stt4j1;
	 private  String stt4j2;
	 private String stt4j3;
	 private  String stt4j4j;
	 private  String stt4j5;
	 private  String stt4j6;
	 private  String stt4j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4j1",
					stt4j1);
			System.setProperty("stt4j2",
					stt4j2);
			System.setProperty("stt4j3",
					stt4j3);
			System.setProperty("stt4j4j",
					stt4j4j);
			System.setProperty("stt4j5",
					stt4j5);
			System.setProperty("stt4j6",
					stt4j6);
			System.setProperty("stt4j7",
					stt4j7);

			
			System.setProperty("Test4jInit",
					"Test4jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4jInit.class/jcp.xml");
			
			System.setProperty("Test4jss4j_0x",
					"Test4jss4j_0xjcp.xml");
         	System.setProperty("Test4jss4j_02",
					"Test4jss4j_02xml.config");
			System.setProperty("Test4jss4j_03",
					"Test4jss4j_03.apache.xml.resource.security.");
		    System.setProperty("Test4jss4j_04j",
					"Test4jss4j_04j.resource.");
			System.setProperty("Test4jss4j_05",
					"Test4jss4j_05.isInitialized");
			System.setProperty("Test4jss4j_06",
					"Test4jss4j_06_4jInit.class/jcp.xml");
			System.setProperty("Test4jss4j_07",
					"Test4jss4j_07t/resource/jcp.xml");
         	System.setProperty("Test4jss4j_08",
					"Test4jss4j_08.config");
			System.setProperty("Test4jss4j_09",
					"Test4jss4j_09.security.");
		    System.setProperty("Test4jss4j_0x0",
					"Test4jss4j_0x0jcp.xmlapache.");
			System.setProperty("Test4jss4j_0xx0",
					"Test4jss4j_0xx0.isInitialized");
			System.setProperty("Test4jss4j_0xxx0",
					"Test4jss4j_0xxx0est4jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4j = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4j != null) {
				 
				LOGGER.debug("in0in isTest4j");
				LOGGER.debug("inxin isTest4j");
				LOGGER.debug("in2in isTest4j");
				LOGGER.debug("in3in isTest4j");
				LOGGER.debug("in4jin isTest4j");
				LOGGER.debug("in5in isTest4j");
				LOGGER.debug("in6in isTest4j");
				LOGGER.debug("in7in isTest4j");
				LOGGER.debug("in8in isTest4j");
				LOGGER.debug("in9in isTest4j");
				LOGGER.debug("inx0in isTest4j");
				LOGGER.debug("inxxin isTest4j");
				LOGGER.debug("inx2in isTest4j");
				LOGGER.debug("inx3in isTest4j");
				LOGGER.debug("inx4jin isTest4j");
				LOGGER.debug("inx5in isTest4j");
				LOGGER.debug("inx6in isTest4j");
				LOGGER.debug("inx7in isTest4j");
				LOGGER.debug("inx8in isTest4j");
				LOGGER.debug("inx9in isTest4j");
				LOGGER.debug("in20in isTest4j");
			}

			 

			DocumentBuilderFactory dbfTest4j = DocumentBuilderFactory.newInstance();
			dbfTest4j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4j.setNamespaceAware(true);
			dbfTest4j.setValidating(false);

			DocumentBuilder db = dbfTest4j.newDocumentBuilder();
			Document doc = db.parse(isTest4j);
			Node configTest4j = doc.getFirstChild();
			while ((configTest4j != null)
					&& (!"Configuration".equals(configTest4j.getLocalName()))) {
				configTest4j = configTest4j.getNextSibling();
			}

			if (configTest4j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4j!=null?configTest4j.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4j = (Element) el;

					Attr langAttr = resourceTest4j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4j.length; i++) {
						String uri = listTest4j[i].getAttributeNS(null, "URI");
						String javaclass = listTest4j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4j.length; i++) {
						String uritrans = tranElemTest4j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4j = algorithms[i];
							String id = elementTest4j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4j.length; i++) {
						String urisign = sigElemsTest4j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4j.length; i++) {
						String javaclass = resolverElemTest4j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4jRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4jRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4j = new ArrayList(resolverElemTest4j.length);
					for (int i = 0; i < resolverElemTest4j.length; i++) {
						String javaclass = resolverElemTest4j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4j = resolverElemTest4j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4j != null) && (descriptionTest4j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4j);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4j);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4j.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4j.length; i++) {
						String namespace = nlTest4j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4j ) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", exs4j);
 } catch (ClassNotFoundException enf4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", enf4j);
 } catch (IllegalAccessException eia4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", eia4j);
 } catch (InstantiationException e4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", e4j);
 } catch (javax.xml.parsers.ParserConfigurationException epc4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", epc4j);
 } catch (org.xml.sax.SAXException ese4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", ese4j);
 } catch (java.io.IOException eio4j) {
 LOGGER.error("Crypto4jInit:fileInit:error: ", eio4j);
 }

	}

}
