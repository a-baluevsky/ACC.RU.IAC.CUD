package ru.spb.iac.crypto.init.groupsys;

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
	 
	 
	 public CryptoSettingsGroupInit(String st3m1,String st3m2,String st3m3m,String st3m4,String st3m5,
			                String st3m6,String st3m7){
	  stt3m1=st3m1;
	  stt3m2=st3m2;
	  stt3m3m=st3m3m;
	  stt3m4=st3m4;
	  stt3m5=st3m5;
	  stt3m6=st3m6;
	  stt3m7=st3m7;

	 }
	 
	 private  String stt3m1;
	 private  String stt3m2;
	 private String stt3m3m;
	 private  String stt3m4;
	 private  String stt3m5;
	 private  String stt3m6;
	 private  String stt3m7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoSettingsGroupInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt3m1",
					stt3m1);
			System.setProperty("stt3m2",
					stt3m2);
			System.setProperty("stt3m3m",
					stt3m3m);
			System.setProperty("stt3m4",
					stt3m4);
			System.setProperty("stt3m5",
					stt3m5);
			System.setProperty("stt3m6",
					stt3m6);
			System.setProperty("stt3m7",
					stt3m7);

			
			System.setProperty("Test3mInit",
					"Test3mInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto3m5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest3mInit.class/jcp.xml");
			
			
			System.setProperty("Test3mss3m_0x",
					"Test3mss3m_0xjcp.xml");
         	System.setProperty("Test3mss3m_02",
					"Test3mss3m_02xml.config");
			System.setProperty("Test3mss3m_03m",
					"Test3mss3m_03m.apache.xml.resource.security.");
		    System.setProperty("Test3mss3m_04",
					"Test3mss3m_04.resource.");
			System.setProperty("Test3mss3m_05",
					"Test3mss3m_05.isInitialized");
			System.setProperty("Test3mss3m_06",
					"Test3mss3m_06_3mInit.class/jcp.xml");
			System.setProperty("Test3mss3m_07",
					"Test3mss3m_07t/resource/jcp.xml");
         	System.setProperty("Test3mss3m_08",
					"Test3mss3m_08.config");
			System.setProperty("Test3mss3m_09",
					"Test3mss3m_09.security.");
		    System.setProperty("Test3mss3m_0x0",
					"Test3mss3m_0x0jcp.xmlapache.");
			System.setProperty("Test3mss3m_0xx0",
					"Test3mss3m_0xx0.isInitialized");
			System.setProperty("Test3mss3m_0xxx0",
					"Test3mss3m_0xxx0est3mInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto3m5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest3m = CryptoSettingsGroupInit.class.getResourceAsStream("/jcp.xml");

			if (isTest3m != null) {
				 
				LOGGER.debug("in0in isTest3m");
				LOGGER.debug("inxin isTest3m");
				LOGGER.debug("in2in isTest3m");
				LOGGER.debug("in3min isTest3m");
				LOGGER.debug("in4in isTest3m");
				LOGGER.debug("in5in isTest3m");
				LOGGER.debug("in6in isTest3m");
				LOGGER.debug("in7in isTest3m");
				LOGGER.debug("in8in isTest3m");
				LOGGER.debug("in9in isTest3m");
				LOGGER.debug("inx0in isTest3m");
				LOGGER.debug("inxxin isTest3m");
				LOGGER.debug("inx2in isTest3m");
				LOGGER.debug("inx3min isTest3m");
				LOGGER.debug("inx4in isTest3m");
				LOGGER.debug("inx5in isTest3m");
				LOGGER.debug("inx6in isTest3m");
				LOGGER.debug("inx7in isTest3m");
				LOGGER.debug("inx8in isTest3m");
				LOGGER.debug("inx9in isTest3m");
				LOGGER.debug("in20in isTest3m");
			}

			 

			DocumentBuilderFactory dbfTest3m = DocumentBuilderFactory.newInstance();
			dbfTest3m.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest3m.setNamespaceAware(true);
			dbfTest3m.setValidating(false);

			DocumentBuilder db = dbfTest3m.newDocumentBuilder();
			Document doc = db.parse(isTest3m);
			Node configTest3m = doc.getFirstChild();
			while ((configTest3m != null)
					&& (!"Configuration".equals(configTest3m.getLocalName()))) {
				configTest3m = configTest3m.getNextSibling();
			}

			if (configTest3m != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest3m!=null?configTest3m.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest3m = (Element) el;

					Attr langAttr = resourceTest3m
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest3m
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest3m = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest3m);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest3m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest3m.length; i++) {
						String uri = listTest3m[i].getAttributeNS(null, "URI");
						String javaclass = listTest3m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest3m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest3m.length; i++) {
						String uritrans = tranElemTest3m[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest3m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest3m = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest3m != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest3m.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest3m = algorithms[i];
							String id = elementTest3m.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest3m));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest3m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest3m.length; i++) {
						String urisign = sigElemsTest3m[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest3m[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest3m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest3m.length; i++) {
						String javaclass = resolverElemTest3m[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest3m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test3mRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("00Test3mRegister Resolver: " + javaclass
										+ ": " + description);

						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test3mRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test3mCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest3m = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List<String> classNamesTest3m = new ArrayList<String>(resolverElemTest3m.length);
					for (int i = 0; i < resolverElemTest3m.length; i++) {
						String javaclass = resolverElemTest3m[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest3m = resolverElemTest3m[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest3m != null) && (descriptionTest3m.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest3m);
							
								LOGGER.debug("78Register Resolver: " + javaclass
										+ ": " + descriptionTest3m);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest3m.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest3m);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest3m = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest3m.length; i++) {
						String namespace = nlTest3m[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest3m[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs3m ) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", exs3m);
 } catch (ClassNotFoundException enf3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", enf3m);
 } catch (IllegalAccessException eia3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", eia3m);
 } catch (InstantiationException e3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", e3m);
 } catch (javax.xml.parsers.ParserConfigurationException epc3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", epc3m);
 } catch (org.xml.sax.SAXException ese3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", ese3m);
 } catch (java.io.IOException eio3m) {
 LOGGER.error("Crypto3mInit:fileInit:error: ", eio3m);
 }

	}

}
