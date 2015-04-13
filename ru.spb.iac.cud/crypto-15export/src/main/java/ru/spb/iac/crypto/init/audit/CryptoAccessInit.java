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

 public class CryptoAccessInit {

	 
	 public CryptoAccessInit(){
	 }
	 
	 
	 public CryptoAccessInit(String st1i1i,String st1i2,String st1i3,String st1i4,String st1i5,
			                String st1i6,String st1i7){
	  stt1i1i=st1i1i;
	  stt1i2=st1i2;
	  stt1i3=st1i3;
	  stt1i4=st1i4;
	  stt1i5=st1i5;
	  stt1i6=st1i6;
	  stt1i7=st1i7;

	 }
	 
	 private  String stt1i1i;
	 private  String stt1i2;
	 private String stt1i3;
	 private  String stt1i4;
	 private  String stt1i5;
	 private  String stt1i6;
	 private  String stt1i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoAccessInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt1i1i",
					stt1i1i);
			System.setProperty("stt1i2",
					stt1i2);
			System.setProperty("stt1i3",
					stt1i3);
			System.setProperty("stt1i4",
					stt1i4);
			System.setProperty("stt1i5",
					stt1i5);
			System.setProperty("stt1i6",
					stt1i6);
			System.setProperty("stt1i7",
					stt1i7);

			
			System.setProperty("Test1iInit",
					"Test1iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto1i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest1iInit.class/jcp.xml");
			
			System.setProperty("Test1iss1i_0x",
					"Test1iss1i_0xjcp.xml");
         	System.setProperty("Test1iss1i_02",
					"Test1iss1i_02xml.config");
			System.setProperty("Test1iss1i_03",
					"Test1iss1i_03.apache.xml.resource.security.");
		    System.setProperty("Test1iss1i_04",
					"Test1iss1i_04.resource.");
			System.setProperty("Test1iss1i_05",
					"Test1iss1i_05.isInitialized");
			System.setProperty("Test1iss1i_06",
					"Test1iss1i_06_1iInit.class/jcp.xml");
			System.setProperty("Test1iss1i_07",
					"Test1iss1i_07t/resource/jcp.xml");
         	System.setProperty("Test1iss1i_08",
					"Test1iss1i_08.config");
			System.setProperty("Test1iss1i_09",
					"Test1iss1i_09.security.");
		    System.setProperty("Test1iss1i_0x0",
					"Test1iss1i_0x0jcp.xmlapache.");
			System.setProperty("Test1iss1i_0xx0",
					"Test1iss1i_0xx0.isInitialized");
			System.setProperty("Test1iss1i_0xxx0",
					"Test1iss1i_0xxx0est1iInit.class/jcp.xml");
			
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto1i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest1i = CryptoAccessInit.class.getResourceAsStream("/jcp.xml");

			if (isTest1i != null) {
				 
				LOGGER.debug("in0in isTest1i");
				LOGGER.debug("in1iin isTest1i");
				LOGGER.debug("in2in isTest1i");
				LOGGER.debug("in3in isTest1i");
				LOGGER.debug("in4in isTest1i");
				LOGGER.debug("in5in isTest1i");
				LOGGER.debug("in6in isTest1i");
				LOGGER.debug("in7in isTest1i");
				LOGGER.debug("in8in isTest1i");
				LOGGER.debug("in9in isTest1i");
				LOGGER.debug("in1i0in isTest1i");
				LOGGER.debug("in1i1iin isTest1i");
				LOGGER.debug("in1i2in isTest1i");
				LOGGER.debug("in1i3in isTest1i");
				LOGGER.debug("in1i4in isTest1i");
				LOGGER.debug("in1i5in isTest1i");
				LOGGER.debug("in1i6in isTest1i");
				LOGGER.debug("in1i7in isTest1i");
				LOGGER.debug("in1i8in isTest1i");
				LOGGER.debug("in1i9in isTest1i");
				LOGGER.debug("in20in isTest1i");
			}

			 

			DocumentBuilderFactory dbfTest1i = DocumentBuilderFactory.newInstance();
			dbfTest1i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest1i.setNamespaceAware(true);
			dbfTest1i.setValidating(false);

			DocumentBuilder db = dbfTest1i.newDocumentBuilder();
			Document doc = db.parse(isTest1i);
			Node configTest1i = doc.getFirstChild();
			while ((configTest1i != null)
					&& (!"Configuration".equals(configTest1i.getLocalName()))) {
				configTest1i = configTest1i.getNextSibling();
			}

			if (configTest1i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest1i!=null?configTest1i.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest1i = (Element) el;

					Attr langAttr = resourceTest1i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest1i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest1i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest1i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest1i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest1i.length; i++) {
						String uri = listTest1i[i].getAttributeNS(null, "URI");
						String javaclass = listTest1i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest1i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest1i.length; i++) {
						String uritrans = tranElemTest1i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest1i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest1i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest1i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest1i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest1i = algorithms[i];
							String id = elementTest1i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest1i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest1i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest1i.length; i++) {
						String urisign = sigElemsTest1i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest1i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest1i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest1i.length; i++) {
						String javaclass = resolverElemTest1i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest1i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test1iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("1i-Test1iRegister Resolver: " + javaclass
										+ ": " + description);
							

						}

						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test1iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test1iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest1i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest1i = new ArrayList(resolverElemTest1i.length);
					for (int i = 0; i < resolverElemTest1i.length; i++) {
						String javaclass = resolverElemTest1i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest1i = resolverElemTest1i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest1i != null) && (descriptionTest1i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest1i);
								LOGGER.debug("Test1iRegister Resolver: " + javaclass
										+ ": " + descriptionTest1i);

						} 
                         if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest1i.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest1i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest1i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest1i.length; i++) {
						String namespace = nlTest1i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest1i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs1i ) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", exs1i);
 } catch (ClassNotFoundException enf1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", enf1i);
 } catch (IllegalAccessException eia1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", eia1i);
 } catch (InstantiationException e1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", e1i);
 } catch (javax.xml.parsers.ParserConfigurationException epc1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", epc1i);
 } catch (org.xml.sax.SAXException ese1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", ese1i);
 } catch (java.io.IOException eio1i) {
 LOGGER.error("Crypto1iInit:fileInit:error: ", eio1i);
 }

	}

}
