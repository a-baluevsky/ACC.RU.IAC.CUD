/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.oauth.provider.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Request Object for OAuth Application Registration Process
 * @author anil saldhana
 * @since Jan 9, 2013
 * Reengineered by A.B., 2015
 */
@JsonSerialize
@XmlRootElement
public class ApplicationRegistrationRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId, appName, appURL;
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId;}
    public String getAppName() {        return appName;    }
    public void setAppName(String appName) {        this.appName = appName;    }
    public String getAppURL() {        return appURL;    }
    public void setAppURL(String appURL) {        this.appURL = appURL;    }

    private String client_id, client_secret;
	public String getClient_id() {return client_id;	}
	public void setClient_id(String client_id) {		this.client_id = client_id;	}
	public String getClient_secret() {		return client_secret;	}
	public void setClient_secret(String client_secret) {		this.client_secret = client_secret;	}
}