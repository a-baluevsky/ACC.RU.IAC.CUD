package ru.spb.iac.cud.core.util;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class SAML_Assertion { 
	private static String sts_assertion_file = "saml_asserion.xml";
	Document saml_assertion;

	public SAML_Assertion(Document saml_assertion) {
		this.saml_assertion = saml_assertion;
	}
	public static SAML_Assertion LoadFromElement(Element elmAssertion) throws Exception {
		if(!SAML_Document.isAssertionElement(elmAssertion)) throw new InvalidParameterException();		
		try {			
			Document doc = SAML_Document.createDocument();
			Node newNode = doc.importNode(elmAssertion, true);
			doc.appendChild(newNode);
			
			return new SAML_Assertion(doc);			
		} catch (Exception x) {
			System.out.println("SAML_Assertion.LoadFromElement:error:" + x);
			x.printStackTrace();
			throw x;
		}
	}
	public static SAML_Assertion LoadFromSOAPMessage(Document docSOAP) throws Exception  {		
		Element elmData = (Element)SAML_Document.getXPathSOAP().evaluate("S:Envelope/S:Header/wsse:Security/saml:Assertion", docSOAP, XPathConstants.NODE);
		if(elmData==null) throw new InvalidParameterException();
		return LoadFromElement(elmData);			
	}
	
	public static SAML_Assertion LoadFromXMLFile() {
		return LoadFromXMLFile(sts_assertion_file);
	}
	public static SAML_Assertion LoadFromXMLFile(String filePath) {
		return new SAML_Assertion(SAML_Document.LoadFromXMLFile(filePath));
	}
	
	public void StoreXML() {
		SAML_Document.SaveToXMLFile(saml_assertion, sts_assertion_file);
	}
	
	
	public boolean isExpired() {		
		boolean result = false;
		try {
			Node condition = SAML_Document.getSamlNode(saml_assertion, "Conditions");
			XMLGregorianCalendar notOnOrAfter = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(
							((Element) condition).getAttribute("NotOnOrAfter"));

			result = notOnOrAfter.toGregorianCalendar().getTime()
					.before(new Date());

			System.out.println("assertion_expired:02:"
					+ notOnOrAfter.toGregorianCalendar().getTime());
			System.out.println("assertion_expired:03:" + new Date());

			System.out.println("assertion_expired:04:" + result);

		} catch (Exception e3) {
			System.out.println("get_saml_assertion_from_xml:error:" + e3);
			e3.printStackTrace(System.out);
		}
		return result;
	}

	public String getSubjectNameID() {
		try {
			return SAML_Document.getXPathSOAP().evaluate("/saml:Assertion/saml:Subject/saml:NameID", saml_assertion);
		} catch (XPathExpressionException e) {
			return null;
		}
	}	
	
	public String getTokenId() {
		return SAML_Document.FindAttributeValue(saml_assertion, "TOKEN_ID", false);
	}
	
	public String getUserUID() {
		return SAML_Document.FindAttributeValue(saml_assertion, "USER_UID", false);
	}
	
	@Override
	public String toString() {
		return SAML_Document.toString(saml_assertion);		
	}
	public Document toDocument() {
		return saml_assertion;
	}
}
