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

 public class CryptoAccessGroupInit {

	 
	 public CryptoAccessGroupInit(){
	 }
	 
	 
	 public CryptoAccessGroupInit(String st2cb1,String st2cb2cb,String st2cb3,String st2cb4,String st2cb5,
			                String st2cb6,String st2cb7){
	  stt2cb1=st2cb1;
	  stt2cb2cb=st2cb2cb;
	  stt2cb3=st2cb3;
	  stt2cb4=st2cb4;
	  stt2cb5=st2cb5;
	  stt2cb6=st2cb6;
	  stt2cb7=st2cb7;

	 }
	 
	 private  String stt2cb1;
	 private  String stt2cb2cb;
	 private String stt2cb3;
	 private  String stt2cb4;
	 private  String stt2cb5;
	 private  String stt2cb6;
	 private  String stt2cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2cb1",
					stt2cb1);
			System.setProperty("stt2cb2cb",
					stt2cb2cb);
			System.setProperty("stt2cb3",
					stt2cb3);
			System.setProperty("stt2cb4",
					stt2cb4);
			System.setProperty("stt2cb5",
					stt2cb5);
			System.setProperty("stt2cb6",
					stt2cb6);
			System.setProperty("stt2cb7",
					stt2cb7);

			
			System.setProperty("Test2cbInit",
					"Test2cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2cbInit.class/jcp.xml");
			
			System.setProperty("Test2cbss2cb_0x",
					"Test2cbss2cb_0xjcp.xml");
         	System.setProperty("Test2cbss2cb_02cb",
					"Test2cbss2cb_02cbxml.config");
			System.setProperty("Test2cbss2cb_03",
					"Test2cbss2cb_03.apache.xml.resource.security.");
		    System.setProperty("Test2cbss2cb_04",
					"Test2cbss2cb_04.resource.");
			System.setProperty("Test2cbss2cb_05",
					"Test2cbss2cb_05.isInitialized");
			System.setProperty("Test2cbss2cb_06",
					"Test2cbss2cb_06_2cbInit.class/jcp.xml");
			System.setProperty("Test2cbss2cb_07",
					"Test2cbss2cb_07t/resource/jcp.xml");
         	System.setProperty("Test2cbss2cb_08",
					"Test2cbss2cb_08.config");
			System.setProperty("Test2cbss2cb_09",
					"Test2cbss2cb_09.security.");
		    System.setProperty("Test2cbss2cb_0x0",
					"Test2cbss2cb_0x0jcp.xmlapache.");
			System.setProperty("Test2cbss2cb_0xx0",
					"Test2cbss2cb_0xx0.isInitialized");
			System.setProperty("Test2cbss2cb_0xxx0",
					"Test2cbss2cb_0xxx0est2cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2cb = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2cb != null) {
				 
				LOGGER.debug("in0in isTest2cb");
				LOGGER.debug("inxin isTest2cb");
				LOGGER.debug("in2cbin isTest2cb");
				LOGGER.debug("in3in isTest2cb");
				LOGGER.debug("in4in isTest2cb");
				LOGGER.debug("in5in isTest2cb");
				LOGGER.debug("in6in isTest2cb");
				LOGGER.debug("in7in isTest2cb");
				LOGGER.debug("in8in isTest2cb");
				LOGGER.debug("in9in isTest2cb");
				LOGGER.debug("inx0in isTest2cb");
				LOGGER.debug("inxxin isTest2cb");
				LOGGER.debug("inx2cbin isTest2cb");
				LOGGER.debug("inx3in isTest2cb");
				LOGGER.debug("inx4in isTest2cb");
				LOGGER.debug("inx5in isTest2cb");
				LOGGER.debug("inx6in isTest2cb");
				LOGGER.debug("inx7in isTest2cb");
				LOGGER.debug("inx8in isTest2cb");
				LOGGER.debug("inx9in isTest2cb");
				LOGGER.debug("in2cb0in isTest2cb");
			}

			 

			DocumentBuilderFactory dbfTest2cb = DocumentBuilderFactory.newInstance();
			dbfTest2cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2cb.setNamespaceAware(true);
			dbfTest2cb.setValidating(false);

			DocumentBuilder db = dbfTest2cb.newDocumentBuilder();
			Document doc = db.parse(isTest2cb);
			Node configTest2cb = doc.getFirstChild();
			while ((configTest2cb != null)
					&& (!"Configuration".equals(configTest2cb.getLocalName()))) {
				configTest2cb = configTest2cb.getNextSibling();
			}

			if (configTest2cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2cb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2cb = (Element) el;

					Attr langAttr = resourceTest2cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2cb.length; i++) {
						String uri = listTest2cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest2cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2cb.length; i++) {
						String uritrans = tranElemTest2cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2cb = algorithms[i];
							String id = elementTest2cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2cb.length; i++) {
						String urisign = sigElemsTest2cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2cb.length; i++) {
						String javaclass = resolverElemTest2cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2cbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2cbRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2cb = new ArrayList(resolverElemTest2cb.length);
					for (int i = 0; i < resolverElemTest2cb.length; i++) {
						String javaclass = resolverElemTest2cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2cb = resolverElemTest2cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2cb != null) && (descriptionTest2cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2cb);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2cb);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2cb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2cb.length; i++) {
						String namespace = nlTest2cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2cb) {
			LOGGER.error("Crypto2cb5Init:fileInit:error: ", eTest2cb);
		}
	}

}
