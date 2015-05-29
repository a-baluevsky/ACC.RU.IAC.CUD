package ru.spb.iac.cud.items;

import java.util.EnumMap;
import java.util.Map;

public enum AuthMode {
	WEB_SERVICES_CERT, HTTP_REDIRECT_CERT,
	WEB_SERVICES, HTTP_REDIRECT, HTTP_REDIRECT_EXT_AUTH_OPEN, HTTP_REDIRECT_EXT_AUTH_ENCRYPT, HTTP_USE_HASHED_PASSWORD;
	
	private static EnumMap<AuthMode, Long> getMapAuditSvcValue() {
		EnumMap<AuthMode, Long> m = new EnumMap<AuthMode, Long>(AuthMode.class); 
		
		m.put(WEB_SERVICES, 						2L);
		m.put(HTTP_REDIRECT, 						97L);
		m.put(HTTP_REDIRECT_EXT_AUTH_OPEN, 			99L);
		m.put(HTTP_REDIRECT_EXT_AUTH_ENCRYPT, 		79L);
		m.put(HTTP_USE_HASHED_PASSWORD, 			78L);
		m.put(WEB_SERVICES_CERT, 					62L);
		m.put(HTTP_REDIRECT_CERT, 					98L);		
		
		return m;		
	}
	private static final EnumMap<AuthMode, Long> m_getMapAuditSvcValue = getMapAuditSvcValue();
	public Long toAuditSvcValue() {		return (Long)getFromMap(this, m_getMapAuditSvcValue);	}
//	public TYPE GETTER-NAME		() {		return (TYPE)getFromMap(this, SPEC-VALUE-MAP );			}
	public static AuthMode fromAuditSvcValue(Long auditSvcValue) {		return parseByMap(auditSvcValue, m_getMapAuditSvcValue); }
	
	private static Object getFromMap(AuthMode authMode, Map<AuthMode, Long> mapValues) {
		if(mapValues.containsKey(authMode)) return mapValues.get(authMode);
		else throw new AssertionError("authMode.getFromMap: Unexpected enumerated value - "+authMode);	
	}
	private static AuthMode parseByMap(Object value, Map<AuthMode, Long> mapValues) {
		for( AuthMode am : AuthMode.values())
			if( mapValues.containsKey(am) && 
				mapValues.get(am).equals(value))
				return am;
		throw new IllegalArgumentException("authMode.parseByMap: unable to map "+value+" => AuthMode");		
	}

}
