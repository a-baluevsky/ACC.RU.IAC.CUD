package iac.cud.infosweb.ws;
import org.picketlink.identity.federation.core.saml.v2.util.DocumentUtil;
import java.util.GregorianCalendar;
import org.w3c.dom.Document;
import ru.spb.iac.cud.ws.STSServiceClientBase;
import org.jboss.xb.binding.SimpleTypeBindings;

public class STSServiceClient extends STSServiceClientBase {
	public String sign_verify_soap_transform_2sign() throws Exception {
		return DocumentUtil.asString(sign_verify_soap_transform_2sign(null));
	}	
	public static Document sign_verify_soap_transform_2sign(String onBehalfOfToken) throws Exception  {
		LOGGER.debug("STSServiceClient:sign_verify_soap_transform_2sign:01+");
		try {
			_setSystemProps();
			/* //test-contur HostnameVerifier hv = new HostnameVerifier() {
			 *public /boolean verify(String urlHostName, SSLSession session) /{
			 * System/.out.println("Warning: URL Host: "+ urlHostName+ " vs. " +
			 * session/.getPeerHost()); return true; } }
			 * HttpsURLConnection/.setDefaultHostnameVerifier(hv)
			 */
			updateKeysCertif();			
			return _sign_verify_soap_transform_2sign(onBehalfOfToken,
					SimpleTypeBindings.marshalDateTime(new GregorianCalendar()));
		} catch (Exception e) {
			LOGGER.error("STSServiceClient:sign_verify_soap_transform_2sign:error:"+ e);
			throw e;
		}
	}	
}
