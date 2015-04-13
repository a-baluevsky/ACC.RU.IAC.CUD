package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoBaseTableInit(String st4p1,String st4p2,String st4p3,String st4p4p,String st4p5,
			                String st4p6,String st4p7){
	  stt4p1=st4p1;
	  stt4p2=st4p2;
	  stt4p3=st4p3;
	  stt4p4p=st4p4p;
	  stt4p5=st4p5;
	  stt4p6=st4p6;
	  stt4p7=st4p7;

	 }
	 
	 private  String stt4p1;
	 private  String stt4p2;
	 private String stt4p3;
	 private  String stt4p4p;
	 private  String stt4p5;
	 private  String stt4p6;
	 private  String stt4p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4p1",
					stt4p1);
			System.setProperty("stt4p2",
					stt4p2);
			System.setProperty("stt4p3",
					stt4p3);
			System.setProperty("stt4p4p",
					stt4p4p);
			System.setProperty("stt4p5",
					stt4p5);
			System.setProperty("stt4p6",
					stt4p6);
			System.setProperty("stt4p7",
					stt4p7);

			
			System.setProperty("Test4pInit",
					"Test4pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4pInit.class/jcp.xml");
			
			System.setProperty("Test4pss4p_0x",
					"Test4pss4p_0xjcp.xml");
         	System.setProperty("Test4pss4p_02",
					"Test4pss4p_02xml.config");
			System.setProperty("Test4pss4p_03",
					"Test4pss4p_03.apache.xml.resource.security.");
		    System.setProperty("Test4pss4p_04p",
					"Test4pss4p_04p.resource.");
			System.setProperty("Test4pss4p_05",
					"Test4pss4p_05.isInitialized");
			System.setProperty("Test4pss4p_06",
					"Test4pss4p_06_4pInit.class/jcp.xml");
			System.setProperty("Test4pss4p_07",
					"Test4pss4p_07t/resource/jcp.xml");
         	System.setProperty("Test4pss4p_08",
					"Test4pss4p_08.config");
			System.setProperty("Test4pss4p_09",
					"Test4pss4p_09.security.");
		    System.setProperty("Test4pss4p_0x0",
					"Test4pss4p_0x0jcp.xmlapache.");
			System.setProperty("Test4pss4p_0xx0",
					"Test4pss4p_0xx0.isInitialized");
			System.setProperty("Test4pss4p_0xxx0",
					"Test4pss4p_0xxx0est4pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4p = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4p != null) {
				 
				LOGGER.debug("in0in isTest4p");
				LOGGER.debug("inxin isTest4p");
				LOGGER.debug("in2in isTest4p");
				LOGGER.debug("in3in isTest4p");
				LOGGER.debug("in4pin isTest4p");
				LOGGER.debug("in5in isTest4p");
				LOGGER.debug("in6in isTest4p");
				LOGGER.debug("in7in isTest4p");
				LOGGER.debug("in8in isTest4p");
				LOGGER.debug("in9in isTest4p");
				LOGGER.debug("inx0in isTest4p");
				LOGGER.debug("inxxin isTest4p");
				LOGGER.debug("inx2in isTest4p");
				LOGGER.debug("inx3in isTest4p");
				LOGGER.debug("inx4pin isTest4p");
				LOGGER.debug("inx5in isTest4p");
				LOGGER.debug("inx6in isTest4p");
				LOGGER.debug("inx7in isTest4p");
				LOGGER.debug("inx8in isTest4p");
				LOGGER.debug("inx9in isTest4p");
				LOGGER.debug("in20in isTest4p");
			}

			 

			DocumentBuilderFactory dbfTest4p = DocumentBuilderFactory.newInstance();
			dbfTest4p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4p.setNamespaceAware(true);
			dbfTest4p.setValidating(false);

			DocumentBuilder db = dbfTest4p.newDocumentBuilder();
			Document doc = db.parse(isTest4p);
			Node configTest4p = doc.getFirstChild();
			while ((configTest4p != null)
					&& (!"Configuration".equals(configTest4p.getLocalName()))) {
				configTest4p = configTest4p.getNextSibling();
			}

			if (configTest4p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4p!=null?configTest4p.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4p = (Element) el;

					Attr langAttr = resourceTest4p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4p.length; i++) {
						String uri = listTest4p[i].getAttributeNS(null, "URI");
						String javaclass = listTest4p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4p.length; i++) {
						String uritrans = tranElemTest4p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4p = algorithms[i];
							String id = elementTest4p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4p.length; i++) {
						String urisign = sigElemsTest4p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4p.length; i++) {
						String javaclass = resolverElemTest4p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4pRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4pRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4p = new ArrayList(resolverElemTest4p.length);
					for (int i = 0; i < resolverElemTest4p.length; i++) {
						String javaclass = resolverElemTest4p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4p = resolverElemTest4p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4p != null) && (descriptionTest4p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4p);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4p);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4p.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4p.length; i++) {
						String namespace = nlTest4p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4p ) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", exs4p);
 } catch (ClassNotFoundException enf4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", enf4p);
 } catch (IllegalAccessException eia4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", eia4p);
 } catch (InstantiationException e4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", e4p);
 } catch (javax.xml.parsers.ParserConfigurationException epc4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", epc4p);
 } catch (org.xml.sax.SAXException ese4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", ese4p);
 } catch (java.io.IOException eio4p) {
 LOGGER.error("Crypto4pInit:fileInit:error: ", eio4p);
 }

	}

}
