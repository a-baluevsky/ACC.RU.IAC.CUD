package ru.spb.iac.crypto.init.cpar;

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
	 
	 
	 public CryptoAuditSysInit(String st8cb1,String st8cb2,String st8cb3,String st8cb4,String st8cb5,
			                String st8cb6,String st8cb7){
	  stt8cb1=st8cb1;
	  stt8cb2=st8cb2;
	  stt8cb3=st8cb3;
	  stt8cb4=st8cb4;
	  stt8cb5=st8cb5;
	  stt8cb6=st8cb6;
	  stt8cb7=st8cb7;

	 }
	 
	 private  String stt8cb1;
	 private  String stt8cb2;
	 private String stt8cb3;
	 private  String stt8cb4;
	 private  String stt8cb5;
	 private  String stt8cb6;
	 private  String stt8cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8cb1",
					stt8cb1);
			System.setProperty("stt8cb2",
					stt8cb2);
			System.setProperty("stt8cb3",
					stt8cb3);
			System.setProperty("stt8cb4",
					stt8cb4);
			System.setProperty("stt8cb5",
					stt8cb5);
			System.setProperty("stt8cb6",
					stt8cb6);
			System.setProperty("stt8cb7",
					stt8cb7);

			
			System.setProperty("Test8cbInit",
					"Test8cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8cbInit.class/jcp.xml");
			
			System.setProperty("Test8cbss8cb_0x",
					"Test8cbss8cb_0xjcp.xml");
         	System.setProperty("Test8cbss8cb_02",
					"Test8cbss8cb_02xml.config");
			System.setProperty("Test8cbss8cb_03",
					"Test8cbss8cb_03.apache.xml.resource.security.");
		    System.setProperty("Test8cbss8cb_04",
					"Test8cbss8cb_04.resource.");
			System.setProperty("Test8cbss8cb_05",
					"Test8cbss8cb_05.isInitialized");
			System.setProperty("Test8cbss8cb_06",
					"Test8cbss8cb_06_8cbInit.class/jcp.xml");
			System.setProperty("Test8cbss8cb_07",
					"Test8cbss8cb_07t/resource/jcp.xml");
         	System.setProperty("Test8cbss8cb_08cb",
					"Test8cbss8cb_08cb.config");
			System.setProperty("Test8cbss8cb_09",
					"Test8cbss8cb_09.security.");
		    System.setProperty("Test8cbss8cb_0x0",
					"Test8cbss8cb_0x0jcp.xmlapache.");
			System.setProperty("Test8cbss8cb_0xx0",
					"Test8cbss8cb_0xx0.isInitialized");
			System.setProperty("Test8cbss8cb_0xxx0",
					"Test8cbss8cb_0xxx0est8cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8cb = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8cb != null) {
				 
				LOGGER.debug("in0in isTest8cb");
				LOGGER.debug("inxin isTest8cb");
				LOGGER.debug("in2in isTest8cb");
				LOGGER.debug("in3in isTest8cb");
				LOGGER.debug("in4in isTest8cb");
				LOGGER.debug("in5in isTest8cb");
				LOGGER.debug("in6in isTest8cb");
				LOGGER.debug("in7in isTest8cb");
				LOGGER.debug("in8cbin isTest8cb");
				LOGGER.debug("in9in isTest8cb");
				LOGGER.debug("inx0in isTest8cb");
				LOGGER.debug("inxxin isTest8cb");
				LOGGER.debug("inx2in isTest8cb");
				LOGGER.debug("inx3in isTest8cb");
				LOGGER.debug("inx4in isTest8cb");
				LOGGER.debug("inx5in isTest8cb");
				LOGGER.debug("inx6in isTest8cb");
				LOGGER.debug("inx7in isTest8cb");
				LOGGER.debug("inx8cbin isTest8cb");
				LOGGER.debug("inx9in isTest8cb");
				LOGGER.debug("in20in isTest8cb");
			}

			 

			DocumentBuilderFactory dbfTest8cb = DocumentBuilderFactory.newInstance();
			dbfTest8cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8cb.setNamespaceAware(true);
			dbfTest8cb.setValidating(false);

			DocumentBuilder db = dbfTest8cb.newDocumentBuilder();
			Document doc = db.parse(isTest8cb);
			Node configTest8cb = doc.getFirstChild();
			while ((configTest8cb != null)
					&& (!"Configuration".equals(configTest8cb.getLocalName()))) {
				configTest8cb = configTest8cb.getNextSibling();
			}

			if (configTest8cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8cb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8cb = (Element) el;

					Attr langAttr = resourceTest8cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8cb.length; i++) {
						String uri = listTest8cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest8cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8cb.length; i++) {
						String uritrans = tranElemTest8cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8cb = algorithms[i];
							String id = elementTest8cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8cb.length; i++) {
						String urisign = sigElemsTest8cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8cb.length; i++) {
						String javaclass = resolverElemTest8cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8cbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8cb = new ArrayList(resolverElemTest8cb.length);
					for (int i = 0; i < resolverElemTest8cb.length; i++) {
						String javaclass = resolverElemTest8cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8cb = resolverElemTest8cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8cb != null) && (descriptionTest8cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8cb);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8cb);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8cb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8cb.length; i++) {
						String namespace = nlTest8cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8cb) {
			LOGGER.error("Crypto8cb5Init:fileInit:error: ", eTest8cb);
		}
	}

}
