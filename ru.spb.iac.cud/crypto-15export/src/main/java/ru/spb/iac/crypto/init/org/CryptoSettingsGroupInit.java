package ru.spb.iac.crypto.init.org;

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
	 
	 
	 public CryptoSettingsGroupInit(String st3l1,String st3l2,String st3l3l,String st3l4,String st3l5,
			                String st3l6,String st3l7){
	  stt3l1=st3l1;
	  stt3l2=st3l2;
	  stt3l3l=st3l3l;
	  stt3l4=st3l4;
	  stt3l5=st3l5;
	  stt3l6=st3l6;
	  stt3l7=st3l7;

	 }
	 
	 private  String stt3l1;
	 private  String stt3l2;
	 private String stt3l3l;
	 private  String stt3l4;
	 private  String stt3l5;
	 private  String stt3l6;
	 private  String stt3l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3l1",
					stt3l1);
			System.setProperty("stt3l2",
					stt3l2);
			System.setProperty("stt3l3l",
					stt3l3l);
			System.setProperty("stt3l4",
					stt3l4);
			System.setProperty("stt3l5",
					stt3l5);
			System.setProperty("stt3l6",
					stt3l6);
			System.setProperty("stt3l7",
					stt3l7);

			
			System.setProperty("Test3lInit",
					"Test3lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3l5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3lInit.class/jcp.xml");
			
			
			System.setProperty("Test3lss3l_0x",
					"Test3lss3l_0xjcp.xml");
         	System.setProperty("Test3lss3l_02",
					"Test3lss3l_02xml.config");
			System.setProperty("Test3lss3l_03l",
					"Test3lss3l_03l.apache.xml.resource.security.");
		    System.setProperty("Test3lss3l_04",
					"Test3lss3l_04.resource.");
			System.setProperty("Test3lss3l_05",
					"Test3lss3l_05.isInitialized");
			System.setProperty("Test3lss3l_06",
					"Test3lss3l_06_3lInit.class/jcp.xml");
			System.setProperty("Test3lss3l_07",
					"Test3lss3l_07t/resource/jcp.xml");
         	System.setProperty("Test3lss3l_08",
					"Test3lss3l_08.config");
			System.setProperty("Test3lss3l_09",
					"Test3lss3l_09.security.");
		    System.setProperty("Test3lss3l_0x0",
					"Test3lss3l_0x0jcp.xmlapache.");
			System.setProperty("Test3lss3l_0xx0",
					"Test3lss3l_0xx0.isInitialized");
			System.setProperty("Test3lss3l_0xxx0",
					"Test3lss3l_0xxx0est3lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3l5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3l = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3l != null) {
				 
				LOGGER.debug("in0in isTest3l");
				LOGGER.debug("inxin isTest3l");
				LOGGER.debug("in2in isTest3l");
				LOGGER.debug("in3lin isTest3l");
				LOGGER.debug("in4in isTest3l");
				LOGGER.debug("in5in isTest3l");
				LOGGER.debug("in6in isTest3l");
				LOGGER.debug("in7in isTest3l");
				LOGGER.debug("in8in isTest3l");
				LOGGER.debug("in9in isTest3l");
				LOGGER.debug("inx0in isTest3l");
				LOGGER.debug("inxxin isTest3l");
				LOGGER.debug("inx2in isTest3l");
				LOGGER.debug("inx3lin isTest3l");
				LOGGER.debug("inx4in isTest3l");
				LOGGER.debug("inx5in isTest3l");
				LOGGER.debug("inx6in isTest3l");
				LOGGER.debug("inx7in isTest3l");
				LOGGER.debug("inx8in isTest3l");
				LOGGER.debug("inx9in isTest3l");
				LOGGER.debug("in20in isTest3l");
			}

			 

			DocumentBuilderFactory dbfTest3l = DocumentBuilderFactory.newInstance();
			dbfTest3l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3l.setNamespaceAware(true);
			dbfTest3l.setValidating(false);

			DocumentBuilder db = dbfTest3l.newDocumentBuilder();
			Document doc = db.parse(isTest3l);
			Node configTest3l = doc.getFirstChild();
			while ((configTest3l != null)
					&& (!"Configuration".equals(configTest3l.getLocalName()))) {
				configTest3l = configTest3l.getNextSibling();
			}

			if (configTest3l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3l.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3l = (Element) el;

					Attr langAttr = resourceTest3l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3l.length; i++) {
						String uri = listTest3l[i].getAttributeNS(null, "URI");
						String javaclass = listTest3l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3l.length; i++) {
						String uritrans = tranElemTest3l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3l = algorithms[i];
							String id = elementTest3l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3l.length; i++) {
						String urisign = sigElemsTest3l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3l.length; i++) {
						String javaclass = resolverElemTest3l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3lRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3l = new ArrayList(resolverElemTest3l.length);
					for (int i = 0; i < resolverElemTest3l.length; i++) {
						String javaclass = resolverElemTest3l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3l = resolverElemTest3l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3l != null) && (descriptionTest3l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3l);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3l);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3l.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3l.length; i++) {
						String namespace = nlTest3l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3l) {
			LOGGER.error("Crypto3l5Init:fileInit:error: ", eTest3l);
		}
	}

}
