package javaw.util;

// Wrapper to deal with SONAR CWE-594 issue.
// Use SerializableSet<K> in Serializable classes instead of just Set<K>.
// This wrapper is compatible with original HashSet, so there's no problem
// to pass javaw.util.HashSet object to a method expecting original javaw.util.HashSet<K> class.
public class HashSet<K> extends java.util.HashSet<K> implements SerializableSet<K> {
	public HashSet(SerializableList<K> arList) {
		super((java.util.List<K>)arList);	
	}
	public HashSet() {
		super();
	}

	public HashSet(int i) {
		super(i);
	}

	private static final long serialVersionUID = 1L;
};

