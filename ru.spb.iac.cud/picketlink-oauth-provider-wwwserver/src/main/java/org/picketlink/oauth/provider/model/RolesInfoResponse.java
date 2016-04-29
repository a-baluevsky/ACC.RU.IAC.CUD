package org.picketlink.oauth.provider.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement @JsonSerialize
public class RolesInfoResponse extends HashMap<String, Map<String, ?>> implements Serializable {
	private static final long serialVersionUID = 1L;
 
}
