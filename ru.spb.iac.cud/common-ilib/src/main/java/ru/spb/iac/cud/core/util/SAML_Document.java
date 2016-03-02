package ru.spb.iac.cud.core.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SAML_Document {
	private static DocumentBuilderFactory docFactory;
	private static DocumentBuilder docBuilder;
	static {
		docFactory = DocumentBuilderFactory.newInstance();
		docFactory.setNamespaceAware(true);
		//docFactory.setXIncludeAware(true);
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			docBuilder = null;
		}
	}
	public static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
		return docBuilder; 
	}
	public static Document createDocument() throws Exception {
		return getDocumentBuilder().newDocument();
	}
	public static Document LoadFromXMLFile(String filePath) {
		try {
			File f = new File(filePath);
			if (f.exists()) {
				return SAML_Document.getDocumentBuilder().parse(new FileInputStream(f));
			}
		} catch (Exception e3) {
			System.out.println("get_saml_assertion_from_xml:error:" + e3);
			e3.printStackTrace(System.out);
		}
		return null;		
	}
	public static void SaveToXMLFile(Document data, String filePath) {
		InputStream in = null;
		OutputStream output = null;
		byte[] buffer = new byte[4096];
		int n = -1;

		try {

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(data);
			StreamResult saml_stream = new StreamResult(new StringWriter());
			transformer.transform(source, saml_stream);
			String samlMessage = saml_stream.getWriter().toString();

			File file = new File(filePath);

			in = new ByteArrayInputStream(samlMessage.getBytes("UTF-8"));

			output = new FileOutputStream(file);

			while ((n = in.read(buffer)) != -1) {
				if (n > 0) {
					output.write(buffer, 0, n);
				}
			}
			output.close();

		} catch (Exception e3) {
			System.out.println("save_saml_assertion_to_xml:error:" + e3);
			e3.printStackTrace(System.out);
		}
	}
	// firstMatch: true=>first, false=>last
	public static String FindAttributeValue(Document data, String attributeName, boolean firstMatch) {
		String result = null;
		try {
			NodeList user_attributes = getSamlNodes(data, "Attribute");
			for (int i = 0; i < user_attributes.getLength(); i++) {
				Node n = user_attributes.item(i);

				if (attributeName.equals(((Element) n).getAttribute("Name"))) {
					result = n.getFirstChild().getNodeValue(); // .getTextContent();
					if(firstMatch) return result;
				}
			}
			
		} catch (Exception e3) {
			System.out.println("FindAttributeValue:error:" + e3);
			e3.printStackTrace(System.out);
		}
		return result;		
	}
	public static String toString(Document data) {
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(data);
			StreamResult saml_stream = new StreamResult(new StringWriter());
			transformer.transform(source, saml_stream);
			return saml_stream.getWriter().toString();
		} catch (Exception e3) {
			System.out.println("toString:error:" + e3);
			e3.printStackTrace(System.out);
			return "";
		}		
	}

	private static final String csNS = "urn:oasis:names:tc:SAML:2.0:assertion";	
	public static NodeList getSamlNodes(Document data, String nodeName) {
		return data.getElementsByTagNameNS(csNS, nodeName);
	}
	public static NodeList getSamlNodes(Element data, String nodeName) {
		return data.getElementsByTagNameNS(csNS, nodeName);
	}	
	public static Node getSamlNode(Document data, String nodeName) {
		NodeList nl = getSamlNodes(data, nodeName);
		return (nl==null||nl.getLength()==0)?null:nl.item(0);
	}
	public static Node getSamlNode(Element data, String nodeName) {
		NodeList nl = getSamlNodes(data, nodeName);
		return (nl==null||nl.getLength()==0)?null:nl.item(0);
	}
	
	public static boolean isAssertionElement(Element elmCheck) {
		String sName = elmCheck.getNodeName();
		if("Assertion".equals(sName) || "saml:Assertion".equals(sName))
			return true;
		return false;		
	}
	
	private static XPath xPathSOAP = null;
	public static XPath getXPathSOAP() {
		if(xPathSOAP==null) {
			xPathSOAP=XPathFactory.newInstance().newXPath();
			NamespaceContext nsc = new NamespaceContext() {					
				@Override
				public Iterator getPrefixes(String uri) {
			        if (uri == null)
			            throw new IllegalArgumentException("nsURI may not be null");
			        else if ("http://www.w3.org/2003/05/soap-envelope".equals(uri))
			            return Arrays.asList("S").iterator();
			        else if ("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd".equals(uri))
			            return Arrays.asList("wsse").iterator();
			        else if ("urn:oasis:names:tc:SAML:2.0:assertion".equals(uri))
			            return Arrays.asList("saml").iterator();				        
			        else if (XMLConstants.XML_NS_URI.equals(uri))
			            return Arrays.asList(XMLConstants.XML_NS_PREFIX).iterator();
			        else if (XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(uri))
			            return Arrays.asList(XMLConstants.XMLNS_ATTRIBUTE).iterator();
			        else
			            return Collections.emptyList().iterator();
				}
				
				@Override
				public String getPrefix(String uri) {
			        if (uri == null)
			            throw new IllegalArgumentException("nsURI may not be null");
			        else if ("http://www.w3.org/2003/05/soap-envelope".equals(uri))
			            return "S";
			        else if ("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd".equals(uri))
			            return "wsse";
			        else if ("urn:oasis:names:tc:SAML:2.0:assertion".equals(uri))
			            return "saml";				        
			        else if (XMLConstants.XML_NS_URI.equals(uri))
			            return XMLConstants.XML_NS_PREFIX;
			        else if (XMLConstants.XMLNS_ATTRIBUTE_NS_URI.equals(uri))
			            return XMLConstants.XMLNS_ATTRIBUTE;
			        else
			            return null;
				}
				
				@Override
				public String getNamespaceURI(String prefix) {
			        if (prefix == null)
			            throw new IllegalArgumentException("prefix may not be null");
			        else if ("S".equals(prefix))
			            return "http://www.w3.org/2003/05/soap-envelope";
			        else if ("wsse".equals(prefix))
			            return "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
			        else if ("saml".equals(prefix))
			            return "urn:oasis:names:tc:SAML:2.0:assertion";				        
			        else if (XMLConstants.XML_NS_PREFIX.equals(prefix))
			            return XMLConstants.XML_NS_URI;
			        else if (XMLConstants.XMLNS_ATTRIBUTE.equals(prefix))
			            return XMLConstants.XMLNS_ATTRIBUTE_NS_URI;
			        else
			            return null;
				}
			};
			xPathSOAP.setNamespaceContext(nsc);			
		}
		return xPathSOAP;
	}
}
