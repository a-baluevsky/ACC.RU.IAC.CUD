package org.picketlink.oauth.provider.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
//import org.apache.oltu.oauth2.common.message.types.ResponseType;


@XmlRootElement
@JsonSerialize
public class AuthorizationRequest
implements Serializable {
	private static final long serialVersionUID = -1830251563692264824L;
	private String state, client_id, client_secret, scope;
	public 	String 	getState() 							{ return state;	}
	public 	void 	setState(String state) 				{ this.state = state; }
	public 	String 	getClient_id() 						{ return client_id;	}
	public 	void 	setClient_id(String client_id) 		{ this.client_id = client_id; }
	public String getClient_secret() 					{ return client_secret; }
	public void setClient_secret(String client_secret)	{ this.client_secret = client_secret; }	
	
	//public 	String 	getRedirect_uri() 					{ return redirect_uri;	}
	//public 	void 	setRedirect_uri(String redirect_uri) { this.redirect_uri = redirect_uri;	}
	public 	String 	getScope() 							{ return scope;	}
	public 	void 	setScope(String scope) 				{ this.scope = scope;	}
	
	// ResponseType - enum; troubled with, so use plain String
	String response_type;
	//public 	ResponseType	getResponse_type() 					{ return ResponseType.valueOf(response_type); }
	//public 	void 	setResponse_type(ResponseType response_type) { this.response_type = response_type.toString(); }
	public 	String	getResponse_type() 					{ return response_type; }	
	public 	void 	setResponse_type(String response_type) { this.response_type = response_type; }
	


}
