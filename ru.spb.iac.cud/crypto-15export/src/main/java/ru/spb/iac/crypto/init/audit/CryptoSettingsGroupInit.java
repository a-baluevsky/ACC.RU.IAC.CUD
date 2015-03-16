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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3i1,String st3i2,String st3i3i,String st3i4,String st3i5,
			                String st3i6,String st3i7){
	  stt3i1=st3i1;
	  stt3i2=st3i2;
	  stt3i3i=st3i3i;
	  stt3i4=st3i4;
	  stt3i5=st3i5;
	  stt3i6=st3i6;
	  stt3i7=st3i7;

	 }
	 
	 private  String stt3i1;
	 private  String stt3i2;
	 private String stt3i3i;
	 private  String stt3i4;
	 private  String stt3i5;
	 private  String stt3i6;
	 private  String stt3i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3i1",
					stt3i1);
			System.setProperty("stt3i2",
					stt3i2);
			System.setProperty("stt3i3i",
					stt3i3i);
			System.setProperty("stt3i4",
					stt3i4);
			System.setProperty("stt3i5",
					stt3i5);
			System.setProperty("stt3i6",
					stt3i6);
			System.setProperty("stt3i7",
					stt3i7);

			
			System.setProperty("Test3iInit",
					"Test3iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3iInit.class/jcp.xml");
			
			
			System.setProperty("Test3iss3i_0x",
					"Test3iss3i_0xjcp.xml");
         	System.setProperty("Test3iss3i_02",
					"Test3iss3i_02xml.config");
			System.setProperty("Test3iss3i_03i",
					"Test3iss3i_03i.apache.xml.resource.security.");
		    System.setProperty("Test3iss3i_04",
					"Test3iss3i_04.resource.");
			System.setProperty("Test3iss3i_05",
					"Test3iss3i_05.isInitialized");
			System.setProperty("Test3iss3i_06",
					"Test3iss3i_06_3iInit.class/jcp.xml");
			System.setProperty("Test3iss3i_07",
					"Test3iss3i_07t/resource/jcp.xml");
         	System.setProperty("Test3iss3i_08",
					"Test3iss3i_08.config");
			System.setProperty("Test3iss3i_09",
					"Test3iss3i_09.security.");
		    System.setProperty("Test3iss3i_0x0",
					"Test3iss3i_0x0jcp.xmlapache.");
			System.setProperty("Test3iss3i_0xx0",
					"Test3iss3i_0xx0.isInitialized");
			System.setProperty("Test3iss3i_0xxx0",
					"Test3iss3i_0xxx0est3iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3i = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3i != null) {
				 
				LOGGER.debug("in0in isTest3i");
				LOGGER.debug("inxin isTest3i");
				LOGGER.debug("in2in isTest3i");
				LOGGER.debug("in3iin isTest3i");
				LOGGER.debug("in4in isTest3i");
				LOGGER.debug("in5in isTest3i");
				LOGGER.debug("in6in isTest3i");
				LOGGER.debug("in7in isTest3i");
				LOGGER.debug("in8in isTest3i");
				LOGGER.debug("in9in isTest3i");
				LOGGER.debug("inx0in isTest3i");
				LOGGER.debug("inxxin isTest3i");
				LOGGER.debug("inx2in isTest3i");
				LOGGER.debug("inx3iin isTest3i");
				LOGGER.debug("inx4in isTest3i");
				LOGGER.debug("inx5in isTest3i");
				LOGGER.debug("inx6in isTest3i");
				LOGGER.debug("inx7in isTest3i");
				LOGGER.debug("inx8in isTest3i");
				LOGGER.debug("inx9in isTest3i");
				LOGGER.debug("in20in isTest3i");
			}

			 

			DocumentBuilderFactory dbfTest3i = DocumentBuilderFactory.newInstance();
			dbfTest3i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3i.setNamespaceAware(true);
			dbfTest3i.setValidating(false);

			DocumentBuilder db = dbfTest3i.newDocumentBuilder();
			Document doc = db.parse(isTest3i);
			Node configTest3i = doc.getFirstChild();
			while ((configTest3i != null)
					&& (!"Configuration".equals(configTest3i.getLocalName()))) {
				configTest3i = configTest3i.getNextSibling();
			}

			if (configTest3i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3i = (Element) el;

					Attr langAttr = resourceTest3i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3i.length; i++) {
						String uri = listTest3i[i].getAttributeNS(null, "URI");
						String javaclass = listTest3i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3i.length; i++) {
						String uritrans = tranElemTest3i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3i = algorithms[i];
							String id = elementTest3i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3i.length; i++) {
						String urisign = sigElemsTest3i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3i.length; i++) {
						String javaclass = resolverElemTest3i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3iRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3i = new ArrayList(resolverElemTest3i.length);
					for (int i = 0; i < resolverElemTest3i.length; i++) {
						String javaclass = resolverElemTest3i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3i = resolverElemTest3i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3i != null) && (descriptionTest3i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3i);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3i);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3i.length; i++) {
						String namespace = nlTest3i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3i) {
			LOGGER.error("Crypto3i5Init:fileInit:error: ", eTest3i);
		}
	}

}
