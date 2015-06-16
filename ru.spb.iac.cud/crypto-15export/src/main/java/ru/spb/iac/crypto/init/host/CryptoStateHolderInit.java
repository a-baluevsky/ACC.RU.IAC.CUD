package ru.spb.iac.crypto.init.host;

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
	 
	 
	 public CryptoStateHolderInit(String st5o1,String st5o2,String st5o3,String st5o4,String st5o5o,
			                String st5o6,String st5o7){
	  stt5o1=st5o1;
	  stt5o2=st5o2;
	  stt5o3=st5o3;
	  stt5o4=st5o4;
	  stt5o5o=st5o5o;
	  stt5o6=st5o6;
	  stt5o7=st5o7;

	 }
	 
	 private  String stt5o1;
	 private  String stt5o2;
	 private String stt5o3;
	 private  String stt5o4;
	 private  String stt5o5o;
	 private  String stt5o6;
	 private  String stt5o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5o1",
					stt5o1);
			System.setProperty("stt5o2",
					stt5o2);
			System.setProperty("stt5o3",
					stt5o3);
			System.setProperty("stt5o4",
					stt5o4);
			System.setProperty("stt5o5o",
					stt5o5o);
			System.setProperty("stt5o6",
					stt5o6);
			System.setProperty("stt5o7",
					stt5o7);

			
			System.setProperty("Test5oInit",
					"Test5oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5o5oInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5oInit.class/jcp.xml");
			
			System.setProperty("Test5oss5o_0x",
					"Test5oss5o_0xjcp.xml");
         	System.setProperty("Test5oss5o_02",
					"Test5oss5o_02xml.config");
			System.setProperty("Test5oss5o_03",
					"Test5oss5o_03.apache.xml.resource.security.");
		    System.setProperty("Test5oss5o_04",
					"Test5oss5o_04.resource.");
			System.setProperty("Test5oss5o_05o",
					"Test5oss5o_05o.isInitialized");
			System.setProperty("Test5oss5o_06",
					"Test5oss5o_06_5oInit.class/jcp.xml");
			System.setProperty("Test5oss5o_07",
					"Test5oss5o_07t/resource/jcp.xml");
         	System.setProperty("Test5oss5o_08",
					"Test5oss5o_08.config");
			System.setProperty("Test5oss5o_09",
					"Test5oss5o_09.security.");
		    System.setProperty("Test5oss5o_0x0",
					"Test5oss5o_0x0jcp.xmlapache.");
			System.setProperty("Test5oss5o_0xx0",
					"Test5oss5o_0xx0.isInitialized");
			System.setProperty("Test5oss5o_0xxx0",
					"Test5oss5o_0xxx0est5oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5o5oInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5o = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5o != null) {
				 
				LOGGER.debug("in0in isTest5o");
				LOGGER.debug("inxin isTest5o");
				LOGGER.debug("in2in isTest5o");
				LOGGER.debug("in3in isTest5o");
				LOGGER.debug("in4in isTest5o");
				LOGGER.debug("in5oin isTest5o");
				LOGGER.debug("in6in isTest5o");
				LOGGER.debug("in7in isTest5o");
				LOGGER.debug("in8in isTest5o");
				LOGGER.debug("in9in isTest5o");
				LOGGER.debug("inx0in isTest5o");
				LOGGER.debug("inxxin isTest5o");
				LOGGER.debug("inx2in isTest5o");
				LOGGER.debug("inx3in isTest5o");
				LOGGER.debug("inx4in isTest5o");
				LOGGER.debug("inx5oin isTest5o");
				LOGGER.debug("inx6in isTest5o");
				LOGGER.debug("inx7in isTest5o");
				LOGGER.debug("inx8in isTest5o");
				LOGGER.debug("inx9in isTest5o");
				LOGGER.debug("in20in isTest5o");
			}

			 

			DocumentBuilderFactory dbfTest5o = DocumentBuilderFactory.newInstance();
			dbfTest5o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5o.setNamespaceAware(true);
			dbfTest5o.setValidating(false);

			DocumentBuilder db = dbfTest5o.newDocumentBuilder();
			Document doc = db.parse(isTest5o);
			Node configTest5o = doc.getFirstChild();
			while ((configTest5o != null)
					&& (!"Configuration".equals(configTest5o.getLocalName()))) {
				configTest5o = configTest5o.getNextSibling();
			}

			if (configTest5o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5o!=null?configTest5o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5o = (Element) el;

					Attr langAttr = resourceTest5o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5o.length; i++) {
						String uri = listTest5o[i].getAttributeNS(null, "URI");
						String javaclass = listTest5o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5o.length; i++) {
						String uritrans = tranElemTest5o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5o = algorithms[i];
							String id = elementTest5o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5o.length; i++) {
						String urisign = sigElemsTest5o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5o.length; i++) {
						String javaclass = resolverElemTest5o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5oRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest5o = new ArrayList<String>(resolverElemTest5o.length);
					for (int i = 0; i < resolverElemTest5o.length; i++) {
						String javaclass = resolverElemTest5o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5o = resolverElemTest5o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5o != null) && (descriptionTest5o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5o);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5o);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5o.length; i++) {
						String namespace = nlTest5o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5o ) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", exs5o);
 } catch (ClassNotFoundException enf5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", enf5o);
 } catch (IllegalAccessException eia5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", eia5o);
 } catch (InstantiationException e5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", e5o);
 } catch (javax.xml.parsers.ParserConfigurationException epc5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", epc5o);
 } catch (org.xml.sax.SAXException ese5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", ese5o);
 } catch (java.io.IOException eio5o) {
 LOGGER.error("Crypto5oInit:fileInit:error: ", eio5o);
 }

	}

}
