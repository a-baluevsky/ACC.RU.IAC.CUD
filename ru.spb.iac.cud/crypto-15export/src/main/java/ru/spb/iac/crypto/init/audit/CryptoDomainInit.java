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

 public class CryptoDomainInit {

	 
	 public CryptoDomainInit(){
	 }
	 
	 
	 public CryptoDomainInit(String st9i1,String st9i2,String st9i3,String st9i4,String st9i5,
			                String st9i6,String st9i7){
	  stt9i1=st9i1;
	  stt9i2=st9i2;
	  stt9i3=st9i3;
	  stt9i4=st9i4;
	  stt9i5=st9i5;
	  stt9i6=st9i6;
	  stt9i7=st9i7;

	 }
	 
	 private  String stt9i1;
	 private  String stt9i2;
	 private String stt9i3;
	 private  String stt9i4;
	 private  String stt9i5;
	 private  String stt9i6;
	 private  String stt9i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoDomainInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt9i1",
					stt9i1);
			System.setProperty("stt9i2",
					stt9i2);
			System.setProperty("stt9i3",
					stt9i3);
			System.setProperty("stt9i4",
					stt9i4);
			System.setProperty("stt9i5",
					stt9i5);
			System.setProperty("stt9i6",
					stt9i6);
			System.setProperty("stt9i7",
					stt9i7);

			
			System.setProperty("Test9iInit",
					"Test9iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto9i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest9iInit.class/jcp.xml");
			
			
			System.setProperty("Test9iss9i_0x",
					"Test9iss9i_0xjcp.xml");
         	System.setProperty("Test9iss9i_02",
					"Test9iss9i_02xml.config");
			System.setProperty("Test9iss9i_03",
					"Test9iss9i_03.apache.xml.resource.security.");
		    System.setProperty("Test9iss9i_04",
					"Test9iss9i_04.resource.");
			System.setProperty("Test9iss9i_05",
					"Test9iss9i_05.isInitialized");
			System.setProperty("Test9iss9i_06",
					"Test9iss9i_06_9iInit.class/jcp.xml");
			System.setProperty("Test9iss9i_07",
					"Test9iss9i_07t/resource/jcp.xml");
         	System.setProperty("Test9iss9i_08",
					"Test9iss9i_08.config");
			System.setProperty("Test9iss9i_09i",
					"Test9iss9i_09i.security.");
		    System.setProperty("Test9iss9i_0x0",
					"Test9iss9i_0x0jcp.xmlapache.");
			System.setProperty("Test9iss9i_0xx0",
					"Test9iss9i_0xx0.isInitialized");
			System.setProperty("Test9iss9i_0xxx0",
					"Test9iss9i_0xxx0est9iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto9i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest9i = CryptoDomainInit.class.getResourceAsStream("/jcp.xml");

			if (isTest9i != null) {
				 
				LOGGER.debug("in0in isTest9i");
				LOGGER.debug("inxin isTest9i");
				LOGGER.debug("in2in isTest9i");
				LOGGER.debug("in3in isTest9i");
				LOGGER.debug("in4in isTest9i");
				LOGGER.debug("in5in isTest9i");
				LOGGER.debug("in6in isTest9i");
				LOGGER.debug("in7in isTest9i");
				LOGGER.debug("in8in isTest9i");
				LOGGER.debug("in9iin isTest9i");
				LOGGER.debug("inx0in isTest9i");
				LOGGER.debug("inxxin isTest9i");
				LOGGER.debug("inx2in isTest9i");
				LOGGER.debug("inx3in isTest9i");
				LOGGER.debug("inx4in isTest9i");
				LOGGER.debug("inx5in isTest9i");
				LOGGER.debug("inx6in isTest9i");
				LOGGER.debug("inx7in isTest9i");
				LOGGER.debug("inx8in isTest9i");
				LOGGER.debug("inx9iin isTest9i");
				LOGGER.debug("in20in isTest9i");
			}

			 

			DocumentBuilderFactory dbfTest9i = DocumentBuilderFactory.newInstance();
			dbfTest9i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest9i.setNamespaceAware(true);
			dbfTest9i.setValidating(false);

			DocumentBuilder db = dbfTest9i.newDocumentBuilder();
			Document doc = db.parse(isTest9i);
			Node configTest9i = doc.getFirstChild();
			while ((configTest9i != null)
					&& (!"Configuration".equals(configTest9i.getLocalName()))) {
				configTest9i = configTest9i.getNextSibling();
			}

			if (configTest9i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest9i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest9i = (Element) el;

					Attr langAttr = resourceTest9i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest9i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest9i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest9i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest9i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest9i.length; i++) {
						String uri = listTest9i[i].getAttributeNS(null, "URI");
						String javaclass = listTest9i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest9i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest9i.length; i++) {
						String uritrans = tranElemTest9i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest9i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest9i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest9i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest9i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest9i = algorithms[i];
							String id = elementTest9i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest9i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest9i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest9i.length; i++) {
						String urisign = sigElemsTest9i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest9i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest9i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest9i.length; i++) {
						String javaclass = resolverElemTest9i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest9i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test9iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("jjgfdTest9iRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test9iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test9iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest9i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest9i = new ArrayList(resolverElemTest9i.length);
					for (int i = 0; i < resolverElemTest9i.length; i++) {
						String javaclass = resolverElemTest9i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest9i = resolverElemTest9i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest9i != null) && (descriptionTest9i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest9i);
								LOGGER.debug("fddRegister Resolver: " + javaclass
										+ ": " + descriptionTest9i);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest9i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest9i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest9i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest9i.length; i++) {
						String namespace = nlTest9i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest9i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest9i) {
			LOGGER.error("Crypto9i5Init:fileInit:error: ", eTest9i);
		}
	}

}
