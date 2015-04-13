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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4gb1,String st4gb2,String st4gb3,String st4gb4gb,String st4gb5,
			                String st4gb6,String st4gb7){
	  stt4gb1=st4gb1;
	  stt4gb2=st4gb2;
	  stt4gb3=st4gb3;
	  stt4gb4gb=st4gb4gb;
	  stt4gb5=st4gb5;
	  stt4gb6=st4gb6;
	  stt4gb7=st4gb7;

	 }
	 
	 private  String stt4gb1;
	 private  String stt4gb2;
	 private String stt4gb3;
	 private  String stt4gb4gb;
	 private  String stt4gb5;
	 private  String stt4gb6;
	 private  String stt4gb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4gb1",
					stt4gb1);
			System.setProperty("stt4gb2",
					stt4gb2);
			System.setProperty("stt4gb3",
					stt4gb3);
			System.setProperty("stt4gb4gb",
					stt4gb4gb);
			System.setProperty("stt4gb5",
					stt4gb5);
			System.setProperty("stt4gb6",
					stt4gb6);
			System.setProperty("stt4gb7",
					stt4gb7);

			
			System.setProperty("Test4gbInit",
					"Test4gbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4gb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4gbInit.class/jcp.xml");
			
			System.setProperty("Test4gbss4gb_0x",
					"Test4gbss4gb_0xjcp.xml");
         	System.setProperty("Test4gbss4gb_02",
					"Test4gbss4gb_02xml.config");
			System.setProperty("Test4gbss4gb_03",
					"Test4gbss4gb_03.apache.xml.resource.security.");
		    System.setProperty("Test4gbss4gb_04gb",
					"Test4gbss4gb_04gb.resource.");
			System.setProperty("Test4gbss4gb_05",
					"Test4gbss4gb_05.isInitialized");
			System.setProperty("Test4gbss4gb_06",
					"Test4gbss4gb_06_4gbInit.class/jcp.xml");
			System.setProperty("Test4gbss4gb_07",
					"Test4gbss4gb_07t/resource/jcp.xml");
         	System.setProperty("Test4gbss4gb_08",
					"Test4gbss4gb_08.config");
			System.setProperty("Test4gbss4gb_09",
					"Test4gbss4gb_09.security.");
		    System.setProperty("Test4gbss4gb_0x0",
					"Test4gbss4gb_0x0jcp.xmlapache.");
			System.setProperty("Test4gbss4gb_0xx0",
					"Test4gbss4gb_0xx0.isInitialized");
			System.setProperty("Test4gbss4gb_0xxx0",
					"Test4gbss4gb_0xxx0est4gbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4gb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4gb = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4gb != null) {
				 
				LOGGER.debug("in0in isTest4gb");
				LOGGER.debug("inxin isTest4gb");
				LOGGER.debug("in2in isTest4gb");
				LOGGER.debug("in3in isTest4gb");
				LOGGER.debug("in4gbin isTest4gb");
				LOGGER.debug("in5in isTest4gb");
				LOGGER.debug("in6in isTest4gb");
				LOGGER.debug("in7in isTest4gb");
				LOGGER.debug("in8in isTest4gb");
				LOGGER.debug("in9in isTest4gb");
				LOGGER.debug("inx0in isTest4gb");
				LOGGER.debug("inxxin isTest4gb");
				LOGGER.debug("inx2in isTest4gb");
				LOGGER.debug("inx3in isTest4gb");
				LOGGER.debug("inx4gbin isTest4gb");
				LOGGER.debug("inx5in isTest4gb");
				LOGGER.debug("inx6in isTest4gb");
				LOGGER.debug("inx7in isTest4gb");
				LOGGER.debug("inx8in isTest4gb");
				LOGGER.debug("inx9in isTest4gb");
				LOGGER.debug("in20in isTest4gb");
			}

			 

			DocumentBuilderFactory dbfTest4gb = DocumentBuilderFactory.newInstance();
			dbfTest4gb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4gb.setNamespaceAware(true);
			dbfTest4gb.setValidating(false);

			DocumentBuilder db = dbfTest4gb.newDocumentBuilder();
			Document doc = db.parse(isTest4gb);
			Node configTest4gb = doc.getFirstChild();
			while ((configTest4gb != null)
					&& (!"Configuration".equals(configTest4gb.getLocalName()))) {
				configTest4gb = configTest4gb.getNextSibling();
			}

			if (configTest4gb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4gb!=null?configTest4gb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4gb = (Element) el;

					Attr langAttr = resourceTest4gb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4gb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4gb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4gb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4gb.length; i++) {
						String uri = listTest4gb[i].getAttributeNS(null, "URI");
						String javaclass = listTest4gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4gb.length; i++) {
						String uritrans = tranElemTest4gb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4gb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4gb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4gb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4gb = algorithms[i];
							String id = elementTest4gb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4gb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4gb.length; i++) {
						String urisign = sigElemsTest4gb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4gb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4gb.length; i++) {
						String javaclass = resolverElemTest4gb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4gbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4gbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4gbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4gbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4gb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4gb = new ArrayList(resolverElemTest4gb.length);
					for (int i = 0; i < resolverElemTest4gb.length; i++) {
						String javaclass = resolverElemTest4gb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4gb = resolverElemTest4gb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4gb != null) && (descriptionTest4gb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4gb);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4gb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4gb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4gb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4gb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4gb.length; i++) {
						String namespace = nlTest4gb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4gb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4gb ) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", exs4gb);
 } catch (ClassNotFoundException enf4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", enf4gb);
 } catch (IllegalAccessException eia4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", eia4gb);
 } catch (InstantiationException e4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", e4gb);
 } catch (javax.xml.parsers.ParserConfigurationException epc4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", epc4gb);
 } catch (org.xml.sax.SAXException ese4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", ese4gb);
 } catch (java.io.IOException eio4gb) {
 LOGGER.error("Crypto4gbInit:fileInit:error: ", eio4gb);
 }

	}

}
