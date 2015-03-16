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

 public class CryptoBaseTableInit {

	 
	 public CryptoBaseTableInit(){
	 }
	 
	 
	 public CryptoBaseTableInit(String st4i1,String st4i2,String st4i3,String st4i4i,String st4i5,
			                String st4i6,String st4i7){
	  stt4i1=st4i1;
	  stt4i2=st4i2;
	  stt4i3=st4i3;
	  stt4i4i=st4i4i;
	  stt4i5=st4i5;
	  stt4i6=st4i6;
	  stt4i7=st4i7;

	 }
	 
	 private  String stt4i1;
	 private  String stt4i2;
	 private String stt4i3;
	 private  String stt4i4i;
	 private  String stt4i5;
	 private  String stt4i6;
	 private  String stt4i7;

	 
	 private static final Log LOGGER= LogFactory.getLog(CryptoBaseTableInit.class);

	public  void init() {
		try {

			 
			System.setProperty("stt4i1",
					stt4i1);
			System.setProperty("stt4i2",
					stt4i2);
			System.setProperty("stt4i3",
					stt4i3);
			System.setProperty("stt4i4i",
					stt4i4i);
			System.setProperty("stt4i5",
					stt4i5);
			System.setProperty("stt4i6",
					stt4i6);
			System.setProperty("stt4i7",
					stt4i7);

			
			System.setProperty("Test4iInit",
					"Test4iInit/resource/jcp.xml");
         	System.setProperty("org.xml.security.apache.resource",
					"xml.config");
			System.setProperty("resource/jcp.xmlorgconfig",
					".apache.xml.resource.security.");
		    System.setProperty("Systemorg.config",
					"jcp.xmlapache.xml.security.resource.");
			System.setProperty("Crypto4i5Init:init",
					"Init.isInitialized");
			System.setProperty("LogFactory.getLog",
					"CryptoTest4iInit.class/jcp.xml");
			
			System.setProperty("Test4iss4i_0x",
					"Test4iss4i_0xjcp.xml");
         	System.setProperty("Test4iss4i_02",
					"Test4iss4i_02xml.config");
			System.setProperty("Test4iss4i_03",
					"Test4iss4i_03.apache.xml.resource.security.");
		    System.setProperty("Test4iss4i_04i",
					"Test4iss4i_04i.resource.");
			System.setProperty("Test4iss4i_05",
					"Test4iss4i_05.isInitialized");
			System.setProperty("Test4iss4i_06",
					"Test4iss4i_06_4iInit.class/jcp.xml");
			System.setProperty("Test4iss4i_07",
					"Test4iss4i_07t/resource/jcp.xml");
         	System.setProperty("Test4iss4i_08",
					"Test4iss4i_08.config");
			System.setProperty("Test4iss4i_09",
					"Test4iss4i_09.security.");
		    System.setProperty("Test4iss4i_0x0",
					"Test4iss4i_0x0jcp.xmlapache.");
			System.setProperty("Test4iss4i_0xx0",
					"Test4iss4i_0xx0.isInitialized");
			System.setProperty("Test4iss4i_0xxx0",
					"Test4iss4i_0xxx0est4iInit.class/jcp.xml");
			
			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto4i5Init:init:error:", e);
		}
	}

	public void fileInit() {

		 
		try {
			InputStream isTest4i = CryptoBaseTableInit.class.getResourceAsStream("/jcp.xml");

			if (isTest4i != null) {
				 
				LOGGER.debug("in0in isTest4i");
				LOGGER.debug("inxin isTest4i");
				LOGGER.debug("in2in isTest4i");
				LOGGER.debug("in3in isTest4i");
				LOGGER.debug("in4iin isTest4i");
				LOGGER.debug("in5in isTest4i");
				LOGGER.debug("in6in isTest4i");
				LOGGER.debug("in7in isTest4i");
				LOGGER.debug("in8in isTest4i");
				LOGGER.debug("in9in isTest4i");
				LOGGER.debug("inx0in isTest4i");
				LOGGER.debug("inxxin isTest4i");
				LOGGER.debug("inx2in isTest4i");
				LOGGER.debug("inx3in isTest4i");
				LOGGER.debug("inx4iin isTest4i");
				LOGGER.debug("inx5in isTest4i");
				LOGGER.debug("inx6in isTest4i");
				LOGGER.debug("inx7in isTest4i");
				LOGGER.debug("inx8in isTest4i");
				LOGGER.debug("inx9in isTest4i");
				LOGGER.debug("in20in isTest4i");
			}

			 

			DocumentBuilderFactory dbfTest4i = DocumentBuilderFactory.newInstance();
			dbfTest4i.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbfTest4i.setNamespaceAware(true);
			dbfTest4i.setValidating(false);

			DocumentBuilder db = dbfTest4i.newDocumentBuilder();
			Document doc = db.parse(isTest4i);
			Node configTest4i = doc.getFirstChild();
			while ((configTest4i != null)
					&& (!"Configuration".equals(configTest4i.getLocalName()))) {
				configTest4i = configTest4i.getNextSibling();
			}

			if (configTest4i != null) {
				LOGGER.debug("Error in reading configuration file - Configuration element not found");
			}
			for (Node el = configTest4i.getFirstChild(); el != null; el = el
					.getNextSibling()) {
				if ((el == null) || (1 != el.getNodeType())) {
					continue;
				}
				String tag = el.getLocalName();
				if ("ResourceBundles".equals(tag)) {
					Element resourceTest4i = (Element) el;

					Attr langAttr = resourceTest4i
							.getAttributeNode("defaultLanguageCode");
					Attr countryAttr = resourceTest4i
							.getAttributeNode("defaultCountryCode");
					String languageCode = langAttr == null ? null : langAttr
							.getNodeValue();

					String countryCodeTest4i = countryAttr == null ? null
							: countryAttr.getNodeValue();

					I18n.init(languageCode, countryCodeTest4i);
				}

				if ("CanonicalizationMethods".equals(tag)) {
					Element[] listTest4i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"CanonicalizationMethod");

					for (int i = 0; i < listTest4i.length; i++) {
						String uri = listTest4i[i].getAttributeNS(null, "URI");
						String javaclass = listTest4i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI:"+uri);
						LOGGER.debug("JAVACLASS:"+javaclass);
						
					}
				}

				if ("TransformAlgorithms".equals(tag)) {
					Element[] tranElemTest4i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"TransformAlgorithm");

					for (int i = 0; i < tranElemTest4i.length; i++) {
						String uritrans = tranElemTest4i[i].getAttributeNS(null, "URI");
						String javaclasstrans = tranElemTest4i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+uritrans);
						LOGGER.debug("JAVACLASS_trans:"+javaclasstrans);
					}
				}

				 
				if ("JCEAlgorithmMappings".equals(tag)) {

					 

					Node algorithmsNodeTest4i = ((Element) el).getElementsByTagName(
							"Algorithms").item(0);
					if (algorithmsNodeTest4i != null) {

						 

						Element[] algorithms = XMLUtils.selectNodes(
								algorithmsNodeTest4i.getFirstChild(),
								"http://www.xmlsecurity.org/NS/#configuration",
								"Algorithm");

						for (int i = 0; i < algorithms.length; i++) {

							Element elementTest4i = algorithms[i];
							String id = elementTest4i.getAttribute("URI");

							 
							 

							JCEMapper.register(id, new JCEMapper.Algorithm(
									elementTest4i));

							 

						}
					}
				}

				if ("SignatureAlgorithms".equals(tag)) {
					Element[] sigElemsTest4i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"SignatureAlgorithm");

					for (int i = 0; i < sigElemsTest4i.length; i++) {
						String urisign = sigElemsTest4i[i].getAttributeNS(null, "URI");
						String javaclasssign = sigElemsTest4i[i].getAttributeNS(null,
								"JAVACLASS");
						LOGGER.debug("URI_trans:"+urisign);
						LOGGER.debug("JAVACLASS_trans:"+javaclasssign);
					}
				}

				if ("ResourceResolvers".equals(tag)) {
					Element[] resolverElemTest4i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					for (int i = 0; i < resolverElemTest4i.length; i++) {
						String javaclass = resolverElemTest4i[i].getAttributeNS(null,
								"JAVACLASS");

						String description = resolverElemTest4i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((description != null) && (description.length() > 0)) {
							
								LOGGER.debug("Test4iRegister Resolver: " + javaclass
										+ ": " + description);
							
								LOGGER.debug("098Test4iRegister Resolver: " + javaclass
										+ ": " + description);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Test4iRegister Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						
							ResourceResolver.register(javaclass);
							LOGGER.debug(
									"Test4iCannot register:"
											+ javaclass
											+ " perhaps some needed jars are not installed");
						

					}

				}

				if ("KeyResolver".equals(tag)) {
					Element[] resolverElemTest4i = XMLUtils.selectNodes(
							el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Resolver");

					List classNamesTest4i = new ArrayList(resolverElemTest4i.length);
					for (int i = 0; i < resolverElemTest4i.length; i++) {
						String javaclass = resolverElemTest4i[i].getAttributeNS(null,
								"JAVACLASS");

						String descriptionTest4i = resolverElemTest4i[i].getAttributeNS(
								null, "DESCRIPTION");

						if ((descriptionTest4i != null) && (descriptionTest4i.length() > 0)) {
							
								LOGGER.debug("Register Resolver: " + javaclass
										+ ": " + descriptionTest4i);
							
								LOGGER.debug("990Register Resolver: " + javaclass
										+ ": " + descriptionTest4i);
						} 
 if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + javaclass
									+ ": For unknown purposes");
						}

						classNamesTest4i.add(javaclass);
					}
					KeyResolver.registerClassNames(classNamesTest4i);
				}

				if ("PrefixMappings".equals(tag)) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind prefixes:");
					}

					Element[] nlTest4i = XMLUtils.selectNodes(el.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"PrefixMapping");

					for (int i = 0; i < nlTest4i.length; i++) {
						String namespace = nlTest4i[i].getAttributeNS(null,
								"namespace");
						String prefix = nlTest4i[i].getAttributeNS(null, "prefix");
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Now I try to bind " + prefix + " to "
									+ namespace);
						}
						ElementProxy.setDefaultPrefix(namespace, prefix);
					}
				}
			}
		} catch (Exception eTest4i) {
			LOGGER.error("Crypto4i5Init:fileInit:error: ", eTest4i);
		}
	}

}
