package org.apache.oltu.oauth2.jwt.io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.oltu.oauth2.jwt.ClaimsSet;
import org.apache.oltu.oauth2.jwt.JWT;

public class JWTUtil {
	public static JWT createJWT(Map<String, String> mapAttrNameValue) {
    	final JWT.Builder jwtBld = (new JWT.Builder())
    			.setHeaderAlgorithm("RS256")
    			.setSignature("ABCDEFGHIJKLM"); //getJWTSignature(csFlgSignature) )
    	for (Entry<String, String> eAtrNV : mapAttrNameValue.entrySet()) {
    		final String key = eAtrNV.getKey();
    		final String value = eAtrNV.getValue();
			switch(key) {
	    		case "exp":	jwtBld.setClaimsSetExpirationTime(Long.valueOf(value)); break;
	    		case "iat":	jwtBld.setClaimsSetIssuedAt(Long.valueOf(value)); break;
	    		case "iss": jwtBld.setClaimsSetIssuer(value); break;
	    		case "sub": jwtBld.setClaimsSetSubject(value); break;
	    		case "aud": jwtBld.setClaimsSetAudience(value); break; 
	    		case "jti": jwtBld.setClaimsSetJwdId(value); break; 
	    		default: jwtBld.setClaimsSetCustomField(key, value);
    		}
    	}
    	return jwtBld.build();		
	}
	
	public static String getJTI(String jwtToken) {
		final ClaimsSet claimsSet = parseJWT(jwtToken);		
		return claimsSet!=null? claimsSet.getJwdId(): null;
	}

	private static ClaimsSet parseJWT(String jwtToken) {
		final JWT jwt = (new FixedJWTReader()).read(jwtToken);
		final ClaimsSet claimsSet = jwt.getClaimsSet();
		return claimsSet;
	}
	
	public static String writeJWT(JWT jwt) {
		return (new JWTWriter()).write(jwt);
	}
}
