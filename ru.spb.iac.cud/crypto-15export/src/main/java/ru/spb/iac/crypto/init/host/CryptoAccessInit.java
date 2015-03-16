package ru.spb.iac.crypto.init.host;

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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1o1o,String st1o2,String st1o3,String st1o4,String st1o5,
			                String st1o6,String st1o7){
	  stt1o1o=st1o1o;
	  stt1o2=st1o2;
	  stt1o3=st1o3;
	  stt1o4=st1o4;
	  stt1o5=st1o5;
	  stt1o6=st1o6;
	  stt1o7=st1o7;

	 }
	 
	 private  String stt1o1o;
	 private  String stt1o2;
	 private String stt1o3;
	 private  String stt1o4;
	 private  String stt1o5;
	 private  String stt1o6;
	 private  String stt1o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1o1o",
					stt1o1o);
			System.setProperty("stt1o2",
					stt1o2);
			System.setProperty("stt1o3",
					stt1o3);
			System.setProperty("stt1o4",
					stt1o4);
			System.setProperty("stt1o5",
					stt1o5);
			System.setProperty("stt1o6",
					stt1o6);
			System.setProperty("stt1o7",
					stt1o7);

			
			System.setProperty("Test1oInit",
					"Test1oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1oInit.class/jcp.xml");
			
			System.setProperty("Test1oss1o_0x",
					"Test1oss1o_0xjcp.xml");
         	System.setProperty("Test1oss1o_02",
					"Test1oss1o_02xml.config");
			System.setProperty("Test1oss1o_03",
					"Test1oss1o_03.apache.xml.resource.security.");
		    System.setProperty("Test1oss1o_04",
					"Test1oss1o_04.resource.");
			System.setProperty("Test1oss1o_05",
					"Test1oss1o_05.isInitialized");
			System.setProperty("Test1oss1o_06",
					"Test1oss1o_06_1oInit.class/jcp.xml");
			System.setProperty("Test1oss1o_07",
					"Test1oss1o_07t/resource/jcp.xml");
         	System.setProperty("Test1oss1o_08",
					"Test1oss1o_08.config");
			System.setProperty("Test1oss1o_09",
					"Test1oss1o_09.security.");
		    System.setProperty("Test1oss1o_0x0",
					"Test1oss1o_0x0jcp.xmlapache.");
			System.setProperty("Test1oss1o_0xx0",
					"Test1oss1o_0xx0.isInitialized");
			System.setProperty("Test1oss1o_0xxx0",
					"Test1oss1o_0xxx0est1oInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1o = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1o != null) {
				 
				LOGGER.debug("in0in isTest1o");
				LOGGER.debug("in1oin isTest1o");
				LOGGER.debug("in2in isTest1o");
				LOGGER.debug("in3in isTest1o");
				LOGGER.debug("in4in isTest1o");
				LOGGER.debug("in5in isTest1o");
				LOGGER.debug("in6in isTest1o");
				LOGGER.debug("in7in isTest1o");
				LOGGER.debug("in8in isTest1o");
				LOGGER.debug("in9in isTest1o");
				LOGGER.debug("in1o0in isTest1o");
				LOGGER.debug("in1o1oin isTest1o");
				LOGGER.debug("in1o2in isTest1o");
				LOGGER.debug("in1o3in isTest1o");
				LOGGER.debug("in1o4in isTest1o");
				LOGGER.debug("in1o5in isTest1o");
				LOGGER.debug("in1o6in isTest1o");
				LOGGER.debug("in1o7in isTest1o");
				LOGGER.debug("in1o8in isTest1o");
				LOGGER.debug("in1o9in isTest1o");
				LOGGER.debug("in20in isTest1o");
			}

			 

			DocumentBuilderFactory dbfTest1o = DocumentBuilderFactory.newInstance();
			dbfTest1o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1o.setNamespaceAware(true);
			dbfTest1o.setValidating(false);

			DocumentBuilder db = dbfTest1o.newDocumentBuilder();
			Document doc = db.parse(isTest1o);
			Node configTest1o = doc.getFirstChild();
			while ((configTest1o != null)
					&& (!"Configuration".equals(configTest1o.getLocalName()))) {
				configTest1o = configTest1o.getNextSibling();
			}

			if (configTest1o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1o.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1o = (Element) el;

					Attr langAttr = resourceTest1o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1o.length; i++) {
						String uri = listTest1o[i].getAttributeNS(null, "URI");
						String javaclass = listTest1o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1o.length; i++) {
						String uritrans = tranElemTest1o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1o = algorithms[i];
							String id = elementTest1o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1o.length; i++) {
						String urisign = sigElemsTest1o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1o.length; i++) {
						String javaclass = resolverElemTest1o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1o-Test1oRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1o = new ArrayList(resolverElemTest1o.length);
					for (int i = 0; i < resolverElemTest1o.length; i++) {
						String javaclass = resolverElemTest1o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1o = resolverElemTest1o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1o != null) && (descriptionTest1o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1o);
								LOGGER.debug("Test1oRegister Resolver: " + javaclass
										+ ": " + descriptionTest1o);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1o.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest1o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1o.length; i++) {
						String namespace = nlTest1o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest1o) {
			LOGGER.error("Crypto1o5Init:fileInit:error: ", eTest1o);
		}
	}

}
