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

 public class CryptoAuditSysInit {

	 
	 public CryptoAuditSysInit(){
	 }
	 
	 
	 public CryptoAuditSysInit(String st8o1,String st8o2,String st8o3,String st8o4,String st8o5,
			                String st8o6,String st8o7){
	  stt8o1=st8o1;
	  stt8o2=st8o2;
	  stt8o3=st8o3;
	  stt8o4=st8o4;
	  stt8o5=st8o5;
	  stt8o6=st8o6;
	  stt8o7=st8o7;

	 }
	 
	 private  String stt8o1;
	 private  String stt8o2;
	 private String stt8o3;
	 private  String stt8o4;
	 private  String stt8o5;
	 private  String stt8o6;
	 private  String stt8o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAuditSysInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt8o1",
					stt8o1);
			System.setProperty("stt8o2",
					stt8o2);
			System.setProperty("stt8o3",
					stt8o3);
			System.setProperty("stt8o4",
					stt8o4);
			System.setProperty("stt8o5",
					stt8o5);
			System.setProperty("stt8o6",
					stt8o6);
			System.setProperty("stt8o7",
					stt8o7);

			
			System.setProperty("Test8oInit",
					"Test8oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto8o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest8oInit.class/jcp.xml");
			
			System.setProperty("Test8oss8o_0x",
					"Test8oss8o_0xjcp.xml");
         	System.setProperty("Test8oss8o_02",
					"Test8oss8o_02xml.config");
			System.setProperty("Test8oss8o_03",
					"Test8oss8o_03.apache.xml.resource.security.");
		    System.setProperty("Test8oss8o_04",
					"Test8oss8o_04.resource.");
			System.setProperty("Test8oss8o_05",
					"Test8oss8o_05.isInitialized");
			System.setProperty("Test8oss8o_06",
					"Test8oss8o_06_8oInit.class/jcp.xml");
			System.setProperty("Test8oss8o_07",
					"Test8oss8o_07t/resource/jcp.xml");
         	System.setProperty("Test8oss8o_08o",
					"Test8oss8o_08o.config");
			System.setProperty("Test8oss8o_09",
					"Test8oss8o_09.security.");
		    System.setProperty("Test8oss8o_0x0",
					"Test8oss8o_0x0jcp.xmlapache.");
			System.setProperty("Test8oss8o_0xx0",
					"Test8oss8o_0xx0.isInitialized");
			System.setProperty("Test8oss8o_0xxx0",
					"Test8oss8o_0xxx0est8oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto8o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest8o = CryptoAuditSysInit.class.getResourceAsStream("/jcp.xml");

			if (isTest8o != null) {
				 
				LOGGER.debug("in0in isTest8o");
				LOGGER.debug("inxin isTest8o");
				LOGGER.debug("in2in isTest8o");
				LOGGER.debug("in3in isTest8o");
				LOGGER.debug("in4in isTest8o");
				LOGGER.debug("in5in isTest8o");
				LOGGER.debug("in6in isTest8o");
				LOGGER.debug("in7in isTest8o");
				LOGGER.debug("in8oin isTest8o");
				LOGGER.debug("in9in isTest8o");
				LOGGER.debug("inx0in isTest8o");
				LOGGER.debug("inxxin isTest8o");
				LOGGER.debug("inx2in isTest8o");
				LOGGER.debug("inx3in isTest8o");
				LOGGER.debug("inx4in isTest8o");
				LOGGER.debug("inx5in isTest8o");
				LOGGER.debug("inx6in isTest8o");
				LOGGER.debug("inx7in isTest8o");
				LOGGER.debug("inx8oin isTest8o");
				LOGGER.debug("inx9in isTest8o");
				LOGGER.debug("in20in isTest8o");
			}

			 

			DocumentBuilderFactory dbfTest8o = DocumentBuilderFactory.newInstance();
			dbfTest8o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest8o.setNamespaceAware(true);
			dbfTest8o.setValidating(false);

			DocumentBuilder db = dbfTest8o.newDocumentBuilder();
			Document doc = db.parse(isTest8o);
			Node configTest8o = doc.getFirstChild();
			while ((configTest8o != null)
					&& (!"Configuration".equals(configTest8o.getLocalName()))) {
				configTest8o = configTest8o.getNextSibling();
			}

			if (configTest8o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest8o!=null?configTest8o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest8o = (Element) el;

					Attr langAttr = resourceTest8o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest8o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest8o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest8o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest8o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest8o.length; i++) {
						String uri = listTest8o[i].getAttributeNS(null, "URI");
						String javaclass = listTest8o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest8o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest8o.length; i++) {
						String uritrans = tranElemTest8o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest8o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest8o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest8o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest8o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest8o = algorithms[i];
							String id = elementTest8o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest8o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest8o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest8o.length; i++) {
						String urisign = sigElemsTest8o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest8o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest8o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest8o.length; i++) {
						String javaclass = resolverElemTest8o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest8o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test8oRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("hjjhTest8oRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test8oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test8oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest8o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest8o = new ArrayList<String>(resolverElemTest8o.length);
					for (int i = 0; i < resolverElemTest8o.length; i++) {
						String javaclass = resolverElemTest8o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest8o = resolverElemTest8o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest8o != null) && (descriptionTest8o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest8o);
							
								LOGGER.debug("ukklRegister Resolver: " + javaclass
										+ ": " + descriptionTest8o);
						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest8o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest8o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest8o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest8o.length; i++) {
						String namespace = nlTest8o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest8o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs8o ) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", exs8o);
 } catch (ClassNotFoundException enf8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", enf8o);
 } catch (IllegalAccessException eia8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", eia8o);
 } catch (InstantiationException e8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", e8o);
 } catch (javax.xml.parsers.ParserConfigurationException epc8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", epc8o);
 } catch (org.xml.sax.SAXException ese8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", ese8o);
 } catch (java.io.IOException eio8o) {
 LOGGER.error("Crypto8oInit:fileInit:error: ", eio8o);
 }

	}

}
