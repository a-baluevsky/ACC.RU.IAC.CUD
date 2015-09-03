package javaw.util;

import java.util.Map;

public abstract class Tuple{
	public static class TKeyValue<K,V> implements Map.Entry<K,V> {
	    final K key; V value;
	    public TKeyValue(K k, V v) 		{ 	value = v; key = k; }
	    public final K getKey() 		{	return key;			}
	    public final V getValue() 		{	return value;		}
	    public final String toString() 	{	return getKey() + "=" + getValue();	}	        
	    public final V setValue(V newValue) {
	        V oldValue = value;
	        value = newValue;
	        return oldValue;
	    }
	    public final boolean equals(Object o) {
	        if (!(o instanceof Map.Entry))
	            return false;
	        Map.Entry<?,?> e = (Map.Entry<?,?>)o;
	        Object k1 = getKey();
	        Object k2 = e.getKey();
	        if (k1 == k2 || (k1 != null && k1.equals(k2))) {
	            Object v1 = getValue();
	            Object v2 = e.getValue();
	            if (v1 == v2 || (v1 != null && v1.equals(v2)))
	                return true;
	        }
	        return false;
	    }
	    public final int hashCode() {
	        return (key==null   ? 0 : key.hashCode()) ^
	               (value==null ? 0 : value.hashCode());
	    }	        
	}
	
	public static class T2<t1, t2> extends Tuple { public t1 item1; public t2 item2; 
		public T2(t1 item1, t2 item2)  {
			this.item1 = item1; this.item2 = item2;
		}
	}
	public static class T3<t1, t2, t3> extends Tuple { public t1 item1; public t2 item2; public t3 item3; 
		public T3(t1 item1, t2 item2, t3 item3)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3;
		}	
	}
	public static class T4<t1, t2, t3, t4> extends Tuple { public t1 item1; public t2 item2; public t3 item3; public t4 item4;
		public T4(t1 item1, t2 item2, t3 item3, t4 item4)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3; this.item4 = item4;
		}	
	}
	public static class T5<t1, t2, t3, t4, t5> extends Tuple { public t1 item1; public t2 item2; public t3 item3; public t4 item4; public t5 item5;
		public T5(t1 item1, t2 item2, t3 item3, t4 item4, t5 item5)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3; this.item4 = item4; this.item5 = item5;
		}
	}
	public static class T6<t1, t2, t3, t4, t5, t6> extends Tuple {
		public t1 item1; public t2 item2; public t3 item3; public t4 item4; public t5 item5; public t6 item6;
		public T6(t1 item1, t2 item2, t3 item3, t4 item4, t5 item5, t6 item6)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3; this.item4 = item4; this.item5 = item5; this.item6 = item6;
		}
	}
	public static class T7<t1, t2, t3, t4, t5, t6, t7> extends Tuple {
		public t1 item1; public t2 item2; public t3 item3; public t4 item4; public t5 item5; public t6 item6; public t7 item7;
		public T7(t1 item1, t2 item2, t3 item3, t4 item4, t5 item5, t6 item6, t7 item7)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3; this.item4 = item4; this.item5 = item5; this.item6 = item6; this.item7 = item7;
		}
	}
	public static class T8<t1, t2, t3, t4, t5, t6, t7, t8> extends Tuple {
		public t1 item1; public t2 item2; public t3 item3; public t4 item4; 
		public t5 item5; public t6 item6; public t7 item7; public t8 item8;
		public T8(t1 item1, t2 item2, t3 item3, t4 item4, t5 item5, t6 item6, t7 item7, t8 item8)  {
			this.item1 = item1; this.item2 = item2; this.item3 = item3; this.item4 = item4;
			this.item5 = item5; this.item6 = item6; this.item7 = item7; this.item8 = item8;
		}
	}	
	
}
