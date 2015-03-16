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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9eb1,String st9eb2,String st9eb3,String st9eb4,String st9eb5,
			                String st9eb6,String st9eb7){
	  stt9eb1=st9eb1;
	  stt9eb2=st9eb2;
	  stt9eb3=st9eb3;
	  stt9eb4=st9eb4;
	  stt9eb5=st9eb5;
	  stt9eb6=st9eb6;
	  stt9eb7=st9eb7;

	 }
	 
	 private  String stt9eb1;
	 private  String stt9eb2;
	 private String stt9eb3;
	 private  String stt9eb4;
	 private  String stt9eb5;
	 private  String stt9eb6;
	 private  String stt9eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9eb1",
					stt9eb1);
			System.setProperty("stt9eb2",
					stt9eb2);
			System.setProperty("stt9eb3",
					stt9eb3);
			System.setProperty("stt9eb4",
					stt9eb4);
			System.setProperty("stt9eb5",
					stt9eb5);
			System.setProperty("stt9eb6",
					stt9eb6);
			System.setProperty("stt9eb7",
					stt9eb7);

			
			System.setProperty("Test9ebInit",
					"Test9ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9ebInit.class/jcp.xml");
			
			
			System.setProperty("Test9ebss9eb_0x",
					"Test9ebss9eb_0xjcp.xml");
         	System.setProperty("Test9ebss9eb_02",
					"Test9ebss9eb_02xml.config");
			System.setProperty("Test9ebss9eb_03",
					"Test9ebss9eb_03.apache.xml.resource.security.");
		    System.setProperty("Test9ebss9eb_04",
					"Test9ebss9eb_04.resource.");
			System.setProperty("Test9ebss9eb_05",
					"Test9ebss9eb_05.isInitialized");
			System.setProperty("Test9ebss9eb_06",
					"Test9ebss9eb_06_9ebInit.class/jcp.xml");
			System.setProperty("Test9ebss9eb_07",
					"Test9ebss9eb_07t/resource/jcp.xml");
         	System.setProperty("Test9ebss9eb_08",
					"Test9ebss9eb_08.config");
			System.setProperty("Test9ebss9eb_09eb",
					"Test9ebss9eb_09eb.security.");
		    System.setProperty("Test9ebss9eb_0x0",
					"Test9ebss9eb_0x0jcp.xmlapache.");
			System.setProperty("Test9ebss9eb_0xx0",
					"Test9ebss9eb_0xx0.isInitialized");
			System.setProperty("Test9ebss9eb_0xxx0",
					"Test9ebss9eb_0xxx0est9ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9eb = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9eb != null) {
				 
				LOGGER.debug("in0in isTest9eb");
				LOGGER.debug("inxin isTest9eb");
				LOGGER.debug("in2in isTest9eb");
				LOGGER.debug("in3in isTest9eb");
				LOGGER.debug("in4in isTest9eb");
				LOGGER.debug("in5in isTest9eb");
				LOGGER.debug("in6in isTest9eb");
				LOGGER.debug("in7in isTest9eb");
				LOGGER.debug("in8in isTest9eb");
				LOGGER.debug("in9ebin isTest9eb");
				LOGGER.debug("inx0in isTest9eb");
				LOGGER.debug("inxxin isTest9eb");
				LOGGER.debug("inx2in isTest9eb");
				LOGGER.debug("inx3in isTest9eb");
				LOGGER.debug("inx4in isTest9eb");
				LOGGER.debug("inx5in isTest9eb");
				LOGGER.debug("inx6in isTest9eb");
				LOGGER.debug("inx7in isTest9eb");
				LOGGER.debug("inx8in isTest9eb");
				LOGGER.debug("inx9ebin isTest9eb");
				LOGGER.debug("in20in isTest9eb");
			}

			 

			DocumentBuilderFactory dbfTest9eb = DocumentBuilderFactory.newInstance();
			dbfTest9eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9eb.setNamespaceAware(true);
			dbfTest9eb.setValidating(false);

			DocumentBuilder db = dbfTest9eb.newDocumentBuilder();
			Document doc = db.parse(isTest9eb);
			Node configTest9eb = doc.getFirstChild();
			while ((configTest9eb != null)
					&& (!"Configuration".equals(configTest9eb.getLocalName()))) {
				configTest9eb = configTest9eb.getNextSibling();
			}

			if (configTest9eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9eb = (Element) el;

					Attr langAttr = resourceTest9eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9eb.length; i++) {
						String uri = listTest9eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest9eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9eb.length; i++) {
						String uritrans = tranElemTest9eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9eb = algorithms[i];
							String id = elementTest9eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9eb.length; i++) {
						String urisign = sigElemsTest9eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9eb.length; i++) {
						String javaclass = resolverElemTest9eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9ebRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9eb = new ArrayList(resolverElemTest9eb.length);
					for (int i = 0; i < resolverElemTest9eb.length; i++) {
						String javaclass = resolverElemTest9eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9eb = resolverElemTest9eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9eb != null) && (descriptionTest9eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9eb);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9eb);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9eb.length; i++) {
						String namespace = nlTest9eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9eb) {
			LOGGER.error("Crypto9eb5Init:fileInit:error: ", eTest9eb);
		}
	}

}
