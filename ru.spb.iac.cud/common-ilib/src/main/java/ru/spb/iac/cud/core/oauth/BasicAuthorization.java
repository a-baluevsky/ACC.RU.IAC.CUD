package ru.spb.iac.cud.core.oauth;

import javax.servlet.http.HttpServletRequest;

import javaw.lang.Strings;

import org.apache.commons.codec.binary.Base64;
import org.jboss.resteasy.spi.HttpRequest;

//import twitter4j.internal.http.BASE64Encoder;

public class BasicAuthorization {
	private String basic, userId, password;
    public BasicAuthorization(String userId, String password) {
        this.userId = userId;
        this.password = password;
        this.basic = encodeBasicAuthenticationString();
    }    
    public String getUserId() { return userId; }
    public String getPassword() { return password; }    

    private String encodeBasicAuthenticationString() {
        if (userId != null && password != null) {
            return "Basic " + Base64.encodeBase64String((userId + ":" + password).getBytes());
        }
        return null;
    }    
    
	public static String createHeader(String clientId, String clientSecret) {
        clientSecret = Strings.isNullOrEmpty(clientSecret) ? "" : clientSecret;
        clientId = Strings.isNullOrEmpty(clientId) ? "" : clientId;
        final String authString = clientId + ":" + clientSecret;
        return "basic " + Base64.encodeBase64String(authString.getBytes());
    }	
	public static BasicAuthorization parseHeader(HttpServletRequest request) {
		return parseHeader(request.getHeader("authorization"));
	}
		
	public static BasicAuthorization parseHeader(String auth) { // Colon sign ":" must be doubled in login! E.g. urn::eis::sample  
		String userId; String password;
		BasicAuthorization result = null;
		if(!Strings.isNullOrEmpty(auth) 
			&& auth.toUpperCase().startsWith("BASIC")) {
			auth = auth.substring(6);
			byte[] abNamePw = Base64.decodeBase64(auth);
			auth = new String(abNamePw);
			// un-escape double colons within login
			int p=0, q=auth.indexOf("::");
			while(q!=-1) {
				p = 2+q;
				q=auth.indexOf("::", p);
			}
			if((p = auth.indexOf(':', p))>=0) {
				userId = auth.substring(0, p).replace("::", ":");
				password = auth.substring(p+1);
				result = new BasicAuthorization(userId, password); 
			}
		}
		return result;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicAuthorization)) return false;

        BasicAuthorization that = (BasicAuthorization) o;

        return basic.equals(that.basic);

    }

    @Override
    public int hashCode() {
        return basic.hashCode();
    }

    @Override
    public String toString() {
        return "BasicAuthorization{" +
                "userId='" + userId + '\'' +
                ", password='**********'\'" +
                '}';
    }

}
