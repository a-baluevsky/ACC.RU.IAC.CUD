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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2eb1,String st2eb2eb,String st2eb3,String st2eb4,String st2eb5,
			                String st2eb6,String st2eb7){
	  stt2eb1=st2eb1;
	  stt2eb2eb=st2eb2eb;
	  stt2eb3=st2eb3;
	  stt2eb4=st2eb4;
	  stt2eb5=st2eb5;
	  stt2eb6=st2eb6;
	  stt2eb7=st2eb7;

	 }
	 
	 private  String stt2eb1;
	 private  String stt2eb2eb;
	 private String stt2eb3;
	 private  String stt2eb4;
	 private  String stt2eb5;
	 private  String stt2eb6;
	 private  String stt2eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2eb1",
					stt2eb1);
			System.setProperty("stt2eb2eb",
					stt2eb2eb);
			System.setProperty("stt2eb3",
					stt2eb3);
			System.setProperty("stt2eb4",
					stt2eb4);
			System.setProperty("stt2eb5",
					stt2eb5);
			System.setProperty("stt2eb6",
					stt2eb6);
			System.setProperty("stt2eb7",
					stt2eb7);

			
			System.setProperty("Test2ebInit",
					"Test2ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2ebInit.class/jcp.xml");
			
			System.setProperty("Test2ebss2eb_0x",
					"Test2ebss2eb_0xjcp.xml");
         	System.setProperty("Test2ebss2eb_02eb",
					"Test2ebss2eb_02ebxml.config");
			System.setProperty("Test2ebss2eb_03",
					"Test2ebss2eb_03.apache.xml.resource.security.");
		    System.setProperty("Test2ebss2eb_04",
					"Test2ebss2eb_04.resource.");
			System.setProperty("Test2ebss2eb_05",
					"Test2ebss2eb_05.isInitialized");
			System.setProperty("Test2ebss2eb_06",
					"Test2ebss2eb_06_2ebInit.class/jcp.xml");
			System.setProperty("Test2ebss2eb_07",
					"Test2ebss2eb_07t/resource/jcp.xml");
         	System.setProperty("Test2ebss2eb_08",
					"Test2ebss2eb_08.config");
			System.setProperty("Test2ebss2eb_09",
					"Test2ebss2eb_09.security.");
		    System.setProperty("Test2ebss2eb_0x0",
					"Test2ebss2eb_0x0jcp.xmlapache.");
			System.setProperty("Test2ebss2eb_0xx0",
					"Test2ebss2eb_0xx0.isInitialized");
			System.setProperty("Test2ebss2eb_0xxx0",
					"Test2ebss2eb_0xxx0est2ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2eb = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2eb != null) {
				 
				LOGGER.debug("in0in isTest2eb");
				LOGGER.debug("inxin isTest2eb");
				LOGGER.debug("in2ebin isTest2eb");
				LOGGER.debug("in3in isTest2eb");
				LOGGER.debug("in4in isTest2eb");
				LOGGER.debug("in5in isTest2eb");
				LOGGER.debug("in6in isTest2eb");
				LOGGER.debug("in7in isTest2eb");
				LOGGER.debug("in8in isTest2eb");
				LOGGER.debug("in9in isTest2eb");
				LOGGER.debug("inx0in isTest2eb");
				LOGGER.debug("inxxin isTest2eb");
				LOGGER.debug("inx2ebin isTest2eb");
				LOGGER.debug("inx3in isTest2eb");
				LOGGER.debug("inx4in isTest2eb");
				LOGGER.debug("inx5in isTest2eb");
				LOGGER.debug("inx6in isTest2eb");
				LOGGER.debug("inx7in isTest2eb");
				LOGGER.debug("inx8in isTest2eb");
				LOGGER.debug("inx9in isTest2eb");
				LOGGER.debug("in2eb0in isTest2eb");
			}

			 

			DocumentBuilderFactory dbfTest2eb = DocumentBuilderFactory.newInstance();
			dbfTest2eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2eb.setNamespaceAware(true);
			dbfTest2eb.setValidating(false);

			DocumentBuilder db = dbfTest2eb.newDocumentBuilder();
			Document doc = db.parse(isTest2eb);
			Node configTest2eb = doc.getFirstChild();
			while ((configTest2eb != null)
					&& (!"Configuration".equals(configTest2eb.getLocalName()))) {
				configTest2eb = configTest2eb.getNextSibling();
			}

			if (configTest2eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2eb = (Element) el;

					Attr langAttr = resourceTest2eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2eb.length; i++) {
						String uri = listTest2eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest2eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2eb.length; i++) {
						String uritrans = tranElemTest2eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2eb = algorithms[i];
							String id = elementTest2eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2eb.length; i++) {
						String urisign = sigElemsTest2eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2eb.length; i++) {
						String javaclass = resolverElemTest2eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2ebRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2ebRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2eb = new ArrayList(resolverElemTest2eb.length);
					for (int i = 0; i < resolverElemTest2eb.length; i++) {
						String javaclass = resolverElemTest2eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2eb = resolverElemTest2eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2eb != null) && (descriptionTest2eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2eb);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2eb);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2eb.length; i++) {
						String namespace = nlTest2eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2eb) {
			LOGGER.error("Crypto2eb5Init:fileInit:error: ", eTest2eb);
		}
	}

}
