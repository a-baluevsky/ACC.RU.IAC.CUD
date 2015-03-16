package ru.spb.iac.crypto.init.arm;

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
	 
	 
	 public CryptoBaseTableInit(String st4b1,String st4b2,String st4b3,String st4b4b,String st4b5,
			                String st4b6,String st4b7){
	  stt4b1=st4b1;
	  stt4b2=st4b2;
	  stt4b3=st4b3;
	  stt4b4b=st4b4b;
	  stt4b5=st4b5;
	  stt4b6=st4b6;
	  stt4b7=st4b7;

	 }
	 
	 private  String stt4b1;
	 private  String stt4b2;
	 private String stt4b3;
	 private  String stt4b4b;
	 private  String stt4b5;
	 private  String stt4b6;
	 private  String stt4b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4b1",
					stt4b1);
			System.setProperty("stt4b2",
					stt4b2);
			System.setProperty("stt4b3",
					stt4b3);
			System.setProperty("stt4b4b",
					stt4b4b);
			System.setProperty("stt4b5",
					stt4b5);
			System.setProperty("stt4b6",
					stt4b6);
			System.setProperty("stt4b7",
					stt4b7);

			
			System.setProperty("Test4bInit",
					"Test4bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4bInit.class/jcp.xml");
			
			System.setProperty("Test4bss4b_0x",
					"Test4bss4b_0xjcp.xml");
         	System.setProperty("Test4bss4b_02",
					"Test4bss4b_02xml.config");
			System.setProperty("Test4bss4b_03",
					"Test4bss4b_03.apache.xml.resource.security.");
		    System.setProperty("Test4bss4b_04b",
					"Test4bss4b_04b.resource.");
			System.setProperty("Test4bss4b_05",
					"Test4bss4b_05.isInitialized");
			System.setProperty("Test4bss4b_06",
					"Test4bss4b_06_4bInit.class/jcp.xml");
			System.setProperty("Test4bss4b_07",
					"Test4bss4b_07t/resource/jcp.xml");
         	System.setProperty("Test4bss4b_08",
					"Test4bss4b_08.config");
			System.setProperty("Test4bss4b_09",
					"Test4bss4b_09.security.");
		    System.setProperty("Test4bss4b_0x0",
					"Test4bss4b_0x0jcp.xmlapache.");
			System.setProperty("Test4bss4b_0xx0",
					"Test4bss4b_0xx0.isInitialized");
			System.setProperty("Test4bss4b_0xxx0",
					"Test4bss4b_0xxx0est4bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4b = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4b != null) {
				 
				LOGGER.debug("in0in isTest4b");
				LOGGER.debug("inxin isTest4b");
				LOGGER.debug("in2in isTest4b");
				LOGGER.debug("in3in isTest4b");
				LOGGER.debug("in4bin isTest4b");
				LOGGER.debug("in5in isTest4b");
				LOGGER.debug("in6in isTest4b");
				LOGGER.debug("in7in isTest4b");
				LOGGER.debug("in8in isTest4b");
				LOGGER.debug("in9in isTest4b");
				LOGGER.debug("inx0in isTest4b");
				LOGGER.debug("inxxin isTest4b");
				LOGGER.debug("inx2in isTest4b");
				LOGGER.debug("inx3in isTest4b");
				LOGGER.debug("inx4bin isTest4b");
				LOGGER.debug("inx5in isTest4b");
				LOGGER.debug("inx6in isTest4b");
				LOGGER.debug("inx7in isTest4b");
				LOGGER.debug("inx8in isTest4b");
				LOGGER.debug("inx9in isTest4b");
				LOGGER.debug("in20in isTest4b");
			}

			 

			DocumentBuilderFactory dbfTest4b = DocumentBuilderFactory.newInstance();
			dbfTest4b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4b.setNamespaceAware(true);
			dbfTest4b.setValidating(false);

			DocumentBuilder db = dbfTest4b.newDocumentBuilder();
			Document doc = db.parse(isTest4b);
			Node configTest4b = doc.getFirstChild();
			while ((configTest4b != null)
					&& (!"Configuration".equals(configTest4b.getLocalName()))) {
				configTest4b = configTest4b.getNextSibling();
			}

			if (configTest4b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4b.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4b = (Element) el;

					Attr langAttr = resourceTest4b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4b.length; i++) {
						String uri = listTest4b[i].getAttributeNS(null, "URI");
						String javaclass = listTest4b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4b.length; i++) {
						String uritrans = tranElemTest4b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4b = algorithms[i];
							String id = elementTest4b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4b.length; i++) {
						String urisign = sigElemsTest4b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4b.length; i++) {
						String javaclass = resolverElemTest4b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4bRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4bRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4b = new ArrayList(resolverElemTest4b.length);
					for (int i = 0; i < resolverElemTest4b.length; i++) {
						String javaclass = resolverElemTest4b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4b = resolverElemTest4b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4b != null) && (descriptionTest4b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4b);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4b);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4b.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest4b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4b.length; i++) {
						String namespace = nlTest4b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest4b) {
			LOGGER.error("Crypto4b5Init:fileInit:error: ", eTest4b);
		}
	}

}
