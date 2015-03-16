package ru.spb.iac.crypto.init.user;

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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8eb1,String st8eb2,String st8eb3,String st8eb4,String st8eb5,
			                String st8eb6,String st8eb7){
	  stt8eb1=st8eb1;
	  stt8eb2=st8eb2;
	  stt8eb3=st8eb3;
	  stt8eb4=st8eb4;
	  stt8eb5=st8eb5;
	  stt8eb6=st8eb6;
	  stt8eb7=st8eb7;

	 }
	 
	 private  String stt8eb1;
	 private  String stt8eb2;
	 private String stt8eb3;
	 private  String stt8eb4;
	 private  String stt8eb5;
	 private  String stt8eb6;
	 private  String stt8eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8eb1",
					stt8eb1);
			System.setProperty("stt8eb2",
					stt8eb2);
			System.setProperty("stt8eb3",
					stt8eb3);
			System.setProperty("stt8eb4",
					stt8eb4);
			System.setProperty("stt8eb5",
					stt8eb5);
			System.setProperty("stt8eb6",
					stt8eb6);
			System.setProperty("stt8eb7",
					stt8eb7);

			
			System.setProperty("Test8ebInit",
					"Test8ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8ebInit.class/jcp.xml");
			
			System.setProperty("Test8ebss8eb_0x",
					"Test8ebss8eb_0xjcp.xml");
         	System.setProperty("Test8ebss8eb_02",
					"Test8ebss8eb_02xml.config");
			System.setProperty("Test8ebss8eb_03",
					"Test8ebss8eb_03.apache.xml.resource.security.");
		    System.setProperty("Test8ebss8eb_04",
					"Test8ebss8eb_04.resource.");
			System.setProperty("Test8ebss8eb_05",
					"Test8ebss8eb_05.isInitialized");
			System.setProperty("Test8ebss8eb_06",
					"Test8ebss8eb_06_8ebInit.class/jcp.xml");
			System.setProperty("Test8ebss8eb_07",
					"Test8ebss8eb_07t/resource/jcp.xml");
         	System.setProperty("Test8ebss8eb_08eb",
					"Test8ebss8eb_08eb.config");
			System.setProperty("Test8ebss8eb_09",
					"Test8ebss8eb_09.security.");
		    System.setProperty("Test8ebss8eb_0x0",
					"Test8ebss8eb_0x0jcp.xmlapache.");
			System.setProperty("Test8ebss8eb_0xx0",
					"Test8ebss8eb_0xx0.isInitialized");
			System.setProperty("Test8ebss8eb_0xxx0",
					"Test8ebss8eb_0xxx0est8ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8eb = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8eb != null) {
				 
				LOGGER.debug("in0in isTest8eb");
				LOGGER.debug("inxin isTest8eb");
				LOGGER.debug("in2in isTest8eb");
				LOGGER.debug("in3in isTest8eb");
				LOGGER.debug("in4in isTest8eb");
				LOGGER.debug("in5in isTest8eb");
				LOGGER.debug("in6in isTest8eb");
				LOGGER.debug("in7in isTest8eb");
				LOGGER.debug("in8ebin isTest8eb");
				LOGGER.debug("in9in isTest8eb");
				LOGGER.debug("inx0in isTest8eb");
				LOGGER.debug("inxxin isTest8eb");
				LOGGER.debug("inx2in isTest8eb");
				LOGGER.debug("inx3in isTest8eb");
				LOGGER.debug("inx4in isTest8eb");
				LOGGER.debug("inx5in isTest8eb");
				LOGGER.debug("inx6in isTest8eb");
				LOGGER.debug("inx7in isTest8eb");
				LOGGER.debug("inx8ebin isTest8eb");
				LOGGER.debug("inx9in isTest8eb");
				LOGGER.debug("in20in isTest8eb");
			}

			 

			DocumentBuilderFactory dbfTest8eb = DocumentBuilderFactory.newInstance();
			dbfTest8eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8eb.setNamespaceAware(true);
			dbfTest8eb.setValidating(false);

			DocumentBuilder db = dbfTest8eb.newDocumentBuilder();
			Document doc = db.parse(isTest8eb);
			Node configTest8eb = doc.getFirstChild();
			while ((configTest8eb != null)
					&& (!"Configuration".equals(configTest8eb.getLocalName()))) {
				configTest8eb = configTest8eb.getNextSibling();
			}

			if (configTest8eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8eb = (Element) el;

					Attr langAttr = resourceTest8eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8eb.length; i++) {
						String uri = listTest8eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest8eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8eb.length; i++) {
						String uritrans = tranElemTest8eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8eb = algorithms[i];
							String id = elementTest8eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8eb.length; i++) {
						String urisign = sigElemsTest8eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8eb.length; i++) {
						String javaclass = resolverElemTest8eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8ebRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8eb = new ArrayList(resolverElemTest8eb.length);
					for (int i = 0; i < resolverElemTest8eb.length; i++) {
						String javaclass = resolverElemTest8eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8eb = resolverElemTest8eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8eb != null) && (descriptionTest8eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8eb);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8eb);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8eb.length; i++) {
						String namespace = nlTest8eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8eb) {
			LOGGER.error("Crypto8eb5Init:fileInit:error: ", eTest8eb);
		}
	}

}
