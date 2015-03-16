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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2m1,String st2m2m,String st2m3,String st2m4,String st2m5,
			                String st2m6,String st2m7){
	  stt2m1=st2m1;
	  stt2m2m=st2m2m;
	  stt2m3=st2m3;
	  stt2m4=st2m4;
	  stt2m5=st2m5;
	  stt2m6=st2m6;
	  stt2m7=st2m7;

	 }
	 
	 private  String stt2m1;
	 private  String stt2m2m;
	 private String stt2m3;
	 private  String stt2m4;
	 private  String stt2m5;
	 private  String stt2m6;
	 private  String stt2m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2m1",
					stt2m1);
			System.setProperty("stt2m2m",
					stt2m2m);
			System.setProperty("stt2m3",
					stt2m3);
			System.setProperty("stt2m4",
					stt2m4);
			System.setProperty("stt2m5",
					stt2m5);
			System.setProperty("stt2m6",
					stt2m6);
			System.setProperty("stt2m7",
					stt2m7);

			
			System.setProperty("Test2mInit",
					"Test2mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2mInit.class/jcp.xml");
			
			System.setProperty("Test2mss2m_0x",
					"Test2mss2m_0xjcp.xml");
         	System.setProperty("Test2mss2m_02m",
					"Test2mss2m_02mxml.config");
			System.setProperty("Test2mss2m_03",
					"Test2mss2m_03.apache.xml.resource.security.");
		    System.setProperty("Test2mss2m_04",
					"Test2mss2m_04.resource.");
			System.setProperty("Test2mss2m_05",
					"Test2mss2m_05.isInitialized");
			System.setProperty("Test2mss2m_06",
					"Test2mss2m_06_2mInit.class/jcp.xml");
			System.setProperty("Test2mss2m_07",
					"Test2mss2m_07t/resource/jcp.xml");
         	System.setProperty("Test2mss2m_08",
					"Test2mss2m_08.config");
			System.setProperty("Test2mss2m_09",
					"Test2mss2m_09.security.");
		    System.setProperty("Test2mss2m_0x0",
					"Test2mss2m_0x0jcp.xmlapache.");
			System.setProperty("Test2mss2m_0xx0",
					"Test2mss2m_0xx0.isInitialized");
			System.setProperty("Test2mss2m_0xxx0",
					"Test2mss2m_0xxx0est2mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2m = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2m != null) {
				 
				LOGGER.debug("in0in isTest2m");
				LOGGER.debug("inxin isTest2m");
				LOGGER.debug("in2min isTest2m");
				LOGGER.debug("in3in isTest2m");
				LOGGER.debug("in4in isTest2m");
				LOGGER.debug("in5in isTest2m");
				LOGGER.debug("in6in isTest2m");
				LOGGER.debug("in7in isTest2m");
				LOGGER.debug("in8in isTest2m");
				LOGGER.debug("in9in isTest2m");
				LOGGER.debug("inx0in isTest2m");
				LOGGER.debug("inxxin isTest2m");
				LOGGER.debug("inx2min isTest2m");
				LOGGER.debug("inx3in isTest2m");
				LOGGER.debug("inx4in isTest2m");
				LOGGER.debug("inx5in isTest2m");
				LOGGER.debug("inx6in isTest2m");
				LOGGER.debug("inx7in isTest2m");
				LOGGER.debug("inx8in isTest2m");
				LOGGER.debug("inx9in isTest2m");
				LOGGER.debug("in2m0in isTest2m");
			}

			 

			DocumentBuilderFactory dbfTest2m = DocumentBuilderFactory.newInstance();
			dbfTest2m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2m.setNamespaceAware(true);
			dbfTest2m.setValidating(false);

			DocumentBuilder db = dbfTest2m.newDocumentBuilder();
			Document doc = db.parse(isTest2m);
			Node configTest2m = doc.getFirstChild();
			while ((configTest2m != null)
					&& (!"Configuration".equals(configTest2m.getLocalName()))) {
				configTest2m = configTest2m.getNextSibling();
			}

			if (configTest2m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2m.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2m = (Element) el;

					Attr langAttr = resourceTest2m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2m.length; i++) {
						String uri = listTest2m[i].getAttributeNS(null, "URI");
						String javaclass = listTest2m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2m.length; i++) {
						String uritrans = tranElemTest2m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2m = algorithms[i];
							String id = elementTest2m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2m.length; i++) {
						String urisign = sigElemsTest2m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2m.length; i++) {
						String javaclass = resolverElemTest2m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2mRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2m = new ArrayList(resolverElemTest2m.length);
					for (int i = 0; i < resolverElemTest2m.length; i++) {
						String javaclass = resolverElemTest2m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2m = resolverElemTest2m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2m != null) && (descriptionTest2m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2m);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2m);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2m.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2m.length; i++) {
						String namespace = nlTest2m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2m) {
			LOGGER.error("Crypto2m5Init:fileInit:error: ", eTest2m);
		}
	}

}
