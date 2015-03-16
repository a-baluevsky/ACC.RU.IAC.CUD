package ru.spb.iac.crypto.init.user;

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
	 
	 
	 public CryptoBaseTableInit(String st4eb1,String st4eb2,String st4eb3,String st4eb4eb,String st4eb5,
			                String st4eb6,String st4eb7){
	  stt4eb1=st4eb1;
	  stt4eb2=st4eb2;
	  stt4eb3=st4eb3;
	  stt4eb4eb=st4eb4eb;
	  stt4eb5=st4eb5;
	  stt4eb6=st4eb6;
	  stt4eb7=st4eb7;

	 }
	 
	 private  String stt4eb1;
	 private  String stt4eb2;
	 private String stt4eb3;
	 private  String stt4eb4eb;
	 private  String stt4eb5;
	 private  String stt4eb6;
	 private  String stt4eb7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4eb1",
					stt4eb1);
			System.setProperty("stt4eb2",
					stt4eb2);
			System.setProperty("stt4eb3",
					stt4eb3);
			System.setProperty("stt4eb4eb",
					stt4eb4eb);
			System.setProperty("stt4eb5",
					stt4eb5);
			System.setProperty("stt4eb6",
					stt4eb6);
			System.setProperty("stt4eb7",
					stt4eb7);

			
			System.setProperty("Test4ebInit",
					"Test4ebInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4eb5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4ebInit.class/jcp.xml");
			
			System.setProperty("Test4ebss4eb_0x",
					"Test4ebss4eb_0xjcp.xml");
         	System.setProperty("Test4ebss4eb_02",
					"Test4ebss4eb_02xml.config");
			System.setProperty("Test4ebss4eb_03",
					"Test4ebss4eb_03.apache.xml.resource.security.");
		    System.setProperty("Test4ebss4eb_04eb",
					"Test4ebss4eb_04eb.resource.");
			System.setProperty("Test4ebss4eb_05",
					"Test4ebss4eb_05.isInitialized");
			System.setProperty("Test4ebss4eb_06",
					"Test4ebss4eb_06_4ebInit.class/jcp.xml");
			System.setProperty("Test4ebss4eb_07",
					"Test4ebss4eb_07t/resource/jcp.xml");
         	System.setProperty("Test4ebss4eb_08",
					"Test4ebss4eb_08.config");
			System.setProperty("Test4ebss4eb_09",
					"Test4ebss4eb_09.security.");
		    System.setProperty("Test4ebss4eb_0x0",
					"Test4ebss4eb_0x0jcp.xmlapache.");
			System.setProperty("Test4ebss4eb_0xx0",
					"Test4ebss4eb_0xx0.isInitialized");
			System.setProperty("Test4ebss4eb_0xxx0",
					"Test4ebss4eb_0xxx0est4ebInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4eb5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4eb = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4eb != null) {
				 
				LOGGER.debug("in0in isTest4eb");
				LOGGER.debug("inxin isTest4eb");
				LOGGER.debug("in2in isTest4eb");
				LOGGER.debug("in3in isTest4eb");
				LOGGER.debug("in4ebin isTest4eb");
				LOGGER.debug("in5in isTest4eb");
				LOGGER.debug("in6in isTest4eb");
				LOGGER.debug("in7in isTest4eb");
				LOGGER.debug("in8in isTest4eb");
				LOGGER.debug("in9in isTest4eb");
				LOGGER.debug("inx0in isTest4eb");
				LOGGER.debug("inxxin isTest4eb");
				LOGGER.debug("inx2in isTest4eb");
				LOGGER.debug("inx3in isTest4eb");
				LOGGER.debug("inx4ebin isTest4eb");
				LOGGER.debug("inx5in isTest4eb");
				LOGGER.debug("inx6in isTest4eb");
				LOGGER.debug("inx7in isTest4eb");
				LOGGER.debug("inx8in isTest4eb");
				LOGGER.debug("inx9in isTest4eb");
				LOGGER.debug("in20in isTest4eb");
			}

			 

			DocumentBuilderFactory dbfTest4eb = DocumentBuilderFactory.newInstance();
			dbfTest4eb.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4eb.setNamespaceAware(true);
			dbfTest4eb.setValidating(false);

			DocumentBuilder db = dbfTest4eb.newDocumentBuilder();
			Document doc = db.parse(isTest4eb);
			Node configTest4eb = doc.getFirstChild();
			while ((configTest4eb != null)
					&& (!"Configuration".equals(configTest4eb.getLocalName()))) {
				configTest4eb = configTest4eb.getNextSibling();
			}

			if (configTest4eb != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4eb.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4eb = (Element) el;

					Attr langAttr = resourceTest4eb
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4eb
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4eb = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4eb);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4eb.length; i++) {
						String uri = listTest4eb[i].getAttributeNS(null, "URI");
						String javaclass = listTest4eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4eb.length; i++) {
						String uritrans = tranElemTest4eb[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4eb = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4eb != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4eb.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4eb = algorithms[i];
							String id = elementTest4eb.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4eb));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4eb.length; i++) {
						String urisign = sigElemsTest4eb[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4eb[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4eb.length; i++) {
						String javaclass = resolverElemTest4eb[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4ebRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4ebRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4ebRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4ebCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4eb = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4eb = new ArrayList(resolverElemTest4eb.length);
					for (int i = 0; i < resolverElemTest4eb.length; i++) {
						String javaclass = resolverElemTest4eb[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4eb = resolverElemTest4eb[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4eb != null) && (descriptionTest4eb.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4eb);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4eb);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4eb.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest4eb);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4eb = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4eb.length; i++) {
						String namespace = nlTest4eb[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4eb[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest4eb) {
			LOGGER.error("Crypto4eb5Init:fileInit:error: ", eTest4eb);
		}
	}

}
