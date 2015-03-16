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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4m1,String st4m2,String st4m3,String st4m4m,String st4m5,
			                String st4m6,String st4m7){
	  stt4m1=st4m1;
	  stt4m2=st4m2;
	  stt4m3=st4m3;
	  stt4m4m=st4m4m;
	  stt4m5=st4m5;
	  stt4m6=st4m6;
	  stt4m7=st4m7;

	 }
	 
	 private  String stt4m1;
	 private  String stt4m2;
	 private String stt4m3;
	 private  String stt4m4m;
	 private  String stt4m5;
	 private  String stt4m6;
	 private  String stt4m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4m1",
					stt4m1);
			System.setProperty("stt4m2",
					stt4m2);
			System.setProperty("stt4m3",
					stt4m3);
			System.setProperty("stt4m4m",
					stt4m4m);
			System.setProperty("stt4m5",
					stt4m5);
			System.setProperty("stt4m6",
					stt4m6);
			System.setProperty("stt4m7",
					stt4m7);

			
			System.setProperty("Test4mInit",
					"Test4mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4mInit.class/jcp.xml");
			
			System.setProperty("Test4mss4m_0x",
					"Test4mss4m_0xjcp.xml");
         	System.setProperty("Test4mss4m_02",
					"Test4mss4m_02xml.config");
			System.setProperty("Test4mss4m_03",
					"Test4mss4m_03.apache.xml.resource.security.");
		    System.setProperty("Test4mss4m_04m",
					"Test4mss4m_04m.resource.");
			System.setProperty("Test4mss4m_05",
					"Test4mss4m_05.isInitialized");
			System.setProperty("Test4mss4m_06",
					"Test4mss4m_06_4mInit.class/jcp.xml");
			System.setProperty("Test4mss4m_07",
					"Test4mss4m_07t/resource/jcp.xml");
         	System.setProperty("Test4mss4m_08",
					"Test4mss4m_08.config");
			System.setProperty("Test4mss4m_09",
					"Test4mss4m_09.security.");
		    System.setProperty("Test4mss4m_0x0",
					"Test4mss4m_0x0jcp.xmlapache.");
			System.setProperty("Test4mss4m_0xx0",
					"Test4mss4m_0xx0.isInitialized");
			System.setProperty("Test4mss4m_0xxx0",
					"Test4mss4m_0xxx0est4mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4m = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4m != null) {
				 
				LOGGER.debug("in0in isTest4m");
				LOGGER.debug("inxin isTest4m");
				LOGGER.debug("in2in isTest4m");
				LOGGER.debug("in3in isTest4m");
				LOGGER.debug("in4min isTest4m");
				LOGGER.debug("in5in isTest4m");
				LOGGER.debug("in6in isTest4m");
				LOGGER.debug("in7in isTest4m");
				LOGGER.debug("in8in isTest4m");
				LOGGER.debug("in9in isTest4m");
				LOGGER.debug("inx0in isTest4m");
				LOGGER.debug("inxxin isTest4m");
				LOGGER.debug("inx2in isTest4m");
				LOGGER.debug("inx3in isTest4m");
				LOGGER.debug("inx4min isTest4m");
				LOGGER.debug("inx5in isTest4m");
				LOGGER.debug("inx6in isTest4m");
				LOGGER.debug("inx7in isTest4m");
				LOGGER.debug("inx8in isTest4m");
				LOGGER.debug("inx9in isTest4m");
				LOGGER.debug("in20in isTest4m");
			}

			 

			DocumentBuilderFactory dbfTest4m = DocumentBuilderFactory.newInstance();
			dbfTest4m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4m.setNamespaceAware(true);
			dbfTest4m.setValidating(false);

			DocumentBuilder db = dbfTest4m.newDocumentBuilder();
			Document doc = db.parse(isTest4m);
			Node configTest4m = doc.getFirstChild();
			while ((configTest4m != null)
					&& (!"Configuration".equals(configTest4m.getLocalName()))) {
				configTest4m = configTest4m.getNextSibling();
			}

			if (configTest4m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4m.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4m = (Element) el;

					Attr langAttr = resourceTest4m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4m.length; i++) {
						String uri = listTest4m[i].getAttributeNS(null, "URI");
						String javaclass = listTest4m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4m.length; i++) {
						String uritrans = tranElemTest4m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4m = algorithms[i];
							String id = elementTest4m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4m.length; i++) {
						String urisign = sigElemsTest4m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4m.length; i++) {
						String javaclass = resolverElemTest4m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4mRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4mRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4m = new ArrayList(resolverElemTest4m.length);
					for (int i = 0; i < resolverElemTest4m.length; i++) {
						String javaclass = resolverElemTest4m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4m = resolverElemTest4m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4m != null) && (descriptionTest4m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4m);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4m);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4m.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest4m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4m.length; i++) {
						String namespace = nlTest4m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest4m) {
			LOGGER.error("Crypto4m5Init:fileInit:error: ", eTest4m);
		}
	}

}
