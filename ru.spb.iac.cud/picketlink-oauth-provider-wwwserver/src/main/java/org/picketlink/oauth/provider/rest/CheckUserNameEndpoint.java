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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.picketlink.oauth.provider.model.AccountRegistrationResponse;
import org.picketlink.oauth.provider.setup.RESTActivation;

/**
 * @author Pedro Silva
 *
 */
@Stateless
@Path("/alreadyExists")
public class CheckUserNameEndpoint extends _Endpoint {

  

    /**
     * Check if an UserName is already taken
     *
     * @param userName
     * @return
     */
    @GET
    @Produces(RESTActivation.MediaJSON)
    public AccountRegistrationResponse alreadyExists(@QueryParam("userName") String userName) {

        AccountRegistrationResponse response = new AccountRegistrationResponse();

       /* User user = BasicModel.getUser(identityManager,userName);

        if (user != null) {
            response.setRegistered(true);
        }*/

        return response;
    }

}
