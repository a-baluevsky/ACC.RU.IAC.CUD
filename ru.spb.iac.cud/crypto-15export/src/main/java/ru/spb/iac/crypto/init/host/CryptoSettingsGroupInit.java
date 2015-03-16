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

 public class CryptoSettingsGroupInit {

	 
	 public CryptoSettingsGroupInit(){
	 }
	 
	 
	 public CryptoSettingsGroupInit(String st3o1,String st3o2,String st3o3o,String st3o4,String st3o5,
			                String st3o6,String st3o7){
	  stt3o1=st3o1;
	  stt3o2=st3o2;
	  stt3o3o=st3o3o;
	  stt3o4=st3o4;
	  stt3o5=st3o5;
	  stt3o6=st3o6;
	  stt3o7=st3o7;

	 }
	 
	 private  String stt3o1;
	 private  String stt3o2;
	 private String stt3o3o;
	 private  String stt3o4;
	 private  String stt3o5;
	 private  String stt3o6;
	 private  String stt3o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3o1",
					stt3o1);
			System.setProperty("stt3o2",
					stt3o2);
			System.setProperty("stt3o3o",
					stt3o3o);
			System.setProperty("stt3o4",
					stt3o4);
			System.setProperty("stt3o5",
					stt3o5);
			System.setProperty("stt3o6",
					stt3o6);
			System.setProperty("stt3o7",
					stt3o7);

			
			System.setProperty("Test3oInit",
					"Test3oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3oInit.class/jcp.xml");
			
			
			System.setProperty("Test3oss3o_0x",
					"Test3oss3o_0xjcp.xml");
         	System.setProperty("Test3oss3o_02",
					"Test3oss3o_02xml.config");
			System.setProperty("Test3oss3o_03o",
					"Test3oss3o_03o.apache.xml.resource.security.");
		    System.setProperty("Test3oss3o_04",
					"Test3oss3o_04.resource.");
			System.setProperty("Test3oss3o_05",
					"Test3oss3o_05.isInitialized");
			System.setProperty("Test3oss3o_06",
					"Test3oss3o_06_3oInit.class/jcp.xml");
			System.setProperty("Test3oss3o_07",
					"Test3oss3o_07t/resource/jcp.xml");
         	System.setProperty("Test3oss3o_08",
					"Test3oss3o_08.config");
			System.setProperty("Test3oss3o_09",
					"Test3oss3o_09.security.");
		    System.setProperty("Test3oss3o_0x0",
					"Test3oss3o_0x0jcp.xmlapache.");
			System.setProperty("Test3oss3o_0xx0",
					"Test3oss3o_0xx0.isInitialized");
			System.setProperty("Test3oss3o_0xxx0",
					"Test3oss3o_0xxx0est3oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3o = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3o != null) {
				 
				LOGGER.debug("in0in isTest3o");
				LOGGER.debug("inxin isTest3o");
				LOGGER.debug("in2in isTest3o");
				LOGGER.debug("in3oin isTest3o");
				LOGGER.debug("in4in isTest3o");
				LOGGER.debug("in5in isTest3o");
				LOGGER.debug("in6in isTest3o");
				LOGGER.debug("in7in isTest3o");
				LOGGER.debug("in8in isTest3o");
				LOGGER.debug("in9in isTest3o");
				LOGGER.debug("inx0in isTest3o");
				LOGGER.debug("inxxin isTest3o");
				LOGGER.debug("inx2in isTest3o");
				LOGGER.debug("inx3oin isTest3o");
				LOGGER.debug("inx4in isTest3o");
				LOGGER.debug("inx5in isTest3o");
				LOGGER.debug("inx6in isTest3o");
				LOGGER.debug("inx7in isTest3o");
				LOGGER.debug("inx8in isTest3o");
				LOGGER.debug("inx9in isTest3o");
				LOGGER.debug("in20in isTest3o");
			}

			 

			DocumentBuilderFactory dbfTest3o = DocumentBuilderFactory.newInstance();
			dbfTest3o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3o.setNamespaceAware(true);
			dbfTest3o.setValidating(false);

			DocumentBuilder db = dbfTest3o.newDocumentBuilder();
			Document doc = db.parse(isTest3o);
			Node configTest3o = doc.getFirstChild();
			while ((configTest3o != null)
					&& (!"Configuration".equals(configTest3o.getLocalName()))) {
				configTest3o = configTest3o.getNextSibling();
			}

			if (configTest3o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3o.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3o = (Element) el;

					Attr langAttr = resourceTest3o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3o.length; i++) {
						String uri = listTest3o[i].getAttributeNS(null, "URI");
						String javaclass = listTest3o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3o.length; i++) {
						String uritrans = tranElemTest3o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3o = algorithms[i];
							String id = elementTest3o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3o.length; i++) {
						String urisign = sigElemsTest3o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3o.length; i++) {
						String javaclass = resolverElemTest3o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3oRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest3o = new ArrayList(resolverElemTest3o.length);
					for (int i = 0; i < resolverElemTest3o.length; i++) {
						String javaclass = resolverElemTest3o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3o = resolverElemTest3o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3o != null) && (descriptionTest3o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3o);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3o);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3o.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest3o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3o.length; i++) {
						String namespace = nlTest3o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest3o) {
			LOGGER.error("Crypto3o5Init:fileInit:error: ", eTest3o);
		}
	}

}