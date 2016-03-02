package org.apache.oltu.oauth2.jwt.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.apache.oltu.commons.encodedtoken.TokenReader;
import org.apache.oltu.oauth2.jwt.JWT;

public class FixedJWTReader extends TokenReader<JWT>{
	// fixed base64urlTokenPattern: added "_-"
	private final Pattern base64urlTokenPattern = Pattern.compile("([a-zA-Z0-9/+=_-]+)\\.([a-zA-Z0-9/+=_-]+)\\.(.+)");
    
	@Override
	public JWT read(String base64String) {
        if (base64String == null || base64String.isEmpty()) {
            throw new IllegalArgumentException("Impossible to obtain a Token from a null or empty string");
        }
        StringBuilder buffer = new StringBuilder();
        BufferedReader reader = new BufferedReader(new StringReader(base64String));
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                buffer.append(line.trim());
            }
        } catch (IOException e) {
            // it cannot happen
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // swallow it
            }
        }

        Matcher matcher = base64urlTokenPattern.matcher(buffer.toString());
        if (!matcher.matches()) {
            throw new IllegalArgumentException(base64String
                                               + "is not a valid Token, it does not match with the pattern: "
                                               + base64urlTokenPattern.pattern());
        }

        // HEADER
        String header = matcher.group(1);
        String decodedHeader = JWTReader.base64Decode(header);

        // BODY
        String body = matcher.group(2);
        String decodedBody = JWTReader.base64Decode(body);

        // SIGNATURE
        // Keep signature encoded in base64url
        String signature = matcher.group(3);

        return build(base64String, decodedHeader, decodedBody, signature);
    }	
	
    @Override
    public JWT build(String rawString, String decodedHeader, String decodedBody, String encodedSignature) {
        JWT.Builder jwtBuilder = new JWT.Builder(rawString);

        new JWTHeaderParser(jwtBuilder).read(decodedHeader);
        new JWTClaimsSetParser(jwtBuilder).read(decodedBody);

        return jwtBuilder.setSignature(encodedSignature).build();
    }  
}
