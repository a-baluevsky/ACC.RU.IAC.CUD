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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st21,String st22,String st23,String st24,String st25,
			                String st26,String st27){
	  stt21=st21;
	  stt22=st22;
	  stt23=st23;
	  stt24=st24;
	  stt25=st25;
	  stt26=st26;
	  stt27=st27;

	 }
	 
	 private  String stt21;
	 private  String stt22;
	 private String stt23;
	 private  String stt24;
	 private  String stt25;
	 private  String stt26;
	 private  String stt27;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt21",
					stt21);
			System.setProperty("stt22",
					stt22);
			System.setProperty("stt23",
					stt23);
			System.setProperty("stt24",
					stt24);
			System.setProperty("stt25",
					stt25);
			System.setProperty("stt26",
					stt26);
			System.setProperty("stt27",
					stt27);

			
			System.setProperty("Test2Init",
					"Test2Init/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto25Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoAccessGroupInit.class/jcp.xml");
			
			System.setProperty("Test2ss2_0x",
					"Test2ss2_0xjcp.xml");
         	System.setProperty("Test2ss2_02",
					"Test2ss2_02xml.config");
			System.setProperty("Test2ss2_03",
					"Test2ss2_03.apache.xml.resource.security.");
		    System.setProperty("Test2ss2_04",
					"Test2ss2_04.resource.");
			System.setProperty("Test2ss2_05",
					"Test2ss2_05.isInitialized");
			System.setProperty("Test2ss2_06",
					"Test2ss2_06_2Init.class/jcp.xml");
			System.setProperty("Test2ss2_07",
					"Test2ss2_07t/resource/jcp.xml");
         	System.setProperty("Test2ss2_08",
					"Test2ss2_08.config");
			System.setProperty("Test2ss2_09",
					"Test2ss2_09.security.");
		    System.setProperty("Test2ss2_0x0",
					"Test2ss2_0x0jcp.xmlapache.");
			System.setProperty("Test2ss2_0xx0",
					"Test2ss2_0xx0.isInitialized");
			System.setProperty("Test2ss2_0xxx0",
					"Test2ss2_0xxx0est2Init.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto25Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2 = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2 != null) {
				 
				LOGGER.debug("in0in isTest2");
				LOGGER.debug("inxin isTest2");
				LOGGER.debug("in2in isTest2");
				LOGGER.debug("in3in isTest2");
				LOGGER.debug("in4in isTest2");
				LOGGER.debug("in5in isTest2");
				LOGGER.debug("in6in isTest2");
				LOGGER.debug("in7in isTest2");
				LOGGER.debug("in8in isTest2");
				LOGGER.debug("in9in isTest2");
				LOGGER.debug("inx0in isTest2");
				LOGGER.debug("inxxin isTest2");
				LOGGER.debug("inx2in isTest2");
				LOGGER.debug("inx3in isTest2");
				LOGGER.debug("inx4in isTest2");
				LOGGER.debug("inx5in isTest2");
				LOGGER.debug("inx6in isTest2");
				LOGGER.debug("inx7in isTest2");
				LOGGER.debug("inx8in isTest2");
				LOGGER.debug("inx9in isTest2");
				LOGGER.debug("in20in isTest2");
			}

			 

			DocumentBuilderFactory dbfTest2 = DocumentBuilderFactory.newInstance();
			dbfTest2.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2.setNamespaceAware(true);
			dbfTest2.setValidating(false);

			DocumentBuilder db = dbfTest2.newDocumentBuilder();
			Document doc = db.parse(isTest2);
			Node configTest2 = doc.getFirstChild();
			while ((configTest2 != null)
					&& (!"Configuration".equals(configTest2.getLocalName()))) {
				configTest2 = configTest2.getNextSibling();
			}

			if (configTest2 != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2 = (Element) el;

					Attr langAttr = resourceTest2
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2 = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2.length; i++) {
						String uri = listTest2[i].getAttributeNS(null, "URI");
						String javaclass = listTest2[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2.length; i++) {
						String uritrans = tranElemTest2[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2 = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2 != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2 = algorithms[i];
							String id = elementTest2.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2.length; i++) {
						String urisign = sigElemsTest2[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2.length; i++) {
						String javaclass = resolverElemTest2[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2Register Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2Register Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2Cannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2 = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2 = new ArrayList(resolverElemTest2.length);
					for (int i = 0; i < resolverElemTest2.length; i++) {
						String javaclass = resolverElemTest2[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2 = resolverElemTest2[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2 != null) && (descriptionTest2.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2 = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2.length; i++) {
						String namespace = nlTest2[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2) {
			LOGGER.error("Crypto25Init:fileInit:error: ", eTest2);
		}
	}

}
