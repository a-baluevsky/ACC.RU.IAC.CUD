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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3eb1,String st3eb2,String st3eb3eb,String st3eb4,String st3eb5,
			                String st3eb6,String st3eb7){
	  stt3eb1=st3eb1;
	  stt3eb2=st3eb2;
	  stt3eb3eb=st3eb3eb;
	  stt3eb4=st3eb4;
	  stt3eb5=st3eb5;
	  stt3eb6=st3eb6;
	  stt3eb7=st3eb7;

	 }
	 
	 private  String stt3eb1;
	 private  String stt3eb2;
	 private String stt3eb3eb;
	 private  String stt3eb4;
	 private  String stt3eb5;
	 private  String stt3eb6;
	 private  String stt3eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3eb1",
					stt3eb1);
			System.setProperty("stt3eb2",
					stt3eb2);
			System.setProperty("stt3eb3eb",
					stt3eb3eb);
			System.setProperty("stt3eb4",
					stt3eb4);
			System.setProperty("stt3eb5",
					stt3eb5);
			System.setProperty("stt3eb6",
					stt3eb6);
			System.setProperty("stt3eb7",
					stt3eb7);

			
			System.setProperty("Test3ebInit",
					"Test3ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3ebInit.class/jcp.xml");
			
			
			System.setProperty("Test3ebss3eb_0x",
					"Test3ebss3eb_0xjcp.xml");
         	System.setProperty("Test3ebss3eb_02",
					"Test3ebss3eb_02xml.config");
			System.setProperty("Test3ebss3eb_03eb",
					"Test3ebss3eb_03eb.apache.xml.resource.security.");
		    System.setProperty("Test3ebss3eb_04",
					"Test3ebss3eb_04.resource.");
			System.setProperty("Test3ebss3eb_05",
					"Test3ebss3eb_05.isInitialized");
			System.setProperty("Test3ebss3eb_06",
					"Test3ebss3eb_06_3ebInit.class/jcp.xml");
			System.setProperty("Test3ebss3eb_07",
					"Test3ebss3eb_07t/resource/jcp.xml");
         	System.setProperty("Test3ebss3eb_08",
					"Test3ebss3eb_08.config");
			System.setProperty("Test3ebss3eb_09",
					"Test3ebss3eb_09.security.");
		    System.setProperty("Test3ebss3eb_0x0",
					"Test3ebss3eb_0x0jcp.xmlapache.");
			System.setProperty("Test3ebss3eb_0xx0",
					"Test3ebss3eb_0xx0.isInitialized");
			System.setProperty("Test3ebss3eb_0xxx0",
					"Test3ebss3eb_0xxx0est3ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3eb = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3eb != null) {
				 
				LOGGER.debug("in0in isTest3eb");
				LOGGER.debug("inxin isTest3eb");
				LOGGER.debug("in2in isTest3eb");
				LOGGER.debug("in3ebin isTest3eb");
				LOGGER.debug("in4in isTest3eb");
				LOGGER.debug("in5in isTest3eb");
				LOGGER.debug("in6in isTest3eb");
				LOGGER.debug("in7in isTest3eb");
				LOGGER.debug("in8in isTest3eb");
				LOGGER.debug("in9in isTest3eb");
				LOGGER.debug("inx0in isTest3eb");
				LOGGER.debug("inxxin isTest3eb");
				LOGGER.debug("inx2in isTest3eb");
				LOGGER.debug("inx3ebin isTest3eb");
				LOGGER.debug("inx4in isTest3eb");
				LOGGER.debug("inx5in isTest3eb");
				LOGGER.debug("inx6in isTest3eb");
				LOGGER.debug("inx7in isTest3eb");
				LOGGER.debug("inx8in isTest3eb");
				LOGGER.debug("inx9in isTest3eb");
				LOGGER.debug("in20in isTest3eb");
			}

			 

			DocumentBuilderFactory dbfTest3eb = DocumentBuilderFactory.newInstance();
			dbfTest3eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3eb.setNamespaceAware(true);
			dbfTest3eb.setValidating(false);

			DocumentBuilder db = dbfTest3eb.newDocumentBuilder();
			Document doc = db.parse(isTest3eb);
			Node configTest3eb = doc.getFirstChild();
			while ((configTest3eb != null)
					&& (!"Configuration".equals(configTest3eb.getLocalName()))) {
				configTest3eb = configTest3eb.getNextSibling();
			}

			if (configTest3eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3eb = (Element) el;

					Attr langAttr = resourceTest3eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3eb.length; i++) {
						String uri = listTest3eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest3eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3eb.length; i++) {
						String uritrans = tranElemTest3eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3eb = algorithms[i];
							String id = elementTest3eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3eb.length; i++) {
						String urisign = sigElemsTest3eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3eb.length; i++) {
						String javaclass = resolverElemTest3eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3ebRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3eb = new ArrayList(resolverElemTest3eb.length);
					for (int i = 0; i < resolverElemTest3eb.length; i++) {
						String javaclass = resolverElemTest3eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3eb = resolverElemTest3eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3eb != null) && (descriptionTest3eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3eb);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3eb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3eb.length; i++) {
						String namespace = nlTest3eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3eb) {
			LOGGER.error("Crypto3eb5Init:fileInit:error: ", eTest3eb);
		}
	}

}
