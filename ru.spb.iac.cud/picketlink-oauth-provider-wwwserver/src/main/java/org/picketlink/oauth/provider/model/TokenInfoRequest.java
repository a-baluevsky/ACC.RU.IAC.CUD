package org.picketlink.oauth.provider.model;

import javaw.lang.Strings;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.oauth.TokenInfo;
import ru.spb.iac.cud.core.oauth.TokenInfo.AccessTokenType;
import static ru.spb.iac.cud.core.oauth.TokenInfo.*;

@XmlRootElement
@JsonSerialize
public class TokenInfoRequest 
implements ISetTokenTypeInfo<AccessTokenType, TokenInfo>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(TokenInfoRequest.class);
	
	private String token, token_type, infoType;

	public String 	getToken() 							{ return token;	}
	public void 	setToken(String token) 				{ this.token = token;	}
	public String 	getToken_type() 					{ return token_type;	}
	public void 	setToken_type(String token_type) 	{ this.token_type = token_type; }	
	public String 	getInfoType() 						{ return infoType;	}
	public void 	setInfoType(String infoType) 		{ this.infoType = checkInfoType(infoType);	}
	
	// TODO: generalize this to be utility class
	public static String checkInfoType(String info_type) {
		if(Strings.isNullOrEmptyTrim(info_type))
			LOGGER.error("infoType must be present!");
		else
			switch (info_type.toUpperCase()) {
			case "JWT": case "JSON": break;
			default:
				LOGGER.error("Unknown infoType: "+info_type+" must be: JWT or JSON!");				
			}
		return info_type;
	}
	
	@JsonIgnore @Override   public void setTokenId(String id) { this.token = id; }
	@JsonIgnore @Override	public void setTokenInfo(TokenInfo tokenInfo) {	}
	@JsonIgnore @Override	public void setTokenType(AccessTokenType tokenType) { this.token_type = tokenType.toString();	}
	@JsonIgnore @Override	public void setTokenString(String tokenString) { this.token = tokenString; }

}
