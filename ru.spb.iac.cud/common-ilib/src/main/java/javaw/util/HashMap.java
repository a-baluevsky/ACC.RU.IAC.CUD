package javaw.util;
// Wrapper to deal with SONAR CWE-594 issue.
// Use SerializableList<K> in Serializable classes instead of just SerializableList<K>.
// This wrapper is compatible with original HashMap, so there's no problem
// to pass javaw.util.HashMap object to a method expecting original javaw.util.HashMap<K> class.
public class HashMap<K,V> extends java.util.HashMap<K,V> implements SerializableMap<K,V> {
	public HashMap(int i) 	{		super(i);	}
	public HashMap() 	 	{		super();	}
	private static final long serialVersionUID = 1L;
};

