package ru.spb.iac.cud.uarm.ws;
import org.picketlink.identity.federation.core.saml.v2.util.DocumentUtil;
import java.util.GregorianCalendar;
import org.w3c.dom.Document;
import ru.spb.iac.cud.ws.STSServiceClientBase;
import javax.xml.datatype.DatatypeFactory;

 public class STSServiceClient extends STSServiceClientBase {
	public String sign_verify_soap_transform_2sign() throws Exception {
		return DocumentUtil.asString(sign_verify_soap_transform_2sign(null));
	}
	public static Document sign_verify_soap_transform_2sign(String onBehalfOfToken) throws Exception  {
	   // обЄрнута€ подпись usernametoken в header в soap
	   // с использовани€ transform.
	   // теги transform добавл€ютс€ в сигнатуру:
	/*   
	   <dsig:Signature xmlns:dsig='http://www.w3.org/2000/09/xmldsig#'>
	    <dsig:SignedInfo>
		     <dsig:Reference URI='#UsernameToken-1' xmlns:dsig='http://www.w3.org/2000/09/xmldsig#'>
				<dsig:Transforms xmlns:dsig='http://www.w3.org/2000/09/xmldsig#'>
					<dsig:Transform Algorithm='http://www.w3.org/2000/09/xmldsig#enveloped-signature' xmlns:dsig='http://www.w3.org/2000/09/xmldsig#'/>
	 				<dsig:Transform Algorithm='http://www.w3.org/2001/10/xml-exc-c14n#' xmlns:dsig='http://www.w3.org/2000/09/xmldsig#'/>
				</dsig:Transforms>
	*/
	   // при проверки подписи в логе перед Pre-digested input по€вл€етс€ 
	   // дополнительна€ информаци€ про transform:
	/*   
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.DOMReference] (http-0.0.0.0-80-1) Data class name: ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheNodeSetData
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform] (http-0.0.0.0-80-1) Created transform for algorithm: http://www.w3.org/2000/09/xmldsig#enveloped-signature
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform] (http-0.0.0.0-80-1) Created transform for algorithm: http://www.w3.org/2000/09/xmldsig#enveloped-signature
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform] (http-0.0.0.0-80-1) ApacheData = true
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheTransform] (http-0.0.0.0-80-1) ApacheData = true
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer] (http-0.0.0.0-80-1) Created transform for algorithm: http://www.w3.org/2001/10/xml-exc-c14n#
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer] (http-0.0.0.0-80-1) Created transform for algorithm: http://www.w3.org/2001/10/xml-exc-c14n#
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer] (http-0.0.0.0-80-1) ApacheData = true
	   [ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheCanonicalizer] (http-0.0.0.0-80-1) ApacheData = true
	   [ru.CryptoPro.JCPxml.dsig.internal.DigesterOutputStream] (http-0.0.0.0-80-1) Pre-digested input:
	   [ru.CryptoPro.JCPxml.dsig.internal.DigesterOutputStream] (http-0.0.0.0-80-1) Pre-digested input:  
	  */  
	
		LOGGER.debug("STSServiceClient:sign_verify_soap_transform_2sign:01+");	  
		
		try{
            System.setProperty("javax.net.debug", "all"); 
            _setSystemProps();

			/* //test-contur HostnameVerifier hv = new HostnameVerifier() {
			 *public /boolean verify(String urlHostName, SSLSession session) /{
			 * System/.out.println("Warning: URL Host: "+ urlHostName+ " vs. " +
			 * session/.getPeerHost()); return true; } }
			 * HttpsURLConnection/.setDefaultHostnameVerifier(hv)
			 */

			updateKeysCertif();
			
			return _sign_verify_soap_transform_2sign(onBehalfOfToken, 
					DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()).toXMLFormat());

		} catch (Exception e) {
			LOGGER.error("STSServiceClient:sign_verify_soap_transform_2sign:error:"+ e);
			throw e;
		}
	}
}
