package ru.spb.iac.crypto.init.settngs;

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
	 
	 
	 public CryptoBaseTableInit(String st4h1,String st4h2,String st4h3,String st4h4h,String st4h5,
			                String st4h6,String st4h7){
	  stt4h1=st4h1;
	  stt4h2=st4h2;
	  stt4h3=st4h3;
	  stt4h4h=st4h4h;
	  stt4h5=st4h5;
	  stt4h6=st4h6;
	  stt4h7=st4h7;

	 }
	 
	 private  String stt4h1;
	 private  String stt4h2;
	 private String stt4h3;
	 private  String stt4h4h;
	 private  String stt4h5;
	 private  String stt4h6;
	 private  String stt4h7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4h1",
					stt4h1);
			System.setProperty("stt4h2",
					stt4h2);
			System.setProperty("stt4h3",
					stt4h3);
			System.setProperty("stt4h4h",
					stt4h4h);
			System.setProperty("stt4h5",
					stt4h5);
			System.setProperty("stt4h6",
					stt4h6);
			System.setProperty("stt4h7",
					stt4h7);

			
			System.setProperty("Test4hInit",
					"Test4hInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4h5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4hInit.class/jcp.xml");
			
			System.setProperty("Test4hss4h_0x",
					"Test4hss4h_0xjcp.xml");
         	System.setProperty("Test4hss4h_02",
					"Test4hss4h_02xml.config");
			System.setProperty("Test4hss4h_03",
					"Test4hss4h_03.apache.xml.resource.security.");
		    System.setProperty("Test4hss4h_04h",
					"Test4hss4h_04h.resource.");
			System.setProperty("Test4hss4h_05",
					"Test4hss4h_05.isInitialized");
			System.setProperty("Test4hss4h_06",
					"Test4hss4h_06_4hInit.class/jcp.xml");
			System.setProperty("Test4hss4h_07",
					"Test4hss4h_07t/resource/jcp.xml");
         	System.setProperty("Test4hss4h_08",
					"Test4hss4h_08.config");
			System.setProperty("Test4hss4h_09",
					"Test4hss4h_09.security.");
		    System.setProperty("Test4hss4h_0x0",
					"Test4hss4h_0x0jcp.xmlapache.");
			System.setProperty("Test4hss4h_0xx0",
					"Test4hss4h_0xx0.isInitialized");
			System.setProperty("Test4hss4h_0xxx0",
					"Test4hss4h_0xxx0est4hInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4h5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4h = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4h != null) {
				 
				LOGGER.debug("in0in isTest4h");
				LOGGER.debug("inxin isTest4h");
				LOGGER.debug("in2in isTest4h");
				LOGGER.debug("in3in isTest4h");
				LOGGER.debug("in4hin isTest4h");
				LOGGER.debug("in5in isTest4h");
				LOGGER.debug("in6in isTest4h");
				LOGGER.debug("in7in isTest4h");
				LOGGER.debug("in8in isTest4h");
				LOGGER.debug("in9in isTest4h");
				LOGGER.debug("inx0in isTest4h");
				LOGGER.debug("inxxin isTest4h");
				LOGGER.debug("inx2in isTest4h");
				LOGGER.debug("inx3in isTest4h");
				LOGGER.debug("inx4hin isTest4h");
				LOGGER.debug("inx5in isTest4h");
				LOGGER.debug("inx6in isTest4h");
				LOGGER.debug("inx7in isTest4h");
				LOGGER.debug("inx8in isTest4h");
				LOGGER.debug("inx9in isTest4h");
				LOGGER.debug("in20in isTest4h");
			}

			 

			DocumentBuilderFactory dbfTest4h = DocumentBuilderFactory.newInstance();
			dbfTest4h.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4h.setNamespaceAware(true);
			dbfTest4h.setValidating(false);

			DocumentBuilder db = dbfTest4h.newDocumentBuilder();
			Document doc = db.parse(isTest4h);
			Node configTest4h = doc.getFirstChild();
			while ((configTest4h != null)
					&& (!"Configuration".equals(configTest4h.getLocalName()))) {
				configTest4h = configTest4h.getNextSibling();
			}

			if (configTest4h != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4h!=null?configTest4h.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4h = (Element) el;

					Attr langAttr = resourceTest4h
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4h
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4h = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4h);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4h.length; i++) {
						String uri = listTest4h[i].getAttributeNS(null, "URI");
						String javaclass = listTest4h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4h.length; i++) {
						String uritrans = tranElemTest4h[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4h = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4h != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4h.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4h = algorithms[i];
							String id = elementTest4h.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4h));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4h.length; i++) {
						String urisign = sigElemsTest4h[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4h[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4h.length; i++) {
						String javaclass = resolverElemTest4h[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4hRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4hRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4hRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4hCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4h = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4h = new ArrayList(resolverElemTest4h.length);
					for (int i = 0; i < resolverElemTest4h.length; i++) {
						String javaclass = resolverElemTest4h[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4h = resolverElemTest4h[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4h != null) && (descriptionTest4h.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4h);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4h);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4h.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4h);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4h = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4h.length; i++) {
						String namespace = nlTest4h[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4h[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4h ) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", exs4h);
 } catch (ClassNotFoundException enf4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", enf4h);
 } catch (IllegalAccessException eia4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", eia4h);
 } catch (InstantiationException e4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", e4h);
 } catch (javax.xml.parsers.ParserConfigurationException epc4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", epc4h);
 } catch (org.xml.sax.SAXException ese4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", ese4h);
 } catch (java.io.IOException eio4h) {
 LOGGER.error("Crypto4hInit:fileInit:error: ", eio4h);
 }

	}

}
