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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9m1,String st9m2,String st9m3,String st9m4,String st9m5,
			                String st9m6,String st9m7){
	  stt9m1=st9m1;
	  stt9m2=st9m2;
	  stt9m3=st9m3;
	  stt9m4=st9m4;
	  stt9m5=st9m5;
	  stt9m6=st9m6;
	  stt9m7=st9m7;

	 }
	 
	 private  String stt9m1;
	 private  String stt9m2;
	 private String stt9m3;
	 private  String stt9m4;
	 private  String stt9m5;
	 private  String stt9m6;
	 private  String stt9m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9m1",
					stt9m1);
			System.setProperty("stt9m2",
					stt9m2);
			System.setProperty("stt9m3",
					stt9m3);
			System.setProperty("stt9m4",
					stt9m4);
			System.setProperty("stt9m5",
					stt9m5);
			System.setProperty("stt9m6",
					stt9m6);
			System.setProperty("stt9m7",
					stt9m7);

			
			System.setProperty("Test9mInit",
					"Test9mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9mInit.class/jcp.xml");
			
			
			System.setProperty("Test9mss9m_0x",
					"Test9mss9m_0xjcp.xml");
         	System.setProperty("Test9mss9m_02",
					"Test9mss9m_02xml.config");
			System.setProperty("Test9mss9m_03",
					"Test9mss9m_03.apache.xml.resource.security.");
		    System.setProperty("Test9mss9m_04",
					"Test9mss9m_04.resource.");
			System.setProperty("Test9mss9m_05",
					"Test9mss9m_05.isInitialized");
			System.setProperty("Test9mss9m_06",
					"Test9mss9m_06_9mInit.class/jcp.xml");
			System.setProperty("Test9mss9m_07",
					"Test9mss9m_07t/resource/jcp.xml");
         	System.setProperty("Test9mss9m_08",
					"Test9mss9m_08.config");
			System.setProperty("Test9mss9m_09m",
					"Test9mss9m_09m.security.");
		    System.setProperty("Test9mss9m_0x0",
					"Test9mss9m_0x0jcp.xmlapache.");
			System.setProperty("Test9mss9m_0xx0",
					"Test9mss9m_0xx0.isInitialized");
			System.setProperty("Test9mss9m_0xxx0",
					"Test9mss9m_0xxx0est9mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9m = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9m != null) {
				 
				LOGGER.debug("in0in isTest9m");
				LOGGER.debug("inxin isTest9m");
				LOGGER.debug("in2in isTest9m");
				LOGGER.debug("in3in isTest9m");
				LOGGER.debug("in4in isTest9m");
				LOGGER.debug("in5in isTest9m");
				LOGGER.debug("in6in isTest9m");
				LOGGER.debug("in7in isTest9m");
				LOGGER.debug("in8in isTest9m");
				LOGGER.debug("in9min isTest9m");
				LOGGER.debug("inx0in isTest9m");
				LOGGER.debug("inxxin isTest9m");
				LOGGER.debug("inx2in isTest9m");
				LOGGER.debug("inx3in isTest9m");
				LOGGER.debug("inx4in isTest9m");
				LOGGER.debug("inx5in isTest9m");
				LOGGER.debug("inx6in isTest9m");
				LOGGER.debug("inx7in isTest9m");
				LOGGER.debug("inx8in isTest9m");
				LOGGER.debug("inx9min isTest9m");
				LOGGER.debug("in20in isTest9m");
			}

			 

			DocumentBuilderFactory dbfTest9m = DocumentBuilderFactory.newInstance();
			dbfTest9m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9m.setNamespaceAware(true);
			dbfTest9m.setValidating(false);

			DocumentBuilder db = dbfTest9m.newDocumentBuilder();
			Document doc = db.parse(isTest9m);
			Node configTest9m = doc.getFirstChild();
			while ((configTest9m != null)
					&& (!"Configuration".equals(configTest9m.getLocalName()))) {
				configTest9m = configTest9m.getNextSibling();
			}

			if (configTest9m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9m.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9m = (Element) el;

					Attr langAttr = resourceTest9m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9m.length; i++) {
						String uri = listTest9m[i].getAttributeNS(null, "URI");
						String javaclass = listTest9m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9m.length; i++) {
						String uritrans = tranElemTest9m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9m = algorithms[i];
							String id = elementTest9m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9m.length; i++) {
						String urisign = sigElemsTest9m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9m.length; i++) {
						String javaclass = resolverElemTest9m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9mRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9m = new ArrayList(resolverElemTest9m.length);
					for (int i = 0; i < resolverElemTest9m.length; i++) {
						String javaclass = resolverElemTest9m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9m = resolverElemTest9m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9m != null) && (descriptionTest9m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9m);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9m);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9m.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9m.length; i++) {
						String namespace = nlTest9m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9m) {
			LOGGER.error("Crypto9m5Init:fileInit:error: ", eTest9m);
		}
	}

}
