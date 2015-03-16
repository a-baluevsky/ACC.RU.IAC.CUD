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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2i1,String st2i2i,String st2i3,String st2i4,String st2i5,
			                String st2i6,String st2i7){
	  stt2i1=st2i1;
	  stt2i2i=st2i2i;
	  stt2i3=st2i3;
	  stt2i4=st2i4;
	  stt2i5=st2i5;
	  stt2i6=st2i6;
	  stt2i7=st2i7;

	 }
	 
	 private  String stt2i1;
	 private  String stt2i2i;
	 private String stt2i3;
	 private  String stt2i4;
	 private  String stt2i5;
	 private  String stt2i6;
	 private  String stt2i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2i1",
					stt2i1);
			System.setProperty("stt2i2i",
					stt2i2i);
			System.setProperty("stt2i3",
					stt2i3);
			System.setProperty("stt2i4",
					stt2i4);
			System.setProperty("stt2i5",
					stt2i5);
			System.setProperty("stt2i6",
					stt2i6);
			System.setProperty("stt2i7",
					stt2i7);

			
			System.setProperty("Test2iInit",
					"Test2iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2iInit.class/jcp.xml");
			
			System.setProperty("Test2iss2i_0x",
					"Test2iss2i_0xjcp.xml");
         	System.setProperty("Test2iss2i_02i",
					"Test2iss2i_02ixml.config");
			System.setProperty("Test2iss2i_03",
					"Test2iss2i_03.apache.xml.resource.security.");
		    System.setProperty("Test2iss2i_04",
					"Test2iss2i_04.resource.");
			System.setProperty("Test2iss2i_05",
					"Test2iss2i_05.isInitialized");
			System.setProperty("Test2iss2i_06",
					"Test2iss2i_06_2iInit.class/jcp.xml");
			System.setProperty("Test2iss2i_07",
					"Test2iss2i_07t/resource/jcp.xml");
         	System.setProperty("Test2iss2i_08",
					"Test2iss2i_08.config");
			System.setProperty("Test2iss2i_09",
					"Test2iss2i_09.security.");
		    System.setProperty("Test2iss2i_0x0",
					"Test2iss2i_0x0jcp.xmlapache.");
			System.setProperty("Test2iss2i_0xx0",
					"Test2iss2i_0xx0.isInitialized");
			System.setProperty("Test2iss2i_0xxx0",
					"Test2iss2i_0xxx0est2iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2i = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2i != null) {
				 
				LOGGER.debug("in0in isTest2i");
				LOGGER.debug("inxin isTest2i");
				LOGGER.debug("in2iin isTest2i");
				LOGGER.debug("in3in isTest2i");
				LOGGER.debug("in4in isTest2i");
				LOGGER.debug("in5in isTest2i");
				LOGGER.debug("in6in isTest2i");
				LOGGER.debug("in7in isTest2i");
				LOGGER.debug("in8in isTest2i");
				LOGGER.debug("in9in isTest2i");
				LOGGER.debug("inx0in isTest2i");
				LOGGER.debug("inxxin isTest2i");
				LOGGER.debug("inx2iin isTest2i");
				LOGGER.debug("inx3in isTest2i");
				LOGGER.debug("inx4in isTest2i");
				LOGGER.debug("inx5in isTest2i");
				LOGGER.debug("inx6in isTest2i");
				LOGGER.debug("inx7in isTest2i");
				LOGGER.debug("inx8in isTest2i");
				LOGGER.debug("inx9in isTest2i");
				LOGGER.debug("in2i0in isTest2i");
			}

			 

			DocumentBuilderFactory dbfTest2i = DocumentBuilderFactory.newInstance();
			dbfTest2i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2i.setNamespaceAware(true);
			dbfTest2i.setValidating(false);

			DocumentBuilder db = dbfTest2i.newDocumentBuilder();
			Document doc = db.parse(isTest2i);
			Node configTest2i = doc.getFirstChild();
			while ((configTest2i != null)
					&& (!"Configuration".equals(configTest2i.getLocalName()))) {
				configTest2i = configTest2i.getNextSibling();
			}

			if (configTest2i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2i = (Element) el;

					Attr langAttr = resourceTest2i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2i.length; i++) {
						String uri = listTest2i[i].getAttributeNS(null, "URI");
						String javaclass = listTest2i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2i.length; i++) {
						String uritrans = tranElemTest2i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2i = algorithms[i];
							String id = elementTest2i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2i.length; i++) {
						String urisign = sigElemsTest2i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2i.length; i++) {
						String javaclass = resolverElemTest2i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2iRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2i = new ArrayList(resolverElemTest2i.length);
					for (int i = 0; i < resolverElemTest2i.length; i++) {
						String javaclass = resolverElemTest2i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2i = resolverElemTest2i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2i != null) && (descriptionTest2i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2i);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2i);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2i.length; i++) {
						String namespace = nlTest2i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2i) {
			LOGGER.error("Crypto2i5Init:fileInit:error: ", eTest2i);
		}
	}

}
