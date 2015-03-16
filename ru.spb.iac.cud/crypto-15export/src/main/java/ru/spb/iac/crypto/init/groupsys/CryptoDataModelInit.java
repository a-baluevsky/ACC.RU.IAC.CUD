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

 public class CryptoDataModelInit {

	 
	 public CryptoDataModelInit(){
	 }
	 
	 
	 public CryptoDataModelInit(String st7m1,String st7m2,String st7m3,String st7m4,String st7m5,
			                String st7m6,String st7m7m){
	  stt7m1=st7m1;
	  stt7m2=st7m2;
	  stt7m3=st7m3;
	  stt7m4=st7m4;
	  stt7m5=st7m5;
	  stt7m6=st7m6;
	  stt7m7m=st7m7m;

	 }
	 
	 private  String stt7m1;
	 private  String stt7m2;
	 private String stt7m3;
	 private  String stt7m4;
	 private  String stt7m5;
	 private  String stt7m6;
	 private  String stt7m7m;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDataModelInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt7m1",
					stt7m1);
			System.setProperty("stt7m2",
					stt7m2);
			System.setProperty("stt7m3",
					stt7m3);
			System.setProperty("stt7m4",
					stt7m4);
			System.setProperty("stt7m5",
					stt7m5);
			System.setProperty("stt7m6",
					stt7m6);
			System.setProperty("stt7m7m",
					stt7m7m);

			
			System.setProperty("Test7mInit",
					"Test7mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto7m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest7mInit.class/jcp.xml");
			
			System.setProperty("Test7mss7m_0x",
					"Test7mss7m_0xjcp.xml");
         	System.setProperty("Test7mss7m_02",
					"Test7mss7m_02xml.config");
			System.setProperty("Test7mss7m_03",
					"Test7mss7m_03.apache.xml.resource.security.");
		    System.setProperty("Test7mss7m_04",
					"Test7mss7m_04.resource.");
			System.setProperty("Test7mss7m_05",
					"Test7mss7m_05.isInitialized");
			System.setProperty("Test7mss7m_06",
					"Test7mss7m_06_7mInit.class/jcp.xml");
			System.setProperty("Test7mss7m_07m",
					"Test7mss7m_07mt/resource/jcp.xml");
         	System.setProperty("Test7mss7m_08",
					"Test7mss7m_08.config");
			System.setProperty("Test7mss7m_09",
					"Test7mss7m_09.security.");
		    System.setProperty("Test7mss7m_0x0",
					"Test7mss7m_0x0jcp.xmlapache.");
			System.setProperty("Test7mss7m_0xx0",
					"Test7mss7m_0xx0.isInitialized");
			System.setProperty("Test7mss7m_0xxx0",
					"Test7mss7m_0xxx0est7mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto7m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest7m = CryptoDataModelInit.class.getResourceAsStream("/jcp.xml");

			if (isTest7m != null) {
				 
				LOGGER.debug("in0in isTest7m");
				LOGGER.debug("inxin isTest7m");
				LOGGER.debug("in2in isTest7m");
				LOGGER.debug("in3in isTest7m");
				LOGGER.debug("in4in isTest7m");
				LOGGER.debug("in5in isTest7m");
				LOGGER.debug("in6in isTest7m");
				LOGGER.debug("in7min isTest7m");
				LOGGER.debug("in8in isTest7m");
				LOGGER.debug("in9in isTest7m");
				LOGGER.debug("inx0in isTest7m");
				LOGGER.debug("inxxin isTest7m");
				LOGGER.debug("inx2in isTest7m");
				LOGGER.debug("inx3in isTest7m");
				LOGGER.debug("inx4in isTest7m");
				LOGGER.debug("inx5in isTest7m");
				LOGGER.debug("inx6in isTest7m");
				LOGGER.debug("inx7min isTest7m");
				LOGGER.debug("inx8in isTest7m");
				LOGGER.debug("inx9in isTest7m");
				LOGGER.debug("in20in isTest7m");
			}

			 

			DocumentBuilderFactory dbfTest7m = DocumentBuilderFactory.newInstance();
			dbfTest7m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest7m.setNamespaceAware(true);
			dbfTest7m.setValidating(false);

			DocumentBuilder db = dbfTest7m.newDocumentBuilder();
			Document doc = db.parse(isTest7m);
			Node configTest7m = doc.getFirstChild();
			while ((configTest7m != null)
					&& (!"Configuration".equals(configTest7m.getLocalName()))) {
				configTest7m = configTest7m.getNextSibling();
			}

			if (configTest7m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest7m.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest7m = (Element) el;

					Attr langAttr = resourceTest7m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest7m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest7m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest7m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest7m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest7m.length; i++) {
						String uri = listTest7m[i].getAttributeNS(null, "URI");
						String javaclass = listTest7m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest7m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest7m.length; i++) {
						String uritrans = tranElemTest7m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest7m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest7m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest7m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest7m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest7m = algorithms[i];
							String id = elementTest7m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest7m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest7m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest7m.length; i++) {
						String urisign = sigElemsTest7m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest7m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest7m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest7m.length; i++) {
						String javaclass = resolverElemTest7m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest7m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test7mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjjjhTest7mRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test7mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test7mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest7m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest7m = new ArrayList(resolverElemTest7m.length);
					for (int i = 0; i < resolverElemTest7m.length; i++) {
						String javaclass = resolverElemTest7m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest7m = resolverElemTest7m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest7m != null) && (descriptionTest7m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest7m);
							
								LOGGER.debug("jkkkRegister Resolver: " + javaclass
										+ ": " + descriptionTest7m);
						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest7m.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest7m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest7m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest7m.length; i++) {
						String namespace = nlTest7m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest7m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest7m) {
			LOGGER.error("Crypto7m5Init:fileInit:error: ", eTest7m);
		}
	}

}
