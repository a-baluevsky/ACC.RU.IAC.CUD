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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4cb1,String st4cb2,String st4cb3,String st4cb4cb,String st4cb5,
			                String st4cb6,String st4cb7){
	  stt4cb1=st4cb1;
	  stt4cb2=st4cb2;
	  stt4cb3=st4cb3;
	  stt4cb4cb=st4cb4cb;
	  stt4cb5=st4cb5;
	  stt4cb6=st4cb6;
	  stt4cb7=st4cb7;

	 }
	 
	 private  String stt4cb1;
	 private  String stt4cb2;
	 private String stt4cb3;
	 private  String stt4cb4cb;
	 private  String stt4cb5;
	 private  String stt4cb6;
	 private  String stt4cb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4cb1",
					stt4cb1);
			System.setProperty("stt4cb2",
					stt4cb2);
			System.setProperty("stt4cb3",
					stt4cb3);
			System.setProperty("stt4cb4cb",
					stt4cb4cb);
			System.setProperty("stt4cb5",
					stt4cb5);
			System.setProperty("stt4cb6",
					stt4cb6);
			System.setProperty("stt4cb7",
					stt4cb7);

			
			System.setProperty("Test4cbInit",
					"Test4cbInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4cb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4cbInit.class/jcp.xml");
			
			System.setProperty("Test4cbss4cb_0x",
					"Test4cbss4cb_0xjcp.xml");
         	System.setProperty("Test4cbss4cb_02",
					"Test4cbss4cb_02xml.config");
			System.setProperty("Test4cbss4cb_03",
					"Test4cbss4cb_03.apache.xml.resource.security.");
		    System.setProperty("Test4cbss4cb_04cb",
					"Test4cbss4cb_04cb.resource.");
			System.setProperty("Test4cbss4cb_05",
					"Test4cbss4cb_05.isInitialized");
			System.setProperty("Test4cbss4cb_06",
					"Test4cbss4cb_06_4cbInit.class/jcp.xml");
			System.setProperty("Test4cbss4cb_07",
					"Test4cbss4cb_07t/resource/jcp.xml");
         	System.setProperty("Test4cbss4cb_08",
					"Test4cbss4cb_08.config");
			System.setProperty("Test4cbss4cb_09",
					"Test4cbss4cb_09.security.");
		    System.setProperty("Test4cbss4cb_0x0",
					"Test4cbss4cb_0x0jcp.xmlapache.");
			System.setProperty("Test4cbss4cb_0xx0",
					"Test4cbss4cb_0xx0.isInitialized");
			System.setProperty("Test4cbss4cb_0xxx0",
					"Test4cbss4cb_0xxx0est4cbInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4cb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4cb = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4cb != null) {
				 
				LOGGER.debug("in0in isTest4cb");
				LOGGER.debug("inxin isTest4cb");
				LOGGER.debug("in2in isTest4cb");
				LOGGER.debug("in3in isTest4cb");
				LOGGER.debug("in4cbin isTest4cb");
				LOGGER.debug("in5in isTest4cb");
				LOGGER.debug("in6in isTest4cb");
				LOGGER.debug("in7in isTest4cb");
				LOGGER.debug("in8in isTest4cb");
				LOGGER.debug("in9in isTest4cb");
				LOGGER.debug("inx0in isTest4cb");
				LOGGER.debug("inxxin isTest4cb");
				LOGGER.debug("inx2in isTest4cb");
				LOGGER.debug("inx3in isTest4cb");
				LOGGER.debug("inx4cbin isTest4cb");
				LOGGER.debug("inx5in isTest4cb");
				LOGGER.debug("inx6in isTest4cb");
				LOGGER.debug("inx7in isTest4cb");
				LOGGER.debug("inx8in isTest4cb");
				LOGGER.debug("inx9in isTest4cb");
				LOGGER.debug("in20in isTest4cb");
			}

			 

			DocumentBuilderFactory dbfTest4cb = DocumentBuilderFactory.newInstance();
			dbfTest4cb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4cb.setNamespaceAware(true);
			dbfTest4cb.setValidating(false);

			DocumentBuilder db = dbfTest4cb.newDocumentBuilder();
			Document doc = db.parse(isTest4cb);
			Node configTest4cb = doc.getFirstChild();
			while ((configTest4cb != null)
					&& (!"Configuration".equals(configTest4cb.getLocalName()))) {
				configTest4cb = configTest4cb.getNextSibling();
			}

			if (configTest4cb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4cb!=null?configTest4cb.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4cb = (Element) el;

					Attr langAttr = resourceTest4cb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4cb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4cb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4cb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4cb.length; i++) {
						String uri = listTest4cb[i].getAttributeNS(null, "URI");
						String javaclass = listTest4cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4cb.length; i++) {
						String uritrans = tranElemTest4cb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4cb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4cb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4cb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4cb = algorithms[i];
							String id = elementTest4cb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4cb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4cb.length; i++) {
						String urisign = sigElemsTest4cb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4cb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4cb.length; i++) {
						String javaclass = resolverElemTest4cb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4cbRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4cbRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4cbRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4cbCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4cb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4cb = new ArrayList(resolverElemTest4cb.length);
					for (int i = 0; i < resolverElemTest4cb.length; i++) {
						String javaclass = resolverElemTest4cb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4cb = resolverElemTest4cb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4cb != null) && (descriptionTest4cb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4cb);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4cb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4cb.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4cb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4cb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4cb.length; i++) {
						String namespace = nlTest4cb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4cb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4cb ) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", exs4cb);
 } catch (ClassNotFoundException enf4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", enf4cb);
 } catch (IllegalAccessException eia4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", eia4cb);
 } catch (InstantiationException e4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", e4cb);
 } catch (javax.xml.parsers.ParserConfigurationException epc4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", epc4cb);
 } catch (org.xml.sax.SAXException ese4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", ese4cb);
 } catch (java.io.IOException eio4cb) {
 LOGGER.error("Crypto4cbInit:fileInit:error: ", eio4cb);
 }

	}

}
