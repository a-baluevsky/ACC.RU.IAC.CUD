package org.picketlink.oauth.provider.services;

import javax.servlet.http.HttpServletRequest;

import org.apache.oltu.oauth2.as.request.AbstractOAuthTokenRequest;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.validator.AuthorizationCodeValidator;
import org.apache.oltu.oauth2.as.validator.ClientCredentialValidator;
import org.apache.oltu.oauth2.as.validator.PasswordValidator;
import org.apache.oltu.oauth2.as.validator.RefreshTokenValidator;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.validators.OAuthValidator;
import ru.spb.iac.cud.core.oauth.BasicAuthorization;

public class OAuthTokenRequestBasicAuthorization extends AbstractOAuthTokenRequest {
	private String client_id, client_secret;
	public OAuthTokenRequestBasicAuthorization(HttpServletRequest request) throws OAuthSystemException, OAuthProblemException {
		super(request);	
    	BasicAuthorization creds = BasicAuthorization.parseHeader(request);
    	if(creds!=null) {
    		this.client_id = creds.getUserId();
    		this.client_secret = creds.getPassword();
    	}
    	validateCreds();
	}

	public OAuthTokenRequestBasicAuthorization(HttpServletRequest request, String client_id, String client_secret) 
	throws OAuthSystemException, OAuthProblemException {
		super(request);
		this.client_id = client_id;
		this.client_secret = client_secret;
		validateCreds();
	}
	
	private void validateCreds() throws OAuthSystemException, OAuthProblemException {
		//validators.put(GrantType.CLIENT_CREDENTIALS.toString(), ClientCredentialValidator.class);
		super.validate();
	}
	
	@Override
	public String getClientId() {
		if(this.client_id==null) this.client_id=super.getClientId();
		return this.client_id;
	}
	@Override
	public String getClientSecret() {
		if(this.client_secret==null) this.client_secret=super.getClientSecret();
		return this.client_secret;
	}

    @Override
    protected OAuthValidator<HttpServletRequest> initValidator() throws OAuthProblemException, OAuthSystemException {
        validators.put(GrantType.PASSWORD.toString(), PasswordValidator.class);
        //validators.put(GrantType.CLIENT_CREDENTIALS.toString(), ClientCredentialValidator.class);
        validators.put(GrantType.AUTHORIZATION_CODE.toString(), AuthorizationCodeValidator.class);
        validators.put(GrantType.REFRESH_TOKEN.toString(), RefreshTokenValidator.class);
        return super.initValidator();
    }
}
