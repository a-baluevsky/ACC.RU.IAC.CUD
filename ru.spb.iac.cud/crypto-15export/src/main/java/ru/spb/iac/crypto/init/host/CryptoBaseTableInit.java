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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4o1,String st4o2,String st4o3,String st4o4o,String st4o5,
			                String st4o6,String st4o7){
	  stt4o1=st4o1;
	  stt4o2=st4o2;
	  stt4o3=st4o3;
	  stt4o4o=st4o4o;
	  stt4o5=st4o5;
	  stt4o6=st4o6;
	  stt4o7=st4o7;

	 }
	 
	 private  String stt4o1;
	 private  String stt4o2;
	 private String stt4o3;
	 private  String stt4o4o;
	 private  String stt4o5;
	 private  String stt4o6;
	 private  String stt4o7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4o1",
					stt4o1);
			System.setProperty("stt4o2",
					stt4o2);
			System.setProperty("stt4o3",
					stt4o3);
			System.setProperty("stt4o4o",
					stt4o4o);
			System.setProperty("stt4o5",
					stt4o5);
			System.setProperty("stt4o6",
					stt4o6);
			System.setProperty("stt4o7",
					stt4o7);

			
			System.setProperty("Test4oInit",
					"Test4oInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4o5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4oInit.class/jcp.xml");
			
			System.setProperty("Test4oss4o_0x",
					"Test4oss4o_0xjcp.xml");
         	System.setProperty("Test4oss4o_02",
					"Test4oss4o_02xml.config");
			System.setProperty("Test4oss4o_03",
					"Test4oss4o_03.apache.xml.resource.security.");
		    System.setProperty("Test4oss4o_04o",
					"Test4oss4o_04o.resource.");
			System.setProperty("Test4oss4o_05",
					"Test4oss4o_05.isInitialized");
			System.setProperty("Test4oss4o_06",
					"Test4oss4o_06_4oInit.class/jcp.xml");
			System.setProperty("Test4oss4o_07",
					"Test4oss4o_07t/resource/jcp.xml");
         	System.setProperty("Test4oss4o_08",
					"Test4oss4o_08.config");
			System.setProperty("Test4oss4o_09",
					"Test4oss4o_09.security.");
		    System.setProperty("Test4oss4o_0x0",
					"Test4oss4o_0x0jcp.xmlapache.");
			System.setProperty("Test4oss4o_0xx0",
					"Test4oss4o_0xx0.isInitialized");
			System.setProperty("Test4oss4o_0xxx0",
					"Test4oss4o_0xxx0est4oInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4o5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4o = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4o != null) {
				 
				LOGGER.debug("in0in isTest4o");
				LOGGER.debug("inxin isTest4o");
				LOGGER.debug("in2in isTest4o");
				LOGGER.debug("in3in isTest4o");
				LOGGER.debug("in4oin isTest4o");
				LOGGER.debug("in5in isTest4o");
				LOGGER.debug("in6in isTest4o");
				LOGGER.debug("in7in isTest4o");
				LOGGER.debug("in8in isTest4o");
				LOGGER.debug("in9in isTest4o");
				LOGGER.debug("inx0in isTest4o");
				LOGGER.debug("inxxin isTest4o");
				LOGGER.debug("inx2in isTest4o");
				LOGGER.debug("inx3in isTest4o");
				LOGGER.debug("inx4oin isTest4o");
				LOGGER.debug("inx5in isTest4o");
				LOGGER.debug("inx6in isTest4o");
				LOGGER.debug("inx7in isTest4o");
				LOGGER.debug("inx8in isTest4o");
				LOGGER.debug("inx9in isTest4o");
				LOGGER.debug("in20in isTest4o");
			}

			 

			DocumentBuilderFactory dbfTest4o = DocumentBuilderFactory.newInstance();
			dbfTest4o.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4o.setNamespaceAware(true);
			dbfTest4o.setValidating(false);

			DocumentBuilder db = dbfTest4o.newDocumentBuilder();
			Document doc = db.parse(isTest4o);
			Node configTest4o = doc.getFirstChild();
			while ((configTest4o != null)
					&& (!"Configuration".equals(configTest4o.getLocalName()))) {
				configTest4o = configTest4o.getNextSibling();
			}

			if (configTest4o != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4o!=null?configTest4o.getFirstChild():null; el != null; el = el
					.getNextSibling()) {
				if (1 != el.getNodeType()) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4o = (Element) el;

					Attr langAttr = resourceTest4o
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4o
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4o = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4o);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4o.length; i++) {
						String uri = listTest4o[i].getAttributeNS(null, "URI");
						String javaclass = listTest4o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4o.length; i++) {
						String uritrans = tranElemTest4o[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4o = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4o != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4o.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4o = algorithms[i];
							String id = elementTest4o.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4o));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4o.length; i++) {
						String urisign = sigElemsTest4o[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4o[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4o.length; i++) {
						String javaclass = resolverElemTest4o[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4oRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4oRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4oRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4oCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4o = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4o = new ArrayList(resolverElemTest4o.length);
					for (int i = 0; i < resolverElemTest4o.length; i++) {
						String javaclass = resolverElemTest4o[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4o = resolverElemTest4o[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4o != null) && (descriptionTest4o.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4o);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4o);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4o.add(javaclass);
 
					}
					KeyResolver.registerClassNames(classNamesTest4o);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4o = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4o.length; i++) {
						String namespace = nlTest4o[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4o[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (org.apache.xml.security.exceptions.XMLSecurityException exs4o ) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", exs4o);
 } catch (ClassNotFoundException enf4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", enf4o);
 } catch (IllegalAccessException eia4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", eia4o);
 } catch (InstantiationException e4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", e4o);
 } catch (javax.xml.parsers.ParserConfigurationException epc4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", epc4o);
 } catch (org.xml.sax.SAXException ese4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", ese4o);
 } catch (java.io.IOException eio4o) {
 LOGGER.error("Crypto4oInit:fileInit:error: ", eio4o);
 }

	}

}
