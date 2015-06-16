package ru.spb.iac.crypto.init.groupsys;

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
	 
	 
	 public CryptoStateHolderInit(String st5m1,String st5m2,String st5m3,String st5m4,String st5m5m,
			                String st5m6,String st5m7){
	  stt5m1=st5m1;
	  stt5m2=st5m2;
	  stt5m3=st5m3;
	  stt5m4=st5m4;
	  stt5m5m=st5m5m;
	  stt5m6=st5m6;
	  stt5m7=st5m7;

	 }
	 
	 private  String stt5m1;
	 private  String stt5m2;
	 private String stt5m3;
	 private  String stt5m4;
	 private  String stt5m5m;
	 private  String stt5m6;
	 private  String stt5m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5m1",
					stt5m1);
			System.setProperty("stt5m2",
					stt5m2);
			System.setProperty("stt5m3",
					stt5m3);
			System.setProperty("stt5m4",
					stt5m4);
			System.setProperty("stt5m5m",
					stt5m5m);
			System.setProperty("stt5m6",
					stt5m6);
			System.setProperty("stt5m7",
					stt5m7);

			
			System.setProperty("Test5mInit",
					"Test5mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5m5mInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5mInit.class/jcp.xml");
			
			System.setProperty("Test5mss5m_0x",
					"Test5mss5m_0xjcp.xml");
         	System.setProperty("Test5mss5m_02",
					"Test5mss5m_02xml.config");
			System.setProperty("Test5mss5m_03",
					"Test5mss5m_03.apache.xml.resource.security.");
		    System.setProperty("Test5mss5m_04",
					"Test5mss5m_04.resource.");
			System.setProperty("Test5mss5m_05m",
					"Test5mss5m_05m.isInitialized");
			System.setProperty("Test5mss5m_06",
					"Test5mss5m_06_5mInit.class/jcp.xml");
			System.setProperty("Test5mss5m_07",
					"Test5mss5m_07t/resource/jcp.xml");
         	System.setProperty("Test5mss5m_08",
					"Test5mss5m_08.config");
			System.setProperty("Test5mss5m_09",
					"Test5mss5m_09.security.");
		    System.setProperty("Test5mss5m_0x0",
					"Test5mss5m_0x0jcp.xmlapache.");
			System.setProperty("Test5mss5m_0xx0",
					"Test5mss5m_0xx0.isInitialized");
			System.setProperty("Test5mss5m_0xxx0",
					"Test5mss5m_0xxx0est5mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5m5mInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5m = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5m != null) {
				 
				LOGGER.debug("in0in isTest5m");
				LOGGER.debug("inxin isTest5m");
				LOGGER.debug("in2in isTest5m");
				LOGGER.debug("in3in isTest5m");
				LOGGER.debug("in4in isTest5m");
				LOGGER.debug("in5min isTest5m");
				LOGGER.debug("in6in isTest5m");
				LOGGER.debug("in7in isTest5m");
				LOGGER.debug("in8in isTest5m");
				LOGGER.debug("in9in isTest5m");
				LOGGER.debug("inx0in isTest5m");
				LOGGER.debug("inxxin isTest5m");
				LOGGER.debug("inx2in isTest5m");
				LOGGER.debug("inx3in isTest5m");
				LOGGER.debug("inx4in isTest5m");
				LOGGER.debug("inx5min isTest5m");
				LOGGER.debug("inx6in isTest5m");
				LOGGER.debug("inx7in isTest5m");
				LOGGER.debug("inx8in isTest5m");
				LOGGER.debug("inx9in isTest5m");
				LOGGER.debug("in20in isTest5m");
			}

			 

			DocumentBuilderFactory dbfTest5m = DocumentBuilderFactory.newInstance();
			dbfTest5m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5m.setNamespaceAware(true);
			dbfTest5m.setValidating(false);

			DocumentBuilder db = dbfTest5m.newDocumentBuilder();
			Document doc = db.parse(isTest5m);
			Node configTest5m = doc.getFirstChild();
			while ((configTest5m != null)
					&& (!"Configuration".equals(configTest5m.getLocalName()))) {
				configTest5m = configTest5m.getNextSibling();
			}

			if (configTest5m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5m!=null?configTest5m.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5m = (Element) el;

					Attr langAttr = resourceTest5m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5m.length; i++) {
						String uri = listTest5m[i].getAttributeNS(null, "URI");
						String javaclass = listTest5m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5m.length; i++) {
						String uritrans = tranElemTest5m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5m = algorithms[i];
							String id = elementTest5m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5m.length; i++) {
						String urisign = sigElemsTest5m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5m.length; i++) {
						String javaclass = resolverElemTest5m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5mRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5m = new ArrayList<String>(resolverElemTest5m.length);
					for (int i = 0; i < resolverElemTest5m.length; i++) {
						String javaclass = resolverElemTest5m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5m = resolverElemTest5m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5m != null) && (descriptionTest5m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5m);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5m);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5m.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5m.length; i++) {
						String namespace = nlTest5m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5m ) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", exs5m);
 } catch (ClassNotFoundException enf5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", enf5m);
 } catch (IllegalAccessException eia5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", eia5m);
 } catch (InstantiationException e5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", e5m);
 } catch (javax.xml.parsers.ParserConfigurationException epc5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", epc5m);
 } catch (org.xml.sax.SAXException ese5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", ese5m);
 } catch (java.io.IOException eio5m) {
 LOGGER.error("Crypto5mInit:fileInit:error: ", eio5m);
 }

	}

}
