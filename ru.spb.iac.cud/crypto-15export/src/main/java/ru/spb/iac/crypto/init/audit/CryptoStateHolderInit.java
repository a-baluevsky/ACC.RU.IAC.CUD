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

 public class CryptoStateHolderInit {

	 
	 public CryptoStateHolderInit(){
	 }
	 
	 
	 public CryptoStateHolderInit(String st5i1,String st5i2,String st5i3,String st5i4,String st5i5i,
			                String st5i6,String st5i7){
	  stt5i1=st5i1;
	  stt5i2=st5i2;
	  stt5i3=st5i3;
	  stt5i4=st5i4;
	  stt5i5i=st5i5i;
	  stt5i6=st5i6;
	  stt5i7=st5i7;

	 }
	 
	 private  String stt5i1;
	 private  String stt5i2;
	 private String stt5i3;
	 private  String stt5i4;
	 private  String stt5i5i;
	 private  String stt5i6;
	 private  String stt5i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoStateHolderInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt5i1",
					stt5i1);
			System.setProperty("stt5i2",
					stt5i2);
			System.setProperty("stt5i3",
					stt5i3);
			System.setProperty("stt5i4",
					stt5i4);
			System.setProperty("stt5i5i",
					stt5i5i);
			System.setProperty("stt5i6",
					stt5i6);
			System.setProperty("stt5i7",
					stt5i7);

			
			System.setProperty("Test5iInit",
					"Test5iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto5i5iInit:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest5iInit.class/jcp.xml");
			
			System.setProperty("Test5iss5i_0x",
					"Test5iss5i_0xjcp.xml");
         	System.setProperty("Test5iss5i_02",
					"Test5iss5i_02xml.config");
			System.setProperty("Test5iss5i_03",
					"Test5iss5i_03.apache.xml.resource.security.");
		    System.setProperty("Test5iss5i_04",
					"Test5iss5i_04.resource.");
			System.setProperty("Test5iss5i_05i",
					"Test5iss5i_05i.isInitialized");
			System.setProperty("Test5iss5i_06",
					"Test5iss5i_06_5iInit.class/jcp.xml");
			System.setProperty("Test5iss5i_07",
					"Test5iss5i_07t/resource/jcp.xml");
         	System.setProperty("Test5iss5i_08",
					"Test5iss5i_08.config");
			System.setProperty("Test5iss5i_09",
					"Test5iss5i_09.security.");
		    System.setProperty("Test5iss5i_0x0",
					"Test5iss5i_0x0jcp.xmlapache.");
			System.setProperty("Test5iss5i_0xx0",
					"Test5iss5i_0xx0.isInitialized");
			System.setProperty("Test5iss5i_0xxx0",
					"Test5iss5i_0xxx0est5iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto5i5iInit:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest5i = CryptoStateHolderInit.class.getResourceAsStream("/jcp.xml");

			if (isTest5i != null) {
				 
				LOGGER.debug("in0in isTest5i");
				LOGGER.debug("inxin isTest5i");
				LOGGER.debug("in2in isTest5i");
				LOGGER.debug("in3in isTest5i");
				LOGGER.debug("in4in isTest5i");
				LOGGER.debug("in5iin isTest5i");
				LOGGER.debug("in6in isTest5i");
				LOGGER.debug("in7in isTest5i");
				LOGGER.debug("in8in isTest5i");
				LOGGER.debug("in9in isTest5i");
				LOGGER.debug("inx0in isTest5i");
				LOGGER.debug("inxxin isTest5i");
				LOGGER.debug("inx2in isTest5i");
				LOGGER.debug("inx3in isTest5i");
				LOGGER.debug("inx4in isTest5i");
				LOGGER.debug("inx5iin isTest5i");
				LOGGER.debug("inx6in isTest5i");
				LOGGER.debug("inx7in isTest5i");
				LOGGER.debug("inx8in isTest5i");
				LOGGER.debug("inx9in isTest5i");
				LOGGER.debug("in20in isTest5i");
			}

			 

			DocumentBuilderFactory dbfTest5i = DocumentBuilderFactory.newInstance();
			dbfTest5i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest5i.setNamespaceAware(true);
			dbfTest5i.setValidating(false);

			DocumentBuilder db = dbfTest5i.newDocumentBuilder();
			Document doc = db.parse(isTest5i);
			Node configTest5i = doc.getFirstChild();
			while ((configTest5i != null)
					&& (!"Configuration".equals(configTest5i.getLocalName()))) {
				configTest5i = configTest5i.getNextSibling();
			}

			if (configTest5i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest5i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest5i = (Element) el;

					Attr langAttr = resourceTest5i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest5i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest5i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest5i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest5i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest5i.length; i++) {
						String uri = listTest5i[i].getAttributeNS(null, "URI");
						String javaclass = listTest5i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest5i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest5i.length; i++) {
						String uritrans = tranElemTest5i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest5i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest5i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest5i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest5i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest5i = algorithms[i];
							String id = elementTest5i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest5i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest5i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest5i.length; i++) {
						String urisign = sigElemsTest5i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest5i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest5i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest5i.length; i++) {
						String javaclass = resolverElemTest5i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest5i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test5iRegister Resolver: " + javaclass
										+ ": " + description);
								LOGGER.debug("ooiTest5iRegister Resolver: " + javaclass
										+ ": " + description);

						} 
if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test5iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test5iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest5i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest5i = new ArrayList(resolverElemTest5i.length);
					for (int i = 0; i < resolverElemTest5i.length; i++) {
						String javaclass = resolverElemTest5i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest5i = resolverElemTest5i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest5i != null) && (descriptionTest5i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest5i);
								LOGGER.debug("iuuRegister Resolver: " + javaclass
										+ ": " + descriptionTest5i);

						}
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest5i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest5i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest5i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest5i.length; i++) {
						String namespace = nlTest5i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest5i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest5i) {
			LOGGER.error("Crypto5i5iInit:fileInit:error: ", eTest5i);
		}
	}

}