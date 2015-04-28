package javaw.util;

import java.util.EnumMap;

public class SerializableEnumMap<K extends Enum<K>,V> 
		extends EnumMap<K,V> 
		implements SerializableMap<K,V> {
	
	public SerializableEnumMap(Class<K> keyType) {
		super(keyType);		
	}

	private static final long serialVersionUID = 1L;
	
}