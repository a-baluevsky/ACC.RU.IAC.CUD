package ru.spb.iac.cud.services;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.xpath.XPathConstants;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

import ru.spb.iac.cud.core.util.SAML_Assertion;
import ru.spb.iac.cud.core.util.SAML_Document;
import ru.spb.iac.cud.exceptions.GeneralFailure;

import com.sun.xml.messaging.saaj.soap.ver1_2.HeaderElement1_2Impl;

// base class for all ru.spb.iac.cud services 
public class CUDService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CUDService.class);

	public static SAML_Assertion LoadAssertionFromMessageContext(MessageContext context) throws Exception {
	   	ArrayList<SoapHeader> hl = (ArrayList<SoapHeader>) context.get(Header.HEADER_LIST);
	   	for(SoapHeader header: hl) {
	   		HeaderElement1_2Impl hdData = (HeaderElement1_2Impl)header.getObject();
	   		if("wsse:Security".equals(hdData.getNodeName())) {
	   			Element elmAssertion = (Element)SAML_Document.getXPathSOAP().evaluate("saml:Assertion", hdData, XPathConstants.NODE);
	   			if(elmAssertion!=null) {
	   				return SAML_Assertion.LoadFromElement(elmAssertion);
	   			}
	   		}
	   	}
		throw new Exception( "getSamlAssertionFromSoapHeader: no SOAP header with saml:Assertion!");    	 
    }
	
	private static class CUDServiceContext implements ICUDServiceContext {
		@Resource(name="wsContext")
		protected WebServiceContext wsContext;
		
		@Override
		public HttpServletRequest getHttpServletRequest() throws GeneralFailure {
	        MessageContext context = wsContext.getMessageContext();
	        return (HttpServletRequest)context.get(MessageContext.SERVLET_REQUEST); 
		}
		@Override
		public String getIPAddress() throws GeneralFailure {
			return getHttpServletRequest().getRemoteAddr(); 
		}

		@Override
		public String getIDSystem() throws GeneralFailure {
	        String idSystem = (String)getHttpServletRequest().getSession().getAttribute("cud_sts_principal"); 
	        LOGGER.debug("getIDSystem:"+idSystem);
		    return idSystem;
	    }

		@Override
		public Long getIDUser() throws GeneralFailure {
	        HttpSession session = getHttpServletRequest().getSession();
	        Long idUser = null;
	        try{
	           //user �� ApplicantToken_1
	           //��� ���������
	          
	        	//����� ������������ ���������� �� ������, �� ������� � AppSOAPHandler 
	        	//��������� ��� �� ����� authenticate_login_obo
	        	//� � ������ ����� ��� Long idUser, 
	        	//������� ��� ���������� �� ������ ����� ���� ������ ���������� � Long
	        	//������ �� �� ����� � ������� �� ������������ �� ���������� ���� �������
	        	//Long i/dUser = (Long/request.getSe/ssion().getAttr/ibute("user_id_principal"); 
	        	if(session.getAttribute("user_id_principal")!=null&&
	        			!session.getAttribute("user_id_principal").toString().isEmpty()){
	        	
	        	  //��� ���������
	        		idUser = Long.valueOf((String)session.getAttribute("user_id_principal")); 
	        
	         	}else{
	         		//�������
	         		idUser = -1L;
	         	}
	            return idUser;
	        
	        }catch(Exception e){
	        	throw new GeneralFailure("USER UID IS NOT CORRECT");
	        }			
		}
	}
	// See "stackOvflw: 12294761 Spring injection inner class" to do it properly!
	protected ICUDServiceContext serviceContext = new CUDServiceContext();
}
