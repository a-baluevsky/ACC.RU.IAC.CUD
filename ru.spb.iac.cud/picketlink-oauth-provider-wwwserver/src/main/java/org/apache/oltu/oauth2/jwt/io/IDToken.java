package org.apache.oltu.oauth2.jwt.io;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.oltu.oauth2.jwt.ClaimsSet;
import org.apache.oltu.oauth2.jwt.JWT;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import ru.spb.iac.cud.core.oauth.TokenInfo.AuthMethod;

@XmlRootElement
@JsonSerialize @JsonWriteNullProperties(false)
public class IDToken {
	public IDToken() {
		this.iss = "urn:eis:cud";
		this.iat = (new Date()).getTime()/1000;
	}
	public IDToken(String sub, String aud, Long lifeTime, Long auth_time, String nonce) {
		this();
		this.sub = sub;		this.aud = aud;		this.exp = this.iat+lifeTime;
		this.auth_time = auth_time;		this.nonce = nonce;
	}
	private String iss, sub, aud, nonce;
	private Long iat, exp, auth_time;
	//iss
	public void 	setIss(String iss) 		{ this.iss = iss;	}
	public String 	getIss() 				{ return iss;	}
	//sub
	public void 	setSub(String sub) 		{ this.sub = sub;	}
	public String 	getSub() 				{ return sub;	}
	//aud
	public void 	setAud(String aud) 		{ this.aud = aud;	}
	public String 	getAud() 				{ return aud;	}
	//exp
	public void 	setExp(Long exp) 		{ this.exp = exp;	}
	public Long 	getExp() 				{ return exp;	}
	//iat
	public void 	setIat(Long iat) 		{ this.iat = iat;	}
	public Long 	getIat() 				{ return iat;	}
	//auth_time
	public void 	setAuth_time(Long auth_time) 		{ this.auth_time = auth_time;	}
	public Long 	getAuth_time() 						{ return auth_time;	}
	//nonce
	public void 	setNonce(String nonce) 		{ this.nonce = nonce;	}
	public String 	getNonce() 					{ return nonce;	}
	// OPTIONAL: acr	Authentication Context Class Reference. String specifying an Authentication Context Class Reference value that identifies the Authentication Context Class that the authentication performed satisfied.
	// OPTIONAL: amr	Authentication Methods References. JSON array of strings that are identifiers for authentication methods used in the authentication.
	public final AuthMethod amr = AuthMethod.PWD;
	// OPTIONAL: azp	Authorized party - the party to which the ID Token was issued. If present, it MUST contain the OAuth 2.0 Client ID of this party.
	public static IDToken fromJWT(String jwtToken) {
		final IDToken newIDToken = new IDToken();
		final JWT jwt = (new FixedJWTReader()).read(jwtToken);
		final ClaimsSet claimsSet = jwt.getClaimsSet();
		newIDToken.iss = claimsSet.getIssuer();			newIDToken.sub = claimsSet.getSubject();
		newIDToken.aud = claimsSet.getAudience();		newIDToken.exp = claimsSet.getExpirationTime();
		newIDToken.iat = claimsSet.getIssuedAt();
		newIDToken.auth_time = claimsSet.getCustomField("auth_time", Long.class);
		newIDToken.nonce = claimsSet.getCustomField("nonce", String.class);
		// maybe another
		return newIDToken;
	}	
	public static String toJWT(IDToken idToken, Map<String, String> optClaimsSet) {
    	final JWT.Builder jwtBld = (new JWT.Builder())
    			.setHeaderAlgorithm("GOST3411withGOST3410EL")
    			.setSignature("DEFAULT"); //getJWTSignature(csFlgSignature) )
    	jwtBld.setClaimsSetIssuer(idToken.iss);		jwtBld.setClaimsSetSubject(idToken.sub);
    	jwtBld.setClaimsSetAudience(idToken.aud);	jwtBld.setClaimsSetExpirationTime(idToken.exp);
    	jwtBld.setClaimsSetCustomField("auth_time", idToken.auth_time);
    	jwtBld.setClaimsSetCustomField("nonce", 	idToken.nonce);
    	//jwtBld.setClaimsSet(idToken);    	jwtBld.setClaimsSet(idToken);
    	if(optClaimsSet!=null)
    		for (Entry<String, String> eAtrNV : optClaimsSet.entrySet())
    			jwtBld.setClaimsSetCustomField(eAtrNV.getKey(), eAtrNV.getValue());    	
		//return new JWTWriter().write(jwtBld.build());	
		return new CUDJWTWriter().writeExt(jwtBld.build());
	}
}
