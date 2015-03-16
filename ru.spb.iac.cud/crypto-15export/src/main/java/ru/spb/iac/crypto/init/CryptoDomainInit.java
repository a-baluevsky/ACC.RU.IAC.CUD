package ru.spb.iac.crypto.init;

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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st91,String st92,String st93,String st94,String st95,
			                String st96,String st97){
	  stt91=st91;
	  stt92=st92;
	  stt93=st93;
	  stt94=st94;
	  stt95=st95;
	  stt96=st96;
	  stt97=st97;

	 }
	 
	 private  String stt91;
	 private  String stt92;
	 private String stt93;
	 private  String stt94;
	 private  String stt95;
	 private  String stt96;
	 private  String stt97;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt91",
					stt91);
			System.setProperty("stt92",
					stt92);
			System.setProperty("stt93",
					stt93);
			System.setProperty("stt94",
					stt94);
			System.setProperty("stt95",
					stt95);
			System.setProperty("stt96",
					stt96);
			System.setProperty("stt97",
					stt97);

			
			System.setProperty("Test9Init",
					"Test9Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto95Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoDomainInit.class/jcp.xml");
			
			
			System.setProperty("Test9ss9_0x",
					"Test9ss9_0xjcp.xml");
         	System.setProperty("Test9ss9_02",
					"Test9ss9_02xml.config");
			System.setProperty("Test9ss9_03",
					"Test9ss9_03.apache.xml.resource.security.");
		    System.setProperty("Test9ss9_04",
					"Test9ss9_04.resource.");
			System.setProperty("Test9ss9_05",
					"Test9ss9_05.isInitialized");
			System.setProperty("Test9ss9_06",
					"Test9ss9_06_9Init.class/jcp.xml");
			System.setProperty("Test9ss9_07",
					"Test9ss9_07t/resource/jcp.xml");
         	System.setProperty("Test9ss9_08",
					"Test9ss9_08.config");
			System.setProperty("Test9ss9_09",
					"Test9ss9_09.security.");
		    System.setProperty("Test9ss9_0x0",
					"Test9ss9_0x0jcp.xmlapache.");
			System.setProperty("Test9ss9_0xx0",
					"Test9ss9_0xx0.isInitialized");
			System.setProperty("Test9ss9_0xxx0",
					"Test9ss9_0xxx0est9Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto95Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9 = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9 != null) {
				 
				LOGGER.debug("in0in isTest9");
				LOGGER.debug("inxin isTest9");
				LOGGER.debug("in2in isTest9");
				LOGGER.debug("in3in isTest9");
				LOGGER.debug("in4in isTest9");
				LOGGER.debug("in5in isTest9");
				LOGGER.debug("in6in isTest9");
				LOGGER.debug("in7in isTest9");
				LOGGER.debug("in8in isTest9");
				LOGGER.debug("in9in isTest9");
				LOGGER.debug("inx0in isTest9");
				LOGGER.debug("inxxin isTest9");
				LOGGER.debug("inx2in isTest9");
				LOGGER.debug("inx3in isTest9");
				LOGGER.debug("inx4in isTest9");
				LOGGER.debug("inx5in isTest9");
				LOGGER.debug("inx6in isTest9");
				LOGGER.debug("inx7in isTest9");
				LOGGER.debug("inx8in isTest9");
				LOGGER.debug("inx9in isTest9");
				LOGGER.debug("in20in isTest9");
			}

			 

			DocumentBuilderFactory dbfTest9 = DocumentBuilderFactory.newInstance();
			dbfTest9.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9.setNamespaceAware(true);
			dbfTest9.setValidating(false);

			DocumentBuilder db = dbfTest9.newDocumentBuilder();
			Document doc = db.parse(isTest9);
			Node configTest9 = doc.getFirstChild();
			while ((configTest9 != null)
					&& (!"Configuration".equals(configTest9.getLocalName()))) {
				configTest9 = configTest9.getNextSibling();
			}

			if (configTest9 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9 = (Element) el;

					Attr langAttr = resourceTest9
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9.length; i++) {
						String uri = listTest9[i].getAttributeNS(null, "URI");
						String javaclass = listTest9[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9.length; i++) {
						String uritrans = tranElemTest9[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9 = algorithms[i];
							String id = elementTest9.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9.length; i++) {
						String urisign = sigElemsTest9[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9.length; i++) {
						String javaclass = resolverElemTest9[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9Register Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9 = new ArrayList(resolverElemTest9.length);
					for (int i = 0; i < resolverElemTest9.length; i++) {
						String javaclass = resolverElemTest9[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9 = resolverElemTest9[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9 != null) && (descriptionTest9.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9.length; i++) {
						String namespace = nlTest9[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9) {
			LOGGER.error("Crypto95Init:fileInit:error: ", eTest9);
		}
	}

}
