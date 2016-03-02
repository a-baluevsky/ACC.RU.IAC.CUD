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
package org.picketlink.oauth.provider.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.Attribute;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.User;
import org.picketlink.oauth.provider.model.AccountRegistrationRequest;
import org.picketlink.oauth.provider.model.AccountRegistrationResponse;
import org.picketlink.oauth.provider.setup.RESTActivation;

/**
 * Endpoint for User Account Registration
 *
 * @author anil saldhana
 * @since Jan 16, 2013
 */
@Stateless
@Path("/accregister")
public class AccountRegistrationEndpoint {

    @Inject
    private IdentityManager identityManager;

    /**
     * Register an user account
     *
     * @param request
     * @return
     */
    @POST
    @Consumes(RESTActivation.MediaJSON) @Produces(RESTActivation.MediaJSON)
    public AccountRegistrationResponse register(AccountRegistrationRequest request) {
        AccountRegistrationResponse response = new AccountRegistrationResponse();

        String userName = request.getUserName();
        User user = BasicModel.getUser(identityManager, userName);
        if (user == null) {
            // UserName is not already registered
            user = new User(userName);
            user.setEmail(request.getEmail());
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());

            user.setAttribute(new Attribute<String>("address", request.getAddress()));
            user.setAttribute(new Attribute<String>("city", request.getCity()));
            user.setAttribute(new Attribute<String>("state", request.getState()));
            user.setAttribute(new Attribute<String>("postalCode", request.getPostalCode()));
            user.setAttribute(new Attribute<String>("country", request.getCountry()));

            this.identityManager.add(user);
            this.identityManager.updateCredential(user, new Password(request.getPassword()));

            response.setStatus("Registered");
            response.setRegistered(true);
        } else {
            response.setStatus("UserName already taken. Choose another name!");
        }

        return response;
    }
}