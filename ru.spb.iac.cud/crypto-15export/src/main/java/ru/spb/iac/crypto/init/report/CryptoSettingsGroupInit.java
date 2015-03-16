package ru.spb.iac.crypto.init.report;

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
	 
	 
	 public CryptoSettingsGroupInit(String st3j1,String st3j2,String st3j3j,String st3j4,String st3j5,
			                String st3j6,String st3j7){
	  stt3j1=st3j1;
	  stt3j2=st3j2;
	  stt3j3j=st3j3j;
	  stt3j4=st3j4;
	  stt3j5=st3j5;
	  stt3j6=st3j6;
	  stt3j7=st3j7;

	 }
	 
	 private  String stt3j1;
	 private  String stt3j2;
	 private String stt3j3j;
	 private  String stt3j4;
	 private  String stt3j5;
	 private  String stt3j6;
	 private  String stt3j7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3j1",
					stt3j1);
			System.setProperty("stt3j2",
					stt3j2);
			System.setProperty("stt3j3j",
					stt3j3j);
			System.setProperty("stt3j4",
					stt3j4);
			System.setProperty("stt3j5",
					stt3j5);
			System.setProperty("stt3j6",
					stt3j6);
			System.setProperty("stt3j7",
					stt3j7);

			
			System.setProperty("Test3jInit",
					"Test3jInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3j5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3jInit.class/jcp.xml");
			
			
			System.setProperty("Test3jss3j_0x",
					"Test3jss3j_0xjcp.xml");
         	System.setProperty("Test3jss3j_02",
					"Test3jss3j_02xml.config");
			System.setProperty("Test3jss3j_03j",
					"Test3jss3j_03j.apache.xml.resource.security.");
		    System.setProperty("Test3jss3j_04",
					"Test3jss3j_04.resource.");
			System.setProperty("Test3jss3j_05",
					"Test3jss3j_05.isInitialized");
			System.setProperty("Test3jss3j_06",
					"Test3jss3j_06_3jInit.class/jcp.xml");
			System.setProperty("Test3jss3j_07",
					"Test3jss3j_07t/resource/jcp.xml");
         	System.setProperty("Test3jss3j_08",
					"Test3jss3j_08.config");
			System.setProperty("Test3jss3j_09",
					"Test3jss3j_09.security.");
		    System.setProperty("Test3jss3j_0x0",
					"Test3jss3j_0x0jcp.xmlapache.");
			System.setProperty("Test3jss3j_0xx0",
					"Test3jss3j_0xx0.isInitialized");
			System.setProperty("Test3jss3j_0xxx0",
					"Test3jss3j_0xxx0est3jInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3j5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3j = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3j != null) {
				 
				LOGGER.debug("in0in isTest3j");
				LOGGER.debug("inxin isTest3j");
				LOGGER.debug("in2in isTest3j");
				LOGGER.debug("in3jin isTest3j");
				LOGGER.debug("in4in isTest3j");
				LOGGER.debug("in5in isTest3j");
				LOGGER.debug("in6in isTest3j");
				LOGGER.debug("in7in isTest3j");
				LOGGER.debug("in8in isTest3j");
				LOGGER.debug("in9in isTest3j");
				LOGGER.debug("inx0in isTest3j");
				LOGGER.debug("inxxin isTest3j");
				LOGGER.debug("inx2in isTest3j");
				LOGGER.debug("inx3jin isTest3j");
				LOGGER.debug("inx4in isTest3j");
				LOGGER.debug("inx5in isTest3j");
				LOGGER.debug("inx6in isTest3j");
				LOGGER.debug("inx7in isTest3j");
				LOGGER.debug("inx8in isTest3j");
				LOGGER.debug("inx9in isTest3j");
				LOGGER.debug("in20in isTest3j");
			}

			 

			DocumentBuilderFactory dbfTest3j = DocumentBuilderFactory.newInstance();
			dbfTest3j.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3j.setNamespaceAware(true);
			dbfTest3j.setValidating(false);

			DocumentBuilder db = dbfTest3j.newDocumentBuilder();
			Document doc = db.parse(isTest3j);
			Node configTest3j = doc.getFirstChild();
			while ((configTest3j != null)
					&& (!"Configuration".equals(configTest3j.getLocalName()))) {
				configTest3j = configTest3j.getNextSibling();
			}

			if (configTest3j != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3j.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3j = (Element) el;

					Attr langAttr = resourceTest3j
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3j
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3j = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3j);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3j.length; i++) {
						String uri = listTest3j[i].getAttributeNS(null, "URI");
						String javaclass = listTest3j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3j.length; i++) {
						String uritrans = tranElemTest3j[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3j = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3j != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3j.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3j = algorithms[i];
							String id = elementTest3j.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3j));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3j.length; i++) {
						String urisign = sigElemsTest3j[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3j[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3j.length; i++) {
						String javaclass = resolverElemTest3j[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3jRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3jRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3jRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3jCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3j = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3j = new ArrayList(resolverElemTest3j.length);
					for (int i = 0; i < resolverElemTest3j.length; i++) {
						String javaclass = resolverElemTest3j[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3j = resolverElemTest3j[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3j != null) && (descriptionTest3j.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3j);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3j);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3j.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3j);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3j = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3j.length; i++) {
						String namespace = nlTest3j[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3j[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3j) {
			LOGGER.error("Crypto3j5Init:fileInit:error: ", eTest3j);
		}
	}

}