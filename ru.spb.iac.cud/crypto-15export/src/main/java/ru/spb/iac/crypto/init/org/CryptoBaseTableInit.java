package ru.spb.iac.crypto.init.org;

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
	 
	 
	 public CryptoBaseTableInit(String st4l1,String st4l2,String st4l3,String st4l4l,String st4l5,
			                String st4l6,String st4l7){
	  stt4l1=st4l1;
	  stt4l2=st4l2;
	  stt4l3=st4l3;
	  stt4l4l=st4l4l;
	  stt4l5=st4l5;
	  stt4l6=st4l6;
	  stt4l7=st4l7;

	 }
	 
	 private  String stt4l1;
	 private  String stt4l2;
	 private String stt4l3;
	 private  String stt4l4l;
	 private  String stt4l5;
	 private  String stt4l6;
	 private  String stt4l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4l1",
					stt4l1);
			System.setProperty("stt4l2",
					stt4l2);
			System.setProperty("stt4l3",
					stt4l3);
			System.setProperty("stt4l4l",
					stt4l4l);
			System.setProperty("stt4l5",
					stt4l5);
			System.setProperty("stt4l6",
					stt4l6);
			System.setProperty("stt4l7",
					stt4l7);

			
			System.setProperty("Test4lInit",
					"Test4lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4lInit.class/jcp.xml");
			
			System.setProperty("Test4lss4l_0x",
					"Test4lss4l_0xjcp.xml");
         	System.setProperty("Test4lss4l_02",
					"Test4lss4l_02xml.config");
			System.setProperty("Test4lss4l_03",
					"Test4lss4l_03.apache.xml.resource.security.");
		    System.setProperty("Test4lss4l_04l",
					"Test4lss4l_04l.resource.");
			System.setProperty("Test4lss4l_05",
					"Test4lss4l_05.isInitialized");
			System.setProperty("Test4lss4l_06",
					"Test4lss4l_06_4lInit.class/jcp.xml");
			System.setProperty("Test4lss4l_07",
					"Test4lss4l_07t/resource/jcp.xml");
         	System.setProperty("Test4lss4l_08",
					"Test4lss4l_08.config");
			System.setProperty("Test4lss4l_09",
					"Test4lss4l_09.security.");
		    System.setProperty("Test4lss4l_0x0",
					"Test4lss4l_0x0jcp.xmlapache.");
			System.setProperty("Test4lss4l_0xx0",
					"Test4lss4l_0xx0.isInitialized");
			System.setProperty("Test4lss4l_0xxx0",
					"Test4lss4l_0xxx0est4lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4l = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4l != null) {
				 
				LOGGER.debug("in0in isTest4l");
				LOGGER.debug("inxin isTest4l");
				LOGGER.debug("in2in isTest4l");
				LOGGER.debug("in3in isTest4l");
				LOGGER.debug("in4lin isTest4l");
				LOGGER.debug("in5in isTest4l");
				LOGGER.debug("in6in isTest4l");
				LOGGER.debug("in7in isTest4l");
				LOGGER.debug("in8in isTest4l");
				LOGGER.debug("in9in isTest4l");
				LOGGER.debug("inx0in isTest4l");
				LOGGER.debug("inxxin isTest4l");
				LOGGER.debug("inx2in isTest4l");
				LOGGER.debug("inx3in isTest4l");
				LOGGER.debug("inx4lin isTest4l");
				LOGGER.debug("inx5in isTest4l");
				LOGGER.debug("inx6in isTest4l");
				LOGGER.debug("inx7in isTest4l");
				LOGGER.debug("inx8in isTest4l");
				LOGGER.debug("inx9in isTest4l");
				LOGGER.debug("in20in isTest4l");
			}

			 

			DocumentBuilderFactory dbfTest4l = DocumentBuilderFactory.newInstance();
			dbfTest4l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4l.setNamespaceAware(true);
			dbfTest4l.setValidating(false);

			DocumentBuilder db = dbfTest4l.newDocumentBuilder();
			Document doc = db.parse(isTest4l);
			Node configTest4l = doc.getFirstChild();
			while ((configTest4l != null)
					&& (!"Configuration".equals(configTest4l.getLocalName()))) {
				configTest4l = configTest4l.getNextSibling();
			}

			if (configTest4l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4l!=null?configTest4l.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4l = (Element) el;

					Attr langAttr = resourceTest4l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4l.length; i++) {
						String uri = listTest4l[i].getAttributeNS(null, "URI");
						String javaclass = listTest4l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4l.length; i++) {
						String uritrans = tranElemTest4l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4l = algorithms[i];
							String id = elementTest4l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4l.length; i++) {
						String urisign = sigElemsTest4l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4l.length; i++) {
						String javaclass = resolverElemTest4l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4lRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4lRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4l = new ArrayList(resolverElemTest4l.length);
					for (int i = 0; i < resolverElemTest4l.length; i++) {
						String javaclass = resolverElemTest4l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4l = resolverElemTest4l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4l != null) && (descriptionTest4l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4l);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4l);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4l.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4l.length; i++) {
						String namespace = nlTest4l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4l ) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", exs4l);
 } catch (ClassNotFoundException enf4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", enf4l);
 } catch (IllegalAccessException eia4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", eia4l);
 } catch (InstantiationException e4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", e4l);
 } catch (javax.xml.parsers.ParserConfigurationException epc4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", epc4l);
 } catch (org.xml.sax.SAXException ese4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", ese4l);
 } catch (java.io.IOException eio4l) {
 LOGGER.error("Crypto4lInit:fileInit:error: ", eio4l);
 }

	}

}
