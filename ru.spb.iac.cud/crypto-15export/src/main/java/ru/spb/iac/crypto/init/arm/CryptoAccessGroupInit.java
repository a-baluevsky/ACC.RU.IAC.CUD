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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2b1,String st2b2b,String st2b3,String st2b4,String st2b5,
			                String st2b6,String st2b7){
	  stt2b1=st2b1;
	  stt2b2b=st2b2b;
	  stt2b3=st2b3;
	  stt2b4=st2b4;
	  stt2b5=st2b5;
	  stt2b6=st2b6;
	  stt2b7=st2b7;

	 }
	 
	 private  String stt2b1;
	 private  String stt2b2b;
	 private String stt2b3;
	 private  String stt2b4;
	 private  String stt2b5;
	 private  String stt2b6;
	 private  String stt2b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2b1",
					stt2b1);
			System.setProperty("stt2b2b",
					stt2b2b);
			System.setProperty("stt2b3",
					stt2b3);
			System.setProperty("stt2b4",
					stt2b4);
			System.setProperty("stt2b5",
					stt2b5);
			System.setProperty("stt2b6",
					stt2b6);
			System.setProperty("stt2b7",
					stt2b7);

			
			System.setProperty("Test2bInit",
					"Test2bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2b5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2bInit.class/jcp.xml");
			
			System.setProperty("Test2bss2b_0x",
					"Test2bss2b_0xjcp.xml");
         	System.setProperty("Test2bss2b_02b",
					"Test2bss2b_02bxml.config");
			System.setProperty("Test2bss2b_03",
					"Test2bss2b_03.apache.xml.resource.security.");
		    System.setProperty("Test2bss2b_04",
					"Test2bss2b_04.resource.");
			System.setProperty("Test2bss2b_05",
					"Test2bss2b_05.isInitialized");
			System.setProperty("Test2bss2b_06",
					"Test2bss2b_06_2bInit.class/jcp.xml");
			System.setProperty("Test2bss2b_07",
					"Test2bss2b_07t/resource/jcp.xml");
         	System.setProperty("Test2bss2b_08",
					"Test2bss2b_08.config");
			System.setProperty("Test2bss2b_09",
					"Test2bss2b_09.security.");
		    System.setProperty("Test2bss2b_0x0",
					"Test2bss2b_0x0jcp.xmlapache.");
			System.setProperty("Test2bss2b_0xx0",
					"Test2bss2b_0xx0.isInitialized");
			System.setProperty("Test2bss2b_0xxx0",
					"Test2bss2b_0xxx0est2bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2b5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2b = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2b != null) {
				 
				LOGGER.debug("in0in isTest2b");
				LOGGER.debug("inxin isTest2b");
				LOGGER.debug("in2bin isTest2b");
				LOGGER.debug("in3in isTest2b");
				LOGGER.debug("in4in isTest2b");
				LOGGER.debug("in5in isTest2b");
				LOGGER.debug("in6in isTest2b");
				LOGGER.debug("in7in isTest2b");
				LOGGER.debug("in8in isTest2b");
				LOGGER.debug("in9in isTest2b");
				LOGGER.debug("inx0in isTest2b");
				LOGGER.debug("inxxin isTest2b");
				LOGGER.debug("inx2bin isTest2b");
				LOGGER.debug("inx3in isTest2b");
				LOGGER.debug("inx4in isTest2b");
				LOGGER.debug("inx5in isTest2b");
				LOGGER.debug("inx6in isTest2b");
				LOGGER.debug("inx7in isTest2b");
				LOGGER.debug("inx8in isTest2b");
				LOGGER.debug("inx9in isTest2b");
				LOGGER.debug("in2b0in isTest2b");
			}

			 

			DocumentBuilderFactory dbfTest2b = DocumentBuilderFactory.newInstance();
			dbfTest2b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2b.setNamespaceAware(true);
			dbfTest2b.setValidating(false);

			DocumentBuilder db = dbfTest2b.newDocumentBuilder();
			Document doc = db.parse(isTest2b);
			Node configTest2b = doc.getFirstChild();
			while ((configTest2b != null)
					&& (!"Configuration".equals(configTest2b.getLocalName()))) {
				configTest2b = configTest2b.getNextSibling();
			}

			if (configTest2b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2b.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2b = (Element) el;

					Attr langAttr = resourceTest2b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2b.length; i++) {
						String uri = listTest2b[i].getAttributeNS(null, "URI");
						String javaclass = listTest2b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2b.length; i++) {
						String uritrans = tranElemTest2b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2b = algorithms[i];
							String id = elementTest2b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2b.length; i++) {
						String urisign = sigElemsTest2b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2b.length; i++) {
						String javaclass = resolverElemTest2b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2bRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2b = new ArrayList(resolverElemTest2b.length);
					for (int i = 0; i < resolverElemTest2b.length; i++) {
						String javaclass = resolverElemTest2b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2b = resolverElemTest2b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2b != null) && (descriptionTest2b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2b);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2b);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2b.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2b.length; i++) {
						String namespace = nlTest2b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2b) {
			LOGGER.error("Crypto2b5Init:fileInit:error: ", eTest2b);
		}
	}

}
