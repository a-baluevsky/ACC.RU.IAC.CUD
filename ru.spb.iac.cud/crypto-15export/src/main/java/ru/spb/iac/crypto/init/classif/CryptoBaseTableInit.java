package ru.spb.iac.crypto.init.classif;

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
	 
	 
	 public CryptoBaseTableInit(String st4n1,String st4n2,String st4n3,String st4n4n,String st4n5,
			                String st4n6,String st4n7){
	  stt4n1=st4n1;
	  stt4n2=st4n2;
	  stt4n3=st4n3;
	  stt4n4n=st4n4n;
	  stt4n5=st4n5;
	  stt4n6=st4n6;
	  stt4n7=st4n7;

	 }
	 
	 private  String stt4n1;
	 private  String stt4n2;
	 private String stt4n3;
	 private  String stt4n4n;
	 private  String stt4n5;
	 private  String stt4n6;
	 private  String stt4n7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4n1",
					stt4n1);
			System.setProperty("stt4n2",
					stt4n2);
			System.setProperty("stt4n3",
					stt4n3);
			System.setProperty("stt4n4n",
					stt4n4n);
			System.setProperty("stt4n5",
					stt4n5);
			System.setProperty("stt4n6",
					stt4n6);
			System.setProperty("stt4n7",
					stt4n7);

			
			System.setProperty("Test4nInit",
					"Test4nInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4n5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4nInit.class/jcp.xml");
			
			System.setProperty("Test4nss4n_0x",
					"Test4nss4n_0xjcp.xml");
         	System.setProperty("Test4nss4n_02",
					"Test4nss4n_02xml.config");
			System.setProperty("Test4nss4n_03",
					"Test4nss4n_03.apache.xml.resource.security.");
		    System.setProperty("Test4nss4n_04n",
					"Test4nss4n_04n.resource.");
			System.setProperty("Test4nss4n_05",
					"Test4nss4n_05.isInitialized");
			System.setProperty("Test4nss4n_06",
					"Test4nss4n_06_4nInit.class/jcp.xml");
			System.setProperty("Test4nss4n_07",
					"Test4nss4n_07t/resource/jcp.xml");
         	System.setProperty("Test4nss4n_08",
					"Test4nss4n_08.config");
			System.setProperty("Test4nss4n_09",
					"Test4nss4n_09.security.");
		    System.setProperty("Test4nss4n_0x0",
					"Test4nss4n_0x0jcp.xmlapache.");
			System.setProperty("Test4nss4n_0xx0",
					"Test4nss4n_0xx0.isInitialized");
			System.setProperty("Test4nss4n_0xxx0",
					"Test4nss4n_0xxx0est4nInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4n5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4n = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4n != null) {
				 
				LOGGER.debug("in0in isTest4n");
				LOGGER.debug("inxin isTest4n");
				LOGGER.debug("in2in isTest4n");
				LOGGER.debug("in3in isTest4n");
				LOGGER.debug("in4nin isTest4n");
				LOGGER.debug("in5in isTest4n");
				LOGGER.debug("in6in isTest4n");
				LOGGER.debug("in7in isTest4n");
				LOGGER.debug("in8in isTest4n");
				LOGGER.debug("in9in isTest4n");
				LOGGER.debug("inx0in isTest4n");
				LOGGER.debug("inxxin isTest4n");
				LOGGER.debug("inx2in isTest4n");
				LOGGER.debug("inx3in isTest4n");
				LOGGER.debug("inx4nin isTest4n");
				LOGGER.debug("inx5in isTest4n");
				LOGGER.debug("inx6in isTest4n");
				LOGGER.debug("inx7in isTest4n");
				LOGGER.debug("inx8in isTest4n");
				LOGGER.debug("inx9in isTest4n");
				LOGGER.debug("in20in isTest4n");
			}

			 

			DocumentBuilderFactory dbfTest4n = DocumentBuilderFactory.newInstance();
			dbfTest4n.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4n.setNamespaceAware(true);
			dbfTest4n.setValidating(false);

			DocumentBuilder db = dbfTest4n.newDocumentBuilder();
			Document doc = db.parse(isTest4n);
			Node configTest4n = doc.getFirstChild();
			while ((configTest4n != null)
					&& (!"Configuration".equals(configTest4n.getLocalName()))) {
				configTest4n = configTest4n.getNextSibling();
			}

			if (configTest4n != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4n.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4n = (Element) el;

					Attr langAttr = resourceTest4n
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4n
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4n = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4n);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4n.length; i++) {
						String uri = listTest4n[i].getAttributeNS(null, "URI");
						String javaclass = listTest4n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4n.length; i++) {
						String uritrans = tranElemTest4n[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4n = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4n != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4n.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4n = algorithms[i];
							String id = elementTest4n.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4n));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4n.length; i++) {
						String urisign = sigElemsTest4n[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4n[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4n.length; i++) {
						String javaclass = resolverElemTest4n[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4nRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4nRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4nRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4nCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4n = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4n = new ArrayList(resolverElemTest4n.length);
					for (int i = 0; i < resolverElemTest4n.length; i++) {
						String javaclass = resolverElemTest4n[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4n = resolverElemTest4n[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4n != null) && (descriptionTest4n.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4n);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4n);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4n.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest4n);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4n = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4n.length; i++) {
						String namespace = nlTest4n[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4n[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest4n) {
			LOGGER.error("Crypto4n5Init:fileInit:error: ", eTest4n);
		}
	}

}
