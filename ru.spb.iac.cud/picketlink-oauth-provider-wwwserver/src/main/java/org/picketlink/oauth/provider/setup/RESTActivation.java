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
package org.picketlink.oauth.provider.setup;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * Activate JAX-RS
 * @author anil saldhana
 * @since Jan 8, 2013
 */
@ApplicationScoped @ApplicationPath("/")
public class RESTActivation extends Application{
	public static final String MediaJSON = MediaType.APPLICATION_JSON+"; charset=UTF-8";
	public static final String MediaHTML = MediaType.TEXT_HTML+"; charset=UTF-8";
	public static final String MediaFORM_URLENCODED = MediaType.APPLICATION_FORM_URLENCODED+"; charset=UTF-8";
}