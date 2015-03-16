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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5b1,String st5b2,String st5b3,String st5b4,String st5b5b,
			                String st5b6,String st5b7){
	  stt5b1=st5b1;
	  stt5b2=st5b2;
	  stt5b3=st5b3;
	  stt5b4=st5b4;
	  stt5b5b=st5b5b;
	  stt5b6=st5b6;
	  stt5b7=st5b7;

	 }
	 
	 private  String stt5b1;
	 private  String stt5b2;
	 private String stt5b3;
	 private  String stt5b4;
	 private  String stt5b5b;
	 private  String stt5b6;
	 private  String stt5b7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5b1",
					stt5b1);
			System.setProperty("stt5b2",
					stt5b2);
			System.setProperty("stt5b3",
					stt5b3);
			System.setProperty("stt5b4",
					stt5b4);
			System.setProperty("stt5b5b",
					stt5b5b);
			System.setProperty("stt5b6",
					stt5b6);
			System.setProperty("stt5b7",
					stt5b7);

			
			System.setProperty("Test5bInit",
					"Test5bInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5b5bInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5bInit.class/jcp.xml");
			
			System.setProperty("Test5bss5b_0x",
					"Test5bss5b_0xjcp.xml");
         	System.setProperty("Test5bss5b_02",
					"Test5bss5b_02xml.config");
			System.setProperty("Test5bss5b_03",
					"Test5bss5b_03.apache.xml.resource.security.");
		    System.setProperty("Test5bss5b_04",
					"Test5bss5b_04.resource.");
			System.setProperty("Test5bss5b_05b",
					"Test5bss5b_05b.isInitialized");
			System.setProperty("Test5bss5b_06",
					"Test5bss5b_06_5bInit.class/jcp.xml");
			System.setProperty("Test5bss5b_07",
					"Test5bss5b_07t/resource/jcp.xml");
         	System.setProperty("Test5bss5b_08",
					"Test5bss5b_08.config");
			System.setProperty("Test5bss5b_09",
					"Test5bss5b_09.security.");
		    System.setProperty("Test5bss5b_0x0",
					"Test5bss5b_0x0jcp.xmlapache.");
			System.setProperty("Test5bss5b_0xx0",
					"Test5bss5b_0xx0.isInitialized");
			System.setProperty("Test5bss5b_0xxx0",
					"Test5bss5b_0xxx0est5bInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5b5bInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5b = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5b != null) {
				 
				LOGGER.debug("in0in isTest5b");
				LOGGER.debug("inxin isTest5b");
				LOGGER.debug("in2in isTest5b");
				LOGGER.debug("in3in isTest5b");
				LOGGER.debug("in4in isTest5b");
				LOGGER.debug("in5bin isTest5b");
				LOGGER.debug("in6in isTest5b");
				LOGGER.debug("in7in isTest5b");
				LOGGER.debug("in8in isTest5b");
				LOGGER.debug("in9in isTest5b");
				LOGGER.debug("inx0in isTest5b");
				LOGGER.debug("inxxin isTest5b");
				LOGGER.debug("inx2in isTest5b");
				LOGGER.debug("inx3in isTest5b");
				LOGGER.debug("inx4in isTest5b");
				LOGGER.debug("inx5bin isTest5b");
				LOGGER.debug("inx6in isTest5b");
				LOGGER.debug("inx7in isTest5b");
				LOGGER.debug("inx8in isTest5b");
				LOGGER.debug("inx9in isTest5b");
				LOGGER.debug("in20in isTest5b");
			}

			 

			DocumentBuilderFactory dbfTest5b = DocumentBuilderFactory.newInstance();
			dbfTest5b.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5b.setNamespaceAware(true);
			dbfTest5b.setValidating(false);

			DocumentBuilder db = dbfTest5b.newDocumentBuilder();
			Document doc = db.parse(isTest5b);
			Node configTest5b = doc.getFirstChild();
			while ((configTest5b != null)
					&& (!"Configuration".equals(configTest5b.getLocalName()))) {
				configTest5b = configTest5b.getNextSibling();
			}

			if (configTest5b != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5b.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5b = (Element) el;

					Attr langAttr = resourceTest5b
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5b
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5b = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5b);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5b.length; i++) {
						String uri = listTest5b[i].getAttributeNS(null, "URI");
						String javaclass = listTest5b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5b.length; i++) {
						String uritrans = tranElemTest5b[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5b = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5b != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5b.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5b = algorithms[i];
							String id = elementTest5b.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5b));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5b.length; i++) {
						String urisign = sigElemsTest5b[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5b[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5b.length; i++) {
						String javaclass = resolverElemTest5b[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5bRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5bRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5bRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5bCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5b = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5b = new ArrayList(resolverElemTest5b.length);
					for (int i = 0; i < resolverElemTest5b.length; i++) {
						String javaclass = resolverElemTest5b[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5b = resolverElemTest5b[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5b != null) && (descriptionTest5b.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5b);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5b);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5b.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5b);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5b = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5b.length; i++) {
						String namespace = nlTest5b[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5b[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5b) {
			LOGGER.error("Crypto5b5bInit:fileInit:error: ", eTest5b);
		}
	}

}
