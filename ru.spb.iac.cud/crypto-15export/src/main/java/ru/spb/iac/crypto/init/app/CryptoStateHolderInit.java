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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5p1,String st5p2,String st5p3,String st5p4,String st5p5p,
			                String st5p6,String st5p7){
	  stt5p1=st5p1;
	  stt5p2=st5p2;
	  stt5p3=st5p3;
	  stt5p4=st5p4;
	  stt5p5p=st5p5p;
	  stt5p6=st5p6;
	  stt5p7=st5p7;

	 }
	 
	 private  String stt5p1;
	 private  String stt5p2;
	 private String stt5p3;
	 private  String stt5p4;
	 private  String stt5p5p;
	 private  String stt5p6;
	 private  String stt5p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5p1",
					stt5p1);
			System.setProperty("stt5p2",
					stt5p2);
			System.setProperty("stt5p3",
					stt5p3);
			System.setProperty("stt5p4",
					stt5p4);
			System.setProperty("stt5p5p",
					stt5p5p);
			System.setProperty("stt5p6",
					stt5p6);
			System.setProperty("stt5p7",
					stt5p7);

			
			System.setProperty("Test5pInit",
					"Test5pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5p5pInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5pInit.class/jcp.xml");
			
			System.setProperty("Test5pss5p_0x",
					"Test5pss5p_0xjcp.xml");
         	System.setProperty("Test5pss5p_02",
					"Test5pss5p_02xml.config");
			System.setProperty("Test5pss5p_03",
					"Test5pss5p_03.apache.xml.resource.security.");
		    System.setProperty("Test5pss5p_04",
					"Test5pss5p_04.resource.");
			System.setProperty("Test5pss5p_05p",
					"Test5pss5p_05p.isInitialized");
			System.setProperty("Test5pss5p_06",
					"Test5pss5p_06_5pInit.class/jcp.xml");
			System.setProperty("Test5pss5p_07",
					"Test5pss5p_07t/resource/jcp.xml");
         	System.setProperty("Test5pss5p_08",
					"Test5pss5p_08.config");
			System.setProperty("Test5pss5p_09",
					"Test5pss5p_09.security.");
		    System.setProperty("Test5pss5p_0x0",
					"Test5pss5p_0x0jcp.xmlapache.");
			System.setProperty("Test5pss5p_0xx0",
					"Test5pss5p_0xx0.isInitialized");
			System.setProperty("Test5pss5p_0xxx0",
					"Test5pss5p_0xxx0est5pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5p5pInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5p = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5p != null) {
				 
				LOGGER.debug("in0in isTest5p");
				LOGGER.debug("inxin isTest5p");
				LOGGER.debug("in2in isTest5p");
				LOGGER.debug("in3in isTest5p");
				LOGGER.debug("in4in isTest5p");
				LOGGER.debug("in5pin isTest5p");
				LOGGER.debug("in6in isTest5p");
				LOGGER.debug("in7in isTest5p");
				LOGGER.debug("in8in isTest5p");
				LOGGER.debug("in9in isTest5p");
				LOGGER.debug("inx0in isTest5p");
				LOGGER.debug("inxxin isTest5p");
				LOGGER.debug("inx2in isTest5p");
				LOGGER.debug("inx3in isTest5p");
				LOGGER.debug("inx4in isTest5p");
				LOGGER.debug("inx5pin isTest5p");
				LOGGER.debug("inx6in isTest5p");
				LOGGER.debug("inx7in isTest5p");
				LOGGER.debug("inx8in isTest5p");
				LOGGER.debug("inx9in isTest5p");
				LOGGER.debug("in20in isTest5p");
			}

			 

			DocumentBuilderFactory dbfTest5p = DocumentBuilderFactory.newInstance();
			dbfTest5p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5p.setNamespaceAware(true);
			dbfTest5p.setValidating(false);

			DocumentBuilder db = dbfTest5p.newDocumentBuilder();
			Document doc = db.parse(isTest5p);
			Node configTest5p = doc.getFirstChild();
			while ((configTest5p != null)
					&& (!"Configuration".equals(configTest5p.getLocalName()))) {
				configTest5p = configTest5p.getNextSibling();
			}

			if (configTest5p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5p.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5p = (Element) el;

					Attr langAttr = resourceTest5p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5p.length; i++) {
						String uri = listTest5p[i].getAttributeNS(null, "URI");
						String javaclass = listTest5p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5p.length; i++) {
						String uritrans = tranElemTest5p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5p = algorithms[i];
							String id = elementTest5p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5p.length; i++) {
						String urisign = sigElemsTest5p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5p.length; i++) {
						String javaclass = resolverElemTest5p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5pRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5p = new ArrayList(resolverElemTest5p.length);
					for (int i = 0; i < resolverElemTest5p.length; i++) {
						String javaclass = resolverElemTest5p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5p = resolverElemTest5p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5p != null) && (descriptionTest5p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5p);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5p);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5p.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5p.length; i++) {
						String namespace = nlTest5p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5p) {
			LOGGER.error("Crypto5p5pInit:fileInit:error: ", eTest5p);
		}
	}

}
