package ru.spb.iac.crypto.init.host;

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
	 
	 
	 public CryptoAccessGroupInit(String st2o1,String st2o2o,String st2o3,String st2o4,String st2o5,
			                String st2o6,String st2o7){
	  stt2o1=st2o1;
	  stt2o2o=st2o2o;
	  stt2o3=st2o3;
	  stt2o4=st2o4;
	  stt2o5=st2o5;
	  stt2o6=st2o6;
	  stt2o7=st2o7;

	 }
	 
	 private  String stt2o1;
	 private  String stt2o2o;
	 private String stt2o3;
	 private  String stt2o4;
	 private  String stt2o5;
	 private  String stt2o6;
	 private  String stt2o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt2o1",
					stt2o1);
			System.setProperty("stt2o2o",
					stt2o2o);
			System.setProperty("stt2o3",
					stt2o3);
			System.setProperty("stt2o4",
					stt2o4);
			System.setProperty("stt2o5",
					stt2o5);
			System.setProperty("stt2o6",
					stt2o6);
			System.setProperty("stt2o7",
					stt2o7);

			
			System.setProperty("Test2oInit",
					"Test2oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto2o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest2oInit.class/jcp.xml");
			
			System.setProperty("Test2oss2o_0x",
					"Test2oss2o_0xjcp.xml");
         	System.setProperty("Test2oss2o_02o",
					"Test2oss2o_02oxml.config");
			System.setProperty("Test2oss2o_03",
					"Test2oss2o_03.apache.xml.resource.security.");
		    System.setProperty("Test2oss2o_04",
					"Test2oss2o_04.resource.");
			System.setProperty("Test2oss2o_05",
					"Test2oss2o_05.isInitialized");
			System.setProperty("Test2oss2o_06",
					"Test2oss2o_06_2oInit.class/jcp.xml");
			System.setProperty("Test2oss2o_07",
					"Test2oss2o_07t/resource/jcp.xml");
         	System.setProperty("Test2oss2o_08",
					"Test2oss2o_08.config");
			System.setProperty("Test2oss2o_09",
					"Test2oss2o_09.security.");
		    System.setProperty("Test2oss2o_0x0",
					"Test2oss2o_0x0jcp.xmlapache.");
			System.setProperty("Test2oss2o_0xx0",
					"Test2oss2o_0xx0.isInitialized");
			System.setProperty("Test2oss2o_0xxx0",
					"Test2oss2o_0xxx0est2oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto2o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest2o = CryptoAccessGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest2o != null) {
				 
				LOGGER.debug("in0in isTest2o");
				LOGGER.debug("inxin isTest2o");
				LOGGER.debug("in2oin isTest2o");
				LOGGER.debug("in3in isTest2o");
				LOGGER.debug("in4in isTest2o");
				LOGGER.debug("in5in isTest2o");
				LOGGER.debug("in6in isTest2o");
				LOGGER.debug("in7in isTest2o");
				LOGGER.debug("in8in isTest2o");
				LOGGER.debug("in9in isTest2o");
				LOGGER.debug("inx0in isTest2o");
				LOGGER.debug("inxxin isTest2o");
				LOGGER.debug("inx2oin isTest2o");
				LOGGER.debug("inx3in isTest2o");
				LOGGER.debug("inx4in isTest2o");
				LOGGER.debug("inx5in isTest2o");
				LOGGER.debug("inx6in isTest2o");
				LOGGER.debug("inx7in isTest2o");
				LOGGER.debug("inx8in isTest2o");
				LOGGER.debug("inx9in isTest2o");
				LOGGER.debug("in2o0in isTest2o");
			}

			 

			DocumentBuilderFactory dbfTest2o = DocumentBuilderFactory.newInstance();
			dbfTest2o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest2o.setNamespaceAware(true);
			dbfTest2o.setValidating(false);

			DocumentBuilder db = dbfTest2o.newDocumentBuilder();
			Document doc = db.parse(isTest2o);
			Node configTest2o = doc.getFirstChild();
			while ((configTest2o != null)
					&& (!"Configuration".equals(configTest2o.getLocalName()))) {
				configTest2o = configTest2o.getNextSibling();
			}

			if (configTest2o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest2o.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest2o = (Element) el;

					Attr langAttr = resourceTest2o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest2o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest2o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest2o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest2o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest2o.length; i++) {
						String uri = listTest2o[i].getAttributeNS(null, "URI");
						String javaclass = listTest2o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest2o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest2o.length; i++) {
						String uritrans = tranElemTest2o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest2o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest2o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest2o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest2o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest2o = algorithms[i];
							String id = elementTest2o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest2o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest2o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest2o.length; i++) {
						String urisign = sigElemsTest2o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest2o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest2o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest2o.length; i++) {
						String javaclass = resolverElemTest2o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest2o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test2oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("88Test2oRegister Resolver: " + javaclass
										+ ": " + description);
							

						} 
                      if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test2oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test2oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest2o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest2o = new ArrayList(resolverElemTest2o.length);
					for (int i = 0; i < resolverElemTest2o.length; i++) {
						String javaclass = resolverElemTest2o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest2o = resolverElemTest2o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest2o != null) && (descriptionTest2o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest2o);
								LOGGER.debug("77Register Resolver: " + javaclass
										+ ": " + descriptionTest2o);

						} 
                        if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest2o.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest2o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest2o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest2o.length; i++) {
						String namespace = nlTest2o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest2o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest2o) {
			LOGGER.error("Crypto2o5Init:fileInit:error: ", eTest2o);
		}
	}

}
