package ru.spb.iac.crypto.init.classif;

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
	 
	 
	 public CryptoAuditSysInit(String st8n1,String st8n2,String st8n3,String st8n4,String st8n5,
			                String st8n6,String st8n7){
	  stt8n1=st8n1;
	  stt8n2=st8n2;
	  stt8n3=st8n3;
	  stt8n4=st8n4;
	  stt8n5=st8n5;
	  stt8n6=st8n6;
	  stt8n7=st8n7;

	 }
	 
	 private  String stt8n1;
	 private  String stt8n2;
	 private String stt8n3;
	 private  String stt8n4;
	 private  String stt8n5;
	 private  String stt8n6;
	 private  String stt8n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8n1",
					stt8n1);
			System.setProperty("stt8n2",
					stt8n2);
			System.setProperty("stt8n3",
					stt8n3);
			System.setProperty("stt8n4",
					stt8n4);
			System.setProperty("stt8n5",
					stt8n5);
			System.setProperty("stt8n6",
					stt8n6);
			System.setProperty("stt8n7",
					stt8n7);

			
			System.setProperty("Test8nInit",
					"Test8nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8nInit.class/jcp.xml");
			
			System.setProperty("Test8nss8n_0x",
					"Test8nss8n_0xjcp.xml");
         	System.setProperty("Test8nss8n_02",
					"Test8nss8n_02xml.config");
			System.setProperty("Test8nss8n_03",
					"Test8nss8n_03.apache.xml.resource.security.");
		    System.setProperty("Test8nss8n_04",
					"Test8nss8n_04.resource.");
			System.setProperty("Test8nss8n_05",
					"Test8nss8n_05.isInitialized");
			System.setProperty("Test8nss8n_06",
					"Test8nss8n_06_8nInit.class/jcp.xml");
			System.setProperty("Test8nss8n_07",
					"Test8nss8n_07t/resource/jcp.xml");
         	System.setProperty("Test8nss8n_08n",
					"Test8nss8n_08n.config");
			System.setProperty("Test8nss8n_09",
					"Test8nss8n_09.security.");
		    System.setProperty("Test8nss8n_0x0",
					"Test8nss8n_0x0jcp.xmlapache.");
			System.setProperty("Test8nss8n_0xx0",
					"Test8nss8n_0xx0.isInitialized");
			System.setProperty("Test8nss8n_0xxx0",
					"Test8nss8n_0xxx0est8nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8n = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8n != null) {
				 
				LOGGER.debug("in0in isTest8n");
				LOGGER.debug("inxin isTest8n");
				LOGGER.debug("in2in isTest8n");
				LOGGER.debug("in3in isTest8n");
				LOGGER.debug("in4in isTest8n");
				LOGGER.debug("in5in isTest8n");
				LOGGER.debug("in6in isTest8n");
				LOGGER.debug("in7in isTest8n");
				LOGGER.debug("in8nin isTest8n");
				LOGGER.debug("in9in isTest8n");
				LOGGER.debug("inx0in isTest8n");
				LOGGER.debug("inxxin isTest8n");
				LOGGER.debug("inx2in isTest8n");
				LOGGER.debug("inx3in isTest8n");
				LOGGER.debug("inx4in isTest8n");
				LOGGER.debug("inx5in isTest8n");
				LOGGER.debug("inx6in isTest8n");
				LOGGER.debug("inx7in isTest8n");
				LOGGER.debug("inx8nin isTest8n");
				LOGGER.debug("inx9in isTest8n");
				LOGGER.debug("in20in isTest8n");
			}

			 

			DocumentBuilderFactory dbfTest8n = DocumentBuilderFactory.newInstance();
			dbfTest8n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8n.setNamespaceAware(true);
			dbfTest8n.setValidating(false);

			DocumentBuilder db = dbfTest8n.newDocumentBuilder();
			Document doc = db.parse(isTest8n);
			Node configTest8n = doc.getFirstChild();
			while ((configTest8n != null)
					&& (!"Configuration".equals(configTest8n.getLocalName()))) {
				configTest8n = configTest8n.getNextSibling();
			}

			if (configTest8n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8n.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8n = (Element) el;

					Attr langAttr = resourceTest8n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8n.length; i++) {
						String uri = listTest8n[i].getAttributeNS(null, "URI");
						String javaclass = listTest8n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8n.length; i++) {
						String uritrans = tranElemTest8n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8n = algorithms[i];
							String id = elementTest8n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8n.length; i++) {
						String urisign = sigElemsTest8n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8n.length; i++) {
						String javaclass = resolverElemTest8n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8nRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8nRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8n = new ArrayList(resolverElemTest8n.length);
					for (int i = 0; i < resolverElemTest8n.length; i++) {
						String javaclass = resolverElemTest8n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8n = resolverElemTest8n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8n != null) && (descriptionTest8n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8n);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8n);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8n.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8n.length; i++) {
						String namespace = nlTest8n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8n) {
			LOGGER.error("Crypto8n5Init:fileInit:error: ", eTest8n);
		}
	}

}
