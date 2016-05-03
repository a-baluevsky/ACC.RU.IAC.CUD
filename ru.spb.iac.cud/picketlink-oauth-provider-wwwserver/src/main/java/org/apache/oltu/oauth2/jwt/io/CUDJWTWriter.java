package org.apache.oltu.oauth2.jwt.io;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;

import iac.grn.infosweb.session.GOSTSignatureUtil;

import org.apache.oltu.commons.encodedtoken.TokenWriter;
import org.apache.oltu.oauth2.jwt.JWT;


public class CUDJWTWriter extends TokenWriter<JWT> {

    private static PublicKey publicKey = null;
    
    private static PrivateKey privateKey = null;
    
	public final String writeExt(JWT token) {
	        if (token == null) {
	            throw new IllegalArgumentException("Impossible to build a Token from a null JWS representation.");
	        }

	        String header = writeHeader(token);
	        String encodedHeader = base64Encode(header);

	        String body = writeBody(token);
	        String encodedBody = base64Encode(body);

	        String signature = writeSignature(token, encodedHeader+"."+encodedBody);

	        return new StringBuilder()
	                   .append(encodedHeader)
	                   .append('.')
	                   .append(encodedBody)
	                   .append('.')
	                   .append(signature)
	                   .toString();
	    }

	 
	    @Override
	    protected String writeHeader(JWT token) {
	        return new JWTHeaderWriter().write(token.getHeader());
	    }

	    @Override
	    protected String writeBody(JWT token) {
	        return new JWTClaimsSetWriter().write(token.getClaimsSet());
	    }

	    @Override
	    protected String writeSignature(JWT token) {
	        return token.getSignature();
	    }
	    
	    protected String writeSignature(JWT token, String encodedHeaderBody) {
	    	try{
	    	   System.out.println("CUDJWTWriter:writeSignature:01");
	    	   
	    	   if(privateKey==null) {
	    		   
	    	   char[] signingKeyPass="Access_Control".toCharArray();
	    	   String signingAlias="cudvm_export";
	    	   KeyStore ks  = KeyStore.getInstance("HDImageStore", "JCP");
			   ks.load(null, null);			
			   privateKey = (PrivateKey)ks.getKey(signingAlias, signingKeyPass);		
			   //publicKey = ks.getCertificate("cudvm_export").getPublicKey();	
	    	   }
	    	   
	       	   byte[] sigValue = GOSTSignatureUtil.sign(encodedHeaderBody, privateKey);
	       	   
	           System.out.println("CUDJWTWriter:writeSignature:02");
	       	
	       	   return base64Encode(sigValue);
	       	   
	    	}catch(Exception e){
	    		System.out.println("CUDJWTWriter:writeSignature:"+e);
	    		 return token.getSignature();
	    	}
	       
	    }

}
