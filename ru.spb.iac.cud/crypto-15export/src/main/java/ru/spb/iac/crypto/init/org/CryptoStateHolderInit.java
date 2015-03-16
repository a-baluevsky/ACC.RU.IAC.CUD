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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5l1,String st5l2,String st5l3,String st5l4,String st5l5l,
			                String st5l6,String st5l7){
	  stt5l1=st5l1;
	  stt5l2=st5l2;
	  stt5l3=st5l3;
	  stt5l4=st5l4;
	  stt5l5l=st5l5l;
	  stt5l6=st5l6;
	  stt5l7=st5l7;

	 }
	 
	 private  String stt5l1;
	 private  String stt5l2;
	 private String stt5l3;
	 private  String stt5l4;
	 private  String stt5l5l;
	 private  String stt5l6;
	 private  String stt5l7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5l1",
					stt5l1);
			System.setProperty("stt5l2",
					stt5l2);
			System.setProperty("stt5l3",
					stt5l3);
			System.setProperty("stt5l4",
					stt5l4);
			System.setProperty("stt5l5l",
					stt5l5l);
			System.setProperty("stt5l6",
					stt5l6);
			System.setProperty("stt5l7",
					stt5l7);

			
			System.setProperty("Test5lInit",
					"Test5lInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5l5lInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5lInit.class/jcp.xml");
			
			System.setProperty("Test5lss5l_0x",
					"Test5lss5l_0xjcp.xml");
         	System.setProperty("Test5lss5l_02",
					"Test5lss5l_02xml.config");
			System.setProperty("Test5lss5l_03",
					"Test5lss5l_03.apache.xml.resource.security.");
		    System.setProperty("Test5lss5l_04",
					"Test5lss5l_04.resource.");
			System.setProperty("Test5lss5l_05l",
					"Test5lss5l_05l.isInitialized");
			System.setProperty("Test5lss5l_06",
					"Test5lss5l_06_5lInit.class/jcp.xml");
			System.setProperty("Test5lss5l_07",
					"Test5lss5l_07t/resource/jcp.xml");
         	System.setProperty("Test5lss5l_08",
					"Test5lss5l_08.config");
			System.setProperty("Test5lss5l_09",
					"Test5lss5l_09.security.");
		    System.setProperty("Test5lss5l_0x0",
					"Test5lss5l_0x0jcp.xmlapache.");
			System.setProperty("Test5lss5l_0xx0",
					"Test5lss5l_0xx0.isInitialized");
			System.setProperty("Test5lss5l_0xxx0",
					"Test5lss5l_0xxx0est5lInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5l5lInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5l = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5l != null) {
				 
				LOGGER.debug("in0in isTest5l");
				LOGGER.debug("inxin isTest5l");
				LOGGER.debug("in2in isTest5l");
				LOGGER.debug("in3in isTest5l");
				LOGGER.debug("in4in isTest5l");
				LOGGER.debug("in5lin isTest5l");
				LOGGER.debug("in6in isTest5l");
				LOGGER.debug("in7in isTest5l");
				LOGGER.debug("in8in isTest5l");
				LOGGER.debug("in9in isTest5l");
				LOGGER.debug("inx0in isTest5l");
				LOGGER.debug("inxxin isTest5l");
				LOGGER.debug("inx2in isTest5l");
				LOGGER.debug("inx3in isTest5l");
				LOGGER.debug("inx4in isTest5l");
				LOGGER.debug("inx5lin isTest5l");
				LOGGER.debug("inx6in isTest5l");
				LOGGER.debug("inx7in isTest5l");
				LOGGER.debug("inx8in isTest5l");
				LOGGER.debug("inx9in isTest5l");
				LOGGER.debug("in20in isTest5l");
			}

			 

			DocumentBuilderFactory dbfTest5l = DocumentBuilderFactory.newInstance();
			dbfTest5l.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5l.setNamespaceAware(true);
			dbfTest5l.setValidating(false);

			DocumentBuilder db = dbfTest5l.newDocumentBuilder();
			Document doc = db.parse(isTest5l);
			Node configTest5l = doc.getFirstChild();
			while ((configTest5l != null)
					&& (!"Configuration".equals(configTest5l.getLocalName()))) {
				configTest5l = configTest5l.getNextSibling();
			}

			if (configTest5l != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5l.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5l = (Element) el;

					Attr langAttr = resourceTest5l
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5l
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5l = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5l);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5l.length; i++) {
						String uri = listTest5l[i].getAttributeNS(null, "URI");
						String javaclass = listTest5l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5l.length; i++) {
						String uritrans = tranElemTest5l[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5l = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5l != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5l.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5l = algorithms[i];
							String id = elementTest5l.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5l));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5l.length; i++) {
						String urisign = sigElemsTest5l[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5l[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5l.length; i++) {
						String javaclass = resolverElemTest5l[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5lRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5lRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5lRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5lCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5l = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5l = new ArrayList(resolverElemTest5l.length);
					for (int i = 0; i < resolverElemTest5l.length; i++) {
						String javaclass = resolverElemTest5l[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5l = resolverElemTest5l[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5l != null) && (descriptionTest5l.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5l);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5l);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5l.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5l);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5l = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5l.length; i++) {
						String namespace = nlTest5l[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5l[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5l) {
			LOGGER.error("Crypto5l5lInit:fileInit:error: ", eTest5l);
		}
	}

}
