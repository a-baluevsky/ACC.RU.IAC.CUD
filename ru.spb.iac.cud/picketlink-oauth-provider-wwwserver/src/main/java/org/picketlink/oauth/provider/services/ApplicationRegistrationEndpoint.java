/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.picketlink.oauth.provider.services;

import javaw.lang.Strings;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.picketlink.Identity;
import org.picketlink.idm.model.basic.User;
import org.picketlink.oauth.provider.model.ApplicationRegistrationRequest;
import org.picketlink.oauth.provider.model.ApplicationRegistrationResponse;
import org.picketlink.oauth.provider.rest._Endpoint;
import org.picketlink.oauth.provider.security.UserLoggedIn;
import org.picketlink.oauth.provider.setup.RESTActivation;

/**
 * Endpoint for registering OAuth Applications
 * @author anil saldhana
 * @since Jan 9, 2013
 * 
 * Refactored by A.B. 2015
 */
@Stateless
@Path("/appregister")
@TransactionAttribute
public class ApplicationRegistrationEndpoint extends _Endpoint //implements IClientAppManagerLocal 
{

    @Inject private Identity identity;
    @Inject private ClientAppManager clientAppManager;

    
    @POST
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)
    @UserLoggedIn
    public ApplicationRegistrationResponse register(ApplicationRegistrationRequest request){
        ApplicationRegistrationResponse response = new ApplicationRegistrationResponse();

        String appName = request.getAppName().trim();
        String appURL = request.getAppURL();

        User user = (User) identity.getAccount();
        String userID = user.getLoginName();
        
        if(clientAppManager.existsApp(appName)){
            response.setRegistered(false);
            response.setErrorMessage("Application Already Registered");
        } else {
        	final String client_id = request.getClient_id();
			final String client_secret = request.getClient_secret();
			ClientApp newApp;
			if(Strings.isNullOrEmpty(client_id) || Strings.isNullOrEmpty(client_secret))
        		newApp = clientAppManager.create(appName, appURL, userID);
			else
				newApp = clientAppManager.create(appName, appURL, userID, client_id, client_secret);
            response.setRegistered(newApp!=null);
        }
        return response;
    }

	//@Override	public boolean existsApp(String id) {		return false;	}   
}