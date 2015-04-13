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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4fb1,String st4fb2,String st4fb3,String st4fb4fb,String st4fb5,
			                String st4fb6,String st4fb7){
	  stt4fb1=st4fb1;
	  stt4fb2=st4fb2;
	  stt4fb3=st4fb3;
	  stt4fb4fb=st4fb4fb;
	  stt4fb5=st4fb5;
	  stt4fb6=st4fb6;
	  stt4fb7=st4fb7;

	 }
	 
	 private  String stt4fb1;
	 private  String stt4fb2;
	 private String stt4fb3;
	 private  String stt4fb4fb;
	 private  String stt4fb5;
	 private  String stt4fb6;
	 private  String stt4fb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4fb1",
					stt4fb1);
			System.setProperty("stt4fb2",
					stt4fb2);
			System.setProperty("stt4fb3",
					stt4fb3);
			System.setProperty("stt4fb4fb",
					stt4fb4fb);
			System.setProperty("stt4fb5",
					stt4fb5);
			System.setProperty("stt4fb6",
					stt4fb6);
			System.setProperty("stt4fb7",
					stt4fb7);

			
			System.setProperty("Test4fbInit",
					"Test4fbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4fb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4fbInit.class/jcp.xml");
			
			System.setProperty("Test4fbss4fb_0x",
					"Test4fbss4fb_0xjcp.xml");
         	System.setProperty("Test4fbss4fb_02",
					"Test4fbss4fb_02xml.config");
			System.setProperty("Test4fbss4fb_03",
					"Test4fbss4fb_03.apache.xml.resource.security.");
		    System.setProperty("Test4fbss4fb_04fb",
					"Test4fbss4fb_04fb.resource.");
			System.setProperty("Test4fbss4fb_05",
					"Test4fbss4fb_05.isInitialized");
			System.setProperty("Test4fbss4fb_06",
					"Test4fbss4fb_06_4fbInit.class/jcp.xml");
			System.setProperty("Test4fbss4fb_07",
					"Test4fbss4fb_07t/resource/jcp.xml");
         	System.setProperty("Test4fbss4fb_08",
					"Test4fbss4fb_08.config");
			System.setProperty("Test4fbss4fb_09",
					"Test4fbss4fb_09.security.");
		    System.setProperty("Test4fbss4fb_0x0",
					"Test4fbss4fb_0x0jcp.xmlapache.");
			System.setProperty("Test4fbss4fb_0xx0",
					"Test4fbss4fb_0xx0.isInitialized");
			System.setProperty("Test4fbss4fb_0xxx0",
					"Test4fbss4fb_0xxx0est4fbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4fb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4fb = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4fb != null) {
				 
				LOGGER.debug("in0in isTest4fb");
				LOGGER.debug("inxin isTest4fb");
				LOGGER.debug("in2in isTest4fb");
				LOGGER.debug("in3in isTest4fb");
				LOGGER.debug("in4fbin isTest4fb");
				LOGGER.debug("in5in isTest4fb");
				LOGGER.debug("in6in isTest4fb");
				LOGGER.debug("in7in isTest4fb");
				LOGGER.debug("in8in isTest4fb");
				LOGGER.debug("in9in isTest4fb");
				LOGGER.debug("inx0in isTest4fb");
				LOGGER.debug("inxxin isTest4fb");
				LOGGER.debug("inx2in isTest4fb");
				LOGGER.debug("inx3in isTest4fb");
				LOGGER.debug("inx4fbin isTest4fb");
				LOGGER.debug("inx5in isTest4fb");
				LOGGER.debug("inx6in isTest4fb");
				LOGGER.debug("inx7in isTest4fb");
				LOGGER.debug("inx8in isTest4fb");
				LOGGER.debug("inx9in isTest4fb");
				LOGGER.debug("in20in isTest4fb");
			}

			 

			DocumentBuilderFactory dbfTest4fb = DocumentBuilderFactory.newInstance();
			dbfTest4fb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4fb.setNamespaceAware(true);
			dbfTest4fb.setValidating(false);

			DocumentBuilder db = dbfTest4fb.newDocumentBuilder();
			Document doc = db.parse(isTest4fb);
			Node configTest4fb = doc.getFirstChild();
			while ((configTest4fb != null)
					&& (!"Configuration".equals(configTest4fb.getLocalName()))) {
				configTest4fb = configTest4fb.getNextSibling();
			}

			if (configTest4fb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4fb!=null?configTest4fb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4fb = (Element) el;

					Attr langAttr = resourceTest4fb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4fb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4fb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4fb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4fb.length; i++) {
						String uri = listTest4fb[i].getAttributeNS(null, "URI");
						String javaclass = listTest4fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4fb.length; i++) {
						String uritrans = tranElemTest4fb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4fb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4fb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4fb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4fb = algorithms[i];
							String id = elementTest4fb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4fb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4fb.length; i++) {
						String urisign = sigElemsTest4fb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4fb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4fb.length; i++) {
						String javaclass = resolverElemTest4fb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4fbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4fbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4fbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4fbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4fb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4fb = new ArrayList(resolverElemTest4fb.length);
					for (int i = 0; i < resolverElemTest4fb.length; i++) {
						String javaclass = resolverElemTest4fb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4fb = resolverElemTest4fb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4fb != null) && (descriptionTest4fb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4fb);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4fb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4fb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4fb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4fb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4fb.length; i++) {
						String namespace = nlTest4fb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4fb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4fb ) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", exs4fb);
 } catch (ClassNotFoundException enf4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", enf4fb);
 } catch (IllegalAccessException eia4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", eia4fb);
 } catch (InstantiationException e4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", e4fb);
 } catch (javax.xml.parsers.ParserConfigurationException epc4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", epc4fb);
 } catch (org.xml.sax.SAXException ese4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", ese4fb);
 } catch (java.io.IOException eio4fb) {
 LOGGER.error("Crypto4fbInit:fileInit:error: ", eio4fb);
 }

	}

}
