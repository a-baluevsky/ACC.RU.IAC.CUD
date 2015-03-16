package ru.spb.iac.crypto.init.audit;

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
	 
	 
	 public CryptoAuditSysInit(String st8i1,String st8i2,String st8i3,String st8i4,String st8i5,
			                String st8i6,String st8i7){
	  stt8i1=st8i1;
	  stt8i2=st8i2;
	  stt8i3=st8i3;
	  stt8i4=st8i4;
	  stt8i5=st8i5;
	  stt8i6=st8i6;
	  stt8i7=st8i7;

	 }
	 
	 private  String stt8i1;
	 private  String stt8i2;
	 private String stt8i3;
	 private  String stt8i4;
	 private  String stt8i5;
	 private  String stt8i6;
	 private  String stt8i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8i1",
					stt8i1);
			System.setProperty("stt8i2",
					stt8i2);
			System.setProperty("stt8i3",
					stt8i3);
			System.setProperty("stt8i4",
					stt8i4);
			System.setProperty("stt8i5",
					stt8i5);
			System.setProperty("stt8i6",
					stt8i6);
			System.setProperty("stt8i7",
					stt8i7);

			
			System.setProperty("Test8iInit",
					"Test8iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8iInit.class/jcp.xml");
			
			System.setProperty("Test8iss8i_0x",
					"Test8iss8i_0xjcp.xml");
         	System.setProperty("Test8iss8i_02",
					"Test8iss8i_02xml.config");
			System.setProperty("Test8iss8i_03",
					"Test8iss8i_03.apache.xml.resource.security.");
		    System.setProperty("Test8iss8i_04",
					"Test8iss8i_04.resource.");
			System.setProperty("Test8iss8i_05",
					"Test8iss8i_05.isInitialized");
			System.setProperty("Test8iss8i_06",
					"Test8iss8i_06_8iInit.class/jcp.xml");
			System.setProperty("Test8iss8i_07",
					"Test8iss8i_07t/resource/jcp.xml");
         	System.setProperty("Test8iss8i_08i",
					"Test8iss8i_08i.config");
			System.setProperty("Test8iss8i_09",
					"Test8iss8i_09.security.");
		    System.setProperty("Test8iss8i_0x0",
					"Test8iss8i_0x0jcp.xmlapache.");
			System.setProperty("Test8iss8i_0xx0",
					"Test8iss8i_0xx0.isInitialized");
			System.setProperty("Test8iss8i_0xxx0",
					"Test8iss8i_0xxx0est8iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8i = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8i != null) {
				 
				LOGGER.debug("in0in isTest8i");
				LOGGER.debug("inxin isTest8i");
				LOGGER.debug("in2in isTest8i");
				LOGGER.debug("in3in isTest8i");
				LOGGER.debug("in4in isTest8i");
				LOGGER.debug("in5in isTest8i");
				LOGGER.debug("in6in isTest8i");
				LOGGER.debug("in7in isTest8i");
				LOGGER.debug("in8iin isTest8i");
				LOGGER.debug("in9in isTest8i");
				LOGGER.debug("inx0in isTest8i");
				LOGGER.debug("inxxin isTest8i");
				LOGGER.debug("inx2in isTest8i");
				LOGGER.debug("inx3in isTest8i");
				LOGGER.debug("inx4in isTest8i");
				LOGGER.debug("inx5in isTest8i");
				LOGGER.debug("inx6in isTest8i");
				LOGGER.debug("inx7in isTest8i");
				LOGGER.debug("inx8iin isTest8i");
				LOGGER.debug("inx9in isTest8i");
				LOGGER.debug("in20in isTest8i");
			}

			 

			DocumentBuilderFactory dbfTest8i = DocumentBuilderFactory.newInstance();
			dbfTest8i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8i.setNamespaceAware(true);
			dbfTest8i.setValidating(false);

			DocumentBuilder db = dbfTest8i.newDocumentBuilder();
			Document doc = db.parse(isTest8i);
			Node configTest8i = doc.getFirstChild();
			while ((configTest8i != null)
					&& (!"Configuration".equals(configTest8i.getLocalName()))) {
				configTest8i = configTest8i.getNextSibling();
			}

			if (configTest8i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8i = (Element) el;

					Attr langAttr = resourceTest8i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8i.length; i++) {
						String uri = listTest8i[i].getAttributeNS(null, "URI");
						String javaclass = listTest8i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8i.length; i++) {
						String uritrans = tranElemTest8i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8i = algorithms[i];
							String id = elementTest8i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8i.length; i++) {
						String urisign = sigElemsTest8i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8i.length; i++) {
						String javaclass = resolverElemTest8i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8iRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest8i = new ArrayList(resolverElemTest8i.length);
					for (int i = 0; i < resolverElemTest8i.length; i++) {
						String javaclass = resolverElemTest8i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8i = resolverElemTest8i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8i != null) && (descriptionTest8i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8i);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8i);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest8i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8i.length; i++) {
						String namespace = nlTest8i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest8i) {
			LOGGER.error("Crypto8i5Init:fileInit:error: ", eTest8i);
		}
	}

}
