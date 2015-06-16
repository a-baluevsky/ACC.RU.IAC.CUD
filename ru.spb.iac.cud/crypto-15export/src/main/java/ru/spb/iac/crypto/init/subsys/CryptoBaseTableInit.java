package ru.spb.iac.crypto.init.subsys;

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
	 
	 
	 public CryptoBaseTableInit(String st4k1,String st4k2,String st4k3,String st4k4k,String st4k5,
			                String st4k6,String st4k7){
	  stt4k1=st4k1;
	  stt4k2=st4k2;
	  stt4k3=st4k3;
	  stt4k4k=st4k4k;
	  stt4k5=st4k5;
	  stt4k6=st4k6;
	  stt4k7=st4k7;

	 }
	 
	 private  String stt4k1;
	 private  String stt4k2;
	 private String stt4k3;
	 private  String stt4k4k;
	 private  String stt4k5;
	 private  String stt4k6;
	 private  String stt4k7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4k1",
					stt4k1);
			System.setProperty("stt4k2",
					stt4k2);
			System.setProperty("stt4k3",
					stt4k3);
			System.setProperty("stt4k4k",
					stt4k4k);
			System.setProperty("stt4k5",
					stt4k5);
			System.setProperty("stt4k6",
					stt4k6);
			System.setProperty("stt4k7",
					stt4k7);

			
			System.setProperty("Test4kInit",
					"Test4kInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4k5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4kInit.class/jcp.xml");
			
			System.setProperty("Test4kss4k_0x",
					"Test4kss4k_0xjcp.xml");
         	System.setProperty("Test4kss4k_02",
					"Test4kss4k_02xml.config");
			System.setProperty("Test4kss4k_03",
					"Test4kss4k_03.apache.xml.resource.security.");
		    System.setProperty("Test4kss4k_04k",
					"Test4kss4k_04k.resource.");
			System.setProperty("Test4kss4k_05",
					"Test4kss4k_05.isInitialized");
			System.setProperty("Test4kss4k_06",
					"Test4kss4k_06_4kInit.class/jcp.xml");
			System.setProperty("Test4kss4k_07",
					"Test4kss4k_07t/resource/jcp.xml");
         	System.setProperty("Test4kss4k_08",
					"Test4kss4k_08.config");
			System.setProperty("Test4kss4k_09",
					"Test4kss4k_09.security.");
		    System.setProperty("Test4kss4k_0x0",
					"Test4kss4k_0x0jcp.xmlapache.");
			System.setProperty("Test4kss4k_0xx0",
					"Test4kss4k_0xx0.isInitialized");
			System.setProperty("Test4kss4k_0xxx0",
					"Test4kss4k_0xxx0est4kInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4k5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4k = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4k != null) {
				 
				LOGGER.debug("in0in isTest4k");
				LOGGER.debug("inxin isTest4k");
				LOGGER.debug("in2in isTest4k");
				LOGGER.debug("in3in isTest4k");
				LOGGER.debug("in4kin isTest4k");
				LOGGER.debug("in5in isTest4k");
				LOGGER.debug("in6in isTest4k");
				LOGGER.debug("in7in isTest4k");
				LOGGER.debug("in8in isTest4k");
				LOGGER.debug("in9in isTest4k");
				LOGGER.debug("inx0in isTest4k");
				LOGGER.debug("inxxin isTest4k");
				LOGGER.debug("inx2in isTest4k");
				LOGGER.debug("inx3in isTest4k");
				LOGGER.debug("inx4kin isTest4k");
				LOGGER.debug("inx5in isTest4k");
				LOGGER.debug("inx6in isTest4k");
				LOGGER.debug("inx7in isTest4k");
				LOGGER.debug("inx8in isTest4k");
				LOGGER.debug("inx9in isTest4k");
				LOGGER.debug("in20in isTest4k");
			}

			 

			DocumentBuilderFactory dbfTest4k = DocumentBuilderFactory.newInstance();
			dbfTest4k.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4k.setNamespaceAware(true);
			dbfTest4k.setValidating(false);

			DocumentBuilder db = dbfTest4k.newDocumentBuilder();
			Document doc = db.parse(isTest4k);
			Node configTest4k = doc.getFirstChild();
			while ((configTest4k != null)
					&& (!"Configuration".equals(configTest4k.getLocalName()))) {
				configTest4k = configTest4k.getNextSibling();
			}

			if (configTest4k != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4k!=null?configTest4k.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4k = (Element) el;

					Attr langAttr = resourceTest4k
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4k
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4k = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4k);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4k.length; i++) {
						String uri = listTest4k[i].getAttributeNS(null, "URI");
						String javaclass = listTest4k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4k.length; i++) {
						String uritrans = tranElemTest4k[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4k = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4k != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4k.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4k = algorithms[i];
							String id = elementTest4k.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4k));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4k.length; i++) {
						String urisign = sigElemsTest4k[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4k[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4k.length; i++) {
						String javaclass = resolverElemTest4k[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4kRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4kRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4kRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4kCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4k = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest4k = new ArrayList<String>(resolverElemTest4k.length);
					for (int i = 0; i < resolverElemTest4k.length; i++) {
						String javaclass = resolverElemTest4k[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4k = resolverElemTest4k[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4k != null) && (descriptionTest4k.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4k);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4k);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4k.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4k);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4k = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4k.length; i++) {
						String namespace = nlTest4k[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4k[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4k ) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", exs4k);
 } catch (ClassNotFoundException enf4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", enf4k);
 } catch (IllegalAccessException eia4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", eia4k);
 } catch (InstantiationException e4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", e4k);
 } catch (javax.xml.parsers.ParserConfigurationException epc4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", epc4k);
 } catch (org.xml.sax.SAXException ese4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", ese4k);
 } catch (java.io.IOException eio4k) {
 LOGGER.error("Crypto4kInit:fileInit:error: ", eio4k);
 }

	}

}
