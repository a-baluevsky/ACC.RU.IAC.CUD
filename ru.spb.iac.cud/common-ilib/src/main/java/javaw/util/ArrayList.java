package javaw.util;

import java.util.Collection;
import java.util.List;

// Wrapper to deal with SONAR CWE-594 issue.
// http://cwe.mitre.org/data/definitions/594.html
// Use SerializableList<K> in Serializable classes instead of just SerializableList<K>.
// This wrapper is compatible with original ArrayList, so there's no problem
// to pass javaw.util.ArrayList object to a method expecting original javaw.util.ArrayList<K> class.
public class ArrayList<K> extends java.util.ArrayList<K> implements SerializableList<K> {
	private static final long serialVersionUID = 1L;
	public ArrayList(SerializableSet<K> s) {	
		super((java.util.Set<K>)s);
	}
	public ArrayList() {
		super();
	}
	public ArrayList(Collection<K> values) {
		super(values);
	}
	public ArrayList(int i) {
		super(i);
	}
	public ArrayList(List<K> list) {
		super(list);
	}
};

