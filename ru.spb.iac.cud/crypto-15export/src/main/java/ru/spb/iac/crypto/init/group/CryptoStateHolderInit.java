package ru.spb.iac.crypto.init.group;

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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5fb1,String st5fb2,String st5fb3,String st5fb4,String st5fb5fb,
			                String st5fb6,String st5fb7){
	  stt5fb1=st5fb1;
	  stt5fb2=st5fb2;
	  stt5fb3=st5fb3;
	  stt5fb4=st5fb4;
	  stt5fb5fb=st5fb5fb;
	  stt5fb6=st5fb6;
	  stt5fb7=st5fb7;

	 }
	 
	 private  String stt5fb1;
	 private  String stt5fb2;
	 private String stt5fb3;
	 private  String stt5fb4;
	 private  String stt5fb5fb;
	 private  String stt5fb6;
	 private  String stt5fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5fb1",
					stt5fb1);
			System.setProperty("stt5fb2",
					stt5fb2);
			System.setProperty("stt5fb3",
					stt5fb3);
			System.setProperty("stt5fb4",
					stt5fb4);
			System.setProperty("stt5fb5fb",
					stt5fb5fb);
			System.setProperty("stt5fb6",
					stt5fb6);
			System.setProperty("stt5fb7",
					stt5fb7);

			
			System.setProperty("Test5fbInit",
					"Test5fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5fb5fbInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5fbInit.class/jcp.xml");
			
			System.setProperty("Test5fbss5fb_0x",
					"Test5fbss5fb_0xjcp.xml");
         	System.setProperty("Test5fbss5fb_02",
					"Test5fbss5fb_02xml.config");
			System.setProperty("Test5fbss5fb_03",
					"Test5fbss5fb_03.apache.xml.resource.security.");
		    System.setProperty("Test5fbss5fb_04",
					"Test5fbss5fb_04.resource.");
			System.setProperty("Test5fbss5fb_05fb",
					"Test5fbss5fb_05fb.isInitialized");
			System.setProperty("Test5fbss5fb_06",
					"Test5fbss5fb_06_5fbInit.class/jcp.xml");
			System.setProperty("Test5fbss5fb_07",
					"Test5fbss5fb_07t/resource/jcp.xml");
         	System.setProperty("Test5fbss5fb_08",
					"Test5fbss5fb_08.config");
			System.setProperty("Test5fbss5fb_09",
					"Test5fbss5fb_09.security.");
		    System.setProperty("Test5fbss5fb_0x0",
					"Test5fbss5fb_0x0jcp.xmlapache.");
			System.setProperty("Test5fbss5fb_0xx0",
					"Test5fbss5fb_0xx0.isInitialized");
			System.setProperty("Test5fbss5fb_0xxx0",
					"Test5fbss5fb_0xxx0est5fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5fb5fbInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5fb = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5fb != null) {
				 
				LOGGER.debug("in0in isTest5fb");
				LOGGER.debug("inxin isTest5fb");
				LOGGER.debug("in2in isTest5fb");
				LOGGER.debug("in3in isTest5fb");
				LOGGER.debug("in4in isTest5fb");
				LOGGER.debug("in5fbin isTest5fb");
				LOGGER.debug("in6in isTest5fb");
				LOGGER.debug("in7in isTest5fb");
				LOGGER.debug("in8in isTest5fb");
				LOGGER.debug("in9in isTest5fb");
				LOGGER.debug("inx0in isTest5fb");
				LOGGER.debug("inxxin isTest5fb");
				LOGGER.debug("inx2in isTest5fb");
				LOGGER.debug("inx3in isTest5fb");
				LOGGER.debug("inx4in isTest5fb");
				LOGGER.debug("inx5fbin isTest5fb");
				LOGGER.debug("inx6in isTest5fb");
				LOGGER.debug("inx7in isTest5fb");
				LOGGER.debug("inx8in isTest5fb");
				LOGGER.debug("inx9in isTest5fb");
				LOGGER.debug("in20in isTest5fb");
			}

			 

			DocumentBuilderFactory dbfTest5fb = DocumentBuilderFactory.newInstance();
			dbfTest5fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5fb.setNamespaceAware(true);
			dbfTest5fb.setValidating(false);

			DocumentBuilder db = dbfTest5fb.newDocumentBuilder();
			Document doc = db.parse(isTest5fb);
			Node configTest5fb = doc.getFirstChild();
			while ((configTest5fb != null)
					&& (!"Configuration".equals(configTest5fb.getLocalName()))) {
				configTest5fb = configTest5fb.getNextSibling();
			}

			if (configTest5fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5fb!=null?configTest5fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5fb = (Element) el;

					Attr langAttr = resourceTest5fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5fb.length; i++) {
						String uri = listTest5fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest5fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5fb.length; i++) {
						String uritrans = tranElemTest5fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5fb = algorithms[i];
							String id = elementTest5fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5fb.length; i++) {
						String urisign = sigElemsTest5fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5fb.length; i++) {
						String javaclass = resolverElemTest5fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5fbRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5fbRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5fb = new ArrayList(resolverElemTest5fb.length);
					for (int i = 0; i < resolverElemTest5fb.length; i++) {
						String javaclass = resolverElemTest5fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5fb = resolverElemTest5fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5fb != null) && (descriptionTest5fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5fb);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5fb);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest5fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5fb.length; i++) {
						String namespace = nlTest5fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs5fb ) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", exs5fb);
 } catch (ClassNotFoundException enf5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", enf5fb);
 } catch (IllegalAccessException eia5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", eia5fb);
 } catch (InstantiationException e5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", e5fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", epc5fb);
 } catch (org.xml.sax.SAXException ese5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", ese5fb);
 } catch (java.io.IOException eio5fb) {
 LOGGER.error("Crypto5fbInit:fileInit:error: ", eio5fb);
 }

	}

}
