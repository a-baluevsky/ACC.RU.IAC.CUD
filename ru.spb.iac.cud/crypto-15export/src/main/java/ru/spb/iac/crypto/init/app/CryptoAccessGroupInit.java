package ru.spb.iac.crypto.init.app;

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
	 
	 
	 public CryptoAccessGroupInit(String st2p1,String st2p2p,String st2p3,String st2p4,String st2p5,
			                String st2p6,String st2p7){
	  stt2p1=st2p1;
	  stt2p2p=st2p2p;
	  stt2p3=st2p3;
	  stt2p4=st2p4;
	  stt2p5=st2p5;
	  stt2p6=st2p6;
	  stt2p7=st2p7;

	 }
	 
	 private  String stt2p1;
	 private  String stt2p2p;
	 private String stt2p3;
	 private  String stt2p4;
	 private  String stt2p5;
	 private  String stt2p6;
	 private  String stt2p7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2p1",
					stt2p1);
			System.setProperty("stt2p2p",
					stt2p2p);
			System.setProperty("stt2p3",
					stt2p3);
			System.setProperty("stt2p4",
					stt2p4);
			System.setProperty("stt2p5",
					stt2p5);
			System.setProperty("stt2p6",
					stt2p6);
			System.setProperty("stt2p7",
					stt2p7);

			
			System.setProperty("Test2pInit",
					"Test2pInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2p5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2pInit.class/jcp.xml");
			
			System.setProperty("Test2pss2p_0x",
					"Test2pss2p_0xjcp.xml");
         	System.setProperty("Test2pss2p_02p",
					"Test2pss2p_02pxml.config");
			System.setProperty("Test2pss2p_03",
					"Test2pss2p_03.apache.xml.resource.security.");
		    System.setProperty("Test2pss2p_04",
					"Test2pss2p_04.resource.");
			System.setProperty("Test2pss2p_05",
					"Test2pss2p_05.isInitialized");
			System.setProperty("Test2pss2p_06",
					"Test2pss2p_06_2pInit.class/jcp.xml");
			System.setProperty("Test2pss2p_07",
					"Test2pss2p_07t/resource/jcp.xml");
         	System.setProperty("Test2pss2p_08",
					"Test2pss2p_08.config");
			System.setProperty("Test2pss2p_09",
					"Test2pss2p_09.security.");
		    System.setProperty("Test2pss2p_0x0",
					"Test2pss2p_0x0jcp.xmlapache.");
			System.setProperty("Test2pss2p_0xx0",
					"Test2pss2p_0xx0.isInitialized");
			System.setProperty("Test2pss2p_0xxx0",
					"Test2pss2p_0xxx0est2pInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2p5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2p = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2p != null) {
				 
				LOGGER.debug("in0in isTest2p");
				LOGGER.debug("inxin isTest2p");
				LOGGER.debug("in2pin isTest2p");
				LOGGER.debug("in3in isTest2p");
				LOGGER.debug("in4in isTest2p");
				LOGGER.debug("in5in isTest2p");
				LOGGER.debug("in6in isTest2p");
				LOGGER.debug("in7in isTest2p");
				LOGGER.debug("in8in isTest2p");
				LOGGER.debug("in9in isTest2p");
				LOGGER.debug("inx0in isTest2p");
				LOGGER.debug("inxxin isTest2p");
				LOGGER.debug("inx2pin isTest2p");
				LOGGER.debug("inx3in isTest2p");
				LOGGER.debug("inx4in isTest2p");
				LOGGER.debug("inx5in isTest2p");
				LOGGER.debug("inx6in isTest2p");
				LOGGER.debug("inx7in isTest2p");
				LOGGER.debug("inx8in isTest2p");
				LOGGER.debug("inx9in isTest2p");
				LOGGER.debug("in2p0in isTest2p");
			}

			 

			DocumentBuilderFactory dbfTest2p = DocumentBuilderFactory.newInstance();
			dbfTest2p.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2p.setNamespaceAware(true);
			dbfTest2p.setValidating(false);

			DocumentBuilder db = dbfTest2p.newDocumentBuilder();
			Document doc = db.parse(isTest2p);
			Node configTest2p = doc.getFirstChild();
			while ((configTest2p != null)
					&& (!"Configuration".equals(configTest2p.getLocalName()))) {
				configTest2p = configTest2p.getNextSibling();
			}

			if (configTest2p != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2p.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2p = (Element) el;

					Attr langAttr = resourceTest2p
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2p
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2p = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2p);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2p.length; i++) {
						String uri = listTest2p[i].getAttributeNS(null, "URI");
						String javaclass = listTest2p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2p.length; i++) {
						String uritrans = tranElemTest2p[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2p = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2p != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2p.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2p = algorithms[i];
							String id = elementTest2p.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2p));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2p.length; i++) {
						String urisign = sigElemsTest2p[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2p[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2p.length; i++) {
						String javaclass = resolverElemTest2p[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2pRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2pRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2pRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2pCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2p = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2p = new ArrayList(resolverElemTest2p.length);
					for (int i = 0; i < resolverElemTest2p.length; i++) {
						String javaclass = resolverElemTest2p[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2p = resolverElemTest2p[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2p != null) && (descriptionTest2p.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2p);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2p);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2p.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2p);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2p = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2p.length; i++) {
						String namespace = nlTest2p[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2p[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2p) {
			LOGGER.error("Crypto2p5Init:fileInit:error: ", eTest2p);
		}
	}

}
