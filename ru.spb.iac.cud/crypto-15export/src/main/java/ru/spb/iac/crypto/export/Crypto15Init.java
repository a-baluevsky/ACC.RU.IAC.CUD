package ru.spb.iac.crypto.export;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;



 public class Crypto15Init {
	private static final Log LOGGER = LogFactory.getLog(Crypto15Init.class);

	public Crypto15Init(){
		
	}
	
	public static void init() {
		try {
			System.setProperty("org.apache.xml.security.resource.config",
					"resource/jcp.xml");

			if(!org.apache.xml.security.Init.isInitialized()){
			  org.apache.xml.security.Init.init();
			}
			 

		} catch (Exception e) {
			LOGGER.error("Crypto15Init:init:error:", e);
		}
	}
	
	private static class JcpXmlProcessor {
		public static String errorMessage = null;
		static HashMap<String, JcpXmlProcessor> hmProcs;
		static {
			Class<JcpXmlProcessor>[] procs = (Class<JcpXmlProcessor>[]) JcpXmlProcessor.class.getDeclaredClasses();
			hmProcs = new HashMap<String, JcpXmlProcessor>();
			for(Class<JcpXmlProcessor> prc: procs) {
				try {
					hmProcs.put(prc.getSimpleName(), prc.getDeclaredConstructor().newInstance());
				} catch (Exception e) {				
					errorMessage = "JcpXmlProcessor initialization failed! "+e.toString();
					break;
				}
			}
		}
		void reportException(Exception e1) {		
			if(e1.getClass().getName().contains("AlreadyRegisteredException")) {
				// здесь будут ощибки, что алгоритм уже
				// зарегистрирован
				// это нормально, поэтому чтобы не увеличивать лог
				// проигнорируем	
			} else {							
				LOGGER.debug(e1.getClass().toString(), e1);
			}
		}
		// doc root processor
		boolean process(Node config) {
			if(errorMessage!=null) return false;
			while ((config != null)
					&& (!"Configuration".equals(config.getLocalName()))) {
				config = config.getNextSibling();
			}
			if (config == null) {
				errorMessage = "Error in reading configuration file - Configuration element not found";
				return false;
			} else {
				for (Node el = config.getFirstChild(); el != null; el = el.getNextSibling())
				if (1 == el.getNodeType()) {
					String tag = el.getLocalName();
					if(hmProcs.containsKey(tag) && !hmProcs.get(tag).process(el))
						return false;					
				}
			}
			return true; // everything went OK
		}
		
		// tag processors come here!
		static class ResourceBundles extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element resource = (Element) el;

				Attr langAttr = resource
						.getAttributeNode("defaultLanguageCode");
				Attr countryAttr = resource
						.getAttributeNode("defaultCountryCode");
				String languageCode = langAttr == null ? null : langAttr
						.getNodeValue();

				String countryCode = countryAttr == null ? null
						: countryAttr.getNodeValue();

				I18n.init(languageCode, countryCode);
				return true;				
			}
		}

		static class CanonicalizationMethods extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element[] list = XMLUtils.selectNodes(el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"CanonicalizationMethod");
				for (int i = 0; i < list.length; i++) {
					String uRI = list[i].getAttributeNS(null, "URI");
					String jAVACLASS = list[i].getAttributeNS(null,
							"JAVACLASS");
					try {
						Canonicalizer.register(uRI, jAVACLASS);
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Canonicalizer.register(" + uRI
									+ ", " + jAVACLASS + ")");
						}
					} catch (ClassNotFoundException e) {
						Object[] exArgs = { uRI, jAVACLASS };
						LOGGER.error(I18n.translate(
								"algorithm.classDoesNotExist", exArgs), e);
					} 
					catch (Exception e1) {	
						reportException(e1);
					}
				}
				return true;				
			}
		}

		static class TransformAlgorithms extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element[] tranElem = XMLUtils.selectNodes(
						el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"TransformAlgorithm");

				for (int i = 0; i < tranElem.length; i++) {
					String uRI = tranElem[i].getAttributeNS(null, "URI");
					String jAVACLASS = tranElem[i].getAttributeNS(null,
							"JAVACLASS");
					try {
						Transform.register(uRI, jAVACLASS);
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Transform.register(" + uRI + ", "
									+ jAVACLASS + ")");
						}
					} catch (ClassNotFoundException e) {
						Object[] exArgs = { uRI, jAVACLASS };

						LOGGER.error(I18n.translate(
								"algorithm.classDoesNotExist", exArgs),e);
					} catch (NoClassDefFoundError ex) {
						LOGGER.warn("Not able to found dependencies for algorithm, I'll keep working.", ex);
					} catch (Exception e1) {
						reportException(e1);						
					}
				}
				return true;				
			}
		}

		static class JCEAlgorithmMappings extends JcpXmlProcessor {
			boolean process(Node el) {	
				Node algorithmsNode = ((Element) el).getElementsByTagName(
						"Algorithms").item(0);
				if (algorithmsNode != null) {
					Element[] algorithms = XMLUtils.selectNodes(
							algorithmsNode.getFirstChild(),
							"http://www.xmlsecurity.org/NS/#configuration",
							"Algorithm");

					for (int i = 0; i < algorithms.length; i++) {

						Element element = algorithms[i];
						String id = element.getAttribute("URI");
						
						LOGGER.debug("Registering Algorithm: "+id);

						JCEMapper.register(id, new JCEMapper.Algorithm(
								element));
					}
				}
				return true;				
			}
		}

		static class SignatureAlgorithms extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element[] sigElems = XMLUtils.selectNodes(
						el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"SignatureAlgorithm");
				for (int i = 0; i < sigElems.length; i++) {
					String uRI = sigElems[i].getAttributeNS(null, "URI");
					String jAVACLASS = sigElems[i].getAttributeNS(null,
							"JAVACLASS");
					try {
						LOGGER.debug("Registering SignatureAlgorithm: "+uRI);
						SignatureAlgorithm.register(uRI, jAVACLASS);
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("SignatureAlgorithm.register(" + uRI
									+ ", " + jAVACLASS + ")");
						}
					} catch (ClassNotFoundException e) {
						Object[] exArgs = { uRI, jAVACLASS };
						LOGGER.error(I18n.translate(
								"algorithm.classDoesNotExist", exArgs),e);
					} catch (Exception e1) {
						reportException(e1);
					}		
				}
				return true;	
		}

		static class ResourceResolvers extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element[] resolverElem = XMLUtils.selectNodes(
						el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"Resolver");

				for (int i = 0; i < resolverElem.length; i++) {
					String jAVACLASS = resolverElem[i].getAttributeNS(null,
							"JAVACLASS");

					String description = resolverElem[i].getAttributeNS(
							null, "DESCRIPTION");

					if ((description != null) && (description.length() > 0)) {
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + jAVACLASS
									+ ": " + description);
						}

					} else if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Register Resolver: " + jAVACLASS
								+ ": For unknown purposes");
					}

					try {
						ResourceResolver.register(jAVACLASS);
					} catch (Exception e) {
						LOGGER.warn(
								"Cannot register:"
										+ jAVACLASS
										+ " perhaps some needed jars are not installed",
								e);
					}

				}
				return true;				
			}
		}

		static class KeyResolver extends JcpXmlProcessor {
			boolean process(Node el) {	
				Element[] resolverElem = XMLUtils.selectNodes(
						el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"Resolver");

				List<String> classNames = new ArrayList<String>(resolverElem.length);
				for (int i = 0; i < resolverElem.length; i++) {
					String jAVACLASS = resolverElem[i].getAttributeNS(null,
							"JAVACLASS");

					String description = resolverElem[i].getAttributeNS(
							null, "DESCRIPTION");

					if ((description != null) && (description.length() > 0)) {
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug("Register Resolver: " + jAVACLASS
									+ ": " + description);
						}

					} else if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Register Resolver: " + jAVACLASS
								+ ": For unknown purposes");
					}
					classNames.add(jAVACLASS);
				}
				return registerClassNames(classNames);				
			}

			private boolean registerClassNames(List<String> classNames) {
				try {
					org.apache.xml.security.keys.keyresolver.KeyResolver.registerClassNames(classNames);
					return true;
				} catch (Exception e) {
					errorMessage = "KeyResolver: registerClassNames failed: "+e.toString();
					return false;
				}
			}
		}

		static class PrefixMappings extends JcpXmlProcessor {
			boolean process(Node el) {	
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("Now I try to bind prefixes:");
				}

				Element[] nl = XMLUtils.selectNodes(el.getFirstChild(),
						"http://www.xmlsecurity.org/NS/#configuration",
						"PrefixMapping");

				for (int i = 0; i < nl.length; i++) {
					String namespace = nl[i].getAttributeNS(null, "namespace");
					String prefix 	 = nl[i].getAttributeNS(null, "prefix");
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug("Now I try to bind " + prefix + " to "
								+ namespace);
					}
					try {
						ElementProxy.setDefaultPrefix(namespace, prefix);
					} catch (XMLSecurityException e) {
						errorMessage = "PrefixMappings: ElementProxy.setDefaultPrefix failed: "+e.toString();
						return false;
					}
				}
				return true;				
			}
		}
	}
	}
	public static void fileInit() {
		try {
			InputStream is = Crypto15Init.class.getResourceAsStream("/jcp.xml");
			if (is == null) {
				LOGGER.error("Failed reading /jcp.xml resource!");
				return;
			}
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setFeature(
					"http://javax.xml.XMLConstants/feature/secure-processing",
					Boolean.TRUE.booleanValue());

			dbf.setNamespaceAware(true);
			dbf.setValidating(false);

			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(is);
			
			JcpXmlProcessor processor = new JcpXmlProcessor();
			if(!processor.process(doc.getFirstChild())) {
				LOGGER.error("Failed processing /jcp.xml resource! "+processor.errorMessage);
			}
		} catch (SAXException ese) {
			LOGGER.error("Crypto15Init:fileInit:error: ", ese);
		} catch (IOException eio) {
			LOGGER.error("Crypto15Init:fileInit:error: ", eio);			
		} catch (ParserConfigurationException epc) {
			LOGGER.error("Crypto15Init:fileInit:error: ", epc);		
		}
	}

}
